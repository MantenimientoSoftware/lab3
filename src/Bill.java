/**
 * Created by usuario on 19/06/2015.
 */
public class Bill {
    long totalcost;
    int[] discounts;
    Order order;

    public Bill() {
        this.totalcost = 0;
        this.discounts = null;
        this.order = null;
    }

    public Bill(long totalcost, int[] discounts, Order order) {
        this.totalcost = totalcost;
        this.discounts = discounts;
        this.order = order;
    }

    public long getTotalcost() {
        return totalcost;
    }

    public void setTotalcost(long totalcost) {
        this.totalcost = totalcost;
    }

    public int[] getDiscounts() {
        return discounts;
    }

    public void setDiscounts(int[] discounts) {
        this.discounts = discounts;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
