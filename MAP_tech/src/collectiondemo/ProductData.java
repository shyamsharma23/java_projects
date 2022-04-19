package collectiondemo;
import java.util.*;
public class ProductData {
	private Scanner sc;
	private List<Product> productlist;
	public ProductData()
	{
		sc=new Scanner(System.in);
		productlist=new ArrayList<Product>(); //declaring the array list of Product class
		
		
	}
	public void insertDetails()
	{
		System.out.println("Enter no of products u want to to enter");
		int noofproduct=sc.nextInt();
		for(int x=1;x<=noofproduct;x++)
		{
			Product p=new Product();
			System.out.println("Enter product id ");
			p.setProductid(sc.nextInt());
			System.out.println("Enter product name ");
			p.setProductname(sc.next());
			System.out.println("Enter Price ");
			p.setPrice(sc.nextDouble());
			productlist.add(p);
		}
		
	}
	public void updateDetails()
	{
		System.out.println("Enter the product id you want to update");
		int productid = sc.nextInt();
		System.out.println("Enter the updated product name");

		String name = sc.next();
		System.out.println("Enter the updated product price");
		double price = sc.nextDouble();
		for(Product p:productlist) {
			if(p.getProductid()==productid) {
				
				p.setPrice(price);
				p.setProductname(name);
				
			}
			System.out.println("After updating ");
			System.out.println("Product name "+p.getProductname());
		}
		
	}
	public void removeDetails() {
		System.out.println("Enter product iD WHICH U WANT TO REMOVE");
		int productid=sc.nextInt();
		for(Product p:productlist)
		{
			if(p.getProductid()==productid)
			{
				productlist.remove(p);
			}
		System.out.println("After removing ");
		System.out.println("Product name "+p.getProductname());
		}
		
	}
	public List<Product> getDetails()
	{
		return productlist;
	}
	public static void main(String[] args) {
		ProductData pdata=new ProductData();
		pdata.insertDetails();
		List<Product> plist=pdata.getDetails();
		for(Product p1:plist)
		{
			System.out.println("Product name is "+p1.getProductname());
		}
		pdata.updateDetails();
		
	}
	

}