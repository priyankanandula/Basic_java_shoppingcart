import java.util.Scanner;

public class MainApplication {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		InventoryStore store=new InventoryStore();
		
		store.addProduct(Data.getMobileData());
		
		UserShoppingCart  cart=new UserShoppingCart();
		
	
		
		
		System.out.println("Welcome To The Mobile Store");
		System.out.println("-----------------------------------------------");
		System.out.println("You can select any number of items from our Store");
		System.out.println("-----------------------------------------------");
		System.out.println("Product|"+" Code|"+" Cost|"+" Manufacture Date");
		System.out.println("-----------------------------------------------");
		for(MobileProduct product:store.getProducts()) {
			System.out.println(product.getName()+"| "+product.getProductCode()+"| "+product.getCost()+"| "+product.getManufacturDate().toString());
			
			
		}
		System.out.println("-----------------------------------------------");
		System.out.println("No of items You want : ");
		
		int no_of_items=sc.nextInt();
		for(int i=0;i<no_of_items;i++) {
			
			System.out.println("Enter Product Code you want from the list : ");
			System.out.println();
			int code=sc.nextInt();
			for(MobileProduct product:store.getProducts()) {
				
				if(product.getProductCode()==code) {
					
					cart.addItem(product);
				}
			}
			
		}
		
		System.out.println("-----------------------------------------------");
		
		System.out.println("Selected items & Total Cost");
		System.out.println("-----------------------------------------------");
		
		for(MobileProduct product:cart.getSelectedProducts()) {
			
			System.out.println(product.getName()+"| "+product.getProductCode()+"| "+product.getCost());
			
			
		}
		
		System.out.println("-----------------------------------------------");
		System.out.println("Total Cost    "+cart.getTotalCost());
	}
}
