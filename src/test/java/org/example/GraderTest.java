package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {
    @Test
    void FiftyNineShouldReturnF(){
        var grader = new Grader();
        assertEquals('F',grader.calculateGrade(59));
    }
    @Test
    void  SixtyNineShouldReturnD(){
        var grader = new Grader();
        assertEquals('D',grader.calculateGrade(69));
    }
    @Test
    void SeventyNineShouldReturnC(){
        var grader = new Grader();
        assertEquals('C',grader.calculateGrade(79));
    }

    @Test
    void EightyNineShouldReturnB(){
        var grader = new Grader();
        assertEquals('B',grader.calculateGrade(89));
    }
    @Test
    void NinetyTwoShouldReturnA(){
        var grader = new Grader();
        assertEquals('A',grader.calculateGrade(92));
    }

    @Test
    void NegativeTwoShouldReturnIllegalArgumentException(){
        var grader = new Grader();
        assertThrows(IllegalArgumentException.class, () -> {
            grader.calculateGrade(-2);
        });
    }


}