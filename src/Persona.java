/**
 * @author Xavi Torrens
 */
public class Persona {

    private String dni;
    private String name;
    private String firstName;
    private Sexe sexe;
    private Integer edad;

    public Persona() {
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
