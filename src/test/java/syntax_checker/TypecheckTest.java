package syntax_checker;

import org.junit.Test;

public class TypecheckTest {
    @Test
    public void basicInputTest() {
        Typecheck tc = new Typecheck();
        String[] input = {"hello"};
        tc.main(input);
    }
}
