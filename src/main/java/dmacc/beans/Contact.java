
/**
 * @author Aaron Carpenter - acarpenter5@dmacc.edu
 * CIS175 - Fall 2023
 * Oct 16, 2023
 */

package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Contact {
    @Id
    @GeneratedValue
    private long id;
    private String fname;
    private String lname;
    private int age;
    private String relationship;
    @Autowired
    private Address address;

    public Contact() {
        super();
        this.relationship = "spouse";
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int phone) {
        this.age = phone;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Contact(String fname, String lname, int phone, String relationship, Address address) {
        this.fname = fname;
        this.lname = lname;
        this.age = phone;
        this.relationship = relationship;
        this.address = address;
    }
    
    @Override
    public String toString() {
        return "Contact [id = " + id + ", fname=" + fname + ", lname=" + lname + ", age=" + age + ", relationship=" + relationship + ", address=" + address + "]";
    }

}

