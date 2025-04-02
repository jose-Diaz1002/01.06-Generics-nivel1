package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Jose", "Diaz", 47);

        GenericMethods.printGeneric(person, "Fear", 235);
        GenericMethods.printGeneric(false, person, 235);
        GenericMethods.printGeneric('F', 12.34, "Hello");
    }
}
