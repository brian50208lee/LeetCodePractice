package problems.easy;

public class P171_ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int num = 0;
        int mul = 1;
        for (int i = s.length() - 1; i >= 0 ; i--) {
            num += (s.charAt(i) - 'A' + 1) * mul;
            mul *= 26;
        }
        return num;
    }
}
