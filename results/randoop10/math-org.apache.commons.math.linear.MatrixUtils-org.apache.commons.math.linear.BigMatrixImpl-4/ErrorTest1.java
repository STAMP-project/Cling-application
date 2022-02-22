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
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
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
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
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
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
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
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
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
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
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
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
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
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
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
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
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
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
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
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
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
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
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
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
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
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
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
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
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
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
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
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(7, 4);
        bigMatrixImpl2.setScale(10);
        java.math.BigDecimal[] bigDecimalArray6 = bigMatrixImpl2.getColumn(1);
        org.apache.commons.math.linear.BigMatrix bigMatrix7 = bigMatrixImpl2.copy();
        org.apache.commons.math.linear.BigMatrix bigMatrix8 = bigMatrixImpl2.transpose();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrix7 and bigMatrix7", bigMatrix7.equals(bigMatrix7) ? bigMatrix7.hashCode() == bigMatrix7.hashCode() : true);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
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
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
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
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
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
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
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
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
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
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal(0.0d);
        java.math.BigDecimal bigDecimal2 = bigDecimal1.stripTrailingZeros();
        java.math.BigDecimal bigDecimal5 = bigDecimal2.setScale((-100), 0);
        java.math.BigDecimal bigDecimal7 = bigDecimal2.setScale((int) (byte) -112);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal5", (bigDecimal1.compareTo(bigDecimal5) == 0) == bigDecimal1.equals(bigDecimal5));
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
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
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
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
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
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
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
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
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf((long) 0, (int) (short) -100);
        java.math.BigDecimal bigDecimal3 = bigDecimal2.stripTrailingZeros();
        float float4 = bigDecimal3.floatValue();
        java.math.BigDecimal bigDecimal5 = bigDecimal3.negate();
        int int6 = bigDecimal5.scale();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal2 and bigDecimal5", (bigDecimal2.compareTo(bigDecimal5) == 0) == bigDecimal2.equals(bigDecimal5));
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
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
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
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
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
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
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
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
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (byte) 52, (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double5 = bigMatrixImpl2.getEntryAsDouble((int) (byte) 32, (int) (byte) 1);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
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
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
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
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
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
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
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
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(64, 10);
        org.apache.commons.math.linear.BigMatrix bigMatrix3 = bigMatrixImpl2.copy();
        int int4 = bigMatrixImpl2.getColumnDimension();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on bigMatrix3 and bigMatrix3", bigMatrix3.equals(bigMatrix3) ? bigMatrix3.hashCode() == bigMatrix3.hashCode() : true);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
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
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
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
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
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
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
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
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
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
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
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
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
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
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
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
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
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
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
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
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
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
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
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
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
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
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl(3, 10);
        org.apache.commons.math.linear.BigMatrix bigMatrix4 = bigMatrixImpl2.getRowMatrix(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.math.BigDecimal bigDecimal5 = bigMatrixImpl2.getNorm();
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
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
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
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
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
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
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
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
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
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
        java.math.BigDecimal bigDecimal29 = bigDecimal22.scaleByPowerOfTen(0);
        java.math.BigDecimal bigDecimal31 = java.math.BigDecimal.valueOf((long) 6);
        java.math.BigDecimal bigDecimal33 = new java.math.BigDecimal("0.0");
        int int34 = bigDecimal31.compareTo(bigDecimal33);
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.valueOf((long) 6);
        java.math.BigDecimal bigDecimal37 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal39 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigInteger bigInteger40 = bigDecimal39.unscaledValue();
        java.math.BigDecimal bigDecimal41 = bigDecimal37.add(bigDecimal39);
        java.math.BigInteger bigInteger42 = bigDecimal39.toBigInteger();
        java.math.BigDecimal bigDecimal44 = new java.math.BigDecimal(bigInteger42, (int) (short) -1);
        java.math.BigDecimal bigDecimal46 = new java.math.BigDecimal((long) (short) 100);
        java.lang.String str47 = bigDecimal46.toEngineeringString();
        java.math.BigDecimal[] bigDecimalArray48 = bigDecimal44.divideAndRemainder(bigDecimal46);
        java.math.BigDecimal bigDecimal49 = bigDecimal36.remainder(bigDecimal44);
        java.math.BigDecimal bigDecimal50 = bigDecimal33.subtract(bigDecimal36);
        java.math.BigDecimal bigDecimal51 = bigDecimal22.multiply(bigDecimal50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal33", (bigDecimal1.compareTo(bigDecimal33) == 0) == bigDecimal1.equals(bigDecimal33));
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
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
        java.math.BigDecimal bigDecimal32 = bigMatrixImpl27.getNorm();
        double[] doubleArray37 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix38 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray37);
        org.apache.commons.math.linear.BigMatrix bigMatrix39 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray37);
        boolean boolean40 = bigMatrixImpl27.equals((java.lang.Object) doubleArray37);
        boolean boolean41 = bigMatrixImpl27.isSingular();
        java.math.BigDecimal[][] bigDecimalArray42 = bigMatrixImpl27.getDataRef();
        org.apache.commons.math.linear.BigMatrix bigMatrix43 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray42);
        java.math.BigDecimal bigDecimal45 = new java.math.BigDecimal((int) (byte) 97);
        java.math.BigDecimal bigDecimal47 = bigDecimal45.setScale(5);
        java.math.BigDecimal bigDecimal49 = bigDecimal45.movePointRight((int) (short) 10);
        org.apache.commons.math.linear.BigMatrix bigMatrix50 = bigMatrix43.scalarAdd(bigDecimal49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal45 and bigDecimal47", (bigDecimal45.compareTo(bigDecimal47) == 0) == bigDecimal45.equals(bigDecimal47));
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal((int) (byte) 97);
        java.math.BigDecimal bigDecimal3 = new java.math.BigDecimal(0.0d);
        java.lang.String str4 = bigDecimal3.toString();
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal7 = bigDecimal6.stripTrailingZeros();
        int int8 = bigDecimal6.signum();
        java.math.BigDecimal[] bigDecimalArray9 = bigDecimal3.divideAndRemainder(bigDecimal6);
        java.math.BigDecimal bigDecimal11 = bigDecimal3.pow((int) 'a');
        java.lang.String str12 = bigDecimal3.toString();
        java.math.BigDecimal bigDecimal14 = bigDecimal3.scaleByPowerOfTen((int) ' ');
        int int15 = bigDecimal1.compareTo(bigDecimal14);
        java.math.BigDecimal bigDecimal17 = bigDecimal14.setScale((int) (byte) -54);
        byte byte18 = bigDecimal17.byteValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal3 and bigDecimal14", (bigDecimal3.compareTo(bigDecimal14) == 0) == bigDecimal3.equals(bigDecimal14));
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl2 = new org.apache.commons.math.linear.BigMatrixImpl((int) (short) 1, (int) (short) 970);
        org.apache.commons.math.linear.BigMatrix bigMatrix3 = bigMatrixImpl2.transpose();
        java.math.BigDecimal bigDecimal5 = new java.math.BigDecimal(0.0d);
        java.lang.String str6 = bigDecimal5.toString();
        java.math.BigDecimal bigDecimal8 = bigDecimal5.setScale(0);
        java.math.BigDecimal bigDecimal9 = bigDecimal8.plus();
        java.lang.String[] strArray11 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray12 = new java.lang.String[][] { strArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(strArray12);
        java.math.BigDecimal[][] bigDecimalArray14 = bigMatrixImpl13.getData();
        int int15 = bigMatrixImpl13.getRoundingMode();
        java.math.BigDecimal[][] bigDecimalArray16 = bigMatrixImpl13.getData();
        org.apache.commons.math.linear.BigMatrix bigMatrix18 = org.apache.commons.math.linear.MatrixUtils.createBigIdentityMatrix((int) (short) 10);
        java.math.BigDecimal bigDecimal19 = bigMatrix18.getDeterminant();
        org.apache.commons.math.linear.BigMatrix bigMatrix20 = bigMatrixImpl13.scalarMultiply(bigDecimal19);
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.valueOf((long) (-100));
        java.math.BigDecimal bigDecimal23 = bigDecimal19.max(bigDecimal22);
        java.math.BigDecimal bigDecimal24 = bigDecimal9.divideToIntegralValue(bigDecimal22);
        double[] doubleArray27 = new double[] { 1.0d, 100.0f };
        double[] doubleArray30 = new double[] { 1.0d, 100.0f };
        double[] doubleArray33 = new double[] { 1.0d, 100.0f };
        double[] doubleArray36 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray37 = new double[][] { doubleArray27, doubleArray30, doubleArray33, doubleArray36 };
        org.apache.commons.math.linear.BigMatrix bigMatrix38 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray37);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl39 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray37);
        org.apache.commons.math.linear.BigMatrix bigMatrix40 = bigMatrixImpl39.transpose();
        double[] doubleArray42 = bigMatrixImpl39.getRowAsDoubleArray((int) (short) 0);
        boolean boolean43 = bigMatrixImpl39.isSingular();
        java.math.BigDecimal bigDecimal45 = new java.math.BigDecimal("100");
        org.apache.commons.math.linear.BigMatrix bigMatrix46 = bigMatrixImpl39.scalarMultiply(bigDecimal45);
        boolean boolean47 = bigDecimal22.equals((java.lang.Object) bigMatrixImpl39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.linear.BigMatrix bigMatrix48 = bigMatrixImpl2.scalarMultiply(bigDecimal22);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((long) (byte) 0);
        java.math.BigDecimal bigDecimal2 = bigDecimal1.abs();
        int int3 = bigDecimal1.precision();
        java.math.BigDecimal bigDecimal5 = bigDecimal1.setScale(35);
        java.math.BigDecimal bigDecimal7 = new java.math.BigDecimal(0.0d);
        int int8 = bigDecimal7.intValue();
        long long9 = bigDecimal7.longValue();
        long long10 = bigDecimal7.longValueExact();
        int int11 = bigDecimal7.precision();
        java.math.BigDecimal bigDecimal13 = new java.math.BigDecimal(0.0d);
        int int14 = bigDecimal13.intValue();
        long long15 = bigDecimal13.longValue();
        long long16 = bigDecimal13.longValueExact();
        java.math.BigDecimal bigDecimal17 = bigDecimal7.add(bigDecimal13);
        byte byte18 = bigDecimal7.byteValueExact();
        java.math.BigDecimal bigDecimal20 = new java.math.BigDecimal(0.0d);
        java.lang.String str21 = bigDecimal20.toString();
        java.math.BigDecimal bigDecimal23 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal24 = bigDecimal23.stripTrailingZeros();
        int int25 = bigDecimal23.signum();
        java.math.BigDecimal[] bigDecimalArray26 = bigDecimal20.divideAndRemainder(bigDecimal23);
        java.math.BigDecimal bigDecimal28 = bigDecimal20.pow((int) 'a');
        java.math.BigInteger bigInteger29 = bigDecimal20.toBigIntegerExact();
        float float30 = bigDecimal20.floatValue();
        double[] doubleArray35 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix36 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray35);
        double[] doubleArray41 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        org.apache.commons.math.linear.RealMatrix realMatrix42 = org.apache.commons.math.linear.MatrixUtils.createRowRealMatrix(doubleArray41);
        double[] doubleArray43 = realMatrix36.operate(doubleArray41);
        org.apache.commons.math.linear.BigMatrix bigMatrix44 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(doubleArray43);
        java.math.BigDecimal bigDecimal45 = bigMatrix44.getNorm();
        java.math.BigDecimal bigDecimal46 = bigDecimal20.subtract(bigDecimal45);
        int int47 = bigDecimal46.signum();
        java.math.BigInteger bigInteger48 = bigDecimal46.toBigInteger();
        java.math.BigDecimal bigDecimal50 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal52 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal[] bigDecimalArray53 = bigDecimal50.divideAndRemainder(bigDecimal52);
        java.math.BigDecimal bigDecimal55 = bigDecimal52.movePointLeft((-1));
        java.math.BigDecimal bigDecimal56 = bigDecimal46.max(bigDecimal52);
        java.math.BigDecimal bigDecimal57 = bigDecimal52.stripTrailingZeros();
        java.math.BigDecimal bigDecimal58 = bigDecimal7.remainder(bigDecimal52);
        java.math.BigInteger bigInteger59 = bigDecimal52.unscaledValue();
        java.math.BigDecimal bigDecimal60 = bigDecimal52.negate();
        int int61 = bigDecimal52.intValue();
        java.math.BigDecimal bigDecimal62 = bigDecimal52.plus();
        java.math.BigDecimal bigDecimal63 = bigDecimal1.subtract(bigDecimal52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal5", (bigDecimal1.compareTo(bigDecimal5) == 0) == bigDecimal1.equals(bigDecimal5));
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
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
        org.apache.commons.math.linear.BigMatrix bigMatrix57 = bigMatrix56.transpose();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal55", (bigDecimal1.compareTo(bigDecimal55) == 0) == bigDecimal1.equals(bigDecimal55));
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
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
        bigMatrixImpl6.setRoundingMode((int) (short) -2805);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal7 and bigDecimal9", (bigDecimal7.compareTo(bigDecimal9) == 0) == bigDecimal7.equals(bigDecimal9));
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
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
        int int30 = bigMatrixImpl27.getColumnDimension();
        bigMatrixImpl27.setRoundingMode((int) (byte) -100);
        bigMatrixImpl27.setScale(10);
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.valueOf(100L);
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.valueOf((double) 0L);
        java.math.BigDecimal bigDecimal39 = bigDecimal36.max(bigDecimal38);
        org.apache.commons.math.linear.BigMatrix bigMatrix40 = bigMatrixImpl27.scalarAdd(bigDecimal38);
        double[][] doubleArray41 = bigMatrix40.getDataAsDoubleArray();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal38", (bigDecimal1.compareTo(bigDecimal38) == 0) == bigDecimal1.equals(bigDecimal38));
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
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
        org.apache.commons.math.linear.BigMatrix bigMatrix15 = bigMatrixImpl14.transpose();
        int int16 = bigMatrixImpl14.getColumnDimension();
        org.apache.commons.math.linear.BigMatrix bigMatrix17 = bigMatrixImpl14.transpose();
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal20 = bigDecimal19.stripTrailingZeros();
        java.math.BigDecimal bigDecimal22 = new java.math.BigDecimal(0.0d);
        int int23 = bigDecimal22.intValue();
        java.math.BigDecimal bigDecimal25 = new java.math.BigDecimal(0.0d);
        int int26 = bigDecimal25.intValue();
        java.math.BigDecimal bigDecimal27 = bigDecimal22.min(bigDecimal25);
        java.math.BigInteger bigInteger28 = bigDecimal27.toBigIntegerExact();
        boolean boolean29 = bigDecimal19.equals((java.lang.Object) bigInteger28);
        java.math.BigDecimal bigDecimal30 = bigDecimal19.abs();
        double[] doubleArray33 = new double[] { 1.0d, 100.0f };
        double[] doubleArray36 = new double[] { 1.0d, 100.0f };
        double[] doubleArray39 = new double[] { 1.0d, 100.0f };
        double[] doubleArray42 = new double[] { 1.0d, 100.0f };
        double[][] doubleArray43 = new double[][] { doubleArray33, doubleArray36, doubleArray39, doubleArray42 };
        org.apache.commons.math.linear.BigMatrix bigMatrix44 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray43);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl45 = new org.apache.commons.math.linear.BigMatrixImpl(doubleArray43);
        org.apache.commons.math.linear.BigMatrix bigMatrix46 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(doubleArray43);
        boolean boolean47 = bigDecimal30.equals((java.lang.Object) bigMatrix46);
        org.apache.commons.math.linear.BigMatrix bigMatrix48 = bigMatrix17.scalarAdd(bigDecimal30);
        java.math.BigDecimal bigDecimal50 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigDecimal bigDecimal51 = bigDecimal50.negate();
        int int52 = bigDecimal51.scale();
        java.math.BigDecimal bigDecimal54 = new java.math.BigDecimal((double) 2805.0f);
        java.math.BigDecimal bigDecimal56 = bigDecimal54.setScale((int) '4');
        java.math.BigDecimal bigDecimal57 = bigDecimal51.multiply(bigDecimal54);
        java.math.BigDecimal[] bigDecimalArray58 = bigDecimal30.divideAndRemainder(bigDecimal54);
        org.apache.commons.math.linear.BigMatrix bigMatrix59 = org.apache.commons.math.linear.MatrixUtils.createRowBigMatrix(bigDecimalArray58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal54 and bigDecimal56", (bigDecimal54.compareTo(bigDecimal56) == 0) == bigDecimal54.equals(bigDecimal56));
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
        java.math.BigDecimal bigDecimal30 = java.math.BigDecimal.valueOf(0L, (int) ' ');
        org.apache.commons.math.linear.BigMatrix bigMatrix31 = bigMatrixImpl27.scalarAdd(bigDecimal30);
        java.math.BigDecimal bigDecimal33 = java.math.BigDecimal.valueOf((long) (byte) 1);
        java.math.BigDecimal bigDecimal34 = bigDecimal30.divideToIntegralValue(bigDecimal33);
        int int35 = bigDecimal34.precision();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal30", (bigDecimal1.compareTo(bigDecimal30) == 0) == bigDecimal1.equals(bigDecimal30));
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
        java.math.BigInteger bigInteger7 = bigDecimal1.toBigInteger();
        int int8 = bigDecimal1.precision();
        java.lang.String str9 = bigDecimal1.toEngineeringString();
        java.math.BigDecimal bigDecimal11 = new java.math.BigDecimal(0.0d);
        int int12 = bigDecimal11.intValue();
        java.math.BigDecimal bigDecimal14 = new java.math.BigDecimal(0.0d);
        int int15 = bigDecimal14.intValue();
        java.math.BigDecimal bigDecimal16 = bigDecimal11.min(bigDecimal14);
        java.math.BigDecimal[] bigDecimalArray17 = new java.math.BigDecimal[] { bigDecimal16 };
        java.math.BigDecimal bigDecimal19 = new java.math.BigDecimal(0.0d);
        int int20 = bigDecimal19.intValue();
        java.math.BigDecimal bigDecimal22 = new java.math.BigDecimal(0.0d);
        int int23 = bigDecimal22.intValue();
        java.math.BigDecimal bigDecimal24 = bigDecimal19.min(bigDecimal22);
        java.math.BigDecimal[] bigDecimalArray25 = new java.math.BigDecimal[] { bigDecimal24 };
        java.math.BigDecimal bigDecimal27 = new java.math.BigDecimal(0.0d);
        int int28 = bigDecimal27.intValue();
        java.math.BigDecimal bigDecimal30 = new java.math.BigDecimal(0.0d);
        int int31 = bigDecimal30.intValue();
        java.math.BigDecimal bigDecimal32 = bigDecimal27.min(bigDecimal30);
        java.math.BigDecimal[] bigDecimalArray33 = new java.math.BigDecimal[] { bigDecimal32 };
        java.math.BigDecimal[][] bigDecimalArray34 = new java.math.BigDecimal[][] { bigDecimalArray17, bigDecimalArray25, bigDecimalArray33 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl35 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray34);
        org.apache.commons.math.linear.BigMatrix bigMatrix36 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray34);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl37 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray34);
        java.math.BigDecimal[][] bigDecimalArray38 = bigMatrixImpl37.getData();
        boolean boolean39 = bigMatrixImpl37.isSquare();
        java.math.BigDecimal bigDecimal41 = java.math.BigDecimal.valueOf((long) (short) 100);
        int int42 = bigDecimal41.signum();
        org.apache.commons.math.linear.BigMatrix bigMatrix43 = bigMatrixImpl37.scalarMultiply(bigDecimal41);
        java.math.BigDecimal bigDecimal46 = bigDecimal1.divide(bigDecimal41, (int) (short) 100, 6);
        int int47 = bigDecimal46.scale();
        java.math.BigDecimal bigDecimal49 = bigDecimal46.movePointRight((int) (byte) -100);
        int int50 = bigDecimal49.intValueExact();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal46", (bigDecimal1.compareTo(bigDecimal46) == 0) == bigDecimal1.equals(bigDecimal46));
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        java.lang.String[] strArray1 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray1 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl3 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl4 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl5 = new org.apache.commons.math.linear.BigMatrixImpl(strArray2);
        java.math.BigDecimal bigDecimal6 = bigMatrixImpl5.getTrace();
        int int7 = bigMatrixImpl5.getRoundingMode();
        int int8 = bigMatrixImpl5.getRowDimension();
        java.math.BigDecimal bigDecimal10 = new java.math.BigDecimal(0.0d);
        int int11 = bigDecimal10.intValue();
        java.math.BigDecimal bigDecimal13 = new java.math.BigDecimal(0.0d);
        int int14 = bigDecimal13.intValue();
        java.math.BigDecimal bigDecimal15 = bigDecimal10.min(bigDecimal13);
        java.math.BigDecimal[] bigDecimalArray16 = new java.math.BigDecimal[] { bigDecimal15 };
        java.math.BigDecimal bigDecimal18 = new java.math.BigDecimal(0.0d);
        int int19 = bigDecimal18.intValue();
        java.math.BigDecimal bigDecimal21 = new java.math.BigDecimal(0.0d);
        int int22 = bigDecimal21.intValue();
        java.math.BigDecimal bigDecimal23 = bigDecimal18.min(bigDecimal21);
        java.math.BigDecimal[] bigDecimalArray24 = new java.math.BigDecimal[] { bigDecimal23 };
        java.math.BigDecimal bigDecimal26 = new java.math.BigDecimal(0.0d);
        int int27 = bigDecimal26.intValue();
        java.math.BigDecimal bigDecimal29 = new java.math.BigDecimal(0.0d);
        int int30 = bigDecimal29.intValue();
        java.math.BigDecimal bigDecimal31 = bigDecimal26.min(bigDecimal29);
        java.math.BigDecimal[] bigDecimalArray32 = new java.math.BigDecimal[] { bigDecimal31 };
        java.math.BigDecimal[][] bigDecimalArray33 = new java.math.BigDecimal[][] { bigDecimalArray16, bigDecimalArray24, bigDecimalArray32 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl34 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33);
        org.apache.commons.math.linear.BigMatrix bigMatrix35 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray33);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl36 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray33);
        java.math.BigDecimal[][] bigDecimalArray37 = bigMatrixImpl36.getDataRef();
        bigMatrixImpl36.setRoundingMode((int) '4');
        java.math.BigDecimal bigDecimal41 = new java.math.BigDecimal(0.0d);
        int int42 = bigDecimal41.intValue();
        java.math.BigDecimal bigDecimal44 = new java.math.BigDecimal(0.0d);
        int int45 = bigDecimal44.intValue();
        java.math.BigDecimal bigDecimal46 = bigDecimal41.min(bigDecimal44);
        java.math.BigDecimal[] bigDecimalArray47 = new java.math.BigDecimal[] { bigDecimal46 };
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
        java.math.BigDecimal[][] bigDecimalArray64 = new java.math.BigDecimal[][] { bigDecimalArray47, bigDecimalArray55, bigDecimalArray63 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl65 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray64);
        org.apache.commons.math.linear.BigMatrix bigMatrix66 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(bigDecimalArray64);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl67 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray64);
        java.math.BigDecimal[][] bigDecimalArray68 = bigMatrixImpl67.getDataRef();
        java.math.BigDecimal bigDecimal69 = bigMatrixImpl67.getNorm();
        boolean boolean70 = bigMatrixImpl67.isSquare();
        org.apache.commons.math.linear.BigMatrix bigMatrix71 = bigMatrixImpl67.copy();
        double[] doubleArray73 = bigMatrixImpl67.getColumnAsDoubleArray((int) (byte) 0);
        java.lang.String[] strArray75 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray76 = new java.lang.String[][] { strArray75 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl77 = new org.apache.commons.math.linear.BigMatrixImpl(strArray76);
        org.apache.commons.math.linear.BigMatrix bigMatrix78 = bigMatrixImpl67.multiply((org.apache.commons.math.linear.BigMatrix) bigMatrixImpl77);
        java.math.BigDecimal bigDecimal79 = bigMatrixImpl67.getNorm();
        org.apache.commons.math.linear.BigMatrix bigMatrix80 = bigMatrixImpl36.scalarAdd(bigDecimal79);
        java.math.BigDecimal bigDecimal82 = bigDecimal79.movePointLeft((int) (byte) -1);
        org.apache.commons.math.linear.BigMatrix bigMatrix83 = bigMatrixImpl5.scalarAdd(bigDecimal79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal6 and bigDecimal10", (bigDecimal6.compareTo(bigDecimal10) == 0) == bigDecimal6.equals(bigDecimal10));
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((double) (short) -100);
        java.math.BigDecimal bigDecimal3 = new java.math.BigDecimal((int) (byte) 97);
        java.math.BigDecimal bigDecimal5 = bigDecimal3.setScale(5);
        java.math.BigDecimal bigDecimal7 = new java.math.BigDecimal((long) (short) 100);
        java.lang.String str8 = bigDecimal7.toEngineeringString();
        int int9 = bigDecimal5.compareTo(bigDecimal7);
        java.math.BigDecimal bigDecimal10 = bigDecimal1.multiply(bigDecimal5);
        java.math.BigDecimal bigDecimal11 = bigDecimal10.abs();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal3 and bigDecimal5", (bigDecimal3.compareTo(bigDecimal5) == 0) == bigDecimal3.equals(bigDecimal5));
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
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
        java.math.BigDecimal bigDecimal64 = java.math.BigDecimal.valueOf((long) (short) 10);
        java.math.BigDecimal bigDecimal66 = bigDecimal64.setScale(7);
        java.math.BigDecimal[] bigDecimalArray67 = bigDecimal62.divideAndRemainder(bigDecimal66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal62 and bigDecimal59", (bigDecimal62.compareTo(bigDecimal59) == 0) == bigDecimal62.equals(bigDecimal59));
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal("100.00");
        java.math.BigDecimal bigDecimal3 = new java.math.BigDecimal(0.0d);
        int int4 = bigDecimal3.intValue();
        java.math.BigDecimal bigDecimal6 = new java.math.BigDecimal(0.0d);
        int int7 = bigDecimal6.intValue();
        java.math.BigDecimal bigDecimal8 = bigDecimal3.min(bigDecimal6);
        java.math.BigInteger bigInteger9 = bigDecimal8.toBigIntegerExact();
        java.math.BigDecimal bigDecimal10 = bigDecimal8.stripTrailingZeros();
        java.math.BigDecimal bigDecimal11 = bigDecimal1.subtract(bigDecimal10);
        java.math.BigDecimal bigDecimal13 = new java.math.BigDecimal(0.0d);
        java.lang.String str14 = bigDecimal13.toString();
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.valueOf((long) 'a');
        java.math.BigDecimal bigDecimal17 = bigDecimal16.stripTrailingZeros();
        int int18 = bigDecimal16.signum();
        java.math.BigDecimal[] bigDecimalArray19 = bigDecimal13.divideAndRemainder(bigDecimal16);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl20 = new org.apache.commons.math.linear.BigMatrixImpl(bigDecimalArray19);
        int int21 = bigMatrixImpl20.getRoundingMode();
        boolean boolean22 = bigMatrixImpl20.isSquare();
        bigMatrixImpl20.setRoundingMode((int) (byte) 10);
        java.math.BigDecimal bigDecimal26 = new java.math.BigDecimal((double) 100.0f);
        org.apache.commons.math.linear.BigMatrix bigMatrix27 = bigMatrixImpl20.scalarAdd(bigDecimal26);
        java.math.BigDecimal bigDecimal29 = bigDecimal26.pow((int) (short) 97);
        java.math.BigDecimal bigDecimal30 = bigDecimal11.min(bigDecimal29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal26", (bigDecimal1.compareTo(bigDecimal26) == 0) == bigDecimal1.equals(bigDecimal26));
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 400);
        int int3 = bigDecimal2.precision();
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.valueOf(100L);
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.valueOf((double) 0L);
        java.math.BigDecimal bigDecimal8 = bigDecimal5.max(bigDecimal7);
        int int9 = bigDecimal7.intValueExact();
        java.lang.String[] strArray11 = new java.lang.String[] { "0.0" };
        java.lang.String[][] strArray12 = new java.lang.String[][] { strArray11 };
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl13 = new org.apache.commons.math.linear.BigMatrixImpl(strArray12);
        org.apache.commons.math.linear.BigMatrix bigMatrix14 = org.apache.commons.math.linear.MatrixUtils.createBigMatrix(strArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl15 = new org.apache.commons.math.linear.BigMatrixImpl(strArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl16 = new org.apache.commons.math.linear.BigMatrixImpl(strArray12);
        org.apache.commons.math.linear.BigMatrixImpl bigMatrixImpl17 = new org.apache.commons.math.linear.BigMatrixImpl(strArray12);
        java.math.BigDecimal bigDecimal19 = new java.math.BigDecimal(0.0d);
        int int20 = bigDecimal19.intValue();
        java.math.BigDecimal bigDecimal22 = new java.math.BigDecimal(0.0d);
        int int23 = bigDecimal22.intValue();
        java.math.BigDecimal bigDecimal24 = bigDecimal19.min(bigDecimal22);
        java.math.BigInteger bigInteger25 = bigDecimal19.toBigInteger();
        int int26 = bigDecimal19.precision();
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.valueOf((long) (short) 100);
        java.math.BigDecimal bigDecimal29 = bigDecimal19.subtract(bigDecimal28);
        java.math.BigDecimal bigDecimal30 = bigDecimal28.ulp();
        org.apache.commons.math.linear.BigMatrix bigMatrix31 = bigMatrixImpl17.scalarAdd(bigDecimal28);
        java.math.BigDecimal[] bigDecimalArray32 = bigDecimal7.divideAndRemainder(bigDecimal28);
        java.math.BigDecimal bigDecimal33 = bigDecimal2.divide(bigDecimal28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal7 and bigDecimal19", (bigDecimal7.compareTo(bigDecimal19) == 0) == bigDecimal7.equals(bigDecimal19));
    }
}

