import java.util.Scanner;

public class Currency_converter {
    public static void main(String[] args) {
        double usdToEuro = 0.85;
        double usdToYen = 110.0;
        double usdToYuan = 6.5;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount in USD: ");
        double usd = scanner.nextDouble();
        
        System.out.print("Enter the target currency (Euro, Yen, Yuan): ");
        String currency = scanner.next();
        
        double convertedAmount = 0;
        if (currency.equalsIgnoreCase("Euro")) {
            convertedAmount = usd * usdToEuro;
        } else if (currency.equalsIgnoreCase("Yen")) {
            convertedAmount = usd * usdToYen;
        } else if (currency.equalsIgnoreCase("Yuan")) {
            convertedAmount = usd * usdToYuan;
        } else {
            System.out.println("Invalid currency.");
            System.exit(0);
        }
        
        System.out.println("The converted amount is: " + convertedAmount + " " + currency);
    }
}