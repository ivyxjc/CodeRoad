package xyz.ivyxjc.spring.db.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Ivyxjc
 * @since 4/22/2018
 */
@Entity
@Data
@Slf4j
@Table(name = "movie_detail")
public class MovieDetail {
    @Id
    @Column(name = "movie_id")
    private Integer movieId;
    @Column(name = "movie_Name")
    private String movieNa;
    @Column(name = "movie_rating")
    private String movieRating;
    @Column(name = "movie_rating_people_num")
    private Integer movieRatingPeopleNum;
    @Column(name = "rating_5")
    private String rating5;
    @Column(name = "rating_4")
    private String rating4;
    @Column(name = "rating_3")
    private String rating3;
    @Column(name = "rating_2")
    private String rating2;
    @Column(name = "rating_1")
    private String rating1;
    @Column(name = "movie_imdb_id")
    private String movieImdbId;
    @Column(name = "movie_length")
    private String movieLenght;
}
