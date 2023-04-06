package recursion;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

public class CarList {
    protected String model;
    protected int seat;
    protected double price;

    public CarList(String model , int seat , double price) {
        this.model = model;
        this.seat = seat;
        this.price = price;
    }

}
class HondaCarList extends CarList{
    public HondaCarList(String model , int seat , double price){
        super(model, seat, price);
    }
    Collection<CarList> honda = new Vector<>();
        honda.{new HondaCarList("Honda" , 5 , 1200);}
        honda.add(new HondaCarList("hondaTwo" , 10 , 1500));
        honda.add(new HondaCarList("HondaThree" , 7 , 1400));
        honda.add(("Honda4" , 4 , 1000));
}
class Main{
    public static void main(String[] args){
       /* ArrayList<CarList> honda = new ArrayList<>();
        honda.add(new HondaCarList("Honda" , 5 , 1200));
        honda.add(new HondaCarList("hondaTwo" , 10 , 1500));
        honda.add(new HondaCarList("HondaThree" , 7 , 1400));
        honda.add(new HondaCarList("Honda4" , 4 , 1000));

        */


    }
}
