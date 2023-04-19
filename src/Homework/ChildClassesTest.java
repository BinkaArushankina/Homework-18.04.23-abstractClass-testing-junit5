package Homework;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ChildClassesTest {

    Transformer transformer;
    String actual ;


    @BeforeEach
    public void init(){
        transformer= new Transformer();
        actual = "aAa bBbB cCcCc dDdDdD";
    }

    @Test
    public void testing_empty(){
        String expected = "";
        Three t= new Three();
        assertEquals(expected,transformer.transform(expected,t));
    }
    @Test
    public void testing_three(){
        String expected = "AAA bBbB cCcCc dDdDdD";
        Three t= new Three();
        assertEquals(expected,transformer.transform(actual,t));
    }
    @Test
    public void testing_four(){
        String expected = "aAa bbbb cCcCc dDdDdD";
        Four f= new Four();
        assertEquals(expected,transformer.transform(actual,f));
    }
    @Test
    public void testing_five(){
        String expected = "aAa bBbB ***** dDdDdD";
        Five t= new Five();
        assertEquals(expected,transformer.transform(actual,t));
    }

}