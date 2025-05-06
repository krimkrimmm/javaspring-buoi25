package vn.scrip.buoi26.repository;
import vn.scrip.buoi26.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CountryRepository extends JpaRepository<Country, Integer> {
}