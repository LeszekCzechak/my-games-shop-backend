package pl.czechak.leszek.mygamesshopbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import pl.czechak.leszek.mygamesshopbackend.model.ProductCategory;

@Repository
@RepositoryRestResource(collectionResourceRel = "productCategory",path = "product-category")
@CrossOrigin("http://localhost:4200")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
