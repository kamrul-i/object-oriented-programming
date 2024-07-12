package overriding_method_to_OOP;

public class Person {
    //এখানে ৩টি class use করা হয়েছে, main class থেকে এই class-কে call করা হয়েছে।।

    String name;
    int age;

    void display() {
        System.out.println("name : " + name);
        System.out.println("age : " + age);
    }

    void message() {
        System.out.println("welcome to message.");
    }
    //message method কে override করা হয় নাই।।
}
