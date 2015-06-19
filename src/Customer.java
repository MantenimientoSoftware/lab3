/**
 * Created by usuario on 19/06/2015.
 */
public class Customer extends User{
    long creditcard;
    String[] interests;
    String postaladress;

    public Customer() {
        this.creditcard = 0;
        this.interests = null;
        this.postaladress = "";
    }

    public Customer(long creditcard, String[] interests, String postaladress) {
        this.creditcard = creditcard;
        this.interests = interests;
        this.postaladress = postaladress;
    }

    public long getCreditcard() {
        return creditcard;
    }

    public void setCreditcard(long creditcard) {
        this.creditcard = creditcard;
    }

    public String[] getInterests() {
        return interests;
    }

    public void setInterests(String[] interests) {
        this.interests = interests;
    }

    public String getPostaladress() {
        return postaladress;
    }

    public void setPostaladress(String postaladress) {
        this.postaladress = postaladress;
    }
}
