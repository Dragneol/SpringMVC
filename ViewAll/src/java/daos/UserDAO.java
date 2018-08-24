/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import dtos.UserDTO;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utls.DBUtl;

/**
 *
 * @author DuongPTHSE62871
 */
public class UserDAO implements Serializable {

    private Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    private void closeConnection() throws SQLException {
        if (resultSet != null) {
            resultSet.close();
        }
        if (preparedStatement != null) {
            preparedStatement.close();
        }
        if (connection != null) {
            connection.close();
        }
    }

    public List<UserDTO> getUsers() throws SQLException, ClassNotFoundException {
        List<UserDTO> list = new ArrayList<>();
        UserDTO dto = null;
        String user, pass, fName, lName, mName;
        try {
            connection = DBUtl.getConnection();
            if (connection != null) {
                String sql = "Select * from Member";
                preparedStatement = connection.prepareStatement(sql);
                resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    user = resultSet.getString("Username");
                    pass = resultSet.getString("Password");
                    fName = resultSet.getString("FirstName");
                    lName = resultSet.getString("LastName");
                    mName = resultSet.getString("MiddleName");
                    
                    dto = new UserDTO(user, pass, fName, lName, mName);
                    list.add(dto);
                }
            }
        } finally {
            closeConnection();
        }
        return list;
    }
}
