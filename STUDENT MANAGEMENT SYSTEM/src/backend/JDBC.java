
package backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


 public class JDBC {
     private Connection connection;
     private Statement statemnt;
     private String url="jdbc:mysql://localhost:3306/student";
     private String user="root";
     private String password="";
     
 
     public void connect(){
         try {
            
            Class.forName("com.mysql.jdbc.Driver");
            connection=DriverManager.getConnection(url, user, password);
            Statement statemnt=connection.createStatement();
            System.out.println("connection succesfull.");
            
        } catch (Exception ex) {
            System.out.println("Connection faild.");
        }
     };
     
     public void push() throws SQLException{
         String quary="INSERT INTO student( `id`,`name` , `address` , `mobile` )VALUES (1,\"Soumadip Dey\", \"Antira,Uchalan,Burdwan\", \"8768454982\");";
          statemnt=connection.createStatement();
         statemnt.executeUpdate(quary);
         System.out.println("successfully inserted.");
         
         
     };
     
     public void pop() throws SQLException{
         String quary="SELECT *FROM `student`";
         ResultSet resultSet=statemnt.executeQuery(quary);
         while(resultSet.next()){
             System.out.println("ID: "+resultSet.getInt(1)+"\nName:"+resultSet.getString(2)+"\nAddress:"+resultSet.getString(3)+"\nMobile:"+resultSet.getString(4));
             
         }
         
         
     };
     public void load(){
         
     };
     public void deleteAll(){
         
     };
    
     
     public static void main(String[] args) throws SQLException {
         JDBC jdbc=new JDBC();
         jdbc.connect();
         jdbc.push();
         jdbc.pop();
         
     }
     
}
