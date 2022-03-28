package Biludlejning;

public class Main {

    public static void main(String[] args) {


        Car car = new DieselCar("PO1111", "Ford", "Fiesta", 4, 25, false);
        Car car1 = new ElectricCar(400, 200, "TE5555", "Tesla", "S3", 2);
        Car car2 = new GasolineCar("AB3333", "Toyota", "Yaris", 5, 50);

        FleetOfCars fleetOfCars = new FleetOfCars();
        fleetOfCars.addCar(car);
        fleetOfCars.addCar(car1);
        fleetOfCars.addCar(car2);

        System.out.println(fleetOfCars.toString());
        System.out.println(fleetOfCars.getTotalRegistrationFeeForFleet());


    }
}
