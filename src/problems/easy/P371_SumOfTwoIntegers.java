package problems.easy;

public class P371_SumOfTwoIntegers {

    // TODO Tricky
    public int getSum(int a, int b) {
        //System.out.println(a + b);
        //System.out.println((a | b) + (a & b));
        //System.out.println((a ^ b) + (a & b) + (a & b));
        //System.out.println((a ^ b) + ((a & b) << 1));
        if (a == 0) return b;
        if (b == 0) return a;
        return getSum(a ^ b, (a & b) << 1);
    }
}
