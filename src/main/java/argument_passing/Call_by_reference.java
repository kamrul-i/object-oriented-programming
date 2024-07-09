package argument_passing;

public class Call_by_reference {
    //এখানে ২টি class use করা হয়েছে।। main class থেকে এই class কে call করা হয়েছে।।

    String name;

    //this "r2" is reference variable & formal parametre too.
    void change(Call_by_reference r2) {
        r2.name = "islam";
    }

    /*
    Argument passing এর পদ্ধতি ২টি,
        call by value / pass by value
        call by reference / pass by reference
    
    reference type-এর data দ্বারা কোন method-কে call করলে তাকে call by reference বলে।।
    "r1"-কে "call by reference" class-এর reference variable বলা হয়ে থাকে, আবার- "call by reference" class-এ reference variable হিসেবে r2 বিদ্যমান আছে,
    r1 object "call by reference" class-এর object-কে refer করে থাকে,
    এই object এ কোন মান set করা হয়ে থাকে, যেমন- Altaf
    
    call by reference-এ original value change হয়,
    actual parametre দ্বারা formal parametre-কে call করলে r-এর মান change হয়।।
     */
}
