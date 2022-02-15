import java.util.Objects;

public class VehicleType {
    protected String atribute;

    public VehicleType(String atribute) {
        this.atribute = atribute;
    }

    public String getAtributeofType() {
        return atribute;
    }

    public String getTypeName() {
        return "Some vehicle type name";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        VehicleType that = (VehicleType) object;
        return Objects.equals(atribute, that.atribute);
    }

    @Override
    public int hashCode() {
        return Objects.hash(atribute);
    }
}

