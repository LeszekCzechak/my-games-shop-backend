package pl.czechak.leszek.mygamesshopbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import pl.czechak.leszek.mygamesshopbackend.model.State;

import java.util.List;

@Repository
@RepositoryRestResource(collectionResourceRel = "states",path = "states")
@CrossOrigin("http://localhost:4200")
public interface StateRepository extends JpaRepository<State, Long> {

    List<State>findByCountryCode(@Param("code") String code);
}
