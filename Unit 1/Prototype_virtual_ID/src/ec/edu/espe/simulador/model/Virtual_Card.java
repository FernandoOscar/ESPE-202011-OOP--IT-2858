
package ec.edu.espe.simulador.model;

/**
 *
 * @author JOHNY
 */
public class Virtual_Card {
    private String department;
    private int id;
    private String name;

void giveWay(){
    
}
String showIdentificaction(){
    
    return getName();
}

    @Override
    public String toString() {
        return "Virtual_Card{" + "department=" + department + ", id=" + id + ", name=" + name + '}';
    }
    
    public Virtual_Card(String department, int id, String name) {
        this.department = department;
        this.id = id;
        this.name = name;
    }
    
    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
