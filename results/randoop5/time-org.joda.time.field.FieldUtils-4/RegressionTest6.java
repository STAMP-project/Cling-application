import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 63, 18, 28627459);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1081L), 635274);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-686731194L) + "'", long2 == (-686731194L));
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, 26510634646272000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-26510634646272000L) + "'", long2 == (-26510634646272000L));
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-32), 43189, 22340372);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 266796, (-64277927), 118612725);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 26288, (-1135315), 524);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 47164942, (-93368965L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 140533907L + "'", long2 == 140533907L);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 27936000, (-220620), 57074);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 27936000 for  must be in the range [-220620,57074]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-411836256L), (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-411836255L) + "'", long2 == (-411836255L));
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-43324580L), (long) 459041084);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-19887762167044720L) + "'", long2 == (-19887762167044720L));
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 5427948166598875L, (java.lang.Object) (-247112800));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(640000L, (long) (-635274));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-406575360000L) + "'", long2 == (-406575360000L));
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1085203L), (long) 30);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-32556090L) + "'", long2 == (-32556090L));
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(6077576140000L, (-64306528));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 6077576140000 * -64306528");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 96967);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 96967 + "'", int1 == 96967);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-100), (-59344612), 1439479992);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, 999073006, (-849792292));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 70331, 103, (-301));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70331 for hi! must be in the range [103,-301]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(943, (-1176022016), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1176021174) + "'", int3 == (-1176021174));
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 17523260, (-60836462));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1066053141106120L) + "'", long2 == (-1066053141106120L));
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 43189, 114866500, 78657304);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 47164942, (-635644), (-943));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-5454), 56222);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50768 + "'", int2 == 50768);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-16759695), 24806, (-7971618));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 56115, 21152985, 38169);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-269594853160L), (long) (-886762));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-269593966398L) + "'", long2 == (-269593966398L));
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(118612725, (-2516), (-46666092));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1452704), 569317792012896928L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 569317792011444224L + "'", long2 == 569317792011444224L);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 2067L, (java.lang.Object) 10865750);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 959, (-28601), (-4352));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(510212929019277780L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 510212929019277780");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-411852142L), (long) (-18027450));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-393824692L) + "'", long2 == (-393824692L));
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-162007), 47239050);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -162007 * 47239050");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 44046, 336748);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 14832402408L + "'", long2 == 14832402408L);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-11), 32, 6153415);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(114864751, 296064);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 115160815 + "'", int2 == 115160815);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-35), 12211200, 524);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 129300, (java.lang.Object) 1439479798);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 43189, (int) '4', 8047760);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 37, 1565, 30);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 37 for  must be in the range [1565,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 2901139, 1134640, (-290033));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 2205, (-301), (-4594848));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(4452343276909248L, (long) (-114866399));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4452343162042849L + "'", long2 == 4452343162042849L);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-107941L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-107941) + "'", int1 == (-107941));
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 17687484L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(347555256);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-347555256) + "'", int1 == (-347555256));
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-4594848), (-779310), 776769210);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-71680), 2457);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-69223) + "'", int2 == (-69223));
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-70887), (-393824692L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 27917050941804L + "'", long2 == 27917050941804L);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-31109), (-10240), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 114866500, (-1134), 1439509120);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, (long) 129407);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-129407L) + "'", long2 == (-129407L));
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 390060987, 300416461784L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-300026400797L) + "'", long2 == (-300026400797L));
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-46666092), 1681, 424);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -46666092 for  must be in the range [1681,424]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-814290), (long) 347545500);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-283002825195000L) + "'", long2 == (-283002825195000L));
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2L), 435386);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-870772L) + "'", long2 == (-870772L));
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2066944L), (-18058559));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 37326030173696L + "'", long2 == 37326030173696L);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-2764712448L), (long) (-849792292));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3614504740L) + "'", long2 == (-3614504740L));
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1477, 1439480486, (-301));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-308541708), 3614000, (-1664));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-268), (long) 12211200);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-12211468L) + "'", long2 == (-12211468L));
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1612186718142L), (long) (-1401815520));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1613588533662L) + "'", long2 == (-1613588533662L));
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-129206581));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 129206581 + "'", int1 == 129206581);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-1330L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1330) + "'", int1 == (-1330));
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1681L, 5598066600L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9410349954600L + "'", long2 == 9410349954600L);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(971L, (long) 28601);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 27771571L + "'", long2 == 27771571L);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-107), (-60792385256928L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 6504785222491296");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(30, 1477);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1507 + "'", int2 == 1507);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 5789836);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5789836 + "'", int1 == 5789836);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 8046682000L, (java.lang.Object) (-18027450));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1439480000, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1439480000 * 10");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(53078884, 524, (-6790));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(14, 97, 38169, 887);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (short) -1, (-1256976000), 15886, 314504320);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 977739 + "'", int4 == 977739);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 336651L, (java.lang.Object) (-406374L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(884, 708898050);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 708898934 + "'", int2 == 708898934);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(798993155480L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 798993155480");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1869436, (-411852512), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-409983077) + "'", int3 == (-409983077));
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-16612058L), (-34146766368L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 34130154310L + "'", long2 == 34130154310L);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-867), 570532235904000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -494651448528768000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 56169, (java.lang.Object) 285);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, 865L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1176022016L, (long) (-2182));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1176019834L + "'", long2 == 1176019834L);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-3313090), (-260054954));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-263368044) + "'", int2 == (-263368044));
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(617343, (-1135315));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 617343 * -1135315");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(317197744, 10240, 115160815);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 86896592 + "'", int3 == 86896592);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(635644, (-409983077), (-35134), 33940);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-8983) + "'", int4 == (-8983));
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-778176), (java.lang.Object) 4634765807655L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 620);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 620 + "'", int1 == 620);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1498288748L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 47945239936L + "'", long2 == 47945239936L);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(6774628331L, 1144L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6774627187L + "'", long2 == 6774627187L);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-35134), (long) 682880);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-23992305920L) + "'", long2 == (-23992305920L));
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1289464), (-114866500), 0);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-3187481673376000L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(347545600, 1439493446, 199152526);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-59950740), (-1617));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 96940346580L + "'", long2 == 96940346580L);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-9000L), 97L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-873000) + "'", int2 == (-873000));
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-22462636), (-16327487), (-943));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(887427452L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 887427452L + "'", long2 == 887427452L);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1399289160L), 129768L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -181582955714880");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-411888032), 28, (-4634346));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, 56169, 114400);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-2830), 1174118400);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -2830 * 1174118400");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, (long) (-20));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 20L + "'", long2 == 20L);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(590L, (-1567L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-977L) + "'", long2 == (-977L));
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-182877), 2182, 111551661);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 111366603 + "'", int3 == 111366603);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1065883), 337);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1065546) + "'", int2 == (-1065546));
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 263789912, (-306836L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 264096748L + "'", long2 == 264096748L);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-444600), 314507200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 314062600 + "'", int2 == 314062600);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(56115, 1176022016, (-38838800));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(30, 43189);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 43219 + "'", int2 == 43219);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 2182, (long) (-27936000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-27933818L) + "'", long2 == (-27933818L));
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, 510212929019277780L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 510212929019277780L + "'", long2 == 510212929019277780L);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(111551661, 16698191, 314062600, 1439479798);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1253667051 + "'", int4 == 1253667051);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(27936000, 26288);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 27936000 * 26288");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-98154769885L), 42194L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-98154727691L) + "'", long2 == (-98154727691L));
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-295447342), 42680);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -295447342 * 42680");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-53078820), 16);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-849261120L) + "'", long2 == (-849261120L));
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 2067, 1418764, (-779310));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-6950910020L), 865);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6012537167300L) + "'", long2 == (-6012537167300L));
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-56222), 337447404, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -56222 for hi! must be in the range [337447404,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 4352, 814290);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3543790080L + "'", long2 == 3543790080L);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-6965), 390060987, 1439509120);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(519135633620744L, 54269L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 519135633620744 * 54269");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-126532), 61, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -126532 for  must be in the range [61,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-35890));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35890 + "'", int1 == 35890);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(294328428, 1378643530);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1672971958 + "'", int2 == 1672971958);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-936232672320L), (long) (-80449));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 75318982255471680");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-206804), 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(24462849815L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 24462849815");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(186124754949000L, (long) (-355653908));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 186124399295092L + "'", long2 == 186124399295092L);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 2869330, (java.lang.Object) (-43324580L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 118612725, 47255125, 251320687);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 361400, (-288965), (-194));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 361400 for  must be in the range [-288965,-194]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-27565200), 12211200, (-61552));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1192357204, (int) (byte) 10, (-56212), (-285));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-27746) + "'", int4 == (-27746));
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 347545530, 34123, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 11287220580048L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 977739, 0, 5178600);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1190493L, 20870);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 24845588910L + "'", long2 == 24845588910L);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1173511369, (-886762), (-107));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1104586000), (-55584));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1104641584) + "'", int2 == (-1104641584));
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(49446346L, 210490000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 10407961369540000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-2693424), 129407, (-60837172));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -2693424 for hi! must be in the range [129407,-60837172]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(319980239, (-444600));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 319535639 + "'", int2 == 319535639);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 32, (-60836462), (-6783015));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 21152985, (-336663), 347545530);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1827, 1289464, 347545513);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(562010000, (-64));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 562009936 + "'", int2 == 562009936);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-68), 36835302, 0, 635644);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 603469 + "'", int4 == 603469);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 35, 519135633620744L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 18169747176726040");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-86500L), 2205);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-190732500L) + "'", long2 == (-190732500L));
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(165870L, (-1833041420028000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1833041419862130L) + "'", long2 == (-1833041419862130L));
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-53078820), (long) (-61551));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 3267054449820");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(54, (-7971515));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-430461810) + "'", int2 == (-430461810));
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (int) (short) 0, (-4368), 0);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(2457, 420608, 435386, (-26853925));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(114866399, 764);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 114867163 + "'", int2 == 114867163);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, (long) 103);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-940), (-1421065421), 930516328);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 96967, (long) (-53077751));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-52980784L) + "'", long2 == (-52980784L));
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1176019834L, 1554344743);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1827940246641632662L + "'", long2 == 1827940246641632662L);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, 2869330);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2869330 + "'", int2 == 2869330);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 9373420, (-285), (-382297));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 42680, 22, 161662);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(206267971973120L, (long) (-2169436));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 206267971973120 * -2169436");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(118612725, (-409983077), (-3501), 369725);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 119935 + "'", int4 == 119935);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-776769210), 118612725);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-92134712694197250L) + "'", long2 == (-92134712694197250L));
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-223462L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 317197744, (java.lang.Object) 78486370);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-776769210), 5178600, 999073006, 36140);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-411887712), (long) (-60837172));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 25058083579630464L + "'", long2 == 25058083579630464L);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 5789836, (long) (-411852142));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2384556358428712L) + "'", long2 == (-2384556358428712L));
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-1378642386), 314507200, 31045);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1378642386 for hi! must be in the range [314507200,31045]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1492491), (-748529595840L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-748531088331L) + "'", long2 == (-748531088331L));
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 31378, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-247401754));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 247401754 + "'", int1 == 247401754);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1869436, 424, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1869436 for  must be in the range [424,100]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1289464), 660994L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-852327967216L) + "'", long2 == (-852327967216L));
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-33950), 1289464, 0, (-325417452));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-239124363));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 239124363 + "'", int1 == 239124363);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(247401754, 64291334);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 247401754 * 64291334");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(324966389, (-25532688));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 324966389 * -25532688");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-324966389), (-28601), 294328428);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1418764, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1418764 + "'", int2 == 1418764);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-28601));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28601 + "'", int1 == 28601);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(239124363, 776769210, 40683, 3395000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2889537 + "'", int4 == 2889537);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-45636842L), (long) 25532688);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1165231248091296");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(78446016, (-126532), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-4444) + "'", int3 == (-4444));
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 45487978, (java.lang.Object) (-226197171200000L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(43241264192000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 43241264192000000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-407203715), 64291334);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -407203715 * 64291334");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 27565200, (-206905806), 30997);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 27565200 for hi! must be in the range [-206905806,30997]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(5453);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-5453) + "'", int1 == (-5453));
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 60837102, (java.lang.Object) (-3313090));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-206905806), 119935, (-129728466));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -206905806 for  must be in the range [119935,-129728466]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(90151, (-66324388), (-107));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-66234131) + "'", int3 == (-66234131));
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-43322723L), (long) 347545546);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 304222823L + "'", long2 == 304222823L);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 347489423, (-64), 1672971958);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 26288, 320);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8412160L + "'", long2 == 8412160L);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, 867, (-22468000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-12290517550L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -12290517550");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-3313090), (-54147324), 12211200);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(42680, (-45156));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1927258080) + "'", int2 == (-1927258080));
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(86951, 26288);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 86951 * 26288");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-16759743), 1104586000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1087826257 + "'", int2 == 1087826257);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-406575360000L), 25532785L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -406575360000 * 25532785");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 97, 186124399295092L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 186124399295189L + "'", long2 == 186124399295189L);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(306424L, 89655L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 216769L + "'", long2 == 216769L);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 52, 337463000, 27022);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 129300, (java.lang.Object) 27936000);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 5454);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(4452343162042849L, 6346366835096L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 4452343162042849 * 6346366835096");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(620, 0, (-101), (-7971515));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1785, 80449, 263789912);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 263711249 + "'", int3 == 263711249);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-635274), (-805319), 422705);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-54147324), (-1682), 96000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 57074, (-54147324));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3090404369976L) + "'", long2 == (-3090404369976L));
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 114399, (-114866500));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-13140612733500L) + "'", long2 == (-13140612733500L));
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1903616L, (java.lang.Object) 3361493L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-4231), (long) 319980239);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1353836391209");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-286708395), 1507, (-70331));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-6314700000L), (-307949251L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1944607135289700000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-19065727), 5514792, 185849);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(3058761464837L, (long) 764);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3058761464073L + "'", long2 == 3058761464073L);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(31L, (long) (-220620));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6839220) + "'", int2 == (-6839220));
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 46722985, (-78625298580L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3673608646173861300L) + "'", long2 == (-3673608646173861300L));
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-198688000L), 319981383L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -63576461025504000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 294882365718144L, (java.lang.Object) 171);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(294328442, 588);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 294328442 * 588");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1104641584), 129728466, 6084168);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 338688232, (long) 1192357204);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 403837353335223328");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-81726), 306072, 251320687);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 250932890 + "'", int3 == 250932890);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(773, 10240);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11013 + "'", int2 == 11013);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-19122450286972L), (java.lang.Object) 9410349954600L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(24806, 28601, 333, 56115);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53407 + "'", int4 == 53407);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-64), (-16104496), 1134640, (-4368));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1418764), 0, (-1439480486));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(2724802, (-301), (-16105260), (-903968));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-12476792) + "'", int4 == (-12476792));
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-623823200), (-296822), 294328442);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -623823200 for hi! must be in the range [-296822,294328442]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(634880, (-162007));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 472873 + "'", int2 == 472873);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-16759743));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16759743 + "'", int1 == 16759743);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1565L, 74074L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 115925810L + "'", long2 == 115925810L);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 420608, 892L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 421500L + "'", long2 == 421500L);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(1287524L, (-27180275L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 28467799L + "'", long2 == 28467799L);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-970));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 970 + "'", int1 == 970);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-4352), (java.lang.Object) 635644);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-53078820), (-87577344215322682L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -53078820 * -87577344215322682");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-16759743), (-1110194), 2869330);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -16759743 for  must be in the range [-1110194,2869330]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-7971515));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7971515 + "'", int1 == 7971515);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 31940548, (long) 27565200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 880447593729600");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-101), (-16105260), 2132, 314507200);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 298399708 + "'", int4 == 298399708);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(10, (-370), 337);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-2182), (-1378642386));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -2182 * -1378642386");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(9373420, (-114866399));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-105492979) + "'", int2 == (-105492979));
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-263368044), (long) (-16759091));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-280127135L) + "'", long2 == (-280127135L));
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-3614504740L), (java.lang.Object) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-12390400), (-325069098L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-337459498L) + "'", long2 == (-337459498L));
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 12211200);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12211200 + "'", int1 == 12211200);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1083172));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1083172 + "'", int1 == 1083172);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(87, 278141647);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 87 * 278141647");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) (byte) 10, (-481446432), (-56212));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 64, (long) 96000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 96064L + "'", long2 == 96064L);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(7110, 42228);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 300241080 + "'", int2 == 300241080);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-805319), (-239124363));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 192571392886797L + "'", long2 == 192571392886797L);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, (long) 369725);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 369725L + "'", long2 == 369725L);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(62, (-1072620480), (-114866399));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-957754020) + "'", int3 == (-957754020));
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) 855);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 16417401, (long) (-48));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-788035248) + "'", int2 == (-788035248));
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-805319), 171, (-56222));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-63236920321260L), (long) (-16874142));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-63236903447118L) + "'", long2 == (-63236903447118L));
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 278399375, (-1083172), (-16759695));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 278399375 for  must be in the range [-1083172,-16759695]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(2737408, 43396515);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 2737408 * 43396515");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(335637603L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 335637603 + "'", int1 == 335637603);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1289464), 5178600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3889136 + "'", int2 == 3889136);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(319535639, (-308541708));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10993931 + "'", int2 == 10993931);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-444600));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-444600) + "'", int1 == (-444600));
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 1439484314, (-126532), (-35900));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1439484314 for hi! must be in the range [-126532,-35900]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-20870), 27565200, (-59950740));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1323L, (java.lang.Object) (-27180275L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(251320687);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-251320687) + "'", int1 == (-251320687));
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 16383699, (-347545514), (-9940));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 53407, (-32), (-337463000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53407 for  must be in the range [-32,-337463000]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(21641042276L, (long) 764);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 16533756298864");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-12476792));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-12476792) + "'", int1 == (-12476792));
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(943L, (long) 1681);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1585183L + "'", long2 == 1585183L);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(73, (-247056567), 9700, (-1412250));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 80449, 999073006, (-635274));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(129671487, (-3454393));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 129671487 * -3454393");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1401815520), (int) (short) -1, (-7024775), (-20));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-3889077) + "'", int4 == (-3889077));
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(114400, (-70), (-77));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-9700), (-1), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(31L, (-113535L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-113504L) + "'", long2 == (-113504L));
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-654584L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-654584) + "'", int1 == (-654584));
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1785, (-481121604), 52);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1785 for  must be in the range [-481121604,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 347545614);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 347545614 + "'", int1 == 347545614);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-411851622), (java.lang.Object) 887);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 137620108, (-2169436), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-32358875), (-8302890750L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8335249625L) + "'", long2 == (-8335249625L));
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 96967, (-63956527L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6201672553609L) + "'", long2 == (-6201672553609L));
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(2480, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2481 + "'", int2 == 2481);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-16589406));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-16589406) + "'", int1 == (-16589406));
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(38700L, (long) (-53078820));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53040120L) + "'", long2 == (-53040120L));
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        java.lang.Object obj1 = new java.lang.Object();
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 38838800, obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(31045, 10582370);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 31045 * 10582370");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-54000), 114399);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -54000 * 114399");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1439484314, 269, (-10240));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-481446432), 797, (-66324388));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -481446432 for hi! must be in the range [797,-66324388]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 459041084, (-31059), 20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 459041084 for  must be in the range [-31059,20]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-411852142), 708898934, 88012474, (-223497));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-90151), (-8983), 46723048);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -90151 for  must be in the range [-8983,46723048]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-51235139L), 473292750);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-24249219833942250L) + "'", long2 == (-24249219833942250L));
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1176022016), 10864277, 943);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(694);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-694) + "'", int1 == (-694));
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-45156), (-2132L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 96272592L + "'", long2 == 96272592L);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-38838800), 1378642386, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-70887), 337, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, 1838377, (-31109));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(74108, (-1439480486), (-1083172), (-14));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-971226) + "'", int4 == (-971226));
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-2132), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2132) + "'", int2 == (-2132));
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-358690), (java.lang.Object) (-219665L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-977L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 118612725, 90783, (-16327487));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 118612725 for  must be in the range [90783,-16327487]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(55078L, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-6914L), (java.lang.Object) 321999346);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1065883));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1065883 + "'", int1 == 1065883);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-520), (-206905806), 114863920);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 78657304, 1627L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 78655677L + "'", long2 == 78655677L);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2273L), (long) 96194);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-218648962L) + "'", long2 == (-218648962L));
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 114864650, 337, (-19508764));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 31940548, (-471872000), 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 31940548 for hi! must be in the range [-471872000,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-18058559));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 18058559 + "'", int1 == 18058559);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-16759695), 10240, 1940);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -16759695 for hi! must be in the range [10240,1940]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-411888032), 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1647552128) + "'", int2 == (-1647552128));
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1253667051, (-215377636), (-1418764), 9940);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-379120) + "'", int4 == (-379120));
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(310450, (-4368));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 306082 + "'", int2 == 306082);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(1681L, (long) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 168100 + "'", int2 == 168100);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(33658101, 0, 3454393);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2568555 + "'", int3 == 2568555);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-33950), 10864277);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10830327 + "'", int2 == 10830327);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-129694579), 129671487);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-16817688914768973L) + "'", long2 == (-16817688914768973L));
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1824872117L, (java.lang.Object) 78655677L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 21, 87, 1253244863);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 21 for hi! must be in the range [87,1253244863]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(1395250410L, 174652L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 243683274607320");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1401815520), 49446346L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -69314655230089920");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 424, (-5250), 1439554100);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1824);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1824) + "'", int1 == (-1824));
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-623823200), 90783, 959);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(290033, 57074);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 347107 + "'", int2 == 347107);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 4, 185849, 26114);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 443037, 589760000, (-162007));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-61308900L), (java.lang.Object) (-1940));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 10792673988957L, (java.lang.Object) 2481);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 26288, 119935, 31378);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) 336651L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1672971958, (-18212066), 80375);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9932706) + "'", int3 == (-9932706));
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-3245686558400L), (long) (-1083172));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3245687641572L) + "'", long2 == (-3245687641572L));
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(682880, 350626805);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 682880 * 350626805");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (int) (byte) 0, 16417401, (-247056567));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for hi! must be in the range [16417401,-247056567]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 977739, 2889537, (-411851622));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 977739 for hi! must be in the range [2889537,-411851622]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-33950), 1439493446);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1439459496 + "'", int2 == 1439459496);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-4352), (-35002240));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -4352 * -35002240");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-337463000), (-210294057331637L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -337463000 * -210294057331637");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(943L, (-2396831103000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2396831103943L + "'", long2 == 2396831103943L);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-129728466), 1200131);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-128528335) + "'", int2 == (-128528335));
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 114864683, (-296836), 882057856);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-406374L), (long) (-3200));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1300396800 + "'", int2 == 1300396800);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-18058559), (long) (-296836));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-17761723L) + "'", long2 == (-17761723L));
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-23992305920L), 888L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-23992305032L) + "'", long2 == (-23992305032L));
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1412250), (long) (-308852158));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 436176460135500L + "'", long2 == 436176460135500L);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-2), (-3281607L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3281605L + "'", long2 == 3281605L);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-2072113), 356663869L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 354591756L + "'", long2 == 354591756L);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 111551661, (-19), (-797));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 111551661 for  must be in the range [-19,-797]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(38693342, (-886762));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37806580 + "'", int2 == 37806580);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-5180732), 96000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5084732) + "'", int2 == (-5084732));
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-15441945), 38838810, 17984320);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-85), (java.lang.Object) (-1468050354));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(708898050, (-68));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 708897982 + "'", int2 == 708897982);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-819096961781208L), 1253667051);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -819096961781208 * 1253667051");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(3058761464073L, (-819096961782523L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-816038200318450L) + "'", long2 == (-816038200318450L));
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-31040011L), (long) 335637603);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-10418194889133633L) + "'", long2 == (-10418194889133633L));
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(78486370, 970);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 78487340 + "'", int2 == 78487340);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(78487340);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-78487340) + "'", int1 == (-78487340));
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 0, (-14252887), (-71680));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for hi! must be in the range [-14252887,-71680]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 635744L, (java.lang.Object) 336663);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(185849, (-220620), 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-34804) + "'", int3 == (-34804));
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-347545500), 9756);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -347545500 * 9756");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 867, (-318748167207871534L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 867 * -318748167207871534");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-182877), (-38838800), (-471506011));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-4), (-114866399), (-239124363));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -4 for  must be in the range [-114866399,-239124363]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-306836), 1157451, 34123);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-2169436), (-1468050354), (-970));
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(865, (-545038));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-544173) + "'", int2 == (-544173));
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 119935, (-63236920321260L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-63236920201325L) + "'", long2 == (-63236920201325L));
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(16383699, (-70));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1146858930) + "'", int2 == (-1146858930));
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-78625298580L), 1144L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -89947341575520");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 2457, 336651L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 827151507 + "'", int2 == 827151507);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-141120), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-141120L) + "'", long2 == (-141120L));
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(319980239, 80449, (-940), 119935);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101916 + "'", int4 == 101916);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(16883330219840000L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 336651, 0, (-873000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(9600L, (long) (-22468000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22477600L + "'", long2 == 22477600L);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 16378246, 638436378, 1439479798);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1), 296064, 1672971958);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1271062049808104L), (java.lang.Object) 107);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 33940, 161662, 9756);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(96967, (-247112800));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-247015833) + "'", int2 == (-247015833));
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 31809, 855, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 294330944, (-4231), 17523260);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-44046));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 44046 + "'", int1 == 44046);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, (-1526800L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1526800L) + "'", long2 == (-1526800L));
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-471506011), 25532688, (-1184));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(78446016, 589760000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 78446016 * 589760000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(24462849815L, (-779310));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-19064143489327650L) + "'", long2 == (-19064143489327650L));
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-10L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-9940), (long) (-64306528));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 64296588L + "'", long2 == 64296588L);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(143351147072L, (-1043392L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -149571440045748224");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-347543643L), (java.lang.Object) (-48));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-26853925), 1213099200, (-2880));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -26853925 for  must be in the range [1213099200,-2880]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-12L), (-2737555874112113L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 32850670489345356");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(185849, 10582370, 47159692);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 36763172 + "'", int3 == 36763172);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 1173511369, 28437436L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1201948805L + "'", long2 == 1201948805L);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(310400L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (short) 100, (long) (-1088));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-108800) + "'", int2 == (-108800));
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 333, (java.lang.Object) (-2396831103000L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-1927258080));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1927258080) + "'", int1 == (-1927258080));
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 90151, (java.lang.Object) (-64306528));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1612186718142L), (-1828770L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2948318704536545340L + "'", long2 == 2948318704536545340L);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 27936000, 290033L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 27645967L + "'", long2 == 27645967L);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) (-318748167073327929L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-247401754), (-654584), (-471506011), (-223497));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-248056338) + "'", int4 == (-248056338));
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-544173), 114863920, 46722045);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-194), 454, (-640));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(47945239936L, (long) 980712);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 47944259224L + "'", long2 == 47944259224L);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-411888032), (-788035248));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -411888032 * -788035248");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1253667051, 119935, 28);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1253667051 for  must be in the range [119935,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 959, (-171947), 2901139);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, (long) 303241905);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-819096963309323L), 3832);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3138779563401325736L) + "'", long2 == (-3138779563401325736L));
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(18, 85, 0, (-77));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-16759091), 2480, 776769210);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1682), 11L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1671L) + "'", long2 == (-1671L));
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-481446432), 20, 137620108);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 69033924 + "'", int3 == 69033924);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1724836), 0, 46722985);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-1940));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1940) + "'", int1 == (-1940));
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(49482300L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-411852512), (-1135315));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-410717198) + "'", int3 == (-410717198));
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-4356681130933920L), (long) 114863920);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4356681016070000L) + "'", long2 == (-4356681016070000L));
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-12390400), (-1378642386), 50768);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-12390400) + "'", int3 == (-12390400));
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-347544570L), (java.lang.Object) 1824872117L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1135415L, (long) 70331);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 79854872365L + "'", long2 == 79854872365L);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(96000L, (-129728466));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-12453932736000L) + "'", long2 == (-12453932736000L));
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(12211200, (-220620));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11990580 + "'", int2 == 11990580);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(424, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1696 + "'", int2 == 1696);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-182694L), (long) (-60837172));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-61019866L) + "'", long2 == (-61019866L));
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 111366603, (long) 25532688);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 2843488728018864");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 263711249, 260054954, (-162805));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 263711249 for  must be in the range [260054954,-162805]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-2178072437520000L), (java.lang.Object) (-1330));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-481446432));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 481446432 + "'", int1 == 481446432);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-141120), 16698191);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -141120 * 16698191");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-100091559L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-100091559) + "'", int1 == (-100091559));
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 2869319, 16383699, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2869319 for hi! must be in the range [16383699,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1173511369, (-27565200), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(319535639, 35890);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 319571529 + "'", int2 == 319571529);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-223400488L), 18897);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4221599021736L) + "'", long2 == (-4221599021736L));
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(1213090550L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1213090550 + "'", int1 == 1213090550);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(47159692, 119935, (-68));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(43219, (-1439480486), 1439554100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-283022820298000L), (long) 16104496);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-283022836402496L) + "'", long2 == (-283022836402496L));
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1148511000L), (-36835302));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 42305749535322000L + "'", long2 == 42305749535322000L);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(16383699, (-31059), (-35134), 11013);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-29900) + "'", int4 == (-29900));
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-53078820), 30997, 16681080);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -53078820 for  must be in the range [30997,16681080]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1838377, (java.lang.Object) 436176460135500L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-22468000), 300241080, 18, 290033);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 227768 + "'", int4 == 227768);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, (-20), 1681);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-805319), (-1088), 338688197);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 88012474);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 88012474 + "'", int1 == 88012474);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 278141647, (java.lang.Object) (-1330L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(2693424, 5789836, 8047760);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7209274 + "'", int3 == 7209274);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-16698191), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-240663), 27022, (-1065883), 608);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-213641) + "'", int4 == (-213641));
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(3395000, (-54));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-183330000) + "'", int2 == (-183330000));
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, 38838800, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-779310L), 3301996192L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -2573278652387520");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1824, (-247112789), 1477, 2457);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1954 + "'", int4 == 1954);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(892L, (long) (-325417452));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-325416560L) + "'", long2 == (-325416560L));
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 17687484L, (java.lang.Object) (-58032));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(19093186921952L, 21768L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 19093186943720L + "'", long2 == 19093186943720L);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1072620480), (-306285732), (-2132));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-153769677) + "'", int3 == (-153769677));
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-13260870000L), 1439736100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -13260870000 * 1439736100");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 269, (-1104641584));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-297148586096L) + "'", long2 == (-297148586096L));
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-20), (long) 1439479798);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-28789595960L) + "'", long2 == (-28789595960L));
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-34804));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 34804 + "'", int1 == 34804);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(337447404, (-22468000));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 337447404 * -22468000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1173511359, (-19), 22579200);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 21971139 + "'", int3 == 21971139);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(472873, 129206581);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 472873 * 129206581");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(129728466, 1439479930);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 129728466 * 1439479930");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 317197744, 61, 64291334);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(520, (-126147568));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-126147048) + "'", int2 == (-126147048));
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(635744L, (long) 1079597460);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1080233204L + "'", long2 == 1080233204L);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-17523260), 589760000, 1824);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -17523260 for  must be in the range [589760000,1824]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }
}

