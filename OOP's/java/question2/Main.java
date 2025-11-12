package question2;

interface Math {
    double area(int a);
}

class Circle implements Math {
    public double area(int r) {
        double pi = 3.14;
        double radius = r;
        return pi*radius*radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Math obj = new Circle();

        System.out.println("Area of circle is: "+ obj.area(4));
    }

}
