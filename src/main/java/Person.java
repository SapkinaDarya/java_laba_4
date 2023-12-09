import com.opencsv.bean.*;

import java.time.LocalDate;
import java.util.Objects;
/**
 * Class Person keeps information about each person .
 *
 * @author Sapkina Daria
 */
public class Person {
    /**
     * Field id - id for person
     */
    @CsvBindByName(column = "id")
    private int id;

    /**
     * Field name - name of person
     */
    @CsvBindByName(column = "name")
    private String name;

    /**
     * Field gender - gender of person
     */
    @CsvBindByName(column = "gender")
    private String gender;

    /**
     * Field name - name of person
     */
    @CsvRecurse
    private Unit division;

    /**
     * Field salary - salary of person
     */
    @CsvBindByName(column = "Salary")
    private int salary;

    /**
     * Field birtDate - birthday of person
     */
    @CsvDate(value = "dd.MM.yyyy")
    @CsvBindByName(column = "BirtDate")
    private LocalDate birtDate;

    /**
     * Constructor by default for Person
     */
    public Person(){}

    /**
     * Getter for person id
     */
    public int getId() {
        return id;
    }
    /**
     * Setter for person id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for person name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for person name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for person gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Setter for person gender
     */
    public void setGender(String gender) {
        this.gender = gender;
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
        if (!super.equals(o)) return false;
        Person person = (Person) o;
        return id == person.id && salary == person.salary && Objects.equals(name, person.name) && Objects.equals(gender, person.gender) && Objects.equals(division, person.division) && Objects.equals(birtDate, person.birtDate);
    }

    /**
     * Overrides classic method hashcode in java
     *
     * @return hashcode
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, name, gender, division, salary, birtDate);
    }

    /**
     * Overrides classical function toString
     * and outputs full info about current person
     *
     * @return Returns string of info
     */
    @Override
    public String toString() {
        return "Person{" +
                "personID=" + id +
                ", personName='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", unit=" + division +
                ", salary=" + salary +
                ", birthday=" + birtDate +
                '}';
    }

    /**
     * Getter for person division
     */
    public Unit getDivision() {
        return division;
    }

    /**
     * Setter for division
     */
    public void setDivision(Unit division) {
        this.division = division;
    }

    /**
     * Getter for person salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * Setter for person salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Getter for person birthday
     */
    public LocalDate getBirtDate() {
        return birtDate;
    }

    /**
     * Setter for person birthday
     */
    public void setBirtDate(LocalDate birtDate) {
        this.birtDate = birtDate;
    }

}
