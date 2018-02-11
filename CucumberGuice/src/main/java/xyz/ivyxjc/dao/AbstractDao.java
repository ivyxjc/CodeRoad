package xyz.ivyxjc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.inject.Inject;

public abstract class AbstractDao {

    @Inject
    protected JdbcTemplate mJdbcTemplate;

    public AbstractDao() {
    }


}
