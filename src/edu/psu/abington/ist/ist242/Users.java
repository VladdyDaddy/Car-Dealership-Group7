package edu.psu.abington.ist.ist242;

public class Users {
    public String firstName, lastName,email,phoneNumber,spEmail,spPhoneNumber;
    public  Users(String _firstName, String _lastName,String _email,String _phoneNumber,String _spEmail,String _spPhoneNumber){
        this.firstName = _firstName;
        this.lastName  = _lastName;
        this.email = _email;
        this.phoneNumber = _phoneNumber;
        this.spEmail = _spEmail;
        this.spPhoneNumber = _spPhoneNumber;
    }
    public  Users(){

    }
    /*
     * Customer firstName getter
     * @return String firstName
     */

    public String getFirstName() {
        return firstName;
    }

    /*
     * Customer firstName setter
     * @return String _FirstName
     */

    public void setFirstName(String _FirstName) {
        this.firstName = _FirstName;
    }

    /*
     * Customer lastName getter
     * @return String lastName
     */

    public String getLastName() {
        return lastName;
    }

    /*
     * Customer lastName setter
     * @return String _LastName
     */

    public void setLastName(String _LastName) {
        this.lastName = _LastName;
    }

    /*
     * Customer custEmail getter
     * @return String custEmail
     */

    public String getEmail() {
        return email;
    }

    /*
     * Customer custEmail setter
     * @return String _email
     */

    public void setEmail(String _email) {
        this.email = _email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    /*
     * Customer phoneNumber setter
     * @return String _PhoneNumber
     */
    public void setPhoneNumber(String _PhoneNumber) {
        this.phoneNumber = _PhoneNumber;
    }


    public String getSpEmail() {
        return spEmail;
    }

    /*
     * Salesperson SpEmail setter
     * @return String empEmail
     */

    public void setSpEmail(String _empEmail) {
        this.spEmail = _empEmail;
    }
    /*
     * Salesperson SpphoneNumber getter
     * @return String phoneNumber
     */

    public String getSpPhoneNumber() {
        return spPhoneNumber;
    }
    /*
     * Salesperson SpphoneNumber setter
     * @return String phoneNumber
     */
    public void setSpPhoneNumber(String _spPhoneNumber) {
        this.spPhoneNumber = _spPhoneNumber;
    }
    /*
     * Salesperson SpEmail getter
     * @return String empEmail
     */

}



