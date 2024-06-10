package Java2;


public class LandAnimal extends Animal {
    @Override
    String move() {
        // TODO Auto-generated method stub
        return "swings on trees";
    }

    public static void main(String[] args) {
        LandAnimal lion = new LandAnimal();
        LandAnimal monkey = new LandAnimal();
        lion.name =  "jude";
        monkey.move();
        System.out.println(lion.name);
        System.out.println(monkey.move());
    }
    
}