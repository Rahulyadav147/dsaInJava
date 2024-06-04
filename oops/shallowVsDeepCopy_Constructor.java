package oops;

public class shallowVsDeepCopy_Constructor {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.marks[0]=50;
        s1.marks[1]=60;
        s1.marks[2]=59;
        Student s2=new Student(s1);// copying s1 to s2 or calling copy constructor
        // changing vlaue of s1: will not reflect in s2 after it is copied
        s1.name="rahul";
        s1.marks[2]=100;
        System.out.println(s2.name);// Aman    : no change when s1.name is changed to rahul
        System.out.println(s2.marks[2]); 
    }
}

class Student{
    String name;
    int marks[];
    // non -parameterised constructor
    Student(){
        name="Aman";
        marks=new int[3];
        System.out.println("default constructor called:");

    }
    // shallow copy constructor: changes in s1 will reflect  in s2 as well
    // Student(Student s1){
    //     this.name=s1.name;
    //     this.marks=s1.marks;
    // }
    // deep copy constructor: changes in previous marks s1 will not reflect:
    Student(Student s1){
        marks=new int[3];
        this.name=new String(s1.name);
        for(int i=0;i<marks.length;i++){
           this.marks[i]=s1.marks[i];
        }
    }
}
