package lk.ijse.gdse.orm.hibernate;

import lk.ijse.gdse.orm.hibernate.config.SessionFactoryConfig;
import lk.ijse.gdse.orm.hibernate.entity.Customer;
import org.hibernate.Session;

import org.hibernate.Transaction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Lakhin");
        customer.setAddress("Galle");
        customer.setSalary(50000.00);


        //Save exsisting customer in DB

       Session session = SessionFactoryConfig.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(customer);
        transaction.commit();
        session.close();

        //Update exsisting customer in DB
      /*  Session updateCusSession = SessionFactoryConfig.getInstance().getSession();
        Transaction updatecustomertransaction = updateCusSession.beginTransaction();
        customer.setAddress("Matara");
        customer.setName("Shachiru");
        customer.setSalary(77000.00);
        updateCusSession.update(customer);
        updatecustomertransaction.commit();
        updateCusSession.close();*/


        //get existing customer
//        Session getCusSession = SessionFactoryConfig.getInstance().getSession();
//        Customer existingCustomer = getCusSession.get(Customer.class, 1);
//        System.out.println(existingCustomer);


        //delete  existing customer from a DB
       /* Session deleteCusSession = SessionFactoryConfig.getInstance().getSession();
        Transaction deletecustomertransaction = deleteCusSession.beginTransaction();
        deleteCusSession.delete(existingCustomer);
        deletecustomertransaction.commit();
        deleteCusSession.close();
*/







    }
}