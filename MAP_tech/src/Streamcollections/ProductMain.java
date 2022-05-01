package Streamcollections;

import java.util.*;
import java.util.stream.Collectors;

public class ProductMain {
	List<Product> productlist;
	public ProductMain()
	{
		productlist=new ArrayList<Product>();
		productlist.add(new Product(101,"Laptop",60000));
		productlist.add(new Product(102,"Mouse",100000));
		productlist.add(new Product(103,"mac",80000));
		productlist.add(new Product(104,"Ipad",30000));
		
	}
	public void searchUsingStream()
	{
	List<Double> productpricelist=
			productlist.stream().filter(p->p.getPrice()>60000)
				.map(p->p.getPrice()).collect(Collectors.toList());//forEach(System.out::println);//(collect(Collectors.toList());
	System.out.println("Minimum price is "+productpricelist);
	//Collections.sort(productlist);
	}
	
	public void findMinimum()
	{
		Optional<Double> minimumvalue=
	productlist.stream().filter(p->p.getPrice()>30000).
	map(p->p.getPrice()).min(Double::compare);
		if(minimumvalue.isPresent())
		{
			System.out.println("Minimum value "+minimumvalue.get());
		}
	}
	
	
	public void sortData()
	{
		List<String> sortedlist=productlist.stream().
				sorted(Comparator.comparing(Product::getProductname))
				.map(p->p.getProductname()).collect(Collectors.toList());
		sortedlist.forEach(System.out::println);
	}
	
	public void findmax()
	{
		Optional<Product> maxbyprice=productlist.stream().max(Comparator.comparing(Product::getPrice));
		if(maxbyprice.isPresent())
		{
			Product p=maxbyprice.get();
			System.out.println("Product name "+p.getProductname());
		}
	}
	
	
	public void search()
	{
		for(Product p:productlist)
		{
			if(p.getPrice()>30000)
			{
				System.out.println("Eligible product");
			}
		}
	}
	public static void main(String[] args) {
		ProductMain prmain=new ProductMain();
		prmain.search();
		prmain.searchUsingStream();
	
	}

}