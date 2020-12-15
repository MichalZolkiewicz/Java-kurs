package com.kodilla.patterns.builder.checkers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CheckersTestSuite {

    @Test
    void testCheckersBuilder() {
        //Given
        Checkers checkers = new Checkers.CheckersBuilder()
                .PlayerOne("John")
                .PlayerTwo("Theresa")
                .Figure(FiguresFactory.PAWN, Figure.WHITE, 0, 3)
                .Figure(FiguresFactory.PAWN, Figure.BLACK, 9, 7)
                .Figure(FiguresFactory.QUEEN, Figure.WHITE, 0,2)
                .build();
        System.out.println(checkers.getBoard());

        //When
        Figure figureOne = checkers.getBoard().getFigure(0,3);
        Figure figureTwo = checkers.getBoard().getFigure(9,7);
        Figure figureThree = checkers.getBoard().getFigure(0,2);
        Figure figureFour = checkers.getBoard().getFigure(1,1);

        //Then
        assertEquals(Figure.WHITE, figureOne.getColor());
        assertEquals(Pawn.class, figureTwo.getClass());
        assertEquals(Queen.class, figureThree.getClass());
        assertNull(figureFour);
    }
}