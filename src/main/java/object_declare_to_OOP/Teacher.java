package object_declare_to_OOP;

public class Teacher {

    //এখানে ২টি class use করা হয়েছে।। এই class-এ variable declare করে, অন্য class থেকে তাকে call করা হয়েছে।।
    //these are instance variable
    String name, gender, subjectName;
    int phone;

    /*
    There are 3 types of variable
        local variable, 
        instance variable, 
        static/class variable
    
    1. what is local variable ?
        A variable that is declared inside the method is called variable.
        যে variable কোন ১টি method এর মধ্যে declare করা হয় তাকে local variable বলে ।
        আবার,
        যে variable কোন ১টি method/constructor/block এর মধ্যে declare করা হয় তাকে local variable বলে ।
    
    2. what is instance variable ?
        A variable that is declared inside the class but outside any method that is called instance variable.
        যে variable কোন ১টি class এর মধ্যে, তবে যেকোন method এর বাইরে declare করা হয় তাকে instance variable বলে ।
        instance variable কে কখনো static হিসেবে declare করা হয় না ।
    
    3. what is static variable ?
        যে variable এর সামনে static keyword থাকবে, তাকে static variable বলে ।
     */
}
