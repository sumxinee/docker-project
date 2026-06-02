import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class NumberCheckerTest {
    NumberChecker checker = new NumberChecker();

    @Test
    public void testIsEven() {
        // 4를 넣으면 짝수(true)가 나와야 정답
        assertTrue(checker.isEven(4));
        
        // 5를 넣으면 홀수니까 짝수가 아님(false)이 나와야 정답
        assertFalse(checker.isEven(5));
    }
}