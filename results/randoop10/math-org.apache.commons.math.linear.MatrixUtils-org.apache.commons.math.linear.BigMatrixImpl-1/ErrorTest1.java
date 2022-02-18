import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test501");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        java.lang.String str2 = bigDecimal1.toString();
        java.math.BigDecimal bigDecimal3 = bigDecimal1.plus();
        java.math.BigDecimal bigDecimal4 = bigDecimal3.negate();
        java.lang.String str5 = bigDecimal3.toPlainString();
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal10 = bigDecimal7.setScale((int) (short) 100, (int) (byte) 1);
        java.math.BigDecimal bigDecimal11 = bigDecimal3.remainder(bigDecimal10);
        java.lang.String str12 = bigDecimal11.toPlainString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal7 and bigDecimal10", (bigDecimal7.compareTo(bigDecimal10) == 0) == bigDecimal7.equals(bigDecimal10));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (byte) 97, 97);
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        java.lang.String str5 = bigDecimal4.toString();
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal8 = bigDecimal7.stripTrailingZeros();
        int int9 = bigDecimal7.signum();
        java.math.BigDecimal[] bigDecimalArray10 = bigDecimal4.divideAndRemainder(bigDecimal7);
        java.math.BigDecimal bigDecimal12 = bigDecimal4.pow((int) 'a');
        java.math.BigInteger bigInteger13 = bigDecimal4.toBigInteger();
        java.math.BigDecimal bigDecimal14 = new java.math.BigDecimal(bigInteger13);
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigDecimal bigDecimal17 = bigDecimal16.negate();
        java.math.BigDecimal[] bigDecimalArray18 = bigDecimal14.divideAndRemainder(bigDecimal16);
        int int19 = bigDecimal16.signum();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = bigMatrixImpl2.scalarMultiply(bigDecimal16);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (short) 400, (int) ' ');
        org.apache.commons.math.linear.BigMatrix bigMatrix3 = bigMatrixImpl2.copy();
        java.math.BigDecimal bigDecimal6 = bigMatrixImpl2.getEntry(7, (int) (byte) 11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrix3 and bigMatrix3", bigMatrix3.equals(bigMatrix3) ? bigMatrix3.hashCode() == bigMatrix3.hashCode() : true);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger3 = bigDecimal2.unscaledValue();
        java.math.BigDecimal bigDecimal4 = bigDecimal0.add(bigDecimal2);
        float float5 = bigDecimal2.floatValue();
        java.math.BigDecimal bigDecimal7 = new java.math.BigDecimal(0.0d);
        java.lang.String str8 = bigDecimal7.toString();
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal11 = bigDecimal10.stripTrailingZeros();
        int int12 = bigDecimal10.signum();
        java.math.BigDecimal[] bigDecimalArray13 = bigDecimal7.divideAndRemainder(bigDecimal10);
        java.math.BigDecimal bigDecimal15 = bigDecimal7.pow((int) 'a');
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(0.0d);
        java.lang.String str18 = bigDecimal17.toString();
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal21 = bigDecimal20.stripTrailingZeros();
        int int22 = bigDecimal20.signum();
        java.math.BigDecimal[] bigDecimalArray23 = bigDecimal17.divideAndRemainder(bigDecimal20);
        java.math.BigDecimal bigDecimal25 = bigDecimal17.pow((int) 'a');
        java.math.BigInteger bigInteger26 = bigDecimal17.toBigIntegerExact();
        java.math.BigDecimal bigDecimal27 = bigDecimal15.add(bigDecimal17);
        java.math.BigDecimal bigDecimal29 = new java.math.BigDecimal(0.0d);
        int int30 = bigDecimal29.intValue();
        java.math.BigDecimal bigDecimal32 = new java.math.BigDecimal(0.0d);
        int int33 = bigDecimal32.intValue();
        java.math.BigDecimal bigDecimal34 = bigDecimal29.min(bigDecimal32);
        java.math.BigInteger bigInteger35 = bigDecimal29.toBigInteger();
        java.math.BigDecimal bigDecimal36 = new java.math.BigDecimal(bigInteger35);
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal39 = bigDecimal38.stripTrailingZeros();
        float float40 = bigDecimal38.floatValue();
        java.math.BigDecimal bigDecimal41 = bigDecimal36.multiply(bigDecimal38);
        java.math.BigDecimal bigDecimal42 = bigDecimal36.negate();
        java.math.BigDecimal bigDecimal43 = bigDecimal27.add(bigDecimal42);
        java.math.BigDecimal bigDecimal45 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal46 = bigDecimal45.stripTrailingZeros();
        float float47 = bigDecimal45.floatValue();
        java.math.BigDecimal bigDecimal48 = bigDecimal45.ulp();
        java.math.BigDecimal bigDecimal50 = new java.math.BigDecimal(0.0d);
        java.lang.String str51 = bigDecimal50.toString();
        java.math.BigDecimal bigDecimal53 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal54 = bigDecimal53.stripTrailingZeros();
        int int55 = bigDecimal53.signum();
        java.math.BigDecimal[] bigDecimalArray56 = bigDecimal50.divideAndRemainder(bigDecimal53);
        java.math.BigDecimal bigDecimal58 = bigDecimal50.pow((int) 'a');
        java.math.BigDecimal bigDecimal60 = new java.math.BigDecimal(0.0d);
        java.lang.String str61 = bigDecimal60.toString();
        java.math.BigDecimal bigDecimal63 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal64 = bigDecimal63.stripTrailingZeros();
        int int65 = bigDecimal63.signum();
        java.math.BigDecimal[] bigDecimalArray66 = bigDecimal60.divideAndRemainder(bigDecimal63);
        java.math.BigDecimal bigDecimal68 = bigDecimal60.pow((int) 'a');
        java.math.BigInteger bigInteger69 = bigDecimal60.toBigIntegerExact();
        java.math.BigDecimal bigDecimal70 = bigDecimal58.add(bigDecimal60);
        java.math.BigDecimal bigDecimal71 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal73 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger74 = bigDecimal73.unscaledValue();
        java.math.BigDecimal bigDecimal75 = bigDecimal71.add(bigDecimal73);
        java.math.BigDecimal bigDecimal76 = bigDecimal60.multiply(bigDecimal71);
        java.math.BigDecimal bigDecimal77 = bigDecimal48.divide(bigDecimal71);
        java.math.BigDecimal bigDecimal78 = bigDecimal42.remainder(bigDecimal48);
        java.math.BigDecimal bigDecimal79 = bigDecimal2.subtract(bigDecimal42);
        byte byte80 = bigDecimal79.byteValueExact();
        java.math.BigDecimal bigDecimal81 = bigDecimal79.stripTrailingZeros();
        int int82 = bigDecimal79.intValueExact();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal2 and bigDecimal81", (bigDecimal2.compareTo(bigDecimal81) == 0) == bigDecimal2.equals(bigDecimal81));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        java.lang.String str2 = bigDecimal1.toString();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal5 = bigDecimal4.stripTrailingZeros();
        int int6 = bigDecimal4.signum();
        java.math.BigDecimal[] bigDecimalArray7 = bigDecimal1.divideAndRemainder(bigDecimal4);
        java.math.BigDecimal bigDecimal9 = bigDecimal1.pow((int) 'a');
        java.math.BigDecimal bigDecimal11 = new java.math.BigDecimal(0.0d);
        java.lang.String str12 = bigDecimal11.toString();
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal15 = bigDecimal14.stripTrailingZeros();
        int int16 = bigDecimal14.signum();
        java.math.BigDecimal[] bigDecimalArray17 = bigDecimal11.divideAndRemainder(bigDecimal14);
        java.math.BigDecimal bigDecimal19 = bigDecimal11.pow((int) 'a');
        java.math.BigInteger bigInteger20 = bigDecimal11.toBigIntegerExact();
        java.math.BigDecimal bigDecimal21 = bigDecimal9.add(bigDecimal11);
        java.math.BigInteger bigInteger22 = bigDecimal21.unscaledValue();
        java.math.BigDecimal bigDecimal24 = new java.math.BigDecimal(bigInteger22, 100);
        java.math.BigDecimal bigDecimal25 = bigDecimal24.ulp();
        java.math.BigDecimal bigDecimal27 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigDecimal bigDecimal28 = bigDecimal27.negate();
        java.math.BigInteger bigInteger29 = bigDecimal28.toBigIntegerExact();
        java.math.BigDecimal bigDecimal31 = new java.math.BigDecimal("100");
        java.math.BigDecimal bigDecimal32 = bigDecimal31.abs();
        java.math.BigDecimal bigDecimal34 = bigDecimal28.divide(bigDecimal32, (int) (byte) 0);
        java.math.BigDecimal bigDecimal35 = bigDecimal24.multiply(bigDecimal28);
        java.math.BigDecimal bigDecimal36 = bigDecimal35.ulp();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal24", (bigDecimal1.compareTo(bigDecimal24) == 0) == bigDecimal1.equals(bigDecimal24));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        java.lang.String[] strArray1 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl3 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl4 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl5 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        java.math.BigDecimal bigDecimal6 = bigMatrixImpl5.getTrace();
        java.math.BigDecimal bigDecimal8 = new java.math.BigDecimal(0.0d);
        int int9 = bigDecimal8.intValue();
        long long10 = bigDecimal8.longValue();
        long long11 = bigDecimal8.longValueExact();
        int int12 = bigDecimal8.precision();
        java.math.BigDecimal bigDecimal14 = new java.math.BigDecimal(0.0d);
        int int15 = bigDecimal14.intValue();
        long long16 = bigDecimal14.longValue();
        long long17 = bigDecimal14.longValueExact();
        java.math.BigDecimal bigDecimal18 = bigDecimal8.add(bigDecimal14);
        byte byte19 = bigDecimal8.byteValueExact();
        java.math.BigDecimal bigDecimal21 = bigDecimal8.movePointLeft((int) (byte) -1);
        java.math.BigDecimal bigDecimal23 = java.math.BigDecimal.valueOf((double) 10);
        java.math.BigDecimal bigDecimal24 = bigDecimal8.min(bigDecimal23);
        java.math.BigDecimal bigDecimal25 = bigDecimal6.subtract(bigDecimal24);
        short short26 = bigDecimal25.shortValueExact();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal6 and bigDecimal8", (bigDecimal6.compareTo(bigDecimal8) == 0) == bigDecimal6.equals(bigDecimal8));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        double[] doubleArray2 = new double[] { 1.0d, 100.0f };
        double[] doubleArray5 = new double[] { 1.0d, 100.0f };
        double[] doubleArray8 = new double[] { 1.0d, 100.0f };
        double[] doubleArray11 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl14 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = bigMatrixImpl14.transpose();
        int int16 = bigMatrixImpl14.getColumnDimension();
        java.math.BigDecimal[][] bigDecimalArray17 = bigMatrixImpl14.getDataRef();
        bigMatrixImpl14.setScale((int) (short) 100);
        boolean boolean20 = bigMatrixImpl14.isSingular();
        int int21 = bigMatrixImpl14.getScale();
        java.math.BigDecimal bigDecimal23 = new java.math.BigDecimal(0.0d);
        java.lang.String str24 = bigDecimal23.toString();
        java.math.BigDecimal bigDecimal26 = bigDecimal23.setScale(0);
        double[] doubleArray31 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix32 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray31);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray31);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrix33.scalarAdd((double) 6);
        int int36 = realMatrix33.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrix33.scalarAdd(10.0d);
        double[] doubleArray43 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix44 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray43);
        double double45 = realMatrix44.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrix44.scalarAdd((double) '4');
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrix38.preMultiply(realMatrix47);
        boolean boolean49 = bigDecimal26.equals((java.lang.Object) realMatrix38);
        org.apache.commons.math.linear.BigMatrix bigMatrix50 = bigMatrixImpl14.scalarAdd(bigDecimal26);
        double[] doubleArray53 = new double[] { 1.0d, 100.0f };
        double[] doubleArray56 = new double[] { 1.0d, 100.0f };
        double[] doubleArray59 = new double[] { 1.0d, 100.0f };
        double[] doubleArray62 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray63 = new double[][] { doubleArray53, doubleArray56, doubleArray59, doubleArray62 };
        org.apache.commons.math.linear.BigMatrix bigMatrix64 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray63);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl65 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray63);
        org.apache.commons.math.linear.BigMatrix bigMatrix66 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray63);
        org.apache.commons.math.linear.BigMatrix bigMatrix67 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray63);
        java.math.BigDecimal bigDecimal69 = new java.math.BigDecimal(0.0d);
        int int70 = bigDecimal69.intValue();
        java.math.BigDecimal bigDecimal72 = new java.math.BigDecimal(0.0d);
        int int73 = bigDecimal72.intValue();
        java.math.BigDecimal bigDecimal74 = bigDecimal69.min(bigDecimal72);
        java.math.BigInteger bigInteger75 = bigDecimal69.toBigInteger();
        java.math.BigDecimal bigDecimal76 = new java.math.BigDecimal(bigInteger75);
        org.apache.commons.math.linear.BigMatrix bigMatrix77 = bigMatrix67.scalarAdd(bigDecimal76);
        java.math.BigDecimal bigDecimal79 = bigDecimal76.scaleByPowerOfTen(97);
        java.math.BigInteger bigInteger80 = bigDecimal79.toBigIntegerExact();
        java.math.BigInteger bigInteger81 = bigDecimal79.unscaledValue();
        int int82 = bigDecimal79.precision();
        org.apache.commons.math.linear.BigMatrix bigMatrix83 = bigMatrixImpl14.scalarMultiply(bigDecimal79);
        boolean boolean84 = bigMatrixImpl14.isSquare();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal23 and bigDecimal79", (bigDecimal23.compareTo(bigDecimal79) == 0) == bigDecimal23.equals(bigDecimal79));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        java.lang.String str2 = bigDecimal1.toString();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal5 = bigDecimal4.stripTrailingZeros();
        int int6 = bigDecimal4.signum();
        java.math.BigDecimal[] bigDecimalArray7 = bigDecimal1.divideAndRemainder(bigDecimal4);
        java.math.BigDecimal bigDecimal9 = bigDecimal1.pow((int) 'a');
        java.math.BigDecimal bigDecimal11 = new java.math.BigDecimal(0.0d);
        java.lang.String str12 = bigDecimal11.toString();
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal15 = bigDecimal14.stripTrailingZeros();
        int int16 = bigDecimal14.signum();
        java.math.BigDecimal[] bigDecimalArray17 = bigDecimal11.divideAndRemainder(bigDecimal14);
        java.math.BigDecimal bigDecimal19 = bigDecimal11.pow((int) 'a');
        java.math.BigInteger bigInteger20 = bigDecimal11.toBigIntegerExact();
        java.math.BigDecimal bigDecimal21 = bigDecimal9.add(bigDecimal11);
        java.math.BigInteger bigInteger22 = bigDecimal21.unscaledValue();
        java.math.BigDecimal bigDecimal24 = new java.math.BigDecimal(bigInteger22, 100);
        java.math.BigInteger bigInteger25 = bigDecimal24.toBigInteger();
        java.math.BigDecimal bigDecimal27 = new java.math.BigDecimal(bigInteger25, 546084);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal24", (bigDecimal1.compareTo(bigDecimal24) == 0) == bigDecimal1.equals(bigDecimal24));
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf(8667.0d);
        java.math.BigInteger bigInteger2 = bigDecimal1.unscaledValue();
        java.math.BigDecimal bigDecimal3 = bigDecimal1.ulp();
        int int4 = bigDecimal1.precision();
        java.math.BigDecimal bigDecimal6 = new java.math.BigDecimal(0.0d);
        java.lang.String str7 = bigDecimal6.toString();
        java.math.BigDecimal bigDecimal8 = bigDecimal6.plus();
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal11 = bigDecimal10.stripTrailingZeros();
        float float12 = bigDecimal10.floatValue();
        java.math.BigDecimal bigDecimal13 = bigDecimal10.ulp();
        java.math.BigDecimal bigDecimal15 = new java.math.BigDecimal(0.0d);
        java.lang.String str16 = bigDecimal15.toString();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal19 = bigDecimal18.stripTrailingZeros();
        int int20 = bigDecimal18.signum();
        java.math.BigDecimal[] bigDecimalArray21 = bigDecimal15.divideAndRemainder(bigDecimal18);
        java.math.BigDecimal bigDecimal23 = bigDecimal15.pow((int) 'a');
        java.math.BigDecimal bigDecimal25 = new java.math.BigDecimal(0.0d);
        java.lang.String str26 = bigDecimal25.toString();
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal29 = bigDecimal28.stripTrailingZeros();
        int int30 = bigDecimal28.signum();
        java.math.BigDecimal[] bigDecimalArray31 = bigDecimal25.divideAndRemainder(bigDecimal28);
        java.math.BigDecimal bigDecimal33 = bigDecimal25.pow((int) 'a');
        java.math.BigInteger bigInteger34 = bigDecimal25.toBigIntegerExact();
        java.math.BigDecimal bigDecimal35 = bigDecimal23.add(bigDecimal25);
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger39 = bigDecimal38.unscaledValue();
        java.math.BigDecimal bigDecimal40 = bigDecimal36.add(bigDecimal38);
        java.math.BigDecimal bigDecimal41 = bigDecimal25.multiply(bigDecimal36);
        java.math.BigDecimal bigDecimal42 = bigDecimal13.divide(bigDecimal36);
        int int43 = bigDecimal6.compareTo(bigDecimal13);
        float float44 = bigDecimal6.floatValue();
        java.math.BigDecimal bigDecimal45 = bigDecimal1.multiply(bigDecimal6);
        int int46 = bigDecimal1.intValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal6 and bigDecimal45", (bigDecimal6.compareTo(bigDecimal45) == 0) == bigDecimal6.equals(bigDecimal45));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal((int) (byte) 97);
        java.math.BigDecimal bigDecimal2 = bigDecimal1.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.setScale((int) (short) 31464);
        java.math.BigDecimal bigDecimal6 = bigDecimal2.movePointLeft((int) (short) 400);
        java.lang.String str7 = bigDecimal6.toPlainString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal2 and bigDecimal4", (bigDecimal2.compareTo(bigDecimal4) == 0) == bigDecimal2.equals(bigDecimal4));
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.min(bigDecimal4);
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal6 };
        java.math.BigDecimal bigDecimal9 = new java.math.BigDecimal(0.0d);
        int int10 = bigDecimal9.intValue();
        java.math.BigDecimal bigDecimal12 = new java.math.BigDecimal(0.0d);
        int int13 = bigDecimal12.intValue();
        java.math.BigDecimal bigDecimal14 = bigDecimal9.min(bigDecimal12);
        java.math.BigDecimal[] bigDecimalArray15 = new java.math.BigDecimal[] { bigDecimal14 };
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(0.0d);
        int int18 = bigDecimal17.intValue();
        java.math.BigDecimal bigDecimal20 = new java.math.BigDecimal(0.0d);
        int int21 = bigDecimal20.intValue();
        java.math.BigDecimal bigDecimal22 = bigDecimal17.min(bigDecimal20);
        java.math.BigDecimal[] bigDecimalArray23 = new java.math.BigDecimal[] { bigDecimal22 };
        java.math.BigDecimal[][] bigDecimalArray24 = new java.math.BigDecimal[][] { bigDecimalArray7, bigDecimalArray15, bigDecimalArray23 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl27 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        java.math.BigDecimal[][] bigDecimalArray28 = bigMatrixImpl27.getData();
        boolean boolean29 = bigMatrixImpl27.isSquare();
        java.math.BigDecimal bigDecimal31 = java.math.BigDecimal.valueOf((long) (short) 100);
        int int32 = bigDecimal31.signum();
        org.apache.commons.math.linear.BigMatrix bigMatrix33 = bigMatrixImpl27.scalarMultiply(bigDecimal31);
        long long34 = bigDecimal31.longValueExact();
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.valueOf((double) '#');
        boolean boolean37 = bigDecimal31.equals((java.lang.Object) bigDecimal36);
        java.math.BigDecimal bigDecimal39 = new java.math.BigDecimal(0.0d);
        int int40 = bigDecimal39.intValue();
        java.math.BigDecimal bigDecimal42 = new java.math.BigDecimal(0.0d);
        int int43 = bigDecimal42.intValue();
        java.math.BigDecimal bigDecimal44 = bigDecimal39.min(bigDecimal42);
        java.math.BigDecimal[] bigDecimalArray45 = new java.math.BigDecimal[] { bigDecimal44 };
        java.math.BigDecimal bigDecimal47 = new java.math.BigDecimal(0.0d);
        int int48 = bigDecimal47.intValue();
        java.math.BigDecimal bigDecimal50 = new java.math.BigDecimal(0.0d);
        int int51 = bigDecimal50.intValue();
        java.math.BigDecimal bigDecimal52 = bigDecimal47.min(bigDecimal50);
        java.math.BigDecimal[] bigDecimalArray53 = new java.math.BigDecimal[] { bigDecimal52 };
        java.math.BigDecimal bigDecimal55 = new java.math.BigDecimal(0.0d);
        int int56 = bigDecimal55.intValue();
        java.math.BigDecimal bigDecimal58 = new java.math.BigDecimal(0.0d);
        int int59 = bigDecimal58.intValue();
        java.math.BigDecimal bigDecimal60 = bigDecimal55.min(bigDecimal58);
        java.math.BigDecimal[] bigDecimalArray61 = new java.math.BigDecimal[] { bigDecimal60 };
        java.math.BigDecimal[][] bigDecimalArray62 = new java.math.BigDecimal[][] { bigDecimalArray45, bigDecimalArray53, bigDecimalArray61 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl63 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray62);
        org.apache.commons.math.linear.BigMatrix bigMatrix64 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray62);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl65 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray62);
        java.math.BigDecimal bigDecimal68 = java.math.BigDecimal.valueOf(0L, (int) ' ');
        org.apache.commons.math.linear.BigMatrix bigMatrix69 = bigMatrixImpl65.scalarAdd(bigDecimal68);
        java.math.BigDecimal bigDecimal70 = bigDecimal68.plus();
        java.math.BigDecimal bigDecimal71 = bigDecimal31.add(bigDecimal68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal68", (bigDecimal1.compareTo(bigDecimal68) == 0) == bigDecimal1.equals(bigDecimal68));
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        java.lang.String str2 = bigDecimal1.toString();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal5 = bigDecimal4.stripTrailingZeros();
        int int6 = bigDecimal4.signum();
        java.math.BigDecimal[] bigDecimalArray7 = bigDecimal1.divideAndRemainder(bigDecimal4);
        java.math.BigDecimal bigDecimal9 = bigDecimal1.pow((int) 'a');
        java.math.BigDecimal bigDecimal11 = new java.math.BigDecimal(0.0d);
        java.lang.String str12 = bigDecimal11.toString();
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal15 = bigDecimal14.stripTrailingZeros();
        int int16 = bigDecimal14.signum();
        java.math.BigDecimal[] bigDecimalArray17 = bigDecimal11.divideAndRemainder(bigDecimal14);
        java.math.BigDecimal bigDecimal19 = bigDecimal11.pow((int) 'a');
        java.math.BigInteger bigInteger20 = bigDecimal11.toBigIntegerExact();
        java.math.BigDecimal bigDecimal21 = bigDecimal9.add(bigDecimal11);
        java.math.BigDecimal bigDecimal23 = new java.math.BigDecimal(0.0d);
        java.lang.String str24 = bigDecimal23.toString();
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal27 = bigDecimal26.stripTrailingZeros();
        int int28 = bigDecimal26.signum();
        java.math.BigDecimal[] bigDecimalArray29 = bigDecimal23.divideAndRemainder(bigDecimal26);
        java.math.BigDecimal bigDecimal31 = bigDecimal23.pow((int) 'a');
        java.math.BigInteger bigInteger32 = bigDecimal23.toBigIntegerExact();
        float float33 = bigDecimal23.floatValue();
        java.math.BigDecimal bigDecimal34 = bigDecimal9.add(bigDecimal23);
        java.math.BigDecimal bigDecimal35 = bigDecimal9.ulp();
        java.math.BigDecimal bigDecimal36 = bigDecimal9.negate();
        double[] doubleArray39 = new double[] { 1.0d, 100.0f };
        double[] doubleArray42 = new double[] { 1.0d, 100.0f };
        double[] doubleArray45 = new double[] { 1.0d, 100.0f };
        double[] doubleArray48 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray49 = new double[][] { doubleArray39, doubleArray42, doubleArray45, doubleArray48 };
        org.apache.commons.math.linear.BigMatrix bigMatrix50 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray49);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl51 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray49);
        org.apache.commons.math.linear.BigMatrix bigMatrix52 = bigMatrixImpl51.transpose();
        java.math.BigDecimal bigDecimal53 = bigMatrixImpl51.getNorm();
        int int54 = bigDecimal53.signum();
        java.math.BigDecimal bigDecimal56 = java.math.BigDecimal.valueOf((long) 4);
        int int57 = bigDecimal56.signum();
        java.math.BigDecimal bigDecimal58 = bigDecimal53.subtract(bigDecimal56);
        java.math.BigDecimal bigDecimal59 = bigDecimal36.min(bigDecimal53);
        java.math.BigDecimal bigDecimal61 = java.math.BigDecimal.valueOf((double) 4);
        java.math.BigDecimal bigDecimal63 = bigDecimal61.movePointRight(2805);
        java.math.BigDecimal bigDecimal64 = bigDecimal61.negate();
        java.math.BigDecimal bigDecimal65 = bigDecimal53.max(bigDecimal64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal56 and bigDecimal61", (bigDecimal56.compareTo(bigDecimal61) == 0) == bigDecimal56.equals(bigDecimal61));
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        double[] doubleArray2 = new double[] { 1.0d, 100.0f };
        double[] doubleArray5 = new double[] { 1.0d, 100.0f };
        double[] doubleArray8 = new double[] { 1.0d, 100.0f };
        double[] doubleArray11 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl14 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = bigMatrixImpl14.transpose();
        double[] doubleArray17 = bigMatrixImpl14.getRowAsDoubleArray((int) (short) 0);
        boolean boolean18 = bigMatrixImpl14.isSingular();
        java.math.BigDecimal[][] bigDecimalArray19 = bigMatrixImpl14.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray19);
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigDecimal bigDecimal23 = bigDecimal22.negate();
        int int24 = bigDecimal23.scale();
        boolean boolean25 = bigMatrixImpl20.equals((java.lang.Object) bigDecimal23);
        java.lang.String str26 = bigDecimal23.toEngineeringString();
        java.math.BigDecimal bigDecimal27 = bigDecimal23.stripTrailingZeros();
        java.math.BigDecimal bigDecimal29 = bigDecimal23.setScale((int) (byte) 110);
        java.math.BigDecimal bigDecimal30 = bigDecimal29.negate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal23 and bigDecimal27", (bigDecimal23.compareTo(bigDecimal27) == 0) == bigDecimal23.equals(bigDecimal27));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal7 = bigDecimal4.setScale((int) (short) 100, (int) (byte) 1);
        java.math.BigDecimal bigDecimal8 = bigDecimal1.divide(bigDecimal4);
        java.math.BigInteger bigInteger9 = bigDecimal4.toBigIntegerExact();
        java.math.BigDecimal bigDecimal11 = new java.math.BigDecimal(0.0d);
        java.lang.String str12 = bigDecimal11.toString();
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal15 = bigDecimal14.stripTrailingZeros();
        int int16 = bigDecimal14.signum();
        java.math.BigDecimal[] bigDecimalArray17 = bigDecimal11.divideAndRemainder(bigDecimal14);
        java.math.BigDecimal bigDecimal19 = bigDecimal11.pow((int) 'a');
        java.math.BigDecimal bigDecimal21 = new java.math.BigDecimal(0.0d);
        java.lang.String str22 = bigDecimal21.toString();
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal25 = bigDecimal24.stripTrailingZeros();
        int int26 = bigDecimal24.signum();
        java.math.BigDecimal[] bigDecimalArray27 = bigDecimal21.divideAndRemainder(bigDecimal24);
        java.math.BigDecimal bigDecimal29 = bigDecimal21.pow((int) 'a');
        java.math.BigInteger bigInteger30 = bigDecimal21.toBigIntegerExact();
        java.math.BigDecimal bigDecimal31 = bigDecimal19.add(bigDecimal21);
        java.math.BigDecimal bigDecimal33 = bigDecimal31.pow((int) (byte) 97);
        int int34 = bigDecimal31.scale();
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.valueOf((long) (short) 100);
        int int37 = bigDecimal36.signum();
        java.math.BigDecimal bigDecimal38 = bigDecimal31.add(bigDecimal36);
        java.math.BigDecimal bigDecimal39 = bigDecimal4.add(bigDecimal31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal7 and bigDecimal14", (bigDecimal7.compareTo(bigDecimal14) == 0) == bigDecimal7.equals(bigDecimal14));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        double[] doubleArray2 = new double[] { 1.0d, 100.0f };
        double[] doubleArray5 = new double[] { 1.0d, 100.0f };
        double[] doubleArray8 = new double[] { 1.0d, 100.0f };
        double[] doubleArray11 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl14 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = bigMatrixImpl14.transpose();
        int int16 = bigMatrixImpl14.getColumnDimension();
        java.math.BigDecimal[][] bigDecimalArray17 = bigMatrixImpl14.getDataRef();
        bigMatrixImpl14.setScale((int) (short) 100);
        boolean boolean20 = bigMatrixImpl14.isSingular();
        int int21 = bigMatrixImpl14.getScale();
        java.math.BigDecimal bigDecimal23 = new java.math.BigDecimal(0.0d);
        java.lang.String str24 = bigDecimal23.toString();
        java.math.BigDecimal bigDecimal26 = bigDecimal23.setScale(0);
        double[] doubleArray31 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix32 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray31);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray31);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrix33.scalarAdd((double) 6);
        int int36 = realMatrix33.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrix33.scalarAdd(10.0d);
        double[] doubleArray43 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix44 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray43);
        double double45 = realMatrix44.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrix44.scalarAdd((double) '4');
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrix38.preMultiply(realMatrix47);
        boolean boolean49 = bigDecimal26.equals((java.lang.Object) realMatrix38);
        org.apache.commons.math.linear.BigMatrix bigMatrix50 = bigMatrixImpl14.scalarAdd(bigDecimal26);
        java.math.BigDecimal[] bigDecimalArray52 = bigMatrixImpl14.getRow(2);
        java.math.BigDecimal bigDecimal55 = java.math.BigDecimal.valueOf((long) (short) 100, 0);
        short short56 = bigDecimal55.shortValueExact();
        java.math.BigDecimal bigDecimal57 = bigDecimal55.ulp();
        org.apache.commons.math.linear.BigMatrix bigMatrix58 = bigMatrixImpl14.scalarAdd(bigDecimal57);
        java.lang.String[] strArray60 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray61 = new java.lang.String[][] { strArray60 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl62 = new org.apache.commons.math.linear.BigMatrixImpl(strArray61);
        org.apache.commons.math.linear.BigMatrix bigMatrix63 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray61);
        org.apache.commons.math.linear.BigMatrix bigMatrix64 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray61);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl65 = new org.apache.commons.math.linear.BigMatrixImpl(strArray61);
        java.math.BigDecimal bigDecimal66 = bigMatrixImpl65.getTrace();
        java.math.BigDecimal bigDecimal67 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal69 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger70 = bigDecimal69.unscaledValue();
        java.math.BigDecimal bigDecimal71 = bigDecimal67.add(bigDecimal69);
        java.math.BigInteger bigInteger72 = bigDecimal69.toBigInteger();
        org.apache.commons.math.linear.BigMatrix bigMatrix73 = bigMatrixImpl65.scalarMultiply(bigDecimal69);
        java.math.BigDecimal bigDecimal74 = bigDecimal57.subtract(bigDecimal69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal23 and bigDecimal66", (bigDecimal23.compareTo(bigDecimal66) == 0) == bigDecimal23.equals(bigDecimal66));
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        long long3 = bigDecimal1.longValue();
        long long4 = bigDecimal1.longValueExact();
        int int5 = bigDecimal1.precision();
        java.math.BigDecimal bigDecimal7 = new java.math.BigDecimal(0.0d);
        int int8 = bigDecimal7.intValue();
        long long9 = bigDecimal7.longValue();
        long long10 = bigDecimal7.longValueExact();
        java.math.BigDecimal bigDecimal11 = bigDecimal1.add(bigDecimal7);
        java.math.BigDecimal bigDecimal13 = new java.math.BigDecimal(0.0d);
        int int14 = bigDecimal13.intValue();
        java.math.BigDecimal bigDecimal16 = new java.math.BigDecimal(0.0d);
        int int17 = bigDecimal16.intValue();
        java.math.BigDecimal bigDecimal18 = bigDecimal13.min(bigDecimal16);
        java.math.BigDecimal bigDecimal19 = bigDecimal11.min(bigDecimal16);
        java.math.BigDecimal bigDecimal21 = bigDecimal19.movePointRight((int) (short) 10);
        int int22 = bigDecimal21.intValueExact();
        java.math.BigDecimal bigDecimal23 = bigDecimal21.plus();
        byte byte24 = bigDecimal23.byteValueExact();
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger27 = bigDecimal26.unscaledValue();
        java.math.BigDecimal bigDecimal28 = bigDecimal26.stripTrailingZeros();
        java.math.BigDecimal bigDecimal29 = bigDecimal23.max(bigDecimal26);
        float float30 = bigDecimal23.floatValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal26 and bigDecimal28", (bigDecimal26.compareTo(bigDecimal28) == 0) == bigDecimal26.equals(bigDecimal28));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        java.lang.String str2 = bigDecimal1.toString();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal5 = bigDecimal4.stripTrailingZeros();
        int int6 = bigDecimal4.signum();
        java.math.BigDecimal[] bigDecimalArray7 = bigDecimal1.divideAndRemainder(bigDecimal4);
        java.math.BigDecimal bigDecimal9 = bigDecimal1.pow((int) 'a');
        java.math.BigDecimal bigDecimal11 = new java.math.BigDecimal(0.0d);
        java.lang.String str12 = bigDecimal11.toString();
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal15 = bigDecimal14.stripTrailingZeros();
        int int16 = bigDecimal14.signum();
        java.math.BigDecimal[] bigDecimalArray17 = bigDecimal11.divideAndRemainder(bigDecimal14);
        java.math.BigDecimal bigDecimal19 = bigDecimal11.pow((int) 'a');
        java.math.BigInteger bigInteger20 = bigDecimal11.toBigIntegerExact();
        java.math.BigDecimal bigDecimal21 = bigDecimal9.add(bigDecimal11);
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger25 = bigDecimal24.unscaledValue();
        java.math.BigDecimal bigDecimal26 = bigDecimal22.add(bigDecimal24);
        java.math.BigDecimal bigDecimal27 = bigDecimal11.multiply(bigDecimal22);
        java.math.BigDecimal bigDecimal29 = bigDecimal11.pow(100);
        java.math.BigDecimal bigDecimal31 = new java.math.BigDecimal(0.0d);
        java.lang.String str32 = bigDecimal31.toString();
        java.math.BigDecimal bigDecimal34 = bigDecimal31.setScale(0);
        java.math.BigDecimal bigDecimal36 = new java.math.BigDecimal(0.0d);
        int int37 = bigDecimal36.intValue();
        long long38 = bigDecimal36.longValue();
        long long39 = bigDecimal36.longValueExact();
        short short40 = bigDecimal36.shortValueExact();
        java.math.BigDecimal bigDecimal41 = bigDecimal31.add(bigDecimal36);
        java.math.BigDecimal bigDecimal42 = bigDecimal41.ulp();
        java.math.BigDecimal bigDecimal43 = bigDecimal11.add(bigDecimal41);
        java.math.BigInteger bigInteger44 = bigDecimal43.unscaledValue();
        java.math.BigDecimal bigDecimal46 = new java.math.BigDecimal(bigInteger44, (int) ' ');
        java.math.BigDecimal bigDecimal48 = bigDecimal46.pow((int) (short) 100);
        byte byte49 = bigDecimal46.byteValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal48", (bigDecimal1.compareTo(bigDecimal48) == 0) == bigDecimal1.equals(bigDecimal48));
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        java.lang.String str2 = bigDecimal1.toString();
        java.math.BigDecimal bigDecimal3 = bigDecimal1.plus();
        java.math.BigDecimal bigDecimal4 = bigDecimal3.negate();
        java.lang.String str5 = bigDecimal3.toPlainString();
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal10 = bigDecimal7.setScale((int) (short) 100, (int) (byte) 1);
        java.math.BigDecimal bigDecimal11 = bigDecimal3.remainder(bigDecimal10);
        float float12 = bigDecimal11.floatValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal7 and bigDecimal10", (bigDecimal7.compareTo(bigDecimal10) == 0) == bigDecimal7.equals(bigDecimal10));
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.min(bigDecimal4);
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal6 };
        java.math.BigDecimal bigDecimal9 = new java.math.BigDecimal(0.0d);
        int int10 = bigDecimal9.intValue();
        java.math.BigDecimal bigDecimal12 = new java.math.BigDecimal(0.0d);
        int int13 = bigDecimal12.intValue();
        java.math.BigDecimal bigDecimal14 = bigDecimal9.min(bigDecimal12);
        java.math.BigDecimal[] bigDecimalArray15 = new java.math.BigDecimal[] { bigDecimal14 };
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(0.0d);
        int int18 = bigDecimal17.intValue();
        java.math.BigDecimal bigDecimal20 = new java.math.BigDecimal(0.0d);
        int int21 = bigDecimal20.intValue();
        java.math.BigDecimal bigDecimal22 = bigDecimal17.min(bigDecimal20);
        java.math.BigDecimal[] bigDecimalArray23 = new java.math.BigDecimal[] { bigDecimal22 };
        java.math.BigDecimal[][] bigDecimalArray24 = new java.math.BigDecimal[][] { bigDecimalArray7, bigDecimalArray15, bigDecimalArray23 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl27 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        java.math.BigDecimal[][] bigDecimalArray28 = bigMatrixImpl27.getData();
        boolean boolean29 = bigMatrixImpl27.isSquare();
        java.math.BigDecimal bigDecimal31 = java.math.BigDecimal.valueOf((long) (short) 100);
        int int32 = bigDecimal31.signum();
        org.apache.commons.math.linear.BigMatrix bigMatrix33 = bigMatrixImpl27.scalarMultiply(bigDecimal31);
        java.math.BigDecimal bigDecimal35 = new java.math.BigDecimal(0.0d);
        java.lang.String str36 = bigDecimal35.toString();
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal39 = bigDecimal38.stripTrailingZeros();
        int int40 = bigDecimal38.signum();
        java.math.BigDecimal[] bigDecimalArray41 = bigDecimal35.divideAndRemainder(bigDecimal38);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl42 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray41);
        int int43 = bigMatrixImpl42.getRoundingMode();
        org.apache.commons.math.linear.BigMatrix bigMatrix44 = bigMatrixImpl42.transpose();
        double[][] doubleArray45 = bigMatrix44.getDataAsDoubleArray();
        java.math.BigDecimal[][] bigDecimalArray46 = bigMatrix44.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix47 = bigMatrixImpl27.multiply(bigMatrix44);
        int int48 = bigMatrixImpl27.getRoundingMode();
        java.math.BigDecimal bigDecimal51 = bigMatrixImpl27.getEntry(0, (int) (short) 0);
        org.apache.commons.math.linear.BigMatrix bigMatrix52 = bigMatrixImpl27.copy();
        java.math.BigDecimal bigDecimal54 = new java.math.BigDecimal(0.0d);
        int int55 = bigDecimal54.intValue();
        java.math.BigDecimal bigDecimal57 = new java.math.BigDecimal(0.0d);
        int int58 = bigDecimal57.intValue();
        java.math.BigDecimal bigDecimal59 = bigDecimal54.min(bigDecimal57);
        java.math.BigDecimal[] bigDecimalArray60 = new java.math.BigDecimal[] { bigDecimal59 };
        java.math.BigDecimal bigDecimal62 = new java.math.BigDecimal(0.0d);
        int int63 = bigDecimal62.intValue();
        java.math.BigDecimal bigDecimal65 = new java.math.BigDecimal(0.0d);
        int int66 = bigDecimal65.intValue();
        java.math.BigDecimal bigDecimal67 = bigDecimal62.min(bigDecimal65);
        java.math.BigDecimal[] bigDecimalArray68 = new java.math.BigDecimal[] { bigDecimal67 };
        java.math.BigDecimal bigDecimal70 = new java.math.BigDecimal(0.0d);
        int int71 = bigDecimal70.intValue();
        java.math.BigDecimal bigDecimal73 = new java.math.BigDecimal(0.0d);
        int int74 = bigDecimal73.intValue();
        java.math.BigDecimal bigDecimal75 = bigDecimal70.min(bigDecimal73);
        java.math.BigDecimal[] bigDecimalArray76 = new java.math.BigDecimal[] { bigDecimal75 };
        java.math.BigDecimal[][] bigDecimalArray77 = new java.math.BigDecimal[][] { bigDecimalArray60, bigDecimalArray68, bigDecimalArray76 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl78 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray77);
        org.apache.commons.math.linear.BigMatrix bigMatrix79 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray77);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl80 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray77);
        java.math.BigDecimal[][] bigDecimalArray81 = bigMatrixImpl80.getData();
        boolean boolean82 = bigMatrixImpl80.isSquare();
        java.math.BigDecimal bigDecimal83 = bigMatrixImpl80.getNorm();
        java.math.BigDecimal bigDecimal84 = bigMatrixImpl80.getNorm();
        java.lang.String str85 = bigDecimal84.toEngineeringString();
        org.apache.commons.math.linear.BigMatrix bigMatrix86 = bigMatrixImpl27.scalarAdd(bigDecimal84);
        java.math.BigDecimal bigDecimal88 = bigDecimal84.movePointLeft((int) (short) 10);
        long long89 = bigDecimal84.longValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal88", (bigDecimal1.compareTo(bigDecimal88) == 0) == bigDecimal1.equals(bigDecimal88));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf((long) 0, (int) (short) -100);
        java.math.BigDecimal bigDecimal3 = bigDecimal2.stripTrailingZeros();
        float float4 = bigDecimal3.floatValue();
        java.math.BigDecimal bigDecimal5 = bigDecimal3.negate();
        java.math.BigDecimal bigDecimal7 = new java.math.BigDecimal("10");
        int int8 = bigDecimal7.signum();
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal[] bigDecimalArray13 = bigDecimal10.divideAndRemainder(bigDecimal12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl14 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray13);
        double[] doubleArray16 = bigMatrixImpl14.getRowAsDoubleArray(0);
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger19 = bigDecimal18.unscaledValue();
        java.math.BigDecimal bigDecimal20 = bigDecimal18.stripTrailingZeros();
        java.math.BigDecimal bigDecimal22 = new java.math.BigDecimal(0.0d);
        int int23 = bigDecimal22.intValue();
        long long24 = bigDecimal22.longValue();
        long long25 = bigDecimal22.longValueExact();
        short short26 = bigDecimal22.shortValueExact();
        java.math.BigDecimal bigDecimal27 = bigDecimal18.min(bigDecimal22);
        org.apache.commons.math.linear.BigMatrix bigMatrix28 = bigMatrixImpl14.scalarMultiply(bigDecimal18);
        java.math.BigDecimal bigDecimal29 = bigDecimal7.divideToIntegralValue(bigDecimal18);
        java.math.BigDecimal bigDecimal31 = new java.math.BigDecimal(0.0d);
        int int32 = bigDecimal31.intValue();
        java.math.BigDecimal bigDecimal34 = new java.math.BigDecimal(0.0d);
        int int35 = bigDecimal34.intValue();
        java.math.BigDecimal bigDecimal36 = bigDecimal31.min(bigDecimal34);
        java.math.BigInteger bigInteger37 = bigDecimal31.toBigInteger();
        java.math.BigDecimal bigDecimal38 = new java.math.BigDecimal(bigInteger37);
        java.math.BigDecimal bigDecimal40 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal41 = bigDecimal40.stripTrailingZeros();
        float float42 = bigDecimal40.floatValue();
        java.math.BigDecimal bigDecimal43 = bigDecimal38.multiply(bigDecimal40);
        java.math.BigDecimal bigDecimal44 = bigDecimal38.negate();
        int int45 = bigDecimal44.intValue();
        java.math.BigDecimal bigDecimal47 = new java.math.BigDecimal(0.0d);
        int int48 = bigDecimal47.intValue();
        long long49 = bigDecimal47.longValue();
        long long50 = bigDecimal47.longValueExact();
        int int51 = bigDecimal47.precision();
        java.math.BigDecimal bigDecimal53 = new java.math.BigDecimal(0.0d);
        int int54 = bigDecimal53.intValue();
        long long55 = bigDecimal53.longValue();
        long long56 = bigDecimal53.longValueExact();
        java.math.BigDecimal bigDecimal57 = bigDecimal47.add(bigDecimal53);
        java.math.BigDecimal bigDecimal59 = bigDecimal53.pow(3);
        int int60 = bigDecimal44.compareTo(bigDecimal53);
        java.math.BigDecimal bigDecimal62 = bigDecimal53.pow((int) (byte) 10);
        int int63 = bigDecimal18.compareTo(bigDecimal62);
        java.math.BigDecimal bigDecimal64 = bigDecimal5.divide(bigDecimal18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal2 and bigDecimal64", (bigDecimal2.compareTo(bigDecimal64) == 0) == bigDecimal2.equals(bigDecimal64));
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal((int) (byte) 97);
        java.math.BigDecimal bigDecimal3 = bigDecimal1.setScale(5);
        java.math.BigDecimal bigDecimal5 = new java.math.BigDecimal((long) (short) 100);
        java.lang.String str6 = bigDecimal5.toEngineeringString();
        int int7 = bigDecimal3.compareTo(bigDecimal5);
        java.math.BigDecimal bigDecimal8 = bigDecimal5.negate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal3", (bigDecimal1.compareTo(bigDecimal3) == 0) == bigDecimal1.equals(bigDecimal3));
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.min(bigDecimal4);
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal6 };
        java.math.BigDecimal bigDecimal9 = new java.math.BigDecimal(0.0d);
        int int10 = bigDecimal9.intValue();
        java.math.BigDecimal bigDecimal12 = new java.math.BigDecimal(0.0d);
        int int13 = bigDecimal12.intValue();
        java.math.BigDecimal bigDecimal14 = bigDecimal9.min(bigDecimal12);
        java.math.BigDecimal[] bigDecimalArray15 = new java.math.BigDecimal[] { bigDecimal14 };
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(0.0d);
        int int18 = bigDecimal17.intValue();
        java.math.BigDecimal bigDecimal20 = new java.math.BigDecimal(0.0d);
        int int21 = bigDecimal20.intValue();
        java.math.BigDecimal bigDecimal22 = bigDecimal17.min(bigDecimal20);
        java.math.BigDecimal[] bigDecimalArray23 = new java.math.BigDecimal[] { bigDecimal22 };
        java.math.BigDecimal[][] bigDecimalArray24 = new java.math.BigDecimal[][] { bigDecimalArray7, bigDecimalArray15, bigDecimalArray23 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl27 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        java.math.BigDecimal[][] bigDecimalArray28 = bigMatrixImpl27.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl29 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray28);
        java.math.BigDecimal bigDecimal31 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger32 = bigDecimal31.unscaledValue();
        java.math.BigDecimal bigDecimal33 = bigDecimal31.stripTrailingZeros();
        java.math.BigDecimal bigDecimal35 = bigDecimal31.movePointRight((int) (short) -1);
        org.apache.commons.math.linear.BigMatrix bigMatrix36 = bigMatrixImpl29.scalarMultiply(bigDecimal31);
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.valueOf((long) 'a');
        org.apache.commons.math.linear.BigMatrix bigMatrix39 = bigMatrixImpl29.scalarMultiply(bigDecimal38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal31 and bigDecimal33", (bigDecimal31.compareTo(bigDecimal33) == 0) == bigDecimal31.equals(bigDecimal33));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        double[] doubleArray2 = new double[] { 1.0d, 100.0f };
        double[] doubleArray5 = new double[] { 1.0d, 100.0f };
        double[] doubleArray8 = new double[] { 1.0d, 100.0f };
        double[] doubleArray11 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        boolean boolean14 = bigMatrix13.isSingular();
        int int15 = bigMatrix13.getColumnDimension();
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(0.0d);
        java.lang.String str18 = bigDecimal17.toString();
        java.math.BigDecimal bigDecimal19 = bigDecimal17.plus();
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal22 = bigDecimal21.stripTrailingZeros();
        float float23 = bigDecimal21.floatValue();
        java.math.BigDecimal bigDecimal24 = bigDecimal21.ulp();
        java.math.BigDecimal bigDecimal26 = new java.math.BigDecimal(0.0d);
        java.lang.String str27 = bigDecimal26.toString();
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal30 = bigDecimal29.stripTrailingZeros();
        int int31 = bigDecimal29.signum();
        java.math.BigDecimal[] bigDecimalArray32 = bigDecimal26.divideAndRemainder(bigDecimal29);
        java.math.BigDecimal bigDecimal34 = bigDecimal26.pow((int) 'a');
        java.math.BigDecimal bigDecimal36 = new java.math.BigDecimal(0.0d);
        java.lang.String str37 = bigDecimal36.toString();
        java.math.BigDecimal bigDecimal39 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal40 = bigDecimal39.stripTrailingZeros();
        int int41 = bigDecimal39.signum();
        java.math.BigDecimal[] bigDecimalArray42 = bigDecimal36.divideAndRemainder(bigDecimal39);
        java.math.BigDecimal bigDecimal44 = bigDecimal36.pow((int) 'a');
        java.math.BigInteger bigInteger45 = bigDecimal36.toBigIntegerExact();
        java.math.BigDecimal bigDecimal46 = bigDecimal34.add(bigDecimal36);
        java.math.BigDecimal bigDecimal47 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal49 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger50 = bigDecimal49.unscaledValue();
        java.math.BigDecimal bigDecimal51 = bigDecimal47.add(bigDecimal49);
        java.math.BigDecimal bigDecimal52 = bigDecimal36.multiply(bigDecimal47);
        java.math.BigDecimal bigDecimal53 = bigDecimal24.divide(bigDecimal47);
        int int54 = bigDecimal17.compareTo(bigDecimal24);
        org.apache.commons.math.linear.BigMatrix bigMatrix55 = bigMatrix13.scalarMultiply(bigDecimal17);
        java.math.BigDecimal bigDecimal56 = bigDecimal17.stripTrailingZeros();
        java.math.BigDecimal bigDecimal57 = bigDecimal56.negate();
        java.math.BigDecimal bigDecimal59 = new java.math.BigDecimal(0.0d);
        java.lang.String str60 = bigDecimal59.toString();
        java.math.BigDecimal bigDecimal62 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal63 = bigDecimal62.stripTrailingZeros();
        int int64 = bigDecimal62.signum();
        java.math.BigDecimal[] bigDecimalArray65 = bigDecimal59.divideAndRemainder(bigDecimal62);
        java.math.BigDecimal bigDecimal67 = bigDecimal59.pow((int) 'a');
        java.math.BigDecimal bigDecimal69 = new java.math.BigDecimal(0.0d);
        java.lang.String str70 = bigDecimal69.toString();
        java.math.BigDecimal bigDecimal72 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal73 = bigDecimal72.stripTrailingZeros();
        int int74 = bigDecimal72.signum();
        java.math.BigDecimal[] bigDecimalArray75 = bigDecimal69.divideAndRemainder(bigDecimal72);
        java.math.BigDecimal bigDecimal77 = bigDecimal69.pow((int) 'a');
        java.math.BigInteger bigInteger78 = bigDecimal69.toBigIntegerExact();
        java.math.BigDecimal bigDecimal79 = bigDecimal67.add(bigDecimal69);
        java.math.BigInteger bigInteger80 = bigDecimal79.unscaledValue();
        java.math.BigDecimal bigDecimal82 = new java.math.BigDecimal(bigInteger80, 100);
        java.math.BigDecimal bigDecimal83 = bigDecimal82.ulp();
        java.math.BigDecimal bigDecimal84 = bigDecimal57.min(bigDecimal82);
        java.math.BigDecimal bigDecimal86 = bigDecimal82.movePointLeft((int) (byte) -54);
        java.math.BigDecimal bigDecimal88 = new java.math.BigDecimal(0.0d);
        java.lang.String str89 = bigDecimal88.toString();
        java.math.BigDecimal bigDecimal90 = bigDecimal88.plus();
        double double91 = bigDecimal88.doubleValue();
        java.math.BigDecimal bigDecimal93 = bigDecimal88.scaleByPowerOfTen((int) (short) 35);
        java.math.BigDecimal bigDecimal94 = bigDecimal86.max(bigDecimal88);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal17 and bigDecimal82", (bigDecimal17.compareTo(bigDecimal82) == 0) == bigDecimal17.equals(bigDecimal82));
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        long long3 = bigDecimal1.longValue();
        long long4 = bigDecimal1.longValueExact();
        int int5 = bigDecimal1.precision();
        java.math.BigDecimal bigDecimal7 = new java.math.BigDecimal(0.0d);
        int int8 = bigDecimal7.intValue();
        long long9 = bigDecimal7.longValue();
        long long10 = bigDecimal7.longValueExact();
        java.math.BigDecimal bigDecimal11 = bigDecimal1.add(bigDecimal7);
        java.math.BigDecimal bigDecimal13 = bigDecimal7.pow(3);
        java.math.BigInteger bigInteger14 = bigDecimal13.toBigIntegerExact();
        java.math.BigDecimal bigDecimal16 = bigDecimal13.setScale(7);
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.valueOf(10L, (int) (short) 1);
        java.lang.String str20 = bigDecimal19.toString();
        java.math.BigDecimal bigDecimal21 = bigDecimal13.divideToIntegralValue(bigDecimal19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal16", (bigDecimal1.compareTo(bigDecimal16) == 0) == bigDecimal1.equals(bigDecimal16));
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf(1L, (int) (byte) 100);
        java.math.BigInteger bigInteger3 = bigDecimal2.toBigInteger();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.ulp();
        java.math.BigDecimal bigDecimal6 = bigDecimal4.scaleByPowerOfTen(100);
        java.math.BigDecimal bigDecimal8 = bigDecimal6.movePointRight((int) 'a');
        double[] doubleArray11 = new double[] { 1.0d, 100.0f };
        double[] doubleArray14 = new double[] { 1.0d, 100.0f };
        double[] doubleArray17 = new double[] { 1.0d, 100.0f };
        double[] doubleArray20 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray21 = new double[][] { doubleArray11, doubleArray14, doubleArray17, doubleArray20 };
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray21);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl23 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.BigMatrix bigMatrix24 = bigMatrixImpl23.transpose();
        double[] doubleArray26 = bigMatrixImpl23.getRowAsDoubleArray((int) (short) 0);
        boolean boolean27 = bigMatrixImpl23.isSingular();
        java.math.BigDecimal[][] bigDecimalArray28 = bigMatrixImpl23.getData();
        java.math.BigDecimal[][] bigDecimalArray29 = bigMatrixImpl23.getDataRef();
        int int30 = bigMatrixImpl23.getRoundingMode();
        bigMatrixImpl23.setRoundingMode((int) (short) -100);
        double[] doubleArray35 = new double[] { 1.0d, 100.0f };
        double[] doubleArray38 = new double[] { 1.0d, 100.0f };
        double[] doubleArray41 = new double[] { 1.0d, 100.0f };
        double[] doubleArray44 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray45 = new double[][] { doubleArray35, doubleArray38, doubleArray41, doubleArray44 };
        org.apache.commons.math.linear.BigMatrix bigMatrix46 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray45);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl47 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray45);
        org.apache.commons.math.linear.BigMatrix bigMatrix48 = bigMatrixImpl47.transpose();
        boolean boolean49 = bigMatrixImpl47.isSingular();
        int int50 = bigMatrixImpl47.getRoundingMode();
        double[][] doubleArray51 = bigMatrixImpl47.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrix bigMatrix52 = bigMatrixImpl23.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl47);
        java.math.BigDecimal bigDecimal53 = bigMatrixImpl23.getNorm();
        java.math.BigDecimal bigDecimal55 = bigDecimal8.divide(bigDecimal53, 3);
        java.math.BigDecimal bigDecimal58 = java.math.BigDecimal.valueOf(10L, (int) (short) 1);
        byte byte59 = bigDecimal58.byteValueExact();
        java.lang.String str60 = bigDecimal58.toEngineeringString();
        java.math.BigDecimal bigDecimal62 = bigDecimal58.pow((int) '#');
        java.math.BigDecimal bigDecimal63 = bigDecimal8.remainder(bigDecimal58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal6 and bigDecimal62", (bigDecimal6.compareTo(bigDecimal62) == 0) == bigDecimal6.equals(bigDecimal62));
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf(10L);
        java.math.BigDecimal bigDecimal3 = new java.math.BigDecimal(0.0d);
        java.lang.String str4 = bigDecimal3.toString();
        java.math.BigDecimal bigDecimal5 = bigDecimal3.plus();
        double double6 = bigDecimal5.doubleValue();
        java.math.BigDecimal bigDecimal7 = bigDecimal1.max(bigDecimal5);
        double[] doubleArray10 = new double[] { 1.0d, 100.0f };
        double[] doubleArray13 = new double[] { 1.0d, 100.0f };
        double[] doubleArray16 = new double[] { 1.0d, 100.0f };
        double[] doubleArray19 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray20 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19 };
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray20);
        boolean boolean22 = bigMatrix21.isSingular();
        int int23 = bigMatrix21.getColumnDimension();
        java.math.BigDecimal bigDecimal25 = new java.math.BigDecimal(0.0d);
        java.lang.String str26 = bigDecimal25.toString();
        java.math.BigDecimal bigDecimal27 = bigDecimal25.plus();
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal30 = bigDecimal29.stripTrailingZeros();
        float float31 = bigDecimal29.floatValue();
        java.math.BigDecimal bigDecimal32 = bigDecimal29.ulp();
        java.math.BigDecimal bigDecimal34 = new java.math.BigDecimal(0.0d);
        java.lang.String str35 = bigDecimal34.toString();
        java.math.BigDecimal bigDecimal37 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal38 = bigDecimal37.stripTrailingZeros();
        int int39 = bigDecimal37.signum();
        java.math.BigDecimal[] bigDecimalArray40 = bigDecimal34.divideAndRemainder(bigDecimal37);
        java.math.BigDecimal bigDecimal42 = bigDecimal34.pow((int) 'a');
        java.math.BigDecimal bigDecimal44 = new java.math.BigDecimal(0.0d);
        java.lang.String str45 = bigDecimal44.toString();
        java.math.BigDecimal bigDecimal47 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal48 = bigDecimal47.stripTrailingZeros();
        int int49 = bigDecimal47.signum();
        java.math.BigDecimal[] bigDecimalArray50 = bigDecimal44.divideAndRemainder(bigDecimal47);
        java.math.BigDecimal bigDecimal52 = bigDecimal44.pow((int) 'a');
        java.math.BigInteger bigInteger53 = bigDecimal44.toBigIntegerExact();
        java.math.BigDecimal bigDecimal54 = bigDecimal42.add(bigDecimal44);
        java.math.BigDecimal bigDecimal55 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal57 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger58 = bigDecimal57.unscaledValue();
        java.math.BigDecimal bigDecimal59 = bigDecimal55.add(bigDecimal57);
        java.math.BigDecimal bigDecimal60 = bigDecimal44.multiply(bigDecimal55);
        java.math.BigDecimal bigDecimal61 = bigDecimal32.divide(bigDecimal55);
        int int62 = bigDecimal25.compareTo(bigDecimal32);
        org.apache.commons.math.linear.BigMatrix bigMatrix63 = bigMatrix21.scalarMultiply(bigDecimal25);
        java.math.BigDecimal bigDecimal65 = bigDecimal25.scaleByPowerOfTen((int) (byte) 0);
        java.lang.String str66 = bigDecimal25.toEngineeringString();
        int int67 = bigDecimal25.scale();
        java.math.BigDecimal bigDecimal69 = bigDecimal25.setScale((int) (byte) 110);
        java.math.BigDecimal bigDecimal70 = bigDecimal5.min(bigDecimal69);
        int int71 = bigDecimal5.signum();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal5 and bigDecimal69", (bigDecimal5.compareTo(bigDecimal69) == 0) == bigDecimal5.equals(bigDecimal69));
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        java.lang.String str2 = bigDecimal1.toString();
        java.math.BigDecimal bigDecimal4 = bigDecimal1.setScale(0);
        byte byte5 = bigDecimal4.byteValueExact();
        int int6 = bigDecimal4.precision();
        double[] doubleArray9 = new double[] { 1.0d, 100.0f };
        double[] doubleArray12 = new double[] { 1.0d, 100.0f };
        double[] doubleArray15 = new double[] { 1.0d, 100.0f };
        double[] doubleArray18 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray19 = new double[][] { doubleArray9, doubleArray12, doubleArray15, doubleArray18 };
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray19);
        boolean boolean21 = bigMatrix20.isSingular();
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = bigMatrix20.copy();
        java.math.BigDecimal bigDecimal23 = bigMatrix20.getNorm();
        java.math.BigDecimal bigDecimal25 = bigDecimal23.scaleByPowerOfTen((int) '#');
        java.math.BigDecimal bigDecimal27 = new java.math.BigDecimal(0.0d);
        java.lang.String str28 = bigDecimal27.toString();
        java.math.BigDecimal bigDecimal30 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal31 = bigDecimal30.stripTrailingZeros();
        int int32 = bigDecimal30.signum();
        java.math.BigDecimal[] bigDecimalArray33 = bigDecimal27.divideAndRemainder(bigDecimal30);
        java.math.BigDecimal bigDecimal35 = bigDecimal27.pow((int) 'a');
        java.math.BigInteger bigInteger36 = bigDecimal27.toBigIntegerExact();
        float float37 = bigDecimal27.floatValue();
        double[] doubleArray42 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix43 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray42);
        double[] doubleArray48 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix49 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray48);
        double[] doubleArray50 = realMatrix43.operate(doubleArray48);
        org.apache.commons.math.linear.BigMatrix bigMatrix51 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray50);
        java.math.BigDecimal bigDecimal52 = bigMatrix51.getNorm();
        java.math.BigDecimal bigDecimal53 = bigDecimal27.subtract(bigDecimal52);
        java.math.BigDecimal bigDecimal54 = bigDecimal25.min(bigDecimal27);
        java.math.BigDecimal bigDecimal55 = bigDecimal4.min(bigDecimal54);
        java.math.BigDecimal bigDecimal57 = bigDecimal54.setScale(64);
        int int58 = bigDecimal54.signum();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal57", (bigDecimal1.compareTo(bigDecimal57) == 0) == bigDecimal1.equals(bigDecimal57));
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        java.lang.String str2 = bigDecimal1.toString();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal5 = bigDecimal4.stripTrailingZeros();
        int int6 = bigDecimal4.signum();
        java.math.BigDecimal[] bigDecimalArray7 = bigDecimal1.divideAndRemainder(bigDecimal4);
        java.math.BigDecimal bigDecimal9 = bigDecimal1.pow((int) 'a');
        java.math.BigDecimal bigDecimal11 = new java.math.BigDecimal(0.0d);
        java.lang.String str12 = bigDecimal11.toString();
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal15 = bigDecimal14.stripTrailingZeros();
        int int16 = bigDecimal14.signum();
        java.math.BigDecimal[] bigDecimalArray17 = bigDecimal11.divideAndRemainder(bigDecimal14);
        java.math.BigDecimal bigDecimal19 = bigDecimal11.pow((int) 'a');
        java.math.BigInteger bigInteger20 = bigDecimal11.toBigIntegerExact();
        java.math.BigDecimal bigDecimal21 = bigDecimal9.add(bigDecimal11);
        java.math.BigDecimal bigDecimal23 = new java.math.BigDecimal(0.0d);
        java.lang.String str24 = bigDecimal23.toString();
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal27 = bigDecimal26.stripTrailingZeros();
        int int28 = bigDecimal26.signum();
        java.math.BigDecimal[] bigDecimalArray29 = bigDecimal23.divideAndRemainder(bigDecimal26);
        java.math.BigDecimal bigDecimal31 = bigDecimal23.pow((int) 'a');
        java.math.BigInteger bigInteger32 = bigDecimal23.toBigIntegerExact();
        float float33 = bigDecimal23.floatValue();
        java.math.BigDecimal bigDecimal34 = bigDecimal9.add(bigDecimal23);
        java.math.BigDecimal bigDecimal36 = new java.math.BigDecimal((int) (byte) 100);
        java.math.BigDecimal bigDecimal37 = bigDecimal23.divideToIntegralValue(bigDecimal36);
        java.math.BigDecimal bigDecimal39 = bigDecimal23.movePointLeft((int) (short) -1);
        double[] doubleArray42 = new double[] { 1.0d, 100.0f };
        double[] doubleArray45 = new double[] { 1.0d, 100.0f };
        double[] doubleArray48 = new double[] { 1.0d, 100.0f };
        double[] doubleArray51 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray52 = new double[][] { doubleArray42, doubleArray45, doubleArray48, doubleArray51 };
        org.apache.commons.math.linear.BigMatrix bigMatrix53 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray52);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl54 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray52);
        org.apache.commons.math.linear.BigMatrix bigMatrix55 = bigMatrixImpl54.transpose();
        double[] doubleArray57 = bigMatrixImpl54.getRowAsDoubleArray((int) (short) 0);
        boolean boolean58 = bigMatrixImpl54.isSingular();
        java.math.BigDecimal[][] bigDecimalArray59 = bigMatrixImpl54.getData();
        java.math.BigDecimal[][] bigDecimalArray60 = bigMatrixImpl54.getDataRef();
        int int61 = bigMatrixImpl54.getRoundingMode();
        bigMatrixImpl54.setRoundingMode((int) (short) -100);
        java.math.BigDecimal bigDecimal65 = new java.math.BigDecimal(0.0d);
        int int66 = bigDecimal65.intValue();
        java.math.BigDecimal bigDecimal68 = new java.math.BigDecimal(0.0d);
        int int69 = bigDecimal68.intValue();
        java.math.BigDecimal bigDecimal70 = bigDecimal65.min(bigDecimal68);
        java.math.BigInteger bigInteger71 = bigDecimal65.toBigInteger();
        java.math.BigDecimal bigDecimal72 = new java.math.BigDecimal(bigInteger71);
        java.math.BigDecimal bigDecimal74 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal75 = bigDecimal74.stripTrailingZeros();
        float float76 = bigDecimal74.floatValue();
        java.math.BigDecimal bigDecimal77 = bigDecimal72.multiply(bigDecimal74);
        java.math.BigDecimal bigDecimal78 = bigDecimal72.negate();
        int int79 = bigDecimal78.intValue();
        java.math.BigDecimal bigDecimal82 = bigDecimal78.setScale((int) (short) 10, 0);
        org.apache.commons.math.linear.BigMatrix bigMatrix83 = bigMatrixImpl54.scalarMultiply(bigDecimal82);
        java.math.BigDecimal bigDecimal85 = bigDecimal82.scaleByPowerOfTen((int) (short) 0);
        java.math.BigDecimal bigDecimal86 = bigDecimal23.max(bigDecimal85);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal82", (bigDecimal1.compareTo(bigDecimal82) == 0) == bigDecimal1.equals(bigDecimal82));
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.min(bigDecimal4);
        java.math.BigInteger bigInteger7 = bigDecimal1.toBigInteger();
        java.math.BigDecimal bigDecimal9 = bigDecimal1.movePointRight((int) '#');
        java.math.BigDecimal bigDecimal11 = bigDecimal1.movePointLeft((int) (short) 97);
        java.math.BigDecimal bigDecimal13 = new java.math.BigDecimal((double) 5);
        java.math.BigDecimal bigDecimal14 = bigDecimal11.multiply(bigDecimal13);
        int int15 = bigDecimal14.scale();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal11", (bigDecimal1.compareTo(bigDecimal11) == 0) == bigDecimal1.equals(bigDecimal11));
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger3 = bigDecimal2.unscaledValue();
        java.math.BigDecimal bigDecimal4 = bigDecimal0.add(bigDecimal2);
        java.math.BigDecimal bigDecimal6 = new java.math.BigDecimal(0.0d);
        java.lang.String str7 = bigDecimal6.toString();
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal10 = bigDecimal9.stripTrailingZeros();
        int int11 = bigDecimal9.signum();
        java.math.BigDecimal[] bigDecimalArray12 = bigDecimal6.divideAndRemainder(bigDecimal9);
        java.math.BigDecimal bigDecimal14 = bigDecimal6.pow((int) 'a');
        java.math.BigDecimal bigDecimal16 = new java.math.BigDecimal(0.0d);
        java.lang.String str17 = bigDecimal16.toString();
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal20 = bigDecimal19.stripTrailingZeros();
        int int21 = bigDecimal19.signum();
        java.math.BigDecimal[] bigDecimalArray22 = bigDecimal16.divideAndRemainder(bigDecimal19);
        java.math.BigDecimal bigDecimal24 = bigDecimal16.pow((int) 'a');
        java.math.BigInteger bigInteger25 = bigDecimal16.toBigIntegerExact();
        java.math.BigDecimal bigDecimal26 = bigDecimal14.add(bigDecimal16);
        java.math.BigDecimal bigDecimal27 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger30 = bigDecimal29.unscaledValue();
        java.math.BigDecimal bigDecimal31 = bigDecimal27.add(bigDecimal29);
        java.math.BigDecimal bigDecimal32 = bigDecimal16.multiply(bigDecimal27);
        java.math.BigDecimal bigDecimal33 = bigDecimal0.subtract(bigDecimal16);
        java.math.BigDecimal bigDecimal34 = bigDecimal33.abs();
        java.math.BigDecimal bigDecimal36 = new java.math.BigDecimal(0.0d);
        int int37 = bigDecimal36.intValue();
        java.math.BigDecimal bigDecimal39 = new java.math.BigDecimal(0.0d);
        int int40 = bigDecimal39.intValue();
        java.math.BigDecimal bigDecimal41 = bigDecimal36.min(bigDecimal39);
        java.math.BigDecimal[] bigDecimalArray42 = new java.math.BigDecimal[] { bigDecimal41 };
        java.math.BigDecimal bigDecimal44 = new java.math.BigDecimal(0.0d);
        int int45 = bigDecimal44.intValue();
        java.math.BigDecimal bigDecimal47 = new java.math.BigDecimal(0.0d);
        int int48 = bigDecimal47.intValue();
        java.math.BigDecimal bigDecimal49 = bigDecimal44.min(bigDecimal47);
        java.math.BigDecimal[] bigDecimalArray50 = new java.math.BigDecimal[] { bigDecimal49 };
        java.math.BigDecimal bigDecimal52 = new java.math.BigDecimal(0.0d);
        int int53 = bigDecimal52.intValue();
        java.math.BigDecimal bigDecimal55 = new java.math.BigDecimal(0.0d);
        int int56 = bigDecimal55.intValue();
        java.math.BigDecimal bigDecimal57 = bigDecimal52.min(bigDecimal55);
        java.math.BigDecimal[] bigDecimalArray58 = new java.math.BigDecimal[] { bigDecimal57 };
        java.math.BigDecimal[][] bigDecimalArray59 = new java.math.BigDecimal[][] { bigDecimalArray42, bigDecimalArray50, bigDecimalArray58 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl60 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray59);
        org.apache.commons.math.linear.BigMatrix bigMatrix61 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray59);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl62 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray59);
        java.math.BigDecimal bigDecimal65 = java.math.BigDecimal.valueOf(0L, (int) ' ');
        org.apache.commons.math.linear.BigMatrix bigMatrix66 = bigMatrixImpl62.scalarAdd(bigDecimal65);
        java.math.BigDecimal bigDecimal67 = bigDecimal34.add(bigDecimal65);
        java.math.BigDecimal bigDecimal68 = bigDecimal34.stripTrailingZeros();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal34 and bigDecimal67", (bigDecimal34.compareTo(bigDecimal67) == 0) == bigDecimal34.equals(bigDecimal67));
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf(0.0d);
        long long2 = bigDecimal1.longValue();
        java.math.BigDecimal bigDecimal3 = bigDecimal1.stripTrailingZeros();
        java.math.BigDecimal bigDecimal4 = bigDecimal3.abs();
        int int5 = bigDecimal4.signum();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal4", (bigDecimal1.compareTo(bigDecimal4) == 0) == bigDecimal1.equals(bigDecimal4));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (short) 1, 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray3 = bigMatrixImpl2.getDataAsDoubleArray();
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.min(bigDecimal4);
        java.math.BigInteger bigInteger7 = bigDecimal1.toBigInteger();
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigDecimal bigDecimal10 = bigDecimal9.negate();
        java.math.BigDecimal bigDecimal11 = bigDecimal1.add(bigDecimal9);
        java.math.BigDecimal bigDecimal13 = new java.math.BigDecimal(0.0d);
        int int14 = bigDecimal13.intValue();
        java.math.BigDecimal bigDecimal16 = new java.math.BigDecimal(0.0d);
        int int17 = bigDecimal16.intValue();
        java.math.BigDecimal bigDecimal18 = bigDecimal13.min(bigDecimal16);
        java.math.BigDecimal[] bigDecimalArray19 = new java.math.BigDecimal[] { bigDecimal18 };
        java.math.BigDecimal bigDecimal21 = new java.math.BigDecimal(0.0d);
        int int22 = bigDecimal21.intValue();
        java.math.BigDecimal bigDecimal24 = new java.math.BigDecimal(0.0d);
        int int25 = bigDecimal24.intValue();
        java.math.BigDecimal bigDecimal26 = bigDecimal21.min(bigDecimal24);
        java.math.BigDecimal[] bigDecimalArray27 = new java.math.BigDecimal[] { bigDecimal26 };
        java.math.BigDecimal bigDecimal29 = new java.math.BigDecimal(0.0d);
        int int30 = bigDecimal29.intValue();
        java.math.BigDecimal bigDecimal32 = new java.math.BigDecimal(0.0d);
        int int33 = bigDecimal32.intValue();
        java.math.BigDecimal bigDecimal34 = bigDecimal29.min(bigDecimal32);
        java.math.BigDecimal[] bigDecimalArray35 = new java.math.BigDecimal[] { bigDecimal34 };
        java.math.BigDecimal[][] bigDecimalArray36 = new java.math.BigDecimal[][] { bigDecimalArray19, bigDecimalArray27, bigDecimalArray35 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray36);
        org.apache.commons.math.linear.BigMatrix bigMatrix38 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray36);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray36);
        java.math.BigDecimal[][] bigDecimalArray40 = bigMatrixImpl39.getDataRef();
        java.math.BigDecimal bigDecimal41 = bigMatrixImpl39.getNorm();
        boolean boolean42 = bigMatrixImpl39.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix43 = bigMatrixImpl39.copy();
        double[] doubleArray45 = bigMatrixImpl39.getColumnAsDoubleArray((int) (byte) 0);
        java.lang.String[] strArray47 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray48 = new java.lang.String[][] { strArray47 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl49 = new org.apache.commons.math.linear.BigMatrixImpl(strArray48);
        org.apache.commons.math.linear.BigMatrix bigMatrix50 = bigMatrixImpl39.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl49);
        java.math.BigDecimal bigDecimal51 = bigMatrixImpl39.getNorm();
        java.math.BigDecimal bigDecimal53 = new java.math.BigDecimal(0.0d);
        int int54 = bigDecimal53.intValue();
        java.math.BigDecimal bigDecimal56 = new java.math.BigDecimal(0.0d);
        int int57 = bigDecimal56.intValue();
        java.math.BigDecimal bigDecimal58 = bigDecimal53.min(bigDecimal56);
        java.math.BigInteger bigInteger59 = bigDecimal53.toBigInteger();
        java.math.BigDecimal bigDecimal60 = bigDecimal51.max(bigDecimal53);
        java.math.BigDecimal bigDecimal61 = bigDecimal1.max(bigDecimal60);
        java.math.BigDecimal bigDecimal63 = new java.math.BigDecimal((int) 'a');
        int int64 = bigDecimal63.intValueExact();
        java.math.BigDecimal bigDecimal65 = bigDecimal1.divide(bigDecimal63);
        double[] doubleArray68 = new double[] { 1.0d, 100.0f };
        double[] doubleArray71 = new double[] { 1.0d, 100.0f };
        double[] doubleArray74 = new double[] { 1.0d, 100.0f };
        double[] doubleArray77 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray78 = new double[][] { doubleArray68, doubleArray71, doubleArray74, doubleArray77 };
        org.apache.commons.math.linear.BigMatrix bigMatrix79 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray78);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl80 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray78);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl81 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray78);
        java.math.BigDecimal bigDecimal84 = java.math.BigDecimal.valueOf(0L, (int) ' ');
        java.lang.String str85 = bigDecimal84.toPlainString();
        org.apache.commons.math.linear.BigMatrix bigMatrix86 = bigMatrixImpl81.scalarMultiply(bigDecimal84);
        java.math.BigDecimal bigDecimal87 = bigDecimal63.multiply(bigDecimal84);
        java.math.BigInteger bigInteger88 = bigDecimal63.toBigInteger();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal84", (bigDecimal1.compareTo(bigDecimal84) == 0) == bigDecimal1.equals(bigDecimal84));
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        java.lang.String[] strArray1 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl3 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix4 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray2);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl5 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl6 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl7 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        java.math.BigDecimal bigDecimal9 = new java.math.BigDecimal(0.0d);
        int int10 = bigDecimal9.intValue();
        java.math.BigDecimal bigDecimal12 = new java.math.BigDecimal(0.0d);
        int int13 = bigDecimal12.intValue();
        java.math.BigDecimal bigDecimal14 = bigDecimal9.min(bigDecimal12);
        java.math.BigInteger bigInteger15 = bigDecimal9.toBigInteger();
        int int16 = bigDecimal9.precision();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigDecimal bigDecimal19 = bigDecimal9.subtract(bigDecimal18);
        java.math.BigDecimal bigDecimal20 = bigDecimal18.ulp();
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = bigMatrixImpl7.scalarAdd(bigDecimal18);
        java.math.BigDecimal bigDecimal22 = bigMatrixImpl7.getTrace();
        java.math.BigDecimal[][] bigDecimalArray23 = bigMatrixImpl7.getDataRef();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal9 and bigDecimal22", (bigDecimal9.compareTo(bigDecimal22) == 0) == bigDecimal9.equals(bigDecimal22));
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(5, 110);
        double[] doubleArray6 = new double[] { 62.0d, 52.0d, (-35) };
        double[] doubleArray10 = new double[] { 62.0d, 52.0d, (-35) };
        double[] doubleArray14 = new double[] { 62.0d, 52.0d, (-35) };
        double[][] doubleArray15 = new double[][] { doubleArray6, doubleArray10, doubleArray14 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray15);
        int int17 = bigMatrixImpl16.getScale();
        bigMatrixImpl16.setRoundingMode((int) (byte) -100);
        java.math.BigDecimal bigDecimal20 = bigMatrixImpl16.getNorm();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = bigMatrixImpl2.scalarMultiply(bigDecimal20);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((long) (byte) 97);
        int int2 = bigDecimal1.intValueExact();
        java.math.BigDecimal bigDecimal5 = bigDecimal1.setScale(0, (int) (short) 0);
        java.math.BigDecimal bigDecimal7 = new java.math.BigDecimal(0.0d);
        java.lang.String str8 = bigDecimal7.toString();
        java.math.BigDecimal bigDecimal10 = bigDecimal7.setScale(0);
        byte byte11 = bigDecimal10.byteValueExact();
        java.math.BigDecimal bigDecimal12 = bigDecimal10.plus();
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger15 = bigDecimal14.unscaledValue();
        java.lang.String str16 = bigDecimal14.toPlainString();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal19 = bigDecimal18.stripTrailingZeros();
        float float20 = bigDecimal18.floatValue();
        java.math.BigDecimal bigDecimal21 = bigDecimal18.ulp();
        java.math.BigDecimal bigDecimal22 = bigDecimal21.ulp();
        java.math.BigDecimal bigDecimal23 = bigDecimal14.remainder(bigDecimal22);
        java.math.BigDecimal bigDecimal25 = bigDecimal14.pow((int) '#');
        int int26 = bigDecimal10.compareTo(bigDecimal25);
        java.lang.String str27 = bigDecimal10.toEngineeringString();
        java.lang.String str28 = bigDecimal10.toString();
        java.math.BigDecimal bigDecimal30 = bigDecimal10.movePointRight((-1));
        java.math.BigDecimal bigDecimal31 = bigDecimal1.subtract(bigDecimal30);
        java.math.BigDecimal bigDecimal32 = bigDecimal1.abs();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal32 and bigDecimal31", (bigDecimal32.compareTo(bigDecimal31) == 0) == bigDecimal32.equals(bigDecimal31));
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        long long3 = bigDecimal1.longValue();
        long long4 = bigDecimal1.longValueExact();
        int int5 = bigDecimal1.precision();
        java.math.BigDecimal bigDecimal7 = new java.math.BigDecimal(0.0d);
        int int8 = bigDecimal7.intValue();
        long long9 = bigDecimal7.longValue();
        long long10 = bigDecimal7.longValueExact();
        java.math.BigDecimal bigDecimal11 = bigDecimal1.add(bigDecimal7);
        java.math.BigDecimal bigDecimal13 = bigDecimal7.pow(3);
        java.math.BigInteger bigInteger14 = bigDecimal13.toBigIntegerExact();
        java.math.BigDecimal bigDecimal16 = new java.math.BigDecimal(bigInteger14, (int) 'a');
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(bigInteger14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal16", (bigDecimal1.compareTo(bigDecimal16) == 0) == bigDecimal1.equals(bigDecimal16));
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf((long) (byte) 110, 6);
        java.math.BigDecimal bigDecimal3 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger6 = bigDecimal5.unscaledValue();
        java.math.BigDecimal bigDecimal7 = bigDecimal3.add(bigDecimal5);
        float float8 = bigDecimal5.floatValue();
        java.lang.String str9 = bigDecimal5.toEngineeringString();
        java.math.BigDecimal bigDecimal11 = new java.math.BigDecimal(0.0d);
        int int12 = bigDecimal11.intValue();
        long long13 = bigDecimal11.longValue();
        long long14 = bigDecimal11.longValueExact();
        int int15 = bigDecimal11.precision();
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(0.0d);
        int int18 = bigDecimal17.intValue();
        long long19 = bigDecimal17.longValue();
        long long20 = bigDecimal17.longValueExact();
        java.math.BigDecimal bigDecimal21 = bigDecimal11.add(bigDecimal17);
        java.math.BigDecimal bigDecimal23 = bigDecimal17.pow(3);
        java.math.BigInteger bigInteger24 = bigDecimal23.toBigIntegerExact();
        java.math.BigDecimal bigDecimal25 = bigDecimal23.stripTrailingZeros();
        java.math.BigDecimal bigDecimal26 = bigDecimal5.add(bigDecimal23);
        java.math.BigDecimal bigDecimal28 = new java.math.BigDecimal(0.0d);
        int int29 = bigDecimal28.intValue();
        java.math.BigDecimal bigDecimal31 = new java.math.BigDecimal(0.0d);
        int int32 = bigDecimal31.intValue();
        java.math.BigDecimal bigDecimal33 = bigDecimal28.min(bigDecimal31);
        java.math.BigDecimal[] bigDecimalArray34 = new java.math.BigDecimal[] { bigDecimal33 };
        java.math.BigDecimal bigDecimal36 = new java.math.BigDecimal(0.0d);
        int int37 = bigDecimal36.intValue();
        java.math.BigDecimal bigDecimal39 = new java.math.BigDecimal(0.0d);
        int int40 = bigDecimal39.intValue();
        java.math.BigDecimal bigDecimal41 = bigDecimal36.min(bigDecimal39);
        java.math.BigDecimal[] bigDecimalArray42 = new java.math.BigDecimal[] { bigDecimal41 };
        java.math.BigDecimal bigDecimal44 = new java.math.BigDecimal(0.0d);
        int int45 = bigDecimal44.intValue();
        java.math.BigDecimal bigDecimal47 = new java.math.BigDecimal(0.0d);
        int int48 = bigDecimal47.intValue();
        java.math.BigDecimal bigDecimal49 = bigDecimal44.min(bigDecimal47);
        java.math.BigDecimal[] bigDecimalArray50 = new java.math.BigDecimal[] { bigDecimal49 };
        java.math.BigDecimal[][] bigDecimalArray51 = new java.math.BigDecimal[][] { bigDecimalArray34, bigDecimalArray42, bigDecimalArray50 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl52 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray51);
        org.apache.commons.math.linear.BigMatrix bigMatrix53 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray51);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl54 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray51);
        java.math.BigDecimal[][] bigDecimalArray55 = bigMatrixImpl54.getDataRef();
        java.math.BigDecimal bigDecimal56 = bigMatrixImpl54.getNorm();
        boolean boolean57 = bigMatrixImpl54.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix58 = bigMatrixImpl54.copy();
        double[] doubleArray60 = bigMatrixImpl54.getColumnAsDoubleArray((int) (byte) 0);
        java.math.BigDecimal bigDecimal61 = java.math.BigDecimal.TEN;
        org.apache.commons.math.linear.BigMatrix bigMatrix62 = bigMatrixImpl54.scalarMultiply(bigDecimal61);
        java.math.BigDecimal bigDecimal65 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) ' ');
        org.apache.commons.math.linear.BigMatrix bigMatrix66 = bigMatrixImpl54.scalarAdd(bigDecimal65);
        java.math.BigDecimal bigDecimal68 = bigDecimal65.movePointLeft((int) (short) -100);
        java.math.BigDecimal bigDecimal70 = new java.math.BigDecimal(0.0d);
        int int71 = bigDecimal70.intValue();
        long long72 = bigDecimal70.longValue();
        java.math.BigDecimal bigDecimal73 = bigDecimal65.min(bigDecimal70);
        java.math.BigDecimal bigDecimal74 = bigDecimal23.multiply(bigDecimal70);
        java.math.BigDecimal bigDecimal76 = bigDecimal23.setScale(5);
        java.math.BigDecimal bigDecimal77 = bigDecimal2.min(bigDecimal23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal11 and bigDecimal76", (bigDecimal11.compareTo(bigDecimal76) == 0) == bigDecimal11.equals(bigDecimal76));
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (short) 400, (int) ' ');
        java.math.BigDecimal bigDecimal3 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger6 = bigDecimal5.unscaledValue();
        java.math.BigDecimal bigDecimal7 = bigDecimal3.add(bigDecimal5);
        java.math.BigInteger bigInteger8 = bigDecimal5.toBigInteger();
        java.math.BigDecimal bigDecimal10 = new java.math.BigDecimal(bigInteger8, (int) (short) -1);
        java.math.BigDecimal bigDecimal12 = new java.math.BigDecimal((long) (short) 100);
        java.lang.String str13 = bigDecimal12.toEngineeringString();
        java.math.BigDecimal[] bigDecimalArray14 = bigDecimal10.divideAndRemainder(bigDecimal12);
        java.math.BigDecimal bigDecimal16 = bigDecimal10.setScale((int) (short) 2805);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = bigMatrixImpl2.scalarAdd(bigDecimal16);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        double[] doubleArray2 = new double[] { 1.0d, 100.0f };
        double[] doubleArray5 = new double[] { 1.0d, 100.0f };
        double[] doubleArray8 = new double[] { 1.0d, 100.0f };
        double[] doubleArray11 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl14 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        java.math.BigDecimal bigDecimal18 = new java.math.BigDecimal(0.0d);
        int int19 = bigDecimal18.intValue();
        java.math.BigDecimal bigDecimal21 = new java.math.BigDecimal(0.0d);
        int int22 = bigDecimal21.intValue();
        java.math.BigDecimal bigDecimal23 = bigDecimal18.min(bigDecimal21);
        java.math.BigInteger bigInteger24 = bigDecimal18.toBigInteger();
        java.math.BigDecimal bigDecimal25 = new java.math.BigDecimal(bigInteger24);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = bigMatrix16.scalarAdd(bigDecimal25);
        java.math.BigDecimal bigDecimal28 = bigDecimal25.scaleByPowerOfTen(97);
        java.math.BigInteger bigInteger29 = bigDecimal28.toBigIntegerExact();
        java.math.BigInteger bigInteger30 = bigDecimal28.unscaledValue();
        java.math.BigDecimal bigDecimal32 = bigDecimal28.movePointLeft(32);
        java.math.BigDecimal bigDecimal34 = bigDecimal32.pow((int) (byte) 32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal18 and bigDecimal28", (bigDecimal18.compareTo(bigDecimal28) == 0) == bigDecimal18.equals(bigDecimal28));
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        long long3 = bigDecimal1.longValue();
        long long4 = bigDecimal1.longValueExact();
        int int5 = bigDecimal1.precision();
        java.math.BigDecimal bigDecimal7 = new java.math.BigDecimal(0.0d);
        int int8 = bigDecimal7.intValue();
        long long9 = bigDecimal7.longValue();
        long long10 = bigDecimal7.longValueExact();
        java.math.BigDecimal bigDecimal11 = bigDecimal1.add(bigDecimal7);
        java.math.BigDecimal bigDecimal12 = bigDecimal1.ulp();
        java.lang.String str13 = bigDecimal1.toEngineeringString();
        double[] doubleArray16 = new double[] { 1.0d, 100.0f };
        double[] doubleArray19 = new double[] { 1.0d, 100.0f };
        double[] doubleArray22 = new double[] { 1.0d, 100.0f };
        double[] doubleArray25 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray26 = new double[][] { doubleArray16, doubleArray19, doubleArray22, doubleArray25 };
        org.apache.commons.math.linear.BigMatrix bigMatrix27 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray26);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray26);
        org.apache.commons.math.linear.BigMatrix bigMatrix29 = bigMatrixImpl28.transpose();
        double[] doubleArray31 = bigMatrixImpl28.getRowAsDoubleArray((int) (short) 0);
        boolean boolean32 = bigMatrixImpl28.isSingular();
        java.math.BigDecimal[][] bigDecimalArray33 = bigMatrixImpl28.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33);
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigDecimal bigDecimal37 = bigDecimal36.negate();
        int int38 = bigDecimal37.scale();
        boolean boolean39 = bigMatrixImpl34.equals((java.lang.Object) bigDecimal37);
        java.math.BigDecimal bigDecimal40 = bigDecimal37.plus();
        int int41 = bigDecimal40.intValue();
        java.math.BigDecimal bigDecimal44 = bigDecimal1.divide(bigDecimal40, (int) (short) 9, 5);
        java.math.BigDecimal bigDecimal45 = bigDecimal44.negate();
        int int46 = bigDecimal44.signum();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal44", (bigDecimal1.compareTo(bigDecimal44) == 0) == bigDecimal1.equals(bigDecimal44));
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        double[] doubleArray2 = new double[] { 1.0d, 100.0f };
        double[] doubleArray5 = new double[] { 1.0d, 100.0f };
        double[] doubleArray8 = new double[] { 1.0d, 100.0f };
        double[] doubleArray11 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl14 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = bigMatrixImpl14.transpose();
        boolean boolean16 = bigMatrixImpl14.isSingular();
        int int17 = bigMatrixImpl14.getRoundingMode();
        double[] doubleArray20 = new double[] { 1.0d, 100.0f };
        double[] doubleArray23 = new double[] { 1.0d, 100.0f };
        double[] doubleArray26 = new double[] { 1.0d, 100.0f };
        double[] doubleArray29 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray30 = new double[][] { doubleArray20, doubleArray23, doubleArray26, doubleArray29 };
        org.apache.commons.math.linear.BigMatrix bigMatrix31 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray30);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl32 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray30);
        org.apache.commons.math.linear.BigMatrix bigMatrix33 = bigMatrixImpl32.transpose();
        java.math.BigDecimal bigDecimal34 = bigMatrixImpl32.getNorm();
        int int35 = bigDecimal34.signum();
        java.math.BigDecimal bigDecimal37 = java.math.BigDecimal.valueOf((long) 4);
        int int38 = bigDecimal37.signum();
        java.math.BigDecimal bigDecimal39 = bigDecimal34.subtract(bigDecimal37);
        org.apache.commons.math.linear.BigMatrix bigMatrix40 = bigMatrixImpl14.scalarAdd(bigDecimal39);
        double double41 = bigDecimal39.doubleValue();
        java.math.BigDecimal bigDecimal43 = new java.math.BigDecimal(0.0d);
        int int44 = bigDecimal43.intValue();
        long long45 = bigDecimal43.longValue();
        long long46 = bigDecimal43.longValueExact();
        int int47 = bigDecimal43.precision();
        java.math.BigDecimal bigDecimal49 = new java.math.BigDecimal(0.0d);
        int int50 = bigDecimal49.intValue();
        long long51 = bigDecimal49.longValue();
        long long52 = bigDecimal49.longValueExact();
        java.math.BigDecimal bigDecimal53 = bigDecimal43.add(bigDecimal49);
        java.math.BigDecimal bigDecimal54 = bigDecimal43.ulp();
        java.lang.String str55 = bigDecimal43.toEngineeringString();
        double[] doubleArray58 = new double[] { 1.0d, 100.0f };
        double[] doubleArray61 = new double[] { 1.0d, 100.0f };
        double[] doubleArray64 = new double[] { 1.0d, 100.0f };
        double[] doubleArray67 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray68 = new double[][] { doubleArray58, doubleArray61, doubleArray64, doubleArray67 };
        org.apache.commons.math.linear.BigMatrix bigMatrix69 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray68);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl70 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray68);
        org.apache.commons.math.linear.BigMatrix bigMatrix71 = bigMatrixImpl70.transpose();
        double[] doubleArray73 = bigMatrixImpl70.getRowAsDoubleArray((int) (short) 0);
        boolean boolean74 = bigMatrixImpl70.isSingular();
        java.math.BigDecimal[][] bigDecimalArray75 = bigMatrixImpl70.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl76 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray75);
        java.math.BigDecimal bigDecimal78 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigDecimal bigDecimal79 = bigDecimal78.negate();
        int int80 = bigDecimal79.scale();
        boolean boolean81 = bigMatrixImpl76.equals((java.lang.Object) bigDecimal79);
        java.math.BigDecimal bigDecimal82 = bigDecimal79.plus();
        int int83 = bigDecimal82.intValue();
        java.math.BigDecimal bigDecimal86 = bigDecimal43.divide(bigDecimal82, (int) (short) 9, 5);
        int int87 = bigDecimal39.compareTo(bigDecimal82);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal43 and bigDecimal86", (bigDecimal43.compareTo(bigDecimal86) == 0) == bigDecimal43.equals(bigDecimal86));
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        java.lang.String str2 = bigDecimal1.toString();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal5 = bigDecimal4.stripTrailingZeros();
        int int6 = bigDecimal4.signum();
        java.math.BigDecimal[] bigDecimalArray7 = bigDecimal1.divideAndRemainder(bigDecimal4);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl8 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray7);
        int int9 = bigMatrixImpl8.getRoundingMode();
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = bigMatrixImpl8.transpose();
        java.math.BigDecimal[][] bigDecimalArray11 = bigMatrix10.getData();
        double[] doubleArray14 = new double[] { 1.0d, 100.0f };
        double[] doubleArray17 = new double[] { 1.0d, 100.0f };
        double[] doubleArray20 = new double[] { 1.0d, 100.0f };
        double[] doubleArray23 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray24 = new double[][] { doubleArray14, doubleArray17, doubleArray20, doubleArray23 };
        org.apache.commons.math.linear.BigMatrix bigMatrix25 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray24);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl26 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray24);
        org.apache.commons.math.linear.BigMatrix bigMatrix27 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray24);
        java.math.BigDecimal[][] bigDecimalArray28 = bigMatrix27.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl29 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray28);
        double[] doubleArray32 = new double[] { 1.0d, 100.0f };
        double[] doubleArray35 = new double[] { 1.0d, 100.0f };
        double[] doubleArray38 = new double[] { 1.0d, 100.0f };
        double[] doubleArray41 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray42 = new double[][] { doubleArray32, doubleArray35, doubleArray38, doubleArray41 };
        org.apache.commons.math.linear.BigMatrix bigMatrix43 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray42);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl44 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray42);
        org.apache.commons.math.linear.BigMatrix bigMatrix45 = bigMatrixImpl44.transpose();
        java.math.BigDecimal bigDecimal47 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal49 = new java.math.BigDecimal(0.0d);
        java.lang.String str50 = bigDecimal49.toString();
        java.math.BigDecimal bigDecimal52 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal53 = bigDecimal52.stripTrailingZeros();
        int int54 = bigDecimal52.signum();
        java.math.BigDecimal[] bigDecimalArray55 = bigDecimal49.divideAndRemainder(bigDecimal52);
        java.math.BigDecimal bigDecimal57 = bigDecimal49.pow((int) 'a');
        java.math.BigDecimal[] bigDecimalArray58 = new java.math.BigDecimal[] { bigDecimal47, bigDecimal49 };
        org.apache.commons.math.linear.BigMatrix bigMatrix59 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(bigDecimalArray58);
        org.apache.commons.math.linear.BigMatrix bigMatrix60 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(bigDecimalArray58);
        java.math.BigDecimal[] bigDecimalArray61 = bigMatrix45.preMultiply(bigDecimalArray58);
        java.math.BigDecimal[] bigDecimalArray62 = bigMatrixImpl29.preMultiply(bigDecimalArray61);
        java.math.BigDecimal[] bigDecimalArray64 = bigMatrixImpl29.getRow(0);
        org.apache.commons.math.linear.BigMatrix bigMatrix65 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(bigDecimalArray64);
        java.math.BigDecimal[] bigDecimalArray66 = bigMatrix10.operate(bigDecimalArray64);
        org.apache.commons.math.linear.BigMatrix bigMatrix67 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(bigDecimalArray66);
        // Transitivity of equals
        org.junit.Assert.assertTrue("Contract failed: equals-transitive on bigMatrix67, bigMatrix10, and bigDecimal1.", !(bigMatrix67.equals(bigMatrix10) && bigMatrix10.equals(bigDecimal1)) || bigMatrix67.equals(bigDecimal1));
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        long long3 = bigDecimal1.longValue();
        long long4 = bigDecimal1.longValueExact();
        int int5 = bigDecimal1.precision();
        java.math.BigDecimal bigDecimal7 = new java.math.BigDecimal(0.0d);
        int int8 = bigDecimal7.intValue();
        long long9 = bigDecimal7.longValue();
        long long10 = bigDecimal7.longValueExact();
        java.math.BigDecimal bigDecimal11 = bigDecimal1.add(bigDecimal7);
        java.math.BigDecimal bigDecimal13 = new java.math.BigDecimal(0.0d);
        int int14 = bigDecimal13.intValue();
        java.math.BigDecimal bigDecimal16 = new java.math.BigDecimal(0.0d);
        int int17 = bigDecimal16.intValue();
        java.math.BigDecimal bigDecimal18 = bigDecimal13.min(bigDecimal16);
        java.math.BigDecimal bigDecimal19 = bigDecimal11.min(bigDecimal16);
        java.math.BigDecimal bigDecimal21 = bigDecimal19.movePointRight((int) (short) 10);
        java.math.BigInteger bigInteger22 = bigDecimal21.toBigInteger();
        java.math.BigDecimal bigDecimal24 = new java.math.BigDecimal(bigInteger22, 110);
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.valueOf(100L);
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.valueOf((double) 0L);
        java.math.BigDecimal bigDecimal29 = bigDecimal26.max(bigDecimal28);
        java.lang.String str30 = bigDecimal26.toString();
        java.math.BigDecimal bigDecimal32 = new java.math.BigDecimal((double) ' ');
        java.lang.String str33 = bigDecimal32.toPlainString();
        java.math.BigDecimal[] bigDecimalArray34 = bigDecimal26.divideAndRemainder(bigDecimal32);
        java.math.BigDecimal bigDecimal35 = bigDecimal24.divide(bigDecimal26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal28", (bigDecimal1.compareTo(bigDecimal28) == 0) == bigDecimal1.equals(bigDecimal28));
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        java.lang.String[] strArray1 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl3 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl4 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl5 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        java.math.BigDecimal bigDecimal6 = bigMatrixImpl5.getTrace();
        java.math.BigDecimal bigDecimal8 = new java.math.BigDecimal(0.0d);
        int int9 = bigDecimal8.intValue();
        long long10 = bigDecimal8.longValue();
        long long11 = bigDecimal8.longValueExact();
        int int12 = bigDecimal8.precision();
        java.math.BigDecimal bigDecimal14 = new java.math.BigDecimal(0.0d);
        int int15 = bigDecimal14.intValue();
        long long16 = bigDecimal14.longValue();
        long long17 = bigDecimal14.longValueExact();
        java.math.BigDecimal bigDecimal18 = bigDecimal8.add(bigDecimal14);
        byte byte19 = bigDecimal8.byteValueExact();
        java.math.BigDecimal bigDecimal21 = bigDecimal8.movePointLeft((int) (byte) -1);
        java.math.BigDecimal bigDecimal23 = java.math.BigDecimal.valueOf((double) 10);
        java.math.BigDecimal bigDecimal24 = bigDecimal8.min(bigDecimal23);
        java.math.BigDecimal bigDecimal25 = bigDecimal6.subtract(bigDecimal24);
        short short26 = bigDecimal24.shortValueExact();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal6 and bigDecimal24", (bigDecimal6.compareTo(bigDecimal24) == 0) == bigDecimal6.equals(bigDecimal24));
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.min(bigDecimal4);
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal6 };
        java.math.BigDecimal bigDecimal9 = new java.math.BigDecimal(0.0d);
        int int10 = bigDecimal9.intValue();
        java.math.BigDecimal bigDecimal12 = new java.math.BigDecimal(0.0d);
        int int13 = bigDecimal12.intValue();
        java.math.BigDecimal bigDecimal14 = bigDecimal9.min(bigDecimal12);
        java.math.BigDecimal[] bigDecimalArray15 = new java.math.BigDecimal[] { bigDecimal14 };
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(0.0d);
        int int18 = bigDecimal17.intValue();
        java.math.BigDecimal bigDecimal20 = new java.math.BigDecimal(0.0d);
        int int21 = bigDecimal20.intValue();
        java.math.BigDecimal bigDecimal22 = bigDecimal17.min(bigDecimal20);
        java.math.BigDecimal[] bigDecimalArray23 = new java.math.BigDecimal[] { bigDecimal22 };
        java.math.BigDecimal[][] bigDecimalArray24 = new java.math.BigDecimal[][] { bigDecimalArray7, bigDecimalArray15, bigDecimalArray23 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl27 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        java.math.BigDecimal[][] bigDecimalArray28 = bigMatrixImpl27.getDataRef();
        bigMatrixImpl27.setRoundingMode(10);
        int int31 = bigMatrixImpl27.getScale();
        java.math.BigDecimal bigDecimal33 = new java.math.BigDecimal(0.0d);
        java.lang.String str34 = bigDecimal33.toString();
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal37 = bigDecimal36.stripTrailingZeros();
        int int38 = bigDecimal36.signum();
        java.math.BigDecimal[] bigDecimalArray39 = bigDecimal33.divideAndRemainder(bigDecimal36);
        java.math.BigDecimal bigDecimal41 = bigDecimal33.pow((int) 'a');
        java.math.BigDecimal bigDecimal43 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal44 = bigDecimal43.stripTrailingZeros();
        float float45 = bigDecimal43.floatValue();
        java.math.BigDecimal bigDecimal46 = bigDecimal41.divideToIntegralValue(bigDecimal43);
        java.math.BigDecimal bigDecimal47 = bigDecimal43.ulp();
        org.apache.commons.math.linear.BigMatrix bigMatrix48 = bigMatrixImpl27.scalarMultiply(bigDecimal47);
        java.math.BigDecimal bigDecimal50 = new java.math.BigDecimal(0.0d);
        java.math.BigDecimal bigDecimal51 = bigDecimal50.stripTrailingZeros();
        java.math.BigDecimal bigDecimal54 = bigDecimal51.setScale((-100), 0);
        java.math.BigDecimal bigDecimal55 = bigDecimal47.multiply(bigDecimal54);
        long long56 = bigDecimal47.longValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal54", (bigDecimal1.compareTo(bigDecimal54) == 0) == bigDecimal1.equals(bigDecimal54));
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        long long3 = bigDecimal1.longValue();
        long long4 = bigDecimal1.longValueExact();
        int int5 = bigDecimal1.precision();
        java.math.BigDecimal bigDecimal7 = new java.math.BigDecimal(0.0d);
        int int8 = bigDecimal7.intValue();
        long long9 = bigDecimal7.longValue();
        long long10 = bigDecimal7.longValueExact();
        java.math.BigDecimal bigDecimal11 = bigDecimal1.add(bigDecimal7);
        java.math.BigDecimal bigDecimal13 = bigDecimal7.pow(3);
        java.math.BigInteger bigInteger14 = bigDecimal13.toBigIntegerExact();
        java.math.BigDecimal bigDecimal16 = new java.math.BigDecimal(bigInteger14, (-100));
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(bigInteger14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal16", (bigDecimal1.compareTo(bigDecimal16) == 0) == bigDecimal1.equals(bigDecimal16));
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((double) (byte) -112);
        java.math.BigDecimal bigDecimal3 = bigDecimal1.setScale((int) ' ');
        java.math.BigDecimal bigDecimal5 = bigDecimal3.scaleByPowerOfTen((int) (byte) 97);
        java.math.BigDecimal bigDecimal7 = bigDecimal3.movePointLeft(7);
        double double8 = bigDecimal7.doubleValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal3", (bigDecimal1.compareTo(bigDecimal3) == 0) == bigDecimal1.equals(bigDecimal3));
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.min(bigDecimal4);
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal6 };
        java.math.BigDecimal bigDecimal9 = new java.math.BigDecimal(0.0d);
        int int10 = bigDecimal9.intValue();
        java.math.BigDecimal bigDecimal12 = new java.math.BigDecimal(0.0d);
        int int13 = bigDecimal12.intValue();
        java.math.BigDecimal bigDecimal14 = bigDecimal9.min(bigDecimal12);
        java.math.BigDecimal[] bigDecimalArray15 = new java.math.BigDecimal[] { bigDecimal14 };
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(0.0d);
        int int18 = bigDecimal17.intValue();
        java.math.BigDecimal bigDecimal20 = new java.math.BigDecimal(0.0d);
        int int21 = bigDecimal20.intValue();
        java.math.BigDecimal bigDecimal22 = bigDecimal17.min(bigDecimal20);
        java.math.BigDecimal[] bigDecimalArray23 = new java.math.BigDecimal[] { bigDecimal22 };
        java.math.BigDecimal[][] bigDecimalArray24 = new java.math.BigDecimal[][] { bigDecimalArray7, bigDecimalArray15, bigDecimalArray23 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray24);
        java.math.BigDecimal bigDecimal28 = new java.math.BigDecimal(0.0d);
        int int29 = bigDecimal28.intValue();
        java.math.BigDecimal bigDecimal31 = new java.math.BigDecimal(0.0d);
        int int32 = bigDecimal31.intValue();
        java.math.BigDecimal bigDecimal33 = bigDecimal28.min(bigDecimal31);
        java.math.BigInteger bigInteger34 = bigDecimal28.toBigInteger();
        java.math.BigDecimal bigDecimal35 = new java.math.BigDecimal(bigInteger34);
        java.math.BigDecimal bigDecimal37 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal38 = bigDecimal37.stripTrailingZeros();
        float float39 = bigDecimal37.floatValue();
        java.math.BigDecimal bigDecimal40 = bigDecimal35.multiply(bigDecimal37);
        org.apache.commons.math.linear.BigMatrix bigMatrix41 = bigMatrix26.scalarAdd(bigDecimal40);
        short short42 = bigDecimal40.shortValueExact();
        java.math.BigDecimal bigDecimal43 = bigDecimal40.abs();
        java.math.BigDecimal bigDecimal45 = bigDecimal43.movePointLeft((int) (short) 400);
        java.math.BigDecimal bigDecimal46 = bigDecimal43.stripTrailingZeros();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal45", (bigDecimal1.compareTo(bigDecimal45) == 0) == bigDecimal1.equals(bigDecimal45));
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        java.lang.String[] strArray1 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl3 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix4 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray2);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl5 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray2);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl8 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl9 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl10 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl11 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        java.math.BigDecimal bigDecimal12 = bigMatrixImpl11.getTrace();
        double[] doubleArray15 = new double[] { 1.0d, 100.0f };
        double[] doubleArray18 = new double[] { 1.0d, 100.0f };
        double[] doubleArray21 = new double[] { 1.0d, 100.0f };
        double[] doubleArray24 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray25 = new double[][] { doubleArray15, doubleArray18, doubleArray21, doubleArray24 };
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray25);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl27 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.BigMatrix bigMatrix28 = bigMatrixImpl27.transpose();
        java.math.BigDecimal bigDecimal29 = bigMatrixImpl27.getNorm();
        int int30 = bigDecimal29.signum();
        java.math.BigDecimal bigDecimal32 = bigDecimal29.movePointLeft((int) (byte) 97);
        java.lang.String str33 = bigDecimal32.toString();
        java.math.BigDecimal bigDecimal34 = bigDecimal12.divide(bigDecimal32);
        java.math.BigDecimal bigDecimal35 = bigDecimal32.negate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal12 and bigDecimal34", (bigDecimal12.compareTo(bigDecimal34) == 0) == bigDecimal12.equals(bigDecimal34));
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        double[] doubleArray2 = new double[] { 1.0d, 100.0f };
        double[] doubleArray5 = new double[] { 1.0d, 100.0f };
        double[] doubleArray8 = new double[] { 1.0d, 100.0f };
        double[] doubleArray11 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl14 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = bigMatrixImpl14.transpose();
        double[] doubleArray17 = bigMatrixImpl14.getRowAsDoubleArray((int) (short) 0);
        boolean boolean18 = bigMatrixImpl14.isSingular();
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = bigMatrixImpl14.copy();
        int int20 = bigMatrixImpl14.getScale();
        int int21 = bigMatrixImpl14.getColumnDimension();
        java.math.BigDecimal bigDecimal23 = new java.math.BigDecimal(0.0d);
        java.lang.String str24 = bigDecimal23.toString();
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal27 = bigDecimal26.stripTrailingZeros();
        int int28 = bigDecimal26.signum();
        java.math.BigDecimal[] bigDecimalArray29 = bigDecimal23.divideAndRemainder(bigDecimal26);
        java.math.BigDecimal bigDecimal31 = bigDecimal23.pow((int) 'a');
        java.math.BigInteger bigInteger32 = bigDecimal23.toBigInteger();
        java.math.BigDecimal bigDecimal34 = new java.math.BigDecimal(bigInteger32, 3);
        java.lang.String[] strArray36 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray37 = new java.lang.String[][] { strArray36 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl38 = new org.apache.commons.math.linear.BigMatrixImpl(strArray37);
        int int39 = bigMatrixImpl38.getColumnDimension();
        boolean boolean40 = bigDecimal34.equals((java.lang.Object) int39);
        org.apache.commons.math.linear.BigMatrix bigMatrix41 = bigMatrixImpl14.scalarMultiply(bigDecimal34);
        java.math.BigDecimal bigDecimal43 = new java.math.BigDecimal(0.0d);
        int int44 = bigDecimal43.intValue();
        long long45 = bigDecimal43.longValue();
        long long46 = bigDecimal43.longValueExact();
        int int47 = bigDecimal43.precision();
        java.math.BigDecimal bigDecimal49 = new java.math.BigDecimal(0.0d);
        int int50 = bigDecimal49.intValue();
        long long51 = bigDecimal49.longValue();
        long long52 = bigDecimal49.longValueExact();
        java.math.BigDecimal bigDecimal53 = bigDecimal43.add(bigDecimal49);
        java.math.BigDecimal bigDecimal54 = bigDecimal53.stripTrailingZeros();
        org.apache.commons.math.linear.BigMatrix bigMatrix55 = bigMatrixImpl14.scalarMultiply(bigDecimal54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal23 and bigDecimal34", (bigDecimal23.compareTo(bigDecimal34) == 0) == bigDecimal23.equals(bigDecimal34));
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.min(bigDecimal4);
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal6 };
        java.math.BigDecimal bigDecimal9 = new java.math.BigDecimal(0.0d);
        int int10 = bigDecimal9.intValue();
        java.math.BigDecimal bigDecimal12 = new java.math.BigDecimal(0.0d);
        int int13 = bigDecimal12.intValue();
        java.math.BigDecimal bigDecimal14 = bigDecimal9.min(bigDecimal12);
        java.math.BigDecimal[] bigDecimalArray15 = new java.math.BigDecimal[] { bigDecimal14 };
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(0.0d);
        int int18 = bigDecimal17.intValue();
        java.math.BigDecimal bigDecimal20 = new java.math.BigDecimal(0.0d);
        int int21 = bigDecimal20.intValue();
        java.math.BigDecimal bigDecimal22 = bigDecimal17.min(bigDecimal20);
        java.math.BigDecimal[] bigDecimalArray23 = new java.math.BigDecimal[] { bigDecimal22 };
        java.math.BigDecimal[][] bigDecimalArray24 = new java.math.BigDecimal[][] { bigDecimalArray7, bigDecimalArray15, bigDecimalArray23 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl27 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        java.math.BigDecimal[][] bigDecimalArray28 = bigMatrixImpl27.getDataRef();
        java.math.BigDecimal bigDecimal29 = bigMatrixImpl27.getNorm();
        boolean boolean30 = bigMatrixImpl27.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix31 = bigMatrixImpl27.copy();
        double[] doubleArray33 = bigMatrixImpl27.getColumnAsDoubleArray((int) (byte) 0);
        java.lang.String[] strArray35 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray36 = new java.lang.String[][] { strArray35 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(strArray36);
        org.apache.commons.math.linear.BigMatrix bigMatrix38 = bigMatrixImpl27.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl37);
        java.math.BigDecimal bigDecimal40 = new java.math.BigDecimal(0.0d);
        java.lang.String str41 = bigDecimal40.toString();
        java.math.BigDecimal bigDecimal43 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal44 = bigDecimal43.stripTrailingZeros();
        int int45 = bigDecimal43.signum();
        java.math.BigDecimal[] bigDecimalArray46 = bigDecimal40.divideAndRemainder(bigDecimal43);
        java.math.BigDecimal bigDecimal48 = bigDecimal40.pow((int) 'a');
        java.math.BigDecimal bigDecimal50 = new java.math.BigDecimal(0.0d);
        java.lang.String str51 = bigDecimal50.toString();
        java.math.BigDecimal bigDecimal53 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal54 = bigDecimal53.stripTrailingZeros();
        int int55 = bigDecimal53.signum();
        java.math.BigDecimal[] bigDecimalArray56 = bigDecimal50.divideAndRemainder(bigDecimal53);
        java.math.BigDecimal bigDecimal58 = bigDecimal50.pow((int) 'a');
        java.math.BigInteger bigInteger59 = bigDecimal50.toBigIntegerExact();
        java.math.BigDecimal bigDecimal60 = bigDecimal48.add(bigDecimal50);
        java.math.BigInteger bigInteger61 = bigDecimal60.unscaledValue();
        java.math.BigInteger bigInteger62 = bigDecimal60.toBigIntegerExact();
        boolean boolean63 = bigMatrixImpl27.equals((java.lang.Object) bigInteger62);
        int int64 = bigMatrixImpl27.getRowDimension();
        org.apache.commons.math.linear.BigMatrix bigMatrix65 = bigMatrixImpl27.copy();
        java.math.BigDecimal bigDecimal67 = new java.math.BigDecimal(0.0d);
        int int68 = bigDecimal67.intValue();
        long long69 = bigDecimal67.longValue();
        long long70 = bigDecimal67.longValueExact();
        int int71 = bigDecimal67.precision();
        java.math.BigDecimal bigDecimal73 = new java.math.BigDecimal(0.0d);
        int int74 = bigDecimal73.intValue();
        long long75 = bigDecimal73.longValue();
        long long76 = bigDecimal73.longValueExact();
        java.math.BigDecimal bigDecimal77 = bigDecimal67.add(bigDecimal73);
        java.math.BigDecimal bigDecimal79 = new java.math.BigDecimal(0.0d);
        int int80 = bigDecimal79.intValue();
        java.math.BigDecimal bigDecimal82 = new java.math.BigDecimal(0.0d);
        int int83 = bigDecimal82.intValue();
        java.math.BigDecimal bigDecimal84 = bigDecimal79.min(bigDecimal82);
        java.math.BigDecimal bigDecimal85 = bigDecimal77.min(bigDecimal82);
        java.math.BigDecimal bigDecimal87 = bigDecimal85.movePointRight((int) (short) 10);
        org.apache.commons.math.linear.BigMatrix bigMatrix88 = bigMatrixImpl27.scalarAdd(bigDecimal85);
        java.math.BigDecimal bigDecimal90 = bigDecimal85.setScale(5);
        java.math.BigDecimal bigDecimal91 = bigDecimal90.stripTrailingZeros();
        java.math.BigDecimal bigDecimal93 = bigDecimal90.setScale((-100));
        short short94 = bigDecimal90.shortValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal93", (bigDecimal1.compareTo(bigDecimal93) == 0) == bigDecimal1.equals(bigDecimal93));
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        org.apache.commons.math.linear.BigMatrix bigMatrix1 = org.apache.commons.math.linear.MatrixUtils.createBigIdentityMatrix(1);
        org.apache.commons.math.linear.BigMatrix bigMatrix2 = bigMatrix1.inverse();
        org.apache.commons.math.linear.BigMatrix bigMatrix3 = bigMatrix2.copy();
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal7 = new java.math.BigDecimal(0.0d);
        java.lang.String str8 = bigDecimal7.toString();
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal11 = bigDecimal10.stripTrailingZeros();
        int int12 = bigDecimal10.signum();
        java.math.BigDecimal[] bigDecimalArray13 = bigDecimal7.divideAndRemainder(bigDecimal10);
        java.math.BigDecimal bigDecimal15 = bigDecimal7.pow((int) 'a');
        java.math.BigDecimal[] bigDecimalArray16 = new java.math.BigDecimal[] { bigDecimal5, bigDecimal7 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(bigDecimalArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(bigDecimalArray16);
        java.math.BigDecimal[] bigDecimalArray20 = bigMatrix18.getRow(1);
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(bigDecimalArray20);
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = bigMatrix2.preMultiply(bigMatrix21);
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger25 = bigDecimal24.unscaledValue();
        java.math.BigDecimal bigDecimal26 = bigDecimal24.stripTrailingZeros();
        java.math.BigDecimal bigDecimal28 = bigDecimal24.movePointRight((int) (short) -1);
        java.math.BigDecimal bigDecimal29 = bigDecimal24.stripTrailingZeros();
        java.math.BigDecimal bigDecimal30 = bigDecimal24.stripTrailingZeros();
        java.math.BigDecimal bigDecimal32 = bigDecimal24.scaleByPowerOfTen((int) (short) 1);
        org.apache.commons.math.linear.BigMatrix bigMatrix33 = bigMatrix2.scalarMultiply(bigDecimal32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal24 and bigDecimal26", (bigDecimal24.compareTo(bigDecimal26) == 0) == bigDecimal24.equals(bigDecimal26));
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((double) 4);
        double double2 = bigDecimal1.doubleValue();
        java.math.BigInteger bigInteger3 = bigDecimal1.unscaledValue();
        java.math.BigDecimal bigDecimal5 = new java.math.BigDecimal((double) (byte) 0);
        java.math.BigDecimal bigDecimal6 = bigDecimal1.multiply(bigDecimal5);
        java.math.BigDecimal bigDecimal8 = new java.math.BigDecimal(0.0d);
        int int9 = bigDecimal8.intValue();
        java.math.BigDecimal bigDecimal11 = new java.math.BigDecimal(0.0d);
        int int12 = bigDecimal11.intValue();
        java.math.BigDecimal bigDecimal13 = bigDecimal8.min(bigDecimal11);
        java.math.BigDecimal[] bigDecimalArray14 = new java.math.BigDecimal[] { bigDecimal13 };
        java.math.BigDecimal bigDecimal16 = new java.math.BigDecimal(0.0d);
        int int17 = bigDecimal16.intValue();
        java.math.BigDecimal bigDecimal19 = new java.math.BigDecimal(0.0d);
        int int20 = bigDecimal19.intValue();
        java.math.BigDecimal bigDecimal21 = bigDecimal16.min(bigDecimal19);
        java.math.BigDecimal[] bigDecimalArray22 = new java.math.BigDecimal[] { bigDecimal21 };
        java.math.BigDecimal bigDecimal24 = new java.math.BigDecimal(0.0d);
        int int25 = bigDecimal24.intValue();
        java.math.BigDecimal bigDecimal27 = new java.math.BigDecimal(0.0d);
        int int28 = bigDecimal27.intValue();
        java.math.BigDecimal bigDecimal29 = bigDecimal24.min(bigDecimal27);
        java.math.BigDecimal[] bigDecimalArray30 = new java.math.BigDecimal[] { bigDecimal29 };
        java.math.BigDecimal[][] bigDecimalArray31 = new java.math.BigDecimal[][] { bigDecimalArray14, bigDecimalArray22, bigDecimalArray30 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl32 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray31);
        org.apache.commons.math.linear.BigMatrix bigMatrix33 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray31);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray31);
        java.math.BigDecimal[][] bigDecimalArray35 = bigMatrixImpl34.getDataRef();
        java.math.BigDecimal bigDecimal36 = bigMatrixImpl34.getNorm();
        boolean boolean37 = bigMatrixImpl34.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix38 = bigMatrixImpl34.copy();
        double[] doubleArray40 = bigMatrixImpl34.getColumnAsDoubleArray((int) (byte) 0);
        java.math.BigDecimal bigDecimal41 = java.math.BigDecimal.TEN;
        org.apache.commons.math.linear.BigMatrix bigMatrix42 = bigMatrixImpl34.scalarMultiply(bigDecimal41);
        java.math.BigDecimal bigDecimal43 = bigDecimal41.negate();
        java.math.BigInteger bigInteger44 = bigDecimal41.toBigIntegerExact();
        int int45 = bigDecimal41.signum();
        java.math.BigDecimal[] bigDecimalArray46 = bigDecimal1.divideAndRemainder(bigDecimal41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal5 and bigDecimal6", (bigDecimal5.compareTo(bigDecimal6) == 0) == bigDecimal5.equals(bigDecimal6));
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        java.lang.String str2 = bigDecimal1.toString();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal5 = bigDecimal4.stripTrailingZeros();
        int int6 = bigDecimal4.signum();
        java.math.BigDecimal[] bigDecimalArray7 = bigDecimal1.divideAndRemainder(bigDecimal4);
        java.math.BigDecimal bigDecimal8 = bigDecimal1.abs();
        java.math.BigDecimal bigDecimal9 = bigDecimal8.negate();
        java.math.BigDecimal bigDecimal10 = bigDecimal9.ulp();
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.valueOf((double) 1.0f);
        double[] doubleArray17 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix18 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray17);
        double[] doubleArray23 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix24 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray23);
        double[] doubleArray25 = realMatrix18.operate(doubleArray23);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray25);
        java.math.BigDecimal bigDecimal27 = bigMatrix26.getNorm();
        java.math.BigDecimal bigDecimal29 = bigDecimal27.scaleByPowerOfTen(3);
        java.math.BigDecimal bigDecimal31 = bigDecimal27.pow((int) (short) 10);
        int int32 = bigDecimal12.compareTo(bigDecimal27);
        java.math.BigDecimal bigDecimal34 = new java.math.BigDecimal(0.0d);
        int int35 = bigDecimal34.intValue();
        java.math.BigDecimal bigDecimal37 = new java.math.BigDecimal(0.0d);
        int int38 = bigDecimal37.intValue();
        java.math.BigDecimal bigDecimal39 = bigDecimal34.min(bigDecimal37);
        java.math.BigDecimal[] bigDecimalArray40 = new java.math.BigDecimal[] { bigDecimal39 };
        java.math.BigDecimal bigDecimal42 = new java.math.BigDecimal(0.0d);
        int int43 = bigDecimal42.intValue();
        java.math.BigDecimal bigDecimal45 = new java.math.BigDecimal(0.0d);
        int int46 = bigDecimal45.intValue();
        java.math.BigDecimal bigDecimal47 = bigDecimal42.min(bigDecimal45);
        java.math.BigDecimal[] bigDecimalArray48 = new java.math.BigDecimal[] { bigDecimal47 };
        java.math.BigDecimal bigDecimal50 = new java.math.BigDecimal(0.0d);
        int int51 = bigDecimal50.intValue();
        java.math.BigDecimal bigDecimal53 = new java.math.BigDecimal(0.0d);
        int int54 = bigDecimal53.intValue();
        java.math.BigDecimal bigDecimal55 = bigDecimal50.min(bigDecimal53);
        java.math.BigDecimal[] bigDecimalArray56 = new java.math.BigDecimal[] { bigDecimal55 };
        java.math.BigDecimal[][] bigDecimalArray57 = new java.math.BigDecimal[][] { bigDecimalArray40, bigDecimalArray48, bigDecimalArray56 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl58 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray57);
        org.apache.commons.math.linear.BigMatrix bigMatrix59 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray57);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl60 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray57);
        java.math.BigDecimal[][] bigDecimalArray61 = bigMatrixImpl60.getDataRef();
        java.math.BigDecimal bigDecimal62 = bigMatrixImpl60.getNorm();
        boolean boolean63 = bigMatrixImpl60.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix64 = bigMatrixImpl60.copy();
        double[] doubleArray66 = bigMatrixImpl60.getColumnAsDoubleArray((int) (byte) 0);
        java.math.BigDecimal bigDecimal67 = java.math.BigDecimal.TEN;
        org.apache.commons.math.linear.BigMatrix bigMatrix68 = bigMatrixImpl60.scalarMultiply(bigDecimal67);
        java.math.BigDecimal bigDecimal71 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) ' ');
        org.apache.commons.math.linear.BigMatrix bigMatrix72 = bigMatrixImpl60.scalarAdd(bigDecimal71);
        int int73 = bigDecimal71.precision();
        java.math.BigDecimal bigDecimal74 = bigDecimal27.subtract(bigDecimal71);
        int int75 = bigDecimal9.compareTo(bigDecimal74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal10 and bigDecimal12", (bigDecimal10.compareTo(bigDecimal12) == 0) == bigDecimal10.equals(bigDecimal12));
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        double[] doubleArray2 = new double[] { 1.0d, 100.0f };
        double[] doubleArray5 = new double[] { 1.0d, 100.0f };
        double[] doubleArray8 = new double[] { 1.0d, 100.0f };
        double[] doubleArray11 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl14 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        java.math.BigDecimal bigDecimal18 = new java.math.BigDecimal(0.0d);
        int int19 = bigDecimal18.intValue();
        java.math.BigDecimal bigDecimal21 = new java.math.BigDecimal(0.0d);
        int int22 = bigDecimal21.intValue();
        java.math.BigDecimal bigDecimal23 = bigDecimal18.min(bigDecimal21);
        java.math.BigInteger bigInteger24 = bigDecimal18.toBigInteger();
        java.math.BigDecimal bigDecimal25 = new java.math.BigDecimal(bigInteger24);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = bigMatrix16.scalarAdd(bigDecimal25);
        java.math.BigDecimal bigDecimal28 = bigDecimal25.scaleByPowerOfTen(97);
        java.math.BigInteger bigInteger29 = bigDecimal28.toBigIntegerExact();
        java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.valueOf((long) 2, (int) (byte) 10);
        int int33 = bigDecimal32.intValue();
        java.math.BigDecimal[] bigDecimalArray34 = bigDecimal28.divideAndRemainder(bigDecimal32);
        java.math.BigDecimal bigDecimal35 = bigDecimal28.ulp();
        java.math.BigInteger bigInteger36 = bigDecimal35.unscaledValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal18 and bigDecimal28", (bigDecimal18.compareTo(bigDecimal28) == 0) == bigDecimal18.equals(bigDecimal28));
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl0 = new org.apache.commons.math.linear.BigMatrixImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal3 = bigMatrixImpl0.getEntry(44, 10);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal((double) (short) -100);
        java.math.BigDecimal bigDecimal3 = new java.math.BigDecimal(0.0d);
        java.lang.String str4 = bigDecimal3.toString();
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal7 = bigDecimal6.stripTrailingZeros();
        int int8 = bigDecimal6.signum();
        java.math.BigDecimal[] bigDecimalArray9 = bigDecimal3.divideAndRemainder(bigDecimal6);
        java.math.BigDecimal bigDecimal11 = bigDecimal3.pow((int) 'a');
        java.math.BigInteger bigInteger12 = bigDecimal3.toBigIntegerExact();
        int int13 = bigDecimal3.precision();
        java.math.BigDecimal bigDecimal15 = new java.math.BigDecimal(0.0d);
        java.lang.String str16 = bigDecimal15.toString();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal19 = bigDecimal18.stripTrailingZeros();
        int int20 = bigDecimal18.signum();
        java.math.BigDecimal[] bigDecimalArray21 = bigDecimal15.divideAndRemainder(bigDecimal18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray21);
        java.math.BigDecimal bigDecimal23 = bigMatrixImpl22.getNorm();
        java.math.BigDecimal bigDecimal25 = new java.math.BigDecimal(0.0d);
        java.lang.String str26 = bigDecimal25.toString();
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal29 = bigDecimal28.stripTrailingZeros();
        int int30 = bigDecimal28.signum();
        java.math.BigDecimal[] bigDecimalArray31 = bigDecimal25.divideAndRemainder(bigDecimal28);
        java.math.BigDecimal bigDecimal33 = bigDecimal25.pow((int) 'a');
        java.math.BigDecimal bigDecimal35 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal36 = bigDecimal35.stripTrailingZeros();
        float float37 = bigDecimal35.floatValue();
        java.math.BigDecimal bigDecimal38 = bigDecimal33.divideToIntegralValue(bigDecimal35);
        boolean boolean39 = bigMatrixImpl22.equals((java.lang.Object) bigDecimal35);
        java.math.BigDecimal[] bigDecimalArray40 = bigDecimal3.divideAndRemainder(bigDecimal35);
        java.math.BigDecimal bigDecimal41 = bigDecimal1.remainder(bigDecimal35);
        java.math.BigDecimal bigDecimal43 = new java.math.BigDecimal(0.0d);
        int int44 = bigDecimal43.intValue();
        long long45 = bigDecimal43.longValue();
        long long46 = bigDecimal43.longValueExact();
        int int47 = bigDecimal43.precision();
        java.math.BigDecimal bigDecimal49 = new java.math.BigDecimal(0.0d);
        int int50 = bigDecimal49.intValue();
        long long51 = bigDecimal49.longValue();
        long long52 = bigDecimal49.longValueExact();
        java.math.BigDecimal bigDecimal53 = bigDecimal43.add(bigDecimal49);
        java.math.BigDecimal bigDecimal55 = bigDecimal53.setScale((int) (byte) 10);
        java.math.BigDecimal bigDecimal56 = bigDecimal41.min(bigDecimal55);
        java.math.BigDecimal bigDecimal58 = new java.math.BigDecimal(0.0d);
        java.lang.String str59 = bigDecimal58.toString();
        java.math.BigDecimal bigDecimal61 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal62 = bigDecimal61.stripTrailingZeros();
        int int63 = bigDecimal61.signum();
        java.math.BigDecimal[] bigDecimalArray64 = bigDecimal58.divideAndRemainder(bigDecimal61);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl65 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray64);
        int int66 = bigMatrixImpl65.getRoundingMode();
        org.apache.commons.math.linear.BigMatrix bigMatrix67 = bigMatrixImpl65.transpose();
        double[][] doubleArray68 = bigMatrix67.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl69 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray68);
        int int70 = bigMatrixImpl69.getScale();
        int int71 = bigMatrixImpl69.getRoundingMode();
        boolean boolean72 = bigDecimal41.equals((java.lang.Object) int71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal3 and bigDecimal55", (bigDecimal3.compareTo(bigDecimal55) == 0) == bigDecimal3.equals(bigDecimal55));
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf(1L, (int) (byte) 100);
        java.lang.String str3 = bigDecimal2.toString();
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.valueOf((long) 2, (int) (byte) 10);
        int int7 = bigDecimal6.intValue();
        java.math.BigDecimal bigDecimal8 = bigDecimal2.divideToIntegralValue(bigDecimal6);
        java.math.BigDecimal bigDecimal10 = bigDecimal8.pow((int) (short) 31464);
        java.math.BigDecimal bigDecimal11 = bigDecimal10.plus();
        int int12 = bigDecimal10.scale();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal8 and bigDecimal10", (bigDecimal8.compareTo(bigDecimal10) == 0) == bigDecimal8.equals(bigDecimal10));
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.min(bigDecimal4);
        java.math.BigDecimal bigDecimal7 = bigDecimal1.plus();
        java.math.BigInteger bigInteger8 = bigDecimal7.toBigIntegerExact();
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger12 = bigDecimal11.unscaledValue();
        java.math.BigDecimal bigDecimal13 = bigDecimal9.add(bigDecimal11);
        float float14 = bigDecimal11.floatValue();
        java.lang.String str15 = bigDecimal11.toEngineeringString();
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(0.0d);
        int int18 = bigDecimal17.intValue();
        long long19 = bigDecimal17.longValue();
        long long20 = bigDecimal17.longValueExact();
        int int21 = bigDecimal17.precision();
        java.math.BigDecimal bigDecimal23 = new java.math.BigDecimal(0.0d);
        int int24 = bigDecimal23.intValue();
        long long25 = bigDecimal23.longValue();
        long long26 = bigDecimal23.longValueExact();
        java.math.BigDecimal bigDecimal27 = bigDecimal17.add(bigDecimal23);
        java.math.BigDecimal bigDecimal29 = bigDecimal23.pow(3);
        java.math.BigInteger bigInteger30 = bigDecimal29.toBigIntegerExact();
        java.math.BigDecimal bigDecimal31 = bigDecimal29.stripTrailingZeros();
        java.math.BigDecimal bigDecimal32 = bigDecimal11.add(bigDecimal29);
        java.math.BigDecimal bigDecimal34 = new java.math.BigDecimal(0.0d);
        int int35 = bigDecimal34.intValue();
        java.math.BigDecimal bigDecimal37 = new java.math.BigDecimal(0.0d);
        int int38 = bigDecimal37.intValue();
        java.math.BigDecimal bigDecimal39 = bigDecimal34.min(bigDecimal37);
        java.math.BigDecimal[] bigDecimalArray40 = new java.math.BigDecimal[] { bigDecimal39 };
        java.math.BigDecimal bigDecimal42 = new java.math.BigDecimal(0.0d);
        int int43 = bigDecimal42.intValue();
        java.math.BigDecimal bigDecimal45 = new java.math.BigDecimal(0.0d);
        int int46 = bigDecimal45.intValue();
        java.math.BigDecimal bigDecimal47 = bigDecimal42.min(bigDecimal45);
        java.math.BigDecimal[] bigDecimalArray48 = new java.math.BigDecimal[] { bigDecimal47 };
        java.math.BigDecimal bigDecimal50 = new java.math.BigDecimal(0.0d);
        int int51 = bigDecimal50.intValue();
        java.math.BigDecimal bigDecimal53 = new java.math.BigDecimal(0.0d);
        int int54 = bigDecimal53.intValue();
        java.math.BigDecimal bigDecimal55 = bigDecimal50.min(bigDecimal53);
        java.math.BigDecimal[] bigDecimalArray56 = new java.math.BigDecimal[] { bigDecimal55 };
        java.math.BigDecimal[][] bigDecimalArray57 = new java.math.BigDecimal[][] { bigDecimalArray40, bigDecimalArray48, bigDecimalArray56 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl58 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray57);
        org.apache.commons.math.linear.BigMatrix bigMatrix59 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray57);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl60 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray57);
        java.math.BigDecimal[][] bigDecimalArray61 = bigMatrixImpl60.getDataRef();
        java.math.BigDecimal bigDecimal62 = bigMatrixImpl60.getNorm();
        boolean boolean63 = bigMatrixImpl60.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix64 = bigMatrixImpl60.copy();
        double[] doubleArray66 = bigMatrixImpl60.getColumnAsDoubleArray((int) (byte) 0);
        java.math.BigDecimal bigDecimal67 = java.math.BigDecimal.TEN;
        org.apache.commons.math.linear.BigMatrix bigMatrix68 = bigMatrixImpl60.scalarMultiply(bigDecimal67);
        java.math.BigDecimal bigDecimal71 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) ' ');
        org.apache.commons.math.linear.BigMatrix bigMatrix72 = bigMatrixImpl60.scalarAdd(bigDecimal71);
        java.math.BigDecimal bigDecimal74 = bigDecimal71.movePointLeft((int) (short) -100);
        java.math.BigDecimal bigDecimal76 = new java.math.BigDecimal(0.0d);
        int int77 = bigDecimal76.intValue();
        long long78 = bigDecimal76.longValue();
        java.math.BigDecimal bigDecimal79 = bigDecimal71.min(bigDecimal76);
        java.math.BigDecimal bigDecimal80 = bigDecimal29.multiply(bigDecimal76);
        java.math.BigDecimal bigDecimal82 = bigDecimal29.setScale(5);
        java.math.BigDecimal bigDecimal83 = bigDecimal7.min(bigDecimal82);
        java.math.BigDecimal bigDecimal85 = bigDecimal83.movePointLeft((int) (byte) -112);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal83 and bigDecimal82", (bigDecimal83.compareTo(bigDecimal82) == 0) == bigDecimal83.equals(bigDecimal82));
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((double) (byte) -112);
        java.math.BigDecimal bigDecimal3 = bigDecimal1.setScale((int) ' ');
        java.math.BigDecimal bigDecimal5 = bigDecimal3.scaleByPowerOfTen((int) (byte) 97);
        byte byte6 = bigDecimal5.byteValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal3", (bigDecimal1.compareTo(bigDecimal3) == 0) == bigDecimal1.equals(bigDecimal3));
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.min(bigDecimal4);
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal6 };
        java.math.BigDecimal bigDecimal9 = new java.math.BigDecimal(0.0d);
        int int10 = bigDecimal9.intValue();
        java.math.BigDecimal bigDecimal12 = new java.math.BigDecimal(0.0d);
        int int13 = bigDecimal12.intValue();
        java.math.BigDecimal bigDecimal14 = bigDecimal9.min(bigDecimal12);
        java.math.BigDecimal[] bigDecimalArray15 = new java.math.BigDecimal[] { bigDecimal14 };
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(0.0d);
        int int18 = bigDecimal17.intValue();
        java.math.BigDecimal bigDecimal20 = new java.math.BigDecimal(0.0d);
        int int21 = bigDecimal20.intValue();
        java.math.BigDecimal bigDecimal22 = bigDecimal17.min(bigDecimal20);
        java.math.BigDecimal[] bigDecimalArray23 = new java.math.BigDecimal[] { bigDecimal22 };
        java.math.BigDecimal[][] bigDecimalArray24 = new java.math.BigDecimal[][] { bigDecimalArray7, bigDecimalArray15, bigDecimalArray23 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl27 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        java.math.BigDecimal[][] bigDecimalArray28 = bigMatrixImpl27.getDataRef();
        java.math.BigDecimal bigDecimal29 = bigMatrixImpl27.getNorm();
        boolean boolean30 = bigMatrixImpl27.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix31 = bigMatrixImpl27.copy();
        double[] doubleArray33 = bigMatrixImpl27.getColumnAsDoubleArray((int) (byte) 0);
        java.lang.String[] strArray35 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray36 = new java.lang.String[][] { strArray35 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(strArray36);
        org.apache.commons.math.linear.BigMatrix bigMatrix38 = bigMatrixImpl27.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl37);
        java.math.BigDecimal bigDecimal40 = new java.math.BigDecimal(0.0d);
        java.lang.String str41 = bigDecimal40.toString();
        java.math.BigDecimal bigDecimal43 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal44 = bigDecimal43.stripTrailingZeros();
        int int45 = bigDecimal43.signum();
        java.math.BigDecimal[] bigDecimalArray46 = bigDecimal40.divideAndRemainder(bigDecimal43);
        java.math.BigDecimal bigDecimal48 = bigDecimal40.pow((int) 'a');
        java.math.BigDecimal bigDecimal50 = new java.math.BigDecimal(0.0d);
        java.lang.String str51 = bigDecimal50.toString();
        java.math.BigDecimal bigDecimal53 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal54 = bigDecimal53.stripTrailingZeros();
        int int55 = bigDecimal53.signum();
        java.math.BigDecimal[] bigDecimalArray56 = bigDecimal50.divideAndRemainder(bigDecimal53);
        java.math.BigDecimal bigDecimal58 = bigDecimal50.pow((int) 'a');
        java.math.BigInteger bigInteger59 = bigDecimal50.toBigIntegerExact();
        java.math.BigDecimal bigDecimal60 = bigDecimal48.add(bigDecimal50);
        java.math.BigInteger bigInteger61 = bigDecimal60.unscaledValue();
        java.math.BigInteger bigInteger62 = bigDecimal60.toBigIntegerExact();
        boolean boolean63 = bigMatrixImpl27.equals((java.lang.Object) bigInteger62);
        int int64 = bigMatrixImpl27.getRowDimension();
        double[] doubleArray67 = new double[] { 1.0d, 100.0f };
        double[] doubleArray70 = new double[] { 1.0d, 100.0f };
        double[] doubleArray73 = new double[] { 1.0d, 100.0f };
        double[] doubleArray76 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray77 = new double[][] { doubleArray67, doubleArray70, doubleArray73, doubleArray76 };
        org.apache.commons.math.linear.BigMatrix bigMatrix78 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray77);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl79 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray77);
        org.apache.commons.math.linear.BigMatrix bigMatrix80 = bigMatrixImpl79.transpose();
        double[] doubleArray82 = bigMatrixImpl79.getRowAsDoubleArray((int) (short) 0);
        boolean boolean83 = bigMatrixImpl79.isSingular();
        boolean boolean84 = bigMatrixImpl79.isSquare();
        int int85 = bigMatrixImpl79.getScale();
        java.math.BigDecimal bigDecimal86 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal88 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger89 = bigDecimal88.unscaledValue();
        java.math.BigDecimal bigDecimal90 = bigDecimal86.add(bigDecimal88);
        java.math.BigDecimal bigDecimal92 = bigDecimal88.setScale(100);
        boolean boolean93 = bigMatrixImpl79.equals((java.lang.Object) bigDecimal88);
        java.lang.String str94 = bigDecimal88.toPlainString();
        org.apache.commons.math.linear.BigMatrix bigMatrix95 = bigMatrixImpl27.scalarAdd(bigDecimal88);
        double[][] doubleArray96 = bigMatrix95.getDataAsDoubleArray();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal88 and bigDecimal92", (bigDecimal88.compareTo(bigDecimal92) == 0) == bigDecimal88.equals(bigDecimal92));
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(7, 4);
        bigMatrixImpl2.setScale(10);
        java.math.BigDecimal[] bigDecimalArray6 = bigMatrixImpl2.getColumn(1);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = bigMatrixImpl2.transpose();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal8 = bigMatrixImpl2.getNorm();
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        long long3 = bigDecimal1.longValue();
        long long4 = bigDecimal1.longValueExact();
        int int5 = bigDecimal1.precision();
        java.math.BigDecimal bigDecimal7 = new java.math.BigDecimal(0.0d);
        int int8 = bigDecimal7.intValue();
        long long9 = bigDecimal7.longValue();
        long long10 = bigDecimal7.longValueExact();
        java.math.BigDecimal bigDecimal11 = bigDecimal1.add(bigDecimal7);
        java.math.BigDecimal bigDecimal12 = bigDecimal11.stripTrailingZeros();
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.valueOf(1122000.0d);
        java.math.BigDecimal bigDecimal15 = bigDecimal12.multiply(bigDecimal14);
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(0.0d);
        int int18 = bigDecimal17.intValue();
        long long19 = bigDecimal17.longValue();
        long long20 = bigDecimal17.longValueExact();
        int int21 = bigDecimal17.precision();
        java.math.BigDecimal bigDecimal23 = new java.math.BigDecimal(0.0d);
        int int24 = bigDecimal23.intValue();
        long long25 = bigDecimal23.longValue();
        long long26 = bigDecimal23.longValueExact();
        java.math.BigDecimal bigDecimal27 = bigDecimal17.add(bigDecimal23);
        java.math.BigDecimal bigDecimal29 = new java.math.BigDecimal(0.0d);
        java.lang.String str30 = bigDecimal29.toString();
        java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal33 = bigDecimal32.stripTrailingZeros();
        int int34 = bigDecimal32.signum();
        java.math.BigDecimal[] bigDecimalArray35 = bigDecimal29.divideAndRemainder(bigDecimal32);
        java.math.BigDecimal bigDecimal37 = bigDecimal29.pow((int) 'a');
        java.math.BigDecimal bigDecimal39 = new java.math.BigDecimal(0.0d);
        java.lang.String str40 = bigDecimal39.toString();
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal43 = bigDecimal42.stripTrailingZeros();
        int int44 = bigDecimal42.signum();
        java.math.BigDecimal[] bigDecimalArray45 = bigDecimal39.divideAndRemainder(bigDecimal42);
        java.math.BigDecimal bigDecimal47 = bigDecimal39.pow((int) 'a');
        java.math.BigInteger bigInteger48 = bigDecimal39.toBigIntegerExact();
        java.math.BigDecimal bigDecimal49 = bigDecimal37.add(bigDecimal39);
        java.math.BigDecimal bigDecimal50 = bigDecimal23.multiply(bigDecimal37);
        java.math.BigDecimal bigDecimal51 = bigDecimal23.ulp();
        java.math.BigDecimal bigDecimal53 = bigDecimal51.scaleByPowerOfTen((int) '#');
        java.math.BigDecimal bigDecimal54 = bigDecimal51.ulp();
        java.math.BigDecimal bigDecimal56 = bigDecimal54.setScale((int) (byte) 0);
        java.math.BigDecimal bigDecimal59 = bigDecimal12.divide(bigDecimal56, (int) (byte) 11, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal15", (bigDecimal1.compareTo(bigDecimal15) == 0) == bigDecimal1.equals(bigDecimal15));
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        double[] doubleArray2 = new double[] { 1.0d, 100.0f };
        double[] doubleArray5 = new double[] { 1.0d, 100.0f };
        double[] doubleArray8 = new double[] { 1.0d, 100.0f };
        double[] doubleArray11 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl14 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = bigMatrixImpl14.transpose();
        int int16 = bigMatrixImpl14.getColumnDimension();
        java.math.BigDecimal[][] bigDecimalArray17 = bigMatrixImpl14.getDataRef();
        bigMatrixImpl14.setScale((int) (short) 100);
        boolean boolean20 = bigMatrixImpl14.isSingular();
        int int21 = bigMatrixImpl14.getScale();
        java.math.BigDecimal bigDecimal23 = new java.math.BigDecimal((int) (byte) 100);
        java.math.BigDecimal bigDecimal25 = new java.math.BigDecimal(0.0d);
        java.lang.String str26 = bigDecimal25.toString();
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal29 = bigDecimal28.stripTrailingZeros();
        int int30 = bigDecimal28.signum();
        java.math.BigDecimal[] bigDecimalArray31 = bigDecimal25.divideAndRemainder(bigDecimal28);
        java.math.BigDecimal bigDecimal33 = bigDecimal25.pow((int) 'a');
        java.math.BigDecimal bigDecimal35 = new java.math.BigDecimal(0.0d);
        java.lang.String str36 = bigDecimal35.toString();
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal39 = bigDecimal38.stripTrailingZeros();
        int int40 = bigDecimal38.signum();
        java.math.BigDecimal[] bigDecimalArray41 = bigDecimal35.divideAndRemainder(bigDecimal38);
        java.math.BigDecimal bigDecimal43 = bigDecimal35.pow((int) 'a');
        java.math.BigInteger bigInteger44 = bigDecimal35.toBigIntegerExact();
        java.math.BigDecimal bigDecimal45 = bigDecimal33.add(bigDecimal35);
        java.math.BigDecimal bigDecimal47 = new java.math.BigDecimal(0.0d);
        java.lang.String str48 = bigDecimal47.toString();
        java.math.BigDecimal bigDecimal50 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal51 = bigDecimal50.stripTrailingZeros();
        int int52 = bigDecimal50.signum();
        java.math.BigDecimal[] bigDecimalArray53 = bigDecimal47.divideAndRemainder(bigDecimal50);
        java.math.BigDecimal bigDecimal55 = bigDecimal47.pow((int) 'a');
        java.math.BigInteger bigInteger56 = bigDecimal47.toBigIntegerExact();
        float float57 = bigDecimal47.floatValue();
        java.math.BigDecimal bigDecimal58 = bigDecimal33.add(bigDecimal47);
        java.math.BigDecimal bigDecimal60 = new java.math.BigDecimal((int) (byte) 100);
        java.math.BigDecimal bigDecimal61 = bigDecimal47.divideToIntegralValue(bigDecimal60);
        java.math.BigDecimal bigDecimal62 = bigDecimal23.divideToIntegralValue(bigDecimal60);
        boolean boolean63 = bigMatrixImpl14.equals((java.lang.Object) bigDecimal62);
        double[] doubleArray66 = new double[] { 1.0d, 100.0f };
        double[] doubleArray69 = new double[] { 1.0d, 100.0f };
        double[] doubleArray72 = new double[] { 1.0d, 100.0f };
        double[] doubleArray75 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray76 = new double[][] { doubleArray66, doubleArray69, doubleArray72, doubleArray75 };
        org.apache.commons.math.linear.BigMatrix bigMatrix77 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray76);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl78 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray76);
        org.apache.commons.math.linear.BigMatrix bigMatrix79 = bigMatrixImpl78.transpose();
        int int80 = bigMatrixImpl78.getColumnDimension();
        java.math.BigDecimal bigDecimal81 = bigMatrixImpl78.getNorm();
        int int82 = bigMatrixImpl78.getScale();
        boolean boolean83 = bigMatrixImpl78.isSingular();
        int int84 = bigMatrixImpl78.getRoundingMode();
        org.apache.commons.math.linear.BigMatrix bigMatrix85 = bigMatrixImpl78.copy();
        java.math.BigDecimal bigDecimal87 = new java.math.BigDecimal((long) 0);
        java.math.BigDecimal bigDecimal89 = bigDecimal87.pow(4);
        org.apache.commons.math.linear.BigMatrix bigMatrix90 = bigMatrixImpl78.scalarMultiply(bigDecimal89);
        java.math.BigDecimal bigDecimal92 = bigDecimal89.movePointLeft(32);
        org.apache.commons.math.linear.BigMatrix bigMatrix93 = bigMatrixImpl14.scalarMultiply(bigDecimal89);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal25 and bigDecimal92", (bigDecimal25.compareTo(bigDecimal92) == 0) == bigDecimal25.equals(bigDecimal92));
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        long long3 = bigDecimal1.longValue();
        long long4 = bigDecimal1.longValueExact();
        int int5 = bigDecimal1.precision();
        java.math.BigDecimal bigDecimal7 = new java.math.BigDecimal(0.0d);
        java.lang.String str8 = bigDecimal7.toString();
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal11 = bigDecimal10.stripTrailingZeros();
        int int12 = bigDecimal10.signum();
        java.math.BigDecimal[] bigDecimalArray13 = bigDecimal7.divideAndRemainder(bigDecimal10);
        java.math.BigDecimal bigDecimal14 = bigDecimal1.min(bigDecimal7);
        java.math.BigDecimal bigDecimal16 = new java.math.BigDecimal("97");
        java.math.BigDecimal bigDecimal19 = bigDecimal1.divide(bigDecimal16, (int) (byte) -54, 0);
        byte byte20 = bigDecimal16.byteValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal19", (bigDecimal1.compareTo(bigDecimal19) == 0) == bigDecimal1.equals(bigDecimal19));
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.min(bigDecimal4);
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal6 };
        java.math.BigDecimal bigDecimal9 = new java.math.BigDecimal(0.0d);
        int int10 = bigDecimal9.intValue();
        java.math.BigDecimal bigDecimal12 = new java.math.BigDecimal(0.0d);
        int int13 = bigDecimal12.intValue();
        java.math.BigDecimal bigDecimal14 = bigDecimal9.min(bigDecimal12);
        java.math.BigDecimal[] bigDecimalArray15 = new java.math.BigDecimal[] { bigDecimal14 };
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(0.0d);
        int int18 = bigDecimal17.intValue();
        java.math.BigDecimal bigDecimal20 = new java.math.BigDecimal(0.0d);
        int int21 = bigDecimal20.intValue();
        java.math.BigDecimal bigDecimal22 = bigDecimal17.min(bigDecimal20);
        java.math.BigDecimal[] bigDecimalArray23 = new java.math.BigDecimal[] { bigDecimal22 };
        java.math.BigDecimal[][] bigDecimalArray24 = new java.math.BigDecimal[][] { bigDecimalArray7, bigDecimalArray15, bigDecimalArray23 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl27 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        java.math.BigDecimal[][] bigDecimalArray28 = bigMatrixImpl27.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl29 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray28);
        java.math.BigDecimal bigDecimal30 = bigMatrixImpl29.getNorm();
        java.math.BigInteger bigInteger31 = bigDecimal30.unscaledValue();
        java.lang.String str32 = bigDecimal30.toString();
        java.lang.String str33 = bigDecimal30.toPlainString();
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.valueOf((long) 64, (int) (short) 35);
        java.math.BigDecimal bigDecimal37 = bigDecimal30.divideToIntegralValue(bigDecimal36);
        int int38 = bigDecimal36.signum();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal37", (bigDecimal1.compareTo(bigDecimal37) == 0) == bigDecimal1.equals(bigDecimal37));
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.min(bigDecimal4);
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal6 };
        java.math.BigDecimal bigDecimal9 = new java.math.BigDecimal(0.0d);
        int int10 = bigDecimal9.intValue();
        java.math.BigDecimal bigDecimal12 = new java.math.BigDecimal(0.0d);
        int int13 = bigDecimal12.intValue();
        java.math.BigDecimal bigDecimal14 = bigDecimal9.min(bigDecimal12);
        java.math.BigDecimal[] bigDecimalArray15 = new java.math.BigDecimal[] { bigDecimal14 };
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(0.0d);
        int int18 = bigDecimal17.intValue();
        java.math.BigDecimal bigDecimal20 = new java.math.BigDecimal(0.0d);
        int int21 = bigDecimal20.intValue();
        java.math.BigDecimal bigDecimal22 = bigDecimal17.min(bigDecimal20);
        java.math.BigDecimal[] bigDecimalArray23 = new java.math.BigDecimal[] { bigDecimal22 };
        java.math.BigDecimal[][] bigDecimalArray24 = new java.math.BigDecimal[][] { bigDecimalArray7, bigDecimalArray15, bigDecimalArray23 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray24);
        java.math.BigDecimal bigDecimal28 = new java.math.BigDecimal(0.0d);
        int int29 = bigDecimal28.intValue();
        java.math.BigDecimal bigDecimal31 = new java.math.BigDecimal(0.0d);
        int int32 = bigDecimal31.intValue();
        java.math.BigDecimal bigDecimal33 = bigDecimal28.min(bigDecimal31);
        java.math.BigInteger bigInteger34 = bigDecimal28.toBigInteger();
        java.math.BigDecimal bigDecimal35 = new java.math.BigDecimal(bigInteger34);
        java.math.BigDecimal bigDecimal37 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal38 = bigDecimal37.stripTrailingZeros();
        float float39 = bigDecimal37.floatValue();
        java.math.BigDecimal bigDecimal40 = bigDecimal35.multiply(bigDecimal37);
        org.apache.commons.math.linear.BigMatrix bigMatrix41 = bigMatrix26.scalarAdd(bigDecimal40);
        int int42 = bigDecimal40.intValue();
        java.math.BigDecimal bigDecimal43 = bigDecimal40.stripTrailingZeros();
        java.math.BigDecimal bigDecimal45 = new java.math.BigDecimal(0.0d);
        int int46 = bigDecimal45.intValue();
        long long47 = bigDecimal45.longValue();
        long long48 = bigDecimal45.longValueExact();
        int int49 = bigDecimal45.precision();
        java.math.BigDecimal bigDecimal51 = new java.math.BigDecimal(0.0d);
        int int52 = bigDecimal51.intValue();
        long long53 = bigDecimal51.longValue();
        long long54 = bigDecimal51.longValueExact();
        java.math.BigDecimal bigDecimal55 = bigDecimal45.add(bigDecimal51);
        java.math.BigDecimal bigDecimal57 = new java.math.BigDecimal(0.0d);
        int int58 = bigDecimal57.intValue();
        java.math.BigDecimal bigDecimal60 = new java.math.BigDecimal(0.0d);
        int int61 = bigDecimal60.intValue();
        java.math.BigDecimal bigDecimal62 = bigDecimal57.min(bigDecimal60);
        java.math.BigDecimal bigDecimal63 = bigDecimal55.min(bigDecimal60);
        java.math.BigDecimal bigDecimal65 = new java.math.BigDecimal(0.0d);
        java.lang.String str66 = bigDecimal65.toString();
        java.math.BigDecimal bigDecimal68 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal69 = bigDecimal68.stripTrailingZeros();
        int int70 = bigDecimal68.signum();
        java.math.BigDecimal[] bigDecimalArray71 = bigDecimal65.divideAndRemainder(bigDecimal68);
        java.math.BigDecimal bigDecimal73 = bigDecimal65.pow((int) 'a');
        java.math.BigDecimal bigDecimal75 = new java.math.BigDecimal(0.0d);
        java.lang.String str76 = bigDecimal75.toString();
        java.math.BigDecimal bigDecimal78 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal79 = bigDecimal78.stripTrailingZeros();
        int int80 = bigDecimal78.signum();
        java.math.BigDecimal[] bigDecimalArray81 = bigDecimal75.divideAndRemainder(bigDecimal78);
        java.math.BigDecimal bigDecimal83 = bigDecimal75.pow((int) 'a');
        java.math.BigInteger bigInteger84 = bigDecimal75.toBigIntegerExact();
        java.math.BigDecimal bigDecimal85 = bigDecimal73.add(bigDecimal75);
        java.math.BigDecimal bigDecimal87 = bigDecimal85.pow((int) (byte) 97);
        int int88 = bigDecimal85.scale();
        int int89 = bigDecimal85.intValue();
        java.math.BigDecimal bigDecimal90 = bigDecimal63.max(bigDecimal85);
        java.math.BigDecimal bigDecimal91 = bigDecimal43.add(bigDecimal90);
        java.math.BigInteger bigInteger92 = bigDecimal91.unscaledValue();
        java.math.BigDecimal bigDecimal94 = new java.math.BigDecimal(bigInteger92, (-35));
        java.math.BigDecimal bigDecimal95 = bigDecimal94.negate();
        java.math.BigDecimal bigDecimal97 = bigDecimal95.scaleByPowerOfTen((int) (byte) -11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal94", (bigDecimal1.compareTo(bigDecimal94) == 0) == bigDecimal1.equals(bigDecimal94));
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf(100L);
        java.math.BigDecimal bigDecimal3 = java.math.BigDecimal.valueOf((double) 0L);
        java.math.BigDecimal bigDecimal4 = bigDecimal1.max(bigDecimal3);
        int int5 = bigDecimal3.intValueExact();
        java.lang.String[] strArray7 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray8 = new java.lang.String[][] { strArray7 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl9 = new org.apache.commons.math.linear.BigMatrixImpl(strArray8);
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray8);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl11 = new org.apache.commons.math.linear.BigMatrixImpl(strArray8);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl12 = new org.apache.commons.math.linear.BigMatrixImpl(strArray8);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(strArray8);
        java.math.BigDecimal bigDecimal15 = new java.math.BigDecimal(0.0d);
        int int16 = bigDecimal15.intValue();
        java.math.BigDecimal bigDecimal18 = new java.math.BigDecimal(0.0d);
        int int19 = bigDecimal18.intValue();
        java.math.BigDecimal bigDecimal20 = bigDecimal15.min(bigDecimal18);
        java.math.BigInteger bigInteger21 = bigDecimal15.toBigInteger();
        int int22 = bigDecimal15.precision();
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigDecimal bigDecimal25 = bigDecimal15.subtract(bigDecimal24);
        java.math.BigDecimal bigDecimal26 = bigDecimal24.ulp();
        org.apache.commons.math.linear.BigMatrix bigMatrix27 = bigMatrixImpl13.scalarAdd(bigDecimal24);
        java.math.BigDecimal[] bigDecimalArray28 = bigDecimal3.divideAndRemainder(bigDecimal24);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl29 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal3 and bigDecimal15", (bigDecimal3.compareTo(bigDecimal15) == 0) == bigDecimal3.equals(bigDecimal15));
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(5, 110);
        org.apache.commons.math.linear.BigMatrix bigMatrix3 = bigMatrixImpl2.copy();
        int int4 = bigMatrixImpl2.getRoundingMode();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrix3 and bigMatrix3", bigMatrix3.equals(bigMatrix3) ? bigMatrix3.hashCode() == bigMatrix3.hashCode() : true);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf(98.0d);
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf(0L, (int) ' ');
        int int5 = bigDecimal4.scale();
        int int6 = bigDecimal4.intValueExact();
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.valueOf(0L, (int) (short) 1);
        java.math.BigDecimal bigDecimal10 = bigDecimal4.add(bigDecimal9);
        java.math.BigDecimal bigDecimal11 = bigDecimal1.multiply(bigDecimal4);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal9 and bigDecimal10", (bigDecimal9.compareTo(bigDecimal10) == 0) == bigDecimal9.equals(bigDecimal10));
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.min(bigDecimal4);
        java.math.BigInteger bigInteger7 = bigDecimal1.toBigInteger();
        java.math.BigDecimal bigDecimal9 = bigDecimal1.movePointRight((int) '#');
        java.math.BigDecimal bigDecimal11 = bigDecimal1.movePointLeft((int) (short) 97);
        java.math.BigDecimal bigDecimal13 = new java.math.BigDecimal((double) 5);
        java.math.BigDecimal bigDecimal14 = bigDecimal11.multiply(bigDecimal13);
        int int15 = bigDecimal11.intValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal14", (bigDecimal1.compareTo(bigDecimal14) == 0) == bigDecimal1.equals(bigDecimal14));
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        long long3 = bigDecimal1.longValue();
        long long4 = bigDecimal1.longValueExact();
        int int5 = bigDecimal1.precision();
        java.math.BigDecimal bigDecimal7 = new java.math.BigDecimal(0.0d);
        int int8 = bigDecimal7.intValue();
        long long9 = bigDecimal7.longValue();
        long long10 = bigDecimal7.longValueExact();
        java.math.BigDecimal bigDecimal11 = bigDecimal1.add(bigDecimal7);
        java.math.BigDecimal bigDecimal13 = bigDecimal7.pow(3);
        java.math.BigInteger bigInteger14 = bigDecimal13.toBigIntegerExact();
        int int15 = bigDecimal13.scale();
        int int16 = bigDecimal13.precision();
        java.lang.String str17 = bigDecimal13.toString();
        java.math.BigDecimal bigDecimal19 = bigDecimal13.movePointRight((int) (byte) -112);
        java.math.BigDecimal bigDecimal21 = bigDecimal13.movePointRight((int) ' ');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal19", (bigDecimal1.compareTo(bigDecimal19) == 0) == bigDecimal1.equals(bigDecimal19));
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.min(bigDecimal4);
        java.math.BigInteger bigInteger7 = bigDecimal1.toBigInteger();
        java.math.BigDecimal bigDecimal8 = new java.math.BigDecimal(bigInteger7);
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal11 = bigDecimal10.stripTrailingZeros();
        float float12 = bigDecimal10.floatValue();
        java.math.BigDecimal bigDecimal13 = bigDecimal8.multiply(bigDecimal10);
        int int14 = bigDecimal8.signum();
        float float15 = bigDecimal8.floatValue();
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(0.0d);
        int int18 = bigDecimal17.intValue();
        long long19 = bigDecimal17.longValue();
        long long20 = bigDecimal17.longValueExact();
        int int21 = bigDecimal17.precision();
        java.math.BigDecimal bigDecimal23 = new java.math.BigDecimal(0.0d);
        int int24 = bigDecimal23.intValue();
        long long25 = bigDecimal23.longValue();
        long long26 = bigDecimal23.longValueExact();
        java.math.BigDecimal bigDecimal27 = bigDecimal17.add(bigDecimal23);
        java.math.BigDecimal bigDecimal29 = new java.math.BigDecimal(0.0d);
        int int30 = bigDecimal29.intValue();
        java.math.BigDecimal bigDecimal32 = new java.math.BigDecimal(0.0d);
        int int33 = bigDecimal32.intValue();
        java.math.BigDecimal bigDecimal34 = bigDecimal29.min(bigDecimal32);
        java.math.BigDecimal bigDecimal35 = bigDecimal27.min(bigDecimal32);
        java.math.BigDecimal bigDecimal37 = bigDecimal35.movePointRight((int) (short) 10);
        int int38 = bigDecimal37.intValueExact();
        java.math.BigDecimal bigDecimal39 = bigDecimal37.plus();
        byte byte40 = bigDecimal39.byteValueExact();
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger43 = bigDecimal42.unscaledValue();
        java.math.BigDecimal bigDecimal44 = bigDecimal42.stripTrailingZeros();
        java.math.BigDecimal bigDecimal45 = bigDecimal39.max(bigDecimal42);
        java.math.BigDecimal bigDecimal46 = bigDecimal8.max(bigDecimal42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal44 and bigDecimal46", (bigDecimal44.compareTo(bigDecimal46) == 0) == bigDecimal44.equals(bigDecimal46));
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        java.lang.String[] strArray1 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl3 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        java.math.BigDecimal[][] bigDecimalArray4 = bigMatrixImpl3.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl5 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray4);
        java.math.BigDecimal bigDecimal6 = bigMatrixImpl5.getTrace();
        java.math.BigDecimal bigDecimal8 = new java.math.BigDecimal(0.0d);
        java.lang.String str9 = bigDecimal8.toString();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal12 = bigDecimal11.stripTrailingZeros();
        int int13 = bigDecimal11.signum();
        java.math.BigDecimal[] bigDecimalArray14 = bigDecimal8.divideAndRemainder(bigDecimal11);
        java.math.BigDecimal bigDecimal16 = bigDecimal8.pow((int) 'a');
        java.math.BigDecimal bigDecimal18 = new java.math.BigDecimal(0.0d);
        java.lang.String str19 = bigDecimal18.toString();
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal22 = bigDecimal21.stripTrailingZeros();
        int int23 = bigDecimal21.signum();
        java.math.BigDecimal[] bigDecimalArray24 = bigDecimal18.divideAndRemainder(bigDecimal21);
        java.math.BigDecimal bigDecimal26 = bigDecimal18.pow((int) 'a');
        java.math.BigInteger bigInteger27 = bigDecimal18.toBigIntegerExact();
        java.math.BigDecimal bigDecimal28 = bigDecimal16.add(bigDecimal18);
        java.math.BigDecimal bigDecimal30 = new java.math.BigDecimal(0.0d);
        java.lang.String str31 = bigDecimal30.toString();
        java.math.BigDecimal bigDecimal33 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal34 = bigDecimal33.stripTrailingZeros();
        int int35 = bigDecimal33.signum();
        java.math.BigDecimal[] bigDecimalArray36 = bigDecimal30.divideAndRemainder(bigDecimal33);
        java.math.BigDecimal bigDecimal38 = bigDecimal30.pow((int) 'a');
        java.math.BigInteger bigInteger39 = bigDecimal30.toBigIntegerExact();
        float float40 = bigDecimal30.floatValue();
        java.math.BigDecimal bigDecimal41 = bigDecimal16.add(bigDecimal30);
        java.math.BigInteger bigInteger42 = bigDecimal30.toBigInteger();
        int int43 = bigDecimal30.signum();
        java.math.BigDecimal bigDecimal44 = bigDecimal30.stripTrailingZeros();
        org.apache.commons.math.linear.BigMatrix bigMatrix45 = bigMatrixImpl5.scalarMultiply(bigDecimal44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal6 and bigDecimal8", (bigDecimal6.compareTo(bigDecimal8) == 0) == bigDecimal6.equals(bigDecimal8));
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal3 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal[] bigDecimalArray4 = bigDecimal1.divideAndRemainder(bigDecimal3);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl5 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = bigMatrixImpl5.copy();
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = bigMatrixImpl5.copy();
        bigMatrixImpl5.setRoundingMode(10);
        java.lang.String[] strArray11 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray12 = new java.lang.String[][] { strArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(strArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl14 = new org.apache.commons.math.linear.BigMatrixImpl(strArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(strArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(strArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = bigMatrixImpl5.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl16);
        java.math.BigDecimal bigDecimal18 = bigMatrixImpl16.getTrace();
        double[] doubleArray23 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix24 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray23);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray23);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrix25.scalarAdd((double) 6);
        int int28 = realMatrix25.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrix25.scalarAdd(10.0d);
        double[] doubleArray35 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix36 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray35);
        double double37 = realMatrix36.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrix36.scalarAdd((double) '4');
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrix30.preMultiply(realMatrix39);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrix40.scalarAdd((double) 1.0f);
        boolean boolean43 = bigMatrixImpl16.equals((java.lang.Object) realMatrix40);
        java.math.BigDecimal bigDecimal44 = bigMatrixImpl16.getNorm();
        java.math.BigDecimal bigDecimal45 = bigMatrixImpl16.getTrace();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal45 and bigDecimal44", (bigDecimal45.compareTo(bigDecimal44) == 0) == bigDecimal45.equals(bigDecimal44));
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.min(bigDecimal4);
        java.math.BigInteger bigInteger7 = bigDecimal1.toBigInteger();
        long long8 = bigDecimal1.longValueExact();
        java.math.BigDecimal bigDecimal10 = new java.math.BigDecimal(0.0d);
        int int11 = bigDecimal10.intValue();
        java.math.BigDecimal bigDecimal13 = new java.math.BigDecimal(0.0d);
        int int14 = bigDecimal13.intValue();
        java.math.BigDecimal bigDecimal15 = bigDecimal10.min(bigDecimal13);
        java.math.BigInteger bigInteger16 = bigDecimal10.toBigInteger();
        java.math.BigDecimal bigDecimal18 = bigDecimal10.movePointRight((int) '#');
        java.lang.String str19 = bigDecimal18.toEngineeringString();
        java.math.BigDecimal bigDecimal20 = bigDecimal1.subtract(bigDecimal18);
        java.math.BigDecimal bigDecimal22 = bigDecimal1.setScale(8668);
        short short23 = bigDecimal1.shortValueExact();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal4 and bigDecimal22", (bigDecimal4.compareTo(bigDecimal22) == 0) == bigDecimal4.equals(bigDecimal22));
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf((long) 2881, (-1));
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal10 = bigDecimal7.setScale((int) (short) 100, (int) (byte) 1);
        java.math.BigDecimal bigDecimal11 = bigDecimal4.divide(bigDecimal7);
        int int12 = bigDecimal2.compareTo(bigDecimal11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal7 and bigDecimal10", (bigDecimal7.compareTo(bigDecimal10) == 0) == bigDecimal7.equals(bigDecimal10));
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        double[] doubleArray2 = new double[] { 1.0d, 100.0f };
        double[] doubleArray5 = new double[] { 1.0d, 100.0f };
        double[] doubleArray8 = new double[] { 1.0d, 100.0f };
        double[] doubleArray11 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl14 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = bigMatrixImpl14.transpose();
        double[] doubleArray17 = bigMatrixImpl14.getRowAsDoubleArray((int) (short) 0);
        boolean boolean18 = bigMatrixImpl14.isSingular();
        java.math.BigDecimal[][] bigDecimalArray19 = bigMatrixImpl14.getData();
        int int20 = bigMatrixImpl14.getRoundingMode();
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal24 = new java.math.BigDecimal(0.0d);
        java.lang.String str25 = bigDecimal24.toString();
        java.math.BigDecimal bigDecimal27 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal28 = bigDecimal27.stripTrailingZeros();
        int int29 = bigDecimal27.signum();
        java.math.BigDecimal[] bigDecimalArray30 = bigDecimal24.divideAndRemainder(bigDecimal27);
        java.math.BigDecimal bigDecimal32 = bigDecimal24.pow((int) 'a');
        java.math.BigDecimal[] bigDecimalArray33 = new java.math.BigDecimal[] { bigDecimal22, bigDecimal24 };
        org.apache.commons.math.linear.BigMatrix bigMatrix34 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(bigDecimalArray33);
        org.apache.commons.math.linear.BigMatrix bigMatrix36 = bigMatrix34.getColumnMatrix(0);
        org.apache.commons.math.linear.BigMatrix bigMatrix37 = bigMatrixImpl14.multiply(bigMatrix34);
        java.math.BigDecimal bigDecimal39 = new java.math.BigDecimal("10");
        int int40 = bigDecimal39.signum();
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal44 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal[] bigDecimalArray45 = bigDecimal42.divideAndRemainder(bigDecimal44);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl46 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray45);
        double[] doubleArray48 = bigMatrixImpl46.getRowAsDoubleArray(0);
        java.math.BigDecimal bigDecimal50 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger51 = bigDecimal50.unscaledValue();
        java.math.BigDecimal bigDecimal52 = bigDecimal50.stripTrailingZeros();
        java.math.BigDecimal bigDecimal54 = new java.math.BigDecimal(0.0d);
        int int55 = bigDecimal54.intValue();
        long long56 = bigDecimal54.longValue();
        long long57 = bigDecimal54.longValueExact();
        short short58 = bigDecimal54.shortValueExact();
        java.math.BigDecimal bigDecimal59 = bigDecimal50.min(bigDecimal54);
        org.apache.commons.math.linear.BigMatrix bigMatrix60 = bigMatrixImpl46.scalarMultiply(bigDecimal50);
        java.math.BigDecimal bigDecimal61 = bigDecimal39.divideToIntegralValue(bigDecimal50);
        org.apache.commons.math.linear.BigMatrix bigMatrix62 = bigMatrix37.scalarAdd(bigDecimal39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal50 and bigDecimal52", (bigDecimal50.compareTo(bigDecimal52) == 0) == bigDecimal50.equals(bigDecimal52));
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        double[] doubleArray2 = new double[] { 1.0d, 100.0f };
        double[] doubleArray5 = new double[] { 1.0d, 100.0f };
        double[] doubleArray8 = new double[] { 1.0d, 100.0f };
        double[] doubleArray11 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl14 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = bigMatrixImpl14.transpose();
        double[] doubleArray17 = bigMatrixImpl14.getRowAsDoubleArray((int) (short) 0);
        boolean boolean18 = bigMatrixImpl14.isSingular();
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = bigMatrixImpl14.copy();
        int int20 = bigMatrixImpl14.getScale();
        int int21 = bigMatrixImpl14.getColumnDimension();
        java.math.BigDecimal bigDecimal23 = new java.math.BigDecimal(0.0d);
        java.lang.String str24 = bigDecimal23.toString();
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal27 = bigDecimal26.stripTrailingZeros();
        int int28 = bigDecimal26.signum();
        java.math.BigDecimal[] bigDecimalArray29 = bigDecimal23.divideAndRemainder(bigDecimal26);
        java.math.BigDecimal bigDecimal31 = bigDecimal23.pow((int) 'a');
        java.math.BigInteger bigInteger32 = bigDecimal23.toBigInteger();
        java.math.BigDecimal bigDecimal34 = new java.math.BigDecimal(bigInteger32, 3);
        java.lang.String[] strArray36 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray37 = new java.lang.String[][] { strArray36 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl38 = new org.apache.commons.math.linear.BigMatrixImpl(strArray37);
        int int39 = bigMatrixImpl38.getColumnDimension();
        boolean boolean40 = bigDecimal34.equals((java.lang.Object) int39);
        org.apache.commons.math.linear.BigMatrix bigMatrix41 = bigMatrixImpl14.scalarMultiply(bigDecimal34);
        java.math.BigDecimal bigDecimal43 = bigDecimal34.movePointLeft((-3));
        byte byte44 = bigDecimal43.byteValueExact();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal23 and bigDecimal34", (bigDecimal23.compareTo(bigDecimal34) == 0) == bigDecimal23.equals(bigDecimal34));
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal((int) (byte) 97);
        java.math.BigDecimal bigDecimal3 = bigDecimal1.setScale(5);
        double[] doubleArray6 = new double[] { 1.0d, 100.0f };
        double[] doubleArray9 = new double[] { 1.0d, 100.0f };
        double[] doubleArray12 = new double[] { 1.0d, 100.0f };
        double[] doubleArray15 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray16 = new double[][] { doubleArray6, doubleArray9, doubleArray12, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = bigMatrixImpl18.transpose();
        double[] doubleArray21 = bigMatrixImpl18.getRowAsDoubleArray((int) (short) 0);
        boolean boolean22 = bigMatrixImpl18.isSingular();
        java.math.BigDecimal[][] bigDecimalArray23 = bigMatrixImpl18.getData();
        java.math.BigDecimal bigDecimal24 = bigMatrixImpl18.getNorm();
        java.math.BigDecimal bigDecimal25 = bigMatrixImpl18.getNorm();
        double[] doubleArray28 = new double[] { 1.0d, 100.0f };
        double[] doubleArray31 = new double[] { 1.0d, 100.0f };
        double[] doubleArray34 = new double[] { 1.0d, 100.0f };
        double[] doubleArray37 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray38 = new double[][] { doubleArray28, doubleArray31, doubleArray34, doubleArray37 };
        org.apache.commons.math.linear.BigMatrix bigMatrix39 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray38);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl40 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray38);
        org.apache.commons.math.linear.BigMatrix bigMatrix41 = bigMatrixImpl40.transpose();
        boolean boolean42 = bigMatrixImpl40.isSingular();
        double[] doubleArray44 = bigMatrixImpl40.getColumnAsDoubleArray(0);
        int int45 = bigMatrixImpl40.getRoundingMode();
        boolean boolean46 = bigMatrixImpl40.isSingular();
        org.apache.commons.math.linear.BigMatrix bigMatrix47 = bigMatrixImpl18.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl40);
        org.apache.commons.math.linear.BigMatrix bigMatrix48 = bigMatrixImpl40.transpose();
        java.math.BigDecimal[][] bigDecimalArray49 = bigMatrixImpl40.getData();
        double[] doubleArray52 = new double[] { 1.0d, 100.0f };
        double[] doubleArray55 = new double[] { 1.0d, 100.0f };
        double[] doubleArray58 = new double[] { 1.0d, 100.0f };
        double[] doubleArray61 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray62 = new double[][] { doubleArray52, doubleArray55, doubleArray58, doubleArray61 };
        org.apache.commons.math.linear.BigMatrix bigMatrix63 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray62);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl64 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray62);
        org.apache.commons.math.linear.BigMatrix bigMatrix65 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray62);
        org.apache.commons.math.linear.BigMatrix bigMatrix66 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray62);
        java.math.BigDecimal bigDecimal68 = new java.math.BigDecimal(0.0d);
        int int69 = bigDecimal68.intValue();
        java.math.BigDecimal bigDecimal71 = new java.math.BigDecimal(0.0d);
        int int72 = bigDecimal71.intValue();
        java.math.BigDecimal bigDecimal73 = bigDecimal68.min(bigDecimal71);
        java.math.BigInteger bigInteger74 = bigDecimal68.toBigInteger();
        java.math.BigDecimal bigDecimal75 = new java.math.BigDecimal(bigInteger74);
        org.apache.commons.math.linear.BigMatrix bigMatrix76 = bigMatrix66.scalarAdd(bigDecimal75);
        java.math.BigDecimal bigDecimal78 = new java.math.BigDecimal(0.0d);
        int int79 = bigDecimal78.intValue();
        java.math.BigDecimal bigDecimal81 = new java.math.BigDecimal(0.0d);
        int int82 = bigDecimal81.intValue();
        java.math.BigDecimal bigDecimal83 = bigDecimal78.min(bigDecimal81);
        java.math.BigInteger bigInteger84 = bigDecimal78.toBigInteger();
        java.math.BigDecimal bigDecimal86 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigDecimal bigDecimal87 = bigDecimal86.negate();
        java.math.BigDecimal bigDecimal88 = bigDecimal78.add(bigDecimal86);
        java.math.BigDecimal bigDecimal89 = bigDecimal75.divideToIntegralValue(bigDecimal88);
        org.apache.commons.math.linear.BigMatrix bigMatrix90 = bigMatrixImpl40.scalarMultiply(bigDecimal88);
        java.math.BigInteger bigInteger91 = bigDecimal88.unscaledValue();
        java.math.BigDecimal bigDecimal92 = bigDecimal3.subtract(bigDecimal88);
        java.lang.Object obj93 = null;
        boolean boolean94 = bigDecimal88.equals(obj93);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal3", (bigDecimal1.compareTo(bigDecimal3) == 0) == bigDecimal1.equals(bigDecimal3));
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((double) (byte) -112);
        java.math.BigDecimal bigDecimal3 = bigDecimal1.setScale((int) ' ');
        java.math.BigDecimal bigDecimal5 = bigDecimal3.scaleByPowerOfTen((int) (byte) 97);
        java.math.BigDecimal bigDecimal7 = bigDecimal3.movePointLeft(7);
        java.math.BigDecimal bigDecimal8 = bigDecimal7.ulp();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal3", (bigDecimal1.compareTo(bigDecimal3) == 0) == bigDecimal1.equals(bigDecimal3));
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        java.lang.String str2 = bigDecimal1.toString();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal5 = bigDecimal4.stripTrailingZeros();
        int int6 = bigDecimal4.signum();
        java.math.BigDecimal[] bigDecimalArray7 = bigDecimal1.divideAndRemainder(bigDecimal4);
        java.math.BigDecimal bigDecimal9 = bigDecimal1.pow((int) 'a');
        java.math.BigInteger bigInteger10 = bigDecimal1.toBigInteger();
        java.math.BigDecimal bigDecimal12 = new java.math.BigDecimal(bigInteger10, 3);
        java.math.BigDecimal bigDecimal14 = bigDecimal12.setScale((int) (short) 1);
        java.lang.String[] strArray16 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray17 = new java.lang.String[][] { strArray16 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(strArray17);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(strArray17);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(strArray17);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(strArray17);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl22 = new org.apache.commons.math.linear.BigMatrixImpl(strArray17);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl23 = new org.apache.commons.math.linear.BigMatrixImpl(strArray17);
        org.apache.commons.math.linear.BigMatrix bigMatrix24 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray17);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(strArray17);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = bigMatrixImpl25.transpose();
        boolean boolean27 = bigDecimal12.equals((java.lang.Object) bigMatrix26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal14", (bigDecimal1.compareTo(bigDecimal14) == 0) == bigDecimal1.equals(bigDecimal14));
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        double[] doubleArray2 = new double[] { 1.0d, 100.0f };
        double[] doubleArray5 = new double[] { 1.0d, 100.0f };
        double[] doubleArray8 = new double[] { 1.0d, 100.0f };
        double[] doubleArray11 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl14 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = bigMatrixImpl14.transpose();
        int int16 = bigMatrixImpl14.getColumnDimension();
        java.math.BigDecimal[][] bigDecimalArray17 = bigMatrixImpl14.getDataRef();
        bigMatrixImpl14.setScale((int) (short) 100);
        boolean boolean20 = bigMatrixImpl14.isSingular();
        int int21 = bigMatrixImpl14.getScale();
        java.math.BigDecimal bigDecimal23 = new java.math.BigDecimal(0.0d);
        java.lang.String str24 = bigDecimal23.toString();
        java.math.BigDecimal bigDecimal26 = bigDecimal23.setScale(0);
        double[] doubleArray31 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix32 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray31);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray31);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = realMatrix33.scalarAdd((double) 6);
        int int36 = realMatrix33.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix38 = realMatrix33.scalarAdd(10.0d);
        double[] doubleArray43 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix44 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray43);
        double double45 = realMatrix44.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrix44.scalarAdd((double) '4');
        org.apache.commons.math.linear.RealMatrix realMatrix48 = realMatrix38.preMultiply(realMatrix47);
        boolean boolean49 = bigDecimal26.equals((java.lang.Object) realMatrix38);
        org.apache.commons.math.linear.BigMatrix bigMatrix50 = bigMatrixImpl14.scalarAdd(bigDecimal26);
        java.math.BigInteger bigInteger51 = bigDecimal26.toBigIntegerExact();
        java.math.BigDecimal bigDecimal53 = new java.math.BigDecimal(bigInteger51, 3);
        java.math.BigDecimal bigDecimal55 = new java.math.BigDecimal((long) (byte) 0);
        int int56 = bigDecimal55.intValue();
        java.math.BigDecimal bigDecimal57 = bigDecimal53.multiply(bigDecimal55);
        int int58 = bigDecimal53.precision();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal23 and bigDecimal57", (bigDecimal23.compareTo(bigDecimal57) == 0) == bigDecimal23.equals(bigDecimal57));
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger3 = bigDecimal2.unscaledValue();
        java.math.BigDecimal bigDecimal4 = bigDecimal0.add(bigDecimal2);
        java.math.BigInteger bigInteger5 = bigDecimal2.toBigInteger();
        java.math.BigDecimal bigDecimal7 = new java.math.BigDecimal(bigInteger5, 32);
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger10 = bigDecimal9.unscaledValue();
        java.math.BigDecimal bigDecimal11 = bigDecimal9.stripTrailingZeros();
        boolean boolean12 = bigDecimal7.equals((java.lang.Object) bigDecimal11);
        long long13 = bigDecimal7.longValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal2 and bigDecimal11", (bigDecimal2.compareTo(bigDecimal11) == 0) == bigDecimal2.equals(bigDecimal11));
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        double[] doubleArray2 = new double[] { 1.0d, 100.0f };
        double[] doubleArray5 = new double[] { 1.0d, 100.0f };
        double[] doubleArray8 = new double[] { 1.0d, 100.0f };
        double[] doubleArray11 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl14 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        java.math.BigDecimal bigDecimal18 = new java.math.BigDecimal(0.0d);
        int int19 = bigDecimal18.intValue();
        java.math.BigDecimal bigDecimal21 = new java.math.BigDecimal(0.0d);
        int int22 = bigDecimal21.intValue();
        java.math.BigDecimal bigDecimal23 = bigDecimal18.min(bigDecimal21);
        java.math.BigInteger bigInteger24 = bigDecimal18.toBigInteger();
        java.math.BigDecimal bigDecimal25 = new java.math.BigDecimal(bigInteger24);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = bigMatrix16.scalarAdd(bigDecimal25);
        java.math.BigDecimal bigDecimal28 = new java.math.BigDecimal(0.0d);
        int int29 = bigDecimal28.intValue();
        java.math.BigDecimal bigDecimal31 = new java.math.BigDecimal(0.0d);
        int int32 = bigDecimal31.intValue();
        java.math.BigDecimal bigDecimal33 = bigDecimal28.min(bigDecimal31);
        java.math.BigInteger bigInteger34 = bigDecimal28.toBigInteger();
        java.math.BigDecimal bigDecimal35 = new java.math.BigDecimal(bigInteger34);
        java.math.BigDecimal bigDecimal37 = new java.math.BigDecimal(0.0d);
        java.lang.String str38 = bigDecimal37.toString();
        java.math.BigDecimal bigDecimal40 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal41 = bigDecimal40.stripTrailingZeros();
        int int42 = bigDecimal40.signum();
        java.math.BigDecimal[] bigDecimalArray43 = bigDecimal37.divideAndRemainder(bigDecimal40);
        java.math.BigDecimal bigDecimal45 = bigDecimal37.pow((int) 'a');
        java.math.BigDecimal bigDecimal47 = new java.math.BigDecimal(0.0d);
        java.lang.String str48 = bigDecimal47.toString();
        java.math.BigDecimal bigDecimal50 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal51 = bigDecimal50.stripTrailingZeros();
        int int52 = bigDecimal50.signum();
        java.math.BigDecimal[] bigDecimalArray53 = bigDecimal47.divideAndRemainder(bigDecimal50);
        java.math.BigDecimal bigDecimal55 = bigDecimal47.pow((int) 'a');
        java.math.BigInteger bigInteger56 = bigDecimal47.toBigIntegerExact();
        java.math.BigDecimal bigDecimal57 = bigDecimal45.add(bigDecimal47);
        java.math.BigDecimal bigDecimal59 = new java.math.BigDecimal(0.0d);
        java.lang.String str60 = bigDecimal59.toString();
        java.math.BigDecimal bigDecimal62 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal63 = bigDecimal62.stripTrailingZeros();
        int int64 = bigDecimal62.signum();
        java.math.BigDecimal[] bigDecimalArray65 = bigDecimal59.divideAndRemainder(bigDecimal62);
        java.math.BigDecimal bigDecimal67 = bigDecimal59.pow((int) 'a');
        java.math.BigInteger bigInteger68 = bigDecimal59.toBigIntegerExact();
        float float69 = bigDecimal59.floatValue();
        java.math.BigDecimal bigDecimal70 = bigDecimal45.add(bigDecimal59);
        java.math.BigDecimal bigDecimal72 = bigDecimal59.pow((int) ' ');
        java.math.BigDecimal bigDecimal73 = bigDecimal35.subtract(bigDecimal72);
        java.math.BigDecimal bigDecimal74 = bigDecimal25.subtract(bigDecimal72);
        java.math.BigDecimal bigDecimal76 = new java.math.BigDecimal(0.0d);
        int int77 = bigDecimal76.intValue();
        java.math.BigDecimal bigDecimal79 = new java.math.BigDecimal(0.0d);
        int int80 = bigDecimal79.intValue();
        java.math.BigDecimal bigDecimal81 = bigDecimal76.min(bigDecimal79);
        java.math.BigInteger bigInteger82 = bigDecimal76.toBigInteger();
        java.math.BigInteger bigInteger83 = bigDecimal76.unscaledValue();
        java.math.BigDecimal bigDecimal84 = new java.math.BigDecimal(bigInteger83);
        java.math.BigDecimal bigDecimal86 = new java.math.BigDecimal(bigInteger83, (int) ' ');
        java.math.BigDecimal bigDecimal87 = bigDecimal25.multiply(bigDecimal86);
        java.lang.String str88 = bigDecimal25.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal18 and bigDecimal86", (bigDecimal18.compareTo(bigDecimal86) == 0) == bigDecimal18.equals(bigDecimal86));
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.min(bigDecimal4);
        java.math.BigDecimal bigDecimal7 = bigDecimal1.plus();
        java.math.BigInteger bigInteger8 = bigDecimal7.toBigIntegerExact();
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger12 = bigDecimal11.unscaledValue();
        java.math.BigDecimal bigDecimal13 = bigDecimal9.add(bigDecimal11);
        float float14 = bigDecimal11.floatValue();
        java.lang.String str15 = bigDecimal11.toEngineeringString();
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(0.0d);
        int int18 = bigDecimal17.intValue();
        long long19 = bigDecimal17.longValue();
        long long20 = bigDecimal17.longValueExact();
        int int21 = bigDecimal17.precision();
        java.math.BigDecimal bigDecimal23 = new java.math.BigDecimal(0.0d);
        int int24 = bigDecimal23.intValue();
        long long25 = bigDecimal23.longValue();
        long long26 = bigDecimal23.longValueExact();
        java.math.BigDecimal bigDecimal27 = bigDecimal17.add(bigDecimal23);
        java.math.BigDecimal bigDecimal29 = bigDecimal23.pow(3);
        java.math.BigInteger bigInteger30 = bigDecimal29.toBigIntegerExact();
        java.math.BigDecimal bigDecimal31 = bigDecimal29.stripTrailingZeros();
        java.math.BigDecimal bigDecimal32 = bigDecimal11.add(bigDecimal29);
        java.math.BigDecimal bigDecimal34 = new java.math.BigDecimal(0.0d);
        int int35 = bigDecimal34.intValue();
        java.math.BigDecimal bigDecimal37 = new java.math.BigDecimal(0.0d);
        int int38 = bigDecimal37.intValue();
        java.math.BigDecimal bigDecimal39 = bigDecimal34.min(bigDecimal37);
        java.math.BigDecimal[] bigDecimalArray40 = new java.math.BigDecimal[] { bigDecimal39 };
        java.math.BigDecimal bigDecimal42 = new java.math.BigDecimal(0.0d);
        int int43 = bigDecimal42.intValue();
        java.math.BigDecimal bigDecimal45 = new java.math.BigDecimal(0.0d);
        int int46 = bigDecimal45.intValue();
        java.math.BigDecimal bigDecimal47 = bigDecimal42.min(bigDecimal45);
        java.math.BigDecimal[] bigDecimalArray48 = new java.math.BigDecimal[] { bigDecimal47 };
        java.math.BigDecimal bigDecimal50 = new java.math.BigDecimal(0.0d);
        int int51 = bigDecimal50.intValue();
        java.math.BigDecimal bigDecimal53 = new java.math.BigDecimal(0.0d);
        int int54 = bigDecimal53.intValue();
        java.math.BigDecimal bigDecimal55 = bigDecimal50.min(bigDecimal53);
        java.math.BigDecimal[] bigDecimalArray56 = new java.math.BigDecimal[] { bigDecimal55 };
        java.math.BigDecimal[][] bigDecimalArray57 = new java.math.BigDecimal[][] { bigDecimalArray40, bigDecimalArray48, bigDecimalArray56 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl58 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray57);
        org.apache.commons.math.linear.BigMatrix bigMatrix59 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray57);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl60 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray57);
        java.math.BigDecimal[][] bigDecimalArray61 = bigMatrixImpl60.getDataRef();
        java.math.BigDecimal bigDecimal62 = bigMatrixImpl60.getNorm();
        boolean boolean63 = bigMatrixImpl60.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix64 = bigMatrixImpl60.copy();
        double[] doubleArray66 = bigMatrixImpl60.getColumnAsDoubleArray((int) (byte) 0);
        java.math.BigDecimal bigDecimal67 = java.math.BigDecimal.TEN;
        org.apache.commons.math.linear.BigMatrix bigMatrix68 = bigMatrixImpl60.scalarMultiply(bigDecimal67);
        java.math.BigDecimal bigDecimal71 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) ' ');
        org.apache.commons.math.linear.BigMatrix bigMatrix72 = bigMatrixImpl60.scalarAdd(bigDecimal71);
        java.math.BigDecimal bigDecimal74 = bigDecimal71.movePointLeft((int) (short) -100);
        java.math.BigDecimal bigDecimal76 = new java.math.BigDecimal(0.0d);
        int int77 = bigDecimal76.intValue();
        long long78 = bigDecimal76.longValue();
        java.math.BigDecimal bigDecimal79 = bigDecimal71.min(bigDecimal76);
        java.math.BigDecimal bigDecimal80 = bigDecimal29.multiply(bigDecimal76);
        java.math.BigDecimal bigDecimal82 = bigDecimal29.setScale(5);
        java.math.BigDecimal bigDecimal83 = bigDecimal7.min(bigDecimal82);
        java.math.BigDecimal bigDecimal85 = new java.math.BigDecimal("197");
        java.math.BigDecimal bigDecimal87 = bigDecimal85.movePointRight(110);
        java.math.BigDecimal bigDecimal88 = bigDecimal83.add(bigDecimal85);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal83 and bigDecimal82", (bigDecimal83.compareTo(bigDecimal82) == 0) == bigDecimal83.equals(bigDecimal82));
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        org.apache.commons.math.linear.BigMatrix bigMatrix1 = org.apache.commons.math.linear.MatrixUtils.createBigIdentityMatrix((int) (byte) 100);
        java.math.BigDecimal[][] bigDecimalArray2 = bigMatrix1.getData();
        boolean boolean3 = bigMatrix1.isSquare();
        java.math.BigDecimal bigDecimal4 = bigMatrix1.getDeterminant();
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger8 = bigDecimal7.unscaledValue();
        java.math.BigDecimal bigDecimal9 = bigDecimal5.add(bigDecimal7);
        float float10 = bigDecimal7.floatValue();
        java.math.BigDecimal bigDecimal12 = new java.math.BigDecimal(0.0d);
        java.lang.String str13 = bigDecimal12.toString();
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal16 = bigDecimal15.stripTrailingZeros();
        int int17 = bigDecimal15.signum();
        java.math.BigDecimal[] bigDecimalArray18 = bigDecimal12.divideAndRemainder(bigDecimal15);
        java.math.BigDecimal bigDecimal20 = bigDecimal12.pow((int) 'a');
        java.math.BigDecimal bigDecimal22 = new java.math.BigDecimal(0.0d);
        java.lang.String str23 = bigDecimal22.toString();
        java.math.BigDecimal bigDecimal25 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal26 = bigDecimal25.stripTrailingZeros();
        int int27 = bigDecimal25.signum();
        java.math.BigDecimal[] bigDecimalArray28 = bigDecimal22.divideAndRemainder(bigDecimal25);
        java.math.BigDecimal bigDecimal30 = bigDecimal22.pow((int) 'a');
        java.math.BigInteger bigInteger31 = bigDecimal22.toBigIntegerExact();
        java.math.BigDecimal bigDecimal32 = bigDecimal20.add(bigDecimal22);
        java.math.BigDecimal bigDecimal34 = new java.math.BigDecimal(0.0d);
        int int35 = bigDecimal34.intValue();
        java.math.BigDecimal bigDecimal37 = new java.math.BigDecimal(0.0d);
        int int38 = bigDecimal37.intValue();
        java.math.BigDecimal bigDecimal39 = bigDecimal34.min(bigDecimal37);
        java.math.BigInteger bigInteger40 = bigDecimal34.toBigInteger();
        java.math.BigDecimal bigDecimal41 = new java.math.BigDecimal(bigInteger40);
        java.math.BigDecimal bigDecimal43 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal44 = bigDecimal43.stripTrailingZeros();
        float float45 = bigDecimal43.floatValue();
        java.math.BigDecimal bigDecimal46 = bigDecimal41.multiply(bigDecimal43);
        java.math.BigDecimal bigDecimal47 = bigDecimal41.negate();
        java.math.BigDecimal bigDecimal48 = bigDecimal32.add(bigDecimal47);
        java.math.BigDecimal bigDecimal50 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal51 = bigDecimal50.stripTrailingZeros();
        float float52 = bigDecimal50.floatValue();
        java.math.BigDecimal bigDecimal53 = bigDecimal50.ulp();
        java.math.BigDecimal bigDecimal55 = new java.math.BigDecimal(0.0d);
        java.lang.String str56 = bigDecimal55.toString();
        java.math.BigDecimal bigDecimal58 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal59 = bigDecimal58.stripTrailingZeros();
        int int60 = bigDecimal58.signum();
        java.math.BigDecimal[] bigDecimalArray61 = bigDecimal55.divideAndRemainder(bigDecimal58);
        java.math.BigDecimal bigDecimal63 = bigDecimal55.pow((int) 'a');
        java.math.BigDecimal bigDecimal65 = new java.math.BigDecimal(0.0d);
        java.lang.String str66 = bigDecimal65.toString();
        java.math.BigDecimal bigDecimal68 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal69 = bigDecimal68.stripTrailingZeros();
        int int70 = bigDecimal68.signum();
        java.math.BigDecimal[] bigDecimalArray71 = bigDecimal65.divideAndRemainder(bigDecimal68);
        java.math.BigDecimal bigDecimal73 = bigDecimal65.pow((int) 'a');
        java.math.BigInteger bigInteger74 = bigDecimal65.toBigIntegerExact();
        java.math.BigDecimal bigDecimal75 = bigDecimal63.add(bigDecimal65);
        java.math.BigDecimal bigDecimal76 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal78 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger79 = bigDecimal78.unscaledValue();
        java.math.BigDecimal bigDecimal80 = bigDecimal76.add(bigDecimal78);
        java.math.BigDecimal bigDecimal81 = bigDecimal65.multiply(bigDecimal76);
        java.math.BigDecimal bigDecimal82 = bigDecimal53.divide(bigDecimal76);
        java.math.BigDecimal bigDecimal83 = bigDecimal47.remainder(bigDecimal53);
        java.math.BigDecimal bigDecimal84 = bigDecimal7.subtract(bigDecimal47);
        java.math.BigDecimal bigDecimal85 = bigDecimal7.ulp();
        java.math.BigDecimal bigDecimal87 = bigDecimal85.movePointRight(0);
        org.apache.commons.math.linear.BigMatrix bigMatrix88 = bigMatrix1.scalarAdd(bigDecimal85);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal4 and bigDecimal85", (bigDecimal4.compareTo(bigDecimal85) == 0) == bigDecimal4.equals(bigDecimal85));
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        java.lang.String str2 = bigDecimal1.toString();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal5 = bigDecimal4.stripTrailingZeros();
        int int6 = bigDecimal4.signum();
        java.math.BigDecimal[] bigDecimalArray7 = bigDecimal1.divideAndRemainder(bigDecimal4);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl8 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray7);
        int int9 = bigMatrixImpl8.getRoundingMode();
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = bigMatrixImpl8.transpose();
        double[][] doubleArray11 = bigMatrix10.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl12 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray11);
        java.math.BigDecimal bigDecimal13 = bigMatrixImpl12.getNorm();
        int int14 = bigMatrixImpl12.getColumnDimension();
        java.math.BigDecimal bigDecimal16 = new java.math.BigDecimal(0.0d);
        java.lang.String str17 = bigDecimal16.toString();
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal20 = bigDecimal19.stripTrailingZeros();
        int int21 = bigDecimal19.signum();
        java.math.BigDecimal[] bigDecimalArray22 = bigDecimal16.divideAndRemainder(bigDecimal19);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl23 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray22);
        int int24 = bigMatrixImpl23.getRoundingMode();
        org.apache.commons.math.linear.BigMatrix bigMatrix25 = bigMatrixImpl23.transpose();
        java.math.BigDecimal[][] bigDecimalArray26 = bigMatrixImpl23.getDataRef();
        java.math.BigDecimal[][] bigDecimalArray27 = bigMatrixImpl23.getDataRef();
        boolean boolean28 = bigMatrixImpl12.equals((java.lang.Object) bigMatrixImpl23);
        java.math.BigDecimal bigDecimal30 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal[] bigDecimalArray33 = bigDecimal30.divideAndRemainder(bigDecimal32);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33);
        double[] doubleArray36 = bigMatrixImpl34.getRowAsDoubleArray(0);
        org.apache.commons.math.linear.BigMatrix bigMatrix37 = bigMatrixImpl34.copy();
        double[] doubleArray40 = new double[] { 1.0d, 100.0f };
        double[] doubleArray43 = new double[] { 1.0d, 100.0f };
        double[] doubleArray46 = new double[] { 1.0d, 100.0f };
        double[] doubleArray49 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray50 = new double[][] { doubleArray40, doubleArray43, doubleArray46, doubleArray49 };
        org.apache.commons.math.linear.BigMatrix bigMatrix51 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray50);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl52 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray50);
        org.apache.commons.math.linear.BigMatrix bigMatrix53 = bigMatrixImpl52.transpose();
        int int54 = bigMatrixImpl52.getColumnDimension();
        java.math.BigDecimal[][] bigDecimalArray55 = bigMatrixImpl52.getDataRef();
        org.apache.commons.math.linear.BigMatrix bigMatrix56 = bigMatrixImpl34.preMultiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl52);
        java.math.BigDecimal[][] bigDecimalArray57 = bigMatrixImpl34.getDataRef();
        java.math.BigDecimal[][] bigDecimalArray58 = bigMatrixImpl34.getData();
        int int59 = bigMatrixImpl34.getRowDimension();
        java.math.BigDecimal bigDecimal61 = java.math.BigDecimal.valueOf((double) 'a');
        double double62 = bigDecimal61.doubleValue();
        org.apache.commons.math.linear.BigMatrix bigMatrix63 = bigMatrixImpl34.scalarMultiply(bigDecimal61);
        org.apache.commons.math.linear.BigMatrix bigMatrix64 = bigMatrixImpl12.preMultiply(bigMatrix63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal4 and bigDecimal61", (bigDecimal4.compareTo(bigDecimal61) == 0) == bigDecimal4.equals(bigDecimal61));
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal((int) (byte) 97);
        java.math.BigDecimal bigDecimal2 = bigDecimal1.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.setScale((int) (short) 31464);
        java.math.BigDecimal bigDecimal6 = bigDecimal2.movePointLeft((int) (short) 400);
        java.math.BigDecimal bigDecimal7 = bigDecimal2.plus();
        java.math.BigInteger bigInteger8 = bigDecimal2.toBigIntegerExact();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal4 and bigDecimal2", (bigDecimal4.compareTo(bigDecimal2) == 0) == bigDecimal4.equals(bigDecimal2));
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        double[] doubleArray2 = new double[] { 1.0d, 100.0f };
        double[] doubleArray5 = new double[] { 1.0d, 100.0f };
        double[] doubleArray8 = new double[] { 1.0d, 100.0f };
        double[] doubleArray11 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl14 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        java.math.BigDecimal bigDecimal18 = new java.math.BigDecimal(0.0d);
        int int19 = bigDecimal18.intValue();
        java.math.BigDecimal bigDecimal21 = new java.math.BigDecimal(0.0d);
        int int22 = bigDecimal21.intValue();
        java.math.BigDecimal bigDecimal23 = bigDecimal18.min(bigDecimal21);
        java.math.BigInteger bigInteger24 = bigDecimal18.toBigInteger();
        java.math.BigDecimal bigDecimal25 = new java.math.BigDecimal(bigInteger24);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = bigMatrix16.scalarAdd(bigDecimal25);
        java.math.BigDecimal bigDecimal28 = bigDecimal25.scaleByPowerOfTen(97);
        java.math.BigInteger bigInteger29 = bigDecimal28.toBigIntegerExact();
        java.math.BigInteger bigInteger30 = bigDecimal28.unscaledValue();
        java.math.BigDecimal bigDecimal32 = bigDecimal28.movePointLeft(32);
        byte byte33 = bigDecimal32.byteValueExact();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal18 and bigDecimal28", (bigDecimal18.compareTo(bigDecimal28) == 0) == bigDecimal18.equals(bigDecimal28));
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal((int) (byte) 97);
        java.math.BigDecimal bigDecimal2 = bigDecimal1.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.setScale((int) (short) 31464);
        java.math.BigDecimal bigDecimal6 = bigDecimal2.movePointLeft((int) (short) 400);
        java.math.BigDecimal bigDecimal7 = bigDecimal2.plus();
        int int8 = bigDecimal2.scale();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal4 and bigDecimal2", (bigDecimal4.compareTo(bigDecimal2) == 0) == bigDecimal4.equals(bigDecimal2));
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (byte) 10, (int) (short) 100);
        bigMatrixImpl2.setScale((int) 'a');
        java.math.BigDecimal bigDecimal7 = bigMatrixImpl2.getEntry(0, (int) (byte) 6);
        bigMatrixImpl2.setScale((int) (byte) 62);
        bigMatrixImpl2.setScale(8667);
        int int12 = bigMatrixImpl2.getRoundingMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = bigMatrixImpl2.getRowAsDoubleArray(0);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        java.lang.String str2 = bigDecimal1.toString();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal5 = bigDecimal4.stripTrailingZeros();
        int int6 = bigDecimal4.signum();
        java.math.BigDecimal[] bigDecimalArray7 = bigDecimal1.divideAndRemainder(bigDecimal4);
        java.math.BigDecimal bigDecimal9 = bigDecimal1.pow((int) 'a');
        java.math.BigDecimal bigDecimal11 = new java.math.BigDecimal(0.0d);
        java.lang.String str12 = bigDecimal11.toString();
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal15 = bigDecimal14.stripTrailingZeros();
        int int16 = bigDecimal14.signum();
        java.math.BigDecimal[] bigDecimalArray17 = bigDecimal11.divideAndRemainder(bigDecimal14);
        java.math.BigDecimal bigDecimal19 = bigDecimal11.pow((int) 'a');
        java.math.BigInteger bigInteger20 = bigDecimal11.toBigIntegerExact();
        java.math.BigDecimal bigDecimal21 = bigDecimal9.add(bigDecimal11);
        java.math.BigDecimal bigDecimal23 = new java.math.BigDecimal(0.0d);
        java.lang.String str24 = bigDecimal23.toString();
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal27 = bigDecimal26.stripTrailingZeros();
        int int28 = bigDecimal26.signum();
        java.math.BigDecimal[] bigDecimalArray29 = bigDecimal23.divideAndRemainder(bigDecimal26);
        java.math.BigDecimal bigDecimal31 = bigDecimal23.pow((int) 'a');
        java.math.BigInteger bigInteger32 = bigDecimal23.toBigIntegerExact();
        float float33 = bigDecimal23.floatValue();
        java.math.BigDecimal bigDecimal34 = bigDecimal9.add(bigDecimal23);
        java.math.BigInteger bigInteger35 = bigDecimal23.toBigIntegerExact();
        java.math.BigDecimal bigDecimal36 = new java.math.BigDecimal(bigInteger35);
        double[] doubleArray39 = new double[] { 1.0d, 100.0f };
        double[] doubleArray42 = new double[] { 1.0d, 100.0f };
        double[] doubleArray45 = new double[] { 1.0d, 100.0f };
        double[] doubleArray48 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray49 = new double[][] { doubleArray39, doubleArray42, doubleArray45, doubleArray48 };
        org.apache.commons.math.linear.BigMatrix bigMatrix50 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray49);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl51 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray49);
        org.apache.commons.math.linear.BigMatrix bigMatrix52 = bigMatrixImpl51.transpose();
        double[] doubleArray54 = bigMatrixImpl51.getRowAsDoubleArray((int) (short) 0);
        boolean boolean55 = bigMatrixImpl51.isSingular();
        boolean boolean56 = bigMatrixImpl51.isSquare();
        int int57 = bigMatrixImpl51.getScale();
        java.math.BigDecimal bigDecimal58 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal60 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger61 = bigDecimal60.unscaledValue();
        java.math.BigDecimal bigDecimal62 = bigDecimal58.add(bigDecimal60);
        java.math.BigDecimal bigDecimal64 = bigDecimal60.setScale(100);
        boolean boolean65 = bigMatrixImpl51.equals((java.lang.Object) bigDecimal60);
        java.math.BigDecimal bigDecimal66 = bigDecimal36.min(bigDecimal60);
        java.math.BigInteger bigInteger67 = bigDecimal60.toBigInteger();
        java.math.BigDecimal bigDecimal69 = new java.math.BigDecimal(bigInteger67, 50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal60 and bigDecimal64", (bigDecimal60.compareTo(bigDecimal64) == 0) == bigDecimal60.equals(bigDecimal64));
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        java.lang.String str2 = bigDecimal1.toString();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal5 = bigDecimal4.stripTrailingZeros();
        int int6 = bigDecimal4.signum();
        java.math.BigDecimal[] bigDecimalArray7 = bigDecimal1.divideAndRemainder(bigDecimal4);
        java.math.BigDecimal bigDecimal9 = bigDecimal1.pow((int) 'a');
        java.math.BigDecimal bigDecimal11 = new java.math.BigDecimal(0.0d);
        java.lang.String str12 = bigDecimal11.toString();
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal15 = bigDecimal14.stripTrailingZeros();
        int int16 = bigDecimal14.signum();
        java.math.BigDecimal[] bigDecimalArray17 = bigDecimal11.divideAndRemainder(bigDecimal14);
        java.math.BigDecimal bigDecimal19 = bigDecimal11.pow((int) 'a');
        java.math.BigInteger bigInteger20 = bigDecimal11.toBigIntegerExact();
        java.math.BigDecimal bigDecimal21 = bigDecimal9.add(bigDecimal11);
        float float22 = bigDecimal21.floatValue();
        double[] doubleArray25 = new double[] { 1.0d, 100.0f };
        double[] doubleArray28 = new double[] { 1.0d, 100.0f };
        double[] doubleArray31 = new double[] { 1.0d, 100.0f };
        double[] doubleArray34 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray35 = new double[][] { doubleArray25, doubleArray28, doubleArray31, doubleArray34 };
        org.apache.commons.math.linear.BigMatrix bigMatrix36 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray35);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray35);
        org.apache.commons.math.linear.BigMatrix bigMatrix38 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray35);
        org.apache.commons.math.linear.BigMatrix bigMatrix39 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray35);
        java.math.BigDecimal bigDecimal41 = new java.math.BigDecimal(0.0d);
        int int42 = bigDecimal41.intValue();
        java.math.BigDecimal bigDecimal44 = new java.math.BigDecimal(0.0d);
        int int45 = bigDecimal44.intValue();
        java.math.BigDecimal bigDecimal46 = bigDecimal41.min(bigDecimal44);
        java.math.BigInteger bigInteger47 = bigDecimal41.toBigInteger();
        java.math.BigDecimal bigDecimal48 = new java.math.BigDecimal(bigInteger47);
        org.apache.commons.math.linear.BigMatrix bigMatrix49 = bigMatrix39.scalarAdd(bigDecimal48);
        java.math.BigDecimal bigDecimal50 = bigDecimal48.stripTrailingZeros();
        java.math.BigDecimal bigDecimal51 = bigDecimal21.min(bigDecimal50);
        java.math.BigInteger bigInteger52 = bigDecimal21.unscaledValue();
        java.math.BigDecimal bigDecimal54 = bigDecimal21.scaleByPowerOfTen(7);
        java.math.BigDecimal bigDecimal56 = bigDecimal54.pow((int) (short) 2805);
        java.math.BigDecimal bigDecimal58 = bigDecimal54.setScale((int) (byte) -1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal56", (bigDecimal1.compareTo(bigDecimal56) == 0) == bigDecimal1.equals(bigDecimal56));
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
        double[] doubleArray2 = new double[] { 1.0d, 100.0f };
        double[] doubleArray5 = new double[] { 1.0d, 100.0f };
        double[] doubleArray8 = new double[] { 1.0d, 100.0f };
        double[] doubleArray11 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl14 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = bigMatrixImpl14.transpose();
        double[] doubleArray17 = bigMatrixImpl14.getRowAsDoubleArray((int) (short) 0);
        boolean boolean18 = bigMatrixImpl14.isSingular();
        java.math.BigDecimal[][] bigDecimalArray19 = bigMatrixImpl14.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray19);
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigDecimal bigDecimal23 = bigDecimal22.negate();
        int int24 = bigDecimal23.scale();
        boolean boolean25 = bigMatrixImpl20.equals((java.lang.Object) bigDecimal23);
        java.lang.String str26 = bigDecimal23.toEngineeringString();
        java.math.BigDecimal bigDecimal27 = bigDecimal23.stripTrailingZeros();
        java.math.BigDecimal bigDecimal29 = new java.math.BigDecimal(0.0d);
        int int30 = bigDecimal29.intValue();
        long long31 = bigDecimal29.longValue();
        long long32 = bigDecimal29.longValueExact();
        int int33 = bigDecimal29.precision();
        java.math.BigDecimal bigDecimal35 = new java.math.BigDecimal(0.0d);
        int int36 = bigDecimal35.intValue();
        long long37 = bigDecimal35.longValue();
        long long38 = bigDecimal35.longValueExact();
        java.math.BigDecimal bigDecimal39 = bigDecimal29.add(bigDecimal35);
        byte byte40 = bigDecimal29.byteValueExact();
        java.math.BigDecimal bigDecimal41 = bigDecimal27.add(bigDecimal29);
        java.math.BigDecimal bigDecimal43 = new java.math.BigDecimal((long) 4);
        java.lang.String str44 = bigDecimal43.toEngineeringString();
        java.math.BigDecimal bigDecimal45 = bigDecimal41.max(bigDecimal43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal23 and bigDecimal27", (bigDecimal23.compareTo(bigDecimal27) == 0) == bigDecimal23.equals(bigDecimal27));
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.min(bigDecimal4);
        java.math.BigInteger bigInteger7 = bigDecimal1.toBigInteger();
        java.math.BigDecimal bigDecimal8 = new java.math.BigDecimal(bigInteger7);
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal11 = bigDecimal10.stripTrailingZeros();
        float float12 = bigDecimal10.floatValue();
        java.math.BigDecimal bigDecimal13 = bigDecimal8.multiply(bigDecimal10);
        java.math.BigDecimal bigDecimal14 = bigDecimal8.negate();
        int int15 = bigDecimal14.intValue();
        java.math.BigDecimal bigDecimal18 = bigDecimal14.setScale((int) (short) 10, 0);
        java.math.BigDecimal bigDecimal20 = new java.math.BigDecimal(0.0d);
        java.lang.String str21 = bigDecimal20.toString();
        java.math.BigDecimal bigDecimal23 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal24 = bigDecimal23.stripTrailingZeros();
        int int25 = bigDecimal23.signum();
        java.math.BigDecimal[] bigDecimalArray26 = bigDecimal20.divideAndRemainder(bigDecimal23);
        java.math.BigDecimal bigDecimal28 = bigDecimal20.pow((int) 'a');
        java.math.BigDecimal bigDecimal30 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal31 = bigDecimal30.stripTrailingZeros();
        float float32 = bigDecimal30.floatValue();
        java.math.BigDecimal bigDecimal33 = bigDecimal28.divideToIntegralValue(bigDecimal30);
        java.math.BigDecimal bigDecimal34 = bigDecimal30.ulp();
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger37 = bigDecimal36.unscaledValue();
        short short38 = bigDecimal36.shortValueExact();
        java.lang.String str39 = bigDecimal36.toEngineeringString();
        java.math.BigDecimal[] bigDecimalArray40 = bigDecimal34.divideAndRemainder(bigDecimal36);
        java.lang.String str41 = bigDecimal34.toEngineeringString();
        java.math.BigDecimal bigDecimal43 = bigDecimal34.pow((int) (short) 7888);
        java.math.BigDecimal[] bigDecimalArray44 = bigDecimal14.divideAndRemainder(bigDecimal43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal18", (bigDecimal1.compareTo(bigDecimal18) == 0) == bigDecimal1.equals(bigDecimal18));
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        long long3 = bigDecimal1.longValue();
        java.math.BigDecimal bigDecimal4 = bigDecimal1.ulp();
        double double5 = bigDecimal1.doubleValue();
        short short6 = bigDecimal1.shortValueExact();
        byte byte7 = bigDecimal1.byteValueExact();
        java.math.BigDecimal bigDecimal8 = bigDecimal1.stripTrailingZeros();
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.valueOf((double) 4);
        double double11 = bigDecimal10.doubleValue();
        java.math.BigInteger bigInteger12 = bigDecimal10.unscaledValue();
        java.math.BigDecimal bigDecimal14 = new java.math.BigDecimal((double) (byte) 0);
        java.math.BigDecimal bigDecimal15 = bigDecimal10.multiply(bigDecimal14);
        java.math.BigDecimal bigDecimal16 = bigDecimal1.divideToIntegralValue(bigDecimal10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal8 and bigDecimal15", (bigDecimal8.compareTo(bigDecimal15) == 0) == bigDecimal8.equals(bigDecimal15));
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal((double) 2805.0f);
        java.math.BigDecimal bigDecimal3 = bigDecimal1.setScale((int) '4');
        java.math.BigDecimal bigDecimal5 = new java.math.BigDecimal(0.0d);
        int int6 = bigDecimal5.intValue();
        java.math.BigDecimal bigDecimal8 = new java.math.BigDecimal(0.0d);
        int int9 = bigDecimal8.intValue();
        java.math.BigDecimal bigDecimal10 = bigDecimal5.min(bigDecimal8);
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal10 };
        java.math.BigDecimal bigDecimal13 = new java.math.BigDecimal(0.0d);
        int int14 = bigDecimal13.intValue();
        java.math.BigDecimal bigDecimal16 = new java.math.BigDecimal(0.0d);
        int int17 = bigDecimal16.intValue();
        java.math.BigDecimal bigDecimal18 = bigDecimal13.min(bigDecimal16);
        java.math.BigDecimal[] bigDecimalArray19 = new java.math.BigDecimal[] { bigDecimal18 };
        java.math.BigDecimal bigDecimal21 = new java.math.BigDecimal(0.0d);
        int int22 = bigDecimal21.intValue();
        java.math.BigDecimal bigDecimal24 = new java.math.BigDecimal(0.0d);
        int int25 = bigDecimal24.intValue();
        java.math.BigDecimal bigDecimal26 = bigDecimal21.min(bigDecimal24);
        java.math.BigDecimal[] bigDecimalArray27 = new java.math.BigDecimal[] { bigDecimal26 };
        java.math.BigDecimal[][] bigDecimalArray28 = new java.math.BigDecimal[][] { bigDecimalArray11, bigDecimalArray19, bigDecimalArray27 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl29 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray28);
        org.apache.commons.math.linear.BigMatrix bigMatrix30 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray28);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl31 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray28);
        java.math.BigDecimal[][] bigDecimalArray32 = bigMatrixImpl31.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        java.math.BigDecimal bigDecimal34 = bigMatrixImpl33.getNorm();
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal37 = bigDecimal36.stripTrailingZeros();
        float float38 = bigDecimal36.floatValue();
        java.math.BigDecimal bigDecimal39 = bigDecimal34.remainder(bigDecimal36);
        long long40 = bigDecimal34.longValueExact();
        java.math.BigDecimal bigDecimal42 = bigDecimal34.movePointLeft((int) (short) -100);
        java.math.BigDecimal bigDecimal43 = bigDecimal3.add(bigDecimal34);
        java.lang.String str44 = bigDecimal3.toPlainString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal43", (bigDecimal1.compareTo(bigDecimal43) == 0) == bigDecimal1.equals(bigDecimal43));
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal((double) 1.0f);
        java.math.BigDecimal bigDecimal3 = java.math.BigDecimal.valueOf((long) 6);
        java.math.BigDecimal bigDecimal5 = new java.math.BigDecimal("0.0");
        int int6 = bigDecimal3.compareTo(bigDecimal5);
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.valueOf((long) 6);
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger12 = bigDecimal11.unscaledValue();
        java.math.BigDecimal bigDecimal13 = bigDecimal9.add(bigDecimal11);
        java.math.BigInteger bigInteger14 = bigDecimal11.toBigInteger();
        java.math.BigDecimal bigDecimal16 = new java.math.BigDecimal(bigInteger14, (int) (short) -1);
        java.math.BigDecimal bigDecimal18 = new java.math.BigDecimal((long) (short) 100);
        java.lang.String str19 = bigDecimal18.toEngineeringString();
        java.math.BigDecimal[] bigDecimalArray20 = bigDecimal16.divideAndRemainder(bigDecimal18);
        java.math.BigDecimal bigDecimal21 = bigDecimal8.remainder(bigDecimal16);
        java.math.BigDecimal bigDecimal22 = bigDecimal5.subtract(bigDecimal8);
        java.math.BigDecimal bigDecimal23 = bigDecimal5.negate();
        boolean boolean24 = bigDecimal1.equals((java.lang.Object) bigDecimal5);
        java.math.BigDecimal bigDecimal25 = bigDecimal1.ulp();
        java.math.MathContext mathContext27 = null;
        java.math.BigDecimal bigDecimal28 = new java.math.BigDecimal(0.0d, mathContext27);
        java.math.BigDecimal bigDecimal30 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger31 = bigDecimal30.unscaledValue();
        java.lang.String str32 = bigDecimal30.toPlainString();
        java.math.BigDecimal bigDecimal34 = bigDecimal30.movePointRight(64);
        java.math.BigDecimal bigDecimal35 = bigDecimal34.stripTrailingZeros();
        java.math.BigDecimal bigDecimal36 = bigDecimal28.divide(bigDecimal34);
        java.math.BigDecimal bigDecimal38 = new java.math.BigDecimal((int) (byte) 100);
        java.math.BigDecimal bigDecimal40 = new java.math.BigDecimal(0.0d);
        java.lang.String str41 = bigDecimal40.toString();
        java.math.BigDecimal bigDecimal43 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal44 = bigDecimal43.stripTrailingZeros();
        int int45 = bigDecimal43.signum();
        java.math.BigDecimal[] bigDecimalArray46 = bigDecimal40.divideAndRemainder(bigDecimal43);
        java.math.BigDecimal bigDecimal48 = bigDecimal40.pow((int) 'a');
        java.math.BigDecimal bigDecimal50 = new java.math.BigDecimal(0.0d);
        java.lang.String str51 = bigDecimal50.toString();
        java.math.BigDecimal bigDecimal53 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal54 = bigDecimal53.stripTrailingZeros();
        int int55 = bigDecimal53.signum();
        java.math.BigDecimal[] bigDecimalArray56 = bigDecimal50.divideAndRemainder(bigDecimal53);
        java.math.BigDecimal bigDecimal58 = bigDecimal50.pow((int) 'a');
        java.math.BigInteger bigInteger59 = bigDecimal50.toBigIntegerExact();
        java.math.BigDecimal bigDecimal60 = bigDecimal48.add(bigDecimal50);
        java.math.BigDecimal bigDecimal62 = new java.math.BigDecimal(0.0d);
        java.lang.String str63 = bigDecimal62.toString();
        java.math.BigDecimal bigDecimal65 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal66 = bigDecimal65.stripTrailingZeros();
        int int67 = bigDecimal65.signum();
        java.math.BigDecimal[] bigDecimalArray68 = bigDecimal62.divideAndRemainder(bigDecimal65);
        java.math.BigDecimal bigDecimal70 = bigDecimal62.pow((int) 'a');
        java.math.BigInteger bigInteger71 = bigDecimal62.toBigIntegerExact();
        float float72 = bigDecimal62.floatValue();
        java.math.BigDecimal bigDecimal73 = bigDecimal48.add(bigDecimal62);
        java.math.BigDecimal bigDecimal75 = new java.math.BigDecimal((int) (byte) 100);
        java.math.BigDecimal bigDecimal76 = bigDecimal62.divideToIntegralValue(bigDecimal75);
        java.math.BigDecimal bigDecimal77 = bigDecimal38.divideToIntegralValue(bigDecimal75);
        java.math.BigDecimal bigDecimal78 = bigDecimal34.multiply(bigDecimal77);
        java.math.BigDecimal bigDecimal79 = bigDecimal1.divideToIntegralValue(bigDecimal34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal5 and bigDecimal28", (bigDecimal5.compareTo(bigDecimal28) == 0) == bigDecimal5.equals(bigDecimal28));
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.min(bigDecimal4);
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal6 };
        java.math.BigDecimal bigDecimal9 = new java.math.BigDecimal(0.0d);
        int int10 = bigDecimal9.intValue();
        java.math.BigDecimal bigDecimal12 = new java.math.BigDecimal(0.0d);
        int int13 = bigDecimal12.intValue();
        java.math.BigDecimal bigDecimal14 = bigDecimal9.min(bigDecimal12);
        java.math.BigDecimal[] bigDecimalArray15 = new java.math.BigDecimal[] { bigDecimal14 };
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(0.0d);
        int int18 = bigDecimal17.intValue();
        java.math.BigDecimal bigDecimal20 = new java.math.BigDecimal(0.0d);
        int int21 = bigDecimal20.intValue();
        java.math.BigDecimal bigDecimal22 = bigDecimal17.min(bigDecimal20);
        java.math.BigDecimal[] bigDecimalArray23 = new java.math.BigDecimal[] { bigDecimal22 };
        java.math.BigDecimal[][] bigDecimalArray24 = new java.math.BigDecimal[][] { bigDecimalArray7, bigDecimalArray15, bigDecimalArray23 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl27 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        java.math.BigDecimal[][] bigDecimalArray28 = bigMatrixImpl27.getDataRef();
        java.math.BigDecimal bigDecimal29 = bigMatrixImpl27.getNorm();
        boolean boolean30 = bigMatrixImpl27.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix31 = bigMatrixImpl27.copy();
        double[] doubleArray33 = bigMatrixImpl27.getColumnAsDoubleArray((int) (byte) 0);
        java.lang.String[] strArray35 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray36 = new java.lang.String[][] { strArray35 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(strArray36);
        org.apache.commons.math.linear.BigMatrix bigMatrix38 = bigMatrixImpl27.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl37);
        org.apache.commons.math.linear.BigMatrix bigMatrix39 = bigMatrixImpl37.copy();
        java.math.BigDecimal[][] bigDecimalArray40 = bigMatrixImpl37.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray40);
        boolean boolean42 = bigMatrixImpl41.isSquare();
        java.math.BigDecimal bigDecimal43 = bigMatrixImpl41.getTrace();
        java.math.BigDecimal[][] bigDecimalArray44 = bigMatrixImpl41.getDataRef();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal43", (bigDecimal1.compareTo(bigDecimal43) == 0) == bigDecimal1.equals(bigDecimal43));
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal4 = bigDecimal1.setScale((int) (short) 100, (int) (byte) 1);
        double[] doubleArray7 = new double[] { 1.0d, 100.0f };
        double[] doubleArray10 = new double[] { 1.0d, 100.0f };
        double[] doubleArray13 = new double[] { 1.0d, 100.0f };
        double[] doubleArray16 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray17 = new double[][] { doubleArray7, doubleArray10, doubleArray13, doubleArray16 };
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray17);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl19 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray17);
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = bigMatrixImpl19.transpose();
        double[] doubleArray22 = bigMatrixImpl19.getRowAsDoubleArray((int) (short) 0);
        boolean boolean23 = bigMatrixImpl19.isSingular();
        java.math.BigDecimal[][] bigDecimalArray24 = bigMatrixImpl19.getData();
        java.math.BigDecimal bigDecimal25 = bigMatrixImpl19.getNorm();
        java.math.BigDecimal bigDecimal26 = bigMatrixImpl19.getNorm();
        double[] doubleArray29 = new double[] { 1.0d, 100.0f };
        double[] doubleArray32 = new double[] { 1.0d, 100.0f };
        double[] doubleArray35 = new double[] { 1.0d, 100.0f };
        double[] doubleArray38 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray39 = new double[][] { doubleArray29, doubleArray32, doubleArray35, doubleArray38 };
        org.apache.commons.math.linear.BigMatrix bigMatrix40 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray39);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray39);
        org.apache.commons.math.linear.BigMatrix bigMatrix42 = bigMatrixImpl41.transpose();
        boolean boolean43 = bigMatrixImpl41.isSingular();
        double[] doubleArray45 = bigMatrixImpl41.getColumnAsDoubleArray(0);
        int int46 = bigMatrixImpl41.getRoundingMode();
        boolean boolean47 = bigMatrixImpl41.isSingular();
        org.apache.commons.math.linear.BigMatrix bigMatrix48 = bigMatrixImpl19.subtract((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl41);
        org.apache.commons.math.linear.BigMatrix bigMatrix49 = bigMatrixImpl41.transpose();
        java.math.BigDecimal[][] bigDecimalArray50 = bigMatrixImpl41.getData();
        double[] doubleArray53 = new double[] { 1.0d, 100.0f };
        double[] doubleArray56 = new double[] { 1.0d, 100.0f };
        double[] doubleArray59 = new double[] { 1.0d, 100.0f };
        double[] doubleArray62 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray63 = new double[][] { doubleArray53, doubleArray56, doubleArray59, doubleArray62 };
        org.apache.commons.math.linear.BigMatrix bigMatrix64 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray63);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl65 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray63);
        org.apache.commons.math.linear.BigMatrix bigMatrix66 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray63);
        org.apache.commons.math.linear.BigMatrix bigMatrix67 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray63);
        java.math.BigDecimal bigDecimal69 = new java.math.BigDecimal(0.0d);
        int int70 = bigDecimal69.intValue();
        java.math.BigDecimal bigDecimal72 = new java.math.BigDecimal(0.0d);
        int int73 = bigDecimal72.intValue();
        java.math.BigDecimal bigDecimal74 = bigDecimal69.min(bigDecimal72);
        java.math.BigInteger bigInteger75 = bigDecimal69.toBigInteger();
        java.math.BigDecimal bigDecimal76 = new java.math.BigDecimal(bigInteger75);
        org.apache.commons.math.linear.BigMatrix bigMatrix77 = bigMatrix67.scalarAdd(bigDecimal76);
        java.math.BigDecimal bigDecimal79 = new java.math.BigDecimal(0.0d);
        int int80 = bigDecimal79.intValue();
        java.math.BigDecimal bigDecimal82 = new java.math.BigDecimal(0.0d);
        int int83 = bigDecimal82.intValue();
        java.math.BigDecimal bigDecimal84 = bigDecimal79.min(bigDecimal82);
        java.math.BigInteger bigInteger85 = bigDecimal79.toBigInteger();
        java.math.BigDecimal bigDecimal87 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigDecimal bigDecimal88 = bigDecimal87.negate();
        java.math.BigDecimal bigDecimal89 = bigDecimal79.add(bigDecimal87);
        java.math.BigDecimal bigDecimal90 = bigDecimal76.divideToIntegralValue(bigDecimal89);
        org.apache.commons.math.linear.BigMatrix bigMatrix91 = bigMatrixImpl41.scalarMultiply(bigDecimal89);
        java.math.BigInteger bigInteger92 = bigDecimal89.unscaledValue();
        int int93 = bigDecimal4.compareTo(bigDecimal89);
        java.math.BigDecimal bigDecimal94 = bigDecimal89.abs();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal4", (bigDecimal1.compareTo(bigDecimal4) == 0) == bigDecimal1.equals(bigDecimal4));
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal3 = new java.math.BigDecimal(0.0d);
        java.lang.String str4 = bigDecimal3.toString();
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal7 = bigDecimal6.stripTrailingZeros();
        int int8 = bigDecimal6.signum();
        java.math.BigDecimal[] bigDecimalArray9 = bigDecimal3.divideAndRemainder(bigDecimal6);
        java.math.BigDecimal bigDecimal11 = bigDecimal3.pow((int) 'a');
        java.math.BigDecimal[] bigDecimalArray12 = new java.math.BigDecimal[] { bigDecimal1, bigDecimal3 };
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(bigDecimalArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl14 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray12);
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal[] bigDecimalArray19 = bigDecimal16.divideAndRemainder(bigDecimal18);
        java.math.BigDecimal[] bigDecimalArray20 = bigMatrixImpl14.preMultiply(bigDecimalArray19);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl21 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray19);
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(bigDecimalArray19);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl23 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray19);
        double[] doubleArray26 = new double[] { 1.0d, 100.0f };
        double[] doubleArray29 = new double[] { 1.0d, 100.0f };
        double[] doubleArray32 = new double[] { 1.0d, 100.0f };
        double[] doubleArray35 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray36 = new double[][] { doubleArray26, doubleArray29, doubleArray32, doubleArray35 };
        org.apache.commons.math.linear.BigMatrix bigMatrix37 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray36);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl38 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.BigMatrix bigMatrix39 = bigMatrixImpl38.transpose();
        int int40 = bigMatrixImpl38.getColumnDimension();
        java.math.BigDecimal[][] bigDecimalArray41 = bigMatrixImpl38.getDataRef();
        bigMatrixImpl38.setScale((int) (short) 100);
        boolean boolean44 = bigMatrixImpl38.isSingular();
        java.math.BigDecimal bigDecimal46 = new java.math.BigDecimal(0.0d);
        java.lang.String str47 = bigDecimal46.toString();
        java.math.BigDecimal bigDecimal49 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal50 = bigDecimal49.stripTrailingZeros();
        int int51 = bigDecimal49.signum();
        java.math.BigDecimal[] bigDecimalArray52 = bigDecimal46.divideAndRemainder(bigDecimal49);
        java.math.BigDecimal bigDecimal54 = bigDecimal46.pow((int) 'a');
        java.math.BigDecimal bigDecimal56 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal57 = bigDecimal56.stripTrailingZeros();
        float float58 = bigDecimal56.floatValue();
        java.math.BigDecimal bigDecimal59 = bigDecimal54.divideToIntegralValue(bigDecimal56);
        org.apache.commons.math.linear.BigMatrix bigMatrix60 = bigMatrixImpl38.scalarMultiply(bigDecimal56);
        java.math.BigDecimal[][] bigDecimalArray61 = bigMatrixImpl38.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix62 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray61);
        boolean boolean63 = bigMatrix62.isSingular();
        org.apache.commons.math.linear.BigMatrix bigMatrix64 = bigMatrixImpl23.preMultiply(bigMatrix62);
        java.math.BigDecimal bigDecimal67 = java.math.BigDecimal.valueOf(0L, (int) ' ');
        int int68 = bigDecimal67.scale();
        int int69 = bigDecimal67.intValueExact();
        java.math.BigDecimal bigDecimal72 = java.math.BigDecimal.valueOf(0L, (int) (short) 1);
        java.math.BigDecimal bigDecimal73 = bigDecimal67.add(bigDecimal72);
        boolean boolean74 = bigMatrixImpl23.equals((java.lang.Object) bigDecimal73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal3 and bigDecimal67", (bigDecimal3.compareTo(bigDecimal67) == 0) == bigDecimal3.equals(bigDecimal67));
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger3 = bigDecimal2.unscaledValue();
        java.math.BigDecimal bigDecimal4 = bigDecimal0.add(bigDecimal2);
        java.math.BigDecimal bigDecimal6 = bigDecimal2.setScale(100);
        java.math.BigInteger bigInteger7 = bigDecimal6.toBigIntegerExact();
        java.math.BigDecimal bigDecimal9 = bigDecimal6.movePointRight((int) 'a');
        java.math.BigDecimal bigDecimal11 = new java.math.BigDecimal(0.0d);
        int int12 = bigDecimal11.intValue();
        java.math.BigDecimal bigDecimal14 = new java.math.BigDecimal(0.0d);
        int int15 = bigDecimal14.intValue();
        java.math.BigDecimal bigDecimal16 = bigDecimal11.min(bigDecimal14);
        java.math.BigInteger bigInteger17 = bigDecimal11.toBigInteger();
        short short18 = bigDecimal11.shortValueExact();
        int int19 = bigDecimal11.precision();
        java.math.BigDecimal bigDecimal20 = bigDecimal9.subtract(bigDecimal11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal2 and bigDecimal6", (bigDecimal2.compareTo(bigDecimal6) == 0) == bigDecimal2.equals(bigDecimal6));
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
        java.lang.String[] strArray1 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl3 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix4 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray2);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl5 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray2);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl8 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl9 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl10 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl11 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        java.math.BigDecimal bigDecimal12 = bigMatrixImpl11.getTrace();
        java.math.BigDecimal bigDecimal13 = bigMatrixImpl11.getTrace();
        java.math.BigDecimal bigDecimal15 = new java.math.BigDecimal(0.0d);
        int int16 = bigDecimal15.intValue();
        java.math.BigDecimal bigDecimal18 = new java.math.BigDecimal(0.0d);
        int int19 = bigDecimal18.intValue();
        java.math.BigDecimal bigDecimal20 = bigDecimal15.min(bigDecimal18);
        int int21 = bigDecimal18.signum();
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = bigMatrixImpl11.scalarMultiply(bigDecimal18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal12 and bigDecimal15", (bigDecimal12.compareTo(bigDecimal15) == 0) == bigDecimal12.equals(bigDecimal15));
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
        double[] doubleArray2 = new double[] { 1.0d, 100.0f };
        double[] doubleArray5 = new double[] { 1.0d, 100.0f };
        double[] doubleArray8 = new double[] { 1.0d, 100.0f };
        double[] doubleArray11 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        boolean boolean14 = bigMatrix13.isSingular();
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = bigMatrix13.transpose();
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.valueOf((double) 0L);
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = bigMatrix15.scalarAdd(bigDecimal17);
        java.math.BigInteger bigInteger19 = bigDecimal17.unscaledValue();
        java.math.BigDecimal bigDecimal21 = new java.math.BigDecimal(bigInteger19, (int) (short) 10);
        java.math.BigDecimal bigDecimal23 = new java.math.BigDecimal(bigInteger19, (int) (short) -100);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal17 and bigDecimal21", (bigDecimal17.compareTo(bigDecimal21) == 0) == bigDecimal17.equals(bigDecimal21));
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) 'a', (int) (short) 10);
        java.math.BigDecimal[][] bigDecimalArray3 = bigMatrixImpl2.getDataRef();
        int int4 = bigMatrixImpl2.getScale();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray5 = bigMatrixImpl2.getDataAsDoubleArray();
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        java.lang.String str2 = bigDecimal1.toString();
        java.math.BigDecimal bigDecimal3 = bigDecimal1.plus();
        double double4 = bigDecimal1.doubleValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.scaleByPowerOfTen((int) (short) 35);
        java.math.BigDecimal bigDecimal7 = bigDecimal6.negate();
        byte byte8 = bigDecimal7.byteValueExact();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal6", (bigDecimal1.compareTo(bigDecimal6) == 0) == bigDecimal1.equals(bigDecimal6));
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
        java.lang.String[] strArray1 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl3 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        int int4 = bigMatrixImpl3.getColumnDimension();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl7 = new org.apache.commons.math.linear.BigMatrixImpl((int) (byte) 97, 97);
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = bigMatrixImpl7.getColumnMatrix(4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix10 = bigMatrixImpl3.preMultiply(bigMatrix9);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.min(bigDecimal4);
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal6 };
        java.math.BigDecimal bigDecimal9 = new java.math.BigDecimal(0.0d);
        int int10 = bigDecimal9.intValue();
        java.math.BigDecimal bigDecimal12 = new java.math.BigDecimal(0.0d);
        int int13 = bigDecimal12.intValue();
        java.math.BigDecimal bigDecimal14 = bigDecimal9.min(bigDecimal12);
        java.math.BigDecimal[] bigDecimalArray15 = new java.math.BigDecimal[] { bigDecimal14 };
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(0.0d);
        int int18 = bigDecimal17.intValue();
        java.math.BigDecimal bigDecimal20 = new java.math.BigDecimal(0.0d);
        int int21 = bigDecimal20.intValue();
        java.math.BigDecimal bigDecimal22 = bigDecimal17.min(bigDecimal20);
        java.math.BigDecimal[] bigDecimalArray23 = new java.math.BigDecimal[] { bigDecimal22 };
        java.math.BigDecimal[][] bigDecimalArray24 = new java.math.BigDecimal[][] { bigDecimalArray7, bigDecimalArray15, bigDecimalArray23 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl27 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        java.math.BigDecimal[][] bigDecimalArray28 = bigMatrixImpl27.getDataRef();
        java.math.BigDecimal bigDecimal29 = bigMatrixImpl27.getNorm();
        boolean boolean30 = bigMatrixImpl27.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix31 = bigMatrixImpl27.copy();
        double[] doubleArray33 = bigMatrixImpl27.getColumnAsDoubleArray((int) (byte) 0);
        java.math.BigDecimal bigDecimal34 = java.math.BigDecimal.TEN;
        org.apache.commons.math.linear.BigMatrix bigMatrix35 = bigMatrixImpl27.scalarMultiply(bigDecimal34);
        java.math.BigDecimal[][] bigDecimalArray36 = bigMatrixImpl27.getDataRef();
        int int37 = bigMatrixImpl27.getRowDimension();
        java.math.BigDecimal bigDecimal39 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal41 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal[] bigDecimalArray42 = bigDecimal39.divideAndRemainder(bigDecimal41);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray42);
        double[] doubleArray45 = bigMatrixImpl43.getRowAsDoubleArray(0);
        org.apache.commons.math.linear.BigMatrix bigMatrix46 = bigMatrixImpl43.copy();
        double[] doubleArray49 = new double[] { 1.0d, 100.0f };
        double[] doubleArray52 = new double[] { 1.0d, 100.0f };
        double[] doubleArray55 = new double[] { 1.0d, 100.0f };
        double[] doubleArray58 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray59 = new double[][] { doubleArray49, doubleArray52, doubleArray55, doubleArray58 };
        org.apache.commons.math.linear.BigMatrix bigMatrix60 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray59);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl61 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray59);
        org.apache.commons.math.linear.BigMatrix bigMatrix62 = bigMatrixImpl61.transpose();
        int int63 = bigMatrixImpl61.getColumnDimension();
        java.math.BigDecimal[][] bigDecimalArray64 = bigMatrixImpl61.getDataRef();
        org.apache.commons.math.linear.BigMatrix bigMatrix65 = bigMatrixImpl43.preMultiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl61);
        java.math.BigDecimal bigDecimal67 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal69 = new java.math.BigDecimal(0.0d);
        java.lang.String str70 = bigDecimal69.toString();
        java.math.BigDecimal bigDecimal72 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal73 = bigDecimal72.stripTrailingZeros();
        int int74 = bigDecimal72.signum();
        java.math.BigDecimal[] bigDecimalArray75 = bigDecimal69.divideAndRemainder(bigDecimal72);
        java.math.BigDecimal bigDecimal77 = bigDecimal69.pow((int) 'a');
        java.math.BigDecimal[] bigDecimalArray78 = new java.math.BigDecimal[] { bigDecimal67, bigDecimal69 };
        org.apache.commons.math.linear.BigMatrix bigMatrix79 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(bigDecimalArray78);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl80 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray78);
        org.apache.commons.math.linear.BigMatrix bigMatrix81 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(bigDecimalArray78);
        java.math.BigDecimal[] bigDecimalArray82 = bigMatrixImpl43.preMultiply(bigDecimalArray78);
        org.apache.commons.math.linear.BigMatrix bigMatrix83 = bigMatrixImpl43.copy();
        java.math.BigDecimal bigDecimal85 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger86 = bigDecimal85.unscaledValue();
        short short87 = bigDecimal85.shortValueExact();
        java.math.BigInteger bigInteger88 = bigDecimal85.toBigInteger();
        java.math.BigDecimal bigDecimal90 = new java.math.BigDecimal(bigInteger88, (int) (byte) 1);
        java.math.BigDecimal bigDecimal92 = new java.math.BigDecimal(bigInteger88, (int) (byte) 110);
        org.apache.commons.math.linear.BigMatrix bigMatrix93 = bigMatrixImpl43.scalarAdd(bigDecimal92);
        java.math.BigDecimal bigDecimal95 = bigDecimal92.scaleByPowerOfTen((-100));
        org.apache.commons.math.linear.BigMatrix bigMatrix96 = bigMatrixImpl27.scalarAdd(bigDecimal95);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal34 and bigDecimal90", (bigDecimal34.compareTo(bigDecimal90) == 0) == bigDecimal34.equals(bigDecimal90));
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.min(bigDecimal4);
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal6 };
        java.math.BigDecimal bigDecimal9 = new java.math.BigDecimal(0.0d);
        int int10 = bigDecimal9.intValue();
        java.math.BigDecimal bigDecimal12 = new java.math.BigDecimal(0.0d);
        int int13 = bigDecimal12.intValue();
        java.math.BigDecimal bigDecimal14 = bigDecimal9.min(bigDecimal12);
        java.math.BigDecimal[] bigDecimalArray15 = new java.math.BigDecimal[] { bigDecimal14 };
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(0.0d);
        int int18 = bigDecimal17.intValue();
        java.math.BigDecimal bigDecimal20 = new java.math.BigDecimal(0.0d);
        int int21 = bigDecimal20.intValue();
        java.math.BigDecimal bigDecimal22 = bigDecimal17.min(bigDecimal20);
        java.math.BigDecimal[] bigDecimalArray23 = new java.math.BigDecimal[] { bigDecimal22 };
        java.math.BigDecimal[][] bigDecimalArray24 = new java.math.BigDecimal[][] { bigDecimalArray7, bigDecimalArray15, bigDecimalArray23 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl27 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        java.math.BigDecimal[][] bigDecimalArray28 = bigMatrixImpl27.getDataRef();
        java.math.BigDecimal bigDecimal29 = bigMatrixImpl27.getNorm();
        boolean boolean30 = bigMatrixImpl27.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix31 = bigMatrixImpl27.copy();
        double[] doubleArray33 = bigMatrixImpl27.getColumnAsDoubleArray((int) (byte) 0);
        java.lang.String[] strArray35 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray36 = new java.lang.String[][] { strArray35 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(strArray36);
        org.apache.commons.math.linear.BigMatrix bigMatrix38 = bigMatrixImpl27.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl37);
        double[] doubleArray43 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix44 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray43);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray43);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = realMatrix45.scalarAdd((double) 6);
        int int48 = realMatrix45.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix50 = realMatrix45.scalarAdd(10.0d);
        double[] doubleArray55 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix56 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray55);
        double double57 = realMatrix56.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix59 = realMatrix56.scalarAdd((double) '4');
        org.apache.commons.math.linear.RealMatrix realMatrix60 = realMatrix50.preMultiply(realMatrix59);
        boolean boolean61 = bigMatrixImpl37.equals((java.lang.Object) realMatrix59);
        java.math.BigDecimal bigDecimal62 = bigMatrixImpl37.getNorm();
        java.math.BigDecimal bigDecimal64 = bigDecimal62.scaleByPowerOfTen((int) '4');
        java.math.BigInteger bigInteger65 = bigDecimal62.toBigIntegerExact();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal64", (bigDecimal1.compareTo(bigDecimal64) == 0) == bigDecimal1.equals(bigDecimal64));
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal((double) 97);
        java.math.BigDecimal bigDecimal3 = new java.math.BigDecimal(0.0d);
        java.lang.String str4 = bigDecimal3.toString();
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal7 = bigDecimal6.stripTrailingZeros();
        int int8 = bigDecimal6.signum();
        java.math.BigDecimal[] bigDecimalArray9 = bigDecimal3.divideAndRemainder(bigDecimal6);
        java.math.BigDecimal bigDecimal11 = bigDecimal3.pow((int) 'a');
        java.math.BigDecimal bigDecimal13 = new java.math.BigDecimal(0.0d);
        java.lang.String str14 = bigDecimal13.toString();
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal17 = bigDecimal16.stripTrailingZeros();
        int int18 = bigDecimal16.signum();
        java.math.BigDecimal[] bigDecimalArray19 = bigDecimal13.divideAndRemainder(bigDecimal16);
        java.math.BigDecimal bigDecimal21 = bigDecimal13.pow((int) 'a');
        java.math.BigInteger bigInteger22 = bigDecimal13.toBigIntegerExact();
        java.math.BigDecimal bigDecimal23 = bigDecimal11.add(bigDecimal13);
        java.math.BigInteger bigInteger24 = bigDecimal23.unscaledValue();
        double[] doubleArray27 = new double[] { 1.0d, 100.0f };
        double[] doubleArray30 = new double[] { 1.0d, 100.0f };
        double[] doubleArray33 = new double[] { 1.0d, 100.0f };
        double[] doubleArray36 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray37 = new double[][] { doubleArray27, doubleArray30, doubleArray33, doubleArray36 };
        org.apache.commons.math.linear.BigMatrix bigMatrix38 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray37);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray37);
        org.apache.commons.math.linear.BigMatrix bigMatrix40 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray37);
        org.apache.commons.math.linear.BigMatrix bigMatrix41 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray37);
        java.math.BigDecimal bigDecimal43 = new java.math.BigDecimal(0.0d);
        int int44 = bigDecimal43.intValue();
        java.math.BigDecimal bigDecimal46 = new java.math.BigDecimal(0.0d);
        int int47 = bigDecimal46.intValue();
        java.math.BigDecimal bigDecimal48 = bigDecimal43.min(bigDecimal46);
        java.math.BigInteger bigInteger49 = bigDecimal43.toBigInteger();
        java.math.BigDecimal bigDecimal50 = new java.math.BigDecimal(bigInteger49);
        org.apache.commons.math.linear.BigMatrix bigMatrix51 = bigMatrix41.scalarAdd(bigDecimal50);
        java.math.BigDecimal[] bigDecimalArray52 = new java.math.BigDecimal[] { bigDecimal1, bigDecimal23, bigDecimal50 };
        org.apache.commons.math.linear.BigMatrix bigMatrix53 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(bigDecimalArray52);
        org.apache.commons.math.linear.BigMatrix bigMatrix54 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(bigDecimalArray52);
        org.apache.commons.math.linear.BigMatrix bigMatrix55 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(bigDecimalArray52);
        java.math.BigDecimal bigDecimal56 = bigMatrix55.getNorm();
        java.math.BigDecimal[][] bigDecimalArray57 = bigMatrix55.getData();
        java.math.BigDecimal bigDecimal59 = new java.math.BigDecimal(0.0d);
        java.lang.String str60 = bigDecimal59.toString();
        java.math.BigDecimal bigDecimal62 = bigDecimal59.setScale(0);
        byte byte63 = bigDecimal62.byteValueExact();
        int int64 = bigDecimal62.precision();
        int int65 = bigDecimal62.intValueExact();
        short short66 = bigDecimal62.shortValueExact();
        java.math.BigInteger bigInteger67 = bigDecimal62.unscaledValue();
        java.math.BigDecimal bigDecimal68 = new java.math.BigDecimal(bigInteger67);
        java.math.BigDecimal bigDecimal70 = bigDecimal68.scaleByPowerOfTen((int) (byte) -54);
        java.math.BigDecimal bigDecimal71 = bigDecimal70.stripTrailingZeros();
        org.apache.commons.math.linear.BigMatrix bigMatrix72 = bigMatrix55.scalarAdd(bigDecimal71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal3 and bigDecimal70", (bigDecimal3.compareTo(bigDecimal70) == 0) == bigDecimal3.equals(bigDecimal70));
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
        java.lang.String[] strArray1 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl3 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix4 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray2);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl6 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        java.math.BigDecimal bigDecimal7 = bigMatrixImpl6.getTrace();
        java.math.BigDecimal bigDecimal8 = bigMatrixImpl6.getDeterminant();
        org.apache.commons.math.linear.BigMatrix bigMatrix9 = bigMatrixImpl6.copy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal7 and bigDecimal8", (bigDecimal7.compareTo(bigDecimal8) == 0) == bigDecimal7.equals(bigDecimal8));
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        long long3 = bigDecimal1.longValue();
        long long4 = bigDecimal1.longValueExact();
        int int5 = bigDecimal1.precision();
        java.math.BigDecimal bigDecimal7 = new java.math.BigDecimal(0.0d);
        int int8 = bigDecimal7.intValue();
        long long9 = bigDecimal7.longValue();
        long long10 = bigDecimal7.longValueExact();
        java.math.BigDecimal bigDecimal11 = bigDecimal1.add(bigDecimal7);
        java.math.BigDecimal bigDecimal13 = bigDecimal7.pow(3);
        java.math.BigInteger bigInteger14 = bigDecimal13.toBigIntegerExact();
        java.math.BigDecimal bigDecimal16 = new java.math.BigDecimal(bigInteger14, (int) 'a');
        java.math.BigDecimal bigDecimal18 = new java.math.BigDecimal(bigInteger14, 2805);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal16", (bigDecimal1.compareTo(bigDecimal16) == 0) == bigDecimal1.equals(bigDecimal16));
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (byte) 10, (int) (short) 100);
        org.apache.commons.math.linear.BigMatrix bigMatrix4 = org.apache.commons.math.linear.MatrixUtils.createBigIdentityMatrix((int) (short) 100);
        boolean boolean5 = bigMatrix4.isSquare();
        java.math.BigDecimal[] bigDecimalArray7 = bigMatrix4.getRow(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal[] bigDecimalArray8 = bigMatrixImpl2.operate(bigDecimalArray7);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        java.lang.String str2 = bigDecimal1.toString();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal5 = bigDecimal4.stripTrailingZeros();
        int int6 = bigDecimal4.signum();
        java.math.BigDecimal[] bigDecimalArray7 = bigDecimal1.divideAndRemainder(bigDecimal4);
        java.math.BigDecimal bigDecimal9 = bigDecimal1.pow((int) 'a');
        java.math.BigDecimal bigDecimal11 = new java.math.BigDecimal(0.0d);
        java.lang.String str12 = bigDecimal11.toString();
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal15 = bigDecimal14.stripTrailingZeros();
        int int16 = bigDecimal14.signum();
        java.math.BigDecimal[] bigDecimalArray17 = bigDecimal11.divideAndRemainder(bigDecimal14);
        java.math.BigDecimal bigDecimal19 = bigDecimal11.pow((int) 'a');
        java.math.BigInteger bigInteger20 = bigDecimal11.toBigIntegerExact();
        java.math.BigDecimal bigDecimal21 = bigDecimal9.add(bigDecimal11);
        java.math.BigDecimal bigDecimal23 = new java.math.BigDecimal(0.0d);
        java.lang.String str24 = bigDecimal23.toString();
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal27 = bigDecimal26.stripTrailingZeros();
        int int28 = bigDecimal26.signum();
        java.math.BigDecimal[] bigDecimalArray29 = bigDecimal23.divideAndRemainder(bigDecimal26);
        java.math.BigDecimal bigDecimal31 = bigDecimal23.pow((int) 'a');
        java.math.BigInteger bigInteger32 = bigDecimal23.toBigIntegerExact();
        float float33 = bigDecimal23.floatValue();
        java.math.BigDecimal bigDecimal34 = bigDecimal9.add(bigDecimal23);
        java.math.BigInteger bigInteger35 = bigDecimal23.toBigInteger();
        double double36 = bigDecimal23.doubleValue();
        java.math.BigDecimal bigDecimal38 = bigDecimal23.movePointLeft((int) (short) 100);
        long long39 = bigDecimal23.longValueExact();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal38", (bigDecimal1.compareTo(bigDecimal38) == 0) == bigDecimal1.equals(bigDecimal38));
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        java.math.BigDecimal bigDecimal2 = bigDecimal1.stripTrailingZeros();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        int int6 = bigDecimal5.scale();
        java.math.BigDecimal bigDecimal8 = new java.math.BigDecimal((double) 2805.0f);
        java.math.BigDecimal bigDecimal10 = bigDecimal8.setScale((int) '4');
        java.math.BigDecimal bigDecimal11 = bigDecimal5.multiply(bigDecimal8);
        java.math.BigDecimal bigDecimal14 = bigDecimal1.divide(bigDecimal8, (int) '#', 2);
        java.lang.String str15 = bigDecimal1.toEngineeringString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal2 and bigDecimal14", (bigDecimal2.compareTo(bigDecimal14) == 0) == bigDecimal2.equals(bigDecimal14));
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal3 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal[] bigDecimalArray4 = bigDecimal1.divideAndRemainder(bigDecimal3);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl5 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = bigMatrixImpl5.copy();
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = bigMatrixImpl5.copy();
        bigMatrixImpl5.setRoundingMode(10);
        java.lang.String[] strArray11 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray12 = new java.lang.String[][] { strArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(strArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl14 = new org.apache.commons.math.linear.BigMatrixImpl(strArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(strArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(strArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = bigMatrixImpl5.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl16);
        java.math.BigDecimal bigDecimal18 = bigMatrixImpl16.getTrace();
        double[] doubleArray23 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix24 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray23);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray23);
        org.apache.commons.math.linear.RealMatrix realMatrix27 = realMatrix25.scalarAdd((double) 6);
        int int28 = realMatrix25.getRowDimension();
        org.apache.commons.math.linear.RealMatrix realMatrix30 = realMatrix25.scalarAdd(10.0d);
        double[] doubleArray35 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix36 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray35);
        double double37 = realMatrix36.getNorm();
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrix36.scalarAdd((double) '4');
        org.apache.commons.math.linear.RealMatrix realMatrix40 = realMatrix30.preMultiply(realMatrix39);
        org.apache.commons.math.linear.RealMatrix realMatrix42 = realMatrix40.scalarAdd((double) 1.0f);
        boolean boolean43 = bigMatrixImpl16.equals((java.lang.Object) realMatrix40);
        java.math.BigDecimal bigDecimal44 = bigMatrixImpl16.getNorm();
        int int45 = bigMatrixImpl16.getRowDimension();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal18 and bigDecimal44", (bigDecimal18.compareTo(bigDecimal44) == 0) == bigDecimal18.equals(bigDecimal44));
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
        double[] doubleArray2 = new double[] { 1.0d, 100.0f };
        double[] doubleArray5 = new double[] { 1.0d, 100.0f };
        double[] doubleArray8 = new double[] { 1.0d, 100.0f };
        double[] doubleArray11 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl14 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = bigMatrixImpl14.transpose();
        int int16 = bigMatrixImpl14.getColumnDimension();
        java.math.BigDecimal bigDecimal17 = bigMatrixImpl14.getNorm();
        int int18 = bigMatrixImpl14.getScale();
        boolean boolean19 = bigMatrixImpl14.isSingular();
        int int20 = bigMatrixImpl14.getRoundingMode();
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = bigMatrixImpl14.copy();
        java.math.BigDecimal bigDecimal23 = new java.math.BigDecimal((long) 0);
        java.math.BigDecimal bigDecimal25 = bigDecimal23.pow(4);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = bigMatrixImpl14.scalarMultiply(bigDecimal25);
        java.math.BigDecimal bigDecimal28 = bigDecimal25.movePointLeft(32);
        java.math.BigDecimal bigDecimal30 = new java.math.BigDecimal((double) (short) 10);
        double[] doubleArray33 = new double[] { 1.0d, 100.0f };
        double[] doubleArray36 = new double[] { 1.0d, 100.0f };
        double[] doubleArray39 = new double[] { 1.0d, 100.0f };
        double[] doubleArray42 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray43 = new double[][] { doubleArray33, doubleArray36, doubleArray39, doubleArray42 };
        org.apache.commons.math.linear.BigMatrix bigMatrix44 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray43);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray43);
        org.apache.commons.math.linear.BigMatrix bigMatrix46 = bigMatrixImpl45.transpose();
        java.math.BigDecimal bigDecimal47 = bigMatrixImpl45.getNorm();
        int int48 = bigDecimal47.signum();
        java.math.BigDecimal bigDecimal50 = bigDecimal47.movePointLeft((int) (byte) 97);
        java.lang.String str51 = bigDecimal50.toString();
        int int52 = bigDecimal30.compareTo(bigDecimal50);
        java.math.BigDecimal bigDecimal53 = bigDecimal25.remainder(bigDecimal50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal23 and bigDecimal28", (bigDecimal23.compareTo(bigDecimal28) == 0) == bigDecimal23.equals(bigDecimal28));
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.min(bigDecimal4);
        java.math.BigDecimal bigDecimal7 = bigDecimal1.plus();
        java.math.BigInteger bigInteger8 = bigDecimal7.toBigIntegerExact();
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger12 = bigDecimal11.unscaledValue();
        java.math.BigDecimal bigDecimal13 = bigDecimal9.add(bigDecimal11);
        float float14 = bigDecimal11.floatValue();
        java.lang.String str15 = bigDecimal11.toEngineeringString();
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(0.0d);
        int int18 = bigDecimal17.intValue();
        long long19 = bigDecimal17.longValue();
        long long20 = bigDecimal17.longValueExact();
        int int21 = bigDecimal17.precision();
        java.math.BigDecimal bigDecimal23 = new java.math.BigDecimal(0.0d);
        int int24 = bigDecimal23.intValue();
        long long25 = bigDecimal23.longValue();
        long long26 = bigDecimal23.longValueExact();
        java.math.BigDecimal bigDecimal27 = bigDecimal17.add(bigDecimal23);
        java.math.BigDecimal bigDecimal29 = bigDecimal23.pow(3);
        java.math.BigInteger bigInteger30 = bigDecimal29.toBigIntegerExact();
        java.math.BigDecimal bigDecimal31 = bigDecimal29.stripTrailingZeros();
        java.math.BigDecimal bigDecimal32 = bigDecimal11.add(bigDecimal29);
        java.math.BigDecimal bigDecimal34 = new java.math.BigDecimal(0.0d);
        int int35 = bigDecimal34.intValue();
        java.math.BigDecimal bigDecimal37 = new java.math.BigDecimal(0.0d);
        int int38 = bigDecimal37.intValue();
        java.math.BigDecimal bigDecimal39 = bigDecimal34.min(bigDecimal37);
        java.math.BigDecimal[] bigDecimalArray40 = new java.math.BigDecimal[] { bigDecimal39 };
        java.math.BigDecimal bigDecimal42 = new java.math.BigDecimal(0.0d);
        int int43 = bigDecimal42.intValue();
        java.math.BigDecimal bigDecimal45 = new java.math.BigDecimal(0.0d);
        int int46 = bigDecimal45.intValue();
        java.math.BigDecimal bigDecimal47 = bigDecimal42.min(bigDecimal45);
        java.math.BigDecimal[] bigDecimalArray48 = new java.math.BigDecimal[] { bigDecimal47 };
        java.math.BigDecimal bigDecimal50 = new java.math.BigDecimal(0.0d);
        int int51 = bigDecimal50.intValue();
        java.math.BigDecimal bigDecimal53 = new java.math.BigDecimal(0.0d);
        int int54 = bigDecimal53.intValue();
        java.math.BigDecimal bigDecimal55 = bigDecimal50.min(bigDecimal53);
        java.math.BigDecimal[] bigDecimalArray56 = new java.math.BigDecimal[] { bigDecimal55 };
        java.math.BigDecimal[][] bigDecimalArray57 = new java.math.BigDecimal[][] { bigDecimalArray40, bigDecimalArray48, bigDecimalArray56 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl58 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray57);
        org.apache.commons.math.linear.BigMatrix bigMatrix59 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray57);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl60 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray57);
        java.math.BigDecimal[][] bigDecimalArray61 = bigMatrixImpl60.getDataRef();
        java.math.BigDecimal bigDecimal62 = bigMatrixImpl60.getNorm();
        boolean boolean63 = bigMatrixImpl60.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix64 = bigMatrixImpl60.copy();
        double[] doubleArray66 = bigMatrixImpl60.getColumnAsDoubleArray((int) (byte) 0);
        java.math.BigDecimal bigDecimal67 = java.math.BigDecimal.TEN;
        org.apache.commons.math.linear.BigMatrix bigMatrix68 = bigMatrixImpl60.scalarMultiply(bigDecimal67);
        java.math.BigDecimal bigDecimal71 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) ' ');
        org.apache.commons.math.linear.BigMatrix bigMatrix72 = bigMatrixImpl60.scalarAdd(bigDecimal71);
        java.math.BigDecimal bigDecimal74 = bigDecimal71.movePointLeft((int) (short) -100);
        java.math.BigDecimal bigDecimal76 = new java.math.BigDecimal(0.0d);
        int int77 = bigDecimal76.intValue();
        long long78 = bigDecimal76.longValue();
        java.math.BigDecimal bigDecimal79 = bigDecimal71.min(bigDecimal76);
        java.math.BigDecimal bigDecimal80 = bigDecimal29.multiply(bigDecimal76);
        java.math.BigDecimal bigDecimal82 = bigDecimal29.setScale(5);
        java.math.BigDecimal bigDecimal83 = bigDecimal7.min(bigDecimal82);
        float float84 = bigDecimal7.floatValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal7 and bigDecimal82", (bigDecimal7.compareTo(bigDecimal82) == 0) == bigDecimal7.equals(bigDecimal82));
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal((int) (byte) 97);
        java.math.BigDecimal bigDecimal3 = bigDecimal1.setScale(5);
        java.math.BigDecimal bigDecimal5 = bigDecimal3.movePointRight(5);
        java.math.BigDecimal bigDecimal7 = bigDecimal3.movePointLeft((int) (short) 100);
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger11 = bigDecimal10.unscaledValue();
        java.math.BigDecimal bigDecimal12 = bigDecimal8.add(bigDecimal10);
        float float13 = bigDecimal10.floatValue();
        java.math.BigDecimal bigDecimal15 = bigDecimal10.setScale((int) (short) 97);
        java.math.BigDecimal bigDecimal16 = bigDecimal3.remainder(bigDecimal15);
        short short17 = bigDecimal16.shortValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal3", (bigDecimal1.compareTo(bigDecimal3) == 0) == bigDecimal1.equals(bigDecimal3));
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
        double[] doubleArray2 = new double[] { 1.0d, 100.0f };
        double[] doubleArray5 = new double[] { 1.0d, 100.0f };
        double[] doubleArray8 = new double[] { 1.0d, 100.0f };
        double[] doubleArray11 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        boolean boolean14 = bigMatrix13.isSingular();
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = bigMatrix13.copy();
        java.math.BigDecimal bigDecimal16 = bigMatrix13.getNorm();
        java.math.BigDecimal bigDecimal17 = bigDecimal16.abs();
        java.math.BigDecimal bigDecimal18 = bigDecimal16.stripTrailingZeros();
        java.math.BigDecimal bigDecimal21 = bigDecimal16.setScale((-300), 4);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal16 and bigDecimal18", (bigDecimal16.compareTo(bigDecimal18) == 0) == bigDecimal16.equals(bigDecimal18));
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        java.lang.String str2 = bigDecimal1.toString();
        java.math.BigDecimal bigDecimal4 = bigDecimal1.setScale(0);
        java.math.BigDecimal bigDecimal6 = new java.math.BigDecimal(0.0d);
        int int7 = bigDecimal6.intValue();
        long long8 = bigDecimal6.longValue();
        long long9 = bigDecimal6.longValueExact();
        short short10 = bigDecimal6.shortValueExact();
        java.math.BigDecimal bigDecimal11 = bigDecimal1.add(bigDecimal6);
        double[] doubleArray14 = new double[] { 1.0d, 100.0f };
        double[] doubleArray17 = new double[] { 1.0d, 100.0f };
        double[] doubleArray20 = new double[] { 1.0d, 100.0f };
        double[] doubleArray23 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray24 = new double[][] { doubleArray14, doubleArray17, doubleArray20, doubleArray23 };
        org.apache.commons.math.linear.BigMatrix bigMatrix25 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray24);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl26 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray24);
        org.apache.commons.math.linear.BigMatrix bigMatrix27 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray24);
        org.apache.commons.math.linear.BigMatrix bigMatrix28 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray24);
        java.math.BigDecimal bigDecimal30 = new java.math.BigDecimal(0.0d);
        int int31 = bigDecimal30.intValue();
        java.math.BigDecimal bigDecimal33 = new java.math.BigDecimal(0.0d);
        int int34 = bigDecimal33.intValue();
        java.math.BigDecimal bigDecimal35 = bigDecimal30.min(bigDecimal33);
        java.math.BigInteger bigInteger36 = bigDecimal30.toBigInteger();
        java.math.BigDecimal bigDecimal37 = new java.math.BigDecimal(bigInteger36);
        org.apache.commons.math.linear.BigMatrix bigMatrix38 = bigMatrix28.scalarAdd(bigDecimal37);
        java.math.BigDecimal bigDecimal39 = bigDecimal37.plus();
        java.math.BigDecimal bigDecimal40 = bigDecimal11.min(bigDecimal39);
        int int41 = bigDecimal11.signum();
        java.math.BigDecimal bigDecimal43 = bigDecimal11.setScale(546084);
        java.math.BigDecimal bigDecimal45 = new java.math.BigDecimal(0.0d);
        java.lang.String str46 = bigDecimal45.toString();
        java.math.BigDecimal bigDecimal48 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal49 = bigDecimal48.stripTrailingZeros();
        int int50 = bigDecimal48.signum();
        java.math.BigDecimal[] bigDecimalArray51 = bigDecimal45.divideAndRemainder(bigDecimal48);
        java.math.BigDecimal bigDecimal53 = bigDecimal45.pow((int) 'a');
        java.math.BigDecimal bigDecimal55 = new java.math.BigDecimal(0.0d);
        java.lang.String str56 = bigDecimal55.toString();
        java.math.BigDecimal bigDecimal58 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal59 = bigDecimal58.stripTrailingZeros();
        int int60 = bigDecimal58.signum();
        java.math.BigDecimal[] bigDecimalArray61 = bigDecimal55.divideAndRemainder(bigDecimal58);
        java.math.BigDecimal bigDecimal63 = bigDecimal55.pow((int) 'a');
        java.math.BigInteger bigInteger64 = bigDecimal55.toBigIntegerExact();
        java.math.BigDecimal bigDecimal65 = bigDecimal53.add(bigDecimal55);
        java.math.BigDecimal bigDecimal67 = new java.math.BigDecimal(0.0d);
        java.lang.String str68 = bigDecimal67.toString();
        java.math.BigDecimal bigDecimal70 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal71 = bigDecimal70.stripTrailingZeros();
        int int72 = bigDecimal70.signum();
        java.math.BigDecimal[] bigDecimalArray73 = bigDecimal67.divideAndRemainder(bigDecimal70);
        java.math.BigDecimal bigDecimal75 = bigDecimal67.pow((int) 'a');
        java.math.BigInteger bigInteger76 = bigDecimal67.toBigIntegerExact();
        float float77 = bigDecimal67.floatValue();
        java.math.BigDecimal bigDecimal78 = bigDecimal53.add(bigDecimal67);
        java.math.BigDecimal bigDecimal80 = new java.math.BigDecimal((int) (byte) 100);
        java.math.BigDecimal bigDecimal81 = bigDecimal67.divideToIntegralValue(bigDecimal80);
        java.math.BigDecimal bigDecimal82 = bigDecimal11.subtract(bigDecimal81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal43", (bigDecimal1.compareTo(bigDecimal43) == 0) == bigDecimal1.equals(bigDecimal43));
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
        java.lang.String[] strArray1 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl3 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl4 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl5 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        java.math.BigDecimal bigDecimal6 = bigMatrixImpl5.getTrace();
        java.math.BigDecimal bigDecimal8 = new java.math.BigDecimal(0.0d);
        int int9 = bigDecimal8.intValue();
        long long10 = bigDecimal8.longValue();
        long long11 = bigDecimal8.longValueExact();
        int int12 = bigDecimal8.precision();
        java.math.BigDecimal bigDecimal14 = new java.math.BigDecimal(0.0d);
        int int15 = bigDecimal14.intValue();
        long long16 = bigDecimal14.longValue();
        long long17 = bigDecimal14.longValueExact();
        java.math.BigDecimal bigDecimal18 = bigDecimal8.add(bigDecimal14);
        byte byte19 = bigDecimal8.byteValueExact();
        java.math.BigDecimal bigDecimal21 = bigDecimal8.movePointLeft((int) (byte) -1);
        java.math.BigDecimal bigDecimal23 = java.math.BigDecimal.valueOf((double) 10);
        java.math.BigDecimal bigDecimal24 = bigDecimal8.min(bigDecimal23);
        java.math.BigDecimal bigDecimal25 = bigDecimal6.subtract(bigDecimal24);
        java.math.BigInteger bigInteger26 = bigDecimal24.unscaledValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal6 and bigDecimal24", (bigDecimal6.compareTo(bigDecimal24) == 0) == bigDecimal6.equals(bigDecimal24));
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test625");
        double[] doubleArray6 = new double[] { 97.0f, 2, (-1.0d), 10, 10, 0L };
        double[] doubleArray13 = new double[] { 97.0f, 2, (-1.0d), 10, 10, 0L };
        double[] doubleArray20 = new double[] { 97.0f, 2, (-1.0d), 10, 10, 0L };
        double[] doubleArray27 = new double[] { 97.0f, 2, (-1.0d), 10, 10, 0L };
        double[][] doubleArray28 = new double[][] { doubleArray6, doubleArray13, doubleArray20, doubleArray27 };
        org.apache.commons.math.linear.RealMatrix realMatrix29 = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(doubleArray28);
        double[][] doubleArray30 = realMatrix29.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl31 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray30);
        java.math.BigDecimal[][] bigDecimalArray32 = bigMatrixImpl31.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix33 = bigMatrixImpl31.copy();
        org.apache.commons.math.linear.BigMatrix bigMatrix34 = bigMatrixImpl31.copy();
        double[][] doubleArray35 = bigMatrix34.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrix bigMatrix36 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray35);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray35);
        java.math.BigDecimal bigDecimal39 = java.math.BigDecimal.valueOf((double) (short) -100);
        java.math.BigDecimal bigDecimal41 = new java.math.BigDecimal((int) (byte) 97);
        java.math.BigDecimal bigDecimal43 = bigDecimal41.setScale(5);
        java.math.BigDecimal bigDecimal45 = new java.math.BigDecimal((long) (short) 100);
        java.lang.String str46 = bigDecimal45.toEngineeringString();
        int int47 = bigDecimal43.compareTo(bigDecimal45);
        java.math.BigDecimal bigDecimal48 = bigDecimal39.multiply(bigDecimal43);
        java.math.BigDecimal bigDecimal49 = bigDecimal43.stripTrailingZeros();
        int int50 = bigDecimal43.signum();
        boolean boolean51 = bigMatrixImpl37.equals((java.lang.Object) int50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal41 and bigDecimal43", (bigDecimal41.compareTo(bigDecimal43) == 0) == bigDecimal41.equals(bigDecimal43));
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test626");
        double[] doubleArray2 = new double[] { 1.0d, 100.0f };
        double[] doubleArray5 = new double[] { 1.0d, 100.0f };
        double[] doubleArray8 = new double[] { 1.0d, 100.0f };
        double[] doubleArray11 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl14 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = bigMatrixImpl14.transpose();
        double[] doubleArray17 = bigMatrixImpl14.getRowAsDoubleArray((int) (short) 0);
        boolean boolean18 = bigMatrixImpl14.isSingular();
        boolean boolean19 = bigMatrixImpl14.isSquare();
        int int20 = bigMatrixImpl14.getScale();
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal23 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger24 = bigDecimal23.unscaledValue();
        java.math.BigDecimal bigDecimal25 = bigDecimal21.add(bigDecimal23);
        java.math.BigDecimal bigDecimal27 = bigDecimal23.setScale(100);
        boolean boolean28 = bigMatrixImpl14.equals((java.lang.Object) bigDecimal23);
        java.math.BigDecimal bigDecimal29 = bigDecimal23.ulp();
        java.math.BigDecimal bigDecimal31 = new java.math.BigDecimal(0.0d);
        java.lang.String str32 = bigDecimal31.toString();
        java.math.BigDecimal bigDecimal34 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal35 = bigDecimal34.stripTrailingZeros();
        int int36 = bigDecimal34.signum();
        java.math.BigDecimal[] bigDecimalArray37 = bigDecimal31.divideAndRemainder(bigDecimal34);
        java.math.BigDecimal bigDecimal39 = bigDecimal31.pow((int) 'a');
        java.math.BigInteger bigInteger40 = bigDecimal31.toBigIntegerExact();
        int int41 = bigDecimal31.precision();
        java.math.BigDecimal bigDecimal43 = new java.math.BigDecimal(0.0d);
        java.lang.String str44 = bigDecimal43.toString();
        java.math.BigDecimal bigDecimal46 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal47 = bigDecimal46.stripTrailingZeros();
        int int48 = bigDecimal46.signum();
        java.math.BigDecimal[] bigDecimalArray49 = bigDecimal43.divideAndRemainder(bigDecimal46);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl50 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray49);
        java.math.BigDecimal bigDecimal51 = bigMatrixImpl50.getNorm();
        java.math.BigDecimal bigDecimal53 = new java.math.BigDecimal(0.0d);
        java.lang.String str54 = bigDecimal53.toString();
        java.math.BigDecimal bigDecimal56 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal57 = bigDecimal56.stripTrailingZeros();
        int int58 = bigDecimal56.signum();
        java.math.BigDecimal[] bigDecimalArray59 = bigDecimal53.divideAndRemainder(bigDecimal56);
        java.math.BigDecimal bigDecimal61 = bigDecimal53.pow((int) 'a');
        java.math.BigDecimal bigDecimal63 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal64 = bigDecimal63.stripTrailingZeros();
        float float65 = bigDecimal63.floatValue();
        java.math.BigDecimal bigDecimal66 = bigDecimal61.divideToIntegralValue(bigDecimal63);
        boolean boolean67 = bigMatrixImpl50.equals((java.lang.Object) bigDecimal63);
        java.math.BigDecimal[] bigDecimalArray68 = bigDecimal31.divideAndRemainder(bigDecimal63);
        double[] doubleArray73 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix74 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray73);
        org.apache.commons.math.linear.RealMatrix realMatrix75 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray73);
        org.apache.commons.math.linear.RealMatrix realMatrix76 = org.apache.commons.math.linear.MatrixUtils.createColumnRealMatrix(doubleArray73);
        org.apache.commons.math.linear.BigMatrix bigMatrix77 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray73);
        boolean boolean78 = bigDecimal63.equals((java.lang.Object) bigMatrix77);
        java.math.BigDecimal[] bigDecimalArray79 = bigDecimal23.divideAndRemainder(bigDecimal63);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl80 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal23 and bigDecimal27", (bigDecimal23.compareTo(bigDecimal27) == 0) == bigDecimal23.equals(bigDecimal27));
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test627");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        java.lang.String str2 = bigDecimal1.toString();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal5 = bigDecimal4.stripTrailingZeros();
        int int6 = bigDecimal4.signum();
        java.math.BigDecimal[] bigDecimalArray7 = bigDecimal1.divideAndRemainder(bigDecimal4);
        java.math.BigDecimal bigDecimal9 = bigDecimal1.pow((int) 'a');
        java.math.BigDecimal bigDecimal11 = new java.math.BigDecimal(0.0d);
        java.lang.String str12 = bigDecimal11.toString();
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal15 = bigDecimal14.stripTrailingZeros();
        int int16 = bigDecimal14.signum();
        java.math.BigDecimal[] bigDecimalArray17 = bigDecimal11.divideAndRemainder(bigDecimal14);
        java.math.BigDecimal bigDecimal19 = bigDecimal11.pow((int) 'a');
        java.math.BigInteger bigInteger20 = bigDecimal11.toBigIntegerExact();
        java.math.BigDecimal bigDecimal21 = bigDecimal9.add(bigDecimal11);
        java.math.BigDecimal bigDecimal23 = new java.math.BigDecimal(0.0d);
        java.lang.String str24 = bigDecimal23.toString();
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal27 = bigDecimal26.stripTrailingZeros();
        int int28 = bigDecimal26.signum();
        java.math.BigDecimal[] bigDecimalArray29 = bigDecimal23.divideAndRemainder(bigDecimal26);
        java.math.BigDecimal bigDecimal31 = bigDecimal23.pow((int) 'a');
        java.math.BigInteger bigInteger32 = bigDecimal23.toBigIntegerExact();
        float float33 = bigDecimal23.floatValue();
        java.math.BigDecimal bigDecimal34 = bigDecimal9.add(bigDecimal23);
        java.math.BigInteger bigInteger35 = bigDecimal23.toBigIntegerExact();
        java.math.BigDecimal bigDecimal36 = new java.math.BigDecimal(bigInteger35);
        int int37 = bigDecimal36.precision();
        java.math.BigDecimal bigDecimal39 = bigDecimal36.setScale((int) (short) 97);
        float float40 = bigDecimal36.floatValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal39", (bigDecimal1.compareTo(bigDecimal39) == 0) == bigDecimal1.equals(bigDecimal39));
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test628");
        java.lang.String[] strArray1 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl3 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        int int4 = bigMatrixImpl3.getColumnDimension();
        java.math.BigDecimal[][] bigDecimalArray5 = bigMatrixImpl3.getData();
        int int6 = bigMatrixImpl3.getRoundingMode();
        java.math.BigDecimal bigDecimal7 = bigMatrixImpl3.getTrace();
        int int8 = bigMatrixImpl3.getColumnDimension();
        java.math.BigDecimal bigDecimal9 = bigMatrixImpl3.getTrace();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal[] bigDecimalArray14 = bigDecimal11.divideAndRemainder(bigDecimal13);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray14);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = bigMatrixImpl15.copy();
        boolean boolean17 = bigMatrixImpl15.isSingular();
        int int18 = bigMatrixImpl15.getRowDimension();
        bigMatrixImpl15.setRoundingMode((int) (byte) 10);
        java.math.BigDecimal[][] bigDecimalArray21 = bigMatrixImpl15.getDataRef();
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray21);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl23 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray21);
        double[] doubleArray28 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix29 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray28);
        double[] doubleArray34 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix35 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray34);
        double[] doubleArray36 = realMatrix29.operate(doubleArray34);
        org.apache.commons.math.linear.BigMatrix bigMatrix37 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray34);
        org.apache.commons.math.linear.RealMatrix realMatrix38 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray34);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = realMatrix38.transpose();
        double[][] doubleArray40 = realMatrix38.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray40);
        boolean boolean42 = bigMatrixImpl41.isSingular();
        int int43 = bigMatrixImpl41.getScale();
        double[][] doubleArray44 = bigMatrixImpl41.getDataAsDoubleArray();
        bigMatrixImpl41.setRoundingMode((-32));
        int int47 = bigMatrixImpl41.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray48 = bigMatrixImpl41.getData();
        java.math.BigDecimal[][] bigDecimalArray49 = bigMatrixImpl41.getData();
        java.math.BigDecimal[][] bigDecimalArray50 = bigMatrixImpl41.getData();
        java.math.BigDecimal bigDecimal52 = new java.math.BigDecimal(0.0d);
        java.lang.String str53 = bigDecimal52.toString();
        java.math.BigDecimal bigDecimal55 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal56 = bigDecimal55.stripTrailingZeros();
        int int57 = bigDecimal55.signum();
        java.math.BigDecimal[] bigDecimalArray58 = bigDecimal52.divideAndRemainder(bigDecimal55);
        java.math.BigDecimal bigDecimal60 = bigDecimal52.pow((int) 'a');
        java.math.BigDecimal bigDecimal62 = new java.math.BigDecimal(0.0d);
        java.lang.String str63 = bigDecimal62.toString();
        java.math.BigDecimal bigDecimal65 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal66 = bigDecimal65.stripTrailingZeros();
        int int67 = bigDecimal65.signum();
        java.math.BigDecimal[] bigDecimalArray68 = bigDecimal62.divideAndRemainder(bigDecimal65);
        java.math.BigDecimal bigDecimal70 = bigDecimal62.pow((int) 'a');
        java.math.BigInteger bigInteger71 = bigDecimal62.toBigIntegerExact();
        java.math.BigDecimal bigDecimal72 = bigDecimal60.add(bigDecimal62);
        java.math.BigDecimal bigDecimal73 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal75 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger76 = bigDecimal75.unscaledValue();
        java.math.BigDecimal bigDecimal77 = bigDecimal73.add(bigDecimal75);
        java.math.BigDecimal bigDecimal78 = bigDecimal62.multiply(bigDecimal73);
        java.math.BigDecimal bigDecimal80 = bigDecimal73.scaleByPowerOfTen(0);
        org.apache.commons.math.linear.BigMatrix bigMatrix81 = bigMatrixImpl41.scalarAdd(bigDecimal80);
        org.apache.commons.math.linear.BigMatrix bigMatrix82 = bigMatrixImpl23.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl41);
        org.apache.commons.math.linear.BigMatrix bigMatrix83 = bigMatrixImpl3.preMultiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal7 and bigDecimal52", (bigDecimal7.compareTo(bigDecimal52) == 0) == bigDecimal7.equals(bigDecimal52));
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test629");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.min(bigDecimal4);
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal6 };
        java.math.BigDecimal bigDecimal9 = new java.math.BigDecimal(0.0d);
        int int10 = bigDecimal9.intValue();
        java.math.BigDecimal bigDecimal12 = new java.math.BigDecimal(0.0d);
        int int13 = bigDecimal12.intValue();
        java.math.BigDecimal bigDecimal14 = bigDecimal9.min(bigDecimal12);
        java.math.BigDecimal[] bigDecimalArray15 = new java.math.BigDecimal[] { bigDecimal14 };
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(0.0d);
        int int18 = bigDecimal17.intValue();
        java.math.BigDecimal bigDecimal20 = new java.math.BigDecimal(0.0d);
        int int21 = bigDecimal20.intValue();
        java.math.BigDecimal bigDecimal22 = bigDecimal17.min(bigDecimal20);
        java.math.BigDecimal[] bigDecimalArray23 = new java.math.BigDecimal[] { bigDecimal22 };
        java.math.BigDecimal[][] bigDecimalArray24 = new java.math.BigDecimal[][] { bigDecimalArray7, bigDecimalArray15, bigDecimalArray23 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl27 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        java.math.BigDecimal[][] bigDecimalArray28 = bigMatrixImpl27.getDataRef();
        java.math.BigDecimal bigDecimal29 = bigMatrixImpl27.getNorm();
        boolean boolean30 = bigMatrixImpl27.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix31 = bigMatrixImpl27.copy();
        double[] doubleArray33 = bigMatrixImpl27.getColumnAsDoubleArray((int) (byte) 0);
        java.lang.String[] strArray35 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray36 = new java.lang.String[][] { strArray35 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(strArray36);
        org.apache.commons.math.linear.BigMatrix bigMatrix38 = bigMatrixImpl27.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl37);
        java.math.BigDecimal bigDecimal39 = bigMatrixImpl27.getNorm();
        java.math.BigDecimal[][] bigDecimalArray40 = bigMatrixImpl27.getData();
        boolean boolean41 = bigMatrixImpl27.isSquare();
        java.lang.String[] strArray43 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray44 = new java.lang.String[][] { strArray43 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = new org.apache.commons.math.linear.BigMatrixImpl(strArray44);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl46 = new org.apache.commons.math.linear.BigMatrixImpl(strArray44);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl47 = new org.apache.commons.math.linear.BigMatrixImpl(strArray44);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl48 = new org.apache.commons.math.linear.BigMatrixImpl(strArray44);
        org.apache.commons.math.linear.BigMatrix bigMatrix49 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray44);
        org.apache.commons.math.linear.BigMatrix bigMatrix50 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray44);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl51 = new org.apache.commons.math.linear.BigMatrixImpl(strArray44);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl52 = new org.apache.commons.math.linear.BigMatrixImpl(strArray44);
        java.math.BigDecimal bigDecimal53 = bigMatrixImpl52.getNorm();
        java.lang.String str54 = bigMatrixImpl52.toString();
        java.math.BigDecimal bigDecimal55 = bigMatrixImpl52.getTrace();
        org.apache.commons.math.linear.BigMatrix bigMatrix56 = bigMatrixImpl27.scalarAdd(bigDecimal55);
        org.apache.commons.math.linear.BigMatrix bigMatrix58 = bigMatrixImpl27.getRowMatrix((int) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal55", (bigDecimal1.compareTo(bigDecimal55) == 0) == bigDecimal1.equals(bigDecimal55));
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test630");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger2 = bigDecimal1.unscaledValue();
        java.math.BigDecimal bigDecimal3 = bigDecimal1.stripTrailingZeros();
        java.math.BigDecimal bigDecimal5 = bigDecimal1.movePointRight((int) (short) -1);
        int int6 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal7 = bigDecimal1.abs();
        int int8 = bigDecimal7.scale();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal7 and bigDecimal3", (bigDecimal7.compareTo(bigDecimal3) == 0) == bigDecimal7.equals(bigDecimal3));
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test631");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.min(bigDecimal4);
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal6 };
        java.math.BigDecimal bigDecimal9 = new java.math.BigDecimal(0.0d);
        int int10 = bigDecimal9.intValue();
        java.math.BigDecimal bigDecimal12 = new java.math.BigDecimal(0.0d);
        int int13 = bigDecimal12.intValue();
        java.math.BigDecimal bigDecimal14 = bigDecimal9.min(bigDecimal12);
        java.math.BigDecimal[] bigDecimalArray15 = new java.math.BigDecimal[] { bigDecimal14 };
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(0.0d);
        int int18 = bigDecimal17.intValue();
        java.math.BigDecimal bigDecimal20 = new java.math.BigDecimal(0.0d);
        int int21 = bigDecimal20.intValue();
        java.math.BigDecimal bigDecimal22 = bigDecimal17.min(bigDecimal20);
        java.math.BigDecimal[] bigDecimalArray23 = new java.math.BigDecimal[] { bigDecimal22 };
        java.math.BigDecimal[][] bigDecimalArray24 = new java.math.BigDecimal[][] { bigDecimalArray7, bigDecimalArray15, bigDecimalArray23 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl27 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        java.math.BigDecimal[][] bigDecimalArray28 = bigMatrixImpl27.getDataRef();
        java.math.BigDecimal bigDecimal29 = bigMatrixImpl27.getNorm();
        boolean boolean30 = bigMatrixImpl27.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix31 = bigMatrixImpl27.copy();
        double[] doubleArray33 = bigMatrixImpl27.getColumnAsDoubleArray((int) (byte) 0);
        java.lang.String[] strArray35 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray36 = new java.lang.String[][] { strArray35 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(strArray36);
        org.apache.commons.math.linear.BigMatrix bigMatrix38 = bigMatrixImpl27.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl37);
        java.math.BigDecimal bigDecimal40 = new java.math.BigDecimal(0.0d);
        java.lang.String str41 = bigDecimal40.toString();
        java.math.BigDecimal bigDecimal43 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal44 = bigDecimal43.stripTrailingZeros();
        int int45 = bigDecimal43.signum();
        java.math.BigDecimal[] bigDecimalArray46 = bigDecimal40.divideAndRemainder(bigDecimal43);
        java.math.BigDecimal bigDecimal48 = bigDecimal40.pow((int) 'a');
        java.math.BigDecimal bigDecimal50 = new java.math.BigDecimal(0.0d);
        java.lang.String str51 = bigDecimal50.toString();
        java.math.BigDecimal bigDecimal53 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal54 = bigDecimal53.stripTrailingZeros();
        int int55 = bigDecimal53.signum();
        java.math.BigDecimal[] bigDecimalArray56 = bigDecimal50.divideAndRemainder(bigDecimal53);
        java.math.BigDecimal bigDecimal58 = bigDecimal50.pow((int) 'a');
        java.math.BigInteger bigInteger59 = bigDecimal50.toBigIntegerExact();
        java.math.BigDecimal bigDecimal60 = bigDecimal48.add(bigDecimal50);
        java.math.BigInteger bigInteger61 = bigDecimal60.unscaledValue();
        java.math.BigInteger bigInteger62 = bigDecimal60.toBigIntegerExact();
        boolean boolean63 = bigMatrixImpl27.equals((java.lang.Object) bigInteger62);
        int int64 = bigMatrixImpl27.getRowDimension();
        int int65 = bigMatrixImpl27.getRowDimension();
        bigMatrixImpl27.setRoundingMode(3);
        java.math.BigDecimal bigDecimal70 = java.math.BigDecimal.valueOf(0L, (-32));
        java.math.BigDecimal bigDecimal71 = bigDecimal70.ulp();
        boolean boolean72 = bigMatrixImpl27.equals((java.lang.Object) bigDecimal71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal70", (bigDecimal1.compareTo(bigDecimal70) == 0) == bigDecimal1.equals(bigDecimal70));
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test632");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((long) (short) 100);
        float float2 = bigDecimal1.floatValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal7 = new java.math.BigDecimal(0.0d);
        int int8 = bigDecimal7.intValue();
        java.math.BigDecimal bigDecimal9 = bigDecimal4.min(bigDecimal7);
        java.math.BigDecimal[] bigDecimalArray10 = new java.math.BigDecimal[] { bigDecimal9 };
        java.math.BigDecimal bigDecimal12 = new java.math.BigDecimal(0.0d);
        int int13 = bigDecimal12.intValue();
        java.math.BigDecimal bigDecimal15 = new java.math.BigDecimal(0.0d);
        int int16 = bigDecimal15.intValue();
        java.math.BigDecimal bigDecimal17 = bigDecimal12.min(bigDecimal15);
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal17 };
        java.math.BigDecimal bigDecimal20 = new java.math.BigDecimal(0.0d);
        int int21 = bigDecimal20.intValue();
        java.math.BigDecimal bigDecimal23 = new java.math.BigDecimal(0.0d);
        int int24 = bigDecimal23.intValue();
        java.math.BigDecimal bigDecimal25 = bigDecimal20.min(bigDecimal23);
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray10, bigDecimalArray18, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        org.apache.commons.math.linear.BigMatrix bigMatrix29 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray27);
        java.math.BigDecimal bigDecimal31 = new java.math.BigDecimal(0.0d);
        int int32 = bigDecimal31.intValue();
        java.math.BigDecimal bigDecimal34 = new java.math.BigDecimal(0.0d);
        int int35 = bigDecimal34.intValue();
        java.math.BigDecimal bigDecimal36 = bigDecimal31.min(bigDecimal34);
        java.math.BigInteger bigInteger37 = bigDecimal31.toBigInteger();
        java.math.BigDecimal bigDecimal38 = new java.math.BigDecimal(bigInteger37);
        java.math.BigDecimal bigDecimal40 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal41 = bigDecimal40.stripTrailingZeros();
        float float42 = bigDecimal40.floatValue();
        java.math.BigDecimal bigDecimal43 = bigDecimal38.multiply(bigDecimal40);
        org.apache.commons.math.linear.BigMatrix bigMatrix44 = bigMatrix29.scalarAdd(bigDecimal43);
        short short45 = bigDecimal43.shortValueExact();
        java.math.BigDecimal bigDecimal47 = java.math.BigDecimal.valueOf((long) (short) 100);
        int int48 = bigDecimal47.signum();
        java.math.BigDecimal[] bigDecimalArray49 = bigDecimal43.divideAndRemainder(bigDecimal47);
        java.math.BigDecimal bigDecimal50 = bigDecimal1.min(bigDecimal43);
        double[] doubleArray53 = new double[] { 1.0d, 100.0f };
        double[] doubleArray56 = new double[] { 1.0d, 100.0f };
        double[] doubleArray59 = new double[] { 1.0d, 100.0f };
        double[] doubleArray62 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray63 = new double[][] { doubleArray53, doubleArray56, doubleArray59, doubleArray62 };
        org.apache.commons.math.linear.BigMatrix bigMatrix64 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray63);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl65 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray63);
        org.apache.commons.math.linear.BigMatrix bigMatrix66 = bigMatrixImpl65.transpose();
        double[] doubleArray68 = bigMatrixImpl65.getRowAsDoubleArray((int) (short) 0);
        boolean boolean69 = bigMatrixImpl65.isSingular();
        java.math.BigDecimal[][] bigDecimalArray70 = bigMatrixImpl65.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl71 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray70);
        java.math.BigDecimal bigDecimal73 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigDecimal bigDecimal74 = bigDecimal73.negate();
        int int75 = bigDecimal74.scale();
        boolean boolean76 = bigMatrixImpl71.equals((java.lang.Object) bigDecimal74);
        java.math.BigDecimal bigDecimal78 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger79 = bigDecimal78.unscaledValue();
        java.lang.String str80 = bigDecimal78.toPlainString();
        java.math.BigDecimal bigDecimal81 = bigDecimal74.divideToIntegralValue(bigDecimal78);
        java.math.BigDecimal bigDecimal82 = bigDecimal74.ulp();
        java.math.BigDecimal bigDecimal83 = bigDecimal43.min(bigDecimal74);
        java.lang.String str84 = bigDecimal43.toString();
        java.math.BigDecimal bigDecimal86 = bigDecimal43.movePointLeft(970);
        int int87 = bigDecimal43.precision();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal4 and bigDecimal86", (bigDecimal4.compareTo(bigDecimal86) == 0) == bigDecimal4.equals(bigDecimal86));
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test633");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.min(bigDecimal4);
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal6 };
        java.math.BigDecimal bigDecimal9 = new java.math.BigDecimal(0.0d);
        int int10 = bigDecimal9.intValue();
        java.math.BigDecimal bigDecimal12 = new java.math.BigDecimal(0.0d);
        int int13 = bigDecimal12.intValue();
        java.math.BigDecimal bigDecimal14 = bigDecimal9.min(bigDecimal12);
        java.math.BigDecimal[] bigDecimalArray15 = new java.math.BigDecimal[] { bigDecimal14 };
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(0.0d);
        int int18 = bigDecimal17.intValue();
        java.math.BigDecimal bigDecimal20 = new java.math.BigDecimal(0.0d);
        int int21 = bigDecimal20.intValue();
        java.math.BigDecimal bigDecimal22 = bigDecimal17.min(bigDecimal20);
        java.math.BigDecimal[] bigDecimalArray23 = new java.math.BigDecimal[] { bigDecimal22 };
        java.math.BigDecimal[][] bigDecimalArray24 = new java.math.BigDecimal[][] { bigDecimalArray7, bigDecimalArray15, bigDecimalArray23 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray24);
        java.math.BigDecimal bigDecimal28 = new java.math.BigDecimal(0.0d);
        int int29 = bigDecimal28.intValue();
        java.math.BigDecimal bigDecimal31 = new java.math.BigDecimal(0.0d);
        int int32 = bigDecimal31.intValue();
        java.math.BigDecimal bigDecimal33 = bigDecimal28.min(bigDecimal31);
        java.math.BigInteger bigInteger34 = bigDecimal28.toBigInteger();
        java.math.BigDecimal bigDecimal35 = new java.math.BigDecimal(bigInteger34);
        java.math.BigDecimal bigDecimal37 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal38 = bigDecimal37.stripTrailingZeros();
        float float39 = bigDecimal37.floatValue();
        java.math.BigDecimal bigDecimal40 = bigDecimal35.multiply(bigDecimal37);
        org.apache.commons.math.linear.BigMatrix bigMatrix41 = bigMatrix26.scalarAdd(bigDecimal40);
        int int42 = bigDecimal40.intValue();
        java.math.BigDecimal bigDecimal43 = bigDecimal40.stripTrailingZeros();
        java.math.BigDecimal bigDecimal45 = bigDecimal43.movePointLeft((int) (byte) 100);
        java.math.BigDecimal bigDecimal46 = bigDecimal45.ulp();
        java.math.BigInteger bigInteger47 = bigDecimal45.unscaledValue();
        java.math.BigDecimal bigDecimal48 = new java.math.BigDecimal(bigInteger47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal45", (bigDecimal1.compareTo(bigDecimal45) == 0) == bigDecimal1.equals(bigDecimal45));
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test634");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (byte) 110, (int) (byte) 100);
        java.math.BigDecimal[][] bigDecimalArray3 = bigMatrixImpl2.getDataRef();
        org.apache.commons.math.linear.BigMatrix bigMatrix4 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrixImpl2 and bigMatrixImpl2", bigMatrixImpl2.equals(bigMatrixImpl2) ? bigMatrixImpl2.hashCode() == bigMatrixImpl2.hashCode() : true);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test635");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.min(bigDecimal4);
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal6 };
        java.math.BigDecimal bigDecimal9 = new java.math.BigDecimal(0.0d);
        int int10 = bigDecimal9.intValue();
        java.math.BigDecimal bigDecimal12 = new java.math.BigDecimal(0.0d);
        int int13 = bigDecimal12.intValue();
        java.math.BigDecimal bigDecimal14 = bigDecimal9.min(bigDecimal12);
        java.math.BigDecimal[] bigDecimalArray15 = new java.math.BigDecimal[] { bigDecimal14 };
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(0.0d);
        int int18 = bigDecimal17.intValue();
        java.math.BigDecimal bigDecimal20 = new java.math.BigDecimal(0.0d);
        int int21 = bigDecimal20.intValue();
        java.math.BigDecimal bigDecimal22 = bigDecimal17.min(bigDecimal20);
        java.math.BigDecimal[] bigDecimalArray23 = new java.math.BigDecimal[] { bigDecimal22 };
        java.math.BigDecimal[][] bigDecimalArray24 = new java.math.BigDecimal[][] { bigDecimalArray7, bigDecimalArray15, bigDecimalArray23 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl27 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        java.math.BigDecimal[][] bigDecimalArray28 = bigMatrixImpl27.getDataRef();
        java.math.BigDecimal bigDecimal29 = bigMatrixImpl27.getNorm();
        boolean boolean30 = bigMatrixImpl27.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix31 = bigMatrixImpl27.copy();
        double[] doubleArray33 = bigMatrixImpl27.getColumnAsDoubleArray((int) (byte) 0);
        java.math.BigDecimal[][] bigDecimalArray34 = bigMatrixImpl27.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix35 = bigMatrixImpl27.transpose();
        java.math.BigDecimal[][] bigDecimalArray36 = bigMatrixImpl27.getData();
        int int37 = bigMatrixImpl27.getScale();
        java.math.BigDecimal bigDecimal40 = java.math.BigDecimal.valueOf((long) 0, (int) (short) -100);
        java.math.BigDecimal bigDecimal41 = bigDecimal40.stripTrailingZeros();
        java.math.BigDecimal bigDecimal43 = new java.math.BigDecimal(0.0d);
        java.lang.String str44 = bigDecimal43.toString();
        java.math.BigDecimal bigDecimal46 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal47 = bigDecimal46.stripTrailingZeros();
        int int48 = bigDecimal46.signum();
        java.math.BigDecimal[] bigDecimalArray49 = bigDecimal43.divideAndRemainder(bigDecimal46);
        java.math.BigDecimal bigDecimal51 = bigDecimal43.pow((int) 'a');
        java.math.BigInteger bigInteger52 = bigDecimal43.toBigIntegerExact();
        float float53 = bigDecimal43.floatValue();
        double[] doubleArray58 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix59 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray58);
        double[] doubleArray64 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix65 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray64);
        double[] doubleArray66 = realMatrix59.operate(doubleArray64);
        org.apache.commons.math.linear.BigMatrix bigMatrix67 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray66);
        java.math.BigDecimal bigDecimal68 = bigMatrix67.getNorm();
        java.math.BigDecimal bigDecimal69 = bigDecimal43.subtract(bigDecimal68);
        int int70 = bigDecimal69.signum();
        java.math.BigInteger bigInteger71 = bigDecimal69.toBigInteger();
        java.math.BigDecimal bigDecimal73 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal75 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal[] bigDecimalArray76 = bigDecimal73.divideAndRemainder(bigDecimal75);
        java.math.BigDecimal bigDecimal78 = bigDecimal75.movePointLeft((-1));
        java.math.BigDecimal bigDecimal79 = bigDecimal69.max(bigDecimal75);
        int int80 = bigDecimal75.precision();
        java.math.BigDecimal bigDecimal81 = bigDecimal40.divide(bigDecimal75);
        org.apache.commons.math.linear.BigMatrix bigMatrix82 = bigMatrixImpl27.scalarAdd(bigDecimal75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal40", (bigDecimal1.compareTo(bigDecimal40) == 0) == bigDecimal1.equals(bigDecimal40));
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test636");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal((double) 2805.0f);
        java.math.BigDecimal bigDecimal3 = bigDecimal1.setScale((int) '4');
        java.math.BigDecimal bigDecimal5 = bigDecimal3.movePointRight((-32));
        java.math.BigDecimal bigDecimal7 = new java.math.BigDecimal(0.0d);
        int int8 = bigDecimal7.intValue();
        java.math.BigDecimal bigDecimal10 = new java.math.BigDecimal(0.0d);
        int int11 = bigDecimal10.intValue();
        java.math.BigDecimal bigDecimal12 = bigDecimal7.min(bigDecimal10);
        java.math.BigInteger bigInteger13 = bigDecimal7.toBigInteger();
        java.math.BigInteger bigInteger14 = bigDecimal7.unscaledValue();
        int int15 = bigDecimal7.signum();
        java.math.BigDecimal bigDecimal16 = bigDecimal3.add(bigDecimal7);
        byte byte17 = bigDecimal7.byteValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal3", (bigDecimal1.compareTo(bigDecimal3) == 0) == bigDecimal1.equals(bigDecimal3));
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test637");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        java.lang.String str2 = bigDecimal1.toString();
        java.math.BigDecimal bigDecimal4 = bigDecimal1.setScale(0);
        java.math.BigDecimal bigDecimal6 = new java.math.BigDecimal(0.0d);
        int int7 = bigDecimal6.intValue();
        long long8 = bigDecimal6.longValue();
        long long9 = bigDecimal6.longValueExact();
        short short10 = bigDecimal6.shortValueExact();
        java.math.BigDecimal bigDecimal11 = bigDecimal1.add(bigDecimal6);
        java.math.BigDecimal bigDecimal12 = bigDecimal11.ulp();
        long long13 = bigDecimal11.longValueExact();
        double[] doubleArray16 = new double[] { 1.0d, 100.0f };
        double[] doubleArray19 = new double[] { 1.0d, 100.0f };
        double[] doubleArray22 = new double[] { 1.0d, 100.0f };
        double[] doubleArray25 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray26 = new double[][] { doubleArray16, doubleArray19, doubleArray22, doubleArray25 };
        org.apache.commons.math.linear.BigMatrix bigMatrix27 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray26);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray26);
        org.apache.commons.math.linear.BigMatrix bigMatrix29 = bigMatrixImpl28.transpose();
        double[] doubleArray31 = bigMatrixImpl28.getRowAsDoubleArray((int) (short) 0);
        boolean boolean32 = bigMatrixImpl28.isSingular();
        java.math.BigDecimal[][] bigDecimalArray33 = bigMatrixImpl28.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33);
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigDecimal bigDecimal37 = bigDecimal36.negate();
        int int38 = bigDecimal37.scale();
        boolean boolean39 = bigMatrixImpl34.equals((java.lang.Object) bigDecimal37);
        java.lang.String str40 = bigDecimal37.toEngineeringString();
        java.math.BigDecimal bigDecimal41 = bigDecimal37.stripTrailingZeros();
        java.math.BigDecimal bigDecimal43 = new java.math.BigDecimal(0.0d);
        int int44 = bigDecimal43.intValue();
        long long45 = bigDecimal43.longValue();
        long long46 = bigDecimal43.longValueExact();
        int int47 = bigDecimal43.precision();
        java.math.BigDecimal bigDecimal49 = new java.math.BigDecimal(0.0d);
        int int50 = bigDecimal49.intValue();
        long long51 = bigDecimal49.longValue();
        long long52 = bigDecimal49.longValueExact();
        java.math.BigDecimal bigDecimal53 = bigDecimal43.add(bigDecimal49);
        byte byte54 = bigDecimal43.byteValueExact();
        java.math.BigDecimal bigDecimal55 = bigDecimal41.add(bigDecimal43);
        java.math.BigDecimal bigDecimal56 = bigDecimal11.max(bigDecimal55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal37 and bigDecimal41", (bigDecimal37.compareTo(bigDecimal41) == 0) == bigDecimal37.equals(bigDecimal41));
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test638");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        java.lang.String str2 = bigDecimal1.toString();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal5 = bigDecimal4.stripTrailingZeros();
        int int6 = bigDecimal4.signum();
        java.math.BigDecimal[] bigDecimalArray7 = bigDecimal1.divideAndRemainder(bigDecimal4);
        java.math.BigDecimal bigDecimal9 = bigDecimal1.pow((int) 'a');
        java.math.BigDecimal bigDecimal11 = new java.math.BigDecimal(0.0d);
        java.lang.String str12 = bigDecimal11.toString();
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal15 = bigDecimal14.stripTrailingZeros();
        int int16 = bigDecimal14.signum();
        java.math.BigDecimal[] bigDecimalArray17 = bigDecimal11.divideAndRemainder(bigDecimal14);
        java.math.BigDecimal bigDecimal19 = bigDecimal11.pow((int) 'a');
        java.math.BigInteger bigInteger20 = bigDecimal11.toBigIntegerExact();
        java.math.BigDecimal bigDecimal21 = bigDecimal9.add(bigDecimal11);
        java.math.BigInteger bigInteger22 = bigDecimal21.unscaledValue();
        java.math.BigInteger bigInteger23 = bigDecimal21.toBigIntegerExact();
        java.math.BigDecimal bigDecimal25 = new java.math.BigDecimal(bigInteger23, (-35));
        java.math.BigDecimal bigDecimal27 = new java.math.BigDecimal(0.0d);
        int int28 = bigDecimal27.intValue();
        java.math.BigDecimal bigDecimal30 = new java.math.BigDecimal(0.0d);
        int int31 = bigDecimal30.intValue();
        java.math.BigDecimal bigDecimal32 = bigDecimal27.min(bigDecimal30);
        java.math.BigDecimal[] bigDecimalArray33 = new java.math.BigDecimal[] { bigDecimal32 };
        java.math.BigDecimal bigDecimal35 = new java.math.BigDecimal(0.0d);
        int int36 = bigDecimal35.intValue();
        java.math.BigDecimal bigDecimal38 = new java.math.BigDecimal(0.0d);
        int int39 = bigDecimal38.intValue();
        java.math.BigDecimal bigDecimal40 = bigDecimal35.min(bigDecimal38);
        java.math.BigDecimal[] bigDecimalArray41 = new java.math.BigDecimal[] { bigDecimal40 };
        java.math.BigDecimal bigDecimal43 = new java.math.BigDecimal(0.0d);
        int int44 = bigDecimal43.intValue();
        java.math.BigDecimal bigDecimal46 = new java.math.BigDecimal(0.0d);
        int int47 = bigDecimal46.intValue();
        java.math.BigDecimal bigDecimal48 = bigDecimal43.min(bigDecimal46);
        java.math.BigDecimal[] bigDecimalArray49 = new java.math.BigDecimal[] { bigDecimal48 };
        java.math.BigDecimal[][] bigDecimalArray50 = new java.math.BigDecimal[][] { bigDecimalArray33, bigDecimalArray41, bigDecimalArray49 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl51 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray50);
        org.apache.commons.math.linear.BigMatrix bigMatrix52 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray50);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl53 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray50);
        int int54 = bigMatrixImpl53.getScale();
        java.math.BigDecimal bigDecimal56 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigDecimal bigDecimal57 = bigDecimal56.negate();
        org.apache.commons.math.linear.BigMatrix bigMatrix58 = bigMatrixImpl53.scalarMultiply(bigDecimal56);
        java.math.BigInteger bigInteger59 = bigDecimal56.unscaledValue();
        java.math.BigDecimal bigDecimal61 = new java.math.BigDecimal((long) (byte) -100);
        java.math.BigDecimal bigDecimal62 = bigDecimal56.subtract(bigDecimal61);
        java.math.BigInteger bigInteger63 = bigDecimal56.toBigInteger();
        java.math.BigDecimal bigDecimal64 = new java.math.BigDecimal(bigInteger63);
        java.math.BigDecimal bigDecimal65 = new java.math.BigDecimal(bigInteger63);
        java.math.BigDecimal bigDecimal67 = new java.math.BigDecimal(bigInteger63, (-35));
        java.math.BigDecimal bigDecimal68 = new java.math.BigDecimal(bigInteger63);
        java.math.BigInteger bigInteger69 = bigDecimal68.unscaledValue();
        java.math.BigDecimal bigDecimal71 = bigDecimal68.setScale((int) '4');
        java.math.BigDecimal bigDecimal72 = bigDecimal25.multiply(bigDecimal68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal56 and bigDecimal71", (bigDecimal56.compareTo(bigDecimal71) == 0) == bigDecimal56.equals(bigDecimal71));
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test639");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal((long) (short) 100);
        java.lang.String str2 = bigDecimal1.toEngineeringString();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal7 = new java.math.BigDecimal(0.0d);
        int int8 = bigDecimal7.intValue();
        java.math.BigDecimal bigDecimal9 = bigDecimal4.min(bigDecimal7);
        java.math.BigDecimal[] bigDecimalArray10 = new java.math.BigDecimal[] { bigDecimal9 };
        java.math.BigDecimal bigDecimal12 = new java.math.BigDecimal(0.0d);
        int int13 = bigDecimal12.intValue();
        java.math.BigDecimal bigDecimal15 = new java.math.BigDecimal(0.0d);
        int int16 = bigDecimal15.intValue();
        java.math.BigDecimal bigDecimal17 = bigDecimal12.min(bigDecimal15);
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal17 };
        java.math.BigDecimal bigDecimal20 = new java.math.BigDecimal(0.0d);
        int int21 = bigDecimal20.intValue();
        java.math.BigDecimal bigDecimal23 = new java.math.BigDecimal(0.0d);
        int int24 = bigDecimal23.intValue();
        java.math.BigDecimal bigDecimal25 = bigDecimal20.min(bigDecimal23);
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal25 };
        java.math.BigDecimal[][] bigDecimalArray27 = new java.math.BigDecimal[][] { bigDecimalArray10, bigDecimalArray18, bigDecimalArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray27);
        org.apache.commons.math.linear.BigMatrix bigMatrix29 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray27);
        java.math.BigDecimal bigDecimal31 = new java.math.BigDecimal(0.0d);
        int int32 = bigDecimal31.intValue();
        java.math.BigDecimal bigDecimal34 = new java.math.BigDecimal(0.0d);
        int int35 = bigDecimal34.intValue();
        java.math.BigDecimal bigDecimal36 = bigDecimal31.min(bigDecimal34);
        java.math.BigInteger bigInteger37 = bigDecimal31.toBigInteger();
        java.math.BigDecimal bigDecimal38 = new java.math.BigDecimal(bigInteger37);
        java.math.BigDecimal bigDecimal40 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal41 = bigDecimal40.stripTrailingZeros();
        float float42 = bigDecimal40.floatValue();
        java.math.BigDecimal bigDecimal43 = bigDecimal38.multiply(bigDecimal40);
        org.apache.commons.math.linear.BigMatrix bigMatrix44 = bigMatrix29.scalarAdd(bigDecimal43);
        short short45 = bigDecimal43.shortValueExact();
        java.math.BigDecimal bigDecimal46 = bigDecimal43.abs();
        java.math.BigDecimal bigDecimal48 = bigDecimal46.setScale((int) (byte) -1);
        int int49 = bigDecimal1.compareTo(bigDecimal46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal4 and bigDecimal48", (bigDecimal4.compareTo(bigDecimal48) == 0) == bigDecimal4.equals(bigDecimal48));
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test640");
        double[] doubleArray2 = new double[] { 1.0d, 100.0f };
        double[] doubleArray5 = new double[] { 1.0d, 100.0f };
        double[] doubleArray8 = new double[] { 1.0d, 100.0f };
        double[] doubleArray11 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl14 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        java.math.BigDecimal bigDecimal18 = new java.math.BigDecimal(0.0d);
        int int19 = bigDecimal18.intValue();
        java.math.BigDecimal bigDecimal21 = new java.math.BigDecimal(0.0d);
        int int22 = bigDecimal21.intValue();
        java.math.BigDecimal bigDecimal23 = bigDecimal18.min(bigDecimal21);
        java.math.BigInteger bigInteger24 = bigDecimal18.toBigInteger();
        java.math.BigDecimal bigDecimal25 = new java.math.BigDecimal(bigInteger24);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = bigMatrix16.scalarAdd(bigDecimal25);
        java.math.BigDecimal bigDecimal27 = bigDecimal25.plus();
        java.math.BigDecimal bigDecimal29 = bigDecimal25.movePointLeft((int) 'a');
        java.math.BigInteger bigInteger30 = bigDecimal29.toBigIntegerExact();
        java.math.BigDecimal bigDecimal32 = new java.math.BigDecimal(bigInteger30, (int) (byte) 11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal18 and bigDecimal29", (bigDecimal18.compareTo(bigDecimal29) == 0) == bigDecimal18.equals(bigDecimal29));
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test641");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal((double) (byte) -112);
        org.apache.commons.math.linear.RealMatrix realMatrix3 = org.apache.commons.math.linear.MatrixUtils.createRealIdentityMatrix((int) (byte) 97);
        double[] doubleArray5 = realMatrix3.getColumn(4);
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray5);
        boolean boolean7 = bigMatrix6.isSingular();
        boolean boolean8 = bigDecimal1.equals((java.lang.Object) bigMatrix6);
        java.lang.String str9 = bigDecimal1.toPlainString();
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.valueOf(1L, (int) (byte) 100);
        java.lang.String str13 = bigDecimal12.toString();
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.valueOf((long) 2, (int) (byte) 10);
        int int17 = bigDecimal16.intValue();
        java.math.BigDecimal bigDecimal18 = bigDecimal12.divideToIntegralValue(bigDecimal16);
        java.math.BigDecimal bigDecimal19 = bigDecimal1.add(bigDecimal16);
        java.math.BigDecimal bigDecimal20 = bigDecimal1.plus();
        java.math.BigDecimal bigDecimal22 = new java.math.BigDecimal(0.0d);
        java.lang.String str23 = bigDecimal22.toString();
        java.math.BigDecimal bigDecimal25 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal26 = bigDecimal25.stripTrailingZeros();
        int int27 = bigDecimal25.signum();
        java.math.BigDecimal[] bigDecimalArray28 = bigDecimal22.divideAndRemainder(bigDecimal25);
        java.math.BigDecimal bigDecimal30 = bigDecimal22.pow((int) 'a');
        java.math.BigInteger bigInteger31 = bigDecimal22.toBigIntegerExact();
        int int32 = bigDecimal22.precision();
        java.math.BigDecimal bigDecimal34 = new java.math.BigDecimal(0.0d);
        java.lang.String str35 = bigDecimal34.toString();
        java.math.BigDecimal bigDecimal37 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal38 = bigDecimal37.stripTrailingZeros();
        int int39 = bigDecimal37.signum();
        java.math.BigDecimal[] bigDecimalArray40 = bigDecimal34.divideAndRemainder(bigDecimal37);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray40);
        java.math.BigDecimal bigDecimal42 = bigMatrixImpl41.getNorm();
        java.math.BigDecimal bigDecimal44 = new java.math.BigDecimal(0.0d);
        java.lang.String str45 = bigDecimal44.toString();
        java.math.BigDecimal bigDecimal47 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal48 = bigDecimal47.stripTrailingZeros();
        int int49 = bigDecimal47.signum();
        java.math.BigDecimal[] bigDecimalArray50 = bigDecimal44.divideAndRemainder(bigDecimal47);
        java.math.BigDecimal bigDecimal52 = bigDecimal44.pow((int) 'a');
        java.math.BigDecimal bigDecimal54 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal55 = bigDecimal54.stripTrailingZeros();
        float float56 = bigDecimal54.floatValue();
        java.math.BigDecimal bigDecimal57 = bigDecimal52.divideToIntegralValue(bigDecimal54);
        boolean boolean58 = bigMatrixImpl41.equals((java.lang.Object) bigDecimal54);
        java.math.BigDecimal[] bigDecimalArray59 = bigDecimal22.divideAndRemainder(bigDecimal54);
        short short60 = bigDecimal54.shortValueExact();
        float float61 = bigDecimal54.floatValue();
        long long62 = bigDecimal54.longValueExact();
        java.math.BigDecimal bigDecimal63 = bigDecimal1.min(bigDecimal54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal18 and bigDecimal22", (bigDecimal18.compareTo(bigDecimal22) == 0) == bigDecimal18.equals(bigDecimal22));
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test642");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.min(bigDecimal4);
        java.math.BigInteger bigInteger7 = bigDecimal1.toBigInteger();
        int int8 = bigDecimal1.precision();
        java.lang.String str9 = bigDecimal1.toEngineeringString();
        int int10 = bigDecimal1.intValueExact();
        java.math.BigDecimal bigDecimal11 = bigDecimal1.stripTrailingZeros();
        java.math.BigDecimal bigDecimal13 = bigDecimal1.setScale((int) (byte) 11);
        float float14 = bigDecimal13.floatValue();
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.valueOf((double) (byte) -1);
        java.math.BigDecimal bigDecimal17 = bigDecimal13.divideToIntegralValue(bigDecimal16);
        long long18 = bigDecimal17.longValueExact();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal13", (bigDecimal1.compareTo(bigDecimal13) == 0) == bigDecimal1.equals(bigDecimal13));
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test643");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.min(bigDecimal4);
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal6 };
        java.math.BigDecimal bigDecimal9 = new java.math.BigDecimal(0.0d);
        int int10 = bigDecimal9.intValue();
        java.math.BigDecimal bigDecimal12 = new java.math.BigDecimal(0.0d);
        int int13 = bigDecimal12.intValue();
        java.math.BigDecimal bigDecimal14 = bigDecimal9.min(bigDecimal12);
        java.math.BigDecimal[] bigDecimalArray15 = new java.math.BigDecimal[] { bigDecimal14 };
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(0.0d);
        int int18 = bigDecimal17.intValue();
        java.math.BigDecimal bigDecimal20 = new java.math.BigDecimal(0.0d);
        int int21 = bigDecimal20.intValue();
        java.math.BigDecimal bigDecimal22 = bigDecimal17.min(bigDecimal20);
        java.math.BigDecimal[] bigDecimalArray23 = new java.math.BigDecimal[] { bigDecimal22 };
        java.math.BigDecimal[][] bigDecimalArray24 = new java.math.BigDecimal[][] { bigDecimalArray7, bigDecimalArray15, bigDecimalArray23 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray24);
        java.math.BigDecimal bigDecimal28 = new java.math.BigDecimal(0.0d);
        int int29 = bigDecimal28.intValue();
        java.math.BigDecimal bigDecimal31 = new java.math.BigDecimal(0.0d);
        int int32 = bigDecimal31.intValue();
        java.math.BigDecimal bigDecimal33 = bigDecimal28.min(bigDecimal31);
        java.math.BigInteger bigInteger34 = bigDecimal28.toBigInteger();
        java.math.BigDecimal bigDecimal35 = new java.math.BigDecimal(bigInteger34);
        java.math.BigDecimal bigDecimal37 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal38 = bigDecimal37.stripTrailingZeros();
        float float39 = bigDecimal37.floatValue();
        java.math.BigDecimal bigDecimal40 = bigDecimal35.multiply(bigDecimal37);
        org.apache.commons.math.linear.BigMatrix bigMatrix41 = bigMatrix26.scalarAdd(bigDecimal40);
        int int42 = bigDecimal40.intValue();
        java.math.BigDecimal bigDecimal43 = bigDecimal40.stripTrailingZeros();
        java.math.BigDecimal bigDecimal45 = bigDecimal43.movePointLeft((int) (byte) 100);
        java.math.BigDecimal bigDecimal46 = bigDecimal45.ulp();
        long long47 = bigDecimal46.longValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal45", (bigDecimal1.compareTo(bigDecimal45) == 0) == bigDecimal1.equals(bigDecimal45));
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test644");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        java.lang.String str2 = bigDecimal1.toString();
        java.math.BigDecimal bigDecimal4 = bigDecimal1.setScale(0);
        byte byte5 = bigDecimal4.byteValueExact();
        int int6 = bigDecimal4.precision();
        int int7 = bigDecimal4.intValueExact();
        short short8 = bigDecimal4.shortValueExact();
        java.math.BigInteger bigInteger9 = bigDecimal4.unscaledValue();
        java.math.BigDecimal bigDecimal10 = new java.math.BigDecimal(bigInteger9);
        java.math.BigDecimal bigDecimal12 = bigDecimal10.scaleByPowerOfTen((int) (byte) -54);
        java.math.BigDecimal bigDecimal13 = bigDecimal12.stripTrailingZeros();
        java.math.BigDecimal bigDecimal15 = new java.math.BigDecimal((long) (byte) 0);
        int int16 = bigDecimal15.intValue();
        java.math.BigDecimal bigDecimal18 = bigDecimal15.scaleByPowerOfTen(3);
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.valueOf((long) 100);
        double[] doubleArray23 = new double[] { 1.0d, 100.0f };
        double[] doubleArray26 = new double[] { 1.0d, 100.0f };
        double[] doubleArray29 = new double[] { 1.0d, 100.0f };
        double[] doubleArray32 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray33 = new double[][] { doubleArray23, doubleArray26, doubleArray29, doubleArray32 };
        org.apache.commons.math.linear.BigMatrix bigMatrix34 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray33);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl35 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray33);
        org.apache.commons.math.linear.BigMatrix bigMatrix36 = bigMatrixImpl35.transpose();
        double[] doubleArray38 = bigMatrixImpl35.getRowAsDoubleArray((int) (short) 0);
        boolean boolean39 = bigMatrixImpl35.isSingular();
        java.math.BigDecimal bigDecimal41 = new java.math.BigDecimal("100");
        org.apache.commons.math.linear.BigMatrix bigMatrix42 = bigMatrixImpl35.scalarMultiply(bigDecimal41);
        boolean boolean43 = bigDecimal20.equals((java.lang.Object) bigDecimal41);
        java.math.BigDecimal bigDecimal45 = bigDecimal20.movePointRight((int) (byte) 11);
        java.math.BigDecimal bigDecimal46 = bigDecimal15.add(bigDecimal20);
        java.math.BigDecimal bigDecimal47 = bigDecimal13.divideToIntegralValue(bigDecimal46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal12", (bigDecimal1.compareTo(bigDecimal12) == 0) == bigDecimal1.equals(bigDecimal12));
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test645");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        java.lang.String str2 = bigDecimal1.toString();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal5 = bigDecimal4.stripTrailingZeros();
        int int6 = bigDecimal4.signum();
        java.math.BigDecimal[] bigDecimalArray7 = bigDecimal1.divideAndRemainder(bigDecimal4);
        java.math.BigDecimal bigDecimal9 = bigDecimal1.pow((int) 'a');
        java.math.BigDecimal bigDecimal11 = new java.math.BigDecimal(0.0d);
        java.lang.String str12 = bigDecimal11.toString();
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal15 = bigDecimal14.stripTrailingZeros();
        int int16 = bigDecimal14.signum();
        java.math.BigDecimal[] bigDecimalArray17 = bigDecimal11.divideAndRemainder(bigDecimal14);
        java.math.BigDecimal bigDecimal19 = bigDecimal11.pow((int) 'a');
        java.math.BigInteger bigInteger20 = bigDecimal11.toBigIntegerExact();
        java.math.BigDecimal bigDecimal21 = bigDecimal9.add(bigDecimal11);
        java.math.BigDecimal bigDecimal23 = new java.math.BigDecimal(0.0d);
        java.lang.String str24 = bigDecimal23.toString();
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal27 = bigDecimal26.stripTrailingZeros();
        int int28 = bigDecimal26.signum();
        java.math.BigDecimal[] bigDecimalArray29 = bigDecimal23.divideAndRemainder(bigDecimal26);
        java.math.BigDecimal bigDecimal31 = bigDecimal23.pow((int) 'a');
        java.math.BigInteger bigInteger32 = bigDecimal23.toBigIntegerExact();
        float float33 = bigDecimal23.floatValue();
        java.math.BigDecimal bigDecimal34 = bigDecimal9.add(bigDecimal23);
        java.math.BigDecimal bigDecimal36 = new java.math.BigDecimal((int) (byte) 100);
        java.math.BigDecimal bigDecimal37 = bigDecimal23.divideToIntegralValue(bigDecimal36);
        float float38 = bigDecimal37.floatValue();
        int int39 = bigDecimal37.intValueExact();
        long long40 = bigDecimal37.longValueExact();
        java.math.BigDecimal bigDecimal41 = bigDecimal37.abs();
        java.math.BigDecimal bigDecimal43 = new java.math.BigDecimal(0.0d);
        int int44 = bigDecimal43.intValue();
        java.math.BigDecimal bigDecimal46 = new java.math.BigDecimal(0.0d);
        int int47 = bigDecimal46.intValue();
        java.math.BigDecimal bigDecimal48 = bigDecimal43.min(bigDecimal46);
        java.math.BigInteger bigInteger49 = bigDecimal43.toBigInteger();
        java.math.BigDecimal bigDecimal50 = new java.math.BigDecimal(bigInteger49);
        java.math.BigDecimal bigDecimal52 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal53 = bigDecimal52.stripTrailingZeros();
        float float54 = bigDecimal52.floatValue();
        java.math.BigDecimal bigDecimal55 = bigDecimal50.multiply(bigDecimal52);
        java.math.BigDecimal bigDecimal56 = bigDecimal50.negate();
        int int57 = bigDecimal56.intValue();
        java.math.BigDecimal bigDecimal58 = bigDecimal56.stripTrailingZeros();
        java.math.BigDecimal bigDecimal60 = java.math.BigDecimal.valueOf((double) (short) -100);
        java.math.BigDecimal bigDecimal61 = bigDecimal58.subtract(bigDecimal60);
        java.math.BigDecimal bigDecimal64 = java.math.BigDecimal.valueOf(1L, (int) (byte) 100);
        java.math.BigInteger bigInteger65 = bigDecimal64.toBigInteger();
        java.math.BigDecimal bigDecimal66 = bigDecimal64.ulp();
        java.math.BigDecimal bigDecimal68 = bigDecimal66.scaleByPowerOfTen(100);
        java.math.BigDecimal bigDecimal70 = bigDecimal68.movePointRight((int) 'a');
        java.math.BigDecimal bigDecimal71 = bigDecimal58.subtract(bigDecimal70);
        int int72 = bigDecimal41.compareTo(bigDecimal71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal36 and bigDecimal61", (bigDecimal36.compareTo(bigDecimal61) == 0) == bigDecimal36.equals(bigDecimal61));
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test646");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        long long3 = bigDecimal1.longValue();
        long long4 = bigDecimal1.longValueExact();
        java.math.BigDecimal bigDecimal6 = new java.math.BigDecimal(0.0d);
        java.lang.String str7 = bigDecimal6.toString();
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal10 = bigDecimal9.stripTrailingZeros();
        int int11 = bigDecimal9.signum();
        java.math.BigDecimal[] bigDecimalArray12 = bigDecimal6.divideAndRemainder(bigDecimal9);
        java.math.BigDecimal bigDecimal14 = bigDecimal6.pow((int) 'a');
        java.math.BigDecimal bigDecimal16 = new java.math.BigDecimal(0.0d);
        java.lang.String str17 = bigDecimal16.toString();
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal20 = bigDecimal19.stripTrailingZeros();
        int int21 = bigDecimal19.signum();
        java.math.BigDecimal[] bigDecimalArray22 = bigDecimal16.divideAndRemainder(bigDecimal19);
        java.math.BigDecimal bigDecimal24 = bigDecimal16.pow((int) 'a');
        java.math.BigInteger bigInteger25 = bigDecimal16.toBigIntegerExact();
        java.math.BigDecimal bigDecimal26 = bigDecimal14.add(bigDecimal16);
        java.math.BigDecimal bigDecimal27 = bigDecimal1.min(bigDecimal16);
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal30 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger31 = bigDecimal30.unscaledValue();
        java.math.BigDecimal bigDecimal32 = bigDecimal28.add(bigDecimal30);
        java.math.BigInteger bigInteger33 = bigDecimal30.toBigInteger();
        java.math.BigDecimal bigDecimal35 = new java.math.BigDecimal(bigInteger33, 32);
        java.math.BigDecimal bigDecimal37 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger38 = bigDecimal37.unscaledValue();
        java.math.BigDecimal bigDecimal39 = bigDecimal37.stripTrailingZeros();
        boolean boolean40 = bigDecimal35.equals((java.lang.Object) bigDecimal39);
        java.math.BigDecimal bigDecimal41 = bigDecimal16.remainder(bigDecimal39);
        java.math.BigDecimal bigDecimal43 = new java.math.BigDecimal(0.0d);
        int int44 = bigDecimal43.intValue();
        long long45 = bigDecimal43.longValue();
        long long46 = bigDecimal43.longValueExact();
        int int47 = bigDecimal43.precision();
        java.math.BigDecimal bigDecimal49 = new java.math.BigDecimal(0.0d);
        int int50 = bigDecimal49.intValue();
        long long51 = bigDecimal49.longValue();
        long long52 = bigDecimal49.longValueExact();
        java.math.BigDecimal bigDecimal53 = bigDecimal43.add(bigDecimal49);
        java.math.BigDecimal bigDecimal54 = bigDecimal53.stripTrailingZeros();
        java.math.BigDecimal bigDecimal56 = new java.math.BigDecimal(0.0d);
        int int57 = bigDecimal56.intValue();
        java.math.BigDecimal bigDecimal59 = new java.math.BigDecimal(0.0d);
        int int60 = bigDecimal59.intValue();
        java.math.BigDecimal bigDecimal61 = bigDecimal56.min(bigDecimal59);
        java.math.BigInteger bigInteger62 = bigDecimal56.toBigInteger();
        int int63 = bigDecimal56.precision();
        java.math.BigDecimal bigDecimal65 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal67 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal[] bigDecimalArray68 = bigDecimal65.divideAndRemainder(bigDecimal67);
        java.math.BigDecimal bigDecimal69 = bigDecimal56.multiply(bigDecimal67);
        java.math.BigDecimal bigDecimal70 = bigDecimal56.abs();
        java.math.BigDecimal bigDecimal72 = java.math.BigDecimal.valueOf((long) (byte) 97);
        java.math.BigDecimal bigDecimal73 = bigDecimal70.subtract(bigDecimal72);
        java.math.BigDecimal bigDecimal75 = bigDecimal70.pow((int) (short) 97);
        java.math.BigDecimal bigDecimal76 = bigDecimal54.add(bigDecimal75);
        java.math.BigDecimal bigDecimal77 = bigDecimal75.plus();
        java.math.BigDecimal bigDecimal78 = bigDecimal39.min(bigDecimal75);
        java.math.BigDecimal bigDecimal79 = bigDecimal75.abs();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal30 and bigDecimal39", (bigDecimal30.compareTo(bigDecimal39) == 0) == bigDecimal30.equals(bigDecimal39));
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test647");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        long long3 = bigDecimal1.longValue();
        long long4 = bigDecimal1.longValueExact();
        int int5 = bigDecimal1.precision();
        java.math.BigDecimal bigDecimal7 = new java.math.BigDecimal(0.0d);
        int int8 = bigDecimal7.intValue();
        long long9 = bigDecimal7.longValue();
        long long10 = bigDecimal7.longValueExact();
        java.math.BigDecimal bigDecimal11 = bigDecimal1.add(bigDecimal7);
        byte byte12 = bigDecimal1.byteValueExact();
        java.math.BigDecimal bigDecimal14 = new java.math.BigDecimal(0.0d);
        java.lang.String str15 = bigDecimal14.toString();
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal18 = bigDecimal17.stripTrailingZeros();
        int int19 = bigDecimal17.signum();
        java.math.BigDecimal[] bigDecimalArray20 = bigDecimal14.divideAndRemainder(bigDecimal17);
        java.math.BigDecimal bigDecimal22 = bigDecimal14.pow((int) 'a');
        java.math.BigInteger bigInteger23 = bigDecimal14.toBigIntegerExact();
        float float24 = bigDecimal14.floatValue();
        double[] doubleArray29 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix30 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray29);
        double[] doubleArray35 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix36 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray35);
        double[] doubleArray37 = realMatrix30.operate(doubleArray35);
        org.apache.commons.math.linear.BigMatrix bigMatrix38 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray37);
        java.math.BigDecimal bigDecimal39 = bigMatrix38.getNorm();
        java.math.BigDecimal bigDecimal40 = bigDecimal14.subtract(bigDecimal39);
        int int41 = bigDecimal40.signum();
        java.math.BigInteger bigInteger42 = bigDecimal40.toBigInteger();
        java.math.BigDecimal bigDecimal44 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal46 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal[] bigDecimalArray47 = bigDecimal44.divideAndRemainder(bigDecimal46);
        java.math.BigDecimal bigDecimal49 = bigDecimal46.movePointLeft((-1));
        java.math.BigDecimal bigDecimal50 = bigDecimal40.max(bigDecimal46);
        java.math.BigDecimal bigDecimal51 = bigDecimal46.stripTrailingZeros();
        java.math.BigDecimal bigDecimal52 = bigDecimal1.remainder(bigDecimal46);
        java.math.BigDecimal bigDecimal54 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal56 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal[] bigDecimalArray57 = bigDecimal54.divideAndRemainder(bigDecimal56);
        java.math.BigDecimal bigDecimal58 = bigDecimal52.divideToIntegralValue(bigDecimal54);
        java.math.BigDecimal bigDecimal61 = bigDecimal58.setScale((int) (short) -100, 1);
        java.math.BigDecimal bigDecimal63 = new java.math.BigDecimal((double) (short) 97);
        java.math.BigDecimal bigDecimal64 = bigDecimal58.multiply(bigDecimal63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal61", (bigDecimal1.compareTo(bigDecimal61) == 0) == bigDecimal1.equals(bigDecimal61));
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test648");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal3 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal[] bigDecimalArray4 = bigDecimal1.divideAndRemainder(bigDecimal3);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl5 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray4);
        double[] doubleArray7 = bigMatrixImpl5.getRowAsDoubleArray(0);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = bigMatrixImpl5.copy();
        double[] doubleArray11 = new double[] { 1.0d, 100.0f };
        double[] doubleArray14 = new double[] { 1.0d, 100.0f };
        double[] doubleArray17 = new double[] { 1.0d, 100.0f };
        double[] doubleArray20 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray21 = new double[][] { doubleArray11, doubleArray14, doubleArray17, doubleArray20 };
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray21);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl23 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.BigMatrix bigMatrix24 = bigMatrixImpl23.transpose();
        int int25 = bigMatrixImpl23.getColumnDimension();
        java.math.BigDecimal[][] bigDecimalArray26 = bigMatrixImpl23.getDataRef();
        org.apache.commons.math.linear.BigMatrix bigMatrix27 = bigMatrixImpl5.preMultiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl23);
        int int28 = bigMatrixImpl5.getScale();
        java.math.BigDecimal bigDecimal30 = new java.math.BigDecimal("970");
        java.math.BigDecimal bigDecimal31 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal33 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger34 = bigDecimal33.unscaledValue();
        java.math.BigDecimal bigDecimal35 = bigDecimal31.add(bigDecimal33);
        float float36 = bigDecimal33.floatValue();
        java.lang.String str37 = bigDecimal33.toEngineeringString();
        java.math.BigDecimal bigDecimal38 = bigDecimal33.abs();
        java.math.BigDecimal bigDecimal40 = bigDecimal38.movePointLeft((int) (short) 1);
        byte byte41 = bigDecimal40.byteValueExact();
        java.math.BigDecimal bigDecimal42 = bigDecimal30.min(bigDecimal40);
        org.apache.commons.math.linear.BigMatrix bigMatrix43 = bigMatrixImpl5.scalarAdd(bigDecimal30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal31 and bigDecimal40", (bigDecimal31.compareTo(bigDecimal40) == 0) == bigDecimal31.equals(bigDecimal40));
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test649");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(2805L);
        java.math.BigDecimal bigDecimal3 = new java.math.BigDecimal(0.0d);
        java.lang.String str4 = bigDecimal3.toString();
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal7 = bigDecimal6.stripTrailingZeros();
        int int8 = bigDecimal6.signum();
        java.math.BigDecimal[] bigDecimalArray9 = bigDecimal3.divideAndRemainder(bigDecimal6);
        java.math.BigDecimal bigDecimal11 = bigDecimal3.pow((int) 'a');
        java.math.BigDecimal bigDecimal13 = new java.math.BigDecimal(0.0d);
        java.lang.String str14 = bigDecimal13.toString();
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal17 = bigDecimal16.stripTrailingZeros();
        int int18 = bigDecimal16.signum();
        java.math.BigDecimal[] bigDecimalArray19 = bigDecimal13.divideAndRemainder(bigDecimal16);
        java.math.BigDecimal bigDecimal21 = bigDecimal13.pow((int) 'a');
        java.math.BigInteger bigInteger22 = bigDecimal13.toBigIntegerExact();
        java.math.BigDecimal bigDecimal23 = bigDecimal11.add(bigDecimal13);
        java.math.BigDecimal bigDecimal25 = new java.math.BigDecimal(0.0d);
        int int26 = bigDecimal25.intValue();
        java.math.BigDecimal bigDecimal28 = new java.math.BigDecimal(0.0d);
        int int29 = bigDecimal28.intValue();
        java.math.BigDecimal bigDecimal30 = bigDecimal25.min(bigDecimal28);
        java.math.BigInteger bigInteger31 = bigDecimal25.toBigInteger();
        java.math.BigDecimal bigDecimal32 = new java.math.BigDecimal(bigInteger31);
        java.math.BigDecimal bigDecimal34 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal35 = bigDecimal34.stripTrailingZeros();
        float float36 = bigDecimal34.floatValue();
        java.math.BigDecimal bigDecimal37 = bigDecimal32.multiply(bigDecimal34);
        java.math.BigDecimal bigDecimal38 = bigDecimal32.negate();
        java.math.BigDecimal bigDecimal39 = bigDecimal23.add(bigDecimal38);
        java.math.BigDecimal bigDecimal41 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal42 = bigDecimal41.stripTrailingZeros();
        float float43 = bigDecimal41.floatValue();
        java.math.BigDecimal bigDecimal44 = bigDecimal41.ulp();
        java.math.BigDecimal bigDecimal46 = new java.math.BigDecimal(0.0d);
        java.lang.String str47 = bigDecimal46.toString();
        java.math.BigDecimal bigDecimal49 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal50 = bigDecimal49.stripTrailingZeros();
        int int51 = bigDecimal49.signum();
        java.math.BigDecimal[] bigDecimalArray52 = bigDecimal46.divideAndRemainder(bigDecimal49);
        java.math.BigDecimal bigDecimal54 = bigDecimal46.pow((int) 'a');
        java.math.BigDecimal bigDecimal56 = new java.math.BigDecimal(0.0d);
        java.lang.String str57 = bigDecimal56.toString();
        java.math.BigDecimal bigDecimal59 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal60 = bigDecimal59.stripTrailingZeros();
        int int61 = bigDecimal59.signum();
        java.math.BigDecimal[] bigDecimalArray62 = bigDecimal56.divideAndRemainder(bigDecimal59);
        java.math.BigDecimal bigDecimal64 = bigDecimal56.pow((int) 'a');
        java.math.BigInteger bigInteger65 = bigDecimal56.toBigIntegerExact();
        java.math.BigDecimal bigDecimal66 = bigDecimal54.add(bigDecimal56);
        java.math.BigDecimal bigDecimal67 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal69 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger70 = bigDecimal69.unscaledValue();
        java.math.BigDecimal bigDecimal71 = bigDecimal67.add(bigDecimal69);
        java.math.BigDecimal bigDecimal72 = bigDecimal56.multiply(bigDecimal67);
        java.math.BigDecimal bigDecimal73 = bigDecimal44.divide(bigDecimal67);
        java.math.BigDecimal bigDecimal74 = bigDecimal38.remainder(bigDecimal44);
        double double75 = bigDecimal74.doubleValue();
        java.lang.String str76 = bigDecimal74.toString();
        java.math.BigDecimal bigDecimal78 = new java.math.BigDecimal("970");
        java.math.BigDecimal bigDecimal79 = bigDecimal74.divide(bigDecimal78);
        java.math.BigInteger bigInteger80 = bigDecimal78.unscaledValue();
        java.math.BigDecimal bigDecimal81 = bigDecimal1.max(bigDecimal78);
        java.math.BigDecimal bigDecimal83 = new java.math.BigDecimal(0.0d);
        java.lang.String str84 = bigDecimal83.toString();
        java.math.BigDecimal bigDecimal86 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal87 = bigDecimal86.stripTrailingZeros();
        int int88 = bigDecimal86.signum();
        java.math.BigDecimal[] bigDecimalArray89 = bigDecimal83.divideAndRemainder(bigDecimal86);
        java.math.BigDecimal bigDecimal91 = bigDecimal83.pow((int) 'a');
        java.math.BigInteger bigInteger92 = bigDecimal83.toBigInteger();
        java.math.BigDecimal bigDecimal94 = new java.math.BigDecimal(bigInteger92, 3);
        java.math.BigDecimal bigDecimal95 = bigDecimal94.ulp();
        java.math.BigDecimal bigDecimal96 = bigDecimal1.multiply(bigDecimal95);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal3 and bigDecimal94", (bigDecimal3.compareTo(bigDecimal94) == 0) == bigDecimal3.equals(bigDecimal94));
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test650");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(10);
        java.math.BigDecimal bigDecimal3 = java.math.BigDecimal.valueOf((double) (short) -100);
        java.math.BigDecimal bigDecimal5 = new java.math.BigDecimal((int) (byte) 97);
        java.math.BigDecimal bigDecimal7 = bigDecimal5.setScale(5);
        java.math.BigDecimal bigDecimal9 = new java.math.BigDecimal((long) (short) 100);
        java.lang.String str10 = bigDecimal9.toEngineeringString();
        int int11 = bigDecimal7.compareTo(bigDecimal9);
        java.math.BigDecimal bigDecimal12 = bigDecimal3.multiply(bigDecimal7);
        java.math.BigDecimal bigDecimal13 = bigDecimal7.stripTrailingZeros();
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.valueOf((-1L), (int) (byte) 1);
        java.math.BigDecimal bigDecimal18 = bigDecimal16.pow(2);
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal21 = bigDecimal20.stripTrailingZeros();
        java.math.BigDecimal bigDecimal23 = bigDecimal21.scaleByPowerOfTen(3);
        java.math.BigDecimal bigDecimal24 = bigDecimal18.add(bigDecimal21);
        java.math.BigInteger bigInteger25 = bigDecimal21.toBigIntegerExact();
        java.math.BigDecimal bigDecimal27 = new java.math.BigDecimal(bigInteger25, 7);
        java.math.BigDecimal bigDecimal28 = bigDecimal7.divideToIntegralValue(bigDecimal27);
        java.math.BigDecimal bigDecimal29 = bigDecimal1.max(bigDecimal7);
        java.math.BigDecimal bigDecimal30 = bigDecimal7.negate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal5 and bigDecimal7", (bigDecimal5.compareTo(bigDecimal7) == 0) == bigDecimal5.equals(bigDecimal7));
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test651");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        java.lang.String str2 = bigDecimal1.toString();
        java.math.BigDecimal bigDecimal4 = bigDecimal1.setScale(0);
        java.math.BigDecimal bigDecimal6 = new java.math.BigDecimal(0.0d);
        int int7 = bigDecimal6.intValue();
        long long8 = bigDecimal6.longValue();
        long long9 = bigDecimal6.longValueExact();
        short short10 = bigDecimal6.shortValueExact();
        java.math.BigDecimal bigDecimal11 = bigDecimal1.add(bigDecimal6);
        java.math.BigDecimal bigDecimal12 = bigDecimal11.ulp();
        long long13 = bigDecimal11.longValueExact();
        java.math.BigDecimal bigDecimal15 = new java.math.BigDecimal(0.0d);
        java.lang.String str16 = bigDecimal15.toString();
        java.math.BigDecimal bigDecimal18 = bigDecimal15.setScale(0);
        byte byte19 = bigDecimal18.byteValueExact();
        java.math.BigDecimal bigDecimal20 = bigDecimal18.plus();
        java.math.BigDecimal bigDecimal21 = bigDecimal18.negate();
        java.math.BigDecimal bigDecimal22 = bigDecimal11.min(bigDecimal18);
        java.math.BigDecimal bigDecimal23 = bigDecimal11.abs();
        java.math.BigDecimal bigDecimal25 = bigDecimal23.scaleByPowerOfTen((int) (short) 388);
        int int26 = bigDecimal23.intValueExact();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal25", (bigDecimal1.compareTo(bigDecimal25) == 0) == bigDecimal1.equals(bigDecimal25));
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test652");
        java.lang.String[] strArray1 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl3 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        java.math.BigDecimal[][] bigDecimalArray4 = bigMatrixImpl3.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray4);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl6 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray4);
        java.math.BigDecimal bigDecimal7 = bigMatrixImpl6.getTrace();
        java.math.BigDecimal bigDecimal9 = new java.math.BigDecimal(0.0d);
        int int10 = bigDecimal9.intValue();
        long long11 = bigDecimal9.longValue();
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = bigMatrixImpl6.scalarAdd(bigDecimal9);
        java.math.BigDecimal bigDecimal13 = bigMatrix12.getNorm();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal7 and bigDecimal9", (bigDecimal7.compareTo(bigDecimal9) == 0) == bigDecimal7.equals(bigDecimal9));
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test653");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.min(bigDecimal4);
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal6 };
        java.math.BigDecimal bigDecimal9 = new java.math.BigDecimal(0.0d);
        int int10 = bigDecimal9.intValue();
        java.math.BigDecimal bigDecimal12 = new java.math.BigDecimal(0.0d);
        int int13 = bigDecimal12.intValue();
        java.math.BigDecimal bigDecimal14 = bigDecimal9.min(bigDecimal12);
        java.math.BigDecimal[] bigDecimalArray15 = new java.math.BigDecimal[] { bigDecimal14 };
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(0.0d);
        int int18 = bigDecimal17.intValue();
        java.math.BigDecimal bigDecimal20 = new java.math.BigDecimal(0.0d);
        int int21 = bigDecimal20.intValue();
        java.math.BigDecimal bigDecimal22 = bigDecimal17.min(bigDecimal20);
        java.math.BigDecimal[] bigDecimalArray23 = new java.math.BigDecimal[] { bigDecimal22 };
        java.math.BigDecimal[][] bigDecimalArray24 = new java.math.BigDecimal[][] { bigDecimalArray7, bigDecimalArray15, bigDecimalArray23 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl27 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        java.math.BigDecimal[][] bigDecimalArray28 = bigMatrixImpl27.getDataRef();
        java.math.BigDecimal bigDecimal29 = bigMatrixImpl27.getNorm();
        boolean boolean30 = bigMatrixImpl27.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix31 = bigMatrixImpl27.copy();
        double[] doubleArray33 = bigMatrixImpl27.getColumnAsDoubleArray((int) (byte) 0);
        java.math.BigDecimal bigDecimal34 = java.math.BigDecimal.TEN;
        org.apache.commons.math.linear.BigMatrix bigMatrix35 = bigMatrixImpl27.scalarMultiply(bigDecimal34);
        java.math.BigDecimal bigDecimal37 = bigDecimal34.movePointRight(8667);
        java.math.BigDecimal bigDecimal40 = java.math.BigDecimal.valueOf((long) 0, (int) (short) -100);
        java.math.BigDecimal bigDecimal41 = bigDecimal40.stripTrailingZeros();
        java.math.BigDecimal bigDecimal42 = bigDecimal40.ulp();
        java.math.BigDecimal[] bigDecimalArray43 = bigDecimal34.divideAndRemainder(bigDecimal42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal40", (bigDecimal1.compareTo(bigDecimal40) == 0) == bigDecimal1.equals(bigDecimal40));
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test654");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.min(bigDecimal4);
        java.math.BigInteger bigInteger7 = bigDecimal1.toBigInteger();
        int int8 = bigDecimal1.precision();
        java.lang.String str9 = bigDecimal1.toEngineeringString();
        int int10 = bigDecimal1.intValueExact();
        java.math.BigDecimal bigDecimal11 = bigDecimal1.stripTrailingZeros();
        java.math.BigDecimal bigDecimal13 = bigDecimal1.setScale((int) (byte) 11);
        float float14 = bigDecimal13.floatValue();
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.valueOf((double) (byte) -1);
        java.math.BigDecimal bigDecimal17 = bigDecimal13.divideToIntegralValue(bigDecimal16);
        java.math.BigDecimal bigDecimal18 = bigDecimal17.abs();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal13", (bigDecimal1.compareTo(bigDecimal13) == 0) == bigDecimal1.equals(bigDecimal13));
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test655");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        java.lang.String str2 = bigDecimal1.toString();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal5 = bigDecimal4.stripTrailingZeros();
        int int6 = bigDecimal4.signum();
        java.math.BigDecimal[] bigDecimalArray7 = bigDecimal1.divideAndRemainder(bigDecimal4);
        java.math.BigDecimal bigDecimal9 = bigDecimal1.pow((int) 'a');
        java.math.BigDecimal bigDecimal11 = new java.math.BigDecimal(0.0d);
        java.lang.String str12 = bigDecimal11.toString();
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal15 = bigDecimal14.stripTrailingZeros();
        int int16 = bigDecimal14.signum();
        java.math.BigDecimal[] bigDecimalArray17 = bigDecimal11.divideAndRemainder(bigDecimal14);
        java.math.BigDecimal bigDecimal19 = bigDecimal11.pow((int) 'a');
        java.math.BigInteger bigInteger20 = bigDecimal11.toBigIntegerExact();
        java.math.BigDecimal bigDecimal21 = bigDecimal9.add(bigDecimal11);
        java.math.BigInteger bigInteger22 = bigDecimal21.unscaledValue();
        java.math.BigInteger bigInteger23 = bigDecimal21.toBigIntegerExact();
        java.math.BigDecimal bigDecimal25 = new java.math.BigDecimal(bigInteger23, (int) (short) 0);
        java.math.BigDecimal bigDecimal27 = new java.math.BigDecimal(bigInteger23, (int) (short) 4);
        java.math.BigDecimal bigDecimal29 = new java.math.BigDecimal(bigInteger23, 4);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal27", (bigDecimal1.compareTo(bigDecimal27) == 0) == bigDecimal1.equals(bigDecimal27));
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test656");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal3 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal[] bigDecimalArray4 = bigDecimal1.divideAndRemainder(bigDecimal3);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl5 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = bigMatrixImpl5.copy();
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = bigMatrixImpl5.copy();
        bigMatrixImpl5.setRoundingMode(10);
        double[][] doubleArray10 = bigMatrixImpl5.getDataAsDoubleArray();
        boolean boolean11 = bigMatrixImpl5.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = bigMatrixImpl5.copy();
        bigMatrixImpl5.setRoundingMode((-35));
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal[] bigDecimalArray19 = bigDecimal16.divideAndRemainder(bigDecimal18);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray19);
        org.apache.commons.math.linear.BigMatrix bigMatrix21 = bigMatrixImpl20.copy();
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = bigMatrixImpl20.copy();
        bigMatrixImpl20.setRoundingMode(10);
        java.lang.String[] strArray26 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray27 = new java.lang.String[][] { strArray26 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(strArray27);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl29 = new org.apache.commons.math.linear.BigMatrixImpl(strArray27);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl30 = new org.apache.commons.math.linear.BigMatrixImpl(strArray27);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl31 = new org.apache.commons.math.linear.BigMatrixImpl(strArray27);
        org.apache.commons.math.linear.BigMatrix bigMatrix32 = bigMatrixImpl20.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl31);
        java.math.BigDecimal[][] bigDecimalArray33 = bigMatrix32.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix34 = bigMatrixImpl5.subtract(bigMatrix32);
        java.math.BigDecimal bigDecimal35 = bigMatrix32.getNorm();
        java.math.BigDecimal bigDecimal37 = new java.math.BigDecimal(0.0d);
        int int38 = bigDecimal37.intValue();
        java.math.BigDecimal bigDecimal40 = new java.math.BigDecimal(0.0d);
        int int41 = bigDecimal40.intValue();
        java.math.BigDecimal bigDecimal42 = bigDecimal37.min(bigDecimal40);
        java.math.BigDecimal[] bigDecimalArray43 = new java.math.BigDecimal[] { bigDecimal42 };
        java.math.BigDecimal bigDecimal45 = new java.math.BigDecimal(0.0d);
        int int46 = bigDecimal45.intValue();
        java.math.BigDecimal bigDecimal48 = new java.math.BigDecimal(0.0d);
        int int49 = bigDecimal48.intValue();
        java.math.BigDecimal bigDecimal50 = bigDecimal45.min(bigDecimal48);
        java.math.BigDecimal[] bigDecimalArray51 = new java.math.BigDecimal[] { bigDecimal50 };
        java.math.BigDecimal bigDecimal53 = new java.math.BigDecimal(0.0d);
        int int54 = bigDecimal53.intValue();
        java.math.BigDecimal bigDecimal56 = new java.math.BigDecimal(0.0d);
        int int57 = bigDecimal56.intValue();
        java.math.BigDecimal bigDecimal58 = bigDecimal53.min(bigDecimal56);
        java.math.BigDecimal[] bigDecimalArray59 = new java.math.BigDecimal[] { bigDecimal58 };
        java.math.BigDecimal[][] bigDecimalArray60 = new java.math.BigDecimal[][] { bigDecimalArray43, bigDecimalArray51, bigDecimalArray59 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl61 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray60);
        org.apache.commons.math.linear.BigMatrix bigMatrix62 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray60);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl63 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray60);
        int int64 = bigMatrixImpl63.getScale();
        java.math.BigDecimal bigDecimal66 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigDecimal bigDecimal67 = bigDecimal66.negate();
        org.apache.commons.math.linear.BigMatrix bigMatrix68 = bigMatrixImpl63.scalarMultiply(bigDecimal66);
        java.math.BigInteger bigInteger69 = bigDecimal66.unscaledValue();
        int int70 = bigDecimal66.scale();
        java.math.BigDecimal bigDecimal71 = bigDecimal66.stripTrailingZeros();
        java.math.BigDecimal bigDecimal72 = bigDecimal35.divide(bigDecimal71);
        java.math.BigDecimal bigDecimal73 = bigDecimal35.negate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal37 and bigDecimal72", (bigDecimal37.compareTo(bigDecimal72) == 0) == bigDecimal37.equals(bigDecimal72));
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test657");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.min(bigDecimal4);
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal6 };
        java.math.BigDecimal bigDecimal9 = new java.math.BigDecimal(0.0d);
        int int10 = bigDecimal9.intValue();
        java.math.BigDecimal bigDecimal12 = new java.math.BigDecimal(0.0d);
        int int13 = bigDecimal12.intValue();
        java.math.BigDecimal bigDecimal14 = bigDecimal9.min(bigDecimal12);
        java.math.BigDecimal[] bigDecimalArray15 = new java.math.BigDecimal[] { bigDecimal14 };
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(0.0d);
        int int18 = bigDecimal17.intValue();
        java.math.BigDecimal bigDecimal20 = new java.math.BigDecimal(0.0d);
        int int21 = bigDecimal20.intValue();
        java.math.BigDecimal bigDecimal22 = bigDecimal17.min(bigDecimal20);
        java.math.BigDecimal[] bigDecimalArray23 = new java.math.BigDecimal[] { bigDecimal22 };
        java.math.BigDecimal[][] bigDecimalArray24 = new java.math.BigDecimal[][] { bigDecimalArray7, bigDecimalArray15, bigDecimalArray23 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray24);
        java.math.BigDecimal bigDecimal28 = new java.math.BigDecimal(0.0d);
        int int29 = bigDecimal28.intValue();
        java.math.BigDecimal bigDecimal31 = new java.math.BigDecimal(0.0d);
        int int32 = bigDecimal31.intValue();
        java.math.BigDecimal bigDecimal33 = bigDecimal28.min(bigDecimal31);
        java.math.BigInteger bigInteger34 = bigDecimal28.toBigInteger();
        java.math.BigDecimal bigDecimal35 = new java.math.BigDecimal(bigInteger34);
        java.math.BigDecimal bigDecimal37 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal38 = bigDecimal37.stripTrailingZeros();
        float float39 = bigDecimal37.floatValue();
        java.math.BigDecimal bigDecimal40 = bigDecimal35.multiply(bigDecimal37);
        org.apache.commons.math.linear.BigMatrix bigMatrix41 = bigMatrix26.scalarAdd(bigDecimal40);
        short short42 = bigDecimal40.shortValueExact();
        java.math.BigDecimal bigDecimal44 = java.math.BigDecimal.valueOf((long) (short) 100);
        int int45 = bigDecimal44.signum();
        java.math.BigDecimal[] bigDecimalArray46 = bigDecimal40.divideAndRemainder(bigDecimal44);
        java.math.BigDecimal bigDecimal48 = new java.math.BigDecimal((long) (short) -100);
        byte byte49 = bigDecimal48.byteValueExact();
        double[] doubleArray52 = new double[] { 1.0d, 100.0f };
        double[] doubleArray55 = new double[] { 1.0d, 100.0f };
        double[] doubleArray58 = new double[] { 1.0d, 100.0f };
        double[] doubleArray61 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray62 = new double[][] { doubleArray52, doubleArray55, doubleArray58, doubleArray61 };
        org.apache.commons.math.linear.BigMatrix bigMatrix63 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray62);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl64 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray62);
        org.apache.commons.math.linear.BigMatrix bigMatrix65 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray62);
        org.apache.commons.math.linear.BigMatrix bigMatrix66 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray62);
        java.math.BigDecimal bigDecimal68 = new java.math.BigDecimal(0.0d);
        int int69 = bigDecimal68.intValue();
        java.math.BigDecimal bigDecimal71 = new java.math.BigDecimal(0.0d);
        int int72 = bigDecimal71.intValue();
        java.math.BigDecimal bigDecimal73 = bigDecimal68.min(bigDecimal71);
        java.math.BigInteger bigInteger74 = bigDecimal68.toBigInteger();
        java.math.BigDecimal bigDecimal75 = new java.math.BigDecimal(bigInteger74);
        org.apache.commons.math.linear.BigMatrix bigMatrix76 = bigMatrix66.scalarAdd(bigDecimal75);
        java.math.BigDecimal bigDecimal78 = new java.math.BigDecimal(0.0d);
        int int79 = bigDecimal78.intValue();
        java.math.BigDecimal bigDecimal81 = new java.math.BigDecimal(0.0d);
        int int82 = bigDecimal81.intValue();
        java.math.BigDecimal bigDecimal83 = bigDecimal78.min(bigDecimal81);
        java.math.BigInteger bigInteger84 = bigDecimal78.toBigInteger();
        java.math.BigDecimal bigDecimal86 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigDecimal bigDecimal87 = bigDecimal86.negate();
        java.math.BigDecimal bigDecimal88 = bigDecimal78.add(bigDecimal86);
        java.math.BigDecimal bigDecimal89 = bigDecimal75.divideToIntegralValue(bigDecimal88);
        java.math.BigDecimal bigDecimal90 = bigDecimal48.subtract(bigDecimal88);
        java.math.BigDecimal bigDecimal91 = bigDecimal44.add(bigDecimal88);
        java.math.BigDecimal bigDecimal93 = bigDecimal44.setScale((int) (byte) 11);
        java.math.BigDecimal bigDecimal96 = bigDecimal93.setScale((-1), (int) (byte) 1);
        java.math.BigInteger bigInteger97 = bigDecimal96.toBigInteger();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal44 and bigDecimal93", (bigDecimal44.compareTo(bigDecimal93) == 0) == bigDecimal44.equals(bigDecimal93));
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test658");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal7 = bigDecimal4.setScale((int) (short) 100, (int) (byte) 1);
        java.math.BigDecimal bigDecimal8 = bigDecimal1.divide(bigDecimal4);
        java.math.BigDecimal bigDecimal10 = bigDecimal4.setScale((int) (short) 31464);
        java.math.BigInteger bigInteger11 = bigDecimal4.toBigIntegerExact();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal7 and bigDecimal10", (bigDecimal7.compareTo(bigDecimal10) == 0) == bigDecimal7.equals(bigDecimal10));
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test659");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(7, 4);
        bigMatrixImpl2.setScale(10);
        java.math.BigDecimal[] bigDecimalArray6 = bigMatrixImpl2.getColumn(1);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = bigMatrixImpl2.copy();
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = bigMatrixImpl2.transpose();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrix7 and bigMatrix7", bigMatrix7.equals(bigMatrix7) ? bigMatrix7.hashCode() == bigMatrix7.hashCode() : true);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test660");
        java.lang.String[] strArray1 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl3 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix4 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray2);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl6 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        java.math.BigDecimal bigDecimal7 = bigMatrixImpl6.getTrace();
        java.math.BigDecimal bigDecimal9 = bigDecimal7.movePointRight((-3));
        int int10 = bigDecimal7.intValueExact();
        java.math.BigDecimal bigDecimal12 = bigDecimal7.movePointLeft((-32));
        double[] doubleArray15 = new double[] { 1.0d, 100.0f };
        double[] doubleArray18 = new double[] { 1.0d, 100.0f };
        double[] doubleArray21 = new double[] { 1.0d, 100.0f };
        double[] doubleArray24 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray25 = new double[][] { doubleArray15, doubleArray18, doubleArray21, doubleArray24 };
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray25);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl27 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray25);
        org.apache.commons.math.linear.BigMatrix bigMatrix28 = bigMatrixImpl27.transpose();
        java.math.BigDecimal bigDecimal29 = bigMatrixImpl27.getNorm();
        int int30 = bigDecimal29.signum();
        java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.valueOf((long) 4);
        int int33 = bigDecimal32.signum();
        java.math.BigDecimal bigDecimal34 = bigDecimal29.subtract(bigDecimal32);
        java.math.BigDecimal bigDecimal36 = bigDecimal34.movePointRight((int) (byte) -11);
        boolean boolean37 = bigDecimal12.equals((java.lang.Object) bigDecimal34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal7 and bigDecimal9", (bigDecimal7.compareTo(bigDecimal9) == 0) == bigDecimal7.equals(bigDecimal9));
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test661");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger2 = bigDecimal1.unscaledValue();
        java.lang.String str3 = bigDecimal1.toPlainString();
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal6 = bigDecimal5.stripTrailingZeros();
        float float7 = bigDecimal5.floatValue();
        java.math.BigDecimal bigDecimal8 = bigDecimal5.ulp();
        java.math.BigDecimal bigDecimal9 = bigDecimal8.ulp();
        java.math.BigDecimal bigDecimal10 = bigDecimal1.remainder(bigDecimal9);
        java.math.BigDecimal bigDecimal12 = bigDecimal10.movePointLeft((int) (byte) 1);
        long long13 = bigDecimal10.longValue();
        double[] doubleArray16 = new double[] { 1.0d, 100.0f };
        double[] doubleArray19 = new double[] { 1.0d, 100.0f };
        double[] doubleArray22 = new double[] { 1.0d, 100.0f };
        double[] doubleArray25 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray26 = new double[][] { doubleArray16, doubleArray19, doubleArray22, doubleArray25 };
        org.apache.commons.math.linear.BigMatrix bigMatrix27 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray26);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl28 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray26);
        org.apache.commons.math.linear.BigMatrix bigMatrix29 = bigMatrixImpl28.transpose();
        double[] doubleArray31 = bigMatrixImpl28.getRowAsDoubleArray((int) (short) 0);
        boolean boolean32 = bigMatrixImpl28.isSingular();
        boolean boolean33 = bigMatrixImpl28.isSquare();
        int int34 = bigMatrixImpl28.getScale();
        java.math.BigDecimal bigDecimal35 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal37 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger38 = bigDecimal37.unscaledValue();
        java.math.BigDecimal bigDecimal39 = bigDecimal35.add(bigDecimal37);
        java.math.BigDecimal bigDecimal41 = bigDecimal37.setScale(100);
        boolean boolean42 = bigMatrixImpl28.equals((java.lang.Object) bigDecimal37);
        java.math.BigDecimal bigDecimal43 = bigDecimal37.ulp();
        java.math.BigDecimal bigDecimal44 = bigDecimal10.divide(bigDecimal37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal41", (bigDecimal1.compareTo(bigDecimal41) == 0) == bigDecimal1.equals(bigDecimal41));
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test662");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.min(bigDecimal4);
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal6 };
        java.math.BigDecimal bigDecimal9 = new java.math.BigDecimal(0.0d);
        int int10 = bigDecimal9.intValue();
        java.math.BigDecimal bigDecimal12 = new java.math.BigDecimal(0.0d);
        int int13 = bigDecimal12.intValue();
        java.math.BigDecimal bigDecimal14 = bigDecimal9.min(bigDecimal12);
        java.math.BigDecimal[] bigDecimalArray15 = new java.math.BigDecimal[] { bigDecimal14 };
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(0.0d);
        int int18 = bigDecimal17.intValue();
        java.math.BigDecimal bigDecimal20 = new java.math.BigDecimal(0.0d);
        int int21 = bigDecimal20.intValue();
        java.math.BigDecimal bigDecimal22 = bigDecimal17.min(bigDecimal20);
        java.math.BigDecimal[] bigDecimalArray23 = new java.math.BigDecimal[] { bigDecimal22 };
        java.math.BigDecimal[][] bigDecimalArray24 = new java.math.BigDecimal[][] { bigDecimalArray7, bigDecimalArray15, bigDecimalArray23 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        java.math.BigDecimal[][] bigDecimalArray26 = bigMatrixImpl25.getDataRef();
        int int27 = bigMatrixImpl25.getRowDimension();
        boolean boolean28 = bigMatrixImpl25.isSquare();
        int int29 = bigMatrixImpl25.getRowDimension();
        java.math.BigDecimal bigDecimal30 = bigMatrixImpl25.getNorm();
        short short31 = bigDecimal30.shortValueExact();
        java.math.BigDecimal bigDecimal33 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal36 = bigDecimal33.setScale((int) (short) 100, (int) (byte) 1);
        long long37 = bigDecimal33.longValueExact();
        java.math.BigDecimal bigDecimal40 = bigDecimal33.setScale((int) (short) 0, 0);
        java.math.BigDecimal bigDecimal41 = bigDecimal30.divide(bigDecimal33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal36 and bigDecimal33", (bigDecimal36.compareTo(bigDecimal33) == 0) == bigDecimal36.equals(bigDecimal33));
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test663");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        java.lang.String str2 = bigDecimal1.toString();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal5 = bigDecimal4.stripTrailingZeros();
        int int6 = bigDecimal4.signum();
        java.math.BigDecimal[] bigDecimalArray7 = bigDecimal1.divideAndRemainder(bigDecimal4);
        java.math.BigDecimal bigDecimal9 = bigDecimal1.pow((int) 'a');
        java.lang.String str10 = bigDecimal1.toPlainString();
        java.math.BigDecimal bigDecimal12 = new java.math.BigDecimal(0.0d);
        int int13 = bigDecimal12.intValue();
        java.math.BigDecimal bigDecimal15 = new java.math.BigDecimal(0.0d);
        int int16 = bigDecimal15.intValue();
        java.math.BigDecimal bigDecimal17 = bigDecimal12.min(bigDecimal15);
        java.math.BigDecimal[] bigDecimalArray18 = new java.math.BigDecimal[] { bigDecimal17 };
        java.math.BigDecimal bigDecimal20 = new java.math.BigDecimal(0.0d);
        int int21 = bigDecimal20.intValue();
        java.math.BigDecimal bigDecimal23 = new java.math.BigDecimal(0.0d);
        int int24 = bigDecimal23.intValue();
        java.math.BigDecimal bigDecimal25 = bigDecimal20.min(bigDecimal23);
        java.math.BigDecimal[] bigDecimalArray26 = new java.math.BigDecimal[] { bigDecimal25 };
        java.math.BigDecimal bigDecimal28 = new java.math.BigDecimal(0.0d);
        int int29 = bigDecimal28.intValue();
        java.math.BigDecimal bigDecimal31 = new java.math.BigDecimal(0.0d);
        int int32 = bigDecimal31.intValue();
        java.math.BigDecimal bigDecimal33 = bigDecimal28.min(bigDecimal31);
        java.math.BigDecimal[] bigDecimalArray34 = new java.math.BigDecimal[] { bigDecimal33 };
        java.math.BigDecimal[][] bigDecimalArray35 = new java.math.BigDecimal[][] { bigDecimalArray18, bigDecimalArray26, bigDecimalArray34 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl36 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray35);
        org.apache.commons.math.linear.BigMatrix bigMatrix37 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray35);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl38 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray35);
        java.math.BigDecimal[][] bigDecimalArray39 = bigMatrixImpl38.getDataRef();
        java.math.BigDecimal bigDecimal40 = bigMatrixImpl38.getNorm();
        boolean boolean41 = bigMatrixImpl38.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix42 = bigMatrixImpl38.copy();
        double[] doubleArray44 = bigMatrixImpl38.getColumnAsDoubleArray((int) (byte) 0);
        java.lang.String[] strArray46 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray47 = new java.lang.String[][] { strArray46 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl48 = new org.apache.commons.math.linear.BigMatrixImpl(strArray47);
        org.apache.commons.math.linear.BigMatrix bigMatrix49 = bigMatrixImpl38.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl48);
        org.apache.commons.math.linear.BigMatrix bigMatrix50 = bigMatrixImpl38.copy();
        boolean boolean51 = bigMatrixImpl38.isSquare();
        boolean boolean52 = bigDecimal1.equals((java.lang.Object) boolean51);
        java.math.BigDecimal bigDecimal54 = bigDecimal1.movePointRight((int) (byte) 0);
        java.math.BigDecimal bigDecimal56 = new java.math.BigDecimal((int) (byte) 97);
        java.math.BigDecimal bigDecimal57 = bigDecimal56.negate();
        java.math.BigDecimal bigDecimal59 = bigDecimal57.setScale((int) (short) 31464);
        java.math.BigDecimal bigDecimal61 = bigDecimal57.movePointLeft((int) (short) 400);
        java.math.BigDecimal bigDecimal62 = bigDecimal1.min(bigDecimal57);
        java.math.BigDecimal bigDecimal64 = bigDecimal1.movePointRight(32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal57 and bigDecimal59", (bigDecimal57.compareTo(bigDecimal59) == 0) == bigDecimal57.equals(bigDecimal59));
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test664");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        java.lang.String str2 = bigDecimal1.toString();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal5 = bigDecimal4.stripTrailingZeros();
        int int6 = bigDecimal4.signum();
        java.math.BigDecimal[] bigDecimalArray7 = bigDecimal1.divideAndRemainder(bigDecimal4);
        java.math.BigDecimal bigDecimal9 = bigDecimal1.pow((int) 'a');
        java.math.BigDecimal bigDecimal11 = new java.math.BigDecimal(0.0d);
        java.lang.String str12 = bigDecimal11.toString();
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal15 = bigDecimal14.stripTrailingZeros();
        int int16 = bigDecimal14.signum();
        java.math.BigDecimal[] bigDecimalArray17 = bigDecimal11.divideAndRemainder(bigDecimal14);
        java.math.BigDecimal bigDecimal19 = bigDecimal11.pow((int) 'a');
        java.math.BigInteger bigInteger20 = bigDecimal11.toBigIntegerExact();
        java.math.BigDecimal bigDecimal21 = bigDecimal9.add(bigDecimal11);
        java.math.BigDecimal bigDecimal23 = new java.math.BigDecimal(0.0d);
        java.lang.String str24 = bigDecimal23.toString();
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal27 = bigDecimal26.stripTrailingZeros();
        int int28 = bigDecimal26.signum();
        java.math.BigDecimal[] bigDecimalArray29 = bigDecimal23.divideAndRemainder(bigDecimal26);
        java.math.BigDecimal bigDecimal31 = bigDecimal23.pow((int) 'a');
        java.math.BigInteger bigInteger32 = bigDecimal23.toBigIntegerExact();
        float float33 = bigDecimal23.floatValue();
        java.math.BigDecimal bigDecimal34 = bigDecimal9.add(bigDecimal23);
        java.math.BigInteger bigInteger35 = bigDecimal23.toBigIntegerExact();
        java.math.BigDecimal bigDecimal36 = new java.math.BigDecimal(bigInteger35);
        double[] doubleArray39 = new double[] { 1.0d, 100.0f };
        double[] doubleArray42 = new double[] { 1.0d, 100.0f };
        double[] doubleArray45 = new double[] { 1.0d, 100.0f };
        double[] doubleArray48 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray49 = new double[][] { doubleArray39, doubleArray42, doubleArray45, doubleArray48 };
        org.apache.commons.math.linear.BigMatrix bigMatrix50 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray49);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl51 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray49);
        org.apache.commons.math.linear.BigMatrix bigMatrix52 = bigMatrixImpl51.transpose();
        double[] doubleArray54 = bigMatrixImpl51.getRowAsDoubleArray((int) (short) 0);
        boolean boolean55 = bigMatrixImpl51.isSingular();
        boolean boolean56 = bigMatrixImpl51.isSquare();
        int int57 = bigMatrixImpl51.getScale();
        java.math.BigDecimal bigDecimal58 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal60 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger61 = bigDecimal60.unscaledValue();
        java.math.BigDecimal bigDecimal62 = bigDecimal58.add(bigDecimal60);
        java.math.BigDecimal bigDecimal64 = bigDecimal60.setScale(100);
        boolean boolean65 = bigMatrixImpl51.equals((java.lang.Object) bigDecimal60);
        java.math.BigDecimal bigDecimal66 = bigDecimal36.min(bigDecimal60);
        java.math.BigInteger bigInteger67 = bigDecimal60.toBigInteger();
        java.math.BigDecimal bigDecimal68 = new java.math.BigDecimal(bigInteger67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal60 and bigDecimal64", (bigDecimal60.compareTo(bigDecimal64) == 0) == bigDecimal60.equals(bigDecimal64));
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test665");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        java.math.BigDecimal bigDecimal2 = bigDecimal1.stripTrailingZeros();
        java.math.BigDecimal bigDecimal5 = bigDecimal2.setScale((-100), 0);
        java.math.BigDecimal bigDecimal7 = bigDecimal2.setScale((int) (byte) -112);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal5", (bigDecimal1.compareTo(bigDecimal5) == 0) == bigDecimal1.equals(bigDecimal5));
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test666");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        java.lang.String str2 = bigDecimal1.toString();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal5 = bigDecimal4.stripTrailingZeros();
        int int6 = bigDecimal4.signum();
        java.math.BigDecimal[] bigDecimalArray7 = bigDecimal1.divideAndRemainder(bigDecimal4);
        java.math.BigDecimal bigDecimal9 = bigDecimal1.pow((int) 'a');
        java.math.BigDecimal bigDecimal11 = new java.math.BigDecimal(0.0d);
        java.lang.String str12 = bigDecimal11.toString();
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal15 = bigDecimal14.stripTrailingZeros();
        int int16 = bigDecimal14.signum();
        java.math.BigDecimal[] bigDecimalArray17 = bigDecimal11.divideAndRemainder(bigDecimal14);
        java.math.BigDecimal bigDecimal19 = bigDecimal11.pow((int) 'a');
        java.math.BigInteger bigInteger20 = bigDecimal11.toBigIntegerExact();
        java.math.BigDecimal bigDecimal21 = bigDecimal9.add(bigDecimal11);
        java.math.BigDecimal bigDecimal23 = new java.math.BigDecimal(0.0d);
        java.lang.String str24 = bigDecimal23.toString();
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal27 = bigDecimal26.stripTrailingZeros();
        int int28 = bigDecimal26.signum();
        java.math.BigDecimal[] bigDecimalArray29 = bigDecimal23.divideAndRemainder(bigDecimal26);
        java.math.BigDecimal bigDecimal31 = bigDecimal23.pow((int) 'a');
        java.math.BigInteger bigInteger32 = bigDecimal23.toBigIntegerExact();
        float float33 = bigDecimal23.floatValue();
        java.math.BigDecimal bigDecimal34 = bigDecimal9.add(bigDecimal23);
        java.math.BigInteger bigInteger35 = bigDecimal23.toBigIntegerExact();
        java.math.BigDecimal bigDecimal36 = new java.math.BigDecimal(bigInteger35);
        double[] doubleArray39 = new double[] { 1.0d, 100.0f };
        double[] doubleArray42 = new double[] { 1.0d, 100.0f };
        double[] doubleArray45 = new double[] { 1.0d, 100.0f };
        double[] doubleArray48 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray49 = new double[][] { doubleArray39, doubleArray42, doubleArray45, doubleArray48 };
        org.apache.commons.math.linear.BigMatrix bigMatrix50 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray49);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl51 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray49);
        org.apache.commons.math.linear.BigMatrix bigMatrix52 = bigMatrixImpl51.transpose();
        double[] doubleArray54 = bigMatrixImpl51.getRowAsDoubleArray((int) (short) 0);
        boolean boolean55 = bigMatrixImpl51.isSingular();
        boolean boolean56 = bigMatrixImpl51.isSquare();
        int int57 = bigMatrixImpl51.getScale();
        java.math.BigDecimal bigDecimal58 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal60 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger61 = bigDecimal60.unscaledValue();
        java.math.BigDecimal bigDecimal62 = bigDecimal58.add(bigDecimal60);
        java.math.BigDecimal bigDecimal64 = bigDecimal60.setScale(100);
        boolean boolean65 = bigMatrixImpl51.equals((java.lang.Object) bigDecimal60);
        java.math.BigDecimal bigDecimal66 = bigDecimal36.min(bigDecimal60);
        java.math.BigInteger bigInteger67 = bigDecimal60.toBigInteger();
        java.math.BigDecimal bigDecimal69 = new java.math.BigDecimal(bigInteger67, 32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal60 and bigDecimal64", (bigDecimal60.compareTo(bigDecimal64) == 0) == bigDecimal60.equals(bigDecimal64));
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test667");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.min(bigDecimal4);
        java.math.BigInteger bigInteger7 = bigDecimal1.toBigInteger();
        int int8 = bigDecimal1.precision();
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigDecimal bigDecimal11 = bigDecimal1.subtract(bigDecimal10);
        java.math.BigDecimal bigDecimal12 = bigDecimal10.ulp();
        java.math.BigDecimal bigDecimal13 = bigDecimal10.negate();
        java.math.BigDecimal bigDecimal16 = bigDecimal13.setScale((-2), 4);
        int int17 = bigDecimal13.signum();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal11 and bigDecimal16", (bigDecimal11.compareTo(bigDecimal16) == 0) == bigDecimal11.equals(bigDecimal16));
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test668");
        double[] doubleArray2 = new double[] { 1.0d, 100.0f };
        double[] doubleArray5 = new double[] { 1.0d, 100.0f };
        double[] doubleArray8 = new double[] { 1.0d, 100.0f };
        double[] doubleArray11 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl14 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        java.math.BigDecimal bigDecimal18 = new java.math.BigDecimal(0.0d);
        int int19 = bigDecimal18.intValue();
        java.math.BigDecimal bigDecimal21 = new java.math.BigDecimal(0.0d);
        int int22 = bigDecimal21.intValue();
        java.math.BigDecimal bigDecimal23 = bigDecimal18.min(bigDecimal21);
        java.math.BigInteger bigInteger24 = bigDecimal18.toBigInteger();
        java.math.BigDecimal bigDecimal25 = new java.math.BigDecimal(bigInteger24);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = bigMatrix16.scalarAdd(bigDecimal25);
        java.math.BigDecimal bigDecimal28 = bigDecimal25.scaleByPowerOfTen(97);
        java.math.BigInteger bigInteger29 = bigDecimal28.toBigIntegerExact();
        java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.valueOf((long) 2, (int) (byte) 10);
        int int33 = bigDecimal32.intValue();
        java.math.BigDecimal[] bigDecimalArray34 = bigDecimal28.divideAndRemainder(bigDecimal32);
        java.math.BigDecimal bigDecimal35 = bigDecimal28.ulp();
        java.math.BigDecimal bigDecimal37 = bigDecimal28.movePointRight((int) (short) 35);
        java.math.BigInteger bigInteger38 = bigDecimal37.toBigInteger();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal18 and bigDecimal28", (bigDecimal18.compareTo(bigDecimal28) == 0) == bigDecimal18.equals(bigDecimal28));
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test669");
        double[] doubleArray2 = new double[] { 1.0d, 100.0f };
        double[] doubleArray5 = new double[] { 1.0d, 100.0f };
        double[] doubleArray8 = new double[] { 1.0d, 100.0f };
        double[] doubleArray11 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl14 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = bigMatrixImpl14.transpose();
        double[] doubleArray17 = bigMatrixImpl14.getRowAsDoubleArray((int) (short) 0);
        java.lang.String str18 = bigMatrixImpl14.toString();
        int int19 = bigMatrixImpl14.getScale();
        boolean boolean20 = bigMatrixImpl14.isSingular();
        double[] doubleArray23 = new double[] { 1.0d, 100.0f };
        double[] doubleArray26 = new double[] { 1.0d, 100.0f };
        double[] doubleArray29 = new double[] { 1.0d, 100.0f };
        double[] doubleArray32 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray33 = new double[][] { doubleArray23, doubleArray26, doubleArray29, doubleArray32 };
        org.apache.commons.math.linear.BigMatrix bigMatrix34 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray33);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl35 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray33);
        org.apache.commons.math.linear.BigMatrix bigMatrix36 = bigMatrixImpl35.transpose();
        int int37 = bigMatrixImpl35.getColumnDimension();
        java.math.BigDecimal[][] bigDecimalArray38 = bigMatrixImpl35.getDataRef();
        org.apache.commons.math.linear.BigMatrix bigMatrix39 = bigMatrixImpl35.copy();
        double[][] doubleArray40 = bigMatrixImpl35.getDataAsDoubleArray();
        java.math.BigDecimal bigDecimal41 = bigMatrixImpl35.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix42 = bigMatrixImpl14.scalarMultiply(bigDecimal41);
        java.math.BigDecimal bigDecimal44 = new java.math.BigDecimal(0.0d);
        int int45 = bigDecimal44.intValue();
        long long46 = bigDecimal44.longValue();
        long long47 = bigDecimal44.longValueExact();
        int int48 = bigDecimal44.precision();
        java.math.BigDecimal bigDecimal50 = new java.math.BigDecimal(0.0d);
        java.lang.String str51 = bigDecimal50.toString();
        java.math.BigDecimal bigDecimal53 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal54 = bigDecimal53.stripTrailingZeros();
        int int55 = bigDecimal53.signum();
        java.math.BigDecimal[] bigDecimalArray56 = bigDecimal50.divideAndRemainder(bigDecimal53);
        java.math.BigDecimal bigDecimal57 = bigDecimal44.min(bigDecimal50);
        java.math.BigDecimal bigDecimal59 = new java.math.BigDecimal("97");
        java.math.BigDecimal bigDecimal62 = bigDecimal44.divide(bigDecimal59, (int) (byte) -54, 0);
        java.math.BigDecimal bigDecimal63 = bigDecimal41.min(bigDecimal62);
        int int64 = bigDecimal62.intValueExact();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal44 and bigDecimal62", (bigDecimal44.compareTo(bigDecimal62) == 0) == bigDecimal44.equals(bigDecimal62));
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test670");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((double) 0.0f);
        java.math.BigDecimal bigDecimal3 = bigDecimal1.setScale(10);
        double[] doubleArray6 = new double[] { 1.0d, 100.0f };
        double[] doubleArray9 = new double[] { 1.0d, 100.0f };
        double[] doubleArray12 = new double[] { 1.0d, 100.0f };
        double[] doubleArray15 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray16 = new double[][] { doubleArray6, doubleArray9, doubleArray12, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        java.math.BigDecimal bigDecimal22 = new java.math.BigDecimal(0.0d);
        int int23 = bigDecimal22.intValue();
        java.math.BigDecimal bigDecimal25 = new java.math.BigDecimal(0.0d);
        int int26 = bigDecimal25.intValue();
        java.math.BigDecimal bigDecimal27 = bigDecimal22.min(bigDecimal25);
        java.math.BigInteger bigInteger28 = bigDecimal22.toBigInteger();
        java.math.BigDecimal bigDecimal29 = new java.math.BigDecimal(bigInteger28);
        org.apache.commons.math.linear.BigMatrix bigMatrix30 = bigMatrix20.scalarAdd(bigDecimal29);
        java.math.BigDecimal bigDecimal31 = bigDecimal29.plus();
        java.math.BigDecimal bigDecimal33 = bigDecimal29.movePointLeft((int) 'a');
        java.math.BigInteger bigInteger34 = bigDecimal33.toBigIntegerExact();
        java.math.BigDecimal bigDecimal35 = bigDecimal1.multiply(bigDecimal33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal3 and bigDecimal22", (bigDecimal3.compareTo(bigDecimal22) == 0) == bigDecimal3.equals(bigDecimal22));
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test671");
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf((long) 0, (int) (short) -100);
        java.math.BigDecimal bigDecimal3 = bigDecimal2.stripTrailingZeros();
        float float4 = bigDecimal3.floatValue();
        java.math.BigDecimal bigDecimal5 = bigDecimal3.negate();
        int int6 = bigDecimal5.scale();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal2 and bigDecimal5", (bigDecimal2.compareTo(bigDecimal5) == 0) == bigDecimal2.equals(bigDecimal5));
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test672");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        java.lang.String str2 = bigDecimal1.toString();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal5 = bigDecimal4.stripTrailingZeros();
        int int6 = bigDecimal4.signum();
        java.math.BigDecimal[] bigDecimalArray7 = bigDecimal1.divideAndRemainder(bigDecimal4);
        java.math.BigDecimal bigDecimal9 = bigDecimal1.pow((int) 'a');
        java.math.BigInteger bigInteger10 = bigDecimal1.toBigInteger();
        java.math.BigDecimal bigDecimal11 = new java.math.BigDecimal(bigInteger10);
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigDecimal bigDecimal14 = bigDecimal13.negate();
        java.math.BigDecimal[] bigDecimalArray15 = bigDecimal11.divideAndRemainder(bigDecimal13);
        java.math.BigDecimal bigDecimal17 = bigDecimal11.movePointLeft(52);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = org.apache.commons.math.linear.MatrixUtils.createBigIdentityMatrix(4);
        int int20 = bigMatrix19.getRowDimension();
        java.math.BigDecimal bigDecimal22 = new java.math.BigDecimal(0.0d);
        int int23 = bigDecimal22.intValue();
        java.math.BigDecimal bigDecimal25 = new java.math.BigDecimal(0.0d);
        int int26 = bigDecimal25.intValue();
        java.math.BigDecimal bigDecimal27 = bigDecimal22.min(bigDecimal25);
        java.math.BigDecimal[] bigDecimalArray28 = new java.math.BigDecimal[] { bigDecimal27 };
        java.math.BigDecimal bigDecimal30 = new java.math.BigDecimal(0.0d);
        int int31 = bigDecimal30.intValue();
        java.math.BigDecimal bigDecimal33 = new java.math.BigDecimal(0.0d);
        int int34 = bigDecimal33.intValue();
        java.math.BigDecimal bigDecimal35 = bigDecimal30.min(bigDecimal33);
        java.math.BigDecimal[] bigDecimalArray36 = new java.math.BigDecimal[] { bigDecimal35 };
        java.math.BigDecimal bigDecimal38 = new java.math.BigDecimal(0.0d);
        int int39 = bigDecimal38.intValue();
        java.math.BigDecimal bigDecimal41 = new java.math.BigDecimal(0.0d);
        int int42 = bigDecimal41.intValue();
        java.math.BigDecimal bigDecimal43 = bigDecimal38.min(bigDecimal41);
        java.math.BigDecimal[] bigDecimalArray44 = new java.math.BigDecimal[] { bigDecimal43 };
        java.math.BigDecimal[][] bigDecimalArray45 = new java.math.BigDecimal[][] { bigDecimalArray28, bigDecimalArray36, bigDecimalArray44 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl46 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray45);
        org.apache.commons.math.linear.BigMatrix bigMatrix47 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray45);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl48 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray45);
        java.math.BigDecimal[][] bigDecimalArray49 = bigMatrixImpl48.getDataRef();
        java.math.BigDecimal bigDecimal50 = bigMatrixImpl48.getNorm();
        boolean boolean51 = bigMatrixImpl48.isSquare();
        java.math.BigDecimal[][] bigDecimalArray52 = bigMatrixImpl48.getDataRef();
        double[] doubleArray55 = new double[] { 1.0d, 100.0f };
        double[] doubleArray58 = new double[] { 1.0d, 100.0f };
        double[] doubleArray61 = new double[] { 1.0d, 100.0f };
        double[] doubleArray64 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray65 = new double[][] { doubleArray55, doubleArray58, doubleArray61, doubleArray64 };
        org.apache.commons.math.linear.BigMatrix bigMatrix66 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray65);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl67 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray65);
        org.apache.commons.math.linear.BigMatrix bigMatrix68 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray65);
        org.apache.commons.math.linear.BigMatrix bigMatrix69 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray65);
        java.math.BigDecimal bigDecimal71 = new java.math.BigDecimal(0.0d);
        int int72 = bigDecimal71.intValue();
        java.math.BigDecimal bigDecimal74 = new java.math.BigDecimal(0.0d);
        int int75 = bigDecimal74.intValue();
        java.math.BigDecimal bigDecimal76 = bigDecimal71.min(bigDecimal74);
        java.math.BigInteger bigInteger77 = bigDecimal71.toBigInteger();
        java.math.BigDecimal bigDecimal78 = new java.math.BigDecimal(bigInteger77);
        org.apache.commons.math.linear.BigMatrix bigMatrix79 = bigMatrix69.scalarAdd(bigDecimal78);
        java.math.BigDecimal bigDecimal80 = bigDecimal78.plus();
        boolean boolean81 = bigMatrixImpl48.equals((java.lang.Object) bigDecimal80);
        java.math.BigDecimal bigDecimal83 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal85 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal[] bigDecimalArray86 = bigDecimal83.divideAndRemainder(bigDecimal85);
        java.math.BigDecimal bigDecimal87 = bigDecimal80.max(bigDecimal83);
        java.math.BigDecimal bigDecimal88 = bigDecimal80.stripTrailingZeros();
        org.apache.commons.math.linear.BigMatrix bigMatrix89 = bigMatrix19.scalarMultiply(bigDecimal88);
        java.math.BigDecimal bigDecimal90 = bigDecimal11.subtract(bigDecimal88);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal17", (bigDecimal1.compareTo(bigDecimal17) == 0) == bigDecimal1.equals(bigDecimal17));
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test673");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger2 = bigDecimal1.unscaledValue();
        java.math.BigDecimal bigDecimal3 = bigDecimal1.stripTrailingZeros();
        java.math.BigDecimal bigDecimal5 = bigDecimal1.movePointRight((int) (short) -1);
        java.math.BigDecimal bigDecimal6 = bigDecimal1.stripTrailingZeros();
        java.math.BigDecimal bigDecimal7 = bigDecimal1.stripTrailingZeros();
        java.math.BigDecimal bigDecimal9 = bigDecimal1.scaleByPowerOfTen((int) (short) 1);
        java.math.BigDecimal bigDecimal11 = bigDecimal1.pow(52);
        java.math.BigInteger bigInteger12 = bigDecimal11.toBigInteger();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal3", (bigDecimal1.compareTo(bigDecimal3) == 0) == bigDecimal1.equals(bigDecimal3));
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test674");
        java.lang.String[] strArray1 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl3 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        org.apache.commons.math.linear.BigMatrix bigMatrix4 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray2);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl5 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        int int6 = bigMatrixImpl5.getScale();
        java.math.BigDecimal bigDecimal8 = new java.math.BigDecimal(0.0d);
        int int9 = bigDecimal8.intValue();
        long long10 = bigDecimal8.longValue();
        long long11 = bigDecimal8.longValueExact();
        int int12 = bigDecimal8.precision();
        java.math.BigDecimal bigDecimal14 = new java.math.BigDecimal(0.0d);
        int int15 = bigDecimal14.intValue();
        long long16 = bigDecimal14.longValue();
        long long17 = bigDecimal14.longValueExact();
        java.math.BigDecimal bigDecimal18 = bigDecimal8.add(bigDecimal14);
        java.math.BigDecimal bigDecimal19 = bigDecimal8.ulp();
        java.lang.String str20 = bigDecimal8.toEngineeringString();
        double[] doubleArray23 = new double[] { 1.0d, 100.0f };
        double[] doubleArray26 = new double[] { 1.0d, 100.0f };
        double[] doubleArray29 = new double[] { 1.0d, 100.0f };
        double[] doubleArray32 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray33 = new double[][] { doubleArray23, doubleArray26, doubleArray29, doubleArray32 };
        org.apache.commons.math.linear.BigMatrix bigMatrix34 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray33);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl35 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray33);
        org.apache.commons.math.linear.BigMatrix bigMatrix36 = bigMatrixImpl35.transpose();
        double[] doubleArray38 = bigMatrixImpl35.getRowAsDoubleArray((int) (short) 0);
        boolean boolean39 = bigMatrixImpl35.isSingular();
        java.math.BigDecimal[][] bigDecimalArray40 = bigMatrixImpl35.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl41 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray40);
        java.math.BigDecimal bigDecimal43 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigDecimal bigDecimal44 = bigDecimal43.negate();
        int int45 = bigDecimal44.scale();
        boolean boolean46 = bigMatrixImpl41.equals((java.lang.Object) bigDecimal44);
        java.math.BigDecimal bigDecimal47 = bigDecimal44.plus();
        int int48 = bigDecimal47.intValue();
        java.math.BigDecimal bigDecimal51 = bigDecimal8.divide(bigDecimal47, (int) (short) 9, 5);
        org.apache.commons.math.linear.BigMatrix bigMatrix52 = bigMatrixImpl5.scalarMultiply(bigDecimal8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal14 and bigDecimal51", (bigDecimal14.compareTo(bigDecimal51) == 0) == bigDecimal14.equals(bigDecimal51));
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test675");
        double[] doubleArray2 = new double[] { 1.0d, 100.0f };
        double[] doubleArray5 = new double[] { 1.0d, 100.0f };
        double[] doubleArray8 = new double[] { 1.0d, 100.0f };
        double[] doubleArray11 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl14 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = bigMatrixImpl14.transpose();
        int int16 = bigMatrixImpl14.getColumnDimension();
        java.math.BigDecimal bigDecimal17 = bigMatrixImpl14.getNorm();
        int int18 = bigDecimal17.signum();
        java.math.BigDecimal bigDecimal20 = bigDecimal17.setScale((int) (byte) 6);
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal23 = bigDecimal22.stripTrailingZeros();
        float float24 = bigDecimal22.floatValue();
        double[] doubleArray27 = new double[] { 1.0d, 100.0f };
        double[] doubleArray30 = new double[] { 1.0d, 100.0f };
        double[] doubleArray33 = new double[] { 1.0d, 100.0f };
        double[] doubleArray36 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray37 = new double[][] { doubleArray27, doubleArray30, doubleArray33, doubleArray36 };
        org.apache.commons.math.linear.BigMatrix bigMatrix38 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray37);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray37);
        org.apache.commons.math.linear.BigMatrix bigMatrix40 = bigMatrixImpl39.transpose();
        int int41 = bigMatrixImpl39.getColumnDimension();
        java.math.BigDecimal bigDecimal43 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal44 = bigDecimal43.stripTrailingZeros();
        int int45 = bigDecimal43.signum();
        org.apache.commons.math.linear.BigMatrix bigMatrix46 = bigMatrixImpl39.scalarMultiply(bigDecimal43);
        java.math.BigDecimal bigDecimal47 = bigMatrixImpl39.getNorm();
        java.math.BigDecimal bigDecimal48 = bigDecimal22.remainder(bigDecimal47);
        java.lang.String str49 = bigDecimal22.toString();
        java.math.BigDecimal bigDecimal51 = bigDecimal22.pow((int) 'a');
        java.math.BigDecimal bigDecimal52 = bigDecimal17.max(bigDecimal22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal20 and bigDecimal47", (bigDecimal20.compareTo(bigDecimal47) == 0) == bigDecimal20.equals(bigDecimal47));
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test676");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal3 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal[] bigDecimalArray4 = bigDecimal1.divideAndRemainder(bigDecimal3);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl5 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray4);
        double[] doubleArray7 = bigMatrixImpl5.getRowAsDoubleArray(0);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = bigMatrixImpl5.copy();
        double[] doubleArray11 = new double[] { 1.0d, 100.0f };
        double[] doubleArray14 = new double[] { 1.0d, 100.0f };
        double[] doubleArray17 = new double[] { 1.0d, 100.0f };
        double[] doubleArray20 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray21 = new double[][] { doubleArray11, doubleArray14, doubleArray17, doubleArray20 };
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray21);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl23 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray21);
        org.apache.commons.math.linear.BigMatrix bigMatrix24 = bigMatrixImpl23.transpose();
        int int25 = bigMatrixImpl23.getColumnDimension();
        java.math.BigDecimal[][] bigDecimalArray26 = bigMatrixImpl23.getDataRef();
        org.apache.commons.math.linear.BigMatrix bigMatrix27 = bigMatrixImpl5.preMultiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl23);
        int int28 = bigMatrixImpl5.getScale();
        int int29 = bigMatrixImpl5.getRoundingMode();
        java.math.BigDecimal bigDecimal31 = new java.math.BigDecimal(0.0d);
        int int32 = bigDecimal31.intValue();
        java.math.BigDecimal bigDecimal34 = new java.math.BigDecimal(0.0d);
        int int35 = bigDecimal34.intValue();
        java.math.BigDecimal bigDecimal36 = bigDecimal31.min(bigDecimal34);
        java.math.BigDecimal[] bigDecimalArray37 = new java.math.BigDecimal[] { bigDecimal36 };
        java.math.BigDecimal bigDecimal39 = new java.math.BigDecimal(0.0d);
        int int40 = bigDecimal39.intValue();
        java.math.BigDecimal bigDecimal42 = new java.math.BigDecimal(0.0d);
        int int43 = bigDecimal42.intValue();
        java.math.BigDecimal bigDecimal44 = bigDecimal39.min(bigDecimal42);
        java.math.BigDecimal[] bigDecimalArray45 = new java.math.BigDecimal[] { bigDecimal44 };
        java.math.BigDecimal bigDecimal47 = new java.math.BigDecimal(0.0d);
        int int48 = bigDecimal47.intValue();
        java.math.BigDecimal bigDecimal50 = new java.math.BigDecimal(0.0d);
        int int51 = bigDecimal50.intValue();
        java.math.BigDecimal bigDecimal52 = bigDecimal47.min(bigDecimal50);
        java.math.BigDecimal[] bigDecimalArray53 = new java.math.BigDecimal[] { bigDecimal52 };
        java.math.BigDecimal[][] bigDecimalArray54 = new java.math.BigDecimal[][] { bigDecimalArray37, bigDecimalArray45, bigDecimalArray53 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl55 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray54);
        org.apache.commons.math.linear.BigMatrix bigMatrix56 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray54);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl57 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray54);
        java.math.BigDecimal[][] bigDecimalArray58 = bigMatrixImpl57.getDataRef();
        java.math.BigDecimal bigDecimal59 = bigMatrixImpl57.getNorm();
        int int60 = bigDecimal59.intValue();
        java.math.BigDecimal bigDecimal61 = bigDecimal59.ulp();
        java.math.BigInteger bigInteger62 = bigDecimal59.unscaledValue();
        boolean boolean63 = bigMatrixImpl5.equals((java.lang.Object) bigInteger62);
        java.math.BigDecimal bigDecimal65 = java.math.BigDecimal.valueOf((double) 0.0f);
        java.math.BigDecimal bigDecimal67 = bigDecimal65.setScale(10);
        org.apache.commons.math.linear.BigMatrix bigMatrix68 = bigMatrixImpl5.scalarAdd(bigDecimal65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal31 and bigDecimal67", (bigDecimal31.compareTo(bigDecimal67) == 0) == bigDecimal31.equals(bigDecimal67));
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test677");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (byte) 52, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double5 = bigMatrixImpl2.getEntryAsDouble((int) (byte) 32, (int) (byte) 1);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test678");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        java.lang.String str2 = bigDecimal1.toString();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal5 = bigDecimal4.stripTrailingZeros();
        int int6 = bigDecimal4.signum();
        java.math.BigDecimal[] bigDecimalArray7 = bigDecimal1.divideAndRemainder(bigDecimal4);
        java.math.BigDecimal bigDecimal9 = bigDecimal1.pow((int) 'a');
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal12 = bigDecimal11.stripTrailingZeros();
        float float13 = bigDecimal11.floatValue();
        java.math.BigDecimal bigDecimal14 = bigDecimal9.divideToIntegralValue(bigDecimal11);
        java.math.BigDecimal bigDecimal15 = bigDecimal9.negate();
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(0.0d);
        java.lang.String str18 = bigDecimal17.toString();
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal21 = bigDecimal20.stripTrailingZeros();
        int int22 = bigDecimal20.signum();
        java.math.BigDecimal[] bigDecimalArray23 = bigDecimal17.divideAndRemainder(bigDecimal20);
        java.math.BigDecimal bigDecimal25 = bigDecimal17.pow((int) 'a');
        java.math.BigDecimal bigDecimal27 = new java.math.BigDecimal(0.0d);
        java.lang.String str28 = bigDecimal27.toString();
        java.math.BigDecimal bigDecimal30 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal31 = bigDecimal30.stripTrailingZeros();
        int int32 = bigDecimal30.signum();
        java.math.BigDecimal[] bigDecimalArray33 = bigDecimal27.divideAndRemainder(bigDecimal30);
        java.math.BigDecimal bigDecimal35 = bigDecimal27.pow((int) 'a');
        java.math.BigInteger bigInteger36 = bigDecimal27.toBigIntegerExact();
        java.math.BigDecimal bigDecimal37 = bigDecimal25.add(bigDecimal27);
        double[] doubleArray42 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix43 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray42);
        double[] doubleArray48 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix49 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray48);
        double[] doubleArray50 = realMatrix43.operate(doubleArray48);
        boolean boolean51 = bigDecimal27.equals((java.lang.Object) doubleArray48);
        java.math.BigDecimal bigDecimal53 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal54 = bigDecimal53.stripTrailingZeros();
        float float55 = bigDecimal53.floatValue();
        java.math.BigDecimal bigDecimal56 = bigDecimal27.divideToIntegralValue(bigDecimal53);
        java.math.BigDecimal bigDecimal57 = bigDecimal15.remainder(bigDecimal53);
        java.math.BigInteger bigInteger58 = bigDecimal53.toBigInteger();
        java.math.BigDecimal bigDecimal60 = bigDecimal53.setScale(44);
        java.math.BigInteger bigInteger61 = bigDecimal53.unscaledValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal4 and bigDecimal60", (bigDecimal4.compareTo(bigDecimal60) == 0) == bigDecimal4.equals(bigDecimal60));
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test679");
        double[] doubleArray2 = new double[] { 1.0d, 100.0f };
        double[] doubleArray5 = new double[] { 1.0d, 100.0f };
        double[] doubleArray8 = new double[] { 1.0d, 100.0f };
        double[] doubleArray11 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl14 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix16 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        java.math.BigDecimal bigDecimal18 = new java.math.BigDecimal(0.0d);
        int int19 = bigDecimal18.intValue();
        java.math.BigDecimal bigDecimal21 = new java.math.BigDecimal(0.0d);
        int int22 = bigDecimal21.intValue();
        java.math.BigDecimal bigDecimal23 = bigDecimal18.min(bigDecimal21);
        java.math.BigInteger bigInteger24 = bigDecimal18.toBigInteger();
        java.math.BigDecimal bigDecimal25 = new java.math.BigDecimal(bigInteger24);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = bigMatrix16.scalarAdd(bigDecimal25);
        java.math.BigDecimal bigDecimal28 = bigDecimal25.scaleByPowerOfTen(97);
        java.math.BigInteger bigInteger29 = bigDecimal28.toBigIntegerExact();
        java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.valueOf((long) 2, (int) (byte) 10);
        int int33 = bigDecimal32.intValue();
        java.math.BigDecimal[] bigDecimalArray34 = bigDecimal28.divideAndRemainder(bigDecimal32);
        java.math.BigDecimal bigDecimal36 = bigDecimal28.movePointRight((-32));
        double double37 = bigDecimal36.doubleValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal18 and bigDecimal28", (bigDecimal18.compareTo(bigDecimal28) == 0) == bigDecimal18.equals(bigDecimal28));
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test680");
        org.apache.commons.math.linear.BigMatrix bigMatrix1 = org.apache.commons.math.linear.MatrixUtils.createBigIdentityMatrix(10);
        java.math.BigDecimal[] bigDecimalArray3 = bigMatrix1.getRow((int) (byte) 1);
        org.apache.commons.math.linear.BigMatrix bigMatrix4 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(bigDecimalArray3);
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = bigMatrix4.transpose();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.valueOf((long) 2, (int) (byte) 10);
        java.math.BigDecimal bigDecimal9 = bigDecimal8.negate();
        java.math.BigDecimal bigDecimal11 = new java.math.BigDecimal(0.0d);
        java.lang.String str12 = bigDecimal11.toString();
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal15 = bigDecimal14.stripTrailingZeros();
        int int16 = bigDecimal14.signum();
        java.math.BigDecimal[] bigDecimalArray17 = bigDecimal11.divideAndRemainder(bigDecimal14);
        java.math.BigDecimal bigDecimal19 = bigDecimal11.pow((int) 'a');
        java.math.BigDecimal bigDecimal21 = new java.math.BigDecimal(0.0d);
        java.lang.String str22 = bigDecimal21.toString();
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal25 = bigDecimal24.stripTrailingZeros();
        int int26 = bigDecimal24.signum();
        java.math.BigDecimal[] bigDecimalArray27 = bigDecimal21.divideAndRemainder(bigDecimal24);
        java.math.BigDecimal bigDecimal29 = bigDecimal21.pow((int) 'a');
        java.math.BigInteger bigInteger30 = bigDecimal21.toBigIntegerExact();
        java.math.BigDecimal bigDecimal31 = bigDecimal19.add(bigDecimal21);
        java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal34 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger35 = bigDecimal34.unscaledValue();
        java.math.BigDecimal bigDecimal36 = bigDecimal32.add(bigDecimal34);
        java.math.BigDecimal bigDecimal37 = bigDecimal21.multiply(bigDecimal32);
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal40 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger41 = bigDecimal40.unscaledValue();
        java.math.BigDecimal bigDecimal42 = bigDecimal38.add(bigDecimal40);
        java.math.BigInteger bigInteger43 = bigDecimal40.toBigInteger();
        java.math.BigDecimal bigDecimal45 = new java.math.BigDecimal(bigInteger43, (int) (short) -1);
        java.math.BigDecimal bigDecimal47 = new java.math.BigDecimal((long) (short) 100);
        java.lang.String str48 = bigDecimal47.toEngineeringString();
        java.math.BigDecimal[] bigDecimalArray49 = bigDecimal45.divideAndRemainder(bigDecimal47);
        java.math.BigDecimal bigDecimal50 = bigDecimal37.divide(bigDecimal47);
        int int51 = bigDecimal50.scale();
        int int52 = bigDecimal9.compareTo(bigDecimal50);
        java.math.BigInteger bigInteger53 = bigDecimal9.toBigInteger();
        java.math.BigDecimal bigDecimal55 = new java.math.BigDecimal(bigInteger53, 100);
        org.apache.commons.math.linear.BigMatrix bigMatrix56 = bigMatrix4.scalarMultiply(bigDecimal55);
        java.math.BigDecimal bigDecimal58 = new java.math.BigDecimal(0.0d);
        java.lang.String str59 = bigDecimal58.toString();
        java.math.BigDecimal bigDecimal61 = bigDecimal58.setScale(0);
        java.math.BigDecimal bigDecimal63 = new java.math.BigDecimal(0.0d);
        int int64 = bigDecimal63.intValue();
        long long65 = bigDecimal63.longValue();
        long long66 = bigDecimal63.longValueExact();
        short short67 = bigDecimal63.shortValueExact();
        java.math.BigDecimal bigDecimal68 = bigDecimal58.add(bigDecimal63);
        java.math.BigDecimal bigDecimal69 = bigDecimal68.ulp();
        long long70 = bigDecimal68.longValueExact();
        java.math.BigDecimal bigDecimal72 = new java.math.BigDecimal(0.0d);
        java.lang.String str73 = bigDecimal72.toString();
        java.math.BigDecimal bigDecimal75 = bigDecimal72.setScale(0);
        byte byte76 = bigDecimal75.byteValueExact();
        java.math.BigDecimal bigDecimal77 = bigDecimal75.plus();
        java.math.BigDecimal bigDecimal78 = bigDecimal75.negate();
        java.math.BigDecimal bigDecimal79 = bigDecimal68.min(bigDecimal75);
        java.math.BigDecimal bigDecimal80 = bigDecimal68.abs();
        java.math.BigDecimal bigDecimal82 = bigDecimal80.scaleByPowerOfTen((int) (short) 388);
        org.apache.commons.math.linear.BigMatrix bigMatrix83 = bigMatrix56.scalarAdd(bigDecimal80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal11 and bigDecimal55", (bigDecimal11.compareTo(bigDecimal55) == 0) == bigDecimal11.equals(bigDecimal55));
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test681");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal((double) 2805.0f);
        java.math.BigDecimal bigDecimal3 = bigDecimal1.setScale((int) '4');
        java.math.BigDecimal bigDecimal5 = new java.math.BigDecimal(0.0d);
        int int6 = bigDecimal5.intValue();
        java.math.BigDecimal bigDecimal8 = new java.math.BigDecimal(0.0d);
        int int9 = bigDecimal8.intValue();
        java.math.BigDecimal bigDecimal10 = bigDecimal5.min(bigDecimal8);
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal10 };
        java.math.BigDecimal bigDecimal13 = new java.math.BigDecimal(0.0d);
        int int14 = bigDecimal13.intValue();
        java.math.BigDecimal bigDecimal16 = new java.math.BigDecimal(0.0d);
        int int17 = bigDecimal16.intValue();
        java.math.BigDecimal bigDecimal18 = bigDecimal13.min(bigDecimal16);
        java.math.BigDecimal[] bigDecimalArray19 = new java.math.BigDecimal[] { bigDecimal18 };
        java.math.BigDecimal bigDecimal21 = new java.math.BigDecimal(0.0d);
        int int22 = bigDecimal21.intValue();
        java.math.BigDecimal bigDecimal24 = new java.math.BigDecimal(0.0d);
        int int25 = bigDecimal24.intValue();
        java.math.BigDecimal bigDecimal26 = bigDecimal21.min(bigDecimal24);
        java.math.BigDecimal[] bigDecimalArray27 = new java.math.BigDecimal[] { bigDecimal26 };
        java.math.BigDecimal[][] bigDecimalArray28 = new java.math.BigDecimal[][] { bigDecimalArray11, bigDecimalArray19, bigDecimalArray27 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl29 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray28);
        org.apache.commons.math.linear.BigMatrix bigMatrix30 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray28);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl31 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray28);
        java.math.BigDecimal[][] bigDecimalArray32 = bigMatrixImpl31.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl33 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray32);
        java.math.BigDecimal bigDecimal34 = bigMatrixImpl33.getNorm();
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal37 = bigDecimal36.stripTrailingZeros();
        float float38 = bigDecimal36.floatValue();
        java.math.BigDecimal bigDecimal39 = bigDecimal34.remainder(bigDecimal36);
        long long40 = bigDecimal34.longValueExact();
        java.math.BigDecimal bigDecimal42 = bigDecimal34.movePointLeft((int) (short) -100);
        java.math.BigDecimal bigDecimal43 = bigDecimal3.add(bigDecimal34);
        float float44 = bigDecimal43.floatValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal3", (bigDecimal1.compareTo(bigDecimal3) == 0) == bigDecimal1.equals(bigDecimal3));
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test682");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(64, 10);
        org.apache.commons.math.linear.BigMatrix bigMatrix3 = bigMatrixImpl2.copy();
        int int4 = bigMatrixImpl2.getColumnDimension();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrix3 and bigMatrix3", bigMatrix3.equals(bigMatrix3) ? bigMatrix3.hashCode() == bigMatrix3.hashCode() : true);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test683");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.min(bigDecimal4);
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal6 };
        java.math.BigDecimal bigDecimal9 = new java.math.BigDecimal(0.0d);
        int int10 = bigDecimal9.intValue();
        java.math.BigDecimal bigDecimal12 = new java.math.BigDecimal(0.0d);
        int int13 = bigDecimal12.intValue();
        java.math.BigDecimal bigDecimal14 = bigDecimal9.min(bigDecimal12);
        java.math.BigDecimal[] bigDecimalArray15 = new java.math.BigDecimal[] { bigDecimal14 };
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(0.0d);
        int int18 = bigDecimal17.intValue();
        java.math.BigDecimal bigDecimal20 = new java.math.BigDecimal(0.0d);
        int int21 = bigDecimal20.intValue();
        java.math.BigDecimal bigDecimal22 = bigDecimal17.min(bigDecimal20);
        java.math.BigDecimal[] bigDecimalArray23 = new java.math.BigDecimal[] { bigDecimal22 };
        java.math.BigDecimal[][] bigDecimalArray24 = new java.math.BigDecimal[][] { bigDecimalArray7, bigDecimalArray15, bigDecimalArray23 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        java.math.BigDecimal bigDecimal27 = new java.math.BigDecimal(0.0d);
        java.lang.String str28 = bigDecimal27.toString();
        java.math.BigDecimal bigDecimal30 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal31 = bigDecimal30.stripTrailingZeros();
        int int32 = bigDecimal30.signum();
        java.math.BigDecimal[] bigDecimalArray33 = bigDecimal27.divideAndRemainder(bigDecimal30);
        java.math.BigDecimal bigDecimal35 = bigDecimal27.pow((int) 'a');
        java.math.BigInteger bigInteger36 = bigDecimal27.toBigIntegerExact();
        float float37 = bigDecimal27.floatValue();
        double[] doubleArray42 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix43 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray42);
        double[] doubleArray48 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix49 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray48);
        double[] doubleArray50 = realMatrix43.operate(doubleArray48);
        org.apache.commons.math.linear.BigMatrix bigMatrix51 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray50);
        java.math.BigDecimal bigDecimal52 = bigMatrix51.getNorm();
        java.math.BigDecimal bigDecimal53 = bigDecimal27.subtract(bigDecimal52);
        int int54 = bigDecimal53.signum();
        java.math.BigDecimal bigDecimal55 = bigDecimal53.ulp();
        org.apache.commons.math.linear.BigMatrix bigMatrix56 = bigMatrixImpl25.scalarMultiply(bigDecimal55);
        java.math.BigDecimal bigDecimal58 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger59 = bigDecimal58.unscaledValue();
        java.math.BigDecimal bigDecimal60 = bigDecimal58.stripTrailingZeros();
        java.math.BigDecimal bigDecimal62 = bigDecimal58.movePointRight((int) (short) -1);
        int int63 = bigDecimal58.intValue();
        java.math.BigDecimal bigDecimal64 = bigDecimal55.multiply(bigDecimal58);
        double[] doubleArray67 = new double[] { 1.0d, 100.0f };
        double[] doubleArray70 = new double[] { 1.0d, 100.0f };
        double[] doubleArray73 = new double[] { 1.0d, 100.0f };
        double[] doubleArray76 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray77 = new double[][] { doubleArray67, doubleArray70, doubleArray73, doubleArray76 };
        org.apache.commons.math.linear.BigMatrix bigMatrix78 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray77);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl79 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray77);
        org.apache.commons.math.linear.BigMatrix bigMatrix80 = bigMatrixImpl79.transpose();
        int int81 = bigMatrixImpl79.getColumnDimension();
        java.math.BigDecimal bigDecimal82 = bigMatrixImpl79.getNorm();
        java.math.BigDecimal bigDecimal84 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal85 = bigDecimal84.stripTrailingZeros();
        java.math.BigDecimal bigDecimal86 = bigDecimal82.divideToIntegralValue(bigDecimal85);
        java.math.BigDecimal bigDecimal88 = bigDecimal85.setScale((int) (short) 31464);
        java.math.BigDecimal bigDecimal90 = bigDecimal58.divide(bigDecimal85, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal30 and bigDecimal88", (bigDecimal30.compareTo(bigDecimal88) == 0) == bigDecimal30.equals(bigDecimal88));
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test684");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal((double) 97);
        java.math.BigDecimal bigDecimal3 = new java.math.BigDecimal(0.0d);
        java.lang.String str4 = bigDecimal3.toString();
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal7 = bigDecimal6.stripTrailingZeros();
        int int8 = bigDecimal6.signum();
        java.math.BigDecimal[] bigDecimalArray9 = bigDecimal3.divideAndRemainder(bigDecimal6);
        java.math.BigDecimal bigDecimal11 = bigDecimal3.pow((int) 'a');
        java.math.BigDecimal bigDecimal13 = new java.math.BigDecimal(0.0d);
        java.lang.String str14 = bigDecimal13.toString();
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal17 = bigDecimal16.stripTrailingZeros();
        int int18 = bigDecimal16.signum();
        java.math.BigDecimal[] bigDecimalArray19 = bigDecimal13.divideAndRemainder(bigDecimal16);
        java.math.BigDecimal bigDecimal21 = bigDecimal13.pow((int) 'a');
        java.math.BigInteger bigInteger22 = bigDecimal13.toBigIntegerExact();
        java.math.BigDecimal bigDecimal23 = bigDecimal11.add(bigDecimal13);
        java.math.BigInteger bigInteger24 = bigDecimal23.unscaledValue();
        double[] doubleArray27 = new double[] { 1.0d, 100.0f };
        double[] doubleArray30 = new double[] { 1.0d, 100.0f };
        double[] doubleArray33 = new double[] { 1.0d, 100.0f };
        double[] doubleArray36 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray37 = new double[][] { doubleArray27, doubleArray30, doubleArray33, doubleArray36 };
        org.apache.commons.math.linear.BigMatrix bigMatrix38 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray37);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray37);
        org.apache.commons.math.linear.BigMatrix bigMatrix40 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray37);
        org.apache.commons.math.linear.BigMatrix bigMatrix41 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray37);
        java.math.BigDecimal bigDecimal43 = new java.math.BigDecimal(0.0d);
        int int44 = bigDecimal43.intValue();
        java.math.BigDecimal bigDecimal46 = new java.math.BigDecimal(0.0d);
        int int47 = bigDecimal46.intValue();
        java.math.BigDecimal bigDecimal48 = bigDecimal43.min(bigDecimal46);
        java.math.BigInteger bigInteger49 = bigDecimal43.toBigInteger();
        java.math.BigDecimal bigDecimal50 = new java.math.BigDecimal(bigInteger49);
        org.apache.commons.math.linear.BigMatrix bigMatrix51 = bigMatrix41.scalarAdd(bigDecimal50);
        java.math.BigDecimal[] bigDecimalArray52 = new java.math.BigDecimal[] { bigDecimal1, bigDecimal23, bigDecimal50 };
        org.apache.commons.math.linear.BigMatrix bigMatrix53 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(bigDecimalArray52);
        org.apache.commons.math.linear.BigMatrix bigMatrix54 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(bigDecimalArray52);
        org.apache.commons.math.linear.BigMatrix bigMatrix55 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(bigDecimalArray52);
        java.math.BigDecimal bigDecimal56 = bigMatrix55.getNorm();
        java.math.BigDecimal[][] bigDecimalArray57 = bigMatrix55.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl58 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray57);
        java.math.BigDecimal bigDecimal60 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger61 = bigDecimal60.unscaledValue();
        java.lang.String str62 = bigDecimal60.toPlainString();
        java.math.BigDecimal bigDecimal64 = bigDecimal60.movePointRight(64);
        java.math.BigDecimal bigDecimal66 = bigDecimal64.movePointLeft((int) (short) 0);
        java.math.BigDecimal bigDecimal68 = new java.math.BigDecimal(0.0d);
        java.lang.String str69 = bigDecimal68.toString();
        java.math.BigDecimal bigDecimal71 = bigDecimal68.setScale(0);
        byte byte72 = bigDecimal71.byteValueExact();
        int int73 = bigDecimal71.precision();
        short short74 = bigDecimal71.shortValueExact();
        java.math.BigDecimal bigDecimal75 = bigDecimal64.multiply(bigDecimal71);
        long long76 = bigDecimal75.longValue();
        java.math.BigDecimal bigDecimal78 = bigDecimal75.setScale((int) (byte) 52);
        org.apache.commons.math.linear.BigMatrix bigMatrix79 = bigMatrixImpl58.scalarMultiply(bigDecimal75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal3 and bigDecimal78", (bigDecimal3.compareTo(bigDecimal78) == 0) == bigDecimal3.equals(bigDecimal78));
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test685");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((double) (byte) -112);
        java.math.BigDecimal bigDecimal3 = bigDecimal1.setScale((int) ' ');
        java.math.BigDecimal bigDecimal5 = bigDecimal3.scaleByPowerOfTen((int) (byte) 97);
        java.math.BigDecimal bigDecimal7 = bigDecimal5.pow(8667);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal3", (bigDecimal1.compareTo(bigDecimal3) == 0) == bigDecimal1.equals(bigDecimal3));
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test686");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.min(bigDecimal4);
        java.math.BigInteger bigInteger7 = bigDecimal1.toBigInteger();
        int int8 = bigDecimal1.precision();
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal[] bigDecimalArray13 = bigDecimal10.divideAndRemainder(bigDecimal12);
        java.math.BigDecimal bigDecimal14 = bigDecimal1.multiply(bigDecimal12);
        java.math.BigDecimal bigDecimal15 = bigDecimal1.abs();
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.valueOf((long) (byte) 97);
        java.math.BigDecimal bigDecimal18 = bigDecimal15.subtract(bigDecimal17);
        int int19 = bigDecimal17.scale();
        java.math.BigDecimal bigDecimal21 = bigDecimal17.setScale((int) (byte) 85);
        int int22 = bigDecimal17.signum();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal10 and bigDecimal21", (bigDecimal10.compareTo(bigDecimal21) == 0) == bigDecimal10.equals(bigDecimal21));
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test687");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger3 = bigDecimal2.unscaledValue();
        java.math.BigDecimal bigDecimal4 = bigDecimal0.add(bigDecimal2);
        float float5 = bigDecimal2.floatValue();
        java.math.BigDecimal bigDecimal7 = new java.math.BigDecimal(0.0d);
        java.lang.String str8 = bigDecimal7.toString();
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal11 = bigDecimal10.stripTrailingZeros();
        int int12 = bigDecimal10.signum();
        java.math.BigDecimal[] bigDecimalArray13 = bigDecimal7.divideAndRemainder(bigDecimal10);
        java.math.BigDecimal bigDecimal15 = bigDecimal7.pow((int) 'a');
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(0.0d);
        java.lang.String str18 = bigDecimal17.toString();
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal21 = bigDecimal20.stripTrailingZeros();
        int int22 = bigDecimal20.signum();
        java.math.BigDecimal[] bigDecimalArray23 = bigDecimal17.divideAndRemainder(bigDecimal20);
        java.math.BigDecimal bigDecimal25 = bigDecimal17.pow((int) 'a');
        java.math.BigInteger bigInteger26 = bigDecimal17.toBigIntegerExact();
        java.math.BigDecimal bigDecimal27 = bigDecimal15.add(bigDecimal17);
        java.math.BigDecimal bigDecimal29 = new java.math.BigDecimal(0.0d);
        int int30 = bigDecimal29.intValue();
        java.math.BigDecimal bigDecimal32 = new java.math.BigDecimal(0.0d);
        int int33 = bigDecimal32.intValue();
        java.math.BigDecimal bigDecimal34 = bigDecimal29.min(bigDecimal32);
        java.math.BigInteger bigInteger35 = bigDecimal29.toBigInteger();
        java.math.BigDecimal bigDecimal36 = new java.math.BigDecimal(bigInteger35);
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal39 = bigDecimal38.stripTrailingZeros();
        float float40 = bigDecimal38.floatValue();
        java.math.BigDecimal bigDecimal41 = bigDecimal36.multiply(bigDecimal38);
        java.math.BigDecimal bigDecimal42 = bigDecimal36.negate();
        java.math.BigDecimal bigDecimal43 = bigDecimal27.add(bigDecimal42);
        java.math.BigDecimal bigDecimal45 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal46 = bigDecimal45.stripTrailingZeros();
        float float47 = bigDecimal45.floatValue();
        java.math.BigDecimal bigDecimal48 = bigDecimal45.ulp();
        java.math.BigDecimal bigDecimal50 = new java.math.BigDecimal(0.0d);
        java.lang.String str51 = bigDecimal50.toString();
        java.math.BigDecimal bigDecimal53 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal54 = bigDecimal53.stripTrailingZeros();
        int int55 = bigDecimal53.signum();
        java.math.BigDecimal[] bigDecimalArray56 = bigDecimal50.divideAndRemainder(bigDecimal53);
        java.math.BigDecimal bigDecimal58 = bigDecimal50.pow((int) 'a');
        java.math.BigDecimal bigDecimal60 = new java.math.BigDecimal(0.0d);
        java.lang.String str61 = bigDecimal60.toString();
        java.math.BigDecimal bigDecimal63 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal64 = bigDecimal63.stripTrailingZeros();
        int int65 = bigDecimal63.signum();
        java.math.BigDecimal[] bigDecimalArray66 = bigDecimal60.divideAndRemainder(bigDecimal63);
        java.math.BigDecimal bigDecimal68 = bigDecimal60.pow((int) 'a');
        java.math.BigInteger bigInteger69 = bigDecimal60.toBigIntegerExact();
        java.math.BigDecimal bigDecimal70 = bigDecimal58.add(bigDecimal60);
        java.math.BigDecimal bigDecimal71 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal73 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger74 = bigDecimal73.unscaledValue();
        java.math.BigDecimal bigDecimal75 = bigDecimal71.add(bigDecimal73);
        java.math.BigDecimal bigDecimal76 = bigDecimal60.multiply(bigDecimal71);
        java.math.BigDecimal bigDecimal77 = bigDecimal48.divide(bigDecimal71);
        java.math.BigDecimal bigDecimal78 = bigDecimal42.remainder(bigDecimal48);
        java.math.BigDecimal bigDecimal79 = bigDecimal2.subtract(bigDecimal42);
        byte byte80 = bigDecimal79.byteValueExact();
        java.math.BigDecimal bigDecimal81 = bigDecimal79.stripTrailingZeros();
        short short82 = bigDecimal79.shortValueExact();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal2 and bigDecimal81", (bigDecimal2.compareTo(bigDecimal81) == 0) == bigDecimal2.equals(bigDecimal81));
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test688");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal3 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal[] bigDecimalArray4 = bigDecimal1.divideAndRemainder(bigDecimal3);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl5 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = bigMatrixImpl5.copy();
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = bigMatrixImpl5.copy();
        bigMatrixImpl5.setRoundingMode(10);
        java.lang.String[] strArray11 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray12 = new java.lang.String[][] { strArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(strArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl14 = new org.apache.commons.math.linear.BigMatrixImpl(strArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(strArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(strArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = bigMatrixImpl5.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl16);
        java.math.BigDecimal bigDecimal18 = bigMatrixImpl16.getTrace();
        java.math.BigDecimal bigDecimal19 = bigMatrixImpl16.getNorm();
        double[][] doubleArray20 = bigMatrixImpl16.getDataAsDoubleArray();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal18 and bigDecimal19", (bigDecimal18.compareTo(bigDecimal19) == 0) == bigDecimal18.equals(bigDecimal19));
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test689");
        java.lang.String[] strArray1 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl3 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        java.math.BigDecimal[][] bigDecimalArray4 = bigMatrixImpl3.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray4);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl6 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray4);
        java.math.BigDecimal bigDecimal7 = bigMatrixImpl6.getTrace();
        java.math.BigDecimal bigDecimal9 = new java.math.BigDecimal(0.0d);
        int int10 = bigDecimal9.intValue();
        long long11 = bigDecimal9.longValue();
        org.apache.commons.math.linear.BigMatrix bigMatrix12 = bigMatrixImpl6.scalarAdd(bigDecimal9);
        int int13 = bigMatrixImpl6.getColumnDimension();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal7 and bigDecimal9", (bigDecimal7.compareTo(bigDecimal9) == 0) == bigDecimal7.equals(bigDecimal9));
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test690");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger2 = bigDecimal1.unscaledValue();
        java.math.BigDecimal bigDecimal3 = bigDecimal1.stripTrailingZeros();
        java.math.BigDecimal bigDecimal5 = bigDecimal1.movePointRight((int) (short) -1);
        java.math.BigDecimal bigDecimal6 = bigDecimal1.stripTrailingZeros();
        java.math.BigDecimal bigDecimal7 = bigDecimal1.stripTrailingZeros();
        java.math.BigDecimal bigDecimal9 = bigDecimal1.scaleByPowerOfTen((int) (short) 1);
        int int10 = bigDecimal9.precision();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal3", (bigDecimal1.compareTo(bigDecimal3) == 0) == bigDecimal1.equals(bigDecimal3));
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test691");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.min(bigDecimal4);
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal6 };
        java.math.BigDecimal bigDecimal9 = new java.math.BigDecimal(0.0d);
        int int10 = bigDecimal9.intValue();
        java.math.BigDecimal bigDecimal12 = new java.math.BigDecimal(0.0d);
        int int13 = bigDecimal12.intValue();
        java.math.BigDecimal bigDecimal14 = bigDecimal9.min(bigDecimal12);
        java.math.BigDecimal[] bigDecimalArray15 = new java.math.BigDecimal[] { bigDecimal14 };
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(0.0d);
        int int18 = bigDecimal17.intValue();
        java.math.BigDecimal bigDecimal20 = new java.math.BigDecimal(0.0d);
        int int21 = bigDecimal20.intValue();
        java.math.BigDecimal bigDecimal22 = bigDecimal17.min(bigDecimal20);
        java.math.BigDecimal[] bigDecimalArray23 = new java.math.BigDecimal[] { bigDecimal22 };
        java.math.BigDecimal[][] bigDecimalArray24 = new java.math.BigDecimal[][] { bigDecimalArray7, bigDecimalArray15, bigDecimalArray23 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl27 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        java.math.BigDecimal[][] bigDecimalArray28 = bigMatrixImpl27.getDataRef();
        java.math.BigDecimal bigDecimal29 = bigMatrixImpl27.getNorm();
        boolean boolean30 = bigMatrixImpl27.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix31 = bigMatrixImpl27.copy();
        double[] doubleArray33 = bigMatrixImpl27.getColumnAsDoubleArray((int) (byte) 0);
        java.math.BigDecimal bigDecimal34 = java.math.BigDecimal.TEN;
        org.apache.commons.math.linear.BigMatrix bigMatrix35 = bigMatrixImpl27.scalarMultiply(bigDecimal34);
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) ' ');
        org.apache.commons.math.linear.BigMatrix bigMatrix39 = bigMatrixImpl27.scalarAdd(bigDecimal38);
        java.math.BigDecimal bigDecimal41 = bigDecimal38.movePointLeft((int) (short) -100);
        java.math.BigDecimal bigDecimal43 = new java.math.BigDecimal(0.0d);
        int int44 = bigDecimal43.intValue();
        long long45 = bigDecimal43.longValue();
        java.math.BigDecimal bigDecimal46 = bigDecimal38.min(bigDecimal43);
        java.math.BigDecimal bigDecimal47 = bigDecimal38.plus();
        java.math.BigDecimal bigDecimal49 = new java.math.BigDecimal(0.0d);
        int int50 = bigDecimal49.intValue();
        java.math.BigDecimal bigDecimal52 = new java.math.BigDecimal(0.0d);
        int int53 = bigDecimal52.intValue();
        java.math.BigDecimal bigDecimal54 = bigDecimal49.min(bigDecimal52);
        java.math.BigDecimal[] bigDecimalArray55 = new java.math.BigDecimal[] { bigDecimal54 };
        java.math.BigDecimal bigDecimal57 = new java.math.BigDecimal(0.0d);
        int int58 = bigDecimal57.intValue();
        java.math.BigDecimal bigDecimal60 = new java.math.BigDecimal(0.0d);
        int int61 = bigDecimal60.intValue();
        java.math.BigDecimal bigDecimal62 = bigDecimal57.min(bigDecimal60);
        java.math.BigDecimal[] bigDecimalArray63 = new java.math.BigDecimal[] { bigDecimal62 };
        java.math.BigDecimal bigDecimal65 = new java.math.BigDecimal(0.0d);
        int int66 = bigDecimal65.intValue();
        java.math.BigDecimal bigDecimal68 = new java.math.BigDecimal(0.0d);
        int int69 = bigDecimal68.intValue();
        java.math.BigDecimal bigDecimal70 = bigDecimal65.min(bigDecimal68);
        java.math.BigDecimal[] bigDecimalArray71 = new java.math.BigDecimal[] { bigDecimal70 };
        java.math.BigDecimal[][] bigDecimalArray72 = new java.math.BigDecimal[][] { bigDecimalArray55, bigDecimalArray63, bigDecimalArray71 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl73 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray72);
        org.apache.commons.math.linear.BigMatrix bigMatrix74 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray72);
        java.math.BigDecimal bigDecimal76 = new java.math.BigDecimal(0.0d);
        int int77 = bigDecimal76.intValue();
        java.math.BigDecimal bigDecimal79 = new java.math.BigDecimal(0.0d);
        int int80 = bigDecimal79.intValue();
        java.math.BigDecimal bigDecimal81 = bigDecimal76.min(bigDecimal79);
        java.math.BigInteger bigInteger82 = bigDecimal76.toBigInteger();
        java.math.BigDecimal bigDecimal83 = new java.math.BigDecimal(bigInteger82);
        java.math.BigDecimal bigDecimal85 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal86 = bigDecimal85.stripTrailingZeros();
        float float87 = bigDecimal85.floatValue();
        java.math.BigDecimal bigDecimal88 = bigDecimal83.multiply(bigDecimal85);
        org.apache.commons.math.linear.BigMatrix bigMatrix89 = bigMatrix74.scalarAdd(bigDecimal88);
        int int90 = bigDecimal88.intValue();
        java.math.BigDecimal bigDecimal91 = bigDecimal88.stripTrailingZeros();
        java.math.BigDecimal bigDecimal93 = bigDecimal91.movePointLeft((int) (byte) 100);
        java.math.BigDecimal bigDecimal95 = bigDecimal93.movePointRight((int) (byte) -1);
        java.math.BigDecimal bigDecimal96 = bigDecimal38.add(bigDecimal93);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal95", (bigDecimal1.compareTo(bigDecimal95) == 0) == bigDecimal1.equals(bigDecimal95));
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test692");
        double[] doubleArray2 = new double[] { 1.0d, 100.0f };
        double[] doubleArray5 = new double[] { 1.0d, 100.0f };
        double[] doubleArray8 = new double[] { 1.0d, 100.0f };
        double[] doubleArray11 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl14 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = bigMatrixImpl14.transpose();
        double[] doubleArray17 = bigMatrixImpl14.getRowAsDoubleArray((int) (short) 0);
        boolean boolean18 = bigMatrixImpl14.isSingular();
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = bigMatrixImpl14.copy();
        int int20 = bigMatrixImpl14.getScale();
        int int21 = bigMatrixImpl14.getColumnDimension();
        java.math.BigDecimal bigDecimal23 = new java.math.BigDecimal(0.0d);
        java.lang.String str24 = bigDecimal23.toString();
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal27 = bigDecimal26.stripTrailingZeros();
        int int28 = bigDecimal26.signum();
        java.math.BigDecimal[] bigDecimalArray29 = bigDecimal23.divideAndRemainder(bigDecimal26);
        java.math.BigDecimal bigDecimal31 = bigDecimal23.pow((int) 'a');
        java.math.BigInteger bigInteger32 = bigDecimal23.toBigInteger();
        java.math.BigDecimal bigDecimal34 = new java.math.BigDecimal(bigInteger32, 3);
        java.lang.String[] strArray36 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray37 = new java.lang.String[][] { strArray36 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl38 = new org.apache.commons.math.linear.BigMatrixImpl(strArray37);
        int int39 = bigMatrixImpl38.getColumnDimension();
        boolean boolean40 = bigDecimal34.equals((java.lang.Object) int39);
        org.apache.commons.math.linear.BigMatrix bigMatrix41 = bigMatrixImpl14.scalarMultiply(bigDecimal34);
        int int42 = bigMatrix41.getRoundingMode();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal23 and bigDecimal34", (bigDecimal23.compareTo(bigDecimal34) == 0) == bigDecimal23.equals(bigDecimal34));
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test693");
        java.lang.String[] strArray1 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl3 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        java.math.BigDecimal[][] bigDecimalArray4 = bigMatrixImpl3.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix5 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray4);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl6 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray4);
        java.math.BigDecimal bigDecimal7 = bigMatrixImpl6.getTrace();
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.valueOf((long) 0, (int) (short) -100);
        java.math.BigDecimal bigDecimal11 = bigDecimal10.stripTrailingZeros();
        java.math.BigDecimal bigDecimal13 = new java.math.BigDecimal(0.0d);
        java.lang.String str14 = bigDecimal13.toString();
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal17 = bigDecimal16.stripTrailingZeros();
        int int18 = bigDecimal16.signum();
        java.math.BigDecimal[] bigDecimalArray19 = bigDecimal13.divideAndRemainder(bigDecimal16);
        java.math.BigDecimal bigDecimal21 = bigDecimal13.pow((int) 'a');
        java.math.BigInteger bigInteger22 = bigDecimal13.toBigIntegerExact();
        float float23 = bigDecimal13.floatValue();
        double[] doubleArray28 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix29 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray28);
        double[] doubleArray34 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix35 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray34);
        double[] doubleArray36 = realMatrix29.operate(doubleArray34);
        org.apache.commons.math.linear.BigMatrix bigMatrix37 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray36);
        java.math.BigDecimal bigDecimal38 = bigMatrix37.getNorm();
        java.math.BigDecimal bigDecimal39 = bigDecimal13.subtract(bigDecimal38);
        int int40 = bigDecimal39.signum();
        java.math.BigInteger bigInteger41 = bigDecimal39.toBigInteger();
        java.math.BigDecimal bigDecimal43 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal45 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal[] bigDecimalArray46 = bigDecimal43.divideAndRemainder(bigDecimal45);
        java.math.BigDecimal bigDecimal48 = bigDecimal45.movePointLeft((-1));
        java.math.BigDecimal bigDecimal49 = bigDecimal39.max(bigDecimal45);
        int int50 = bigDecimal45.precision();
        java.math.BigDecimal bigDecimal51 = bigDecimal10.divide(bigDecimal45);
        java.math.BigDecimal bigDecimal52 = bigDecimal7.divideToIntegralValue(bigDecimal45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal10 and bigDecimal11", (bigDecimal10.compareTo(bigDecimal11) == 0) == bigDecimal10.equals(bigDecimal11));
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test694");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.min(bigDecimal4);
        java.math.BigDecimal[] bigDecimalArray7 = new java.math.BigDecimal[] { bigDecimal6 };
        java.math.BigDecimal bigDecimal9 = new java.math.BigDecimal(0.0d);
        int int10 = bigDecimal9.intValue();
        java.math.BigDecimal bigDecimal12 = new java.math.BigDecimal(0.0d);
        int int13 = bigDecimal12.intValue();
        java.math.BigDecimal bigDecimal14 = bigDecimal9.min(bigDecimal12);
        java.math.BigDecimal[] bigDecimalArray15 = new java.math.BigDecimal[] { bigDecimal14 };
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(0.0d);
        int int18 = bigDecimal17.intValue();
        java.math.BigDecimal bigDecimal20 = new java.math.BigDecimal(0.0d);
        int int21 = bigDecimal20.intValue();
        java.math.BigDecimal bigDecimal22 = bigDecimal17.min(bigDecimal20);
        java.math.BigDecimal[] bigDecimalArray23 = new java.math.BigDecimal[] { bigDecimal22 };
        java.math.BigDecimal[][] bigDecimalArray24 = new java.math.BigDecimal[][] { bigDecimalArray7, bigDecimalArray15, bigDecimalArray23 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl25 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrix bigMatrix26 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray24);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl27 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray24);
        java.math.BigDecimal[][] bigDecimalArray28 = bigMatrixImpl27.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl29 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray28);
        java.math.BigDecimal bigDecimal30 = bigMatrixImpl29.getNorm();
        java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal33 = bigDecimal32.stripTrailingZeros();
        float float34 = bigDecimal32.floatValue();
        java.math.BigDecimal bigDecimal35 = bigDecimal30.remainder(bigDecimal32);
        java.lang.String str36 = bigDecimal30.toEngineeringString();
        java.math.BigDecimal bigDecimal38 = bigDecimal30.movePointRight((-32));
        java.math.BigDecimal bigDecimal40 = bigDecimal38.setScale((int) (byte) 10);
        int int41 = bigDecimal40.signum();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal38", (bigDecimal1.compareTo(bigDecimal38) == 0) == bigDecimal1.equals(bigDecimal38));
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test695");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        java.math.BigDecimal bigDecimal2 = bigDecimal1.stripTrailingZeros();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        int int6 = bigDecimal5.scale();
        java.math.BigDecimal bigDecimal8 = new java.math.BigDecimal((double) 2805.0f);
        java.math.BigDecimal bigDecimal10 = bigDecimal8.setScale((int) '4');
        java.math.BigDecimal bigDecimal11 = bigDecimal5.multiply(bigDecimal8);
        java.math.BigDecimal bigDecimal14 = bigDecimal1.divide(bigDecimal8, (int) '#', 2);
        java.math.BigDecimal bigDecimal16 = new java.math.BigDecimal(0.0d);
        java.lang.String str17 = bigDecimal16.toString();
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal20 = bigDecimal19.stripTrailingZeros();
        int int21 = bigDecimal19.signum();
        java.math.BigDecimal[] bigDecimalArray22 = bigDecimal16.divideAndRemainder(bigDecimal19);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl23 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray22);
        int int24 = bigMatrixImpl23.getRoundingMode();
        org.apache.commons.math.linear.BigMatrix bigMatrix25 = bigMatrixImpl23.transpose();
        double[][] doubleArray26 = bigMatrix25.getDataAsDoubleArray();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl27 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray26);
        java.math.BigDecimal bigDecimal28 = bigMatrixImpl27.getNorm();
        double[] doubleArray31 = new double[] { 1.0d, 100.0f };
        double[] doubleArray34 = new double[] { 1.0d, 100.0f };
        double[] doubleArray37 = new double[] { 1.0d, 100.0f };
        double[] doubleArray40 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray41 = new double[][] { doubleArray31, doubleArray34, doubleArray37, doubleArray40 };
        org.apache.commons.math.linear.BigMatrix bigMatrix42 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray41);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl43 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray41);
        org.apache.commons.math.linear.BigMatrix bigMatrix44 = bigMatrixImpl43.transpose();
        double[] doubleArray46 = bigMatrixImpl43.getRowAsDoubleArray((int) (short) 0);
        boolean boolean47 = bigMatrixImpl43.isSingular();
        java.math.BigDecimal[][] bigDecimalArray48 = bigMatrixImpl43.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl49 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray48);
        org.apache.commons.math.linear.BigMatrix bigMatrix50 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray48);
        boolean boolean51 = bigDecimal28.equals((java.lang.Object) bigMatrix50);
        int int52 = bigDecimal28.precision();
        java.math.BigDecimal bigDecimal53 = bigDecimal8.min(bigDecimal28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal14", (bigDecimal1.compareTo(bigDecimal14) == 0) == bigDecimal1.equals(bigDecimal14));
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test696");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal3 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal[] bigDecimalArray4 = bigDecimal1.divideAndRemainder(bigDecimal3);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl5 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix6 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(bigDecimalArray4);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl7 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray4);
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = bigMatrixImpl7.copy();
        bigMatrixImpl7.setRoundingMode(0);
        org.apache.commons.math.linear.BigMatrix bigMatrix11 = bigMatrixImpl7.copy();
        java.math.BigDecimal bigDecimal13 = new java.math.BigDecimal(0.0d);
        java.lang.String str14 = bigDecimal13.toString();
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal17 = bigDecimal16.stripTrailingZeros();
        int int18 = bigDecimal16.signum();
        java.math.BigDecimal[] bigDecimalArray19 = bigDecimal13.divideAndRemainder(bigDecimal16);
        java.math.BigDecimal bigDecimal21 = bigDecimal13.pow((int) 'a');
        java.math.BigDecimal bigDecimal23 = new java.math.BigDecimal(0.0d);
        java.lang.String str24 = bigDecimal23.toString();
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal27 = bigDecimal26.stripTrailingZeros();
        int int28 = bigDecimal26.signum();
        java.math.BigDecimal[] bigDecimalArray29 = bigDecimal23.divideAndRemainder(bigDecimal26);
        java.math.BigDecimal bigDecimal31 = bigDecimal23.pow((int) 'a');
        java.math.BigInteger bigInteger32 = bigDecimal23.toBigIntegerExact();
        java.math.BigDecimal bigDecimal33 = bigDecimal21.add(bigDecimal23);
        java.math.BigDecimal bigDecimal35 = bigDecimal33.pow((int) (byte) 97);
        int int36 = bigDecimal33.scale();
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger39 = bigDecimal38.unscaledValue();
        java.lang.String str40 = bigDecimal38.toPlainString();
        java.math.BigDecimal bigDecimal42 = bigDecimal38.movePointRight(64);
        java.math.BigDecimal bigDecimal43 = bigDecimal42.stripTrailingZeros();
        java.math.BigInteger bigInteger44 = bigDecimal42.unscaledValue();
        java.math.BigDecimal bigDecimal45 = bigDecimal33.divide(bigDecimal42);
        java.math.BigDecimal bigDecimal46 = bigDecimal42.ulp();
        org.apache.commons.math.linear.BigMatrix bigMatrix47 = bigMatrixImpl7.scalarMultiply(bigDecimal46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal42 and bigDecimal43", (bigDecimal42.compareTo(bigDecimal43) == 0) == bigDecimal42.equals(bigDecimal43));
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test697");
        double[] doubleArray2 = new double[] { 1.0d, 100.0f };
        double[] doubleArray5 = new double[] { 1.0d, 100.0f };
        double[] doubleArray8 = new double[] { 1.0d, 100.0f };
        double[] doubleArray11 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl14 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        bigMatrixImpl14.setRoundingMode((int) (short) 0);
        java.math.BigDecimal[][] bigDecimalArray17 = bigMatrixImpl14.getDataRef();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray17);
        double[][] doubleArray19 = bigMatrixImpl18.getDataAsDoubleArray();
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal22 = bigDecimal21.stripTrailingZeros();
        float float23 = bigDecimal21.floatValue();
        double[] doubleArray26 = new double[] { 1.0d, 100.0f };
        double[] doubleArray29 = new double[] { 1.0d, 100.0f };
        double[] doubleArray32 = new double[] { 1.0d, 100.0f };
        double[] doubleArray35 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray36 = new double[][] { doubleArray26, doubleArray29, doubleArray32, doubleArray35 };
        org.apache.commons.math.linear.BigMatrix bigMatrix37 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray36);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl38 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray36);
        org.apache.commons.math.linear.BigMatrix bigMatrix39 = bigMatrixImpl38.transpose();
        int int40 = bigMatrixImpl38.getColumnDimension();
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal43 = bigDecimal42.stripTrailingZeros();
        int int44 = bigDecimal42.signum();
        org.apache.commons.math.linear.BigMatrix bigMatrix45 = bigMatrixImpl38.scalarMultiply(bigDecimal42);
        java.math.BigDecimal bigDecimal46 = bigMatrixImpl38.getNorm();
        java.math.BigDecimal bigDecimal47 = bigDecimal21.remainder(bigDecimal46);
        short short48 = bigDecimal46.shortValueExact();
        boolean boolean49 = bigMatrixImpl18.equals((java.lang.Object) bigDecimal46);
        java.math.BigDecimal bigDecimal50 = bigDecimal46.abs();
        java.math.BigDecimal bigDecimal51 = bigDecimal46.stripTrailingZeros();
        java.math.BigDecimal bigDecimal53 = new java.math.BigDecimal((long) (short) -100);
        java.math.BigInteger bigInteger54 = bigDecimal53.toBigInteger();
        java.math.BigDecimal bigDecimal56 = new java.math.BigDecimal("32");
        java.math.BigDecimal bigDecimal57 = bigDecimal53.remainder(bigDecimal56);
        java.math.BigDecimal bigDecimal58 = bigDecimal51.subtract(bigDecimal53);
        java.math.BigDecimal bigDecimal60 = bigDecimal51.setScale(7);
        int int61 = bigDecimal51.scale();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal46 and bigDecimal60", (bigDecimal46.compareTo(bigDecimal60) == 0) == bigDecimal46.equals(bigDecimal60));
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test698");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger3 = bigDecimal2.unscaledValue();
        java.math.BigDecimal bigDecimal4 = bigDecimal0.add(bigDecimal2);
        java.math.BigDecimal bigDecimal6 = new java.math.BigDecimal(0.0d);
        java.lang.String str7 = bigDecimal6.toString();
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal10 = bigDecimal9.stripTrailingZeros();
        int int11 = bigDecimal9.signum();
        java.math.BigDecimal[] bigDecimalArray12 = bigDecimal6.divideAndRemainder(bigDecimal9);
        java.math.BigDecimal bigDecimal14 = bigDecimal6.pow((int) 'a');
        java.math.BigDecimal bigDecimal16 = new java.math.BigDecimal(0.0d);
        java.lang.String str17 = bigDecimal16.toString();
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal20 = bigDecimal19.stripTrailingZeros();
        int int21 = bigDecimal19.signum();
        java.math.BigDecimal[] bigDecimalArray22 = bigDecimal16.divideAndRemainder(bigDecimal19);
        java.math.BigDecimal bigDecimal24 = bigDecimal16.pow((int) 'a');
        java.math.BigInteger bigInteger25 = bigDecimal16.toBigIntegerExact();
        java.math.BigDecimal bigDecimal26 = bigDecimal14.add(bigDecimal16);
        java.math.BigDecimal bigDecimal27 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger30 = bigDecimal29.unscaledValue();
        java.math.BigDecimal bigDecimal31 = bigDecimal27.add(bigDecimal29);
        java.math.BigDecimal bigDecimal32 = bigDecimal16.multiply(bigDecimal27);
        java.math.BigDecimal bigDecimal33 = bigDecimal0.subtract(bigDecimal16);
        java.math.BigDecimal bigDecimal34 = bigDecimal33.abs();
        java.math.BigDecimal bigDecimal36 = new java.math.BigDecimal(0.0d);
        int int37 = bigDecimal36.intValue();
        java.math.BigDecimal bigDecimal39 = new java.math.BigDecimal(0.0d);
        int int40 = bigDecimal39.intValue();
        java.math.BigDecimal bigDecimal41 = bigDecimal36.min(bigDecimal39);
        java.math.BigDecimal[] bigDecimalArray42 = new java.math.BigDecimal[] { bigDecimal41 };
        java.math.BigDecimal bigDecimal44 = new java.math.BigDecimal(0.0d);
        int int45 = bigDecimal44.intValue();
        java.math.BigDecimal bigDecimal47 = new java.math.BigDecimal(0.0d);
        int int48 = bigDecimal47.intValue();
        java.math.BigDecimal bigDecimal49 = bigDecimal44.min(bigDecimal47);
        java.math.BigDecimal[] bigDecimalArray50 = new java.math.BigDecimal[] { bigDecimal49 };
        java.math.BigDecimal bigDecimal52 = new java.math.BigDecimal(0.0d);
        int int53 = bigDecimal52.intValue();
        java.math.BigDecimal bigDecimal55 = new java.math.BigDecimal(0.0d);
        int int56 = bigDecimal55.intValue();
        java.math.BigDecimal bigDecimal57 = bigDecimal52.min(bigDecimal55);
        java.math.BigDecimal[] bigDecimalArray58 = new java.math.BigDecimal[] { bigDecimal57 };
        java.math.BigDecimal[][] bigDecimalArray59 = new java.math.BigDecimal[][] { bigDecimalArray42, bigDecimalArray50, bigDecimalArray58 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl60 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray59);
        org.apache.commons.math.linear.BigMatrix bigMatrix61 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray59);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl62 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray59);
        java.math.BigDecimal bigDecimal65 = java.math.BigDecimal.valueOf(0L, (int) ' ');
        org.apache.commons.math.linear.BigMatrix bigMatrix66 = bigMatrixImpl62.scalarAdd(bigDecimal65);
        java.math.BigDecimal bigDecimal67 = bigDecimal34.add(bigDecimal65);
        java.math.BigDecimal bigDecimal69 = new java.math.BigDecimal((int) (byte) 97);
        java.math.BigDecimal bigDecimal71 = bigDecimal69.setScale(5);
        java.math.BigDecimal bigDecimal73 = new java.math.BigDecimal((double) (-1L));
        java.math.BigDecimal bigDecimal74 = bigDecimal71.subtract(bigDecimal73);
        java.math.BigDecimal bigDecimal75 = bigDecimal71.stripTrailingZeros();
        java.math.BigDecimal[] bigDecimalArray76 = bigDecimal34.divideAndRemainder(bigDecimal75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal34 and bigDecimal67", (bigDecimal34.compareTo(bigDecimal67) == 0) == bigDecimal34.equals(bigDecimal67));
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test699");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(3, 10);
        org.apache.commons.math.linear.BigMatrix bigMatrix4 = bigMatrixImpl2.getRowMatrix(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal5 = bigMatrixImpl2.getNorm();
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test700");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal2 = bigDecimal1.stripTrailingZeros();
        float float3 = bigDecimal1.floatValue();
        double[] doubleArray6 = new double[] { 1.0d, 100.0f };
        double[] doubleArray9 = new double[] { 1.0d, 100.0f };
        double[] doubleArray12 = new double[] { 1.0d, 100.0f };
        double[] doubleArray15 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray16 = new double[][] { doubleArray6, doubleArray9, doubleArray12, doubleArray15 };
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray16);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl18 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray16);
        org.apache.commons.math.linear.BigMatrix bigMatrix19 = bigMatrixImpl18.transpose();
        int int20 = bigMatrixImpl18.getColumnDimension();
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal23 = bigDecimal22.stripTrailingZeros();
        int int24 = bigDecimal22.signum();
        org.apache.commons.math.linear.BigMatrix bigMatrix25 = bigMatrixImpl18.scalarMultiply(bigDecimal22);
        java.math.BigDecimal bigDecimal26 = bigMatrixImpl18.getNorm();
        java.math.BigDecimal bigDecimal27 = bigDecimal1.remainder(bigDecimal26);
        java.lang.String str28 = bigDecimal1.toString();
        java.math.BigDecimal bigDecimal30 = bigDecimal1.pow((int) 'a');
        java.math.BigDecimal bigDecimal33 = bigDecimal1.setScale((int) (short) 400, (int) (byte) 0);
        java.math.BigDecimal bigDecimal35 = new java.math.BigDecimal(0.0d);
        int int36 = bigDecimal35.intValue();
        long long37 = bigDecimal35.longValue();
        long long38 = bigDecimal35.longValueExact();
        int int39 = bigDecimal35.precision();
        java.math.BigDecimal bigDecimal41 = new java.math.BigDecimal(0.0d);
        int int42 = bigDecimal41.intValue();
        long long43 = bigDecimal41.longValue();
        long long44 = bigDecimal41.longValueExact();
        java.math.BigDecimal bigDecimal45 = bigDecimal35.add(bigDecimal41);
        java.math.BigDecimal bigDecimal47 = bigDecimal41.pow(3);
        byte byte48 = bigDecimal41.byteValueExact();
        java.math.BigDecimal bigDecimal50 = new java.math.BigDecimal(0.0d);
        int int51 = bigDecimal50.intValue();
        long long52 = bigDecimal50.longValue();
        long long53 = bigDecimal50.longValueExact();
        int int54 = bigDecimal50.precision();
        java.math.BigDecimal bigDecimal56 = new java.math.BigDecimal(0.0d);
        int int57 = bigDecimal56.intValue();
        long long58 = bigDecimal56.longValue();
        long long59 = bigDecimal56.longValueExact();
        java.math.BigDecimal bigDecimal60 = bigDecimal50.add(bigDecimal56);
        java.math.BigDecimal bigDecimal62 = new java.math.BigDecimal(0.0d);
        java.lang.String str63 = bigDecimal62.toString();
        java.math.BigDecimal bigDecimal65 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal66 = bigDecimal65.stripTrailingZeros();
        int int67 = bigDecimal65.signum();
        java.math.BigDecimal[] bigDecimalArray68 = bigDecimal62.divideAndRemainder(bigDecimal65);
        java.math.BigDecimal bigDecimal70 = bigDecimal62.pow((int) 'a');
        java.math.BigDecimal bigDecimal72 = new java.math.BigDecimal(0.0d);
        java.lang.String str73 = bigDecimal72.toString();
        java.math.BigDecimal bigDecimal75 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal76 = bigDecimal75.stripTrailingZeros();
        int int77 = bigDecimal75.signum();
        java.math.BigDecimal[] bigDecimalArray78 = bigDecimal72.divideAndRemainder(bigDecimal75);
        java.math.BigDecimal bigDecimal80 = bigDecimal72.pow((int) 'a');
        java.math.BigInteger bigInteger81 = bigDecimal72.toBigIntegerExact();
        java.math.BigDecimal bigDecimal82 = bigDecimal70.add(bigDecimal72);
        java.math.BigDecimal bigDecimal83 = bigDecimal56.multiply(bigDecimal70);
        java.math.BigDecimal bigDecimal84 = bigDecimal56.ulp();
        java.math.BigDecimal bigDecimal86 = new java.math.BigDecimal((int) (byte) 10);
        java.math.BigDecimal bigDecimal87 = bigDecimal56.add(bigDecimal86);
        java.math.BigDecimal bigDecimal88 = bigDecimal41.max(bigDecimal86);
        java.math.BigDecimal bigDecimal89 = bigDecimal1.max(bigDecimal86);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal2 and bigDecimal33", (bigDecimal2.compareTo(bigDecimal33) == 0) == bigDecimal2.equals(bigDecimal33));
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test701");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger3 = bigDecimal2.unscaledValue();
        java.math.BigDecimal bigDecimal4 = bigDecimal0.add(bigDecimal2);
        java.math.BigDecimal bigDecimal6 = bigDecimal2.setScale(100);
        java.math.BigInteger bigInteger7 = bigDecimal6.toBigIntegerExact();
        byte byte8 = bigDecimal6.byteValueExact();
        java.math.BigDecimal bigDecimal10 = bigDecimal6.movePointLeft((int) '#');
        float float11 = bigDecimal10.floatValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal2 and bigDecimal6", (bigDecimal2.compareTo(bigDecimal6) == 0) == bigDecimal2.equals(bigDecimal6));
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test702");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        int int2 = bigDecimal1.intValue();
        java.math.BigDecimal bigDecimal4 = new java.math.BigDecimal(0.0d);
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.min(bigDecimal4);
        java.math.BigInteger bigInteger7 = bigDecimal1.toBigInteger();
        int int8 = bigDecimal1.precision();
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigDecimal bigDecimal11 = bigDecimal1.subtract(bigDecimal10);
        java.math.BigDecimal bigDecimal12 = bigDecimal10.ulp();
        java.math.BigDecimal bigDecimal13 = bigDecimal10.negate();
        java.math.BigDecimal bigDecimal16 = bigDecimal13.setScale((-2), 4);
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigDecimal bigDecimal20 = new java.math.BigDecimal(0.0d);
        int int21 = bigDecimal20.intValue();
        java.math.BigDecimal bigDecimal23 = new java.math.BigDecimal(0.0d);
        int int24 = bigDecimal23.intValue();
        java.math.BigDecimal bigDecimal25 = bigDecimal20.min(bigDecimal23);
        java.math.BigInteger bigInteger26 = bigDecimal20.toBigInteger();
        java.math.BigDecimal bigDecimal27 = new java.math.BigDecimal(bigInteger26);
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal30 = bigDecimal29.stripTrailingZeros();
        float float31 = bigDecimal29.floatValue();
        java.math.BigDecimal bigDecimal32 = bigDecimal27.multiply(bigDecimal29);
        java.math.BigDecimal bigDecimal33 = bigDecimal27.negate();
        java.math.BigDecimal bigDecimal34 = bigDecimal18.subtract(bigDecimal27);
        int int35 = bigDecimal13.compareTo(bigDecimal27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal11 and bigDecimal16", (bigDecimal11.compareTo(bigDecimal16) == 0) == bigDecimal11.equals(bigDecimal16));
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test703");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        java.lang.String str2 = bigDecimal1.toString();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal5 = bigDecimal4.stripTrailingZeros();
        int int6 = bigDecimal4.signum();
        java.math.BigDecimal[] bigDecimalArray7 = bigDecimal1.divideAndRemainder(bigDecimal4);
        java.math.BigDecimal bigDecimal9 = bigDecimal1.pow((int) 'a');
        java.math.BigDecimal bigDecimal11 = new java.math.BigDecimal(0.0d);
        java.lang.String str12 = bigDecimal11.toString();
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal15 = bigDecimal14.stripTrailingZeros();
        int int16 = bigDecimal14.signum();
        java.math.BigDecimal[] bigDecimalArray17 = bigDecimal11.divideAndRemainder(bigDecimal14);
        java.math.BigDecimal bigDecimal19 = bigDecimal11.pow((int) 'a');
        java.math.BigInteger bigInteger20 = bigDecimal11.toBigIntegerExact();
        java.math.BigDecimal bigDecimal21 = bigDecimal9.add(bigDecimal11);
        java.math.BigInteger bigInteger22 = bigDecimal21.unscaledValue();
        java.math.BigDecimal bigDecimal24 = new java.math.BigDecimal(bigInteger22, 100);
        java.math.BigInteger bigInteger25 = bigDecimal24.toBigInteger();
        java.math.BigDecimal bigDecimal27 = new java.math.BigDecimal(bigInteger25, (int) (byte) -90);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal24", (bigDecimal1.compareTo(bigDecimal24) == 0) == bigDecimal1.equals(bigDecimal24));
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test704");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger3 = bigDecimal2.unscaledValue();
        java.math.BigDecimal bigDecimal4 = bigDecimal0.add(bigDecimal2);
        float float5 = bigDecimal2.floatValue();
        java.math.BigDecimal bigDecimal7 = bigDecimal2.setScale((int) (short) 97);
        java.math.BigDecimal bigDecimal9 = bigDecimal2.scaleByPowerOfTen((int) '4');
        java.lang.String str10 = bigDecimal9.toEngineeringString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal2 and bigDecimal7", (bigDecimal2.compareTo(bigDecimal7) == 0) == bigDecimal2.equals(bigDecimal7));
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test705");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal((int) (byte) 100);
        java.math.BigDecimal bigDecimal3 = new java.math.BigDecimal(0.0d);
        java.lang.String str4 = bigDecimal3.toString();
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal7 = bigDecimal6.stripTrailingZeros();
        int int8 = bigDecimal6.signum();
        java.math.BigDecimal[] bigDecimalArray9 = bigDecimal3.divideAndRemainder(bigDecimal6);
        java.math.BigDecimal bigDecimal11 = bigDecimal3.pow((int) 'a');
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal14 = bigDecimal13.stripTrailingZeros();
        float float15 = bigDecimal13.floatValue();
        java.math.BigDecimal bigDecimal16 = bigDecimal11.divideToIntegralValue(bigDecimal13);
        java.math.BigDecimal bigDecimal17 = bigDecimal1.max(bigDecimal11);
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal20 = bigDecimal19.stripTrailingZeros();
        float float21 = bigDecimal19.floatValue();
        java.math.BigDecimal bigDecimal22 = bigDecimal17.max(bigDecimal19);
        float float23 = bigDecimal19.floatValue();
        java.math.BigDecimal bigDecimal25 = bigDecimal19.setScale((int) (byte) 10);
        java.lang.String str26 = bigDecimal19.toPlainString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal6 and bigDecimal25", (bigDecimal6.compareTo(bigDecimal25) == 0) == bigDecimal6.equals(bigDecimal25));
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test706");
        double[] doubleArray2 = new double[] { 1.0d, 100.0f };
        double[] doubleArray5 = new double[] { 1.0d, 100.0f };
        double[] doubleArray8 = new double[] { 1.0d, 100.0f };
        double[] doubleArray11 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray12 = new double[][] { doubleArray2, doubleArray5, doubleArray8, doubleArray11 };
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl14 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = bigMatrixImpl14.transpose();
        double[] doubleArray17 = bigMatrixImpl14.getRowAsDoubleArray((int) (short) 0);
        boolean boolean18 = bigMatrixImpl14.isSingular();
        java.math.BigDecimal[][] bigDecimalArray19 = bigMatrixImpl14.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray19);
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigDecimal bigDecimal23 = bigDecimal22.negate();
        int int24 = bigDecimal23.scale();
        boolean boolean25 = bigMatrixImpl20.equals((java.lang.Object) bigDecimal23);
        java.lang.String str26 = bigDecimal23.toEngineeringString();
        java.math.BigDecimal bigDecimal27 = bigDecimal23.stripTrailingZeros();
        java.math.BigInteger bigInteger28 = bigDecimal27.toBigIntegerExact();
        java.math.BigDecimal bigDecimal30 = new java.math.BigDecimal(bigInteger28, (int) (short) 31464);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal23 and bigDecimal27", (bigDecimal23.compareTo(bigDecimal27) == 0) == bigDecimal23.equals(bigDecimal27));
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test707");
        java.math.MathContext mathContext1 = null;
        java.math.BigDecimal bigDecimal2 = new java.math.BigDecimal(0.0d, mathContext1);
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger5 = bigDecimal4.unscaledValue();
        java.lang.String str6 = bigDecimal4.toPlainString();
        java.math.BigDecimal bigDecimal8 = bigDecimal4.movePointRight(64);
        java.math.BigDecimal bigDecimal9 = bigDecimal8.stripTrailingZeros();
        java.math.BigDecimal bigDecimal10 = bigDecimal2.divide(bigDecimal8);
        java.math.BigInteger bigInteger11 = bigDecimal2.toBigInteger();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal8 and bigDecimal9", (bigDecimal8.compareTo(bigDecimal9) == 0) == bigDecimal8.equals(bigDecimal9));
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test708");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix5 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray4);
        double[] doubleArray10 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix11 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray10);
        double[] doubleArray12 = realMatrix5.operate(doubleArray10);
        org.apache.commons.math.linear.BigMatrix bigMatrix13 = org.apache.commons.math.linear.MatrixUtils.createColumnBigMatrix(doubleArray10);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray10);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = realMatrix14.transpose();
        double[][] doubleArray16 = realMatrix14.getData();
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray16);
        boolean boolean18 = bigMatrixImpl17.isSingular();
        int int19 = bigMatrixImpl17.getScale();
        double[][] doubleArray20 = bigMatrixImpl17.getDataAsDoubleArray();
        java.math.BigDecimal[][] bigDecimalArray21 = bigMatrixImpl17.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix22 = bigMatrixImpl17.copy();
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigDecimal bigDecimal25 = bigDecimal24.negate();
        int int26 = bigDecimal25.scale();
        java.math.BigDecimal bigDecimal28 = new java.math.BigDecimal((double) 2805.0f);
        java.math.BigDecimal bigDecimal30 = bigDecimal28.setScale((int) '4');
        java.math.BigDecimal bigDecimal31 = bigDecimal25.multiply(bigDecimal28);
        org.apache.commons.math.linear.BigMatrix bigMatrix32 = bigMatrixImpl17.scalarAdd(bigDecimal25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal28 and bigDecimal30", (bigDecimal28.compareTo(bigDecimal30) == 0) == bigDecimal28.equals(bigDecimal30));
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test709");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(4);
        java.math.BigDecimal bigDecimal3 = new java.math.BigDecimal((int) (byte) 10);
        int int4 = bigDecimal3.scale();
        java.math.BigDecimal bigDecimal5 = bigDecimal1.divideToIntegralValue(bigDecimal3);
        java.math.MathContext mathContext7 = null;
        java.math.BigDecimal bigDecimal8 = new java.math.BigDecimal((double) (byte) 0, mathContext7);
        java.math.BigDecimal bigDecimal10 = new java.math.BigDecimal(0.0d);
        int int11 = bigDecimal10.intValue();
        java.math.BigDecimal bigDecimal13 = new java.math.BigDecimal(0.0d);
        int int14 = bigDecimal13.intValue();
        java.math.BigDecimal bigDecimal15 = bigDecimal10.min(bigDecimal13);
        java.math.BigInteger bigInteger16 = bigDecimal10.toBigInteger();
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(bigInteger16);
        java.math.BigDecimal bigDecimal18 = new java.math.BigDecimal(bigInteger16);
        java.math.BigDecimal bigDecimal19 = bigDecimal8.add(bigDecimal18);
        java.math.BigDecimal bigDecimal20 = bigDecimal18.ulp();
        java.math.BigDecimal bigDecimal21 = bigDecimal3.subtract(bigDecimal18);
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.valueOf((long) (short) -2805, (int) (short) 1);
        java.math.BigDecimal bigDecimal25 = bigDecimal3.min(bigDecimal24);
        java.math.BigDecimal bigDecimal27 = new java.math.BigDecimal(9638.0d);
        java.math.BigDecimal bigDecimal28 = bigDecimal24.divideToIntegralValue(bigDecimal27);
        java.math.BigDecimal bigDecimal29 = bigDecimal24.stripTrailingZeros();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal5 and bigDecimal28", (bigDecimal5.compareTo(bigDecimal28) == 0) == bigDecimal5.equals(bigDecimal28));
    }
}

