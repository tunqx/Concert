public class cal {
   static int Seat; 
   static String Price;
   static String Band;
   static String time;

    public static int getSeat() {
        return Seat;
    }

    public static void setSeat(int Seat) {
        cal.Seat = Seat;
    }
public float getPrice(){
    return Float.parseFloat(Price);
}
public float gettotal(){
    return getPrice()*Seat;
}
}
