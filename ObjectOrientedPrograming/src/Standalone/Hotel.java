package Standalone;
import java.util.ArrayList;
import java.util.Scanner;
class Bill{
	int itemid;
	int price;
	int quantity;
	int subtotal;
	String itemname;
	public Bill(int itemid, int price, int quantity, int subtotal,String itemname) {
		super();
		this.itemid = itemid;
		this.price = price;
		this.quantity = quantity;
		this.subtotal = subtotal;
		this.itemname = itemname;
	}
	@Override
	public String toString(){ 
		return itemid + "  "  + price+ "  " + quantity + "  " + subtotal + "  "  + itemname;
	}
	
}
public class Hotel {
	public static void main(String[] args) {
		String itemName = null;
		int id = 0;
		int price = 0;
		int Quantity = 0;
		int total = 1;
		int grandtotal= 0;
		String Choice = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to hotel");
		System.out.println("Please Enter Your Name dear Customer");
		String name = scan.nextLine();
		System.out.println("Dear " + name + " Here is the Menu");
		ArrayList <Bill> al = new ArrayList<Bill>();
		do {
			System.out.println("-----------------------------------------------------");
			System.out.println("Item id      Name            Price");
			System.out.println("1           water            10");
			System.out.println("2           Pepsi            30");
			System.out.println("3           Pizza            120");
			System.out.println("4           Burger            100");
			System.out.println("-----------------------------------------------------");
			System.out.println("Enter the Id you want");
			id = scan.nextInt();
			System.out.println("Enter the Quantity you want");
			Quantity = scan.nextInt();
			switch(id) {
			case 1:
				itemName = "water";
				price = 10;
				total = Quantity*price;
				break;
			case 2:
				itemName = "Pepsi";
				price = 30;
				total = Quantity*price;
				break;
			case 3:
				itemName = "Pizza";
				price = 120;
				total = Quantity*price;
				break;
			case 4:
				itemName = "Burger";
				price = 100;
				total = Quantity*price;
				break;
			default:
				System.out.println("Please Enter the id between 1 to 4 only");
				break;
			}
			System.out.println("Your id is " + id + " Item name is " + itemName + " Total amount is " + total);
			al.add(new Bill(id,  price,  Quantity,  total,  itemName));
			grandtotal += total;
			System.out.println("Enter Y to Order More Items inthe kart");
			Choice = scan.next();
		}while(Choice.equalsIgnoreCase("y"));
		System.out.println("id  Price  Quantity total Name");
		for(Bill x: al) {
			System.out.println(x);
		}
		System.out.println( "The Total Amount You need to Pay is: " + grandtotal);
		System.out.println("THANK YOU HAVE A NICE DAY");
	}
}
