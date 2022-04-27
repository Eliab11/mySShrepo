import java.util.Scanner;
public class ShoppingCartManager {
	public static void main(String[] args) {
		Scanner scrn = new Scanner(System.in);
		System.out.println("Enter Customer's Name:");
		String CustomerName = scrn.nextLine();
		System.out.println("Enter Today's Date:");
		String currentDate = scrn.nextLine();
		System.out.println();
		System.out.printf("Customer Name: %s\n",CustomerName );
		System.out.printf("Today's Date: %s\n", currentDate);
		ShoppingCart cart = new ShoppingCart(CustomerName, currentDate);
				String str2 = "MENU\n" + 
	  "a - Add item to cart\n" +
	  "d - Remove item from cart\n" +
	  "c - Change item quantity\n" +
	  "i - Output items' descriptions\n" +
	  "o - Output shopping cart\n" +
	  "q - Quit\n" ;
		 System.out.println(str2);
		System.out.println();
	 printMenu( cart);
		 
   	}
	
	public static void printMenu(ShoppingCart cart) {
	Scanner scr = new Scanner(System.in);
	    System.out.println("Choose an option:");
		  char carac = scr.nextLine().trim().charAt(0);
		   while(carac != 'q'){
		   if(carac != 'a'&& carac != 'd' && carac  != 'c' && carac  != 'o' && carac  != 'i') {
		  System.out.println("Choose an option:");
		  carac = scr.next().trim().charAt(0);
		   }else{
	
		  executeMenu(carac, cart, scr);
		     //}
		 System.out.println("Choose an option:");
		  carac = scr.next().trim().charAt(0);
		   }
		     }	
	}
	
 public static void executeMenu(char ca, ShoppingCart  car, Scanner sc) {
		sc = new Scanner(System.in);		
		ItemToPurchase  item = new ItemToPurchase();
			String str1 = "MENU\n" + 
	  "a - Add item to cart\n" +
	  "d - Remove item from cart\n" +
	  "c - Change item quantity\n" +
	  "i - Output items' descriptions\n" +
	  "o - Output shopping cart\n" +
	  "q - Quit\n" ;
	 if(ca == 'a'){
		System.out.println("ADD ITEM TO CART");
		System.out.println("Enter the item name:");
		 item.setName(sc.nextLine());
		System.out.println("Enter the item description:");
		 item.setDescription(sc.nextLine());
		 System.out.println("Enter the item price:");
		  item.setPrice(sc.nextInt());
		 System.out.println("Enter the item quantity:");
		   item.setQuantity(sc.nextInt());
		    car.addItem(item);
		    System.out.println();
		   	System.out.println(str1);
	        }
	
	  if(ca =='d'){
		  System.out.println("REMOVE ITEM FROM CART");
		  System.out.println("Enter name of item to remove:");
		  String str = sc.nextLine();
		  car.removeItem(str);
		  	System.out.println(str1);
	    }
	  
	  if(ca == 'c') {
		  ItemToPurchase item1 = new ItemToPurchase();
		  System.out.println("CHANGE ITEM QUANTITY");
		  System.out.println("Enter the item name:");
		  item1.setName(sc.nextLine());
		  System.out.println("Enter the new quantity:");
		  item1.setQuantity(sc.nextInt());
		  car.modifyItem(item1);
		 	System.out.println(str1);  
	  }
	  
	  if(ca =='i') {
		  System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
		  car.printDescriptions();
		  	System.out.println(str1);
	      }
	  
	  if(ca == 'o') {
	     System.out.println();
		  System.out.println("OUTPUT SHOPPING CART");
		  car.printTotal();
		  System.out.println();
		 	System.out.println(str1);
		
	           }
	        }
	      }
      