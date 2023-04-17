package Homework;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ChildClassesTest {

    Three testThree;
    Four testFour;
    Five testFive;
    String actual ;


    @BeforeEach
    public void init(){
        testThree= new Three(actual);
        testFour= new Four(actual);
        testFive= new Five(actual);
        actual = "aAa bBbB cCcCc dDdDdD";
    }

    @Test
    public void testing_three(){
        String expected = "aaa bBbB cCcCc dDdDdD";

        assertEquals(expected,testThree.stringLength(actual));
    }
    @Test
    public void testing_four(){
        String expected = "aAa BBBB cCcCc dDdDdD";

        assertEquals(expected,testFour.stringLength(actual));
    }
    @Test
    public void testing_five(){
        String expected = "aAa bBbB ***** dDdDdD";

        assertEquals(expected,testFive.stringLength(actual));
    }

}