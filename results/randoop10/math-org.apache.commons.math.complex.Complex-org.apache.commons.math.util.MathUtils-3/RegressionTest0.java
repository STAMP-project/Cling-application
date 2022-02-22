import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((int) 'a', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.574710978503383d + "'", double2 == 4.574710978503383d);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        float float2 = org.apache.commons.math.util.MathUtils.round(0.0f, (int) 'a');
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter(1.0d, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999999999999d + "'", double2 == 0.9999999999999999d);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        int int1 = org.apache.commons.math.util.MathUtils.sign(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        double double1 = org.apache.commons.math.util.MathUtils.sign(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter(0.0d, (double) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        int int1 = org.apache.commons.math.util.MathUtils.sign((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        float float1 = org.apache.commons.math.util.MathUtils.sign(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialLog((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n > 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) 'a', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialLog((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n > 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        float float3 = org.apache.commons.math.util.MathUtils.round((float) ' ', 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 33.0f + "'", float3 == 33.0f);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        byte byte1 = org.apache.commons.math.util.MathUtils.indicator((byte) -1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -1 + "'", byte1 == (byte) -1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        double double2 = org.apache.commons.math.util.MathUtils.log(0.0d, (double) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) (short) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        int int2 = org.apache.commons.math.util.MathUtils.lcm(10, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 970 + "'", int2 == 970);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((-1.0d), (double) 10L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9999999999999999d) + "'", double2 == (-0.9999999999999999d));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog(2);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931471805599453d + "'", double1 == 0.6931471805599453d);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) (short) -1, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-98) + "'", int2 == (-98));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((-1), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck(10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) (-1L), (double) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9999999999999999d) + "'", double2 == (-0.9999999999999999d));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 100, (int) (byte) -1, 970);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) (-1));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) 97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1079525376 + "'", int1 == 1079525376);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        java.lang.Class<?> wildcardClass4 = complex2.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) ' ', (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) (byte) 1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) 0.0f, 0.9999999999999999d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((int) (byte) 100, 1672897414);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        int int1 = org.apache.commons.math.util.MathUtils.hash(0.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) 970);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round(0.0d, (int) '4', 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) (byte) 1, 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialLog((-98));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n > 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        byte byte1 = org.apache.commons.math.util.MathUtils.indicator((byte) 0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.round((-1.0d), 1079525376);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: BigInteger would overflow supported range");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        int int1 = org.apache.commons.math.util.MathUtils.sign((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.104412573075518d + "'", double1 == 15.104412573075518d);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((int) 'a', (int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 59.05357183211846d + "'", double2 == 59.05357183211846d);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        boolean boolean6 = complex5.isInfinite();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) 'a');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        long long1 = org.apache.commons.math.util.MathUtils.factorial((int) (short) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 97, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) (byte) 0, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) '#', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((int) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0333147966386297E40d + "'", double1 == 1.0333147966386297E40d);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        long long1 = org.apache.commons.math.util.MathUtils.factorial((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog(1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) 10, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) (-98));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = complex7.acos();
        org.apache.commons.math.complex.Complex complex9 = complex7.tan();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.conjugate();
        org.apache.commons.math.complex.Complex complex12 = complex10.exp();
        org.apache.commons.math.complex.Complex complex13 = complex12.tan();
        org.apache.commons.math.complex.Complex complex14 = complex12.sqrt1z();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = complex14.multiply(complex16);
        boolean boolean18 = complex16.isNaN();
        double double19 = complex16.getImaginary();
        org.apache.commons.math.complex.Complex complex20 = complex7.multiply(complex16);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.conjugate();
        org.apache.commons.math.complex.Complex complex23 = complex21.exp();
        org.apache.commons.math.complex.Complex complex24 = complex23.tan();
        org.apache.commons.math.complex.Complex complex25 = complex23.sqrt1z();
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex27 = complex26.cosh();
        org.apache.commons.math.complex.Complex complex28 = complex25.pow(complex26);
        org.apache.commons.math.complex.Complex complex29 = complex28.acos();
        org.apache.commons.math.complex.Complex complex30 = complex28.conjugate();
        org.apache.commons.math.complex.Complex complex31 = complex7.pow(complex30);
        boolean boolean32 = complex30.isInfinite();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) (byte) 100, (long) 1079525376);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1079525476L + "'", long2 == 1079525476L);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        int int2 = org.apache.commons.math.util.MathUtils.lcm(10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) 10);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        byte byte1 = org.apache.commons.math.util.MathUtils.indicator((byte) 1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = complex7.acos();
        org.apache.commons.math.complex.Complex complex9 = complex7.tan();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.conjugate();
        org.apache.commons.math.complex.Complex complex12 = complex10.exp();
        org.apache.commons.math.complex.Complex complex13 = complex12.tan();
        org.apache.commons.math.complex.Complex complex14 = complex12.sqrt1z();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = complex14.multiply(complex16);
        boolean boolean18 = complex16.isNaN();
        double double19 = complex16.getImaginary();
        org.apache.commons.math.complex.Complex complex20 = complex7.multiply(complex16);
        double double21 = complex20.abs();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        byte byte1 = org.apache.commons.math.util.MathUtils.sign((byte) 0);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(0, 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-970) + "'", int2 == (-970));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        double double3 = org.apache.commons.math.util.MathUtils.round((double) 1079525476L, (int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.079525476E9d + "'", double3 == 1.079525476E9d);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1076101120 + "'", int1 == 1076101120);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex5.tanh();
        org.apache.commons.math.complex.Complex complex7 = complex6.atan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) ' ');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) 10, Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((int) (short) -1, 1076101120);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) (byte) -1, Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9999999999999999d) + "'", double2 == (-0.9999999999999999d));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        int int2 = org.apache.commons.math.util.MathUtils.lcm(36, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        int int1 = org.apache.commons.math.util.MathUtils.hash(0.9999999999999999d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1072693248) + "'", int1 == (-1072693248));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) (byte) -1, (-98));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 98 + "'", int2 == 98);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog((int) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 92.13617560368711d + "'", double1 == 92.13617560368711d);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round(4.574710978503383d, (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.332621544395286E157d + "'", double1 == 9.332621544395286E157d);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) (-1072693248), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1072693248L) + "'", long2 == (-1072693248L));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck(0L, (long) 1672897414);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1672897414L + "'", long2 == 1672897414L);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) (-970));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(100, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(101);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.425947759839367E159d + "'", double1 == 9.425947759839367E159d);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 1L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        int int2 = org.apache.commons.math.util.MathUtils.lcm(98, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 98 + "'", int2 == 98);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) 0.0f, (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex3 = complex2.atan();
        java.lang.Class<?> wildcardClass4 = complex3.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        byte byte1 = org.apache.commons.math.util.MathUtils.sign((byte) -1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) -1 + "'", byte1 == (byte) -1);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        double double1 = org.apache.commons.math.util.MathUtils.indicator(0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex2 = complex0.cos();
        org.apache.commons.math.complex.Complex complex3 = complex2.sqrt1z();
        double double4 = complex2.getReal();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) (short) 0, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.9E-324d) + "'", double2 == (-4.9E-324d));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) (short) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(4.9E-324d, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) 'a', 101);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(36, 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex4.multiply(complex6);
        org.apache.commons.math.complex.Complex complex8 = complex7.asin();
        org.apache.commons.math.complex.Complex complex9 = complex8.conjugate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        double double2 = org.apache.commons.math.util.MathUtils.round(0.0d, (-970));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) 0L, 15.104412573075518d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((int) (short) 1, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(36);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        float float3 = org.apache.commons.math.util.MathUtils.round(Float.NaN, (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertTrue(Float.isNaN(float3));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial(101);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: result too large to represent in a long integer");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) (-1072693248L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex1.cos();
        org.apache.commons.math.complex.Complex complex4 = complex0.divide(complex1);
        org.apache.commons.math.complex.Complex complex5 = complex0.log();
        org.apache.commons.math.complex.Complex complex6 = complex0.sin();
        java.lang.Class<?> wildcardClass7 = complex0.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) (-1072693248), (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1072693196L) + "'", long2 == (-1072693196L));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle(Double.POSITIVE_INFINITY, (double) 10L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math.complex.Complex complex10 = complex8.exp();
        org.apache.commons.math.complex.Complex complex11 = complex10.tan();
        org.apache.commons.math.complex.Complex complex12 = complex7.add(complex10);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 101, 1079525376);
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.lcm((-1072693248), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        java.lang.Class<?> wildcardClass2 = complex0.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) (short) 100, 970);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232874703393d + "'", double1 == 11013.232874703393d);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        double double1 = org.apache.commons.math.util.MathUtils.sinh(92.13617560368711d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.166573983193148E39d + "'", double1 == 5.166573983193148E39d);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        long long1 = org.apache.commons.math.util.MathUtils.indicator(1672897414L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((int) (byte) 1, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) (short) 1, (-1072693248L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1072693247L) + "'", long2 == (-1072693247L));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) (short) 100, (double) (-10));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-13.097335529232552d) + "'", double2 == (-13.097335529232552d));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter(0.0d, Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex5.tanh();
        org.apache.commons.math.complex.Complex complex7 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex6.conjugate();
        boolean boolean9 = complex8.isInfinite();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152437d + "'", double1 == 1.5430806348152437d);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) (-1L), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        double double1 = org.apache.commons.math.util.MathUtils.sinh(1.5430806348152437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2326303196791324d + "'", double1 == 2.2326303196791324d);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) (short) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3628800.0d + "'", double1 == 3628800.0d);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck(1L, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck(0L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex2 = complex0.cos();
        org.apache.commons.math.complex.Complex complex3 = complex0.asin();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((int) (short) -1, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= 0 for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        boolean boolean5 = complex4.isInfinite();
        boolean boolean7 = complex4.equals((java.lang.Object) 970);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) 100, (double) 1076101120);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        double double1 = org.apache.commons.math.util.MathUtils.cosh(0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.25d + "'", double1 == 1.25d);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        double double1 = org.apache.commons.math.util.MathUtils.sign(9.332621544395286E157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) '4', (-98), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round(92.13617560368711d, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck(1L, (-1072693196L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1072693195L) + "'", long2 == (-1072693195L));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex3 = complex2.atan();
        org.apache.commons.math.complex.Complex complex4 = complex3.acos();
        org.apache.commons.math.complex.Complex complex5 = complex3.tanh();
        org.apache.commons.math.complex.Complex complex6 = complex3.tan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck(1, (-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-10) + "'", int2 == (-10));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex4.multiply(complex6);
        org.apache.commons.math.complex.Complex complex8 = complex7.asin();
        org.apache.commons.math.complex.Complex complex9 = complex7.sinh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        double[] doubleArray4 = new double[] { 1.3440585709080678E43d, (-4.9E-324d), 97, 10.0d };
        double[] doubleArray11 = new double[] { 0.9999999999999999d, 10.0d, (byte) 0, 100.0f, 0L, 10L };
        int int12 = org.apache.commons.math.util.MathUtils.hash(doubleArray11);
        boolean boolean13 = org.apache.commons.math.util.MathUtils.equals(doubleArray4, doubleArray11);
        int int14 = org.apache.commons.math.util.MathUtils.hash(doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[1.3440585709080678E43, -4.9E-324, 97.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.9999999999999999, 10.0, 0.0, 100.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1672897414 + "'", int12 == 1672897414);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1672897414 + "'", int14 == 1672897414);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(97, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 197 + "'", int2 == 197);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 1076101120);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck(100L, (long) (-98));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 198L + "'", long2 == 198L);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) (byte) 0, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        double double1 = org.apache.commons.math.util.MathUtils.cosh(9.425947759839367E159d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 1672897414L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        int int1 = org.apache.commons.math.util.MathUtils.sign((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) 1672897414);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1604784744) + "'", int1 == (-1604784744));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((-10), 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(0, (-98));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 98 + "'", int2 == 98);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        int int1 = org.apache.commons.math.util.MathUtils.sign((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        double double2 = org.apache.commons.math.util.MathUtils.round(Double.POSITIVE_INFINITY, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) (byte) -1, 1.25d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) 1079525376);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) (byte) 0, (long) 970);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-970L) + "'", long2 == (-970L));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck(198L, (-1072693196L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-212393252808L) + "'", long2 == (-212393252808L));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) (byte) 1, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(10, 197);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-9), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((int) (byte) 1, 197);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) (byte) 10, (long) (-10));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 20L + "'", long2 == 20L);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((-1604784744));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) 0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) 1672897414L, (-1), 36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex9.exp();
        org.apache.commons.math.complex.Complex complex12 = complex11.tan();
        org.apache.commons.math.complex.Complex complex13 = complex11.sqrt1z();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex16 = complex13.pow(complex14);
        org.apache.commons.math.complex.Complex complex17 = complex13.exp();
        org.apache.commons.math.complex.Complex complex18 = complex8.pow(complex13);
        boolean boolean19 = complex5.equals((java.lang.Object) complex8);
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex21 = complex20.cosh();
        org.apache.commons.math.complex.Complex complex22 = complex5.multiply(complex21);
        org.apache.commons.math.complex.Complex complex23 = complex21.cosh();
        java.lang.Class<?> wildcardClass24 = complex23.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) 1L, (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        long long1 = org.apache.commons.math.util.MathUtils.sign(0L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) '#');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(1076101120, (-1604784744));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: subtract");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        boolean boolean2 = complex1.isNaN();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        byte byte1 = org.apache.commons.math.util.MathUtils.sign((byte) 100);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((-9), (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 288 + "'", int2 == 288);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog(36);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 95.71969454214322d + "'", double1 == 95.71969454214322d);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        java.lang.Class<?> wildcardClass3 = complex2.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) 20L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4258259770489514E8d + "'", double1 == 2.4258259770489514E8d);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(101, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) ' ', (int) ' ', 970);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck(0L, (-1072693247L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1072693247L + "'", long2 == 1072693247L);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) 1L, 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt();
        double double3 = complex0.abs();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) (short) 100, (long) 288);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-188L) + "'", long2 == (-188L));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((-1072693248), (-1604784744));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 532091496 + "'", int2 == 532091496);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(101, (-1072693248));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        int int1 = org.apache.commons.math.util.MathUtils.sign(532091496);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((int) '4', (-1072693248));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        long long1 = org.apache.commons.math.util.MathUtils.sign(198L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: result too large to represent in a long integer");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex2 = complex1.atan();
        double double3 = complex2.getReal();
        double double4 = complex2.getImaginary();
        org.apache.commons.math.complex.Complex complex5 = complex2.conjugate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.7853981633974483d + "'", double3 == 0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex2 = complex0.cos();
        double double3 = complex2.getImaginary();
        org.apache.commons.math.complex.Complex complex4 = complex2.tanh();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.conjugate();
        org.apache.commons.math.complex.Complex complex7 = complex5.exp();
        org.apache.commons.math.complex.Complex complex8 = complex7.tan();
        org.apache.commons.math.complex.Complex complex9 = complex7.sqrt1z();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.cosh();
        org.apache.commons.math.complex.Complex complex12 = complex9.pow(complex10);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.conjugate();
        org.apache.commons.math.complex.Complex complex16 = complex14.exp();
        org.apache.commons.math.complex.Complex complex17 = complex16.tan();
        org.apache.commons.math.complex.Complex complex18 = complex16.sqrt1z();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex20 = complex19.cosh();
        org.apache.commons.math.complex.Complex complex21 = complex18.pow(complex19);
        org.apache.commons.math.complex.Complex complex22 = complex18.exp();
        org.apache.commons.math.complex.Complex complex23 = complex13.pow(complex18);
        boolean boolean24 = complex10.equals((java.lang.Object) complex13);
        org.apache.commons.math.complex.Complex complex25 = complex4.subtract(complex10);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(complex25);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex4.multiply(complex6);
        org.apache.commons.math.complex.Complex complex8 = complex7.asin();
        double double9 = complex8.getImaginary();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        byte byte1 = org.apache.commons.math.util.MathUtils.indicator((byte) 10);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) 2, (long) (-970));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1940L) + "'", long2 == (-1940L));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        int int1 = org.apache.commons.math.util.MathUtils.sign(1076101120);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math.complex.Complex complex10 = complex8.exp();
        org.apache.commons.math.complex.Complex complex11 = complex10.tan();
        org.apache.commons.math.complex.Complex complex12 = complex10.sqrt1z();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        org.apache.commons.math.complex.Complex complex15 = complex12.pow(complex13);
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex17 = complex16.conjugate();
        org.apache.commons.math.complex.Complex complex18 = complex16.exp();
        org.apache.commons.math.complex.Complex complex19 = complex18.tan();
        org.apache.commons.math.complex.Complex complex20 = complex18.sqrt1z();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.cosh();
        org.apache.commons.math.complex.Complex complex23 = complex20.pow(complex21);
        org.apache.commons.math.complex.Complex complex24 = complex23.acos();
        org.apache.commons.math.complex.Complex complex25 = complex23.tan();
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex27 = complex26.conjugate();
        org.apache.commons.math.complex.Complex complex28 = complex26.exp();
        org.apache.commons.math.complex.Complex complex29 = complex28.tan();
        org.apache.commons.math.complex.Complex complex30 = complex28.sqrt1z();
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex32 = complex31.atan();
        org.apache.commons.math.complex.Complex complex33 = complex30.multiply(complex32);
        boolean boolean34 = complex32.isNaN();
        double double35 = complex32.getImaginary();
        org.apache.commons.math.complex.Complex complex36 = complex23.multiply(complex32);
        org.apache.commons.math.complex.Complex complex37 = complex12.subtract(complex23);
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex39 = complex12.pow(complex38);
        org.apache.commons.math.complex.Complex complex40 = complex4.subtract(complex12);
        org.apache.commons.math.complex.Complex complex41 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex42 = complex41.conjugate();
        org.apache.commons.math.complex.Complex complex43 = complex41.exp();
        org.apache.commons.math.complex.Complex complex44 = complex43.tan();
        org.apache.commons.math.complex.Complex complex45 = complex43.sqrt1z();
        org.apache.commons.math.complex.Complex complex46 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex47 = complex46.cosh();
        org.apache.commons.math.complex.Complex complex48 = complex45.pow(complex46);
        org.apache.commons.math.complex.Complex complex49 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex50 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex51 = complex50.conjugate();
        org.apache.commons.math.complex.Complex complex52 = complex50.exp();
        org.apache.commons.math.complex.Complex complex53 = complex52.tan();
        org.apache.commons.math.complex.Complex complex54 = complex52.sqrt1z();
        org.apache.commons.math.complex.Complex complex55 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex56 = complex55.cosh();
        org.apache.commons.math.complex.Complex complex57 = complex54.pow(complex55);
        org.apache.commons.math.complex.Complex complex58 = complex54.exp();
        org.apache.commons.math.complex.Complex complex59 = complex49.pow(complex54);
        boolean boolean60 = complex46.equals((java.lang.Object) complex49);
        org.apache.commons.math.complex.Complex complex61 = complex49.acos();
        org.apache.commons.math.complex.Complex complex62 = complex40.add(complex61);
        org.apache.commons.math.complex.Complex complex63 = complex62.acos();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complex63);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) 1079525376, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1079525376L + "'", long2 == 1079525376L);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex1.cos();
        org.apache.commons.math.complex.Complex complex4 = complex0.divide(complex1);
        org.apache.commons.math.complex.Complex complex5 = complex0.asin();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex7 = complex6.conjugate();
        org.apache.commons.math.complex.Complex complex8 = complex6.exp();
        org.apache.commons.math.complex.Complex complex9 = complex8.tan();
        org.apache.commons.math.complex.Complex complex10 = complex8.sqrt1z();
        boolean boolean11 = complex10.isInfinite();
        org.apache.commons.math.complex.Complex complex12 = complex0.multiply(complex10);
        boolean boolean13 = complex12.isNaN();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) 37);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        double[] doubleArray5 = new double[] { 2, 1672897414, 98, 92.13617560368711d, (short) 0 };
        double[] doubleArray12 = new double[] { 0.9999999999999999d, 10.0d, (byte) 0, 100.0f, 0L, 10L };
        int int13 = org.apache.commons.math.util.MathUtils.hash(doubleArray12);
        int int14 = org.apache.commons.math.util.MathUtils.hash(doubleArray12);
        boolean boolean15 = org.apache.commons.math.util.MathUtils.equals(doubleArray5, doubleArray12);
        double[] doubleArray20 = new double[] { 1.3440585709080678E43d, (-4.9E-324d), 97, 10.0d };
        double[] doubleArray27 = new double[] { 0.9999999999999999d, 10.0d, (byte) 0, 100.0f, 0L, 10L };
        int int28 = org.apache.commons.math.util.MathUtils.hash(doubleArray27);
        boolean boolean29 = org.apache.commons.math.util.MathUtils.equals(doubleArray20, doubleArray27);
        boolean boolean30 = org.apache.commons.math.util.MathUtils.equals(doubleArray5, doubleArray20);
        int int31 = org.apache.commons.math.util.MathUtils.hash(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[2.0, 1.672897414E9, 98.0, 92.13617560368711, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.9999999999999999, 10.0, 0.0, 100.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1672897414 + "'", int13 == 1672897414);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1672897414 + "'", int14 == 1672897414);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.3440585709080678E43, -4.9E-324, 97.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.9999999999999999, 10.0, 0.0, 100.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1672897414 + "'", int28 == 1672897414);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2121762133 + "'", int31 == 2121762133);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) '#', 92.13617560368711d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.00000000000001d + "'", double2 == 35.00000000000001d);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(5.166573983193148E39d, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1752011936438014d + "'", double1 == 1.1752011936438014d);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) 197, (-1072693195L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1072692998L) + "'", long2 == (-1072692998L));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.NaN;
        double double1 = complex0.abs();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex5.asin();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex8.cos();
        org.apache.commons.math.complex.Complex complex11 = complex7.divide(complex10);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        org.apache.commons.math.complex.Complex complex15 = complex13.cos();
        org.apache.commons.math.complex.Complex complex16 = complex12.divide(complex13);
        org.apache.commons.math.complex.Complex complex17 = complex12.asin();
        org.apache.commons.math.complex.Complex complex18 = complex7.subtract(complex17);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) (-98), (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 98L + "'", long2 == 98L);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = complex7.acos();
        double double9 = complex7.getImaginary();
        java.lang.Class<?> wildcardClass10 = complex7.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex1.cos();
        org.apache.commons.math.complex.Complex complex4 = complex0.divide(complex1);
        org.apache.commons.math.complex.Complex complex5 = complex0.cos();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.lcm(197, (-1604784744));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) 1672897414, (double) 4);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0652747866452925d + "'", double2 == 0.0652747866452925d);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex0.tan();
        org.apache.commons.math.complex.Complex complex4 = complex0.sin();
        org.apache.commons.math.complex.Complex complex5 = complex4.sqrt();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex7 = complex6.conjugate();
        org.apache.commons.math.complex.Complex complex8 = complex6.exp();
        org.apache.commons.math.complex.Complex complex9 = complex8.tan();
        org.apache.commons.math.complex.Complex complex10 = complex8.sqrt1z();
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math.complex.Complex complex13 = complex10.pow(complex11);
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.conjugate();
        org.apache.commons.math.complex.Complex complex16 = complex14.exp();
        org.apache.commons.math.complex.Complex complex17 = complex16.tan();
        org.apache.commons.math.complex.Complex complex18 = complex16.sqrt1z();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex20 = complex19.cosh();
        org.apache.commons.math.complex.Complex complex21 = complex18.pow(complex19);
        org.apache.commons.math.complex.Complex complex22 = complex21.acos();
        org.apache.commons.math.complex.Complex complex23 = complex21.tan();
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex25 = complex24.conjugate();
        org.apache.commons.math.complex.Complex complex26 = complex24.exp();
        org.apache.commons.math.complex.Complex complex27 = complex26.tan();
        org.apache.commons.math.complex.Complex complex28 = complex26.sqrt1z();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex30 = complex29.atan();
        org.apache.commons.math.complex.Complex complex31 = complex28.multiply(complex30);
        boolean boolean32 = complex30.isNaN();
        double double33 = complex30.getImaginary();
        org.apache.commons.math.complex.Complex complex34 = complex21.multiply(complex30);
        org.apache.commons.math.complex.Complex complex35 = complex10.subtract(complex21);
        org.apache.commons.math.complex.Complex complex36 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex37 = complex10.pow(complex36);
        org.apache.commons.math.complex.Complex complex38 = complex36.sqrt1z();
        boolean boolean39 = complex5.equals((java.lang.Object) complex36);
        org.apache.commons.math.complex.Complex complex40 = complex5.cosh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(complex40);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        long long1 = org.apache.commons.math.util.MathUtils.factorial(4);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 24L + "'", long1 == 24L);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) '4');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        int int2 = org.apache.commons.math.util.MathUtils.lcm(970, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15520 + "'", int2 == 15520);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog(97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 349.9541180407703d + "'", double1 == 349.9541180407703d);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = complex1.asin();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex4.exp();
        org.apache.commons.math.complex.Complex complex7 = complex6.tan();
        org.apache.commons.math.complex.Complex complex8 = complex6.sqrt1z();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex11 = complex8.pow(complex9);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex14 = complex12.exp();
        org.apache.commons.math.complex.Complex complex15 = complex14.tan();
        org.apache.commons.math.complex.Complex complex16 = complex14.sqrt1z();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex18 = complex17.cosh();
        org.apache.commons.math.complex.Complex complex19 = complex16.pow(complex17);
        org.apache.commons.math.complex.Complex complex20 = complex19.acos();
        org.apache.commons.math.complex.Complex complex21 = complex19.tan();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex23 = complex22.conjugate();
        org.apache.commons.math.complex.Complex complex24 = complex22.exp();
        org.apache.commons.math.complex.Complex complex25 = complex24.tan();
        org.apache.commons.math.complex.Complex complex26 = complex24.sqrt1z();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex28 = complex27.atan();
        org.apache.commons.math.complex.Complex complex29 = complex26.multiply(complex28);
        boolean boolean30 = complex28.isNaN();
        double double31 = complex28.getImaginary();
        org.apache.commons.math.complex.Complex complex32 = complex19.multiply(complex28);
        org.apache.commons.math.complex.Complex complex33 = complex8.subtract(complex19);
        org.apache.commons.math.complex.Complex complex34 = complex2.subtract(complex19);
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex36 = complex35.conjugate();
        org.apache.commons.math.complex.Complex complex37 = complex35.exp();
        org.apache.commons.math.complex.Complex complex38 = complex37.tan();
        org.apache.commons.math.complex.Complex complex39 = complex37.sqrt1z();
        org.apache.commons.math.complex.Complex complex40 = complex2.add(complex39);
        double double41 = complex39.abs();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) (-1604784744));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) 4, (long) 15520);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-15516L) + "'", long2 == (-15516L));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430806348152437d + "'", double1 == 1.5430806348152437d);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) 1079525376L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        int int1 = org.apache.commons.math.util.MathUtils.hash(92.13617560368711d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1505107694 + "'", int1 == 1505107694);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex0.tan();
        org.apache.commons.math.complex.Complex complex4 = complex0.negate();
        org.apache.commons.math.complex.Complex complex5 = complex0.tan();
        org.apache.commons.math.complex.Complex complex6 = complex5.exp();
        double double7 = complex6.getReal();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(37, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 97, (int) '4');
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) (-1604784744));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        double double2 = org.apache.commons.math.util.MathUtils.round((-1.0d), (-970));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(970, 1076101120);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(1076101120, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1715.9182777854467d + "'", double2 == 1715.9182777854467d);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog(532091496);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0158864323725563E10d + "'", double1 == 1.0158864323725563E10d);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) 2, (long) 37);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 39L + "'", long2 == 39L);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(4.9E-324d, (double) (-970));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((-9), 197);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-206) + "'", int2 == (-206));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-98), Double.NaN);
        org.apache.commons.math.complex.Complex complex3 = complex2.sinh();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex4.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex6.sqrt();
        org.apache.commons.math.complex.Complex complex8 = complex2.pow(complex7);
        boolean boolean9 = complex2.isNaN();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(0.0d, (double) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        int int2 = org.apache.commons.math.util.MathUtils.lcm(970, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        int int1 = org.apache.commons.math.util.MathUtils.sign((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) 0L, (double) 37);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.332621544395286E157d + "'", double1 == 9.332621544395286E157d);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck(1072693247L, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1072693248L + "'", long2 == 1072693248L);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((int) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.065817517094494E67d + "'", double1 == 8.065817517094494E67d);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) (-1072693248));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        float float2 = org.apache.commons.math.util.MathUtils.round((-1.0f), 37);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 1079525476L, (-970));
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-15516L), (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1551600L) + "'", long2 == (-1551600L));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex6.atan();
        org.apache.commons.math.complex.Complex complex8 = complex6.conjugate();
        org.apache.commons.math.complex.Complex complex9 = complex6.tan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(2121762133, 1076101120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1045661013 + "'", int2 == 1045661013);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) (-1072692998L), 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex4.exp();
        org.apache.commons.math.complex.Complex complex7 = complex6.tan();
        org.apache.commons.math.complex.Complex complex8 = complex6.sqrt1z();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex11 = complex8.pow(complex9);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex14 = complex12.exp();
        org.apache.commons.math.complex.Complex complex15 = complex14.tan();
        org.apache.commons.math.complex.Complex complex16 = complex14.sqrt1z();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex18 = complex17.cosh();
        org.apache.commons.math.complex.Complex complex19 = complex16.pow(complex17);
        org.apache.commons.math.complex.Complex complex20 = complex19.acos();
        org.apache.commons.math.complex.Complex complex21 = complex19.tan();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex23 = complex22.conjugate();
        org.apache.commons.math.complex.Complex complex24 = complex22.exp();
        org.apache.commons.math.complex.Complex complex25 = complex24.tan();
        org.apache.commons.math.complex.Complex complex26 = complex24.sqrt1z();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex28 = complex27.atan();
        org.apache.commons.math.complex.Complex complex29 = complex26.multiply(complex28);
        boolean boolean30 = complex28.isNaN();
        double double31 = complex28.getImaginary();
        org.apache.commons.math.complex.Complex complex32 = complex19.multiply(complex28);
        org.apache.commons.math.complex.Complex complex33 = complex8.subtract(complex19);
        org.apache.commons.math.complex.Complex complex34 = complex2.subtract(complex19);
        double double35 = complex19.getImaginary();
        org.apache.commons.math.complex.Complex complex36 = complex19.asin();
        org.apache.commons.math.complex.Complex complex37 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex38 = complex37.cosh();
        org.apache.commons.math.complex.Complex complex39 = complex38.sqrt();
        org.apache.commons.math.complex.Complex complex40 = complex36.subtract(complex38);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex3 = complex2.atan();
        boolean boolean4 = complex2.isNaN();
        org.apache.commons.math.complex.Complex complex5 = complex2.sqrt();
        boolean boolean6 = complex5.isNaN();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-42) + "'", int2 == (-42));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) 32L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) 1505107694);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) (short) -1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math.complex.Complex complex10 = complex8.exp();
        org.apache.commons.math.complex.Complex complex11 = complex10.tan();
        org.apache.commons.math.complex.Complex complex12 = complex10.sqrt1z();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        org.apache.commons.math.complex.Complex complex15 = complex12.pow(complex13);
        org.apache.commons.math.complex.Complex complex16 = complex15.acos();
        org.apache.commons.math.complex.Complex complex17 = complex15.tan();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.conjugate();
        org.apache.commons.math.complex.Complex complex20 = complex18.exp();
        org.apache.commons.math.complex.Complex complex21 = complex20.tan();
        org.apache.commons.math.complex.Complex complex22 = complex20.sqrt1z();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex24 = complex23.atan();
        org.apache.commons.math.complex.Complex complex25 = complex22.multiply(complex24);
        boolean boolean26 = complex24.isNaN();
        double double27 = complex24.getImaginary();
        org.apache.commons.math.complex.Complex complex28 = complex15.multiply(complex24);
        org.apache.commons.math.complex.Complex complex29 = complex4.subtract(complex15);
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex31 = complex4.pow(complex30);
        org.apache.commons.math.complex.Complex complex32 = complex31.acos();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) 10);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((-970), 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        long long1 = org.apache.commons.math.util.MathUtils.sign((-188L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) 'a', (long) 1076101120);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1076101023L) + "'", long2 == (-1076101023L));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (-98), Double.NaN);
        org.apache.commons.math.complex.Complex complex3 = complex2.sinh();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex4.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex6.sqrt();
        org.apache.commons.math.complex.Complex complex8 = complex2.pow(complex7);
        org.apache.commons.math.complex.Complex complex9 = complex7.conjugate();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 98L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) (-1072693247L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 0, 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex3 = complex2.atan();
        org.apache.commons.math.complex.Complex complex4 = complex3.acos();
        org.apache.commons.math.complex.Complex complex5 = complex4.sqrt();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        double double1 = org.apache.commons.math.util.MathUtils.indicator(59.05357183211846d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        double[] doubleArray6 = new double[] { 0.9999999999999999d, 10.0d, (byte) 0, 100.0f, 0L, 10L };
        int int7 = org.apache.commons.math.util.MathUtils.hash(doubleArray6);
        int int8 = org.apache.commons.math.util.MathUtils.hash(doubleArray6);
        int int9 = org.apache.commons.math.util.MathUtils.hash(doubleArray6);
        int int10 = org.apache.commons.math.util.MathUtils.hash(doubleArray6);
        int int11 = org.apache.commons.math.util.MathUtils.hash(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.9999999999999999, 10.0, 0.0, 100.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1672897414 + "'", int7 == 1672897414);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1672897414 + "'", int8 == 1672897414);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1672897414 + "'", int9 == 1672897414);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1672897414 + "'", int10 == 1672897414);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1672897414 + "'", int11 == 1672897414);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((-1072693247L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) 37, (-1072693248), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: BigInteger would overflow supported range");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 100L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        int int1 = org.apache.commons.math.util.MathUtils.sign((-98));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex2 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex3 = complex1.exp();
        org.apache.commons.math.complex.Complex complex4 = complex3.tan();
        org.apache.commons.math.complex.Complex complex5 = complex3.sqrt1z();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        org.apache.commons.math.complex.Complex complex8 = complex5.pow(complex6);
        org.apache.commons.math.complex.Complex complex9 = complex5.exp();
        org.apache.commons.math.complex.Complex complex10 = complex0.pow(complex5);
        org.apache.commons.math.complex.Complex complex11 = complex0.tanh();
        boolean boolean13 = complex11.equals((java.lang.Object) 1L);
        org.apache.commons.math.complex.Complex complex14 = complex11.sqrt1z();
        org.apache.commons.math.complex.Complex complex15 = complex14.tan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex3 = complex2.sqrt();
        boolean boolean4 = complex3.isNaN();
        org.apache.commons.math.complex.Complex complex5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex6 = complex3.add(complex5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(0, (-1604784744));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) '4', 1.0d);
        org.apache.commons.math.complex.Complex complex3 = complex2.sin();
        org.apache.commons.math.complex.Complex complex4 = complex2.sin();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial(532091496);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: result too large to represent in a long integer");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) (short) 10, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex5.tanh();
        org.apache.commons.math.complex.Complex complex7 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex8 = complex6.conjugate();
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        int int1 = org.apache.commons.math.util.MathUtils.sign((-206));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        long long1 = org.apache.commons.math.util.MathUtils.sign((-1551600L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) (byte) 1, (double) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        int int1 = org.apache.commons.math.util.MathUtils.hash((-1.0d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1074790400) + "'", int1 == (-1074790400));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex1.cos();
        org.apache.commons.math.complex.Complex complex4 = complex0.divide(complex1);
        org.apache.commons.math.complex.Complex complex5 = complex0.log();
        org.apache.commons.math.complex.Complex complex6 = complex0.sin();
        org.apache.commons.math.complex.Complex complex7 = complex0.negate();
        org.apache.commons.math.complex.Complex complex8 = complex7.tan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(98);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.426890448884134E153d + "'", double1 == 9.426890448884134E153d);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(15.104412573075518d, 0.6931471805599453d);
        org.apache.commons.math.complex.Complex complex3 = complex2.exp();
        double double4 = complex2.abs();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.120308601070285d + "'", double4 == 15.120308601070285d);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        int int2 = org.apache.commons.math.util.MathUtils.lcm(97, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9700 + "'", int2 == 9700);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.332621544395286E157d + "'", double1 == 9.332621544395286E157d);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck(1672897414, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck(1505107694, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        double double2 = org.apache.commons.math.util.MathUtils.log((-0.9999999999999999d), (double) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) 101, 0.8414709848078965d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4690350851266203d + "'", double2 == 0.4690350851266203d);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math.complex.Complex complex10 = complex8.exp();
        org.apache.commons.math.complex.Complex complex11 = complex10.tan();
        org.apache.commons.math.complex.Complex complex12 = complex10.sqrt1z();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        org.apache.commons.math.complex.Complex complex15 = complex12.pow(complex13);
        org.apache.commons.math.complex.Complex complex16 = complex15.acos();
        org.apache.commons.math.complex.Complex complex17 = complex15.tan();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.conjugate();
        org.apache.commons.math.complex.Complex complex20 = complex18.exp();
        org.apache.commons.math.complex.Complex complex21 = complex20.tan();
        org.apache.commons.math.complex.Complex complex22 = complex20.sqrt1z();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex24 = complex23.atan();
        org.apache.commons.math.complex.Complex complex25 = complex22.multiply(complex24);
        boolean boolean26 = complex24.isNaN();
        double double27 = complex24.getImaginary();
        org.apache.commons.math.complex.Complex complex28 = complex15.multiply(complex24);
        org.apache.commons.math.complex.Complex complex29 = complex4.subtract(complex15);
        org.apache.commons.math.complex.Complex complex30 = complex29.sinh();
        org.apache.commons.math.complex.Complex complex31 = complex29.atan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(10, 1672897414);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1672897424 + "'", int2 == 1672897424);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) 197);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex9.exp();
        org.apache.commons.math.complex.Complex complex12 = complex11.tan();
        org.apache.commons.math.complex.Complex complex13 = complex11.sqrt1z();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex16 = complex13.pow(complex14);
        org.apache.commons.math.complex.Complex complex17 = complex13.exp();
        org.apache.commons.math.complex.Complex complex18 = complex8.pow(complex13);
        boolean boolean19 = complex5.equals((java.lang.Object) complex8);
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex21 = complex20.conjugate();
        org.apache.commons.math.complex.Complex complex22 = complex20.exp();
        org.apache.commons.math.complex.Complex complex23 = complex22.tan();
        org.apache.commons.math.complex.Complex complex24 = complex22.sqrt1z();
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex26 = complex25.cosh();
        org.apache.commons.math.complex.Complex complex27 = complex24.pow(complex25);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex30 = complex29.conjugate();
        org.apache.commons.math.complex.Complex complex31 = complex29.exp();
        org.apache.commons.math.complex.Complex complex32 = complex31.tan();
        org.apache.commons.math.complex.Complex complex33 = complex31.sqrt1z();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex35 = complex34.cosh();
        org.apache.commons.math.complex.Complex complex36 = complex33.pow(complex34);
        org.apache.commons.math.complex.Complex complex37 = complex33.exp();
        org.apache.commons.math.complex.Complex complex38 = complex28.pow(complex33);
        boolean boolean39 = complex25.equals((java.lang.Object) complex28);
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex41 = complex40.cosh();
        org.apache.commons.math.complex.Complex complex42 = complex25.multiply(complex41);
        boolean boolean43 = complex25.isNaN();
        org.apache.commons.math.complex.Complex complex44 = complex5.multiply(complex25);
        boolean boolean45 = complex25.isNaN();
        double double46 = complex25.abs();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(1076101120, 532091496);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 544009624 + "'", int2 == 544009624);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(532091496, 9);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.434787105502285E72d + "'", double2 == 9.434787105502285E72d);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math.complex.Complex complex10 = complex8.exp();
        org.apache.commons.math.complex.Complex complex11 = complex10.tan();
        org.apache.commons.math.complex.Complex complex12 = complex10.sqrt1z();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        org.apache.commons.math.complex.Complex complex15 = complex12.pow(complex13);
        org.apache.commons.math.complex.Complex complex16 = complex15.acos();
        org.apache.commons.math.complex.Complex complex17 = complex15.tan();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.conjugate();
        org.apache.commons.math.complex.Complex complex20 = complex18.exp();
        org.apache.commons.math.complex.Complex complex21 = complex20.tan();
        org.apache.commons.math.complex.Complex complex22 = complex20.sqrt1z();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex24 = complex23.atan();
        org.apache.commons.math.complex.Complex complex25 = complex22.multiply(complex24);
        boolean boolean26 = complex24.isNaN();
        double double27 = complex24.getImaginary();
        org.apache.commons.math.complex.Complex complex28 = complex15.multiply(complex24);
        org.apache.commons.math.complex.Complex complex29 = complex4.subtract(complex15);
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex31 = complex4.pow(complex30);
        org.apache.commons.math.complex.Complex complex32 = complex30.atan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(98, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex5.sinh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) 2121762133, (-212393252808L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-210271490675L) + "'", long2 == (-210271490675L));
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.619275968248924E151d + "'", double1 == 9.619275968248924E151d);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) (-42), (long) 1672897424);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1672897382L + "'", long2 == 1672897382L);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex2 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex3 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex4.cos();
        boolean boolean8 = complex4.equals((java.lang.Object) 970);
        org.apache.commons.math.complex.Complex complex9 = complex4.acos();
        org.apache.commons.math.complex.Complex complex10 = complex0.multiply(complex4);
        org.apache.commons.math.complex.Complex complex11 = complex0.sqrt1z();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math.complex.Complex complex10 = complex8.exp();
        org.apache.commons.math.complex.Complex complex11 = complex10.tan();
        org.apache.commons.math.complex.Complex complex12 = complex10.sqrt1z();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        org.apache.commons.math.complex.Complex complex15 = complex12.pow(complex13);
        org.apache.commons.math.complex.Complex complex16 = complex15.acos();
        org.apache.commons.math.complex.Complex complex17 = complex15.tan();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.conjugate();
        org.apache.commons.math.complex.Complex complex20 = complex18.exp();
        org.apache.commons.math.complex.Complex complex21 = complex20.tan();
        org.apache.commons.math.complex.Complex complex22 = complex20.sqrt1z();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex24 = complex23.atan();
        org.apache.commons.math.complex.Complex complex25 = complex22.multiply(complex24);
        boolean boolean26 = complex24.isNaN();
        double double27 = complex24.getImaginary();
        org.apache.commons.math.complex.Complex complex28 = complex15.multiply(complex24);
        org.apache.commons.math.complex.Complex complex29 = complex4.subtract(complex15);
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex31 = complex30.conjugate();
        org.apache.commons.math.complex.Complex complex32 = complex30.exp();
        org.apache.commons.math.complex.Complex complex33 = complex32.tan();
        org.apache.commons.math.complex.Complex complex34 = complex32.sqrt1z();
        org.apache.commons.math.complex.Complex complex35 = complex34.conjugate();
        org.apache.commons.math.complex.Complex complex36 = complex35.cosh();
        org.apache.commons.math.complex.Complex complex37 = complex15.pow(complex35);
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex39 = complex38.conjugate();
        org.apache.commons.math.complex.Complex complex40 = complex38.exp();
        org.apache.commons.math.complex.Complex complex41 = complex40.tan();
        org.apache.commons.math.complex.Complex complex42 = complex40.sqrt1z();
        org.apache.commons.math.complex.Complex complex43 = complex42.conjugate();
        org.apache.commons.math.complex.Complex complex44 = complex43.cosh();
        java.lang.Class<?> wildcardClass45 = complex43.getClass();
        boolean boolean46 = complex35.equals((java.lang.Object) wildcardClass45);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) (-1072693248));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.691673596021348E41d + "'", double1 == 6.691673596021348E41d);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) 0, (-1072692998L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1072692998L + "'", long2 == 1072692998L);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex3 = complex2.sqrt();
        boolean boolean4 = complex3.isNaN();
        org.apache.commons.math.complex.Complex complex5 = complex3.asin();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math.complex.Complex complex10 = complex8.exp();
        org.apache.commons.math.complex.Complex complex11 = complex10.tan();
        org.apache.commons.math.complex.Complex complex12 = complex10.sqrt1z();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        org.apache.commons.math.complex.Complex complex15 = complex12.pow(complex13);
        org.apache.commons.math.complex.Complex complex16 = complex15.acos();
        org.apache.commons.math.complex.Complex complex17 = complex15.tan();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.conjugate();
        org.apache.commons.math.complex.Complex complex20 = complex18.exp();
        org.apache.commons.math.complex.Complex complex21 = complex20.tan();
        org.apache.commons.math.complex.Complex complex22 = complex20.sqrt1z();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex24 = complex23.atan();
        org.apache.commons.math.complex.Complex complex25 = complex22.multiply(complex24);
        boolean boolean26 = complex24.isNaN();
        double double27 = complex24.getImaginary();
        org.apache.commons.math.complex.Complex complex28 = complex15.multiply(complex24);
        org.apache.commons.math.complex.Complex complex29 = complex4.subtract(complex15);
        org.apache.commons.math.complex.Complex complex30 = complex15.sinh();
        org.apache.commons.math.complex.Complex complex31 = complex15.tan();
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex33 = complex32.conjugate();
        org.apache.commons.math.complex.Complex complex34 = complex32.exp();
        org.apache.commons.math.complex.Complex complex35 = complex34.tan();
        org.apache.commons.math.complex.Complex complex36 = complex34.sqrt1z();
        org.apache.commons.math.complex.Complex complex37 = complex36.conjugate();
        org.apache.commons.math.complex.Complex complex38 = complex37.tanh();
        org.apache.commons.math.complex.Complex complex39 = complex38.sinh();
        org.apache.commons.math.complex.Complex complex40 = complex38.conjugate();
        org.apache.commons.math.complex.Complex complex41 = complex31.add(complex40);
        org.apache.commons.math.complex.Complex complex42 = complex31.asin();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(15520, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15521 + "'", int2 == 15521);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        long long1 = org.apache.commons.math.util.MathUtils.factorial((int) (short) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog(0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex2 = complex0.cos();
        double double3 = complex2.getImaginary();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex4.sqrt();
        org.apache.commons.math.complex.Complex complex7 = complex6.atan();
        boolean boolean8 = complex6.isNaN();
        org.apache.commons.math.complex.Complex complex9 = complex6.sqrt();
        org.apache.commons.math.complex.Complex complex10 = complex2.divide(complex9);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(0, (-9));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (short) 100, (double) (-1604784744));
        org.apache.commons.math.complex.Complex complex3 = complex2.negate();
        org.junit.Assert.assertNotNull(complex3);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) (-970), (-1072693195L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1072692225L + "'", long2 == 1072692225L);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math.complex.Complex complex10 = complex8.exp();
        org.apache.commons.math.complex.Complex complex11 = complex10.tan();
        org.apache.commons.math.complex.Complex complex12 = complex10.sqrt1z();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        org.apache.commons.math.complex.Complex complex15 = complex12.pow(complex13);
        org.apache.commons.math.complex.Complex complex16 = complex15.acos();
        org.apache.commons.math.complex.Complex complex17 = complex15.tan();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.conjugate();
        org.apache.commons.math.complex.Complex complex20 = complex18.exp();
        org.apache.commons.math.complex.Complex complex21 = complex20.tan();
        org.apache.commons.math.complex.Complex complex22 = complex20.sqrt1z();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex24 = complex23.atan();
        org.apache.commons.math.complex.Complex complex25 = complex22.multiply(complex24);
        boolean boolean26 = complex24.isNaN();
        double double27 = complex24.getImaginary();
        org.apache.commons.math.complex.Complex complex28 = complex15.multiply(complex24);
        org.apache.commons.math.complex.Complex complex29 = complex4.subtract(complex15);
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex31 = complex4.pow(complex30);
        org.apache.commons.math.complex.Complex complex32 = complex30.cos();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial((-970));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= 0 for n!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) (-970));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math.complex.Complex complex10 = complex8.exp();
        org.apache.commons.math.complex.Complex complex11 = complex10.tan();
        org.apache.commons.math.complex.Complex complex12 = complex10.sqrt1z();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        org.apache.commons.math.complex.Complex complex15 = complex12.pow(complex13);
        org.apache.commons.math.complex.Complex complex16 = complex15.acos();
        org.apache.commons.math.complex.Complex complex17 = complex15.tan();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.conjugate();
        org.apache.commons.math.complex.Complex complex20 = complex18.exp();
        org.apache.commons.math.complex.Complex complex21 = complex20.tan();
        org.apache.commons.math.complex.Complex complex22 = complex20.sqrt1z();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex24 = complex23.atan();
        org.apache.commons.math.complex.Complex complex25 = complex22.multiply(complex24);
        boolean boolean26 = complex24.isNaN();
        double double27 = complex24.getImaginary();
        org.apache.commons.math.complex.Complex complex28 = complex15.multiply(complex24);
        org.apache.commons.math.complex.Complex complex29 = complex4.subtract(complex15);
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex31 = complex4.pow(complex30);
        org.apache.commons.math.complex.Complex complex32 = complex30.sqrt1z();
        org.apache.commons.math.complex.Complex complex33 = complex30.log();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) (short) 0, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 2, (double) (-1074790400));
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 1L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex3 = complex2.atan();
        org.apache.commons.math.complex.Complex complex4 = complex3.acos();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex5.cos();
        double double8 = complex7.getImaginary();
        org.apache.commons.math.complex.Complex complex9 = complex7.tanh();
        org.apache.commons.math.complex.Complex complex10 = complex7.exp();
        org.apache.commons.math.complex.Complex complex11 = complex3.pow(complex10);
        org.apache.commons.math.complex.Complex complex12 = complex3.asin();
        org.apache.commons.math.complex.Complex complex13 = complex3.tan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.0d) + "'", double8 == (-0.0d));
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex1 = complex0.atan();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex3 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex4 = complex3.conjugate();
        org.apache.commons.math.complex.Complex complex5 = complex2.pow(complex3);
        org.apache.commons.math.complex.Complex complex6 = complex0.multiply(complex2);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -1 + "'", short1 == (short) -1);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = complex7.sin();
        java.lang.Class<?> wildcardClass9 = complex8.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex2 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex3 = complex1.exp();
        org.apache.commons.math.complex.Complex complex4 = complex3.tan();
        org.apache.commons.math.complex.Complex complex5 = complex3.sqrt1z();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex7 = complex6.cosh();
        org.apache.commons.math.complex.Complex complex8 = complex5.pow(complex6);
        org.apache.commons.math.complex.Complex complex9 = complex5.exp();
        org.apache.commons.math.complex.Complex complex10 = complex0.pow(complex5);
        org.apache.commons.math.complex.Complex complex11 = complex0.tanh();
        boolean boolean13 = complex11.equals((java.lang.Object) 1L);
        org.apache.commons.math.complex.Complex complex14 = complex11.sqrt1z();
        org.apache.commons.math.complex.Complex complex15 = complex11.log();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        int int1 = org.apache.commons.math.util.MathUtils.sign(9700);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(2);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math.complex.Complex complex10 = complex8.exp();
        org.apache.commons.math.complex.Complex complex11 = complex10.tan();
        org.apache.commons.math.complex.Complex complex12 = complex10.sqrt1z();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        org.apache.commons.math.complex.Complex complex15 = complex12.pow(complex13);
        org.apache.commons.math.complex.Complex complex16 = complex15.acos();
        org.apache.commons.math.complex.Complex complex17 = complex15.tan();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.conjugate();
        org.apache.commons.math.complex.Complex complex20 = complex18.exp();
        org.apache.commons.math.complex.Complex complex21 = complex20.tan();
        org.apache.commons.math.complex.Complex complex22 = complex20.sqrt1z();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex24 = complex23.atan();
        org.apache.commons.math.complex.Complex complex25 = complex22.multiply(complex24);
        boolean boolean26 = complex24.isNaN();
        double double27 = complex24.getImaginary();
        org.apache.commons.math.complex.Complex complex28 = complex15.multiply(complex24);
        org.apache.commons.math.complex.Complex complex29 = complex4.subtract(complex15);
        org.apache.commons.math.complex.Complex complex30 = complex15.sinh();
        org.apache.commons.math.complex.Complex complex31 = complex15.tan();
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex33 = complex32.conjugate();
        org.apache.commons.math.complex.Complex complex34 = complex32.exp();
        org.apache.commons.math.complex.Complex complex35 = complex34.tan();
        org.apache.commons.math.complex.Complex complex36 = complex34.sqrt1z();
        org.apache.commons.math.complex.Complex complex37 = complex36.conjugate();
        org.apache.commons.math.complex.Complex complex38 = complex37.tanh();
        org.apache.commons.math.complex.Complex complex39 = complex38.sinh();
        org.apache.commons.math.complex.Complex complex40 = complex38.conjugate();
        org.apache.commons.math.complex.Complex complex41 = complex31.add(complex40);
        org.apache.commons.math.complex.Complex complex42 = complex40.cosh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex3 = complex2.sqrt();
        org.apache.commons.math.complex.Complex complex4 = complex3.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = complex4.sinh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) (-1076101023L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 1079525476L, (double) 1076101120);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        float float3 = org.apache.commons.math.util.MathUtils.round((float) 36L, (-42), 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + Float.POSITIVE_INFINITY + "'", float3 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 100L, (double) (-188L));
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) (short) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) (byte) 10, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((-970L), (long) 9700);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-10670L) + "'", long2 == (-10670L));
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math.complex.Complex complex10 = complex8.exp();
        org.apache.commons.math.complex.Complex complex11 = complex10.tan();
        org.apache.commons.math.complex.Complex complex12 = complex10.sqrt1z();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        org.apache.commons.math.complex.Complex complex15 = complex12.pow(complex13);
        org.apache.commons.math.complex.Complex complex16 = complex15.acos();
        org.apache.commons.math.complex.Complex complex17 = complex15.tan();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.conjugate();
        org.apache.commons.math.complex.Complex complex20 = complex18.exp();
        org.apache.commons.math.complex.Complex complex21 = complex20.tan();
        org.apache.commons.math.complex.Complex complex22 = complex20.sqrt1z();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex24 = complex23.atan();
        org.apache.commons.math.complex.Complex complex25 = complex22.multiply(complex24);
        boolean boolean26 = complex24.isNaN();
        double double27 = complex24.getImaginary();
        org.apache.commons.math.complex.Complex complex28 = complex15.multiply(complex24);
        org.apache.commons.math.complex.Complex complex29 = complex4.subtract(complex15);
        org.apache.commons.math.complex.Complex complex30 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex31 = complex30.cosh();
        org.apache.commons.math.complex.Complex complex32 = complex30.cos();
        double double33 = complex32.getImaginary();
        org.apache.commons.math.complex.Complex complex34 = complex32.tanh();
        org.apache.commons.math.complex.Complex complex35 = complex29.subtract(complex32);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-0.0d) + "'", double33 == (-0.0d));
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.log();
        double double4 = complex2.getReal();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = complex7.acos();
        org.apache.commons.math.complex.Complex complex9 = complex7.conjugate();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ONE;
        org.apache.commons.math.complex.Complex complex11 = complex7.multiply(complex10);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-1072693248), 36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = complex7.acos();
        org.apache.commons.math.complex.Complex complex9 = complex7.conjugate();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex11 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex12 = complex11.cosh();
        org.apache.commons.math.complex.Complex complex13 = complex11.cos();
        org.apache.commons.math.complex.Complex complex14 = complex10.divide(complex11);
        org.apache.commons.math.complex.Complex complex15 = complex14.negate();
        org.apache.commons.math.complex.Complex complex16 = complex9.pow(complex14);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-970), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex9.exp();
        org.apache.commons.math.complex.Complex complex12 = complex11.tan();
        org.apache.commons.math.complex.Complex complex13 = complex11.sqrt1z();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex16 = complex13.pow(complex14);
        org.apache.commons.math.complex.Complex complex17 = complex13.exp();
        org.apache.commons.math.complex.Complex complex18 = complex8.pow(complex13);
        boolean boolean19 = complex5.equals((java.lang.Object) complex8);
        org.apache.commons.math.complex.Complex complex20 = complex8.acos();
        org.apache.commons.math.complex.Complex complex21 = complex20.atan();
        org.apache.commons.math.complex.Complex complex22 = complex21.atan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(15521, (-1072693248));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        byte byte1 = org.apache.commons.math.util.MathUtils.indicator((byte) 100);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 1079525376, 101, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex1.cos();
        org.apache.commons.math.complex.Complex complex4 = complex0.divide(complex1);
        org.apache.commons.math.complex.Complex complex5 = complex0.asin();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex7 = complex6.conjugate();
        org.apache.commons.math.complex.Complex complex8 = complex6.exp();
        org.apache.commons.math.complex.Complex complex9 = complex8.tan();
        org.apache.commons.math.complex.Complex complex10 = complex8.sqrt1z();
        boolean boolean11 = complex10.isInfinite();
        org.apache.commons.math.complex.Complex complex12 = complex0.multiply(complex10);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        org.apache.commons.math.complex.Complex complex15 = complex13.sqrt();
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex18 = complex17.conjugate();
        org.apache.commons.math.complex.Complex complex19 = complex17.exp();
        org.apache.commons.math.complex.Complex complex20 = complex19.tan();
        org.apache.commons.math.complex.Complex complex21 = complex19.sqrt1z();
        org.apache.commons.math.complex.Complex complex22 = complex21.conjugate();
        org.apache.commons.math.complex.Complex complex23 = complex15.pow(complex22);
        org.apache.commons.math.complex.Complex complex24 = complex22.cosh();
        org.apache.commons.math.complex.Complex complex25 = complex10.add(complex22);
        org.apache.commons.math.complex.Complex complex26 = complex25.sqrt();
        org.apache.commons.math.complex.Complex complex27 = complex26.sinh();
        org.apache.commons.math.complex.Complex complex28 = complex27.sinh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((-0.9999999999999999d), 9.619275968248924E151d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math.complex.Complex complex10 = complex8.exp();
        org.apache.commons.math.complex.Complex complex11 = complex10.tan();
        org.apache.commons.math.complex.Complex complex12 = complex10.sqrt1z();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        org.apache.commons.math.complex.Complex complex15 = complex12.pow(complex13);
        org.apache.commons.math.complex.Complex complex16 = complex15.acos();
        org.apache.commons.math.complex.Complex complex17 = complex15.tan();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.conjugate();
        org.apache.commons.math.complex.Complex complex20 = complex18.exp();
        org.apache.commons.math.complex.Complex complex21 = complex20.tan();
        org.apache.commons.math.complex.Complex complex22 = complex20.sqrt1z();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex24 = complex23.atan();
        org.apache.commons.math.complex.Complex complex25 = complex22.multiply(complex24);
        boolean boolean26 = complex24.isNaN();
        double double27 = complex24.getImaginary();
        org.apache.commons.math.complex.Complex complex28 = complex15.multiply(complex24);
        org.apache.commons.math.complex.Complex complex29 = complex4.subtract(complex15);
        org.apache.commons.math.complex.Complex complex30 = complex29.sinh();
        org.apache.commons.math.complex.Complex complex31 = complex30.log();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex2 = complex1.atan();
        org.apache.commons.math.complex.Complex complex3 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex4 = complex3.sqrt1z();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 544009624, 2121762133);
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((-10), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) 98L, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        double double1 = org.apache.commons.math.util.MathUtils.sign((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((-206));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) (-1072693248), (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.07269325E9f) + "'", float2 == (-1.07269325E9f));
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        double double1 = org.apache.commons.math.util.MathUtils.sinh(15.120308601070285d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1843472.207334223d + "'", double1 == 1843472.207334223d);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex2 = complex1.sinh();
        org.apache.commons.math.complex.Complex complex3 = complex2.atan();
        boolean boolean4 = complex2.isInfinite();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) (short) 100, (double) (-1604784744));
        java.lang.Class<?> wildcardClass3 = complex2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex0.tan();
        org.apache.commons.math.complex.Complex complex4 = complex0.sin();
        org.apache.commons.math.complex.Complex complex5 = complex4.sinh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex((double) 1079525376, 1.0333147966386297E40d);
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex3.cosh();
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(970, 1672897424);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex2 = complex1.sinh();
        org.apache.commons.math.complex.Complex complex3 = complex2.atan();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex4.exp();
        org.apache.commons.math.complex.Complex complex7 = complex6.tan();
        org.apache.commons.math.complex.Complex complex8 = complex6.sqrt1z();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex11 = complex8.pow(complex9);
        org.apache.commons.math.complex.Complex complex12 = complex11.acos();
        org.apache.commons.math.complex.Complex complex13 = complex11.tan();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.conjugate();
        org.apache.commons.math.complex.Complex complex16 = complex14.exp();
        org.apache.commons.math.complex.Complex complex17 = complex16.tan();
        org.apache.commons.math.complex.Complex complex18 = complex16.sqrt1z();
        org.apache.commons.math.complex.Complex complex19 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex20 = complex19.atan();
        org.apache.commons.math.complex.Complex complex21 = complex18.multiply(complex20);
        boolean boolean22 = complex20.isNaN();
        double double23 = complex20.getImaginary();
        org.apache.commons.math.complex.Complex complex24 = complex11.multiply(complex20);
        org.apache.commons.math.complex.Complex complex25 = complex3.add(complex11);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex9.exp();
        org.apache.commons.math.complex.Complex complex12 = complex11.tan();
        org.apache.commons.math.complex.Complex complex13 = complex11.sqrt1z();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex16 = complex13.pow(complex14);
        org.apache.commons.math.complex.Complex complex17 = complex13.exp();
        org.apache.commons.math.complex.Complex complex18 = complex8.pow(complex13);
        boolean boolean19 = complex5.equals((java.lang.Object) complex8);
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.cosh();
        org.apache.commons.math.complex.Complex complex23 = complex21.cos();
        org.apache.commons.math.complex.Complex complex24 = complex20.divide(complex21);
        org.apache.commons.math.complex.Complex complex25 = complex24.negate();
        org.apache.commons.math.complex.Complex complex26 = complex8.divide(complex25);
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.INF;
        double double28 = complex27.getImaginary();
        boolean boolean29 = complex26.equals((java.lang.Object) complex27);
        org.apache.commons.math.complex.Complex complex30 = complex26.cos();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + Double.POSITIVE_INFINITY + "'", double28 == Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(complex30);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck(10L, (-970L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-960L) + "'", long2 == (-960L));
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((int) (short) 1, 1672897424);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) (-206), (double) (-9));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-11.221255477432834d) + "'", double2 == (-11.221255477432834d));
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math.complex.Complex complex10 = complex8.exp();
        org.apache.commons.math.complex.Complex complex11 = complex10.tan();
        org.apache.commons.math.complex.Complex complex12 = complex10.sqrt1z();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        org.apache.commons.math.complex.Complex complex15 = complex12.pow(complex13);
        org.apache.commons.math.complex.Complex complex16 = complex15.acos();
        org.apache.commons.math.complex.Complex complex17 = complex15.tan();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.conjugate();
        org.apache.commons.math.complex.Complex complex20 = complex18.exp();
        org.apache.commons.math.complex.Complex complex21 = complex20.tan();
        org.apache.commons.math.complex.Complex complex22 = complex20.sqrt1z();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex24 = complex23.atan();
        org.apache.commons.math.complex.Complex complex25 = complex22.multiply(complex24);
        boolean boolean26 = complex24.isNaN();
        double double27 = complex24.getImaginary();
        org.apache.commons.math.complex.Complex complex28 = complex15.multiply(complex24);
        org.apache.commons.math.complex.Complex complex29 = complex4.subtract(complex15);
        org.apache.commons.math.complex.Complex complex30 = complex29.atan();
        org.apache.commons.math.complex.Complex complex31 = complex30.tan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) 0.0f, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        boolean boolean5 = complex4.isInfinite();
        org.apache.commons.math.complex.Complex complex6 = complex4.acos();
        org.apache.commons.math.complex.Complex complex7 = complex4.tanh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        double double1 = org.apache.commons.math.util.MathUtils.sinh(1.079525476E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(1.079525476E9d, 4.574710978503383d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) 197, (double) 32L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 196.99999999999997d + "'", double2 == 196.99999999999997d);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex6.atan();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math.complex.Complex complex10 = complex8.exp();
        org.apache.commons.math.complex.Complex complex11 = complex10.tan();
        org.apache.commons.math.complex.Complex complex12 = complex10.sqrt1z();
        org.apache.commons.math.complex.Complex complex13 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        org.apache.commons.math.complex.Complex complex15 = complex14.atan();
        boolean boolean16 = complex6.equals((java.lang.Object) complex14);
        org.apache.commons.math.complex.Complex complex17 = complex6.sqrt1z();
        org.apache.commons.math.complex.Complex complex18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.complex.Complex complex19 = complex17.multiply(complex18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(complex17);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        float float3 = org.apache.commons.math.util.MathUtils.round((float) 1072692225L, (-9), 4);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0E9f + "'", float3 == 1.0E9f);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) '4', (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 416 + "'", int2 == 416);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex2 = complex1.conjugate();
        org.apache.commons.math.complex.Complex complex3 = complex0.pow(complex1);
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex5 = complex4.cosh();
        org.apache.commons.math.complex.Complex complex6 = complex4.cos();
        boolean boolean8 = complex4.equals((java.lang.Object) 970);
        org.apache.commons.math.complex.Complex complex9 = complex4.acos();
        org.apache.commons.math.complex.Complex complex10 = complex0.multiply(complex4);
        double double11 = complex0.getReal();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        double[] doubleArray6 = new double[] { 0.9999999999999999d, 10.0d, (byte) 0, 100.0f, 0L, 10L };
        int int7 = org.apache.commons.math.util.MathUtils.hash(doubleArray6);
        int int8 = org.apache.commons.math.util.MathUtils.hash(doubleArray6);
        double[] doubleArray15 = new double[] { 0.9999999999999999d, 10.0d, (byte) 0, 100.0f, 0L, 10L };
        int int16 = org.apache.commons.math.util.MathUtils.hash(doubleArray15);
        int int17 = org.apache.commons.math.util.MathUtils.hash(doubleArray15);
        int int18 = org.apache.commons.math.util.MathUtils.hash(doubleArray15);
        boolean boolean19 = org.apache.commons.math.util.MathUtils.equals(doubleArray6, doubleArray15);
        int int20 = org.apache.commons.math.util.MathUtils.hash(doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.9999999999999999, 10.0, 0.0, 100.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1672897414 + "'", int7 == 1672897414);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1672897414 + "'", int8 == 1672897414);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.9999999999999999, 10.0, 0.0, 100.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1672897414 + "'", int16 == 1672897414);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1672897414 + "'", int17 == 1672897414);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1672897414 + "'", int18 == 1672897414);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1672897414 + "'", int20 == 1672897414);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) (short) 100, (-970));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1070 + "'", int2 == 1070);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) 416);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.conjugate();
        org.apache.commons.math.complex.Complex complex7 = complex5.exp();
        org.apache.commons.math.complex.Complex complex8 = complex7.tan();
        org.apache.commons.math.complex.Complex complex9 = complex2.multiply(complex7);
        org.apache.commons.math.complex.Complex complex10 = complex9.sin();
        double double11 = complex10.getReal();
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex14 = complex12.exp();
        org.apache.commons.math.complex.Complex complex15 = complex14.tan();
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex17 = complex16.conjugate();
        org.apache.commons.math.complex.Complex complex18 = complex16.exp();
        org.apache.commons.math.complex.Complex complex19 = complex18.tan();
        org.apache.commons.math.complex.Complex complex20 = complex18.sqrt1z();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.cosh();
        org.apache.commons.math.complex.Complex complex23 = complex20.pow(complex21);
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex25 = complex24.conjugate();
        org.apache.commons.math.complex.Complex complex26 = complex24.exp();
        org.apache.commons.math.complex.Complex complex27 = complex26.tan();
        org.apache.commons.math.complex.Complex complex28 = complex26.sqrt1z();
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex30 = complex29.cosh();
        org.apache.commons.math.complex.Complex complex31 = complex28.pow(complex29);
        org.apache.commons.math.complex.Complex complex32 = complex31.acos();
        org.apache.commons.math.complex.Complex complex33 = complex31.tan();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex35 = complex34.conjugate();
        org.apache.commons.math.complex.Complex complex36 = complex34.exp();
        org.apache.commons.math.complex.Complex complex37 = complex36.tan();
        org.apache.commons.math.complex.Complex complex38 = complex36.sqrt1z();
        org.apache.commons.math.complex.Complex complex39 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex40 = complex39.atan();
        org.apache.commons.math.complex.Complex complex41 = complex38.multiply(complex40);
        boolean boolean42 = complex40.isNaN();
        double double43 = complex40.getImaginary();
        org.apache.commons.math.complex.Complex complex44 = complex31.multiply(complex40);
        org.apache.commons.math.complex.Complex complex45 = complex20.subtract(complex31);
        org.apache.commons.math.complex.Complex complex46 = complex14.subtract(complex31);
        org.apache.commons.math.complex.Complex complex47 = complex10.subtract(complex31);
        org.apache.commons.math.complex.Complex complex50 = new org.apache.commons.math.complex.Complex((double) (-98), Double.NaN);
        org.apache.commons.math.complex.Complex complex51 = complex50.sinh();
        org.apache.commons.math.complex.Complex complex52 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex53 = complex52.cosh();
        org.apache.commons.math.complex.Complex complex54 = complex52.sqrt();
        org.apache.commons.math.complex.Complex complex55 = complex54.sqrt();
        org.apache.commons.math.complex.Complex complex56 = complex50.pow(complex55);
        org.apache.commons.math.complex.Complex complex57 = complex10.add(complex50);
        org.apache.commons.math.complex.Complex complex58 = complex57.negate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.8414709848078965d + "'", double11 == 0.8414709848078965d);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex4.exp();
        org.apache.commons.math.complex.Complex complex7 = complex6.tan();
        org.apache.commons.math.complex.Complex complex8 = complex6.sqrt1z();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex11 = complex8.pow(complex9);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex14 = complex12.exp();
        org.apache.commons.math.complex.Complex complex15 = complex14.tan();
        org.apache.commons.math.complex.Complex complex16 = complex14.sqrt1z();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex18 = complex17.cosh();
        org.apache.commons.math.complex.Complex complex19 = complex16.pow(complex17);
        org.apache.commons.math.complex.Complex complex20 = complex19.acos();
        org.apache.commons.math.complex.Complex complex21 = complex19.tan();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex23 = complex22.conjugate();
        org.apache.commons.math.complex.Complex complex24 = complex22.exp();
        org.apache.commons.math.complex.Complex complex25 = complex24.tan();
        org.apache.commons.math.complex.Complex complex26 = complex24.sqrt1z();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex28 = complex27.atan();
        org.apache.commons.math.complex.Complex complex29 = complex26.multiply(complex28);
        boolean boolean30 = complex28.isNaN();
        double double31 = complex28.getImaginary();
        org.apache.commons.math.complex.Complex complex32 = complex19.multiply(complex28);
        org.apache.commons.math.complex.Complex complex33 = complex8.subtract(complex19);
        org.apache.commons.math.complex.Complex complex34 = complex2.subtract(complex19);
        boolean boolean35 = complex2.isNaN();
        double double36 = complex2.getImaginary();
        double double37 = complex2.abs();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) Float.NaN, (double) 0.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog(1079525376);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1374372857070614E10d + "'", double1 == 2.1374372857070614E10d);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) 98, 39L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 137L + "'", long2 == 137L);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter(11013.232874703393d, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11013.232874703392d + "'", double2 == 11013.232874703392d);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt1z();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) (-206));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex5.tanh();
        org.apache.commons.math.complex.Complex complex7 = complex6.sinh();
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.apache.commons.math.complex.Complex complex10 = complex8.cos();
        org.apache.commons.math.complex.Complex complex11 = complex10.sqrt1z();
        boolean boolean12 = complex6.equals((java.lang.Object) complex11);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = complex7.acos();
        org.apache.commons.math.complex.Complex complex9 = complex7.tan();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.conjugate();
        org.apache.commons.math.complex.Complex complex12 = complex10.exp();
        org.apache.commons.math.complex.Complex complex13 = complex12.tan();
        org.apache.commons.math.complex.Complex complex14 = complex12.sqrt1z();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = complex14.multiply(complex16);
        boolean boolean18 = complex16.isNaN();
        double double19 = complex16.getImaginary();
        org.apache.commons.math.complex.Complex complex20 = complex7.multiply(complex16);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.conjugate();
        org.apache.commons.math.complex.Complex complex23 = complex21.exp();
        org.apache.commons.math.complex.Complex complex24 = complex23.tan();
        org.apache.commons.math.complex.Complex complex25 = complex23.sqrt1z();
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex27 = complex26.cosh();
        org.apache.commons.math.complex.Complex complex28 = complex25.pow(complex26);
        org.apache.commons.math.complex.Complex complex29 = complex28.acos();
        org.apache.commons.math.complex.Complex complex30 = complex28.conjugate();
        org.apache.commons.math.complex.Complex complex31 = complex7.pow(complex30);
        boolean boolean32 = complex31.isNaN();
        boolean boolean33 = complex31.isNaN();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex2 = complex0.sqrt();
        org.apache.commons.math.complex.Complex complex3 = complex2.atan();
        org.apache.commons.math.complex.Complex complex4 = complex3.acos();
        org.apache.commons.math.complex.Complex complex5 = complex3.tanh();
        org.apache.commons.math.complex.Complex complex6 = complex3.negate();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) 15520, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15520.0d + "'", double2 == 15520.0d);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) '#', 1079525376);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 532091496, 98, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding method.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((-98), 98);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-196) + "'", int2 == (-196));
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) 97, (double) 1079525476L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.00000000000001d + "'", double2 == 97.00000000000001d);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) (-98));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.8189854738044024E42d) + "'", double1 == (-1.8189854738044024E42d));
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog(37);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 99.33061245478744d + "'", double1 == 99.33061245478744d);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math.complex.Complex complex10 = complex8.exp();
        org.apache.commons.math.complex.Complex complex11 = complex10.tan();
        org.apache.commons.math.complex.Complex complex12 = complex10.sqrt1z();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        org.apache.commons.math.complex.Complex complex15 = complex12.pow(complex13);
        org.apache.commons.math.complex.Complex complex16 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex17 = complex16.conjugate();
        org.apache.commons.math.complex.Complex complex18 = complex16.exp();
        org.apache.commons.math.complex.Complex complex19 = complex18.tan();
        org.apache.commons.math.complex.Complex complex20 = complex18.sqrt1z();
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.cosh();
        org.apache.commons.math.complex.Complex complex23 = complex20.pow(complex21);
        org.apache.commons.math.complex.Complex complex24 = complex23.acos();
        org.apache.commons.math.complex.Complex complex25 = complex23.tan();
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex27 = complex26.conjugate();
        org.apache.commons.math.complex.Complex complex28 = complex26.exp();
        org.apache.commons.math.complex.Complex complex29 = complex28.tan();
        org.apache.commons.math.complex.Complex complex30 = complex28.sqrt1z();
        org.apache.commons.math.complex.Complex complex31 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex32 = complex31.atan();
        org.apache.commons.math.complex.Complex complex33 = complex30.multiply(complex32);
        boolean boolean34 = complex32.isNaN();
        double double35 = complex32.getImaginary();
        org.apache.commons.math.complex.Complex complex36 = complex23.multiply(complex32);
        org.apache.commons.math.complex.Complex complex37 = complex12.subtract(complex23);
        org.apache.commons.math.complex.Complex complex38 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex39 = complex12.pow(complex38);
        org.apache.commons.math.complex.Complex complex40 = complex4.subtract(complex12);
        org.apache.commons.math.complex.Complex complex41 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex42 = complex41.conjugate();
        org.apache.commons.math.complex.Complex complex43 = complex41.exp();
        org.apache.commons.math.complex.Complex complex44 = complex43.tan();
        org.apache.commons.math.complex.Complex complex45 = complex43.sqrt1z();
        org.apache.commons.math.complex.Complex complex46 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex47 = complex46.cosh();
        org.apache.commons.math.complex.Complex complex48 = complex45.pow(complex46);
        org.apache.commons.math.complex.Complex complex49 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex50 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex51 = complex50.conjugate();
        org.apache.commons.math.complex.Complex complex52 = complex50.exp();
        org.apache.commons.math.complex.Complex complex53 = complex52.tan();
        org.apache.commons.math.complex.Complex complex54 = complex52.sqrt1z();
        org.apache.commons.math.complex.Complex complex55 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex56 = complex55.cosh();
        org.apache.commons.math.complex.Complex complex57 = complex54.pow(complex55);
        org.apache.commons.math.complex.Complex complex58 = complex54.exp();
        org.apache.commons.math.complex.Complex complex59 = complex49.pow(complex54);
        boolean boolean60 = complex46.equals((java.lang.Object) complex49);
        org.apache.commons.math.complex.Complex complex61 = complex49.acos();
        org.apache.commons.math.complex.Complex complex62 = complex40.add(complex61);
        double double63 = complex40.getImaginary();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex9.exp();
        org.apache.commons.math.complex.Complex complex12 = complex11.tan();
        org.apache.commons.math.complex.Complex complex13 = complex11.sqrt1z();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex16 = complex13.pow(complex14);
        org.apache.commons.math.complex.Complex complex17 = complex13.exp();
        org.apache.commons.math.complex.Complex complex18 = complex8.pow(complex13);
        boolean boolean19 = complex5.equals((java.lang.Object) complex8);
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex21 = complex20.conjugate();
        org.apache.commons.math.complex.Complex complex22 = complex20.exp();
        org.apache.commons.math.complex.Complex complex23 = complex22.tan();
        org.apache.commons.math.complex.Complex complex24 = complex22.sqrt1z();
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex26 = complex25.cosh();
        org.apache.commons.math.complex.Complex complex27 = complex24.pow(complex25);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex30 = complex29.conjugate();
        org.apache.commons.math.complex.Complex complex31 = complex29.exp();
        org.apache.commons.math.complex.Complex complex32 = complex31.tan();
        org.apache.commons.math.complex.Complex complex33 = complex31.sqrt1z();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex35 = complex34.cosh();
        org.apache.commons.math.complex.Complex complex36 = complex33.pow(complex34);
        org.apache.commons.math.complex.Complex complex37 = complex33.exp();
        org.apache.commons.math.complex.Complex complex38 = complex28.pow(complex33);
        boolean boolean39 = complex25.equals((java.lang.Object) complex28);
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex41 = complex40.cosh();
        org.apache.commons.math.complex.Complex complex42 = complex25.multiply(complex41);
        boolean boolean43 = complex25.isNaN();
        org.apache.commons.math.complex.Complex complex44 = complex5.multiply(complex25);
        boolean boolean45 = complex25.isNaN();
        org.apache.commons.math.complex.Complex complex46 = complex25.cos();
        org.apache.commons.math.complex.Complex complex47 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex48 = complex47.conjugate();
        org.apache.commons.math.complex.Complex complex49 = complex47.exp();
        org.apache.commons.math.complex.Complex complex50 = complex49.tan();
        org.apache.commons.math.complex.Complex complex51 = complex49.sqrt1z();
        org.apache.commons.math.complex.Complex complex52 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex53 = complex52.cosh();
        org.apache.commons.math.complex.Complex complex54 = complex51.pow(complex52);
        org.apache.commons.math.complex.Complex complex55 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex56 = complex55.conjugate();
        org.apache.commons.math.complex.Complex complex57 = complex55.exp();
        org.apache.commons.math.complex.Complex complex58 = complex57.tan();
        org.apache.commons.math.complex.Complex complex59 = complex57.sqrt1z();
        org.apache.commons.math.complex.Complex complex60 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex61 = complex60.cosh();
        org.apache.commons.math.complex.Complex complex62 = complex59.pow(complex60);
        org.apache.commons.math.complex.Complex complex63 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex64 = complex63.conjugate();
        org.apache.commons.math.complex.Complex complex65 = complex63.exp();
        org.apache.commons.math.complex.Complex complex66 = complex65.tan();
        org.apache.commons.math.complex.Complex complex67 = complex65.sqrt1z();
        org.apache.commons.math.complex.Complex complex68 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex69 = complex68.cosh();
        org.apache.commons.math.complex.Complex complex70 = complex67.pow(complex68);
        org.apache.commons.math.complex.Complex complex71 = complex70.acos();
        org.apache.commons.math.complex.Complex complex72 = complex70.tan();
        org.apache.commons.math.complex.Complex complex73 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex74 = complex73.conjugate();
        org.apache.commons.math.complex.Complex complex75 = complex73.exp();
        org.apache.commons.math.complex.Complex complex76 = complex75.tan();
        org.apache.commons.math.complex.Complex complex77 = complex75.sqrt1z();
        org.apache.commons.math.complex.Complex complex78 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex79 = complex78.atan();
        org.apache.commons.math.complex.Complex complex80 = complex77.multiply(complex79);
        boolean boolean81 = complex79.isNaN();
        double double82 = complex79.getImaginary();
        org.apache.commons.math.complex.Complex complex83 = complex70.multiply(complex79);
        org.apache.commons.math.complex.Complex complex84 = complex59.subtract(complex70);
        org.apache.commons.math.complex.Complex complex85 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex86 = complex59.pow(complex85);
        org.apache.commons.math.complex.Complex complex87 = complex51.subtract(complex59);
        org.apache.commons.math.complex.Complex complex88 = complex25.divide(complex87);
        boolean boolean89 = complex87.isNaN();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertNotNull(complex56);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertNotNull(complex67);
        org.junit.Assert.assertNotNull(complex68);
        org.junit.Assert.assertNotNull(complex69);
        org.junit.Assert.assertNotNull(complex70);
        org.junit.Assert.assertNotNull(complex71);
        org.junit.Assert.assertNotNull(complex72);
        org.junit.Assert.assertNotNull(complex73);
        org.junit.Assert.assertNotNull(complex74);
        org.junit.Assert.assertNotNull(complex75);
        org.junit.Assert.assertNotNull(complex76);
        org.junit.Assert.assertNotNull(complex77);
        org.junit.Assert.assertNotNull(complex78);
        org.junit.Assert.assertNotNull(complex79);
        org.junit.Assert.assertNotNull(complex80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double82));
        org.junit.Assert.assertNotNull(complex83);
        org.junit.Assert.assertNotNull(complex84);
        org.junit.Assert.assertNotNull(complex85);
        org.junit.Assert.assertNotNull(complex86);
        org.junit.Assert.assertNotNull(complex87);
        org.junit.Assert.assertNotNull(complex88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 1079525376L, 9);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.07952538E9f + "'", float2 == 1.07952538E9f);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) (-10));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex9.exp();
        org.apache.commons.math.complex.Complex complex12 = complex11.tan();
        org.apache.commons.math.complex.Complex complex13 = complex11.sqrt1z();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex16 = complex13.pow(complex14);
        org.apache.commons.math.complex.Complex complex17 = complex13.exp();
        org.apache.commons.math.complex.Complex complex18 = complex8.pow(complex13);
        boolean boolean19 = complex5.equals((java.lang.Object) complex8);
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex21 = complex20.cosh();
        org.apache.commons.math.complex.Complex complex22 = complex5.multiply(complex21);
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex24 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex25 = complex24.cosh();
        org.apache.commons.math.complex.Complex complex26 = complex24.cos();
        org.apache.commons.math.complex.Complex complex27 = complex23.divide(complex24);
        org.apache.commons.math.complex.Complex complex28 = complex23.log();
        org.apache.commons.math.complex.Complex complex29 = complex23.sin();
        org.apache.commons.math.complex.Complex complex30 = complex23.atan();
        org.apache.commons.math.complex.Complex complex31 = complex22.subtract(complex30);
        org.apache.commons.math.complex.Complex complex32 = complex30.sin();
        org.apache.commons.math.complex.Complex complex33 = complex32.tanh();
        double double34 = complex32.getImaginary();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((-1551600L), (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1551601L) + "'", long2 == (-1551601L));
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        int int2 = org.apache.commons.math.util.MathUtils.lcm(0, 1045661013);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        int int1 = org.apache.commons.math.util.MathUtils.sign(15520);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        double double1 = org.apache.commons.math.util.MathUtils.sinh(9.434787105502285E72d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) 1.0E9f, 288);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E9d + "'", double2 == 1.0E9d);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(15.104412573075518d, 0.6931471805599453d);
        org.apache.commons.math.complex.Complex complex3 = complex2.exp();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex4.exp();
        org.apache.commons.math.complex.Complex complex7 = complex4.tan();
        org.apache.commons.math.complex.Complex complex8 = complex4.negate();
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex4);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.cosh();
        org.apache.commons.math.complex.Complex complex12 = complex10.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex12.atan();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.conjugate();
        org.apache.commons.math.complex.Complex complex16 = complex14.exp();
        org.apache.commons.math.complex.Complex complex17 = complex16.tan();
        org.apache.commons.math.complex.Complex complex18 = complex16.sqrt1z();
        org.apache.commons.math.complex.Complex complex19 = complex18.conjugate();
        org.apache.commons.math.complex.Complex complex20 = complex12.pow(complex19);
        org.apache.commons.math.complex.Complex complex21 = complex2.pow(complex12);
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex23 = complex22.conjugate();
        org.apache.commons.math.complex.Complex complex24 = complex22.exp();
        org.apache.commons.math.complex.Complex complex25 = complex24.tan();
        org.apache.commons.math.complex.Complex complex26 = complex24.sqrt1z();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex28 = complex27.cosh();
        org.apache.commons.math.complex.Complex complex29 = complex26.pow(complex27);
        org.apache.commons.math.complex.Complex complex30 = complex29.acos();
        org.apache.commons.math.complex.Complex complex31 = complex29.tan();
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex33 = complex32.conjugate();
        org.apache.commons.math.complex.Complex complex34 = complex32.exp();
        org.apache.commons.math.complex.Complex complex35 = complex34.tan();
        org.apache.commons.math.complex.Complex complex36 = complex34.sqrt1z();
        org.apache.commons.math.complex.Complex complex37 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex38 = complex37.atan();
        org.apache.commons.math.complex.Complex complex39 = complex36.multiply(complex38);
        boolean boolean40 = complex38.isNaN();
        double double41 = complex38.getImaginary();
        org.apache.commons.math.complex.Complex complex42 = complex29.multiply(complex38);
        org.apache.commons.math.complex.Complex complex43 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex44 = complex43.cosh();
        org.apache.commons.math.complex.Complex complex45 = complex44.atan();
        org.apache.commons.math.complex.Complex complex46 = complex38.pow(complex45);
        boolean boolean47 = complex2.equals((java.lang.Object) complex38);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertNotNull(complex43);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = complex7.acos();
        org.apache.commons.math.complex.Complex complex9 = complex7.tan();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.conjugate();
        org.apache.commons.math.complex.Complex complex12 = complex10.exp();
        org.apache.commons.math.complex.Complex complex13 = complex12.tan();
        org.apache.commons.math.complex.Complex complex14 = complex12.sqrt1z();
        org.apache.commons.math.complex.Complex complex15 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = complex14.multiply(complex16);
        boolean boolean18 = complex16.isNaN();
        double double19 = complex16.getImaginary();
        org.apache.commons.math.complex.Complex complex20 = complex7.multiply(complex16);
        org.apache.commons.math.complex.Complex complex21 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex22 = complex21.conjugate();
        org.apache.commons.math.complex.Complex complex23 = complex21.exp();
        org.apache.commons.math.complex.Complex complex24 = complex23.tan();
        org.apache.commons.math.complex.Complex complex25 = complex23.sqrt1z();
        org.apache.commons.math.complex.Complex complex26 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex27 = complex26.cosh();
        org.apache.commons.math.complex.Complex complex28 = complex25.pow(complex26);
        org.apache.commons.math.complex.Complex complex29 = complex28.acos();
        org.apache.commons.math.complex.Complex complex30 = complex28.conjugate();
        org.apache.commons.math.complex.Complex complex31 = complex7.pow(complex30);
        boolean boolean32 = complex31.isNaN();
        org.apache.commons.math.complex.Complex complex33 = complex31.log();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(complex33);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((int) ' ', 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex9 = complex8.conjugate();
        org.apache.commons.math.complex.Complex complex10 = complex8.exp();
        org.apache.commons.math.complex.Complex complex11 = complex10.tan();
        org.apache.commons.math.complex.Complex complex12 = complex10.sqrt1z();
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        org.apache.commons.math.complex.Complex complex15 = complex12.pow(complex13);
        org.apache.commons.math.complex.Complex complex16 = complex15.acos();
        org.apache.commons.math.complex.Complex complex17 = complex15.tan();
        org.apache.commons.math.complex.Complex complex18 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex19 = complex18.conjugate();
        org.apache.commons.math.complex.Complex complex20 = complex18.exp();
        org.apache.commons.math.complex.Complex complex21 = complex20.tan();
        org.apache.commons.math.complex.Complex complex22 = complex20.sqrt1z();
        org.apache.commons.math.complex.Complex complex23 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex24 = complex23.atan();
        org.apache.commons.math.complex.Complex complex25 = complex22.multiply(complex24);
        boolean boolean26 = complex24.isNaN();
        double double27 = complex24.getImaginary();
        org.apache.commons.math.complex.Complex complex28 = complex15.multiply(complex24);
        org.apache.commons.math.complex.Complex complex29 = complex4.subtract(complex15);
        org.apache.commons.math.complex.Complex complex30 = complex15.sinh();
        org.apache.commons.math.complex.Complex complex31 = complex15.tan();
        org.apache.commons.math.complex.Complex complex32 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex33 = complex32.conjugate();
        org.apache.commons.math.complex.Complex complex34 = complex32.exp();
        org.apache.commons.math.complex.Complex complex35 = complex34.tan();
        org.apache.commons.math.complex.Complex complex36 = complex34.sqrt1z();
        org.apache.commons.math.complex.Complex complex37 = complex36.conjugate();
        org.apache.commons.math.complex.Complex complex38 = complex37.tanh();
        org.apache.commons.math.complex.Complex complex39 = complex38.sinh();
        org.apache.commons.math.complex.Complex complex40 = complex38.conjugate();
        org.apache.commons.math.complex.Complex complex41 = complex31.add(complex40);
        java.lang.Class<?> wildcardClass42 = complex40.getClass();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex4.exp();
        org.apache.commons.math.complex.Complex complex7 = complex6.tan();
        org.apache.commons.math.complex.Complex complex8 = complex6.sqrt1z();
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.cosh();
        org.apache.commons.math.complex.Complex complex11 = complex8.pow(complex9);
        org.apache.commons.math.complex.Complex complex12 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex13 = complex12.conjugate();
        org.apache.commons.math.complex.Complex complex14 = complex12.exp();
        org.apache.commons.math.complex.Complex complex15 = complex14.tan();
        org.apache.commons.math.complex.Complex complex16 = complex14.sqrt1z();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex18 = complex17.cosh();
        org.apache.commons.math.complex.Complex complex19 = complex16.pow(complex17);
        org.apache.commons.math.complex.Complex complex20 = complex19.acos();
        org.apache.commons.math.complex.Complex complex21 = complex19.tan();
        org.apache.commons.math.complex.Complex complex22 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex23 = complex22.conjugate();
        org.apache.commons.math.complex.Complex complex24 = complex22.exp();
        org.apache.commons.math.complex.Complex complex25 = complex24.tan();
        org.apache.commons.math.complex.Complex complex26 = complex24.sqrt1z();
        org.apache.commons.math.complex.Complex complex27 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex28 = complex27.atan();
        org.apache.commons.math.complex.Complex complex29 = complex26.multiply(complex28);
        boolean boolean30 = complex28.isNaN();
        double double31 = complex28.getImaginary();
        org.apache.commons.math.complex.Complex complex32 = complex19.multiply(complex28);
        org.apache.commons.math.complex.Complex complex33 = complex8.subtract(complex19);
        org.apache.commons.math.complex.Complex complex34 = complex2.subtract(complex19);
        org.apache.commons.math.complex.Complex complex35 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex36 = complex35.conjugate();
        org.apache.commons.math.complex.Complex complex37 = complex35.exp();
        org.apache.commons.math.complex.Complex complex38 = complex37.tan();
        org.apache.commons.math.complex.Complex complex39 = complex37.sqrt1z();
        org.apache.commons.math.complex.Complex complex40 = complex2.add(complex39);
        org.apache.commons.math.complex.Complex complex41 = complex2.cosh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertNotNull(complex39);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) 0L, (double) (-1604784744));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.9E-324d) + "'", double2 == (-4.9E-324d));
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((-10), (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-62) + "'", int2 == (-62));
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) 1045661013, (-1072693247L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2118354260L + "'", long2 == 2118354260L);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex9 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex10 = complex9.conjugate();
        org.apache.commons.math.complex.Complex complex11 = complex9.exp();
        org.apache.commons.math.complex.Complex complex12 = complex11.tan();
        org.apache.commons.math.complex.Complex complex13 = complex11.sqrt1z();
        org.apache.commons.math.complex.Complex complex14 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex15 = complex14.cosh();
        org.apache.commons.math.complex.Complex complex16 = complex13.pow(complex14);
        org.apache.commons.math.complex.Complex complex17 = complex13.exp();
        org.apache.commons.math.complex.Complex complex18 = complex8.pow(complex13);
        boolean boolean19 = complex5.equals((java.lang.Object) complex8);
        org.apache.commons.math.complex.Complex complex20 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex21 = complex20.conjugate();
        org.apache.commons.math.complex.Complex complex22 = complex20.exp();
        org.apache.commons.math.complex.Complex complex23 = complex22.tan();
        org.apache.commons.math.complex.Complex complex24 = complex22.sqrt1z();
        org.apache.commons.math.complex.Complex complex25 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex26 = complex25.cosh();
        org.apache.commons.math.complex.Complex complex27 = complex24.pow(complex25);
        org.apache.commons.math.complex.Complex complex28 = org.apache.commons.math.complex.Complex.I;
        org.apache.commons.math.complex.Complex complex29 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex30 = complex29.conjugate();
        org.apache.commons.math.complex.Complex complex31 = complex29.exp();
        org.apache.commons.math.complex.Complex complex32 = complex31.tan();
        org.apache.commons.math.complex.Complex complex33 = complex31.sqrt1z();
        org.apache.commons.math.complex.Complex complex34 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex35 = complex34.cosh();
        org.apache.commons.math.complex.Complex complex36 = complex33.pow(complex34);
        org.apache.commons.math.complex.Complex complex37 = complex33.exp();
        org.apache.commons.math.complex.Complex complex38 = complex28.pow(complex33);
        boolean boolean39 = complex25.equals((java.lang.Object) complex28);
        org.apache.commons.math.complex.Complex complex40 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex41 = complex40.cosh();
        org.apache.commons.math.complex.Complex complex42 = complex25.multiply(complex41);
        boolean boolean43 = complex25.isNaN();
        org.apache.commons.math.complex.Complex complex44 = complex5.multiply(complex25);
        org.apache.commons.math.complex.Complex complex45 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex46 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex47 = complex46.cosh();
        org.apache.commons.math.complex.Complex complex48 = complex46.cos();
        org.apache.commons.math.complex.Complex complex49 = complex45.divide(complex46);
        org.apache.commons.math.complex.Complex complex50 = complex45.asin();
        org.apache.commons.math.complex.Complex complex51 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex52 = complex51.conjugate();
        org.apache.commons.math.complex.Complex complex53 = complex51.exp();
        org.apache.commons.math.complex.Complex complex54 = complex53.tan();
        org.apache.commons.math.complex.Complex complex55 = complex53.sqrt1z();
        boolean boolean56 = complex55.isInfinite();
        org.apache.commons.math.complex.Complex complex57 = complex45.multiply(complex55);
        org.apache.commons.math.complex.Complex complex58 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex59 = complex58.cosh();
        org.apache.commons.math.complex.Complex complex60 = complex58.sqrt();
        org.apache.commons.math.complex.Complex complex61 = complex60.atan();
        org.apache.commons.math.complex.Complex complex62 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex63 = complex62.conjugate();
        org.apache.commons.math.complex.Complex complex64 = complex62.exp();
        org.apache.commons.math.complex.Complex complex65 = complex64.tan();
        org.apache.commons.math.complex.Complex complex66 = complex64.sqrt1z();
        org.apache.commons.math.complex.Complex complex67 = complex66.conjugate();
        org.apache.commons.math.complex.Complex complex68 = complex60.pow(complex67);
        org.apache.commons.math.complex.Complex complex69 = complex67.cosh();
        org.apache.commons.math.complex.Complex complex70 = complex55.add(complex67);
        org.apache.commons.math.complex.Complex complex71 = complex44.add(complex70);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
        org.junit.Assert.assertNotNull(complex27);
        org.junit.Assert.assertNotNull(complex28);
        org.junit.Assert.assertNotNull(complex29);
        org.junit.Assert.assertNotNull(complex30);
        org.junit.Assert.assertNotNull(complex31);
        org.junit.Assert.assertNotNull(complex32);
        org.junit.Assert.assertNotNull(complex33);
        org.junit.Assert.assertNotNull(complex34);
        org.junit.Assert.assertNotNull(complex35);
        org.junit.Assert.assertNotNull(complex36);
        org.junit.Assert.assertNotNull(complex37);
        org.junit.Assert.assertNotNull(complex38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(complex40);
        org.junit.Assert.assertNotNull(complex41);
        org.junit.Assert.assertNotNull(complex42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(complex44);
        org.junit.Assert.assertNotNull(complex45);
        org.junit.Assert.assertNotNull(complex46);
        org.junit.Assert.assertNotNull(complex47);
        org.junit.Assert.assertNotNull(complex48);
        org.junit.Assert.assertNotNull(complex49);
        org.junit.Assert.assertNotNull(complex50);
        org.junit.Assert.assertNotNull(complex51);
        org.junit.Assert.assertNotNull(complex52);
        org.junit.Assert.assertNotNull(complex53);
        org.junit.Assert.assertNotNull(complex54);
        org.junit.Assert.assertNotNull(complex55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(complex57);
        org.junit.Assert.assertNotNull(complex58);
        org.junit.Assert.assertNotNull(complex59);
        org.junit.Assert.assertNotNull(complex60);
        org.junit.Assert.assertNotNull(complex61);
        org.junit.Assert.assertNotNull(complex62);
        org.junit.Assert.assertNotNull(complex63);
        org.junit.Assert.assertNotNull(complex64);
        org.junit.Assert.assertNotNull(complex65);
        org.junit.Assert.assertNotNull(complex66);
        org.junit.Assert.assertNotNull(complex67);
        org.junit.Assert.assertNotNull(complex68);
        org.junit.Assert.assertNotNull(complex69);
        org.junit.Assert.assertNotNull(complex70);
        org.junit.Assert.assertNotNull(complex71);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter(1.0E9d, (double) 39L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.999999999999999E8d + "'", double2 == 9.999999999999999E8d);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.cosh();
        org.apache.commons.math.complex.Complex complex2 = complex0.cos();
        boolean boolean4 = complex0.equals((java.lang.Object) 970);
        org.apache.commons.math.complex.Complex complex5 = complex0.acos();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex7 = complex6.conjugate();
        org.apache.commons.math.complex.Complex complex8 = complex6.exp();
        org.apache.commons.math.complex.Complex complex9 = complex8.tan();
        org.apache.commons.math.complex.Complex complex10 = complex8.sqrt1z();
        boolean boolean11 = complex10.isInfinite();
        org.apache.commons.math.complex.Complex complex12 = complex10.sinh();
        org.apache.commons.math.complex.Complex complex13 = complex5.subtract(complex10);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(15520, 1070);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex1.cos();
        org.apache.commons.math.complex.Complex complex4 = complex0.divide(complex1);
        org.apache.commons.math.complex.Complex complex5 = complex0.asin();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex7 = complex6.conjugate();
        org.apache.commons.math.complex.Complex complex8 = complex6.exp();
        org.apache.commons.math.complex.Complex complex9 = complex8.tan();
        org.apache.commons.math.complex.Complex complex10 = complex8.sqrt1z();
        boolean boolean11 = complex10.isInfinite();
        org.apache.commons.math.complex.Complex complex12 = complex0.multiply(complex10);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.conjugate();
        org.apache.commons.math.complex.Complex complex15 = complex13.exp();
        org.apache.commons.math.complex.Complex complex16 = complex15.tan();
        org.apache.commons.math.complex.Complex complex17 = complex15.sqrt1z();
        org.apache.commons.math.complex.Complex complex18 = complex17.conjugate();
        org.apache.commons.math.complex.Complex complex19 = complex18.cosh();
        org.apache.commons.math.complex.Complex complex20 = complex18.asin();
        org.apache.commons.math.complex.Complex complex21 = complex10.add(complex20);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) 1079525376, (-970));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex1.cos();
        org.apache.commons.math.complex.Complex complex4 = complex0.divide(complex1);
        org.apache.commons.math.complex.Complex complex5 = complex0.asin();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex7 = complex6.conjugate();
        org.apache.commons.math.complex.Complex complex8 = complex6.exp();
        org.apache.commons.math.complex.Complex complex9 = complex8.tan();
        org.apache.commons.math.complex.Complex complex10 = complex8.sqrt1z();
        boolean boolean11 = complex10.isInfinite();
        org.apache.commons.math.complex.Complex complex12 = complex0.multiply(complex10);
        org.apache.commons.math.complex.Complex complex13 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex14 = complex13.cosh();
        org.apache.commons.math.complex.Complex complex15 = complex13.sqrt();
        org.apache.commons.math.complex.Complex complex16 = complex15.atan();
        org.apache.commons.math.complex.Complex complex17 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex18 = complex17.conjugate();
        org.apache.commons.math.complex.Complex complex19 = complex17.exp();
        org.apache.commons.math.complex.Complex complex20 = complex19.tan();
        org.apache.commons.math.complex.Complex complex21 = complex19.sqrt1z();
        org.apache.commons.math.complex.Complex complex22 = complex21.conjugate();
        org.apache.commons.math.complex.Complex complex23 = complex15.pow(complex22);
        org.apache.commons.math.complex.Complex complex24 = complex22.cosh();
        org.apache.commons.math.complex.Complex complex25 = complex10.add(complex22);
        org.apache.commons.math.complex.Complex complex26 = complex22.sinh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertNotNull(complex18);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
        org.junit.Assert.assertNotNull(complex22);
        org.junit.Assert.assertNotNull(complex23);
        org.junit.Assert.assertNotNull(complex24);
        org.junit.Assert.assertNotNull(complex25);
        org.junit.Assert.assertNotNull(complex26);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex1.cos();
        org.apache.commons.math.complex.Complex complex4 = complex0.divide(complex1);
        org.apache.commons.math.complex.Complex complex5 = complex0.asin();
        org.apache.commons.math.complex.Complex complex6 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex7 = complex6.conjugate();
        org.apache.commons.math.complex.Complex complex8 = complex6.exp();
        org.apache.commons.math.complex.Complex complex9 = complex8.tan();
        org.apache.commons.math.complex.Complex complex10 = complex8.sqrt1z();
        boolean boolean11 = complex10.isInfinite();
        org.apache.commons.math.complex.Complex complex12 = complex0.multiply(complex10);
        org.apache.commons.math.complex.Complex complex13 = complex0.tan();
        org.apache.commons.math.complex.Complex complex14 = complex0.asin();
        org.apache.commons.math.complex.Complex complex15 = complex0.atan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(1, 15521);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        double double1 = org.apache.commons.math.util.MathUtils.indicator(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) -1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -1 + "'", short1 == (short) -1);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        org.apache.commons.math.complex.Complex complex2 = new org.apache.commons.math.complex.Complex(15.104412573075518d, 0.6931471805599453d);
        org.apache.commons.math.complex.Complex complex3 = complex2.exp();
        org.apache.commons.math.complex.Complex complex4 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex5 = complex4.conjugate();
        org.apache.commons.math.complex.Complex complex6 = complex4.exp();
        org.apache.commons.math.complex.Complex complex7 = complex4.tan();
        org.apache.commons.math.complex.Complex complex8 = complex4.negate();
        org.apache.commons.math.complex.Complex complex9 = complex2.divide(complex4);
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.cosh();
        org.apache.commons.math.complex.Complex complex12 = complex10.sqrt();
        org.apache.commons.math.complex.Complex complex13 = complex12.sin();
        boolean boolean14 = complex2.equals((java.lang.Object) complex12);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) (-196));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((int) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        int int2 = org.apache.commons.math.util.MathUtils.lcm((int) '#', (-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 70 + "'", int2 == 70);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) (byte) 10, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-26) + "'", int2 == (-26));
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(1079525376);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) 1672897424);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) 1072693248L, 4);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.072693248E9d + "'", double2 == 1.072693248E9d);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) (-1551600L), (double) 100.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.conjugate();
        org.apache.commons.math.complex.Complex complex7 = complex5.exp();
        org.apache.commons.math.complex.Complex complex8 = complex7.tan();
        org.apache.commons.math.complex.Complex complex9 = complex2.multiply(complex7);
        org.apache.commons.math.complex.Complex complex10 = complex7.atan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        boolean boolean5 = complex4.isInfinite();
        org.apache.commons.math.complex.Complex complex6 = complex4.sqrt();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(complex6);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(2, 970);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(1070);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) 101);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.104412573075518d + "'", double1 == 15.104412573075518d);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: result too large to represent in a long integer");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) (byte) 100, (-1074790400));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1074790500 + "'", int2 == 1074790500);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 98, (int) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 98.0f + "'", float2 == 98.0f);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 37);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((-1072693196L), (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1072693296L) + "'", long2 == (-1072693296L));
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex3 = complex2.conjugate();
        org.apache.commons.math.complex.Complex complex4 = complex2.exp();
        org.apache.commons.math.complex.Complex complex5 = complex4.tan();
        org.apache.commons.math.complex.Complex complex6 = complex4.sqrt1z();
        org.apache.commons.math.complex.Complex complex7 = complex6.conjugate();
        org.apache.commons.math.complex.Complex complex8 = complex7.cosh();
        org.apache.commons.math.complex.Complex complex9 = complex8.atan();
        org.apache.commons.math.complex.Complex complex10 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex11 = complex10.conjugate();
        org.apache.commons.math.complex.Complex complex12 = complex10.exp();
        org.apache.commons.math.complex.Complex complex13 = complex12.tan();
        org.apache.commons.math.complex.Complex complex14 = complex12.sqrt1z();
        org.apache.commons.math.complex.Complex complex15 = complex14.conjugate();
        org.apache.commons.math.complex.Complex complex16 = complex15.cosh();
        org.apache.commons.math.complex.Complex complex17 = complex16.atan();
        boolean boolean18 = complex8.equals((java.lang.Object) complex16);
        org.apache.commons.math.complex.Complex complex19 = complex8.sqrt1z();
        org.apache.commons.math.complex.Complex complex20 = complex8.acos();
        org.apache.commons.math.complex.Complex complex21 = complex1.divide(complex20);
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
        org.junit.Assert.assertNotNull(complex12);
        org.junit.Assert.assertNotNull(complex13);
        org.junit.Assert.assertNotNull(complex14);
        org.junit.Assert.assertNotNull(complex15);
        org.junit.Assert.assertNotNull(complex16);
        org.junit.Assert.assertNotNull(complex17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(complex19);
        org.junit.Assert.assertNotNull(complex20);
        org.junit.Assert.assertNotNull(complex21);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex6 = complex5.atan();
        org.apache.commons.math.complex.Complex complex7 = complex4.multiply(complex6);
        boolean boolean8 = complex6.isNaN();
        double double9 = complex6.getImaginary();
        org.apache.commons.math.complex.Complex complex10 = complex6.log();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(complex10);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        double double2 = org.apache.commons.math.util.MathUtils.nextAfter((double) (-9), (double) 1672897414L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-8.999999999999998d) + "'", double2 == (-8.999999999999998d));
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        float float1 = org.apache.commons.math.util.MathUtils.indicator(1.0E9f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.INF;
        org.apache.commons.math.complex.Complex complex1 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex2 = complex1.cosh();
        org.apache.commons.math.complex.Complex complex3 = complex1.cos();
        org.apache.commons.math.complex.Complex complex4 = complex0.divide(complex1);
        org.apache.commons.math.complex.Complex complex5 = complex0.asin();
        org.apache.commons.math.complex.Complex complex8 = new org.apache.commons.math.complex.Complex((double) (-98), Double.NaN);
        org.apache.commons.math.complex.Complex complex9 = complex8.sinh();
        org.apache.commons.math.complex.Complex complex10 = complex5.multiply(complex8);
        org.apache.commons.math.complex.Complex complex11 = complex8.tan();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex9);
        org.junit.Assert.assertNotNull(complex10);
        org.junit.Assert.assertNotNull(complex11);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-970), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: must have n >= k for binomial coefficient (n,k)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        org.apache.commons.math.complex.Complex complex0 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex1 = complex0.conjugate();
        org.apache.commons.math.complex.Complex complex2 = complex0.exp();
        org.apache.commons.math.complex.Complex complex3 = complex2.tan();
        org.apache.commons.math.complex.Complex complex4 = complex2.sqrt1z();
        org.apache.commons.math.complex.Complex complex5 = org.apache.commons.math.complex.Complex.ZERO;
        org.apache.commons.math.complex.Complex complex6 = complex5.cosh();
        org.apache.commons.math.complex.Complex complex7 = complex4.pow(complex5);
        org.apache.commons.math.complex.Complex complex8 = complex7.acos();
        org.apache.commons.math.complex.Complex complex9 = complex8.cosh();
        org.junit.Assert.assertNotNull(complex0);
        org.junit.Assert.assertNotNull(complex1);
        org.junit.Assert.assertNotNull(complex2);
        org.junit.Assert.assertNotNull(complex3);
        org.junit.Assert.assertNotNull(complex4);
        org.junit.Assert.assertNotNull(complex5);
        org.junit.Assert.assertNotNull(complex6);
        org.junit.Assert.assertNotNull(complex7);
        org.junit.Assert.assertNotNull(complex8);
        org.junit.Assert.assertNotNull(complex9);
    }
}

