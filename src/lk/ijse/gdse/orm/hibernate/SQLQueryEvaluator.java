package lk.ijse.gdse.orm.hibernate;

import lk.ijse.gdse.orm.hibernate.config.SessionFactoryConfig;
import lk.ijse.gdse.orm.hibernate.entity.Customer;
import lk.ijse.gdse.orm.hibernate.entity.Order;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class SQLQueryEvaluator {
    public static void main(String[] args) {
        System.out.println("------------- JPQL Get All ------------------");
        Session session = SessionFactoryConfig.getInstance().getSession();

        getAllCustomerJPQL(session);

        System.out.println("------------ JPQL Where Clause ------------------");
        Session jpqlWhereSession = SessionFactoryConfig.getInstance().getSession();

        getCustomerByIdJPQL(jpqlWhereSession);
        jpqlWhereSession.close();

        System.out.println("------------ JPQL Join ---------------");
        Session jpqlJoinSession = SessionFactoryConfig.getInstance().getSession();
        getAllOrdersByCustomer(jpqlJoinSession);
        jpqlJoinSession.close();

        System.out.println("------------ HQL Get All ----------------");
        Session hqlGetAllSession = SessionFactoryConfig.getInstance().getSession();
        hqlGetAllSession(hqlGetAllSession);
        hqlGetAllSession.close();

    }

    private static void hqlGetAllSession(Session hqlGetAllSession) {
        String sql = "FROM Customer";
        Query hqlGetAllquery = hqlGetAllSession.createQuery(sql);
        List<Customer> list = hqlGetAllquery.list();
        for (Customer customer : list) {
            System.out.println(customer);
        }
    }

    private static void getAllOrdersByCustomer(Session jpqlJoinSession) {
        String sql = "SELECT O FROM Order AS O \n" +
                "INNER JOIN Customer AS C\n" +
                "ON O.customer.id = C.id\n" +
                "WHERE C.id = :cus_id";
        Query jpqlJoinQuery = jpqlJoinSession.createQuery(sql);
        jpqlJoinQuery.setParameter("cus_id", 2);
        List <Order> list = jpqlJoinQuery.list();
        for (Order order : list) {
            System.out.println(order);
        }
    }

    private static void getCustomerByIdJPQL(Session jpqlWhereSession) {
        String sql = "SELECT C FROM Customer AS C WHERE C.id = :cus_id";
        Query namedQuery = jpqlWhereSession.createQuery(sql);
        namedQuery.setParameter("cus_id", 2);
        Customer customer = (Customer) namedQuery.getSingleResult();
        System.out.println(customer);
    }

    private static void getAllCustomerJPQL(Session session) {
        String sql = "SELECT C FROM Customer As C";
        Query query = session.createQuery(sql);
        List <Customer> list = query.list();
        for (Customer customer : list) {
            System.out.println(customer);
        }
        session.close();
    }
}
