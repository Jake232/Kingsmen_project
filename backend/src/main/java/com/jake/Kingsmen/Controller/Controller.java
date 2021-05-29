package com.jake.Kingsmen.Controller;

import com.jake.Kingsmen.model.DataModel;
import com.jake.Kingsmen.Repository.Repository;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class Controller{
    private Repository repository;

    //Get all data
    @GetMapping("/data")
    public List<DataModel> getAll(){
        return repository.findAll();
    }

    //Get by id
    @GetMapping("/data/{id}")
    public DataModel getById(@PathVariable(value = "id") int id){
        return repository.findById(id);
    }
}