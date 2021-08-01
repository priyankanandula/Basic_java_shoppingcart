import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Data {

	public static List<MobileProduct> getMobileData(){
		List<MobileProduct> list=new ArrayList<>();
		MobileProduct iphone=new MobileProduct(101,"IphoneXr",45000,LocalDate.of(2017, 1, 13));
		MobileProduct samsung=new MobileProduct(102,"Samsung Galaxy",35000,LocalDate.of(2018, 2, 20));
		MobileProduct onePLus=new MobileProduct(103,"OnePlus",30000,LocalDate.of(2019, 2, 7));
		MobileProduct vivo=new MobileProduct(104,"Vivo",15000,LocalDate.of(2016, 7, 25));
		list.add(iphone);
		list.add(samsung);
		list.add(onePLus);
		list.add(vivo);
		
		return list;
	}
}
