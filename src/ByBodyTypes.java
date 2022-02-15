import java.util.Objects;

public class ByBodyTypes extends VehicleType{
    public ByBodyTypes() {
    super("type by Body");
}

    @Override
    public boolean equals(Object object) {
        if (object.equals(getTypeName()) || getClass() != object.getClass()) return false;
        ByBodyTypes that = (ByBodyTypes) object;
        return atribute != null ? atribute.equals(that.atribute):false;
    }
    @Override
    public int hashCode() {
        return Objects.hash(atribute);
    }
}
