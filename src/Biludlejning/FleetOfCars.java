package Biludlejning;

import java.util.ArrayList;

public class FleetOfCars {

    ArrayList<Car> fleet = new ArrayList<>();

    public void addCar(Car car)
    {
        fleet.add(car);
    }

    public int getTotalRegistrationFeeForFleet()
    {
        int total = 0;
        for(Car car : fleet){
            total = total + car.getRegistrationFee();
        }
        return total;
    }

    @Override
    public String toString(){

        String total = " ";
        for(Car car : fleet){
            total = total + car.toString() + "\n";
        }
        return total;
    }


}
