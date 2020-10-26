package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        Continent europe = new Continent("Europe");

        europe.addCountry(new Country("Poland", new BigDecimal("38000000")));
        europe.addCountry(new Country("Germany", new BigDecimal("83000000")));
        europe.addCountry(new Country("Italy", new BigDecimal("60000000")));

        Continent asia = new Continent("Asia");

        asia.addCountry(new Country("Russia", new BigDecimal("144500000")));
        asia.addCountry(new Country("China", new BigDecimal("1393000000")));
        asia.addCountry(new Country("Japan", new BigDecimal("126500000")));

        Continent northAmerica = new Continent("North America");

        northAmerica.addCountry(new Country("USA", new BigDecimal("328100000")));
        northAmerica.addCountry(new Country("Canada", new BigDecimal("37590000")));
        northAmerica.addCountry(new Country("Mexico", new BigDecimal("126200000")));

        //When
        World world = new World();

        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(northAmerica);

        BigDecimal quantityOfPeople = world.getPeopleQuantity();

        //Then
        BigDecimal expectedQuantityOfPeople = new BigDecimal("2336890000");
        assertEquals(expectedQuantityOfPeople, quantityOfPeople);

    }
}
