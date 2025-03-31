package ejercicio1;

public class Main {
    public static void main(String[] args) {
        NoGenericMethods object1 = new NoGenericMethods("casa", "perro", "faro");
        NoGenericMethods object2 = new NoGenericMethods("perro", "faro", "casa");
        NoGenericMethods object3 = new NoGenericMethods("faro", "casa", "perro");

        System.out.println(object1.toString());
        System.out.println(object2.toString());
        System.out.println(object3.toString());
    }
}
