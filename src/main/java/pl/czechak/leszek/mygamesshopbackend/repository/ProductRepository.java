package pl.czechak.leszek.mygamesshopbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.czechak.leszek.mygamesshopbackend.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
