package lk.ijse.gdse.orm.hibernate.embedded;

import javax.persistence.Embeddable;

@Embeddable
public class MobileNum {
    private String mobilenumber;
    private String type;

    public MobileNum() {
    }

    public MobileNum(String mobilenumber, String type) {
        this.mobilenumber = mobilenumber;
        this.type = type;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "MobileNum{" +
                "mobilenumber='" + mobilenumber + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
