package question3;

interface VehicleFeature {
    void engineType();
}

interface VehicleBrand {
    void brand();
}

interface Vehicle extends VehicleFeature, VehicleBrand {
    void start();
}

class Car implements Vehicle {
    public void engineType() {
        System.out.println("Petrol");
    }
    public void brand() {
        System.out.println("BMW");
    }
    public void start() {
        System.out.println("Engine started.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();

        int num = 123;

        System.out.println("number: " + num);

        c1.brand();
        c1.engineType();
        c1.start();
    }
}
