public class Professeur extends Person {
    private String salary;
    private String faculty;
    private String etatmatrimonial;

    public Professeur(String name, String email, String password, String salary, String faculty, String etatmatrimonial) {
        super(name, email, password);
        this.salary = salary;
        this.faculty = faculty;
        this.etatmatrimonial = etatmatrimonial;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getEtatmatrimonial() {
        return etatmatrimonial;
    }

    public void setEtatmatrimonial(String etatmatrimonial) {
        this.etatmatrimonial = etatmatrimonial;
    }
    @Override
    public void sayHello() {
        System.out.println("Hello , ca vas?");
    }
}
