public class Main {
    public static void main(String[] args) {
        Object obj1 = "Isso é uma string";
        Object obj2 = 42;
        Object obj3 = 3.14;

        System.out.println("Tipo de obj1: " + obj1.getClass().getSimpleName());
        System.out.println("Tipo de obj2: " + obj2.getClass().getSimpleName());
        System.out.println("Tipo de obj3: " + obj3.getClass().getSimpleName());
    }
}