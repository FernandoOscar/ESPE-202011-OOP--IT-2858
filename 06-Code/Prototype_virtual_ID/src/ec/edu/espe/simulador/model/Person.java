
package ec.edu.espe.simulador.model;

public abstract class Person {
    
    private String name;
    private String email;
    private String address;
    private int age;
    private String id;
    
    /**
     *
     * @return
     */
    public abstract boolean validId();

    public Person() {
    }

    public Person(String name, String email, String address, int age, String id) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.age = age;
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    

    
    
    
    
    
}
