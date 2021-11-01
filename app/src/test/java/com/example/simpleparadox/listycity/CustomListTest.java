package com.example.simpleparadox.listycity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    @BeforeEach
    public void createList(){
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void countCitiesTest(){
        int listSize = list.getCount();
        list.addCity(new City("Winnipeg", "Manitoba"));
        assertEquals(listSize +1, list.getCount());
    }
    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Edmonton", "Alberta"));
        assertEquals(listSize + 1, list.getCount());
    }

    @Test
    public void hasCityTest(){
        City city = new City("Victoria", "British Columbia");
        list.addCity(city);
        assertTrue(list.getCities().contains(city));
    }

    @Test
    public void deleteCityTest(){
        int listSize = list.getCount();
        City city = new City("Regina", "Saskatchewan");
        list.addCity(city);
        list.deleteCity(city);
        assertEquals(listSize, list.getCount());
        assertFalse(list.getCities().contains(city));
    }

}
