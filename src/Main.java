class Animal{
    String type = "animal";
    public void sound(Animal a){
        System.out.println("Type " + this.type);
        //System.out.println();
    }
}
class Cat extends Animal{
    String type = "cat";
    @Override
    public void sound(Animal a){
        System.out.println("Type " + this.type);
    }
}
class Dog extends Animal{
    String type = "dog";
    public void sound(Animal a){
        System.out.println("Type " + this.type);
    }
}
class DayCare{
    public void daycare(Object a){
        if(a instanceof Animal){
            Animal other = (Animal) a;
            System.out.println("hello " + ((Animal) a).type);
        } else if (a instanceof Cat) {
            Cat other = (Cat) a ;
            System.out.println("Hello " + ((Cat) a).type);
        }

    }
}
class Main{
    public static void main(String[] args){
        Cat c = new Cat();
        Dog d = new Dog();
        DayCare test = new DayCare();
       // System.out.println(test.daycare(c));
        test.daycare(c);
        c.sound(c);
    }
}