package lk.ijse.gdse.orm.hibernate;


import lk.ijse.gdse.orm.hibernate.config.SessionFactoryConfig;
import lk.ijse.gdse.orm.hibernate.entity.Customer;
import org.hibernate.Session;

import java.util.ArrayList;

public class TransientState {
    public static void main(String[] args) {

        Session session = SessionFactoryConfig
                .getInstance()
                .getSession();

        // Transient

        /*Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Voshadeeee");
        customer.setAddress("Colombo");*/


        Customer customer = new Customer(
                1,
                "Voshadee",
                "Colombo",
                new ArrayList<>());

        System.out.println(isExistsInSession(session,customer));
    }

    private static String isExistsInSession(Session session, Customer customer){

        return session.contains(customer) ? "This object is not Transient!" : "This object is Transient!"   ;



    }

}
