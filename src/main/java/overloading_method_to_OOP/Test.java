package overloading_method_to_OOP;

public class Test {

    public static void main(String[] args) {

        //এখানে ২টি class use করা হয়েছে।। এই class-এ object create করে, অন্য class কে call করা হয়েছে।।
        //How to return a value from method ?
        //one system -------------------------
        Teacher teacher1 = new Teacher();
        double result = teacher1.square(5);
        System.out.println("square of 5 =  " + result);

        Teacher teacher2 = new Teacher();
        double result2 = teacher2.square(9);
        System.out.println("square of 9 =  " + result2);

        //two system. ------------------------
        Teacher teacher3 = new Teacher();
        System.out.println("square of 6 =  " + teacher3.square(6));

    }
}
