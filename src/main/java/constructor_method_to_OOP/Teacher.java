package constructor_method_to_OOP;

public class Teacher {

    //এখানে ২টি class use করা হয়েছে।। এই class-এ variable & method declare করে, অন্য class থেকে তাকে call করা হয়েছে।।
    //these are instance variable
    String name, subjectName, gender;
    double salary;

    //it is parametrized constructor ------------------
    //class name দ্বারা create হলে, সে method কে constructor বলে।।
    Teacher(String n, String sub, String g, double s) {
        name = n;
        subjectName = sub;
        gender = g;
        salary = s;
    }

    //it is method
    void displayInformation() {
        System.out.println("Name        : " + name);
        System.out.println("SubjectName : " + subjectName);
        System.out.println("Gender      : " + gender);
        System.out.println("Salary      : " + salary + " Dolar");
        System.out.println();

        /*
    Constructor is a special type of method that is used to initialize the object.
    Properties of constructor:
        contructor has the same name as that of the class it belongs.
        constructor is a special type of method.
        it has no return type.
        it is called automatically.
        two type of constructor. Defult constructor (no parameter) & parametrized constructor.
         */
    }
}
