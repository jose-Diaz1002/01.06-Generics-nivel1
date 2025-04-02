package ejercicio2;

public class GenericMethods {

    public static <T, U, V> void printGeneric(T argument1, U argument2, V argument3) {
        System.out.println(argument1);
        System.out.println(argument2);
        System.out.println(argument3 + "\n");
    }
}