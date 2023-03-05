class Animal{
    String type = "animal";
    int age = 0;
    public void sound(){
        System.out.println( type + " which age is " + age +" make -----.");
    }
}
class Cat extends Animal{
    String type = "cat";
    int age = 3 ;
    @Override
    public void sound(){
        System.out.println(type + " which age is " + age +" make mowww");
    }
}
class Dog extends Animal{
    String type = "Dog";
    int age = 6;
    public void sound(){
        System.out.println(type + " which age is " + age +" make wooff");
    }
}

class AnimalMore{

    public void more(Object a){
        if(a instanceof Animal){
            Animal other = (Animal) a;
            System.out.println(other.type + " is collected by others.");
        }
        else if(a instanceof Cat){
            Cat other = (Cat) a;
            System.out.println(other.type + " is collected by others.");
        }else{
            Dog other = (Dog) a;
            System.out.println(other.type + " is collected by others.");
        }

    }
}
class Main{
    public static void main(String[] args){
       Cat c = new Cat();
       c.sound();
       AnimalMore m = new AnimalMore();
        m.more(new Animal());

    }
}