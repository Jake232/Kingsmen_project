package com.jake.kingsmen.controller;

import com.jake.kingsmen.model.DataModel;
import com.jake.kingsmen.repository.DataRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/data")
public class DataController{
    @Autowired
    private DataRepository repository;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(path="/all")
    public @ResponseBody Iterable<DataModel> getAllData(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public @ResponseBody Optional<DataModel> getById(@PathVariable(value = "id") int id){
        return repository.findById(id);
    }

    @PostMapping("/new")
    public @ResponseBody void newData(@RequestParam String name, @RequestParam int cost, @RequestParam boolean stocked){
        DataModel data = new DataModel();
        data.setName(name);
        data.setCost(cost);
        data.setStocked(stocked);
        repository.save(data);
    }
}