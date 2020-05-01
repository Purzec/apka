package pl.patryk.apka.model;

public class Greeting {
    public Greeting(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public  Greeting(){

    }

    private String firstname;
    private String lastname;



    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


}
