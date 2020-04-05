package problems.easy;

import org.junit.Assert;
import org.junit.Test;

public class P171_ExcelSheetColumnNumberTest {
    @Test
    public void testTitleToNumber() {
        P171_ExcelSheetColumnNumber p171 = new P171_ExcelSheetColumnNumber();
        Assert.assertEquals(1, p171.titleToNumber("A"));
    }

    @Test
    public void testTitleToNumber2() {
        P171_ExcelSheetColumnNumber p171 = new P171_ExcelSheetColumnNumber();
        Assert.assertEquals(28, p171.titleToNumber("AB"));
    }

    @Test
    public void testTitleToNumber3() {
        P171_ExcelSheetColumnNumber p171 = new P171_ExcelSheetColumnNumber();
        Assert.assertEquals(701, p171.titleToNumber("ZY"));
    }
}