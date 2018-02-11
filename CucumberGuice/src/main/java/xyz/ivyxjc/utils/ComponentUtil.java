package xyz.ivyxjc.utils;

import xyz.ivyxjc.bean.AbstractComponent;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ComponentUtil {

    public static void setBaseFields(AbstractComponent component, ResultSet resultSet) throws SQLException {
        component.setCreatedAt(resultSet.getDate("CREATED_AT").toLocalDate());
        component.setCreatedBy(resultSet.getString("CREATED_BY"));
        component.setCreatedAt(resultSet.getDate("UPDATED_AT").toLocalDate());
        component.setUpdatedBy(resultSet.getString("UPDATED_BY"));
    }
}
