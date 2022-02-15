import java.util.Objects;

public class ByPurpose extends VehicleType {
    public ByPurpose() {
        super("type by purpose");
    }

    @Override
    public boolean equals(Object object) {
        if (object.equals(getTypeName()) || getClass() != object.getClass()) return false;
        ByPurpose that = (ByPurpose) object;
        return atribute != null ? atribute.equals(that.atribute) : false;
    }
    @Override
    public int hashCode() {
        return Objects.hash(atribute);
    }
}
