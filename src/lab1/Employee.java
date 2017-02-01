package lab1;

import java.util.Date;

/**
 * Fix the code in this class to do PROPERTY encapsulation correctly. Also
 * consider if any of the properties should be mandatory and use a 
 * constructor to enforce that. Review the tips in the document 
 * "EncapCheckList.pdf" if needed.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.02
 */
public class Employee {
    String firstName;
    String lastName;
    public String ssn;
    boolean metWithHr;
    boolean metDeptStaff;
    boolean reviewedDeptPolicies;
    boolean movedIn;
    String cubeId;
    Date orientationDate;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        
      if (firstName == "String" ){
    // s is String
    this.firstName = firstName;
    }else{
    // s is Integer value
          System.out.println("Please Do Not Enter Numeric Values For First Name.");
          
    }
        
    }



}
