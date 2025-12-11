public class Main {
    public static void main(String[] args) {
        Quadrilatere quadrilatere= new Quadrilatere();
        Quadrilatere quadrilatere1 = new Quadrilatere(1,2,3,4);
        Person person1 = new Person("Bierry","steph@gmail.com","12345tyui");
        Person professeur = new Professeur("yyy","eeee","2222","eer","wrrrww","errrr");
        Person eleve = new Eleve("ghh","we34","ew4","3434","r424");
        Person delegue1 = new Delegue("tttt","eerette","424242","2424","3r3r3r", "3r3rr");
        System.out.println(person1.getName());
        System.out.println(quadrilatere.getSurface());
        System.out.println(quadrilatere1.getPerimetre());
        System.out.println(quadrilatere1.getSurface());
        System.out.println(quadrilatere1.getPerimetre());
        Carre carre = new Carre(2,4);
        carre.getperimetre();
        System.out.println(carre.getperimetre());

        person1.sayHello();
        professeur.sayHello();
        eleve.sayHello();
        delegue1.sayHello();


    }
}
