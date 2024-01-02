
package validations;

/**
 *
 * @author thamo
 */
public class loggedUser {
    
    private static String academicID;
    private static String academicName;

    public loggedUser(){
        
    }
    /**
     * @return the academicID
     */
    public String getAcademicID() {
        return academicID;
    }

    /**
     * @param academicID the academicID to set
     */
    public void setAcademicID(String academicID) {
        this.academicID = academicID;
    }

    /**
     * @return the academicName
     */
    public String getAcademicName() {
        return academicName;
    }

    /**
     * @param academicName the academicName to set
     */
    public void setAcademicName(String academicName) {
        this.academicName = academicName;
    }
}
