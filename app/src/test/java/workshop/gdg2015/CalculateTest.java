package workshop.gdg2015;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateTest {

    @Before
    public void setUp() throws Exception {

    }

    Calculate calculate = new Calculate();


    @Test
    public void gradeA() throws Exception {
        String expectedGrade = calculate.convertToGrade(80);
        assertEquals("A", expectedGrade);
    }


    @Test
    public void gradeB() throws Exception {
        String expectedGrade = calculate.convertToGrade(70);
        assertEquals("B", expectedGrade);
    }

    @Test
    public void gradeC() throws Exception {
        String expectedGrade = calculate.convertToGrade(60);
        assertEquals("C", expectedGrade);
    }


}