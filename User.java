package PhoneProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class User {
	Connection con;
	public Connection connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=j2ee&password=root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	public static void main(String[] args) {
		String searchqry="Select * FROM phone.contacts where Name=?";
		Scanner in=new Scanner(System.in);
		 Connection con=null;
	     PreparedStatement fetch=null;
	     PreparedStatement search=null;
	     ResultSet rs=null;

	     
		try {
			//load and register the Driver
			
			System.out.println("welcome to Phone");
			System.out.println("Press 1 to Show all contacts\r\n"
					+ "Press 2 to Search for contact (using name)\r\n"
					+ "Press 3 to Operate on contact\r\n"
					+ "");
			int oper1=in.nextInt();
			switch (oper1) {
			case 1: {
				fetch=con.prepareStatement("SELECT * FROM phone.contacts");
				 rs= fetch.executeQuery();
				//get data from cursor and Buffer memory...
				 if(rs.next()) {
				do {	
						String Name=rs.getString(1);
						int Number=rs.getInt(2);
					    String Group=rs.getString(3);
					  System.out.println(Name+" "+Number+" "+Group);
				}while(rs.next());
				System.out.println("data printed");
				}else {
					System.out.println("data not present");
				}
				
			}
			case 2:{
				System.out.println("wanna to serach \n yes or no");
				String cheak=in.next();
				if(cheak.equalsIgnoreCase("yes")) {
				System.out.println("serch for a Name");
				System.out.println("==>");
				String name=in.next();
				search=con.prepareStatement(searchqry);
				search.setString(1,name);
				rs=search.executeQuery();
				 if(rs.next()) {
			           do{	
							String Name=rs.getString(1);
							int Number=rs.getInt(2);
							String Group=rs.getString(3);
						    System.out.println(Name+" "+Number+" "+Group);
						}while(rs.next());
						System.out.println("data printed");
						}else {
							System.out.println("data not present");
						}
				}else {
					System.out.println("thank you!!");
				}
				break;
			}
			case 3:{
				
				
				
				
				
			}
			
			
			
			
			default:
   		         	throw new IllegalArgumentException("Unexpected value: " + oper1);
			}
			

		} catch (SQLException e) {
			e.printStackTrace();
		}  

	}

}
