
import java.util.Vector;
import java.util.Scanner;

public class ShoppingCart {
	private Vector<Item> items;
	private int counter = 0;
	private char choice;
	private Scanner scanner = new Scanner(System.in);

	public ShoppingCart() {
		items = new Vector<Item>();
	}
	public void itemsList() {
		for (int i = 0; i < items.size(); i++) {
			System.out.println(i + "." + items.get(i).toString());
		}
	}
	public void addItem() {
		do {
			System.out.print("Name: ");
			String name = scanner.next();
			System.out.print("Price: ");
			int price = scanner.nextInt();
			items.add(new Item(name, price));
			System.out.print("Add another item? (y/n): ");
			choice = scanner.next().charAt(0);
		} while (choice == 'y' || choice == 'Y');
	}

	public void removeItem() {
		itemsList();
		System.out.print("choice: ");
		int choice = scanner.nextInt();
		items.remove(items.get(choice-1));
	}

	public int itemCount() {
		return items.size();
	}

	public int totalPrice() {
		counter = 0;
		for (int i = 0; i < items.size(); i++)
			counter += items.get(i).getPrice();
		return counter;
	}

}

