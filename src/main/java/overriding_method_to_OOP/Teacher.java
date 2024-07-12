package overriding_method_to_OOP;

public class Teacher extends Person {
    //এখানে ৩টি class use করা হয়েছে, main class থেকে এই class-কে call করা হয়েছে।।

    String qualification;

    @Override
    void display() {
        super.display();//extends করার কারণে super class এর method-কে call করা হয়েছে।।
        message();       //super class এর method কে call করা হয়েছে,
        System.out.println("qualification : " + qualification);
        System.out.println();
    }
    /*
    Super class এর method-কে same নামে sub-class এর মধ্যে declare করাকে method overriding বলে।।
    method overriding কে run time polymorphism বলে।।
    extends-কে inheritance বলে।।

    1. যে method-কে override করা হবে, তার নাম উভয় class-এ ‍same হতে হবে।।
    2. এই method-কে overriden করে নিতে হয়, তবে তার আগে super class-কে extends করে নিতে হবে।।    
    3. super class এর override method কে call করতে, sub class এর method এর মধ্যে ‍super.(method name)ব্যবহার করতে হয়,
    4. super class এর non-override method কে call করতে, sub class এর method এর মধ্যে ‍(method name) ব্যবহার করতে হয়,
    5. call করা methods-দের সবসময় উপরে রাখতে হয়।। 
     
    এখানে,
    Person হলো super class / parent class / base class,
    Teacher হলো sub class / child class / derived class.    
    Person class-কে Teacher class extends করেছে।। যে extends করে তাকে sub class বলে, যাকে extends করা হয় তাকে super class বলে।।
    super class-কে extends করলে তার সবকিছু sub class-এ চলে আসে, (যদিও দেখা যায় না) এবং sub class থেকে super class-এর সবকিছু control করা যায়।।
    
     */
}
