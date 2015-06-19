/**
 * Created by usuario on 19/06/2015.
 */
public class Bill {
    long totalcost;
    int[] discounts;

    public Bill() {
        this.totalcost = 0;
        this.discounts = null;
    }

    public Bill(long totalcost, int[] discounts, Order order) {
        this.totalcost = totalcost;
        this.discounts = discounts;
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

}
