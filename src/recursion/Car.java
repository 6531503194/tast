package recursion;

import java.util.ArrayList;
import java.util.Scanner;

class Car{
       protected String model;
       protected int seat;
       protected double price;

       public Car(String model , int seat , double price){
           this.model = model;
           this.seat = seat;
           this.price = price;
          // System.out.println("Model : " + model + "\tNo. of seat : " + seat + "\tPrice : " + price);
       }
   }

class Honda extends Car{

    public Honda(String model , int seat , double price){
        super(model, seat, price);

    }

}
class Toyota extends Car{

    public Toyota(String model, int seat, double price) {
        super(model, seat, price);
    }
}
class BMW extends Car{

    public BMW(String model, int seat, double price) {
        super(model, seat, price);

    }
}
class Suzuki extends Car{

    public Suzuki(String model, int seat, double price) {
        super(model, seat, price);
    }
}
class Nisan extends Car{

    public Nisan(String model, int seat, double price) {
        super(model, seat, price);
    }
}
class Mainclass{
       public static void Honda(){
           Honda[] honda = new Honda[5];
           honda[0] = new Honda("HOne" , 5 , 1200);
           honda[1] = new Honda("HTwo" , 4 , 1100);
           honda[2] = new Honda("HThree" , 3 , 1000);
           honda[3] = new Honda("HFour" , 2 , 800);
           honda[4] = new Honda("HFive" , 6 , 1500);
           for(int i = 0 ; i < honda.length ; i++){
               System.out.println(i+1 + ".\tModel : " + honda[i].model + "\t\tNo. of seat : " + honda[i].seat + "\t\tPrice : " + honda[i].price);
           }
       }

    public static void Toyota(){
        Toyota[] toyota = new Toyota[5];
        toyota[0] = new Toyota("ToyotaOne" , 5 , 1200);
        toyota[1] = new Toyota("ToyotaTwo" , 4 , 1100);
        toyota[2] = new Toyota("ToyotaThree" , 3 , 1000);
        toyota[3] = new Toyota("ToyotaFour" , 2 , 800);
        toyota[4] = new Toyota("ToyotaFive" , 6 , 1500);
        for(int i = 0 ; i < toyota.length ; i++){
            System.out.println(i+1 + ".\tModel : " + toyota[i].model + "\t\tNo. of seat : " + toyota[i].seat + "\t\tPrice : " + toyota[i].price);
        }
    }
    public static void BMW(){
        BMW[] bmw = new BMW[5];
        bmw[0] = new BMW("BMWOne" , 5 , 1200);
        bmw[1] = new BMW("BMWTwo" , 4 , 1100);
        bmw[2] = new BMW("BMWThree" , 3 , 1000);
        bmw[3] = new BMW("BMWFour" , 2 , 800);
        bmw[4] = new BMW("BMWFive" , 6 , 1500);
        for(int i = 0 ; i < bmw.length ; i++){
            System.out.println(i+1 + ".\tModel : " + bmw[i].model + "\t\tNo. of seat : " + bmw[i].seat + "\t\tPrice : " + bmw[i].price);
        }
    }

    public static void Suzuki(){
        Suzuki[] SZK = new Suzuki[5];
        SZK[0] = new Suzuki("SZKOne" , 5 , 1200);
        SZK[1] = new Suzuki("SZKTwo" , 4 , 1100);
        SZK[2] = new Suzuki("SZKThree" , 3 , 1000);
        SZK[3] = new Suzuki("SZKFour" , 2 , 800);
        SZK[4] = new Suzuki("SZKFive" , 6 , 1500);
        for(int i = 0 ; i < SZK.length ; i++){
            System.out.println(i+1 + ".\tModel : " + SZK[i].model + "\t\tNo. of seat : " + SZK[i].seat + "\t\tPrice : " + SZK[i].price);
        }
    }
    public static void Nisan(){
        Nisan[] NS = new Nisan[5];
        NS[0] = new Nisan("NisanOne" , 5 , 1200);
        NS[1] = new Nisan("NisanTwo" , 4 , 1100);
        NS[2] = new Nisan("NisanThree" , 3 , 1000);
        NS[3] = new Nisan("NisanFour" , 2 , 800);
        NS[4] = new Nisan("NisanFive" , 6 , 1500);
        for(int i = 0 ; i < NS.length ; i++){
            System.out.println(i+1 + ".\tModel : " + NS[i].model + "\t\tNo. of seat : " + NS[i].seat + "\t\tPrice : " + NS[i].price);
        }
    }

       public static void main(String[] args){
           Scanner scanner = new Scanner(System.in);
           ArrayList<String> CarList = new ArrayList<>();
           CarList.add("Honda");
           CarList.add("Toyota");
           CarList.add("BMW");
           CarList.add("Suzuki");
           CarList.add("Nisan");
           for(int i = 0; i < CarList.size() ; i++){
               System.out.println(  i+1 +". "  +CarList.get(i));
           }
           System.out.print("Choose the number you want to choose : ");
           int carType = scanner.nextInt();
           if(carType == 1){
               Honda();
           }else if(carType == 2){
               Toyota();
           }


           /*
           Honda();
           System.out.println();
           Toyota();
           System.out.println();-
           Suzuki();
           System.out.println();
           BMW();
           System.out.println();
           Nisan();

            */
       }
}