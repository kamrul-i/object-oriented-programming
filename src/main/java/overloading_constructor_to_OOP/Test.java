package overloading_constructor_to_OOP;

public class Test {

    public static void main(String[] args) {

        //এখানে ২টি class use করা হয়েছে।। এই class-এ object create করে, অন্য class কে call করা হয়েছে।।
        //object decleare by overloading constractor
        
        //এটাতে method কে call করি নাই।। তাই কোন result দেখায় নাই।। 
        Teacher teacher1 = new Teacher();

        //এটাতে method কে call করলে, default value প্রদান করে।।
        Teacher teacher2 = new Teacher();
        teacher2.displayInformation();

        Teacher teacher3 = new Teacher("Kamrul islam", "Science");
        teacher3.displayInformation();

        Teacher teacher4 = new Teacher("Sabina begum", "mathematics", "female", 36000);
        teacher4.displayInformation();
    }
}
