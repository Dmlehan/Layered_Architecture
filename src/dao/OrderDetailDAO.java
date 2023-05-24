package dao;

import model.OrderDetailDTO;

import java.sql.SQLException;
import java.util.List;

public interface OrderDetailDAO {
    public boolean saveOrderDetail(String orderId, List<OrderDetailDTO> orderDetails) throws SQLException;
}
