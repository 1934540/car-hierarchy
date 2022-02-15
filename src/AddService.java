public class AddService {
    private VehicleAd[] adList;

    public void setAdList(VehicleAd[] adList) {
        this.adList = adList;
    }

    public void filterByPurpose(ByPurpose vehicleType) {
        for (VehicleAd ad : adList) {
            if (ad.getByPurpose().equals(vehicleType)) {
                System.out.println("Объявление № " + ad.getId() + " подходит под данный фильтр с атрибутом: тип авто - "
                        + vehicleType.getTypeName() + ", атрибут фильтра " + vehicleType.getAtributeofType());
            } else
                System.out.println("Объявление № " + ad.getId() + " не прошло фильтр: тип авто " + vehicleType.getTypeName() + " критерий- "
                        + vehicleType.getAtributeofType() + ", так как имеет тип авто " + ad.getByPurpose().getTypeName());
        }
    }

    public void filterByBodyTypes(ByBodyTypes vehicleType) {
        for (VehicleAd ad : adList) {
            if (ad.getByBodyTypes().equals(vehicleType)) {
                System.out.println("Объявление № " + ad.getId() + " подходит под данный фильтр с атрибутом: тип авто - "
                        + vehicleType.getTypeName() + ", атрибут фильтра " + vehicleType.getAtributeofType());
            } else
                System.out.println("Объявление № " + ad.getId() + " не прошло фильтр: тип авто " + vehicleType.getTypeName() + " критерий- "
                        + vehicleType.getAtributeofType() + ", так как имеет тип кузова " + ad.getByBodyTypes().getTypeName());
        }
    }

    public void filterByFuel(ByFuelType vehicleType) {
        for (VehicleAd ad : adList) {
            if (ad.getByFuelType().equals(vehicleType)) {
                System.out.println("Объявление № " + ad.getId() + " подходит под данный фильтр с атрибутом: тип авто - "
                        + vehicleType.getTypeName() + ", атрибут фильтра " + vehicleType.getAtributeofType());
            } else
                System.out.println("Объявление № " + ad.getId() + " не прошло фильтр: тип авто " + vehicleType.getTypeName() + " критерий- "
                        + vehicleType.getAtributeofType() + ", так как имеет тип заправки " + ad.getByFuelType().getTypeName());
        }
    }
}

