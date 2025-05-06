package vn.scrip.buoi26.repository;
import vn.scrip.buoi26.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
public interface GenreRepository extends JpaRepository<Genre, Integer> {
}