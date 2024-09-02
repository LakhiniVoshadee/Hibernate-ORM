package lk.ijse.gdse.orm.hibernate.entity;


import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;


//1-> @Entity(name="customer")

//2-> @Entity
//    @Table(name="customer")

@Entity(name = "customer")
//@Table(name = "customer")
public class Customer {
   @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "customer_id")
   private int id;

   @Column(name = "customer_name")
   private String name;


   @Column(name = "customer_address")
    private String address;

   @Column(name = "customer_salary")
    private double salary;

   @CreationTimestamp
   private Timestamp createdDateTime;
    public Customer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}
