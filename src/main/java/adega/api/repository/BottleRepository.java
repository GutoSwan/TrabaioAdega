package adega.api.repository;

import adega.api.model.BottleModel;
import org.springframework.data.repository.CrudRepository;

public interface BottleRepository extends CrudRepository<BottleModel, Integer> {
}
