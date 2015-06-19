import java.util.Date;

/**
 * Created by usuario on 19/06/2015.
 */
public class Order {
    int orderint;
    Date creationdate;
    String dateshipped;
    String status;
    Bill bill;

    public Order() {
        this.orderint = 0;
        this.creationdate = new Date();
        this.dateshipped = "";
        this.status = "";
        this.bill = new Bill();
    }

    public Order(int orderint, Date creationdate, String dateshipped, String status, Bill bill) {
        this.orderint = orderint;
        this.creationdate = creationdate;
        this.dateshipped = dateshipped;
        this.status = status;
        this.bill = bill;
    }

    public int getOrderint() {
        return orderint;
    }

    public void setOrderint(int orderint) {
        this.orderint = orderint;
    }

    public Date getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    public String getDateshipped() {
        return dateshipped;
    }

    public void setDateshipped(String dateshipped) {
        this.dateshipped = dateshipped;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
