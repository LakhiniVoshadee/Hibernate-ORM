package lk.ijse.gdse.orm.hibernate.entity;


import lk.ijse.gdse.orm.hibernate.embedded.OrderDetailPK;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "OrderDetail")
public class OrderDetail {

    @EmbeddedId
    private  OrderDetailPK orderDetailPK;

    @Column(name = "order_qty")
    private int qty;

    @Column(name = "order_price")
    private double price;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id",
                        insertable = false,
                        updatable = false)

    private Order order;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id",
                        insertable = false,
                        updatable = false)
    private Item item;





}
