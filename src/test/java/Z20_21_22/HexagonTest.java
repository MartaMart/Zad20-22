package Z20_21_22;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class HexagonTest {


    @Test
    public void shouldSayThat30isCalculatedPerimeterOfHexagonForSide5(){

        Assertions.assertTrue(30==(new Hexagon(5).calculatePerimeter()));
    }

    @Test
    public void shouldSayThat0isCalculatedPerimeterOfHexagonForSideMinus1(){

        Assertions.assertTrue(0==(new Hexagon(-1).calculatePerimeter()));
    }

    @Test
    public void shouldSayThat6sqrt3IsCalculatedAreaOfHexagonForSide2(){

        Assertions.assertEquals((6*Math.sqrt(3)),(new Hexagon(2).calculateArea()));
    }

    @Test
    public void shouldSayThat0isCalculatedAreaOfHexagonForSideMinus1(){

        Assertions.assertTrue(0==(new Hexagon(-1).calculateArea()));
    }

}