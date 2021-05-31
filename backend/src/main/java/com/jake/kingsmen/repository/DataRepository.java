package com.jake.kingsmen.repository;

import org.springframework.data.repository.CrudRepository;
import java.util.List;
import com.jake.kingsmen.model.DataModel;

public interface DataRepository extends CrudRepository<DataModel, Integer>{

}