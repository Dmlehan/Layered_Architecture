package dao;

import db.DBConnection;
import model.ItemDTO;

import java.sql.*;

public interface ItemDAO {
    public ResultSet getAllItems() throws SQLException, ClassNotFoundException;

    public void deleteItem(String code) throws SQLException, ClassNotFoundException;

    public void saveItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException;

    public boolean updateItem(ItemDTO itemDTO);

    public boolean existItem(String code) throws SQLException, ClassNotFoundException;

    public ResultSet allItemIds() throws SQLException, ClassNotFoundException;

    public ResultSet findItem(String code) throws SQLException, ClassNotFoundException;

    public String generateNewCode() throws SQLException, ClassNotFoundException;

    public ItemDTO searchItem(String itemCode);
}
