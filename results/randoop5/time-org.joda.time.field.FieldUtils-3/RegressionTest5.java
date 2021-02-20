import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(55067, (-74108), 26114);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-45156) + "'", int3 == (-45156));
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1439479789, (-1), 57958);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 43189 + "'", int3 == 43189);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-98154769885L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -98154769885");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) (byte) 100, 36140);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3614000 + "'", int2 == 3614000);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-171947), (java.lang.Object) (-3395000));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-247112789), 1439479930, (-32358875));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 294328428, (long) (-324966389));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -95646846427206492");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-114866399), (-886762), 22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, (long) 37);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (short) -1, (java.lang.Object) 336651L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-19742466996L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -19742466996");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-481388400), 266796);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-481121604) + "'", int2 == (-481121604));
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-63612100), (-59344612));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3775035393005200L + "'", long2 == 3775035393005200L);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1268302), 16383699, 1838377);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-61551), (-22468000));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -61551 * -22468000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(454, 30997);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14072638 + "'", int2 == 14072638);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-19508764), 46722045, 1439480362);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -19508764 for hi! must be in the range [46722045,1439480362]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-411888032), 320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-411887712) + "'", int2 == (-411887712));
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(12278080, (-296909), 34023, (-2132));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-347545600), (-943), (-411852512));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1439480000, 457400, 34023);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-826L), (-307949251L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 254366081326L + "'", long2 == 254366081326L);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-61552), 420608, 264272071);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 263789912 + "'", int3 == 263789912);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-59133041064L), (-5454));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 322511605963056L + "'", long2 == 322511605963056L);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-36835302));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 36835302 + "'", int1 == 36835302);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 491, (-86500), (-247056567));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 47159692, (-25242667), (-126191885));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(22, (-206905806), 0, 44046);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 27022 + "'", int4 == 27022);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-2256918), 12390437L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -27964200293166");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-336663), 31809, (-640));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(56147L, 137972648L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 7746750267256");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 589471035);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 589471035 + "'", int1 == 589471035);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(56222, (-268), (-46722045), 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-46666092) + "'", int4 == (-46666092));
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1439480486, 891308, (-12211200));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-93368965), (-285), (-970));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(47239050, (-7971618), 53078820);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 47239050 + "'", int3 == 47239050);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-647804800000L), (long) 86951);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-647804713049L) + "'", long2 == (-647804713049L));
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(411851622, 57074, 61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) 297723428L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(589471035, 119427015);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 708898050 + "'", int2 == 708898050);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1439554100, (-308541708), 7110);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-23833747L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-23833747) + "'", int1 == (-23833747));
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(9562019341500L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 9562019341500");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (-16327487), (-23833747), 635644);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-35890), (-1289464), 884);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 435386, (-32296), (-10240));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-6462776320000L), (int) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-226197171200000L) + "'", long2 == (-226197171200000L));
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-35002240));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-35002240) + "'", int1 == (-35002240));
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-56115), (-20880));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1171681200 + "'", int2 == 1171681200);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-31040000), 22579200);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-700858368000000L) + "'", long2 == (-700858368000000L));
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(96194, 773, (-1492491), 263789912);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 96967 + "'", int4 == 96967);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 64306592L, (java.lang.Object) 6462775184685L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 708898050, (long) (-87));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 708898137L + "'", long2 == 708898137L);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-2516), (long) (-1088));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2737408 + "'", int2 == 2737408);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-182000L), (-8046864000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8046682000L + "'", long2 == 8046682000L);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 764, (-32296));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-24674144L) + "'", long2 == (-24674144L));
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(89655L, 105896632812400L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-105896632722745L) + "'", long2 == (-105896632722745L));
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-2182), (-306424), (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2182) + "'", int3 == (-2182));
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-382297), 347545513, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1173683025L), (long) 665);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1173682360L) + "'", long2 == (-1173682360L));
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 1860, (-3225492L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3223632L) + "'", long2 == (-3223632L));
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 19633816, (-1378642386), 44046);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(32197L, (long) (-635274));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -20453916978");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(16, 42680);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 682880 + "'", int2 == 682880);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 865, (-51235139L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -44318395235");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-3282031L), 26887865L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -88246806453815");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(589471035, 5454);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 589471035 * 5454");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-5178600), (long) 1857);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -9616660200");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1785, 45097998, 16233);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 2480, 3614000, (-66324388));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-411851622), 11, (-220620));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-31059));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 31059 + "'", int1 == 31059);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-28));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-28) + "'", int1 == (-28));
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-5454), (-17523260));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -5454 * -17523260");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-308852158), (-894096000), 347545546, 9756);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1213099200, (-325920000), (-6965));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(44046);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-44046) + "'", int1 == (-44046));
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 882057856, 424, (-9940));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (long) 294330944);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-5453));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5453 + "'", int1 == 5453);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) (-14252887));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(7392017746529405072L, (long) 27565200);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7392017746501839872L + "'", long2 == 7392017746501839872L);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-48), 89655, 1439479962, 266796);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1144), 891308, (-306072), 30997);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-121046) + "'", int4 == (-121046));
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(114866399, 16105260);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 114866399 * 16105260");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-64306528), 28601);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-64277927) + "'", int2 == (-64277927));
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 3832, (long) 2205);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1627L + "'", long2 == 1627L);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1378642386, 90783, 26853925);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-223497), (long) (-182877));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-406374L) + "'", long2 == (-406374L));
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 369725, 114866436, 5789836);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 369725 for  must be in the range [114866436,5789836]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, (long) 369725);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(32296, 337, (-54), (-520));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-17451040380L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -17451040380");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 303241905, (-46722045), 56201);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (long) 55763320);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, (long) 269);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-269L) + "'", long2 == (-269L));
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-70331));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 70331 + "'", int1 == 70331);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1940), 56158L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-58098L) + "'", long2 == (-58098L));
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(42680, 1157451, 74108, 55763320);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1200131 + "'", int4 == 1200131);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-471506011), (-101), 20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -471506011 for hi! must be in the range [-101,20]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-3223632L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3223632) + "'", int1 == (-3223632));
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (byte) 1, 278399375, 12, (-347545600));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(90151);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-90151) + "'", int1 == (-90151));
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1144), 8557, (-9535));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 8557, 6532614545965L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6532614537408L) + "'", long2 == (-6532614537408L));
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-77), (-797), 90151);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-1869436));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1869436) + "'", int1 == (-1869436));
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-35), 524, 1351296);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -35 for hi! must be in the range [524,1351296]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 1289464);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-4594848), 98, (-56201));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-884), (-481121604), 6144000);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-776771726), 1378643530, 1681);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -776771726 for  must be in the range [1378643530,1681]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(278399375);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-278399375) + "'", int1 == (-278399375));
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 114864217);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 114864217 + "'", int1 == 114864217);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (long) (-25532688));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-894096000), (-382297), (-1940), 64);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1682) + "'", int4 == (-1682));
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 431, (java.lang.Object) 11287220580048L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(147613L, (-411836256L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-60792385256928L) + "'", long2 == (-60792385256928L));
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 12278080, (java.lang.Object) (-3361938));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-7435432385640L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -7435432385640");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(797, 57074);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 45487978 + "'", int2 == 45487978);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-247095990), 266796, (-10000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -247095990 for  must be in the range [266796,-10000]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-626357487203L), (java.lang.Object) 16698191);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1940), (long) 1289464);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1287524L + "'", long2 == 1287524L);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-670090L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-670090) + "'", int1 == (-670090));
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 61, (long) 46723048);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2850105928L + "'", long2 == 2850105928L);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(41773993546320000L, (-66826272308400L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 41773993546320000 * -66826272308400");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-38838810), 1134640, 347489423);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 307515974 + "'", int3 == 307515974);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 34023, 0, 1439479798);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-2964357956238821610L), (-1173683025L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2964357955065138585L) + "'", long2 == (-2964357955065138585L));
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(64291334L, (-16104496));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1035379531237664L) + "'", long2 == (-1035379531237664L));
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, (-376448000), (-44303700));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1439479992, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(411851757L, 30997);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 12766168911729L + "'", long2 == 12766168911729L);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, 96194L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-96194L) + "'", long2 == (-96194L));
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1838377), 324966389, 61, 61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(325417452);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-325417452) + "'", int1 == (-325417452));
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1378642386, (-20), 60837002);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-101), (-10), 336651);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(338688197L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 338688197 + "'", int1 == 338688197);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 7110, (java.lang.Object) (-14));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-894096000), (-31040000), 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 491, (-1412250), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(114864560L, (long) 1940);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 222837246400");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 608, (-2178072437520000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1324268042012160000L) + "'", long2 == (-1324268042012160000L));
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 107, (java.lang.Object) 520);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(420608, (-16759743));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 420608 * -16759743");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-19), (-2132), (-411852512));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-635274), (-6790));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-642064) + "'", int2 == (-642064));
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-59344612), (-31059));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -59344612 * -31059");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(888L, (long) (-20880));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 21768L + "'", long2 == 21768L);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-19032), (-3454393), 113200);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(22340372L, 56532L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1262945909904");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(420608, 2097, 0, 16378246);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 422705 + "'", int4 == 422705);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-32814600L), 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1148511000L) + "'", long2 == (-1148511000L));
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 56158L, (java.lang.Object) 38169);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-3361938), 56169, 325417452);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 321999346 + "'", int3 == 321999346);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 443, 3361050L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3361493L + "'", long2 == 3361493L);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(185849, (-121046));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 185849 * -121046");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-574), 294328428, (-247112800));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -574 for  must be in the range [294328428,-247112800]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-2182), (-14252887), 471872000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2182) + "'", int3 == (-2182));
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-220620), 34063807288L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-34064027908L) + "'", long2 == (-34064027908L));
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 96967, (-59950740), (-1418764));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 96967 for  must be in the range [-59950740,-1418764]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(3331780L, (-622926900348288626L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 3331780 * -622926900348288626");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(25532688, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 19633816, (java.lang.Object) 285);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-347545500L), 1857L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-347543643L) + "'", long2 == (-347543643L));
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-27565200), (java.lang.Object) 56222);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 1439480486, (long) 114864683);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 165345469709075938");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-471506011), (java.lang.Object) (-30008370682464L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-4634767160568L), (java.lang.Object) (-325920000));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-56115), 88012474);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4938819978510L) + "'", long2 == (-4938819978510L));
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 31378L, (java.lang.Object) (-1452704));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 337, 1378643530, 3614000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 337 for hi! must be in the range [1378643530,3614000]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 336663, (-206905806), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(773, (-5514792), 1439554100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 773 + "'", int3 == 773);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 96194, 5924134152L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5924230346L + "'", long2 == 5924230346L);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(6233591481727L, (long) (-14252887));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 6233591481727 * -14252887");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-10008), 294328442, (-53078820));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -10008 for  must be in the range [294328442,-53078820]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 182309L, (java.lang.Object) (-347511184L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 64, (-16759695L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1072620480) + "'", int2 == (-1072620480));
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) ' ', (long) (-16387741));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-16387709L) + "'", long2 == (-16387709L));
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 15886);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15886 + "'", int1 == 15886);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, (-4368));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4368) + "'", int2 == (-4368));
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-2764712448L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -2764712448");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(114866500, 33950);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 114866500 * 33950");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (short) 1, 96000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 96000L + "'", long2 == 96000L);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-980712), 347545546, 6144000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 114866510, (-1135315L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-130409671800650L) + "'", long2 == (-130409671800650L));
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-3928050L), (long) 336748);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1322762981400");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-4890033668300800L), 336748);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -4890033668300800 * 336748");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1439480486), (-296836), (-19508764), 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-15637477) + "'", int4 == (-15637477));
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-1352913L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1352913) + "'", int1 == (-1352913));
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-776769210));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-776769210) + "'", int1 == (-776769210));
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 776769210, 1439484314, (-1088));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 776769210 for  must be in the range [1439484314,-1088]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(300, 44046, (-126191885), 28);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-126147568) + "'", int4 == (-126147568));
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(59417698L, (long) (-16759695));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 42658003L + "'", long2 == 42658003L);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(5924134152L, 431);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2553301819512L + "'", long2 == 2553301819512L);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1104586000));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1104586000 + "'", int1 == 1104586000);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 290033, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 290033L + "'", long2 == 290033L);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, (-1135350), 30);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 562010000, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 562010000L + "'", long2 == 562010000L);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-776771726), (-285), (-22464800));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(300416461784L, (-4231));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1271062049808104L) + "'", long2 == (-1271062049808104L));
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-2), 98, 26114);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-3501), 21162, (-797));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 443, 943, (-20870));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 443 for  must be in the range [943,-20870]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 194, (long) 855);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 165870L + "'", long2 == 165870L);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-444600), 285, (-1439480486));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -444600 for  must be in the range [285,-1439480486]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-22), 22, 5514792, (-886762));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(5514792, 0, 0, (-1144));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(49482300L, (-35954L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 49446346L + "'", long2 == 49446346L);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-2L), (java.lang.Object) (-239124363));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(21152985, (-12390400));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 21152985 * -12390400");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 251320687, (-473292750), 278141647);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 294328442, (-886762), 107);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 294328442 for hi! must be in the range [-886762,107]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1176022016), 114866500, 865);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1176022016 for  must be in the range [114866500,865]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(14, 4352, 3832, (-3361938));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-200236812));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 200236812 + "'", int1 == 200236812);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-9940));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9940 + "'", int1 == 9940);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(119427015, (-73540));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 119427015 * -73540");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 531, 19, 764);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(161662, (-2072113), (-6965), (-2256918));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(347545500, 9756);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 347555256 + "'", int2 == 347555256);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(89655L, (-3225492L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3315147L + "'", long2 == 3315147L);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 56212);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-28933L), (long) 1144);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-30077L) + "'", long2 == (-30077L));
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-19032), (-59288497L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-59307529L) + "'", long2 == (-59307529L));
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 174652, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 174652L + "'", long2 == 174652L);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-320L), (java.lang.Object) (-5180732));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-285));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 285 + "'", int1 == 285);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(46703893L, (long) 1778168224);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1824872117L + "'", long2 == 1824872117L);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 13448081, (-15637477));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-210294057331637L) + "'", long2 == (-210294057331637L));
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-8557), (long) 443);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-9000L) + "'", long2 == (-9000L));
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 1439480000, (-4907389L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -7064088317720000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-53077751), 1439480000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -53077751 * 1439480000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 324966389, 105896632812400L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 324966389 * 105896632812400");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 24091087111212L, obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) (byte) 100, 8557, 96194);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(111551661, 347489423);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 459041084 + "'", int2 == 459041084);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 12211200, 42228);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 515654553600L + "'", long2 == 515654553600L);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(11287220580048L, (long) (-23833747));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11287244413795L + "'", long2 == 11287244413795L);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-4634346), 1439480362, 1439480362);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 143337075939L, (java.lang.Object) 5924134152L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-819096963309323L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -819096963309323");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(813, 15886, 32296, 337463000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 337447404 + "'", int4 == 337447404);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1824, 1174118400, 14072638);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1174118400), 10000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1174118400 * 10000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-247112800), (-260054954), (-18212066), 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-15441945) + "'", int4 == (-15441945));
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(27022, 1134640, 114864751);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 113757134 + "'", int3 == 113757134);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, (long) (-306424));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 306424L + "'", long2 == 306424L);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-2182), (-1315L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2869330 + "'", int2 == 2869330);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(471872000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-471872000) + "'", int1 == (-471872000));
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) (-20880));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 867, (-27936000), 4287360);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 337447404, (java.lang.Object) (-1010L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 370, 6532614545965L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6532614546335L + "'", long2 == 6532614546335L);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-9940), 7110);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2830) + "'", int2 == (-2830));
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 1144, (long) 319980239);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 319981383L + "'", long2 == 319981383L);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(2132, (-424));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-903968) + "'", int2 == (-903968));
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1681L, (long) 1827);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3071187L + "'", long2 == 3071187L);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-462799L), 42228L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -19543076172");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-1951694241210L), (long) 797);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1951694242007L) + "'", long2 == (-1951694242007L));
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 'a', (long) 25532688);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 25532785L + "'", long2 == 25532785L);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(114400, (-5453));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-623823200) + "'", int2 == (-623823200));
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (long) 471872000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-129206581), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1093820), 114866436, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1079597460, (-3454332));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1076143128 + "'", int2 == 1076143128);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 321999346, (-9535));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3070263764110L) + "'", long2 == (-3070263764110L));
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(814290);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-814290) + "'", int1 == (-814290));
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 12053737, (long) 16383699);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 28437436L + "'", long2 == 28437436L);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 294328428, 347545513, (-443037));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 47255125, (long) 114864751);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5427948166598875L + "'", long2 == 5427948166598875L);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 31059, 111551661, (-623823200));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-8372320470777896L), (-68));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 569317792012896928L + "'", long2 == 569317792012896928L);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 90151, 764, (-6783015));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-290033), (long) (-32358875));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32068842L + "'", long2 == 32068842L);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-3454393));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3454393 + "'", int1 == 3454393);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-10008), 306072);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 296064 + "'", int2 == 296064);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 107, 0, (-19));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-87577344233175480L), (-2132L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-87577344233173348L) + "'", long2 == (-87577344233173348L));
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 114864751, (-114399), (-424));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 56206080L, (java.lang.Object) 57074);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(218221889L, 1351296);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 294882365718144L + "'", long2 == 294882365718144L);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(347545546, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 347545546 + "'", int2 == 347545546);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-60837102));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60837102 + "'", int1 == 60837102);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(27022, (-1110194));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1083172) + "'", int2 == (-1083172));
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, 888L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-888L) + "'", long2 == (-888L));
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 347545614, (-444600), (-175978764));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 54000L, (java.lang.Object) 22L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1724836), (-444600));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2169436) + "'", int2 == (-2169436));
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 78657304, (-16327487), 38169);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-10), (long) 814290);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 814280L + "'", long2 == 814280L);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1110L), (java.lang.Object) 16383699);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-77), (-2256918), 22579200);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-38838810), (-18212066), (-96000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(66498390L, (-27565200));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1833041420028000L) + "'", long2 == (-1833041420028000L));
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 347545530, 0, (-1174118400));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 114399, (java.lang.Object) 608);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 114864683, (-635644), 4287360);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1173511359, 9940, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1173511359 for  must be in the range [9940,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(8317976L, 473292750);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3936837735474000L + "'", long2 == 3936837735474000L);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(569317792012896928L, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 569317792012896927L + "'", long2 == 569317792012896927L);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(936232651440L, (long) 89655);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 83937938364853200");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-7971618), (long) (-849792292));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-857763910L) + "'", long2 == (-857763910L));
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-53077751), (long) (-73540));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53151291L) + "'", long2 == (-53151291L));
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(3071187L, (-31040011L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-95329678263057L) + "'", long2 == (-95329678263057L));
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 21, (long) 294328428);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-294328407L) + "'", long2 == (-294328407L));
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(33940, 0, (-129728466), 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-129694579) + "'", int4 == (-129694579));
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-1951694241210L), 3336437894400L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5288132135610L) + "'", long2 == (-5288132135610L));
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 1176022016, 923L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1176021093L + "'", long2 == 1176021093L);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-38838810), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-38838810) + "'", int2 == (-38838810));
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-347545500), (-28007L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9733706818500L + "'", long2 == 9733706818500L);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-471872000), 1778168224, (-3454332));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -471872000 for  must be in the range [1778168224,-3454332]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (byte) 100, (-1260));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-126000L) + "'", long2 == (-126000L));
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-261998846200000L), (long) 1439479962);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-262000285679962L) + "'", long2 == (-262000285679962L));
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(31378L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 31378 + "'", int1 == 31378);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-888L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-888) + "'", int1 == (-888));
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(12211200, (-574), (-325920000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-361904400L), 306072);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-110768803516800L) + "'", long2 == (-110768803516800L));
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1135350), (-1132), (-306285732));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-109725L), (-1381439067L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1381329342L + "'", long2 == 1381329342L);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(24806, (-347545600));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 24806 * -347545600");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-95329678263057L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -95329678263057");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-32358875), (-776771726), 45097998);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-776771726), 294330944L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-228627955386089344L) + "'", long2 == (-228627955386089344L));
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-87), (-318748167337600000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 318748167337599913L + "'", long2 == 318748167337599913L);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1065883), (-14070193L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 13004310L + "'", long2 == 13004310L);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 278399375, 17984320, 1418764);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 278399375 for hi! must be in the range [17984320,1418764]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-776771726), 1838377, 0, 8047760);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5699468 + "'", int4 == 5699468);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(443037, (-19508764));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-19065727) + "'", int2 == (-19065727));
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 2068, (-206905806), 6153415);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, 33950);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33950 + "'", int2 == 33950);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 665, 53078820, 1144);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 665 for hi! must be in the range [53078820,1144]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 531, (long) 74108);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-73577L) + "'", long2 == (-73577L));
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 264272071, (-318748167337600000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-318748167073327929L) + "'", long2 == (-318748167073327929L));
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(5178600);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-5178600) + "'", int1 == (-5178600));
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(54365481667875000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 54365481667875000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-45156), 122220L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5518966320L) + "'", long2 == (-5518966320L));
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(923280777342L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 923280777342");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-11), 2869330);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2869319 + "'", int2 == 2869319);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-411852142), (-635644), (-306072));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-545038) + "'", int3 == (-545038));
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-30L), (-936232672320L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-936232672350L) + "'", long2 == (-936232672350L));
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-296822), (long) (-96000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-392822L) + "'", long2 == (-392822L));
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(34023, (int) (byte) 100, 0, 114866399);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 34123 + "'", int4 == 34123);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 21162, (long) 89655);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 110817L + "'", long2 == 110817L);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-16383699), 32, (-888), 4352);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-301) + "'", int4 == (-301));
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-2396831103000L), 282862531276L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2679693634276L) + "'", long2 == (-2679693634276L));
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-2880), 16698191, 1104586000, (-114866399));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(42658003L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 42658003 + "'", int1 == 42658003);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(491, (-320), (-8449560), 114864217);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 171 + "'", int4 == 171);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-17523260));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 17523260 + "'", int1 == 17523260);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(10792673988957L, (long) (-5180732));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 10792673988957 * -5180732");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(47164942, (-6965));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 47164942 * -6965");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(369725, (-19));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7024775) + "'", int2 == (-7024775));
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(55763320, 38693342);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 55763320 * 38693342");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(588, 1664);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2252 + "'", int2 == 2252);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(547, (-867), (int) (byte) 10, 78446016);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 78445687 + "'", int4 == 78445687);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-520), 891308, 1838377);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-66324388), 8047760, 1079597460, (-16725793));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-867), (int) (short) -1, 1132);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-239124363), 1439554110, 129728466);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -239124363 for hi! must be in the range [1439554110,129728466]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1378642386), 74108, 940);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1378642386 for  must be in the range [74108,940]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-355653908));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-355653908) + "'", int1 == (-355653908));
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1088), (java.lang.Object) 4352);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1468050354), (-10008), (-2169436));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-77), 336663, (-28601));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-223400488L), 31378L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7009860512464L) + "'", long2 == (-7009860512464L));
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 337, (long) (-2830));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-953710L) + "'", long2 == (-953710L));
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 943, (-44303700), 61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 42680);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-206905806), (-635644), 38169);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 665, (long) 882057856);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 586568474240");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-44303700), (java.lang.Object) (-9000L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, (-113535L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 113535L + "'", long2 == 113535L);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 10864277, (-23832863L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 34697140L + "'", long2 == 34697140L);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 1554344743, (long) 411852142);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 640160211810989506");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 6084168, 0, (-129206581));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6084168 for  must be in the range [0,-129206581]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 13448081, (java.lang.Object) 435386);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(194, (-1110194));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-215377636) + "'", int2 == (-215377636));
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-943), (long) 1439480362);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1357429981366L) + "'", long2 == (-1357429981366L));
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 285, 884, 7110);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 57958, (java.lang.Object) 290033L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(103, (-7971618));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7971515) + "'", int2 == (-7971515));
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-58032), 0, (-90151), 96967);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-58032) + "'", int4 == (-58032));
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(206267971973120L, (-105896632722745L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 206267971973120 * -105896632722745");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-41773993547846778L), 1213099200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -41773993547846778 * 1213099200");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-16327487), (-220620), 813);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-162805) + "'", int3 == (-162805));
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-2312864769280L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2312864769280L) + "'", long2 == (-2312864769280L));
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(298799718000L, (long) 1869436);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 298801587436L + "'", long2 == 298801587436L);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-66324388), (long) 57074);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-66381462L) + "'", long2 == (-66381462L));
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-19065727), 1439484314);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -19065727 * 1439484314");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1452704, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 45097998, obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-4231), (-471506011), (-64306528));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-407203715) + "'", int3 == (-407203715));
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-61551), (long) (-5453));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 335637603L + "'", long2 == 335637603L);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(1565L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1565 + "'", int1 == 1565);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 422705, (-3200), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-220746L), obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(14072638);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-14072638) + "'", int1 == (-14072638));
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 97, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 2097, 867, 814290);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 337, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 337L + "'", long2 == 337L);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-884), 620, 56212);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -884 for  must be in the range [620,56212]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 278141647);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 278141647 + "'", int1 == 278141647);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-10239367662L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -10239367662");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-929983636736L), (long) 26288);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -24447409842515968");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-337463000));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 337463000 + "'", int1 == 337463000);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 24462849815L, (java.lang.Object) (-5919653106072000L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(40683, 78445687);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 78486370 + "'", int2 == 78486370);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-14252887), 347545513, (-64306528), 266796);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-54147324) + "'", int4 == (-54147324));
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1439479798, 62, 524);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(31378, 2693424);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2724802 + "'", int2 == 2724802);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(923280777342L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 923280777342L + "'", long2 == 923280777342L);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-2256918), (java.lang.Object) 53050);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 325417452, 269, 12278080);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 325417452 for  must be in the range [269,12278080]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(6327901449496L, (-129206581));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 6327901449496 * -129206581");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 1213099200, 8650L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1213090550L + "'", long2 == 1213090550L);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1000, (-10008), (-2693424));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 1940, (-2880), 43189);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(62, (-36835302));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 62 * -36835302");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-376325780L), (-28933L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10888233792740L + "'", long2 == 10888233792740L);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-3070263764110L), (long) (-2205));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3070263761905L) + "'", long2 == (-3070263761905L));
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(31045, (-129728466), (-805319), 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-40901) + "'", int4 == (-40901));
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-61552), (-1439480486), 867);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-61552) + "'", int3 == (-61552));
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1260), (-63236920320000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-63236920321260L) + "'", long2 == (-63236920321260L));
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 32, 2737408, (-295447342));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-129206581), 11, (-16383699), (-23833747));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1439479992, (-1452704), (-15637477), (-894096000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-15637477), 47164974);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -15637477 * 47164974");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 16105260, (java.lang.Object) (-113535L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-87577344233173348L), (long) (-17850666));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-87577344215322682L) + "'", long2 == (-87577344215322682L));
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-3225492L), (long) (-101));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 325774692L + "'", long2 == 325774692L);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 56222, (-19240), 63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1184), (-33950));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-35134) + "'", int2 == (-35134));
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-9535), (long) 943);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8592L) + "'", long2 == (-8592L));
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-358690), 338688232, 620);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1174118400, (-4352), (-278399375));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1439484314, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1439484314 + "'", int2 == 1439484314);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-71680), (-18877689765028560L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -71680 * -18877689765028560");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-5288132135610L), (java.lang.Object) (-1421496042L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(2693424, 314504320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 317197744 + "'", int2 == 317197744);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(22340372L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22340372 + "'", int1 == 22340372);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-260054954));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 260054954 + "'", int1 == 260054954);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1173682360L), (long) (-12390400));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 14542393913344000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-70597107), 1351296, 31809);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-296822), 2756520000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -818195779440000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(52, 114866436, 27565200, 70331);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1200131, 390060987, 336748);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1200131 for  must be in the range [390060987,336748]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-19032));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-19032) + "'", int1 == (-19032));
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-101), 6153415, (-16759743), (-12211200));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-16589406) + "'", int4 == (-16589406));
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-888L), (long) 1192357204);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1192358092L) + "'", long2 == (-1192358092L));
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, 321008025600L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 2182);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 114866436, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-12L), (long) (-247112800));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 2965353600");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(113757134, 2724802, 78446016, (-85));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-226197171200000L), (-336663));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -226197171200000 * -336663");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1664);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1664) + "'", int1 == (-1664));
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1289464), (-71680), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-70887) + "'", int3 == (-70887));
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 10582370);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 562010000, 325417452L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 887427452L + "'", long2 == 887427452L);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-56212), 22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-56190) + "'", int2 == (-56190));
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-247056567), (-6790), (-2205));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-20870), (long) (-38838800));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-38859670L) + "'", long2 == (-38859670L));
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(56158L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 56158 + "'", int1 == 56158);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(114866500);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-114866500) + "'", int1 == (-114866500));
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-24674144L), 23627962834L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -582999757392764096");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-3361938), 1200131, 13448081, (-2182));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(12766168911729L, (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 663840783409908L + "'", long2 == 663840783409908L);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-1132));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1132) + "'", int1 == (-1132));
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-2880), (-118319015L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 118316135L + "'", long2 == 118316135L);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(28627459, 321999346, 347545500, 1439480486);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 350626805 + "'", int4 == 350626805);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-54));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 54 + "'", int1 == 54);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(114864751, 93989);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 114864751 * 93989");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-4352), (-70597107));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -4352 * -70597107");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1352913), (-4634767160568L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4634765807655L + "'", long2 == 4634765807655L);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(31809, 2869330, 814290, 114866500);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2901139 + "'", int4 == 2901139);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(22340372, (-411851622), (-943), 294330944);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 199152526 + "'", int4 == 199152526);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(161662, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 161662 + "'", int2 == 161662);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-3313090), (long) (-640));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2120377600 + "'", int2 == 2120377600);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(9940, 943);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9373420 + "'", int2 == 9373420);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 16, 1554344743, 865);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 16 for hi! must be in the range [1554344743,865]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, (-200236812), 46723048);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-4907389L), 53050);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-260336986450L) + "'", long2 == (-260336986450L));
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-44068179194L), 225526673966L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-269594853160L) + "'", long2 == (-269594853160L));
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (byte) 1, (long) 73);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 73 + "'", int2 == 73);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, (-6783015), 336748);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1465L), 347459013L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -509027454045");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-35), 959, 14072638);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-7354L), (long) (-126532));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 930516328 + "'", int2 == 930516328);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-5453), 347545500, 0, (-22468000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 705L, obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(930516328, 27565200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 958081528 + "'", int2 == 958081528);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 20, (-27513L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-550260L) + "'", long2 == (-550260L));
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) (byte) 1, (-7971618), 5789836);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-23833747), (java.lang.Object) (-520));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-60837102), (-4634346), 42228);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -60837102 for hi! must be in the range [-4634346,42228]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(798993155480L, (-96715290087L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 798993155480 * -96715290087");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }
}

