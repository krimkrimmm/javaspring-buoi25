package vn.scrip.buoi26.repository;
import vn.scrip.buoi26.entity.Review;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
    Page<Review> findByMovie_Id(Integer movieId, Pageable pageable);

    List<Review> findByMovieId(Integer movieId);
}







