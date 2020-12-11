package it.prodigy.HibCom;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import it.prodigy.HibCom.controller.Controller;
import it.prodigy.HibCom.model.Department;
import it.prodigy.HibCom.model.Employee;
import it.prodigy.HibCom.view.EmployeeView;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Employee employee = null;
    	EmployeeView employeeView = new EmployeeView();
    	
    	Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Department.class);
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf = con.buildSessionFactory(reg);
        Session session = sf.openSession();
       
        
        
        
        
        Transaction tx = session.beginTransaction();
        
        employee = (Employee)session.get(Employee.class, 987654321);
        
        tx.commit();
        
        Controller controller = new Controller(employee, employeeView);
        
        controller.updateView();
        
        
    }
}
