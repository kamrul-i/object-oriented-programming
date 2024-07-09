package argument_passing;

public class Test {

    public static void main(String[] args) {
        //এখানে ২টি class use করা হয়েছে।। এই class থেকে অন্য class কে call করা হয়েছে।।

        Call_by_value cv = new Call_by_value();
        int x = 10;    //this "x" is primitive data. 

        cv.change(x);  //this "x" is actual parametre
        System.out.println("x before call : " + x);

        cv.change(x);  //this "x" is actual parametre
        System.out.println("x after call :" + x);
    }

}
