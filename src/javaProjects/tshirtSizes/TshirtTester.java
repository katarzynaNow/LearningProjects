package javaProjects.tshirtSizes;

public class TshirtTester {
    public static void main(String[] args) {
        Tshirt tshirt = new Tshirt(TshirtSize.L, "Nike");
        System.out.println(tshirt);
        System.out.println("Chest width: " + tshirt.getSize().getChestWidth());
    }
}
