package overloading_method_to_OOP;

public class Test {

    public static void main(String[] args) {

        //এখানে ২টি class use করা হয়েছে।। এই class-এ object create করে, অন্য class কে call করা হয়েছে।।
        Teacher teacher = new Teacher();
        teacher.displayInformation();

        Teacher teacher1 = new Teacher("kamrul islam", "male");
        teacher1.displayInformation();

        Teacher teacher2 = new Teacher("kamrul", "male", 123456);
        teacher2.displayInformation();

    }
}
