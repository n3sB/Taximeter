import java.util.Scanner;

public class Taximeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int km, openingFee = 10;
        double totalCost, perKm = 2.20;

        System.out.print("Please enter the distance:(km) ");
        km = scanner.nextInt();
        scanner.close();

        totalCost = openingFee + (km * perKm);

        totalCost = (totalCost < 20) ? 20 : totalCost;

        System.out.println("Total cost is " + totalCost);

    }
}
