import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1081L), (-5178600));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5598066600L + "'", long2 == 5598066600L);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(20870);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-20870) + "'", int1 == (-20870));
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-400L), (long) 930);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1330L) + "'", long2 == (-1330L));
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 324966389, (-1784L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -579740037976");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(96000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-96000) + "'", int1 == (-96000));
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(17687484L, (long) (-22468000));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -397402390512000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-776769210), (-296822), 454);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-86500), 1785, (-640));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -86500 for hi! must be in the range [1785,-640]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1110L), (java.lang.Object) (-9940));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 32296, 22464800, 1477);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 887, (-247112789), 14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1132), (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1134) + "'", int2 == (-1134));
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-19032), (java.lang.Object) 10240);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(31809, (-113535), (-38838800), (-35890));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-81726) + "'", int4 == (-81726));
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-9940), 285, 7207137);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-325069098L), (java.lang.Object) (-1784L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-34146766368L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -34146766368");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-776769210L), 1950917472000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1951694241210L) + "'", long2 == (-1951694241210L));
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 62, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(356663600L, (long) (-28601));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 356692201L + "'", long2 == 356692201L);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 60837102L, (java.lang.Object) 57958);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-16387741), 1439479962, (-336663), 47239050);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 43396515 + "'", int4 == 43396515);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-296909), (java.lang.Object) 1144);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(356692201L, (-12390400L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 344301801L + "'", long2 == 344301801L);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 338688232, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 338688197L + "'", long2 == 338688197L);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-347204348), (-220746L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-346983602L) + "'", long2 == (-346983602L));
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-411851622));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 411851622 + "'", int1 == 411851622);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 970, 17984320, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-60837102), (-70));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-60837172) + "'", int2 == (-60837172));
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1093820), (-27564308L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 30150391376560");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(247112789, 1253244863);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 247112789 * 1253244863");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1465L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1465L) + "'", long2 == (-1465L));
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(53078820, 1827, 7207137, (-3313090));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-703310L), (long) (-220620));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 155164252200");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(174652, 129728466);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 174652 * 129728466");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-86500), (long) 74108);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -6410342000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-2516), 62, (-4672000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-60836462), 278399375, 1378643530, (-113535));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-16612058L), 57958);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-962801657564L) + "'", long2 == (-962801657564L));
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-306072));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 306072 + "'", int1 == 306072);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-634880), 1860, (-2182));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-20), 47164942, (-16698191));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1253244863, 1554344743);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1253244863 * 1554344743");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(324892849L, 634880L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 206267971973120L + "'", long2 == 206267971973120L);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(694, 47239050, 15886);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-12211200), 53078884, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -12211200 for  must be in the range [53078884,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-61552), (-16698191));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16759743) + "'", int2 == (-16759743));
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 26853925, 15886, (-886762));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26853925 for hi! must be in the range [15886,-886762]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-33950), (java.lang.Object) 350001);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-70), (-2182), 114399);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-2205), 3832);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8449560) + "'", int2 == (-8449560));
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(60837102, 56115, (-46722045), (-96000));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-32358875) + "'", int4 == (-32358875));
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(930);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-930) + "'", int1 == (-930));
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-9940), (-33950));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 337463000 + "'", int2 == 337463000);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-626357487203L), 49867738725L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -626357487203 * 49867738725");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1784L), (java.lang.Object) 6572257);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-894096000), (long) 114400);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-894210400L) + "'", long2 == (-894210400L));
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 16698191, 444964L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 7430093860124");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-32358875), (long) (-5178600));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-27180275L) + "'", long2 == (-27180275L));
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-30158L), (long) (-126191885));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3805694867830L + "'", long2 == 3805694867830L);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(114866500, (-101));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 114866399 + "'", int2 == 114866399);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-56212), 620);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-34851440L) + "'", long2 == (-34851440L));
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((int) (short) -1, 2068);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2067 + "'", int2 == 2067);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-2182), 32296, (-296909), 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-266796) + "'", int4 == (-266796));
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-2693424), (-80449), (-16759743));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1792343851020L), (long) 2205);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -3952118191499100");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-27565200), 31809);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -27565200 * 31809");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-10000), (-56201));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 562010000 + "'", int2 == 562010000);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1554344743, 60837102);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1554344743 * 60837102");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(42228L, 197L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8318916 + "'", int2 == 8318916);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-3454332), 27565200, 42228);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(347545600);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-347545600) + "'", int1 == (-347545600));
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1950917472000L, (-1210L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1950917470790L + "'", long2 == 1950917470790L);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) 300);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-356663600L), (long) 22579200);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-379242800L) + "'", long2 == (-379242800L));
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1174118400, 56212, 8318916);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 814290 + "'", int3 == 814290);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 420608, (-1000), 2132);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 420608 for hi! must be in the range [-1000,2132]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-96715290087L), (long) 1439479798);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-98154769885L) + "'", long2 == (-98154769885L));
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(14, (-55584));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-778176) + "'", int2 == (-778176));
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (short) -1, (-56201), 3395000, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(620, (-2182), (-101), 531);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 337 + "'", int4 == 337);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(19093186921952L, (long) 1460);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 27876052906049920");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (int) (byte) 0, (-1), 10865750);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, 887, 635644);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 100, (-1617), 1477);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 347545600, 411851622, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-14252887), 182694L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-14070193L) + "'", long2 == (-14070193L));
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 2457, (-18027450), (-940));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(114866500L, (long) 6572257);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 121438757L + "'", long2 == 121438757L);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-10), (-63612100), 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 129728466, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 129728467L + "'", long2 == 129728467L);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 694);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 694 + "'", int1 == 694);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (short) 100, (-1110194), (-22));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1000), (-640));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 640000L + "'", long2 == 640000L);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(2205, 37, 865);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 547 + "'", int3 == 547);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-60836462), 0, (-1134));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -60836462 for hi! must be in the range [0,-1134]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-35));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-34851440L), (long) (-16383699));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-51235139L) + "'", long2 == (-51235139L));
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 74108, (-285), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(20, 1173511359, 31940548);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 37, (-12390400L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 12390437L + "'", long2 == 12390437L);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-4672000), 1418764, (-288965));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -4672000 for hi! must be in the range [1418764,-288965]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-41256L), 5514792);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-227518258752L) + "'", long2 == (-227518258752L));
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 9562019341500L, (java.lang.Object) 2132);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (short) 100, (long) (-635644));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 635744L + "'", long2 == 635744L);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 347545600, (java.lang.Object) 22340372L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(884);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-884) + "'", int1 == (-884));
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1088), (long) 46722045);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-46723133L) + "'", long2 == (-46723133L));
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-382297), 60837002);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-23257803353594L) + "'", long2 == (-23257803353594L));
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-114399), 27936000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -114399 * 27936000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(634880, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-3313090), 0, (-2182));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(114866399, 887, 882057856);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 114866399 + "'", int3 == 114866399);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(443037);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-443037) + "'", int1 == (-443037));
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 98 + "'", int2 == 98);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-98154769885L), (long) 38169);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -3746469411740565");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-31059), (-1838377));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1869436) + "'", int2 == (-1869436));
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(2154374304530L, (long) (-247095990));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 2154374304530 * -247095990");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-56222), 114400, (-11));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -56222 for  must be in the range [114400,-11]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 161662, (java.lang.Object) 1174117535L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-64), (int) (byte) -1, 31940548);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 74108, 588);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 43575504L + "'", long2 == 43575504L);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 37, (long) 319980239);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 11839268843");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, 350001);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 350001 + "'", int2 == 350001);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(336651, (-126191885), 46722985);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 336651 + "'", int3 == 336651);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 344301801L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-778176), (-1134));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-779310) + "'", int2 == (-779310));
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-635644), 2132, 161662);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2480 + "'", int4 == 2480);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 31809, (-61308900L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1950174800100");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(26288, 1378643530);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 26288 * 1378643530");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 454, (long) (-1093820));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-496594280L) + "'", long2 == (-496594280L));
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-930), 887L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1817L) + "'", long2 == (-1817L));
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-247095990), 31059, 26288);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -247095990 for hi! must be in the range [31059,26288]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1617), 940, 884);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-336663));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 336663 + "'", int1 == 336663);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-2182), (long) (-70));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 152740L + "'", long2 == 152740L);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(634880L, (long) 1378643530);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 875273204326400");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(53407747068L, 865);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 46197701213820L + "'", long2 == 46197701213820L);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-70), (long) 118612725);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8302890750L) + "'", long2 == (-8302890750L));
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(10865750, 32296);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 10865750 * 32296");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1135350), (-54000));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1135350 * -54000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-3282031L), (long) 26288);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -86278030928");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-93368965L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-93368965) + "'", int1 == (-93368965));
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-20), 773, (-22464800));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 5454, (long) (-849792292));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4634767160568L) + "'", long2 == (-4634767160568L));
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1079597460, (-46722045), 53078820);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-18212066) + "'", int3 == (-18212066));
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1253244863, (-1869436), 47239050);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 25532688 + "'", int3 == 25532688);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-819096961781208L), (-1315L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-819096961782523L) + "'", long2 == (-819096961782523L));
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (byte) 1, 89654L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 89655L + "'", long2 == 89655L);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-56201));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 56201 + "'", int1 == 56201);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-247112789), (-288965));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-247401754) + "'", int2 == (-247401754));
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(74108);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-74108) + "'", int1 == (-74108));
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-27513L), (-435286L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-462799L) + "'", long2 == (-462799L));
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-886762), 388390850L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-389277612L) + "'", long2 == (-389277612L));
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-31045));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 31045 + "'", int1 == 31045);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1940), 411851622, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1940 for  must be in the range [411851622,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(58115043, 2132, (-1617));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (short) 1, 887L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 887 + "'", int2 == 887);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-574), (-318748167337600000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -574 * -318748167337600000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, 1439554110);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1439554110 + "'", int2 == 1439554110);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-46722045));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1268302), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-285), (-376448000), 57074, 31940548);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6153415 + "'", int4 == 6153415);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 314504320, (-347544570L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-33040250L) + "'", long2 == (-33040250L));
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-16759743), (-114399));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16874142) + "'", int2 == (-16874142));
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1418764), (-306072));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1724836) + "'", int2 == (-1724836));
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, 1940);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1940 + "'", int2 == 1940);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-19032), (-347545602L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-347564634L) + "'", long2 == (-347564634L));
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(53407747068L, (-320));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-17090479061760L) + "'", long2 == (-17090479061760L));
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 61, (-9700), (-26853925));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-635274), 129300);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -635274 * 129300");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-55584), (-884), 370, (-16874142));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 347489423, (-336663), 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 347489423 for  must be in the range [-336663,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(47164942, (-247401754));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-200236812) + "'", int2 == (-200236812));
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-370), (-411852142));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-411852512) + "'", int2 == (-411852512));
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-2516), 114866436);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 114863920 + "'", int2 == 114863920);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(356663600L, (long) (-411851622));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-146892482168359200L) + "'", long2 == (-146892482168359200L));
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(105896632812400L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 105896632812400");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(5514792);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-5514792) + "'", int1 == (-5514792));
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(347545501L, (-20));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6950910020L) + "'", long2 == (-6950910020L));
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 635644, 5514792, 1173511369);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 635644 for hi! must be in the range [5514792,1173511369]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-3395000), 114400, (-31045), 107);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-9535) + "'", int4 == (-9535));
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(107);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-107) + "'", int1 == (-107));
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-80449), (long) 61);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4907389L) + "'", long2 == (-4907389L));
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-2516), (-776769210));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-776771726) + "'", int2 == (-776771726));
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-247401754), (-635274), (-32296));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -247401754 for  must be in the range [-635274,-32296]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1439479992, 338688232);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1778168224 + "'", int2 == 1778168224);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(347459333L, 1478318762L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 513655651005905746L + "'", long2 == 513655651005905746L);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (int) ' ', 11, 2132);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-1526778L), 41773993546320000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-41773993547846778L) + "'", long2 == (-41773993547846778L));
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-129728466), (long) 347545614);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-477274080L) + "'", long2 == (-477274080L));
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-306836L), 44046);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-13514898456L) + "'", long2 == (-13514898456L));
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-849792292), (java.lang.Object) 10.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 882057856, (java.lang.Object) (-444600));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-38838800));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 38838800 + "'", int1 == 38838800);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 314507200, 22579200, 86951);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(2182, 620, (-930));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-22464800), 87, 42680, (-14));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(347542029L, 3336437894400L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3336090352371L) + "'", long2 == (-3336090352371L));
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-31040000), (-19));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 589760000 + "'", int2 == 589760000);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-7392017746529402592L), (java.lang.Object) 121438757L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 12211200, 26288);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 321008025600L + "'", long2 == 321008025600L);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(129671487, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-4634767160568L), 940);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4356681130933920L) + "'", long2 == (-4356681130933920L));
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-6950910020L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -6950910020");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-14070193L), (-143351146132L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 143337075939L + "'", long2 == 143337075939L);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-347545600), (-3361938), 1253244863);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 247112789, (long) (-347204348));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-100091559L) + "'", long2 == (-100091559L));
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-640), (-14), (-61552));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-347545514), 0, (-1144));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-1104586000L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1104586000) + "'", int1 == (-1104586000));
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(382297, 57958, (-266796), 269);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-93877) + "'", int4 == (-93877));
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(2154374320000L, 210490000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 2154374320000 * 210490000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-5453), 16383699);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16378246 + "'", int2 == 16378246);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-60837102), 443037);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-26953087158774L) + "'", long2 == (-26953087158774L));
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-306836), (long) (-347204348));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-347511184L) + "'", long2 == (-347511184L));
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(21845384600L, (-2796338522272174L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 21845384600 * -2796338522272174");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 12, (java.lang.Object) (-85));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-58032), (-481388400));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-481446432) + "'", int2 == (-481446432));
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-306424), 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-60837172), (long) (-35890));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 2183446103080");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 19);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 19 + "'", int1 == 19);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-626357487203L), (long) (-81726));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 51189691999152378");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) '#', 350001, 7418, (-481446432));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 940, (-1940), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-6273L), (-641L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6914L) + "'", long2 == (-6914L));
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(64291334L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64291334 + "'", int1 == 64291334);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-32L), 385L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 353L + "'", long2 == 353L);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-30116L), (long) 174652);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -5259819632");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1173683025L), (java.lang.Object) 183559L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-14), 1460, 10865750);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10864277 + "'", int3 == 10864277);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-779310), 97, (-14), 74108);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36140 + "'", int4 == 36140);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1000));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-4368), (java.lang.Object) 1072445216219121888L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 40683, (java.lang.Object) 56201L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(22579200, (-635644), 46722045, (-1617));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-46722045), (java.lang.Object) (-48));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1043392L), 6327901449496L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -6602481749192530432");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-68), 336663, (-58032));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -68 for hi! must be in the range [336663,-58032]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-3454393), 174652);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-603316646236L) + "'", long2 == (-603316646236L));
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(52, (-240663), (-27565200));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 0.0f, (java.lang.Object) (-3454332));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2273L), (long) (-1452704));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3301996192L + "'", long2 == 3301996192L);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 294328428, (long) (-2516));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 294330944L + "'", long2 == 294330944L);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1439479962, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 54, 31059, 855);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54 for hi! must be in the range [31059,855]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, (-411852142L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 269, (long) (-54000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 54269L + "'", long2 == 54269L);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-182000L), 1439554100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-261998846200000L) + "'", long2 == (-261998846200000L));
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-73540), 1860);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-71680) + "'", int2 == (-71680));
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-146892482168359200L), 121438757L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-146892482289797957L) + "'", long2 == (-146892482289797957L));
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(970, 814290, 0, (-53077751));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 129300, 1439479930);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 186124754949000L + "'", long2 == 186124754949000L);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 57074, (long) (-32358875));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1846850431750");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-247112789), 56222);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-247056567) + "'", int2 == (-247056567));
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 56201, (long) 14);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 786814L + "'", long2 == 786814L);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-247401754), 2067, 531);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-96000), (-46722045), (-9535));
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-306424), (-31045), 27565200);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(96194L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 96194 + "'", int1 == 96194);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) (short) 10, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (int) (byte) 1, (-5180732));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 562010000, 10814L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6077576140000L + "'", long2 == 6077576140000L);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-473292750));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 473292750 + "'", int1 == 473292750);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-462799L), (-31059));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 14374074141L + "'", long2 == 14374074141L);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 97, (-5180732), (-4672000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hi! must be in the range [-5180732,-4672000]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-143351146132L), obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-336663));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-336663) + "'", int1 == (-336663));
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-3454332), (long) 114864683);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-118319015L) + "'", long2 == (-118319015L));
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-4672000), 7207137);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -4672000 * 7207137");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-884));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-884) + "'", int1 == (-884));
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 89654L, (java.lang.Object) 1439479930);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-9700));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9700 + "'", int1 == 9700);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(114399, (-634880));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 114399 * -634880");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-86500), (-28601), (-107), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-77) + "'", int4 == (-77));
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-3313090), 60837002);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -3313090 * 60837002");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(114400, 2457, 589760000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 114400 + "'", int3 == 114400);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-10008), (-1000), 867);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(33762960L, 867);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 29272486320L + "'", long2 == 29272486320L);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-819096961782523L), (long) 36835302);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -819096961782523 * 36835302");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-87), (-1784L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 155208L + "'", long2 == 155208L);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(56201, (-1940));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 54261 + "'", int2 == 54261);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 7207137, 0, 324966389);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-6774708780L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -6774708780");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 16);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-320), (int) '4', (-481446432), 435386);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-268) + "'", int4 == (-268));
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 1173511359, (long) 764);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 896562678276");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-60836462), 431, (-779310));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-35), 129728466);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4540496310L) + "'", long2 == (-4540496310L));
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-20291873649540L), (long) 8557);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-20291873640983L) + "'", long2 == (-20291873640983L));
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1681, 638436378);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1681 * 638436378");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-26853925), 114866399);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 88012474 + "'", int2 == 88012474);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 10864277, 97, 10582370);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-219665L), (long) 3832);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-223497L) + "'", long2 == (-223497L));
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 2087000L, (java.lang.Object) 1824);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 338688232, (-6314700000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -2138714578610400000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-13514898456L), (java.lang.Object) 1144);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1827, 107, (-1289464));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(37, (-520));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-19240) + "'", int2 == (-19240));
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 336651, (-635274), 443);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 336651 for  must be in the range [-635274,443]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 382297, 471872000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 180395249984000L + "'", long2 == 180395249984000L);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 2182);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2182 + "'", int1 == 2182);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-86500), (-109725L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 23225L + "'", long2 == 23225L);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-2182), (-520));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1134640 + "'", int2 == 1134640);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 9700, 388390850L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 388400550L + "'", long2 == 388400550L);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 28, (-10000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-9972L) + "'", long2 == (-9972L));
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 46722045, (-47256213L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -2207906910315585");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-894096000), (java.lang.Object) 1439479798);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1184), 25344907671L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-30008370682464L) + "'", long2 == (-30008370682464L));
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 86951, (long) (-1110194));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1023243L) + "'", long2 == (-1023243L));
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 10864277, 1860, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10864277 for hi! must be in the range [1860,100]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-8449560), (-347204348));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-355653908) + "'", int2 == (-355653908));
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-283022820298000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -283022820298000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-220746L), (-634891L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 140149648686L + "'", long2 == 140149648686L);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(137972648L, (-20880));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2880868890240L) + "'", long2 == (-2880868890240L));
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-101), 1173511359, (-481446432));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -101 for hi! must be in the range [1173511359,-481446432]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(12211200, 7207137);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 12211200 * 7207137");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-481446432), (long) 56115);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-481502547L) + "'", long2 == (-481502547L));
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-5180732), (-32), 38838800);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 33658101 + "'", int3 == 33658101);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 3805694867830L, (java.lang.Object) (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 55078L, (java.lang.Object) 64306592L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-60836462), (-5178600), (-411851622));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1144, 22579200, 8318916);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(34023, 16383699, 773, 31045);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9756 + "'", int4 == 9756);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 40683, 443037, (-1260));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 33950, (long) 1439480362);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1439514312L + "'", long2 == 1439514312L);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1439479798, 2480);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1439479798 * 2480");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 60837002, 93000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5657841186000L + "'", long2 == 5657841186000L);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 943, 14824903584L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 14824904527L + "'", long2 == 14824904527L);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1260), (-48), (-16104496));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-307949251L), (java.lang.Object) (-22464799L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1043392L), 891308);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-929983636736L) + "'", long2 == (-929983636736L));
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-1256976000), (-12211200), 33940);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-7971618) + "'", int4 == (-7971618));
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(103, 694);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 797 + "'", int2 == 797);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(28655206263452L, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 286552062634520");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(26114, 54261);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 80375 + "'", int2 == 80375);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(32, 42228);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1351296 + "'", int2 == 1351296);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(56212, 96194, (-20880));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(44303700L, (long) (-5178600));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 49482300L + "'", long2 == 49482300L);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-100), (-56115), 12211200);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-100) + "'", int3 == (-100));
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (byte) 10, 294328442, (int) (byte) 10, (-411851622));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1135315), (-411852512), (-2132), 27936000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6084168 + "'", int4 == 6084168);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 12, (-93877), (int) '4');
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 970, (-60837102), 306072);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-3361938), 96000, (-113535));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -3361938 for  must be in the range [96000,-113535]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-886762), (long) 22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-19508764) + "'", int2 == (-19508764));
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(347545513, (-46722045));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 347545513 * -46722045");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(24091103216472L, (long) 16);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 24091103216456L + "'", long2 == 24091103216456L);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-325920000), 0, (-411851622));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -325920000 for  must be in the range [0,-411851622]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(64306592L, (-47256213L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 17050379L + "'", long2 == 17050379L);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-296909), 38838800, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1827, (-19032), (-1093820));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 22464800, 437L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 9817117600");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-143351146132L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -143351146132");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 174652, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 174652L + "'", long2 == 174652L);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-306072), (-2132));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 652545504L + "'", long2 == 652545504L);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-81726), 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-980712) + "'", int2 == (-980712));
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-347545514), 21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -347545514 * 21");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 589760000, 28627459);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 16883330219840000L + "'", long2 == 16883330219840000L);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(943);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-943) + "'", int1 == (-943));
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-81726), (-970), (-473292750), (-1869436));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-471506011) + "'", int4 == (-471506011));
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(635274, (-93877), 1418764);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 635274 + "'", int3 == 635274);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-64), (-96000));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6144000 + "'", int2 == 6144000);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 9756, (-32), 773);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 943, 33940, 3832);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-2205), 1173511359, 5789836);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-146892482168359200L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -146892482168359200");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-4540496310L), 513655651005905746L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -4540496310 * 513655651005905746");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 96194, (-247112789), (-194));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 21162);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21162 + "'", int1 == 21162);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-3282031L), 303241905);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-995249332709055L) + "'", long2 == (-995249332709055L));
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-411852142), (-60836462L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 25055627186401604");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1093820), 30);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-32814600L) + "'", long2 == (-32814600L));
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-959L), (long) (-2693424));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 2582993616");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(635744L, (long) (-2205));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1401815520) + "'", int2 == (-1401815520));
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1439553540L, (long) (-60836462));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-87577344233175480L) + "'", long2 == (-87577344233175480L));
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 174652L, (java.lang.Object) (-219665L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-61552), 1134640);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-69839361280L) + "'", long2 == (-69839361280L));
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(325417452L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 325417452 + "'", int1 == 325417452);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (byte) 1, 35, 25532688, (-411851622));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(52, (-1492491), 300, (-20880));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 290033);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 290033 + "'", int1 == 290033);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-16874142), 43396515, 887);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(867, 114864751);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 867 * 114864751");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 54, (long) 1452704);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 78446016 + "'", int2 == 78446016);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-266796), 1174118400, (-85), 5789836);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4287360 + "'", int4 == 4287360);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(420608, 337, (-370));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 471872000, (long) 36835302);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 17381547625344000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(16383699, (-12211200));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 16383699 * -12211200");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 38693342);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 38693342 + "'", int1 == 38693342);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-227518258752L), (long) (-126191885));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -227518258752 * -126191885");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-940), (long) 8318916);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8317976L + "'", long2 == 8317976L);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 2132, 0, (-778176));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-200236812), 635644, 589760000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(64, (-2205));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-141120) + "'", int2 == (-141120));
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(26114, 336651);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 26114 * 336651");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-86500L), (-3454332));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 298799718000L + "'", long2 == 298799718000L);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-9535), 0, (-296909));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 33658101, (-46722045), 547);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1260), 882057856);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1260 * 882057856");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-247095990), 9700);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2396831103000L) + "'", long2 == (-2396831103000L));
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-411852512), 10240, (-1134));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1554344743, (java.lang.Object) 38839085L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-980712), (-347545514));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-348526226) + "'", int2 == (-348526226));
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 6153415);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1784L), (java.lang.Object) 54269L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) (byte) 0, 1785, 2182);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(129300, 107);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 129407 + "'", int2 == 129407);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(32005420L, (-6273L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -200769999660");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(64420927L, (-296836));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-19122450286972L) + "'", long2 == (-19122450286972L));
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, (-44303700), 1460);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, 62, 5514792);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-288965), 589760000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 589471035 + "'", int2 == 589471035);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-56115), (-336663));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 290033, (-182694L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 107339L + "'", long2 == 107339L);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-32358875), 882057856, (-424), 865);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 491 + "'", int4 == 491);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, (long) (-54000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 54000L + "'", long2 == 54000L);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 27565200, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2756520000L + "'", long2 == 2756520000L);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(22L, 6327901449496L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 139213831888912L + "'", long2 == 139213831888912L);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(41773993546320000L, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 47239050, (-44303700), 96194);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 47239050 for  must be in the range [-44303700,96194]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (int) (short) 100, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 15886, (-411852142L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-411836256L) + "'", long2 == (-411836256L));
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-114399), (-35), 6153415);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-16105260), 38838800, 161662);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 520, (-424), 294328442);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-779310), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-779310L) + "'", long2 == (-779310L));
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-355653908), (long) 53078820);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-18877689765028560L) + "'", long2 == (-18877689765028560L));
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-268), (-1260), 98, (-27936000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1174118400);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1174118400) + "'", int1 == (-1174118400));
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-34L), (long) (-31059));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 31025L + "'", long2 == 31025L);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(74108, (-56222), 0, (-59344612));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(56212);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-56212) + "'", int1 == (-56212));
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-634891L), (-819096961782523L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -634891 * -819096961782523");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 635644, (long) (-31059));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-19742466996L) + "'", long2 == (-19742466996L));
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1253244863, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-348526226), (java.lang.Object) 114864650);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 2068, (java.lang.Object) 137972648L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-85));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 85 + "'", int1 == 85);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-30116L), 7418);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-223400488L) + "'", long2 == (-223400488L));
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(60837102L, 9990L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 607762648980");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(10, 36140);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 361400 + "'", int2 == 361400);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(42680, (-96000), 2068, 694);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-60836462), (long) (-376448000));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 22901764446976000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 347545530, (-19), 1378643530);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(1950917470790L, (long) (-306072));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -597121212119636880");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, (long) (-64306528));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 64306528L + "'", long2 == 64306528L);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-227518258752L), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-227518258752L) + "'", long2 == (-227518258752L));
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-320), (-6273L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2007360L + "'", long2 == 2007360L);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-20870), (-19508764));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -20870 * -19508764");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-100), (long) (-16387741));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 16387641L + "'", long2 == 16387641L);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-18212066), 361400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-17850666) + "'", int2 == (-17850666));
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 278141647, (-3501), 27565200);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 278141647 for  must be in the range [-3501,27565200]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, 1439480362, 38169, (-14252887));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1260), (java.lang.Object) (-2066944));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(338688232, (-3313090));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 338688232 * -3313090");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-634880), (-35210L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-670090L) + "'", long2 == (-670090L));
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(971L, (long) 290033);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 281622043L + "'", long2 == 281622043L);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) (short) 1, 26114, 370);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(12053737L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12053737 + "'", int1 == 12053737);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 382297, (-53078820), 31809);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(10, 114866500);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 114866510 + "'", int2 == 114866510);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(56158L, (-5454));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-306285732L) + "'", long2 == (-306285732L));
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 473292750, 622926900821581376L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-622926900348288626L) + "'", long2 == (-622926900348288626L));
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(38700L, 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 1439554100, (-182000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1439736100L + "'", long2 == 1439736100L);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(347545614, (-68));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 347545546 + "'", int2 == 347545546);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-18212066), (long) 10865750);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-197887756139500L) + "'", long2 == (-197887756139500L));
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1), 2182);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2182L) + "'", long2 == (-2182L));
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(12053737, 1439480362);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 12053737 * 1439480362");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-2066944), 47164942);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 45097998 + "'", int2 == 45097998);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-32296), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 3395000, (java.lang.Object) 42680);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(353L, 31025L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 31378L + "'", long2 == 31378L);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-12211200));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 26114, (long) (-325920000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-325893886L) + "'", long2 == (-325893886L));
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-95900L), (long) 16698191);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 16602291L + "'", long2 == 16602291L);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-19508764), (java.lang.Object) 114864683);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(55078L, (-2066944));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-113843141632L) + "'", long2 == (-113843141632L));
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-266796));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 266796 + "'", int1 == 266796);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-54), 867);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 813 + "'", int2 == 813);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 1460);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-19240), (-46723133L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 46703893L + "'", long2 == 46703893L);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 32296, (long) 114864650);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 114896946L + "'", long2 == 114896946L);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-26953087158774L), (java.lang.Object) 524);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 17984320, (long) 1439480362);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1421496042L) + "'", long2 == (-1421496042L));
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(8557);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-8557) + "'", int1 == (-8557));
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1079597460, (-86500), 31109);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1079597460 for  must be in the range [-86500,31109]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 'a', (java.lang.Object) 60837102);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-2), 6084168, 491);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1134640, 882057856, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 336651L, (java.lang.Object) 303241905);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 9756, 8557, 337463000);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) '4', 31L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1612L + "'", long2 == 1612L);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 333, (-73540), 12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-1526778L), 22L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1526800L) + "'", long2 == (-1526800L));
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1135315), (java.lang.Object) (-3282031L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-1452704), (-884), 26853925);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1452704 for hi! must be in the range [-884,26853925]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1000, (-10000), 12053737);
    }
}

