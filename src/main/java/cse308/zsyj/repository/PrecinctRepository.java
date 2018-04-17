package cse308.zsyj.repository;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Objects.Precinct;

@Repository
public interface PrecinctRepository extends CrudRepository<Precinct, Integer>{
	@Query(value =  "Select * from Precinct where cdNumber = ?1", 
			nativeQuery = true)
	List<Precinct> findAllByCD(int pid);
}
