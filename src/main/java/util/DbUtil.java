
/*

Klasa ta obs³uguje bazê danych po³¹czon¹ do serwera MySQL.  Dziêki tej klasie mo¿na odczytaæ  plik db.properties.

*/

package main.java.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbUtil {
    private static Connection connection = null;

    public static Connection getConnection() {
        if (connection != null)
            return connection;
        else {
            try {
                Properties prop = new Properties();

                InputStream inputStream = DbUtil.class.getClassLoader().getResourceAsStream("/db.properties");
                if(prop!= null) {
                    prop.load(inputStream);
                    String driver = prop.getProperty("driver");
                    String url = prop.getProperty("url");
                    String user = prop.getProperty("user");
                    String password = prop.getProperty("password");
                    Class.forName(driver).newInstance();
                    connection = DriverManager.getConnection(url, user, password);
                }
                /*Class.forName("com.mysql.jdbc.Driver").newInstance();
                connection =
                        DriverManager.getConnection("jdbc:mysql://mysql.agh.edu.pl/annasmo1",
                                "annasmo1","65WCzcub");*/
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            /*} catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();*/
            } catch (Exception e) {
                e.printStackTrace();
            }
            return connection;
        }

    }
}
