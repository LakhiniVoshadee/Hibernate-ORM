package lk.ijse.gdse.orm.hibernate.entity;

import javax.persistence.*;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private int id;

    @Column(name = "item_name")
    private String itemName;


    @Column(name = "item_quantity")
    private int quantity;

    @Column(name = "tem_unitprice")
    private  double unitPrice;


   /* @ManyToMany( mappedBy = "items")
    private List<Order> orders = new ArrayList<>();*/


    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "item")
    private List<OrderDetail>orderDetails = new ArrayList<>();



}
