package edu.iu.aublwill.historyservice.repository;

import edu.iu.aublwill.historyservice.model.PrimesRecord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrimesHistoryRepository extends CrudRepository<PrimesHistoryRepository, Integer> {
    List<PrimesRecord> findAllByCustomer(String customer);

}
