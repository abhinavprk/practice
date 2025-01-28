package abhi.practice.immutable;

public class MainClass {
    public static void main(String[] args) {

        String brand = "Mercedes";
        Owner owner = new Owner("Abhinav", "Delhi");

        Car merc = new Car(brand, 1967, owner, new int[]{});
        System.out.println(merc);
        owner.setCity("Bettiah");
        System.out.println(merc);

    }

}
