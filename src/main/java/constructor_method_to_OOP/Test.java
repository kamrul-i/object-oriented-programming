package constructor_method_to_OOP;

public class Test {

    public static void main(String[] args) {

        //এখানে ২টি class use করা হয়েছে।। এই class-এ object create করে, অন্য class-এর variable & method কে call করা হয়েছে।।
        //object decleare by constractor-------------
        
        //patametrized constructor tesult here.
        Teacher teacher1 = new Teacher("Kamrul islam", "Bangla", "male", 27000);
        teacher1.displayInformation();

        //default constructor result here.
        Teacher teacher2 = new Teacher();
        teacher2.displayInformation();
    }
}
