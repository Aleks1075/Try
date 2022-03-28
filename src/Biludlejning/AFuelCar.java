package Biludlejning;

abstract public class AFuelCar extends ACar
{

    protected int kmPrLitre;
    protected String fuelType;

    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre)
    {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }

    public abstract String getFuelType();



    public int getKmPrLitre()
    {
        return kmPrLitre;
    }

    public abstract int getKmPrlitre();

    @Override
    public String toString()
    {
        return null;
    }

}
