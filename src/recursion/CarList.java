package recursion;

import java.sql.Array;
import java.util.*;

public class CarList {
    protected String model;
    protected int seat;
    protected double price;
    public CarList(){

    }
    public CarList(String model , int seat , double price) {
        this.model = model;
        this.seat = seat;
        this.price = price;
    }

}
class HondaCarList extends CarList {
    Collection<CarList> honda;

    public HondaCarList(String model, int seat, double price) {
        super(model, seat, price);
    }
    public void HondaI(){
        honda = new Vector<>();
        honda.add(new HondaCarList("Honda", 5, 1200));
        honda.add(new HondaCarList("hondaTwo", 10, 1500));
        honda.add(new HondaCarList("HondaThree", 7, 1400));
        honda.add(new HondaCarList("Honda4", 4, 1000));
    }

    public void hondaCar() {
        for (CarList c : honda) {
            System.out.println("Model: " + c.model + " \tseat: " + c.seat + "\tprice : " + c.price);

        }
    }
}
class ToyotaCarList extends CarList {
    Collection<CarList> toyota;

    public ToyotaCarList(String model, int seat, double price) {
        super(model, seat, price);
    }
    public void ToyotaI(){
        toyota = new Vector<>();
        toyota.add(new ToyotaCarList("Honda", 5, 1200));
        toyota.add(new ToyotaCarList("hondaTwo", 10, 1500));
        toyota.add(new ToyotaCarList("HondaThree", 7, 1400));
        toyota.add(new ToyotaCarList("Honda4", 4, 1000));
    }

    public void ToyotaCar() {
        for (CarList c : toyota) {
            System.out.println("Model: " + c.model + " \tseat: " + c.seat + "\tprice : " + c.price);

        }


    }

}

class SuzukiCarList extends CarList {
    Collection<CarList> suzuki;

    public SuzukiCarList(String model, int seat, double price) {
        super(model, seat, price);
    }
    public void SuzukiI(){
        suzuki = new Vector<>();
        suzuki.add(new HondaCarList("Honda", 5, 1200));
        suzuki.add(new HondaCarList("hondaTwo", 10, 1500));
        suzuki.add(new HondaCarList("HondaThree", 7, 1400));
        suzuki.add(new HondaCarList("Honda4", 4, 1000));
    }

    public void SuzukiCar() {
        for (CarList c : suzuki) {
            System.out.println("Model: " + c.model + " \tseat: " + c.seat + "\tprice : " + c.price);

        }


    }

}
class NisanCarList extends CarList {
    Collection<CarList> nisan;

    public NisanCarList(String model, int seat, double price) {
        super(model, seat, price);
    }
    public void NisanI(){
        nisan = new Vector<>();
        nisan.add(new HondaCarList("Honda", 5, 1200));
        nisan.add(new HondaCarList("hondaTwo", 10, 1500));
        nisan.add(new HondaCarList("HondaThree", 7, 1400));
        nisan.add(new HondaCarList("Honda4", 4, 1000));
    }

    public void NisanCar() {
        for (CarList c : nisan) {
            System.out.println("Model: " + c.model + " \tseat: " + c.seat + "\tprice : " + c.price);

        }


    }

}
class MitsubishiCarList extends CarList {
    Collection<CarList> mitsubishi;

    public MitsubishiCarList(String model, int seat, double price) {
        super(model, seat, price);
    }
    public void MitsubishiI(){
        mitsubishi = new Vector<>();
        mitsubishi.add(new HondaCarList("Honda", 5, 1200));
        mitsubishi.add(new HondaCarList("hondaTwo", 10, 1500));
        mitsubishi.add(new HondaCarList("HondaThree", 7, 1400));
        mitsubishi.add(new HondaCarList("Honda4", 4, 1000));
    }

    public void MitsubishiCar() {
        for (CarList c : mitsubishi) {
            System.out.println("Model: " + c.model + " \tseat: " + c.seat + "\tprice : " + c.price);

        }


    }

}

    class Main {
        public static void HinMain() {

            HondaCarList h = new HondaCarList("", 0, 0);
            h.HondaI();
            h.hondaCar();
        }
        public static void TinMain() {

            ToyotaCarList t = new ToyotaCarList("", 0, 0.00);
            t.ToyotaI();
            t.ToyotaCar();
        }
        public static void SinMain(){
            SuzukiCarList s = new SuzukiCarList("" , 0 , 0.00);
            s.SuzukiI();
            s.SuzukiCar();
        }
        public static void NinMain(){
            NisanCarList n = new NisanCarList("" , 0 , 0.00);
            n.NisanI();
            n.NisanCar();
        }
        public static void MinMain(){
            MitsubishiCarList m = new MitsubishiCarList("" , 0 , 0.00);
            m.MitsubishiI();
            m.MitsubishiCar();

        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);





        }
    }

