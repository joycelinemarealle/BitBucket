import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

import static jdk.internal.org.objectweb.asm.util.CheckClassAdapter.verify;
import static org.graalvm.compiler.phases.BasePhase.NotApplicable.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class QuizTest {
    Quiz q;

    @Mock
    Calculator c;

    @BeforeEach
    void setUp(){
        c = mock(Calculator.class);
        q = new Quiz(c);
    }


    @Test
    public void testTwoPlusTwoAnswer() {
        when(c.add(2, 2)).thenReturn(4);
        assertTrue(q.checkAddAnswer(2,2,4));
        verify(c).add(2,2); //check if add method was called
    }

    @Test
    public void testTwoPlusTwoWrongAnswer(){
        when (c.add(2,2)).thenReturn(3);
        assertFalse(q.checkAddAnswer(2,2,3));
    }
}
