import java.sql.*;
public class JDBCDemo extends RuntimeException  {

	public static void main(String[] args) throws Exception  {
		
		// TODO Auto-generated method stub
        
		//insertRecords();
		//readRecords();
		insertVar();
		
	
	}
	   public static void   readRecords() throws Exception {
			String url ="jdbc:mysql://localhost:3306/jdbcdemo";
			String userName="root";
			String passWord="root@123";
			String query="select * from employee";
	        Connection con=DriverManager.getConnection(url,userName,passWord);	
	        Statement st = con.createStatement();
	        ResultSet rs=st.executeQuery(query);
	      
	        
	        while(rs.next()) {
	        System.out.println("Id is " + rs.getInt(1));
	        System.out.println("Name is " + rs.getString(2));
	        System.out.println("salary is " + rs.getInt(3));
	        }
	        con.close();
			
			
		}
	   // Insert Records 
	   public static void   insertRecords() throws Exception {
			String url ="jdbc:mysql://localhost:3306/jdbcdemo";
			String userName="root";
			String passWord="root@123";
			String query="insert into employee values(4,'kanika',50000)";
	        Connection con=DriverManager.getConnection(url,userName,passWord);	
	        Statement st = con.createStatement();
	        int rows =st.executeUpdate(query);
	      
	        System.out.println("Number of rows affected: " + rows);
	       
	        con.close();
			
			
		} 
	   // Insert with Variables
	   
	   public static void   insertVar() throws Exception {
				String url ="jdbc:mysql://localhost:3306/jdbcdemo";
				String userName="root";
				String passWord="root@123";
                int id= 5;
                String name="varun";
                int salary=10000;

                String query="insert into employee values(?,?,?)";
		        
                Connection con=DriverManager.getConnection(url,userName,passWord);	
		        
                PreparedStatement pst=con.prepareStatement(query);
		        
		        pst.setInt(1,id);
		        pst.setString(2,userName);
		        con.close();
		      
		       
				
				
			}

}
