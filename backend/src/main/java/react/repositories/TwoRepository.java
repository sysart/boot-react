package react.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import react.model.Two;

@Repository
public interface TwoRepository extends CrudRepository<Two, Integer> {
}
