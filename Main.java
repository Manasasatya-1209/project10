package controller;
import java.sql.SQLException;
import java.util.Scanner;

import dao.LoginDAO;
import dao.ProductDAO;
import model.Login;
import model.Product;
public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
     int choice,option;
     Login l=new Login();
     LoginDAO ldao=new LoginDAO();
     Product p=new Product();
     ProductDAO pdao=new ProductDAO();
	 do
	 {
		System.out.println("1.Admin");
		System.out.println("2.Agent");
		System.out.println("3.Exit");
		System.out.println("************************************************************************************************");
		System.out.println("Enter your choice:");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Admin Login");
			System.out.println("Enter The User name");
			String uname=sc.next();
			System.out.println("Enter The Password");
			String pass=sc.next();
			l.setUsername(uname);
			l.setPassword(pass);
			if(ldao.checkCredential(l))
			{
				System.out.println("Login sucessful****");
			  
			  do
			  {
				  System.out.println("1.Add Product \n2.Display Product \n 3.Logout" );
				  option=sc.nextInt();
				  switch(option)
				  {
				  
						case 1:System.out.println("Add Product");
						System.out.println("Enter the productId");
						int prod_id = sc.nextInt();
						sc.nextLine();
						System.out.println("Enter the productName");
						String prod_name = sc.nextLine();
						System.out.println("Enter the minimum sell quantity");
						int minSellQuantity = sc.nextInt();
						System.out.println("Enter the quantity");
						int prod_quantity = sc.nextInt();
						System.out.println("Enter the price");
						int prod_price = sc.nextInt();
						p.setProd_id(prod_id);
						p.setProd_name(prod_name);
				        p.setMinSellQuantity(minSellQuantity);
				        p.setProd_quantity(prod_quantity);
				        p.setProd_price(prod_price);
				        pdao.addProduct(p);
						break;
						case 2:System.out.println("Display Product");
						pdao.display();
						break;
						case 3:System.out.println("Logout");
						break;

				  }
			  }while(option!=3);
			} 
			else
				System.out.println("OOPs!......Incorrect Username Or password1");
			break;
		case 2:
			System.out.println("Agent Login");
			System.out.println("Enter The User name");
			String uname1=sc.next();
			System.out.println("Enter The Password");
			String pass1=sc.next();
			l.setUsername(uname1);
			l.setPassword(pass1);
			if(ldao.checkCredential(l))
			{
				System.out.println("Login sucessful -+****");
			
			  do
			  {
				  System.out.println("1.Display Product \n2.Logout" );
				  option=sc.nextInt();
				  switch(option)
					{
						case 1:System.out.println("Display Product");
						pdao.display();
						break;
						case 2:System.out.println("Logout");
						break;
						case 3: System.out.println("Exit");
						break;
					}
					
				}while(option!=2);
			}
			else
			{
				System.out.println("Incorrect Username/Password");
			}
			break;
			case 3: System.out.println("Exit");
			break;
		}
	}while(choice!=3);
	 sc.close();
	}

	

}

				