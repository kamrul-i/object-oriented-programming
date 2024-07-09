package argument_passing;

public class Call_by_value {
    //এখানে ২টি class use করা হয়েছে।। main class থেকে এই class কে call করা হয়েছে।।

    //this "i" is formal parametre
    void change(int i) {
        i = 20;
    }

    /*
    Argument passing এর পদ্ধতি ২টি,
        call by value / pass by value
        call by reference / pass by reference
    
    primitive data দ্বারা কোন method-কে call করলে তাকে call by value বলে।।
    call by value-তে original value change হয় না, actual parametre দ্বারা formal parametre-কে call করলেও x-এর মান change হয় না।।
    primitive data stack memory-তে store হয়ে থাকে।।
     */
}
