package variable_length_argument;

public class Test {

    public static void main(String[] args) {
        //এখানে ২টি class use করা হয়েছে।। এই class থেকে অন্য class কে call করা হয়েছে।।

        Add_Demo ad = new Add_Demo();
        ad.add(10, 20);
        ad.add(30, 20, 40);
        ad.add(10, 50, 30, 70);
        ad.add(10, 80, 30, 90, 50);
    }
}
