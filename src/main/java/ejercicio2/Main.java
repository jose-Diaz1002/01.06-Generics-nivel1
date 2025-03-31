package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Persona person = new Persona("Jose", "Diaz", 47);

        GenericMethods.print(person, "Fear", 235);
        GenericMethods.print(false, person, 235);
        GenericMethods.print('F', 12.34, "Hello");
    }
}
