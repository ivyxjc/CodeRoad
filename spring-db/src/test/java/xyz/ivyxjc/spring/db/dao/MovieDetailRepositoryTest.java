package xyz.ivyxjc.spring.db.dao;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import xyz.ivyxjc.spring.db.bean.MovieDetail;
import xyz.ivyxjc.spring.db.config.DatabaseConfig;
import xyz.ivyxjc.spring.db.config.TestDataSourceConfig;

/**
 * @author Ivyxjc
 * @since 4/22/2018
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {DatabaseConfig.class, TestDataSourceConfig.class})
public class MovieDetailRepositoryTest {
    @Autowired
    private MovieDetailRepository mMovieDetailRepository;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Before
    public void setup() {
        String createSql = MovieDetailRepositoryTest.class.getClassLoader()
            .getResource("init_sql/CREATE_MOVIE_DETAIL.sql")
            .toString();
        String initData = MovieDetailRepositoryTest.class.getClassLoader()
            .getResource("init_sql/MOVIE_DETAIL_INIT_DATA.sql")
            .toString();
        jdbcTemplate.execute("drop all objects;");
        jdbcTemplate.execute("runscript from '" + createSql + " '");
        jdbcTemplate.execute("runscript from '" + initData + " '");
    }

    @Test
    public void doFind() {
        long startTime = System.currentTimeMillis();
        MovieDetail movieDetail = mMovieDetailRepository.getByMovieId(1291543);
        Assert.assertNotNull(movieDetail);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
