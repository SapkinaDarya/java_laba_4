import com.opencsv.bean.CsvBindByName;
import java.util.Objects;
import java.util.UUID;

/**
 * Class Unit keeps information about division
 */
public class Unit {
    /**
     * Field unitId - unique id for each division
     */
    private UUID unitID;
    /**
     * Field unitName - name of division
     */
    @CsvBindByName(column = "Division")
    private String unitName;
    /**
     * Getter for UnitID
     */
    public UUID getUnitID() {
        return unitID;
    }
    /**
     * Setter for UnitID
     */
    public void setUnitID(UUID unitID) {
        this.unitID = unitID;
    }
    /**
     * Getter for UnitName
     */
    public String getUnitName() {
        return unitName;
    }
    /**
     * Setter for UnitName
     */
    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }
    /**
     * Constructor by default for Unit
     */
    public Unit() {
        this.unitID= UUID.randomUUID();
    }
    /**
     * Constructor for Unit
     * @param unitName - name of division
     */
    public Unit(String unitName) {

        this.unitName=unitName;
    }
    /**
     * Overrides classical function toString
     * and outputs full info about current unit
     *
     * @return Returns string about unit
     */
    @Override
    public String toString() {
        return "Unit{" +
                "unitID=" + unitID +
                ", unitName='" + unitName + '\'' +
                '}';
    }
    /**
     * Overrides classic method equals in java
     *
     * @param o - object for comparison
     * @return Returns - true, if objects are the same;
     * Returns - false in other way.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Unit unit = (Unit) o;
        return unitID == unit.unitID && Objects.equals(unitName, unit.unitName);
    }
    /**
     * Overrides classic method hashcode in java
     *
     * @return Hashcode
     */
    @Override
    public int hashCode() {
        return Objects.hash(unitID, unitName);
    }
}
