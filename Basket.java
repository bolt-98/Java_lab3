package lab1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.time.LocalDate;
public class Basket {

	private ArrayList<Product>pdr;
	public Basket() {
		pdr = null;
	}
	public Basket(ArrayList<Product> p) {
		
		pdr = p;
	}
	
	public void setPdr(ArrayList<Product> pdr) {
		this.pdr = pdr;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pdr == null) ? 0 : pdr.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==this) {
			return true;
		}
		if(obj.getClass()!=this.getClass()) {
			return false;
		}
		Basket p =(Basket)obj;
		return (this.pdr==p.pdr);
	}
	public int func_Count() {
		int count = 0;
		for (int i=0; i<pdr.size(); i++) {
			for (int j=0; j<pdr.size(); i++)
			if (pdr.get(i).getName().compareTo(pdr.get(j).getName())!=0){
				count++;
			}
		}
		return count;
	}
	public  double Sum () {
		double common_sum=0;
		for (int i=0; i<pdr.size(); i++) {
			common_sum+=pdr.get(i).getPrice();
		}
		return common_sum;
	}
	/*********************************************************************************/
	
	public  ArrayList<Product> sort_Up_alphabet(){
		Collections.sort(pdr, new Comparator<Product>() {
			public int compare(Product t1, Product t2) {
				if (t1.getName().charAt(0)>t2.getName().charAt(0))
					return 1;
				else return -1;
			}
		});
		return pdr;
	}
	/*********************************************************************************/
	public  ArrayList<Product> sort_Down_price(){
		
		Collections.reverse(sort_Up_alphabet());
		return pdr;
	}
	/*********************************************************************************/
	
	public  ArrayList<Product> sort_Upprice(){
		Collections.sort(pdr, new Comparator<Product>() {
			public int compare(Product t1, Product t2) {
				if (t1.getPrice()>t2.getPrice())
					return -1;
				else return 1;
			}
		});
		return pdr;
	}
	/*********************************************************************************/
	public  ArrayList<Product> sort_Downprice(){
		
		Collections.reverse(sort_Upprice());
		return pdr;
	}
	public static void main(String[] args) {
		
		

	}

}
