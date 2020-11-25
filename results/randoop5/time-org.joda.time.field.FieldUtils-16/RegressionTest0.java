import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) 'a', (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) 'a', (int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) (byte) 10, 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) '4', 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) '#', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 350L + "'", long2 == 350L);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (int) '4', 0, (int) '4');
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (int) (short) 1, (int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1 for hi! must be in the range [100,100]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (short) 10, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (short) 100, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 197L + "'", long2 == 197L);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 520 + "'", int2 == 520);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (int) (short) 0, (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for  must be in the range [1,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (short) 100, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 0, 520, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for  must be in the range [520,35]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, 0, (int) '4', 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (byte) 100, 1, (int) (short) 100);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (short) -1, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 31L + "'", long2 == 31L);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (byte) 1, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (byte) -1, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (int) (byte) 1, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1 for hi! must be in the range [0,-1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-10) + "'", int1 == (-10));
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(1L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-10), (int) ' ', 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1), (java.lang.Object) (-1L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 100, (java.lang.Object) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(10, 100, 520);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 431 + "'", int3 == 431);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) ' ', (int) (short) 0, (int) ' ');
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1L), (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (int) (short) 1, (int) (short) 0, (int) 'a');
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (short) 100, (int) (byte) 100, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (short) 1, 520, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) '4', 0, 431);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 52, 22);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1144L + "'", long2 == 1144L);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-10), (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-970) + "'", int2 == (-970));
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (byte) 1, 520, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) '4', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 62 + "'", int2 == 62);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-10));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) '#', 350L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 385L + "'", long2 == 385L);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(22, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1144 + "'", int2 == 1144);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 22, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-30L) + "'", long2 == (-30L));
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(350L, (long) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33950 + "'", int2 == 33950);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (byte) 0, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) ' ', (long) 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1664 + "'", int2 == 1664);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (byte) 10, (int) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 350L + "'", long2 == 350L);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1, (int) (byte) -1, (int) 'a', 520);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 424 + "'", int4 == 424);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(385L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 285L + "'", long2 == 285L);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 100, (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hi! must be in the range [32,35]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1), 33950, 33950);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-30L), (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22L + "'", long2 == 22L);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 424, (java.lang.Object) (-970));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1, 33950, 33950);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) ' ', 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 22, (int) (byte) 100, 1144);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 22 for  must be in the range [100,1144]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 1664, 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1664 for hi! must be in the range [10,97]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) '4', (-970), 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-930) + "'", int3 == (-930));
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(100L, (-1L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-100) + "'", int2 == (-100));
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) ' ', (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1144, 1144, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 0, (-970), 1144);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 11, (long) (-970));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-959L) + "'", long2 == (-959L));
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (short) -1, (int) (byte) 100, (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1664, (int) '4', (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 54 + "'", int3 == 54);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(100L, (long) 33950);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3395000 + "'", int2 == 3395000);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-100), (int) ' ', 22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 3395000, 431, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(424, 3395000, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (byte) 1, (java.lang.Object) 52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1L), (-970));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 970L + "'", long2 == 970L);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (byte) 10, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9L + "'", long2 == 9L);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 22);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22 + "'", int1 == 22);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(431, 424);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 855 + "'", int2 == 855);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) 'a', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(431, 54, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(855, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 865 + "'", int2 == 865);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(33950, (-970), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-70) + "'", int3 == (-70));
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 62, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (byte) 100, 0, (-970));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) '4', 11, (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (byte) 1, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-96L) + "'", long2 == (-96L));
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(33950, (-100), 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-100) + "'", int1 == (-100));
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (byte) 100, 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9700L + "'", long2 == 9700L);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 54, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54 for  must be in the range [10,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1L, 865);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 865L + "'", long2 == 865L);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (int) 'a', 0, 32);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hi! must be in the range [0,32]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (byte) 1, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-34L) + "'", long2 == (-34L));
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 424, (long) 3395000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1439480000 + "'", int2 == 1439480000);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(10, (int) (byte) 10, (int) (short) -1, 855);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(54, 10, 54, 1439480000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 865);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 865 + "'", int1 == 865);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-10), (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(1L, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(970L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 970 + "'", int1 == 970);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1), (int) (short) 100, 62, 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 63 + "'", int4 == 63);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) '#', (long) 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2205 + "'", int2 == 2205);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (short) 1, 54, (int) '4', (-970));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (short) 10, (long) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 320 + "'", int2 == 320);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (int) '4', 11, 320);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) '#', (int) (short) -1, (-930));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1144L, 1664);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1903616L + "'", long2 == 1903616L);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(63, 1439480000, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 11, 22, 1664);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 11 for hi! must be in the range [22,1664]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 11, 54);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 594L + "'", long2 == 594L);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-930), 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-867) + "'", int2 == (-867));
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 431);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 431 + "'", int1 == 431);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (short) 1, (java.lang.Object) 594L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 855, 1439480000, (-970));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (int) '4', 431, 11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hi! must be in the range [431,11]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 22, (-70), 1664);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-70), 865, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-100), 20, 320, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) ' ', (long) 320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10240 + "'", int2 == 10240);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) (byte) 1, 2205);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2205 + "'", int2 == 2205);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(100, 1144);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 114400 + "'", int2 == 114400);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 100, (java.lang.Object) 1439480000);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) (short) 1, (int) (short) 100, 431);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 333 + "'", int3 == 333);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (int) (short) 1, 20, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1 for hi! must be in the range [20,10]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-70), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) (short) 10, 0, (-970));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (short) 100, (long) (-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1000) + "'", int2 == (-1000));
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 10240, (long) 2205);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22579200 + "'", int2 == 22579200);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(52, 33950, 970, 30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(114400, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 114399 + "'", int2 == 114399);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(865L, (long) 114400);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-113535L) + "'", long2 == (-113535L));
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-70), 431, 10, 63);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 37 + "'", int4 == 37);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 32, 1903616L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1903648L + "'", long2 == 1903648L);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 2205, 20, 1664);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2205 for  must be in the range [20,1664]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(10, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 107 + "'", int2 == 107);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 520, 114400, 2205);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) (short) 0, 10240);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-10), (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 87 + "'", int2 == 87);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(2205, 1144, 10240);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2205 + "'", int3 == 2205);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 114399, 0, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 114399 for  must be in the range [0,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(33950, (-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33940 + "'", int2 == 33940);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(33940, (int) (byte) 1, 2205, (-70));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) '4', (long) 22579200);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1174118400L + "'", long2 == 1174118400L);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(3395000, (int) (short) 1, (-1000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(855, (-1000), 22579200);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 855 + "'", int3 == 855);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (int) (byte) -1, 63, (-100));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hi! must be in the range [63,-100]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-930), (-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-940) + "'", int2 == (-940));
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 87, (long) 64);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 23L + "'", long2 == 23L);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(33950);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-33950) + "'", int1 == (-33950));
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(10240, 33940);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 347545600 + "'", int2 == 347545600);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 320, (java.lang.Object) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(520);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-520) + "'", int1 == (-520));
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-96L), (java.lang.Object) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) '4', (java.lang.Object) (-100));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(63, 10240, (-70));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-33950));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 33950 + "'", int1 == 33950);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, (-70));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-70) + "'", int2 == (-70));
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 865, 22L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 887L + "'", long2 == 887L);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(22L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 23L + "'", long2 == 23L);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(333, 0, 62);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 37, (int) (byte) -1, 87);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-100), 1664, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 970, 0, 33950);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 30);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 30 + "'", int1 == 30);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 424, 333, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 424 for  must be in the range [333,32]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-940));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 940 + "'", int1 == 940);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (short) 0, (-10), (int) (byte) -1, 1439480000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1439479992 + "'", int4 == 1439479992);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 33940, (int) (short) 100, 347545600);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(855, 33950, 431);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 18);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 18 + "'", int1 == 18);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-10), (-30L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 300 + "'", int2 == 300);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-30L), 37);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1110L) + "'", long2 == (-1110L));
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) (byte) -1, 855, (-970));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) (short) 0, 33940);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33940 + "'", int2 == 33940);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(300, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 300 + "'", int2 == 300);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 520, 855, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-1110L), 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1210L) + "'", long2 == (-1210L));
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 63, (long) 1144);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1081L) + "'", long2 == (-1081L));
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-33950), 1, 114400);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -33950 for  must be in the range [1,114400]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 52, (-1081L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-56212) + "'", int2 == (-56212));
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-56212));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 56212 + "'", int1 == 56212);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(350L, (long) (-520));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-182000L) + "'", long2 == (-182000L));
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(333, 114399, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (byte) 10, (-113535L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1135350) + "'", int2 == (-1135350));
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 970, 887L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1857L + "'", long2 == 1857L);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 114400, (long) 22579200);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-22464800L) + "'", long2 == (-22464800L));
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) (short) 100, (-10), 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 37 + "'", int3 == 37);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 2205, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (short) -1, 33950, 424, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 10.0f, (java.lang.Object) 350L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 62, 3395000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 210490000L + "'", long2 == 210490000L);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 18, 56212, 300);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 18 for hi! must be in the range [56212,300]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1144, 347545600, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 18, (int) (short) -1, (int) (short) 100);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-959L), (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1011L) + "'", long2 == (-1011L));
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) '#', 3395000, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (short) 10, 865);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8650L + "'", long2 == 8650L);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-10), 320, 114399);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(56212, (int) (byte) 10, 1439480000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 56212 + "'", int3 == 56212);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 347545600, 37, 54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(520, (-940), 63, 63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1664, (-970));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 694 + "'", int2 == 694);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (short) -1, 20, (-520));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(887L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 887 + "'", int1 == 887);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 100, 33940, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hi! must be in the range [33940,35]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 20, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 20L + "'", long2 == 20L);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 37, (long) 855);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 892L + "'", long2 == 892L);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 350L, (java.lang.Object) 385L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-33950), 1439479992, 64);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -33950 for hi! must be in the range [1439479992,64]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(20, 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1210L), 10240);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-12390400L) + "'", long2 == (-12390400L));
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-520), (java.lang.Object) 694);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (int) (byte) 100, 20, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for  must be in the range [20,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) 'a', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 970 + "'", int2 == 970);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 22579200);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22579200 + "'", int1 == 22579200);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1135350), (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1135315L) + "'", long2 == (-1135315L));
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 107);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 107 + "'", int1 == 107);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, (-867), 33940);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (byte) 10, (long) (-1000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-10000L) + "'", long2 == (-10000L));
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(63, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 73 + "'", int2 == 73);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 865, (int) (byte) 0, 3395000);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-1135315L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1135315) + "'", int1 == (-1135315));
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(887L, (long) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31045 + "'", int2 == 31045);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(100L, (long) 54);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5400L + "'", long2 == 5400L);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-520), 855);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-444600) + "'", int2 == (-444600));
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(37, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 370 + "'", int2 == 370);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1000), 31045, 22579200);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 31045, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 310450L + "'", long2 == 310450L);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-867), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 30, 0, (-1135350));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 30 for  must be in the range [0,-1135350]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 694, (-182000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 182694L + "'", long2 == 182694L);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-959L), 5400L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5178600) + "'", int2 == (-5178600));
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(22, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1144, (java.lang.Object) 73);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-70), 18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1260) + "'", int2 == (-1260));
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 320);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 320 + "'", int1 == 320);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1174118400L, 1903616L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1176022016L + "'", long2 == 1176022016L);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, 1664, (-444600), 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-443037) + "'", int4 == (-443037));
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-100) + "'", int1 == (-100));
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1, (java.lang.Object) 182694L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 30, 1439479992, (-1260));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(100L, (long) (-1135315));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1135415L + "'", long2 == 1135415L);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 31045, (int) '4', 22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-930), 385L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1315L) + "'", long2 == (-1315L));
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-100), (long) 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3200) + "'", int2 == (-3200));
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(54);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-54) + "'", int1 == (-54));
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-3200), (-1011L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3235200L + "'", long2 == 3235200L);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 37, (long) 970);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-933L) + "'", long2 == (-933L));
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(8650L, (-10));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-86500L) + "'", long2 == (-86500L));
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(385L, (-22464800L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -8648948000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(320, 33940, 940, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-100), 347545600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 347545500 + "'", int2 == 347545500);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(892L, 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 892L + "'", long2 == 892L);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) '4', 694, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-5178600), 10240, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) (-444600));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) (short) -1, (-100));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-101) + "'", int2 == (-101));
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-10), (long) (-443037));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 443027L + "'", long2 == 443027L);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1315L), (long) 22579200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -29691648000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, (long) 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 33940, (java.lang.Object) 31L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(182694L, (long) 865);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 183559L + "'", long2 == 183559L);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-96L), (-520));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 49920L + "'", long2 == 49920L);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-930), 3395000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -930 * 3395000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 62, (long) (-444600));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-27565200) + "'", int2 == (-27565200));
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-867), 63, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, (long) 431);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) (byte) 0, 940, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(370);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-370) + "'", int1 == (-370));
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(10, 62);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 620 + "'", int2 == 620);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 97, (int) (short) 1, (-1135350));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hi! must be in the range [1,-1135350]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-70), (long) 31045);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-31115L) + "'", long2 == (-31115L));
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 300, 0, 370);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1011L), (long) 333);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-336663) + "'", int2 == (-336663));
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(855, (-867), 22579200, 347545600);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 324966389 + "'", int4 == 324966389);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 300, 0, (-3200));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(10, 56212);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 56222 + "'", int2 == 56222);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 107, (-100), 694);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(31045, 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 14 + "'", int3 == 14);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 107, 1144, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 107 for hi! must be in the range [1144,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 10, 0, (-56212));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-22464800L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-22464800) + "'", int1 == (-22464800));
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-22464800), (-22464800), (int) '#', 10240);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7418 + "'", int4 == 7418);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(9700L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9700 + "'", int1 == 9700);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 22579200, (java.lang.Object) 940);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 1144, (long) 33950);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 38838800 + "'", int2 == 38838800);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 0.0d, obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, 114399, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 855, 0, 431);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 855 for  must be in the range [0,431]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1439480000, (-70));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1439479930 + "'", int2 == 1439479930);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(31045, 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31059 + "'", int2 == 31059);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-1260), 347545600, 970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1260 for hi! must be in the range [347545600,970]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 32, 424, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(14);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-14) + "'", int1 == (-14));
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (short) 1, (java.lang.Object) 855);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-27565200), (int) (byte) 0, 62, 347545500);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 319980239 + "'", int4 == 319980239);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(23L, (long) 2205);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2182L) + "'", long2 == (-2182L));
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(310450L, (long) 370);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 114866500 + "'", int2 == 114866500);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(97, 1, 855);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-22464800L), (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-22464799L) + "'", long2 == (-22464799L));
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1135315), (int) (byte) 0, (-27565200));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(11);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-11) + "'", int1 == (-11));
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-867), (-5178600), (-33950));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(347545600, 333, 3395000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1289464 + "'", int3 == 1289464);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1144);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1144) + "'", int1 == (-1144));
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 54, (-1135350));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-61308900L) + "'", long2 == (-61308900L));
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(865, 22579200, (-5178600), 30);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-3313090) + "'", int4 == (-3313090));
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) (short) 10, 865, 887);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 884 + "'", int3 == 884);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-86500L), 182694L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 96194L + "'", long2 == 96194L);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 22, (long) 107);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 129L + "'", long2 == 129L);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(310450L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 310450 + "'", int1 == 310450);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(347545500, (-70), (int) '#', 38838800);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36835302 + "'", int4 == 36835302);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 424, (long) (-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4240) + "'", int2 == (-4240));
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 56212, (-1144));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-64306528L) + "'", long2 == (-64306528L));
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 197L, (java.lang.Object) (-22464800L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 865, (long) 31045);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26853925 + "'", int2 == 26853925);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(3395000, 36835302);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 3395000 * 36835302");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 31059, 14, 56222);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-22464800), 114400, (-1135350));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1135315), 0, 87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 61 + "'", int3 == 61);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) '#', 22, 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-370), (java.lang.Object) 33950);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(107, 865);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 972 + "'", int2 == 972);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) 'a', 20, 855);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 107, (-54), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-34L), 887);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-30158L) + "'", long2 == (-30158L));
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 64, (long) 7418);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7354L) + "'", long2 == (-7354L));
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(54, 1664, (-33950), 63);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-32296) + "'", int4 == (-32296));
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-56212), 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-56115) + "'", int2 == (-56115));
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(350L, (long) 31045);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10865750 + "'", int2 == 10865750);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 114399, (-64306528L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 64420927L + "'", long2 == 64420927L);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 114400, (long) 324966389);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 325080789L + "'", long2 == 325080789L);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-11), 970, 62, 347545500);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 959 + "'", int4 == 959);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 520);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 520 + "'", int1 == 520);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-27565200), (long) 319980239);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8820319284082800L) + "'", long2 == (-8820319284082800L));
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 87);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-27565200), 0, 940);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 454 + "'", int3 == 454);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(865, (-101));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 764 + "'", int2 == 764);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(325080789L, (long) (-336663));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 325417452L + "'", long2 == 325417452L);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1135350), (-56115), (-14));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-7354L), (-1081L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6273L) + "'", long2 == (-6273L));
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 33940, (java.lang.Object) 443027L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 3235200L, (java.lang.Object) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) ' ', 38838800, 61, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 30, 97, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 31059, (long) (-3313090));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3282031L) + "'", long2 == (-3282031L));
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 324966389, (java.lang.Object) (-336663));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(694, 0, 970);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 694 + "'", int3 == 694);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1664, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 73, (int) (byte) -1, (-22464800));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 73 for  must be in the range [-1,-22464800]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 87);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 87 + "'", int1 == 87);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(310450, (-1), (-4240), 1664);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2516) + "'", int4 == (-2516));
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1439480000, (-10), (-444600), (int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-306424) + "'", int4 == (-306424));
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-30L), 210490000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6314700000L) + "'", long2 == (-6314700000L));
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(56212, (-11));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 56201 + "'", int2 == 56201);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 385L, (java.lang.Object) 3395000);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 11, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11L + "'", long2 == 11L);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(454, (int) (byte) 1, 2205, 114866500);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 114864751 + "'", int4 == 114864751);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(97, (-70));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6790) + "'", int2 == (-6790));
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 38838800, (-970), 97);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 38838800 for  must be in the range [-970,97]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-56115), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-56115L) + "'", long2 == (-56115L));
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(431, 300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 129300 + "'", int2 == 129300);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(892L, (long) (-27565200));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-27564308L) + "'", long2 == (-27564308L));
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(9700L, 1903648L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 18465385600L + "'", long2 == 18465385600L);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(36835302, 31059, 855, 33940);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8557 + "'", int4 == 8557);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(114399, (-33950));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 80449 + "'", int2 == 80449);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-101), (long) (-940));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1041L) + "'", long2 == (-1041L));
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(1174118400L, 865L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1174117535L + "'", long2 == 1174117535L);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1135315L), (long) 56222);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-63829679930L) + "'", long2 == (-63829679930L));
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-336663), 324966389, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-32296), 10, 31059);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, 36835302);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36835302 + "'", int2 == 36835302);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 61, (long) 73);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-12L) + "'", long2 == (-12L));
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 865, 56212, 56201);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 865 for hi! must be in the range [56212,56201]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1439479930, 61, 320);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-14), (long) (-11));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 154L + "'", long2 == 154L);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(97, 620, 347545500, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(959, 454);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 435386 + "'", int2 == 435386);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 20, (-22464800), 56212);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-31115L), (-2182L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-28933L) + "'", long2 == (-28933L));
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 22L, (java.lang.Object) (-2182L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 56201, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 56201L + "'", long2 == 56201L);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-96L), (java.lang.Object) 3395000);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-520), (-54));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-574) + "'", int2 == (-574));
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-3313090), 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) 1857L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 0L, (java.lang.Object) 10865750);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(324966389, 0, 972);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 930 + "'", int3 == 930);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-3200), 320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2880) + "'", int2 == (-2880));
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 884, 319980239);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 282862531276L + "'", long2 == 282862531276L);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(887L, (long) (-27565200));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -24450332400");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-22464800), (-54));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1213099200L + "'", long2 == 1213099200L);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 370, 0, 54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1439479930, (-101), 36835302);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1439479930 for  must be in the range [-101,36835302]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1439479992, 694, (-32296));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(8557, 959, (-306424), 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-296909) + "'", int4 == (-296909));
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-2L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(129L, (long) 300);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 38700L + "'", long2 == 38700L);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 454, (-520), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 454 for hi! must be in the range [-520,-1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-64306528L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-64306528) + "'", int1 == (-64306528));
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-2L), (long) 347545600);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-347545602L) + "'", long2 == (-347545602L));
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-520), (-3313090), (-4240));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(73, (-296909));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-296836) + "'", int2 == (-296836));
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 38838800, (-520), 37);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 38838800 for  must be in the range [-520,37]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(347545500);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-347545500) + "'", int1 == (-347545500));
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(62, 424);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26288 + "'", int2 == 26288);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.lang.Object obj0 = new java.lang.Object();
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) (short) 1);
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) (short) 100, (-443037));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-44303700) + "'", int2 == (-44303700));
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 431, 300, (-4240));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-12390400L), (long) 1289464);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -15976974745600");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 54, (long) 454);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-400L) + "'", long2 == (-400L));
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-11), (int) (short) -1, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) (short) 1, (-101));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-101) + "'", int2 == (-101));
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(424, 100, (-14), 1439479992);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 524 + "'", int4 == 524);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 63, 56222, 87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 524, (-6314700000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6314699476L) + "'", long2 == (-6314699476L));
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 114400, 80449, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 10240, 62);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 634880L + "'", long2 == 634880L);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-4240), (-2880));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12211200 + "'", int2 == 12211200);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 26288, (-940), 129300);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-64306528), 1, 3395000, 114866500);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 47164974 + "'", int4 == 47164974);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-32296), (-306424), 347545500);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(10L, (-933L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 943L + "'", long2 == 943L);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-7354L), 8650L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-63612100) + "'", int2 == (-63612100));
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1439479992, (int) '4', 10865750, (-56212));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(33950, (-5178600), 47164974);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 33950 + "'", int3 == 33950);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-867));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 867 + "'", int1 == 867);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1289464, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1289464 + "'", int2 == 1289464);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(56201, 320);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17984320 + "'", int2 == 17984320);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 47164974, (-370));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-17451040380L) + "'", long2 == (-17451040380L));
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(325080789L, (long) (-2880));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-936232672320L) + "'", long2 == (-936232672320L));
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(11L, (-30158L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 30169L + "'", long2 == 30169L);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-2880), 1439479930, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -2880 for hi! must be in the range [1439479930,-1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(182694L, (long) 333);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60837102 + "'", int2 == 60837102);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(14, 347545600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 347545614 + "'", int2 == 347545614);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 30, (-7354L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-220620) + "'", int2 == (-220620));
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(31059);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-31059) + "'", int1 == (-31059));
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(972, 73, (-3313090), (-3313090));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-56115));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 56115 + "'", int1 == 56115);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 63, (-520), (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-33950), (long) (-1260));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-35210L) + "'", long2 == (-35210L));
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1135315), 129300, 17984320);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 37, 22);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 814L + "'", long2 == 814L);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(285L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 285 + "'", int1 == 285);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-296909), 10865750);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -296909 * 10865750");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(37, (-970), (-296836));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(60837102);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-60837102) + "'", int1 == (-60837102));
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-182000L), (long) 310450);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 128450L + "'", long2 == 128450L);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (-11), (-443037), 22);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 347545600, (int) (short) 10, 63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 114400);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 114400 + "'", int1 == 114400);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-64306528L), (java.lang.Object) 38838800);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-3200), 26853925, 324966389);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -3200 for hi! must be in the range [26853925,324966389]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 26288, 3235200L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 85046937600");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1210L), (java.lang.Object) 424);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 56201, 1439480000, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 56212);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 56212 + "'", int1 == 56212);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1439479992, 884, (-5178600), (-6790));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-3454393) + "'", int4 == (-3454393));
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (long) 300);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 764);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 764 + "'", int1 == 764);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-70), 61, 56212);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -70 for  must be in the range [61,56212]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(20, 73);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1460 + "'", int2 == 1460);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(634880L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 634880 + "'", int1 == 634880);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-64306528L), 1460);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-93887530880L) + "'", long2 == (-93887530880L));
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(1, 114400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 114400 + "'", int2 == 114400);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-27565200), (-7354L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 202714480800");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 100.0f, (java.lang.Object) 300);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) ' ', (-1L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-32) + "'", int2 == (-32));
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-6790), (long) 30);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6760L) + "'", long2 == (-6760L));
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(32, 1439479930);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1439479962 + "'", int2 == 1439479962);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(33950, 56201, 7418, 114866500);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 90151 + "'", int4 == 90151);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 0, (java.lang.Object) 182694L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(320, 300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 96000 + "'", int2 == 96000);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1289464, 129300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1418764 + "'", int2 == 1418764);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(285);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-285) + "'", int1 == (-285));
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 347545600, 14, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-32), 319980239);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-10239367648L) + "'", long2 == (-10239367648L));
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(285, 2205, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(310450, (-2880));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-894096000) + "'", int2 == (-894096000));
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-31059), 114400, 38838800);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 38693342 + "'", int3 == 38693342);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-370));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 370 + "'", int1 == 370);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-10239367648L), (-14));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 143351147072L + "'", long2 == 143351147072L);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(9700L, 940);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9118000L + "'", long2 == 9118000L);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(620, (-32));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 588 + "'", int2 == 588);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 35, 36835302, 970);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (int) (short) 10, (-2), (-27565200));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for hi! must be in the range [-2,-27565200]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }
}

