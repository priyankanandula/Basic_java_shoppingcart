import java.util.List;

public interface InventoryServices {

	public void addProduct(List<MobileProduct>  mobileProduct);
	public List<MobileProduct> getProducts();
}
