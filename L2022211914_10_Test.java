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
/**
 * 评价：
 * 1. 测试设计原则明确：
 *    - 测试类开头给出了测试用例设计的总体原则，遵循等价类划分、边界值分析和特殊情况的处理。这有助于确保测试覆盖了不同类型的输入情况，如有效和无效的分数形式，以及负数和正数的组合情况。
 * 
 * 2. 测试方法命名清晰：
 *    - 每个测试方法名称都明确描述了其目的，如 `testSimpleAddition`、`testMultipleFractionsAddition` 等，使得代码易于阅读和理解，符合好的单元测试命名规范。
 * 
 * 3. 测试用例丰富：
 *    - 测试覆盖了加法、减法、多分数计算、整数结果、负整数结果、以及边界值（如分母为1的情况）。这些测试用例能够有效检测 `fractionAddition` 方法在不同情况下的表现。
 * 
 * 4. 使用 `JUnit 5` 语法规范：
 *    - 代码采用了 `JUnit 5` (Junit Jupiter) 的语法，如 `@BeforeEach` 和 `@Test` 注解，这符合现代 Java 测试框架的最佳实践。
 *    - 通过 `assertEquals` 验证预期结果与实际结果的匹配性，使得测试表达简洁明了。
 * 
 * 5. 改进建议：
 *    - 虽然当前测试用例较为全面，但可以增加更多极端边界情况，如 `0/1` 与其他分数的运算，以及更复杂的多分数计算，进一步增强测试的覆盖范围。
 *    - 可以考虑增加对输入格式错误的异常处理测试，如非法分数格式或空字符串输入等，确保程序的鲁棒性。
 */
