package xyz.ivyxjc.dao.impl;


import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import xyz.ivyxjc.bean.BaseGuid;
import xyz.ivyxjc.dao.AbstractDao;
import xyz.ivyxjc.dao.BaseGuidDao;
import xyz.ivyxjc.utils.ComponentUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseGuidDaoImpl extends AbstractDao implements BaseGuidDao {

    private String queryByGuid = "SELECT * FROM ivy_meta.ivyxjc_data";

    @Override
    public BaseGuid getBaseGuidByGuid(String guid) {
        mJdbcTemplate.execute(queryByGuid);
        try {
            return mJdbcTemplate.queryForObject(queryByGuid, new BaseGuidMapper());
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    protected class BaseGuidMapper implements RowMapper<BaseGuid> {
        @Override
        public BaseGuid mapRow(ResultSet rs, int rowNum) throws SQLException {
            BaseGuid baseGuid = new BaseGuid();
            baseGuid.setGuid(rs.getString("GUID"));
            ComponentUtil.setBaseFields(baseGuid, rs);
            return baseGuid;
        }
    }
}
