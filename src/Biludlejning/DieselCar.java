package Biludlejning;

public class DieselCar extends AFuelCar{
    private int kmPrL;
    private int fee;
    private boolean particleFilter;
    private int i;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmpPrLitre, boolean hasParticleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmpPrLitre);
        this.particleFilter = hasParticleFilter;
    }

    private boolean hasParticleFilter(){

        return this.particleFilter;
    }

    @Override
    public String getFuelType(){
        return "DieselCar";
    }

    @Override
    public int getKmPrlitre() {
        return 0;
    }

    public int getRegistrationFee(){
        if(kmPrL > 20 && kmPrL <50)
        {
            fee = 330+130;
        }
        else if (kmPrL > 15 && kmPrL <20){
            fee = 1050+1390;
        }
        else if (kmPrL > 10 && kmPrL <15){
            fee = 2340+1850;
        }
        else if (kmPrL > 5 && kmPrL <10){
            fee = 5500+2770;
        }
        else if(kmPrL <5){
            fee = 10470+15260;
        }
        if(!hasParticleFilter()) {
            fee+=1000;
        }
        return fee;
    }

    @Override
    public String toString(){
         return "DieselCar{"+
                "RegistrationNumber:" + RegistrationNumber + '\'' +
                ", Make= " + Make + '\'' +
                ", Model= " + Model + '\'' +
                ", NumberOfDoors= " + NumberOfDoors + '\'' +
                '}';
    }

}
