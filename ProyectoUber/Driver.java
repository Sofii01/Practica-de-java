package ProyectoUber;

public class Driver extends account{
    String email;
    String password;
    public Driver (String name, String document, String email, String password){
        super(name, document);
        this.email=email;
        this.password= password;

    }
}
