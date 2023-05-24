package dao;

import db.DBConnection;
import model.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;

public interface CustomerDAO {
    public ArrayList<CustomerDTO> getAllCustomer() throws SQLException, ClassNotFoundException;

    public void saveCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException;
    public void updateCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException;

    public void deleteCustomer(String id) throws SQLException, ClassNotFoundException;

    public boolean existCustomer(String id) throws SQLException, ClassNotFoundException;

    public ResultSet allCustomerIds() throws SQLException, ClassNotFoundException;

    public ResultSet customerId() throws SQLException, ClassNotFoundException;
}
