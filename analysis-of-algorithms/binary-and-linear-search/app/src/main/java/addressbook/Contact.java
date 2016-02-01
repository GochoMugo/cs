/**
 * A single contact. Resembles a real-world contact address.
 */

package addressbook;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;
    private String homeAddress;

    /**
     * @return contact's first name
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * @param  firstName - contact's first name
     * @return this. useful for chaining
     */
    public Contact setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * @return contact's last name
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * @param lastName - contact's last name
     * @return this. useful for chaining
     */
    public Contact setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * @return full name
     */
    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    /**
     * @return contact's phone number
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * @param phoneNumber - contact's phone number
     * @return this - useful for chaining
     */
    public Contact setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * @return contact's email address
     */
    public String getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * @param address - contact's email address
     * @return this. useful for chaining
     */
    public Contact setEmail(String address) {
        this.emailAddress = address;
        return this;
    }

    /**
     * @return contact's home address
     */
    public String getHomeAddress() {
        return this.homeAddress;
    }

    /**
     * @param homeAddress - contact's home address
     * @return this - useful for chaining
     */
    public Contact setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
        return this;
    }

    // constructing with default values
    public Contact() {}

    // setting all required values when constructing
    public Contact(String firstName, String lastName, String phoneNumber, String emailAddress, String homeAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.homeAddress = homeAddress;
    }

    /**
     * Saves the contact into the backing store
     *
     * @param conn - database connection
     * @throws Exception
     */
    public void Save(Connection conn) throws SQLException {
        Statement stmt = conn.createStatement();
        stmt.executeUpdate("INSERT INTO `contacts`(`first_name`, `last_name`, `phone`, `email`, `physical_address` ) VALUES ('"+ this.firstName +"', '"+ this.lastName +"','"+ this.phoneNumber +"','"+ this.emailAddress +"','"+ this.homeAddress +"')");
    }
}
