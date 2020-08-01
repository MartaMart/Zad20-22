package Z20_21_22;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class RectangleTest {

    private Rectangle rectangle;

    @Test
    public void shouldSayThat6isCalculatedPerimeterOfRectangleFor1And2() {
        rectangle=new Rectangle(1,2);
        Assertions.assertTrue(6==rectangle.calculatePerimeter());
        //Assertions.assertDoesNotThrow(rectangle.IllegalArgumentException);
    }

    @Test
    public void shouldSayThat0isCalculatedPerimeterOfRectangleFor0And1() {

        //w przypadku utworzenia prostokąta z niepoprawnymi danymi wyrzuca błąd
        Assertions.assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                rectangle=new Rectangle(0,1); //tu wyrzuci błąd
                Assertions.assertEquals(0,rectangle.calculatePerimeter()); //tu sprawdzi poprawność
            }
        });

    }

    @Test
    public void shouldSayThat2isCalculatedAreaOfRectangleFor1And2() {
        rectangle=new Rectangle(1,2);
        Assertions.assertTrue(2==rectangle.calculateArea());
    }

    @Test
    public void shouldSayThat0isCalculatedAreaOfRectangleFor0And1() {

        //w przypadku utworzenia prostokąta z niepoprawnymi danymi wyrzuca błąd
        Assertions.assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                rectangle=new Rectangle(0,1); //tu wyrzuci błąd
                Assertions.assertEquals(0,rectangle.calculateArea()); //tu sprawdzi poprawność
            }
        });


    }
}