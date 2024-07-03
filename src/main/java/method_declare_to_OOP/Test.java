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
        // উপরের তথ্যগুলো print করতে প্রত্যেকটি line এর জন্য printline তৈরি করা লাগে।।
        // তবে method declare এর মাধ্যমে সকল তথ্যকে 01 line এর মাধ্যমে print করা যায়।।
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
