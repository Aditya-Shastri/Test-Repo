package samplePakage;

import java.util.ArrayList;
import java.util.Scanner;

public class Item_Names {
		
	public void DisplayItems(ArrayList<String>Itm) {
				
		for(String s :Itm) {
			
			System.out.print(" " + s + " : ");
		}
		
		System.out.println();
		System.out.println("============================================================================================");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare the Object for the class :
		
		Item_Names accessobj =new Item_Names();
			
		//Declare the ArrayList for items names
		
		ArrayList<String> Item_Name = new ArrayList<String>();

		Item_Name.add("Grains");Item_Name.add("SurfExcle");Item_Name.add("Chocolate");Item_Name.add("Bathing Soap");Item_Name.add("Sugar");

		Item_Name.add("Maggie");
		
		//Declare the ArrayList for items Price
		
		ArrayList<Float> Item_Price = new ArrayList<Float>();
		
		
		
		
		
		
		
		
		///*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/
		
		System.out.println("We have following product Range :");
		
		System.out.println();

		accessobj.DisplayItems(Item_Name);  //calling the display function item names
		
		
	//Add the Items in the list
		
		Scanner str =new Scanner(System.in);
		
		System.out.println("Enter the Number of items you wanted to add");
		
		int number = str.nextInt();
				
		System.out.println("Enter the Items to be added in the List :");
		
		for(int i = 0 ; i <= number ; i++)	{
		   
		Item_Name.add(str.nextLine());
		
		
		}
		
		//Display the Added Items in the List
		
		System.out.println(".......Click on submit ");
		System.out.println("Items has been updated ......");
		
		accessobj.DisplayItems(Item_Name);
		
		
		//Delete the Item or Items from the list
		
		System.out.println("Enter Index of Item You want to delete / remove from the Store list :");
		System.out.println("====================******========================================");
			
		Item_Name.remove(str.nextInt());

		
		//System.out.println("Item has been Removed at :"  +str.nextInt());
		
		System.out.println("Do you want to Remove more Iteam?");
		
		boolean condi = str.hasNext();
		
		System.out.println(condi);
		
		if(condi==true) {
			
			Scanner ptr =new Scanner(System.in);
			
			System.out.println("Enter Index of Item You want to delete / remove from the Store list :");
			
			int removeIteam =ptr.nextInt();
			
			Item_Name.remove(removeIteam);
			
			accessobj.DisplayItems(Item_Name);    
		}
		
		else {
			accessobj.DisplayItems(Item_Name);    
		}
		
		
	}

	
	
	
	
}
