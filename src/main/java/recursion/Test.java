package recursion;

public class Test {

    public static void main(String[] args) {
        //এখানে ২টি class use করা হয়েছে।। এই class থেকে অন্য class কে call করা হয়েছে।।

        Factorial_demo fd = new Factorial_demo();
        double result = fd.fact(5);
        System.out.println("Factorial of 5 = "+result);
        
        result = fd.fact(6);
        System.out.println("Factorial of 6 = "+result);
        
        result = fd.fact(7);
        System.out.println("Factorial of 7 = "+result);
    }
}
