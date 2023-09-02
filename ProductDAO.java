package dao;

import java.sql.*;

import connectionmanager.ConnectionManager;
import model.Product;

public class ProductDAO {
    public void addProduct(Product p) throws ClassNotFoundException, SQLException
    {
    	ConnectionManager cm= new ConnectionManager();
    	Connection con=cm.establishConnection();
    	String que="insert into product(prod_id,prod_name,minSellQuantity,prod_quantity,prod_price) values(?,?,?,?,?)";
    	PreparedStatement ps=con.prepareStatement(que);
    	ps.setInt(1, p.getProd_id());
    	ps.setString(2, p.getProd_name());
    	ps.setInt(3, p.getMinSellQuantity());
    	ps.setInt(4, p.getProd_price());
    	ps.setInt(5, p.getProd_quantity());
    	ps.executeUpdate();
    	cm.closeConnection();
    }
    public void display() throws ClassNotFoundException, SQLException {
    	ConnectionManager cm= new ConnectionManager();
   	 Connection con=cm.establishConnection();
   	 //2. create statement
   	 Statement st= con.createStatement();
   	 //3.write and exceute query.
   	 ResultSet rt=st.executeQuery("select * from product");
   	 //4.print
   	 while(rt.next())
   	 {
   		 System.out.println(rt.getInt("prod_id")+"|"+rt.getString("prod_name")+ "|" + rt.getInt("minSellQuantity")+ "|" + rt.getInt("prod_price")+ "|" +rt.getInt("prod_quantity"));
   		 
   	 }
   	 cm.closeConnection();
    }
}
