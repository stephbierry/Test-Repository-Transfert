public class Eleve extends Person {
    private String id;
    private String studyarea;

    public Eleve( String name, String email, String password, String id, String studyarea) {
        super(name, email, password);
        this.id = id;
        this.studyarea = studyarea;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudyarea() {
        return studyarea;
    }

    public void setStudyarea(String studyarea) {
        this.studyarea = studyarea;
    }
    public void sayHello() {
        System.out.println("Hey sak regle");
    }
}
