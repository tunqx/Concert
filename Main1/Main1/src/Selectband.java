
import java.util.ArrayList;

public class Selectband {
    private String Band;
    private String id;
    private String Price;
    private String qty;
    private String Seat;
    
  public static  ArrayList<Selectband> list = new ArrayList<>();
  public static  ArrayList<String> BAND = new ArrayList<>();
  public static  ArrayList<String> ID = new ArrayList<>();
  public static  ArrayList<String> PRICE = new ArrayList<>();
  public static  ArrayList<String> QTY = new ArrayList<>();

    public Selectband(String Band, String id, String price, String qty) {
        this.Band = Band;
        this.id = id;
        this.Price = price;
        this.qty = qty;
    }

    public String getSeat() {
        return Seat;
    }

    public void setSeat(String Seat) {
        this.Seat = Seat;
    }

    public Selectband() {
    }

    public String getBand() {
        return Band;
    }

    public void setBand(String Band) {
        this.Band = Band;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        this.Price = price;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }
    
    

}

