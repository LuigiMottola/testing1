import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void sumPositives() {
        int methodResult = Main.sum(5, 7);
        assertEquals(12, methodResult);
    }
    @Test
    void sumNegative(){
        int methodResult = Main.sum(-8,-4);
        assertEquals(-12, methodResult);
    }
    @Test
    void sumMixed(){
        int methodResult = Main.sum(-6,4);
        assertEquals(-2,methodResult);
    }
}

