
package ec.edu.espe.prototypevirtualid.model;

public abstract class Person {
    
    private String name;
    private String email;
    private String address;
    private int age;
    private String id;
    private String gender;
    
    /**
     *
     * @return
     */
    public abstract boolean validUser(String user, String password);

    public Person() {
    }

    public Person(String name, String email, String address, int age, String id, String gender) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.age = age;
        this.id = id;
        this.gender = gender;
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

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    

 
    

    
    
    
    
    
}
