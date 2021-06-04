package com.jake.kingsmen.model;

import com.jake.kingsmen.model.DataModel;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ModelTests{
    @Test
    void nameTest(){
        DataModel data = new DataModel();
        data.setName("Unit Test");
        assertEquals(data.getName(), "Unit Test");
    }

    @Test
    void costTest(){
        DataModel data = new DataModel();
        data.setCost(1);
        assertEquals(data.getCost(), 1);
    }

    @Test
    void stockedTest(){
        DataModel data = new DataModel();
        data.setStocked(false);
        assertEquals(data.getStocked(), false);
    }
}