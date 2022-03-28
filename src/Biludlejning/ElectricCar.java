package Biludlejning;

public class ElectricCar extends ACar{
    private int kmPrL = 0;
    private int whPrKm;
    private int fee;
    private int batteryCapacity;
    private int maxRange;

    public ElectricCar(int batteryCapacity, int maxRange, String registrationNumber, String make, String model, int numberOfDoors)
    {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    public int getBatteryCapacityKWh(){
        return 0;
    }

    public int getMaxRangeKm(){
        return 0;
    }

    public int getWhPrKm(){
        return batteryCapacity/maxRange;
    }

    public double getKmPrL()
    {
        return (getWhPrKm()/91.25)/100;
    }


    public int getRegistrationFee(){
        if(getKmPrL() > 20 && getKmPrL() <50)
        {
            fee = 330;
        }
        else if (getKmPrL() > 15 && getKmPrL() <20){
            fee = 1050;
        }
        else if (getKmPrL() > 10 && getKmPrL() <15){
            fee = 2340;
        }
        else if (getKmPrL() > 5 && getKmPrL() <10){
            fee = 5500;
        }
        else if(getKmPrL() <5){
            fee = 10470;
        }
        return fee;
    }

    @Override
    public String getFuelType() {
        return null;
    }

    @Override
    public String toString() {
         return "ElectricCar{"+
                "RegistrationNumber:" + RegistrationNumber + '\'' +
                 "BatteryCapacity:" + batteryCapacity + '\'' +
                 "MaxRange:" + maxRange + '\'' +
                ", Make= " + Make + '\'' +
                ", Model= " + Model + '\'' +
                ", NumberOfDoors= " + NumberOfDoors + '\'' +
                '}';
    }
}
