package main.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import main.java.model.Fridge; // to od Agi?
import main.java.util.DbUtil;
/*
 Klasa umożliwiająca operacje na danych zawartych w tabeli Fridge
 
 Created by Lemur z o.o.
 */

/*
 BRAKUJE W KLASIE PRODUCT.JAVA:
 	- getProductID
 	- setProductID
 */

// połączenie z bazą danych
public class FridgeDao {

	private Connection connection;
	
	public FridgeDao() {
		connection = DbUtil.getConnection();
	}

/*dodawanie produktu do lodówki
 
  Atrybuty: nazwa składnika (varchar) - ProductName 
			ilość (int) - ProductAmount

Użytkownik wprowadza posiadane pokarmy wraz z ich ilością.
 
 */
	public void addProduct(Fridge fridge) {
		
		try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into fridge(ProductName,ProductAmount, UserID) values (?, ?, ? )");
            preparedStatement.setString(1, fridge.getName());
            preparedStatement.setInt(2, fridge.getAmount());
            preparedStatement.setInt(3, fridge.getUserID());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
	
/*
 usunięcie produktu z lodówki
 */
	public void deleteProduct(int productID){
		
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from fridge where ProductID=?");
            preparedStatement.setInt(1, productID);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
	
/*
 uaktualnienie danych nt. produktu w lodówce
 */
	public void updateFridge(Fridge fridge){
		try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update fridge set ProductName=?, ProductAmount=?" +
                            "where ProductID=?");
            preparedStatement.setString(1, fridge.getName());
            preparedStatement.setInt(2, fridge.getAmount());
            preparedStatement.setInt(3, fridge.getProductID());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
	}

/*
 wyświetlenie zawartości lodówki w formie listy
*/
	public List<Fridge> getAllProducts(){
		List<Fridge> products = new ArrayList<Fridge>();
		
		try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from fridge");
            while (rs.next()) {
            	//wypełnianie listy
                Fridge product = new Fridge();
                product.setProductID(rs.getInt("ProductID"));
                product.setName(rs.getString("ProductName"));
                product.setAmount(rs.getInt("ProductAmount"));
                product.setUserID(rs.getInt("UserID"));
                products.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return products;
	}
	
/*
 wyświetlenie jednego produktu na podstawie ID	
 */
	public Fridge getProductById(int ProductID){
		Fridge product = new Fridge();
		
		try {
            PreparedStatement preparedStatement = connection.
                    prepareStatement("select * from fridge where ProductID=?");
            preparedStatement.setInt(1, ProductID);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                product.setProductID(rs.getInt("ProductID"));
                product.setName(rs.getString("ProductName"));
                product.setAmount(rs.getInt("ProductAmount"));
                product.setUserID(rs.getInt("UserID"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return product;
    }
}
