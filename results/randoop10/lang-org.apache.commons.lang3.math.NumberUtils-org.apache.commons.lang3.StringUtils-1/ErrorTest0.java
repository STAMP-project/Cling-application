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
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.negate();
        java.lang.String str5 = bigDecimal4.toEngineeringString();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal8 = bigDecimal4.movePointRight(100);
        byte[] byteArray11 = new byte[] { (byte) 1 };
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray11);
        java.math.BigInteger bigInteger13 = new java.math.BigInteger((int) (short) -1, byteArray11);
        java.math.BigInteger bigInteger15 = bigInteger13.pow((int) 'a');
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(bigInteger15, (int) (byte) 0);
        java.util.Locale locale18 = java.util.Locale.PRC;
        java.lang.String str19 = locale18.getISO3Language();
        boolean boolean20 = bigDecimal17.equals((java.lang.Object) str19);
        java.math.BigDecimal bigDecimal23 = bigDecimal4.divide(bigDecimal17, (int) (short) 100, (int) (short) 1);
        java.math.BigDecimal bigDecimal24 = bigDecimal17.abs();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal23", (bigDecimal0.compareTo(bigDecimal23) == 0) == bigDecimal0.equals(bigDecimal23));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.ulp();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal4 = bigDecimal0.stripTrailingZeros();
        java.math.BigInteger bigInteger5 = bigDecimal4.toBigInteger();
        java.lang.String str7 = bigInteger5.toString((int) '4');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal4", (bigDecimal0.compareTo(bigDecimal4) == 0) == bigDecimal0.equals(bigDecimal4));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal0.setScale((int) (byte) 100, (int) (byte) 0);
        java.math.BigDecimal bigDecimal5 = bigDecimal0.scaleByPowerOfTen((-1));
        java.math.BigDecimal bigDecimal6 = bigDecimal5.plus();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal3", (bigDecimal0.compareTo(bigDecimal3) == 0) == bigDecimal0.equals(bigDecimal3));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal0.setScale((int) (byte) 100, (int) (byte) 0);
        java.math.BigDecimal bigDecimal5 = bigDecimal0.scaleByPowerOfTen((-1));
        java.math.BigDecimal bigDecimal6 = bigDecimal5.ulp();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal3", (bigDecimal0.compareTo(bigDecimal3) == 0) == bigDecimal0.equals(bigDecimal3));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal0.setScale((int) (byte) 100, (int) (byte) 0);
        float float4 = bigDecimal0.floatValue();
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal6 = bigDecimal5.negate();
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal8 = bigDecimal7.negate();
        java.math.BigDecimal bigDecimal9 = bigDecimal7.negate();
        java.lang.String str10 = bigDecimal9.toEngineeringString();
        java.math.BigDecimal bigDecimal11 = bigDecimal6.multiply(bigDecimal9);
        java.math.BigDecimal bigDecimal12 = bigDecimal0.subtract(bigDecimal11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal3 and bigDecimal12", (bigDecimal3.compareTo(bigDecimal12) == 0) == bigDecimal3.equals(bigDecimal12));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.ulp();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal4 = bigDecimal0.stripTrailingZeros();
        java.math.BigInteger bigInteger5 = bigDecimal4.toBigInteger();
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal7 = bigDecimal6.negate();
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal11 = bigDecimal7.subtract(bigDecimal10);
        java.math.BigInteger bigInteger12 = bigDecimal11.toBigInteger();
        double double13 = bigInteger12.doubleValue();
        byte[] byteArray16 = new byte[] { (byte) 1 };
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray16);
        java.math.BigInteger bigInteger18 = new java.math.BigInteger((int) (short) -1, byteArray16);
        java.math.BigInteger bigInteger19 = bigInteger12.gcd(bigInteger18);
        java.math.BigInteger bigInteger20 = bigInteger18.negate();
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal22 = bigDecimal21.negate();
        java.math.BigDecimal bigDecimal25 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal26 = bigDecimal22.subtract(bigDecimal25);
        java.math.BigInteger bigInteger27 = bigDecimal26.toBigInteger();
        double double28 = bigInteger27.doubleValue();
        byte[] byteArray31 = new byte[] { (byte) 1 };
        byte byte32 = org.apache.commons.lang3.math.NumberUtils.min(byteArray31);
        java.math.BigInteger bigInteger33 = new java.math.BigInteger((int) (short) -1, byteArray31);
        java.math.BigInteger bigInteger34 = bigInteger27.gcd(bigInteger33);
        java.math.BigDecimal bigDecimal35 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal36 = bigDecimal35.negate();
        java.math.BigDecimal bigDecimal39 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal40 = bigDecimal36.subtract(bigDecimal39);
        java.math.BigInteger bigInteger41 = bigDecimal40.toBigInteger();
        java.math.BigInteger bigInteger42 = bigInteger33.or(bigInteger41);
        short short43 = bigInteger33.shortValueExact();
        byte byte44 = bigInteger33.byteValueExact();
        java.math.BigInteger bigInteger45 = bigInteger18.and(bigInteger33);
        java.math.BigInteger bigInteger46 = bigInteger5.subtract(bigInteger18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal4", (bigDecimal0.compareTo(bigDecimal4) == 0) == bigDecimal0.equals(bigDecimal4));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.negate();
        java.lang.String str5 = bigDecimal4.toEngineeringString();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal8 = bigDecimal7.negate();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal12 = bigDecimal8.subtract(bigDecimal11);
        java.math.BigInteger bigInteger13 = bigDecimal12.toBigInteger();
        java.math.BigDecimal bigDecimal14 = bigDecimal6.divideToIntegralValue(bigDecimal12);
        java.lang.String str15 = bigDecimal12.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal14", (bigDecimal0.compareTo(bigDecimal14) == 0) == bigDecimal0.equals(bigDecimal14));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigDecimal bigDecimal3 = bigDecimal0.movePointLeft((int) (byte) -1);
        java.math.BigDecimal bigDecimal5 = bigDecimal0.movePointRight((int) (short) 1);
        java.math.BigDecimal bigDecimal7 = bigDecimal5.movePointLeft((int) '4');
        java.math.BigDecimal bigDecimal9 = bigDecimal5.movePointRight(30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal9 and bigDecimal7", (bigDecimal9.compareTo(bigDecimal7) == 0) == bigDecimal9.equals(bigDecimal7));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.negate();
        java.lang.String str5 = bigDecimal4.toEngineeringString();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal8 = bigDecimal7.negate();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal12 = bigDecimal8.subtract(bigDecimal11);
        java.math.BigInteger bigInteger13 = bigDecimal12.toBigInteger();
        java.math.BigDecimal bigDecimal14 = bigDecimal6.divideToIntegralValue(bigDecimal12);
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal16 = bigDecimal15.negate();
        java.math.BigDecimal bigDecimal17 = bigDecimal16.abs();
        int int18 = bigDecimal16.intValueExact();
        boolean boolean19 = bigDecimal14.equals((java.lang.Object) int18);
        java.math.BigDecimal bigDecimal20 = bigDecimal14.plus();
        java.math.BigDecimal bigDecimal22 = bigDecimal20.setScale(6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal20", (bigDecimal0.compareTo(bigDecimal20) == 0) == bigDecimal0.equals(bigDecimal20));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.negate();
        java.lang.String str5 = bigDecimal4.toEngineeringString();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal8 = bigDecimal7.negate();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal12 = bigDecimal8.subtract(bigDecimal11);
        java.math.BigInteger bigInteger13 = bigDecimal12.toBigInteger();
        java.math.BigDecimal bigDecimal14 = bigDecimal6.divideToIntegralValue(bigDecimal12);
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal16 = bigDecimal15.negate();
        java.math.BigDecimal bigDecimal17 = bigDecimal16.abs();
        int int18 = bigDecimal16.intValueExact();
        boolean boolean19 = bigDecimal14.equals((java.lang.Object) int18);
        java.math.BigDecimal bigDecimal20 = bigDecimal14.plus();
        long long21 = bigDecimal20.longValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal20", (bigDecimal0.compareTo(bigDecimal20) == 0) == bigDecimal0.equals(bigDecimal20));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.negate();
        java.lang.String str5 = bigDecimal4.toEngineeringString();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal8 = bigDecimal4.movePointRight(100);
        byte[] byteArray11 = new byte[] { (byte) 1 };
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray11);
        java.math.BigInteger bigInteger13 = new java.math.BigInteger((int) (short) -1, byteArray11);
        java.math.BigInteger bigInteger15 = bigInteger13.pow((int) 'a');
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(bigInteger15, (int) (byte) 0);
        java.util.Locale locale18 = java.util.Locale.PRC;
        java.lang.String str19 = locale18.getISO3Language();
        boolean boolean20 = bigDecimal17.equals((java.lang.Object) str19);
        java.math.BigDecimal bigDecimal23 = bigDecimal4.divide(bigDecimal17, (int) (short) 100, (int) (short) 1);
        int int24 = bigDecimal4.scale();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal4 and bigDecimal23", (bigDecimal4.compareTo(bigDecimal23) == 0) == bigDecimal4.equals(bigDecimal23));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.negate();
        java.lang.String str5 = bigDecimal4.toEngineeringString();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal8 = bigDecimal7.negate();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal12 = bigDecimal8.subtract(bigDecimal11);
        java.math.BigInteger bigInteger13 = bigDecimal12.toBigInteger();
        java.math.BigDecimal bigDecimal14 = bigDecimal6.divideToIntegralValue(bigDecimal12);
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal16 = bigDecimal15.negate();
        java.math.BigDecimal bigDecimal17 = bigDecimal16.abs();
        int int18 = bigDecimal16.intValueExact();
        boolean boolean19 = bigDecimal14.equals((java.lang.Object) int18);
        java.math.BigDecimal bigDecimal21 = bigDecimal14.movePointLeft((int) (byte) 100);
        byte byte22 = bigDecimal21.byteValueExact();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal14", (bigDecimal0.compareTo(bigDecimal14) == 0) == bigDecimal0.equals(bigDecimal14));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.negate();
        java.lang.String str5 = bigDecimal4.toEngineeringString();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal8 = bigDecimal7.negate();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal12 = bigDecimal8.subtract(bigDecimal11);
        java.math.BigInteger bigInteger13 = bigDecimal12.toBigInteger();
        java.math.BigDecimal bigDecimal14 = bigDecimal6.divideToIntegralValue(bigDecimal12);
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.ZERO;
        double double16 = bigDecimal15.doubleValue();
        int int17 = bigDecimal15.intValue();
        int int18 = bigDecimal15.scale();
        byte byte19 = bigDecimal15.byteValueExact();
        java.math.BigDecimal bigDecimal20 = bigDecimal6.max(bigDecimal15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal20 and bigDecimal14", (bigDecimal20.compareTo(bigDecimal14) == 0) == bigDecimal20.equals(bigDecimal14));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.ulp();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal4 = bigDecimal0.stripTrailingZeros();
        java.math.BigInteger bigInteger5 = bigDecimal4.toBigInteger();
        java.lang.String str6 = bigInteger5.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal4", (bigDecimal0.compareTo(bigDecimal4) == 0) == bigDecimal0.equals(bigDecimal4));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte byte8 = bigInteger6.byteValueExact();
        java.math.BigDecimal bigDecimal10 = new java.math.BigDecimal(bigInteger6, (int) (byte) -1);
        java.math.BigInteger bigInteger12 = bigInteger6.flipBit((int) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal10", (bigDecimal0.compareTo(bigDecimal10) == 0) == bigDecimal0.equals(bigDecimal10));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte byte8 = bigInteger6.byteValueExact();
        java.math.BigDecimal bigDecimal10 = new java.math.BigDecimal(bigInteger6, (int) (byte) -1);
        int int11 = bigInteger6.bitCount();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal10", (bigDecimal0.compareTo(bigDecimal10) == 0) == bigDecimal0.equals(bigDecimal10));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.negate();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal5 = new java.math.BigDecimal((double) 1L);
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 10, (short) 100 };
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(objArray8, "hi!", (int) (byte) 100, (int) (short) -1);
        boolean boolean13 = bigDecimal5.equals((java.lang.Object) (short) -1);
        java.math.BigDecimal bigDecimal14 = bigDecimal0.max(bigDecimal5);
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal16 = bigDecimal15.negate();
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal20 = bigDecimal16.subtract(bigDecimal19);
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal22 = bigDecimal19.min(bigDecimal21);
        java.math.BigDecimal bigDecimal24 = bigDecimal22.movePointRight((int) (short) -2);
        java.math.BigDecimal bigDecimal25 = bigDecimal0.min(bigDecimal22);
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal27 = bigDecimal26.negate();
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal29 = bigDecimal28.negate();
        java.math.BigDecimal bigDecimal30 = bigDecimal28.negate();
        java.lang.String str31 = bigDecimal30.toEngineeringString();
        java.math.BigDecimal bigDecimal32 = bigDecimal27.multiply(bigDecimal30);
        java.math.BigDecimal bigDecimal33 = bigDecimal0.subtract(bigDecimal30);
        java.math.BigDecimal bigDecimal34 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal35 = bigDecimal34.negate();
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.TEN;
        long long37 = bigDecimal36.longValueExact();
        java.math.BigDecimal bigDecimal38 = bigDecimal36.ulp();
        java.lang.String str39 = bigDecimal36.toString();
        int int40 = bigDecimal34.compareTo(bigDecimal36);
        short short41 = bigDecimal34.shortValueExact();
        java.math.BigDecimal bigDecimal43 = bigDecimal34.scaleByPowerOfTen((-1));
        java.math.BigDecimal bigDecimal44 = bigDecimal33.add(bigDecimal34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal44 and bigDecimal43", (bigDecimal44.compareTo(bigDecimal43) == 0) == bigDecimal44.equals(bigDecimal43));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigDecimal bigDecimal3 = bigDecimal0.movePointLeft((int) (byte) -1);
        java.math.BigDecimal bigDecimal5 = bigDecimal0.movePointRight((int) (short) 1);
        java.math.BigDecimal bigDecimal7 = bigDecimal5.movePointLeft((int) '4');
        java.math.BigDecimal bigDecimal9 = bigDecimal5.movePointLeft((int) 'u');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal5 and bigDecimal7", (bigDecimal5.compareTo(bigDecimal7) == 0) == bigDecimal5.equals(bigDecimal7));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.negate();
        java.lang.String str5 = bigDecimal4.toEngineeringString();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal8 = bigDecimal7.negate();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal12 = bigDecimal8.subtract(bigDecimal11);
        java.math.BigInteger bigInteger13 = bigDecimal12.toBigInteger();
        java.math.BigDecimal bigDecimal14 = bigDecimal6.divideToIntegralValue(bigDecimal12);
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal16 = bigDecimal15.negate();
        java.math.BigDecimal bigDecimal17 = bigDecimal16.abs();
        int int18 = bigDecimal16.intValueExact();
        boolean boolean19 = bigDecimal14.equals((java.lang.Object) int18);
        java.math.BigDecimal bigDecimal20 = bigDecimal14.plus();
        java.math.BigDecimal bigDecimal21 = bigDecimal14.ulp();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal14", (bigDecimal0.compareTo(bigDecimal14) == 0) == bigDecimal0.equals(bigDecimal14));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.ulp();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal4 = bigDecimal0.stripTrailingZeros();
        java.math.BigInteger bigInteger5 = bigDecimal4.toBigInteger();
        java.lang.String str6 = bigDecimal4.toPlainString();
        byte[] byteArray8 = new byte[] { (byte) 1 };
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray8);
        java.math.BigInteger bigInteger10 = new java.math.BigInteger(byteArray8);
        java.math.BigDecimal bigDecimal11 = new java.math.BigDecimal(bigInteger10);
        int int12 = bigDecimal4.compareTo(bigDecimal11);
        long long13 = bigDecimal11.longValueExact();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal4", (bigDecimal0.compareTo(bigDecimal4) == 0) == bigDecimal0.equals(bigDecimal4));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigDecimal bigDecimal3 = bigDecimal0.movePointLeft((int) (byte) -1);
        java.math.BigDecimal bigDecimal5 = bigDecimal0.movePointRight((int) (short) 1);
        java.math.BigDecimal bigDecimal7 = bigDecimal5.movePointLeft((int) '4');
        int int8 = bigDecimal5.signum();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal5 and bigDecimal7", (bigDecimal5.compareTo(bigDecimal7) == 0) == bigDecimal5.equals(bigDecimal7));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.TEN;
        long long3 = bigDecimal2.longValueExact();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.ulp();
        java.lang.String str5 = bigDecimal2.toString();
        int int6 = bigDecimal0.compareTo(bigDecimal2);
        int int7 = bigDecimal2.precision();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.TEN;
        long long9 = bigDecimal8.longValueExact();
        java.math.BigDecimal bigDecimal10 = bigDecimal8.ulp();
        java.lang.String str11 = bigDecimal8.toString();
        java.math.BigDecimal bigDecimal12 = bigDecimal8.stripTrailingZeros();
        int int13 = bigDecimal12.intValue();
        java.math.BigDecimal bigDecimal15 = bigDecimal12.scaleByPowerOfTen(100);
        java.math.BigDecimal bigDecimal16 = bigDecimal2.divideToIntegralValue(bigDecimal15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal2 and bigDecimal12", (bigDecimal2.compareTo(bigDecimal12) == 0) == bigDecimal2.equals(bigDecimal12));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.TEN;
        long long3 = bigDecimal2.longValueExact();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.ulp();
        java.lang.String str5 = bigDecimal2.toString();
        int int6 = bigDecimal0.compareTo(bigDecimal2);
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal10 = bigDecimal2.divide(bigDecimal8, (int) (short) 1);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.TEN;
        long long12 = bigDecimal11.longValueExact();
        java.math.BigDecimal bigDecimal13 = bigDecimal10.max(bigDecimal11);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal19 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        double double21 = bigInteger20.doubleValue();
        byte byte22 = bigInteger20.byteValueExact();
        java.math.BigDecimal bigDecimal24 = new java.math.BigDecimal(bigInteger20, (int) (byte) -1);
        java.math.BigDecimal bigDecimal25 = bigDecimal24.plus();
        int int26 = bigDecimal13.compareTo(bigDecimal24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal24", (bigDecimal0.compareTo(bigDecimal24) == 0) == bigDecimal0.equals(bigDecimal24));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.ulp();
        java.math.BigDecimal bigDecimal3 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal4 = bigDecimal3.negate();
        java.math.BigDecimal bigDecimal5 = bigDecimal4.abs();
        java.math.BigDecimal bigDecimal7 = bigDecimal4.pow((int) (byte) 1);
        int int8 = bigDecimal2.compareTo(bigDecimal4);
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal10 = bigDecimal9.negate();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal12 = bigDecimal11.negate();
        java.math.BigDecimal bigDecimal13 = bigDecimal11.negate();
        java.lang.String str14 = bigDecimal13.toEngineeringString();
        java.math.BigDecimal bigDecimal15 = bigDecimal10.multiply(bigDecimal13);
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal17 = bigDecimal16.negate();
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal21 = bigDecimal17.subtract(bigDecimal20);
        java.math.BigInteger bigInteger22 = bigDecimal21.toBigInteger();
        java.math.BigDecimal bigDecimal23 = bigDecimal15.divideToIntegralValue(bigDecimal21);
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal25 = bigDecimal24.negate();
        java.math.BigDecimal bigDecimal26 = bigDecimal25.abs();
        int int27 = bigDecimal25.intValueExact();
        boolean boolean28 = bigDecimal23.equals((java.lang.Object) int27);
        java.math.BigDecimal bigDecimal29 = bigDecimal23.plus();
        java.math.BigDecimal bigDecimal30 = bigDecimal4.subtract(bigDecimal29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal30 and bigDecimal29", (bigDecimal30.compareTo(bigDecimal29) == 0) == bigDecimal30.equals(bigDecimal29));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.TEN;
        long long5 = bigDecimal4.longValueExact();
        java.math.BigDecimal bigDecimal6 = bigDecimal4.ulp();
        java.lang.String str7 = bigDecimal4.toString();
        int int8 = bigDecimal2.compareTo(bigDecimal4);
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal12 = bigDecimal4.divide(bigDecimal10, (int) (short) 1);
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.TEN;
        long long14 = bigDecimal13.longValueExact();
        java.math.BigDecimal bigDecimal15 = bigDecimal12.max(bigDecimal13);
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.TEN;
        long long17 = bigDecimal16.longValueExact();
        java.math.BigDecimal bigDecimal18 = bigDecimal16.ulp();
        java.math.BigDecimal bigDecimal19 = bigDecimal13.subtract(bigDecimal16);
        boolean boolean21 = bigDecimal16.equals((java.lang.Object) "hi");
        java.math.BigDecimal bigDecimal23 = bigDecimal16.scaleByPowerOfTen((int) (byte) 1);
        java.math.BigDecimal bigDecimal24 = bigDecimal0.divide(bigDecimal16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal10 and bigDecimal23", (bigDecimal10.compareTo(bigDecimal23) == 0) == bigDecimal10.equals(bigDecimal23));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.negate();
        java.lang.String str5 = bigDecimal4.toEngineeringString();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal8 = bigDecimal7.negate();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal12 = bigDecimal8.subtract(bigDecimal11);
        java.math.BigInteger bigInteger13 = bigDecimal12.toBigInteger();
        java.math.BigDecimal bigDecimal14 = bigDecimal6.divideToIntegralValue(bigDecimal12);
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal16 = bigDecimal15.negate();
        java.math.BigDecimal bigDecimal17 = bigDecimal16.abs();
        int int18 = bigDecimal16.intValueExact();
        boolean boolean19 = bigDecimal14.equals((java.lang.Object) int18);
        java.math.BigDecimal bigDecimal21 = bigDecimal14.movePointLeft((int) (byte) 100);
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.TEN;
        long long23 = bigDecimal22.longValueExact();
        java.math.BigDecimal bigDecimal24 = bigDecimal22.ulp();
        java.math.BigDecimal bigDecimal25 = bigDecimal21.subtract(bigDecimal24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal14", (bigDecimal0.compareTo(bigDecimal14) == 0) == bigDecimal0.equals(bigDecimal14));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.ulp();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal4 = bigDecimal0.stripTrailingZeros();
        java.math.BigInteger bigInteger5 = bigDecimal4.toBigInteger();
        java.math.BigDecimal bigDecimal6 = bigDecimal4.plus();
        short short7 = bigDecimal4.shortValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal4", (bigDecimal0.compareTo(bigDecimal4) == 0) == bigDecimal0.equals(bigDecimal4));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigDecimal bigDecimal3 = bigDecimal0.movePointLeft((int) (byte) -1);
        java.math.BigDecimal bigDecimal5 = bigDecimal0.movePointRight((int) (short) 1);
        java.math.BigDecimal bigDecimal7 = bigDecimal5.movePointLeft((int) '4');
        java.math.BigInteger bigInteger8 = bigDecimal7.toBigIntegerExact();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray11);
        java.math.BigInteger bigInteger13 = new java.math.BigInteger((int) (short) -1, byteArray11);
        java.math.BigInteger bigInteger15 = bigInteger13.pow((int) 'a');
        java.math.BigInteger bigInteger17 = bigInteger13.shiftLeft((int) (short) 1);
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal19 = bigDecimal18.negate();
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal21 = bigDecimal19.min(bigDecimal20);
        java.lang.String str22 = bigDecimal19.toPlainString();
        boolean boolean23 = bigInteger17.equals((java.lang.Object) bigDecimal19);
        java.lang.String str25 = bigInteger17.toString((int) (byte) 10);
        java.lang.String str27 = bigInteger17.toString((int) '4');
        byte[] byteArray30 = new byte[] { (byte) 1 };
        byte byte31 = org.apache.commons.lang3.math.NumberUtils.min(byteArray30);
        java.math.BigInteger bigInteger32 = new java.math.BigInteger((int) (short) -1, byteArray30);
        java.math.BigInteger bigInteger34 = bigInteger32.pow((int) 'a');
        java.math.BigInteger bigInteger36 = bigInteger32.shiftLeft((int) (short) 1);
        boolean boolean38 = bigInteger36.isProbablePrime((int) '4');
        short short39 = bigInteger36.shortValueExact();
        int int40 = bigInteger17.compareTo(bigInteger36);
        int int41 = bigInteger8.compareTo(bigInteger36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal7", (bigDecimal0.compareTo(bigDecimal7) == 0) == bigDecimal0.equals(bigDecimal7));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.negate();
        java.lang.String str5 = bigDecimal4.toEngineeringString();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal8 = bigDecimal7.negate();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal12 = bigDecimal8.subtract(bigDecimal11);
        java.math.BigInteger bigInteger13 = bigDecimal12.toBigInteger();
        java.math.BigDecimal bigDecimal14 = bigDecimal6.divideToIntegralValue(bigDecimal12);
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal16 = bigDecimal15.negate();
        java.math.BigDecimal bigDecimal17 = bigDecimal16.abs();
        int int18 = bigDecimal16.intValueExact();
        boolean boolean19 = bigDecimal14.equals((java.lang.Object) int18);
        java.math.BigDecimal bigDecimal21 = bigDecimal14.movePointLeft((int) (byte) 100);
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal23 = bigDecimal22.negate();
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.TEN;
        long long25 = bigDecimal24.longValueExact();
        java.math.BigDecimal bigDecimal26 = bigDecimal24.ulp();
        java.lang.String str27 = bigDecimal24.toString();
        int int28 = bigDecimal22.compareTo(bigDecimal24);
        short short29 = bigDecimal22.shortValueExact();
        java.math.BigDecimal bigDecimal31 = bigDecimal22.scaleByPowerOfTen((-1));
        java.math.BigDecimal bigDecimal32 = bigDecimal14.multiply(bigDecimal22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal22 and bigDecimal31", (bigDecimal22.compareTo(bigDecimal31) == 0) == bigDecimal22.equals(bigDecimal31));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte byte8 = bigInteger6.byteValueExact();
        java.math.BigDecimal bigDecimal10 = new java.math.BigDecimal(bigInteger6, (int) (byte) -1);
        java.math.BigDecimal bigDecimal11 = bigDecimal10.plus();
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.valueOf((long) (byte) -1, 0);
        java.math.BigDecimal[] bigDecimalArray15 = bigDecimal11.divideAndRemainder(bigDecimal14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal11", (bigDecimal0.compareTo(bigDecimal11) == 0) == bigDecimal0.equals(bigDecimal11));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigDecimal bigDecimal3 = bigDecimal0.movePointLeft((int) (byte) -1);
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal6 = bigDecimal4.negate();
        java.lang.String str7 = bigDecimal4.toString();
        java.math.BigDecimal bigDecimal9 = bigDecimal4.scaleByPowerOfTen(0);
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal11 = bigDecimal10.negate();
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.TEN;
        long long13 = bigDecimal12.longValueExact();
        java.math.BigDecimal bigDecimal14 = bigDecimal12.ulp();
        java.lang.String str15 = bigDecimal12.toString();
        int int16 = bigDecimal10.compareTo(bigDecimal12);
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal20 = bigDecimal12.divide(bigDecimal18, (int) (short) 1);
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.TEN;
        long long22 = bigDecimal21.longValueExact();
        java.math.BigDecimal bigDecimal23 = bigDecimal20.max(bigDecimal21);
        java.math.BigDecimal bigDecimal24 = bigDecimal4.add(bigDecimal20);
        java.math.BigDecimal bigDecimal25 = bigDecimal0.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.TEN;
        long long27 = bigDecimal26.longValueExact();
        java.math.BigDecimal bigDecimal28 = bigDecimal26.ulp();
        java.lang.String str29 = bigDecimal26.toString();
        java.math.BigDecimal bigDecimal30 = bigDecimal26.stripTrailingZeros();
        java.math.BigDecimal bigDecimal31 = bigDecimal4.remainder(bigDecimal30);
        java.math.BigDecimal bigDecimal32 = bigDecimal31.ulp();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal12 and bigDecimal30", (bigDecimal12.compareTo(bigDecimal30) == 0) == bigDecimal12.equals(bigDecimal30));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal((double) 1L);
        java.math.BigDecimal bigDecimal3 = java.math.BigDecimal.valueOf((double) 117);
        double double4 = bigDecimal3.doubleValue();
        java.math.BigDecimal bigDecimal5 = bigDecimal1.min(bigDecimal3);
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal7 = bigDecimal6.negate();
        int int8 = bigDecimal7.signum();
        long long9 = bigDecimal7.longValue();
        java.math.BigDecimal bigDecimal10 = bigDecimal7.abs();
        int int11 = bigDecimal7.scale();
        byte byte12 = bigDecimal7.byteValueExact();
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal14 = bigDecimal13.negate();
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal16 = bigDecimal15.negate();
        java.math.BigDecimal bigDecimal17 = bigDecimal15.negate();
        java.lang.String str18 = bigDecimal17.toEngineeringString();
        java.math.BigDecimal bigDecimal19 = bigDecimal14.multiply(bigDecimal17);
        java.math.BigDecimal bigDecimal21 = bigDecimal17.movePointRight(100);
        byte[] byteArray24 = new byte[] { (byte) 1 };
        byte byte25 = org.apache.commons.lang3.math.NumberUtils.min(byteArray24);
        java.math.BigInteger bigInteger26 = new java.math.BigInteger((int) (short) -1, byteArray24);
        java.math.BigInteger bigInteger28 = bigInteger26.pow((int) 'a');
        java.math.BigDecimal bigDecimal30 = new java.math.BigDecimal(bigInteger28, (int) (byte) 0);
        java.util.Locale locale31 = java.util.Locale.PRC;
        java.lang.String str32 = locale31.getISO3Language();
        boolean boolean33 = bigDecimal30.equals((java.lang.Object) str32);
        java.math.BigDecimal bigDecimal36 = bigDecimal17.divide(bigDecimal30, (int) (short) 100, (int) (short) 1);
        java.math.BigDecimal bigDecimal37 = bigDecimal7.max(bigDecimal36);
        java.math.BigDecimal bigDecimal38 = bigDecimal3.add(bigDecimal7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal7 and bigDecimal36", (bigDecimal7.compareTo(bigDecimal36) == 0) == bigDecimal7.equals(bigDecimal36));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.negate();
        java.lang.String str5 = bigDecimal4.toEngineeringString();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal8 = bigDecimal7.negate();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal12 = bigDecimal8.subtract(bigDecimal11);
        java.math.BigInteger bigInteger13 = bigDecimal12.toBigInteger();
        java.math.BigDecimal bigDecimal14 = bigDecimal6.divideToIntegralValue(bigDecimal12);
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal16 = bigDecimal15.negate();
        java.math.BigDecimal bigDecimal17 = bigDecimal16.abs();
        int int18 = bigDecimal16.intValueExact();
        boolean boolean19 = bigDecimal14.equals((java.lang.Object) int18);
        java.math.BigDecimal bigDecimal21 = bigDecimal14.movePointLeft((int) (byte) 100);
        java.math.BigInteger bigInteger22 = bigDecimal21.toBigInteger();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal14", (bigDecimal0.compareTo(bigDecimal14) == 0) == bigDecimal0.equals(bigDecimal14));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal3 = bigDecimal1.min(bigDecimal2);
        java.math.BigDecimal bigDecimal5 = bigDecimal3.movePointLeft(10);
        byte byte6 = bigDecimal3.byteValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal3 and bigDecimal5", (bigDecimal3.compareTo(bigDecimal5) == 0) == bigDecimal3.equals(bigDecimal5));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.negate();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal5 = new java.math.BigDecimal((double) 1L);
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 10, (short) 100 };
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(objArray8, "hi!", (int) (byte) 100, (int) (short) -1);
        boolean boolean13 = bigDecimal5.equals((java.lang.Object) (short) -1);
        java.math.BigDecimal bigDecimal14 = bigDecimal0.max(bigDecimal5);
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal16 = bigDecimal15.negate();
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal20 = bigDecimal16.subtract(bigDecimal19);
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal22 = bigDecimal19.min(bigDecimal21);
        java.math.BigDecimal bigDecimal24 = bigDecimal22.movePointRight((int) (short) -2);
        java.math.BigDecimal bigDecimal25 = bigDecimal0.min(bigDecimal22);
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal27 = bigDecimal26.negate();
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal29 = bigDecimal28.negate();
        java.math.BigDecimal bigDecimal30 = bigDecimal28.negate();
        java.lang.String str31 = bigDecimal30.toEngineeringString();
        java.math.BigDecimal bigDecimal32 = bigDecimal27.multiply(bigDecimal30);
        java.math.BigDecimal bigDecimal33 = bigDecimal0.subtract(bigDecimal30);
        java.math.BigDecimal bigDecimal35 = bigDecimal33.setScale((int) (byte) 1);
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.ZERO;
        double double37 = bigDecimal36.doubleValue();
        java.math.BigInteger bigInteger38 = bigDecimal36.toBigInteger();
        java.math.BigDecimal bigDecimal39 = bigDecimal36.negate();
        java.math.BigDecimal bigDecimal40 = java.math.BigDecimal.ZERO;
        double double41 = bigDecimal40.doubleValue();
        java.math.BigInteger bigInteger42 = bigDecimal40.toBigInteger();
        byte[] byteArray45 = new byte[] { (byte) 1 };
        byte byte46 = org.apache.commons.lang3.math.NumberUtils.min(byteArray45);
        java.math.BigInteger bigInteger47 = new java.math.BigInteger((int) (short) -1, byteArray45);
        java.math.BigInteger bigInteger49 = bigInteger47.pow((int) 'a');
        byte[] byteArray50 = bigInteger47.toByteArray();
        long long51 = bigInteger47.longValueExact();
        java.math.BigInteger bigInteger52 = bigInteger42.or(bigInteger47);
        byte byte53 = bigInteger47.byteValueExact();
        java.math.BigDecimal bigDecimal55 = new java.math.BigDecimal(bigInteger47, (int) (byte) 0);
        java.math.BigDecimal bigDecimal57 = new java.math.BigDecimal(bigInteger47, (int) '#');
        java.math.BigDecimal bigDecimal58 = bigDecimal36.max(bigDecimal57);
        java.math.BigDecimal bigDecimal59 = bigDecimal33.add(bigDecimal58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal59 and bigDecimal35", (bigDecimal59.compareTo(bigDecimal35) == 0) == bigDecimal59.equals(bigDecimal35));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.negate();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal5 = bigDecimal0.scaleByPowerOfTen(0);
        java.math.BigDecimal bigDecimal7 = bigDecimal0.setScale((int) (byte) 100);
        java.math.BigDecimal bigDecimal9 = bigDecimal0.movePointLeft(33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal7", (bigDecimal0.compareTo(bigDecimal7) == 0) == bigDecimal0.equals(bigDecimal7));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.TEN;
        long long3 = bigDecimal2.longValueExact();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.ulp();
        java.lang.String str5 = bigDecimal2.toString();
        int int6 = bigDecimal0.compareTo(bigDecimal2);
        java.math.BigInteger bigInteger7 = bigDecimal0.toBigInteger();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.ZERO;
        double double9 = bigDecimal8.doubleValue();
        java.math.BigDecimal bigDecimal11 = bigDecimal8.movePointLeft((int) (byte) -1);
        java.math.BigDecimal bigDecimal13 = bigDecimal8.movePointRight((int) (short) 1);
        java.math.BigDecimal bigDecimal15 = bigDecimal13.movePointLeft((int) '4');
        java.math.BigInteger bigInteger16 = bigDecimal15.toBigIntegerExact();
        java.math.BigInteger bigInteger17 = bigInteger7.add(bigInteger16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal15", (bigDecimal0.compareTo(bigDecimal15) == 0) == bigDecimal0.equals(bigDecimal15));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal0.setScale((int) (byte) 100, (int) (byte) 0);
        java.math.BigDecimal bigDecimal5 = bigDecimal0.scaleByPowerOfTen((-1));
        java.math.BigDecimal bigDecimal6 = bigDecimal0.plus();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal3 and bigDecimal5", (bigDecimal3.compareTo(bigDecimal5) == 0) == bigDecimal3.equals(bigDecimal5));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.ulp();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal4 = bigDecimal0.stripTrailingZeros();
        java.math.BigInteger bigInteger5 = bigDecimal4.toBigInteger();
        java.lang.String str6 = bigDecimal4.toPlainString();
        byte[] byteArray8 = new byte[] { (byte) 1 };
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray8);
        java.math.BigInteger bigInteger10 = new java.math.BigInteger(byteArray8);
        java.math.BigDecimal bigDecimal11 = new java.math.BigDecimal(bigInteger10);
        int int12 = bigDecimal4.compareTo(bigDecimal11);
        java.math.BigDecimal bigDecimal14 = bigDecimal4.movePointLeft(97);
        java.math.BigInteger bigInteger15 = bigDecimal14.unscaledValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal4", (bigDecimal0.compareTo(bigDecimal4) == 0) == bigDecimal0.equals(bigDecimal4));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.ulp();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal4 = bigDecimal0.stripTrailingZeros();
        java.math.BigInteger bigInteger5 = bigDecimal4.toBigInteger();
        java.lang.String str6 = bigDecimal4.toPlainString();
        byte[] byteArray8 = new byte[] { (byte) 1 };
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray8);
        java.math.BigInteger bigInteger10 = new java.math.BigInteger(byteArray8);
        java.math.BigDecimal bigDecimal11 = new java.math.BigDecimal(bigInteger10);
        int int12 = bigDecimal4.compareTo(bigDecimal11);
        java.math.BigDecimal bigDecimal14 = bigDecimal4.movePointLeft(97);
        java.math.BigInteger bigInteger15 = bigDecimal4.toBigIntegerExact();
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal17 = bigDecimal16.negate();
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal21 = bigDecimal17.subtract(bigDecimal20);
        java.math.BigInteger bigInteger22 = bigDecimal21.toBigInteger();
        double double23 = bigInteger22.doubleValue();
        byte[] byteArray26 = new byte[] { (byte) 1 };
        byte byte27 = org.apache.commons.lang3.math.NumberUtils.min(byteArray26);
        java.math.BigInteger bigInteger28 = new java.math.BigInteger((int) (short) -1, byteArray26);
        java.math.BigInteger bigInteger29 = bigInteger22.gcd(bigInteger28);
        java.math.BigDecimal bigDecimal30 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal31 = bigDecimal30.negate();
        java.math.BigDecimal bigDecimal34 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal35 = bigDecimal31.subtract(bigDecimal34);
        java.math.BigInteger bigInteger36 = bigDecimal35.toBigInteger();
        java.math.BigInteger bigInteger37 = bigInteger28.or(bigInteger36);
        short short38 = bigInteger28.shortValueExact();
        byte[] byteArray41 = new byte[] { (byte) 1 };
        byte byte42 = org.apache.commons.lang3.math.NumberUtils.min(byteArray41);
        java.math.BigInteger bigInteger43 = new java.math.BigInteger((int) (short) -1, byteArray41);
        java.math.BigInteger bigInteger45 = bigInteger43.pow((int) 'a');
        java.math.BigInteger bigInteger47 = bigInteger43.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger48 = bigInteger28.xor(bigInteger47);
        java.math.BigDecimal bigDecimal49 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal50 = bigDecimal49.negate();
        java.math.BigDecimal bigDecimal51 = java.math.BigDecimal.TEN;
        long long52 = bigDecimal51.longValueExact();
        java.math.BigDecimal bigDecimal53 = bigDecimal51.ulp();
        java.lang.String str54 = bigDecimal51.toString();
        int int55 = bigDecimal49.compareTo(bigDecimal51);
        java.math.BigInteger bigInteger56 = bigDecimal49.toBigInteger();
        java.math.BigInteger bigInteger57 = bigInteger48.gcd(bigInteger56);
        java.math.BigInteger bigInteger58 = bigInteger57.negate();
        java.math.BigInteger bigInteger59 = bigInteger15.or(bigInteger58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal4", (bigDecimal0.compareTo(bigDecimal4) == 0) == bigDecimal0.equals(bigDecimal4));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigDecimal bigDecimal3 = bigDecimal0.movePointLeft((int) (byte) -1);
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal6 = bigDecimal4.negate();
        java.lang.String str7 = bigDecimal4.toString();
        java.math.BigDecimal bigDecimal9 = bigDecimal4.scaleByPowerOfTen(0);
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal11 = bigDecimal10.negate();
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.TEN;
        long long13 = bigDecimal12.longValueExact();
        java.math.BigDecimal bigDecimal14 = bigDecimal12.ulp();
        java.lang.String str15 = bigDecimal12.toString();
        int int16 = bigDecimal10.compareTo(bigDecimal12);
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal20 = bigDecimal12.divide(bigDecimal18, (int) (short) 1);
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.TEN;
        long long22 = bigDecimal21.longValueExact();
        java.math.BigDecimal bigDecimal23 = bigDecimal20.max(bigDecimal21);
        java.math.BigDecimal bigDecimal24 = bigDecimal4.add(bigDecimal20);
        java.math.BigDecimal bigDecimal25 = bigDecimal0.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.TEN;
        long long27 = bigDecimal26.longValueExact();
        java.math.BigDecimal bigDecimal28 = bigDecimal26.ulp();
        java.lang.String str29 = bigDecimal26.toString();
        java.math.BigDecimal bigDecimal30 = bigDecimal26.stripTrailingZeros();
        java.math.BigDecimal bigDecimal31 = bigDecimal4.remainder(bigDecimal30);
        java.math.BigDecimal bigDecimal32 = bigDecimal31.stripTrailingZeros();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal12 and bigDecimal30", (bigDecimal12.compareTo(bigDecimal30) == 0) == bigDecimal12.equals(bigDecimal30));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf((long) (byte) -1, 0);
        java.math.BigDecimal bigDecimal3 = bigDecimal2.plus();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.TEN;
        long long5 = bigDecimal4.longValueExact();
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.ZERO;
        double double7 = bigDecimal6.doubleValue();
        java.math.BigDecimal bigDecimal9 = bigDecimal6.movePointLeft((int) (byte) -1);
        int int10 = bigDecimal9.intValue();
        java.math.BigDecimal bigDecimal11 = bigDecimal4.add(bigDecimal9);
        java.math.BigDecimal bigDecimal12 = bigDecimal2.multiply(bigDecimal11);
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.valueOf((long) (-1), (int) 'u');
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal17 = bigDecimal16.abs();
        java.math.BigDecimal bigDecimal18 = bigDecimal15.min(bigDecimal17);
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.valueOf((double) (-1.0f));
        int int21 = bigDecimal17.compareTo(bigDecimal20);
        java.math.BigDecimal[] bigDecimalArray22 = bigDecimal2.divideAndRemainder(bigDecimal20);
        java.lang.String str23 = bigDecimal2.toEngineeringString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal2 and bigDecimal20", (bigDecimal2.compareTo(bigDecimal20) == 0) == bigDecimal2.equals(bigDecimal20));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal7 = bigDecimal6.negate();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal9 = bigDecimal7.min(bigDecimal8);
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal11 = bigDecimal10.negate();
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal15 = bigDecimal11.subtract(bigDecimal14);
        java.math.BigDecimal[] bigDecimalArray16 = bigDecimal8.divideAndRemainder(bigDecimal14);
        java.math.BigDecimal bigDecimal17 = bigDecimal5.min(bigDecimal14);
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.TEN;
        long long19 = bigDecimal18.longValueExact();
        java.math.BigDecimal bigDecimal20 = bigDecimal18.ulp();
        java.lang.String str21 = bigDecimal18.toString();
        java.math.BigDecimal bigDecimal22 = bigDecimal18.stripTrailingZeros();
        java.math.BigInteger bigInteger23 = bigDecimal22.toBigInteger();
        java.math.BigDecimal bigDecimal24 = bigDecimal22.plus();
        java.math.BigDecimal bigDecimal25 = bigDecimal14.divide(bigDecimal24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal18 and bigDecimal24", (bigDecimal18.compareTo(bigDecimal24) == 0) == bigDecimal18.equals(bigDecimal24));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.TEN;
        long long3 = bigDecimal2.longValueExact();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.ulp();
        java.lang.String str5 = bigDecimal2.toString();
        int int6 = bigDecimal0.compareTo(bigDecimal2);
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal10 = bigDecimal2.divide(bigDecimal8, (int) (short) 1);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.TEN;
        long long12 = bigDecimal11.longValueExact();
        java.math.BigDecimal bigDecimal13 = bigDecimal10.max(bigDecimal11);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.TEN;
        long long15 = bigDecimal14.longValueExact();
        java.math.BigDecimal bigDecimal16 = bigDecimal14.ulp();
        java.math.BigDecimal bigDecimal17 = bigDecimal11.subtract(bigDecimal14);
        double double18 = bigDecimal14.doubleValue();
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.TEN;
        long long20 = bigDecimal19.longValueExact();
        java.math.BigDecimal bigDecimal21 = bigDecimal19.ulp();
        java.lang.String str22 = bigDecimal19.toString();
        java.math.BigDecimal bigDecimal23 = bigDecimal19.stripTrailingZeros();
        java.math.BigInteger bigInteger24 = bigDecimal23.toBigInteger();
        java.math.BigDecimal[] bigDecimalArray25 = bigDecimal14.divideAndRemainder(bigDecimal23);
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal27 = bigDecimal26.negate();
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal29 = bigDecimal27.min(bigDecimal28);
        java.math.BigDecimal bigDecimal30 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal31 = bigDecimal30.negate();
        java.math.BigDecimal bigDecimal34 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal35 = bigDecimal31.subtract(bigDecimal34);
        java.math.BigDecimal[] bigDecimalArray36 = bigDecimal28.divideAndRemainder(bigDecimal34);
        java.math.BigDecimal bigDecimal37 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal38 = bigDecimal37.negate();
        java.math.BigDecimal bigDecimal41 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal42 = bigDecimal38.subtract(bigDecimal41);
        java.math.BigDecimal bigDecimal43 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal44 = bigDecimal41.min(bigDecimal43);
        java.math.BigDecimal bigDecimal45 = bigDecimal34.divideToIntegralValue(bigDecimal44);
        java.math.BigDecimal bigDecimal46 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal47 = bigDecimal46.negate();
        java.math.BigDecimal bigDecimal48 = java.math.BigDecimal.TEN;
        long long49 = bigDecimal48.longValueExact();
        java.math.BigDecimal bigDecimal50 = bigDecimal48.ulp();
        java.lang.String str51 = bigDecimal48.toString();
        int int52 = bigDecimal46.compareTo(bigDecimal48);
        java.math.BigInteger bigInteger53 = bigDecimal46.toBigInteger();
        java.math.BigDecimal bigDecimal54 = bigDecimal46.ulp();
        java.math.BigDecimal bigDecimal55 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal56 = bigDecimal55.negate();
        java.math.BigDecimal bigDecimal57 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal58 = bigDecimal56.min(bigDecimal57);
        int int59 = bigDecimal46.compareTo(bigDecimal58);
        int int60 = bigDecimal45.compareTo(bigDecimal58);
        java.math.BigDecimal bigDecimal61 = bigDecimal14.subtract(bigDecimal58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal61 and bigDecimal23", (bigDecimal61.compareTo(bigDecimal23) == 0) == bigDecimal61.equals(bigDecimal23));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.negate();
        java.lang.String str5 = bigDecimal4.toEngineeringString();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal8 = bigDecimal4.movePointRight(100);
        byte[] byteArray11 = new byte[] { (byte) 1 };
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray11);
        java.math.BigInteger bigInteger13 = new java.math.BigInteger((int) (short) -1, byteArray11);
        java.math.BigInteger bigInteger15 = bigInteger13.pow((int) 'a');
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(bigInteger15, (int) (byte) 0);
        java.util.Locale locale18 = java.util.Locale.PRC;
        java.lang.String str19 = locale18.getISO3Language();
        boolean boolean20 = bigDecimal17.equals((java.lang.Object) str19);
        java.math.BigDecimal bigDecimal23 = bigDecimal4.divide(bigDecimal17, (int) (short) 100, (int) (short) 1);
        java.math.BigDecimal bigDecimal24 = bigDecimal23.plus();
        java.math.BigDecimal bigDecimal26 = bigDecimal23.scaleByPowerOfTen((int) '#');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal23", (bigDecimal0.compareTo(bigDecimal23) == 0) == bigDecimal0.equals(bigDecimal23));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigDecimal bigDecimal3 = bigDecimal0.movePointLeft((int) (byte) -1);
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal6 = bigDecimal4.negate();
        java.lang.String str7 = bigDecimal4.toString();
        java.math.BigDecimal bigDecimal9 = bigDecimal4.scaleByPowerOfTen(0);
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal11 = bigDecimal10.negate();
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.TEN;
        long long13 = bigDecimal12.longValueExact();
        java.math.BigDecimal bigDecimal14 = bigDecimal12.ulp();
        java.lang.String str15 = bigDecimal12.toString();
        int int16 = bigDecimal10.compareTo(bigDecimal12);
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal20 = bigDecimal12.divide(bigDecimal18, (int) (short) 1);
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.TEN;
        long long22 = bigDecimal21.longValueExact();
        java.math.BigDecimal bigDecimal23 = bigDecimal20.max(bigDecimal21);
        java.math.BigDecimal bigDecimal24 = bigDecimal4.add(bigDecimal20);
        java.math.BigDecimal bigDecimal25 = bigDecimal0.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.TEN;
        long long27 = bigDecimal26.longValueExact();
        java.math.BigDecimal bigDecimal28 = bigDecimal26.ulp();
        java.lang.String str29 = bigDecimal26.toString();
        java.math.BigDecimal bigDecimal30 = bigDecimal26.stripTrailingZeros();
        java.math.BigDecimal bigDecimal31 = bigDecimal4.remainder(bigDecimal30);
        long long32 = bigDecimal4.longValueExact();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal12 and bigDecimal30", (bigDecimal12.compareTo(bigDecimal30) == 0) == bigDecimal12.equals(bigDecimal30));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.negate();
        java.lang.String str5 = bigDecimal4.toEngineeringString();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal8 = bigDecimal4.movePointRight(100);
        byte[] byteArray11 = new byte[] { (byte) 1 };
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray11);
        java.math.BigInteger bigInteger13 = new java.math.BigInteger((int) (short) -1, byteArray11);
        java.math.BigInteger bigInteger15 = bigInteger13.pow((int) 'a');
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(bigInteger15, (int) (byte) 0);
        java.util.Locale locale18 = java.util.Locale.PRC;
        java.lang.String str19 = locale18.getISO3Language();
        boolean boolean20 = bigDecimal17.equals((java.lang.Object) str19);
        java.math.BigDecimal bigDecimal23 = bigDecimal4.divide(bigDecimal17, (int) (short) 100, (int) (short) 1);
        byte byte24 = bigDecimal17.byteValueExact();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal23", (bigDecimal0.compareTo(bigDecimal23) == 0) == bigDecimal0.equals(bigDecimal23));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.ulp();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal4 = bigDecimal0.stripTrailingZeros();
        java.math.BigInteger bigInteger5 = bigDecimal4.toBigInteger();
        java.lang.String str6 = bigDecimal4.toPlainString();
        byte[] byteArray8 = new byte[] { (byte) 1 };
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray8);
        java.math.BigInteger bigInteger10 = new java.math.BigInteger(byteArray8);
        java.math.BigDecimal bigDecimal11 = new java.math.BigDecimal(bigInteger10);
        int int12 = bigDecimal4.compareTo(bigDecimal11);
        java.math.BigDecimal bigDecimal14 = bigDecimal4.movePointLeft(97);
        java.math.BigInteger bigInteger15 = bigDecimal4.toBigIntegerExact();
        int int16 = bigInteger15.bitLength();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal4", (bigDecimal0.compareTo(bigDecimal4) == 0) == bigDecimal0.equals(bigDecimal4));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.scaleByPowerOfTen((int) 'a');
        java.math.BigDecimal bigDecimal5 = bigDecimal2.abs();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal5 and bigDecimal4", (bigDecimal5.compareTo(bigDecimal4) == 0) == bigDecimal5.equals(bigDecimal4));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal3 = bigDecimal1.min(bigDecimal2);
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal9 = bigDecimal5.subtract(bigDecimal8);
        java.math.BigDecimal[] bigDecimalArray10 = bigDecimal2.divideAndRemainder(bigDecimal8);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal12 = bigDecimal11.negate();
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal16 = bigDecimal12.subtract(bigDecimal15);
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal18 = bigDecimal15.min(bigDecimal17);
        java.math.BigDecimal bigDecimal19 = bigDecimal8.divideToIntegralValue(bigDecimal18);
        java.lang.String str20 = bigDecimal18.toEngineeringString();
        long long21 = bigDecimal18.longValue();
        byte[] byteArray24 = new byte[] { (byte) 1 };
        byte byte25 = org.apache.commons.lang3.math.NumberUtils.min(byteArray24);
        java.math.BigInteger bigInteger26 = new java.math.BigInteger((int) (short) -1, byteArray24);
        java.math.BigInteger bigInteger28 = bigInteger26.pow((int) 'a');
        java.math.BigInteger bigInteger30 = bigInteger26.shiftLeft((int) (short) 1);
        java.math.BigDecimal bigDecimal32 = new java.math.BigDecimal(bigInteger26, 34);
        java.math.BigDecimal bigDecimal35 = bigDecimal18.divide(bigDecimal32, 100, 7);
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal37 = bigDecimal36.negate();
        int int38 = bigDecimal37.signum();
        float float39 = bigDecimal37.floatValue();
        java.math.BigDecimal bigDecimal41 = bigDecimal37.movePointLeft(7);
        boolean boolean42 = bigDecimal35.equals((java.lang.Object) 7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal41", (bigDecimal0.compareTo(bigDecimal41) == 0) == bigDecimal0.equals(bigDecimal41));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.TEN;
        long long3 = bigDecimal2.longValueExact();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.ulp();
        java.lang.String str5 = bigDecimal2.toString();
        int int6 = bigDecimal0.compareTo(bigDecimal2);
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal10 = bigDecimal2.divide(bigDecimal8, (int) (short) 1);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.TEN;
        long long12 = bigDecimal11.longValueExact();
        java.math.BigDecimal bigDecimal13 = bigDecimal10.max(bigDecimal11);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.TEN;
        long long15 = bigDecimal14.longValueExact();
        java.math.BigDecimal bigDecimal16 = bigDecimal14.ulp();
        java.math.BigDecimal bigDecimal17 = bigDecimal11.subtract(bigDecimal14);
        double double18 = bigDecimal14.doubleValue();
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.TEN;
        long long20 = bigDecimal19.longValueExact();
        java.math.BigDecimal bigDecimal21 = bigDecimal19.ulp();
        java.lang.String str22 = bigDecimal19.toString();
        java.math.BigDecimal bigDecimal23 = bigDecimal19.stripTrailingZeros();
        java.math.BigInteger bigInteger24 = bigDecimal23.toBigInteger();
        java.math.BigDecimal[] bigDecimalArray25 = bigDecimal14.divideAndRemainder(bigDecimal23);
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal27 = bigDecimal26.negate();
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.TEN;
        long long29 = bigDecimal28.longValueExact();
        java.math.BigDecimal bigDecimal30 = bigDecimal28.ulp();
        java.lang.String str31 = bigDecimal28.toString();
        int int32 = bigDecimal26.compareTo(bigDecimal28);
        short short33 = bigDecimal26.shortValueExact();
        java.math.BigDecimal bigDecimal35 = bigDecimal26.scaleByPowerOfTen((-1));
        java.math.BigDecimal bigDecimal36 = bigDecimal23.max(bigDecimal26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal26 and bigDecimal35", (bigDecimal26.compareTo(bigDecimal35) == 0) == bigDecimal26.equals(bigDecimal35));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.negate();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal5 = new java.math.BigDecimal((double) 1L);
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 10, (short) 100 };
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(objArray8, "hi!", (int) (byte) 100, (int) (short) -1);
        boolean boolean13 = bigDecimal5.equals((java.lang.Object) (short) -1);
        java.math.BigDecimal bigDecimal14 = bigDecimal0.max(bigDecimal5);
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        int int16 = bigDecimal14.intValueExact();
        java.math.BigDecimal bigDecimal17 = bigDecimal14.abs();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal21 = bigDecimal18.setScale((int) (byte) 100, (int) (byte) 0);
        java.math.BigDecimal bigDecimal23 = bigDecimal18.scaleByPowerOfTen((-1));
        java.math.BigDecimal bigDecimal24 = bigDecimal17.min(bigDecimal23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal21", (bigDecimal0.compareTo(bigDecimal21) == 0) == bigDecimal0.equals(bigDecimal21));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal2 = bigDecimal0.movePointLeft((int) (byte) 0);
        java.lang.String str3 = bigDecimal2.toPlainString();
        java.math.BigDecimal bigDecimal5 = bigDecimal2.scaleByPowerOfTen(34);
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal7 = bigDecimal6.negate();
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal11 = bigDecimal7.subtract(bigDecimal10);
        java.math.BigInteger bigInteger12 = bigDecimal11.toBigInteger();
        double double13 = bigInteger12.doubleValue();
        byte[] byteArray16 = new byte[] { (byte) 1 };
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray16);
        java.math.BigInteger bigInteger18 = new java.math.BigInteger((int) (short) -1, byteArray16);
        java.math.BigInteger bigInteger19 = bigInteger12.gcd(bigInteger18);
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal21 = bigDecimal20.negate();
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal25 = bigDecimal21.subtract(bigDecimal24);
        java.math.BigInteger bigInteger26 = bigDecimal25.toBigInteger();
        java.math.BigInteger bigInteger27 = bigInteger18.or(bigInteger26);
        short short28 = bigInteger18.shortValueExact();
        byte[] byteArray31 = new byte[] { (byte) 1 };
        byte byte32 = org.apache.commons.lang3.math.NumberUtils.min(byteArray31);
        java.math.BigInteger bigInteger33 = new java.math.BigInteger((int) (short) -1, byteArray31);
        java.math.BigInteger bigInteger35 = bigInteger33.pow((int) 'a');
        java.math.BigInteger bigInteger37 = bigInteger33.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger38 = bigInteger18.xor(bigInteger37);
        java.math.BigInteger bigInteger40 = bigInteger37.clearBit(4);
        double double41 = bigInteger37.doubleValue();
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal43 = bigDecimal42.negate();
        java.math.BigDecimal bigDecimal46 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal47 = bigDecimal43.subtract(bigDecimal46);
        java.math.BigInteger bigInteger48 = bigDecimal47.toBigInteger();
        double double49 = bigInteger48.doubleValue();
        byte[] byteArray52 = new byte[] { (byte) 1 };
        byte byte53 = org.apache.commons.lang3.math.NumberUtils.min(byteArray52);
        java.math.BigInteger bigInteger54 = new java.math.BigInteger((int) (short) -1, byteArray52);
        java.math.BigInteger bigInteger55 = bigInteger48.gcd(bigInteger54);
        java.math.BigDecimal bigDecimal56 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal57 = bigDecimal56.negate();
        java.math.BigDecimal bigDecimal60 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal61 = bigDecimal57.subtract(bigDecimal60);
        java.math.BigInteger bigInteger62 = bigDecimal61.toBigInteger();
        java.math.BigInteger bigInteger63 = bigInteger54.or(bigInteger62);
        byte[] byteArray64 = bigInteger63.toByteArray();
        byte[] byteArray66 = new byte[] { (byte) 1 };
        byte byte67 = org.apache.commons.lang3.math.NumberUtils.min(byteArray66);
        java.math.BigInteger bigInteger68 = new java.math.BigInteger(byteArray66);
        java.math.BigDecimal bigDecimal69 = new java.math.BigDecimal(bigInteger68);
        short short70 = bigInteger68.shortValueExact();
        int int71 = bigInteger68.bitLength();
        java.math.BigInteger[] bigIntegerArray72 = bigInteger63.divideAndRemainder(bigInteger68);
        java.math.BigDecimal bigDecimal73 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal74 = bigDecimal73.negate();
        java.math.BigDecimal bigDecimal77 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal78 = bigDecimal74.subtract(bigDecimal77);
        java.math.BigInteger bigInteger79 = bigDecimal78.toBigInteger();
        double double80 = bigInteger79.doubleValue();
        byte[] byteArray83 = new byte[] { (byte) 1 };
        byte byte84 = org.apache.commons.lang3.math.NumberUtils.min(byteArray83);
        java.math.BigInteger bigInteger85 = new java.math.BigInteger((int) (short) -1, byteArray83);
        java.math.BigInteger bigInteger86 = bigInteger79.gcd(bigInteger85);
        java.math.BigInteger bigInteger87 = bigInteger68.andNot(bigInteger85);
        java.math.BigInteger bigInteger88 = bigInteger37.xor(bigInteger85);
        boolean boolean89 = bigDecimal5.equals((java.lang.Object) bigInteger37);
        int int90 = bigInteger37.bitCount();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal5", (bigDecimal0.compareTo(bigDecimal5) == 0) == bigDecimal0.equals(bigDecimal5));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf((long) (-1), (int) 'u');
        java.math.BigDecimal bigDecimal3 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal4 = bigDecimal3.abs();
        java.math.BigDecimal bigDecimal5 = bigDecimal2.min(bigDecimal4);
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.valueOf((double) (-1.0f));
        int int8 = bigDecimal4.compareTo(bigDecimal7);
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal10 = bigDecimal9.negate();
        java.math.BigDecimal bigDecimal11 = bigDecimal9.negate();
        java.lang.String str12 = bigDecimal9.toString();
        java.math.BigDecimal bigDecimal14 = new java.math.BigDecimal((double) 1L);
        java.lang.Object[] objArray17 = new java.lang.Object[] { (short) 10, (short) 100 };
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(objArray17, "hi!", (int) (byte) 100, (int) (short) -1);
        boolean boolean22 = bigDecimal14.equals((java.lang.Object) (short) -1);
        java.math.BigDecimal bigDecimal23 = bigDecimal9.max(bigDecimal14);
        java.math.BigDecimal bigDecimal24 = bigDecimal23.negate();
        int int25 = bigDecimal23.intValueExact();
        java.math.BigDecimal bigDecimal26 = bigDecimal7.remainder(bigDecimal23);
        java.lang.String str27 = bigDecimal7.toEngineeringString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal9 and bigDecimal26", (bigDecimal9.compareTo(bigDecimal26) == 0) == bigDecimal9.equals(bigDecimal26));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((long) (byte) 0);
        java.math.BigDecimal bigDecimal2 = bigDecimal1.stripTrailingZeros();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.setScale((int) (short) 1);
        java.math.BigDecimal bigDecimal6 = bigDecimal2.pow(101);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal2 and bigDecimal4", (bigDecimal2.compareTo(bigDecimal4) == 0) == bigDecimal2.equals(bigDecimal4));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.ulp();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal4 = bigDecimal0.stripTrailingZeros();
        int int5 = bigDecimal4.intValue();
        java.math.BigDecimal bigDecimal7 = bigDecimal4.scaleByPowerOfTen(100);
        java.math.BigDecimal bigDecimal8 = bigDecimal7.plus();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal4", (bigDecimal0.compareTo(bigDecimal4) == 0) == bigDecimal0.equals(bigDecimal4));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal0.setScale((int) (byte) 100, (int) (byte) 0);
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        double double5 = bigDecimal4.doubleValue();
        java.math.BigInteger bigInteger6 = bigDecimal4.toBigInteger();
        java.math.BigDecimal bigDecimal7 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.ZERO;
        double double9 = bigDecimal8.doubleValue();
        java.math.BigInteger bigInteger10 = bigDecimal8.toBigInteger();
        byte[] byteArray13 = new byte[] { (byte) 1 };
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray13);
        java.math.BigInteger bigInteger15 = new java.math.BigInteger((int) (short) -1, byteArray13);
        java.math.BigInteger bigInteger17 = bigInteger15.pow((int) 'a');
        byte[] byteArray18 = bigInteger15.toByteArray();
        long long19 = bigInteger15.longValueExact();
        java.math.BigInteger bigInteger20 = bigInteger10.or(bigInteger15);
        byte byte21 = bigInteger15.byteValueExact();
        java.math.BigDecimal bigDecimal23 = new java.math.BigDecimal(bigInteger15, (int) (byte) 0);
        java.math.BigDecimal bigDecimal25 = new java.math.BigDecimal(bigInteger15, (int) '#');
        java.math.BigDecimal bigDecimal26 = bigDecimal4.max(bigDecimal25);
        int int27 = bigDecimal0.compareTo(bigDecimal4);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal3 and bigDecimal0", (bigDecimal3.compareTo(bigDecimal0) == 0) == bigDecimal3.equals(bigDecimal0));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf((long) (-1), (int) 'u');
        java.math.BigDecimal bigDecimal3 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal4 = bigDecimal3.abs();
        java.math.BigDecimal bigDecimal5 = bigDecimal2.min(bigDecimal4);
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.valueOf((double) (-1.0f));
        int int8 = bigDecimal4.compareTo(bigDecimal7);
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal10 = bigDecimal9.negate();
        java.math.BigDecimal bigDecimal11 = bigDecimal9.negate();
        java.lang.String str12 = bigDecimal9.toString();
        java.math.BigDecimal bigDecimal14 = new java.math.BigDecimal((double) 1L);
        java.lang.Object[] objArray17 = new java.lang.Object[] { (short) 10, (short) 100 };
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(objArray17, "hi!", (int) (byte) 100, (int) (short) -1);
        boolean boolean22 = bigDecimal14.equals((java.lang.Object) (short) -1);
        java.math.BigDecimal bigDecimal23 = bigDecimal9.max(bigDecimal14);
        java.math.BigDecimal bigDecimal24 = bigDecimal23.negate();
        int int25 = bigDecimal23.intValueExact();
        java.math.BigDecimal bigDecimal26 = bigDecimal7.remainder(bigDecimal23);
        double double27 = bigDecimal23.doubleValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal7 and bigDecimal24", (bigDecimal7.compareTo(bigDecimal24) == 0) == bigDecimal7.equals(bigDecimal24));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.scaleByPowerOfTen((int) 'a');
        java.math.BigDecimal bigDecimal5 = bigDecimal4.ulp();
        java.math.BigDecimal bigDecimal6 = bigDecimal5.abs();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal4", (bigDecimal0.compareTo(bigDecimal4) == 0) == bigDecimal0.equals(bigDecimal4));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigInteger bigInteger2 = bigDecimal0.toBigInteger();
        java.math.BigDecimal bigDecimal3 = bigDecimal0.negate();
        java.math.BigInteger bigInteger4 = bigDecimal0.toBigIntegerExact();
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.valueOf((long) 301, (int) '4');
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.valueOf((long) (byte) 0);
        byte byte10 = bigDecimal9.byteValueExact();
        java.math.BigDecimal bigDecimal12 = bigDecimal9.pow(2);
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal14 = bigDecimal13.negate();
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.TEN;
        long long16 = bigDecimal15.longValueExact();
        java.math.BigDecimal bigDecimal17 = bigDecimal15.ulp();
        java.lang.String str18 = bigDecimal15.toString();
        int int19 = bigDecimal13.compareTo(bigDecimal15);
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal23 = bigDecimal15.divide(bigDecimal21, (int) (short) 1);
        java.math.BigDecimal bigDecimal24 = bigDecimal12.add(bigDecimal15);
        java.math.BigDecimal bigDecimal25 = bigDecimal15.negate();
        java.math.BigDecimal[] bigDecimalArray26 = bigDecimal7.divideAndRemainder(bigDecimal15);
        java.math.BigDecimal[] bigDecimalArray27 = bigDecimal0.divideAndRemainder(bigDecimal7);
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal29 = bigDecimal28.negate();
        java.math.BigDecimal bigDecimal30 = java.math.BigDecimal.TEN;
        long long31 = bigDecimal30.longValueExact();
        java.math.BigDecimal bigDecimal32 = bigDecimal30.ulp();
        java.lang.String str33 = bigDecimal30.toString();
        int int34 = bigDecimal28.compareTo(bigDecimal30);
        short short35 = bigDecimal28.shortValueExact();
        java.math.BigDecimal bigDecimal37 = bigDecimal28.scaleByPowerOfTen((-1));
        double double38 = bigDecimal37.doubleValue();
        java.math.BigDecimal bigDecimal39 = bigDecimal7.subtract(bigDecimal37);
        int int40 = bigDecimal7.precision();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal37", (bigDecimal0.compareTo(bigDecimal37) == 0) == bigDecimal0.equals(bigDecimal37));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal2 = bigDecimal0.movePointLeft((int) (byte) 0);
        java.math.BigDecimal bigDecimal3 = bigDecimal0.abs();
        java.math.BigDecimal bigDecimal5 = bigDecimal3.movePointRight((-1));
        java.math.BigDecimal bigDecimal6 = bigDecimal3.ulp();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal3 and bigDecimal5", (bigDecimal3.compareTo(bigDecimal5) == 0) == bigDecimal3.equals(bigDecimal5));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigDecimal bigDecimal3 = bigDecimal0.movePointLeft((int) (byte) -1);
        java.math.BigDecimal bigDecimal5 = bigDecimal0.movePointRight((int) (short) 1);
        java.math.BigDecimal bigDecimal7 = bigDecimal5.movePointLeft((int) '4');
        java.math.BigInteger bigInteger8 = bigDecimal7.toBigIntegerExact();
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.ZERO;
        double double10 = bigDecimal9.doubleValue();
        java.math.BigInteger bigInteger11 = bigDecimal9.toBigInteger();
        java.math.BigInteger bigInteger13 = bigInteger11.setBit(4);
        java.math.BigInteger bigInteger14 = bigInteger8.xor(bigInteger13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal7", (bigDecimal0.compareTo(bigDecimal7) == 0) == bigDecimal0.equals(bigDecimal7));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal2 = bigDecimal0.movePointLeft((int) (byte) 0);
        java.lang.String str3 = bigDecimal2.toPlainString();
        java.math.BigDecimal bigDecimal5 = bigDecimal2.scaleByPowerOfTen(34);
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal7 = bigDecimal6.negate();
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal11 = bigDecimal7.subtract(bigDecimal10);
        java.math.BigInteger bigInteger12 = bigDecimal11.toBigInteger();
        double double13 = bigInteger12.doubleValue();
        byte[] byteArray16 = new byte[] { (byte) 1 };
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray16);
        java.math.BigInteger bigInteger18 = new java.math.BigInteger((int) (short) -1, byteArray16);
        java.math.BigInteger bigInteger19 = bigInteger12.gcd(bigInteger18);
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal21 = bigDecimal20.negate();
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal25 = bigDecimal21.subtract(bigDecimal24);
        java.math.BigInteger bigInteger26 = bigDecimal25.toBigInteger();
        java.math.BigInteger bigInteger27 = bigInteger18.or(bigInteger26);
        short short28 = bigInteger18.shortValueExact();
        byte[] byteArray31 = new byte[] { (byte) 1 };
        byte byte32 = org.apache.commons.lang3.math.NumberUtils.min(byteArray31);
        java.math.BigInteger bigInteger33 = new java.math.BigInteger((int) (short) -1, byteArray31);
        java.math.BigInteger bigInteger35 = bigInteger33.pow((int) 'a');
        java.math.BigInteger bigInteger37 = bigInteger33.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger38 = bigInteger18.xor(bigInteger37);
        java.math.BigInteger bigInteger40 = bigInteger37.clearBit(4);
        double double41 = bigInteger37.doubleValue();
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal43 = bigDecimal42.negate();
        java.math.BigDecimal bigDecimal46 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal47 = bigDecimal43.subtract(bigDecimal46);
        java.math.BigInteger bigInteger48 = bigDecimal47.toBigInteger();
        double double49 = bigInteger48.doubleValue();
        byte[] byteArray52 = new byte[] { (byte) 1 };
        byte byte53 = org.apache.commons.lang3.math.NumberUtils.min(byteArray52);
        java.math.BigInteger bigInteger54 = new java.math.BigInteger((int) (short) -1, byteArray52);
        java.math.BigInteger bigInteger55 = bigInteger48.gcd(bigInteger54);
        java.math.BigDecimal bigDecimal56 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal57 = bigDecimal56.negate();
        java.math.BigDecimal bigDecimal60 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal61 = bigDecimal57.subtract(bigDecimal60);
        java.math.BigInteger bigInteger62 = bigDecimal61.toBigInteger();
        java.math.BigInteger bigInteger63 = bigInteger54.or(bigInteger62);
        byte[] byteArray64 = bigInteger63.toByteArray();
        byte[] byteArray66 = new byte[] { (byte) 1 };
        byte byte67 = org.apache.commons.lang3.math.NumberUtils.min(byteArray66);
        java.math.BigInteger bigInteger68 = new java.math.BigInteger(byteArray66);
        java.math.BigDecimal bigDecimal69 = new java.math.BigDecimal(bigInteger68);
        short short70 = bigInteger68.shortValueExact();
        int int71 = bigInteger68.bitLength();
        java.math.BigInteger[] bigIntegerArray72 = bigInteger63.divideAndRemainder(bigInteger68);
        java.math.BigDecimal bigDecimal73 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal74 = bigDecimal73.negate();
        java.math.BigDecimal bigDecimal77 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal78 = bigDecimal74.subtract(bigDecimal77);
        java.math.BigInteger bigInteger79 = bigDecimal78.toBigInteger();
        double double80 = bigInteger79.doubleValue();
        byte[] byteArray83 = new byte[] { (byte) 1 };
        byte byte84 = org.apache.commons.lang3.math.NumberUtils.min(byteArray83);
        java.math.BigInteger bigInteger85 = new java.math.BigInteger((int) (short) -1, byteArray83);
        java.math.BigInteger bigInteger86 = bigInteger79.gcd(bigInteger85);
        java.math.BigInteger bigInteger87 = bigInteger68.andNot(bigInteger85);
        java.math.BigInteger bigInteger88 = bigInteger37.xor(bigInteger85);
        boolean boolean89 = bigDecimal5.equals((java.lang.Object) bigInteger37);
        java.math.BigDecimal bigDecimal91 = java.math.BigDecimal.valueOf((double) (-1));
        java.math.BigDecimal bigDecimal92 = bigDecimal5.subtract(bigDecimal91);
        java.math.BigInteger bigInteger93 = bigDecimal91.toBigIntegerExact();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal5", (bigDecimal0.compareTo(bigDecimal5) == 0) == bigDecimal0.equals(bigDecimal5));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        java.math.BigDecimal bigDecimal3 = java.math.BigDecimal.valueOf((long) (byte) -1, 0);
        java.math.BigDecimal bigDecimal4 = bigDecimal3.plus();
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.TEN;
        long long6 = bigDecimal5.longValueExact();
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        double double8 = bigDecimal7.doubleValue();
        java.math.BigDecimal bigDecimal10 = bigDecimal7.movePointLeft((int) (byte) -1);
        int int11 = bigDecimal10.intValue();
        java.math.BigDecimal bigDecimal12 = bigDecimal5.add(bigDecimal10);
        java.math.BigDecimal bigDecimal13 = bigDecimal3.multiply(bigDecimal12);
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.valueOf((long) (-1), (int) 'u');
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal18 = bigDecimal17.abs();
        java.math.BigDecimal bigDecimal19 = bigDecimal16.min(bigDecimal18);
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.valueOf((double) (-1.0f));
        int int22 = bigDecimal18.compareTo(bigDecimal21);
        java.math.BigDecimal[] bigDecimalArray23 = bigDecimal3.divideAndRemainder(bigDecimal21);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.concatWith("HI!H", (java.lang.Object[]) bigDecimalArray23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal3 and bigDecimal21", (bigDecimal3.compareTo(bigDecimal21) == 0) == bigDecimal3.equals(bigDecimal21));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.negate();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal5 = new java.math.BigDecimal((double) 1L);
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 10, (short) 100 };
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(objArray8, "hi!", (int) (byte) 100, (int) (short) -1);
        boolean boolean13 = bigDecimal5.equals((java.lang.Object) (short) -1);
        java.math.BigDecimal bigDecimal14 = bigDecimal0.max(bigDecimal5);
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal16 = bigDecimal15.negate();
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal20 = bigDecimal16.subtract(bigDecimal19);
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal22 = bigDecimal19.min(bigDecimal21);
        java.math.BigDecimal bigDecimal24 = bigDecimal22.movePointRight((int) (short) -2);
        java.math.BigDecimal bigDecimal25 = bigDecimal0.min(bigDecimal22);
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal27 = bigDecimal26.negate();
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal29 = bigDecimal28.negate();
        java.math.BigDecimal bigDecimal30 = bigDecimal28.negate();
        java.lang.String str31 = bigDecimal30.toEngineeringString();
        java.math.BigDecimal bigDecimal32 = bigDecimal27.multiply(bigDecimal30);
        java.math.BigDecimal bigDecimal33 = bigDecimal0.subtract(bigDecimal30);
        java.math.BigDecimal bigDecimal35 = bigDecimal33.setScale((int) (byte) 1);
        java.math.BigInteger bigInteger36 = bigDecimal33.unscaledValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal33 and bigDecimal35", (bigDecimal33.compareTo(bigDecimal35) == 0) == bigDecimal33.equals(bigDecimal35));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.negate();
        java.lang.String str5 = bigDecimal4.toEngineeringString();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal8 = bigDecimal7.negate();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal12 = bigDecimal8.subtract(bigDecimal11);
        java.math.BigInteger bigInteger13 = bigDecimal12.toBigInteger();
        java.math.BigDecimal bigDecimal14 = bigDecimal6.divideToIntegralValue(bigDecimal12);
        long long15 = bigDecimal6.longValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal6 and bigDecimal14", (bigDecimal6.compareTo(bigDecimal14) == 0) == bigDecimal6.equals(bigDecimal14));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        int int2 = bigDecimal1.signum();
        long long3 = bigDecimal1.longValue();
        java.math.BigDecimal bigDecimal4 = bigDecimal1.abs();
        int int5 = bigDecimal1.scale();
        byte byte6 = bigDecimal1.byteValueExact();
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal8 = bigDecimal7.negate();
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal10 = bigDecimal9.negate();
        java.math.BigDecimal bigDecimal11 = bigDecimal9.negate();
        java.lang.String str12 = bigDecimal11.toEngineeringString();
        java.math.BigDecimal bigDecimal13 = bigDecimal8.multiply(bigDecimal11);
        java.math.BigDecimal bigDecimal15 = bigDecimal11.movePointRight(100);
        byte[] byteArray18 = new byte[] { (byte) 1 };
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.min(byteArray18);
        java.math.BigInteger bigInteger20 = new java.math.BigInteger((int) (short) -1, byteArray18);
        java.math.BigInteger bigInteger22 = bigInteger20.pow((int) 'a');
        java.math.BigDecimal bigDecimal24 = new java.math.BigDecimal(bigInteger22, (int) (byte) 0);
        java.util.Locale locale25 = java.util.Locale.PRC;
        java.lang.String str26 = locale25.getISO3Language();
        boolean boolean27 = bigDecimal24.equals((java.lang.Object) str26);
        java.math.BigDecimal bigDecimal30 = bigDecimal11.divide(bigDecimal24, (int) (short) 100, (int) (short) 1);
        java.math.BigDecimal bigDecimal31 = bigDecimal1.max(bigDecimal30);
        java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal33 = bigDecimal32.negate();
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal37 = bigDecimal33.subtract(bigDecimal36);
        java.math.BigInteger bigInteger38 = bigDecimal37.toBigInteger();
        double double39 = bigInteger38.doubleValue();
        byte byte40 = bigInteger38.byteValueExact();
        java.math.BigDecimal bigDecimal42 = new java.math.BigDecimal(bigInteger38, (int) (byte) -1);
        java.math.BigDecimal bigDecimal43 = bigDecimal42.plus();
        java.math.BigDecimal bigDecimal44 = bigDecimal31.max(bigDecimal42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal44 and bigDecimal30", (bigDecimal44.compareTo(bigDecimal30) == 0) == bigDecimal44.equals(bigDecimal30));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.negate();
        java.lang.String str5 = bigDecimal4.toEngineeringString();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal8 = bigDecimal4.movePointRight(100);
        java.lang.String str9 = bigDecimal4.toEngineeringString();
        java.lang.String str10 = bigDecimal4.toPlainString();
        int int11 = bigDecimal4.scale();
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal14 = bigDecimal12.movePointLeft((int) (byte) 0);
        java.lang.String str15 = bigDecimal14.toPlainString();
        java.math.BigDecimal bigDecimal17 = bigDecimal14.scaleByPowerOfTen(34);
        java.math.BigDecimal bigDecimal18 = bigDecimal4.add(bigDecimal14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal18 and bigDecimal17", (bigDecimal18.compareTo(bigDecimal17) == 0) == bigDecimal18.equals(bigDecimal17));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.negate();
        java.lang.String str5 = bigDecimal4.toEngineeringString();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal8 = bigDecimal4.movePointRight(100);
        byte[] byteArray11 = new byte[] { (byte) 1 };
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray11);
        java.math.BigInteger bigInteger13 = new java.math.BigInteger((int) (short) -1, byteArray11);
        java.math.BigInteger bigInteger15 = bigInteger13.pow((int) 'a');
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(bigInteger15, (int) (byte) 0);
        java.util.Locale locale18 = java.util.Locale.PRC;
        java.lang.String str19 = locale18.getISO3Language();
        boolean boolean20 = bigDecimal17.equals((java.lang.Object) str19);
        java.math.BigDecimal bigDecimal23 = bigDecimal4.divide(bigDecimal17, (int) (short) 100, (int) (short) 1);
        int int24 = bigDecimal4.precision();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal4 and bigDecimal23", (bigDecimal4.compareTo(bigDecimal23) == 0) == bigDecimal4.equals(bigDecimal23));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        int int2 = bigDecimal1.signum();
        long long3 = bigDecimal1.longValue();
        java.math.BigDecimal bigDecimal4 = bigDecimal1.abs();
        int int5 = bigDecimal1.scale();
        byte byte6 = bigDecimal1.byteValueExact();
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal8 = bigDecimal7.negate();
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal10 = bigDecimal9.negate();
        java.math.BigDecimal bigDecimal11 = bigDecimal9.negate();
        java.lang.String str12 = bigDecimal11.toEngineeringString();
        java.math.BigDecimal bigDecimal13 = bigDecimal8.multiply(bigDecimal11);
        java.math.BigDecimal bigDecimal15 = bigDecimal11.movePointRight(100);
        byte[] byteArray18 = new byte[] { (byte) 1 };
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.min(byteArray18);
        java.math.BigInteger bigInteger20 = new java.math.BigInteger((int) (short) -1, byteArray18);
        java.math.BigInteger bigInteger22 = bigInteger20.pow((int) 'a');
        java.math.BigDecimal bigDecimal24 = new java.math.BigDecimal(bigInteger22, (int) (byte) 0);
        java.util.Locale locale25 = java.util.Locale.PRC;
        java.lang.String str26 = locale25.getISO3Language();
        boolean boolean27 = bigDecimal24.equals((java.lang.Object) str26);
        java.math.BigDecimal bigDecimal30 = bigDecimal11.divide(bigDecimal24, (int) (short) 100, (int) (short) 1);
        java.math.BigDecimal bigDecimal31 = bigDecimal1.max(bigDecimal30);
        java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal33 = bigDecimal32.negate();
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal37 = bigDecimal33.subtract(bigDecimal36);
        java.lang.String str38 = bigDecimal33.toPlainString();
        java.lang.String str39 = bigDecimal33.toPlainString();
        long[] longArray46 = new long[] { (byte) 1, (short) 100, 1L, (byte) 100, '4', 1L };
        long long47 = org.apache.commons.lang3.math.NumberUtils.min(longArray46);
        boolean boolean48 = bigDecimal33.equals((java.lang.Object) long47);
        java.math.BigDecimal bigDecimal49 = bigDecimal30.add(bigDecimal33);
        float float50 = bigDecimal33.floatValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal33 and bigDecimal30", (bigDecimal33.compareTo(bigDecimal30) == 0) == bigDecimal33.equals(bigDecimal30));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal2 = bigDecimal0.movePointLeft((int) (byte) 0);
        java.lang.String str3 = bigDecimal2.toPlainString();
        java.math.BigDecimal bigDecimal5 = bigDecimal2.scaleByPowerOfTen(34);
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal7 = bigDecimal6.negate();
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal11 = bigDecimal7.subtract(bigDecimal10);
        java.math.BigInteger bigInteger12 = bigDecimal11.toBigInteger();
        double double13 = bigInteger12.doubleValue();
        byte[] byteArray16 = new byte[] { (byte) 1 };
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray16);
        java.math.BigInteger bigInteger18 = new java.math.BigInteger((int) (short) -1, byteArray16);
        java.math.BigInteger bigInteger19 = bigInteger12.gcd(bigInteger18);
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal21 = bigDecimal20.negate();
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal25 = bigDecimal21.subtract(bigDecimal24);
        java.math.BigInteger bigInteger26 = bigDecimal25.toBigInteger();
        java.math.BigInteger bigInteger27 = bigInteger18.or(bigInteger26);
        short short28 = bigInteger18.shortValueExact();
        byte[] byteArray31 = new byte[] { (byte) 1 };
        byte byte32 = org.apache.commons.lang3.math.NumberUtils.min(byteArray31);
        java.math.BigInteger bigInteger33 = new java.math.BigInteger((int) (short) -1, byteArray31);
        java.math.BigInteger bigInteger35 = bigInteger33.pow((int) 'a');
        java.math.BigInteger bigInteger37 = bigInteger33.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger38 = bigInteger18.xor(bigInteger37);
        java.math.BigInteger bigInteger40 = bigInteger37.clearBit(4);
        double double41 = bigInteger37.doubleValue();
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal43 = bigDecimal42.negate();
        java.math.BigDecimal bigDecimal46 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal47 = bigDecimal43.subtract(bigDecimal46);
        java.math.BigInteger bigInteger48 = bigDecimal47.toBigInteger();
        double double49 = bigInteger48.doubleValue();
        byte[] byteArray52 = new byte[] { (byte) 1 };
        byte byte53 = org.apache.commons.lang3.math.NumberUtils.min(byteArray52);
        java.math.BigInteger bigInteger54 = new java.math.BigInteger((int) (short) -1, byteArray52);
        java.math.BigInteger bigInteger55 = bigInteger48.gcd(bigInteger54);
        java.math.BigDecimal bigDecimal56 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal57 = bigDecimal56.negate();
        java.math.BigDecimal bigDecimal60 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal61 = bigDecimal57.subtract(bigDecimal60);
        java.math.BigInteger bigInteger62 = bigDecimal61.toBigInteger();
        java.math.BigInteger bigInteger63 = bigInteger54.or(bigInteger62);
        byte[] byteArray64 = bigInteger63.toByteArray();
        byte[] byteArray66 = new byte[] { (byte) 1 };
        byte byte67 = org.apache.commons.lang3.math.NumberUtils.min(byteArray66);
        java.math.BigInteger bigInteger68 = new java.math.BigInteger(byteArray66);
        java.math.BigDecimal bigDecimal69 = new java.math.BigDecimal(bigInteger68);
        short short70 = bigInteger68.shortValueExact();
        int int71 = bigInteger68.bitLength();
        java.math.BigInteger[] bigIntegerArray72 = bigInteger63.divideAndRemainder(bigInteger68);
        java.math.BigDecimal bigDecimal73 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal74 = bigDecimal73.negate();
        java.math.BigDecimal bigDecimal77 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal78 = bigDecimal74.subtract(bigDecimal77);
        java.math.BigInteger bigInteger79 = bigDecimal78.toBigInteger();
        double double80 = bigInteger79.doubleValue();
        byte[] byteArray83 = new byte[] { (byte) 1 };
        byte byte84 = org.apache.commons.lang3.math.NumberUtils.min(byteArray83);
        java.math.BigInteger bigInteger85 = new java.math.BigInteger((int) (short) -1, byteArray83);
        java.math.BigInteger bigInteger86 = bigInteger79.gcd(bigInteger85);
        java.math.BigInteger bigInteger87 = bigInteger68.andNot(bigInteger85);
        java.math.BigInteger bigInteger88 = bigInteger37.xor(bigInteger85);
        boolean boolean89 = bigDecimal5.equals((java.lang.Object) bigInteger37);
        java.math.BigDecimal bigDecimal91 = java.math.BigDecimal.valueOf((double) (-1));
        java.math.BigDecimal bigDecimal92 = bigDecimal5.subtract(bigDecimal91);
        java.math.BigDecimal bigDecimal95 = java.math.BigDecimal.valueOf(1L, 32);
        java.math.BigDecimal bigDecimal96 = bigDecimal92.remainder(bigDecimal95);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal5", (bigDecimal0.compareTo(bigDecimal5) == 0) == bigDecimal0.equals(bigDecimal5));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigInteger bigInteger2 = bigDecimal0.toBigInteger();
        byte[] byteArray5 = new byte[] { (byte) 1 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.math.BigInteger bigInteger7 = new java.math.BigInteger((int) (short) -1, byteArray5);
        java.math.BigInteger bigInteger9 = bigInteger7.pow((int) 'a');
        byte[] byteArray10 = bigInteger7.toByteArray();
        long long11 = bigInteger7.longValueExact();
        java.math.BigInteger bigInteger12 = bigInteger2.or(bigInteger7);
        byte[] byteArray15 = new byte[] { (byte) 1 };
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.min(byteArray15);
        java.math.BigInteger bigInteger17 = new java.math.BigInteger((int) (short) -1, byteArray15);
        java.math.BigInteger bigInteger19 = bigInteger17.pow((int) 'a');
        byte[] byteArray20 = bigInteger17.toByteArray();
        long long21 = bigInteger17.longValueExact();
        java.lang.String str23 = bigInteger17.toString(0);
        int int24 = bigInteger17.intValueExact();
        java.math.BigInteger bigInteger25 = bigInteger12.subtract(bigInteger17);
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal27 = bigDecimal26.negate();
        java.math.BigDecimal bigDecimal30 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal31 = bigDecimal27.subtract(bigDecimal30);
        java.math.BigInteger bigInteger32 = bigDecimal31.toBigInteger();
        java.math.BigInteger bigInteger33 = bigInteger32.negate();
        java.math.BigDecimal bigDecimal34 = java.math.BigDecimal.ZERO;
        double double35 = bigDecimal34.doubleValue();
        java.math.BigInteger bigInteger36 = bigDecimal34.toBigInteger();
        byte[] byteArray39 = new byte[] { (byte) 1 };
        byte byte40 = org.apache.commons.lang3.math.NumberUtils.min(byteArray39);
        java.math.BigInteger bigInteger41 = new java.math.BigInteger((int) (short) -1, byteArray39);
        java.math.BigInteger bigInteger43 = bigInteger41.pow((int) 'a');
        byte[] byteArray44 = bigInteger41.toByteArray();
        long long45 = bigInteger41.longValueExact();
        java.math.BigInteger bigInteger46 = bigInteger36.or(bigInteger41);
        byte[] byteArray49 = new byte[] { (byte) 1 };
        byte byte50 = org.apache.commons.lang3.math.NumberUtils.min(byteArray49);
        java.math.BigInteger bigInteger51 = new java.math.BigInteger((int) (short) -1, byteArray49);
        java.math.BigInteger bigInteger53 = bigInteger51.pow((int) 'a');
        byte[] byteArray54 = bigInteger51.toByteArray();
        long long55 = bigInteger51.longValueExact();
        java.lang.String str57 = bigInteger51.toString(0);
        int int58 = bigInteger51.intValueExact();
        java.math.BigInteger bigInteger59 = bigInteger46.subtract(bigInteger51);
        java.math.BigInteger bigInteger60 = bigInteger32.min(bigInteger46);
        java.math.BigInteger bigInteger61 = bigInteger25.gcd(bigInteger60);
        java.math.BigInteger bigInteger63 = bigInteger25.setBit(0);
        java.math.BigInteger bigInteger65 = bigInteger63.flipBit(6);
        java.math.BigInteger bigInteger67 = bigInteger63.shiftLeft(30);
        java.math.BigDecimal bigDecimal68 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal69 = bigDecimal68.negate();
        java.math.BigDecimal bigDecimal70 = bigDecimal68.negate();
        java.math.BigDecimal bigDecimal72 = bigDecimal70.scaleByPowerOfTen((int) 'a');
        java.math.BigInteger bigInteger73 = bigDecimal72.unscaledValue();
        java.math.BigInteger bigInteger74 = bigInteger67.min(bigInteger73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal72", (bigDecimal0.compareTo(bigDecimal72) == 0) == bigDecimal0.equals(bigDecimal72));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigInteger bigInteger2 = bigDecimal0.toBigInteger();
        java.math.BigDecimal bigDecimal3 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        double double5 = bigDecimal4.doubleValue();
        java.math.BigInteger bigInteger6 = bigDecimal4.toBigInteger();
        byte[] byteArray9 = new byte[] { (byte) 1 };
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray9);
        java.math.BigInteger bigInteger11 = new java.math.BigInteger((int) (short) -1, byteArray9);
        java.math.BigInteger bigInteger13 = bigInteger11.pow((int) 'a');
        byte[] byteArray14 = bigInteger11.toByteArray();
        long long15 = bigInteger11.longValueExact();
        java.math.BigInteger bigInteger16 = bigInteger6.or(bigInteger11);
        byte byte17 = bigInteger11.byteValueExact();
        java.math.BigDecimal bigDecimal19 = new java.math.BigDecimal(bigInteger11, (int) (byte) 0);
        java.math.BigDecimal bigDecimal21 = new java.math.BigDecimal(bigInteger11, (int) '#');
        java.math.BigDecimal bigDecimal22 = bigDecimal0.max(bigDecimal21);
        java.math.BigDecimal bigDecimal24 = bigDecimal0.setScale(3);
        float float25 = bigDecimal0.floatValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal24", (bigDecimal0.compareTo(bigDecimal24) == 0) == bigDecimal0.equals(bigDecimal24));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((double) 0.0f);
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.TEN;
        long long5 = bigDecimal4.longValueExact();
        java.math.BigDecimal bigDecimal6 = bigDecimal4.ulp();
        java.lang.String str7 = bigDecimal4.toString();
        int int8 = bigDecimal2.compareTo(bigDecimal4);
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal12 = bigDecimal4.divide(bigDecimal10, (int) (short) 1);
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.TEN;
        long long14 = bigDecimal13.longValueExact();
        java.math.BigDecimal bigDecimal15 = bigDecimal12.max(bigDecimal13);
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.TEN;
        long long17 = bigDecimal16.longValueExact();
        java.math.BigDecimal bigDecimal18 = bigDecimal16.ulp();
        java.math.BigDecimal bigDecimal19 = bigDecimal13.subtract(bigDecimal16);
        boolean boolean21 = bigDecimal16.equals((java.lang.Object) "hi");
        java.math.BigDecimal bigDecimal23 = bigDecimal16.scaleByPowerOfTen((int) (byte) 1);
        java.math.BigDecimal bigDecimal24 = bigDecimal1.remainder(bigDecimal16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal10 and bigDecimal23", (bigDecimal10.compareTo(bigDecimal23) == 0) == bigDecimal10.equals(bigDecimal23));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        java.math.BigInteger bigInteger7 = bigInteger6.negate();
        java.math.BigInteger bigInteger9 = bigInteger7.flipBit((int) (short) 0);
        java.math.BigInteger bigInteger10 = bigInteger7.negate();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.ZERO;
        double double12 = bigDecimal11.doubleValue();
        java.math.BigInteger bigInteger13 = bigDecimal11.toBigInteger();
        java.math.BigInteger bigInteger15 = bigInteger13.setBit(4);
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(bigInteger13, (int) (byte) 10);
        java.math.BigInteger bigInteger18 = bigInteger10.and(bigInteger13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal17", (bigDecimal0.compareTo(bigDecimal17) == 0) == bigDecimal0.equals(bigDecimal17));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.TEN;
        long long3 = bigDecimal2.longValueExact();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.ulp();
        java.lang.String str5 = bigDecimal2.toString();
        int int6 = bigDecimal0.compareTo(bigDecimal2);
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal10 = bigDecimal2.divide(bigDecimal8, (int) (short) 1);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.TEN;
        long long12 = bigDecimal11.longValueExact();
        java.math.BigDecimal bigDecimal13 = bigDecimal10.max(bigDecimal11);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.TEN;
        long long15 = bigDecimal14.longValueExact();
        java.math.BigDecimal bigDecimal16 = bigDecimal14.ulp();
        java.math.BigDecimal bigDecimal17 = bigDecimal11.subtract(bigDecimal14);
        double double18 = bigDecimal14.doubleValue();
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.TEN;
        long long20 = bigDecimal19.longValueExact();
        java.math.BigDecimal bigDecimal21 = bigDecimal19.ulp();
        java.lang.String str22 = bigDecimal19.toString();
        java.math.BigDecimal bigDecimal23 = bigDecimal19.stripTrailingZeros();
        java.math.BigInteger bigInteger24 = bigDecimal23.toBigInteger();
        java.math.BigDecimal[] bigDecimalArray25 = bigDecimal14.divideAndRemainder(bigDecimal23);
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal27 = bigDecimal26.negate();
        java.math.BigDecimal bigDecimal28 = bigDecimal26.negate();
        java.lang.String str29 = bigDecimal26.toString();
        java.math.BigDecimal bigDecimal31 = new java.math.BigDecimal((double) 1L);
        java.lang.Object[] objArray34 = new java.lang.Object[] { (short) 10, (short) 100 };
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.join(objArray34, "hi!", (int) (byte) 100, (int) (short) -1);
        boolean boolean39 = bigDecimal31.equals((java.lang.Object) (short) -1);
        java.math.BigDecimal bigDecimal40 = bigDecimal26.max(bigDecimal31);
        java.math.BigDecimal bigDecimal41 = bigDecimal23.max(bigDecimal26);
        java.math.BigDecimal bigDecimal42 = bigDecimal26.plus();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal2 and bigDecimal23", (bigDecimal2.compareTo(bigDecimal23) == 0) == bigDecimal2.equals(bigDecimal23));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.scaleByPowerOfTen((int) 'a');
        java.math.BigInteger bigInteger5 = bigDecimal4.unscaledValue();
        java.math.BigInteger bigInteger7 = bigInteger5.shiftRight((int) (short) 16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal4", (bigDecimal0.compareTo(bigDecimal4) == 0) == bigDecimal0.equals(bigDecimal4));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.negate();
        java.lang.String str5 = bigDecimal4.toEngineeringString();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal8 = bigDecimal7.negate();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal12 = bigDecimal8.subtract(bigDecimal11);
        java.math.BigInteger bigInteger13 = bigDecimal12.toBigInteger();
        java.math.BigDecimal bigDecimal14 = bigDecimal6.divideToIntegralValue(bigDecimal12);
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal16 = bigDecimal15.negate();
        java.math.BigDecimal bigDecimal17 = bigDecimal16.abs();
        int int18 = bigDecimal16.intValueExact();
        boolean boolean19 = bigDecimal14.equals((java.lang.Object) int18);
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal21 = bigDecimal20.negate();
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.TEN;
        long long23 = bigDecimal22.longValueExact();
        java.math.BigDecimal bigDecimal24 = bigDecimal22.ulp();
        java.lang.String str25 = bigDecimal22.toString();
        int int26 = bigDecimal20.compareTo(bigDecimal22);
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal30 = bigDecimal22.divide(bigDecimal28, (int) (short) 1);
        java.math.BigDecimal bigDecimal31 = bigDecimal14.add(bigDecimal30);
        float float32 = bigDecimal30.floatValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal30 and bigDecimal14", (bigDecimal30.compareTo(bigDecimal14) == 0) == bigDecimal30.equals(bigDecimal14));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.ulp();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.TEN;
        long long5 = bigDecimal4.longValueExact();
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.ZERO;
        double double7 = bigDecimal6.doubleValue();
        java.math.BigDecimal bigDecimal9 = bigDecimal6.movePointLeft((int) (byte) -1);
        int int10 = bigDecimal9.intValue();
        java.math.BigDecimal bigDecimal11 = bigDecimal4.add(bigDecimal9);
        java.math.BigDecimal bigDecimal12 = bigDecimal0.add(bigDecimal11);
        java.math.BigDecimal bigDecimal14 = bigDecimal12.pow((int) '#');
        java.math.BigInteger bigInteger15 = bigDecimal12.toBigIntegerExact();
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal17 = bigDecimal16.negate();
        int int18 = bigDecimal17.signum();
        float float19 = bigDecimal17.floatValue();
        java.math.BigDecimal bigDecimal21 = bigDecimal17.movePointLeft(7);
        java.math.BigDecimal bigDecimal22 = bigDecimal12.multiply(bigDecimal17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal22 and bigDecimal21", (bigDecimal22.compareTo(bigDecimal21) == 0) == bigDecimal22.equals(bigDecimal21));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf((long) (-1), (int) 'u');
        java.math.BigDecimal bigDecimal3 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal4 = bigDecimal3.abs();
        java.math.BigDecimal bigDecimal5 = bigDecimal2.min(bigDecimal4);
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.valueOf((double) (-1.0f));
        int int8 = bigDecimal4.compareTo(bigDecimal7);
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal10 = bigDecimal9.negate();
        java.math.BigDecimal bigDecimal11 = bigDecimal9.negate();
        java.lang.String str12 = bigDecimal9.toString();
        java.math.BigDecimal bigDecimal14 = new java.math.BigDecimal((double) 1L);
        java.lang.Object[] objArray17 = new java.lang.Object[] { (short) 10, (short) 100 };
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(objArray17, "hi!", (int) (byte) 100, (int) (short) -1);
        boolean boolean22 = bigDecimal14.equals((java.lang.Object) (short) -1);
        java.math.BigDecimal bigDecimal23 = bigDecimal9.max(bigDecimal14);
        java.math.BigDecimal bigDecimal24 = bigDecimal23.negate();
        int int25 = bigDecimal23.intValueExact();
        java.math.BigDecimal bigDecimal26 = bigDecimal7.remainder(bigDecimal23);
        java.lang.String str27 = bigDecimal23.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal7 and bigDecimal24", (bigDecimal7.compareTo(bigDecimal24) == 0) == bigDecimal7.equals(bigDecimal24));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal0.setScale((int) (byte) 100, (int) (byte) 0);
        java.math.BigInteger bigInteger4 = bigDecimal0.toBigInteger();
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.ZERO;
        double double6 = bigDecimal5.doubleValue();
        java.math.BigInteger bigInteger7 = bigDecimal5.toBigInteger();
        java.math.BigInteger bigInteger9 = bigInteger7.setBit(4);
        java.math.BigInteger bigInteger10 = bigInteger4.gcd(bigInteger7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal3", (bigDecimal0.compareTo(bigDecimal3) == 0) == bigDecimal0.equals(bigDecimal3));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((double) 117);
        double double2 = bigDecimal1.doubleValue();
        java.math.BigDecimal bigDecimal3 = bigDecimal1.ulp();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal6 = bigDecimal4.negate();
        java.lang.String str7 = bigDecimal4.toString();
        java.math.BigDecimal bigDecimal9 = new java.math.BigDecimal((double) 1L);
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 10, (short) 100 };
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(objArray12, "hi!", (int) (byte) 100, (int) (short) -1);
        boolean boolean17 = bigDecimal9.equals((java.lang.Object) (short) -1);
        java.math.BigDecimal bigDecimal18 = bigDecimal4.max(bigDecimal9);
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.valueOf((long) (byte) -1, 0);
        java.math.BigDecimal bigDecimal22 = bigDecimal21.plus();
        java.math.BigDecimal bigDecimal23 = bigDecimal4.remainder(bigDecimal21);
        java.math.BigDecimal bigDecimal24 = bigDecimal3.add(bigDecimal23);
        java.math.BigDecimal bigDecimal26 = bigDecimal23.movePointRight((-1));
        long long27 = bigDecimal23.longValueExact();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal23 and bigDecimal26", (bigDecimal23.compareTo(bigDecimal26) == 0) == bigDecimal23.equals(bigDecimal26));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((double) (-1.0f));
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        double double3 = bigDecimal2.doubleValue();
        java.math.BigInteger bigInteger4 = bigDecimal2.toBigInteger();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray7);
        java.math.BigInteger bigInteger9 = new java.math.BigInteger((int) (short) -1, byteArray7);
        java.math.BigInteger bigInteger11 = bigInteger9.pow((int) 'a');
        byte[] byteArray12 = bigInteger9.toByteArray();
        long long13 = bigInteger9.longValueExact();
        java.math.BigInteger bigInteger14 = bigInteger4.or(bigInteger9);
        byte[] byteArray17 = new byte[] { (byte) 1 };
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray17);
        java.math.BigInteger bigInteger19 = new java.math.BigInteger((int) (short) -1, byteArray17);
        java.math.BigInteger bigInteger21 = bigInteger19.pow((int) 'a');
        byte[] byteArray22 = bigInteger19.toByteArray();
        long long23 = bigInteger19.longValueExact();
        java.lang.String str25 = bigInteger19.toString(0);
        int int26 = bigInteger19.intValueExact();
        java.math.BigInteger bigInteger27 = bigInteger14.subtract(bigInteger19);
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal29 = bigDecimal28.negate();
        java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal33 = bigDecimal29.subtract(bigDecimal32);
        java.math.BigInteger bigInteger34 = bigDecimal33.toBigInteger();
        java.math.BigInteger bigInteger35 = bigInteger34.negate();
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.ZERO;
        double double37 = bigDecimal36.doubleValue();
        java.math.BigInteger bigInteger38 = bigDecimal36.toBigInteger();
        byte[] byteArray41 = new byte[] { (byte) 1 };
        byte byte42 = org.apache.commons.lang3.math.NumberUtils.min(byteArray41);
        java.math.BigInteger bigInteger43 = new java.math.BigInteger((int) (short) -1, byteArray41);
        java.math.BigInteger bigInteger45 = bigInteger43.pow((int) 'a');
        byte[] byteArray46 = bigInteger43.toByteArray();
        long long47 = bigInteger43.longValueExact();
        java.math.BigInteger bigInteger48 = bigInteger38.or(bigInteger43);
        byte[] byteArray51 = new byte[] { (byte) 1 };
        byte byte52 = org.apache.commons.lang3.math.NumberUtils.min(byteArray51);
        java.math.BigInteger bigInteger53 = new java.math.BigInteger((int) (short) -1, byteArray51);
        java.math.BigInteger bigInteger55 = bigInteger53.pow((int) 'a');
        byte[] byteArray56 = bigInteger53.toByteArray();
        long long57 = bigInteger53.longValueExact();
        java.lang.String str59 = bigInteger53.toString(0);
        int int60 = bigInteger53.intValueExact();
        java.math.BigInteger bigInteger61 = bigInteger48.subtract(bigInteger53);
        java.math.BigInteger bigInteger62 = bigInteger34.min(bigInteger48);
        java.math.BigInteger bigInteger63 = bigInteger27.gcd(bigInteger62);
        java.math.BigDecimal bigDecimal64 = new java.math.BigDecimal(bigInteger62);
        java.lang.String str65 = bigDecimal64.toPlainString();
        int int66 = bigDecimal1.compareTo(bigDecimal64);
        java.math.BigDecimal bigDecimal67 = java.math.BigDecimal.TEN;
        long long68 = bigDecimal67.longValueExact();
        java.math.BigDecimal bigDecimal69 = bigDecimal67.ulp();
        java.lang.String str70 = bigDecimal67.toString();
        java.math.BigDecimal bigDecimal71 = java.math.BigDecimal.TEN;
        long long72 = bigDecimal71.longValueExact();
        java.math.BigDecimal bigDecimal73 = java.math.BigDecimal.ZERO;
        double double74 = bigDecimal73.doubleValue();
        java.math.BigDecimal bigDecimal76 = bigDecimal73.movePointLeft((int) (byte) -1);
        int int77 = bigDecimal76.intValue();
        java.math.BigDecimal bigDecimal78 = bigDecimal71.add(bigDecimal76);
        java.math.BigDecimal bigDecimal79 = bigDecimal67.add(bigDecimal78);
        java.math.BigDecimal bigDecimal81 = bigDecimal79.pow((int) '#');
        java.math.BigDecimal bigDecimal82 = java.math.BigDecimal.TEN;
        long long83 = bigDecimal82.longValueExact();
        java.math.BigDecimal bigDecimal84 = bigDecimal82.ulp();
        java.math.BigDecimal bigDecimal86 = bigDecimal84.movePointLeft((int) (short) 10);
        java.math.BigDecimal bigDecimal87 = bigDecimal84.plus();
        java.math.BigDecimal bigDecimal89 = bigDecimal84.movePointLeft(2);
        java.math.BigDecimal bigDecimal90 = bigDecimal79.add(bigDecimal89);
        java.math.BigDecimal[] bigDecimalArray91 = bigDecimal1.divideAndRemainder(bigDecimal79);
        short short92 = bigDecimal79.shortValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal64", (bigDecimal1.compareTo(bigDecimal64) == 0) == bigDecimal1.equals(bigDecimal64));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.negate();
        java.lang.String str5 = bigDecimal4.toEngineeringString();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal8 = bigDecimal7.negate();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal12 = bigDecimal8.subtract(bigDecimal11);
        java.math.BigInteger bigInteger13 = bigDecimal12.toBigInteger();
        java.math.BigDecimal bigDecimal14 = bigDecimal6.divideToIntegralValue(bigDecimal12);
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal16 = bigDecimal15.negate();
        java.math.BigDecimal bigDecimal17 = bigDecimal16.abs();
        int int18 = bigDecimal16.intValueExact();
        boolean boolean19 = bigDecimal14.equals((java.lang.Object) int18);
        java.math.BigDecimal bigDecimal21 = bigDecimal14.movePointLeft((int) (byte) 100);
        java.lang.Class<?> wildcardClass22 = bigDecimal21.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal14", (bigDecimal0.compareTo(bigDecimal14) == 0) == bigDecimal0.equals(bigDecimal14));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((long) (byte) 0);
        java.math.BigDecimal bigDecimal2 = bigDecimal1.stripTrailingZeros();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.setScale((int) (short) 1);
        java.lang.String str5 = bigDecimal2.toPlainString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal2 and bigDecimal4", (bigDecimal2.compareTo(bigDecimal4) == 0) == bigDecimal2.equals(bigDecimal4));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.scaleByPowerOfTen((int) 'a');
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.valueOf((long) (short) -5, (int) (short) 1);
        java.math.BigDecimal bigDecimal8 = bigDecimal2.max(bigDecimal7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal8 and bigDecimal4", (bigDecimal8.compareTo(bigDecimal4) == 0) == bigDecimal8.equals(bigDecimal4));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.TEN;
        long long3 = bigDecimal2.longValueExact();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.ulp();
        java.lang.String str5 = bigDecimal2.toString();
        int int6 = bigDecimal0.compareTo(bigDecimal2);
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal10 = bigDecimal2.divide(bigDecimal8, (int) (short) 1);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.TEN;
        long long12 = bigDecimal11.longValueExact();
        java.math.BigDecimal bigDecimal13 = bigDecimal10.max(bigDecimal11);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.TEN;
        long long15 = bigDecimal14.longValueExact();
        java.math.BigDecimal bigDecimal16 = bigDecimal14.ulp();
        java.math.BigDecimal bigDecimal17 = bigDecimal11.subtract(bigDecimal14);
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.valueOf((long) (-1), (int) 'u');
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal22 = bigDecimal21.abs();
        java.math.BigDecimal bigDecimal23 = bigDecimal20.min(bigDecimal22);
        java.math.BigDecimal bigDecimal25 = java.math.BigDecimal.valueOf((double) (-1.0f));
        int int26 = bigDecimal22.compareTo(bigDecimal25);
        java.math.BigDecimal bigDecimal27 = bigDecimal17.divide(bigDecimal25);
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal30 = bigDecimal27.max(bigDecimal29);
        int int31 = bigDecimal29.signum();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal27", (bigDecimal0.compareTo(bigDecimal27) == 0) == bigDecimal0.equals(bigDecimal27));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((double) 10L);
        java.math.BigDecimal bigDecimal3 = bigDecimal1.movePointLeft(33);
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.TEN;
        long long5 = bigDecimal4.longValueExact();
        java.math.BigDecimal bigDecimal6 = bigDecimal4.ulp();
        java.lang.String str7 = bigDecimal4.toString();
        java.math.BigDecimal bigDecimal8 = bigDecimal4.stripTrailingZeros();
        int int9 = bigDecimal4.intValueExact();
        java.math.BigDecimal bigDecimal10 = bigDecimal3.divideToIntegralValue(bigDecimal4);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal8", (bigDecimal1.compareTo(bigDecimal8) == 0) == bigDecimal1.equals(bigDecimal8));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.ulp();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal4 = bigDecimal0.stripTrailingZeros();
        java.math.BigInteger bigInteger5 = bigDecimal4.toBigInteger();
        java.lang.String str6 = bigDecimal4.toPlainString();
        byte[] byteArray8 = new byte[] { (byte) 1 };
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray8);
        java.math.BigInteger bigInteger10 = new java.math.BigInteger(byteArray8);
        java.math.BigDecimal bigDecimal11 = new java.math.BigDecimal(bigInteger10);
        int int12 = bigDecimal4.compareTo(bigDecimal11);
        java.math.BigDecimal bigDecimal14 = bigDecimal4.movePointLeft(97);
        java.math.BigDecimal bigDecimal17 = bigDecimal4.setScale((int) (short) 100, 0);
        int int18 = bigDecimal17.intValueExact();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal4", (bigDecimal0.compareTo(bigDecimal4) == 0) == bigDecimal0.equals(bigDecimal4));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.ulp();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal4 = bigDecimal0.stripTrailingZeros();
        java.math.BigInteger bigInteger5 = bigDecimal4.toBigInteger();
        java.math.BigDecimal bigDecimal6 = bigDecimal4.plus();
        int int7 = bigDecimal4.intValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal4", (bigDecimal0.compareTo(bigDecimal4) == 0) == bigDecimal0.equals(bigDecimal4));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.negate();
        java.lang.String str5 = bigDecimal4.toEngineeringString();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal8 = bigDecimal7.negate();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal12 = bigDecimal8.subtract(bigDecimal11);
        java.math.BigInteger bigInteger13 = bigDecimal12.toBigInteger();
        java.math.BigDecimal bigDecimal14 = bigDecimal6.divideToIntegralValue(bigDecimal12);
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal16 = bigDecimal15.negate();
        java.math.BigDecimal bigDecimal17 = bigDecimal16.abs();
        int int18 = bigDecimal16.intValueExact();
        boolean boolean19 = bigDecimal14.equals((java.lang.Object) int18);
        java.math.BigDecimal bigDecimal20 = bigDecimal14.plus();
        java.math.BigDecimal bigDecimal21 = bigDecimal14.negate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal14", (bigDecimal0.compareTo(bigDecimal14) == 0) == bigDecimal0.equals(bigDecimal14));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal0.setScale((int) (byte) 100, (int) (byte) 0);
        java.math.BigDecimal bigDecimal5 = bigDecimal0.scaleByPowerOfTen((-1));
        java.lang.String str6 = bigDecimal5.toEngineeringString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal3", (bigDecimal0.compareTo(bigDecimal3) == 0) == bigDecimal0.equals(bigDecimal3));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((-2.0d));
        java.math.BigInteger bigInteger2 = bigDecimal1.toBigIntegerExact();
        int int3 = bigDecimal1.scale();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal7 = bigDecimal6.negate();
        java.math.BigDecimal bigDecimal8 = bigDecimal6.negate();
        java.lang.String str9 = bigDecimal8.toEngineeringString();
        java.math.BigDecimal bigDecimal10 = bigDecimal5.multiply(bigDecimal8);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal12 = bigDecimal11.negate();
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal16 = bigDecimal12.subtract(bigDecimal15);
        java.math.BigInteger bigInteger17 = bigDecimal16.toBigInteger();
        java.math.BigDecimal bigDecimal18 = bigDecimal10.divideToIntegralValue(bigDecimal16);
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal20 = bigDecimal19.negate();
        java.math.BigDecimal bigDecimal21 = bigDecimal20.abs();
        int int22 = bigDecimal20.intValueExact();
        boolean boolean23 = bigDecimal18.equals((java.lang.Object) int22);
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal25 = bigDecimal24.negate();
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.TEN;
        long long27 = bigDecimal26.longValueExact();
        java.math.BigDecimal bigDecimal28 = bigDecimal26.ulp();
        java.lang.String str29 = bigDecimal26.toString();
        int int30 = bigDecimal24.compareTo(bigDecimal26);
        java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal34 = bigDecimal26.divide(bigDecimal32, (int) (short) 1);
        java.math.BigDecimal bigDecimal35 = bigDecimal18.add(bigDecimal34);
        java.math.BigDecimal bigDecimal36 = bigDecimal1.add(bigDecimal35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal35 and bigDecimal18", (bigDecimal35.compareTo(bigDecimal18) == 0) == bigDecimal35.equals(bigDecimal18));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        java.math.BigDecimal bigDecimal7 = bigDecimal5.negate();
        java.math.BigDecimal bigDecimal9 = bigDecimal7.scaleByPowerOfTen(301);
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.ZERO;
        double double11 = bigDecimal10.doubleValue();
        java.math.BigDecimal bigDecimal13 = bigDecimal10.movePointLeft((int) (byte) -1);
        int int14 = bigDecimal13.intValue();
        java.math.BigDecimal bigDecimal15 = bigDecimal13.stripTrailingZeros();
        int int16 = bigDecimal7.compareTo(bigDecimal13);
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal18 = bigDecimal17.negate();
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal22 = bigDecimal18.subtract(bigDecimal21);
        java.math.BigInteger bigInteger23 = bigDecimal22.toBigInteger();
        byte[] byteArray24 = bigInteger23.toByteArray();
        java.math.BigDecimal bigDecimal25 = new java.math.BigDecimal(bigInteger23);
        java.math.BigDecimal bigDecimal26 = bigDecimal13.max(bigDecimal25);
        byte byte27 = bigDecimal26.byteValueExact();
        java.math.BigDecimal bigDecimal30 = bigDecimal26.setScale(2, 2);
        java.math.BigDecimal bigDecimal32 = bigDecimal26.setScale(120);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal26 and bigDecimal30", (bigDecimal26.compareTo(bigDecimal30) == 0) == bigDecimal26.equals(bigDecimal30));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        double double3 = bigDecimal2.doubleValue();
        java.math.BigDecimal bigDecimal5 = bigDecimal2.movePointLeft((int) (byte) -1);
        int int6 = bigDecimal5.intValue();
        java.math.BigDecimal bigDecimal7 = bigDecimal0.add(bigDecimal5);
        int int8 = bigDecimal5.precision();
        java.math.BigDecimal bigDecimal10 = bigDecimal5.movePointRight(0);
        java.math.BigDecimal bigDecimal12 = bigDecimal5.pow(2);
        java.math.BigDecimal bigDecimal14 = bigDecimal5.setScale(0);
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.TEN;
        long long16 = bigDecimal15.longValueExact();
        java.math.BigDecimal bigDecimal17 = bigDecimal15.ulp();
        java.lang.String str18 = bigDecimal15.toString();
        java.math.BigDecimal bigDecimal19 = bigDecimal15.stripTrailingZeros();
        long long20 = bigDecimal15.longValue();
        java.math.BigDecimal bigDecimal21 = bigDecimal14.remainder(bigDecimal15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal15 and bigDecimal19", (bigDecimal15.compareTo(bigDecimal19) == 0) == bigDecimal15.equals(bigDecimal19));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.scaleByPowerOfTen((int) 'a');
        java.math.BigInteger bigInteger5 = bigDecimal4.unscaledValue();
        java.math.BigInteger bigInteger7 = bigInteger5.setBit(120);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal4", (bigDecimal0.compareTo(bigDecimal4) == 0) == bigDecimal0.equals(bigDecimal4));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.ulp();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.movePointLeft((int) (short) 10);
        java.math.BigDecimal bigDecimal5 = bigDecimal2.stripTrailingZeros();
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal7 = bigDecimal6.negate();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal9 = bigDecimal8.negate();
        java.math.BigDecimal bigDecimal10 = bigDecimal8.negate();
        java.lang.String str11 = bigDecimal10.toEngineeringString();
        java.math.BigDecimal bigDecimal12 = bigDecimal7.multiply(bigDecimal10);
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal14 = bigDecimal13.negate();
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal18 = bigDecimal14.subtract(bigDecimal17);
        java.math.BigInteger bigInteger19 = bigDecimal18.toBigInteger();
        java.math.BigDecimal bigDecimal20 = bigDecimal12.divideToIntegralValue(bigDecimal18);
        java.math.BigDecimal bigDecimal21 = bigDecimal2.divideToIntegralValue(bigDecimal18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal6 and bigDecimal20", (bigDecimal6.compareTo(bigDecimal20) == 0) == bigDecimal6.equals(bigDecimal20));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.ulp();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal4 = bigDecimal0.stripTrailingZeros();
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.TEN;
        long long6 = bigDecimal5.longValueExact();
        java.math.BigDecimal bigDecimal7 = bigDecimal5.ulp();
        java.lang.String str8 = bigDecimal5.toString();
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.TEN;
        long long10 = bigDecimal9.longValueExact();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.ZERO;
        double double12 = bigDecimal11.doubleValue();
        java.math.BigDecimal bigDecimal14 = bigDecimal11.movePointLeft((int) (byte) -1);
        int int15 = bigDecimal14.intValue();
        java.math.BigDecimal bigDecimal16 = bigDecimal9.add(bigDecimal14);
        java.math.BigDecimal bigDecimal17 = bigDecimal5.add(bigDecimal16);
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal19 = bigDecimal18.negate();
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal21 = bigDecimal20.negate();
        java.math.BigDecimal bigDecimal22 = bigDecimal20.negate();
        java.lang.String str23 = bigDecimal22.toEngineeringString();
        java.math.BigDecimal bigDecimal24 = bigDecimal19.multiply(bigDecimal22);
        java.math.BigDecimal bigDecimal26 = bigDecimal22.movePointRight(100);
        java.math.BigDecimal bigDecimal27 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal28 = bigDecimal27.negate();
        java.math.BigDecimal bigDecimal29 = bigDecimal27.negate();
        int int30 = bigDecimal26.compareTo(bigDecimal27);
        java.math.BigDecimal bigDecimal31 = bigDecimal5.min(bigDecimal26);
        java.math.BigDecimal bigDecimal32 = bigDecimal0.add(bigDecimal5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal4 and bigDecimal0", (bigDecimal4.compareTo(bigDecimal0) == 0) == bigDecimal4.equals(bigDecimal0));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((double) 117);
        double double2 = bigDecimal1.doubleValue();
        java.math.BigDecimal bigDecimal3 = bigDecimal1.abs();
        java.math.BigDecimal bigDecimal5 = bigDecimal1.setScale(2);
        java.math.BigDecimal bigDecimal7 = bigDecimal1.movePointRight(8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal5", (bigDecimal1.compareTo(bigDecimal5) == 0) == bigDecimal1.equals(bigDecimal5));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        java.math.BigDecimal bigDecimal7 = bigDecimal5.negate();
        java.math.BigDecimal bigDecimal9 = bigDecimal7.scaleByPowerOfTen(301);
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.ZERO;
        double double11 = bigDecimal10.doubleValue();
        java.math.BigDecimal bigDecimal13 = bigDecimal10.movePointLeft((int) (byte) -1);
        int int14 = bigDecimal13.intValue();
        java.math.BigDecimal bigDecimal15 = bigDecimal13.stripTrailingZeros();
        int int16 = bigDecimal7.compareTo(bigDecimal13);
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal18 = bigDecimal17.negate();
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal22 = bigDecimal18.subtract(bigDecimal21);
        java.math.BigInteger bigInteger23 = bigDecimal22.toBigInteger();
        byte[] byteArray24 = bigInteger23.toByteArray();
        java.math.BigDecimal bigDecimal25 = new java.math.BigDecimal(bigInteger23);
        java.math.BigDecimal bigDecimal26 = bigDecimal13.max(bigDecimal25);
        java.math.BigDecimal bigDecimal28 = bigDecimal25.movePointLeft(3);
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.TEN;
        long long30 = bigDecimal29.longValueExact();
        int int31 = bigDecimal29.intValue();
        java.math.BigDecimal bigDecimal33 = bigDecimal29.scaleByPowerOfTen(0);
        java.math.BigDecimal bigDecimal34 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal35 = bigDecimal34.negate();
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal39 = bigDecimal35.subtract(bigDecimal38);
        java.math.BigDecimal bigDecimal40 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal41 = bigDecimal38.min(bigDecimal40);
        java.lang.String str42 = bigDecimal41.toPlainString();
        java.math.BigDecimal bigDecimal43 = bigDecimal29.subtract(bigDecimal41);
        java.math.BigDecimal bigDecimal44 = bigDecimal29.plus();
        int int45 = bigDecimal25.compareTo(bigDecimal29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal28", (bigDecimal0.compareTo(bigDecimal28) == 0) == bigDecimal0.equals(bigDecimal28));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.negate();
        java.lang.String str5 = bigDecimal4.toEngineeringString();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal8 = bigDecimal4.movePointRight(100);
        byte[] byteArray11 = new byte[] { (byte) 1 };
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray11);
        java.math.BigInteger bigInteger13 = new java.math.BigInteger((int) (short) -1, byteArray11);
        java.math.BigInteger bigInteger15 = bigInteger13.pow((int) 'a');
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(bigInteger15, (int) (byte) 0);
        java.util.Locale locale18 = java.util.Locale.PRC;
        java.lang.String str19 = locale18.getISO3Language();
        boolean boolean20 = bigDecimal17.equals((java.lang.Object) str19);
        java.math.BigDecimal bigDecimal23 = bigDecimal4.divide(bigDecimal17, (int) (short) 100, (int) (short) 1);
        java.math.BigDecimal bigDecimal25 = bigDecimal4.movePointLeft(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal4 and bigDecimal23", (bigDecimal4.compareTo(bigDecimal23) == 0) == bigDecimal4.equals(bigDecimal23));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.lang.String str6 = bigDecimal1.toPlainString();
        java.lang.String str7 = bigDecimal1.toPlainString();
        int int8 = bigDecimal1.signum();
        java.math.BigDecimal bigDecimal9 = bigDecimal1.ulp();
        java.math.BigDecimal bigDecimal11 = bigDecimal1.scaleByPowerOfTen(301);
        java.lang.String str12 = bigDecimal1.toEngineeringString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal11", (bigDecimal1.compareTo(bigDecimal11) == 0) == bigDecimal1.equals(bigDecimal11));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.math.BigInteger bigInteger4 = new java.math.BigInteger((int) (short) -1, byteArray2);
        java.math.BigInteger bigInteger5 = new java.math.BigInteger(byteArray2);
        java.math.BigInteger bigInteger6 = new java.math.BigInteger(byteArray2);
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal8 = bigDecimal7.negate();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal12 = bigDecimal8.subtract(bigDecimal11);
        java.math.BigInteger bigInteger13 = bigDecimal12.toBigInteger();
        double double14 = bigInteger13.doubleValue();
        byte[] byteArray17 = new byte[] { (byte) 1 };
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray17);
        java.math.BigInteger bigInteger19 = new java.math.BigInteger((int) (short) -1, byteArray17);
        java.math.BigInteger bigInteger20 = bigInteger13.gcd(bigInteger19);
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal22 = bigDecimal21.negate();
        java.math.BigDecimal bigDecimal25 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal26 = bigDecimal22.subtract(bigDecimal25);
        java.math.BigInteger bigInteger27 = bigDecimal26.toBigInteger();
        java.math.BigInteger bigInteger28 = bigInteger19.or(bigInteger27);
        double double29 = bigInteger28.doubleValue();
        java.math.BigInteger bigInteger30 = bigInteger6.divide(bigInteger28);
        java.math.BigInteger bigInteger32 = bigInteger28.pow(3);
        java.math.BigDecimal bigDecimal33 = new java.math.BigDecimal(bigInteger28);
        int int34 = bigDecimal33.signum();
        java.math.BigDecimal bigDecimal35 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal36 = bigDecimal35.negate();
        java.math.BigDecimal bigDecimal37 = java.math.BigDecimal.TEN;
        long long38 = bigDecimal37.longValueExact();
        java.math.BigDecimal bigDecimal39 = bigDecimal37.ulp();
        java.lang.String str40 = bigDecimal37.toString();
        int int41 = bigDecimal35.compareTo(bigDecimal37);
        java.math.BigDecimal bigDecimal43 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal45 = bigDecimal37.divide(bigDecimal43, (int) (short) 1);
        java.math.BigDecimal bigDecimal46 = java.math.BigDecimal.TEN;
        long long47 = bigDecimal46.longValueExact();
        java.math.BigDecimal bigDecimal48 = bigDecimal45.max(bigDecimal46);
        java.math.BigDecimal bigDecimal49 = java.math.BigDecimal.TEN;
        long long50 = bigDecimal49.longValueExact();
        java.math.BigDecimal bigDecimal51 = bigDecimal49.ulp();
        java.math.BigDecimal bigDecimal52 = bigDecimal46.subtract(bigDecimal49);
        double double53 = bigDecimal49.doubleValue();
        java.math.BigDecimal bigDecimal54 = java.math.BigDecimal.TEN;
        long long55 = bigDecimal54.longValueExact();
        java.math.BigDecimal bigDecimal56 = bigDecimal54.ulp();
        java.lang.String str57 = bigDecimal54.toString();
        java.math.BigDecimal bigDecimal58 = bigDecimal54.stripTrailingZeros();
        java.math.BigInteger bigInteger59 = bigDecimal58.toBigInteger();
        java.math.BigDecimal[] bigDecimalArray60 = bigDecimal49.divideAndRemainder(bigDecimal58);
        java.math.BigDecimal bigDecimal62 = bigDecimal58.pow((int) (short) 1);
        java.math.BigDecimal bigDecimal63 = bigDecimal33.min(bigDecimal62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal37 and bigDecimal58", (bigDecimal37.compareTo(bigDecimal58) == 0) == bigDecimal37.equals(bigDecimal58));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigDecimal bigDecimal3 = bigDecimal0.movePointLeft((int) (byte) -1);
        java.math.BigDecimal bigDecimal5 = bigDecimal0.movePointRight((int) (short) 1);
        java.math.BigDecimal bigDecimal7 = bigDecimal5.movePointLeft((int) '4');
        java.math.BigDecimal bigDecimal8 = bigDecimal5.plus();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal8 and bigDecimal7", (bigDecimal8.compareTo(bigDecimal7) == 0) == bigDecimal8.equals(bigDecimal7));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf((long) (-1), (int) 'u');
        java.math.BigDecimal bigDecimal3 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal4 = bigDecimal3.abs();
        java.math.BigDecimal bigDecimal5 = bigDecimal2.min(bigDecimal4);
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.valueOf((double) (-1.0f));
        int int8 = bigDecimal4.compareTo(bigDecimal7);
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal10 = bigDecimal9.negate();
        java.math.BigDecimal bigDecimal11 = bigDecimal9.negate();
        java.lang.String str12 = bigDecimal9.toString();
        java.math.BigDecimal bigDecimal14 = new java.math.BigDecimal((double) 1L);
        java.lang.Object[] objArray17 = new java.lang.Object[] { (short) 10, (short) 100 };
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(objArray17, "hi!", (int) (byte) 100, (int) (short) -1);
        boolean boolean22 = bigDecimal14.equals((java.lang.Object) (short) -1);
        java.math.BigDecimal bigDecimal23 = bigDecimal9.max(bigDecimal14);
        java.math.BigDecimal bigDecimal24 = bigDecimal23.negate();
        int int25 = bigDecimal23.intValueExact();
        java.math.BigDecimal bigDecimal26 = bigDecimal7.remainder(bigDecimal23);
        float float27 = bigDecimal26.floatValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal7 and bigDecimal24", (bigDecimal7.compareTo(bigDecimal24) == 0) == bigDecimal7.equals(bigDecimal24));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        int int2 = bigDecimal0.intValue();
        java.math.BigDecimal bigDecimal4 = bigDecimal0.scaleByPowerOfTen(0);
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal6 = bigDecimal5.negate();
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal10 = bigDecimal6.subtract(bigDecimal9);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal12 = bigDecimal9.min(bigDecimal11);
        java.lang.String str13 = bigDecimal12.toPlainString();
        java.math.BigDecimal bigDecimal14 = bigDecimal0.subtract(bigDecimal12);
        int int15 = bigDecimal12.scale();
        java.math.BigDecimal bigDecimal16 = bigDecimal12.abs();
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal18 = bigDecimal17.negate();
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.TEN;
        long long20 = bigDecimal19.longValueExact();
        java.math.BigDecimal bigDecimal21 = bigDecimal19.ulp();
        java.lang.String str22 = bigDecimal19.toString();
        int int23 = bigDecimal17.compareTo(bigDecimal19);
        short short24 = bigDecimal17.shortValueExact();
        java.math.BigDecimal bigDecimal26 = bigDecimal17.scaleByPowerOfTen((-1));
        int int27 = bigDecimal12.compareTo(bigDecimal26);
        java.math.BigDecimal bigDecimal28 = bigDecimal12.plus();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal5 and bigDecimal26", (bigDecimal5.compareTo(bigDecimal26) == 0) == bigDecimal5.equals(bigDecimal26));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.TEN;
        long long3 = bigDecimal2.longValueExact();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.ulp();
        java.lang.String str5 = bigDecimal2.toString();
        int int6 = bigDecimal0.compareTo(bigDecimal2);
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal10 = bigDecimal2.divide(bigDecimal8, (int) (short) 1);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.TEN;
        long long12 = bigDecimal11.longValueExact();
        java.math.BigDecimal bigDecimal13 = bigDecimal10.max(bigDecimal11);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.TEN;
        long long15 = bigDecimal14.longValueExact();
        java.math.BigDecimal bigDecimal16 = bigDecimal14.ulp();
        java.math.BigDecimal bigDecimal17 = bigDecimal11.subtract(bigDecimal14);
        double double18 = bigDecimal14.doubleValue();
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.TEN;
        long long20 = bigDecimal19.longValueExact();
        java.math.BigDecimal bigDecimal21 = bigDecimal19.ulp();
        java.lang.String str22 = bigDecimal19.toString();
        java.math.BigDecimal bigDecimal23 = bigDecimal19.stripTrailingZeros();
        java.math.BigInteger bigInteger24 = bigDecimal23.toBigInteger();
        java.math.BigDecimal[] bigDecimalArray25 = bigDecimal14.divideAndRemainder(bigDecimal23);
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal27 = bigDecimal26.negate();
        java.math.BigDecimal bigDecimal28 = bigDecimal26.negate();
        java.lang.String str29 = bigDecimal26.toString();
        java.math.BigDecimal bigDecimal31 = new java.math.BigDecimal((double) 1L);
        java.lang.Object[] objArray34 = new java.lang.Object[] { (short) 10, (short) 100 };
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.join(objArray34, "hi!", (int) (byte) 100, (int) (short) -1);
        boolean boolean39 = bigDecimal31.equals((java.lang.Object) (short) -1);
        java.math.BigDecimal bigDecimal40 = bigDecimal26.max(bigDecimal31);
        java.math.BigDecimal bigDecimal41 = bigDecimal23.max(bigDecimal26);
        java.math.BigInteger bigInteger42 = bigDecimal41.toBigIntegerExact();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal2 and bigDecimal41", (bigDecimal2.compareTo(bigDecimal41) == 0) == bigDecimal2.equals(bigDecimal41));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.negate();
        java.lang.String str5 = bigDecimal4.toEngineeringString();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal8 = bigDecimal4.movePointRight(100);
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal10 = bigDecimal9.negate();
        java.math.BigDecimal bigDecimal11 = bigDecimal9.negate();
        int int12 = bigDecimal8.compareTo(bigDecimal9);
        java.math.BigDecimal bigDecimal14 = bigDecimal8.movePointLeft(0);
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.valueOf((double) (-1.0f));
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.ZERO;
        double double18 = bigDecimal17.doubleValue();
        java.math.BigInteger bigInteger19 = bigDecimal17.toBigInteger();
        byte[] byteArray22 = new byte[] { (byte) 1 };
        byte byte23 = org.apache.commons.lang3.math.NumberUtils.min(byteArray22);
        java.math.BigInteger bigInteger24 = new java.math.BigInteger((int) (short) -1, byteArray22);
        java.math.BigInteger bigInteger26 = bigInteger24.pow((int) 'a');
        byte[] byteArray27 = bigInteger24.toByteArray();
        long long28 = bigInteger24.longValueExact();
        java.math.BigInteger bigInteger29 = bigInteger19.or(bigInteger24);
        byte[] byteArray32 = new byte[] { (byte) 1 };
        byte byte33 = org.apache.commons.lang3.math.NumberUtils.min(byteArray32);
        java.math.BigInteger bigInteger34 = new java.math.BigInteger((int) (short) -1, byteArray32);
        java.math.BigInteger bigInteger36 = bigInteger34.pow((int) 'a');
        byte[] byteArray37 = bigInteger34.toByteArray();
        long long38 = bigInteger34.longValueExact();
        java.lang.String str40 = bigInteger34.toString(0);
        int int41 = bigInteger34.intValueExact();
        java.math.BigInteger bigInteger42 = bigInteger29.subtract(bigInteger34);
        java.math.BigDecimal bigDecimal43 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal44 = bigDecimal43.negate();
        java.math.BigDecimal bigDecimal47 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal48 = bigDecimal44.subtract(bigDecimal47);
        java.math.BigInteger bigInteger49 = bigDecimal48.toBigInteger();
        java.math.BigInteger bigInteger50 = bigInteger49.negate();
        java.math.BigDecimal bigDecimal51 = java.math.BigDecimal.ZERO;
        double double52 = bigDecimal51.doubleValue();
        java.math.BigInteger bigInteger53 = bigDecimal51.toBigInteger();
        byte[] byteArray56 = new byte[] { (byte) 1 };
        byte byte57 = org.apache.commons.lang3.math.NumberUtils.min(byteArray56);
        java.math.BigInteger bigInteger58 = new java.math.BigInteger((int) (short) -1, byteArray56);
        java.math.BigInteger bigInteger60 = bigInteger58.pow((int) 'a');
        byte[] byteArray61 = bigInteger58.toByteArray();
        long long62 = bigInteger58.longValueExact();
        java.math.BigInteger bigInteger63 = bigInteger53.or(bigInteger58);
        byte[] byteArray66 = new byte[] { (byte) 1 };
        byte byte67 = org.apache.commons.lang3.math.NumberUtils.min(byteArray66);
        java.math.BigInteger bigInteger68 = new java.math.BigInteger((int) (short) -1, byteArray66);
        java.math.BigInteger bigInteger70 = bigInteger68.pow((int) 'a');
        byte[] byteArray71 = bigInteger68.toByteArray();
        long long72 = bigInteger68.longValueExact();
        java.lang.String str74 = bigInteger68.toString(0);
        int int75 = bigInteger68.intValueExact();
        java.math.BigInteger bigInteger76 = bigInteger63.subtract(bigInteger68);
        java.math.BigInteger bigInteger77 = bigInteger49.min(bigInteger63);
        java.math.BigInteger bigInteger78 = bigInteger42.gcd(bigInteger77);
        java.math.BigDecimal bigDecimal79 = new java.math.BigDecimal(bigInteger77);
        java.lang.String str80 = bigDecimal79.toPlainString();
        int int81 = bigDecimal16.compareTo(bigDecimal79);
        int int82 = bigDecimal8.compareTo(bigDecimal79);
        int int83 = bigDecimal8.scale();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal16 and bigDecimal79", (bigDecimal16.compareTo(bigDecimal79) == 0) == bigDecimal16.equals(bigDecimal79));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal3 = bigDecimal1.min(bigDecimal2);
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal9 = bigDecimal5.subtract(bigDecimal8);
        java.math.BigDecimal[] bigDecimalArray10 = bigDecimal2.divideAndRemainder(bigDecimal8);
        java.math.BigDecimal bigDecimal11 = bigDecimal8.plus();
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal13 = bigDecimal12.negate();
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.TEN;
        long long15 = bigDecimal14.longValueExact();
        java.math.BigDecimal bigDecimal16 = bigDecimal14.ulp();
        java.lang.String str17 = bigDecimal14.toString();
        int int18 = bigDecimal12.compareTo(bigDecimal14);
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal22 = bigDecimal14.divide(bigDecimal20, (int) (short) 1);
        java.math.BigDecimal bigDecimal23 = bigDecimal11.multiply(bigDecimal22);
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.TEN;
        long long25 = bigDecimal24.longValueExact();
        java.math.BigDecimal bigDecimal26 = bigDecimal24.ulp();
        java.lang.String str27 = bigDecimal24.toString();
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.TEN;
        long long29 = bigDecimal28.longValueExact();
        java.math.BigDecimal bigDecimal30 = java.math.BigDecimal.ZERO;
        double double31 = bigDecimal30.doubleValue();
        java.math.BigDecimal bigDecimal33 = bigDecimal30.movePointLeft((int) (byte) -1);
        int int34 = bigDecimal33.intValue();
        java.math.BigDecimal bigDecimal35 = bigDecimal28.add(bigDecimal33);
        java.math.BigDecimal bigDecimal36 = bigDecimal24.add(bigDecimal35);
        java.math.BigDecimal bigDecimal37 = bigDecimal22.add(bigDecimal36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal22 and bigDecimal23", (bigDecimal22.compareTo(bigDecimal23) == 0) == bigDecimal22.equals(bigDecimal23));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal3 = bigDecimal1.min(bigDecimal2);
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal9 = bigDecimal5.subtract(bigDecimal8);
        java.math.BigDecimal[] bigDecimalArray10 = bigDecimal2.divideAndRemainder(bigDecimal8);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal12 = bigDecimal11.negate();
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal16 = bigDecimal12.subtract(bigDecimal15);
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal18 = bigDecimal15.min(bigDecimal17);
        java.math.BigDecimal bigDecimal19 = bigDecimal8.divideToIntegralValue(bigDecimal18);
        java.lang.String str20 = bigDecimal18.toEngineeringString();
        long long21 = bigDecimal18.longValue();
        byte[] byteArray24 = new byte[] { (byte) 1 };
        byte byte25 = org.apache.commons.lang3.math.NumberUtils.min(byteArray24);
        java.math.BigInteger bigInteger26 = new java.math.BigInteger((int) (short) -1, byteArray24);
        java.math.BigInteger bigInteger28 = bigInteger26.pow((int) 'a');
        java.math.BigInteger bigInteger30 = bigInteger26.shiftLeft((int) (short) 1);
        java.math.BigDecimal bigDecimal32 = new java.math.BigDecimal(bigInteger26, 34);
        java.math.BigDecimal bigDecimal35 = bigDecimal18.divide(bigDecimal32, 100, 7);
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal37 = bigDecimal36.negate();
        java.math.BigDecimal bigDecimal40 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal41 = bigDecimal37.subtract(bigDecimal40);
        java.lang.String str42 = bigDecimal37.toPlainString();
        java.math.BigDecimal bigDecimal43 = java.math.BigDecimal.ZERO;
        double double44 = bigDecimal43.doubleValue();
        java.math.BigDecimal bigDecimal46 = bigDecimal43.movePointLeft((int) (byte) -1);
        java.math.BigInteger bigInteger47 = bigDecimal43.unscaledValue();
        long long48 = bigDecimal43.longValue();
        java.math.BigDecimal bigDecimal49 = bigDecimal37.subtract(bigDecimal43);
        java.math.BigDecimal bigDecimal50 = bigDecimal18.add(bigDecimal49);
        java.math.BigDecimal bigDecimal51 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal52 = bigDecimal51.negate();
        java.math.BigDecimal bigDecimal55 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal56 = bigDecimal52.subtract(bigDecimal55);
        java.math.BigInteger bigInteger57 = bigDecimal56.toBigInteger();
        double double58 = bigInteger57.doubleValue();
        byte byte59 = bigInteger57.byteValueExact();
        java.math.BigDecimal bigDecimal61 = new java.math.BigDecimal(bigInteger57, (int) (byte) -1);
        java.math.BigDecimal bigDecimal62 = bigDecimal49.multiply(bigDecimal61);
        byte byte63 = bigDecimal61.byteValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal62", (bigDecimal0.compareTo(bigDecimal62) == 0) == bigDecimal0.equals(bigDecimal62));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.negate();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal5 = new java.math.BigDecimal((double) 1L);
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 10, (short) 100 };
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(objArray8, "hi!", (int) (byte) 100, (int) (short) -1);
        boolean boolean13 = bigDecimal5.equals((java.lang.Object) (short) -1);
        java.math.BigDecimal bigDecimal14 = bigDecimal0.max(bigDecimal5);
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.valueOf((long) (byte) -1, 0);
        java.math.BigDecimal bigDecimal18 = bigDecimal17.plus();
        java.math.BigDecimal bigDecimal19 = bigDecimal0.remainder(bigDecimal17);
        java.math.BigInteger bigInteger20 = bigDecimal0.toBigIntegerExact();
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.valueOf(301L);
        java.math.BigDecimal bigDecimal24 = bigDecimal22.movePointLeft((int) (byte) -1);
        java.lang.String str25 = bigDecimal24.toEngineeringString();
        java.math.BigDecimal bigDecimal26 = bigDecimal0.add(bigDecimal24);
        java.math.BigDecimal bigDecimal27 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal28 = bigDecimal27.negate();
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal30 = bigDecimal29.negate();
        java.math.BigDecimal bigDecimal31 = bigDecimal29.negate();
        java.lang.String str32 = bigDecimal31.toEngineeringString();
        java.math.BigDecimal bigDecimal33 = bigDecimal28.multiply(bigDecimal31);
        java.math.BigDecimal bigDecimal34 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal35 = bigDecimal34.negate();
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal39 = bigDecimal35.subtract(bigDecimal38);
        java.math.BigInteger bigInteger40 = bigDecimal39.toBigInteger();
        java.math.BigDecimal bigDecimal41 = bigDecimal33.divideToIntegralValue(bigDecimal39);
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal43 = bigDecimal42.negate();
        java.math.BigDecimal bigDecimal44 = bigDecimal43.abs();
        int int45 = bigDecimal43.intValueExact();
        boolean boolean46 = bigDecimal41.equals((java.lang.Object) int45);
        java.math.BigDecimal bigDecimal47 = bigDecimal41.plus();
        int int48 = bigDecimal0.compareTo(bigDecimal47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal47", (bigDecimal0.compareTo(bigDecimal47) == 0) == bigDecimal0.equals(bigDecimal47));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.TEN;
        long long3 = bigDecimal2.longValueExact();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.ulp();
        java.lang.String str5 = bigDecimal2.toString();
        int int6 = bigDecimal0.compareTo(bigDecimal2);
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal10 = bigDecimal2.divide(bigDecimal8, (int) (short) 1);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.TEN;
        long long12 = bigDecimal11.longValueExact();
        java.math.BigDecimal bigDecimal13 = bigDecimal10.max(bigDecimal11);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.TEN;
        long long15 = bigDecimal14.longValueExact();
        java.math.BigDecimal bigDecimal16 = bigDecimal14.ulp();
        java.math.BigDecimal bigDecimal17 = bigDecimal11.subtract(bigDecimal14);
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.valueOf((long) (-1), (int) 'u');
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal22 = bigDecimal21.abs();
        java.math.BigDecimal bigDecimal23 = bigDecimal20.min(bigDecimal22);
        java.math.BigDecimal bigDecimal25 = java.math.BigDecimal.valueOf((double) (-1.0f));
        int int26 = bigDecimal22.compareTo(bigDecimal25);
        java.math.BigDecimal bigDecimal27 = bigDecimal17.divide(bigDecimal25);
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal30 = bigDecimal27.max(bigDecimal29);
        java.math.BigDecimal bigDecimal31 = bigDecimal30.ulp();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal27", (bigDecimal0.compareTo(bigDecimal27) == 0) == bigDecimal0.equals(bigDecimal27));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.negate();
        java.lang.String str5 = bigDecimal4.toEngineeringString();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal8 = bigDecimal4.movePointRight(100);
        byte[] byteArray11 = new byte[] { (byte) 1 };
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray11);
        java.math.BigInteger bigInteger13 = new java.math.BigInteger((int) (short) -1, byteArray11);
        java.math.BigInteger bigInteger15 = bigInteger13.pow((int) 'a');
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(bigInteger15, (int) (byte) 0);
        java.util.Locale locale18 = java.util.Locale.PRC;
        java.lang.String str19 = locale18.getISO3Language();
        boolean boolean20 = bigDecimal17.equals((java.lang.Object) str19);
        java.math.BigDecimal bigDecimal23 = bigDecimal4.divide(bigDecimal17, (int) (short) 100, (int) (short) 1);
        long long24 = bigDecimal23.longValue();
        java.math.BigDecimal bigDecimal25 = bigDecimal23.ulp();
        java.math.BigDecimal bigDecimal26 = bigDecimal25.abs();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal23", (bigDecimal0.compareTo(bigDecimal23) == 0) == bigDecimal0.equals(bigDecimal23));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.negate();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal5 = new java.math.BigDecimal((double) 1L);
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) 10, (short) 100 };
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(objArray8, "hi!", (int) (byte) 100, (int) (short) -1);
        boolean boolean13 = bigDecimal5.equals((java.lang.Object) (short) -1);
        java.math.BigDecimal bigDecimal14 = bigDecimal0.max(bigDecimal5);
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal16 = bigDecimal15.negate();
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal20 = bigDecimal16.subtract(bigDecimal19);
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal22 = bigDecimal19.min(bigDecimal21);
        java.math.BigDecimal bigDecimal24 = bigDecimal22.movePointRight((int) (short) -2);
        java.math.BigDecimal bigDecimal25 = bigDecimal0.min(bigDecimal22);
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal27 = bigDecimal26.negate();
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal29 = bigDecimal28.negate();
        java.math.BigDecimal bigDecimal30 = bigDecimal28.negate();
        java.lang.String str31 = bigDecimal30.toEngineeringString();
        java.math.BigDecimal bigDecimal32 = bigDecimal27.multiply(bigDecimal30);
        java.math.BigDecimal bigDecimal33 = bigDecimal0.subtract(bigDecimal30);
        java.math.BigDecimal bigDecimal35 = bigDecimal33.setScale((int) (byte) 1);
        java.math.BigDecimal bigDecimal37 = bigDecimal33.movePointLeft((int) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal33 and bigDecimal35", (bigDecimal33.compareTo(bigDecimal35) == 0) == bigDecimal33.equals(bigDecimal35));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        java.math.BigDecimal bigDecimal7 = bigDecimal5.negate();
        java.math.BigDecimal bigDecimal9 = bigDecimal7.scaleByPowerOfTen(301);
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.ZERO;
        double double11 = bigDecimal10.doubleValue();
        java.math.BigDecimal bigDecimal13 = bigDecimal10.movePointLeft((int) (byte) -1);
        int int14 = bigDecimal13.intValue();
        java.math.BigDecimal bigDecimal15 = bigDecimal13.stripTrailingZeros();
        int int16 = bigDecimal7.compareTo(bigDecimal13);
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal18 = bigDecimal17.negate();
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal22 = bigDecimal18.subtract(bigDecimal21);
        java.math.BigInteger bigInteger23 = bigDecimal22.toBigInteger();
        byte[] byteArray24 = bigInteger23.toByteArray();
        java.math.BigDecimal bigDecimal25 = new java.math.BigDecimal(bigInteger23);
        java.math.BigDecimal bigDecimal26 = bigDecimal13.max(bigDecimal25);
        byte byte27 = bigDecimal26.byteValueExact();
        java.math.BigDecimal bigDecimal30 = bigDecimal26.setScale(2, 2);
        java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.valueOf(10L);
        long long33 = bigDecimal32.longValueExact();
        int int34 = bigDecimal32.precision();
        java.math.BigDecimal bigDecimal35 = bigDecimal30.divideToIntegralValue(bigDecimal32);
        int int36 = bigDecimal35.signum();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal35", (bigDecimal0.compareTo(bigDecimal35) == 0) == bigDecimal0.equals(bigDecimal35));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.negate();
        java.lang.String str5 = bigDecimal4.toEngineeringString();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal8 = bigDecimal7.negate();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal12 = bigDecimal8.subtract(bigDecimal11);
        java.math.BigInteger bigInteger13 = bigDecimal12.toBigInteger();
        java.math.BigDecimal bigDecimal14 = bigDecimal6.divideToIntegralValue(bigDecimal12);
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal16 = bigDecimal15.negate();
        java.math.BigDecimal bigDecimal17 = bigDecimal16.abs();
        int int18 = bigDecimal16.intValueExact();
        boolean boolean19 = bigDecimal14.equals((java.lang.Object) int18);
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal21 = bigDecimal20.negate();
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.TEN;
        long long23 = bigDecimal22.longValueExact();
        java.math.BigDecimal bigDecimal24 = bigDecimal22.ulp();
        java.lang.String str25 = bigDecimal22.toString();
        int int26 = bigDecimal20.compareTo(bigDecimal22);
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal30 = bigDecimal22.divide(bigDecimal28, (int) (short) 1);
        java.math.BigDecimal bigDecimal31 = bigDecimal14.add(bigDecimal30);
        long long32 = bigDecimal31.longValueExact();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal31 and bigDecimal14", (bigDecimal31.compareTo(bigDecimal14) == 0) == bigDecimal31.equals(bigDecimal14));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((long) (byte) 0);
        java.math.BigDecimal bigDecimal2 = bigDecimal1.stripTrailingZeros();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.setScale((int) (short) 1);
        int int5 = bigDecimal2.signum();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal2 and bigDecimal4", (bigDecimal2.compareTo(bigDecimal4) == 0) == bigDecimal2.equals(bigDecimal4));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal3 = bigDecimal1.min(bigDecimal2);
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal9 = bigDecimal5.subtract(bigDecimal8);
        java.math.BigDecimal[] bigDecimalArray10 = bigDecimal2.divideAndRemainder(bigDecimal8);
        java.math.BigDecimal bigDecimal11 = bigDecimal8.plus();
        java.math.BigDecimal bigDecimal13 = bigDecimal11.movePointLeft(0);
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.valueOf((double) 117);
        double double16 = bigDecimal15.doubleValue();
        java.math.BigDecimal bigDecimal17 = bigDecimal15.ulp();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal19 = bigDecimal18.negate();
        java.math.BigDecimal bigDecimal20 = bigDecimal18.negate();
        java.lang.String str21 = bigDecimal18.toString();
        java.math.BigDecimal bigDecimal23 = new java.math.BigDecimal((double) 1L);
        java.lang.Object[] objArray26 = new java.lang.Object[] { (short) 10, (short) 100 };
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.join(objArray26, "hi!", (int) (byte) 100, (int) (short) -1);
        boolean boolean31 = bigDecimal23.equals((java.lang.Object) (short) -1);
        java.math.BigDecimal bigDecimal32 = bigDecimal18.max(bigDecimal23);
        java.math.BigDecimal bigDecimal35 = java.math.BigDecimal.valueOf((long) (byte) -1, 0);
        java.math.BigDecimal bigDecimal36 = bigDecimal35.plus();
        java.math.BigDecimal bigDecimal37 = bigDecimal18.remainder(bigDecimal35);
        java.math.BigDecimal bigDecimal38 = bigDecimal17.add(bigDecimal37);
        java.math.BigDecimal bigDecimal40 = bigDecimal37.movePointRight((-1));
        java.math.BigDecimal bigDecimal41 = bigDecimal11.subtract(bigDecimal37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal37 and bigDecimal40", (bigDecimal37.compareTo(bigDecimal40) == 0) == bigDecimal37.equals(bigDecimal40));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal2 = bigDecimal0.movePointLeft((int) (byte) 0);
        java.lang.String str3 = bigDecimal2.toPlainString();
        java.math.BigDecimal bigDecimal5 = bigDecimal2.scaleByPowerOfTen(34);
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal7 = bigDecimal6.negate();
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal11 = bigDecimal7.subtract(bigDecimal10);
        java.math.BigInteger bigInteger12 = bigDecimal11.toBigInteger();
        double double13 = bigInteger12.doubleValue();
        byte[] byteArray16 = new byte[] { (byte) 1 };
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray16);
        java.math.BigInteger bigInteger18 = new java.math.BigInteger((int) (short) -1, byteArray16);
        java.math.BigInteger bigInteger19 = bigInteger12.gcd(bigInteger18);
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal21 = bigDecimal20.negate();
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal25 = bigDecimal21.subtract(bigDecimal24);
        java.math.BigInteger bigInteger26 = bigDecimal25.toBigInteger();
        java.math.BigInteger bigInteger27 = bigInteger18.or(bigInteger26);
        short short28 = bigInteger18.shortValueExact();
        byte[] byteArray31 = new byte[] { (byte) 1 };
        byte byte32 = org.apache.commons.lang3.math.NumberUtils.min(byteArray31);
        java.math.BigInteger bigInteger33 = new java.math.BigInteger((int) (short) -1, byteArray31);
        java.math.BigInteger bigInteger35 = bigInteger33.pow((int) 'a');
        java.math.BigInteger bigInteger37 = bigInteger33.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger38 = bigInteger18.xor(bigInteger37);
        java.math.BigInteger bigInteger40 = bigInteger37.clearBit(4);
        double double41 = bigInteger37.doubleValue();
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal43 = bigDecimal42.negate();
        java.math.BigDecimal bigDecimal46 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal47 = bigDecimal43.subtract(bigDecimal46);
        java.math.BigInteger bigInteger48 = bigDecimal47.toBigInteger();
        double double49 = bigInteger48.doubleValue();
        byte[] byteArray52 = new byte[] { (byte) 1 };
        byte byte53 = org.apache.commons.lang3.math.NumberUtils.min(byteArray52);
        java.math.BigInteger bigInteger54 = new java.math.BigInteger((int) (short) -1, byteArray52);
        java.math.BigInteger bigInteger55 = bigInteger48.gcd(bigInteger54);
        java.math.BigDecimal bigDecimal56 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal57 = bigDecimal56.negate();
        java.math.BigDecimal bigDecimal60 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal61 = bigDecimal57.subtract(bigDecimal60);
        java.math.BigInteger bigInteger62 = bigDecimal61.toBigInteger();
        java.math.BigInteger bigInteger63 = bigInteger54.or(bigInteger62);
        byte[] byteArray64 = bigInteger63.toByteArray();
        byte[] byteArray66 = new byte[] { (byte) 1 };
        byte byte67 = org.apache.commons.lang3.math.NumberUtils.min(byteArray66);
        java.math.BigInteger bigInteger68 = new java.math.BigInteger(byteArray66);
        java.math.BigDecimal bigDecimal69 = new java.math.BigDecimal(bigInteger68);
        short short70 = bigInteger68.shortValueExact();
        int int71 = bigInteger68.bitLength();
        java.math.BigInteger[] bigIntegerArray72 = bigInteger63.divideAndRemainder(bigInteger68);
        java.math.BigDecimal bigDecimal73 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal74 = bigDecimal73.negate();
        java.math.BigDecimal bigDecimal77 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal78 = bigDecimal74.subtract(bigDecimal77);
        java.math.BigInteger bigInteger79 = bigDecimal78.toBigInteger();
        double double80 = bigInteger79.doubleValue();
        byte[] byteArray83 = new byte[] { (byte) 1 };
        byte byte84 = org.apache.commons.lang3.math.NumberUtils.min(byteArray83);
        java.math.BigInteger bigInteger85 = new java.math.BigInteger((int) (short) -1, byteArray83);
        java.math.BigInteger bigInteger86 = bigInteger79.gcd(bigInteger85);
        java.math.BigInteger bigInteger87 = bigInteger68.andNot(bigInteger85);
        java.math.BigInteger bigInteger88 = bigInteger37.xor(bigInteger85);
        boolean boolean89 = bigDecimal5.equals((java.lang.Object) bigInteger37);
        java.math.BigDecimal bigDecimal91 = java.math.BigDecimal.valueOf((double) (-1));
        java.math.BigDecimal bigDecimal92 = bigDecimal5.subtract(bigDecimal91);
        int int93 = bigDecimal91.intValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal5", (bigDecimal0.compareTo(bigDecimal5) == 0) == bigDecimal0.equals(bigDecimal5));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigInteger bigInteger2 = bigDecimal0.toBigInteger();
        byte[] byteArray5 = new byte[] { (byte) 1 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.math.BigInteger bigInteger7 = new java.math.BigInteger((int) (short) -1, byteArray5);
        java.math.BigInteger bigInteger9 = bigInteger7.pow((int) 'a');
        byte[] byteArray10 = bigInteger7.toByteArray();
        long long11 = bigInteger7.longValueExact();
        java.math.BigInteger bigInteger12 = bigInteger2.or(bigInteger7);
        java.math.BigDecimal bigDecimal13 = new java.math.BigDecimal(bigInteger2);
        java.math.BigDecimal bigDecimal15 = bigDecimal13.scaleByPowerOfTen(32);
        java.lang.String str16 = bigDecimal13.toPlainString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal15", (bigDecimal0.compareTo(bigDecimal15) == 0) == bigDecimal0.equals(bigDecimal15));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((-2.0d));
        java.math.BigInteger bigInteger2 = bigDecimal1.toBigIntegerExact();
        java.math.BigDecimal bigDecimal3 = bigDecimal1.abs();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.TEN;
        long long7 = bigDecimal6.longValueExact();
        java.math.BigDecimal bigDecimal8 = bigDecimal6.ulp();
        java.lang.String str9 = bigDecimal6.toString();
        int int10 = bigDecimal4.compareTo(bigDecimal6);
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal14 = bigDecimal6.divide(bigDecimal12, (int) (short) 1);
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.TEN;
        long long16 = bigDecimal15.longValueExact();
        java.math.BigDecimal bigDecimal17 = bigDecimal14.max(bigDecimal15);
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.TEN;
        long long19 = bigDecimal18.longValueExact();
        java.math.BigDecimal bigDecimal20 = bigDecimal18.ulp();
        java.math.BigDecimal bigDecimal21 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigDecimal bigDecimal23 = java.math.BigDecimal.valueOf((long) (byte) 10);
        java.math.BigDecimal bigDecimal24 = bigDecimal23.abs();
        int int25 = bigDecimal24.precision();
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.ZERO;
        double double27 = bigDecimal26.doubleValue();
        java.math.BigInteger bigInteger28 = bigDecimal26.toBigInteger();
        byte[] byteArray31 = new byte[] { (byte) 1 };
        byte byte32 = org.apache.commons.lang3.math.NumberUtils.min(byteArray31);
        java.math.BigInteger bigInteger33 = new java.math.BigInteger((int) (short) -1, byteArray31);
        java.math.BigInteger bigInteger35 = bigInteger33.pow((int) 'a');
        byte[] byteArray36 = bigInteger33.toByteArray();
        long long37 = bigInteger33.longValueExact();
        java.math.BigInteger bigInteger38 = bigInteger28.or(bigInteger33);
        byte[] byteArray41 = new byte[] { (byte) 1 };
        byte byte42 = org.apache.commons.lang3.math.NumberUtils.min(byteArray41);
        java.math.BigInteger bigInteger43 = new java.math.BigInteger((int) (short) -1, byteArray41);
        java.math.BigInteger bigInteger45 = bigInteger43.pow((int) 'a');
        byte[] byteArray46 = bigInteger43.toByteArray();
        long long47 = bigInteger43.longValueExact();
        java.lang.String str49 = bigInteger43.toString(0);
        int int50 = bigInteger43.intValueExact();
        java.math.BigInteger bigInteger51 = bigInteger38.subtract(bigInteger43);
        java.math.BigDecimal bigDecimal52 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal53 = bigDecimal52.negate();
        java.math.BigDecimal bigDecimal56 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal57 = bigDecimal53.subtract(bigDecimal56);
        java.math.BigInteger bigInteger58 = bigDecimal57.toBigInteger();
        java.math.BigInteger bigInteger59 = bigInteger58.negate();
        java.math.BigDecimal bigDecimal60 = java.math.BigDecimal.ZERO;
        double double61 = bigDecimal60.doubleValue();
        java.math.BigInteger bigInteger62 = bigDecimal60.toBigInteger();
        byte[] byteArray65 = new byte[] { (byte) 1 };
        byte byte66 = org.apache.commons.lang3.math.NumberUtils.min(byteArray65);
        java.math.BigInteger bigInteger67 = new java.math.BigInteger((int) (short) -1, byteArray65);
        java.math.BigInteger bigInteger69 = bigInteger67.pow((int) 'a');
        byte[] byteArray70 = bigInteger67.toByteArray();
        long long71 = bigInteger67.longValueExact();
        java.math.BigInteger bigInteger72 = bigInteger62.or(bigInteger67);
        byte[] byteArray75 = new byte[] { (byte) 1 };
        byte byte76 = org.apache.commons.lang3.math.NumberUtils.min(byteArray75);
        java.math.BigInteger bigInteger77 = new java.math.BigInteger((int) (short) -1, byteArray75);
        java.math.BigInteger bigInteger79 = bigInteger77.pow((int) 'a');
        byte[] byteArray80 = bigInteger77.toByteArray();
        long long81 = bigInteger77.longValueExact();
        java.lang.String str83 = bigInteger77.toString(0);
        int int84 = bigInteger77.intValueExact();
        java.math.BigInteger bigInteger85 = bigInteger72.subtract(bigInteger77);
        java.math.BigInteger bigInteger86 = bigInteger58.min(bigInteger72);
        java.math.BigInteger bigInteger87 = bigInteger51.gcd(bigInteger86);
        java.math.BigDecimal bigDecimal88 = new java.math.BigDecimal(bigInteger86);
        java.lang.String str89 = bigDecimal88.toPlainString();
        java.math.BigDecimal bigDecimal90 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal91 = bigDecimal90.abs();
        java.lang.String str92 = bigDecimal91.toPlainString();
        java.math.BigDecimal bigDecimal93 = bigDecimal91.stripTrailingZeros();
        java.math.BigDecimal bigDecimal94 = bigDecimal88.subtract(bigDecimal91);
        java.math.BigInteger bigInteger95 = bigDecimal88.toBigInteger();
        java.math.BigDecimal bigDecimal96 = bigDecimal24.add(bigDecimal88);
        int int97 = bigDecimal21.compareTo(bigDecimal88);
        java.math.BigDecimal bigDecimal98 = bigDecimal3.min(bigDecimal21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal94", (bigDecimal1.compareTo(bigDecimal94) == 0) == bigDecimal1.equals(bigDecimal94));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf((long) (byte) -1, 0);
        java.math.BigDecimal bigDecimal3 = bigDecimal2.plus();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal7 = bigDecimal5.min(bigDecimal6);
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal9 = bigDecimal8.negate();
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal13 = bigDecimal9.subtract(bigDecimal12);
        java.math.BigDecimal[] bigDecimalArray14 = bigDecimal6.divideAndRemainder(bigDecimal12);
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal16 = bigDecimal15.negate();
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal20 = bigDecimal16.subtract(bigDecimal19);
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal22 = bigDecimal19.min(bigDecimal21);
        java.math.BigDecimal bigDecimal23 = bigDecimal12.divideToIntegralValue(bigDecimal22);
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal25 = bigDecimal24.negate();
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.TEN;
        long long27 = bigDecimal26.longValueExact();
        java.math.BigDecimal bigDecimal28 = bigDecimal26.ulp();
        java.lang.String str29 = bigDecimal26.toString();
        int int30 = bigDecimal24.compareTo(bigDecimal26);
        java.math.BigInteger bigInteger31 = bigDecimal24.toBigInteger();
        java.math.BigDecimal bigDecimal32 = bigDecimal24.ulp();
        java.math.BigDecimal bigDecimal33 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal34 = bigDecimal33.negate();
        java.math.BigDecimal bigDecimal35 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal36 = bigDecimal34.min(bigDecimal35);
        int int37 = bigDecimal24.compareTo(bigDecimal36);
        int int38 = bigDecimal23.compareTo(bigDecimal36);
        java.math.BigDecimal bigDecimal40 = bigDecimal23.setScale(117);
        java.math.BigDecimal bigDecimal41 = bigDecimal2.divideToIntegralValue(bigDecimal23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal23 and bigDecimal40", (bigDecimal23.compareTo(bigDecimal40) == 0) == bigDecimal23.equals(bigDecimal40));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        int int2 = bigDecimal0.intValue();
        java.math.BigDecimal bigDecimal4 = bigDecimal0.scaleByPowerOfTen(0);
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal6 = bigDecimal5.negate();
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal10 = bigDecimal6.subtract(bigDecimal9);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal12 = bigDecimal9.min(bigDecimal11);
        java.lang.String str13 = bigDecimal12.toPlainString();
        java.math.BigDecimal bigDecimal14 = bigDecimal0.subtract(bigDecimal12);
        int int15 = bigDecimal12.scale();
        java.math.BigDecimal bigDecimal16 = bigDecimal12.abs();
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal18 = bigDecimal17.negate();
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.TEN;
        long long20 = bigDecimal19.longValueExact();
        java.math.BigDecimal bigDecimal21 = bigDecimal19.ulp();
        java.lang.String str22 = bigDecimal19.toString();
        int int23 = bigDecimal17.compareTo(bigDecimal19);
        short short24 = bigDecimal17.shortValueExact();
        java.math.BigDecimal bigDecimal26 = bigDecimal17.scaleByPowerOfTen((-1));
        int int27 = bigDecimal12.compareTo(bigDecimal26);
        java.math.BigDecimal bigDecimal29 = bigDecimal12.pow(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal5 and bigDecimal26", (bigDecimal5.compareTo(bigDecimal26) == 0) == bigDecimal5.equals(bigDecimal26));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal2 = bigDecimal0.movePointLeft((int) (byte) 0);
        java.lang.String str3 = bigDecimal2.toPlainString();
        java.math.BigDecimal bigDecimal5 = bigDecimal2.scaleByPowerOfTen(34);
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal8 = bigDecimal6.movePointLeft((int) (byte) 0);
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal10 = bigDecimal9.negate();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal12 = bigDecimal10.min(bigDecimal11);
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal14 = bigDecimal13.negate();
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal18 = bigDecimal14.subtract(bigDecimal17);
        java.math.BigDecimal[] bigDecimalArray19 = bigDecimal11.divideAndRemainder(bigDecimal17);
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal21 = bigDecimal20.negate();
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal25 = bigDecimal21.subtract(bigDecimal24);
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal27 = bigDecimal24.min(bigDecimal26);
        java.math.BigDecimal bigDecimal28 = bigDecimal17.divideToIntegralValue(bigDecimal27);
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal30 = bigDecimal29.negate();
        java.math.BigDecimal bigDecimal31 = java.math.BigDecimal.TEN;
        long long32 = bigDecimal31.longValueExact();
        java.math.BigDecimal bigDecimal33 = bigDecimal31.ulp();
        java.lang.String str34 = bigDecimal31.toString();
        int int35 = bigDecimal29.compareTo(bigDecimal31);
        java.math.BigInteger bigInteger36 = bigDecimal29.toBigInteger();
        java.math.BigDecimal bigDecimal37 = bigDecimal29.ulp();
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal39 = bigDecimal38.negate();
        java.math.BigDecimal bigDecimal40 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal41 = bigDecimal39.min(bigDecimal40);
        int int42 = bigDecimal29.compareTo(bigDecimal41);
        int int43 = bigDecimal28.compareTo(bigDecimal41);
        java.math.BigDecimal bigDecimal45 = java.math.BigDecimal.valueOf((long) (byte) 0);
        byte byte46 = bigDecimal45.byteValueExact();
        java.math.BigDecimal bigDecimal48 = bigDecimal45.pow(2);
        java.math.BigDecimal bigDecimal49 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal50 = bigDecimal49.negate();
        java.math.BigDecimal bigDecimal51 = java.math.BigDecimal.TEN;
        long long52 = bigDecimal51.longValueExact();
        java.math.BigDecimal bigDecimal53 = bigDecimal51.ulp();
        java.lang.String str54 = bigDecimal51.toString();
        int int55 = bigDecimal49.compareTo(bigDecimal51);
        java.math.BigDecimal bigDecimal57 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal59 = bigDecimal51.divide(bigDecimal57, (int) (short) 1);
        java.math.BigDecimal bigDecimal60 = bigDecimal48.add(bigDecimal51);
        java.math.BigDecimal bigDecimal61 = bigDecimal41.divideToIntegralValue(bigDecimal51);
        java.math.BigDecimal bigDecimal62 = bigDecimal6.max(bigDecimal61);
        java.math.BigDecimal bigDecimal63 = bigDecimal2.max(bigDecimal61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal61 and bigDecimal5", (bigDecimal61.compareTo(bigDecimal5) == 0) == bigDecimal61.equals(bigDecimal5));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.TEN;
        long long3 = bigDecimal2.longValueExact();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.ulp();
        java.lang.String str5 = bigDecimal2.toString();
        int int6 = bigDecimal0.compareTo(bigDecimal2);
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal10 = bigDecimal2.divide(bigDecimal8, (int) (short) 1);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.TEN;
        long long12 = bigDecimal11.longValueExact();
        java.math.BigDecimal bigDecimal13 = bigDecimal10.max(bigDecimal11);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.TEN;
        long long15 = bigDecimal14.longValueExact();
        java.math.BigDecimal bigDecimal16 = bigDecimal14.ulp();
        java.math.BigDecimal bigDecimal17 = bigDecimal11.subtract(bigDecimal14);
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.valueOf((long) (-1), (int) 'u');
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal22 = bigDecimal21.abs();
        java.math.BigDecimal bigDecimal23 = bigDecimal20.min(bigDecimal22);
        java.math.BigDecimal bigDecimal25 = java.math.BigDecimal.valueOf((double) (-1.0f));
        int int26 = bigDecimal22.compareTo(bigDecimal25);
        java.math.BigDecimal bigDecimal27 = bigDecimal17.divide(bigDecimal25);
        java.math.BigDecimal bigDecimal29 = bigDecimal17.pow(1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal17 and bigDecimal27", (bigDecimal17.compareTo(bigDecimal27) == 0) == bigDecimal17.equals(bigDecimal27));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.ulp();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal4 = bigDecimal0.stripTrailingZeros();
        long long5 = bigDecimal0.longValue();
        java.math.BigDecimal bigDecimal7 = new java.math.BigDecimal(120);
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.valueOf((long) (byte) -1, 0);
        java.math.BigDecimal bigDecimal11 = bigDecimal10.plus();
        java.math.BigDecimal bigDecimal12 = bigDecimal7.multiply(bigDecimal11);
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.TEN;
        long long14 = bigDecimal13.longValueExact();
        java.math.BigDecimal bigDecimal15 = bigDecimal13.ulp();
        java.lang.String str16 = bigDecimal13.toString();
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.TEN;
        long long18 = bigDecimal17.longValueExact();
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.ZERO;
        double double20 = bigDecimal19.doubleValue();
        java.math.BigDecimal bigDecimal22 = bigDecimal19.movePointLeft((int) (byte) -1);
        int int23 = bigDecimal22.intValue();
        java.math.BigDecimal bigDecimal24 = bigDecimal17.add(bigDecimal22);
        java.math.BigDecimal bigDecimal25 = bigDecimal13.add(bigDecimal24);
        java.math.BigDecimal bigDecimal27 = bigDecimal25.pow((int) '#');
        int int28 = bigDecimal7.compareTo(bigDecimal25);
        java.math.BigDecimal bigDecimal29 = bigDecimal0.min(bigDecimal7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal4 and bigDecimal29", (bigDecimal4.compareTo(bigDecimal29) == 0) == bigDecimal4.equals(bigDecimal29));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigInteger bigInteger2 = bigDecimal0.toBigInteger();
        java.lang.String str3 = bigDecimal0.toPlainString();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal6 = bigDecimal4.negate();
        int int7 = bigDecimal6.intValueExact();
        java.math.BigDecimal bigDecimal8 = bigDecimal0.max(bigDecimal6);
        java.math.BigDecimal bigDecimal9 = bigDecimal8.abs();
        int int10 = bigDecimal8.intValueExact();
        java.math.BigDecimal bigDecimal12 = bigDecimal8.setScale((int) (byte) 100);
        java.lang.String str13 = bigDecimal8.toPlainString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal8 and bigDecimal12", (bigDecimal8.compareTo(bigDecimal12) == 0) == bigDecimal8.equals(bigDecimal12));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.negate();
        java.lang.String str5 = bigDecimal4.toEngineeringString();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal8 = bigDecimal7.negate();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal12 = bigDecimal8.subtract(bigDecimal11);
        java.math.BigInteger bigInteger13 = bigDecimal12.toBigInteger();
        java.math.BigDecimal bigDecimal14 = bigDecimal6.divideToIntegralValue(bigDecimal12);
        java.lang.String str15 = bigDecimal12.toEngineeringString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal14", (bigDecimal0.compareTo(bigDecimal14) == 0) == bigDecimal0.equals(bigDecimal14));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.ulp();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal4 = bigDecimal0.stripTrailingZeros();
        java.math.BigInteger bigInteger5 = bigDecimal4.toBigInteger();
        java.lang.String str6 = bigDecimal4.toPlainString();
        byte[] byteArray8 = new byte[] { (byte) 1 };
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray8);
        java.math.BigInteger bigInteger10 = new java.math.BigInteger(byteArray8);
        java.math.BigDecimal bigDecimal11 = new java.math.BigDecimal(bigInteger10);
        int int12 = bigDecimal4.compareTo(bigDecimal11);
        java.math.BigDecimal bigDecimal14 = bigDecimal4.movePointLeft(97);
        java.math.BigDecimal bigDecimal17 = bigDecimal4.setScale((int) (short) 100, 0);
        int int18 = bigDecimal4.scale();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal17", (bigDecimal0.compareTo(bigDecimal17) == 0) == bigDecimal0.equals(bigDecimal17));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((double) 117);
        double double2 = bigDecimal1.doubleValue();
        java.math.BigDecimal bigDecimal3 = bigDecimal1.ulp();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal6 = bigDecimal4.negate();
        java.lang.String str7 = bigDecimal4.toString();
        java.math.BigDecimal bigDecimal9 = new java.math.BigDecimal((double) 1L);
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) 10, (short) 100 };
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(objArray12, "hi!", (int) (byte) 100, (int) (short) -1);
        boolean boolean17 = bigDecimal9.equals((java.lang.Object) (short) -1);
        java.math.BigDecimal bigDecimal18 = bigDecimal4.max(bigDecimal9);
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.valueOf((long) (byte) -1, 0);
        java.math.BigDecimal bigDecimal22 = bigDecimal21.plus();
        java.math.BigDecimal bigDecimal23 = bigDecimal4.remainder(bigDecimal21);
        java.math.BigDecimal bigDecimal24 = bigDecimal3.add(bigDecimal23);
        java.math.BigDecimal bigDecimal26 = bigDecimal23.movePointRight((-1));
        java.math.BigDecimal bigDecimal28 = bigDecimal23.setScale((int) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal23 and bigDecimal26", (bigDecimal23.compareTo(bigDecimal26) == 0) == bigDecimal23.equals(bigDecimal26));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.negate();
        java.lang.String str5 = bigDecimal4.toEngineeringString();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal8 = bigDecimal4.movePointRight(100);
        byte[] byteArray11 = new byte[] { (byte) 1 };
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray11);
        java.math.BigInteger bigInteger13 = new java.math.BigInteger((int) (short) -1, byteArray11);
        java.math.BigInteger bigInteger15 = bigInteger13.pow((int) 'a');
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(bigInteger15, (int) (byte) 0);
        java.util.Locale locale18 = java.util.Locale.PRC;
        java.lang.String str19 = locale18.getISO3Language();
        boolean boolean20 = bigDecimal17.equals((java.lang.Object) str19);
        java.math.BigDecimal bigDecimal23 = bigDecimal4.divide(bigDecimal17, (int) (short) 100, (int) (short) 1);
        java.math.BigDecimal bigDecimal25 = bigDecimal23.movePointLeft(563);
        java.math.BigDecimal bigDecimal26 = bigDecimal23.plus();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal25", (bigDecimal0.compareTo(bigDecimal25) == 0) == bigDecimal0.equals(bigDecimal25));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.TEN;
        long long3 = bigDecimal2.longValueExact();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.ulp();
        java.lang.String str5 = bigDecimal2.toString();
        int int6 = bigDecimal0.compareTo(bigDecimal2);
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal10 = bigDecimal2.divide(bigDecimal8, (int) (short) 1);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.TEN;
        long long12 = bigDecimal11.longValueExact();
        java.math.BigDecimal bigDecimal13 = bigDecimal10.max(bigDecimal11);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.TEN;
        long long15 = bigDecimal14.longValueExact();
        java.math.BigDecimal bigDecimal16 = bigDecimal14.ulp();
        java.math.BigDecimal bigDecimal17 = bigDecimal11.subtract(bigDecimal14);
        double double18 = bigDecimal14.doubleValue();
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.TEN;
        long long20 = bigDecimal19.longValueExact();
        java.math.BigDecimal bigDecimal21 = bigDecimal19.ulp();
        java.lang.String str22 = bigDecimal19.toString();
        java.math.BigDecimal bigDecimal23 = bigDecimal19.stripTrailingZeros();
        java.math.BigInteger bigInteger24 = bigDecimal23.toBigInteger();
        java.math.BigDecimal[] bigDecimalArray25 = bigDecimal14.divideAndRemainder(bigDecimal23);
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal27 = bigDecimal26.negate();
        java.math.BigDecimal bigDecimal28 = bigDecimal26.negate();
        java.lang.String str29 = bigDecimal26.toString();
        java.math.BigDecimal bigDecimal31 = new java.math.BigDecimal((double) 1L);
        java.lang.Object[] objArray34 = new java.lang.Object[] { (short) 10, (short) 100 };
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.join(objArray34, "hi!", (int) (byte) 100, (int) (short) -1);
        boolean boolean39 = bigDecimal31.equals((java.lang.Object) (short) -1);
        java.math.BigDecimal bigDecimal40 = bigDecimal26.max(bigDecimal31);
        java.math.BigDecimal bigDecimal41 = bigDecimal23.max(bigDecimal26);
        double double42 = bigDecimal23.doubleValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal2 and bigDecimal23", (bigDecimal2.compareTo(bigDecimal23) == 0) == bigDecimal2.equals(bigDecimal23));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigDecimal bigDecimal3 = bigDecimal0.movePointLeft((int) (byte) -1);
        java.math.BigDecimal bigDecimal5 = bigDecimal0.movePointRight((int) (short) 1);
        java.math.BigDecimal bigDecimal7 = bigDecimal5.movePointLeft((int) '4');
        java.math.BigInteger bigInteger8 = bigDecimal7.toBigIntegerExact();
        java.math.BigInteger bigInteger10 = bigInteger8.setBit((int) (short) 117);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal7", (bigDecimal0.compareTo(bigDecimal7) == 0) == bigDecimal0.equals(bigDecimal7));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal1.abs();
        int int3 = bigDecimal1.intValueExact();
        java.math.BigInteger bigInteger4 = bigDecimal1.toBigInteger();
        java.math.BigDecimal bigDecimal5 = bigDecimal1.ulp();
        int int6 = bigDecimal1.intValueExact();
        java.math.BigDecimal bigDecimal8 = bigDecimal1.movePointLeft(6);
        java.math.BigDecimal bigDecimal9 = bigDecimal1.plus();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal9 and bigDecimal8", (bigDecimal9.compareTo(bigDecimal8) == 0) == bigDecimal9.equals(bigDecimal8));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.ulp();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal4 = bigDecimal0.stripTrailingZeros();
        long long5 = bigDecimal0.longValue();
        java.math.BigDecimal bigDecimal7 = bigDecimal0.setScale(30);
        java.lang.String str8 = bigDecimal0.toPlainString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal4 and bigDecimal7", (bigDecimal4.compareTo(bigDecimal7) == 0) == bigDecimal4.equals(bigDecimal7));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.TEN;
        long long3 = bigDecimal2.longValueExact();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.ulp();
        java.lang.String str5 = bigDecimal2.toString();
        int int6 = bigDecimal0.compareTo(bigDecimal2);
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal10 = bigDecimal2.divide(bigDecimal8, (int) (short) 1);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.TEN;
        long long12 = bigDecimal11.longValueExact();
        java.math.BigDecimal bigDecimal13 = bigDecimal10.max(bigDecimal11);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.TEN;
        long long15 = bigDecimal14.longValueExact();
        java.math.BigDecimal bigDecimal16 = bigDecimal14.ulp();
        java.math.BigDecimal bigDecimal17 = bigDecimal11.subtract(bigDecimal14);
        boolean boolean19 = bigDecimal14.equals((java.lang.Object) "hi");
        java.math.BigDecimal bigDecimal21 = bigDecimal14.scaleByPowerOfTen((int) (byte) 1);
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal23 = bigDecimal22.abs();
        java.lang.String str24 = bigDecimal23.toPlainString();
        java.math.BigDecimal bigDecimal25 = bigDecimal23.stripTrailingZeros();
        long long26 = bigDecimal23.longValue();
        java.math.BigDecimal bigDecimal28 = new java.math.BigDecimal(120);
        java.math.BigDecimal bigDecimal31 = java.math.BigDecimal.valueOf((long) (byte) -1, 0);
        java.math.BigDecimal bigDecimal32 = bigDecimal31.plus();
        java.math.BigDecimal bigDecimal33 = bigDecimal28.multiply(bigDecimal32);
        java.math.BigDecimal bigDecimal34 = bigDecimal23.max(bigDecimal32);
        java.math.BigDecimal bigDecimal35 = bigDecimal21.divide(bigDecimal32);
        java.math.BigDecimal bigDecimal37 = bigDecimal35.pow(35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal8 and bigDecimal21", (bigDecimal8.compareTo(bigDecimal21) == 0) == bigDecimal8.equals(bigDecimal21));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal2 = bigDecimal0.movePointLeft((int) (byte) 0);
        java.lang.String str3 = bigDecimal2.toPlainString();
        java.math.BigDecimal bigDecimal5 = bigDecimal2.scaleByPowerOfTen(34);
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal7 = bigDecimal6.negate();
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal11 = bigDecimal7.subtract(bigDecimal10);
        java.math.BigInteger bigInteger12 = bigDecimal11.toBigInteger();
        double double13 = bigInteger12.doubleValue();
        byte[] byteArray16 = new byte[] { (byte) 1 };
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray16);
        java.math.BigInteger bigInteger18 = new java.math.BigInteger((int) (short) -1, byteArray16);
        java.math.BigInteger bigInteger19 = bigInteger12.gcd(bigInteger18);
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal21 = bigDecimal20.negate();
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal25 = bigDecimal21.subtract(bigDecimal24);
        java.math.BigInteger bigInteger26 = bigDecimal25.toBigInteger();
        java.math.BigInteger bigInteger27 = bigInteger18.or(bigInteger26);
        short short28 = bigInteger18.shortValueExact();
        byte[] byteArray31 = new byte[] { (byte) 1 };
        byte byte32 = org.apache.commons.lang3.math.NumberUtils.min(byteArray31);
        java.math.BigInteger bigInteger33 = new java.math.BigInteger((int) (short) -1, byteArray31);
        java.math.BigInteger bigInteger35 = bigInteger33.pow((int) 'a');
        java.math.BigInteger bigInteger37 = bigInteger33.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger38 = bigInteger18.xor(bigInteger37);
        java.math.BigInteger bigInteger40 = bigInteger37.clearBit(4);
        double double41 = bigInteger37.doubleValue();
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal43 = bigDecimal42.negate();
        java.math.BigDecimal bigDecimal46 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal47 = bigDecimal43.subtract(bigDecimal46);
        java.math.BigInteger bigInteger48 = bigDecimal47.toBigInteger();
        double double49 = bigInteger48.doubleValue();
        byte[] byteArray52 = new byte[] { (byte) 1 };
        byte byte53 = org.apache.commons.lang3.math.NumberUtils.min(byteArray52);
        java.math.BigInteger bigInteger54 = new java.math.BigInteger((int) (short) -1, byteArray52);
        java.math.BigInteger bigInteger55 = bigInteger48.gcd(bigInteger54);
        java.math.BigDecimal bigDecimal56 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal57 = bigDecimal56.negate();
        java.math.BigDecimal bigDecimal60 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal61 = bigDecimal57.subtract(bigDecimal60);
        java.math.BigInteger bigInteger62 = bigDecimal61.toBigInteger();
        java.math.BigInteger bigInteger63 = bigInteger54.or(bigInteger62);
        byte[] byteArray64 = bigInteger63.toByteArray();
        byte[] byteArray66 = new byte[] { (byte) 1 };
        byte byte67 = org.apache.commons.lang3.math.NumberUtils.min(byteArray66);
        java.math.BigInteger bigInteger68 = new java.math.BigInteger(byteArray66);
        java.math.BigDecimal bigDecimal69 = new java.math.BigDecimal(bigInteger68);
        short short70 = bigInteger68.shortValueExact();
        int int71 = bigInteger68.bitLength();
        java.math.BigInteger[] bigIntegerArray72 = bigInteger63.divideAndRemainder(bigInteger68);
        java.math.BigDecimal bigDecimal73 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal74 = bigDecimal73.negate();
        java.math.BigDecimal bigDecimal77 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal78 = bigDecimal74.subtract(bigDecimal77);
        java.math.BigInteger bigInteger79 = bigDecimal78.toBigInteger();
        double double80 = bigInteger79.doubleValue();
        byte[] byteArray83 = new byte[] { (byte) 1 };
        byte byte84 = org.apache.commons.lang3.math.NumberUtils.min(byteArray83);
        java.math.BigInteger bigInteger85 = new java.math.BigInteger((int) (short) -1, byteArray83);
        java.math.BigInteger bigInteger86 = bigInteger79.gcd(bigInteger85);
        java.math.BigInteger bigInteger87 = bigInteger68.andNot(bigInteger85);
        java.math.BigInteger bigInteger88 = bigInteger37.xor(bigInteger85);
        boolean boolean89 = bigDecimal5.equals((java.lang.Object) bigInteger37);
        java.math.BigDecimal bigDecimal91 = bigDecimal5.scaleByPowerOfTen((int) (byte) 100);
        java.lang.String str92 = bigDecimal5.toEngineeringString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal91", (bigDecimal0.compareTo(bigDecimal91) == 0) == bigDecimal0.equals(bigDecimal91));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.TEN;
        long long3 = bigDecimal2.longValueExact();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.ulp();
        java.lang.String str5 = bigDecimal2.toString();
        int int6 = bigDecimal0.compareTo(bigDecimal2);
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal10 = bigDecimal2.divide(bigDecimal8, (int) (short) 1);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.TEN;
        long long12 = bigDecimal11.longValueExact();
        java.math.BigDecimal bigDecimal13 = bigDecimal10.max(bigDecimal11);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.TEN;
        long long15 = bigDecimal14.longValueExact();
        java.math.BigDecimal bigDecimal16 = bigDecimal14.ulp();
        java.math.BigDecimal bigDecimal17 = bigDecimal11.subtract(bigDecimal14);
        double double18 = bigDecimal14.doubleValue();
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.TEN;
        long long20 = bigDecimal19.longValueExact();
        java.math.BigDecimal bigDecimal21 = bigDecimal19.ulp();
        java.lang.String str22 = bigDecimal19.toString();
        java.math.BigDecimal bigDecimal23 = bigDecimal19.stripTrailingZeros();
        java.math.BigInteger bigInteger24 = bigDecimal23.toBigInteger();
        java.math.BigDecimal[] bigDecimalArray25 = bigDecimal14.divideAndRemainder(bigDecimal23);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) bigDecimalArray25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal2 and bigDecimal23", (bigDecimal2.compareTo(bigDecimal23) == 0) == bigDecimal2.equals(bigDecimal23));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.ulp();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal4 = bigDecimal0.stripTrailingZeros();
        java.math.BigInteger bigInteger5 = bigDecimal4.toBigInteger();
        java.math.BigInteger bigInteger6 = bigInteger5.negate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal4", (bigDecimal0.compareTo(bigDecimal4) == 0) == bigDecimal0.equals(bigDecimal4));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte byte8 = bigInteger6.byteValueExact();
        java.math.BigDecimal bigDecimal10 = new java.math.BigDecimal(bigInteger6, (int) (byte) -1);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal12 = bigDecimal11.negate();
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal14 = bigDecimal13.negate();
        java.math.BigDecimal bigDecimal15 = bigDecimal13.negate();
        java.lang.String str16 = bigDecimal15.toEngineeringString();
        java.math.BigDecimal bigDecimal17 = bigDecimal12.multiply(bigDecimal15);
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal19 = bigDecimal18.negate();
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal23 = bigDecimal19.subtract(bigDecimal22);
        java.math.BigInteger bigInteger24 = bigDecimal23.toBigInteger();
        java.math.BigDecimal bigDecimal25 = bigDecimal17.divideToIntegralValue(bigDecimal23);
        int int26 = bigDecimal10.compareTo(bigDecimal25);
        byte byte27 = bigDecimal10.byteValueExact();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal25", (bigDecimal0.compareTo(bigDecimal25) == 0) == bigDecimal0.equals(bigDecimal25));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.negate();
        java.lang.String str5 = bigDecimal4.toEngineeringString();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal8 = bigDecimal7.negate();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal12 = bigDecimal8.subtract(bigDecimal11);
        java.math.BigInteger bigInteger13 = bigDecimal12.toBigInteger();
        java.math.BigDecimal bigDecimal14 = bigDecimal6.divideToIntegralValue(bigDecimal12);
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal16 = bigDecimal15.negate();
        java.math.BigDecimal bigDecimal17 = bigDecimal16.abs();
        int int18 = bigDecimal16.intValueExact();
        boolean boolean19 = bigDecimal14.equals((java.lang.Object) int18);
        long long20 = bigDecimal14.longValueExact();
        java.math.BigInteger bigInteger21 = bigDecimal14.unscaledValue();
        java.math.BigInteger bigInteger22 = bigDecimal14.toBigInteger();
        java.math.BigInteger bigInteger24 = bigInteger22.clearBit(9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal14", (bigDecimal0.compareTo(bigDecimal14) == 0) == bigDecimal0.equals(bigDecimal14));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal3 = bigDecimal1.min(bigDecimal2);
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal9 = bigDecimal5.subtract(bigDecimal8);
        java.math.BigDecimal[] bigDecimalArray10 = bigDecimal2.divideAndRemainder(bigDecimal8);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal12 = bigDecimal11.negate();
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal16 = bigDecimal12.subtract(bigDecimal15);
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal18 = bigDecimal15.min(bigDecimal17);
        java.math.BigDecimal bigDecimal19 = bigDecimal8.divideToIntegralValue(bigDecimal18);
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal21 = bigDecimal20.negate();
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.TEN;
        long long23 = bigDecimal22.longValueExact();
        java.math.BigDecimal bigDecimal24 = bigDecimal22.ulp();
        java.lang.String str25 = bigDecimal22.toString();
        int int26 = bigDecimal20.compareTo(bigDecimal22);
        java.math.BigInteger bigInteger27 = bigDecimal20.toBigInteger();
        java.math.BigDecimal bigDecimal28 = bigDecimal20.ulp();
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal30 = bigDecimal29.negate();
        java.math.BigDecimal bigDecimal31 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal32 = bigDecimal30.min(bigDecimal31);
        int int33 = bigDecimal20.compareTo(bigDecimal32);
        int int34 = bigDecimal19.compareTo(bigDecimal32);
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.valueOf((long) (byte) 0);
        byte byte37 = bigDecimal36.byteValueExact();
        java.math.BigDecimal bigDecimal39 = bigDecimal36.pow(2);
        java.math.BigDecimal bigDecimal40 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal41 = bigDecimal40.negate();
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.TEN;
        long long43 = bigDecimal42.longValueExact();
        java.math.BigDecimal bigDecimal44 = bigDecimal42.ulp();
        java.lang.String str45 = bigDecimal42.toString();
        int int46 = bigDecimal40.compareTo(bigDecimal42);
        java.math.BigDecimal bigDecimal48 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal50 = bigDecimal42.divide(bigDecimal48, (int) (short) 1);
        java.math.BigDecimal bigDecimal51 = bigDecimal39.add(bigDecimal42);
        java.math.BigDecimal bigDecimal52 = bigDecimal32.divideToIntegralValue(bigDecimal42);
        java.math.BigDecimal bigDecimal53 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal54 = bigDecimal53.negate();
        java.math.BigDecimal bigDecimal55 = java.math.BigDecimal.TEN;
        long long56 = bigDecimal55.longValueExact();
        java.math.BigDecimal bigDecimal57 = bigDecimal55.ulp();
        java.lang.String str58 = bigDecimal55.toString();
        int int59 = bigDecimal53.compareTo(bigDecimal55);
        java.math.BigDecimal bigDecimal60 = bigDecimal42.add(bigDecimal55);
        java.math.BigDecimal bigDecimal62 = bigDecimal55.scaleByPowerOfTen((int) (byte) -1);
        int int63 = bigDecimal55.intValueExact();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal2 and bigDecimal62", (bigDecimal2.compareTo(bigDecimal62) == 0) == bigDecimal2.equals(bigDecimal62));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((double) (-1.0f));
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        double double3 = bigDecimal2.doubleValue();
        java.math.BigInteger bigInteger4 = bigDecimal2.toBigInteger();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray7);
        java.math.BigInteger bigInteger9 = new java.math.BigInteger((int) (short) -1, byteArray7);
        java.math.BigInteger bigInteger11 = bigInteger9.pow((int) 'a');
        byte[] byteArray12 = bigInteger9.toByteArray();
        long long13 = bigInteger9.longValueExact();
        java.math.BigInteger bigInteger14 = bigInteger4.or(bigInteger9);
        byte[] byteArray17 = new byte[] { (byte) 1 };
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray17);
        java.math.BigInteger bigInteger19 = new java.math.BigInteger((int) (short) -1, byteArray17);
        java.math.BigInteger bigInteger21 = bigInteger19.pow((int) 'a');
        byte[] byteArray22 = bigInteger19.toByteArray();
        long long23 = bigInteger19.longValueExact();
        java.lang.String str25 = bigInteger19.toString(0);
        int int26 = bigInteger19.intValueExact();
        java.math.BigInteger bigInteger27 = bigInteger14.subtract(bigInteger19);
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal29 = bigDecimal28.negate();
        java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal33 = bigDecimal29.subtract(bigDecimal32);
        java.math.BigInteger bigInteger34 = bigDecimal33.toBigInteger();
        java.math.BigInteger bigInteger35 = bigInteger34.negate();
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.ZERO;
        double double37 = bigDecimal36.doubleValue();
        java.math.BigInteger bigInteger38 = bigDecimal36.toBigInteger();
        byte[] byteArray41 = new byte[] { (byte) 1 };
        byte byte42 = org.apache.commons.lang3.math.NumberUtils.min(byteArray41);
        java.math.BigInteger bigInteger43 = new java.math.BigInteger((int) (short) -1, byteArray41);
        java.math.BigInteger bigInteger45 = bigInteger43.pow((int) 'a');
        byte[] byteArray46 = bigInteger43.toByteArray();
        long long47 = bigInteger43.longValueExact();
        java.math.BigInteger bigInteger48 = bigInteger38.or(bigInteger43);
        byte[] byteArray51 = new byte[] { (byte) 1 };
        byte byte52 = org.apache.commons.lang3.math.NumberUtils.min(byteArray51);
        java.math.BigInteger bigInteger53 = new java.math.BigInteger((int) (short) -1, byteArray51);
        java.math.BigInteger bigInteger55 = bigInteger53.pow((int) 'a');
        byte[] byteArray56 = bigInteger53.toByteArray();
        long long57 = bigInteger53.longValueExact();
        java.lang.String str59 = bigInteger53.toString(0);
        int int60 = bigInteger53.intValueExact();
        java.math.BigInteger bigInteger61 = bigInteger48.subtract(bigInteger53);
        java.math.BigInteger bigInteger62 = bigInteger34.min(bigInteger48);
        java.math.BigInteger bigInteger63 = bigInteger27.gcd(bigInteger62);
        java.math.BigDecimal bigDecimal64 = new java.math.BigDecimal(bigInteger62);
        java.lang.String str65 = bigDecimal64.toPlainString();
        int int66 = bigDecimal1.compareTo(bigDecimal64);
        java.math.BigDecimal bigDecimal67 = java.math.BigDecimal.TEN;
        long long68 = bigDecimal67.longValueExact();
        java.math.BigDecimal bigDecimal69 = bigDecimal67.ulp();
        java.lang.String str70 = bigDecimal67.toString();
        java.math.BigDecimal bigDecimal71 = java.math.BigDecimal.TEN;
        long long72 = bigDecimal71.longValueExact();
        java.math.BigDecimal bigDecimal73 = java.math.BigDecimal.ZERO;
        double double74 = bigDecimal73.doubleValue();
        java.math.BigDecimal bigDecimal76 = bigDecimal73.movePointLeft((int) (byte) -1);
        int int77 = bigDecimal76.intValue();
        java.math.BigDecimal bigDecimal78 = bigDecimal71.add(bigDecimal76);
        java.math.BigDecimal bigDecimal79 = bigDecimal67.add(bigDecimal78);
        java.math.BigDecimal bigDecimal81 = bigDecimal79.pow((int) '#');
        java.math.BigDecimal bigDecimal82 = java.math.BigDecimal.TEN;
        long long83 = bigDecimal82.longValueExact();
        java.math.BigDecimal bigDecimal84 = bigDecimal82.ulp();
        java.math.BigDecimal bigDecimal86 = bigDecimal84.movePointLeft((int) (short) 10);
        java.math.BigDecimal bigDecimal87 = bigDecimal84.plus();
        java.math.BigDecimal bigDecimal89 = bigDecimal84.movePointLeft(2);
        java.math.BigDecimal bigDecimal90 = bigDecimal79.add(bigDecimal89);
        java.math.BigDecimal[] bigDecimalArray91 = bigDecimal1.divideAndRemainder(bigDecimal79);
        long long92 = bigDecimal79.longValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal64", (bigDecimal1.compareTo(bigDecimal64) == 0) == bigDecimal1.equals(bigDecimal64));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.negate();
        java.lang.String str5 = bigDecimal4.toEngineeringString();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal8 = bigDecimal4.movePointRight(100);
        byte[] byteArray11 = new byte[] { (byte) 1 };
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray11);
        java.math.BigInteger bigInteger13 = new java.math.BigInteger((int) (short) -1, byteArray11);
        java.math.BigInteger bigInteger15 = bigInteger13.pow((int) 'a');
        java.math.BigDecimal bigDecimal17 = new java.math.BigDecimal(bigInteger15, (int) (byte) 0);
        java.util.Locale locale18 = java.util.Locale.PRC;
        java.lang.String str19 = locale18.getISO3Language();
        boolean boolean20 = bigDecimal17.equals((java.lang.Object) str19);
        java.math.BigDecimal bigDecimal23 = bigDecimal4.divide(bigDecimal17, (int) (short) 100, (int) (short) 1);
        long long24 = bigDecimal23.longValue();
        java.math.BigDecimal bigDecimal25 = bigDecimal23.ulp();
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal27 = bigDecimal26.negate();
        java.math.BigDecimal bigDecimal30 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal31 = bigDecimal27.subtract(bigDecimal30);
        java.math.BigInteger bigInteger32 = bigDecimal31.toBigInteger();
        java.math.BigDecimal bigDecimal33 = bigDecimal31.negate();
        java.math.BigDecimal bigDecimal35 = bigDecimal33.scaleByPowerOfTen(301);
        java.math.BigDecimal bigDecimal36 = bigDecimal25.remainder(bigDecimal35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal23", (bigDecimal0.compareTo(bigDecimal23) == 0) == bigDecimal0.equals(bigDecimal23));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale.Builder builder1 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale locale3 = builder2.build();
        java.util.Locale.setDefault(category0, locale3);
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("Chinese");
        java.util.Locale locale7 = java.util.Locale.PRC;
        java.util.Locale locale8 = null;
        java.lang.String str9 = locale7.getDisplayScript(locale8);
        java.util.Locale.setDefault(locale7);
        java.util.Locale locale11 = locale7.stripExtensions();
        java.lang.String str12 = locale6.getDisplayVariant(locale7);
        java.util.Locale.setDefault(category0, locale6);
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("\ub3c5\uc77c\uc5b4\ub3c5\uc77c) ");
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(category0, locale15);
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal19 = bigDecimal18.negate();
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal21 = bigDecimal20.negate();
        java.math.BigDecimal bigDecimal22 = bigDecimal20.negate();
        java.lang.String str23 = bigDecimal22.toEngineeringString();
        java.math.BigDecimal bigDecimal24 = bigDecimal19.multiply(bigDecimal22);
        java.math.BigDecimal bigDecimal25 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal26 = bigDecimal25.negate();
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal30 = bigDecimal26.subtract(bigDecimal29);
        java.math.BigInteger bigInteger31 = bigDecimal30.toBigInteger();
        java.math.BigDecimal bigDecimal32 = bigDecimal24.divideToIntegralValue(bigDecimal30);
        java.math.BigDecimal bigDecimal33 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal34 = bigDecimal33.negate();
        java.math.BigDecimal bigDecimal35 = bigDecimal34.abs();
        int int36 = bigDecimal34.intValueExact();
        boolean boolean37 = bigDecimal32.equals((java.lang.Object) int36);
        long long38 = bigDecimal32.longValueExact();
        java.math.BigInteger bigInteger39 = bigDecimal32.unscaledValue();
        java.math.BigInteger bigInteger40 = bigDecimal32.toBigInteger();
        java.math.BigDecimal bigDecimal41 = java.math.BigDecimal.TEN;
        long long42 = bigDecimal41.longValueExact();
        int int43 = bigDecimal41.intValue();
        java.math.BigDecimal bigDecimal45 = bigDecimal41.scaleByPowerOfTen(0);
        java.math.BigDecimal bigDecimal46 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal47 = bigDecimal46.negate();
        java.math.BigDecimal bigDecimal50 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal51 = bigDecimal47.subtract(bigDecimal50);
        java.math.BigDecimal bigDecimal52 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal53 = bigDecimal50.min(bigDecimal52);
        java.lang.String str54 = bigDecimal53.toPlainString();
        java.math.BigDecimal bigDecimal55 = bigDecimal41.subtract(bigDecimal53);
        java.math.BigDecimal bigDecimal57 = bigDecimal55.movePointLeft(9);
        java.math.BigDecimal bigDecimal58 = bigDecimal32.add(bigDecimal57);
        boolean boolean59 = locale15.equals((java.lang.Object) bigDecimal58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal18 and bigDecimal32", (bigDecimal18.compareTo(bigDecimal32) == 0) == bigDecimal18.equals(bigDecimal32));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigInteger bigInteger2 = bigDecimal0.toBigInteger();
        java.math.BigDecimal bigDecimal3 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        double double5 = bigDecimal4.doubleValue();
        java.math.BigInteger bigInteger6 = bigDecimal4.toBigInteger();
        byte[] byteArray9 = new byte[] { (byte) 1 };
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray9);
        java.math.BigInteger bigInteger11 = new java.math.BigInteger((int) (short) -1, byteArray9);
        java.math.BigInteger bigInteger13 = bigInteger11.pow((int) 'a');
        byte[] byteArray14 = bigInteger11.toByteArray();
        long long15 = bigInteger11.longValueExact();
        java.math.BigInteger bigInteger16 = bigInteger6.or(bigInteger11);
        byte byte17 = bigInteger11.byteValueExact();
        java.math.BigDecimal bigDecimal19 = new java.math.BigDecimal(bigInteger11, (int) (byte) 0);
        java.math.BigDecimal bigDecimal21 = new java.math.BigDecimal(bigInteger11, (int) '#');
        java.math.BigDecimal bigDecimal22 = bigDecimal0.max(bigDecimal21);
        java.math.BigDecimal bigDecimal24 = bigDecimal0.setScale(3);
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.valueOf((double) 34);
        boolean boolean27 = bigDecimal0.equals((java.lang.Object) bigDecimal26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal24", (bigDecimal0.compareTo(bigDecimal24) == 0) == bigDecimal0.equals(bigDecimal24));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.negate();
        java.lang.String str5 = bigDecimal4.toEngineeringString();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal8 = bigDecimal7.negate();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal12 = bigDecimal8.subtract(bigDecimal11);
        java.math.BigInteger bigInteger13 = bigDecimal12.toBigInteger();
        java.math.BigDecimal bigDecimal14 = bigDecimal6.divideToIntegralValue(bigDecimal12);
        java.math.BigDecimal bigDecimal16 = bigDecimal12.movePointRight(100);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal14", (bigDecimal0.compareTo(bigDecimal14) == 0) == bigDecimal0.equals(bigDecimal14));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal3 = bigDecimal1.min(bigDecimal2);
        java.math.BigDecimal bigDecimal5 = bigDecimal3.movePointLeft(10);
        short short6 = bigDecimal3.shortValueExact();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal3 and bigDecimal5", (bigDecimal3.compareTo(bigDecimal5) == 0) == bigDecimal3.equals(bigDecimal5));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.negate();
        java.lang.String str5 = bigDecimal4.toEngineeringString();
        java.math.BigDecimal bigDecimal6 = bigDecimal1.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal8 = bigDecimal4.movePointRight(100);
        java.lang.String str9 = bigDecimal4.toEngineeringString();
        java.lang.String str10 = bigDecimal4.toPlainString();
        java.math.BigDecimal bigDecimal11 = bigDecimal4.ulp();
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal13 = bigDecimal12.abs();
        int int14 = bigDecimal13.precision();
        java.math.BigDecimal bigDecimal15 = bigDecimal4.max(bigDecimal13);
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.TEN;
        long long17 = bigDecimal16.longValueExact();
        java.math.BigDecimal bigDecimal18 = bigDecimal16.ulp();
        java.lang.String str19 = bigDecimal16.toString();
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.TEN;
        long long21 = bigDecimal20.longValueExact();
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.ZERO;
        double double23 = bigDecimal22.doubleValue();
        java.math.BigDecimal bigDecimal25 = bigDecimal22.movePointLeft((int) (byte) -1);
        int int26 = bigDecimal25.intValue();
        java.math.BigDecimal bigDecimal27 = bigDecimal20.add(bigDecimal25);
        java.math.BigDecimal bigDecimal28 = bigDecimal16.add(bigDecimal27);
        java.math.BigDecimal bigDecimal29 = bigDecimal13.max(bigDecimal28);
        java.math.BigDecimal bigDecimal30 = bigDecimal28.abs();
        java.math.BigDecimal bigDecimal31 = bigDecimal30.stripTrailingZeros();
        java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal33 = bigDecimal32.ulp();
        java.math.BigDecimal bigDecimal35 = new java.math.BigDecimal((-4.0d));
        java.math.BigDecimal bigDecimal36 = bigDecimal35.abs();
        java.math.BigDecimal bigDecimal38 = bigDecimal36.scaleByPowerOfTen(1);
        java.math.BigDecimal[] bigDecimalArray39 = bigDecimal33.divideAndRemainder(bigDecimal38);
        java.math.BigDecimal bigDecimal40 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal41 = bigDecimal40.abs();
        java.math.BigDecimal bigDecimal43 = bigDecimal40.movePointRight(301);
        java.math.BigDecimal bigDecimal44 = java.math.BigDecimal.ZERO;
        double double45 = bigDecimal44.doubleValue();
        java.math.BigDecimal bigDecimal47 = bigDecimal44.movePointLeft((int) (byte) -1);
        java.math.BigDecimal bigDecimal48 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal49 = bigDecimal48.negate();
        java.math.BigDecimal bigDecimal50 = bigDecimal48.negate();
        java.lang.String str51 = bigDecimal48.toString();
        java.math.BigDecimal bigDecimal53 = bigDecimal48.scaleByPowerOfTen(0);
        java.math.BigDecimal bigDecimal54 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal55 = bigDecimal54.negate();
        java.math.BigDecimal bigDecimal56 = java.math.BigDecimal.TEN;
        long long57 = bigDecimal56.longValueExact();
        java.math.BigDecimal bigDecimal58 = bigDecimal56.ulp();
        java.lang.String str59 = bigDecimal56.toString();
        int int60 = bigDecimal54.compareTo(bigDecimal56);
        java.math.BigDecimal bigDecimal62 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal64 = bigDecimal56.divide(bigDecimal62, (int) (short) 1);
        java.math.BigDecimal bigDecimal65 = java.math.BigDecimal.TEN;
        long long66 = bigDecimal65.longValueExact();
        java.math.BigDecimal bigDecimal67 = bigDecimal64.max(bigDecimal65);
        java.math.BigDecimal bigDecimal68 = bigDecimal48.add(bigDecimal64);
        java.math.BigDecimal bigDecimal69 = bigDecimal44.multiply(bigDecimal48);
        java.math.BigDecimal bigDecimal70 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal71 = bigDecimal70.negate();
        java.math.BigDecimal bigDecimal74 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal75 = bigDecimal71.subtract(bigDecimal74);
        java.lang.String str76 = bigDecimal71.toPlainString();
        java.math.BigDecimal bigDecimal77 = java.math.BigDecimal.ZERO;
        double double78 = bigDecimal77.doubleValue();
        java.math.BigDecimal bigDecimal80 = bigDecimal77.movePointLeft((int) (byte) -1);
        java.math.BigInteger bigInteger81 = bigDecimal77.unscaledValue();
        long long82 = bigDecimal77.longValue();
        java.math.BigDecimal bigDecimal83 = bigDecimal71.subtract(bigDecimal77);
        java.math.BigDecimal bigDecimal84 = bigDecimal77.ulp();
        java.math.BigDecimal bigDecimal85 = bigDecimal69.multiply(bigDecimal77);
        java.math.BigDecimal bigDecimal86 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal87 = bigDecimal86.abs();
        java.lang.String str88 = bigDecimal87.toPlainString();
        java.math.BigDecimal bigDecimal89 = bigDecimal87.stripTrailingZeros();
        int int90 = bigDecimal89.intValue();
        java.math.BigDecimal bigDecimal91 = bigDecimal85.remainder(bigDecimal89);
        java.math.BigDecimal bigDecimal92 = bigDecimal40.subtract(bigDecimal85);
        java.math.BigDecimal bigDecimal93 = bigDecimal33.remainder(bigDecimal92);
        java.math.BigDecimal bigDecimal94 = bigDecimal30.divideToIntegralValue(bigDecimal92);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal30 and bigDecimal31", (bigDecimal30.compareTo(bigDecimal31) == 0) == bigDecimal30.equals(bigDecimal31));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigInteger bigInteger2 = bigDecimal0.toBigInteger();
        java.math.BigDecimal bigDecimal3 = java.math.BigDecimal.ZERO;
        double double4 = bigDecimal3.doubleValue();
        java.math.BigInteger bigInteger5 = bigDecimal3.toBigInteger();
        java.math.BigDecimal bigDecimal6 = bigDecimal3.negate();
        int int7 = bigDecimal6.scale();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal9 = bigDecimal8.negate();
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal13 = bigDecimal9.subtract(bigDecimal12);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal17 = bigDecimal15.min(bigDecimal16);
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal19 = bigDecimal18.negate();
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal23 = bigDecimal19.subtract(bigDecimal22);
        java.math.BigDecimal[] bigDecimalArray24 = bigDecimal16.divideAndRemainder(bigDecimal22);
        java.math.BigDecimal bigDecimal25 = bigDecimal13.min(bigDecimal22);
        java.math.BigDecimal bigDecimal26 = bigDecimal6.multiply(bigDecimal25);
        java.lang.String str27 = bigDecimal26.toString();
        java.math.BigDecimal bigDecimal28 = bigDecimal0.multiply(bigDecimal26);
        double double29 = bigDecimal0.doubleValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal26", (bigDecimal0.compareTo(bigDecimal26) == 0) == bigDecimal0.equals(bigDecimal26));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal((double) ' ');
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        int int4 = bigDecimal3.signum();
        long long5 = bigDecimal3.longValue();
        java.math.BigDecimal bigDecimal6 = bigDecimal3.abs();
        java.math.BigDecimal bigDecimal7 = bigDecimal6.stripTrailingZeros();
        int int8 = bigDecimal1.compareTo(bigDecimal6);
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal10 = bigDecimal9.negate();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.TEN;
        long long12 = bigDecimal11.longValueExact();
        java.math.BigDecimal bigDecimal13 = bigDecimal11.ulp();
        java.lang.String str14 = bigDecimal11.toString();
        int int15 = bigDecimal9.compareTo(bigDecimal11);
        short short16 = bigDecimal9.shortValueExact();
        java.math.BigDecimal bigDecimal18 = bigDecimal9.scaleByPowerOfTen((-1));
        java.math.BigDecimal bigDecimal19 = bigDecimal1.min(bigDecimal18);
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.ZERO;
        double double21 = bigDecimal20.doubleValue();
        java.math.BigInteger bigInteger22 = bigDecimal20.toBigInteger();
        byte[] byteArray25 = new byte[] { (byte) 1 };
        byte byte26 = org.apache.commons.lang3.math.NumberUtils.min(byteArray25);
        java.math.BigInteger bigInteger27 = new java.math.BigInteger((int) (short) -1, byteArray25);
        java.math.BigInteger bigInteger29 = bigInteger27.pow((int) 'a');
        byte[] byteArray30 = bigInteger27.toByteArray();
        long long31 = bigInteger27.longValueExact();
        java.math.BigInteger bigInteger32 = bigInteger22.or(bigInteger27);
        java.math.BigDecimal bigDecimal33 = new java.math.BigDecimal(bigInteger22);
        java.math.BigDecimal bigDecimal35 = bigDecimal33.scaleByPowerOfTen(32);
        boolean boolean36 = bigDecimal19.equals((java.lang.Object) bigDecimal35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal2 and bigDecimal19", (bigDecimal2.compareTo(bigDecimal19) == 0) == bigDecimal2.equals(bigDecimal19));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.TEN;
        long long3 = bigDecimal2.longValueExact();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.ulp();
        java.lang.String str5 = bigDecimal2.toString();
        int int6 = bigDecimal0.compareTo(bigDecimal2);
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal10 = bigDecimal2.divide(bigDecimal8, (int) (short) 1);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.TEN;
        long long12 = bigDecimal11.longValueExact();
        java.math.BigDecimal bigDecimal13 = bigDecimal10.max(bigDecimal11);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.TEN;
        long long15 = bigDecimal14.longValueExact();
        java.math.BigDecimal bigDecimal16 = bigDecimal14.ulp();
        java.math.BigDecimal bigDecimal17 = bigDecimal11.subtract(bigDecimal14);
        double double18 = bigDecimal14.doubleValue();
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.TEN;
        long long20 = bigDecimal19.longValueExact();
        java.math.BigDecimal bigDecimal21 = bigDecimal19.ulp();
        java.lang.String str22 = bigDecimal19.toString();
        java.math.BigDecimal bigDecimal23 = bigDecimal19.stripTrailingZeros();
        java.math.BigInteger bigInteger24 = bigDecimal23.toBigInteger();
        java.math.BigDecimal[] bigDecimalArray25 = bigDecimal14.divideAndRemainder(bigDecimal23);
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal27 = bigDecimal26.negate();
        java.math.BigDecimal bigDecimal28 = bigDecimal26.negate();
        java.lang.String str29 = bigDecimal26.toString();
        java.math.BigDecimal bigDecimal31 = new java.math.BigDecimal((double) 1L);
        java.lang.Object[] objArray34 = new java.lang.Object[] { (short) 10, (short) 100 };
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.join(objArray34, "hi!", (int) (byte) 100, (int) (short) -1);
        boolean boolean39 = bigDecimal31.equals((java.lang.Object) (short) -1);
        java.math.BigDecimal bigDecimal40 = bigDecimal26.max(bigDecimal31);
        java.math.BigDecimal bigDecimal41 = bigDecimal23.max(bigDecimal26);
        java.lang.String str42 = bigDecimal26.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal2 and bigDecimal23", (bigDecimal2.compareTo(bigDecimal23) == 0) == bigDecimal2.equals(bigDecimal23));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf((long) 'x', 120);
        java.math.BigDecimal bigDecimal3 = bigDecimal2.stripTrailingZeros();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.abs();
        java.math.BigDecimal bigDecimal6 = bigDecimal2.multiply(bigDecimal4);
        java.lang.String str7 = bigDecimal2.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal3 and bigDecimal6", (bigDecimal3.compareTo(bigDecimal6) == 0) == bigDecimal3.equals(bigDecimal6));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        byte[] byteArray7 = bigInteger6.toByteArray();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.ZERO;
        double double9 = bigDecimal8.doubleValue();
        java.math.BigInteger bigInteger10 = bigDecimal8.toBigInteger();
        byte[] byteArray13 = new byte[] { (byte) 1 };
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray13);
        java.math.BigInteger bigInteger15 = new java.math.BigInteger((int) (short) -1, byteArray13);
        java.math.BigInteger bigInteger17 = bigInteger15.pow((int) 'a');
        byte[] byteArray18 = bigInteger15.toByteArray();
        long long19 = bigInteger15.longValueExact();
        java.math.BigInteger bigInteger20 = bigInteger10.or(bigInteger15);
        byte byte21 = bigInteger15.byteValueExact();
        java.math.BigDecimal bigDecimal23 = new java.math.BigDecimal(bigInteger15, (int) (byte) 0);
        java.math.BigInteger bigInteger25 = bigInteger15.setBit(7);
        java.math.BigInteger bigInteger27 = bigInteger15.clearBit((int) (byte) 1);
        java.math.BigInteger bigInteger28 = bigInteger6.remainder(bigInteger15);
        java.math.BigDecimal bigDecimal30 = new java.math.BigDecimal(bigInteger6, 52);
        byte[] byteArray33 = new byte[] { (byte) 1 };
        byte byte34 = org.apache.commons.lang3.math.NumberUtils.min(byteArray33);
        java.math.BigInteger bigInteger35 = new java.math.BigInteger((int) (short) -1, byteArray33);
        java.math.BigInteger bigInteger37 = bigInteger35.pow((int) 'a');
        byte[] byteArray38 = bigInteger35.toByteArray();
        long long39 = bigInteger35.longValueExact();
        java.lang.String str41 = bigInteger35.toString(0);
        byte[] byteArray44 = new byte[] { (byte) 1 };
        byte byte45 = org.apache.commons.lang3.math.NumberUtils.min(byteArray44);
        java.math.BigInteger bigInteger46 = new java.math.BigInteger((int) (short) -1, byteArray44);
        java.math.BigInteger bigInteger47 = new java.math.BigInteger(byteArray44);
        boolean boolean48 = bigInteger35.equals((java.lang.Object) byteArray44);
        java.math.BigInteger bigInteger49 = new java.math.BigInteger(byteArray44);
        long long50 = bigInteger49.longValue();
        int int51 = bigInteger49.intValue();
        java.math.BigInteger bigInteger52 = bigInteger6.mod(bigInteger49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal30", (bigDecimal0.compareTo(bigDecimal30) == 0) == bigDecimal0.equals(bigDecimal30));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((long) (byte) 0);
        byte byte2 = bigDecimal1.byteValueExact();
        java.math.BigDecimal bigDecimal4 = bigDecimal1.pow(2);
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal6 = bigDecimal5.negate();
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.TEN;
        long long8 = bigDecimal7.longValueExact();
        java.math.BigDecimal bigDecimal9 = bigDecimal7.ulp();
        java.lang.String str10 = bigDecimal7.toString();
        int int11 = bigDecimal5.compareTo(bigDecimal7);
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal15 = bigDecimal7.divide(bigDecimal13, (int) (short) 1);
        java.math.BigDecimal bigDecimal16 = bigDecimal4.add(bigDecimal7);
        java.math.BigDecimal bigDecimal17 = bigDecimal7.negate();
        float float18 = bigDecimal17.floatValue();
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.ZERO;
        double double20 = bigDecimal19.doubleValue();
        java.math.BigInteger bigInteger21 = bigDecimal19.toBigInteger();
        java.math.BigDecimal bigDecimal22 = bigDecimal19.negate();
        java.math.BigDecimal bigDecimal23 = java.math.BigDecimal.ZERO;
        double double24 = bigDecimal23.doubleValue();
        java.math.BigInteger bigInteger25 = bigDecimal23.toBigInteger();
        byte[] byteArray28 = new byte[] { (byte) 1 };
        byte byte29 = org.apache.commons.lang3.math.NumberUtils.min(byteArray28);
        java.math.BigInteger bigInteger30 = new java.math.BigInteger((int) (short) -1, byteArray28);
        java.math.BigInteger bigInteger32 = bigInteger30.pow((int) 'a');
        byte[] byteArray33 = bigInteger30.toByteArray();
        long long34 = bigInteger30.longValueExact();
        java.math.BigInteger bigInteger35 = bigInteger25.or(bigInteger30);
        byte byte36 = bigInteger30.byteValueExact();
        java.math.BigDecimal bigDecimal38 = new java.math.BigDecimal(bigInteger30, (int) (byte) 0);
        java.math.BigDecimal bigDecimal40 = new java.math.BigDecimal(bigInteger30, (int) '#');
        java.math.BigDecimal bigDecimal41 = bigDecimal19.max(bigDecimal40);
        java.math.BigDecimal bigDecimal43 = bigDecimal19.setScale(3);
        java.math.BigDecimal bigDecimal45 = bigDecimal43.scaleByPowerOfTen((int) (short) -18);
        java.math.BigDecimal bigDecimal46 = bigDecimal17.max(bigDecimal43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal45", (bigDecimal1.compareTo(bigDecimal45) == 0) == bigDecimal1.equals(bigDecimal45));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigDecimal bigDecimal3 = bigDecimal0.movePointLeft((int) (byte) -1);
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal6 = bigDecimal4.negate();
        java.lang.String str7 = bigDecimal4.toString();
        java.math.BigDecimal bigDecimal9 = bigDecimal4.scaleByPowerOfTen(0);
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal11 = bigDecimal10.negate();
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.TEN;
        long long13 = bigDecimal12.longValueExact();
        java.math.BigDecimal bigDecimal14 = bigDecimal12.ulp();
        java.lang.String str15 = bigDecimal12.toString();
        int int16 = bigDecimal10.compareTo(bigDecimal12);
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal20 = bigDecimal12.divide(bigDecimal18, (int) (short) 1);
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.TEN;
        long long22 = bigDecimal21.longValueExact();
        java.math.BigDecimal bigDecimal23 = bigDecimal20.max(bigDecimal21);
        java.math.BigDecimal bigDecimal24 = bigDecimal4.add(bigDecimal20);
        java.math.BigDecimal bigDecimal25 = bigDecimal0.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.TEN;
        long long27 = bigDecimal26.longValueExact();
        java.math.BigDecimal bigDecimal28 = bigDecimal26.ulp();
        java.lang.String str29 = bigDecimal26.toString();
        java.math.BigDecimal bigDecimal30 = bigDecimal26.stripTrailingZeros();
        java.math.BigDecimal bigDecimal31 = bigDecimal4.remainder(bigDecimal30);
        java.math.BigDecimal bigDecimal33 = new java.math.BigDecimal((double) 100.0f);
        java.math.BigDecimal bigDecimal34 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal35 = bigDecimal34.negate();
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.TEN;
        long long37 = bigDecimal36.longValueExact();
        java.math.BigDecimal bigDecimal38 = bigDecimal36.ulp();
        java.lang.String str39 = bigDecimal36.toString();
        int int40 = bigDecimal34.compareTo(bigDecimal36);
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal44 = bigDecimal36.divide(bigDecimal42, (int) (short) 1);
        java.math.BigDecimal bigDecimal45 = java.math.BigDecimal.TEN;
        long long46 = bigDecimal45.longValueExact();
        java.math.BigDecimal bigDecimal47 = bigDecimal44.max(bigDecimal45);
        java.math.BigDecimal bigDecimal48 = java.math.BigDecimal.TEN;
        long long49 = bigDecimal48.longValueExact();
        java.math.BigDecimal bigDecimal50 = bigDecimal48.ulp();
        java.math.BigDecimal bigDecimal51 = bigDecimal45.subtract(bigDecimal48);
        double double52 = bigDecimal48.doubleValue();
        java.math.BigDecimal bigDecimal53 = bigDecimal33.divideToIntegralValue(bigDecimal48);
        java.math.BigDecimal bigDecimal54 = java.math.BigDecimal.ZERO;
        double double55 = bigDecimal54.doubleValue();
        java.math.BigInteger bigInteger56 = bigDecimal54.toBigInteger();
        java.lang.String str57 = bigDecimal54.toPlainString();
        java.math.BigDecimal bigDecimal58 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal59 = bigDecimal58.negate();
        java.math.BigDecimal bigDecimal60 = bigDecimal58.negate();
        int int61 = bigDecimal60.intValueExact();
        java.math.BigDecimal bigDecimal62 = bigDecimal54.max(bigDecimal60);
        int int63 = bigDecimal62.precision();
        java.math.BigDecimal bigDecimal64 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal65 = bigDecimal64.negate();
        java.math.BigDecimal bigDecimal66 = bigDecimal64.negate();
        java.lang.String str67 = bigDecimal64.toString();
        java.math.BigDecimal bigDecimal69 = bigDecimal64.scaleByPowerOfTen(0);
        java.math.BigDecimal bigDecimal70 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal71 = bigDecimal70.negate();
        java.math.BigDecimal bigDecimal72 = java.math.BigDecimal.TEN;
        long long73 = bigDecimal72.longValueExact();
        java.math.BigDecimal bigDecimal74 = bigDecimal72.ulp();
        java.lang.String str75 = bigDecimal72.toString();
        int int76 = bigDecimal70.compareTo(bigDecimal72);
        java.math.BigDecimal bigDecimal78 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal80 = bigDecimal72.divide(bigDecimal78, (int) (short) 1);
        java.math.BigDecimal bigDecimal81 = java.math.BigDecimal.TEN;
        long long82 = bigDecimal81.longValueExact();
        java.math.BigDecimal bigDecimal83 = bigDecimal80.max(bigDecimal81);
        java.math.BigDecimal bigDecimal84 = bigDecimal64.add(bigDecimal80);
        int int85 = bigDecimal62.compareTo(bigDecimal80);
        java.math.BigDecimal bigDecimal86 = bigDecimal48.subtract(bigDecimal62);
        java.math.BigDecimal[] bigDecimalArray87 = bigDecimal30.divideAndRemainder(bigDecimal48);
        java.math.BigDecimal bigDecimal88 = bigDecimal30.negate();
        long long89 = bigDecimal88.longValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal12 and bigDecimal30", (bigDecimal12.compareTo(bigDecimal30) == 0) == bigDecimal12.equals(bigDecimal30));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigInteger bigInteger2 = bigDecimal0.toBigInteger();
        java.math.BigDecimal bigDecimal3 = java.math.BigDecimal.ZERO;
        double double4 = bigDecimal3.doubleValue();
        java.math.BigInteger bigInteger5 = bigDecimal3.toBigInteger();
        java.math.BigDecimal bigDecimal6 = bigDecimal3.negate();
        int int7 = bigDecimal6.scale();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal9 = bigDecimal8.negate();
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal13 = bigDecimal9.subtract(bigDecimal12);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal17 = bigDecimal15.min(bigDecimal16);
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal19 = bigDecimal18.negate();
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal23 = bigDecimal19.subtract(bigDecimal22);
        java.math.BigDecimal[] bigDecimalArray24 = bigDecimal16.divideAndRemainder(bigDecimal22);
        java.math.BigDecimal bigDecimal25 = bigDecimal13.min(bigDecimal22);
        java.math.BigDecimal bigDecimal26 = bigDecimal6.multiply(bigDecimal25);
        java.lang.String str27 = bigDecimal26.toString();
        java.math.BigDecimal bigDecimal28 = bigDecimal0.multiply(bigDecimal26);
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.TEN;
        java.math.BigInteger bigInteger30 = bigDecimal29.toBigInteger();
        java.math.BigDecimal bigDecimal31 = bigDecimal29.negate();
        java.math.BigDecimal bigDecimal32 = bigDecimal31.stripTrailingZeros();
        int int33 = bigDecimal0.compareTo(bigDecimal32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal26", (bigDecimal0.compareTo(bigDecimal26) == 0) == bigDecimal0.equals(bigDecimal26));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        int int2 = bigDecimal1.signum();
        long long3 = bigDecimal1.longValue();
        java.math.BigDecimal bigDecimal4 = bigDecimal1.abs();
        int int5 = bigDecimal1.scale();
        byte byte6 = bigDecimal1.byteValueExact();
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal8 = bigDecimal7.negate();
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal10 = bigDecimal9.negate();
        java.math.BigDecimal bigDecimal11 = bigDecimal9.negate();
        java.lang.String str12 = bigDecimal11.toEngineeringString();
        java.math.BigDecimal bigDecimal13 = bigDecimal8.multiply(bigDecimal11);
        java.math.BigDecimal bigDecimal15 = bigDecimal11.movePointRight(100);
        byte[] byteArray18 = new byte[] { (byte) 1 };
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.min(byteArray18);
        java.math.BigInteger bigInteger20 = new java.math.BigInteger((int) (short) -1, byteArray18);
        java.math.BigInteger bigInteger22 = bigInteger20.pow((int) 'a');
        java.math.BigDecimal bigDecimal24 = new java.math.BigDecimal(bigInteger22, (int) (byte) 0);
        java.util.Locale locale25 = java.util.Locale.PRC;
        java.lang.String str26 = locale25.getISO3Language();
        boolean boolean27 = bigDecimal24.equals((java.lang.Object) str26);
        java.math.BigDecimal bigDecimal30 = bigDecimal11.divide(bigDecimal24, (int) (short) 100, (int) (short) 1);
        java.math.BigDecimal bigDecimal31 = bigDecimal1.max(bigDecimal30);
        java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal33 = bigDecimal32.negate();
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal37 = bigDecimal33.subtract(bigDecimal36);
        java.lang.String str38 = bigDecimal33.toPlainString();
        java.lang.String str39 = bigDecimal33.toPlainString();
        long[] longArray46 = new long[] { (byte) 1, (short) 100, 1L, (byte) 100, '4', 1L };
        long long47 = org.apache.commons.lang3.math.NumberUtils.min(longArray46);
        boolean boolean48 = bigDecimal33.equals((java.lang.Object) long47);
        java.math.BigDecimal bigDecimal49 = bigDecimal30.add(bigDecimal33);
        float float50 = bigDecimal49.floatValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal30", (bigDecimal0.compareTo(bigDecimal30) == 0) == bigDecimal0.equals(bigDecimal30));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.ulp();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal4 = bigDecimal0.stripTrailingZeros();
        java.math.BigDecimal bigDecimal6 = bigDecimal4.movePointRight(0);
        double double7 = bigDecimal6.doubleValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal6 and bigDecimal4", (bigDecimal6.compareTo(bigDecimal4) == 0) == bigDecimal6.equals(bigDecimal4));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.negate();
        int int3 = bigDecimal2.intValueExact();
        java.math.BigInteger bigInteger4 = bigDecimal2.toBigInteger();
        java.math.BigDecimal bigDecimal6 = new java.math.BigDecimal(0L);
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal8 = bigDecimal7.negate();
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.TEN;
        long long10 = bigDecimal9.longValueExact();
        java.math.BigDecimal bigDecimal11 = bigDecimal9.ulp();
        java.lang.String str12 = bigDecimal9.toString();
        int int13 = bigDecimal7.compareTo(bigDecimal9);
        int int14 = bigDecimal9.precision();
        int int15 = bigDecimal9.precision();
        java.math.BigDecimal bigDecimal16 = bigDecimal6.divideToIntegralValue(bigDecimal9);
        java.math.BigDecimal bigDecimal17 = bigDecimal2.divideToIntegralValue(bigDecimal9);
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.valueOf((long) (byte) -1, 0);
        java.math.BigDecimal bigDecimal21 = bigDecimal20.plus();
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.TEN;
        long long23 = bigDecimal22.longValueExact();
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.ZERO;
        double double25 = bigDecimal24.doubleValue();
        java.math.BigDecimal bigDecimal27 = bigDecimal24.movePointLeft((int) (byte) -1);
        int int28 = bigDecimal27.intValue();
        java.math.BigDecimal bigDecimal29 = bigDecimal22.add(bigDecimal27);
        java.math.BigDecimal bigDecimal30 = bigDecimal20.multiply(bigDecimal29);
        java.math.BigDecimal bigDecimal33 = java.math.BigDecimal.valueOf((long) (-1), (int) 'u');
        java.math.BigDecimal bigDecimal34 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal35 = bigDecimal34.abs();
        java.math.BigDecimal bigDecimal36 = bigDecimal33.min(bigDecimal35);
        java.math.BigDecimal bigDecimal38 = java.math.BigDecimal.valueOf((double) (-1.0f));
        int int39 = bigDecimal35.compareTo(bigDecimal38);
        java.math.BigDecimal[] bigDecimalArray40 = bigDecimal20.divideAndRemainder(bigDecimal38);
        java.math.BigDecimal bigDecimal41 = bigDecimal2.max(bigDecimal38);
        float float42 = bigDecimal2.floatValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal20 and bigDecimal38", (bigDecimal20.compareTo(bigDecimal38) == 0) == bigDecimal20.equals(bigDecimal38));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf((long) 'x', 120);
        java.math.BigDecimal bigDecimal3 = bigDecimal2.stripTrailingZeros();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.abs();
        java.math.BigDecimal bigDecimal6 = bigDecimal2.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal7 = bigDecimal4.abs();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal2 and bigDecimal3", (bigDecimal2.compareTo(bigDecimal3) == 0) == bigDecimal2.equals(bigDecimal3));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigDecimal bigDecimal3 = bigDecimal0.movePointLeft((int) (byte) -1);
        java.math.BigDecimal bigDecimal5 = bigDecimal0.movePointRight((int) (short) 1);
        java.math.BigDecimal bigDecimal7 = bigDecimal5.movePointLeft((int) '4');
        java.math.BigInteger bigInteger8 = bigDecimal7.toBigIntegerExact();
        java.math.BigInteger bigInteger9 = bigInteger8.negate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal7", (bigDecimal0.compareTo(bigDecimal7) == 0) == bigDecimal0.equals(bigDecimal7));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigInteger bigInteger2 = bigDecimal0.toBigInteger();
        java.math.BigDecimal bigDecimal3 = bigDecimal0.negate();
        int int4 = bigDecimal3.scale();
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal6 = bigDecimal5.negate();
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal10 = bigDecimal6.subtract(bigDecimal9);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal12 = bigDecimal11.negate();
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal14 = bigDecimal12.min(bigDecimal13);
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal16 = bigDecimal15.negate();
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal20 = bigDecimal16.subtract(bigDecimal19);
        java.math.BigDecimal[] bigDecimalArray21 = bigDecimal13.divideAndRemainder(bigDecimal19);
        java.math.BigDecimal bigDecimal22 = bigDecimal10.min(bigDecimal19);
        java.math.BigDecimal bigDecimal23 = bigDecimal3.multiply(bigDecimal22);
        java.math.BigDecimal bigDecimal24 = bigDecimal22.stripTrailingZeros();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal23", (bigDecimal0.compareTo(bigDecimal23) == 0) == bigDecimal0.equals(bigDecimal23));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((double) 117);
        double double2 = bigDecimal1.doubleValue();
        java.math.BigDecimal bigDecimal3 = bigDecimal1.abs();
        java.math.BigDecimal bigDecimal5 = bigDecimal1.setScale(2);
        byte[] byteArray7 = new byte[] { (byte) 1 };
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray7);
        java.math.BigInteger bigInteger9 = new java.math.BigInteger(byteArray7);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray7);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray7);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger(byteArray7);
        java.math.BigDecimal bigDecimal14 = new java.math.BigDecimal(bigInteger12, (int) (byte) 1);
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal17 = bigDecimal14.movePointLeft(11);
        java.math.BigDecimal bigDecimal18 = bigDecimal1.max(bigDecimal14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal18 and bigDecimal5", (bigDecimal18.compareTo(bigDecimal5) == 0) == bigDecimal18.equals(bigDecimal5));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.ulp();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.TEN;
        long long5 = bigDecimal4.longValueExact();
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.ZERO;
        double double7 = bigDecimal6.doubleValue();
        java.math.BigDecimal bigDecimal9 = bigDecimal6.movePointLeft((int) (byte) -1);
        int int10 = bigDecimal9.intValue();
        java.math.BigDecimal bigDecimal11 = bigDecimal4.add(bigDecimal9);
        java.math.BigDecimal bigDecimal12 = bigDecimal0.add(bigDecimal11);
        java.math.BigDecimal bigDecimal14 = bigDecimal0.scaleByPowerOfTen((int) 'u');
        java.math.BigDecimal bigDecimal16 = new java.math.BigDecimal((int) (short) 16);
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.ZERO;
        double double18 = bigDecimal17.doubleValue();
        java.math.BigInteger bigInteger19 = bigDecimal17.toBigInteger();
        java.lang.String str20 = bigDecimal17.toPlainString();
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal22 = bigDecimal21.negate();
        java.math.BigDecimal bigDecimal23 = bigDecimal21.negate();
        int int24 = bigDecimal23.intValueExact();
        java.math.BigDecimal bigDecimal25 = bigDecimal17.max(bigDecimal23);
        java.math.BigDecimal bigDecimal26 = bigDecimal25.abs();
        int int27 = bigDecimal25.intValueExact();
        java.math.BigDecimal bigDecimal28 = bigDecimal16.subtract(bigDecimal25);
        java.math.BigDecimal bigDecimal29 = bigDecimal14.remainder(bigDecimal16);
        long long30 = bigDecimal16.longValueExact();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal6 and bigDecimal29", (bigDecimal6.compareTo(bigDecimal29) == 0) == bigDecimal6.equals(bigDecimal29));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte byte8 = bigInteger6.byteValueExact();
        java.math.BigDecimal bigDecimal10 = new java.math.BigDecimal(bigInteger6, (int) (byte) -1);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal12 = bigDecimal11.negate();
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal14 = bigDecimal13.negate();
        java.math.BigDecimal bigDecimal15 = bigDecimal13.negate();
        java.lang.String str16 = bigDecimal15.toEngineeringString();
        java.math.BigDecimal bigDecimal17 = bigDecimal12.multiply(bigDecimal15);
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal19 = bigDecimal18.negate();
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal23 = bigDecimal19.subtract(bigDecimal22);
        java.math.BigInteger bigInteger24 = bigDecimal23.toBigInteger();
        java.math.BigDecimal bigDecimal25 = bigDecimal17.divideToIntegralValue(bigDecimal23);
        int int26 = bigDecimal10.compareTo(bigDecimal25);
        java.math.BigDecimal bigDecimal27 = bigDecimal25.abs();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal10", (bigDecimal0.compareTo(bigDecimal10) == 0) == bigDecimal0.equals(bigDecimal10));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal19 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        java.math.BigInteger bigInteger21 = bigInteger12.or(bigInteger20);
        short short22 = bigInteger12.shortValueExact();
        byte[] byteArray25 = new byte[] { (byte) 1 };
        byte byte26 = org.apache.commons.lang3.math.NumberUtils.min(byteArray25);
        java.math.BigInteger bigInteger27 = new java.math.BigInteger((int) (short) -1, byteArray25);
        java.math.BigInteger bigInteger29 = bigInteger27.pow((int) 'a');
        java.math.BigInteger bigInteger31 = bigInteger27.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger32 = bigInteger12.xor(bigInteger31);
        java.math.BigDecimal bigDecimal33 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal34 = bigDecimal33.negate();
        java.math.BigDecimal bigDecimal35 = java.math.BigDecimal.TEN;
        long long36 = bigDecimal35.longValueExact();
        java.math.BigDecimal bigDecimal37 = bigDecimal35.ulp();
        java.lang.String str38 = bigDecimal35.toString();
        int int39 = bigDecimal33.compareTo(bigDecimal35);
        java.math.BigInteger bigInteger40 = bigDecimal33.toBigInteger();
        java.math.BigInteger bigInteger41 = bigInteger32.gcd(bigInteger40);
        java.math.BigDecimal bigDecimal42 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal43 = bigDecimal42.negate();
        java.math.BigDecimal bigDecimal46 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal47 = bigDecimal43.subtract(bigDecimal46);
        java.math.BigInteger bigInteger48 = bigDecimal47.toBigInteger();
        double double49 = bigInteger48.doubleValue();
        byte[] byteArray52 = new byte[] { (byte) 1 };
        byte byte53 = org.apache.commons.lang3.math.NumberUtils.min(byteArray52);
        java.math.BigInteger bigInteger54 = new java.math.BigInteger((int) (short) -1, byteArray52);
        java.math.BigInteger bigInteger55 = bigInteger48.gcd(bigInteger54);
        java.math.BigDecimal bigDecimal56 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal57 = bigDecimal56.negate();
        java.math.BigDecimal bigDecimal60 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal61 = bigDecimal57.subtract(bigDecimal60);
        java.math.BigInteger bigInteger62 = bigDecimal61.toBigInteger();
        java.math.BigInteger bigInteger63 = bigInteger54.or(bigInteger62);
        java.math.BigInteger bigInteger65 = bigInteger62.shiftRight((int) (short) -1);
        long long66 = bigInteger65.longValue();
        java.math.BigInteger bigInteger67 = bigInteger40.gcd(bigInteger65);
        java.math.BigDecimal bigDecimal69 = new java.math.BigDecimal(bigInteger40, 299);
        long long70 = bigInteger40.longValueExact();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal69", (bigDecimal0.compareTo(bigDecimal69) == 0) == bigDecimal0.equals(bigDecimal69));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal1.abs();
        int int3 = bigDecimal1.intValueExact();
        java.math.BigInteger bigInteger4 = bigDecimal1.toBigInteger();
        java.math.BigDecimal bigDecimal5 = bigDecimal1.plus();
        java.lang.String str6 = bigDecimal1.toEngineeringString();
        java.math.BigDecimal bigDecimal8 = bigDecimal1.scaleByPowerOfTen((int) (short) -16960);
        java.math.BigDecimal bigDecimal10 = bigDecimal1.setScale((int) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal10 and bigDecimal8", (bigDecimal10.compareTo(bigDecimal8) == 0) == bigDecimal10.equals(bigDecimal8));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((double) 117);
        double double2 = bigDecimal1.doubleValue();
        java.math.BigDecimal bigDecimal3 = bigDecimal1.abs();
        java.math.BigDecimal bigDecimal5 = bigDecimal1.setScale(2);
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.valueOf((long) (byte) 10);
        float float8 = bigDecimal7.floatValue();
        java.math.BigDecimal bigDecimal9 = bigDecimal1.divideToIntegralValue(bigDecimal7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal5", (bigDecimal1.compareTo(bigDecimal5) == 0) == bigDecimal1.equals(bigDecimal5));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigDecimal bigDecimal6 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal7 = bigDecimal6.negate();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal9 = bigDecimal7.min(bigDecimal8);
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal11 = bigDecimal10.negate();
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal15 = bigDecimal11.subtract(bigDecimal14);
        java.math.BigDecimal[] bigDecimalArray16 = bigDecimal8.divideAndRemainder(bigDecimal14);
        java.math.BigDecimal bigDecimal17 = bigDecimal5.min(bigDecimal14);
        java.math.BigDecimal bigDecimal18 = bigDecimal17.ulp();
        java.math.BigDecimal bigDecimal19 = bigDecimal17.stripTrailingZeros();
        byte[] byteArray22 = new byte[] { (byte) 1 };
        byte byte23 = org.apache.commons.lang3.math.NumberUtils.min(byteArray22);
        java.math.BigInteger bigInteger24 = new java.math.BigInteger((int) (short) -1, byteArray22);
        java.math.BigInteger bigInteger26 = bigInteger24.pow((int) 'a');
        java.math.BigInteger bigInteger28 = bigInteger24.flipBit((int) 'a');
        java.math.BigDecimal bigDecimal29 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal30 = bigDecimal29.negate();
        java.math.BigDecimal bigDecimal33 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal34 = bigDecimal30.subtract(bigDecimal33);
        java.math.BigInteger bigInteger35 = bigDecimal34.toBigInteger();
        byte[] byteArray36 = bigInteger35.toByteArray();
        java.math.BigDecimal bigDecimal37 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal38 = bigDecimal37.negate();
        java.math.BigDecimal bigDecimal41 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal42 = bigDecimal38.subtract(bigDecimal41);
        java.math.BigInteger bigInteger43 = bigDecimal42.toBigInteger();
        double double44 = bigInteger43.doubleValue();
        byte[] byteArray47 = new byte[] { (byte) 1 };
        byte byte48 = org.apache.commons.lang3.math.NumberUtils.min(byteArray47);
        java.math.BigInteger bigInteger49 = new java.math.BigInteger((int) (short) -1, byteArray47);
        java.math.BigInteger bigInteger50 = bigInteger43.gcd(bigInteger49);
        java.math.BigDecimal bigDecimal51 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal52 = bigDecimal51.negate();
        java.math.BigDecimal bigDecimal55 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal56 = bigDecimal52.subtract(bigDecimal55);
        java.math.BigInteger bigInteger57 = bigDecimal56.toBigInteger();
        java.math.BigInteger bigInteger58 = bigInteger49.or(bigInteger57);
        java.math.BigInteger bigInteger59 = bigInteger35.or(bigInteger57);
        java.math.BigInteger bigInteger61 = bigInteger57.pow(5);
        java.math.BigDecimal bigDecimal62 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal63 = bigDecimal62.negate();
        java.math.BigDecimal bigDecimal66 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal67 = bigDecimal63.subtract(bigDecimal66);
        java.math.BigInteger bigInteger68 = bigDecimal67.toBigInteger();
        double double69 = bigInteger68.doubleValue();
        byte[] byteArray72 = new byte[] { (byte) 1 };
        byte byte73 = org.apache.commons.lang3.math.NumberUtils.min(byteArray72);
        java.math.BigInteger bigInteger74 = new java.math.BigInteger((int) (short) -1, byteArray72);
        java.math.BigInteger bigInteger75 = bigInteger68.gcd(bigInteger74);
        java.math.BigDecimal bigDecimal76 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal77 = bigDecimal76.negate();
        java.math.BigDecimal bigDecimal80 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal81 = bigDecimal77.subtract(bigDecimal80);
        java.math.BigInteger bigInteger82 = bigDecimal81.toBigInteger();
        java.math.BigInteger bigInteger83 = bigInteger74.or(bigInteger82);
        java.math.BigInteger bigInteger84 = bigInteger82.abs();
        java.math.BigInteger bigInteger85 = bigInteger57.and(bigInteger82);
        java.math.BigInteger bigInteger86 = bigInteger28.xor(bigInteger82);
        boolean boolean87 = bigDecimal17.equals((java.lang.Object) bigInteger28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal17 and bigDecimal19", (bigDecimal17.compareTo(bigDecimal19) == 0) == bigDecimal17.equals(bigDecimal19));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigDecimal bigDecimal3 = bigDecimal0.movePointLeft((int) (byte) -1);
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal6 = bigDecimal4.negate();
        java.lang.String str7 = bigDecimal4.toString();
        java.math.BigDecimal bigDecimal9 = bigDecimal4.scaleByPowerOfTen(0);
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal11 = bigDecimal10.negate();
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.TEN;
        long long13 = bigDecimal12.longValueExact();
        java.math.BigDecimal bigDecimal14 = bigDecimal12.ulp();
        java.lang.String str15 = bigDecimal12.toString();
        int int16 = bigDecimal10.compareTo(bigDecimal12);
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal20 = bigDecimal12.divide(bigDecimal18, (int) (short) 1);
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.TEN;
        long long22 = bigDecimal21.longValueExact();
        java.math.BigDecimal bigDecimal23 = bigDecimal20.max(bigDecimal21);
        java.math.BigDecimal bigDecimal24 = bigDecimal4.add(bigDecimal20);
        java.math.BigDecimal bigDecimal25 = bigDecimal0.multiply(bigDecimal4);
        java.math.BigDecimal bigDecimal26 = bigDecimal25.ulp();
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.valueOf((long) (byte) 10);
        java.math.BigDecimal bigDecimal30 = bigDecimal28.scaleByPowerOfTen((int) (short) 1);
        java.math.BigDecimal bigDecimal31 = bigDecimal25.divide(bigDecimal28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal18 and bigDecimal30", (bigDecimal18.compareTo(bigDecimal30) == 0) == bigDecimal18.equals(bigDecimal30));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.ulp();
        java.math.BigDecimal bigDecimal3 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal4 = bigDecimal3.negate();
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.TEN;
        long long6 = bigDecimal5.longValueExact();
        java.math.BigDecimal bigDecimal7 = bigDecimal5.ulp();
        java.lang.String str8 = bigDecimal5.toString();
        int int9 = bigDecimal3.compareTo(bigDecimal5);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal13 = bigDecimal5.divide(bigDecimal11, (int) (short) 1);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.TEN;
        long long15 = bigDecimal14.longValueExact();
        java.math.BigDecimal bigDecimal16 = bigDecimal13.max(bigDecimal14);
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.TEN;
        long long18 = bigDecimal17.longValueExact();
        java.math.BigDecimal bigDecimal19 = bigDecimal17.ulp();
        java.math.BigDecimal bigDecimal20 = bigDecimal14.subtract(bigDecimal17);
        java.math.BigDecimal bigDecimal23 = java.math.BigDecimal.valueOf((long) (-1), (int) 'u');
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal25 = bigDecimal24.abs();
        java.math.BigDecimal bigDecimal26 = bigDecimal23.min(bigDecimal25);
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.valueOf((double) (-1.0f));
        int int29 = bigDecimal25.compareTo(bigDecimal28);
        java.math.BigDecimal bigDecimal30 = bigDecimal20.divide(bigDecimal28);
        java.math.BigDecimal bigDecimal31 = bigDecimal0.subtract(bigDecimal30);
        java.math.BigDecimal bigDecimal34 = java.math.BigDecimal.valueOf((long) 7, (int) '4');
        int int35 = bigDecimal34.precision();
        java.math.BigDecimal bigDecimal36 = bigDecimal31.max(bigDecimal34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal3 and bigDecimal30", (bigDecimal3.compareTo(bigDecimal30) == 0) == bigDecimal3.equals(bigDecimal30));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal2 = bigDecimal0.movePointLeft((int) (byte) 0);
        long long3 = bigDecimal0.longValue();
        java.lang.String str4 = bigDecimal0.toEngineeringString();
        java.math.BigDecimal bigDecimal5 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal6 = bigDecimal5.negate();
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal8 = bigDecimal7.negate();
        java.math.BigDecimal bigDecimal9 = bigDecimal7.negate();
        java.lang.String str10 = bigDecimal9.toEngineeringString();
        java.math.BigDecimal bigDecimal11 = bigDecimal6.multiply(bigDecimal9);
        java.math.BigDecimal bigDecimal13 = bigDecimal9.movePointRight(100);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal16 = bigDecimal14.negate();
        int int17 = bigDecimal13.compareTo(bigDecimal14);
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal19 = bigDecimal18.negate();
        java.math.BigDecimal bigDecimal20 = bigDecimal13.add(bigDecimal19);
        java.math.BigDecimal bigDecimal21 = bigDecimal19.plus();
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.TEN;
        long long23 = bigDecimal22.longValueExact();
        java.math.BigDecimal bigDecimal24 = bigDecimal22.ulp();
        java.lang.String str25 = bigDecimal22.toString();
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.TEN;
        long long27 = bigDecimal26.longValueExact();
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.ZERO;
        double double29 = bigDecimal28.doubleValue();
        java.math.BigDecimal bigDecimal31 = bigDecimal28.movePointLeft((int) (byte) -1);
        int int32 = bigDecimal31.intValue();
        java.math.BigDecimal bigDecimal33 = bigDecimal26.add(bigDecimal31);
        java.math.BigDecimal bigDecimal34 = bigDecimal22.add(bigDecimal33);
        java.math.BigDecimal bigDecimal35 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal36 = bigDecimal35.negate();
        java.math.BigDecimal bigDecimal37 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal38 = bigDecimal37.negate();
        java.math.BigDecimal bigDecimal39 = bigDecimal37.negate();
        java.lang.String str40 = bigDecimal39.toEngineeringString();
        java.math.BigDecimal bigDecimal41 = bigDecimal36.multiply(bigDecimal39);
        java.math.BigDecimal bigDecimal43 = bigDecimal39.movePointRight(100);
        java.math.BigDecimal bigDecimal44 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal45 = bigDecimal44.negate();
        java.math.BigDecimal bigDecimal46 = bigDecimal44.negate();
        int int47 = bigDecimal43.compareTo(bigDecimal44);
        java.math.BigDecimal bigDecimal48 = bigDecimal22.min(bigDecimal43);
        java.math.BigDecimal bigDecimal49 = bigDecimal19.remainder(bigDecimal22);
        java.math.BigDecimal bigDecimal50 = bigDecimal0.max(bigDecimal49);
        java.math.BigDecimal bigDecimal51 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal52 = bigDecimal51.negate();
        java.math.BigDecimal bigDecimal53 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal54 = bigDecimal53.negate();
        java.math.BigDecimal bigDecimal55 = bigDecimal53.negate();
        java.lang.String str56 = bigDecimal55.toEngineeringString();
        java.math.BigDecimal bigDecimal57 = bigDecimal52.multiply(bigDecimal55);
        java.math.BigDecimal bigDecimal58 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal59 = bigDecimal58.negate();
        java.math.BigDecimal bigDecimal62 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal63 = bigDecimal59.subtract(bigDecimal62);
        java.math.BigInteger bigInteger64 = bigDecimal63.toBigInteger();
        java.math.BigDecimal bigDecimal65 = bigDecimal57.divideToIntegralValue(bigDecimal63);
        java.math.BigDecimal bigDecimal66 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal67 = bigDecimal66.negate();
        java.math.BigDecimal bigDecimal68 = bigDecimal67.abs();
        int int69 = bigDecimal67.intValueExact();
        boolean boolean70 = bigDecimal65.equals((java.lang.Object) int69);
        java.math.BigDecimal bigDecimal71 = bigDecimal65.plus();
        java.math.BigDecimal bigDecimal72 = bigDecimal50.subtract(bigDecimal71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal72 and bigDecimal71", (bigDecimal72.compareTo(bigDecimal71) == 0) == bigDecimal72.equals(bigDecimal71));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigInteger bigInteger2 = bigDecimal0.toBigInteger();
        byte[] byteArray5 = new byte[] { (byte) 1 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.math.BigInteger bigInteger7 = new java.math.BigInteger((int) (short) -1, byteArray5);
        java.math.BigInteger bigInteger9 = bigInteger7.pow((int) 'a');
        byte[] byteArray10 = bigInteger7.toByteArray();
        long long11 = bigInteger7.longValueExact();
        java.math.BigInteger bigInteger12 = bigInteger2.or(bigInteger7);
        byte[] byteArray15 = new byte[] { (byte) 1 };
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.min(byteArray15);
        java.math.BigInteger bigInteger17 = new java.math.BigInteger((int) (short) -1, byteArray15);
        java.math.BigInteger bigInteger19 = bigInteger17.pow((int) 'a');
        java.math.BigInteger bigInteger21 = bigInteger17.shiftLeft((int) (short) 1);
        boolean boolean23 = bigInteger21.isProbablePrime((int) '4');
        java.math.BigInteger bigInteger24 = bigInteger7.divide(bigInteger21);
        long long25 = bigInteger7.longValue();
        byte byte26 = bigInteger7.byteValueExact();
        java.math.BigInteger bigInteger28 = bigInteger7.shiftRight(11);
        java.math.BigDecimal bigDecimal30 = new java.math.BigDecimal(bigInteger7, 117);
        java.math.BigDecimal bigDecimal31 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal32 = bigDecimal31.negate();
        java.math.BigDecimal bigDecimal35 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal36 = bigDecimal32.subtract(bigDecimal35);
        java.math.BigInteger bigInteger37 = bigDecimal36.toBigInteger();
        java.math.BigDecimal bigDecimal38 = bigDecimal36.negate();
        java.math.BigDecimal bigDecimal39 = bigDecimal30.add(bigDecimal38);
        java.math.BigDecimal bigDecimal40 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal41 = bigDecimal40.negate();
        java.math.BigDecimal bigDecimal42 = bigDecimal40.negate();
        java.lang.String str43 = bigDecimal40.toString();
        java.math.BigDecimal bigDecimal45 = new java.math.BigDecimal((double) 1L);
        java.lang.Object[] objArray48 = new java.lang.Object[] { (short) 10, (short) 100 };
        java.lang.String str52 = org.apache.commons.lang3.StringUtils.join(objArray48, "hi!", (int) (byte) 100, (int) (short) -1);
        boolean boolean53 = bigDecimal45.equals((java.lang.Object) (short) -1);
        java.math.BigDecimal bigDecimal54 = bigDecimal40.max(bigDecimal45);
        java.math.BigDecimal bigDecimal55 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal56 = bigDecimal55.negate();
        java.math.BigDecimal bigDecimal59 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal60 = bigDecimal56.subtract(bigDecimal59);
        java.math.BigDecimal bigDecimal61 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal62 = bigDecimal59.min(bigDecimal61);
        java.math.BigDecimal bigDecimal64 = bigDecimal62.movePointRight((int) (short) -2);
        java.math.BigDecimal bigDecimal65 = bigDecimal40.min(bigDecimal62);
        java.math.BigDecimal bigDecimal66 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal67 = bigDecimal66.negate();
        java.math.BigDecimal bigDecimal68 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal69 = bigDecimal68.negate();
        java.math.BigDecimal bigDecimal70 = bigDecimal68.negate();
        java.lang.String str71 = bigDecimal70.toEngineeringString();
        java.math.BigDecimal bigDecimal72 = bigDecimal67.multiply(bigDecimal70);
        java.math.BigDecimal bigDecimal73 = bigDecimal40.subtract(bigDecimal70);
        java.math.BigDecimal bigDecimal75 = bigDecimal73.setScale((int) (byte) 1);
        int int76 = bigDecimal39.compareTo(bigDecimal75);
        java.math.BigDecimal bigDecimal77 = bigDecimal75.negate();
        short short78 = bigDecimal77.shortValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal77", (bigDecimal0.compareTo(bigDecimal77) == 0) == bigDecimal0.equals(bigDecimal77));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal5 = bigDecimal1.subtract(bigDecimal4);
        java.math.BigInteger bigInteger6 = bigDecimal5.toBigInteger();
        double double7 = bigInteger6.doubleValue();
        byte[] byteArray10 = new byte[] { (byte) 1 };
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray10);
        java.math.BigInteger bigInteger12 = new java.math.BigInteger((int) (short) -1, byteArray10);
        java.math.BigInteger bigInteger13 = bigInteger6.gcd(bigInteger12);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal15 = bigDecimal14.negate();
        java.math.BigDecimal bigDecimal18 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal19 = bigDecimal15.subtract(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        java.math.BigInteger bigInteger21 = bigInteger12.or(bigInteger20);
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal23 = bigDecimal22.negate();
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal27 = bigDecimal23.subtract(bigDecimal26);
        java.math.BigInteger bigInteger28 = bigDecimal27.toBigInteger();
        double double29 = bigInteger28.doubleValue();
        byte[] byteArray32 = new byte[] { (byte) 1 };
        byte byte33 = org.apache.commons.lang3.math.NumberUtils.min(byteArray32);
        java.math.BigInteger bigInteger34 = new java.math.BigInteger((int) (short) -1, byteArray32);
        java.math.BigInteger bigInteger35 = bigInteger28.gcd(bigInteger34);
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal37 = bigDecimal36.negate();
        java.math.BigDecimal bigDecimal40 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal41 = bigDecimal37.subtract(bigDecimal40);
        java.math.BigInteger bigInteger42 = bigDecimal41.toBigInteger();
        java.math.BigInteger bigInteger43 = bigInteger34.or(bigInteger42);
        short short44 = bigInteger34.shortValueExact();
        byte[] byteArray47 = new byte[] { (byte) 1 };
        byte byte48 = org.apache.commons.lang3.math.NumberUtils.min(byteArray47);
        java.math.BigInteger bigInteger49 = new java.math.BigInteger((int) (short) -1, byteArray47);
        java.math.BigInteger bigInteger51 = bigInteger49.pow((int) 'a');
        java.math.BigInteger bigInteger53 = bigInteger49.shiftLeft((int) (short) 1);
        java.math.BigInteger bigInteger54 = bigInteger34.xor(bigInteger53);
        java.math.BigInteger bigInteger55 = bigInteger53.not();
        java.math.BigInteger bigInteger56 = bigInteger12.mod(bigInteger55);
        java.math.BigDecimal bigDecimal57 = new java.math.BigDecimal(bigInteger56);
        java.math.BigDecimal bigDecimal60 = bigDecimal57.setScale((int) (short) -2, (int) (byte) 6);
        byte byte61 = bigDecimal57.byteValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal60", (bigDecimal0.compareTo(bigDecimal60) == 0) == bigDecimal0.equals(bigDecimal60));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        int int2 = bigDecimal1.signum();
        long long3 = bigDecimal1.longValue();
        java.math.BigDecimal bigDecimal4 = bigDecimal1.abs();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray7);
        java.math.BigInteger bigInteger9 = new java.math.BigInteger((int) (short) -1, byteArray7);
        java.math.BigInteger bigInteger11 = bigInteger9.pow((int) 'a');
        java.math.BigDecimal bigDecimal13 = new java.math.BigDecimal(bigInteger11, (int) (byte) 0);
        int int14 = bigDecimal13.signum();
        java.math.BigDecimal bigDecimal15 = bigDecimal4.divideToIntegralValue(bigDecimal13);
        int int16 = bigDecimal4.signum();
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal18 = bigDecimal17.negate();
        int int19 = bigDecimal18.signum();
        long long20 = bigDecimal18.longValue();
        java.math.BigDecimal bigDecimal21 = bigDecimal18.abs();
        int int22 = bigDecimal18.scale();
        byte byte23 = bigDecimal18.byteValueExact();
        java.math.BigDecimal bigDecimal24 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal25 = bigDecimal24.negate();
        java.math.BigDecimal bigDecimal26 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal27 = bigDecimal26.negate();
        java.math.BigDecimal bigDecimal28 = bigDecimal26.negate();
        java.lang.String str29 = bigDecimal28.toEngineeringString();
        java.math.BigDecimal bigDecimal30 = bigDecimal25.multiply(bigDecimal28);
        java.math.BigDecimal bigDecimal32 = bigDecimal28.movePointRight(100);
        byte[] byteArray35 = new byte[] { (byte) 1 };
        byte byte36 = org.apache.commons.lang3.math.NumberUtils.min(byteArray35);
        java.math.BigInteger bigInteger37 = new java.math.BigInteger((int) (short) -1, byteArray35);
        java.math.BigInteger bigInteger39 = bigInteger37.pow((int) 'a');
        java.math.BigDecimal bigDecimal41 = new java.math.BigDecimal(bigInteger39, (int) (byte) 0);
        java.util.Locale locale42 = java.util.Locale.PRC;
        java.lang.String str43 = locale42.getISO3Language();
        boolean boolean44 = bigDecimal41.equals((java.lang.Object) str43);
        java.math.BigDecimal bigDecimal47 = bigDecimal28.divide(bigDecimal41, (int) (short) 100, (int) (short) 1);
        java.math.BigDecimal bigDecimal48 = bigDecimal18.max(bigDecimal47);
        java.math.BigDecimal bigDecimal49 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal50 = bigDecimal49.negate();
        java.math.BigDecimal bigDecimal53 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal54 = bigDecimal50.subtract(bigDecimal53);
        java.lang.String str55 = bigDecimal50.toPlainString();
        java.lang.String str56 = bigDecimal50.toPlainString();
        long[] longArray63 = new long[] { (byte) 1, (short) 100, 1L, (byte) 100, '4', 1L };
        long long64 = org.apache.commons.lang3.math.NumberUtils.min(longArray63);
        boolean boolean65 = bigDecimal50.equals((java.lang.Object) long64);
        java.math.BigDecimal bigDecimal66 = bigDecimal47.add(bigDecimal50);
        int int67 = bigDecimal4.compareTo(bigDecimal66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal4 and bigDecimal47", (bigDecimal4.compareTo(bigDecimal47) == 0) == bigDecimal4.equals(bigDecimal47));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        int int2 = bigDecimal1.signum();
        long long3 = bigDecimal1.longValue();
        java.math.BigDecimal bigDecimal4 = bigDecimal1.abs();
        int int5 = bigDecimal1.scale();
        byte byte6 = bigDecimal1.byteValueExact();
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal8 = bigDecimal7.negate();
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal10 = bigDecimal9.negate();
        java.math.BigDecimal bigDecimal11 = bigDecimal9.negate();
        java.lang.String str12 = bigDecimal11.toEngineeringString();
        java.math.BigDecimal bigDecimal13 = bigDecimal8.multiply(bigDecimal11);
        java.math.BigDecimal bigDecimal15 = bigDecimal11.movePointRight(100);
        byte[] byteArray18 = new byte[] { (byte) 1 };
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.min(byteArray18);
        java.math.BigInteger bigInteger20 = new java.math.BigInteger((int) (short) -1, byteArray18);
        java.math.BigInteger bigInteger22 = bigInteger20.pow((int) 'a');
        java.math.BigDecimal bigDecimal24 = new java.math.BigDecimal(bigInteger22, (int) (byte) 0);
        java.util.Locale locale25 = java.util.Locale.PRC;
        java.lang.String str26 = locale25.getISO3Language();
        boolean boolean27 = bigDecimal24.equals((java.lang.Object) str26);
        java.math.BigDecimal bigDecimal30 = bigDecimal11.divide(bigDecimal24, (int) (short) 100, (int) (short) 1);
        java.math.BigDecimal bigDecimal31 = bigDecimal1.max(bigDecimal30);
        java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal33 = bigDecimal32.negate();
        java.math.BigDecimal bigDecimal34 = java.math.BigDecimal.TEN;
        long long35 = bigDecimal34.longValueExact();
        java.math.BigDecimal bigDecimal36 = bigDecimal34.ulp();
        java.lang.String str37 = bigDecimal34.toString();
        int int38 = bigDecimal32.compareTo(bigDecimal34);
        java.math.BigInteger bigInteger39 = bigDecimal32.toBigInteger();
        java.math.BigDecimal bigDecimal41 = bigDecimal32.movePointRight(10);
        java.math.BigDecimal bigDecimal43 = new java.math.BigDecimal(52);
        java.math.BigDecimal bigDecimal44 = bigDecimal41.remainder(bigDecimal43);
        java.math.BigDecimal bigDecimal45 = bigDecimal31.max(bigDecimal43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal31 and bigDecimal30", (bigDecimal31.compareTo(bigDecimal30) == 0) == bigDecimal31.equals(bigDecimal30));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = bigDecimal1.abs();
        int int3 = bigDecimal1.intValueExact();
        java.math.BigDecimal bigDecimal5 = bigDecimal1.pow(0);
        java.math.BigInteger bigInteger6 = bigDecimal5.unscaledValue();
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.valueOf((long) 'x', 120);
        java.math.BigDecimal bigDecimal10 = bigDecimal9.stripTrailingZeros();
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal12 = bigDecimal11.abs();
        java.math.BigDecimal bigDecimal13 = bigDecimal9.multiply(bigDecimal11);
        java.math.BigDecimal bigDecimal14 = bigDecimal5.remainder(bigDecimal9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal10 and bigDecimal13", (bigDecimal10.compareTo(bigDecimal13) == 0) == bigDecimal10.equals(bigDecimal13));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.valueOf((long) (-1), (int) 'u');
        java.math.BigDecimal bigDecimal3 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal4 = bigDecimal3.abs();
        java.math.BigDecimal bigDecimal5 = bigDecimal2.min(bigDecimal4);
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.valueOf((double) (-1.0f));
        int int8 = bigDecimal4.compareTo(bigDecimal7);
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal10 = bigDecimal9.negate();
        java.math.BigDecimal bigDecimal11 = bigDecimal9.negate();
        java.lang.String str12 = bigDecimal9.toString();
        java.math.BigDecimal bigDecimal14 = new java.math.BigDecimal((double) 1L);
        java.lang.Object[] objArray17 = new java.lang.Object[] { (short) 10, (short) 100 };
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(objArray17, "hi!", (int) (byte) 100, (int) (short) -1);
        boolean boolean22 = bigDecimal14.equals((java.lang.Object) (short) -1);
        java.math.BigDecimal bigDecimal23 = bigDecimal9.max(bigDecimal14);
        java.math.BigDecimal bigDecimal24 = bigDecimal23.negate();
        int int25 = bigDecimal23.intValueExact();
        java.math.BigDecimal bigDecimal26 = bigDecimal7.remainder(bigDecimal23);
        java.math.BigInteger bigInteger27 = bigDecimal7.toBigIntegerExact();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal9 and bigDecimal26", (bigDecimal9.compareTo(bigDecimal26) == 0) == bigDecimal9.equals(bigDecimal26));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.ulp();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.movePointLeft((int) (short) 10);
        java.math.BigDecimal bigDecimal5 = bigDecimal2.plus();
        java.math.BigDecimal bigDecimal7 = bigDecimal2.movePointLeft(2);
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal9 = bigDecimal8.negate();
        java.math.BigDecimal bigDecimal10 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal11 = bigDecimal9.min(bigDecimal10);
        java.math.BigDecimal bigDecimal12 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal13 = bigDecimal12.negate();
        java.math.BigDecimal bigDecimal16 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal17 = bigDecimal13.subtract(bigDecimal16);
        java.math.BigDecimal[] bigDecimalArray18 = bigDecimal10.divideAndRemainder(bigDecimal16);
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal20 = bigDecimal19.negate();
        java.math.BigDecimal bigDecimal23 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal24 = bigDecimal20.subtract(bigDecimal23);
        java.math.BigDecimal bigDecimal25 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal26 = bigDecimal23.min(bigDecimal25);
        java.math.BigDecimal bigDecimal27 = bigDecimal16.divideToIntegralValue(bigDecimal26);
        java.math.BigDecimal bigDecimal28 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal29 = bigDecimal28.negate();
        java.math.BigDecimal bigDecimal30 = java.math.BigDecimal.TEN;
        long long31 = bigDecimal30.longValueExact();
        java.math.BigDecimal bigDecimal32 = bigDecimal30.ulp();
        java.lang.String str33 = bigDecimal30.toString();
        int int34 = bigDecimal28.compareTo(bigDecimal30);
        java.math.BigInteger bigInteger35 = bigDecimal28.toBigInteger();
        java.math.BigDecimal bigDecimal36 = bigDecimal28.ulp();
        java.math.BigDecimal bigDecimal37 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal38 = bigDecimal37.negate();
        java.math.BigDecimal bigDecimal39 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal40 = bigDecimal38.min(bigDecimal39);
        int int41 = bigDecimal28.compareTo(bigDecimal40);
        int int42 = bigDecimal27.compareTo(bigDecimal40);
        java.math.BigDecimal bigDecimal45 = java.math.BigDecimal.valueOf((long) (byte) -1, 0);
        java.math.BigDecimal bigDecimal46 = bigDecimal45.plus();
        java.math.BigDecimal[] bigDecimalArray47 = bigDecimal40.divideAndRemainder(bigDecimal45);
        java.math.BigDecimal bigDecimal48 = bigDecimal7.multiply(bigDecimal40);
        java.math.BigDecimal bigDecimal50 = bigDecimal7.movePointRight(46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal8 and bigDecimal48", (bigDecimal8.compareTo(bigDecimal48) == 0) == bigDecimal8.equals(bigDecimal48));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        int int2 = bigDecimal1.signum();
        long long3 = bigDecimal1.longValue();
        java.math.BigDecimal bigDecimal4 = bigDecimal1.abs();
        int int5 = bigDecimal1.scale();
        byte byte6 = bigDecimal1.byteValueExact();
        java.math.BigDecimal bigDecimal7 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal8 = bigDecimal7.negate();
        java.math.BigDecimal bigDecimal9 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal10 = bigDecimal9.negate();
        java.math.BigDecimal bigDecimal11 = bigDecimal9.negate();
        java.lang.String str12 = bigDecimal11.toEngineeringString();
        java.math.BigDecimal bigDecimal13 = bigDecimal8.multiply(bigDecimal11);
        java.math.BigDecimal bigDecimal15 = bigDecimal11.movePointRight(100);
        byte[] byteArray18 = new byte[] { (byte) 1 };
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.min(byteArray18);
        java.math.BigInteger bigInteger20 = new java.math.BigInteger((int) (short) -1, byteArray18);
        java.math.BigInteger bigInteger22 = bigInteger20.pow((int) 'a');
        java.math.BigDecimal bigDecimal24 = new java.math.BigDecimal(bigInteger22, (int) (byte) 0);
        java.util.Locale locale25 = java.util.Locale.PRC;
        java.lang.String str26 = locale25.getISO3Language();
        boolean boolean27 = bigDecimal24.equals((java.lang.Object) str26);
        java.math.BigDecimal bigDecimal30 = bigDecimal11.divide(bigDecimal24, (int) (short) 100, (int) (short) 1);
        java.math.BigDecimal bigDecimal31 = bigDecimal1.max(bigDecimal30);
        java.math.BigDecimal bigDecimal32 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal33 = bigDecimal32.negate();
        java.math.BigDecimal bigDecimal36 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal37 = bigDecimal33.subtract(bigDecimal36);
        java.lang.String str38 = bigDecimal33.toPlainString();
        java.lang.String str39 = bigDecimal33.toPlainString();
        long[] longArray46 = new long[] { (byte) 1, (short) 100, 1L, (byte) 100, '4', 1L };
        long long47 = org.apache.commons.lang3.math.NumberUtils.min(longArray46);
        boolean boolean48 = bigDecimal33.equals((java.lang.Object) long47);
        java.math.BigDecimal bigDecimal49 = bigDecimal30.add(bigDecimal33);
        short short50 = bigDecimal49.shortValueExact();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal30", (bigDecimal0.compareTo(bigDecimal30) == 0) == bigDecimal0.equals(bigDecimal30));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal3 = bigDecimal1.min(bigDecimal2);
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal9 = bigDecimal5.subtract(bigDecimal8);
        java.math.BigDecimal[] bigDecimalArray10 = bigDecimal2.divideAndRemainder(bigDecimal8);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal12 = bigDecimal11.negate();
        java.math.BigDecimal bigDecimal15 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal16 = bigDecimal12.subtract(bigDecimal15);
        java.math.BigDecimal bigDecimal17 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal18 = bigDecimal15.min(bigDecimal17);
        java.math.BigDecimal bigDecimal19 = bigDecimal8.divideToIntegralValue(bigDecimal18);
        java.math.BigInteger bigInteger20 = bigDecimal19.toBigInteger();
        java.math.BigInteger bigInteger21 = bigDecimal19.toBigIntegerExact();
        int int22 = bigDecimal19.signum();
        java.math.BigDecimal bigDecimal23 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal24 = bigDecimal23.negate();
        java.math.BigDecimal bigDecimal27 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal28 = bigDecimal24.subtract(bigDecimal27);
        java.math.BigInteger bigInteger29 = bigDecimal28.toBigInteger();
        byte[] byteArray30 = bigInteger29.toByteArray();
        byte byte31 = bigInteger29.byteValueExact();
        java.math.BigDecimal bigDecimal32 = new java.math.BigDecimal(bigInteger29);
        java.math.BigDecimal bigDecimal33 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal34 = bigDecimal33.negate();
        java.math.BigDecimal bigDecimal35 = java.math.BigDecimal.TEN;
        long long36 = bigDecimal35.longValueExact();
        java.math.BigDecimal bigDecimal37 = bigDecimal35.ulp();
        java.lang.String str38 = bigDecimal35.toString();
        int int39 = bigDecimal33.compareTo(bigDecimal35);
        java.math.BigDecimal bigDecimal41 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal43 = bigDecimal35.divide(bigDecimal41, (int) (short) 1);
        java.math.BigDecimal bigDecimal44 = bigDecimal32.min(bigDecimal41);
        int int45 = bigDecimal41.scale();
        java.math.BigDecimal bigDecimal46 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal47 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal48 = bigDecimal46.divide(bigDecimal47);
        int int49 = bigDecimal41.compareTo(bigDecimal48);
        java.math.BigDecimal bigDecimal50 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal51 = bigDecimal50.negate();
        java.math.BigDecimal bigDecimal52 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal53 = bigDecimal51.min(bigDecimal52);
        java.math.BigDecimal bigDecimal54 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal55 = bigDecimal54.negate();
        java.math.BigDecimal bigDecimal58 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal59 = bigDecimal55.subtract(bigDecimal58);
        java.math.BigDecimal[] bigDecimalArray60 = bigDecimal52.divideAndRemainder(bigDecimal58);
        java.math.BigDecimal bigDecimal61 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal62 = bigDecimal61.negate();
        java.math.BigDecimal bigDecimal65 = java.math.BigDecimal.valueOf((long) (byte) 100, (int) (short) 100);
        java.math.BigDecimal bigDecimal66 = bigDecimal62.subtract(bigDecimal65);
        java.math.BigDecimal bigDecimal67 = java.math.BigDecimal.TEN;
        java.math.BigDecimal bigDecimal68 = bigDecimal65.min(bigDecimal67);
        java.math.BigDecimal bigDecimal69 = bigDecimal58.divideToIntegralValue(bigDecimal68);
        java.math.BigInteger bigInteger70 = bigDecimal69.toBigInteger();
        java.math.BigDecimal bigDecimal72 = new java.math.BigDecimal((double) 1L);
        java.math.BigDecimal bigDecimal74 = java.math.BigDecimal.valueOf((double) 117);
        double double75 = bigDecimal74.doubleValue();
        java.math.BigDecimal bigDecimal76 = bigDecimal72.min(bigDecimal74);
        int int77 = bigDecimal69.compareTo(bigDecimal74);
        java.math.BigDecimal bigDecimal78 = bigDecimal41.divideToIntegralValue(bigDecimal74);
        java.math.BigDecimal bigDecimal79 = bigDecimal19.divideToIntegralValue(bigDecimal41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal79 and bigDecimal78", (bigDecimal79.compareTo(bigDecimal78) == 0) == bigDecimal79.equals(bigDecimal78));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        java.math.BigDecimal bigDecimal1 = java.math.BigDecimal.valueOf((long) (byte) 0);
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal3 = bigDecimal2.negate();
        java.math.BigDecimal bigDecimal4 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal5 = bigDecimal4.negate();
        java.math.BigDecimal bigDecimal6 = bigDecimal4.negate();
        java.lang.String str7 = bigDecimal6.toEngineeringString();
        java.math.BigDecimal bigDecimal8 = bigDecimal3.multiply(bigDecimal6);
        java.math.BigDecimal bigDecimal10 = bigDecimal3.movePointLeft(0);
        java.math.BigDecimal bigDecimal11 = bigDecimal1.subtract(bigDecimal3);
        java.math.BigDecimal bigDecimal13 = bigDecimal3.setScale((-1));
        java.math.BigInteger bigInteger14 = bigDecimal13.toBigInteger();
        byte byte15 = bigInteger14.byteValueExact();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal1 and bigDecimal13", (bigDecimal1.compareTo(bigDecimal13) == 0) == bigDecimal1.equals(bigDecimal13));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.TEN;
        long long1 = bigDecimal0.longValueExact();
        java.math.BigDecimal bigDecimal2 = bigDecimal0.ulp();
        java.lang.String str3 = bigDecimal0.toString();
        java.math.BigDecimal bigDecimal4 = bigDecimal0.stripTrailingZeros();
        java.math.BigDecimal bigDecimal6 = bigDecimal4.movePointRight(0);
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.valueOf((long) 9);
        java.math.BigDecimal bigDecimal10 = new java.math.BigDecimal((double) 100.0f);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal12 = bigDecimal11.negate();
        java.math.BigDecimal bigDecimal13 = java.math.BigDecimal.TEN;
        long long14 = bigDecimal13.longValueExact();
        java.math.BigDecimal bigDecimal15 = bigDecimal13.ulp();
        java.lang.String str16 = bigDecimal13.toString();
        int int17 = bigDecimal11.compareTo(bigDecimal13);
        java.math.BigDecimal bigDecimal19 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal21 = bigDecimal13.divide(bigDecimal19, (int) (short) 1);
        java.math.BigDecimal bigDecimal22 = java.math.BigDecimal.TEN;
        long long23 = bigDecimal22.longValueExact();
        java.math.BigDecimal bigDecimal24 = bigDecimal21.max(bigDecimal22);
        java.math.BigDecimal bigDecimal25 = java.math.BigDecimal.TEN;
        long long26 = bigDecimal25.longValueExact();
        java.math.BigDecimal bigDecimal27 = bigDecimal25.ulp();
        java.math.BigDecimal bigDecimal28 = bigDecimal22.subtract(bigDecimal25);
        double double29 = bigDecimal25.doubleValue();
        java.math.BigDecimal bigDecimal30 = bigDecimal10.divideToIntegralValue(bigDecimal25);
        java.math.BigDecimal bigDecimal31 = java.math.BigDecimal.ZERO;
        double double32 = bigDecimal31.doubleValue();
        java.math.BigInteger bigInteger33 = bigDecimal31.toBigInteger();
        java.lang.String str34 = bigDecimal31.toPlainString();
        java.math.BigDecimal bigDecimal35 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal36 = bigDecimal35.negate();
        java.math.BigDecimal bigDecimal37 = bigDecimal35.negate();
        int int38 = bigDecimal37.intValueExact();
        java.math.BigDecimal bigDecimal39 = bigDecimal31.max(bigDecimal37);
        int int40 = bigDecimal39.precision();
        java.math.BigDecimal bigDecimal41 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal42 = bigDecimal41.negate();
        java.math.BigDecimal bigDecimal43 = bigDecimal41.negate();
        java.lang.String str44 = bigDecimal41.toString();
        java.math.BigDecimal bigDecimal46 = bigDecimal41.scaleByPowerOfTen(0);
        java.math.BigDecimal bigDecimal47 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal48 = bigDecimal47.negate();
        java.math.BigDecimal bigDecimal49 = java.math.BigDecimal.TEN;
        long long50 = bigDecimal49.longValueExact();
        java.math.BigDecimal bigDecimal51 = bigDecimal49.ulp();
        java.lang.String str52 = bigDecimal49.toString();
        int int53 = bigDecimal47.compareTo(bigDecimal49);
        java.math.BigDecimal bigDecimal55 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal57 = bigDecimal49.divide(bigDecimal55, (int) (short) 1);
        java.math.BigDecimal bigDecimal58 = java.math.BigDecimal.TEN;
        long long59 = bigDecimal58.longValueExact();
        java.math.BigDecimal bigDecimal60 = bigDecimal57.max(bigDecimal58);
        java.math.BigDecimal bigDecimal61 = bigDecimal41.add(bigDecimal57);
        int int62 = bigDecimal39.compareTo(bigDecimal57);
        java.math.BigDecimal bigDecimal63 = bigDecimal25.subtract(bigDecimal39);
        java.math.BigDecimal bigDecimal65 = bigDecimal25.movePointRight((int) '#');
        java.math.BigDecimal bigDecimal66 = bigDecimal8.remainder(bigDecimal25);
        java.math.BigDecimal bigDecimal67 = bigDecimal6.remainder(bigDecimal25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal6 and bigDecimal4", (bigDecimal6.compareTo(bigDecimal4) == 0) == bigDecimal6.equals(bigDecimal4));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        java.math.BigDecimal bigDecimal1 = bigDecimal0.negate();
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.TEN;
        long long3 = bigDecimal2.longValueExact();
        java.math.BigDecimal bigDecimal4 = bigDecimal2.ulp();
        java.lang.String str5 = bigDecimal2.toString();
        int int6 = bigDecimal0.compareTo(bigDecimal2);
        java.math.BigDecimal bigDecimal8 = java.math.BigDecimal.valueOf((long) (byte) 100);
        java.math.BigDecimal bigDecimal10 = bigDecimal2.divide(bigDecimal8, (int) (short) 1);
        java.math.BigDecimal bigDecimal11 = java.math.BigDecimal.TEN;
        long long12 = bigDecimal11.longValueExact();
        java.math.BigDecimal bigDecimal13 = bigDecimal10.max(bigDecimal11);
        java.math.BigDecimal bigDecimal14 = java.math.BigDecimal.TEN;
        long long15 = bigDecimal14.longValueExact();
        java.math.BigDecimal bigDecimal16 = bigDecimal14.ulp();
        java.math.BigDecimal bigDecimal17 = bigDecimal11.subtract(bigDecimal14);
        java.math.BigDecimal bigDecimal20 = java.math.BigDecimal.valueOf((long) (-1), (int) 'u');
        java.math.BigDecimal bigDecimal21 = java.math.BigDecimal.ONE;
        java.math.BigDecimal bigDecimal22 = bigDecimal21.abs();
        java.math.BigDecimal bigDecimal23 = bigDecimal20.min(bigDecimal22);
        java.math.BigDecimal bigDecimal25 = java.math.BigDecimal.valueOf((double) (-1.0f));
        int int26 = bigDecimal22.compareTo(bigDecimal25);
        java.math.BigDecimal bigDecimal27 = bigDecimal17.divide(bigDecimal25);
        int int28 = bigDecimal17.signum();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal17 and bigDecimal27", (bigDecimal17.compareTo(bigDecimal27) == 0) == bigDecimal17.equals(bigDecimal27));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        java.math.BigDecimal bigDecimal0 = java.math.BigDecimal.ZERO;
        double double1 = bigDecimal0.doubleValue();
        java.math.BigInteger bigInteger2 = bigDecimal0.toBigInteger();
        byte[] byteArray5 = new byte[] { (byte) 1 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.math.BigInteger bigInteger7 = new java.math.BigInteger((int) (short) -1, byteArray5);
        java.math.BigInteger bigInteger9 = bigInteger7.pow((int) 'a');
        byte[] byteArray10 = bigInteger7.toByteArray();
        long long11 = bigInteger7.longValueExact();
        java.math.BigInteger bigInteger12 = bigInteger2.or(bigInteger7);
        java.math.BigDecimal bigDecimal13 = new java.math.BigDecimal(bigInteger2);
        java.math.BigDecimal bigDecimal15 = bigDecimal13.scaleByPowerOfTen(32);
        long long16 = bigDecimal13.longValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bigDecimal0 and bigDecimal15", (bigDecimal0.compareTo(bigDecimal15) == 0) == bigDecimal0.equals(bigDecimal15));
    }
}

