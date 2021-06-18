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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean1 = realMatrixImpl0.isSingular();
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl0 = new org.apache.commons.math.linear.RealMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray1 = realMatrixImpl0.getData();
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl0 = new org.apache.commons.math.linear.RealMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        realMatrixImpl0.luDecompose();
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl0 = new org.apache.commons.math.linear.RealMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray2 = realMatrixImpl0.getColumn((int) 'a');
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl0 = new org.apache.commons.math.linear.RealMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.RealMatrix realMatrix1 = realMatrixImpl0.inverse();
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        org.apache.commons.math.linear.RealMatrixImpl realMatrixImpl0 = new org.apache.commons.math.linear.RealMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray2 = realMatrixImpl0.getRow((int) (short) 10);
    }
}

