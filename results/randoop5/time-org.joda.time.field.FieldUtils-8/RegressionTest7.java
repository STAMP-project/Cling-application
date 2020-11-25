import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-411852512));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 411852512 + "'", int1 == 411852512);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 7392017746501839872L, (java.lang.Object) (-74108));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(118612725, 1860);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 118612725 * 1860");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-6965), (java.lang.Object) (-269593966398L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 113200, (-410717198));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-46493186813600L) + "'", long2 == (-46493186813600L));
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1381439067L), (java.lang.Object) (-826L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1857L, (long) (-5084732));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-9442347324L) + "'", long2 == (-9442347324L));
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-8983), (-3200));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28745600 + "'", int2 == 28745600);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-4356681016070000L), (long) 129728466);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4356681145798466L) + "'", long2 == (-4356681145798466L));
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1146858930), 1827, 1076143128);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1005423674 + "'", int3 == 1005423674);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1236900L), (long) (-776769210));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 960785835849000L + "'", long2 == 960785835849000L);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(814290, (-3889077));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3074787) + "'", int2 == (-3074787));
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-33950), 20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-33930) + "'", int2 == (-33930));
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-797), (-894096000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 712594512000L + "'", long2 == 712594512000L);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-776769210), (-603316646236L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-604093415446L) + "'", long2 == (-604093415446L));
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-200236812), (-290033), (-2516));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-124284) + "'", int3 == (-124284));
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-31109), 2737408);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2706299 + "'", int2 == 2706299);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1104641584), 1439479992, 64291334);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1452704), 1378643530);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2002760970605120L) + "'", long2 == (-2002760970605120L));
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(31L, (long) (-2169436));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-67252516) + "'", int2 == (-67252516));
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(1824872117L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1824872117 + "'", int1 == 1824872117);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-3282031L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3282031) + "'", int1 == (-3282031));
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(2205, (-12476792));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12474587) + "'", int2 == (-12474587));
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(397709312000L, (long) (-325920000));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 397709312000 * -325920000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, 5400L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5400L) + "'", long2 == (-5400L));
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-443037), 443037, 296064);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -443037 for hi! must be in the range [443037,296064]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1460, 129300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 130760 + "'", int2 == 130760);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(660994L, 45487978);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 30067280530132L + "'", long2 == 30067280530132L);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1330), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-443037), 0, (-2072113));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-320), (-8557), 0);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-347555256), (-141120), (-15637477));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(53407, 53078884, 694);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(60837102L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-278399375), (-28), (-4368));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(61669960352L, (long) 336748);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 20767235808615296");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(444964L, (-33930));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-15097628520L) + "'", long2 == (-15097628520L));
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(344301801L, 53407747068L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 344301801 * 53407747068");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-9932706), (-18058559));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -9932706 * -18058559");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-16383699), (-1134), (-2516));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-73540), 22579200, (-4672000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(51931, (-4634346));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4582415) + "'", int2 == (-4582415));
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(6774628331L, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-3889077), (long) 16698191);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-64940550559707L) + "'", long2 == (-64940550559707L));
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 319980239);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 319980239 + "'", int1 == 319980239);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 3058761464073L, (java.lang.Object) 43396515);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeAdd((-1927258080), (-623823200));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: -1927258080 + -623823200");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-788035248), 708897982);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -788035248 * 708897982");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-4368), (-325920000), 10864277);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-54L), (long) 43219);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2333826L) + "'", long2 == (-2333826L));
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 22464800);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22464800 + "'", int1 == 22464800);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 0, (-971226), 2869319);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(28467799L, (-325069098L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-296601299L) + "'", long2 == (-296601299L));
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, 562010000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-562010000L) + "'", long2 == (-562010000L));
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-27933818L), (long) 336748);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-9406657343864L) + "'", long2 == (-9406657343864L));
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-642064), (long) (-6965));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4471975760L + "'", long2 == 4471975760L);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-118319015L), (-1132));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 133937124980L + "'", long2 == 133937124980L);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(930516328, 204128820, 2737408, (-56115));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-23257803353594L), (long) (-263368044));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-23257539985550L) + "'", long2 == (-23257539985550L));
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 333, (-107941), 54261);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 2850105928L, (java.lang.Object) 589471035);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-35890), (java.lang.Object) 635744L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(154L, (-240663));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-37062102L) + "'", long2 == (-37062102L));
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1104586000), 347545614, (-77));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 22, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 119L + "'", long2 == 119L);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-70887), (-6790), 319571529);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 7207137, 1079597460, (-31045));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 7207137 for  must be in the range [1079597460,-31045]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-888));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 888 + "'", int1 == 888);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-306424), 1079597460, (-411851622));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-12390400), (long) (-11));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-12390389L) + "'", long2 == (-12390389L));
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-2880), 97, (-4634346));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -2880 for hi! must be in the range [97,-4634346]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 251320687, (-46666092));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-11728154301045204L) + "'", long2 == (-11728154301045204L));
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1439480486, 89655, 7110);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1260), 1439480362);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1260 * 1439480362");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-296822), (-337463000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) 43189);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-27936000), (-3282031));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -27936000 * -3282031");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1724836));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1724836 + "'", int1 == 1724836);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-4672000), (-31109), 16417401);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-206905806), 0, (-308541708));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1647552128), 3805694867830L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3804047315702L + "'", long2 == 3804047315702L);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 296064, (long) 8318916);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8614980L + "'", long2 == 8614980L);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 14, (-5514792), 1300396800);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(337L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 337 + "'", int1 == 337);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 107, (-58098L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-57991L) + "'", long2 == (-57991L));
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(25344907671L, (-27746));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-703219808239566L) + "'", long2 == (-703219808239566L));
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(814280L, 90151);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 73408156280L + "'", long2 == 73408156280L);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-411852512), (-16589406), 390060987, 1173511359);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1138458828 + "'", int4 == 1138458828);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1315L), (long) 1173511369);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1173510054L + "'", long2 == 1173510054L);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 336651, (long) (-278399375));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-278062724L) + "'", long2 == (-278062724L));
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1824));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1824 + "'", int1 == 1824);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-268), 0, (-355653908));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 107, 129300, 1439480000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1439480486, 129728466, 13448081);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1439480486 for  must be in the range [129728466,13448081]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-411852512), 454, 930);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 90151, 1439480000, (-694));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(865, (-22464800), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22463936) + "'", int3 == (-22463936));
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 350626805, (long) (-46666092));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-16362382739796060L) + "'", long2 == (-16362382739796060L));
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-114866399), 21, (-14));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1827, 940, 1439493446, 10993931);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1612L, (java.lang.Object) 37471891L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 347545600, (long) 10582370);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3677856131072000L + "'", long2 == 3677856131072000L);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-6790), 56532L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-383852280L) + "'", long2 == (-383852280L));
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-1000));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1000) + "'", int1 == (-1000));
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-306836), (-38838810));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-39145646) + "'", int2 == (-39145646));
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-29900), 0, (-260054954));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (short) 0, 1824872117, 888, 337463000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 137561552 + "'", int4 == 137561552);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 891308, (-56201), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(2097);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2097) + "'", int1 == (-2097));
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(50768);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-50768) + "'", int1 == (-50768));
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-406575360000L), 3235200L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1315352604672000000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, 431, (-63612100), 6144000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 431 + "'", int4 == 431);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-58065123L), 35890);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2083957264470L) + "'", long2 == (-2083957264470L));
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1289464, (java.lang.Object) 143351146478L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(5598066600L, (long) (-623823200));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -3492203820225120000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-59950740), (long) (-2097));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-59952837L) + "'", long2 == (-59952837L));
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1378642386), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1378642386 + "'", int2 == 1378642386);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, 63, 1439479992);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1439479930 + "'", int3 == 1439479930);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-8372320470777896L), 321008025600L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8371999462752296L) + "'", long2 == (-8371999462752296L));
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(34123);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-34123) + "'", int1 == (-34123));
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-10240L), (long) 708898934);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7259125084160L) + "'", long2 == (-7259125084160L));
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-411852512), 1065883, 943);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 47164974, (long) 314062600);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 14812754363372400L + "'", long2 == 14812754363372400L);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(9410349954600L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 9410349954600");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(6100L, 27645967L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 27652067L + "'", long2 == 27652067L);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 113200, 1132, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(56201L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 56201 + "'", int1 == 56201);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(269, 319980239, 8047760);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 2481, (-5454));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-13531374L) + "'", long2 == (-13531374L));
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(28601, 263711249, (-70));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 1144, 882057856, 46723048);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1144 for hi! must be in the range [882057856,46723048]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 5454, (java.lang.Object) 1565L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1), 773);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 772 + "'", int2 == 772);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-16327487), 0, 3395000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -16327487 for  must be in the range [0,3395000]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(634880L, 62310L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 39559372800");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(6077576140000L, (long) 338688197);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 6077576140000 * 338688197");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(18058559, (-63612100), 2568555, 8318916);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6199717 + "'", int4 == 6199717);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-95329678263057L), 60837102);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -95329678263057 * 60837102");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-25242667), (-6914L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 174527799638L + "'", long2 == 174527799638L);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 129300, 422705, (-16759743));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-96194L), 5427948166598875L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -96194 * 5427948166598875");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-27936000), 310450);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -27936000 * 310450");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2764712448L), (-78487340));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 216994925908408320L + "'", long2 == 216994925908408320L);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(21);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-21) + "'", int1 == (-21));
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(114866399, (-325417452), 10865750);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-221416804) + "'", int3 == (-221416804));
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(37326030173696L, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 37326030173697L + "'", long2 == 37326030173697L);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1554344743, 103);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1554344846 + "'", int2 == 1554344846);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-6774708780L), (java.lang.Object) 18058559);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-56201), 22340372);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1255551246772L) + "'", long2 == (-1255551246772L));
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-10000), 1672971958, (-347545600));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 2481, (long) (-8449560));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8447079L) + "'", long2 == (-8447079L));
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-392822L), (long) (-411852142));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-412244964L) + "'", long2 == (-412244964L));
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-20870), (-382297), 264272071);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 1253244863, (-7259125084160L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7260378329023L + "'", long2 == 7260378329023L);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 0, 2457, 26114);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for hi! must be in the range [2457,26114]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 1144, (-114866500), (-68));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1144 for hi! must be in the range [-114866500,-68]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1869436), 15886, 78487340);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1869436 for  must be in the range [15886,78487340]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-814290), 531, (-247112800));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(943L, 1523304743L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1436476372649");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 33658101, (-96000), 1418764);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-2737555874112113L), (long) 531);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2737555874112644L) + "'", long2 == (-2737555874112644L));
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-16327487), (-105492979), (-73540));
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 3395000, (long) 96194);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 326578630000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 88012474, 1439480000, (-223497));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 88012474 for  must be in the range [1439480000,-223497]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(35, 51931);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1817585 + "'", int2 == 1817585);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-206804), (-268));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 55423472L + "'", long2 == 55423472L);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 33940, (long) (-56115));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-22175L) + "'", long2 == (-22175L));
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1289464), (java.lang.Object) 347545513);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(11013, (-574), 227768);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11013 + "'", int3 == 11013);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 46723048, (-13140612733500L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 46723048 * -13140612733500");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1824, 285, 2097, 22579200);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2109 + "'", int4 == 2109);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(16378246, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (short) 10, (-3361938), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-56212), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-56212) + "'", int2 == (-56212));
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(90151, 87);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7843137 + "'", int2 == 7843137);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 306424L, (java.lang.Object) 26887865L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-87), 60837102L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -5292827874");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(16104496, 2724802);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 16104496 * 2724802");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 1785, (long) (-1184));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2113440) + "'", int2 == (-2113440));
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 70331, (-35210L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35121L + "'", long2 == 35121L);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 347587830L, (java.lang.Object) 569317792011444224L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1260), 347545600, 50768);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 47164942, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 34023, (-471872000), 1134640);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-213641), (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-213642L) + "'", long2 == (-213642L));
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1253244863, 37);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1253244900 + "'", int2 == 1253244900);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-38859670L), (-36835302));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1431407680070340L + "'", long2 == 1431407680070340L);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 887, (-867), 589471035);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(74074L, (long) (-9932706));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10006780L + "'", long2 == 10006780L);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-114660L), 325417452);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-37312365046320L) + "'", long2 == (-37312365046320L));
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(13448081, (-16874142), (-355653908), 1439459496);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-3426061) + "'", int4 == (-3426061));
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-20), 0, 2737408);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2737389 + "'", int3 == 2737389);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 310711192, 2109, 1778168224);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-60837172), (-886762), 70331);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-540250) + "'", int3 == (-540250));
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1174117535L, (long) (-215377636));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 958739899L + "'", long2 == 958739899L);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-3245687641572L), (long) 337447404);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3245350194168L) + "'", long2 == (-3245350194168L));
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-26953087158774L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -26953087158774");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-884), (-30116L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-31000L) + "'", long2 == (-31000L));
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-85), (-22468000), 55067);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(115160815, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 115160815 + "'", int2 == 115160815);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(454, (-64306528));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 454 * -64306528");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 37, (-1439480486), (-409983077));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(38693342, 891308, (-60837172));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1869436), (-221416804), 4, 12211200);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8726503 + "'", int4 == 8726503);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(114866436, 16233);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 114882669 + "'", int2 == 114882669);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-407203715), 589760000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -407203715 * 589760000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(182309L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 182309 + "'", int1 == 182309);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-278399375), 8047760, (-2516), 443037);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99663 + "'", int4 == 99663);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 708898137L, obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-471506011));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 471506011 + "'", int1 == 471506011);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(10814L, (-430461810));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4655014013340L) + "'", long2 == (-4655014013340L));
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(16759743, 290033);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17049776 + "'", int2 == 17049776);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 0, 7207137, (-45156));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for hi! must be in the range [7207137,-45156]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(16378246);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-16378246) + "'", int1 == (-16378246));
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 90783, (-1824), 2132);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 80375, (-379120), (-306836));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(56147L, (long) 797);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 55350L + "'", long2 == 55350L);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-81726));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 81726 + "'", int1 == 81726);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(8726503, 0, (-1065883));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-356663600L), 7260378329023L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7260021665423L + "'", long2 == 7260021665423L);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 26288, 37, (-15637477));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-819096961782523L), (long) 28745600);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-819096990528123L) + "'", long2 == (-819096990528123L));
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(129300, 263711249, (-1110194));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 1138458828, (long) (-38838810));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1177297638L + "'", long2 == 1177297638L);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-56212), (-38976765321600L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 2190961932257779200");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-87577344233175480L), 10006780L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -87577344233175480 * 10006780");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(53078884, (-776769210), (-9535), 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-3286) + "'", int4 == (-3286));
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(350001, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 27565200, (java.lang.Object) (-262000285679962L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-797), (long) (-654584));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 521703448 + "'", int2 == 521703448);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1431407680070340L, (java.lang.Object) (-16698558L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 56212, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5452564L + "'", long2 == 5452564L);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-4880), 0, 1824, 547);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-30L), (java.lang.Object) 923L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-64940550559707L), (java.lang.Object) 1171681200);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-60836462));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-60836462) + "'", int1 == (-60836462));
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-21), 47255125, 60837102);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(6084168);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-6084168) + "'", int1 == (-6084168));
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1L), 85500L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-85500) + "'", int2 == (-85500));
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 55067, 2737389, 1192357204);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 2252, 0, (-71680));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(59417698L, (long) (-306285732));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -18198793125684936");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 3361938L, (java.lang.Object) (-4594848));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-86500), 431, (-2169436), 773);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-86069) + "'", int4 == (-86069));
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-124284), (-776769210L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 96539984495640");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-797), (-240663));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 191808411 + "'", int2 == 191808411);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(16104496);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-16104496) + "'", int1 == (-16104496));
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-266796), (-3614504740L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 964335406613040L + "'", long2 == 964335406613040L);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1236900L), (-1647552128));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2037857227123200L + "'", long2 == 2037857227123200L);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(2252, 5699468, 2693424, 34804);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-27936000), 977739, (-411851622), 285);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-26958261) + "'", int4 == (-26958261));
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 2097, (java.lang.Object) (-54));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 294328428);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 294328428 + "'", int1 == 294328428);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1184), 958081528);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1134368529152L) + "'", long2 == (-1134368529152L));
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-748531088331L), (-35210L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 26355779620134510");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 2205, (-16327487), (-574));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1000), (-55584), 26853925);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(347545501L, (-873000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-303407222373000L) + "'", long2 == (-303407222373000L));
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-56115), (-213641));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -56115 * -213641");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 2889537, 26853925, 1860);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2889537 for hi! must be in the range [26853925,1860]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-347543643L), 9600L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3336418972800L) + "'", long2 == (-3336418972800L));
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 99663, (long) 42658003);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 42757666L + "'", long2 == 42757666L);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-320));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 320 + "'", int1 == 320);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-56222), 37, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 137561552, (long) (-1176021174));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1038459622L) + "'", long2 == (-1038459622L));
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1134640, 20, 31109);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-888L), (long) 96967);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-86106696) + "'", int2 == (-86106696));
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, 60837522L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60837522L + "'", long2 == 60837522L);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-247056567));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 247056567 + "'", int1 == 247056567);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1401815520), (long) 454);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -636424246080");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1824872117, 45097998);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1869970115 + "'", int2 == 1869970115);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1492491), (-105492979), 0);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 635274, (-58065123L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-57429849L) + "'", long2 == (-57429849L));
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(183559L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 183559 + "'", int1 == 183559);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-206804), 42194L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8725887976L) + "'", long2 == (-8725887976L));
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1681, (java.lang.Object) (-2787301L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 37, 137620108, 1076143128);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(86896592, (-33950));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 86862642 + "'", int2 == 86862642);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-347564634L), 3071187L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-350635821L) + "'", long2 == (-350635821L));
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1565, 1079597460, 64291334, (-19032));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-19240), 347545513);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 347526273 + "'", int2 == 347526273);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(114399, 4287360, 1176022016);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1171849056 + "'", int3 == 1171849056);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(73, (int) (short) 1, 21971139);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 73 + "'", int3 == 73);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-98154727691L), (java.lang.Object) (-306424));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, 7418, (-6839220), 1171849056);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7418 + "'", int4 == 7418);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-247056567), obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 473292750, (-980712), 390060987);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 473292750 for  must be in the range [-980712,390060987]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-14072638));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-14072638) + "'", int1 == (-14072638));
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1087826257, 319571529, (-5514792));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 294328428, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, 54000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-54000L) + "'", long2 == (-54000L));
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(314062600, (-295447342));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18615258 + "'", int2 == 18615258);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1104641584), 1323L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1461440815632");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 26288, 411852512, (-1664));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1110194), (-306072), 887);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-189314) + "'", int3 == (-189314));
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-406575360000L), (-197887756139500L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -406575360000 * -197887756139500");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1418764), 7209274, 119935);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1324268042012160000L), 32259L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1324268042012160000 * 32259");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, 6084168, 34023);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 3889136, (-83142785L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-79253649L) + "'", long2 == (-79253649L));
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(10, 34023, (-114399), 314062600);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 34033 + "'", int4 == 34033);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(10000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-10000) + "'", int1 == (-10000));
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 2252, 1173511369, (-35134));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-168684940L), 347107);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-58551723468580L) + "'", long2 == (-58551723468580L));
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 60837102, (-56115L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3413873978730L) + "'", long2 == (-3413873978730L));
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1778168224, (-87));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1778168224 * -87");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 101916, (-1210L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 103126L + "'", long2 == 103126L);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 333, (-96194L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-32032602L) + "'", long2 == (-32032602L));
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-971226));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-971226) + "'", int1 == (-971226));
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 129728466, (long) (-278399375));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-148670909L) + "'", long2 == (-148670909L));
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(278141647, (-58032), 114866399);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48292783 + "'", int3 == 48292783);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(54000L, 297723428L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 16077065112000L + "'", long2 == 16077065112000L);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(958081528);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-958081528) + "'", int1 == (-958081528));
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-260336986450L), (-347545602L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-260684532052L) + "'", long2 == (-260684532052L));
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-5514792), 28745600, (-71680));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -5514792 for  must be in the range [28745600,-71680]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 10993931, 337463000, (-779310));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1554344743, (-1452704));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1552892039 + "'", int2 == 1552892039);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 310450, 4287360, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(33658101, 78657304);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 33658101 * 78657304");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1778168224, 114864650, (-35002240), (-36835302));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 14, 11013, 199152526);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-814290), (-957754020));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-958568310) + "'", int2 == (-958568310));
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-34L), (long) (-53078820));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 53078786L + "'", long2 == 53078786L);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(119427015, 2457);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 119427015 * 2457");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(3889136, (-100091559));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 3889136 * -100091559");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(1213090550L, (-198688000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -241026535198400000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(114863920);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-114863920) + "'", int1 == (-114863920));
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-30L), 14072638);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-422179140L) + "'", long2 == (-422179140L));
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(111366603, (-16387741));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 111366603 * -16387741");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-32), 51931);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1661792L) + "'", long2 == (-1661792L));
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-308541708));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 308541708 + "'", int1 == 308541708);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 103, 16378246, 338688197);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-31115L), (java.lang.Object) (-411836255L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 187654974, (long) (-286708395));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -53802256409306730");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(361400, 37806580);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 361400 * 37806580");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 266796, 64, 1171849056);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-14072638), 1696);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-23867194048L) + "'", long2 == (-23867194048L));
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(37, 31940548);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1181800276 + "'", int2 == 1181800276);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(21162, 0, (-3223632));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-540250), 7418);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-532832) + "'", int2 == (-532832));
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-87577344233175448L), (-1255551246772L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -87577344233175448 * -1255551246772");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 638436378, (long) 118612725);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 75726678533710050");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 335637603, 199152526, (-814290));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, (-9940));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9940) + "'", int2 == (-9940));
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(970);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-970) + "'", int1 == (-970));
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-7971515), 7843137);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-128378) + "'", int2 == (-128378));
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-18027450), (-9940));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -18027450 * -9940");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-9535), 1439479992, 25532688);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -9535 for  must be in the range [1439479992,25532688]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-215377636), (-45156));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-215422792) + "'", int2 == (-215422792));
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1565, (-296836), (-1452704));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-424), (-355653908));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -424 * -355653908");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-603316646236L), 1418764);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-855963938280372304L) + "'", long2 == (-855963938280372304L));
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-819096963309323L), (long) 9373420);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-819096972682743L) + "'", long2 == (-819096972682743L));
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 2182, (-894096000), 1552892039);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(958081528, 185849);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 958267377 + "'", int2 == 958267377);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 2120377600, (-162007), 481446432);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2120377600 for hi! must be in the range [-162007,481446432]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-776769210), (-1072620480), (-16698191));
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(347571714L, (long) (-71680));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -24913940459520");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(251320687, 882057856);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 251320687 * 882057856");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(216994925908408320L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 216994925908408320");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-14070193L), (-5178599L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8891594L) + "'", long2 == (-8891594L));
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 16233, (java.lang.Object) 8317976L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-25242667));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 25242667 + "'", int1 == 25242667);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(1L, (-9000L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9000) + "'", int2 == (-9000));
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-1452704));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1452704) + "'", int1 == (-1452704));
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1079597460, 114400, (-5250));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1507);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1507) + "'", int1 == (-1507));
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 320, (-70597107), 310450);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(337, (-73540));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-73203) + "'", int2 == (-73203));
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(183559);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-183559) + "'", int1 == (-183559));
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(708898934, 114866399);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 823765333 + "'", int2 == 823765333);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-894096000));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 894096000 + "'", int1 == 894096000);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(2481, (-3282031), (-162007), 708898934);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 705781392 + "'", int4 == 705781392);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 422705, (-471506011), (-849792292));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1072620480), (-3200), 524);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3005) + "'", int3 == (-3005));
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(114863920, 28627459, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-22), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-22) + "'", int2 == (-22));
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (short) 0, (long) 338688197);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 338688197L + "'", long2 == 338688197L);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1824), (-2880868890240L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2880868892064L) + "'", long2 == (-2880868892064L));
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(814280L, (long) 1171681200);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1170866920L) + "'", long2 == (-1170866920L));
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 635644, (-16387709L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -10416748899596");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-481502547L), 1439493446);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-693119760638806962L) + "'", long2 == (-693119760638806962L));
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-85500));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-85500) + "'", int1 == (-85500));
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 185849, (long) 50768);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9435182032L + "'", long2 == 9435182032L);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 114882669, 56201, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 86862642, (-5454));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-473748849468L) + "'", long2 == (-473748849468L));
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 37, 1824, (-85));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(129671487, 55763320, (int) (short) -1, 603469);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 169210 + "'", int4 == 169210);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-3313090), 347489423);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -3313090 * 347489423");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(93989, (-6965), (int) (byte) 100, 867);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 240 + "'", int4 == 240);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(186124399295189L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 186124399295189");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1613588533662L), (long) 43189);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1613588490473L) + "'", long2 == (-1613588490473L));
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(55350L, 1181800276);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 65412645276600L + "'", long2 == 65412645276600L);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 473292750, (-3005), (-1135350));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1104586000), (java.lang.Object) 114866436);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-348526226), (-1492491), 36140);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1870 + "'", int3 == 1870);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(17687484L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 17687484 + "'", int1 == 17687484);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-16378246), (-358690), (-78487340), 199152526);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-16736936) + "'", int4 == (-16736936));
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(114864650, 263789912);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 114864650 * 263789912");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 78446016, (-1104586000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1026139984L) + "'", long2 == (-1026139984L));
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-4), (long) 1192357204);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -4769428816");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-407203715));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-407203715) + "'", int1 == (-407203715));
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-903968), 708898934, (-1083172));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1439480362, (-183559), (-1492491));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-35));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-35) + "'", int1 == (-35));
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 31045, (-5454), (-1104586000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-1110194));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-60836462), 57385L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-60779077L) + "'", long2 == (-60779077L));
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 60837002, (long) 31059);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60805943L + "'", long2 == 60805943L);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 1181800276);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(185849, 168100, 40683, 443);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(420608, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-23833747), (long) (-9535));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-23843282L) + "'", long2 == (-23843282L));
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 347545614, (long) 457400);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 158967363843600");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, (-4356681145798466L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4356681145798466L + "'", long2 == 4356681145798466L);
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-776164936753130L), 1857);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1441338287550562410L) + "'", long2 == (-1441338287550562410L));
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-54000), 730450L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-784450L) + "'", long2 == (-784450L));
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(294330944);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-294330944) + "'", int1 == (-294330944));
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 266796, (-278399375), 114864751);
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, (-171947));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-171947) + "'", int2 == (-171947));
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(34804, 260054954, (-3282031), 6144000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5586894 + "'", int4 == 5586894);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1869436), obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-223497), 347489423);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -223497 * 347489423");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-10000), 114866399);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -10000 * 114866399");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-146892482168359200L), (long) (-1452704));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -146892482168359200 * -1452704");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-19240), 0, 251320687);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 251301448 + "'", int4 == 251301448);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 5699468, (-324966389), 19633816);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1134), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1134) + "'", int2 == (-1134));
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1065546), (-16759091), 103, 33950);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 13259 + "'", int4 == 13259);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1439554100, 296064);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1439850164 + "'", int2 == 1439850164);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-23843282L), obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-23257803353594L), (long) 38169);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-23257803391763L) + "'", long2 == (-23257803391763L));
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-78625298580L), (-220746L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-78625519326L) + "'", long2 == (-78625519326L));
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 314507200);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 314507200 + "'", int1 == 314507200);
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-34123));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-34123) + "'", int1 == (-34123));
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-60837102), (-411888032), 5514792);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(114864560L, (-96715290087L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 114864560 * -96715290087");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-347511184L), (java.lang.Object) 1869970115);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-27746), (long) (-4594848));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 127488652608");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(111366603, (-100));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 111366503 + "'", int2 == 111366503);
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-296909), 13259, (-126147568));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(7843137, 457400);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 7843137 * 457400");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(36835302, (-6783015));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30052287 + "'", int2 == 30052287);
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-30L), 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(823765333);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-823765333) + "'", int1 == (-823765333));
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1268302), 86862642, (int) (byte) 0, 22464800);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 18199937 + "'", int4 == 18199937);
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-3313090));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3313090) + "'", int1 == (-3313090));
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-182877), (java.lang.Object) 96194);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1000), (-27564308L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 27563308L + "'", long2 == 27563308L);
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-33930), (java.lang.Object) 73408156280L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-574), (-9700), 1439480000, 37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(101916, (-16387741), 2182);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-16288008) + "'", int3 == (-16288008));
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-28601), 31045, (-16698191));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1682), 1174118400, (-9940), 3614000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3583775 + "'", int4 == 3583775);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-4809861488768L), (long) (-1468050354));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -4809861488768 * -1468050354");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-348526226), 603469, (-25532688));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -348526226 for hi! must be in the range [603469,-25532688]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-4356681130933920L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -4356681130933920");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 608, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 608L + "'", long2 == 608L);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-347555256));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 347555256 + "'", int1 == 347555256);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(887, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 886 + "'", int2 == 886);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(2120377600, 1860);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2120379460 + "'", int2 == 2120379460);
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 411851622, 0, 1869436);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, (-126191885));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-126191885) + "'", int2 == (-126191885));
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 26853925);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 26853925 + "'", int1 == 26853925);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-107941), 47164974, 431);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -107941 for  must be in the range [47164974,431]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-74108), (-1682), 88012474);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 87940049 + "'", int3 == 87940049);
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(472873, (-60836462));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 472873 * -60836462");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1144, 119935);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 121079 + "'", int2 == 121079);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(18897, (-1330), 18615258, (-19065727));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(34123, (-407203715), (-4240), (-22462636));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1378643530, (-69223), 56169, 589760000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 199166643 + "'", int4 == 199166643);
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-20870), 12211200, 1173511359, (-33930));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1176022016));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1176022016 + "'", int1 == 1176022016);
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 37, 64);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2368L + "'", long2 == 2368L);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(119427015, 1439479962);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1558906977 + "'", int2 == 1558906977);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) (-411851622));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-107941));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 107941 + "'", int1 == 107941);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1421065421), 12211200, 764);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(9118000L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9118000 + "'", int1 == 9118000);
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1827, 347545614, (-153769677));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-10418194889133633L), (java.lang.Object) 347489423);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 187654974, (long) 1171849056);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 219903304135604544");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 55067, (-34804), 1460);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1171849056, 325417452, (int) '#', (-1927258080));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-77), (-206905806), 347545614);
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(16387641L, (long) 1460);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 23925955860");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 10864277, (java.lang.Object) (-18212066));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1869970115, 16, 32296, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-4221599021736L), (java.lang.Object) (-12211200));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-1010L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1010) + "'", int1 == (-1010));
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-355653908), 58115043, (-16736936));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(970, (-1176022016));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1176021046) + "'", int2 == (-1176021046));
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-823765333), 1672971958);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 849206625 + "'", int2 == 849206625);
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-358690));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 358690 + "'", int1 == 358690);
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(16387641L, (long) 708898050);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 11617166749000050");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1439480486), (-411888032), 1565);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(86862642, (-849792292));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 86862642 * -849792292");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(7392017746501839872L, (-392822L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7392017746502232694L + "'", long2 == 7392017746502232694L);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 183559, 708898934, (-11));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 183559 for  must be in the range [708898934,-11]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1287524L, (-183330000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-236041774920000L) + "'", long2 == (-236041774920000L));
    }
}

