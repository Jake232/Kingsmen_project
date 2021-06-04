package com.jake.kingsmen.controller;

import com.jake.kingsmen.model.DataModel;
import com.jake.kingsmen.controller.DataController;
import com.jake.kingsmen.repository.DataRepository;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ControllerTests{
    @Autowired
	private DataRepository repository;

	@Autowired
	private DataController controller;

    @Test
	void mySQLSave(){
		DataModel data = new DataModel();
        data.setName("Unit Test");
        DataModel check = repository.save(data);
        repository.deleteById(data.getId());
        assertEquals(check, data);
	}
}