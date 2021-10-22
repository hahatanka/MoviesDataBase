import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


    public class DBHandler {

        String connectionUrl = "jdbc:mysql://localhost:3306/MOVIE";
        String user = "root";
        String pass = "butjka12";

        private static Connection connection;

}

//     /       String query = "CREATE TABLE products1" +
//                    "(id int primary key auto_increment," +
//                    "name varchar(30) NOT NULL," +
//                    "price float NOT NULL," +
//                    "quantity int NOT NULL," +
//                    "description varchar(50))";
//
//            PreparedStatement statement = connection.prepareStatement(query);
//            statement.execute();
//
//            String query2 = "SELECT *FROM shop.products;";
//            PreparedStatement statement1 = connection.prepareStatement(query2);
//            statement.execute();
//