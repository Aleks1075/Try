package Biludlejning;

public class DieselTruck extends AFuelCar
{


    public DieselTruck(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
    }

    @Override
    public String getFuelType() {
        return null;
    }

    @Override
    public int getKmPrlitre() {
        return 0;
    }

    @Override
    public int getRegistrationFee() {
        return 0;
    }
}
