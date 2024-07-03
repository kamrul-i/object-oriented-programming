package method_declare_to_OOP;

public class Test {

    public static void main(String[] args) {

        //এখানে ২টি class use করা হয়েছে।। এই class-এ object create করে, অন্য class-এর variable & method কে call করা হয়েছে।।
        //object decleare system.--------------------
        Teacher teacher = new Teacher();
        teacher.name = "Kamrul islam";
        teacher.subjectName = "Bangla";
        teacher.gender = "male";
        teacher.phone = 17100445;     //প্রথমে 0 দিলে কাজ করে না ।।
        teacher.displayInformation();

        Teacher teacher1 = new Teacher();
        teacher1.name = "Nabila hasan";
        teacher.subjectName = "English";
        teacher1.gender = "fimale";
        teacher1.phone = 181500445;
        teacher1.displayInformation();

        Teacher teacher2 = new Teacher();
        teacher2.name = "Jahid Ahmed";
        teacher.subjectName = "Agriculture";
        teacher2.gender = "male";
        teacher2.phone = 182000010;
        teacher2.displayInformation();

        Teacher teacher3 = new Teacher();
        teacher3.name = "Abdullah";
        teacher3.subjectName = "Mathmatices";
        teacher3.gender = "male";
        teacher3.phone = 178583256;   //প্রথমে 0 দিলে কাজ করে না ।।
        teacher3.displayInformation();

        Teacher teacher4 = new Teacher();
        teacher4.name = "Arman Arif";
        teacher4.subjectName = "History";
        teacher4.gender = "male";
        teacher4.phone = 163825;   //প্রথমে 0 দিলে কাজ করে না ।।
        teacher4.displayInformation();

        Teacher teacher5 = new Teacher();
        teacher5.name = "Shahana Begum";
        teacher5.subjectName = "Science";
        teacher5.gender = "female";
        teacher5.phone = 15742382;   //প্রথমে 0 দিলে কাজ করে না ।।
        teacher5.displayInformation();
        //---------------------------------------------

        /*
        এই documents গুলোকে উপরে সংক্ষেপন করে দেখানো হয়েছে।।==========
        Teacher teacher = new Teacher();
        teacher.name = "Kamrul islam";
        teacher.subjectName = "Bangla";
        teacher.gender = "male";
        teacher.phone = 17100445;     //প্রথমে 0 দিলে কাজ করে না ।।

        System.out.println("Name        : " + teacher.name);
        System.out.println("SubjectName : " + teacher.subjectName);
        System.out.println("Gender      : " + teacher.gender);
        System.out.println("Phone       : " + teacher.phone);
         */
    }
}
