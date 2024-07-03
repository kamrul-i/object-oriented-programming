package parametrized_method_to_OOP;

public class Test {

    public static void main(String[] args) {

        //এখানে ২টি class use করা হয়েছে।। এই class-এ object create করে, অন্য class-এর variable & method কে call করা হয়েছে।।
        //object decleare system.--------------------
        //-------------------------------------------
        Teacher teacher1 = new Teacher();
        teacher1.setInformation("Kamrul islam", "Bangla", "male", 27000);
        teacher1.displayInformation();

        Teacher teacher2 = new Teacher();
        teacher2.setInformation("Nabila Hasan", "English", "female", 25000);
        teacher2.displayInformation();

        Teacher teacher3 = new Teacher();
        teacher3.setInformation("Rakib islam", "Agriculture", "male", 21000);
        teacher3.displayInformation();

        Teacher teacher4 = new Teacher();
        teacher4.setInformation("Hanifa Begum", "Mathmatices", "female", 24000);
        teacher4.displayInformation();

        Teacher teacher5 = new Teacher();
        teacher5.setInformation("Ubaidul Haque", "History", "male", 17000);
        teacher5.displayInformation();

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
