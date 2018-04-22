package xyz.ivyxjc.spring.db.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import xyz.ivyxjc.spring.db.bean.MovieDetail;
import xyz.ivyxjc.spring.db.config.DatabaseConfig;

/**
 * @author Ivyxjc
 * @since 4/22/2018
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {DatabaseConfig.class})
public class MovieDetailRepositoryTest {
    @Autowired
    private MovieDetailRepository mMovieDetailRepository;

    @Test
    public void doFind() {
        long startTime = System.currentTimeMillis();
        MovieDetail movieDetail = mMovieDetailRepository.getByMovieId(1292052);
        Assert.assertNotNull(movieDetail);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
