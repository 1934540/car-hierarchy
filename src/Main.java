public class Main {
    public static void main(String[] args) {
        AddService addService = new AddService();
        VehicleAd volvoAd = new VehicleAd("Volvo", "123", new PassengerType(), new SedanType(), new PetrolType());
        VehicleAd kamazAd = new VehicleAd("Kamaz", "45", new TruckType(), new PickupType(), new DieselType());
        VehicleAd mercedes = new VehicleAd("Mercedes", "210", new CarType(), new SedanType(), new PetrolType());
        addService.setAdList(new VehicleAd[]{volvoAd, kamazAd, mercedes});
        System.out.println();

        addService.filterByPurpose(new PassengerType());
        showStars();
        addService.filterByBodyTypes(new SedanType());
        showStars();
        addService.filterByFuel(new PetrolType());
        showStars();
        addService.filterByPurpose(new TruckType());
        showStars();
        addService.filterByBodyTypes(new PickupType());
        showStars();
        addService.filterByFuel(new DieselType());
    }
    public static void showStars(){
        String leng= "Объявление № 123 не прошло фильтр: тип авто TRUCK критерий- type by purpose, так как имеет тип авто PASSENGER";
        for (int i = 0; i <leng.length() ; i++) {
            System.out.print("*");
        }
        System.out.println();

    }
}
