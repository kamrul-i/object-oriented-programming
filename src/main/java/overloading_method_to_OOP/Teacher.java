package overloading_method_to_OOP;

public class Teacher {

    //instance variable
    String name, gender;
    int id;

    //default constructor
    Teacher() {
        //System.out.println("no value");
    }

    //parametrized constructor
    Teacher(String n, String g) {
        name = n;
        gender = g;
    }

    //parametrized constructor
    Teacher(String n, String g, int id) {
        name = n;
        gender = g;
        this.id = id;
    }
    //All of the above are constructor

    //it is method
    void displayInformation() {
        System.out.println("Name   : " + name);
        System.out.println("gender : " + gender);
        System.out.println("ID     : " + id);
        System.out.printf("\n");
    }

    //constructor method diclare -----------
    /*
    Constructor is a special type of method that is used to initialize the object.
    Properties of constructor:
        contructor has the same name as that of the class it belongs.
        constructor is a special type of method.
        it has no return type not even void.
        it is called automatically.
        Defult constructor (no parameter), parametrized constructor.
        You can take many Contructor, but their parameter must be different.
        class name & constructor name must be same.
     */

    /*
    Difference between Constructor and Method
    
    Constructor:
        1- its name should be same as the class name.
        2- its does not have any return type.
        3- if there is no constructor then the default constructor is created by the compiler itself.
    
    Method:
        1- its name should not same as the class name. 
        2- it may return a value.
        3- in case of method, there is no default method provided.
    
     */
}
