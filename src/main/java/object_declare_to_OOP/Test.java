package object_declare_to_OOP;
public class Test {

    public static void main(String[] args) {

        //এখানে ২টি class use করা হয়েছে।। এই class-এ object create করে, অন্য class-এর variable কে call করা হয়েছে।।
        //object decleare system.--------------------
        Teacher teacher = new Teacher();
        teacher.name = "Kamrul islam";
        teacher.subjectName = "Bangla";
        teacher.gender = "male";
        teacher.phone = 17100445;     //প্রথমে 0 দিলে কাজ করে না ।।

        System.out.println("name   : " + teacher.name);
        System.out.println("subjectName : " + teacher.subjectName);
        System.out.println("gender : " + teacher.gender);
        System.out.println("phone  : " + teacher.phone);
        //---------------------------------------------
    }
}