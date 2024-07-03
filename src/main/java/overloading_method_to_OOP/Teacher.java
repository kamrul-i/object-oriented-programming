package overloading_method_to_OOP;

public class Teacher {

    //এখানে ২টি class use করা হয়েছে।। এই class-এ method declare করে, অন্য class থেকে তাকে call করা হয়েছে।।
    //return value from method------------
    double square(double value) {
        return value * value;
    }
    /*
    int square (){
        return 5*5;
    }
    এভাবে দিলে হবে না,
    অর্থাৎ কোন parametre না দিয়ে সরাসরি কোন number declare করলে, user যেকোন number type করলেও শুধু এ number-এর result প্রদান করবে।।
    ()first bracket এর ভিতরে যা থাকে, তারই নাম parametre.
     */
}
