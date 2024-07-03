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

        System.out.println("Name        : " + teacher.name);
        System.out.println("SubjectName : " + teacher.subjectName);
        System.out.println("Gender      : " + teacher.gender);
        System.out.println("Phone       : " + teacher.phone);
        //---------------------------------------------

        System.out.printf("\n");

        //---------------------------------------------
        Teacher teacher1 = new Teacher();
        teacher1.name = "Nabila hasan";
        teacher.subjectName = "English";
        teacher1.gender = "female";
        teacher1.phone = 181500445;

        System.out.println("Name        : " + teacher1.name);
        System.out.println("SubjectName : " + teacher.subjectName);
        System.out.println("Gender      : " + teacher1.gender);
        System.out.println("Phone       : " + teacher1.phone);
        //---------------------------------------------

        System.out.printf("\n");

        //---------------------------------------------
        Teacher teacher2 = new Teacher();
        teacher2.name = "Jahid Ahmed";
        teacher.subjectName = "Agriculture";
        teacher2.gender = "male";
        teacher2.phone = 182000010;

        System.out.println("name        : " + teacher2.name);
        System.out.println("subjectName : " + teacher.subjectName);
        System.out.println("gender      : " + teacher2.gender);
        System.out.println("phone       : " + teacher2.phone);
        //--------------------------------------------- 

        System.out.printf("\n");

        //---------------------------------------------
        Teacher teacher3 = new Teacher();
        teacher3.name = "Abdullah";
        teacher3.subjectName = "Mathmatices";
        teacher3.gender = "male";
        teacher3.phone = 178583256;   //প্রথমে 0 দিলে কাজ করে না ।।

        System.out.println("Name        : " + teacher3.name);
        System.out.println("SubjectName : " + teacher3.subjectName);
        System.out.println("Gender      : " + teacher3.gender);
        System.out.println("Phone       : " + teacher3.phone);
        //---------------------------------------------

        System.out.printf("\n");

        //---------------------------------------------
        Teacher teacher4 = new Teacher();
        teacher4.name = "Arman Arif";
        teacher4.subjectName = "History";
        teacher4.gender = "male";
        teacher4.phone = 163825;   //প্রথমে 0 দিলে কাজ করে না ।।

        System.out.println("Name        : " + teacher4.name);
        System.out.println("SubjectName : " + teacher4.subjectName);
        System.out.println("Gender      : " + teacher4.gender);
        System.out.println("Phone       : " + teacher4.phone);
        //---------------------------------------------

        System.out.printf("\n");

        //---------------------------------------------
        Teacher teacher5 = new Teacher();
        teacher5.name = "Shahana Begum";
        teacher5.subjectName = "Science";
        teacher5.gender = "female";
        teacher5.phone = 15742382;   //প্রথমে 0 দিলে কাজ করে না ।।

        System.out.println("Name        : " + teacher5.name);
        System.out.println("SubjectName : " + teacher5.subjectName);
        System.out.println("Gender      : " + teacher5.gender);
        System.out.println("Phone       : " + teacher5.phone);
        //---------------------------------------------
    }
}
