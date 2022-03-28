package Biludlejning;

public class GasolineCar extends AFuelCar {

    private int fee;

    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre){

        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);

    }

    @Override
    public String getFuelType(){
        return "GasolineCar";
    }

    @Override
    public int getKmPrlitre() {
        return 0;
    }


    public int getRegistrationFee(){

        int kmPrl = getKmPrLitre();
        if(kmPrl > 20 && kmPrl <50)
        {
             fee = 330;
        }
        else if (kmPrl > 15 && kmPrl <20){
             fee = 1050;
        }
        else if (kmPrl > 10 && kmPrl <15){
             fee = 2340;
        }
        else if (kmPrl > 5 && kmPrl <10){
             fee = 5500;
        }
        else if(kmPrl <5){
             fee = 10470;
        }
            return fee;
    }

    @Override
    public String toString(){
         return "GasolineCar{"+
                "RegistrationNumber:" + RegistrationNumber + '\'' +
                ", Make= " + Make + '\'' +
                ", Model= " + Model + '\'' +
                ", NumberOfDoors= " + NumberOfDoors + '\'' +
                '}';
    }

}
