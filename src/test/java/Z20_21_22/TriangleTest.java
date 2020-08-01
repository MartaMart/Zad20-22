package Z20_21_22;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.function.Executable;


class TriangleTest {

    static Triangle triangle, triangle1; //pola muszą być statyczne bo, @BeforeAll przyjmuje statyczne pola

    @BeforeAll
    static void setUpBeforeAll() {

        triangle = new Triangle(5, 4, 3);
        triangle1 = new Triangle(0, 1, 2);//Test ignored!!!

    }

    @DisplayName("Calculate perimeter for sides 0, 1 and 2")
    @Test
    void shouldSayThat0isPerimeterOfSides0_1_2AndThrowException() {


        Assertions.assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                Assertions.assertEquals(0,triangle1.calculatePerimeter());
                // Assertions.assertEquals(0,new Triangle(0,1,2).calculatePerimeter());
            }
        });

    }

    @DisplayName("Calculate perimeter for sides 5, 4 and 3")
    @Test
    void shouldSayThat12isPerimeterOfSides5_4_3() {
        double perimeter = triangle.calculatePerimeter();
        Assertions.assertEquals(12, perimeter,"5+4+3 should equal 12"); //message wyświetla się w przypadku faila testu
    }


    @AfterAll
    public static void tearDownClass(){
        triangle=null;
        triangle1=null;
    }
}
