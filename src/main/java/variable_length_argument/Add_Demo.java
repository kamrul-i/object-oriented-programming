package variable_length_argument;

public class Add_Demo {
    //এখানে ২টি class use করা হয়েছে।। main class থেকে এই class কে call করা হয়েছে।।

    void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    void add(int num1, int num2, int num3) {
        System.out.println(num1 + num2 + num3);
    }

    void add(int num1, int num2, int num3, int num4) {
        System.out.println(num1 + num2 + num3 + num4);
    }

    /*
    variable length argument -কে varargs method বলে।।
    A method that takes a variable number of arguments is called a varargs method.
    
    এখানে ২টি, ৩টি, ৪টি parametre declare করা হয়েছে, এবং main method এর মাধ্যমে result show করা হয়েছে,
    এভাবে যতটি parametre যুক্ত method declare করবেন, main method-এ ততটি arguments declare করতে হবে, এভাবে আর কত করবেন!!
    পরবর্তী commit-এ update দেখুন।।
     */
}
