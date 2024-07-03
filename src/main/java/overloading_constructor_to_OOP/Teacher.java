package overloading_constructor_to_OOP;

public class Teacher {

    //এখানে ২টি class use করা হয়েছে।। এই class-এ variable & method declare করে, অন্য class থেকে তাকে call করা হয়েছে।।
    //these are instance variable
    String name, subjectName, gender;
    double salary;

    //default constructor----------
    Teacher() {
        //System.out.println("no value");
    }

    //parametrized constructor ------------------
    Teacher(String n, String sub) {
        name = n;
        subjectName = sub;
    }

    //parametrized constructor ------------------
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

    }
}
