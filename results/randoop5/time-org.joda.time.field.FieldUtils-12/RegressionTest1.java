import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 1439479962, (long) 38838800);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1478318762L + "'", long2 == 1478318762L);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(3395000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3395000) + "'", int1 == (-3395000));
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(347545600, 454, (-10), 56222);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26114 + "'", int4 == 26114);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-100), 33940, 1144);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(10240);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-10240) + "'", int1 == (-10240));
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(310450, 129300);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 310450 * 129300");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-867), 33940, (-3395000), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-3361938) + "'", int4 == (-3361938));
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1144, (int) ' ', (-3361938));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 970, 20, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-54), 114400, (-44303700));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 47164974, 56201, 73);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 47164974 for  must be in the range [56201,73]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(634880);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-634880) + "'", int1 == (-634880));
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 26114, (long) (-634880));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 660994L + "'", long2 == 660994L);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-970), 620, (-1135350));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -970 for  must be in the range [620,-1135350]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 61, 20, (-3200));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 38838800, (long) 285);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 38839085L + "'", long2 == 38839085L);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 37, (-56115), (-54));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 37 for  must be in the range [-56115,-54]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-933L), (long) 107);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-826L) + "'", long2 == (-826L));
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-14), (-22464800));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 314507200 + "'", int2 == 314507200);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(80449);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-80449) + "'", int1 == (-80449));
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(424);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-424) + "'", int1 == (-424));
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-22464800), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -22464800 * 100");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 1289464);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1289464 + "'", int1 == 1289464);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 424, 33950, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-6790), 114399);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-776769210) + "'", int2 == (-776769210));
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) 'a', (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-194) + "'", int2 == (-194));
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 80449);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 80449 + "'", int1 == 80449);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 73, (long) 2205);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2132L) + "'", long2 == (-2132L));
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) '4', 129300, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) (short) 100, (int) (byte) 0, (-32));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-35L) + "'", long2 == (-35L));
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 10240, (long) (-574));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10814L + "'", long2 == 10814L);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-34L), 20L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-54L) + "'", long2 == (-54L));
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-60837102), 347545500);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -60837102 * 347545500");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 114864751, (java.lang.Object) (-867));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1664, 1439479992, (-443037));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-101), (-60837102), 60837102, (-220620));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(60837102, 588);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 60837102 * 588");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(424, (-1135350));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-481388400) + "'", int2 == (-481388400));
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 884, 11, 634880);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(30, 56222, 347545614);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 347489423 + "'", int3 == 347489423);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(764, 588, 347545500);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 764 + "'", int3 == 764);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 319980239, 52, 884);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1144, 333);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1477 + "'", int2 == 1477);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(114399, 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7207137 + "'", int2 == 7207137);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(9700L, 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 310400L + "'", long2 == 310400L);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 17984320, 0, 61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(347545500, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 347545600 + "'", int2 == 347545600);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 10.0f, (java.lang.Object) (-296909));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-347545500), 37);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -347545500 * 37");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(56115, 959);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57074 + "'", int2 == 57074);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-86500L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-86500) + "'", int1 == (-86500));
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-12L), (long) (-336663));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 336651L + "'", long2 == 336651L);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-80449), 1439479930, 38693342, 588);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(319980239, 0, 22579200, (-27565200));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(107, (-443037), 0, 47164974);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46722045 + "'", int4 == 46722045);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1289464, (long) 107);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 137972648L + "'", long2 == 137972648L);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-3282031L), (long) 424);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3281607L) + "'", long2 == (-3281607L));
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(310400L, (long) (-100));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-31040000) + "'", int2 == (-31040000));
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-1315L), (long) 36835302);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-36836617L) + "'", long2 == (-36836617L));
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-101), 54);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5454) + "'", int2 == (-5454));
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-336663), 96000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -336663 * 96000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(764, 634880);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 635644 + "'", int2 == 635644);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(10L, (-7354L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-73540) + "'", int2 == (-73540));
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 1439480000, (long) (-73540));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1439553540L + "'", long2 == 1439553540L);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-520), 38693342, 0, (-80449));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-306424));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-306424) + "'", int1 == (-306424));
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) ' ', (-4240), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 7207137, (long) (-31040000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-23832863L) + "'", long2 == (-23832863L));
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-220620), 73);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16105260) + "'", int2 == (-16105260));
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-56115), (-6790), (-10240));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (-520), (-32296), 0);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-32296));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-32296) + "'", int1 == (-32296));
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 56212, (-32), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 56212 for  must be in the range [-32,-1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 56212, (-1135315), (-634880));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-444600), (java.lang.Object) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-3281607L), (long) 56115);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3225492L) + "'", long2 == (-3225492L));
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-2), (java.lang.Object) (-1041L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-14), (-54));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-68) + "'", int2 == (-68));
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 30169L, (java.lang.Object) (-30158L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(22579200, (-285));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 22579200 * -285");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(1460, (-3200));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4672000) + "'", int2 == (-4672000));
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) '#', (-56115), (-306424), (-73540));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-288965) + "'", int4 == (-288965));
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(814L, (-444600));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-361904400L) + "'", long2 == (-361904400L));
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1144), (-31059), 887);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 56115, (-70));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3928050L) + "'", long2 == (-3928050L));
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1439479930, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(114399, 884, 63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) (byte) 10, (-73540), (-3200));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-70331) + "'", int3 == (-70331));
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-2880), 940);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1940) + "'", int2 == (-1940));
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(38700L, (long) (-1135315));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -43936690500");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 347545600, 9118000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 356663600L + "'", long2 == 356663600L);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(634880L, (long) 1289464);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-654584L) + "'", long2 == (-654584L));
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-220620), (long) 855);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-219765L) + "'", long2 == (-219765L));
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-361904400L), (java.lang.Object) 943L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2182L), (-894096000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1950917472000L + "'", long2 == 1950917472000L);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 324966389, (long) (-73540));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 324892849L + "'", long2 == 324892849L);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1041L), (long) (-424));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1465L) + "'", long2 == (-1465L));
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(47164974, 90151);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 47255125 + "'", int2 == 47255125);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 10865750, (-27564308L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-16698558L) + "'", long2 == (-16698558L));
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 30, (long) 333);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9990L + "'", long2 == 9990L);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(96000, 87, (-64306528));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(1213099200L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1213099200 + "'", int1 == 1213099200);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) 285L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1), (int) ' ', 47164974);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 47164942 + "'", int3 == 47164942);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1110L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1940), (-33950));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-35890) + "'", int2 == (-35890));
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1439480000, (-1260), (-296909));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1477, 884, (-444600));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 370);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-28933L), (-361904400L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 10470980005200");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(46722045);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-46722045) + "'", int1 == (-46722045));
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 17984320);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 17984320 + "'", int1 == 17984320);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (int) '#', 319980239, 1439480000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hi! must be in the range [319980239,1439480000]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 320, 30);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9600L + "'", long2 == 9600L);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 356663600L, (java.lang.Object) (-776769210));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-296909), (long) (-64306528));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 19093186921952L + "'", long2 == 19093186921952L);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(64);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-64) + "'", int1 == (-64));
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1903616L, (long) (-3395000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6462776320000L) + "'", long2 == (-6462776320000L));
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(38838800, 865);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 38838800 * 865");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(385L, (long) 31045);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 31430L + "'", long2 == 31430L);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-370), 635644);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 635274 + "'", int2 == 635274);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 0, 52, (-894096000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for  must be in the range [52,-894096000]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-6462776320000L), (java.lang.Object) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-32) + "'", int1 == (-32));
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 52, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-46722045), 3395000, (-1000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 972, (-520), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 972 for hi! must be in the range [-520,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(36835302, (-443037), 1460);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-58032) + "'", int3 == (-58032));
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 424, 333, 959);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(38839085L, 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 388390850L + "'", long2 == 388390850L);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 435386, 11L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 435375L + "'", long2 == 435375L);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1478318762L, (java.lang.Object) 30169L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 61, (long) 1289464);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 78657304 + "'", int2 == 78657304);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-64306528), (long) 347545614);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-411852142L) + "'", long2 == (-411852142L));
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(940, 32, 10865750);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 940 + "'", int3 == 940);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 324966389, (-33950), 635644);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-424));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 424 + "'", int1 == 424);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 30, (-306424), (-58032));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-10), 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-640) + "'", int2 == (-640));
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1110L), (java.lang.Object) 10240);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-194), 1439479992);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1439479798 + "'", int2 == 1439479798);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-2516), (-4240), 1418764);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-2182L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2182) + "'", int1 == (-2182));
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 80449, 20, (-1940));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 80449 for hi! must be in the range [20,-1940]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(210490000L, (-30L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -6314700000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(60837102, (-100));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60837002 + "'", int2 == 60837002);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-113535L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-113535) + "'", int1 == (-113535));
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-336663), (-6790));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -336663 * -6790");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-894096000), 319980239, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) 5400L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(435386, 33950);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 435386 * 33950");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, (long) (-44303700));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 44303700L + "'", long2 == 44303700L);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(314507200, (-2880));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 314504320 + "'", int2 == 314504320);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-16105260), 520, 940, (-336663));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, (-10239367648L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-1000), 18, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1000 for hi! must be in the range [18,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-776769210), (-194), 0, (-63612100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 9700, (-970), (-101));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, 347545600, 0, (int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 16 + "'", int4 == 16);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(143351147072L, 594L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 143351146478L + "'", long2 == 143351146478L);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 347545614, (-930));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-323217421020L) + "'", long2 == (-323217421020L));
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-2880), (java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(9600L, 347545614);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3336437894400L + "'", long2 == 3336437894400L);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-959L), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-95900L) + "'", long2 == (-95900L));
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1418764, 33940);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1452704 + "'", int2 == 1452704);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-70), (java.lang.Object) (-4672000));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1135315), (-6462776320000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6462775184685L + "'", long2 == 6462775184685L);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-370), 114400, (-22464800));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -370 for  must be in the range [114400,-22464800]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 17984320, (long) (-16105260));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 34089580L + "'", long2 == 34089580L);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1439480000, (java.lang.Object) (-1135315));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(764, (-16105260));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16104496) + "'", int2 == (-16104496));
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-56212), 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(356663600L, (long) (-930));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -331697148000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 1418764);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1418764 + "'", int1 == 1418764);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-63612100), (long) 855);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -54388345500");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 38693342, 865, 314504320);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(764, (-11), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-4) + "'", int3 == (-4));
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-2880), 9700);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-27936000) + "'", int2 == (-27936000));
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-35) + "'", int1 == (-35));
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-2880), 1439479930, 38693342, (-58032));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1000), (long) 78657304);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-78657304000L) + "'", long2 == (-78657304000L));
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-370), (-2182), 347545614);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 314504320, (-7354L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2312864769280L) + "'", long2 == (-2312864769280L));
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-68), (-64));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4352 + "'", int2 == 4352);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 370, (java.lang.Object) 49920L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-16104496), 26288);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -16104496 * 26288");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 887, (-640), 11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 887 for  must be in the range [-640,11]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(10865750, (-27565200), (-1260));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-16698191) + "'", int3 == (-16698191));
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (byte) 1, 64, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(435375L, 1174118400L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1173683025L) + "'", long2 == (-1173683025L));
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(855, 930);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1785 + "'", int2 == 1785);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-219765L), (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-219665L) + "'", long2 == (-219665L));
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 347545500, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 347545501L + "'", long2 == 347545501L);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 959, (java.lang.Object) (-35L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 56212, (long) 320);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 56532L + "'", long2 == 56532L);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (short) -1, 320);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-320L) + "'", long2 == (-320L));
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 1, (long) (-5178600));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5178599L) + "'", long2 == (-5178599L));
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-16105260), 454, 7207137);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5514792 + "'", int4 == 5514792);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 97, (long) 764);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74108 + "'", int2 == 74108);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 347545500, (long) (-296909));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-103189386859500L) + "'", long2 == (-103189386859500L));
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1460, 143351146478L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 209292673857880L + "'", long2 == 209292673857880L);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 972, 892L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1864L + "'", long2 == 1864L);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(18, 7207137);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 129728466 + "'", int2 == 129728466);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(114864751, 1439479992);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1554344743 + "'", int2 == 1554344743);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 3395000, (-96L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-325920000) + "'", int2 == (-325920000));
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 1289464, (-63612100), (-930));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1289464 for hi! must be in the range [-63612100,-930]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) (short) 10, (-10240), 80449);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, (-113535));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 63);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 63 + "'", int1 == 63);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-2132L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2132) + "'", int1 == (-2132));
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(73, 33950);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34023 + "'", int2 == 34023);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-220620), (long) (-3454393));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3233773L + "'", long2 == 3233773L);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1144), 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (byte) 0, (java.lang.Object) 694);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-634880), (long) (-11));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-634891L) + "'", long2 == (-634891L));
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 635644, 26853925, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(12211200, 31059, (-16105260));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 347545600, (-444600), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 884, (long) 87);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 971L + "'", long2 == 971L);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-894096000), 210490000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1104586000L) + "'", long2 == (-1104586000L));
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(356663600L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-356663600L) + "'", long2 == (-356663600L));
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1041L), (java.lang.Object) 10L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (byte) 100, (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 959, 129300, 74108);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(17984320, 0, (-31059), (-70));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-20870) + "'", int4 == (-20870));
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-44303700), 38839085L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-83142785L) + "'", long2 == (-83142785L));
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(10240, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10240 + "'", int2 == 10240);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-60837102), (-940), 46722045);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -60837102 for hi! must be in the range [-940,46722045]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-5454), (-2), 31045);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -5454 for hi! must be in the range [-2,31045]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-306424), (-101), 855);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 773 + "'", int3 == 773);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-970), 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9700) + "'", int2 == (-9700));
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-356663600L), 1439479798);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-513410046881952800L) + "'", long2 == (-513410046881952800L));
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-4240));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-4240) + "'", int1 == (-4240));
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-23832863L), (long) 884);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-23833747L) + "'", long2 == (-23833747L));
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-5454), (-3395000), (-44303700));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 19093186921952L, (java.lang.Object) (-325920000));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 33940, 7418, 7207137);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 635274, (-2182), 34023);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(892L, (long) (-2));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1784L) + "'", long2 == (-1784L));
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(943L, 33940);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32005420L + "'", long2 == 32005420L);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(26853925);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-26853925) + "'", int1 == (-26853925));
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 26114, (long) 347545600);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 347571714L + "'", long2 == 347571714L);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, (long) (-101));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-101L) + "'", long2 == (-101L));
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 930, (-10240), (-3395000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-32296));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32296 + "'", int1 == 32296);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-32), 959, (-4672000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, (int) '#', 114399);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-347545500), (long) (-930));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-347544570L) + "'", long2 == (-347544570L));
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-44303700), 1439479992, (-2182));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-2182L), (long) 47255125);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -103110682750");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(324966389, (-520));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 324966389 * -520");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-10240));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10240 + "'", int1 == 10240);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 764, (-54L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-41256L) + "'", long2 == (-41256L));
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-2), 764);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 855, (long) (-68));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 923L + "'", long2 == 923L);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(97, 1418764);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 137620108 + "'", int2 == 137620108);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (byte) 100, 16, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 620, (-113535), 60837102);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-64306528));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-64306528) + "'", int1 == (-64306528));
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(56222, (-481388400));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 56222 * -481388400");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(14, 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-27564308L), (long) (-32));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 882057856 + "'", int2 == 882057856);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1104586000L), (java.lang.Object) (-56212));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(114866500, (-64));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 114866436 + "'", int2 == 114866436);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-10) + "'", int1 == (-10));
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 972, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 972 for  must be in the range [0,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(182694L, 385L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 182309L + "'", long2 == 182309L);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(37, 773);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28601 + "'", int2 == 28601);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(107, 424);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 531 + "'", int2 == 531);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-95900L), (long) (-22464800));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2154374320000L + "'", long2 == 2154374320000L);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-9700), (-2182), (-54));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1184) + "'", int3 == (-1184));
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(56201, 8557, 87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-16698191), (java.lang.Object) (-113535));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) ' ', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 940, 143351147072L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-143351146132L) + "'", long2 == (-143351146132L));
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1439479992, 370);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1439480362 + "'", int2 == 1439480362);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-58032), 9700, (-68));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-481388400), (java.lang.Object) 32296);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-60837102), (long) (-640));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-60836462L) + "'", long2 == (-60836462L));
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(62, (-634880), 970);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 62 + "'", int3 == 62);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1439479992, 74108);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1439554100 + "'", int2 == 1439554100);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(865, 17984320);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 865 * 17984320");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 12211200, 333, 22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 12211200 for hi! must be in the range [333,22]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(319980239, 867, (-296836));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, (long) 47164942);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 47164942L + "'", long2 == 47164942L);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1144, (java.lang.Object) 3235200L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-56115), (long) (-520));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-56635L) + "'", long2 == (-56635L));
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(11, (-22464800));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-247112800) + "'", int2 == (-247112800));
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(38838800);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-38838800) + "'", int1 == (-38838800));
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) 634880L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1289464, (-3313090));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1289464 * -3313090");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1000), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-347545500), 11, (int) (short) 10, (-443037));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 60837002);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60837002 + "'", int1 == 60837002);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 56222, 1144L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 55078L + "'", long2 == 55078L);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 129728466);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(31045, 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31109 + "'", int2 == 31109);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (byte) 1, (long) 60837102);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60837102L + "'", long2 == 60837102L);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1439553540L, 87);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 125241157980L + "'", long2 == 125241157980L);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 959, (java.lang.Object) 310450);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-64306528));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(336651L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 336651 + "'", int1 == 336651);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(1144L, (-31115L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32259L + "'", long2 == 32259L);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 10865750, (-17451040380L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -189618642008985000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-285), 52, (-27936000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -285 for  must be in the range [52,-27936000]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) '4', (-100));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-48) + "'", int2 == (-48));
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 6462775184685L, (java.lang.Object) 520);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(4352, (-86500));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-376448000) + "'", int2 == (-376448000));
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-970), (int) (byte) 0, (int) (byte) -1, 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-2516), 1439479992, 454);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) ' ', (-34L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1088) + "'", int2 == (-1088));
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-347545500), 588, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-16698558L), (-86500L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-16612058L) + "'", long2 == (-16612058L));
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, 1950917472000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1950917472000L + "'", long2 == 1950917472000L);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(970, 38693342, 867, (-16104496));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, (long) (-3361938));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3361938L + "'", long2 == 3361938L);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(2205);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2205) + "'", int1 == (-2205));
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-6760L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 959, (long) (-1088));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1043392L) + "'", long2 == (-1043392L));
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 1213099200, (long) (-776769210));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -942298107235632000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 56115, 1144, 347545500);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 74108, 325080789L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 24091087111212L + "'", long2 == 24091087111212L);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(28601);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-28601) + "'", int1 == (-28601));
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 64, (long) (-64306528));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 64306592L + "'", long2 == 64306592L);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1439479930, 114400, (-2182));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 14, 319980239, (-9700));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(867, (-86500), (-54), 62);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-31040000), 347489423, (-16698191), (-574));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-805319) + "'", int4 == (-805319));
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-5454), 35, 8557);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-30158L), (-2205));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 66498390L + "'", long2 == 66498390L);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-940), (long) (-32));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-908L) + "'", long2 == (-908L));
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (int) '4', (-2205), 26288);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-347545500), (-14));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-347545514) + "'", int2 == (-347545514));
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(660994L, 6462775184685L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6462774523691L) + "'", long2 == (-6462774523691L));
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) (-1465L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-101), 347545614);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 347545513 + "'", int2 == 347545513);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(54, 56115);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 56169 + "'", int2 == 56169);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(30, (-5454), 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-5453) + "'", int3 == (-5453));
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1088), (long) 47255125);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-47256213L) + "'", long2 == (-47256213L));
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 7207137, (java.lang.Object) 1439479798);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, 773, (int) (short) 1, (-56212));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(20, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-194), (int) (short) 0, 1460);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-2182), (-2880), (-70));
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-520), 0, 1439479930);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(8557, (-58032), 12211200, (-58032));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(385L, (long) (-285));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-109725L) + "'", long2 == (-109725L));
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-56115L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-56115) + "'", int1 == (-56115));
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-56212), (-1000), 74108);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18897 + "'", int3 == 18897);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-5454));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-5454) + "'", int1 == (-5454));
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-444600), 319980239, 18897);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -444600 for hi! must be in the range [319980239,18897]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-894096000), 7418, 531);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -894096000 for  must be in the range [7418,531]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 31059, (-220620), (-70));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-640), (java.lang.Object) (-35));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 100, (-31040000), 10240);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-61308900L), (long) 17984320);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-43324580L) + "'", long2 == (-43324580L));
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-347545500), (-3200), 524);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 3395000, (-654584L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -2222312680000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1418764, 129300, 336651);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 174652 + "'", int3 == 174652);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(210490000L, (-17451040380L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -3673269489586200000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-2132));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2132) + "'", int1 == (-2132));
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-970), 129300, 1785);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -970 for  must be in the range [129300,1785]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(24091087111212L, (long) (-16105260));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 24091103216472L + "'", long2 == 24091103216472L);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-336663), (-12390400L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 12053737L + "'", long2 == 12053737L);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(31109);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-31109) + "'", int1 == (-31109));
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-296909), 60837002, 1439479930, (-27936000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-444600), 60837102, 26114);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 531, (long) (-33950));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-18027450) + "'", int2 == (-18027450));
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, (-34L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-34L) + "'", long2 == (-34L));
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-520), 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(588, (-2205));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1617) + "'", int2 == (-1617));
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-44303700), (int) (short) 10, 347545614);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 303241905 + "'", int3 == 303241905);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 520, 1, 8557);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (short) -1, (long) 114866500);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-114866500L) + "'", long2 == (-114866500L));
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(18, (-347545514), (-60837102));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-286708395) + "'", int3 == (-286708395));
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(971L, 594L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1565L + "'", long2 == 1565L);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-113535), 32296);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -113535 * 32296");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-60836462L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-60836462) + "'", int1 == (-60836462));
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-93887530880L), 33950);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3187481673376000L) + "'", long2 == (-3187481673376000L));
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(18, (-194), (-31059));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(11, (-247112800));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-247112789) + "'", int2 == (-247112789));
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-10), (-20870));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-20880) + "'", int2 == (-20880));
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-11), (-2132), 0);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-6314699476L), (java.lang.Object) 24091103216472L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(867, 18897);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16383699 + "'", int2 == 16383699);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(356663600L, (long) (-32));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-11413235200L) + "'", long2 == (-11413235200L));
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1135350), 694, (-1135350));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-2182), (long) (-2132));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4652024L + "'", long2 == 4652024L);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-14), 431, (-32));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 36835302, 28601, (-100));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 36835302 for hi! must be in the range [28601,-100]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (short) 0, 347545614, (-894096000), 303241905);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-849792292) + "'", int4 == (-849792292));
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-60836462), 1439479992);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1378643530 + "'", int2 == 1378643530);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(347545500, 30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 347545530 + "'", int2 == 347545530);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 87, (-56115), 90151);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (int) (byte) 10, 1439479798);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1439479789 + "'", int3 == 1439479789);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-634880), 47164974, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(370, (-101));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 269 + "'", int2 == 269);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-101), (long) (-4672000));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 471872000 + "'", int2 == 471872000);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(47164942, 74108);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 47239050 + "'", int2 == 47239050);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(424, (-2516), (-247112789));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 285, (java.lang.Object) 325080789L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 21);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 471872000, 1857L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 876266304000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-80449), 37, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(56532L, (-2182));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-123352824L) + "'", long2 == (-123352824L));
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-247112789), 0, 7207137);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-109725L), (-1784L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-107941L) + "'", long2 == (-107941L));
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, 336651, 285);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(38838800, 31045, (-68), (-6790));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-16698191), 310450);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16387741) + "'", int2 == (-16387741));
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-5178600), (-12390400L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 64164925440000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) '4', 324966389, 347545600);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 338688232 + "'", int3 == 338688232);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(56201, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-56201) + "'", int2 == (-56201));
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-634880), 7207137);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6572257 + "'", int2 == 6572257);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1439479789, 61);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1439479789 * 61");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-20870));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20870 + "'", int1 == 20870);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-2132), (long) 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-206804) + "'", int2 == (-206804));
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 319980239, (java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-4));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-4) + "'", int1 == (-4));
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-54), (long) (-56212));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 56158L + "'", long2 == 56158L);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 370);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 370 + "'", int1 == 370);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 347545614, (-513410046881952800L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 347545614 * -513410046881952800");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(2154374320000L, (long) (-20870));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2154374299130L + "'", long2 == 2154374299130L);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(333, (-10240), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-10008) + "'", int3 == (-10008));
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 174652, 90151, (-1940));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(114399);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-114399) + "'", int1 == (-114399));
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(370, 28601);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10582370 + "'", int2 == 10582370);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(62, 620, (-101), (-56212));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-14), 31109, 129728466);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 855, (-826L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1681L + "'", long2 == 1681L);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 129300, 47164974, 114399);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 129300 for hi! must be in the range [47164974,114399]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 347489423, (long) 31059);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10792673988957L + "'", long2 == 10792673988957L);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-56115L), (long) 96000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -5387040000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-411852142L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-411852142) + "'", int1 == (-411852142));
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-31040000), (long) 14);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-434560000L) + "'", long2 == (-434560000L));
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(32259L, (long) 62);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32197L + "'", long2 == 32197L);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1452704);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1452704) + "'", int1 == (-1452704));
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1), 182694L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-182694L) + "'", long2 == (-182694L));
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(114864751, (-68));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 114864683 + "'", int2 == 114864683);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(36835302);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-36835302) + "'", int1 == (-36835302));
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1940));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1940 + "'", int1 == 1940);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 269);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 269 + "'", int1 == 269);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(620, 36835302, (-56201), (-4672000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 129300, (-60837102), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 56115, 0, 26114);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(28, (-574), 7418);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 28 + "'", int3 == 28);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) (short) 0, (-70331));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-70331) + "'", int2 == (-70331));
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1418764, (-1940), 14, (-64306528));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-3187481673376000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -3187481673376000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-411852142L), (long) 37);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -15238529254");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(324966389, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 324966389 * 35");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-27936000), (long) 435386);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-28371386L) + "'", long2 == (-28371386L));
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-16698191));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16698191 + "'", int1 == 16698191);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-2205), (-959L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3164L) + "'", long2 == (-3164L));
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(20, (-54), 635274, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 9L, (java.lang.Object) 9L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-64), 32296);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2066944L) + "'", long2 == (-2066944L));
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 20870, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2087000L + "'", long2 == 2087000L);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(57074, 129300, (-940));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(78657304, 174652, (-31059));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(96000, 60837102, 20, 21);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 435386, (-60837102), (-28601));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 435386 for  must be in the range [-60837102,-28601]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 336651, (-20880), (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 336651 for  must be in the range [-20880,32]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 80449, (-31059), 54);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 80449 for  must be in the range [-31059,54]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(620, 1477, (-370), 347545513);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2097 + "'", int4 == 2097);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-28601), (long) (-1088));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-27513L) + "'", long2 == (-27513L));
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(347489423, (int) 'a', (-5453), 930);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-4368) + "'", int4 == (-4368));
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-20870), (-6314700000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 131787789000000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (short) -1, 347545500);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-347545500L) + "'", long2 == (-347545500L));
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-2066944L), (java.lang.Object) (-43324580L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(20870, 10865750, (-3395000), 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2693424) + "'", int4 == (-2693424));
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 635644, (java.lang.Object) (-959L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(923L, (-3187481673376000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3187481673375077L) + "'", long2 == (-3187481673375077L));
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 96000, 11, 347489423);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 32296, 310450, 531);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(431, 887);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 382297 + "'", int2 == 382297);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(96000, (int) '#', 30, (-27565200));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 1439479992);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1439479992 + "'", int1 == 1439479992);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 100, 1439479962, (-54));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1439479992, (-867), 1439479930);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(28601, (int) (byte) 100, (-33950), 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-5250) + "'", int4 == (-5250));
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(10865750, 114866500, 0, 7418);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2457 + "'", int4 == 2457);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(319980239, (-54));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 319980239 * -54");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(32005420L, (-78657304000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-78625298580L) + "'", long2 == (-78625298580L));
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(923L, (long) (-1617));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1492491) + "'", int2 == (-1492491));
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(31045, 764, 0, 1289464);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31809 + "'", int4 == 31809);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 773, 34023, (-80449));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 33950, 1144, 520);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 33950 for  must be in the range [1144,520]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1144), 1289464, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1144 for  must be in the range [1289464,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-70), 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-31109), (java.lang.Object) 8650L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1492491), (-23832863L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22340372L + "'", long2 == 22340372L);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(884, 57074);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57958 + "'", int2 == 57958);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(6462775184685L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 6462775184685");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-2182));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2182 + "'", int1 == 2182);
    }
}

