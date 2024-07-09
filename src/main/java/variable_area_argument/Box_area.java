package variable_area_argument;

public class Box_area {
    //এখানে ২টি class use করা হয়েছে।। main class থেকে এই class কে call করা হয়েছে।।

    double height, width, depth;

    Box_area(double h, double w, double d) {
        height = h;
        width = w;
        depth = d;
    }

    void displayBall() {
        double volume = height * width * depth;
        System.out.println("Vox area is : " + volume);
    }
}
