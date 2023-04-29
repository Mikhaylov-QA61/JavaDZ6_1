import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.JavaQAMaven.JavaDZ6_1.services.NumberMonthsRest;
public class NumberMonthsRestTest {

    @Test
    public void testExampleFromAssignment() {
        NumberMonthsRest service = new NumberMonthsRest();

        // Входные данные
        int income = 100_000;
        int expensese = 60_000;
        int threshold = 150_000;
        int expected = 2; // ожидаемый результат
        int actual = service.calculate(income,expensese,threshold);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testExample() {
        NumberMonthsRest service = new NumberMonthsRest();

        // Входные данные
        int income = 10_000;
        int expensese = 3_000;
        int threshold = 20_000;
        int expected = 3; // ожидаемый результат
        int actual = service.calculate(income,expensese,threshold);
        Assertions.assertEquals(expected,actual);
    }
}
