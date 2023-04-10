package Programs;

import java.util.Arrays;
import java.util.*;

public class Pizza {
	public static void main(String args[]) {
	
	LinkedList<String> l=new LinkedList<>(Arrays.asList("abc","def","xyz"));
	Items obj1=new Items("stuffed",false,l);
	LinkedList<String> l1=new LinkedList<>(Arrays.asList("cba","fed","zyx"));
	Items obj2=new Items("stuffed",true,l1);
	List<Items> item=new ArrayList<>();
	item.add(obj1);
	item.add(obj2);
	for(int i=0;i<item.size();i++)
	{
		if(item.get(i).isCheese()==true)
		{
			System.out.println(item.get(i).getBase()+" "+item.get(i).getToppings());
			
		}
	}
	


}}

class Items{
	
	String base;
	boolean cheese;
	LinkedList<String> toppings;
	public Items(String base, boolean cheese, LinkedList<String> toppings) {
		this.base = base;
		this.cheese = cheese;
		this.toppings = toppings;
	}
	public String getBase() {
		return base;
	}
	public boolean isCheese() {
		return cheese;
	}
	public LinkedList<String> getToppings() {
		return toppings;
	}
	
	
	
}