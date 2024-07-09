package variable_area_argument;

public class Test {

    public static void main(String[] args) {
        //এখানে ২টি class use করা হয়েছে।। এই class থেকে অন্য class কে call করা হয়েছে।।

        Box_area b1 = new Box_area(10, 20, 30);
        b1.displayBall();

        Box_area b2 = new Box_area(20, 30, 20);
        b2.displayBall();
    }
}
