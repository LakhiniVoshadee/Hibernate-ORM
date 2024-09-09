/*
package lk.ijse.gdse.orm.hibernate.entity;


import lk.ijse.gdse.orm.hibernate.embedded.MobileNum;
import lk.ijse.gdse.orm.hibernate.embedded.NameIdentifier;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;


//1-> @Entity(name="customer")

//2-> @Entity
//    @Table(name="customer")

@Entity(name = "customer")
//@Table(name = "customer")
public class Customer {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "customer_id")
   private int id;

//   @Column(name = "customer_name")
//   private String name;


    private NameIdentifier nameIdentifier;

   @Column(name = "customer_address")
    private String address;

   @Column(name = "customer_salary")
    private double salary;

   @CreationTimestamp
   private Timestamp createdDateTime;
    public Customer() {
    }

    @Transient
    @Column(name = "customer_dob")
    private String dob;

    public List<MobileNum> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<MobileNum> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @ElementCollection
    @CollectionTable(name = "customer_mobile_num" , joinColumns = @JoinColumn(name = "customer_id"))

    private List<MobileNum> phoneNumbers = new ArrayList<MobileNum>();


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public NameIdentifier getNameIdentifier() {
        return nameIdentifier;
    }

    public void setNameIdentifier(NameIdentifier nameIdentifier) {
        this.nameIdentifier = nameIdentifier;
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

    public Timestamp getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(Timestamp createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", nameIdentifier=" + nameIdentifier +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", createdDateTime=" + createdDateTime +
                ", dob='" + dob + '\'' +
                '}';
    }
}
*/
