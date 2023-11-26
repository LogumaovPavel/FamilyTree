
public class Main {
    public static void main(String[] args) {

        Persona per1 = new Persona("Sergey", "Ivanov", Persona.Sex.MALE, null);
        Persona per2 = new Persona("Georgy", "Ivanov", Persona.Sex.MALE, per1);
        Persona per3 = new Persona("Irina", "Ivanova", Persona.Sex.FEMALE, per2);
        Persona per4 = new Persona("Petr", "Ivanov", Persona.Sex.MALE, per3);
        Persona per5 = new Persona("Oksana", "Ivanova", Persona.Sex.FEMALE, per3);


        System.out.println("Parent('s): ");
        for (Persona person : per2.getParents()) {
            System.out.println(person.getNameData());
        }

        System.out.println("Children are: ");
        for (Persona person : per3.getChildren()) {
            System.out.println(person.getNameData());
        }

        System.out.println("Grandparent('s): ");
        for (Persona person : per4.getSubParents()) {
            System.out.println(person.getNameData());
        }

    }
}
