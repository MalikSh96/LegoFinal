package FunctionLayer;

import java.util.List;


/**
 * The purpose of User is to...
 * @author kasper
 */
public class User {


    public User( String email, String password, String role ) {
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public User(int id, String email, String password, String role) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    private int id; // just used to demo retrieval of autogen keys in UserMapper
    private String email;
    private String password; // Should be hashed and all
    private String role;    
    private List<PreOrder> recent;

    public void setRecent(List<PreOrder> recent) {
        this.recent = recent;
    }

    public List<PreOrder> getRecent() {
        return recent;
    }


    public String getEmail() 
    {
        return email;
    }

    public void setEmail( String email ) 
    {
        this.email = email;
    }

    public String getPassword() 
    {
        return password;
    }

    public void setPassword( String password ) 
    {
        this.password = password;
    }

    public String getRole() 
    {
        return role;
    }

    public void setRole( String role ) 
    {
        this.role = role;
    }

    public int getId() 
    {
        return id;
    }

    public void setId( int id ) 
    {
        this.id = id;
    }

    @Override
    public String toString() 
    {
        return "User\nId: " + id + "\nemail: " + email + "\nPassword: " + password + "\nrole: " + role;
    }    
}