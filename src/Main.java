import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		ShoppingCart Cart = new ShoppingCart();
		Scanner scanner = new Scanner(System.in);
		int choice;
		do {
			System.out.println("SHOPPING CART BY RoryDev");
			System.out.println("_____________________________");
			System.out.println("Menu:");
			System.out.println("1.Add Item");
			System.out.println("2.Remove Item");
			System.out.println("3.Total Price");
			System.out.println("4.Number of Items");
			System.out.println("5.List Of Items");
			System.out.println("6.Exit");
			System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Cart.addItem();
                    break;
                case 2:
                    Cart.removeItem();
                    break;
                case 3:
                    System.out.println("Total Price : "+Cart.totalPrice());
                    break;
                case 4:
                	System.out.println("Number of Items : "+Cart.itemCount());
                    break;
                case 5:
                    Cart.itemsList();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
		}while(choice != 6);
		scanner.close();
		System.out.println("END.");
	}
}

