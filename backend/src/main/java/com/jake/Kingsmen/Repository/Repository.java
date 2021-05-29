package com.jake.Kingsmen.Repository;

import com.jake.Kingsmen.model.DataModel;
import java.util.List;
// import java.util.Optional;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface Repository extends CrudRepository<DataModel, Integer>{
    DataModel findById(int id);
    List<DataModel> findAll();
}