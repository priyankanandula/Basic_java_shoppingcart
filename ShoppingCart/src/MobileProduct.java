import java.time.LocalDate;
import java.util.Date;

public class MobileProduct {
private int productCode;
private String name;
private double cost;
private LocalDate manufacturDate;
public MobileProduct(int productCode, String name, double cost, LocalDate manufacturDate) {
	super();
	this.productCode = productCode;
	this.name = name;
	this.cost = cost;
	this.manufacturDate = manufacturDate;
}
public int getProductCode() {
	return productCode;
}
public void setProductCode(int productCode) {
	this.productCode = productCode;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}
public LocalDate getManufacturDate() {
	return manufacturDate;
}
public void setManufacturDate(LocalDate manufacturDate) {
	this.manufacturDate = manufacturDate;
}


}
