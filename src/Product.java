/**
 * Created by usuario on 19/06/2015.
 */
public class Product {
    int productid;
    String category;
    String description;
    String status;

    public Product() {
        this.productid = 0;
        this.category = "";
        this.description = "";
        this.status = "";
    }

    public Product(int productid, String category, String description, String status) {
        this.productid = productid;
        this.category = category;
        this.description = description;
        this.status = status;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
