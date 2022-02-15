public class VehicleAd {
    private String model;
    private String id;
    private ByPurpose ByPurpose;
    private ByBodyTypes byBodyTypes;
    private ByFuelType byFuelType;

    public VehicleAd(String model, String id, ByPurpose byPurpose, ByBodyTypes byBodyTypes, ByFuelType byFuelType) {
        this.model = model;
        this.id = id;
        this.ByPurpose = byPurpose;
        this.byBodyTypes = byBodyTypes;
        this.byFuelType = byFuelType;
    }
    public VehicleAd(String model){
        this.model = model;
    }



    public ByPurpose getByPurpose() {
        return ByPurpose;
    }

    public ByBodyTypes getByBodyTypes() {
        return byBodyTypes;
    }

    public ByFuelType getByFuelType() {
        return byFuelType;
    }
    public String getModel() {
        return model;
    }

    public String getId() {
        return id;
    }
    public String toString(){
        return this.model;
    }
}
