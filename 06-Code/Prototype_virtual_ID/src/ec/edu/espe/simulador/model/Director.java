package ec.edu.espe.simulador.model;


/**
 *
 * @author Developers
 */
public class Director extends Administrator{

    private String career;
    private String faculty;
    private int password = 1234;
    private String id;
    private Student student;
    
    
    
    public boolean approveMotion(char answer){
        if (answer == 'Y' || answer == 'y') {
            return true;
        }

        else if (answer == 'N' || answer == 'n') {
            return false;
        }
        return false;
        
    }

    
public Director(String career, String faculty, String id, Student student, String name) {
        super(name);
        this.career = career;
        this.faculty = faculty;
        this.id = id;
        this.student = student;
    }


    
    
    public Director(){
        
    }
    

    /**
     * @return the career
     */
    public String getCareer() {
        return career;
    }

    /**
     * @param career the career to set
     */
    public void setCareer(String career) {
        this.career = career;
    }

    /**
     * @return the faculty
     */
    public String getFaculty() {
        return faculty;
    }

    /**
     * @param faculty the faculty to set
     */
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    /**
     * @return the password
     */
    public int getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(int password) {
        this.password = password;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the student
     */
    @Override
    public Student getStudent() {
        return student;
    }

    /**
     * @param student the student to set
     */
    @Override
    public void setStudent(Student student) {
        this.student = student;
    }

    
    
    
    
    

}
