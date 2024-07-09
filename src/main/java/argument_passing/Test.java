package argument_passing;

public class Test {

    public static void main(String[] args) {
        //এখানে ২টি class use করা হয়েছে।। এই class থেকে অন্য class কে call করা হয়েছে।।

        Call_by_reference r1 = new Call_by_reference(); //this "r1" is object.  
        r1.name = "Altaf";  //this "r1" is actual parametre
        System.out.println("Before calling : " + r1.name);

        r1.change(r1);   //this "r1" is actual parametre
        System.out.println("After calling : " + r1.name);
    }

}
