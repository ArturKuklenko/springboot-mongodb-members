package rs.core;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Members")
public class Member {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int postalCode;

    protected Member(){
        this.firstName="null";
        this.lastName="null";
        this.dateOfBirth="null";
        this.postalCode=0;
    }

    public Member(String firstName, String lastName, String dateOfBirth, int postalCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.postalCode = postalCode;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }
}
