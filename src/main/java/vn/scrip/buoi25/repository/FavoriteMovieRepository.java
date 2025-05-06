package vn.scrip.buoi26.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.scrip.buoi26.entity.FavoriteMovie;
import vn.scrip.buoi26.entity.Movie;
import vn.scrip.buoi26.entity.User;

public interface FavoriteMovieRepository extends JpaRepository<FavoriteMovie, Integer> {
    boolean existsByUserAndMovie(User user, Movie movie);
    void deleteByUserAndMovie(User user, Movie movie);
}








