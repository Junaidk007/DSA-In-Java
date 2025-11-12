
interface Vehicle {

    void move();
}

class Car implements Vehicle {
    public void move() {
        System.out.println("Car moves on 4 tyers.");
    }
}

public class Interface {

    public static void main(String[] args) {

        Vehicle myCar = new Car();
        myCar.move();
    }
}
