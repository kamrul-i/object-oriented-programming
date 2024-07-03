package constructor_method_to_OOP;

public class Test {

    public static void main(String[] args) {

        //এখানে ২টি class use করা হয়েছে।। এই class-এ object create করে, অন্য class-এর variable & method কে call করা হয়েছে।।
        //object decleare by constractor-------------
        
        //object run হওয়ার জন্য কোন constructor খোঁজে না পেলে ‍auto default constructor create করে নিবে।।
        Teacher teacher1 = new Teacher();
        teacher1.displayInformation();

        Teacher teacher2 = new Teacher();
        teacher2.displayInformation();
    }
}
