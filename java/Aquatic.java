package Java2;

public class Aquatic extends Animal {
    @Override
    String move() {
        // TODO Auto-generated method stub
        return "moves by swimming";
    }

    public static void main(String[] args) {
        Aquatic fish = new Aquatic();
        fish.name = "Shark";
        System.out.println("\n" + fish.name + " " + fish.move());
    }
}
