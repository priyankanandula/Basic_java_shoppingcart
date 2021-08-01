import java.util.ArrayList;
import java.util.List;

public class InventoryStore implements InventoryServices {

	List<MobileProduct> mobilesList;
	
	
	@Override
	public void addProduct(List<MobileProduct>  mobileProducts) {
		this.mobilesList=mobileProducts;
		}


	@Override
	public List<MobileProduct> getProducts() {
		// TODO Auto-generated method stub
		return this.mobilesList;
	}
	

}
