package lk.ijse.gdse.orm.hibernate.embedded;


import javax.persistence.*;
import java.io.Serializable;


@Embeddable
public class OrderDetailPK implements Serializable {


    @Column(name = "order_id")
    private int orderId;


    @Column(name = "item_id")
    private int ItemId;


}
