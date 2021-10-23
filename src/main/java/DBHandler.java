import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DBHandler {

    public static void main(String[] args) {
        String connectionUrl = "jdbc:mysql://localhost:3306/MOVIE";
        String user = "root";
        String pass = "";

        Connection connection;

            try {
                connection = DriverManager.getConnection(connectionUrl, user, pass);
                String query = "CREATE TABLE movies (id INT primary key auto_increment," +
                        "title VARCHAR(255) NOT NULL," +
                        "genre VARCHAR (255) NOT NULL," +
                        "yearOfRelease INT NOT NULL)";

                PreparedStatement statement = connection.prepareStatement(query);
                statement.execute();

                System.out.println("Connection successful");
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Error connecting to database");
            }
        }



}

//          String query = "CREATE TABLE products1" +
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

//create a table MOVIES with columns: id of type INTEGER AUTO INCREMENT,title of type VARCHAR (255), genre of type VARCHAR (255),yearOfRelease of type INTEGER. Note that a table named MOVIE may already exist. In that case, delete it.
//add any three records to the MOVIES table