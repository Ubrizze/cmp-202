public class LandAnimal extends Animal {
    @Override
    String move() {
        return "Climbs rocks";
    }
    public static void main(String[] args) {
        LandAnimal lion = new LandAnimal();
        lion.name = "Simba";
        LandAnimal monkey = new LandAnimal();
        System.out.println(lion.move());
        System.out.println(monkey.move());
    }
}
