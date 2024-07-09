package variable_length_argument;

public class Add_Demo {
    //এখানে ২টি class use করা হয়েছে।। main class থেকে এই class কে call করা হয়েছে।।

    void add(int... num) {

        int sum = 0;
        for (int x : num) {
            sum = sum + x;
        }
        System.out.print(sum + " ");
        //System.out.println(sum);
    }

    /*
    variable length argument -কে varargs method বলে।।
    A method that takes a variable number of arguments is called a varargs method.
    
    main method-এ যতই arguments declare করুন, 
    class-এ method এর মধ্যে 3 dot(...) দিলে সকল arguments কে control করা সম্ভব।। 
    এখানে for each loop ব্যবহার করা হয়েছে।।

     */
}
