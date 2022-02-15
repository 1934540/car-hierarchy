import java.util.Objects;

public class ByFuelType extends VehicleType{
    public ByFuelType() {
        super("type by fuel");
    }

    @Override
    public boolean equals(Object object) {
        if (object.equals(getTypeName()) || getClass() != object.getClass()) return false;
        ByFuelType that = (ByFuelType) object;
        return atribute != null ? atribute.equals(that.atribute):false;
    }
    @Override
    public int hashCode() {
        return Objects.hash(atribute);
    }
}
