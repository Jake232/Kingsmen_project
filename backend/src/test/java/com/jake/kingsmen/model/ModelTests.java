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
        String name = "Unit Test";
        data.setName(name);
        assertEquals(data.getName(), name);
    }

    @Test
    void costTest(){
        DataModel data = new DataModel();
        int cost = 1;
        data.setCost(cost);
        assertEquals(data.getCost(), cost);
    }

    @Test
    void stockedTest(){
        DataModel data = new DataModel();
        boolean stocked = false;
        data.setStocked(stocked);
        assertEquals(data.getStocked(), stocked);
    }
}