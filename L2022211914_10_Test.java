package open_source;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class L2022211914_10_Test {
    private Solution10 solution;

    // 测试用例设计的总体原则
    // 本测试类遵循以下测试原则：
    // 1. 等价类划分原则：根据输入的分数形式和符号，划分出有效和无效的等价类进行测试。
    // 2. 边界值分析：测试边界情况下的输入，比如分母为1、分子为0等。
    // 3. 特殊情况：测试输入中的负数和正数相结合的情况。

    @BeforeEach
    public void setUp() {
        solution = new Solution10();
    }

    /**
     * 测试目的：测试简单的加法运算。
     * 用到的测试用例："-1/2+1/2"，预期输出为"0/1"。
     */
    @Test
    public void testSimpleAddition() {
        String expression = "-1/2+1/2";
        String expected = "0/1";
        assertEquals(expected, solution.fractionAddition(expression));
    }

    /**
     * 测试目的：测试多个分数的加法运算。
     * 用到的测试用例："-1/2+1/2+1/3"，预期输出为"1/3"。
     */
    @Test
    public void testMultipleFractionsAddition() {
        String expression = "-1/2+1/2+1/3";
        String expected = "1/3";
        assertEquals(expected, solution.fractionAddition(expression));
    }

    /**
     * 测试目的：测试简单的减法运算。
     * 用到的测试用例："1/3-1/2"，预期输出为"-1/6"。
     */
    @Test
    public void testSimpleSubtraction() {
        String expression = "1/3-1/2";
        String expected = "-1/6";
        assertEquals(expected, solution.fractionAddition(expression));
    }

    /**
     * 测试目的：测试结果为整数的分数情况。
     * 用到的测试用例："1/2+1/2"，预期输出为"1/1"。
     */
    @Test
    public void testIntegerResult() {
        String expression = "1/2+1/2";
        String expected = "1/1";
        assertEquals(expected, solution.fractionAddition(expression));
    }

    /**
     * 测试目的：测试结果为负整数的分数情况。
     * 用到的测试用例："-1/3-1/3"，预期输出为"-2/3"。
     */
    @Test
    public void testNegativeIntegerResult() {
        String expression = "-1/3-1/3";
        String expected = "-2/3";
        assertEquals(expected, solution.fractionAddition(expression));
    }

    /**
     * 测试目的：测试边界条件，如分母为1的情况。
     * 用到的测试用例："2/1"，预期输出为"2/1"。
     */
    @Test
    public void testBoundaryConditionDenominatorOne() {
        String expression = "2/1";
        String expected = "2/1";
        assertEquals(expected, solution.fractionAddition(expression));
    }
}
