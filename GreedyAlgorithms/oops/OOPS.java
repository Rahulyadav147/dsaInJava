package oops;

public class OOPS {
    public static void main(String[] args) {
        Pen p=new Pen();
        Pen p2=new Pen("Linc-Glycer");
        Pen p3=new Pen(23);
        p.setColor("blue");
        System.out.println(p.color);
        System.out.println(p2.brand);
        System.out.println(p3.price);

        Pen p4=new Pen(p);// object p is copied to object p4: 
        System.out.println(p4.color);
    }

}
    class Pen{
    String color;// by default public 
    int price;
    String brand;

    // non-parameterised constructor
    Pen(){
        System.out.println("Constructor is called");
    }
    //Parameterised constructor:
    Pen(String brand){
        this.brand=brand;
    }
    Pen(int price){
       this.price=price;
    }
    // copy constructor
    Pen(Pen p){// 
       this.color=p.color;
    }
    void setColor(String color) {// by default public
        this.color = color;
    }
}
