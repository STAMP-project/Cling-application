import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray1 = bigMatrixImpl0.getDataAsDoubleArray();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl1 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl1.setRoundingMode((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix4 = bigMatrixImpl0.preMultiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix2 = bigMatrixImpl0.getRowMatrix((int) (byte) 100);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = bigMatrixImpl0.getRowDimension();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = bigMatrixImpl0.getColumnDimension();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double3 = bigMatrixImpl0.getEntryAsDouble(100, 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal1 = bigMatrixImpl0.getDeterminant();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal3 = bigMatrixImpl0.getEntry((int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix1 = bigMatrixImpl0.inverse();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = bigMatrixImpl0.getColumnDimension();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal3 = bigMatrixImpl0.getNorm();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bigMatrixImpl0.getRowAsDoubleArray((int) (byte) 1);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray2 = bigMatrixImpl0.getRowAsDoubleArray((int) (short) 10);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray2 = bigMatrixImpl0.operate(bigDecimalArray1);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl1 = new org.apache.commons.math.linear.BigMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix2 = bigMatrixImpl0.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl3 = new org.apache.commons.math.linear.BigMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix4 = bigMatrixImpl0.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl3);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl4 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl4.setRoundingMode((int) 'a');
        java.lang.String str7 = bigMatrixImpl4.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = bigMatrixImpl0.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl4);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl4 = new org.apache.commons.math.linear.BigMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = bigMatrixImpl0.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl4);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = bigMatrixImpl0.copy();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = bigMatrixImpl0.copy();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray6 = bigMatrixImpl0.getDataAsDoubleArray();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        bigMatrixImpl0.luDecompose();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray10 = bigMatrixImpl0.getRow(10);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = bigMatrixImpl0.getColumnDimension();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        double[] doubleArray6 = new double[] { (byte) 100, 10.0f };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray7 = bigMatrixImpl0.solve(doubleArray6);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl4 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl4.setRoundingMode((int) 'a');
        java.lang.String str7 = bigMatrixImpl4.toString();
        int int8 = bigMatrixImpl4.getRoundingMode();
        bigMatrixImpl4.setRoundingMode((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = bigMatrixImpl0.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl4);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double3 = bigMatrixImpl0.getEntryAsDouble((int) (short) -1, 10);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal7 = bigMatrixImpl0.getEntry((int) (short) 100, (int) (byte) 10);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        bigMatrixImpl0.luDecompose();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(0);
        int int9 = bigMatrixImpl0.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = bigMatrixImpl0.transpose();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        bigMatrixImpl0.luDecompose();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = bigMatrixImpl0.getColumnDimension();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray4 = bigMatrixImpl0.getDataAsDoubleArray();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(100);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl9 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl9.setRoundingMode((int) 'a');
        java.lang.String str12 = bigMatrixImpl9.toString();
        int int13 = bigMatrixImpl9.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl9.getDataRef();
        java.math.BigDecimal[][] bigDecimalArray15 = bigMatrixImpl9.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = bigMatrixImpl0.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl9);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(0);
        int int9 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[] bigDecimalArray10 = new java.math.BigDecimal[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray11 = bigMatrixImpl0.operate(bigDecimalArray10);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = bigMatrixImpl0.getColumnAsDoubleArray((int) 'a');
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getData();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        java.math.BigDecimal[][] bigDecimalArray6 = bigMatrixImpl0.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl7 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl7.setRoundingMode((int) 'a');
        java.lang.String str10 = bigMatrixImpl7.toString();
        int int11 = bigMatrixImpl7.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray12 = bigMatrixImpl7.getDataRef();
        java.math.BigDecimal[][] bigDecimalArray13 = bigMatrixImpl7.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = bigMatrixImpl0.preMultiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl7);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = bigMatrixImpl0.getRowMatrix((int) (short) 0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        bigMatrixImpl0.luDecompose();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl6 = new org.apache.commons.math.linear.BigMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = bigMatrixImpl0.solve((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl6);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal7 = bigMatrixImpl0.getDeterminant();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode((int) '4');
        bigMatrixImpl0.setRoundingMode((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = bigMatrixImpl0.getColumnDimension();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        double[] doubleArray10 = new double[] { '4', 0.0d, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray11 = bigMatrixImpl0.operate(doubleArray10);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray7 = bigMatrixImpl0.getDataAsDoubleArray();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = bigMatrixImpl0.getRowMatrix((int) (short) 1);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl3 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl3.setRoundingMode((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = bigMatrixImpl0.add((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl3);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal6 = bigMatrixImpl0.getNorm();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray9 = bigMatrixImpl0.getDataAsDoubleArray();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal9 = bigMatrixImpl0.getDeterminant();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode((int) '4');
        bigMatrixImpl0.setRoundingMode((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = bigMatrixImpl0.getColumnAsDoubleArray((int) (short) 1);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setScale((int) (short) 100);
        double[] doubleArray6 = new double[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray7 = bigMatrixImpl0.operate(doubleArray6);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = bigMatrixImpl0.getRowDimension();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setScale((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal9 = bigMatrixImpl0.getDeterminant();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(100);
        int int9 = bigMatrixImpl0.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = bigMatrixImpl0.getSubMatrix(1, (int) 'a', (int) ' ', (int) (short) 1);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix1 = bigMatrixImpl0.copy();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = bigMatrixImpl0.getSubMatrix((int) (short) 10, (int) ' ', (int) (short) 100, (int) '4');
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = bigMatrixImpl0.isSquare();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) (short) 100);
        bigMatrixImpl0.setRoundingMode((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = bigMatrixImpl0.getRowMatrix(0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(0);
        int int9 = bigMatrixImpl0.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = bigMatrixImpl0.isSingular();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setScale((int) ' ');
        double[] doubleArray13 = new double[] { '4', 100.0f, (byte) 1, 97 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray14 = bigMatrixImpl0.solve(doubleArray13);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[][] bigDecimalArray1 = bigMatrixImpl0.getData();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[][] bigDecimalArray4 = bigMatrixImpl0.getData();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) ' ', (int) (byte) 100);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl3 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl3.setRoundingMode((int) 'a');
        java.lang.String str6 = bigMatrixImpl3.toString();
        int int7 = bigMatrixImpl3.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray8 = bigMatrixImpl3.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = bigMatrixImpl2.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl3);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = bigMatrixImpl0.isSingular();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(0);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl9 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl9.setRoundingMode((int) 'a');
        java.lang.String str12 = bigMatrixImpl9.toString();
        int int13 = bigMatrixImpl9.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = bigMatrixImpl0.add((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl9);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal7 = bigMatrixImpl0.getDeterminant();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setScale((int) (short) 100);
        java.lang.String str6 = bigMatrixImpl0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray7 = bigMatrixImpl0.getDataAsDoubleArray();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        java.math.BigDecimal[][] bigDecimalArray6 = bigMatrixImpl0.getDataRef();
        double[] doubleArray9 = new double[] { (short) 10, 100L };
        double[] doubleArray12 = new double[] { (short) 10, 100L };
        double[] doubleArray15 = new double[] { (short) 10, 100L };
        double[] doubleArray18 = new double[] { (short) 10, 100L };
        double[][] doubleArray19 = new double[][] { doubleArray9, doubleArray12, doubleArray15, doubleArray18 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray19);
        java.math.BigDecimal[][] bigDecimalArray21 = bigMatrixImpl20.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray21);
        java.math.BigDecimal[][] bigDecimalArray23 = bigMatrixImpl22.getData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean24 = bigMatrixImpl0.equals((java.lang.Object) bigMatrixImpl22);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(0);
        int int9 = bigMatrixImpl0.getScale();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[][] bigDecimalArray10 = bigMatrixImpl0.getData();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        java.math.BigDecimal[][] bigDecimalArray6 = bigMatrixImpl0.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal7 = bigMatrixImpl0.getNorm();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = bigMatrixImpl0.getColumnAsDoubleArray(10);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        java.math.BigDecimal[][] bigDecimalArray6 = bigMatrixImpl0.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl7 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl7.setRoundingMode((int) 'a');
        java.lang.String str10 = bigMatrixImpl7.toString();
        int int11 = bigMatrixImpl7.getRoundingMode();
        bigMatrixImpl7.setRoundingMode((int) ' ');
        bigMatrixImpl7.setRoundingMode(0);
        int int16 = bigMatrixImpl7.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = bigMatrixImpl0.add((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl7);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix4 = bigMatrixImpl0.inverse();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(100);
        boolean boolean10 = bigMatrixImpl0.equals((java.lang.Object) 0.0f);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl11 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl11.setRoundingMode((int) 'a');
        java.lang.String str14 = bigMatrixImpl11.toString();
        int int15 = bigMatrixImpl11.getRoundingMode();
        bigMatrixImpl11.setRoundingMode((int) ' ');
        bigMatrixImpl11.setRoundingMode(0);
        int int20 = bigMatrixImpl11.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = bigMatrixImpl0.add((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl11);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(0);
        int int9 = bigMatrixImpl0.getScale();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal10 = bigMatrixImpl0.getTrace();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = bigMatrixImpl0.getColumnDimension();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setScale((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[][] bigDecimalArray6 = bigMatrixImpl0.getData();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl5 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl5.setRoundingMode((int) 'a');
        java.lang.String str8 = bigMatrixImpl5.toString();
        boolean boolean9 = bigMatrixImpl0.equals((java.lang.Object) str8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl5 and bigMatrixImpl5", bigMatrixImpl5.equals(bigMatrixImpl5) ? bigMatrixImpl5.hashCode() == bigMatrixImpl5.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setScale((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = bigMatrixImpl0.inverse();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(100);
        int int9 = bigMatrixImpl0.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = bigMatrixImpl0.getRowAsDoubleArray((int) (byte) 1);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setScale((int) (short) 100);
        java.lang.String str6 = bigMatrixImpl0.toString();
        double[] doubleArray9 = new double[] { (short) 10, 100L };
        double[] doubleArray12 = new double[] { (short) 10, 100L };
        double[] doubleArray15 = new double[] { (short) 10, 100L };
        double[] doubleArray18 = new double[] { (short) 10, 100L };
        double[][] doubleArray19 = new double[][] { doubleArray9, doubleArray12, doubleArray15, doubleArray18 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray19);
        java.math.BigDecimal bigDecimal21 = bigMatrixImpl20.getNorm();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = bigMatrixImpl0.scalarMultiply(bigDecimal21);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal6 = bigMatrixImpl0.getDeterminant();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        double[] doubleArray9 = new double[] { 0.0f, 1.0f };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray10 = bigMatrixImpl0.solve(doubleArray9);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) (short) 100);
        bigMatrixImpl0.setRoundingMode((int) (byte) 0);
        java.math.BigDecimal[] bigDecimalArray9 = new java.math.BigDecimal[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray10 = bigMatrixImpl0.preMultiply(bigDecimalArray9);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode((int) '4');
        bigMatrixImpl0.setRoundingMode((int) (short) 100);
        double[] doubleArray13 = new double[] { (short) 10, 100L };
        double[] doubleArray16 = new double[] { (short) 10, 100L };
        double[] doubleArray19 = new double[] { (short) 10, 100L };
        double[] doubleArray22 = new double[] { (short) 10, 100L };
        double[][] doubleArray23 = new double[][] { doubleArray13, doubleArray16, doubleArray19, doubleArray22 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl24 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray23);
        java.math.BigDecimal[][] bigDecimalArray25 = bigMatrixImpl24.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl26 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray25);
        java.math.BigDecimal bigDecimal27 = bigMatrixImpl26.getNorm();
        double[] doubleArray30 = new double[] { (short) 10, 100L };
        double[] doubleArray33 = new double[] { (short) 10, 100L };
        double[] doubleArray36 = new double[] { (short) 10, 100L };
        double[] doubleArray39 = new double[] { (short) 10, 100L };
        double[][] doubleArray40 = new double[][] { doubleArray30, doubleArray33, doubleArray36, doubleArray39 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray40);
        java.math.BigDecimal[][] bigDecimalArray42 = bigMatrixImpl41.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray42);
        java.math.BigDecimal bigDecimal44 = bigMatrixImpl43.getNorm();
        double[] doubleArray47 = new double[] { (short) 10, 100L };
        double[] doubleArray50 = new double[] { (short) 10, 100L };
        double[] doubleArray53 = new double[] { (short) 10, 100L };
        double[] doubleArray56 = new double[] { (short) 10, 100L };
        double[][] doubleArray57 = new double[][] { doubleArray47, doubleArray50, doubleArray53, doubleArray56 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl58 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray57);
        java.math.BigDecimal bigDecimal59 = bigMatrixImpl58.getNorm();
        double[] doubleArray62 = new double[] { (short) 10, 100L };
        double[] doubleArray65 = new double[] { (short) 10, 100L };
        double[] doubleArray68 = new double[] { (short) 10, 100L };
        double[] doubleArray71 = new double[] { (short) 10, 100L };
        double[][] doubleArray72 = new double[][] { doubleArray62, doubleArray65, doubleArray68, doubleArray71 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl73 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray72);
        java.math.BigDecimal[][] bigDecimalArray74 = bigMatrixImpl73.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl75 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray74);
        java.math.BigDecimal bigDecimal76 = bigMatrixImpl75.getNorm();
        java.math.BigDecimal[] bigDecimalArray77 = new java.math.BigDecimal[] { bigDecimal27, bigDecimal44, bigDecimal59, bigDecimal76 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray78 = bigMatrixImpl0.operate(bigDecimalArray77);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal9 = bigMatrixImpl0.getTrace();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setScale((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray10 = bigMatrixImpl0.getColumn((int) 'a');
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setScale((int) (short) 100);
        java.lang.String str6 = bigMatrixImpl0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal9 = bigMatrixImpl0.getEntry((int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        double[] doubleArray6 = new double[] { (short) 10, 100L };
        double[] doubleArray9 = new double[] { (short) 10, 100L };
        double[] doubleArray12 = new double[] { (short) 10, 100L };
        double[] doubleArray15 = new double[] { (short) 10, 100L };
        double[][] doubleArray16 = new double[][] { doubleArray6, doubleArray9, doubleArray12, doubleArray15 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray16);
        java.math.BigDecimal bigDecimal18 = bigMatrixImpl17.getNorm();
        double[] doubleArray21 = new double[] { (short) 10, 100L };
        double[] doubleArray24 = new double[] { (short) 10, 100L };
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[] doubleArray30 = new double[] { (short) 10, 100L };
        double[][] doubleArray31 = new double[][] { doubleArray21, doubleArray24, doubleArray27, doubleArray30 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl32 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray31);
        java.math.BigDecimal[][] bigDecimalArray33 = bigMatrixImpl32.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33);
        java.math.BigDecimal bigDecimal35 = bigMatrixImpl34.getNorm();
        java.math.BigDecimal[] bigDecimalArray36 = new java.math.BigDecimal[] { bigDecimal18, bigDecimal35 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray38 = bigMatrixImpl0.operate(bigDecimalArray36);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = bigMatrixImpl0.getColumnAsDoubleArray((int) (short) -1);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = bigMatrixImpl0.getRowMatrix((int) (byte) 1);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        double[] doubleArray7 = new double[] { (short) 10, 100L };
        double[] doubleArray10 = new double[] { (short) 10, 100L };
        double[] doubleArray13 = new double[] { (short) 10, 100L };
        double[] doubleArray16 = new double[] { (short) 10, 100L };
        double[][] doubleArray17 = new double[][] { doubleArray7, doubleArray10, doubleArray13, doubleArray16 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray17);
        java.math.BigDecimal bigDecimal19 = bigMatrixImpl18.getNorm();
        double[] doubleArray22 = new double[] { (short) 10, 100L };
        double[] doubleArray25 = new double[] { (short) 10, 100L };
        double[] doubleArray28 = new double[] { (short) 10, 100L };
        double[] doubleArray31 = new double[] { (short) 10, 100L };
        double[][] doubleArray32 = new double[][] { doubleArray22, doubleArray25, doubleArray28, doubleArray31 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray32);
        java.math.BigDecimal bigDecimal34 = bigMatrixImpl33.getNorm();
        double[] doubleArray37 = new double[] { (short) 10, 100L };
        double[] doubleArray40 = new double[] { (short) 10, 100L };
        double[] doubleArray43 = new double[] { (short) 10, 100L };
        double[] doubleArray46 = new double[] { (short) 10, 100L };
        double[][] doubleArray47 = new double[][] { doubleArray37, doubleArray40, doubleArray43, doubleArray46 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl48 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray47);
        double[][] doubleArray49 = bigMatrixImpl48.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl50 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray49);
        double[] doubleArray53 = new double[] { (short) 10, 100L };
        double[] doubleArray56 = new double[] { (short) 10, 100L };
        double[] doubleArray59 = new double[] { (short) 10, 100L };
        double[] doubleArray62 = new double[] { (short) 10, 100L };
        double[][] doubleArray63 = new double[][] { doubleArray53, doubleArray56, doubleArray59, doubleArray62 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl64 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray63);
        java.math.BigDecimal[][] bigDecimalArray65 = bigMatrixImpl64.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl66 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray65);
        java.math.BigDecimal bigDecimal67 = bigMatrixImpl66.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix68 = bigMatrixImpl50.scalarAdd(bigDecimal67);
        java.math.BigDecimal[] bigDecimalArray69 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal34, bigDecimal67 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray70 = bigMatrixImpl0.solve(bigDecimalArray69);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode((int) '4');
        bigMatrixImpl0.setRoundingMode((int) (short) 100);
        java.lang.String str11 = bigMatrixImpl0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal12 = bigMatrixImpl0.getTrace();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        double[] doubleArray9 = new double[] { (short) 10, 100L };
        double[] doubleArray12 = new double[] { (short) 10, 100L };
        double[] doubleArray15 = new double[] { (short) 10, 100L };
        double[] doubleArray18 = new double[] { (short) 10, 100L };
        double[][] doubleArray19 = new double[][] { doubleArray9, doubleArray12, doubleArray15, doubleArray18 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray19);
        java.math.BigDecimal bigDecimal21 = bigMatrixImpl20.getNorm();
        double[] doubleArray24 = new double[] { (short) 10, 100L };
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[] doubleArray30 = new double[] { (short) 10, 100L };
        double[] doubleArray33 = new double[] { (short) 10, 100L };
        double[][] doubleArray34 = new double[][] { doubleArray24, doubleArray27, doubleArray30, doubleArray33 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl35 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray34);
        double[][] doubleArray36 = bigMatrixImpl35.getDataAsDoubleArray();
        bigMatrixImpl35.setRoundingMode(100);
        org.apache.commons.math.linear.BigMatrix bigMatrix39 = bigMatrixImpl20.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl35);
        double[] doubleArray41 = bigMatrixImpl35.getColumnAsDoubleArray(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray42 = bigMatrixImpl0.solve(doubleArray41);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(100);
        int int9 = bigMatrixImpl0.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal10 = bigMatrixImpl0.getDeterminant();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(0);
        int int9 = bigMatrixImpl0.getScale();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray11 = bigMatrixImpl0.getRow((-1));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(100);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl9 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl9.setRoundingMode(4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = bigMatrixImpl0.solve((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl9);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) (short) 100);
        bigMatrixImpl0.setRoundingMode((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[][] bigDecimalArray9 = bigMatrixImpl0.getData();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal bigDecimal14 = bigMatrixImpl13.getNorm();
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[] doubleArray26 = new double[] { (short) 10, 100L };
        double[][] doubleArray27 = new double[][] { doubleArray17, doubleArray20, doubleArray23, doubleArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray27);
        double[][] doubleArray29 = bigMatrixImpl28.getDataAsDoubleArray();
        bigMatrixImpl28.setRoundingMode(100);
        org.apache.commons.math.linear.BigMatrix bigMatrix32 = bigMatrixImpl13.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl28);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl33.setRoundingMode((int) 'a');
        java.lang.String str36 = bigMatrixImpl33.toString();
        int int37 = bigMatrixImpl33.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray38 = bigMatrixImpl33.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix39 = bigMatrixImpl13.solve((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl33);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode((int) '4');
        bigMatrixImpl0.setRoundingMode((int) (short) 100);
        java.lang.String str11 = bigMatrixImpl0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[][] bigDecimalArray12 = bigMatrixImpl0.getData();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(0);
        int int9 = bigMatrixImpl0.getScale();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal12 = bigMatrixImpl0.getEntry((int) (byte) 0, (int) (byte) 0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode(4);
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[][] doubleArray15 = new double[][] { doubleArray5, doubleArray8, doubleArray11, doubleArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray15);
        java.math.BigDecimal bigDecimal17 = bigMatrixImpl16.getNorm();
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[] doubleArray26 = new double[] { (short) 10, 100L };
        double[] doubleArray29 = new double[] { (short) 10, 100L };
        double[][] doubleArray30 = new double[][] { doubleArray20, doubleArray23, doubleArray26, doubleArray29 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl31 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray30);
        java.math.BigDecimal bigDecimal32 = bigMatrixImpl31.getNorm();
        double[] doubleArray35 = new double[] { (short) 10, 100L };
        double[] doubleArray38 = new double[] { (short) 10, 100L };
        double[] doubleArray41 = new double[] { (short) 10, 100L };
        double[] doubleArray44 = new double[] { (short) 10, 100L };
        double[][] doubleArray45 = new double[][] { doubleArray35, doubleArray38, doubleArray41, doubleArray44 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl46 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray45);
        double[][] doubleArray47 = bigMatrixImpl46.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl48 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray47);
        double[] doubleArray51 = new double[] { (short) 10, 100L };
        double[] doubleArray54 = new double[] { (short) 10, 100L };
        double[] doubleArray57 = new double[] { (short) 10, 100L };
        double[] doubleArray60 = new double[] { (short) 10, 100L };
        double[][] doubleArray61 = new double[][] { doubleArray51, doubleArray54, doubleArray57, doubleArray60 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl62 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray61);
        java.math.BigDecimal[][] bigDecimalArray63 = bigMatrixImpl62.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl64 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray63);
        java.math.BigDecimal bigDecimal65 = bigMatrixImpl64.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix66 = bigMatrixImpl48.scalarAdd(bigDecimal65);
        java.math.BigDecimal[] bigDecimalArray67 = new java.math.BigDecimal[] { bigDecimal17, bigDecimal32, bigDecimal65 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray68 = bigMatrixImpl0.preMultiply(bigDecimalArray67);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) ' ', (int) (byte) 100);
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[][] doubleArray15 = new double[][] { doubleArray5, doubleArray8, doubleArray11, doubleArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray15);
        java.math.BigDecimal[][] bigDecimalArray17 = bigMatrixImpl16.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray17);
        java.math.BigDecimal bigDecimal19 = bigMatrixImpl18.getNorm();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = bigMatrixImpl2.scalarMultiply(bigDecimal19);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        bigMatrixImpl16.setRoundingMode((int) (short) 100);
        double[] doubleArray21 = new double[] { (short) 10, 100L };
        double[] doubleArray24 = new double[] { (short) 10, 100L };
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[] doubleArray30 = new double[] { (short) 10, 100L };
        double[][] doubleArray31 = new double[][] { doubleArray21, doubleArray24, doubleArray27, doubleArray30 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl32 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray31);
        java.math.BigDecimal[][] bigDecimalArray33 = bigMatrixImpl32.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33);
        java.math.BigDecimal bigDecimal35 = bigMatrixImpl34.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix36 = bigMatrixImpl16.scalarAdd(bigDecimal35);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl37.setRoundingMode((int) 'a');
        java.lang.String str40 = bigMatrixImpl37.toString();
        int int41 = bigMatrixImpl37.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray42 = bigMatrixImpl37.getDataRef();
        bigMatrixImpl37.setScale((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix45 = bigMatrixImpl16.add((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl37);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean1 = bigMatrixImpl0.isSingular();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        double[] doubleArray18 = new double[] { (short) 10, 100L };
        double[] doubleArray21 = new double[] { (short) 10, 100L };
        double[] doubleArray24 = new double[] { (short) 10, 100L };
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[][] doubleArray28 = new double[][] { doubleArray18, doubleArray21, doubleArray24, doubleArray27 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl29 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray28);
        java.math.BigDecimal[][] bigDecimalArray30 = bigMatrixImpl29.getData();
        boolean boolean31 = bigMatrixImpl15.equals((java.lang.Object) bigMatrixImpl29);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl32 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl32.setRoundingMode((int) 'a');
        java.lang.String str35 = bigMatrixImpl32.toString();
        int int36 = bigMatrixImpl32.getRoundingMode();
        bigMatrixImpl32.setRoundingMode((int) ' ');
        bigMatrixImpl32.setRoundingMode(100);
        boolean boolean42 = bigMatrixImpl32.equals((java.lang.Object) 0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix43 = bigMatrixImpl15.preMultiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl32);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = bigMatrixImpl0.isSquare();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = bigMatrixImpl0.getColumnMatrix((int) (short) 1);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray7 = bigMatrixImpl0.getColumn((int) (byte) 100);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(0);
        int int9 = bigMatrixImpl0.getScale();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = bigMatrixImpl0.getSubMatrix(0, (int) (short) 10, 10, (int) '4');
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl4 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl4.setRoundingMode((int) 'a');
        java.lang.String str7 = bigMatrixImpl4.toString();
        int int8 = bigMatrixImpl4.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray9 = bigMatrixImpl4.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = bigMatrixImpl0.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl4);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        double[] doubleArray6 = new double[] { (short) 10, 100L };
        double[] doubleArray9 = new double[] { (short) 10, 100L };
        double[] doubleArray12 = new double[] { (short) 10, 100L };
        double[] doubleArray15 = new double[] { (short) 10, 100L };
        double[][] doubleArray16 = new double[][] { doubleArray6, doubleArray9, doubleArray12, doubleArray15 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray16);
        java.math.BigDecimal bigDecimal18 = bigMatrixImpl17.getNorm();
        double[] doubleArray21 = new double[] { (short) 10, 100L };
        double[] doubleArray24 = new double[] { (short) 10, 100L };
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[] doubleArray30 = new double[] { (short) 10, 100L };
        double[][] doubleArray31 = new double[][] { doubleArray21, doubleArray24, doubleArray27, doubleArray30 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl32 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray31);
        java.math.BigDecimal[][] bigDecimalArray33 = bigMatrixImpl32.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33);
        java.math.BigDecimal bigDecimal35 = bigMatrixImpl34.getNorm();
        java.math.BigDecimal[] bigDecimalArray36 = new java.math.BigDecimal[] { bigDecimal18, bigDecimal35 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray36);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl38 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray39 = bigMatrixImpl0.operate(bigDecimalArray36);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode(4);
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[][] doubleArray15 = new double[][] { doubleArray5, doubleArray8, doubleArray11, doubleArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray15);
        double[][] doubleArray17 = bigMatrixImpl16.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray17);
        double[] doubleArray21 = new double[] { (short) 10, 100L };
        double[] doubleArray24 = new double[] { (short) 10, 100L };
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[] doubleArray30 = new double[] { (short) 10, 100L };
        double[][] doubleArray31 = new double[][] { doubleArray21, doubleArray24, doubleArray27, doubleArray30 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl32 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray31);
        java.math.BigDecimal[][] bigDecimalArray33 = bigMatrixImpl32.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33);
        java.math.BigDecimal bigDecimal35 = bigMatrixImpl34.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix36 = bigMatrixImpl18.scalarAdd(bigDecimal35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix37 = bigMatrixImpl0.scalarAdd(bigDecimal35);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode((int) '4');
        bigMatrixImpl0.setRoundingMode((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = bigMatrixImpl0.getColumnMatrix((int) (byte) 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray2 = bigMatrixImpl0.getRow((int) (short) 1);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) (short) 100);
        bigMatrixImpl0.setRoundingMode((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal11 = bigMatrixImpl0.getEntry((int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setScale((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray6 = bigMatrixImpl0.getDataAsDoubleArray();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode(4);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl3 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl3.setRoundingMode(4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = bigMatrixImpl0.equals((java.lang.Object) bigMatrixImpl3);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setScale((int) (short) 100);
        java.lang.String str6 = bigMatrixImpl0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray8 = bigMatrixImpl0.getColumn(0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[][] doubleArray18 = new double[][] { doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal[][] bigDecimalArray20 = bigMatrixImpl19.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray20);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray20);
        bigMatrixImpl22.setRoundingMode((int) (short) 100);
        org.apache.commons.math.linear.BigMatrix bigMatrix25 = bigMatrixImpl22.copy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = bigMatrixImpl0.preMultiply(bigMatrix25);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix4 = bigMatrixImpl0.getRowMatrix((int) '#');
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setScale((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = bigMatrixImpl0.inverse();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode((int) '4');
        bigMatrixImpl0.setRoundingMode(100);
        double[] doubleArray13 = new double[] { (short) 10, 100L };
        double[] doubleArray16 = new double[] { (short) 10, 100L };
        double[] doubleArray19 = new double[] { (short) 10, 100L };
        double[] doubleArray22 = new double[] { (short) 10, 100L };
        double[][] doubleArray23 = new double[][] { doubleArray13, doubleArray16, doubleArray19, doubleArray22 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl24 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray23);
        java.math.BigDecimal bigDecimal25 = bigMatrixImpl24.getNorm();
        double[] doubleArray28 = new double[] { (short) 10, 100L };
        double[] doubleArray31 = new double[] { (short) 10, 100L };
        double[] doubleArray34 = new double[] { (short) 10, 100L };
        double[] doubleArray37 = new double[] { (short) 10, 100L };
        double[][] doubleArray38 = new double[][] { doubleArray28, doubleArray31, doubleArray34, doubleArray37 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray38);
        java.math.BigDecimal[][] bigDecimalArray40 = bigMatrixImpl39.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray40);
        java.math.BigDecimal bigDecimal42 = bigMatrixImpl41.getNorm();
        java.math.BigDecimal[] bigDecimalArray43 = new java.math.BigDecimal[] { bigDecimal25, bigDecimal42 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray43);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray46 = bigMatrixImpl0.preMultiply(bigDecimalArray43);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = bigMatrixImpl0.getEntryAsDouble((int) (byte) 100, (int) (byte) 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = bigMatrixImpl0.copy();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setScale((int) (short) 100);
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[][] doubleArray18 = new double[][] { doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal bigDecimal20 = bigMatrixImpl19.getNorm();
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[] doubleArray26 = new double[] { (short) 10, 100L };
        double[] doubleArray29 = new double[] { (short) 10, 100L };
        double[] doubleArray32 = new double[] { (short) 10, 100L };
        double[][] doubleArray33 = new double[][] { doubleArray23, doubleArray26, doubleArray29, doubleArray32 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray33);
        double[][] doubleArray35 = bigMatrixImpl34.getDataAsDoubleArray();
        bigMatrixImpl34.setRoundingMode(100);
        org.apache.commons.math.linear.BigMatrix bigMatrix38 = bigMatrixImpl19.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl34);
        double[] doubleArray40 = bigMatrixImpl34.getColumnAsDoubleArray(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray41 = bigMatrixImpl0.operate(doubleArray40);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setScale((int) (short) 100);
        java.lang.String str6 = bigMatrixImpl0.toString();
        double[] doubleArray9 = new double[] { (short) 10, 100L };
        double[] doubleArray12 = new double[] { (short) 10, 100L };
        double[] doubleArray15 = new double[] { (short) 10, 100L };
        double[] doubleArray18 = new double[] { (short) 10, 100L };
        double[][] doubleArray19 = new double[][] { doubleArray9, doubleArray12, doubleArray15, doubleArray18 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray19);
        java.math.BigDecimal[][] bigDecimalArray21 = bigMatrixImpl20.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray21);
        double[] doubleArray25 = new double[] { (short) 10, 100L };
        double[] doubleArray28 = new double[] { (short) 10, 100L };
        double[] doubleArray31 = new double[] { (short) 10, 100L };
        double[] doubleArray34 = new double[] { (short) 10, 100L };
        double[][] doubleArray35 = new double[][] { doubleArray25, doubleArray28, doubleArray31, doubleArray34 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl36 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray35);
        java.math.BigDecimal[][] bigDecimalArray37 = bigMatrixImpl36.getData();
        boolean boolean38 = bigMatrixImpl22.equals((java.lang.Object) bigMatrixImpl36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix39 = bigMatrixImpl0.add((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl22);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(0);
        int int9 = bigMatrixImpl0.getScale();
        double[] doubleArray12 = new double[] { (short) 10, 100L };
        double[] doubleArray15 = new double[] { (short) 10, 100L };
        double[] doubleArray18 = new double[] { (short) 10, 100L };
        double[] doubleArray21 = new double[] { (short) 10, 100L };
        double[][] doubleArray22 = new double[][] { doubleArray12, doubleArray15, doubleArray18, doubleArray21 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl23 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray22);
        java.math.BigDecimal bigDecimal24 = bigMatrixImpl23.getNorm();
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[] doubleArray30 = new double[] { (short) 10, 100L };
        double[] doubleArray33 = new double[] { (short) 10, 100L };
        double[] doubleArray36 = new double[] { (short) 10, 100L };
        double[][] doubleArray37 = new double[][] { doubleArray27, doubleArray30, doubleArray33, doubleArray36 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl38 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray37);
        java.math.BigDecimal[][] bigDecimalArray39 = bigMatrixImpl38.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray39);
        java.math.BigDecimal bigDecimal41 = bigMatrixImpl40.getNorm();
        java.math.BigDecimal[] bigDecimalArray42 = new java.math.BigDecimal[] { bigDecimal24, bigDecimal41 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray42);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray42);
        double[] doubleArray47 = new double[] { (short) 10, 100L };
        double[] doubleArray50 = new double[] { (short) 10, 100L };
        double[] doubleArray53 = new double[] { (short) 10, 100L };
        double[] doubleArray56 = new double[] { (short) 10, 100L };
        double[][] doubleArray57 = new double[][] { doubleArray47, doubleArray50, doubleArray53, doubleArray56 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl58 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray57);
        java.math.BigDecimal[][] bigDecimalArray59 = bigMatrixImpl58.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl60 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray59);
        java.math.BigDecimal bigDecimal61 = bigMatrixImpl60.getNorm();
        java.math.BigDecimal[][] bigDecimalArray62 = bigMatrixImpl60.getDataRef();
        int int63 = bigMatrixImpl60.getColumnDimension();
        java.math.BigDecimal bigDecimal64 = bigMatrixImpl60.getNorm();
        double[] doubleArray67 = new double[] { (short) 10, 100L };
        double[] doubleArray70 = new double[] { (short) 10, 100L };
        double[] doubleArray73 = new double[] { (short) 10, 100L };
        double[] doubleArray76 = new double[] { (short) 10, 100L };
        double[][] doubleArray77 = new double[][] { doubleArray67, doubleArray70, doubleArray73, doubleArray76 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl78 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray77);
        java.math.BigDecimal bigDecimal79 = bigMatrixImpl78.getNorm();
        java.math.BigDecimal[] bigDecimalArray80 = new java.math.BigDecimal[] { bigDecimal64, bigDecimal79 };
        java.math.BigDecimal[] bigDecimalArray81 = bigMatrixImpl44.preMultiply(bigDecimalArray80);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray82 = bigMatrixImpl0.preMultiply(bigDecimalArray80);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode((int) '4');
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[][] doubleArray21 = new double[][] { doubleArray11, doubleArray14, doubleArray17, doubleArray20 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray21);
        java.math.BigDecimal bigDecimal23 = bigMatrixImpl22.getNorm();
        double[] doubleArray26 = new double[] { (short) 10, 100L };
        double[] doubleArray29 = new double[] { (short) 10, 100L };
        double[] doubleArray32 = new double[] { (short) 10, 100L };
        double[] doubleArray35 = new double[] { (short) 10, 100L };
        double[][] doubleArray36 = new double[][] { doubleArray26, doubleArray29, doubleArray32, doubleArray35 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray36);
        java.math.BigDecimal[][] bigDecimalArray38 = bigMatrixImpl37.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray38);
        java.math.BigDecimal bigDecimal40 = bigMatrixImpl39.getNorm();
        java.math.BigDecimal[] bigDecimalArray41 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal40 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl42 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray41);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray41);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray45 = bigMatrixImpl0.operate(bigDecimalArray41);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        bigMatrixImpl0.setScale((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal8 = bigMatrixImpl0.getNorm();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(0);
        int int9 = bigMatrixImpl0.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        bigMatrixImpl0.luDecompose();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        int int4 = bigMatrixImpl0.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = bigMatrixImpl0.isSquare();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(100);
        boolean boolean10 = bigMatrixImpl0.equals((java.lang.Object) 0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = bigMatrixImpl0.isSquare();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal11 = bigMatrixImpl0.getEntry((int) (short) 0, (int) ' ');
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode(4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = bigMatrixImpl0.isSingular();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(0);
        int int9 = bigMatrixImpl0.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = bigMatrixImpl0.getRowAsDoubleArray((int) (byte) 100);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) (short) 100);
        bigMatrixImpl0.setRoundingMode((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray10 = bigMatrixImpl0.getRow((int) (byte) 1);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode(4);
        int int3 = bigMatrixImpl0.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray5 = bigMatrixImpl0.getColumn((int) (short) 100);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setScale((int) (short) 100);
        java.lang.String str6 = bigMatrixImpl0.toString();
        int int7 = bigMatrixImpl0.getScale();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = bigMatrixImpl0.getColumnMatrix((int) '#');
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode(4);
        int int3 = bigMatrixImpl0.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal4 = bigMatrixImpl0.getDeterminant();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        int int6 = bigMatrixImpl0.getScale();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = bigMatrixImpl0.inverse();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        double[] doubleArray9 = new double[] { (short) 10, 100L };
        double[] doubleArray12 = new double[] { (short) 10, 100L };
        double[] doubleArray15 = new double[] { (short) 10, 100L };
        double[] doubleArray18 = new double[] { (short) 10, 100L };
        double[][] doubleArray19 = new double[][] { doubleArray9, doubleArray12, doubleArray15, doubleArray18 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray19);
        java.math.BigDecimal bigDecimal21 = bigMatrixImpl20.getNorm();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = bigMatrixImpl0.scalarAdd(bigDecimal21);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        java.math.BigDecimal[][] bigDecimalArray6 = bigMatrixImpl0.getDataRef();
        int int7 = bigMatrixImpl0.getRoundingMode();
        boolean boolean9 = bigMatrixImpl0.equals((java.lang.Object) (byte) -1);
        int int10 = bigMatrixImpl0.getScale();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = bigMatrixImpl0.getColumnAsDoubleArray((int) (byte) 100);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        java.math.BigDecimal[][] bigDecimalArray6 = bigMatrixImpl0.getDataRef();
        int int7 = bigMatrixImpl0.getRoundingMode();
        boolean boolean9 = bigMatrixImpl0.equals((java.lang.Object) (byte) -1);
        int int10 = bigMatrixImpl0.getScale();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        bigMatrixImpl0.luDecompose();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) ' ', (int) (byte) 100);
        int int3 = bigMatrixImpl2.getRoundingMode();
        double[] doubleArray6 = new double[] { (short) 10, 100L };
        double[] doubleArray9 = new double[] { (short) 10, 100L };
        double[] doubleArray12 = new double[] { (short) 10, 100L };
        double[] doubleArray15 = new double[] { (short) 10, 100L };
        double[][] doubleArray16 = new double[][] { doubleArray6, doubleArray9, doubleArray12, doubleArray15 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray16);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getData();
        java.math.BigDecimal[][] bigDecimalArray19 = bigMatrixImpl17.getData();
        bigMatrixImpl2.setSubMatrix(bigDecimalArray19, 4, 0);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl23 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(100);
        int int9 = bigMatrixImpl0.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = bigMatrixImpl0.isSquare();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) (short) 100);
        bigMatrixImpl0.setRoundingMode((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = bigMatrixImpl0.isSquare();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        int int4 = bigMatrixImpl0.getRoundingMode();
        double[] doubleArray7 = new double[] { (short) 10, 100L };
        double[] doubleArray10 = new double[] { (short) 10, 100L };
        double[] doubleArray13 = new double[] { (short) 10, 100L };
        double[] doubleArray16 = new double[] { (short) 10, 100L };
        double[][] doubleArray17 = new double[][] { doubleArray7, doubleArray10, doubleArray13, doubleArray16 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray17);
        java.math.BigDecimal bigDecimal19 = bigMatrixImpl18.getNorm();
        double[] doubleArray22 = new double[] { (short) 10, 100L };
        double[] doubleArray25 = new double[] { (short) 10, 100L };
        double[] doubleArray28 = new double[] { (short) 10, 100L };
        double[] doubleArray31 = new double[] { (short) 10, 100L };
        double[][] doubleArray32 = new double[][] { doubleArray22, doubleArray25, doubleArray28, doubleArray31 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray32);
        java.math.BigDecimal[][] bigDecimalArray34 = bigMatrixImpl33.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl35 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray34);
        java.math.BigDecimal bigDecimal36 = bigMatrixImpl35.getNorm();
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal36 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl38 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray37);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray37);
        double[] doubleArray42 = new double[] { (short) 10, 100L };
        double[] doubleArray45 = new double[] { (short) 10, 100L };
        double[] doubleArray48 = new double[] { (short) 10, 100L };
        double[] doubleArray51 = new double[] { (short) 10, 100L };
        double[][] doubleArray52 = new double[][] { doubleArray42, doubleArray45, doubleArray48, doubleArray51 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl53 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray52);
        java.math.BigDecimal[][] bigDecimalArray54 = bigMatrixImpl53.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl55 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray54);
        java.math.BigDecimal bigDecimal56 = bigMatrixImpl55.getNorm();
        java.math.BigDecimal[][] bigDecimalArray57 = bigMatrixImpl55.getDataRef();
        int int58 = bigMatrixImpl55.getColumnDimension();
        java.math.BigDecimal bigDecimal59 = bigMatrixImpl55.getNorm();
        double[] doubleArray62 = new double[] { (short) 10, 100L };
        double[] doubleArray65 = new double[] { (short) 10, 100L };
        double[] doubleArray68 = new double[] { (short) 10, 100L };
        double[] doubleArray71 = new double[] { (short) 10, 100L };
        double[][] doubleArray72 = new double[][] { doubleArray62, doubleArray65, doubleArray68, doubleArray71 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl73 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray72);
        java.math.BigDecimal bigDecimal74 = bigMatrixImpl73.getNorm();
        java.math.BigDecimal[] bigDecimalArray75 = new java.math.BigDecimal[] { bigDecimal59, bigDecimal74 };
        java.math.BigDecimal[] bigDecimalArray76 = bigMatrixImpl39.preMultiply(bigDecimalArray75);
        double[] doubleArray79 = new double[] { (short) 10, 100L };
        double[] doubleArray82 = new double[] { (short) 10, 100L };
        double[] doubleArray85 = new double[] { (short) 10, 100L };
        double[] doubleArray88 = new double[] { (short) 10, 100L };
        double[][] doubleArray89 = new double[][] { doubleArray79, doubleArray82, doubleArray85, doubleArray88 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl90 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray89);
        java.math.BigDecimal[][] bigDecimalArray91 = bigMatrixImpl90.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl92 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray91);
        java.math.BigDecimal bigDecimal93 = bigMatrixImpl92.getNorm();
        java.math.BigDecimal[][] bigDecimalArray94 = bigMatrixImpl92.getDataRef();
        int int95 = bigMatrixImpl92.getColumnDimension();
        java.math.BigDecimal bigDecimal96 = bigMatrixImpl92.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix97 = bigMatrixImpl39.scalarMultiply(bigDecimal96);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix98 = bigMatrixImpl0.scalarAdd(bigDecimal96);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bigMatrixImpl0.getColumnAsDoubleArray(0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        double[][] doubleArray16 = bigMatrixImpl15.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = bigMatrixImpl17.copy();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl19.setRoundingMode((int) 'a');
        java.lang.String str22 = bigMatrixImpl19.toString();
        int int23 = bigMatrixImpl19.getRoundingMode();
        bigMatrixImpl19.setRoundingMode((int) ' ');
        bigMatrixImpl19.setRoundingMode((int) '4');
        bigMatrixImpl19.setRoundingMode((int) (short) 100);
        java.lang.String str30 = bigMatrixImpl19.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix31 = bigMatrixImpl17.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl19);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) ' ', (int) (byte) 100);
        boolean boolean3 = bigMatrixImpl2.isSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal4 = bigMatrixImpl2.getNorm();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[][] doubleArray18 = new double[][] { doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal[][] bigDecimalArray20 = bigMatrixImpl19.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray20);
        double[][] doubleArray22 = bigMatrixImpl21.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl23 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray22);
        org.apache.commons.math.linear.BigMatrix bigMatrix24 = bigMatrixImpl23.copy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix25 = bigMatrixImpl0.multiply(bigMatrix24);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode((int) '4');
        bigMatrixImpl0.setRoundingMode((int) (short) 100);
        java.lang.String str11 = bigMatrixImpl0.toString();
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[][] doubleArray24 = new double[][] { doubleArray14, doubleArray17, doubleArray20, doubleArray23 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray24);
        double[][] doubleArray26 = bigMatrixImpl25.getDataAsDoubleArray();
        bigMatrixImpl25.setRoundingMode(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix29 = bigMatrixImpl0.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl25);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        java.math.BigDecimal[][] bigDecimalArray6 = bigMatrixImpl0.getDataRef();
        int int7 = bigMatrixImpl0.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = bigMatrixImpl0.isSingular();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[][] bigDecimalArray3 = bigMatrixImpl0.getData();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(100);
        boolean boolean10 = bigMatrixImpl0.equals((java.lang.Object) 0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray12 = bigMatrixImpl0.getColumn(32);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode((int) '4');
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[][] doubleArray21 = new double[][] { doubleArray11, doubleArray14, doubleArray17, doubleArray20 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray21);
        java.math.BigDecimal[][] bigDecimalArray23 = bigMatrixImpl22.getData();
        java.math.BigDecimal[][] bigDecimalArray24 = bigMatrixImpl22.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        int int26 = bigMatrixImpl25.getColumnDimension();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean27 = bigMatrixImpl0.equals((java.lang.Object) bigMatrixImpl25);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) ' ', (int) (byte) 100);
        int int3 = bigMatrixImpl2.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray4 = bigMatrixImpl2.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = bigMatrixImpl2.getEntryAsDouble((int) (short) 10, (int) (byte) 0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[][] doubleArray18 = new double[][] { doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal[][] bigDecimalArray20 = bigMatrixImpl19.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray20);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray20);
        bigMatrixImpl22.setRoundingMode((int) (short) 100);
        org.apache.commons.math.linear.BigMatrix bigMatrix25 = bigMatrixImpl22.copy();
        java.lang.String str26 = bigMatrixImpl22.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix27 = bigMatrixImpl0.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl22);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal3 = bigMatrixImpl0.getTrace();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode(100);
        java.math.BigDecimal[][] bigDecimalArray3 = bigMatrixImpl0.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix4 = bigMatrixImpl0.inverse();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) ' ', (int) (byte) 100);
        int int3 = bigMatrixImpl2.getColumnDimension();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal4 = bigMatrixImpl2.getNorm();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        java.math.BigDecimal[][] bigDecimalArray6 = bigMatrixImpl0.getDataRef();
        int int7 = bigMatrixImpl0.getRoundingMode();
        boolean boolean9 = bigMatrixImpl0.equals((java.lang.Object) (byte) -1);
        int int10 = bigMatrixImpl0.getScale();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal13 = bigMatrixImpl0.getEntry((int) '4', 2);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode(100);
        java.math.BigDecimal[][] bigDecimalArray3 = bigMatrixImpl0.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal6 = bigMatrixImpl0.getEntry((int) 'a', (int) 'a');
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal4 = bigMatrixImpl0.getTrace();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = bigMatrixImpl0.getRowAsDoubleArray((int) 'a');
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) (short) 100);
        bigMatrixImpl0.setRoundingMode((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = bigMatrixImpl0.inverse();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(0);
        java.math.BigDecimal[][] bigDecimalArray9 = bigMatrixImpl0.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = bigMatrixImpl0.getRowDimension();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode(4);
        int int3 = bigMatrixImpl0.getRoundingMode();
        double[] doubleArray6 = new double[] { (short) 10, 100L };
        double[] doubleArray9 = new double[] { (short) 10, 100L };
        double[] doubleArray12 = new double[] { (short) 10, 100L };
        double[] doubleArray15 = new double[] { (short) 10, 100L };
        double[][] doubleArray16 = new double[][] { doubleArray6, doubleArray9, doubleArray12, doubleArray15 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray16);
        double[][] doubleArray18 = bigMatrixImpl17.getDataAsDoubleArray();
        bigMatrixImpl17.setRoundingMode(100);
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[] doubleArray26 = new double[] { (short) 10, 100L };
        double[] doubleArray29 = new double[] { (short) 10, 100L };
        double[] doubleArray32 = new double[] { (short) 10, 100L };
        double[][] doubleArray33 = new double[][] { doubleArray23, doubleArray26, doubleArray29, doubleArray32 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray33);
        org.apache.commons.math.linear.BigMatrix bigMatrix35 = bigMatrixImpl34.copy();
        org.apache.commons.math.linear.BigMatrix bigMatrix36 = bigMatrixImpl17.subtract(bigMatrix35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix37 = bigMatrixImpl0.solve((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl17);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        int int1 = bigMatrixImpl0.getScale();
        double[] doubleArray4 = new double[] { (short) 10, 100L };
        double[] doubleArray7 = new double[] { (short) 10, 100L };
        double[] doubleArray10 = new double[] { (short) 10, 100L };
        double[] doubleArray13 = new double[] { (short) 10, 100L };
        double[][] doubleArray14 = new double[][] { doubleArray4, doubleArray7, doubleArray10, doubleArray13 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray14);
        java.math.BigDecimal[][] bigDecimalArray16 = bigMatrixImpl15.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray16);
        java.math.BigDecimal bigDecimal18 = bigMatrixImpl17.getNorm();
        java.math.BigDecimal[][] bigDecimalArray19 = bigMatrixImpl17.getDataRef();
        int int20 = bigMatrixImpl17.getColumnDimension();
        java.math.BigDecimal bigDecimal21 = bigMatrixImpl17.getNorm();
        java.math.BigDecimal[][] bigDecimalArray22 = bigMatrixImpl17.getDataRef();
        bigMatrixImpl17.setRoundingMode((int) (byte) 10);
        double[] doubleArray26 = bigMatrixImpl17.getRowAsDoubleArray((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray27 = bigMatrixImpl0.operate(doubleArray26);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal7 = bigMatrixImpl0.getTrace();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        java.math.BigDecimal[][] bigDecimalArray6 = bigMatrixImpl0.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = bigMatrixImpl0.getColumnMatrix(0);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        int int1 = bigMatrixImpl0.getScale();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = bigMatrixImpl0.getColumnAsDoubleArray((-1));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setScale((int) (short) 100);
        java.lang.String str6 = bigMatrixImpl0.toString();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl9 = new org.apache.commons.math.linear.BigMatrixImpl((int) (byte) 100, (int) (byte) 10);
        int int10 = bigMatrixImpl9.getScale();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = bigMatrixImpl0.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl9);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        bigMatrixImpl0.setScale((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = bigMatrixImpl0.getEntryAsDouble((int) (short) -1, 0);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode(100);
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[][] doubleArray15 = new double[][] { doubleArray5, doubleArray8, doubleArray11, doubleArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray15);
        java.math.BigDecimal[][] bigDecimalArray17 = bigMatrixImpl16.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray17);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray17);
        bigMatrixImpl19.setRoundingMode((int) (short) 100);
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = bigMatrixImpl19.copy();
        org.apache.commons.math.linear.BigMatrix bigMatrix23 = bigMatrixImpl19.copy();
        double[] doubleArray25 = bigMatrixImpl19.getColumnAsDoubleArray((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray26 = bigMatrixImpl0.solve(doubleArray25);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode(4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix3 = bigMatrixImpl0.inverse();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        int int6 = bigMatrixImpl0.getScale();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = bigMatrixImpl0.getSubMatrix((int) (byte) 1, (int) (short) 1, 1, (int) (byte) 10);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        int int6 = bigMatrixImpl0.getScale();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = bigMatrixImpl0.copy();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setScale((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal9 = bigMatrixImpl0.getNorm();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) (short) 100);
        bigMatrixImpl0.setRoundingMode((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = bigMatrixImpl0.copy();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        int int1 = bigMatrixImpl0.getScale();
        double[] doubleArray4 = new double[] { (short) 10, 100L };
        double[] doubleArray7 = new double[] { (short) 10, 100L };
        double[] doubleArray10 = new double[] { (short) 10, 100L };
        double[] doubleArray13 = new double[] { (short) 10, 100L };
        double[][] doubleArray14 = new double[][] { doubleArray4, doubleArray7, doubleArray10, doubleArray13 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray14);
        java.math.BigDecimal bigDecimal16 = bigMatrixImpl15.getNorm();
        double[] doubleArray19 = new double[] { (short) 10, 100L };
        double[] doubleArray22 = new double[] { (short) 10, 100L };
        double[] doubleArray25 = new double[] { (short) 10, 100L };
        double[] doubleArray28 = new double[] { (short) 10, 100L };
        double[][] doubleArray29 = new double[][] { doubleArray19, doubleArray22, doubleArray25, doubleArray28 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl30 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray29);
        double[][] doubleArray31 = bigMatrixImpl30.getDataAsDoubleArray();
        bigMatrixImpl30.setRoundingMode(100);
        org.apache.commons.math.linear.BigMatrix bigMatrix34 = bigMatrixImpl15.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl30);
        double[] doubleArray36 = bigMatrixImpl30.getColumnAsDoubleArray(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray37 = bigMatrixImpl0.operate(doubleArray36);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        double[] doubleArray9 = new double[] { (short) 10, 100L };
        double[] doubleArray12 = new double[] { (short) 10, 100L };
        double[] doubleArray15 = new double[] { (short) 10, 100L };
        double[] doubleArray18 = new double[] { (short) 10, 100L };
        double[][] doubleArray19 = new double[][] { doubleArray9, doubleArray12, doubleArray15, doubleArray18 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray19);
        java.math.BigDecimal bigDecimal21 = bigMatrixImpl20.getNorm();
        double[] doubleArray24 = new double[] { (short) 10, 100L };
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[] doubleArray30 = new double[] { (short) 10, 100L };
        double[] doubleArray33 = new double[] { (short) 10, 100L };
        double[][] doubleArray34 = new double[][] { doubleArray24, doubleArray27, doubleArray30, doubleArray33 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl35 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray34);
        java.math.BigDecimal[][] bigDecimalArray36 = bigMatrixImpl35.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray36);
        java.math.BigDecimal bigDecimal38 = bigMatrixImpl37.getNorm();
        java.math.BigDecimal[] bigDecimalArray39 = new java.math.BigDecimal[] { bigDecimal21, bigDecimal38 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray39);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray39);
        double[] doubleArray44 = new double[] { (short) 10, 100L };
        double[] doubleArray47 = new double[] { (short) 10, 100L };
        double[] doubleArray50 = new double[] { (short) 10, 100L };
        double[] doubleArray53 = new double[] { (short) 10, 100L };
        double[][] doubleArray54 = new double[][] { doubleArray44, doubleArray47, doubleArray50, doubleArray53 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl55 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray54);
        java.math.BigDecimal[][] bigDecimalArray56 = bigMatrixImpl55.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl57 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray56);
        java.math.BigDecimal bigDecimal58 = bigMatrixImpl57.getNorm();
        java.math.BigDecimal[][] bigDecimalArray59 = bigMatrixImpl57.getDataRef();
        int int60 = bigMatrixImpl57.getColumnDimension();
        java.math.BigDecimal bigDecimal61 = bigMatrixImpl57.getNorm();
        double[] doubleArray64 = new double[] { (short) 10, 100L };
        double[] doubleArray67 = new double[] { (short) 10, 100L };
        double[] doubleArray70 = new double[] { (short) 10, 100L };
        double[] doubleArray73 = new double[] { (short) 10, 100L };
        double[][] doubleArray74 = new double[][] { doubleArray64, doubleArray67, doubleArray70, doubleArray73 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl75 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray74);
        java.math.BigDecimal bigDecimal76 = bigMatrixImpl75.getNorm();
        java.math.BigDecimal[] bigDecimalArray77 = new java.math.BigDecimal[] { bigDecimal61, bigDecimal76 };
        java.math.BigDecimal[] bigDecimalArray78 = bigMatrixImpl41.preMultiply(bigDecimalArray77);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl79 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray77);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray80 = bigMatrixImpl0.preMultiply(bigDecimalArray77);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        bigMatrixImpl0.luDecompose();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        bigMatrixImpl13.setRoundingMode((int) (byte) 0);
        java.math.BigDecimal[][] bigDecimalArray17 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray17);
        double[] doubleArray21 = new double[] { (short) 10, 100L };
        double[] doubleArray24 = new double[] { (short) 10, 100L };
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[] doubleArray30 = new double[] { (short) 10, 100L };
        double[][] doubleArray31 = new double[][] { doubleArray21, doubleArray24, doubleArray27, doubleArray30 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl32 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray31);
        java.math.BigDecimal[][] bigDecimalArray33 = bigMatrixImpl32.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33);
        java.math.BigDecimal bigDecimal35 = bigMatrixImpl34.getNorm();
        java.math.BigDecimal[][] bigDecimalArray36 = bigMatrixImpl34.getDataRef();
        double[] doubleArray39 = new double[] { (short) 10, 100L };
        double[] doubleArray42 = new double[] { (short) 10, 100L };
        double[] doubleArray45 = new double[] { (short) 10, 100L };
        double[] doubleArray48 = new double[] { (short) 10, 100L };
        double[][] doubleArray49 = new double[][] { doubleArray39, doubleArray42, doubleArray45, doubleArray48 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl50 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray49);
        java.math.BigDecimal[][] bigDecimalArray51 = bigMatrixImpl50.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl52 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray51);
        java.math.BigDecimal bigDecimal53 = bigMatrixImpl52.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix54 = bigMatrixImpl34.scalarMultiply(bigDecimal53);
        org.apache.commons.math.linear.BigMatrix bigMatrix55 = bigMatrixImpl18.scalarMultiply(bigDecimal53);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl56 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl56.setRoundingMode((int) 'a');
        java.lang.String str59 = bigMatrixImpl56.toString();
        int int60 = bigMatrixImpl56.getRoundingMode();
        bigMatrixImpl56.setRoundingMode((int) ' ');
        bigMatrixImpl56.setRoundingMode(0);
        int int65 = bigMatrixImpl56.getScale();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix66 = bigMatrixImpl18.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl56);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        bigMatrixImpl13.setRoundingMode((int) (byte) 0);
        java.math.BigDecimal[][] bigDecimalArray17 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray17);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray17);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl20.setRoundingMode((int) 'a');
        boolean boolean23 = bigMatrixImpl19.equals((java.lang.Object) 'a');
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on bigMatrixImpl13 and bigMatrixImpl20.", bigMatrixImpl13.equals(bigMatrixImpl20) == bigMatrixImpl20.equals(bigMatrixImpl13));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setScale((int) (short) 100);
        java.lang.String str6 = bigMatrixImpl0.toString();
        double[] doubleArray9 = new double[] { (short) 10, 100L };
        double[] doubleArray12 = new double[] { (short) 10, 100L };
        double[] doubleArray15 = new double[] { (short) 10, 100L };
        double[] doubleArray18 = new double[] { (short) 10, 100L };
        double[][] doubleArray19 = new double[][] { doubleArray9, doubleArray12, doubleArray15, doubleArray18 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray19);
        java.math.BigDecimal[][] bigDecimalArray21 = bigMatrixImpl20.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray21);
        java.math.BigDecimal bigDecimal23 = bigMatrixImpl22.getNorm();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix24 = bigMatrixImpl0.scalarAdd(bigDecimal23);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray8 = bigMatrixImpl0.getRow((int) (short) 1);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        java.lang.String str4 = bigMatrixImpl0.toString();
        java.lang.String str5 = bigMatrixImpl0.toString();
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[][] doubleArray18 = new double[][] { doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal[][] bigDecimalArray20 = bigMatrixImpl19.getData();
        bigMatrixImpl19.setRoundingMode((int) (byte) 0);
        java.math.BigDecimal[][] bigDecimalArray23 = bigMatrixImpl19.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl24 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix25 = bigMatrixImpl0.add((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl24);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[][] doubleArray15 = new double[][] { doubleArray5, doubleArray8, doubleArray11, doubleArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray15);
        double[][] doubleArray17 = bigMatrixImpl16.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray17);
        double[] doubleArray22 = new double[] { (short) 10, 100L };
        double[] doubleArray25 = new double[] { (short) 10, 100L };
        double[] doubleArray28 = new double[] { (short) 10, 100L };
        double[] doubleArray31 = new double[] { (short) 10, 100L };
        double[][] doubleArray32 = new double[][] { doubleArray22, doubleArray25, doubleArray28, doubleArray31 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray32);
        java.math.BigDecimal bigDecimal34 = bigMatrixImpl33.getNorm();
        double[] doubleArray37 = new double[] { (short) 10, 100L };
        double[] doubleArray40 = new double[] { (short) 10, 100L };
        double[] doubleArray43 = new double[] { (short) 10, 100L };
        double[] doubleArray46 = new double[] { (short) 10, 100L };
        double[][] doubleArray47 = new double[][] { doubleArray37, doubleArray40, doubleArray43, doubleArray46 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl48 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray47);
        java.math.BigDecimal[][] bigDecimalArray49 = bigMatrixImpl48.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl50 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray49);
        java.math.BigDecimal bigDecimal51 = bigMatrixImpl50.getNorm();
        java.math.BigDecimal[] bigDecimalArray52 = new java.math.BigDecimal[] { bigDecimal34, bigDecimal51 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl53 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray52);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl54 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray52);
        double[] doubleArray57 = new double[] { (short) 10, 100L };
        double[] doubleArray60 = new double[] { (short) 10, 100L };
        double[] doubleArray63 = new double[] { (short) 10, 100L };
        double[] doubleArray66 = new double[] { (short) 10, 100L };
        double[][] doubleArray67 = new double[][] { doubleArray57, doubleArray60, doubleArray63, doubleArray66 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl68 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray67);
        java.math.BigDecimal[][] bigDecimalArray69 = bigMatrixImpl68.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl70 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray69);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl71 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray69);
        org.apache.commons.math.linear.BigMatrix bigMatrix72 = bigMatrixImpl54.preMultiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl71);
        int int73 = bigMatrixImpl71.getRoundingMode();
        java.math.BigDecimal bigDecimal74 = bigMatrixImpl71.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix75 = bigMatrixImpl19.scalarAdd(bigDecimal74);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix76 = bigMatrixImpl0.subtract(bigMatrix75);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode(4);
        int int3 = bigMatrixImpl0.getRoundingMode();
        double[] doubleArray6 = new double[] { (short) 10, 100L };
        double[] doubleArray9 = new double[] { (short) 10, 100L };
        double[] doubleArray12 = new double[] { (short) 10, 100L };
        double[] doubleArray15 = new double[] { (short) 10, 100L };
        double[][] doubleArray16 = new double[][] { doubleArray6, doubleArray9, doubleArray12, doubleArray15 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray16);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray18);
        bigMatrixImpl20.setRoundingMode((int) (short) 100);
        double[] doubleArray25 = new double[] { (short) 10, 100L };
        double[] doubleArray28 = new double[] { (short) 10, 100L };
        double[] doubleArray31 = new double[] { (short) 10, 100L };
        double[] doubleArray34 = new double[] { (short) 10, 100L };
        double[][] doubleArray35 = new double[][] { doubleArray25, doubleArray28, doubleArray31, doubleArray34 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl36 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray35);
        java.math.BigDecimal[][] bigDecimalArray37 = bigMatrixImpl36.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl38 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray37);
        java.math.BigDecimal bigDecimal39 = bigMatrixImpl38.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix40 = bigMatrixImpl20.scalarAdd(bigDecimal39);
        double[] doubleArray43 = new double[] { (short) 10, 100L };
        double[] doubleArray46 = new double[] { (short) 10, 100L };
        double[] doubleArray49 = new double[] { (short) 10, 100L };
        double[] doubleArray52 = new double[] { (short) 10, 100L };
        double[][] doubleArray53 = new double[][] { doubleArray43, doubleArray46, doubleArray49, doubleArray52 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl54 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray53);
        java.math.BigDecimal[][] bigDecimalArray55 = bigMatrixImpl54.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl56 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray55);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl57 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray55);
        bigMatrixImpl57.setRoundingMode((int) (short) 100);
        org.apache.commons.math.linear.BigMatrix bigMatrix60 = bigMatrixImpl57.copy();
        org.apache.commons.math.linear.BigMatrix bigMatrix61 = bigMatrixImpl20.add((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl57);
        org.apache.commons.math.linear.BigMatrix bigMatrix62 = bigMatrixImpl20.copy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix63 = bigMatrixImpl0.multiply(bigMatrix62);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        bigMatrixImpl13.setRoundingMode((int) (byte) 0);
        java.math.BigDecimal[][] bigDecimalArray17 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray17);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl19.setRoundingMode((int) 'a');
        java.lang.String str22 = bigMatrixImpl19.toString();
        int int23 = bigMatrixImpl19.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray24 = bigMatrixImpl19.getDataRef();
        java.math.BigDecimal[][] bigDecimalArray25 = bigMatrixImpl19.getDataRef();
        int int26 = bigMatrixImpl19.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix27 = bigMatrixImpl18.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl19);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        java.math.BigDecimal[][] bigDecimalArray6 = bigMatrixImpl0.getDataRef();
        int int7 = bigMatrixImpl0.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal8 = bigMatrixImpl0.getTrace();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        double[] doubleArray9 = new double[] { (short) 10, 100L };
        double[] doubleArray12 = new double[] { (short) 10, 100L };
        double[] doubleArray15 = new double[] { (short) 10, 100L };
        double[] doubleArray18 = new double[] { (short) 10, 100L };
        double[][] doubleArray19 = new double[][] { doubleArray9, doubleArray12, doubleArray15, doubleArray18 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray19);
        java.math.BigDecimal bigDecimal21 = bigMatrixImpl20.getNorm();
        double[] doubleArray24 = new double[] { (short) 10, 100L };
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[] doubleArray30 = new double[] { (short) 10, 100L };
        double[] doubleArray33 = new double[] { (short) 10, 100L };
        double[][] doubleArray34 = new double[][] { doubleArray24, doubleArray27, doubleArray30, doubleArray33 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl35 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray34);
        java.math.BigDecimal[][] bigDecimalArray36 = bigMatrixImpl35.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray36);
        java.math.BigDecimal bigDecimal38 = bigMatrixImpl37.getNorm();
        java.math.BigDecimal[] bigDecimalArray39 = new java.math.BigDecimal[] { bigDecimal21, bigDecimal38 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray39);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray39);
        double[] doubleArray44 = new double[] { (short) 10, 100L };
        double[] doubleArray47 = new double[] { (short) 10, 100L };
        double[] doubleArray50 = new double[] { (short) 10, 100L };
        double[] doubleArray53 = new double[] { (short) 10, 100L };
        double[][] doubleArray54 = new double[][] { doubleArray44, doubleArray47, doubleArray50, doubleArray53 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl55 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray54);
        java.math.BigDecimal[][] bigDecimalArray56 = bigMatrixImpl55.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl57 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray56);
        java.math.BigDecimal bigDecimal58 = bigMatrixImpl57.getNorm();
        java.math.BigDecimal[][] bigDecimalArray59 = bigMatrixImpl57.getDataRef();
        int int60 = bigMatrixImpl57.getColumnDimension();
        java.math.BigDecimal bigDecimal61 = bigMatrixImpl57.getNorm();
        double[] doubleArray64 = new double[] { (short) 10, 100L };
        double[] doubleArray67 = new double[] { (short) 10, 100L };
        double[] doubleArray70 = new double[] { (short) 10, 100L };
        double[] doubleArray73 = new double[] { (short) 10, 100L };
        double[][] doubleArray74 = new double[][] { doubleArray64, doubleArray67, doubleArray70, doubleArray73 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl75 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray74);
        java.math.BigDecimal bigDecimal76 = bigMatrixImpl75.getNorm();
        java.math.BigDecimal[] bigDecimalArray77 = new java.math.BigDecimal[] { bigDecimal61, bigDecimal76 };
        java.math.BigDecimal[] bigDecimalArray78 = bigMatrixImpl41.preMultiply(bigDecimalArray77);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray79 = bigMatrixImpl0.solve(bigDecimalArray78);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(0);
        java.math.BigDecimal[][] bigDecimalArray9 = bigMatrixImpl0.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = bigMatrixImpl0.transpose();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) ' ', (int) (byte) 100);
        int int3 = bigMatrixImpl2.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray4 = bigMatrixImpl2.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal5 = bigMatrixImpl2.getNorm();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = bigMatrixImpl0.getRowMatrix(32);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        java.math.BigDecimal[][] bigDecimalArray6 = bigMatrixImpl0.getDataRef();
        int int7 = bigMatrixImpl0.getRoundingMode();
        boolean boolean9 = bigMatrixImpl0.equals((java.lang.Object) (byte) -1);
        int int10 = bigMatrixImpl0.getScale();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = bigMatrixImpl0.getColumnDimension();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        bigMatrixImpl0.setScale((int) (short) 100);
        double[] doubleArray10 = new double[] { (short) 10, 100L };
        double[] doubleArray13 = new double[] { (short) 10, 100L };
        double[] doubleArray16 = new double[] { (short) 10, 100L };
        double[] doubleArray19 = new double[] { (short) 10, 100L };
        double[][] doubleArray20 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray20);
        java.math.BigDecimal[][] bigDecimalArray22 = bigMatrixImpl21.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl23 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray22);
        java.math.BigDecimal bigDecimal24 = bigMatrixImpl23.getNorm();
        java.math.BigDecimal[][] bigDecimalArray25 = bigMatrixImpl23.getDataRef();
        int int26 = bigMatrixImpl23.getColumnDimension();
        java.math.BigDecimal bigDecimal27 = bigMatrixImpl23.getNorm();
        java.math.BigDecimal[][] bigDecimalArray28 = bigMatrixImpl23.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl29 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix30 = bigMatrixImpl0.preMultiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl29);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        bigMatrixImpl16.setRoundingMode((int) (short) 100);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = bigMatrixImpl16.copy();
        java.lang.String str20 = bigMatrixImpl16.toString();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl21.setRoundingMode((int) 'a');
        java.lang.String str24 = bigMatrixImpl21.toString();
        int int25 = bigMatrixImpl21.getRoundingMode();
        bigMatrixImpl21.setRoundingMode((int) ' ');
        bigMatrixImpl21.setScale((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix30 = bigMatrixImpl16.add((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl21);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        java.lang.String str4 = bigMatrixImpl0.toString();
        java.lang.String str5 = bigMatrixImpl0.toString();
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[][] doubleArray18 = new double[][] { doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        double[][] doubleArray20 = bigMatrixImpl19.getDataAsDoubleArray();
        java.math.BigDecimal[] bigDecimalArray22 = bigMatrixImpl19.getRow(0);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl23 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray24 = bigMatrixImpl0.operate(bigDecimalArray22);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(0);
        int int9 = bigMatrixImpl0.getRoundingMode();
        int[] intArray16 = new int[] { 32, (short) -1, (byte) 1, (short) 10, (byte) 1, (byte) -1 };
        int[] intArray20 = new int[] { 100, 2, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = bigMatrixImpl0.getSubMatrix(intArray16, intArray20);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = bigMatrixImpl0.copy();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        java.math.BigDecimal bigDecimal16 = bigMatrixImpl15.getNorm();
        java.math.BigDecimal[][] bigDecimalArray17 = bigMatrixImpl15.getDataRef();
        int int18 = bigMatrixImpl15.getColumnDimension();
        java.math.BigDecimal bigDecimal19 = bigMatrixImpl15.getNorm();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl20.setRoundingMode((int) 'a');
        java.lang.String str23 = bigMatrixImpl20.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix24 = bigMatrixImpl15.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl20);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setScale((int) (short) 100);
        java.lang.String str6 = bigMatrixImpl0.toString();
        int int7 = bigMatrixImpl0.getScale();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[][] bigDecimalArray8 = bigMatrixImpl0.getData();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode(4);
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[][] doubleArray15 = new double[][] { doubleArray5, doubleArray8, doubleArray11, doubleArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray15);
        java.math.BigDecimal[][] bigDecimalArray17 = bigMatrixImpl16.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray17);
        java.math.BigDecimal bigDecimal19 = bigMatrixImpl18.getNorm();
        java.math.BigDecimal[][] bigDecimalArray20 = bigMatrixImpl18.getDataRef();
        int int21 = bigMatrixImpl18.getColumnDimension();
        java.math.BigDecimal bigDecimal22 = bigMatrixImpl18.getNorm();
        java.math.BigDecimal[][] bigDecimalArray23 = bigMatrixImpl18.getDataRef();
        bigMatrixImpl18.setRoundingMode((int) (byte) 10);
        double[] doubleArray27 = bigMatrixImpl18.getRowAsDoubleArray((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray28 = bigMatrixImpl0.operate(doubleArray27);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = bigMatrixImpl0.getRowDimension();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(100, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bigMatrixImpl2.getRowAsDoubleArray(4);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[][] doubleArray18 = new double[][] { doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        double[][] doubleArray20 = bigMatrixImpl19.getDataAsDoubleArray();
        bigMatrixImpl19.setRoundingMode(100);
        org.apache.commons.math.linear.BigMatrix bigMatrix23 = bigMatrixImpl19.transpose();
        double[] doubleArray25 = bigMatrixImpl19.getRowAsDoubleArray((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray26 = bigMatrixImpl0.operate(doubleArray25);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode((int) '4');
        bigMatrixImpl0.setRoundingMode((int) (short) 100);
        java.lang.String str11 = bigMatrixImpl0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = bigMatrixImpl0.isSquare();
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        java.math.BigDecimal[][] bigDecimalArray15 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray15);
        int int17 = bigMatrixImpl16.getRoundingMode();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl18.setRoundingMode((int) 'a');
        java.lang.String str21 = bigMatrixImpl18.toString();
        int int22 = bigMatrixImpl18.getRoundingMode();
        bigMatrixImpl18.setRoundingMode((int) ' ');
        bigMatrixImpl18.setRoundingMode(100);
        boolean boolean28 = bigMatrixImpl18.equals((java.lang.Object) 0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix29 = bigMatrixImpl16.solve((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl18);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        int int1 = bigMatrixImpl0.getScale();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal2 = bigMatrixImpl0.getTrace();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(0);
        int int9 = bigMatrixImpl0.getScale();
        double[] doubleArray12 = new double[] { (short) 10, 100L };
        double[] doubleArray15 = new double[] { (short) 10, 100L };
        double[] doubleArray18 = new double[] { (short) 10, 100L };
        double[] doubleArray21 = new double[] { (short) 10, 100L };
        double[][] doubleArray22 = new double[][] { doubleArray12, doubleArray15, doubleArray18, doubleArray21 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl23 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray22);
        java.math.BigDecimal[][] bigDecimalArray24 = bigMatrixImpl23.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl26 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        bigMatrixImpl26.setRoundingMode((int) (short) 100);
        org.apache.commons.math.linear.BigMatrix bigMatrix29 = bigMatrixImpl26.copy();
        org.apache.commons.math.linear.BigMatrix bigMatrix30 = bigMatrixImpl26.copy();
        double[] doubleArray32 = bigMatrixImpl26.getColumnAsDoubleArray((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray33 = bigMatrixImpl0.solve(doubleArray32);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        double[][] doubleArray14 = bigMatrixImpl13.getDataAsDoubleArray();
        bigMatrixImpl13.setRoundingMode(100);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = bigMatrixImpl13.transpose();
        double[] doubleArray19 = bigMatrixImpl13.getRowAsDoubleArray((int) (byte) 1);
        boolean boolean20 = bigMatrixImpl13.isSquare();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl21.setRoundingMode((int) 'a');
        java.lang.String str24 = bigMatrixImpl21.toString();
        int int25 = bigMatrixImpl21.getRoundingMode();
        bigMatrixImpl21.setRoundingMode((int) ' ');
        bigMatrixImpl21.setRoundingMode(0);
        java.math.BigDecimal[][] bigDecimalArray30 = bigMatrixImpl21.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix31 = bigMatrixImpl13.solve((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl21);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (byte) 1, (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double5 = bigMatrixImpl2.getEntryAsDouble(0, (int) (short) 1);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        double[] doubleArray3 = new double[] { (short) 10, 100L };
        double[] doubleArray6 = new double[] { (short) 10, 100L };
        double[] doubleArray9 = new double[] { (short) 10, 100L };
        double[] doubleArray12 = new double[] { (short) 10, 100L };
        double[][] doubleArray13 = new double[][] { doubleArray3, doubleArray6, doubleArray9, doubleArray12 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl14 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray13);
        java.math.BigDecimal bigDecimal15 = bigMatrixImpl14.getNorm();
        double[] doubleArray18 = new double[] { (short) 10, 100L };
        double[] doubleArray21 = new double[] { (short) 10, 100L };
        double[] doubleArray24 = new double[] { (short) 10, 100L };
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[][] doubleArray28 = new double[][] { doubleArray18, doubleArray21, doubleArray24, doubleArray27 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl29 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray28);
        java.math.BigDecimal[][] bigDecimalArray30 = bigMatrixImpl29.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl31 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray30);
        java.math.BigDecimal bigDecimal32 = bigMatrixImpl31.getNorm();
        java.math.BigDecimal[] bigDecimalArray33 = new java.math.BigDecimal[] { bigDecimal15, bigDecimal32 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl35 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33);
        double[] doubleArray38 = new double[] { (short) 10, 100L };
        double[] doubleArray41 = new double[] { (short) 10, 100L };
        double[] doubleArray44 = new double[] { (short) 10, 100L };
        double[] doubleArray47 = new double[] { (short) 10, 100L };
        double[][] doubleArray48 = new double[][] { doubleArray38, doubleArray41, doubleArray44, doubleArray47 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl49 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray48);
        java.math.BigDecimal[][] bigDecimalArray50 = bigMatrixImpl49.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl51 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray50);
        java.math.BigDecimal bigDecimal52 = bigMatrixImpl51.getNorm();
        java.math.BigDecimal[][] bigDecimalArray53 = bigMatrixImpl51.getDataRef();
        int int54 = bigMatrixImpl51.getColumnDimension();
        java.math.BigDecimal bigDecimal55 = bigMatrixImpl51.getNorm();
        double[] doubleArray58 = new double[] { (short) 10, 100L };
        double[] doubleArray61 = new double[] { (short) 10, 100L };
        double[] doubleArray64 = new double[] { (short) 10, 100L };
        double[] doubleArray67 = new double[] { (short) 10, 100L };
        double[][] doubleArray68 = new double[][] { doubleArray58, doubleArray61, doubleArray64, doubleArray67 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl69 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray68);
        java.math.BigDecimal bigDecimal70 = bigMatrixImpl69.getNorm();
        java.math.BigDecimal[] bigDecimalArray71 = new java.math.BigDecimal[] { bigDecimal55, bigDecimal70 };
        java.math.BigDecimal[] bigDecimalArray72 = bigMatrixImpl35.preMultiply(bigDecimalArray71);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl73 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray72);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray74 = bigMatrixImpl0.preMultiply(bigDecimalArray72);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(0);
        java.math.BigDecimal[][] bigDecimalArray9 = bigMatrixImpl0.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal12 = bigMatrixImpl0.getEntry((int) '4', (int) ' ');
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (byte) 100, (int) (byte) 1);
        bigMatrixImpl2.setScale((int) '4');
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl5 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl5.setRoundingMode((int) 'a');
        java.lang.String str8 = bigMatrixImpl5.toString();
        int int9 = bigMatrixImpl5.getRoundingMode();
        bigMatrixImpl5.setRoundingMode((int) ' ');
        bigMatrixImpl5.setRoundingMode((int) '4');
        bigMatrixImpl5.setRoundingMode(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = bigMatrixImpl2.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl5);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) ' ', (int) (byte) 100);
        boolean boolean3 = bigMatrixImpl2.isSquare();
        int int4 = bigMatrixImpl2.getScale();
        double[] doubleArray7 = new double[] { (short) 10, 100L };
        double[] doubleArray10 = new double[] { (short) 10, 100L };
        double[] doubleArray13 = new double[] { (short) 10, 100L };
        double[] doubleArray16 = new double[] { (short) 10, 100L };
        double[][] doubleArray17 = new double[][] { doubleArray7, doubleArray10, doubleArray13, doubleArray16 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = bigMatrixImpl18.copy();
        int int20 = bigMatrixImpl18.getRowDimension();
        boolean boolean21 = bigMatrixImpl2.equals((java.lang.Object) int20);
        double[] doubleArray24 = new double[] { (short) 10, 100L };
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[] doubleArray30 = new double[] { (short) 10, 100L };
        double[] doubleArray33 = new double[] { (short) 10, 100L };
        double[][] doubleArray34 = new double[][] { doubleArray24, doubleArray27, doubleArray30, doubleArray33 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl35 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray34);
        java.math.BigDecimal[][] bigDecimalArray36 = bigMatrixImpl35.getData();
        int int37 = bigMatrixImpl35.getScale();
        java.math.BigDecimal bigDecimal38 = bigMatrixImpl35.getNorm();
        double[] doubleArray41 = new double[] { (short) 10, 100L };
        double[] doubleArray44 = new double[] { (short) 10, 100L };
        double[] doubleArray47 = new double[] { (short) 10, 100L };
        double[] doubleArray50 = new double[] { (short) 10, 100L };
        double[][] doubleArray51 = new double[][] { doubleArray41, doubleArray44, doubleArray47, doubleArray50 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl52 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray51);
        java.math.BigDecimal[][] bigDecimalArray53 = bigMatrixImpl52.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl54 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray53);
        java.math.BigDecimal bigDecimal55 = bigMatrixImpl54.getNorm();
        java.math.BigDecimal[][] bigDecimalArray56 = bigMatrixImpl54.getDataRef();
        int int57 = bigMatrixImpl54.getColumnDimension();
        java.math.BigDecimal bigDecimal58 = bigMatrixImpl54.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix59 = bigMatrixImpl35.scalarMultiply(bigDecimal58);
        boolean boolean60 = bigMatrixImpl2.equals((java.lang.Object) bigMatrixImpl35);
        java.lang.String str61 = bigMatrixImpl35.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) (short) 100);
        double[] doubleArray9 = new double[] { (short) 10, 100L };
        double[] doubleArray12 = new double[] { (short) 10, 100L };
        double[] doubleArray15 = new double[] { (short) 10, 100L };
        double[] doubleArray18 = new double[] { (short) 10, 100L };
        double[][] doubleArray19 = new double[][] { doubleArray9, doubleArray12, doubleArray15, doubleArray18 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray19);
        double[][] doubleArray21 = bigMatrixImpl20.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray21);
        double[] doubleArray25 = new double[] { (short) 10, 100L };
        double[] doubleArray28 = new double[] { (short) 10, 100L };
        double[] doubleArray31 = new double[] { (short) 10, 100L };
        double[] doubleArray34 = new double[] { (short) 10, 100L };
        double[][] doubleArray35 = new double[][] { doubleArray25, doubleArray28, doubleArray31, doubleArray34 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl36 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray35);
        java.math.BigDecimal[][] bigDecimalArray37 = bigMatrixImpl36.getData();
        int int38 = bigMatrixImpl36.getScale();
        java.math.BigDecimal bigDecimal39 = bigMatrixImpl36.getNorm();
        java.math.BigDecimal bigDecimal40 = bigMatrixImpl36.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix41 = bigMatrixImpl22.scalarAdd(bigDecimal40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix42 = bigMatrixImpl0.scalarMultiply(bigDecimal40);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setScale((int) (short) 100);
        java.lang.String str6 = bigMatrixImpl0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = bigMatrixImpl0.getRowAsDoubleArray(0);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal bigDecimal14 = bigMatrixImpl13.getNorm();
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[] doubleArray26 = new double[] { (short) 10, 100L };
        double[][] doubleArray27 = new double[][] { doubleArray17, doubleArray20, doubleArray23, doubleArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray27);
        java.math.BigDecimal[][] bigDecimalArray29 = bigMatrixImpl28.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl30 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray29);
        java.math.BigDecimal bigDecimal31 = bigMatrixImpl30.getNorm();
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal14, bigDecimal31 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl35 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl35.setRoundingMode((int) 'a');
        java.lang.String str38 = bigMatrixImpl35.toString();
        int int39 = bigMatrixImpl35.getRoundingMode();
        bigMatrixImpl35.setRoundingMode((int) ' ');
        bigMatrixImpl35.setRoundingMode((int) '4');
        bigMatrixImpl35.setRoundingMode(100);
        int int46 = bigMatrixImpl35.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix47 = bigMatrixImpl34.solve((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl35);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) ' ', (int) (byte) 100);
        boolean boolean3 = bigMatrixImpl2.isSquare();
        int int4 = bigMatrixImpl2.getScale();
        double[] doubleArray7 = new double[] { (short) 10, 100L };
        double[] doubleArray10 = new double[] { (short) 10, 100L };
        double[] doubleArray13 = new double[] { (short) 10, 100L };
        double[] doubleArray16 = new double[] { (short) 10, 100L };
        double[][] doubleArray17 = new double[][] { doubleArray7, doubleArray10, doubleArray13, doubleArray16 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = bigMatrixImpl18.copy();
        int int20 = bigMatrixImpl18.getRowDimension();
        boolean boolean21 = bigMatrixImpl2.equals((java.lang.Object) int20);
        double[] doubleArray24 = new double[] { (short) 10, 100L };
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[] doubleArray30 = new double[] { (short) 10, 100L };
        double[] doubleArray33 = new double[] { (short) 10, 100L };
        double[][] doubleArray34 = new double[][] { doubleArray24, doubleArray27, doubleArray30, doubleArray33 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl35 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray34);
        java.math.BigDecimal[][] bigDecimalArray36 = bigMatrixImpl35.getData();
        int int37 = bigMatrixImpl35.getScale();
        java.math.BigDecimal bigDecimal38 = bigMatrixImpl35.getNorm();
        double[] doubleArray41 = new double[] { (short) 10, 100L };
        double[] doubleArray44 = new double[] { (short) 10, 100L };
        double[] doubleArray47 = new double[] { (short) 10, 100L };
        double[] doubleArray50 = new double[] { (short) 10, 100L };
        double[][] doubleArray51 = new double[][] { doubleArray41, doubleArray44, doubleArray47, doubleArray50 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl52 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray51);
        java.math.BigDecimal[][] bigDecimalArray53 = bigMatrixImpl52.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl54 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray53);
        java.math.BigDecimal bigDecimal55 = bigMatrixImpl54.getNorm();
        java.math.BigDecimal[][] bigDecimalArray56 = bigMatrixImpl54.getDataRef();
        int int57 = bigMatrixImpl54.getColumnDimension();
        java.math.BigDecimal bigDecimal58 = bigMatrixImpl54.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix59 = bigMatrixImpl35.scalarMultiply(bigDecimal58);
        boolean boolean60 = bigMatrixImpl2.equals((java.lang.Object) bigMatrixImpl35);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl61 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl61.setRoundingMode((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix64 = bigMatrixImpl35.preMultiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl61);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setScale((int) (short) 100);
        bigMatrixImpl0.setScale((int) (byte) 0);
        double[] doubleArray10 = new double[] { (short) 10, 100L };
        double[] doubleArray13 = new double[] { (short) 10, 100L };
        double[] doubleArray16 = new double[] { (short) 10, 100L };
        double[] doubleArray19 = new double[] { (short) 10, 100L };
        double[][] doubleArray20 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray20);
        java.math.BigDecimal bigDecimal22 = bigMatrixImpl21.getNorm();
        double[] doubleArray25 = new double[] { (short) 10, 100L };
        double[] doubleArray28 = new double[] { (short) 10, 100L };
        double[] doubleArray31 = new double[] { (short) 10, 100L };
        double[] doubleArray34 = new double[] { (short) 10, 100L };
        double[][] doubleArray35 = new double[][] { doubleArray25, doubleArray28, doubleArray31, doubleArray34 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl36 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray35);
        java.math.BigDecimal[][] bigDecimalArray37 = bigMatrixImpl36.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl38 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray37);
        java.math.BigDecimal bigDecimal39 = bigMatrixImpl38.getNorm();
        java.math.BigDecimal[] bigDecimalArray40 = new java.math.BigDecimal[] { bigDecimal22, bigDecimal39 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray40);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl42 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray40);
        double[] doubleArray45 = new double[] { (short) 10, 100L };
        double[] doubleArray48 = new double[] { (short) 10, 100L };
        double[] doubleArray51 = new double[] { (short) 10, 100L };
        double[] doubleArray54 = new double[] { (short) 10, 100L };
        double[][] doubleArray55 = new double[][] { doubleArray45, doubleArray48, doubleArray51, doubleArray54 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl56 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray55);
        java.math.BigDecimal[][] bigDecimalArray57 = bigMatrixImpl56.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl58 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray57);
        java.math.BigDecimal bigDecimal59 = bigMatrixImpl58.getNorm();
        java.math.BigDecimal[][] bigDecimalArray60 = bigMatrixImpl58.getDataRef();
        int int61 = bigMatrixImpl58.getColumnDimension();
        java.math.BigDecimal bigDecimal62 = bigMatrixImpl58.getNorm();
        double[] doubleArray65 = new double[] { (short) 10, 100L };
        double[] doubleArray68 = new double[] { (short) 10, 100L };
        double[] doubleArray71 = new double[] { (short) 10, 100L };
        double[] doubleArray74 = new double[] { (short) 10, 100L };
        double[][] doubleArray75 = new double[][] { doubleArray65, doubleArray68, doubleArray71, doubleArray74 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl76 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray75);
        java.math.BigDecimal bigDecimal77 = bigMatrixImpl76.getNorm();
        java.math.BigDecimal[] bigDecimalArray78 = new java.math.BigDecimal[] { bigDecimal62, bigDecimal77 };
        java.math.BigDecimal[] bigDecimalArray79 = bigMatrixImpl42.preMultiply(bigDecimalArray78);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray80 = bigMatrixImpl0.solve(bigDecimalArray78);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        java.lang.String str4 = bigMatrixImpl0.toString();
        java.lang.String str5 = bigMatrixImpl0.toString();
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[][] doubleArray18 = new double[][] { doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal bigDecimal20 = bigMatrixImpl19.getNorm();
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[] doubleArray26 = new double[] { (short) 10, 100L };
        double[] doubleArray29 = new double[] { (short) 10, 100L };
        double[] doubleArray32 = new double[] { (short) 10, 100L };
        double[][] doubleArray33 = new double[][] { doubleArray23, doubleArray26, doubleArray29, doubleArray32 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray33);
        java.math.BigDecimal[][] bigDecimalArray35 = bigMatrixImpl34.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl36 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray35);
        java.math.BigDecimal bigDecimal37 = bigMatrixImpl36.getNorm();
        java.math.BigDecimal[] bigDecimalArray38 = new java.math.BigDecimal[] { bigDecimal20, bigDecimal37 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray38);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray38);
        double[] doubleArray43 = new double[] { (short) 10, 100L };
        double[] doubleArray46 = new double[] { (short) 10, 100L };
        double[] doubleArray49 = new double[] { (short) 10, 100L };
        double[] doubleArray52 = new double[] { (short) 10, 100L };
        double[][] doubleArray53 = new double[][] { doubleArray43, doubleArray46, doubleArray49, doubleArray52 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl54 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray53);
        java.math.BigDecimal[][] bigDecimalArray55 = bigMatrixImpl54.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl56 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray55);
        java.math.BigDecimal bigDecimal57 = bigMatrixImpl56.getNorm();
        java.math.BigDecimal[][] bigDecimalArray58 = bigMatrixImpl56.getDataRef();
        int int59 = bigMatrixImpl56.getColumnDimension();
        java.math.BigDecimal bigDecimal60 = bigMatrixImpl56.getNorm();
        double[] doubleArray63 = new double[] { (short) 10, 100L };
        double[] doubleArray66 = new double[] { (short) 10, 100L };
        double[] doubleArray69 = new double[] { (short) 10, 100L };
        double[] doubleArray72 = new double[] { (short) 10, 100L };
        double[][] doubleArray73 = new double[][] { doubleArray63, doubleArray66, doubleArray69, doubleArray72 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl74 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray73);
        java.math.BigDecimal bigDecimal75 = bigMatrixImpl74.getNorm();
        java.math.BigDecimal[] bigDecimalArray76 = new java.math.BigDecimal[] { bigDecimal60, bigDecimal75 };
        java.math.BigDecimal[] bigDecimalArray77 = bigMatrixImpl40.preMultiply(bigDecimalArray76);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl78 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray76);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray79 = bigMatrixImpl0.solve(bigDecimalArray76);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode((int) '4');
        bigMatrixImpl0.setRoundingMode((int) (short) 100);
        double[] doubleArray13 = new double[] { (short) 10, 100L };
        double[] doubleArray16 = new double[] { (short) 10, 100L };
        double[] doubleArray19 = new double[] { (short) 10, 100L };
        double[] doubleArray22 = new double[] { (short) 10, 100L };
        double[][] doubleArray23 = new double[][] { doubleArray13, doubleArray16, doubleArray19, doubleArray22 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl24 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray23);
        org.apache.commons.math.linear.BigMatrix bigMatrix25 = bigMatrixImpl24.copy();
        java.math.BigDecimal[] bigDecimalArray27 = bigMatrixImpl24.getRow(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray28 = bigMatrixImpl0.preMultiply(bigDecimalArray27);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        java.math.BigDecimal[][] bigDecimalArray6 = bigMatrixImpl0.getDataRef();
        int int7 = bigMatrixImpl0.getRoundingMode();
        boolean boolean9 = bigMatrixImpl0.equals((java.lang.Object) (byte) -1);
        int int10 = bigMatrixImpl0.getScale();
        double[] doubleArray13 = new double[] { (short) 10, 100L };
        double[] doubleArray16 = new double[] { (short) 10, 100L };
        double[] doubleArray19 = new double[] { (short) 10, 100L };
        double[] doubleArray22 = new double[] { (short) 10, 100L };
        double[][] doubleArray23 = new double[][] { doubleArray13, doubleArray16, doubleArray19, doubleArray22 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl24 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray23);
        double[][] doubleArray25 = bigMatrixImpl24.getDataAsDoubleArray();
        bigMatrixImpl24.setRoundingMode(100);
        double[] doubleArray30 = new double[] { (short) 10, 100L };
        double[] doubleArray33 = new double[] { (short) 10, 100L };
        double[] doubleArray36 = new double[] { (short) 10, 100L };
        double[] doubleArray39 = new double[] { (short) 10, 100L };
        double[][] doubleArray40 = new double[][] { doubleArray30, doubleArray33, doubleArray36, doubleArray39 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray40);
        org.apache.commons.math.linear.BigMatrix bigMatrix42 = bigMatrixImpl41.copy();
        org.apache.commons.math.linear.BigMatrix bigMatrix43 = bigMatrixImpl24.subtract(bigMatrix42);
        org.apache.commons.math.linear.BigMatrix bigMatrix45 = bigMatrixImpl24.getRowMatrix(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix46 = bigMatrixImpl0.add(bigMatrix45);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(0);
        int int9 = bigMatrixImpl0.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = bigMatrixImpl0.getRowDimension();
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal bigDecimal14 = bigMatrixImpl13.getNorm();
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[] doubleArray26 = new double[] { (short) 10, 100L };
        double[][] doubleArray27 = new double[][] { doubleArray17, doubleArray20, doubleArray23, doubleArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray27);
        java.math.BigDecimal[][] bigDecimalArray29 = bigMatrixImpl28.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl30 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray29);
        java.math.BigDecimal bigDecimal31 = bigMatrixImpl30.getNorm();
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal14, bigDecimal31 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        org.apache.commons.math.linear.BigMatrix bigMatrix35 = bigMatrixImpl34.copy();
        int int36 = bigMatrixImpl34.getScale();
        bigMatrixImpl34.setRoundingMode((int) (short) 100);
        bigMatrixImpl34.setScale((int) (byte) 100);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl41.setRoundingMode((int) 'a');
        int int44 = bigMatrixImpl41.getRoundingMode();
        bigMatrixImpl41.setScale((int) (short) 100);
        int int47 = bigMatrixImpl41.getScale();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix48 = bigMatrixImpl34.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl41);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(0);
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[][] doubleArray21 = new double[][] { doubleArray11, doubleArray14, doubleArray17, doubleArray20 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray21);
        double[][] doubleArray23 = bigMatrixImpl22.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl24 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray23);
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[] doubleArray30 = new double[] { (short) 10, 100L };
        double[] doubleArray33 = new double[] { (short) 10, 100L };
        double[] doubleArray36 = new double[] { (short) 10, 100L };
        double[][] doubleArray37 = new double[][] { doubleArray27, doubleArray30, doubleArray33, doubleArray36 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl38 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray37);
        java.math.BigDecimal[][] bigDecimalArray39 = bigMatrixImpl38.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray39);
        java.math.BigDecimal bigDecimal41 = bigMatrixImpl40.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix42 = bigMatrixImpl24.scalarAdd(bigDecimal41);
        double[] doubleArray44 = bigMatrixImpl24.getColumnAsDoubleArray((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray45 = bigMatrixImpl0.solve(doubleArray44);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bigMatrixImpl0.getRowAsDoubleArray((int) (byte) 0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode(4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal3 = bigMatrixImpl0.getNorm();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode((int) '4');
        bigMatrixImpl0.setRoundingMode(100);
        int int11 = bigMatrixImpl0.getRoundingMode();
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[][] doubleArray24 = new double[][] { doubleArray14, doubleArray17, doubleArray20, doubleArray23 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray24);
        java.math.BigDecimal bigDecimal26 = bigMatrixImpl25.getNorm();
        double[] doubleArray29 = new double[] { (short) 10, 100L };
        double[] doubleArray32 = new double[] { (short) 10, 100L };
        double[] doubleArray35 = new double[] { (short) 10, 100L };
        double[] doubleArray38 = new double[] { (short) 10, 100L };
        double[][] doubleArray39 = new double[][] { doubleArray29, doubleArray32, doubleArray35, doubleArray38 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        java.math.BigDecimal[][] bigDecimalArray41 = bigMatrixImpl40.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl42 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray41);
        java.math.BigDecimal bigDecimal43 = bigMatrixImpl42.getNorm();
        java.math.BigDecimal[] bigDecimalArray44 = new java.math.BigDecimal[] { bigDecimal26, bigDecimal43 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray44);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl46 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray44);
        double[] doubleArray49 = new double[] { (short) 10, 100L };
        double[] doubleArray52 = new double[] { (short) 10, 100L };
        double[] doubleArray55 = new double[] { (short) 10, 100L };
        double[] doubleArray58 = new double[] { (short) 10, 100L };
        double[][] doubleArray59 = new double[][] { doubleArray49, doubleArray52, doubleArray55, doubleArray58 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl60 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray59);
        java.math.BigDecimal[][] bigDecimalArray61 = bigMatrixImpl60.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl62 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray61);
        java.math.BigDecimal bigDecimal63 = bigMatrixImpl62.getNorm();
        java.math.BigDecimal[][] bigDecimalArray64 = bigMatrixImpl62.getDataRef();
        int int65 = bigMatrixImpl62.getColumnDimension();
        java.math.BigDecimal bigDecimal66 = bigMatrixImpl62.getNorm();
        double[] doubleArray69 = new double[] { (short) 10, 100L };
        double[] doubleArray72 = new double[] { (short) 10, 100L };
        double[] doubleArray75 = new double[] { (short) 10, 100L };
        double[] doubleArray78 = new double[] { (short) 10, 100L };
        double[][] doubleArray79 = new double[][] { doubleArray69, doubleArray72, doubleArray75, doubleArray78 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl80 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray79);
        java.math.BigDecimal bigDecimal81 = bigMatrixImpl80.getNorm();
        java.math.BigDecimal[] bigDecimalArray82 = new java.math.BigDecimal[] { bigDecimal66, bigDecimal81 };
        java.math.BigDecimal[] bigDecimalArray83 = bigMatrixImpl46.preMultiply(bigDecimalArray82);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl84 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray82);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl85 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray82);
        boolean boolean86 = bigMatrixImpl0.equals((java.lang.Object) bigDecimalArray82);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on bigMatrixImpl0, bigMatrixImpl25, and doubleArray14.", !(bigMatrixImpl0.equals(bigMatrixImpl25) && bigMatrixImpl25.equals(doubleArray14)) || bigMatrixImpl0.equals(doubleArray14));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setScale((int) (short) 100);
        java.lang.String str6 = bigMatrixImpl0.toString();
        java.math.BigDecimal[][] bigDecimalArray7 = bigMatrixImpl0.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal8 = bigMatrixImpl0.getDeterminant();
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bigMatrixImpl0.getColumnAsDoubleArray(10);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        double[] doubleArray6 = new double[] { (short) 10, 100L };
        double[] doubleArray9 = new double[] { (short) 10, 100L };
        double[] doubleArray12 = new double[] { (short) 10, 100L };
        double[] doubleArray15 = new double[] { (short) 10, 100L };
        double[][] doubleArray16 = new double[][] { doubleArray6, doubleArray9, doubleArray12, doubleArray15 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray16);
        java.math.BigDecimal bigDecimal18 = bigMatrixImpl17.getNorm();
        double[] doubleArray21 = new double[] { (short) 10, 100L };
        double[] doubleArray24 = new double[] { (short) 10, 100L };
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[] doubleArray30 = new double[] { (short) 10, 100L };
        double[][] doubleArray31 = new double[][] { doubleArray21, doubleArray24, doubleArray27, doubleArray30 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl32 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray31);
        java.math.BigDecimal[][] bigDecimalArray33 = bigMatrixImpl32.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33);
        java.math.BigDecimal bigDecimal35 = bigMatrixImpl34.getNorm();
        java.math.BigDecimal[] bigDecimalArray36 = new java.math.BigDecimal[] { bigDecimal18, bigDecimal35 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray36);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl38 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray36);
        java.lang.String str39 = bigMatrixImpl38.toString();
        int int40 = bigMatrixImpl38.getColumnDimension();
        java.math.BigDecimal[] bigDecimalArray42 = bigMatrixImpl38.getRow((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray43 = bigMatrixImpl0.operate(bigDecimalArray42);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode(100);
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[][] doubleArray15 = new double[][] { doubleArray5, doubleArray8, doubleArray11, doubleArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray15);
        java.math.BigDecimal bigDecimal17 = bigMatrixImpl16.getNorm();
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[] doubleArray26 = new double[] { (short) 10, 100L };
        double[] doubleArray29 = new double[] { (short) 10, 100L };
        double[][] doubleArray30 = new double[][] { doubleArray20, doubleArray23, doubleArray26, doubleArray29 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl31 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray30);
        java.math.BigDecimal[][] bigDecimalArray32 = bigMatrixImpl31.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        java.math.BigDecimal bigDecimal34 = bigMatrixImpl33.getNorm();
        java.math.BigDecimal[] bigDecimalArray35 = new java.math.BigDecimal[] { bigDecimal17, bigDecimal34 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl36 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray35);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray35);
        double[] doubleArray40 = new double[] { (short) 10, 100L };
        double[] doubleArray43 = new double[] { (short) 10, 100L };
        double[] doubleArray46 = new double[] { (short) 10, 100L };
        double[] doubleArray49 = new double[] { (short) 10, 100L };
        double[][] doubleArray50 = new double[][] { doubleArray40, doubleArray43, doubleArray46, doubleArray49 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl51 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray50);
        java.math.BigDecimal[][] bigDecimalArray52 = bigMatrixImpl51.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl53 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray52);
        java.math.BigDecimal bigDecimal54 = bigMatrixImpl53.getNorm();
        java.math.BigDecimal[][] bigDecimalArray55 = bigMatrixImpl53.getDataRef();
        int int56 = bigMatrixImpl53.getColumnDimension();
        java.math.BigDecimal bigDecimal57 = bigMatrixImpl53.getNorm();
        double[] doubleArray60 = new double[] { (short) 10, 100L };
        double[] doubleArray63 = new double[] { (short) 10, 100L };
        double[] doubleArray66 = new double[] { (short) 10, 100L };
        double[] doubleArray69 = new double[] { (short) 10, 100L };
        double[][] doubleArray70 = new double[][] { doubleArray60, doubleArray63, doubleArray66, doubleArray69 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl71 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray70);
        java.math.BigDecimal bigDecimal72 = bigMatrixImpl71.getNorm();
        java.math.BigDecimal[] bigDecimalArray73 = new java.math.BigDecimal[] { bigDecimal57, bigDecimal72 };
        java.math.BigDecimal[] bigDecimalArray74 = bigMatrixImpl37.preMultiply(bigDecimalArray73);
        double[] doubleArray77 = new double[] { (short) 10, 100L };
        double[] doubleArray80 = new double[] { (short) 10, 100L };
        double[] doubleArray83 = new double[] { (short) 10, 100L };
        double[] doubleArray86 = new double[] { (short) 10, 100L };
        double[][] doubleArray87 = new double[][] { doubleArray77, doubleArray80, doubleArray83, doubleArray86 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl88 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray87);
        java.math.BigDecimal[][] bigDecimalArray89 = bigMatrixImpl88.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl90 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray89);
        java.math.BigDecimal bigDecimal91 = bigMatrixImpl90.getNorm();
        java.math.BigDecimal[][] bigDecimalArray92 = bigMatrixImpl90.getDataRef();
        int int93 = bigMatrixImpl90.getColumnDimension();
        java.math.BigDecimal bigDecimal94 = bigMatrixImpl90.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix95 = bigMatrixImpl37.scalarMultiply(bigDecimal94);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix96 = bigMatrixImpl0.scalarMultiply(bigDecimal94);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[][] doubleArray15 = new double[][] { doubleArray5, doubleArray8, doubleArray11, doubleArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray15);
        java.math.BigDecimal[][] bigDecimalArray17 = bigMatrixImpl16.getData();
        bigMatrixImpl16.setRoundingMode((int) (byte) 0);
        java.math.BigDecimal[][] bigDecimalArray20 = bigMatrixImpl16.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray20);
        int int22 = bigMatrixImpl21.getRowDimension();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix23 = bigMatrixImpl0.solve((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl21);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        java.math.BigDecimal[][] bigDecimalArray6 = bigMatrixImpl0.getDataRef();
        int int7 = bigMatrixImpl0.getRoundingMode();
        boolean boolean9 = bigMatrixImpl0.equals((java.lang.Object) (byte) -1);
        int int10 = bigMatrixImpl0.getScale();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray12 = bigMatrixImpl0.getColumn(2);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) ' ', (int) (byte) 100);
        int int3 = bigMatrixImpl2.getRoundingMode();
        double[] doubleArray6 = new double[] { (short) 10, 100L };
        double[] doubleArray9 = new double[] { (short) 10, 100L };
        double[] doubleArray12 = new double[] { (short) 10, 100L };
        double[] doubleArray15 = new double[] { (short) 10, 100L };
        double[][] doubleArray16 = new double[][] { doubleArray6, doubleArray9, doubleArray12, doubleArray15 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray16);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getData();
        java.math.BigDecimal[][] bigDecimalArray19 = bigMatrixImpl17.getData();
        bigMatrixImpl2.setSubMatrix(bigDecimalArray19, 4, 0);
        boolean boolean23 = bigMatrixImpl2.isSingular();
        boolean boolean24 = bigMatrixImpl2.isSquare();
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[] doubleArray30 = new double[] { (short) 10, 100L };
        double[] doubleArray33 = new double[] { (short) 10, 100L };
        double[] doubleArray36 = new double[] { (short) 10, 100L };
        double[][] doubleArray37 = new double[][] { doubleArray27, doubleArray30, doubleArray33, doubleArray36 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl38 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray37);
        java.math.BigDecimal[][] bigDecimalArray39 = bigMatrixImpl38.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray39);
        java.math.BigDecimal[][] bigDecimalArray41 = bigMatrixImpl40.getData();
        bigMatrixImpl2.setSubMatrix(bigDecimalArray41, 10, (int) (byte) 10);
        double[] doubleArray47 = new double[] { (short) 10, 100L };
        double[] doubleArray50 = new double[] { (short) 10, 100L };
        double[] doubleArray53 = new double[] { (short) 10, 100L };
        double[] doubleArray56 = new double[] { (short) 10, 100L };
        double[][] doubleArray57 = new double[][] { doubleArray47, doubleArray50, doubleArray53, doubleArray56 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl58 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray57);
        java.math.BigDecimal[][] bigDecimalArray59 = bigMatrixImpl58.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl60 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray59);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl61 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray59);
        bigMatrixImpl61.setRoundingMode((int) (short) 100);
        double[] doubleArray66 = new double[] { (short) 10, 100L };
        double[] doubleArray69 = new double[] { (short) 10, 100L };
        double[] doubleArray72 = new double[] { (short) 10, 100L };
        double[] doubleArray75 = new double[] { (short) 10, 100L };
        double[][] doubleArray76 = new double[][] { doubleArray66, doubleArray69, doubleArray72, doubleArray75 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl77 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray76);
        java.math.BigDecimal[][] bigDecimalArray78 = bigMatrixImpl77.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl79 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray78);
        java.math.BigDecimal bigDecimal80 = bigMatrixImpl79.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix81 = bigMatrixImpl61.scalarAdd(bigDecimal80);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix82 = bigMatrixImpl2.scalarMultiply(bigDecimal80);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setScale((int) ' ');
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[][] doubleArray21 = new double[][] { doubleArray11, doubleArray14, doubleArray17, doubleArray20 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray21);
        java.math.BigDecimal bigDecimal23 = bigMatrixImpl22.getNorm();
        double[] doubleArray26 = new double[] { (short) 10, 100L };
        double[] doubleArray29 = new double[] { (short) 10, 100L };
        double[] doubleArray32 = new double[] { (short) 10, 100L };
        double[] doubleArray35 = new double[] { (short) 10, 100L };
        double[][] doubleArray36 = new double[][] { doubleArray26, doubleArray29, doubleArray32, doubleArray35 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray36);
        java.math.BigDecimal[][] bigDecimalArray38 = bigMatrixImpl37.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray38);
        java.math.BigDecimal bigDecimal40 = bigMatrixImpl39.getNorm();
        java.math.BigDecimal[] bigDecimalArray41 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal40 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl42 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray41);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray41);
        double[] doubleArray46 = new double[] { (short) 10, 100L };
        double[] doubleArray49 = new double[] { (short) 10, 100L };
        double[] doubleArray52 = new double[] { (short) 10, 100L };
        double[] doubleArray55 = new double[] { (short) 10, 100L };
        double[][] doubleArray56 = new double[][] { doubleArray46, doubleArray49, doubleArray52, doubleArray55 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl57 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray56);
        java.math.BigDecimal[][] bigDecimalArray58 = bigMatrixImpl57.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl59 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray58);
        java.math.BigDecimal bigDecimal60 = bigMatrixImpl59.getNorm();
        java.math.BigDecimal[][] bigDecimalArray61 = bigMatrixImpl59.getDataRef();
        int int62 = bigMatrixImpl59.getColumnDimension();
        java.math.BigDecimal bigDecimal63 = bigMatrixImpl59.getNorm();
        double[] doubleArray66 = new double[] { (short) 10, 100L };
        double[] doubleArray69 = new double[] { (short) 10, 100L };
        double[] doubleArray72 = new double[] { (short) 10, 100L };
        double[] doubleArray75 = new double[] { (short) 10, 100L };
        double[][] doubleArray76 = new double[][] { doubleArray66, doubleArray69, doubleArray72, doubleArray75 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl77 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray76);
        java.math.BigDecimal bigDecimal78 = bigMatrixImpl77.getNorm();
        java.math.BigDecimal[] bigDecimalArray79 = new java.math.BigDecimal[] { bigDecimal63, bigDecimal78 };
        java.math.BigDecimal[] bigDecimalArray80 = bigMatrixImpl43.preMultiply(bigDecimalArray79);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl81 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray80);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray82 = bigMatrixImpl0.solve(bigDecimalArray80);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(0);
        java.math.BigDecimal[][] bigDecimalArray9 = bigMatrixImpl0.getDataRef();
        double[] doubleArray12 = new double[] { (short) 10, 100L };
        double[] doubleArray15 = new double[] { (short) 10, 100L };
        double[] doubleArray18 = new double[] { (short) 10, 100L };
        double[] doubleArray21 = new double[] { (short) 10, 100L };
        double[][] doubleArray22 = new double[][] { doubleArray12, doubleArray15, doubleArray18, doubleArray21 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl23 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray22);
        double[][] doubleArray24 = bigMatrixImpl23.getDataAsDoubleArray();
        bigMatrixImpl23.setRoundingMode(100);
        org.apache.commons.math.linear.BigMatrix bigMatrix27 = bigMatrixImpl23.transpose();
        double[] doubleArray29 = bigMatrixImpl23.getRowAsDoubleArray((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray30 = bigMatrixImpl0.operate(doubleArray29);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        java.math.BigDecimal[][] bigDecimalArray15 = bigMatrixImpl13.getData();
        double[][] doubleArray16 = bigMatrixImpl13.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray16);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = bigMatrixImpl17.solve((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl18);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode((int) '4');
        bigMatrixImpl0.setRoundingMode((int) (short) 100);
        java.lang.String str11 = bigMatrixImpl0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = bigMatrixImpl0.getColumnMatrix(4);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode(100);
        int int3 = bigMatrixImpl0.getScale();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = bigMatrixImpl0.isSquare();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        java.math.BigDecimal[][] bigDecimalArray6 = bigMatrixImpl0.getDataRef();
        int int7 = bigMatrixImpl0.getRoundingMode();
        boolean boolean9 = bigMatrixImpl0.equals((java.lang.Object) (byte) -1);
        int int10 = bigMatrixImpl0.getScale();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = bigMatrixImpl0.copy();
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        bigMatrixImpl16.setRoundingMode((int) (short) 100);
        double[] doubleArray21 = new double[] { (short) 10, 100L };
        double[] doubleArray24 = new double[] { (short) 10, 100L };
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[] doubleArray30 = new double[] { (short) 10, 100L };
        double[][] doubleArray31 = new double[][] { doubleArray21, doubleArray24, doubleArray27, doubleArray30 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl32 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray31);
        java.math.BigDecimal[][] bigDecimalArray33 = bigMatrixImpl32.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33);
        java.math.BigDecimal bigDecimal35 = bigMatrixImpl34.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix36 = bigMatrixImpl16.scalarAdd(bigDecimal35);
        double[] doubleArray39 = new double[] { (short) 10, 100L };
        double[] doubleArray42 = new double[] { (short) 10, 100L };
        double[] doubleArray45 = new double[] { (short) 10, 100L };
        double[] doubleArray48 = new double[] { (short) 10, 100L };
        double[][] doubleArray49 = new double[][] { doubleArray39, doubleArray42, doubleArray45, doubleArray48 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl50 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray49);
        java.math.BigDecimal[][] bigDecimalArray51 = bigMatrixImpl50.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl52 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray51);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl53 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray51);
        bigMatrixImpl53.setRoundingMode((int) (short) 100);
        org.apache.commons.math.linear.BigMatrix bigMatrix56 = bigMatrixImpl53.copy();
        org.apache.commons.math.linear.BigMatrix bigMatrix57 = bigMatrixImpl16.add((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl53);
        boolean boolean58 = bigMatrixImpl16.isSquare();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl59 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl59.setRoundingMode((int) 'a');
        int int62 = bigMatrixImpl59.getRoundingMode();
        bigMatrixImpl59.setScale((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix65 = bigMatrixImpl16.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl59);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        bigMatrixImpl13.setRoundingMode((int) (byte) 0);
        java.math.BigDecimal[][] bigDecimalArray17 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl18.setRoundingMode((int) 'a');
        int int21 = bigMatrixImpl18.getRoundingMode();
        bigMatrixImpl18.setScale((int) (short) 100);
        java.lang.String str24 = bigMatrixImpl18.toString();
        int int25 = bigMatrixImpl18.getScale();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = bigMatrixImpl13.add((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl18);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        double[] doubleArray18 = new double[] { (short) 10, 100L };
        double[] doubleArray21 = new double[] { (short) 10, 100L };
        double[] doubleArray24 = new double[] { (short) 10, 100L };
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[][] doubleArray28 = new double[][] { doubleArray18, doubleArray21, doubleArray24, doubleArray27 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl29 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray28);
        java.math.BigDecimal[][] bigDecimalArray30 = bigMatrixImpl29.getData();
        boolean boolean31 = bigMatrixImpl15.equals((java.lang.Object) bigMatrixImpl29);
        int int32 = bigMatrixImpl29.getRoundingMode();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl33.setRoundingMode((int) 'a');
        int int36 = bigMatrixImpl33.getRoundingMode();
        bigMatrixImpl33.setScale((int) (short) 100);
        int int39 = bigMatrixImpl33.getScale();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix40 = bigMatrixImpl29.preMultiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl33);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) ' ', (int) (byte) 100);
        int int3 = bigMatrixImpl2.getRoundingMode();
        double[] doubleArray6 = new double[] { (short) 10, 100L };
        double[] doubleArray9 = new double[] { (short) 10, 100L };
        double[] doubleArray12 = new double[] { (short) 10, 100L };
        double[] doubleArray15 = new double[] { (short) 10, 100L };
        double[][] doubleArray16 = new double[][] { doubleArray6, doubleArray9, doubleArray12, doubleArray15 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray16);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getData();
        java.math.BigDecimal[][] bigDecimalArray19 = bigMatrixImpl17.getData();
        bigMatrixImpl2.setSubMatrix(bigDecimalArray19, 4, 0);
        boolean boolean23 = bigMatrixImpl2.isSingular();
        boolean boolean24 = bigMatrixImpl2.isSquare();
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[] doubleArray30 = new double[] { (short) 10, 100L };
        double[] doubleArray33 = new double[] { (short) 10, 100L };
        double[] doubleArray36 = new double[] { (short) 10, 100L };
        double[][] doubleArray37 = new double[][] { doubleArray27, doubleArray30, doubleArray33, doubleArray36 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl38 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray37);
        java.math.BigDecimal[][] bigDecimalArray39 = bigMatrixImpl38.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray39);
        java.math.BigDecimal[][] bigDecimalArray41 = bigMatrixImpl40.getData();
        bigMatrixImpl2.setSubMatrix(bigDecimalArray41, 10, (int) (byte) 10);
        double[] doubleArray47 = new double[] { (short) 10, 100L };
        double[] doubleArray50 = new double[] { (short) 10, 100L };
        double[] doubleArray53 = new double[] { (short) 10, 100L };
        double[] doubleArray56 = new double[] { (short) 10, 100L };
        double[][] doubleArray57 = new double[][] { doubleArray47, doubleArray50, doubleArray53, doubleArray56 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl58 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray57);
        java.math.BigDecimal[][] bigDecimalArray59 = bigMatrixImpl58.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl60 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray59);
        java.math.BigDecimal bigDecimal61 = bigMatrixImpl60.getNorm();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix62 = bigMatrixImpl2.scalarAdd(bigDecimal61);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(100);
        boolean boolean10 = bigMatrixImpl0.equals((java.lang.Object) 0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = bigMatrixImpl0.getColumnMatrix(0);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        java.math.BigDecimal[][] bigDecimalArray6 = bigMatrixImpl0.getDataRef();
        int int7 = bigMatrixImpl0.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray8 = bigMatrixImpl0.getDataAsDoubleArray();
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray9 = bigMatrixImpl0.getDataAsDoubleArray();
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        java.math.BigDecimal[][] bigDecimalArray6 = bigMatrixImpl0.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal7 = bigMatrixImpl0.getDeterminant();
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) ' ', 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double5 = bigMatrixImpl2.getEntryAsDouble(1, 32);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setScale((int) (short) 100);
        java.lang.String str6 = bigMatrixImpl0.toString();
        java.math.BigDecimal[][] bigDecimalArray7 = bigMatrixImpl0.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray9 = bigMatrixImpl0.getRow(32);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        double[][] doubleArray14 = bigMatrixImpl13.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray14);
        double[] doubleArray18 = new double[] { (short) 10, 100L };
        double[] doubleArray21 = new double[] { (short) 10, 100L };
        double[] doubleArray24 = new double[] { (short) 10, 100L };
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[][] doubleArray28 = new double[][] { doubleArray18, doubleArray21, doubleArray24, doubleArray27 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl29 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray28);
        java.math.BigDecimal[][] bigDecimalArray30 = bigMatrixImpl29.getData();
        int int31 = bigMatrixImpl29.getScale();
        java.math.BigDecimal bigDecimal32 = bigMatrixImpl29.getNorm();
        java.math.BigDecimal bigDecimal33 = bigMatrixImpl29.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix34 = bigMatrixImpl15.scalarAdd(bigDecimal33);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl35 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl35.setRoundingMode((int) 'a');
        java.lang.String str38 = bigMatrixImpl35.toString();
        java.lang.String str39 = bigMatrixImpl35.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix40 = bigMatrixImpl15.preMultiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl35);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode(4);
        int[] intArray7 = new int[] { (byte) -1, (short) 0, (byte) 100, 2 };
        int[] intArray14 = new int[] { 1, 32, (short) 0, (byte) 100, 100, (byte) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = bigMatrixImpl0.getSubMatrix(intArray7, intArray14);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal bigDecimal14 = bigMatrixImpl13.getNorm();
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[] doubleArray26 = new double[] { (short) 10, 100L };
        double[][] doubleArray27 = new double[][] { doubleArray17, doubleArray20, doubleArray23, doubleArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray27);
        java.math.BigDecimal[][] bigDecimalArray29 = bigMatrixImpl28.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl30 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray29);
        java.math.BigDecimal bigDecimal31 = bigMatrixImpl30.getNorm();
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal14, bigDecimal31 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        java.lang.String str35 = bigMatrixImpl34.toString();
        bigMatrixImpl34.setScale(0);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl38 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl38.setRoundingMode((int) 'a');
        int int41 = bigMatrixImpl38.getRoundingMode();
        bigMatrixImpl38.setScale((int) (short) 100);
        bigMatrixImpl38.setScale((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean46 = bigMatrixImpl34.equals((java.lang.Object) bigMatrixImpl38);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        java.lang.String str4 = bigMatrixImpl0.toString();
        java.lang.String str5 = bigMatrixImpl0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray6 = bigMatrixImpl0.getDataAsDoubleArray();
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(100);
        boolean boolean10 = bigMatrixImpl0.equals((java.lang.Object) 0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        bigMatrixImpl0.luDecompose();
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[][] bigDecimalArray9 = bigMatrixImpl0.getData();
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode((int) '4');
        bigMatrixImpl0.setRoundingMode((int) (short) 100);
        double[] doubleArray13 = new double[] { (short) 10, 100L };
        double[] doubleArray16 = new double[] { (short) 10, 100L };
        double[] doubleArray19 = new double[] { (short) 10, 100L };
        double[] doubleArray22 = new double[] { (short) 10, 100L };
        double[][] doubleArray23 = new double[][] { doubleArray13, doubleArray16, doubleArray19, doubleArray22 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl24 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray23);
        java.math.BigDecimal bigDecimal25 = bigMatrixImpl24.getNorm();
        double[] doubleArray28 = new double[] { (short) 10, 100L };
        double[] doubleArray31 = new double[] { (short) 10, 100L };
        double[] doubleArray34 = new double[] { (short) 10, 100L };
        double[] doubleArray37 = new double[] { (short) 10, 100L };
        double[][] doubleArray38 = new double[][] { doubleArray28, doubleArray31, doubleArray34, doubleArray37 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray38);
        java.math.BigDecimal[][] bigDecimalArray40 = bigMatrixImpl39.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray40);
        java.math.BigDecimal bigDecimal42 = bigMatrixImpl41.getNorm();
        java.math.BigDecimal[] bigDecimalArray43 = new java.math.BigDecimal[] { bigDecimal25, bigDecimal42 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray43);
        int int45 = bigMatrixImpl44.getRoundingMode();
        bigMatrixImpl44.setScale(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix48 = bigMatrixImpl0.add((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl44);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setScale((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = bigMatrixImpl0.getRowDimension();
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) ' ', (int) (byte) 100);
        int int3 = bigMatrixImpl2.getRoundingMode();
        double[] doubleArray6 = new double[] { (short) 10, 100L };
        double[] doubleArray9 = new double[] { (short) 10, 100L };
        double[] doubleArray12 = new double[] { (short) 10, 100L };
        double[] doubleArray15 = new double[] { (short) 10, 100L };
        double[][] doubleArray16 = new double[][] { doubleArray6, doubleArray9, doubleArray12, doubleArray15 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray16);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getData();
        java.math.BigDecimal[][] bigDecimalArray19 = bigMatrixImpl17.getData();
        bigMatrixImpl2.setSubMatrix(bigDecimalArray19, 4, 0);
        boolean boolean23 = bigMatrixImpl2.isSingular();
        boolean boolean24 = bigMatrixImpl2.isSquare();
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[] doubleArray30 = new double[] { (short) 10, 100L };
        double[] doubleArray33 = new double[] { (short) 10, 100L };
        double[] doubleArray36 = new double[] { (short) 10, 100L };
        double[][] doubleArray37 = new double[][] { doubleArray27, doubleArray30, doubleArray33, doubleArray36 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl38 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray37);
        java.math.BigDecimal[][] bigDecimalArray39 = bigMatrixImpl38.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray39);
        java.math.BigDecimal[][] bigDecimalArray41 = bigMatrixImpl40.getData();
        bigMatrixImpl2.setSubMatrix(bigDecimalArray41, 10, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double47 = bigMatrixImpl2.getEntryAsDouble((int) (byte) 10, (int) (short) 0);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode(4);
        double[] doubleArray9 = new double[] { (short) 10, 100L };
        double[] doubleArray12 = new double[] { (short) 10, 100L };
        double[] doubleArray15 = new double[] { (short) 10, 100L };
        double[] doubleArray18 = new double[] { (short) 10, 100L };
        double[][] doubleArray19 = new double[][] { doubleArray9, doubleArray12, doubleArray15, doubleArray18 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray19);
        java.math.BigDecimal[][] bigDecimalArray21 = bigMatrixImpl20.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray21);
        double[] doubleArray24 = bigMatrixImpl22.getColumnAsDoubleArray((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray25 = bigMatrixImpl0.operate(doubleArray24);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) 'a', 97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        bigMatrixImpl2.luDecompose();
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = bigMatrixImpl0.getColumnAsDoubleArray(64);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray6 = bigMatrixImpl0.getRow((int) (short) 0);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl4 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl4.setRoundingMode((int) 'a');
        java.lang.String str7 = bigMatrixImpl4.toString();
        int int8 = bigMatrixImpl4.getRoundingMode();
        bigMatrixImpl4.setRoundingMode((int) ' ');
        bigMatrixImpl4.setRoundingMode((int) '4');
        bigMatrixImpl4.setRoundingMode(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = bigMatrixImpl0.add((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl4);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode(4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal3 = bigMatrixImpl0.getTrace();
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (short) 10, (int) 'a');
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[][] doubleArray15 = new double[][] { doubleArray5, doubleArray8, doubleArray11, doubleArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray15);
        java.math.BigDecimal bigDecimal17 = bigMatrixImpl16.getNorm();
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[] doubleArray26 = new double[] { (short) 10, 100L };
        double[] doubleArray29 = new double[] { (short) 10, 100L };
        double[][] doubleArray30 = new double[][] { doubleArray20, doubleArray23, doubleArray26, doubleArray29 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl31 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray30);
        java.math.BigDecimal[][] bigDecimalArray32 = bigMatrixImpl31.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        java.math.BigDecimal bigDecimal34 = bigMatrixImpl33.getNorm();
        java.math.BigDecimal[] bigDecimalArray35 = new java.math.BigDecimal[] { bigDecimal17, bigDecimal34 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl36 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray35);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray35);
        double[] doubleArray40 = new double[] { (short) 10, 100L };
        double[] doubleArray43 = new double[] { (short) 10, 100L };
        double[] doubleArray46 = new double[] { (short) 10, 100L };
        double[] doubleArray49 = new double[] { (short) 10, 100L };
        double[][] doubleArray50 = new double[][] { doubleArray40, doubleArray43, doubleArray46, doubleArray49 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl51 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray50);
        java.math.BigDecimal[][] bigDecimalArray52 = bigMatrixImpl51.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl53 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray52);
        java.math.BigDecimal bigDecimal54 = bigMatrixImpl53.getNorm();
        java.math.BigDecimal[][] bigDecimalArray55 = bigMatrixImpl53.getDataRef();
        int int56 = bigMatrixImpl53.getColumnDimension();
        java.math.BigDecimal bigDecimal57 = bigMatrixImpl53.getNorm();
        double[] doubleArray60 = new double[] { (short) 10, 100L };
        double[] doubleArray63 = new double[] { (short) 10, 100L };
        double[] doubleArray66 = new double[] { (short) 10, 100L };
        double[] doubleArray69 = new double[] { (short) 10, 100L };
        double[][] doubleArray70 = new double[][] { doubleArray60, doubleArray63, doubleArray66, doubleArray69 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl71 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray70);
        java.math.BigDecimal bigDecimal72 = bigMatrixImpl71.getNorm();
        java.math.BigDecimal[] bigDecimalArray73 = new java.math.BigDecimal[] { bigDecimal57, bigDecimal72 };
        java.math.BigDecimal[] bigDecimalArray74 = bigMatrixImpl37.preMultiply(bigDecimalArray73);
        double[] doubleArray77 = new double[] { (short) 10, 100L };
        double[] doubleArray80 = new double[] { (short) 10, 100L };
        double[] doubleArray83 = new double[] { (short) 10, 100L };
        double[] doubleArray86 = new double[] { (short) 10, 100L };
        double[][] doubleArray87 = new double[][] { doubleArray77, doubleArray80, doubleArray83, doubleArray86 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl88 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray87);
        java.math.BigDecimal[][] bigDecimalArray89 = bigMatrixImpl88.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl90 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray89);
        java.math.BigDecimal bigDecimal91 = bigMatrixImpl90.getNorm();
        java.math.BigDecimal[][] bigDecimalArray92 = bigMatrixImpl90.getDataRef();
        int int93 = bigMatrixImpl90.getColumnDimension();
        java.math.BigDecimal bigDecimal94 = bigMatrixImpl90.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix95 = bigMatrixImpl37.scalarMultiply(bigDecimal94);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix96 = bigMatrixImpl2.scalarMultiply(bigDecimal94);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(0);
        int int9 = bigMatrixImpl0.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal10 = bigMatrixImpl0.getNorm();
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[][] doubleArray18 = new double[][] { doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal[][] bigDecimalArray20 = bigMatrixImpl19.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray20);
        java.math.BigDecimal bigDecimal22 = bigMatrixImpl21.getNorm();
        java.math.BigDecimal[][] bigDecimalArray23 = bigMatrixImpl21.getDataRef();
        int int24 = bigMatrixImpl21.getColumnDimension();
        java.math.BigDecimal bigDecimal25 = bigMatrixImpl21.getNorm();
        java.math.BigDecimal[][] bigDecimalArray26 = bigMatrixImpl21.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix27 = bigMatrixImpl0.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl21);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        int int1 = bigMatrixImpl0.getScale();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = bigMatrixImpl0.getRowDimension();
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode((int) '4');
        bigMatrixImpl0.setRoundingMode((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = bigMatrixImpl0.inverse();
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setScale((int) (short) 100);
        java.lang.String str6 = bigMatrixImpl0.toString();
        java.math.BigDecimal[][] bigDecimalArray7 = bigMatrixImpl0.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = bigMatrixImpl0.getColumnAsDoubleArray(97);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode(4);
        double[] doubleArray9 = new double[] { (short) 10, 100L };
        double[] doubleArray12 = new double[] { (short) 10, 100L };
        double[] doubleArray15 = new double[] { (short) 10, 100L };
        double[] doubleArray18 = new double[] { (short) 10, 100L };
        double[][] doubleArray19 = new double[][] { doubleArray9, doubleArray12, doubleArray15, doubleArray18 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray19);
        java.math.BigDecimal[][] bigDecimalArray21 = bigMatrixImpl20.getData();
        bigMatrixImpl20.setRoundingMode((int) (byte) 0);
        java.math.BigDecimal[] bigDecimalArray25 = bigMatrixImpl20.getRow((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray26 = bigMatrixImpl0.preMultiply(bigDecimalArray25);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) ' ', 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bigMatrixImpl2.getRowAsDoubleArray((int) (byte) 10);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) ' ', (int) (byte) 100);
        int int3 = bigMatrixImpl2.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray4 = bigMatrixImpl2.getDataRef();
        int int5 = bigMatrixImpl2.getRowDimension();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal6 = bigMatrixImpl2.getNorm();
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        double[] doubleArray9 = new double[] { (short) 10, 100L };
        double[] doubleArray12 = new double[] { (short) 10, 100L };
        double[] doubleArray15 = new double[] { (short) 10, 100L };
        double[] doubleArray18 = new double[] { (short) 10, 100L };
        double[][] doubleArray19 = new double[][] { doubleArray9, doubleArray12, doubleArray15, doubleArray18 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray19);
        java.math.BigDecimal[][] bigDecimalArray21 = bigMatrixImpl20.getData();
        bigMatrixImpl20.setRoundingMode((int) (byte) 0);
        java.math.BigDecimal[][] bigDecimalArray24 = bigMatrixImpl20.getData();
        int int25 = bigMatrixImpl20.getScale();
        boolean boolean26 = bigMatrixImpl20.isSingular();
        java.math.BigDecimal bigDecimal27 = bigMatrixImpl20.getNorm();
        double[] doubleArray29 = bigMatrixImpl20.getRowAsDoubleArray(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray30 = bigMatrixImpl0.operate(doubleArray29);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(64, 4);
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[][] doubleArray15 = new double[][] { doubleArray5, doubleArray8, doubleArray11, doubleArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray15);
        double[][] doubleArray17 = bigMatrixImpl16.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray17);
        double[] doubleArray21 = new double[] { (short) 10, 100L };
        double[] doubleArray24 = new double[] { (short) 10, 100L };
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[] doubleArray30 = new double[] { (short) 10, 100L };
        double[][] doubleArray31 = new double[][] { doubleArray21, doubleArray24, doubleArray27, doubleArray30 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl32 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray31);
        java.math.BigDecimal[][] bigDecimalArray33 = bigMatrixImpl32.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33);
        java.math.BigDecimal bigDecimal35 = bigMatrixImpl34.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix36 = bigMatrixImpl18.scalarAdd(bigDecimal35);
        double[] doubleArray38 = bigMatrixImpl18.getColumnAsDoubleArray((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray39 = bigMatrixImpl2.operate(doubleArray38);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setScale((int) (short) 100);
        java.lang.String str6 = bigMatrixImpl0.toString();
        java.lang.String str7 = bigMatrixImpl0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = bigMatrixImpl0.getColumnDimension();
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setScale((int) (short) 100);
        java.lang.String str6 = bigMatrixImpl0.toString();
        java.math.BigDecimal[][] bigDecimalArray7 = bigMatrixImpl0.getDataRef();
        double[] doubleArray10 = new double[] { (short) 10, 100L };
        double[] doubleArray13 = new double[] { (short) 10, 100L };
        double[] doubleArray16 = new double[] { (short) 10, 100L };
        double[] doubleArray19 = new double[] { (short) 10, 100L };
        double[][] doubleArray20 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray20);
        java.math.BigDecimal bigDecimal22 = bigMatrixImpl21.getNorm();
        double[] doubleArray25 = new double[] { (short) 10, 100L };
        double[] doubleArray28 = new double[] { (short) 10, 100L };
        double[] doubleArray31 = new double[] { (short) 10, 100L };
        double[] doubleArray34 = new double[] { (short) 10, 100L };
        double[][] doubleArray35 = new double[][] { doubleArray25, doubleArray28, doubleArray31, doubleArray34 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl36 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray35);
        java.math.BigDecimal[][] bigDecimalArray37 = bigMatrixImpl36.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl38 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray37);
        java.math.BigDecimal bigDecimal39 = bigMatrixImpl38.getNorm();
        java.math.BigDecimal[] bigDecimalArray40 = new java.math.BigDecimal[] { bigDecimal22, bigDecimal39 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray40);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl42 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray40);
        java.lang.String str43 = bigMatrixImpl42.toString();
        bigMatrixImpl42.setScale(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix46 = bigMatrixImpl0.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl42);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (byte) 100, 32);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl5 = new org.apache.commons.math.linear.BigMatrixImpl((int) ' ', (int) (byte) 100);
        int int6 = bigMatrixImpl5.getRoundingMode();
        double[] doubleArray9 = new double[] { (short) 10, 100L };
        double[] doubleArray12 = new double[] { (short) 10, 100L };
        double[] doubleArray15 = new double[] { (short) 10, 100L };
        double[] doubleArray18 = new double[] { (short) 10, 100L };
        double[][] doubleArray19 = new double[][] { doubleArray9, doubleArray12, doubleArray15, doubleArray18 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray19);
        java.math.BigDecimal[][] bigDecimalArray21 = bigMatrixImpl20.getData();
        java.math.BigDecimal[][] bigDecimalArray22 = bigMatrixImpl20.getData();
        bigMatrixImpl5.setSubMatrix(bigDecimalArray22, 4, 0);
        int int26 = bigMatrixImpl5.getScale();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix27 = bigMatrixImpl2.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl5);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode((int) '4');
        bigMatrixImpl0.setRoundingMode((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray12 = bigMatrixImpl0.getColumn((int) (byte) 10);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode((int) '4');
        bigMatrixImpl0.setRoundingMode(100);
        int int11 = bigMatrixImpl0.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray13 = bigMatrixImpl0.getColumn((int) '#');
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        java.math.BigDecimal[][] bigDecimalArray6 = bigMatrixImpl0.getDataRef();
        java.lang.String str7 = bigMatrixImpl0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal8 = bigMatrixImpl0.getDeterminant();
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        int int4 = bigMatrixImpl0.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = bigMatrixImpl0.copy();
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setScale((int) (short) 100);
        java.lang.String str6 = bigMatrixImpl0.toString();
        int[] intArray13 = new int[] { (byte) 100, (short) -1, 97, 2, 'a', (short) 1 };
        int[] intArray20 = new int[] { (byte) 100, (short) 1, 'a', (byte) 0, 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = bigMatrixImpl0.getSubMatrix(intArray13, intArray20);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal4 = bigMatrixImpl0.getTrace();
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) ' ', (int) (byte) 100);
        boolean boolean4 = bigMatrixImpl2.equals((java.lang.Object) "");
        boolean boolean5 = bigMatrixImpl2.isSingular();
        bigMatrixImpl2.setRoundingMode((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal8 = bigMatrixImpl2.getNorm();
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) ' ', (int) (byte) 100);
        int int3 = bigMatrixImpl2.getColumnDimension();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray4 = bigMatrixImpl2.getDataAsDoubleArray();
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        int int4 = bigMatrixImpl0.getRoundingMode();
        double[] doubleArray7 = new double[] { (short) 10, 100L };
        double[] doubleArray10 = new double[] { (short) 10, 100L };
        double[] doubleArray13 = new double[] { (short) 10, 100L };
        double[] doubleArray16 = new double[] { (short) 10, 100L };
        double[][] doubleArray17 = new double[][] { doubleArray7, doubleArray10, doubleArray13, doubleArray16 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray17);
        java.math.BigDecimal[][] bigDecimalArray19 = bigMatrixImpl18.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray19);
        java.math.BigDecimal bigDecimal21 = bigMatrixImpl20.getNorm();
        java.math.BigDecimal[][] bigDecimalArray22 = bigMatrixImpl20.getDataRef();
        int int23 = bigMatrixImpl20.getColumnDimension();
        java.math.BigDecimal bigDecimal24 = bigMatrixImpl20.getNorm();
        java.math.BigDecimal[][] bigDecimalArray25 = bigMatrixImpl20.getDataRef();
        java.math.BigDecimal[][] bigDecimalArray26 = bigMatrixImpl20.getData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix27 = bigMatrixImpl0.solve((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl20);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = bigMatrixImpl0.transpose();
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal bigDecimal14 = bigMatrixImpl13.getNorm();
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[] doubleArray26 = new double[] { (short) 10, 100L };
        double[][] doubleArray27 = new double[][] { doubleArray17, doubleArray20, doubleArray23, doubleArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray27);
        java.math.BigDecimal[][] bigDecimalArray29 = bigMatrixImpl28.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl30 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray29);
        java.math.BigDecimal bigDecimal31 = bigMatrixImpl30.getNorm();
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal14, bigDecimal31 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        double[] doubleArray37 = new double[] { (short) 10, 100L };
        double[] doubleArray40 = new double[] { (short) 10, 100L };
        double[] doubleArray43 = new double[] { (short) 10, 100L };
        double[] doubleArray46 = new double[] { (short) 10, 100L };
        double[][] doubleArray47 = new double[][] { doubleArray37, doubleArray40, doubleArray43, doubleArray46 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl48 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray47);
        java.math.BigDecimal[][] bigDecimalArray49 = bigMatrixImpl48.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl50 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray49);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl51 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray49);
        org.apache.commons.math.linear.BigMatrix bigMatrix52 = bigMatrixImpl34.preMultiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl51);
        int int53 = bigMatrixImpl51.getRoundingMode();
        java.math.BigDecimal bigDecimal54 = bigMatrixImpl51.getNorm();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl55 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl55.setRoundingMode((int) 'a');
        java.lang.String str58 = bigMatrixImpl55.toString();
        int int59 = bigMatrixImpl55.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray60 = bigMatrixImpl55.getDataRef();
        java.math.BigDecimal[][] bigDecimalArray61 = bigMatrixImpl55.getDataRef();
        int int62 = bigMatrixImpl55.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray63 = bigMatrixImpl55.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix64 = bigMatrixImpl51.preMultiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl55);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (byte) 10, (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal3 = bigMatrixImpl2.getNorm();
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(0);
        java.math.BigDecimal[][] bigDecimalArray9 = bigMatrixImpl0.getDataRef();
        bigMatrixImpl0.setRoundingMode(1);
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[][] doubleArray24 = new double[][] { doubleArray14, doubleArray17, doubleArray20, doubleArray23 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray24);
        java.math.BigDecimal bigDecimal26 = bigMatrixImpl25.getNorm();
        double[] doubleArray29 = new double[] { (short) 10, 100L };
        double[] doubleArray32 = new double[] { (short) 10, 100L };
        double[] doubleArray35 = new double[] { (short) 10, 100L };
        double[] doubleArray38 = new double[] { (short) 10, 100L };
        double[][] doubleArray39 = new double[][] { doubleArray29, doubleArray32, doubleArray35, doubleArray38 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        java.math.BigDecimal[][] bigDecimalArray41 = bigMatrixImpl40.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl42 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray41);
        java.math.BigDecimal bigDecimal43 = bigMatrixImpl42.getNorm();
        java.math.BigDecimal[] bigDecimalArray44 = new java.math.BigDecimal[] { bigDecimal26, bigDecimal43 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray44);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl46 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray44);
        java.lang.String str47 = bigMatrixImpl46.toString();
        int int48 = bigMatrixImpl46.getColumnDimension();
        java.math.BigDecimal[] bigDecimalArray50 = bigMatrixImpl46.getRow((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray51 = bigMatrixImpl0.preMultiply(bigDecimalArray50);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = bigMatrixImpl13.copy();
        java.lang.String str15 = bigMatrixImpl13.toString();
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = bigMatrixImpl13.getColumnMatrix(1);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl18.setRoundingMode((int) 'a');
        int int21 = bigMatrixImpl18.getRoundingMode();
        bigMatrixImpl18.setScale((int) (short) 100);
        java.lang.String str24 = bigMatrixImpl18.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix25 = bigMatrixImpl13.solve((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl18);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        java.math.BigDecimal[][] bigDecimalArray6 = bigMatrixImpl0.getDataRef();
        java.lang.String str7 = bigMatrixImpl0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = bigMatrixImpl0.getSubMatrix((int) (byte) 1, (int) '4', 32, 32);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) (short) 100);
        bigMatrixImpl0.setRoundingMode((int) (byte) 0);
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[][] doubleArray21 = new double[][] { doubleArray11, doubleArray14, doubleArray17, doubleArray20 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray21);
        java.math.BigDecimal[][] bigDecimalArray23 = bigMatrixImpl22.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl24 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray23);
        java.math.BigDecimal bigDecimal25 = bigMatrixImpl24.getNorm();
        java.math.BigDecimal[][] bigDecimalArray26 = bigMatrixImpl24.getDataRef();
        int int27 = bigMatrixImpl24.getColumnDimension();
        java.math.BigDecimal[] bigDecimalArray29 = bigMatrixImpl24.getColumn((int) (byte) 1);
        java.math.BigDecimal[][] bigDecimalArray30 = bigMatrixImpl24.getData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix31 = bigMatrixImpl0.preMultiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl24);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode(4);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl7 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl7.setRoundingMode((int) 'a');
        java.lang.String str10 = bigMatrixImpl7.toString();
        int int11 = bigMatrixImpl7.getRoundingMode();
        bigMatrixImpl7.setRoundingMode((int) ' ');
        bigMatrixImpl7.setRoundingMode(0);
        java.math.BigDecimal[][] bigDecimalArray16 = bigMatrixImpl7.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = bigMatrixImpl0.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl7);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        int int17 = bigMatrixImpl16.getColumnDimension();
        bigMatrixImpl16.setScale((int) (byte) 100);
        boolean boolean20 = bigMatrixImpl16.isSingular();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl21.setRoundingMode(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix24 = bigMatrixImpl16.add((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl21);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(100);
        int int9 = bigMatrixImpl0.getRoundingMode();
        double[] doubleArray12 = new double[] { (short) 10, 100L };
        double[] doubleArray15 = new double[] { (short) 10, 100L };
        double[] doubleArray18 = new double[] { (short) 10, 100L };
        double[] doubleArray21 = new double[] { (short) 10, 100L };
        double[][] doubleArray22 = new double[][] { doubleArray12, doubleArray15, doubleArray18, doubleArray21 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl23 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray22);
        java.math.BigDecimal[][] bigDecimalArray24 = bigMatrixImpl23.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl26 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        bigMatrixImpl26.setRoundingMode((int) (short) 100);
        org.apache.commons.math.linear.BigMatrix bigMatrix29 = bigMatrixImpl26.copy();
        org.apache.commons.math.linear.BigMatrix bigMatrix30 = bigMatrixImpl26.copy();
        int int31 = bigMatrixImpl26.getRowDimension();
        int int32 = bigMatrixImpl26.getScale();
        java.lang.String str33 = bigMatrixImpl26.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix34 = bigMatrixImpl0.solve((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl26);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) (short) 100);
        double[] doubleArray9 = new double[] { (short) 10, 100L };
        double[] doubleArray12 = new double[] { (short) 10, 100L };
        double[] doubleArray15 = new double[] { (short) 10, 100L };
        double[] doubleArray18 = new double[] { (short) 10, 100L };
        double[][] doubleArray19 = new double[][] { doubleArray9, doubleArray12, doubleArray15, doubleArray18 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray19);
        java.math.BigDecimal bigDecimal21 = bigMatrixImpl20.getNorm();
        double[] doubleArray24 = new double[] { (short) 10, 100L };
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[] doubleArray30 = new double[] { (short) 10, 100L };
        double[] doubleArray33 = new double[] { (short) 10, 100L };
        double[][] doubleArray34 = new double[][] { doubleArray24, doubleArray27, doubleArray30, doubleArray33 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl35 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray34);
        java.math.BigDecimal[][] bigDecimalArray36 = bigMatrixImpl35.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray36);
        java.math.BigDecimal bigDecimal38 = bigMatrixImpl37.getNorm();
        java.math.BigDecimal[] bigDecimalArray39 = new java.math.BigDecimal[] { bigDecimal21, bigDecimal38 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray39);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray39);
        double[] doubleArray44 = new double[] { (short) 10, 100L };
        double[] doubleArray47 = new double[] { (short) 10, 100L };
        double[] doubleArray50 = new double[] { (short) 10, 100L };
        double[] doubleArray53 = new double[] { (short) 10, 100L };
        double[][] doubleArray54 = new double[][] { doubleArray44, doubleArray47, doubleArray50, doubleArray53 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl55 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray54);
        java.math.BigDecimal[][] bigDecimalArray56 = bigMatrixImpl55.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl57 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray56);
        java.math.BigDecimal bigDecimal58 = bigMatrixImpl57.getNorm();
        java.math.BigDecimal[][] bigDecimalArray59 = bigMatrixImpl57.getDataRef();
        int int60 = bigMatrixImpl57.getColumnDimension();
        java.math.BigDecimal bigDecimal61 = bigMatrixImpl57.getNorm();
        double[] doubleArray64 = new double[] { (short) 10, 100L };
        double[] doubleArray67 = new double[] { (short) 10, 100L };
        double[] doubleArray70 = new double[] { (short) 10, 100L };
        double[] doubleArray73 = new double[] { (short) 10, 100L };
        double[][] doubleArray74 = new double[][] { doubleArray64, doubleArray67, doubleArray70, doubleArray73 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl75 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray74);
        java.math.BigDecimal bigDecimal76 = bigMatrixImpl75.getNorm();
        java.math.BigDecimal[] bigDecimalArray77 = new java.math.BigDecimal[] { bigDecimal61, bigDecimal76 };
        java.math.BigDecimal[] bigDecimalArray78 = bigMatrixImpl41.preMultiply(bigDecimalArray77);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl79 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray78);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray80 = bigMatrixImpl0.solve(bigDecimalArray78);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode(100);
        java.math.BigDecimal[][] bigDecimalArray3 = bigMatrixImpl0.getDataRef();
        double[] doubleArray6 = new double[] { (short) 10, 100L };
        double[] doubleArray9 = new double[] { (short) 10, 100L };
        double[] doubleArray12 = new double[] { (short) 10, 100L };
        double[] doubleArray15 = new double[] { (short) 10, 100L };
        double[][] doubleArray16 = new double[][] { doubleArray6, doubleArray9, doubleArray12, doubleArray15 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray16);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray18);
        bigMatrixImpl20.setRoundingMode((int) (short) 100);
        double[] doubleArray25 = new double[] { (short) 10, 100L };
        double[] doubleArray28 = new double[] { (short) 10, 100L };
        double[] doubleArray31 = new double[] { (short) 10, 100L };
        double[] doubleArray34 = new double[] { (short) 10, 100L };
        double[][] doubleArray35 = new double[][] { doubleArray25, doubleArray28, doubleArray31, doubleArray34 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl36 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray35);
        java.math.BigDecimal[][] bigDecimalArray37 = bigMatrixImpl36.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl38 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray37);
        java.math.BigDecimal bigDecimal39 = bigMatrixImpl38.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix40 = bigMatrixImpl20.scalarAdd(bigDecimal39);
        double[] doubleArray42 = bigMatrixImpl20.getColumnAsDoubleArray((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray43 = bigMatrixImpl0.solve(doubleArray42);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        java.math.BigDecimal[][] bigDecimalArray16 = bigMatrixImpl15.getData();
        bigMatrixImpl15.setRoundingMode((int) 'a');
        java.math.BigDecimal bigDecimal19 = bigMatrixImpl15.getNorm();
        boolean boolean20 = bigMatrixImpl15.isSquare();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl21.setRoundingMode((int) 'a');
        java.lang.String str24 = bigMatrixImpl21.toString();
        int int25 = bigMatrixImpl21.getRoundingMode();
        bigMatrixImpl21.setRoundingMode((int) ' ');
        bigMatrixImpl21.setRoundingMode(0);
        int int30 = bigMatrixImpl21.getScale();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix31 = bigMatrixImpl15.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl21);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) ' ', (int) (byte) 100);
        boolean boolean3 = bigMatrixImpl2.isSquare();
        int int4 = bigMatrixImpl2.getScale();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = bigMatrixImpl2.getRowAsDoubleArray((int) (short) 1);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode(100);
        java.math.BigDecimal[][] bigDecimalArray3 = bigMatrixImpl0.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = bigMatrixImpl0.isSquare();
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setScale((int) (short) 100);
        bigMatrixImpl0.setScale((int) (byte) 0);
        double[] doubleArray10 = new double[] { (short) 10, 100L };
        double[] doubleArray13 = new double[] { (short) 10, 100L };
        double[] doubleArray16 = new double[] { (short) 10, 100L };
        double[] doubleArray19 = new double[] { (short) 10, 100L };
        double[][] doubleArray20 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray20);
        java.math.BigDecimal bigDecimal22 = bigMatrixImpl21.getNorm();
        double[] doubleArray25 = new double[] { (short) 10, 100L };
        double[] doubleArray28 = new double[] { (short) 10, 100L };
        double[] doubleArray31 = new double[] { (short) 10, 100L };
        double[] doubleArray34 = new double[] { (short) 10, 100L };
        double[][] doubleArray35 = new double[][] { doubleArray25, doubleArray28, doubleArray31, doubleArray34 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl36 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray35);
        java.math.BigDecimal[][] bigDecimalArray37 = bigMatrixImpl36.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl38 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray37);
        java.math.BigDecimal bigDecimal39 = bigMatrixImpl38.getNorm();
        java.math.BigDecimal[] bigDecimalArray40 = new java.math.BigDecimal[] { bigDecimal22, bigDecimal39 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray40);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl42 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean43 = bigMatrixImpl0.equals((java.lang.Object) bigMatrixImpl42);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        java.math.BigDecimal bigDecimal16 = bigMatrixImpl15.getNorm();
        java.math.BigDecimal[][] bigDecimalArray17 = bigMatrixImpl15.getDataRef();
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[] doubleArray26 = new double[] { (short) 10, 100L };
        double[] doubleArray29 = new double[] { (short) 10, 100L };
        double[][] doubleArray30 = new double[][] { doubleArray20, doubleArray23, doubleArray26, doubleArray29 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl31 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray30);
        java.math.BigDecimal[][] bigDecimalArray32 = bigMatrixImpl31.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        java.math.BigDecimal bigDecimal34 = bigMatrixImpl33.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix35 = bigMatrixImpl15.scalarMultiply(bigDecimal34);
        java.math.BigDecimal[][] bigDecimalArray36 = bigMatrixImpl15.getData();
        java.math.BigDecimal[][] bigDecimalArray37 = bigMatrixImpl15.getDataRef();
        double[] doubleArray40 = new double[] { (short) 10, 100L };
        double[] doubleArray43 = new double[] { (short) 10, 100L };
        double[] doubleArray46 = new double[] { (short) 10, 100L };
        double[] doubleArray49 = new double[] { (short) 10, 100L };
        double[][] doubleArray50 = new double[][] { doubleArray40, doubleArray43, doubleArray46, doubleArray49 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl51 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray50);
        java.math.BigDecimal[][] bigDecimalArray52 = bigMatrixImpl51.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl53 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray52);
        java.math.BigDecimal bigDecimal54 = bigMatrixImpl53.getNorm();
        java.math.BigDecimal[][] bigDecimalArray55 = bigMatrixImpl53.getDataRef();
        int int56 = bigMatrixImpl53.getColumnDimension();
        java.math.BigDecimal bigDecimal57 = bigMatrixImpl53.getNorm();
        java.math.BigDecimal[][] bigDecimalArray58 = bigMatrixImpl53.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl59 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray58);
        java.math.BigDecimal[][] bigDecimalArray60 = bigMatrixImpl59.getDataRef();
        org.apache.commons.math.linear.BigMatrix bigMatrix62 = bigMatrixImpl59.getColumnMatrix(1);
        boolean boolean63 = bigMatrixImpl59.isSquare();
        java.math.BigDecimal bigDecimal66 = bigMatrixImpl59.getEntry(1, (int) (short) 0);
        org.apache.commons.math.linear.BigMatrix bigMatrix67 = bigMatrixImpl15.scalarMultiply(bigDecimal66);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl68 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl68.setRoundingMode((int) 'a');
        java.lang.String str71 = bigMatrixImpl68.toString();
        int int72 = bigMatrixImpl68.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray73 = bigMatrixImpl68.getDataRef();
        bigMatrixImpl68.setScale((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix76 = bigMatrixImpl15.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl68);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(0);
        java.math.BigDecimal[][] bigDecimalArray9 = bigMatrixImpl0.getDataRef();
        bigMatrixImpl0.setRoundingMode(1);
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[][] doubleArray24 = new double[][] { doubleArray14, doubleArray17, doubleArray20, doubleArray23 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray24);
        java.math.BigDecimal bigDecimal26 = bigMatrixImpl25.getNorm();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix27 = bigMatrixImpl0.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl25);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) ' ', (int) (byte) 100);
        boolean boolean3 = bigMatrixImpl2.isSquare();
        int int4 = bigMatrixImpl2.getScale();
        double[] doubleArray7 = new double[] { (short) 10, 100L };
        double[] doubleArray10 = new double[] { (short) 10, 100L };
        double[] doubleArray13 = new double[] { (short) 10, 100L };
        double[] doubleArray16 = new double[] { (short) 10, 100L };
        double[][] doubleArray17 = new double[][] { doubleArray7, doubleArray10, doubleArray13, doubleArray16 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = bigMatrixImpl18.copy();
        int int20 = bigMatrixImpl18.getRowDimension();
        boolean boolean21 = bigMatrixImpl2.equals((java.lang.Object) int20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray22 = bigMatrixImpl2.getDataAsDoubleArray();
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(0);
        java.math.BigDecimal[][] bigDecimalArray9 = bigMatrixImpl0.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        bigMatrixImpl0.luDecompose();
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal bigDecimal14 = bigMatrixImpl13.getNorm();
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[] doubleArray26 = new double[] { (short) 10, 100L };
        double[][] doubleArray27 = new double[][] { doubleArray17, doubleArray20, doubleArray23, doubleArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray27);
        java.math.BigDecimal[][] bigDecimalArray29 = bigMatrixImpl28.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl30 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray29);
        java.math.BigDecimal bigDecimal31 = bigMatrixImpl30.getNorm();
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal14, bigDecimal31 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        boolean boolean35 = bigMatrixImpl34.isSquare();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl36 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl36.setRoundingMode((int) 'a');
        java.lang.String str39 = bigMatrixImpl36.toString();
        int int40 = bigMatrixImpl36.getRoundingMode();
        bigMatrixImpl36.setRoundingMode((int) ' ');
        bigMatrixImpl36.setRoundingMode(100);
        boolean boolean46 = bigMatrixImpl36.equals((java.lang.Object) 0.0f);
        boolean boolean47 = bigMatrixImpl34.equals((java.lang.Object) boolean46);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on bigMatrixImpl13 and bigMatrixImpl36.", bigMatrixImpl13.equals(bigMatrixImpl36) == bigMatrixImpl36.equals(bigMatrixImpl13));
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setScale((int) (short) 100);
        java.lang.String str6 = bigMatrixImpl0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal7 = bigMatrixImpl0.getDeterminant();
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setScale((int) (short) 100);
        java.lang.String str6 = bigMatrixImpl0.toString();
        int int7 = bigMatrixImpl0.getScale();
        double[] doubleArray10 = new double[] { (short) 10, 100L };
        double[] doubleArray13 = new double[] { (short) 10, 100L };
        double[] doubleArray16 = new double[] { (short) 10, 100L };
        double[] doubleArray19 = new double[] { (short) 10, 100L };
        double[][] doubleArray20 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray20);
        java.math.BigDecimal bigDecimal22 = bigMatrixImpl21.getNorm();
        double[] doubleArray25 = new double[] { (short) 10, 100L };
        double[] doubleArray28 = new double[] { (short) 10, 100L };
        double[] doubleArray31 = new double[] { (short) 10, 100L };
        double[] doubleArray34 = new double[] { (short) 10, 100L };
        double[][] doubleArray35 = new double[][] { doubleArray25, doubleArray28, doubleArray31, doubleArray34 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl36 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray35);
        java.math.BigDecimal[][] bigDecimalArray37 = bigMatrixImpl36.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl38 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray37);
        java.math.BigDecimal bigDecimal39 = bigMatrixImpl38.getNorm();
        java.math.BigDecimal[] bigDecimalArray40 = new java.math.BigDecimal[] { bigDecimal22, bigDecimal39 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray40);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl42 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray40);
        double[] doubleArray45 = new double[] { (short) 10, 100L };
        double[] doubleArray48 = new double[] { (short) 10, 100L };
        double[] doubleArray51 = new double[] { (short) 10, 100L };
        double[] doubleArray54 = new double[] { (short) 10, 100L };
        double[][] doubleArray55 = new double[][] { doubleArray45, doubleArray48, doubleArray51, doubleArray54 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl56 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray55);
        java.math.BigDecimal[][] bigDecimalArray57 = bigMatrixImpl56.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl58 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray57);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl59 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray57);
        org.apache.commons.math.linear.BigMatrix bigMatrix60 = bigMatrixImpl42.preMultiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl59);
        int int61 = bigMatrixImpl59.getRoundingMode();
        bigMatrixImpl59.setRoundingMode((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix64 = bigMatrixImpl0.preMultiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl59);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        java.lang.String str4 = bigMatrixImpl0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal5 = bigMatrixImpl0.getTrace();
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode(4);
        int int3 = bigMatrixImpl0.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal6 = bigMatrixImpl0.getEntry(100, (int) (short) 0);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) ' ', (int) (byte) 100);
        boolean boolean4 = bigMatrixImpl2.equals((java.lang.Object) "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray5 = bigMatrixImpl2.getDataAsDoubleArray();
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode(4);
        int[] intArray12 = new int[] { 'a', (short) 100, 1, 10, (byte) 100 };
        int[] intArray15 = new int[] { (byte) 1, 32 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = bigMatrixImpl0.getSubMatrix(intArray12, intArray15);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = bigMatrixImpl0.isSquare();
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        java.math.BigDecimal[][] bigDecimalArray6 = bigMatrixImpl0.getDataRef();
        int int7 = bigMatrixImpl0.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = bigMatrixImpl0.getRowAsDoubleArray(97);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) 'a', 2);
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[][] doubleArray15 = new double[][] { doubleArray5, doubleArray8, doubleArray11, doubleArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray15);
        java.math.BigDecimal bigDecimal17 = bigMatrixImpl16.getNorm();
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[] doubleArray26 = new double[] { (short) 10, 100L };
        double[] doubleArray29 = new double[] { (short) 10, 100L };
        double[][] doubleArray30 = new double[][] { doubleArray20, doubleArray23, doubleArray26, doubleArray29 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl31 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray30);
        java.math.BigDecimal[][] bigDecimalArray32 = bigMatrixImpl31.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        java.math.BigDecimal bigDecimal34 = bigMatrixImpl33.getNorm();
        java.math.BigDecimal[] bigDecimalArray35 = new java.math.BigDecimal[] { bigDecimal17, bigDecimal34 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl36 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray35);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray35);
        double[] doubleArray40 = new double[] { (short) 10, 100L };
        double[] doubleArray43 = new double[] { (short) 10, 100L };
        double[] doubleArray46 = new double[] { (short) 10, 100L };
        double[] doubleArray49 = new double[] { (short) 10, 100L };
        double[][] doubleArray50 = new double[][] { doubleArray40, doubleArray43, doubleArray46, doubleArray49 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl51 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray50);
        java.math.BigDecimal[][] bigDecimalArray52 = bigMatrixImpl51.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl53 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray52);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl54 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray52);
        org.apache.commons.math.linear.BigMatrix bigMatrix55 = bigMatrixImpl37.preMultiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl54);
        boolean boolean56 = bigMatrixImpl2.equals((java.lang.Object) bigMatrixImpl54);
        double[] doubleArray59 = new double[] { (short) 10, 100L };
        double[] doubleArray62 = new double[] { (short) 10, 100L };
        double[] doubleArray65 = new double[] { (short) 10, 100L };
        double[] doubleArray68 = new double[] { (short) 10, 100L };
        double[][] doubleArray69 = new double[][] { doubleArray59, doubleArray62, doubleArray65, doubleArray68 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl70 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray69);
        java.math.BigDecimal[][] bigDecimalArray71 = bigMatrixImpl70.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl72 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray71);
        java.math.BigDecimal[][] bigDecimalArray73 = bigMatrixImpl72.getData();
        bigMatrixImpl72.setRoundingMode((int) 'a');
        java.math.BigDecimal bigDecimal76 = bigMatrixImpl72.getNorm();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix77 = bigMatrixImpl2.scalarMultiply(bigDecimal76);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) ' ', (int) (byte) 100);
        int int3 = bigMatrixImpl2.getRoundingMode();
        double[] doubleArray6 = new double[] { (short) 10, 100L };
        double[] doubleArray9 = new double[] { (short) 10, 100L };
        double[] doubleArray12 = new double[] { (short) 10, 100L };
        double[] doubleArray15 = new double[] { (short) 10, 100L };
        double[][] doubleArray16 = new double[][] { doubleArray6, doubleArray9, doubleArray12, doubleArray15 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray16);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getData();
        java.math.BigDecimal[][] bigDecimalArray19 = bigMatrixImpl17.getData();
        bigMatrixImpl2.setSubMatrix(bigDecimalArray19, 4, 0);
        org.apache.commons.math.linear.BigMatrix bigMatrix23 = bigMatrixImpl2.transpose();
        double[] doubleArray26 = new double[] { (short) 10, 100L };
        double[] doubleArray29 = new double[] { (short) 10, 100L };
        double[] doubleArray32 = new double[] { (short) 10, 100L };
        double[] doubleArray35 = new double[] { (short) 10, 100L };
        double[][] doubleArray36 = new double[][] { doubleArray26, doubleArray29, doubleArray32, doubleArray35 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray36);
        java.math.BigDecimal[][] bigDecimalArray38 = bigMatrixImpl37.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray38);
        java.math.BigDecimal bigDecimal40 = bigMatrixImpl39.getNorm();
        java.math.BigDecimal[][] bigDecimalArray41 = bigMatrixImpl39.getDataRef();
        double[] doubleArray44 = new double[] { (short) 10, 100L };
        double[] doubleArray47 = new double[] { (short) 10, 100L };
        double[] doubleArray50 = new double[] { (short) 10, 100L };
        double[] doubleArray53 = new double[] { (short) 10, 100L };
        double[][] doubleArray54 = new double[][] { doubleArray44, doubleArray47, doubleArray50, doubleArray53 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl55 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray54);
        java.math.BigDecimal[][] bigDecimalArray56 = bigMatrixImpl55.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl57 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray56);
        java.math.BigDecimal bigDecimal58 = bigMatrixImpl57.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix59 = bigMatrixImpl39.scalarMultiply(bigDecimal58);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix60 = bigMatrixImpl2.scalarAdd(bigDecimal58);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(0);
        int int9 = bigMatrixImpl0.getScale();
        bigMatrixImpl0.setRoundingMode(64);
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[][] doubleArray24 = new double[][] { doubleArray14, doubleArray17, doubleArray20, doubleArray23 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray24);
        double[][] doubleArray26 = bigMatrixImpl25.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl27 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray26);
        int int28 = bigMatrixImpl27.getColumnDimension();
        java.math.BigDecimal[][] bigDecimalArray29 = bigMatrixImpl27.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix30 = bigMatrixImpl0.add((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl27);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode((int) '4');
        bigMatrixImpl0.setRoundingMode(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = bigMatrixImpl0.copy();
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) ' ', (int) (byte) 100);
        boolean boolean3 = bigMatrixImpl2.isSquare();
        int int4 = bigMatrixImpl2.getScale();
        double[] doubleArray7 = new double[] { (short) 10, 100L };
        double[] doubleArray10 = new double[] { (short) 10, 100L };
        double[] doubleArray13 = new double[] { (short) 10, 100L };
        double[] doubleArray16 = new double[] { (short) 10, 100L };
        double[][] doubleArray17 = new double[][] { doubleArray7, doubleArray10, doubleArray13, doubleArray16 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = bigMatrixImpl18.copy();
        int int20 = bigMatrixImpl18.getRowDimension();
        boolean boolean21 = bigMatrixImpl2.equals((java.lang.Object) int20);
        double[] doubleArray24 = new double[] { (short) 10, 100L };
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[] doubleArray30 = new double[] { (short) 10, 100L };
        double[] doubleArray33 = new double[] { (short) 10, 100L };
        double[][] doubleArray34 = new double[][] { doubleArray24, doubleArray27, doubleArray30, doubleArray33 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl35 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray34);
        java.math.BigDecimal[][] bigDecimalArray36 = bigMatrixImpl35.getData();
        int int37 = bigMatrixImpl35.getScale();
        java.math.BigDecimal bigDecimal38 = bigMatrixImpl35.getNorm();
        double[] doubleArray41 = new double[] { (short) 10, 100L };
        double[] doubleArray44 = new double[] { (short) 10, 100L };
        double[] doubleArray47 = new double[] { (short) 10, 100L };
        double[] doubleArray50 = new double[] { (short) 10, 100L };
        double[][] doubleArray51 = new double[][] { doubleArray41, doubleArray44, doubleArray47, doubleArray50 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl52 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray51);
        java.math.BigDecimal[][] bigDecimalArray53 = bigMatrixImpl52.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl54 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray53);
        java.math.BigDecimal bigDecimal55 = bigMatrixImpl54.getNorm();
        java.math.BigDecimal[][] bigDecimalArray56 = bigMatrixImpl54.getDataRef();
        int int57 = bigMatrixImpl54.getColumnDimension();
        java.math.BigDecimal bigDecimal58 = bigMatrixImpl54.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix59 = bigMatrixImpl35.scalarMultiply(bigDecimal58);
        boolean boolean60 = bigMatrixImpl2.equals((java.lang.Object) bigMatrixImpl35);
        int int61 = bigMatrixImpl35.getRoundingMode();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) (short) 100);
        bigMatrixImpl0.setRoundingMode((int) (byte) 0);
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[][] doubleArray21 = new double[][] { doubleArray11, doubleArray14, doubleArray17, doubleArray20 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray21);
        double[][] doubleArray23 = bigMatrixImpl22.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl24 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray23);
        int int25 = bigMatrixImpl24.getScale();
        double[] doubleArray28 = new double[] { (short) 10, 100L };
        double[] doubleArray31 = new double[] { (short) 10, 100L };
        double[] doubleArray34 = new double[] { (short) 10, 100L };
        double[] doubleArray37 = new double[] { (short) 10, 100L };
        double[][] doubleArray38 = new double[][] { doubleArray28, doubleArray31, doubleArray34, doubleArray37 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray38);
        java.math.BigDecimal[][] bigDecimalArray40 = bigMatrixImpl39.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray40);
        java.math.BigDecimal bigDecimal42 = bigMatrixImpl41.getNorm();
        java.math.BigDecimal[][] bigDecimalArray43 = bigMatrixImpl41.getDataRef();
        int int44 = bigMatrixImpl41.getColumnDimension();
        java.math.BigDecimal bigDecimal45 = bigMatrixImpl41.getNorm();
        java.math.BigDecimal[][] bigDecimalArray46 = bigMatrixImpl41.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl47 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray46);
        java.math.BigDecimal[][] bigDecimalArray48 = bigMatrixImpl47.getDataRef();
        boolean boolean49 = bigMatrixImpl24.equals((java.lang.Object) bigMatrixImpl47);
        org.apache.commons.math.linear.BigMatrix bigMatrix51 = bigMatrixImpl47.getColumnMatrix((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix52 = bigMatrixImpl0.add(bigMatrix51);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setScale((int) (short) 100);
        int int6 = bigMatrixImpl0.getScale();
        double[] doubleArray9 = new double[] { (short) 10, 100L };
        double[] doubleArray12 = new double[] { (short) 10, 100L };
        double[] doubleArray15 = new double[] { (short) 10, 100L };
        double[] doubleArray18 = new double[] { (short) 10, 100L };
        double[][] doubleArray19 = new double[][] { doubleArray9, doubleArray12, doubleArray15, doubleArray18 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray19);
        java.math.BigDecimal[][] bigDecimalArray21 = bigMatrixImpl20.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray21);
        double[] doubleArray25 = new double[] { (short) 10, 100L };
        double[] doubleArray28 = new double[] { (short) 10, 100L };
        double[] doubleArray31 = new double[] { (short) 10, 100L };
        double[] doubleArray34 = new double[] { (short) 10, 100L };
        double[][] doubleArray35 = new double[][] { doubleArray25, doubleArray28, doubleArray31, doubleArray34 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl36 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray35);
        java.math.BigDecimal[][] bigDecimalArray37 = bigMatrixImpl36.getData();
        boolean boolean38 = bigMatrixImpl22.equals((java.lang.Object) bigMatrixImpl36);
        int int39 = bigMatrixImpl36.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix40 = bigMatrixImpl0.solve((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl36);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode(4);
        int int3 = bigMatrixImpl0.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = bigMatrixImpl0.getColumnMatrix((int) (short) 100);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        java.math.BigDecimal[][] bigDecimalArray6 = bigMatrixImpl0.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = bigMatrixImpl0.getRowDimension();
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode((int) '4');
        bigMatrixImpl0.setRoundingMode((int) (short) 100);
        java.lang.String str11 = bigMatrixImpl0.toString();
        int int12 = bigMatrixImpl0.getScale();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = bigMatrixImpl0.getSubMatrix((int) (short) 0, 97, (int) 'a', (int) (short) 0);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode(4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = bigMatrixImpl0.getEntryAsDouble(100, (int) (byte) -1);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        int int6 = bigMatrixImpl0.getScale();
        bigMatrixImpl0.setScale((int) (short) 0);
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[][] doubleArray21 = new double[][] { doubleArray11, doubleArray14, doubleArray17, doubleArray20 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray21);
        java.math.BigDecimal[][] bigDecimalArray23 = bigMatrixImpl22.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl24 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray23);
        java.math.BigDecimal[][] bigDecimalArray25 = bigMatrixImpl24.getData();
        double[] doubleArray28 = new double[] { (short) 10, 100L };
        double[] doubleArray31 = new double[] { (short) 10, 100L };
        double[] doubleArray34 = new double[] { (short) 10, 100L };
        double[] doubleArray37 = new double[] { (short) 10, 100L };
        double[][] doubleArray38 = new double[][] { doubleArray28, doubleArray31, doubleArray34, doubleArray37 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray38);
        java.math.BigDecimal[][] bigDecimalArray40 = bigMatrixImpl39.getData();
        java.math.BigDecimal[][] bigDecimalArray41 = bigMatrixImpl39.getData();
        double[][] doubleArray42 = bigMatrixImpl39.getDataAsDoubleArray();
        int int43 = bigMatrixImpl39.getScale();
        org.apache.commons.math.linear.BigMatrix bigMatrix44 = bigMatrixImpl24.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix45 = bigMatrixImpl0.preMultiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl39);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[][] bigDecimalArray9 = bigMatrixImpl0.getData();
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        bigMatrixImpl13.setRoundingMode((int) (byte) 0);
        java.math.BigDecimal[][] bigDecimalArray17 = bigMatrixImpl13.getData();
        int int18 = bigMatrixImpl13.getScale();
        boolean boolean19 = bigMatrixImpl13.isSingular();
        java.math.BigDecimal bigDecimal20 = bigMatrixImpl13.getNorm();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl23 = new org.apache.commons.math.linear.BigMatrixImpl((int) ' ', (int) (byte) 100);
        boolean boolean24 = bigMatrixImpl13.equals((java.lang.Object) bigMatrixImpl23);
        java.math.BigDecimal bigDecimal25 = bigMatrixImpl13.getNorm();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl23 and bigMatrixImpl23", bigMatrixImpl23.equals(bigMatrixImpl23) ? bigMatrixImpl23.hashCode() == bigMatrixImpl23.hashCode() : true);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(10, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        bigMatrixImpl2.luDecompose();
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(0);
        java.math.BigDecimal[][] bigDecimalArray9 = bigMatrixImpl0.getDataRef();
        bigMatrixImpl0.setRoundingMode(1);
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[][] doubleArray24 = new double[][] { doubleArray14, doubleArray17, doubleArray20, doubleArray23 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray24);
        java.math.BigDecimal[][] bigDecimalArray26 = bigMatrixImpl25.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl27 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray26);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray26);
        bigMatrixImpl28.setRoundingMode((int) (short) 100);
        double[] doubleArray33 = new double[] { (short) 10, 100L };
        double[] doubleArray36 = new double[] { (short) 10, 100L };
        double[] doubleArray39 = new double[] { (short) 10, 100L };
        double[] doubleArray42 = new double[] { (short) 10, 100L };
        double[][] doubleArray43 = new double[][] { doubleArray33, doubleArray36, doubleArray39, doubleArray42 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray43);
        java.math.BigDecimal[][] bigDecimalArray45 = bigMatrixImpl44.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl46 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray45);
        java.math.BigDecimal bigDecimal47 = bigMatrixImpl46.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix48 = bigMatrixImpl28.scalarAdd(bigDecimal47);
        double[] doubleArray51 = new double[] { (short) 10, 100L };
        double[] doubleArray54 = new double[] { (short) 10, 100L };
        double[] doubleArray57 = new double[] { (short) 10, 100L };
        double[] doubleArray60 = new double[] { (short) 10, 100L };
        double[][] doubleArray61 = new double[][] { doubleArray51, doubleArray54, doubleArray57, doubleArray60 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl62 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray61);
        java.math.BigDecimal[][] bigDecimalArray63 = bigMatrixImpl62.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl64 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray63);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl65 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray63);
        bigMatrixImpl65.setRoundingMode((int) (short) 100);
        org.apache.commons.math.linear.BigMatrix bigMatrix68 = bigMatrixImpl65.copy();
        org.apache.commons.math.linear.BigMatrix bigMatrix69 = bigMatrixImpl28.add((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl65);
        boolean boolean70 = bigMatrixImpl28.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix71 = bigMatrixImpl28.transpose();
        double[] doubleArray73 = bigMatrixImpl28.getColumnAsDoubleArray(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray74 = bigMatrixImpl0.solve(doubleArray73);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setScale((int) (short) 100);
        java.lang.String str6 = bigMatrixImpl0.toString();
        int int7 = bigMatrixImpl0.getScale();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = bigMatrixImpl0.isSingular();
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) ' ', (int) (byte) 100);
        boolean boolean3 = bigMatrixImpl2.isSquare();
        int int4 = bigMatrixImpl2.getScale();
        int int5 = bigMatrixImpl2.getRowDimension();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal6 = bigMatrixImpl2.getNorm();
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) 'a', 97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal3 = bigMatrixImpl2.getNorm();
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(32, 64);
        java.math.BigDecimal[][] bigDecimalArray3 = bigMatrixImpl2.getData();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal4 = bigMatrixImpl2.getNorm();
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) 'a', 2);
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[][] doubleArray15 = new double[][] { doubleArray5, doubleArray8, doubleArray11, doubleArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray15);
        java.math.BigDecimal bigDecimal17 = bigMatrixImpl16.getNorm();
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[] doubleArray26 = new double[] { (short) 10, 100L };
        double[] doubleArray29 = new double[] { (short) 10, 100L };
        double[][] doubleArray30 = new double[][] { doubleArray20, doubleArray23, doubleArray26, doubleArray29 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl31 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray30);
        java.math.BigDecimal[][] bigDecimalArray32 = bigMatrixImpl31.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        java.math.BigDecimal bigDecimal34 = bigMatrixImpl33.getNorm();
        java.math.BigDecimal[] bigDecimalArray35 = new java.math.BigDecimal[] { bigDecimal17, bigDecimal34 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl36 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray35);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray35);
        double[] doubleArray40 = new double[] { (short) 10, 100L };
        double[] doubleArray43 = new double[] { (short) 10, 100L };
        double[] doubleArray46 = new double[] { (short) 10, 100L };
        double[] doubleArray49 = new double[] { (short) 10, 100L };
        double[][] doubleArray50 = new double[][] { doubleArray40, doubleArray43, doubleArray46, doubleArray49 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl51 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray50);
        java.math.BigDecimal[][] bigDecimalArray52 = bigMatrixImpl51.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl53 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray52);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl54 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray52);
        org.apache.commons.math.linear.BigMatrix bigMatrix55 = bigMatrixImpl37.preMultiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl54);
        boolean boolean56 = bigMatrixImpl2.equals((java.lang.Object) bigMatrixImpl54);
        int int57 = bigMatrixImpl54.getRowDimension();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(32, 2);
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[][] doubleArray15 = new double[][] { doubleArray5, doubleArray8, doubleArray11, doubleArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray15);
        java.math.BigDecimal[][] bigDecimalArray17 = bigMatrixImpl16.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray17);
        java.math.BigDecimal bigDecimal19 = bigMatrixImpl18.getNorm();
        java.math.BigDecimal[][] bigDecimalArray20 = bigMatrixImpl18.getDataRef();
        int int21 = bigMatrixImpl18.getColumnDimension();
        java.math.BigDecimal bigDecimal22 = bigMatrixImpl18.getNorm();
        double[] doubleArray25 = new double[] { (short) 10, 100L };
        double[] doubleArray28 = new double[] { (short) 10, 100L };
        double[] doubleArray31 = new double[] { (short) 10, 100L };
        double[] doubleArray34 = new double[] { (short) 10, 100L };
        double[][] doubleArray35 = new double[][] { doubleArray25, doubleArray28, doubleArray31, doubleArray34 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl36 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray35);
        org.apache.commons.math.linear.BigMatrix bigMatrix37 = bigMatrixImpl36.copy();
        int int38 = bigMatrixImpl36.getRowDimension();
        org.apache.commons.math.linear.BigMatrix bigMatrix39 = bigMatrixImpl36.transpose();
        double[] doubleArray42 = new double[] { (short) 10, 100L };
        double[] doubleArray45 = new double[] { (short) 10, 100L };
        double[] doubleArray48 = new double[] { (short) 10, 100L };
        double[] doubleArray51 = new double[] { (short) 10, 100L };
        double[][] doubleArray52 = new double[][] { doubleArray42, doubleArray45, doubleArray48, doubleArray51 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl53 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray52);
        java.math.BigDecimal bigDecimal54 = bigMatrixImpl53.getNorm();
        boolean boolean55 = bigMatrixImpl36.equals((java.lang.Object) bigDecimal54);
        org.apache.commons.math.linear.BigMatrix bigMatrix56 = bigMatrixImpl18.scalarMultiply(bigDecimal54);
        int int57 = bigMatrixImpl18.getRoundingMode();
        boolean boolean58 = bigMatrixImpl2.equals((java.lang.Object) bigMatrixImpl18);
        bigMatrixImpl18.setRoundingMode((int) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray4 = bigMatrixImpl0.getDataAsDoubleArray();
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[][] doubleArray18 = new double[][] { doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal[][] bigDecimalArray20 = bigMatrixImpl19.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray20);
        java.math.BigDecimal bigDecimal22 = bigMatrixImpl21.getNorm();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix23 = bigMatrixImpl0.scalarMultiply(bigDecimal22);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(0);
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[][] doubleArray21 = new double[][] { doubleArray11, doubleArray14, doubleArray17, doubleArray20 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray21);
        java.math.BigDecimal[][] bigDecimalArray23 = bigMatrixImpl22.getData();
        java.math.BigDecimal[][] bigDecimalArray24 = bigMatrixImpl22.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl26 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl27 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        bigMatrixImpl27.setScale(32);
        double[] doubleArray32 = new double[] { (short) 10, 100L };
        double[] doubleArray35 = new double[] { (short) 10, 100L };
        double[] doubleArray38 = new double[] { (short) 10, 100L };
        double[] doubleArray41 = new double[] { (short) 10, 100L };
        double[][] doubleArray42 = new double[][] { doubleArray32, doubleArray35, doubleArray38, doubleArray41 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray42);
        java.math.BigDecimal[][] bigDecimalArray44 = bigMatrixImpl43.getData();
        bigMatrixImpl43.setRoundingMode((int) (byte) 0);
        java.math.BigDecimal[][] bigDecimalArray47 = bigMatrixImpl43.getData();
        int int48 = bigMatrixImpl43.getScale();
        boolean boolean49 = bigMatrixImpl43.isSingular();
        java.math.BigDecimal bigDecimal50 = bigMatrixImpl43.getNorm();
        double[] doubleArray53 = new double[] { (short) 10, 100L };
        double[] doubleArray56 = new double[] { (short) 10, 100L };
        double[] doubleArray59 = new double[] { (short) 10, 100L };
        double[] doubleArray62 = new double[] { (short) 10, 100L };
        double[][] doubleArray63 = new double[][] { doubleArray53, doubleArray56, doubleArray59, doubleArray62 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl64 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray63);
        double[][] doubleArray65 = bigMatrixImpl64.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl66 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray65);
        int int67 = bigMatrixImpl66.getScale();
        double[] doubleArray70 = new double[] { (short) 10, 100L };
        double[] doubleArray73 = new double[] { (short) 10, 100L };
        double[] doubleArray76 = new double[] { (short) 10, 100L };
        double[] doubleArray79 = new double[] { (short) 10, 100L };
        double[][] doubleArray80 = new double[][] { doubleArray70, doubleArray73, doubleArray76, doubleArray79 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl81 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray80);
        java.math.BigDecimal[][] bigDecimalArray82 = bigMatrixImpl81.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl83 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray82);
        java.math.BigDecimal bigDecimal84 = bigMatrixImpl83.getNorm();
        java.math.BigDecimal[][] bigDecimalArray85 = bigMatrixImpl83.getDataRef();
        int int86 = bigMatrixImpl83.getColumnDimension();
        java.math.BigDecimal bigDecimal87 = bigMatrixImpl83.getNorm();
        java.math.BigDecimal[][] bigDecimalArray88 = bigMatrixImpl83.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl89 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray88);
        java.math.BigDecimal[][] bigDecimalArray90 = bigMatrixImpl89.getDataRef();
        boolean boolean91 = bigMatrixImpl66.equals((java.lang.Object) bigMatrixImpl89);
        org.apache.commons.math.linear.BigMatrix bigMatrix92 = bigMatrixImpl43.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl66);
        java.math.BigDecimal[][] bigDecimalArray93 = bigMatrixImpl43.getData();
        boolean boolean94 = bigMatrixImpl27.equals((java.lang.Object) bigMatrixImpl43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix95 = bigMatrixImpl0.add((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl43);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode(4);
        int int3 = bigMatrixImpl0.getRoundingMode();
        double[] doubleArray6 = new double[] { (short) 10, 100L };
        double[] doubleArray9 = new double[] { (short) 10, 100L };
        double[] doubleArray12 = new double[] { (short) 10, 100L };
        double[] doubleArray15 = new double[] { (short) 10, 100L };
        double[][] doubleArray16 = new double[][] { doubleArray6, doubleArray9, doubleArray12, doubleArray15 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray16);
        java.math.BigDecimal bigDecimal18 = bigMatrixImpl17.getNorm();
        double[] doubleArray21 = new double[] { (short) 10, 100L };
        double[] doubleArray24 = new double[] { (short) 10, 100L };
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[] doubleArray30 = new double[] { (short) 10, 100L };
        double[][] doubleArray31 = new double[][] { doubleArray21, doubleArray24, doubleArray27, doubleArray30 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl32 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray31);
        java.math.BigDecimal[][] bigDecimalArray33 = bigMatrixImpl32.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33);
        java.math.BigDecimal bigDecimal35 = bigMatrixImpl34.getNorm();
        java.math.BigDecimal[] bigDecimalArray36 = new java.math.BigDecimal[] { bigDecimal18, bigDecimal35 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray36);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl38 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray36);
        org.apache.commons.math.linear.BigMatrix bigMatrix39 = bigMatrixImpl38.copy();
        org.apache.commons.math.linear.BigMatrix bigMatrix40 = bigMatrixImpl38.transpose();
        double[] doubleArray43 = new double[] { (short) 10, 100L };
        double[] doubleArray46 = new double[] { (short) 10, 100L };
        double[] doubleArray49 = new double[] { (short) 10, 100L };
        double[] doubleArray52 = new double[] { (short) 10, 100L };
        double[][] doubleArray53 = new double[][] { doubleArray43, doubleArray46, doubleArray49, doubleArray52 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl54 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray53);
        java.math.BigDecimal[][] bigDecimalArray55 = bigMatrixImpl54.getData();
        bigMatrixImpl54.setRoundingMode((int) (byte) 0);
        java.math.BigDecimal[][] bigDecimalArray58 = bigMatrixImpl54.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl59 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray58);
        java.math.BigDecimal bigDecimal62 = bigMatrixImpl59.getEntry(0, (int) (short) 1);
        org.apache.commons.math.linear.BigMatrix bigMatrix63 = bigMatrixImpl38.scalarMultiply(bigDecimal62);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix64 = bigMatrixImpl0.multiply(bigMatrix63);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        java.math.BigDecimal bigDecimal16 = bigMatrixImpl15.getNorm();
        java.math.BigDecimal[][] bigDecimalArray17 = bigMatrixImpl15.getDataRef();
        int int18 = bigMatrixImpl15.getColumnDimension();
        java.math.BigDecimal bigDecimal19 = bigMatrixImpl15.getNorm();
        java.math.BigDecimal[][] bigDecimalArray20 = bigMatrixImpl15.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray20);
        java.math.BigDecimal[][] bigDecimalArray22 = bigMatrixImpl21.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl23 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl23.setRoundingMode((int) 'a');
        java.lang.String str26 = bigMatrixImpl23.toString();
        int int27 = bigMatrixImpl23.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray28 = bigMatrixImpl23.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix29 = bigMatrixImpl21.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl23);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setScale((int) (short) 100);
        java.lang.String str6 = bigMatrixImpl0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = bigMatrixImpl0.getRowDimension();
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        java.math.BigDecimal[][] bigDecimalArray6 = bigMatrixImpl0.getDataRef();
        int int7 = bigMatrixImpl0.getRoundingMode();
        boolean boolean9 = bigMatrixImpl0.equals((java.lang.Object) (byte) -1);
        int int10 = bigMatrixImpl0.getScale();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray12 = bigMatrixImpl0.getColumn(1);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setScale((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = bigMatrixImpl0.isSquare();
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        java.math.BigDecimal[][] bigDecimalArray6 = bigMatrixImpl0.getDataRef();
        int int7 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray8 = bigMatrixImpl0.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal11 = bigMatrixImpl0.getEntry(0, 4);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(64, 4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray3 = bigMatrixImpl2.getDataAsDoubleArray();
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(0);
        java.math.BigDecimal[][] bigDecimalArray9 = bigMatrixImpl0.getDataRef();
        bigMatrixImpl0.setRoundingMode(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = bigMatrixImpl0.getRowAsDoubleArray((int) ' ');
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setScale((int) (short) 100);
        bigMatrixImpl0.setScale((int) (byte) 0);
        double[] doubleArray10 = new double[] { (short) 10, 100L };
        double[] doubleArray13 = new double[] { (short) 10, 100L };
        double[] doubleArray16 = new double[] { (short) 10, 100L };
        double[] doubleArray19 = new double[] { (short) 10, 100L };
        double[][] doubleArray20 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray20);
        java.math.BigDecimal[][] bigDecimalArray22 = bigMatrixImpl21.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl23 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray22);
        double[][] doubleArray24 = bigMatrixImpl23.getDataAsDoubleArray();
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[] doubleArray30 = new double[] { (short) 10, 100L };
        double[] doubleArray33 = new double[] { (short) 10, 100L };
        double[] doubleArray36 = new double[] { (short) 10, 100L };
        double[][] doubleArray37 = new double[][] { doubleArray27, doubleArray30, doubleArray33, doubleArray36 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl38 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray37);
        java.math.BigDecimal bigDecimal39 = bigMatrixImpl38.getNorm();
        bigMatrixImpl38.setScale((int) (short) 10);
        bigMatrixImpl38.setScale(97);
        org.apache.commons.math.linear.BigMatrix bigMatrix45 = bigMatrixImpl38.getRowMatrix((int) (short) 1);
        org.apache.commons.math.linear.BigMatrix bigMatrix46 = bigMatrixImpl23.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix47 = bigMatrixImpl0.multiply(bigMatrix46);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setScale((int) (short) 100);
        java.lang.String str6 = bigMatrixImpl0.toString();
        java.lang.String str7 = bigMatrixImpl0.toString();
        double[] doubleArray10 = new double[] { (short) 10, 100L };
        double[] doubleArray13 = new double[] { (short) 10, 100L };
        double[] doubleArray16 = new double[] { (short) 10, 100L };
        double[] doubleArray19 = new double[] { (short) 10, 100L };
        double[][] doubleArray20 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray20);
        java.math.BigDecimal[][] bigDecimalArray22 = bigMatrixImpl21.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl23 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray22);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl24 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray22);
        bigMatrixImpl24.setRoundingMode((int) (short) 100);
        org.apache.commons.math.linear.BigMatrix bigMatrix27 = bigMatrixImpl24.copy();
        java.lang.String str28 = bigMatrixImpl24.toString();
        boolean boolean29 = bigMatrixImpl24.isSquare();
        double[] doubleArray32 = new double[] { (short) 10, 100L };
        double[] doubleArray35 = new double[] { (short) 10, 100L };
        double[] doubleArray38 = new double[] { (short) 10, 100L };
        double[] doubleArray41 = new double[] { (short) 10, 100L };
        double[][] doubleArray42 = new double[][] { doubleArray32, doubleArray35, doubleArray38, doubleArray41 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray42);
        org.apache.commons.math.linear.BigMatrix bigMatrix44 = bigMatrixImpl43.copy();
        org.apache.commons.math.linear.BigMatrix bigMatrix45 = bigMatrixImpl24.subtract(bigMatrix44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix46 = bigMatrixImpl0.add(bigMatrix44);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (byte) 10, (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double5 = bigMatrixImpl2.getEntryAsDouble(0, 0);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        int int6 = bigMatrixImpl0.getScale();
        bigMatrixImpl0.setScale((int) (short) 0);
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[][] doubleArray21 = new double[][] { doubleArray11, doubleArray14, doubleArray17, doubleArray20 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray21);
        java.math.BigDecimal[][] bigDecimalArray23 = bigMatrixImpl22.getData();
        bigMatrixImpl22.setRoundingMode((int) (byte) 0);
        java.math.BigDecimal[][] bigDecimalArray26 = bigMatrixImpl22.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl27 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray26);
        java.math.BigDecimal[] bigDecimalArray29 = bigMatrixImpl27.getRow(2);
        double[] doubleArray31 = bigMatrixImpl27.getColumnAsDoubleArray(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray32 = bigMatrixImpl0.solve(doubleArray31);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) ' ', (int) (byte) 100);
        boolean boolean3 = bigMatrixImpl2.isSquare();
        int int4 = bigMatrixImpl2.getScale();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal5 = bigMatrixImpl2.getNorm();
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setScale((int) (short) 100);
        java.lang.String str6 = bigMatrixImpl0.toString();
        int int7 = bigMatrixImpl0.getScale();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl10 = new org.apache.commons.math.linear.BigMatrixImpl((int) (short) 100, 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = bigMatrixImpl0.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl10);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setScale((int) (short) 100);
        java.lang.String str6 = bigMatrixImpl0.toString();
        java.lang.String str7 = bigMatrixImpl0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = bigMatrixImpl0.copy();
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) ' ', (int) (byte) 100);
        boolean boolean3 = bigMatrixImpl2.isSquare();
        int int4 = bigMatrixImpl2.getScale();
        double[] doubleArray7 = new double[] { (short) 10, 100L };
        double[] doubleArray10 = new double[] { (short) 10, 100L };
        double[] doubleArray13 = new double[] { (short) 10, 100L };
        double[] doubleArray16 = new double[] { (short) 10, 100L };
        double[][] doubleArray17 = new double[][] { doubleArray7, doubleArray10, doubleArray13, doubleArray16 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = bigMatrixImpl18.copy();
        int int20 = bigMatrixImpl18.getRowDimension();
        boolean boolean21 = bigMatrixImpl2.equals((java.lang.Object) int20);
        double[] doubleArray24 = new double[] { (short) 10, 100L };
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[] doubleArray30 = new double[] { (short) 10, 100L };
        double[] doubleArray33 = new double[] { (short) 10, 100L };
        double[][] doubleArray34 = new double[][] { doubleArray24, doubleArray27, doubleArray30, doubleArray33 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl35 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray34);
        java.math.BigDecimal[][] bigDecimalArray36 = bigMatrixImpl35.getData();
        int int37 = bigMatrixImpl35.getScale();
        java.math.BigDecimal bigDecimal38 = bigMatrixImpl35.getNorm();
        double[] doubleArray41 = new double[] { (short) 10, 100L };
        double[] doubleArray44 = new double[] { (short) 10, 100L };
        double[] doubleArray47 = new double[] { (short) 10, 100L };
        double[] doubleArray50 = new double[] { (short) 10, 100L };
        double[][] doubleArray51 = new double[][] { doubleArray41, doubleArray44, doubleArray47, doubleArray50 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl52 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray51);
        java.math.BigDecimal[][] bigDecimalArray53 = bigMatrixImpl52.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl54 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray53);
        java.math.BigDecimal bigDecimal55 = bigMatrixImpl54.getNorm();
        java.math.BigDecimal[][] bigDecimalArray56 = bigMatrixImpl54.getDataRef();
        int int57 = bigMatrixImpl54.getColumnDimension();
        java.math.BigDecimal bigDecimal58 = bigMatrixImpl54.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix59 = bigMatrixImpl35.scalarMultiply(bigDecimal58);
        boolean boolean60 = bigMatrixImpl2.equals((java.lang.Object) bigMatrixImpl35);
        java.math.BigDecimal[][] bigDecimalArray61 = bigMatrixImpl35.getData();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) ' ', 100);
        boolean boolean4 = bigMatrixImpl2.equals((java.lang.Object) 0.0f);
        double[] doubleArray7 = new double[] { (short) 10, 100L };
        double[] doubleArray10 = new double[] { (short) 10, 100L };
        double[] doubleArray13 = new double[] { (short) 10, 100L };
        double[] doubleArray16 = new double[] { (short) 10, 100L };
        double[][] doubleArray17 = new double[][] { doubleArray7, doubleArray10, doubleArray13, doubleArray16 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray17);
        java.math.BigDecimal[][] bigDecimalArray19 = bigMatrixImpl18.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray19);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray19);
        int int22 = bigMatrixImpl21.getColumnDimension();
        bigMatrixImpl21.setScale((int) (byte) 100);
        boolean boolean25 = bigMatrixImpl21.isSingular();
        boolean boolean26 = bigMatrixImpl2.equals((java.lang.Object) bigMatrixImpl21);
        double[] doubleArray29 = new double[] { (short) 10, 100L };
        double[] doubleArray32 = new double[] { (short) 10, 100L };
        double[] doubleArray35 = new double[] { (short) 10, 100L };
        double[] doubleArray38 = new double[] { (short) 10, 100L };
        double[][] doubleArray39 = new double[][] { doubleArray29, doubleArray32, doubleArray35, doubleArray38 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        java.math.BigDecimal[][] bigDecimalArray41 = bigMatrixImpl40.getData();
        int int42 = bigMatrixImpl40.getScale();
        org.apache.commons.math.linear.BigMatrix bigMatrix43 = bigMatrixImpl40.copy();
        boolean boolean44 = bigMatrixImpl40.isSingular();
        boolean boolean45 = bigMatrixImpl2.equals((java.lang.Object) boolean44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray47 = bigMatrixImpl2.getColumnAsDoubleArray((int) (short) 0);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) ' ', (int) (byte) 100);
        int int3 = bigMatrixImpl2.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray4 = bigMatrixImpl2.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl5 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        java.math.BigDecimal[][] bigDecimalArray6 = bigMatrixImpl0.getDataRef();
        int int7 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray8 = bigMatrixImpl0.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = bigMatrixImpl0.inverse();
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) ' ', (int) (byte) 100);
        boolean boolean3 = bigMatrixImpl2.isSquare();
        int int4 = bigMatrixImpl2.getScale();
        double[] doubleArray7 = new double[] { (short) 10, 100L };
        double[] doubleArray10 = new double[] { (short) 10, 100L };
        double[] doubleArray13 = new double[] { (short) 10, 100L };
        double[] doubleArray16 = new double[] { (short) 10, 100L };
        double[][] doubleArray17 = new double[][] { doubleArray7, doubleArray10, doubleArray13, doubleArray16 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = bigMatrixImpl18.copy();
        int int20 = bigMatrixImpl18.getRowDimension();
        boolean boolean21 = bigMatrixImpl2.equals((java.lang.Object) int20);
        org.apache.commons.math.linear.BigMatrix bigMatrix23 = bigMatrixImpl2.getRowMatrix(0);
        int int24 = bigMatrixImpl2.getRoundingMode();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrix23 and bigMatrix23", bigMatrix23.equals(bigMatrix23) ? bigMatrix23.hashCode() == bigMatrix23.hashCode() : true);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        bigMatrixImpl0.setScale((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        bigMatrixImpl0.luDecompose();
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(100, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = bigMatrixImpl2.getColumnAsDoubleArray(0);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode((int) '4');
        bigMatrixImpl0.setRoundingMode((int) (short) 100);
        double[] doubleArray13 = new double[] { (short) 10, 100L };
        double[] doubleArray16 = new double[] { (short) 10, 100L };
        double[] doubleArray19 = new double[] { (short) 10, 100L };
        double[] doubleArray22 = new double[] { (short) 10, 100L };
        double[][] doubleArray23 = new double[][] { doubleArray13, doubleArray16, doubleArray19, doubleArray22 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl24 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray23);
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[] doubleArray30 = new double[] { (short) 10, 100L };
        double[] doubleArray33 = new double[] { (short) 10, 100L };
        double[] doubleArray36 = new double[] { (short) 10, 100L };
        double[][] doubleArray37 = new double[][] { doubleArray27, doubleArray30, doubleArray33, doubleArray36 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl38 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray37);
        double[][] doubleArray39 = bigMatrixImpl38.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        int int41 = bigMatrixImpl40.getColumnDimension();
        java.math.BigDecimal bigDecimal42 = bigMatrixImpl40.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix43 = bigMatrixImpl24.scalarAdd(bigDecimal42);
        bigMatrixImpl24.setRoundingMode((int) ' ');
        double[] doubleArray47 = bigMatrixImpl24.getColumnAsDoubleArray((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray48 = bigMatrixImpl0.operate(doubleArray47);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode(4);
        double[] doubleArray9 = new double[] { (short) 10, 100L };
        double[] doubleArray12 = new double[] { (short) 10, 100L };
        double[] doubleArray15 = new double[] { (short) 10, 100L };
        double[] doubleArray18 = new double[] { (short) 10, 100L };
        double[][] doubleArray19 = new double[][] { doubleArray9, doubleArray12, doubleArray15, doubleArray18 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray19);
        java.math.BigDecimal[][] bigDecimalArray21 = bigMatrixImpl20.getData();
        java.math.BigDecimal[][] bigDecimalArray22 = bigMatrixImpl20.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl23 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray22);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl24 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray22);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray22);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl26 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray22);
        boolean boolean27 = bigMatrixImpl26.isSingular();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix28 = bigMatrixImpl0.preMultiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl26);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) ' ', 100);
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[][] doubleArray15 = new double[][] { doubleArray5, doubleArray8, doubleArray11, doubleArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = bigMatrixImpl16.copy();
        java.math.BigDecimal[] bigDecimalArray19 = bigMatrixImpl16.getRow(0);
        java.math.BigDecimal[][] bigDecimalArray20 = bigMatrixImpl16.getDataRef();
        boolean boolean21 = bigMatrixImpl2.equals((java.lang.Object) bigMatrixImpl16);
        double[] doubleArray24 = new double[] { (short) 10, 100L };
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[] doubleArray30 = new double[] { (short) 10, 100L };
        double[] doubleArray33 = new double[] { (short) 10, 100L };
        double[][] doubleArray34 = new double[][] { doubleArray24, doubleArray27, doubleArray30, doubleArray33 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl35 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray34);
        java.math.BigDecimal[][] bigDecimalArray36 = bigMatrixImpl35.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray36);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl38 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray36);
        bigMatrixImpl38.setRoundingMode((int) (short) 100);
        double[] doubleArray43 = new double[] { (short) 10, 100L };
        double[] doubleArray46 = new double[] { (short) 10, 100L };
        double[] doubleArray49 = new double[] { (short) 10, 100L };
        double[] doubleArray52 = new double[] { (short) 10, 100L };
        double[][] doubleArray53 = new double[][] { doubleArray43, doubleArray46, doubleArray49, doubleArray52 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl54 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray53);
        java.math.BigDecimal[][] bigDecimalArray55 = bigMatrixImpl54.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl56 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray55);
        java.math.BigDecimal bigDecimal57 = bigMatrixImpl56.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix58 = bigMatrixImpl38.scalarAdd(bigDecimal57);
        java.math.BigDecimal[][] bigDecimalArray59 = bigMatrixImpl38.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl60 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray59);
        java.math.BigDecimal[][] bigDecimalArray61 = bigMatrixImpl60.getDataRef();
        org.apache.commons.math.linear.BigMatrix bigMatrix62 = bigMatrixImpl16.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        int int4 = bigMatrixImpl0.getRoundingMode();
        double[] doubleArray7 = new double[] { (short) 10, 100L };
        double[] doubleArray10 = new double[] { (short) 10, 100L };
        double[] doubleArray13 = new double[] { (short) 10, 100L };
        double[] doubleArray16 = new double[] { (short) 10, 100L };
        double[][] doubleArray17 = new double[][] { doubleArray7, doubleArray10, doubleArray13, doubleArray16 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray17);
        java.math.BigDecimal bigDecimal19 = bigMatrixImpl18.getNorm();
        double[] doubleArray22 = new double[] { (short) 10, 100L };
        double[] doubleArray25 = new double[] { (short) 10, 100L };
        double[] doubleArray28 = new double[] { (short) 10, 100L };
        double[] doubleArray31 = new double[] { (short) 10, 100L };
        double[][] doubleArray32 = new double[][] { doubleArray22, doubleArray25, doubleArray28, doubleArray31 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray32);
        java.math.BigDecimal[][] bigDecimalArray34 = bigMatrixImpl33.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl35 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray34);
        java.math.BigDecimal bigDecimal36 = bigMatrixImpl35.getNorm();
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal19, bigDecimal36 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl38 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray37);
        int int39 = bigMatrixImpl38.getRoundingMode();
        org.apache.commons.math.linear.BigMatrix bigMatrix41 = bigMatrixImpl38.getColumnMatrix(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix42 = bigMatrixImpl0.preMultiply(bigMatrix41);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        int int6 = bigMatrixImpl0.getScale();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = bigMatrixImpl0.getRowAsDoubleArray((int) (byte) 10);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(100);
        boolean boolean10 = bigMatrixImpl0.equals((java.lang.Object) 0.0f);
        bigMatrixImpl0.setScale((int) (byte) 10);
        double[] doubleArray15 = new double[] { (short) 10, 100L };
        double[] doubleArray18 = new double[] { (short) 10, 100L };
        double[] doubleArray21 = new double[] { (short) 10, 100L };
        double[] doubleArray24 = new double[] { (short) 10, 100L };
        double[][] doubleArray25 = new double[][] { doubleArray15, doubleArray18, doubleArray21, doubleArray24 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl26 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray25);
        double[][] doubleArray27 = bigMatrixImpl26.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray27);
        int int29 = bigMatrixImpl28.getColumnDimension();
        java.math.BigDecimal[][] bigDecimalArray30 = bigMatrixImpl28.getDataRef();
        int int31 = bigMatrixImpl28.getRowDimension();
        org.apache.commons.math.linear.BigMatrix bigMatrix32 = bigMatrixImpl28.transpose();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix33 = bigMatrixImpl0.add(bigMatrix32);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        int int1 = bigMatrixImpl0.getScale();
        double[] doubleArray4 = new double[] { (short) 10, 100L };
        double[] doubleArray7 = new double[] { (short) 10, 100L };
        double[] doubleArray10 = new double[] { (short) 10, 100L };
        double[] doubleArray13 = new double[] { (short) 10, 100L };
        double[][] doubleArray14 = new double[][] { doubleArray4, doubleArray7, doubleArray10, doubleArray13 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray14);
        java.math.BigDecimal[][] bigDecimalArray16 = bigMatrixImpl15.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray16);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray16);
        boolean boolean19 = bigMatrixImpl18.isSquare();
        double[] doubleArray22 = new double[] { (short) 10, 100L };
        double[] doubleArray25 = new double[] { (short) 10, 100L };
        double[] doubleArray28 = new double[] { (short) 10, 100L };
        double[] doubleArray31 = new double[] { (short) 10, 100L };
        double[][] doubleArray32 = new double[][] { doubleArray22, doubleArray25, doubleArray28, doubleArray31 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray32);
        java.math.BigDecimal[][] bigDecimalArray34 = bigMatrixImpl33.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl35 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray34);
        java.math.BigDecimal bigDecimal36 = bigMatrixImpl35.getNorm();
        java.math.BigDecimal[][] bigDecimalArray37 = bigMatrixImpl35.getDataRef();
        int int38 = bigMatrixImpl35.getColumnDimension();
        java.math.BigDecimal bigDecimal39 = bigMatrixImpl35.getNorm();
        double[] doubleArray42 = new double[] { (short) 10, 100L };
        double[] doubleArray45 = new double[] { (short) 10, 100L };
        double[] doubleArray48 = new double[] { (short) 10, 100L };
        double[] doubleArray51 = new double[] { (short) 10, 100L };
        double[][] doubleArray52 = new double[][] { doubleArray42, doubleArray45, doubleArray48, doubleArray51 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl53 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray52);
        org.apache.commons.math.linear.BigMatrix bigMatrix54 = bigMatrixImpl53.copy();
        int int55 = bigMatrixImpl53.getRowDimension();
        org.apache.commons.math.linear.BigMatrix bigMatrix56 = bigMatrixImpl53.transpose();
        double[] doubleArray59 = new double[] { (short) 10, 100L };
        double[] doubleArray62 = new double[] { (short) 10, 100L };
        double[] doubleArray65 = new double[] { (short) 10, 100L };
        double[] doubleArray68 = new double[] { (short) 10, 100L };
        double[][] doubleArray69 = new double[][] { doubleArray59, doubleArray62, doubleArray65, doubleArray68 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl70 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray69);
        java.math.BigDecimal bigDecimal71 = bigMatrixImpl70.getNorm();
        boolean boolean72 = bigMatrixImpl53.equals((java.lang.Object) bigDecimal71);
        org.apache.commons.math.linear.BigMatrix bigMatrix73 = bigMatrixImpl35.scalarMultiply(bigDecimal71);
        org.apache.commons.math.linear.BigMatrix bigMatrix74 = bigMatrixImpl18.scalarMultiply(bigDecimal71);
        org.apache.commons.math.linear.BigMatrix bigMatrix75 = bigMatrixImpl18.transpose();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix76 = bigMatrixImpl0.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl18);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        int int4 = bigMatrixImpl0.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray6 = bigMatrixImpl0.getRow(0);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        int int6 = bigMatrixImpl0.getScale();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl7 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl7.setRoundingMode((int) 'a');
        java.lang.String str10 = bigMatrixImpl7.toString();
        int int11 = bigMatrixImpl7.getRoundingMode();
        bigMatrixImpl7.setRoundingMode((int) ' ');
        bigMatrixImpl7.setRoundingMode(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = bigMatrixImpl0.add((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl7);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray8 = bigMatrixImpl0.getRow(100);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode(4);
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[][] doubleArray15 = new double[][] { doubleArray5, doubleArray8, doubleArray11, doubleArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray15);
        java.math.BigDecimal[][] bigDecimalArray17 = bigMatrixImpl16.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray17);
        double[][] doubleArray19 = bigMatrixImpl18.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray19);
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = bigMatrixImpl20.copy();
        java.math.BigDecimal[] bigDecimalArray23 = bigMatrixImpl20.getRow((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray24 = bigMatrixImpl0.operate(bigDecimalArray23);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode((int) '4');
        bigMatrixImpl0.setRoundingMode((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = bigMatrixImpl0.getEntryAsDouble((int) (short) 100, 0);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(32, 2);
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[][] doubleArray15 = new double[][] { doubleArray5, doubleArray8, doubleArray11, doubleArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray15);
        java.math.BigDecimal[][] bigDecimalArray17 = bigMatrixImpl16.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray17);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray17);
        bigMatrixImpl19.setRoundingMode((int) (short) 100);
        double[] doubleArray24 = new double[] { (short) 10, 100L };
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[] doubleArray30 = new double[] { (short) 10, 100L };
        double[] doubleArray33 = new double[] { (short) 10, 100L };
        double[][] doubleArray34 = new double[][] { doubleArray24, doubleArray27, doubleArray30, doubleArray33 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl35 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray34);
        java.math.BigDecimal[][] bigDecimalArray36 = bigMatrixImpl35.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray36);
        java.math.BigDecimal bigDecimal38 = bigMatrixImpl37.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix39 = bigMatrixImpl19.scalarAdd(bigDecimal38);
        double[] doubleArray41 = bigMatrixImpl19.getRowAsDoubleArray((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray42 = bigMatrixImpl2.operate(doubleArray41);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setScale((int) (short) 100);
        int int6 = bigMatrixImpl0.getScale();
        int int7 = bigMatrixImpl0.getScale();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[][] bigDecimalArray8 = bigMatrixImpl0.getData();
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = bigMatrixImpl13.copy();
        java.lang.String str15 = bigMatrixImpl13.toString();
        int int16 = bigMatrixImpl13.getScale();
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = bigMatrixImpl13.transpose();
        int int18 = bigMatrixImpl13.getRoundingMode();
        java.lang.String str19 = bigMatrixImpl13.toString();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl20.setRoundingMode((int) 'a');
        int int23 = bigMatrixImpl20.getRoundingMode();
        bigMatrixImpl20.setScale((int) (short) 100);
        java.lang.Class<?> wildcardClass26 = bigMatrixImpl20.getClass();
        boolean boolean27 = bigMatrixImpl13.equals((java.lang.Object) wildcardClass26);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on bigMatrix14 and bigMatrixImpl20.", bigMatrix14.equals(bigMatrixImpl20) == bigMatrixImpl20.equals(bigMatrix14));
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (byte) 100, 32);
        java.math.BigDecimal[] bigDecimalArray4 = bigMatrixImpl2.getRow(32);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl5 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) ' ', (int) (byte) 100);
        int int3 = bigMatrixImpl2.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = bigMatrixImpl2.getRowAsDoubleArray(0);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) ' ', 100);
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[][] doubleArray15 = new double[][] { doubleArray5, doubleArray8, doubleArray11, doubleArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray15);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = bigMatrixImpl16.copy();
        java.math.BigDecimal[] bigDecimalArray19 = bigMatrixImpl16.getRow(0);
        java.math.BigDecimal[][] bigDecimalArray20 = bigMatrixImpl16.getDataRef();
        boolean boolean21 = bigMatrixImpl2.equals((java.lang.Object) bigMatrixImpl16);
        java.math.BigDecimal[] bigDecimalArray23 = bigMatrixImpl2.getRow((int) (byte) 10);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl24 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = bigMatrixImpl0.isSquare();
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        int int3 = bigMatrixImpl0.getRoundingMode();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[][] bigDecimalArray6 = bigMatrixImpl0.getData();
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal9 = bigMatrixImpl0.getTrace();
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode(100);
        java.lang.String str3 = bigMatrixImpl0.toString();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl6 = new org.apache.commons.math.linear.BigMatrixImpl((int) ' ', (int) (byte) 100);
        boolean boolean7 = bigMatrixImpl6.isSquare();
        int int8 = bigMatrixImpl6.getScale();
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[][] doubleArray21 = new double[][] { doubleArray11, doubleArray14, doubleArray17, doubleArray20 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.BigMatrix bigMatrix23 = bigMatrixImpl22.copy();
        int int24 = bigMatrixImpl22.getRowDimension();
        boolean boolean25 = bigMatrixImpl6.equals((java.lang.Object) int24);
        double[] doubleArray28 = new double[] { (short) 10, 100L };
        double[] doubleArray31 = new double[] { (short) 10, 100L };
        double[] doubleArray34 = new double[] { (short) 10, 100L };
        double[] doubleArray37 = new double[] { (short) 10, 100L };
        double[][] doubleArray38 = new double[][] { doubleArray28, doubleArray31, doubleArray34, doubleArray37 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray38);
        java.math.BigDecimal[][] bigDecimalArray40 = bigMatrixImpl39.getData();
        int int41 = bigMatrixImpl39.getScale();
        java.math.BigDecimal bigDecimal42 = bigMatrixImpl39.getNorm();
        double[] doubleArray45 = new double[] { (short) 10, 100L };
        double[] doubleArray48 = new double[] { (short) 10, 100L };
        double[] doubleArray51 = new double[] { (short) 10, 100L };
        double[] doubleArray54 = new double[] { (short) 10, 100L };
        double[][] doubleArray55 = new double[][] { doubleArray45, doubleArray48, doubleArray51, doubleArray54 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl56 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray55);
        java.math.BigDecimal[][] bigDecimalArray57 = bigMatrixImpl56.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl58 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray57);
        java.math.BigDecimal bigDecimal59 = bigMatrixImpl58.getNorm();
        java.math.BigDecimal[][] bigDecimalArray60 = bigMatrixImpl58.getDataRef();
        int int61 = bigMatrixImpl58.getColumnDimension();
        java.math.BigDecimal bigDecimal62 = bigMatrixImpl58.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix63 = bigMatrixImpl39.scalarMultiply(bigDecimal62);
        boolean boolean64 = bigMatrixImpl6.equals((java.lang.Object) bigMatrixImpl39);
        boolean boolean65 = bigMatrixImpl6.isSquare();
        bigMatrixImpl6.setRoundingMode(97);
        java.math.BigDecimal[][] bigDecimalArray68 = bigMatrixImpl6.getDataRef();
        bigMatrixImpl0.setSubMatrix(bigDecimalArray68, (int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl6 and bigMatrixImpl6", bigMatrixImpl6.equals(bigMatrixImpl6) ? bigMatrixImpl6.hashCode() == bigMatrixImpl6.hashCode() : true);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) ' ', (int) (byte) 100);
        int int3 = bigMatrixImpl2.getRoundingMode();
        double[] doubleArray6 = new double[] { (short) 10, 100L };
        double[] doubleArray9 = new double[] { (short) 10, 100L };
        double[] doubleArray12 = new double[] { (short) 10, 100L };
        double[] doubleArray15 = new double[] { (short) 10, 100L };
        double[][] doubleArray16 = new double[][] { doubleArray6, doubleArray9, doubleArray12, doubleArray15 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray16);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getData();
        java.math.BigDecimal[][] bigDecimalArray19 = bigMatrixImpl17.getData();
        bigMatrixImpl2.setSubMatrix(bigDecimalArray19, 4, 0);
        boolean boolean23 = bigMatrixImpl2.isSingular();
        boolean boolean24 = bigMatrixImpl2.isSquare();
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[] doubleArray30 = new double[] { (short) 10, 100L };
        double[] doubleArray33 = new double[] { (short) 10, 100L };
        double[] doubleArray36 = new double[] { (short) 10, 100L };
        double[][] doubleArray37 = new double[][] { doubleArray27, doubleArray30, doubleArray33, doubleArray36 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl38 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray37);
        java.math.BigDecimal[][] bigDecimalArray39 = bigMatrixImpl38.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray39);
        java.math.BigDecimal[][] bigDecimalArray41 = bigMatrixImpl40.getData();
        bigMatrixImpl2.setSubMatrix(bigDecimalArray41, 10, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal45 = bigMatrixImpl2.getNorm();
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(1, 4);
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[][] doubleArray15 = new double[][] { doubleArray5, doubleArray8, doubleArray11, doubleArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray15);
        double[][] doubleArray17 = bigMatrixImpl16.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray17);
        int int19 = bigMatrixImpl18.getScale();
        java.math.BigDecimal[] bigDecimalArray21 = bigMatrixImpl18.getColumn((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray22 = bigMatrixImpl2.operate(bigDecimalArray21);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode((int) '4');
        bigMatrixImpl0.setRoundingMode((int) (short) 100);
        double[] doubleArray13 = new double[] { (short) 10, 100L };
        double[] doubleArray16 = new double[] { (short) 10, 100L };
        double[] doubleArray19 = new double[] { (short) 10, 100L };
        double[] doubleArray22 = new double[] { (short) 10, 100L };
        double[][] doubleArray23 = new double[][] { doubleArray13, doubleArray16, doubleArray19, doubleArray22 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl24 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray23);
        java.math.BigDecimal bigDecimal25 = bigMatrixImpl24.getNorm();
        double[] doubleArray28 = new double[] { (short) 10, 100L };
        double[] doubleArray31 = new double[] { (short) 10, 100L };
        double[] doubleArray34 = new double[] { (short) 10, 100L };
        double[] doubleArray37 = new double[] { (short) 10, 100L };
        double[][] doubleArray38 = new double[][] { doubleArray28, doubleArray31, doubleArray34, doubleArray37 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray38);
        java.math.BigDecimal[][] bigDecimalArray40 = bigMatrixImpl39.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray40);
        java.math.BigDecimal bigDecimal42 = bigMatrixImpl41.getNorm();
        java.math.BigDecimal[] bigDecimalArray43 = new java.math.BigDecimal[] { bigDecimal25, bigDecimal42 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray43);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray43);
        org.apache.commons.math.linear.BigMatrix bigMatrix46 = bigMatrixImpl45.copy();
        int int47 = bigMatrixImpl45.getScale();
        bigMatrixImpl45.setRoundingMode((int) (short) 100);
        int int50 = bigMatrixImpl45.getScale();
        java.math.BigDecimal bigDecimal51 = bigMatrixImpl45.getNorm();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix52 = bigMatrixImpl0.scalarMultiply(bigDecimal51);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        java.math.BigDecimal[][] bigDecimalArray6 = bigMatrixImpl0.getDataRef();
        int int7 = bigMatrixImpl0.getRoundingMode();
        boolean boolean9 = bigMatrixImpl0.equals((java.lang.Object) (byte) -1);
        int int10 = bigMatrixImpl0.getScale();
        double[] doubleArray13 = new double[] { (short) 10, 100L };
        double[] doubleArray16 = new double[] { (short) 10, 100L };
        double[] doubleArray19 = new double[] { (short) 10, 100L };
        double[] doubleArray22 = new double[] { (short) 10, 100L };
        double[][] doubleArray23 = new double[][] { doubleArray13, doubleArray16, doubleArray19, doubleArray22 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl24 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray23);
        org.apache.commons.math.linear.BigMatrix bigMatrix25 = bigMatrixImpl24.copy();
        int int26 = bigMatrixImpl24.getRowDimension();
        org.apache.commons.math.linear.BigMatrix bigMatrix27 = bigMatrixImpl24.transpose();
        double[] doubleArray30 = new double[] { (short) 10, 100L };
        double[] doubleArray33 = new double[] { (short) 10, 100L };
        double[] doubleArray36 = new double[] { (short) 10, 100L };
        double[] doubleArray39 = new double[] { (short) 10, 100L };
        double[][] doubleArray40 = new double[][] { doubleArray30, doubleArray33, doubleArray36, doubleArray39 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray40);
        java.math.BigDecimal bigDecimal42 = bigMatrixImpl41.getNorm();
        boolean boolean43 = bigMatrixImpl24.equals((java.lang.Object) bigDecimal42);
        java.lang.String str44 = bigMatrixImpl24.toString();
        org.apache.commons.math.linear.BigMatrix bigMatrix46 = bigMatrixImpl24.getRowMatrix(0);
        double[] doubleArray49 = new double[] { (short) 10, 100L };
        double[] doubleArray52 = new double[] { (short) 10, 100L };
        double[] doubleArray55 = new double[] { (short) 10, 100L };
        double[] doubleArray58 = new double[] { (short) 10, 100L };
        double[][] doubleArray59 = new double[][] { doubleArray49, doubleArray52, doubleArray55, doubleArray58 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl60 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray59);
        org.apache.commons.math.linear.BigMatrix bigMatrix61 = bigMatrixImpl60.copy();
        int int62 = bigMatrixImpl60.getRowDimension();
        org.apache.commons.math.linear.BigMatrix bigMatrix63 = bigMatrixImpl60.transpose();
        double[] doubleArray66 = new double[] { (short) 10, 100L };
        double[] doubleArray69 = new double[] { (short) 10, 100L };
        double[] doubleArray72 = new double[] { (short) 10, 100L };
        double[] doubleArray75 = new double[] { (short) 10, 100L };
        double[][] doubleArray76 = new double[][] { doubleArray66, doubleArray69, doubleArray72, doubleArray75 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl77 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray76);
        java.math.BigDecimal bigDecimal78 = bigMatrixImpl77.getNorm();
        boolean boolean79 = bigMatrixImpl60.equals((java.lang.Object) bigDecimal78);
        java.lang.String str80 = bigMatrixImpl60.toString();
        org.apache.commons.math.linear.BigMatrix bigMatrix81 = bigMatrixImpl24.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl60);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix82 = bigMatrixImpl0.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl60);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode((int) '4');
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[][] doubleArray21 = new double[][] { doubleArray11, doubleArray14, doubleArray17, doubleArray20 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray21);
        java.math.BigDecimal bigDecimal23 = bigMatrixImpl22.getNorm();
        double[] doubleArray26 = new double[] { (short) 10, 100L };
        double[] doubleArray29 = new double[] { (short) 10, 100L };
        double[] doubleArray32 = new double[] { (short) 10, 100L };
        double[] doubleArray35 = new double[] { (short) 10, 100L };
        double[][] doubleArray36 = new double[][] { doubleArray26, doubleArray29, doubleArray32, doubleArray35 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray36);
        java.math.BigDecimal[][] bigDecimalArray38 = bigMatrixImpl37.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray38);
        java.math.BigDecimal bigDecimal40 = bigMatrixImpl39.getNorm();
        java.math.BigDecimal[] bigDecimalArray41 = new java.math.BigDecimal[] { bigDecimal23, bigDecimal40 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl42 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray41);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray41);
        double[] doubleArray46 = new double[] { (short) 10, 100L };
        double[] doubleArray49 = new double[] { (short) 10, 100L };
        double[] doubleArray52 = new double[] { (short) 10, 100L };
        double[] doubleArray55 = new double[] { (short) 10, 100L };
        double[][] doubleArray56 = new double[][] { doubleArray46, doubleArray49, doubleArray52, doubleArray55 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl57 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray56);
        java.math.BigDecimal[][] bigDecimalArray58 = bigMatrixImpl57.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl59 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray58);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl60 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray58);
        org.apache.commons.math.linear.BigMatrix bigMatrix61 = bigMatrixImpl43.preMultiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl60);
        int int62 = bigMatrixImpl60.getRoundingMode();
        java.math.BigDecimal bigDecimal63 = bigMatrixImpl60.getNorm();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix64 = bigMatrixImpl0.scalarMultiply(bigDecimal63);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal bigDecimal14 = bigMatrixImpl13.getNorm();
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[] doubleArray26 = new double[] { (short) 10, 100L };
        double[][] doubleArray27 = new double[][] { doubleArray17, doubleArray20, doubleArray23, doubleArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray27);
        java.math.BigDecimal[][] bigDecimalArray29 = bigMatrixImpl28.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl30 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray29);
        java.math.BigDecimal bigDecimal31 = bigMatrixImpl30.getNorm();
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal14, bigDecimal31 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        double[] doubleArray37 = new double[] { (short) 10, 100L };
        double[] doubleArray40 = new double[] { (short) 10, 100L };
        double[] doubleArray43 = new double[] { (short) 10, 100L };
        double[] doubleArray46 = new double[] { (short) 10, 100L };
        double[][] doubleArray47 = new double[][] { doubleArray37, doubleArray40, doubleArray43, doubleArray46 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl48 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray47);
        java.math.BigDecimal[][] bigDecimalArray49 = bigMatrixImpl48.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl50 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray49);
        java.math.BigDecimal bigDecimal51 = bigMatrixImpl50.getNorm();
        java.math.BigDecimal[][] bigDecimalArray52 = bigMatrixImpl50.getDataRef();
        int int53 = bigMatrixImpl50.getColumnDimension();
        java.math.BigDecimal bigDecimal54 = bigMatrixImpl50.getNorm();
        double[] doubleArray57 = new double[] { (short) 10, 100L };
        double[] doubleArray60 = new double[] { (short) 10, 100L };
        double[] doubleArray63 = new double[] { (short) 10, 100L };
        double[] doubleArray66 = new double[] { (short) 10, 100L };
        double[][] doubleArray67 = new double[][] { doubleArray57, doubleArray60, doubleArray63, doubleArray66 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl68 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray67);
        java.math.BigDecimal bigDecimal69 = bigMatrixImpl68.getNorm();
        java.math.BigDecimal[] bigDecimalArray70 = new java.math.BigDecimal[] { bigDecimal54, bigDecimal69 };
        java.math.BigDecimal[] bigDecimalArray71 = bigMatrixImpl34.preMultiply(bigDecimalArray70);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl72 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray70);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl73 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray70);
        boolean boolean74 = bigMatrixImpl73.isSingular();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl75 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl75.setRoundingMode(4);
        java.math.BigDecimal[][] bigDecimalArray78 = bigMatrixImpl75.getDataRef();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix79 = bigMatrixImpl73.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl75);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode(100);
        int int3 = bigMatrixImpl0.getScale();
        double[] doubleArray6 = new double[] { (short) 10, 100L };
        double[] doubleArray9 = new double[] { (short) 10, 100L };
        double[] doubleArray12 = new double[] { (short) 10, 100L };
        double[] doubleArray15 = new double[] { (short) 10, 100L };
        double[][] doubleArray16 = new double[][] { doubleArray6, doubleArray9, doubleArray12, doubleArray15 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = bigMatrixImpl17.copy();
        int int19 = bigMatrixImpl17.getRowDimension();
        bigMatrixImpl17.setScale((int) 'a');
        int int22 = bigMatrixImpl17.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix23 = bigMatrixImpl0.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl17);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test401");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        boolean boolean17 = bigMatrixImpl16.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = bigMatrixImpl16.getRowMatrix(2);
        java.lang.String str20 = bigMatrixImpl16.toString();
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = bigMatrixImpl16.transpose();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl22.setRoundingMode((int) 'a');
        int int25 = bigMatrixImpl22.getRoundingMode();
        bigMatrixImpl22.setScale((int) (short) 100);
        int int28 = bigMatrixImpl22.getScale();
        int int29 = bigMatrixImpl22.getScale();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix30 = bigMatrixImpl16.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl22);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test402");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) ' ', 100);
        boolean boolean4 = bigMatrixImpl2.equals((java.lang.Object) 0.0f);
        double[] doubleArray7 = new double[] { (short) 10, 100L };
        double[] doubleArray10 = new double[] { (short) 10, 100L };
        double[] doubleArray13 = new double[] { (short) 10, 100L };
        double[] doubleArray16 = new double[] { (short) 10, 100L };
        double[][] doubleArray17 = new double[][] { doubleArray7, doubleArray10, doubleArray13, doubleArray16 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray17);
        java.math.BigDecimal[][] bigDecimalArray19 = bigMatrixImpl18.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray19);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray19);
        int int22 = bigMatrixImpl21.getColumnDimension();
        bigMatrixImpl21.setScale((int) (byte) 100);
        boolean boolean25 = bigMatrixImpl21.isSingular();
        boolean boolean26 = bigMatrixImpl2.equals((java.lang.Object) bigMatrixImpl21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal27 = bigMatrixImpl2.getNorm();
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test403");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode(100);
        java.math.BigDecimal[][] bigDecimalArray3 = bigMatrixImpl0.getDataRef();
        int int4 = bigMatrixImpl0.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = bigMatrixImpl0.getColumnDimension();
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test404");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        int int1 = bigMatrixImpl0.getScale();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray3 = bigMatrixImpl0.getRow((int) (byte) -1);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test405");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (short) 10, (int) 'a');
        bigMatrixImpl2.setRoundingMode((int) (short) 10);
        double[] doubleArray7 = new double[] { (short) 10, 100L };
        double[] doubleArray10 = new double[] { (short) 10, 100L };
        double[] doubleArray13 = new double[] { (short) 10, 100L };
        double[] doubleArray16 = new double[] { (short) 10, 100L };
        double[][] doubleArray17 = new double[][] { doubleArray7, doubleArray10, doubleArray13, doubleArray16 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray17);
        java.math.BigDecimal[][] bigDecimalArray19 = bigMatrixImpl18.getData();
        bigMatrixImpl18.setRoundingMode((int) (byte) 0);
        java.math.BigDecimal[] bigDecimalArray23 = bigMatrixImpl18.getRow((int) (short) 1);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl24 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray23);
        boolean boolean25 = bigMatrixImpl2.equals((java.lang.Object) bigDecimalArray23);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl26 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test406");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix4 = bigMatrixImpl0.getColumnMatrix((int) (short) 1);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test407");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        int int1 = bigMatrixImpl0.getScale();
        double[] doubleArray4 = new double[] { (short) 10, 100L };
        double[] doubleArray7 = new double[] { (short) 10, 100L };
        double[] doubleArray10 = new double[] { (short) 10, 100L };
        double[] doubleArray13 = new double[] { (short) 10, 100L };
        double[][] doubleArray14 = new double[][] { doubleArray4, doubleArray7, doubleArray10, doubleArray13 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray14);
        java.math.BigDecimal[][] bigDecimalArray16 = bigMatrixImpl15.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray16);
        java.math.BigDecimal bigDecimal18 = bigMatrixImpl17.getNorm();
        java.math.BigDecimal[][] bigDecimalArray19 = bigMatrixImpl17.getDataRef();
        int int20 = bigMatrixImpl17.getColumnDimension();
        java.math.BigDecimal[] bigDecimalArray22 = bigMatrixImpl17.getColumn((int) (byte) 1);
        double[] doubleArray25 = new double[] { (short) 10, 100L };
        double[] doubleArray28 = new double[] { (short) 10, 100L };
        double[] doubleArray31 = new double[] { (short) 10, 100L };
        double[] doubleArray34 = new double[] { (short) 10, 100L };
        double[][] doubleArray35 = new double[][] { doubleArray25, doubleArray28, doubleArray31, doubleArray34 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl36 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray35);
        java.math.BigDecimal[][] bigDecimalArray37 = bigMatrixImpl36.getData();
        bigMatrixImpl36.setRoundingMode((int) (byte) 0);
        java.math.BigDecimal[][] bigDecimalArray40 = bigMatrixImpl36.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray40);
        double[] doubleArray44 = new double[] { (short) 10, 100L };
        double[] doubleArray47 = new double[] { (short) 10, 100L };
        double[] doubleArray50 = new double[] { (short) 10, 100L };
        double[] doubleArray53 = new double[] { (short) 10, 100L };
        double[][] doubleArray54 = new double[][] { doubleArray44, doubleArray47, doubleArray50, doubleArray53 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl55 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray54);
        java.math.BigDecimal[][] bigDecimalArray56 = bigMatrixImpl55.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl57 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray56);
        java.math.BigDecimal bigDecimal58 = bigMatrixImpl57.getNorm();
        java.math.BigDecimal[][] bigDecimalArray59 = bigMatrixImpl57.getDataRef();
        double[] doubleArray62 = new double[] { (short) 10, 100L };
        double[] doubleArray65 = new double[] { (short) 10, 100L };
        double[] doubleArray68 = new double[] { (short) 10, 100L };
        double[] doubleArray71 = new double[] { (short) 10, 100L };
        double[][] doubleArray72 = new double[][] { doubleArray62, doubleArray65, doubleArray68, doubleArray71 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl73 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray72);
        java.math.BigDecimal[][] bigDecimalArray74 = bigMatrixImpl73.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl75 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray74);
        java.math.BigDecimal bigDecimal76 = bigMatrixImpl75.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix77 = bigMatrixImpl57.scalarMultiply(bigDecimal76);
        org.apache.commons.math.linear.BigMatrix bigMatrix78 = bigMatrixImpl41.scalarMultiply(bigDecimal76);
        org.apache.commons.math.linear.BigMatrix bigMatrix79 = bigMatrixImpl17.scalarAdd(bigDecimal76);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix80 = bigMatrixImpl0.scalarAdd(bigDecimal76);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test408");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal bigDecimal14 = bigMatrixImpl13.getNorm();
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[] doubleArray20 = new double[] { (short) 10, 100L };
        double[] doubleArray23 = new double[] { (short) 10, 100L };
        double[] doubleArray26 = new double[] { (short) 10, 100L };
        double[][] doubleArray27 = new double[][] { doubleArray17, doubleArray20, doubleArray23, doubleArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray27);
        java.math.BigDecimal[][] bigDecimalArray29 = bigMatrixImpl28.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl30 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray29);
        java.math.BigDecimal bigDecimal31 = bigMatrixImpl30.getNorm();
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal14, bigDecimal31 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        double[] doubleArray37 = new double[] { (short) 10, 100L };
        double[] doubleArray40 = new double[] { (short) 10, 100L };
        double[] doubleArray43 = new double[] { (short) 10, 100L };
        double[] doubleArray46 = new double[] { (short) 10, 100L };
        double[][] doubleArray47 = new double[][] { doubleArray37, doubleArray40, doubleArray43, doubleArray46 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl48 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray47);
        java.math.BigDecimal[][] bigDecimalArray49 = bigMatrixImpl48.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl50 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray49);
        java.math.BigDecimal bigDecimal51 = bigMatrixImpl50.getNorm();
        java.math.BigDecimal[][] bigDecimalArray52 = bigMatrixImpl50.getDataRef();
        int int53 = bigMatrixImpl50.getColumnDimension();
        java.math.BigDecimal bigDecimal54 = bigMatrixImpl50.getNorm();
        double[] doubleArray57 = new double[] { (short) 10, 100L };
        double[] doubleArray60 = new double[] { (short) 10, 100L };
        double[] doubleArray63 = new double[] { (short) 10, 100L };
        double[] doubleArray66 = new double[] { (short) 10, 100L };
        double[][] doubleArray67 = new double[][] { doubleArray57, doubleArray60, doubleArray63, doubleArray66 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl68 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray67);
        java.math.BigDecimal bigDecimal69 = bigMatrixImpl68.getNorm();
        java.math.BigDecimal[] bigDecimalArray70 = new java.math.BigDecimal[] { bigDecimal54, bigDecimal69 };
        java.math.BigDecimal[] bigDecimalArray71 = bigMatrixImpl34.preMultiply(bigDecimalArray70);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl72 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray70);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl73 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray70);
        double[][] doubleArray74 = bigMatrixImpl73.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl75 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray74);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl76 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl76.setRoundingMode((int) 'a');
        java.lang.String str79 = bigMatrixImpl76.toString();
        int int80 = bigMatrixImpl76.getRoundingMode();
        bigMatrixImpl76.setRoundingMode((int) ' ');
        bigMatrixImpl76.setRoundingMode((int) '4');
        bigMatrixImpl76.setRoundingMode((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix87 = bigMatrixImpl75.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl76);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test409");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        java.lang.String str4 = bigMatrixImpl0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray6 = bigMatrixImpl0.getColumn((int) ' ');
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test410");
        double[] doubleArray2 = new double[] { (short) 10, 100L };
        double[] doubleArray5 = new double[] { (short) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl((int) ' ', 100);
        boolean boolean21 = bigMatrixImpl19.equals((java.lang.Object) 0.0f);
        double[] doubleArray24 = new double[] { (short) 10, 100L };
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[] doubleArray30 = new double[] { (short) 10, 100L };
        double[] doubleArray33 = new double[] { (short) 10, 100L };
        double[][] doubleArray34 = new double[][] { doubleArray24, doubleArray27, doubleArray30, doubleArray33 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl35 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray34);
        java.math.BigDecimal[][] bigDecimalArray36 = bigMatrixImpl35.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray36);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl38 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray36);
        int int39 = bigMatrixImpl38.getColumnDimension();
        bigMatrixImpl38.setScale((int) (byte) 100);
        boolean boolean42 = bigMatrixImpl38.isSingular();
        boolean boolean43 = bigMatrixImpl19.equals((java.lang.Object) bigMatrixImpl38);
        org.apache.commons.math.linear.BigMatrix bigMatrix44 = bigMatrixImpl16.add((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl19 and bigMatrixImpl19", bigMatrixImpl19.equals(bigMatrixImpl19) ? bigMatrixImpl19.hashCode() == bigMatrixImpl19.hashCode() : true);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test411");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode(100);
        int int9 = bigMatrixImpl0.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = bigMatrixImpl0.inverse();
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test412");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (byte) 100, 32);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = bigMatrixImpl2.getSubMatrix((int) (short) 1, 2, 0, 2);
        bigMatrixImpl2.setScale((int) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrix7 and bigMatrix7", bigMatrix7.equals(bigMatrix7) ? bigMatrix7.hashCode() == bigMatrix7.hashCode() : true);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test413");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl0.getDataRef();
        int[] intArray9 = new int[] { (short) 100, (short) 10, (byte) 10 };
        int[] intArray16 = new int[] { 10, ' ', 1, 0, (short) 0, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = bigMatrixImpl0.getSubMatrix(intArray9, intArray16);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test414");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode(100);
        java.lang.String str3 = bigMatrixImpl0.toString();
        double[] doubleArray6 = new double[] { (short) 10, 100L };
        double[] doubleArray9 = new double[] { (short) 10, 100L };
        double[] doubleArray12 = new double[] { (short) 10, 100L };
        double[] doubleArray15 = new double[] { (short) 10, 100L };
        double[][] doubleArray16 = new double[][] { doubleArray6, doubleArray9, doubleArray12, doubleArray15 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray16);
        java.math.BigDecimal[][] bigDecimalArray18 = bigMatrixImpl17.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray18);
        double[][] doubleArray20 = bigMatrixImpl19.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray20);
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = bigMatrixImpl21.copy();
        java.math.BigDecimal[] bigDecimalArray24 = bigMatrixImpl21.getRow((int) (byte) 1);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl26 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray27 = bigMatrixImpl0.preMultiply(bigDecimalArray24);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test415");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) ' ', (int) (byte) 100);
        boolean boolean3 = bigMatrixImpl2.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = bigMatrixImpl2.getColumnMatrix(97);
        double[] doubleArray8 = new double[] { (short) 10, 100L };
        double[] doubleArray11 = new double[] { (short) 10, 100L };
        double[] doubleArray14 = new double[] { (short) 10, 100L };
        double[] doubleArray17 = new double[] { (short) 10, 100L };
        double[][] doubleArray18 = new double[][] { doubleArray8, doubleArray11, doubleArray14, doubleArray17 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray18);
        java.math.BigDecimal[][] bigDecimalArray20 = bigMatrixImpl19.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray20);
        java.math.BigDecimal bigDecimal22 = bigMatrixImpl21.getNorm();
        java.math.BigDecimal[][] bigDecimalArray23 = bigMatrixImpl21.getDataRef();
        int int24 = bigMatrixImpl21.getColumnDimension();
        java.math.BigDecimal bigDecimal25 = bigMatrixImpl21.getNorm();
        java.math.BigDecimal[][] bigDecimalArray26 = bigMatrixImpl21.getDataRef();
        bigMatrixImpl21.setRoundingMode((int) (byte) 10);
        double[] doubleArray31 = new double[] { (short) 10, 100L };
        double[] doubleArray34 = new double[] { (short) 10, 100L };
        double[] doubleArray37 = new double[] { (short) 10, 100L };
        double[] doubleArray40 = new double[] { (short) 10, 100L };
        double[][] doubleArray41 = new double[][] { doubleArray31, doubleArray34, doubleArray37, doubleArray40 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl42 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray41);
        java.math.BigDecimal bigDecimal43 = bigMatrixImpl42.getNorm();
        double[] doubleArray46 = new double[] { (short) 10, 100L };
        double[] doubleArray49 = new double[] { (short) 10, 100L };
        double[] doubleArray52 = new double[] { (short) 10, 100L };
        double[] doubleArray55 = new double[] { (short) 10, 100L };
        double[][] doubleArray56 = new double[][] { doubleArray46, doubleArray49, doubleArray52, doubleArray55 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl57 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray56);
        java.math.BigDecimal[][] bigDecimalArray58 = bigMatrixImpl57.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl59 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray58);
        java.math.BigDecimal bigDecimal60 = bigMatrixImpl59.getNorm();
        java.math.BigDecimal[] bigDecimalArray61 = new java.math.BigDecimal[] { bigDecimal43, bigDecimal60 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl62 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray61);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl63 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray61);
        org.apache.commons.math.linear.BigMatrix bigMatrix64 = bigMatrixImpl63.copy();
        java.math.BigDecimal bigDecimal65 = bigMatrixImpl63.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix66 = bigMatrixImpl21.scalarMultiply(bigDecimal65);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix67 = bigMatrixImpl2.scalarAdd(bigDecimal65);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test416");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        bigMatrixImpl0.setRoundingMode((int) '4');
        bigMatrixImpl0.setRoundingMode((int) (short) 100);
        java.lang.String str11 = bigMatrixImpl0.toString();
        int int12 = bigMatrixImpl0.getScale();
        double[] doubleArray15 = new double[] { (short) 10, 100L };
        double[] doubleArray18 = new double[] { (short) 10, 100L };
        double[] doubleArray21 = new double[] { (short) 10, 100L };
        double[] doubleArray24 = new double[] { (short) 10, 100L };
        double[][] doubleArray25 = new double[][] { doubleArray15, doubleArray18, doubleArray21, doubleArray24 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl26 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray25);
        java.math.BigDecimal bigDecimal27 = bigMatrixImpl26.getNorm();
        double[] doubleArray30 = new double[] { (short) 10, 100L };
        double[] doubleArray33 = new double[] { (short) 10, 100L };
        double[] doubleArray36 = new double[] { (short) 10, 100L };
        double[] doubleArray39 = new double[] { (short) 10, 100L };
        double[][] doubleArray40 = new double[][] { doubleArray30, doubleArray33, doubleArray36, doubleArray39 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray40);
        java.math.BigDecimal[][] bigDecimalArray42 = bigMatrixImpl41.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray42);
        java.math.BigDecimal bigDecimal44 = bigMatrixImpl43.getNorm();
        java.math.BigDecimal[] bigDecimalArray45 = new java.math.BigDecimal[] { bigDecimal27, bigDecimal44 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl46 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray45);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl47 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray45);
        int int48 = bigMatrixImpl47.getRowDimension();
        double[][] doubleArray49 = bigMatrixImpl47.getDataAsDoubleArray();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix50 = bigMatrixImpl0.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl47);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test417");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        bigMatrixImpl0.setRoundingMode((int) 'a');
        java.lang.String str3 = bigMatrixImpl0.toString();
        int int4 = bigMatrixImpl0.getRoundingMode();
        bigMatrixImpl0.setRoundingMode((int) ' ');
        double[] doubleArray9 = new double[] { (short) 10, 100L };
        double[] doubleArray12 = new double[] { (short) 10, 100L };
        double[] doubleArray15 = new double[] { (short) 10, 100L };
        double[] doubleArray18 = new double[] { (short) 10, 100L };
        double[][] doubleArray19 = new double[][] { doubleArray9, doubleArray12, doubleArray15, doubleArray18 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray19);
        java.math.BigDecimal bigDecimal21 = bigMatrixImpl20.getNorm();
        double[] doubleArray24 = new double[] { (short) 10, 100L };
        double[] doubleArray27 = new double[] { (short) 10, 100L };
        double[] doubleArray30 = new double[] { (short) 10, 100L };
        double[] doubleArray33 = new double[] { (short) 10, 100L };
        double[][] doubleArray34 = new double[][] { doubleArray24, doubleArray27, doubleArray30, doubleArray33 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl35 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray34);
        java.math.BigDecimal[][] bigDecimalArray36 = bigMatrixImpl35.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray36);
        java.math.BigDecimal bigDecimal38 = bigMatrixImpl37.getNorm();
        java.math.BigDecimal[] bigDecimalArray39 = new java.math.BigDecimal[] { bigDecimal21, bigDecimal38 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray39);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray39);
        double[] doubleArray44 = new double[] { (short) 10, 100L };
        double[] doubleArray47 = new double[] { (short) 10, 100L };
        double[] doubleArray50 = new double[] { (short) 10, 100L };
        double[] doubleArray53 = new double[] { (short) 10, 100L };
        double[][] doubleArray54 = new double[][] { doubleArray44, doubleArray47, doubleArray50, doubleArray53 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl55 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray54);
        java.math.BigDecimal[][] bigDecimalArray56 = bigMatrixImpl55.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl57 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray56);
        java.math.BigDecimal bigDecimal58 = bigMatrixImpl57.getNorm();
        java.math.BigDecimal[][] bigDecimalArray59 = bigMatrixImpl57.getDataRef();
        int int60 = bigMatrixImpl57.getColumnDimension();
        java.math.BigDecimal bigDecimal61 = bigMatrixImpl57.getNorm();
        double[] doubleArray64 = new double[] { (short) 10, 100L };
        double[] doubleArray67 = new double[] { (short) 10, 100L };
        double[] doubleArray70 = new double[] { (short) 10, 100L };
        double[] doubleArray73 = new double[] { (short) 10, 100L };
        double[][] doubleArray74 = new double[][] { doubleArray64, doubleArray67, doubleArray70, doubleArray73 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl75 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray74);
        java.math.BigDecimal bigDecimal76 = bigMatrixImpl75.getNorm();
        java.math.BigDecimal[] bigDecimalArray77 = new java.math.BigDecimal[] { bigDecimal61, bigDecimal76 };
        java.math.BigDecimal[] bigDecimalArray78 = bigMatrixImpl41.preMultiply(bigDecimalArray77);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray79 = bigMatrixImpl0.operate(bigDecimalArray77);
    }
}

