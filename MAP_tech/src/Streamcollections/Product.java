package Streamcollections;

public class Product {
	private int productid;
	private String productname;
	public Product(int productid, String productname, double price) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.price = price;
	}
	public Product()
	{
		
	}
	private double price;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}