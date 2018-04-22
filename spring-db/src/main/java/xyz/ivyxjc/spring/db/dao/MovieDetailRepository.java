package xyz.ivyxjc.spring.db.dao;

import org.springframework.data.repository.CrudRepository;
import xyz.ivyxjc.spring.db.bean.MovieDetail;

/**
 * @author Ivyxjc
 * @since 4/22/2018
 */

public interface MovieDetailRepository extends CrudRepository<MovieDetail, Integer> {

    MovieDetail getByMovieId(Integer movieId);
}
