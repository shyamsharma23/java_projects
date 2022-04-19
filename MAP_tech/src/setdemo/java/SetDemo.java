package setdemo.java;
import java.util.*;
public class SetDemo {
	private Set<String> setdemo;
	private Scanner sc;
	public SetDemo()
	{
		sc=new Scanner(System.in);
		setdemo=new HashSet<String>();
	}
	public void addData()
	{
		setdemo.add("first");
		setdemo.add("two");
		setdemo.add("three");
		setdemo.add("two");
		setdemo.add("five");
		setdemo.add("first");
		for(String s:setdemo)
		{
			System.out.println("Values are "+s);
		}
	}
	public static void main(String[] args) {
		SetDemo sdemo=new SetDemo();
		sdemo.addData();
	}

}
