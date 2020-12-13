package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("With sesame")
                .sauce("1000 island")
                .burgers(2)
                .ingredient("Becon")
                .ingredient("Onion")
                .ingredient("Cheese")
                .build();

        System.out.println(bigmac);

        //When
        String whatKindOfBun = bigmac.getBun();
        int howManyBurgers = bigmac.getBurgers();

        //Then
        assertEquals("With sesame", whatKindOfBun);
        assertEquals(2, howManyBurgers);
    }
}
