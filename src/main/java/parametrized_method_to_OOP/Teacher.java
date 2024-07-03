package parametrized_method_to_OOP;

public class Teacher {

    //এখানে ২টি class use করা হয়েছে।। এই class-এ variable & method declare করে, অন্য class থেকে তাকে call করা হয়েছে।।
    //these are instance variable
    String name, subjectName, gender;
    double salary;
    
    //it is parametrized method. first bracket এর মধ্যে কিছু থাকলে, তাকে parametrized method বলে।।
    void setInformation(String n, String sub, String g, double s){
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
        System.out.println("Salary      : " + salary +" Dolar");
        System.out.println();

        //multiple objects can be printed by declaring one method.
        //Objects can be in this class, or can be in other classes, but it must be in the main method.
    }
}
