public class Delegue extends Eleve {
    private String surn;

    public String getSurname() {
        return surn;
    }

    public void setSurname(String surname) {
        this.surn = surname;
    }

    public Delegue(String name, String email, String password , String id, String studyarea, String surn) {
        super(name, email, password, id, studyarea);
        this.surn = surn;

    }
    public void sayHello() {
        System.out.println("ddd");
    }
}
