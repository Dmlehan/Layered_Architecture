package dao;

import db.DBConnection;

import java.sql.*;
import java.time.LocalDate;

public interface OrderDAO {
    public ResultSet getAllOrders() throws SQLException, ClassNotFoundException;

    public boolean selectOrderId(String orderId);

    public boolean saveOrder(String orderId, LocalDate orderDate, String customerId) throws SQLException;
}
