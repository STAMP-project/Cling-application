import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl0 = new org.apache.commons.math.linear.RealMatrixImpl();
        double[] doubleArray2 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl3 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray2);
        org.apache.commons.math.linear.RealMatrix realMatrix5 = realMatrixImpl3.scalarAdd((double) '#');
        double[] doubleArray7 = new double[] { (-1) };
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl8 = new org.apache.commons.math.linear.RealMatrixImpl(doubleArray7);
        double[] doubleArray9 = realMatrixImpl3.operate(doubleArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = realMatrixImpl0.solve(doubleArray7);
    }
}

