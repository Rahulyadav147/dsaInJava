package oops;

public class Inheritence {
    public static void main(String[] args) {
        Mammals m=new Mammals();
        m.eat();// as lion is inherited from animal it can call eat() as well
        dog d=new dog();
        d.run();
    }
}

// multiple inheritence
interface herbivore{
void eats_h();
}
interface carnivore{
void eats_c();
}
class Bear implements herbivore,carnivore{
  public void eats_h(){
  System.out.println("grass");
  }
  public void eats_c(){
    System.out.println("meat");
  }
}
    

class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breaths");
    }
}
// single level:
class Mammals extends Animal{
    int legs;
    void run(){
        System.out.println(" Mammal runs");
    }
}

// Multilevel: Animal->Mammals->dog
class dog extends Mammals{
    void breed(){
        System.out.println("rotviller");
    }
}
