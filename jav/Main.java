package java3;

public class Main {
    public static void main(String[] args) {
        Person student = new Person("Bingham", "Fori", "12345", "0049");
        Person staff = new Person("bingham", "Barka", "fastNFurious", 0);
        Physics calc = new Physics();
        System.out.println(calc.calcVel(50, 10));
        System.out.println(calc.calcVel(7, 15, 2));
        // System.out.println(student);
        // System.out.println(person.getName());
    }
}