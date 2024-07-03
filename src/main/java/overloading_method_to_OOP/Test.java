package overloading_method_to_OOP;

public class Test {

    public static void main(String[] args) {

        //এখানে ২টি class use করা হয়েছে।। এই class-এ object create করে, অন্য class কে call করা হয়েছে।।
        Overload od = new Overload();
        od.add();
        od.add(5, 6);
        od.add(5.f, 6);
        od.add(5.2, 6.8);
        od.add(15, 10, 70);
    }

    /*
    if the variable counldn't find same method, it will be converted to the variable on the right side.
    java automatic type conversion
    
    type        valid promotion
    double      None
    float       double
    long        float, double
    int         long, float, double
    char        int, long, float, double
    short       int, long, float, double
    byte        short, int, long, float, double
    boolean     None
     */
}
