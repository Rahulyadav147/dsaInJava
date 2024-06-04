package oops;

public class Static {

    public static void main(String args[]) {

        // Vidyarthi v1 = new Vidyarthi();
        Vidyarthi.schoolName = "Mount Carmel"; // NOTE: static filed schoolName is accessed using Class itself not Instance of class

        Vidyarthi v2 = new Vidyarthi();
        System.out.println(v2.getter()); // Prints "Mount Carmel"

        Vidyarthi v3 = new Vidyarthi();
        v3.setter("GH Raisoni");
        System.out.println(v3.getter()); // Prints "GH Raisoni"
    }
}

class Vidyarthi {

    String name;
    int roll;

    static String schoolName; // Declare as static

    // Setter
    void setter(String schoolName) {
        Vidyarthi.schoolName = schoolName; // Access in a static way
    }

    // Getter
    String getter() {
        return Vidyarthi.schoolName; // Access in a static way
    }
}
