import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager. getConnection("jdbc:mysql://localhost:3306/DB_CABINET", "root", "");

        Statement stm = connection.createStatement();
      //  stm.executeUpdate("INSERT INTO PATIENTS(NOM, PRENOM, TEL, EMAIL)" +
        //        "VALUES('TAZI', 'AHMED', '06222', 'ABDOU@GMAIL.COM')");
        ResultSet rs = stm.executeQuery("select * from patients");
        while (rs.next()) {
            System.out.printf(rs.getLong(1)+" "+rs.getString(2)+" "+ rs.getString(3)+" "+rs.getString(4) +" " +rs.getString(5));

        }
        stm.close();
        connection.close();
    }
}