package lk.ijse.gdse.orm.hibernate;

import lk.ijse.gdse.orm.hibernate.config.SessionFactoryConfig;
import lk.ijse.gdse.orm.hibernate.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;

public class DetachedState {
    public static void main(String[] args) {
        Session session = SessionFactoryConfig
                .getInstance()
                .getSession();

        // Detached

        Customer customer = new Customer(
                1,
                "Voshadee",
                "Colombo",
                new ArrayList<>());

        int cusId = (int) session.save(customer);
        System.out.println("Customer Id:" + cusId);

        System.out.println(isExistsInSession(session, customer)); // Persitence State
        session.close();

        Session detachedSession = SessionFactoryConfig
                .getInstance()
                .getSession();

        Transaction transaction = detachedSession.beginTransaction();

        detachedSession.detach(customer); // Detached State

        System.out.println (isExistsInSession(detachedSession, customer)); // Detached State

       customer.setAddress("Matara");
       detachedSession.merge(customer);

       System.out.println (isExistsInSession(detachedSession, customer));

       transaction.commit();
       detachedSession.close();

    }


    private static String isExistsInSession(Session session, Customer customer){

        return session.contains(customer) ? "This object is not Persistent State!" : "This object is Detached State!";
    }

}
