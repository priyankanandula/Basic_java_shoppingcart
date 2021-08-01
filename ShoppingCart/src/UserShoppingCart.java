import java.util.ArrayList;
import java.util.List;

public class UserShoppingCart {
	
private List<MobileProduct> selectedItems;

public void addItem(MobileProduct mobileproduct) {
	if(this.selectedItems==null) {
		this.selectedItems=new ArrayList<>();
		this.selectedItems.add(mobileproduct);
	}
	else {
		this.selectedItems.add(mobileproduct);
	}
	
} 

public List<MobileProduct> getSelectedProducts(){
	
	return this.selectedItems;
}

public double getTotalCost() {
	
	double totalCost=0;
	
	if(!this.selectedItems.isEmpty()) {
		
		for(MobileProduct product:selectedItems) {
			
			totalCost=totalCost+product.getCost();
		}
	}
	return totalCost;
}
}
