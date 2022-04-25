package Hashmap;

import java.util.HashMap;
import java.util.Map.Entry;


public class Customer 
{
	//private Object 1;

	public static void Hash()
	{

		HashMap<Integer, String> m=new HashMap<>();

		m.put(1, "Raj");
		m.put(2, "Ajay");
		m.put(3, "Sujay");
		m.put(4, "Vijay");

		System.out.println("Hashmap Elements:");
		for(Entry<Integer, String> map:m.entrySet())
		{
			System.out.println(map.getKey()+" "+map.getValue());
		}

		System.out.println("To check the key present or not:");
		if (m.containsKey(1))
		{
			System.out.println("Present");
		}
		else
		{
			System.out.println("Not present");
		}


		//To check customer is present or not
		System.out.println("To check the customer present or not:");
		if(m.containsValue("Seema"))
		{
			System.out.println("Present");
		}
		else
		{
			System.out.println("Not present");
		}

		//To remove all elements in hashmap
		System.out.println("Empty Hashmap:");
		m.clear();

		System.out.println(m);


	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer c=new Customer();
		c.Hash();
	}
}



