package overriding_method_to_OOP;

public class Overriding_Test {

    public static void main(String[] args) {
        //এখানে ৩টি class use করা হয়েছে, main class থেকে অন্য class-গুলোকে call করা হয়েছে।।

        Teacher t = new Teacher();
        t.name = "Kamrul Islam";
        t.age = 32;
        t.qualification = "Computer Science";
        t.display();

        Person p = new Person();
        p.name = ("Altuf Hussain");
        p.age = (29);
        p.display();
    }
}
