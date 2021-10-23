import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DBHandler {

    public static void main(String[] args) {
        String connectionUrl = "jdbc:mysql://localhost:3306/shop";
        String user = "root";
        String pass = "";

        Connection connection;

            try {
                connection = DriverManager.getConnection(connectionUrl, user, pass);
//                String query = "CREATE TABLE movies (id INT primary key auto_increment," +
//                        "title VARCHAR(255) NOT NULL," +
//                        "genre VARCHAR (255) NOT NULL," +
//                        "yearOfRelease INT NOT NULL)";
//
//                PreparedStatement statement = connection.prepareStatement(query);
//                statement.execute();
//                statement.close();

//                String query1 = "INSERT INTO movies(title, genre, yearOfRelease) VALUES(?,?,?)";
//                PreparedStatement statement1 = connection.prepareStatement(query1);
//                statement1.setString(1, "Matrix");
//                statement1.setString(2, "SciFi");
//                statement1.setInt(3, 1999);
//
//                statement1.execute();
//                statement1.close();

//                String query2 = "INSERT INTO movies(title, genre, yearOfRelease) VALUES('Titanic', 'Drama', 1997)";
//                PreparedStatement statement2 = connection.prepareStatement(query2);
//                statement2.execute();
//                statement2.close();
//
//                String query3 = "INSERT INTO movies(title, genre, yearOfRelease) VALUES('Parasite', 'Comedy', 2019)";
//                PreparedStatement statement3 = connection.prepareStatement(query3);
//                statement3.execute();
//                statement3.close();

                System.out.println("Connection successful");

            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Error connecting to database");
            }
        }




}


