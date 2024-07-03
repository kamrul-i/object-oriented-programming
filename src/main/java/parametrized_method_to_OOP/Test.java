package parametrized_method_to_OOP;

public class Test {

    public static void main(String[] args) {

        //এখানে ২টি class use করা হয়েছে।। এই class-এ object create করে, অন্য class-এর variable & method কে call করা হয়েছে।।
        //object decleare system.--------------------
        //-------------------------------------------
        Teacher teacher = new Teacher();
        teacher.setInformation("Kamrul islam","Bangla","male",17000);
        teacher.displayInformation();



        /*
        এই documents গুলোকে উপরে সংক্ষেপন করে দেখানো হয়েছে।।==========
        Teacher teacher = new Teacher();
        teacher.name = "Kamrul islam";
        teacher.subjectName = "Bangla";
        teacher.gender = "male";
        teacher.phone = 17100445;
        
        teacher.displayInformation();
         */
    }
}
