package overloading_method_to_OOP;

public class Overload {

    //এখানে ২টি class use করা হয়েছে।। এই class-এ method declare করে, অন্য class থেকে তাকে call করা হয়েছে।।
    //You can take many method, but their parameter must be different.
    //every method names must be same, parameter list are different, they are inside in the same class.
    //parametrized method ---------
    void add(int a, int b) {
        System.out.println(a + b);
    }

    //parametrized method ---------
    void add(double a, double b) {
        System.out.println(a + b);
    }

    //parametrized method ---------
    void add(float x, double y) {
        System.out.println(x + y);
    }

    //parametrized method ---------
    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    //default method --------------
    void add() {
        System.out.println("Nothing to add");
    }
}
