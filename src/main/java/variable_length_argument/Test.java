package variable_length_argument;

public class Test {

    public static void main(String[] args) {
        //এখানে ২টি class use করা হয়েছে।। এই class থেকে অন্য class কে call করা হয়েছে।।

        Add_Demo ad = new Add_Demo();
        ad.add(10, 20);
        ad.add(10, 20, 30);
        ad.add(54, 90, 82, 32);
    }
    /*
    এখানে ২টি, ৩টি, ৪টি arguments declare করা হয়েছে, এবং class কে call করা হয়েছে, 
    এভাবে যতটি arguments যুক্ত object declare করবেন, class-এ ততটি method declare করতে হবে, এভাবে আর কত করবেন!!
    পরবর্তী commit-এ update দেখুন।।
     */

}
