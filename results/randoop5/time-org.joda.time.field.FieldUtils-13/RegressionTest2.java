import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 773, 56201, (-3200));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 773 for  must be in the range [56201,-3200]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(87, (-296909), (-6790));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-290033) + "'", int3 == (-290033));
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(143351147072L, 31059);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4452343276909248L + "'", long2 == 4452343276909248L);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-574), 10582370, 56222);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-28371386L), 114400);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3245686558400L) + "'", long2 == (-3245686558400L));
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(87, 16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 103 + "'", int2 == 103);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-219765L), (-5178599L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1138074809235");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(2154374299130L, 5400L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2154374304530L + "'", long2 == 2154374304530L);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (int) '4', 37, 90151);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-443037));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 443037 + "'", int1 == 443037);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 22, (long) 1940);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 42680 + "'", int2 == 42680);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 62, 114866436, 972);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 62 for  must be in the range [114866436,972]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 74108, (-34L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 74074L + "'", long2 == 74074L);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 0, 887, (-3361938));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for  must be in the range [887,-3361938]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(74074L, 12053737L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 892868514538");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(10240, 12211200, 137620108, 1378643530);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1253244863 + "'", int4 == 1253244863);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-296836), (-10000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-306836L) + "'", long2 == (-306836L));
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-959L), (long) (-290033));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 278141647 + "'", int2 == 278141647);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(74108, 431);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31940548 + "'", int2 == 31940548);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 940, 350L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 590L + "'", long2 == 590L);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1460, (java.lang.Object) 634880L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(31059, 867, (-443037));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 370, 1135415L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 420103550L + "'", long2 == 420103550L);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1439554100, 382297, 47239050);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(10L, (long) 10582370);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-10582360L) + "'", long2 == (-10582360L));
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1000), (java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-347545514), 100, 174652, (-36835302));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-3454393), (long) (-1452704));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4907097L) + "'", long2 == (-4907097L));
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-32), 129300, 1, 18897);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15886 + "'", int4 == 15886);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-86500L), (long) 347545513);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 347459013L + "'", long2 == 347459013L);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-776769210), 333, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -776769210 for hi! must be in the range [333,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-3313090), 114864751);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 111551661 + "'", int2 == 111551661);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) 'a', 620, (-1617));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-5453), (long) 882057856);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4809861488768L) + "'", long2 == (-4809861488768L));
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-640), 16);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-10240L) + "'", long2 == (-10240L));
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-86500), 4352, (-44303700));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 7207137, (-940));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6774708780L) + "'", long2 == (-6774708780L));
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) (byte) 10, (-194));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1940) + "'", int2 == (-1940));
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 930, 47239050, (-1088));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 930 for hi! must be in the range [47239050,-1088]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(42680, (-805319), 443037, 33950);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 269, (java.lang.Object) 3395000);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(385L, (-320L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 705L + "'", long2 == 705L);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1940, 63);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 122220L + "'", long2 == 122220L);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1011L), 2154374320000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2178072437520000L) + "'", long2 == (-2178072437520000L));
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 38700L, (java.lang.Object) 31940548);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-63612100), 31109, 310450);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -63612100 for  must be in the range [31109,310450]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-11));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(47164942, 12211200, (-68));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-3200), 90151);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 86951 + "'", int2 == 86951);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(60837002, 0, 17984320, 114864751);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60837002 + "'", int4 == 60837002);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(940);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-940) + "'", int1 == (-940));
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-11), 114399, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-2178072437520000L), 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (int) (short) 1, (-18027450), (-930));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1 for hi! must be in the range [-18027450,-930]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 310450);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 310450 + "'", int1 == 310450);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(7418, 347545614);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 7418 * 347545614");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-296836), (long) 17984320);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 17687484L + "'", long2 == 17687484L);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, 588);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 588 + "'", int2 == 588);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1289464);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1289464) + "'", int1 == (-1289464));
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 114866500, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 114866500L + "'", long2 == 114866500L);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1465L), (-16698191));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 24462849815L + "'", long2 == 24462849815L);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-3187481673376000L), 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-318748167337600000L) + "'", long2 == (-318748167337600000L));
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) (byte) 0, 1554344743);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(3395000, (-1088), (-867), 26114);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21162 + "'", int4 == 21162);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 32, (-56115L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 56147L + "'", long2 == 56147L);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 31109, 887, 34023);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 278141647, (java.lang.Object) 61);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(347545600, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-306836L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-306836) + "'", int1 == (-306836));
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-5454));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5454 + "'", int1 == 5454);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(660994L, (long) 1439480362);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 951487882399828L + "'", long2 == 951487882399828L);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1378643530, 22);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 30330157660L + "'", long2 == 30330157660L);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 21162, 30169L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 638436378 + "'", int2 == 638436378);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-36835302), 61, 635274);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7110 + "'", int3 == 7110);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(16383699);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-16383699) + "'", int1 == (-16383699));
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 531, (-1000), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(31045);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-31045) + "'", int1 == (-31045));
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 21, (java.lang.Object) 57074);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 52, (java.lang.Object) 887L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 80449, 347545614, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 26288, 28601, 320);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 320, (-376448000), 73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(38693342, (-347545500));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-308852158) + "'", int2 == (-308852158));
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(143351146478L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 143351146478");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 100, 320, 520);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) (byte) 0, (-347545514), (-347545514));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(420103550L, 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 21845384600L + "'", long2 == 21845384600L);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(122220L, (-347545500));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-42477011010000L) + "'", long2 == (-42477011010000L));
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-20880), 47164974, 103);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-32296), 531, 26114);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -32296 for  must be in the range [531,26114]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1174117535L, (long) 22579200);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 26510634646272000L + "'", long2 == 26510634646272000L);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 635274, (-11413235200L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -7250531578444800");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 62, 6572257, 28601);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-930), 57074);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-53078820) + "'", int2 == (-53078820));
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-3454393), 61);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3454332) + "'", int2 == (-3454332));
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-46722045), (-894096000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 41773993546320000L + "'", long2 == 41773993546320000L);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 882057856, 24462849815L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 25344907671L + "'", long2 == 25344907671L);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(73, 0, 47255125);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 73 + "'", int3 == 73);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) (byte) 10, (-44303700), 56115, 338688232);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 294328428 + "'", int4 == 294328428);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-219665L), (-1081L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-220746L) + "'", long2 == (-220746L));
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 347545530, (long) 972);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 337814255160");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-640), (-2132L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2772L) + "'", long2 == (-2772L));
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 347545513, (java.lang.Object) 435375L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1135350), (long) 36835302);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-41820960125700L) + "'", long2 == (-41820960125700L));
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1439553540L, (java.lang.Object) 884);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) (byte) -1, 1253244863, 884);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 56212, (-520), 87);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 56212 for hi! must be in the range [-520,87]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(22579200, 57074, 0, 22);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 19 + "'", int4 == 19);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-930), 33950, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -930 for  must be in the range [33950,32]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-11), (long) (-31040000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-31040011L) + "'", long2 == (-31040011L));
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-47256213L), (-10582360L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 500082258202680");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-48), 2154374304530L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2154374304578L) + "'", long2 == (-2154374304578L));
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-2205), 2182, (-64306528));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 382297, (-53078820));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-20291873649540L) + "'", long2 == (-20291873649540L));
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(764, (-306836));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-306072) + "'", int2 == (-306072));
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-2880), (-20880), (-36835302));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 1554344743);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1554344743 + "'", int1 == 1554344743);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 97, 62, 694);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-411852142), (-35890));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-411888032) + "'", int2 == (-411888032));
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(4352, 1439479962);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1439484314 + "'", int2 == 1439484314);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-6790));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-6790) + "'", int1 == (-6790));
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-220746L), 310400L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 89654L + "'", long2 == 89654L);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 17984320, (int) (short) 100, (-64306528));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 17984320 for hi! must be in the range [100,-64306528]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-347545602L), (long) 74108);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -25755909473016");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 2097, 370, (-27936000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-36836617L), (java.lang.Object) (-1110L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-5178600), 12211200);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-63236920320000L) + "'", long2 == (-63236920320000L));
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(114866500, (-3313090), 61);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1093820) + "'", int3 == (-1093820));
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-107941L), 865);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-93368965L) + "'", long2 == (-93368965L));
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 4352, (long) 57958);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 62310L + "'", long2 == 62310L);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 1439479930, (long) 882057856);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1269704580810830080");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-64), 38838800, (-1617));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 930, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 93000L + "'", long2 == 93000L);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-194), (-3454332), 96000);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1378643530, 0, (-930));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-60836462L), (long) 137620108);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8372320470777896L) + "'", long2 == (-8372320470777896L));
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-38838800), (-101), 638436378);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-31059), 33950, (-26853925));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-80449), (-6774708780L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6774628331L + "'", long2 == 6774628331L);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1439554100, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1439554110 + "'", int2 == 1439554110);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-3313090), 0, 31940548);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 28627459 + "'", int4 == 28627459);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(347545530, (-16698191));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 347545530 * -16698191");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1492491), (-35210L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 52550608110");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(294328428, 1664, (-48), (-10));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-22) + "'", int4 == (-22));
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, (-23833747L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 1439484314);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1439484314 + "'", int1 == 1439484314);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-5178600), (-2132));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5180732) + "'", int2 == (-5180732));
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-54), 2205, 63);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -54 for  must be in the range [2205,63]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(19093186921952L, 56169);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1072445216219121888L + "'", long2 == 1072445216219121888L);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(21162, 38693342, (-247112800), (-1492491));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-206905806) + "'", int4 == (-206905806));
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1135315), 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-220620), 940, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -220620 for hi! must be in the range [940,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 114864751, 61, (-73540));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1439480000, (-347545500));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1439480000 * -347545500");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-16612058L), (java.lang.Object) 6572257);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-22464800), (-3200));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-22468000) + "'", int2 == (-22468000));
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (byte) 100, 347459013L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 34745901300");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1.0f), (java.lang.Object) (-11));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(867, (-4368));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3501) + "'", int2 == (-3501));
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-520), (-14), 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -520 for hi! must be in the range [-14,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) ' ', 17984320, 1439554100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-31040000), (long) 1554344743);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1523304743L + "'", long2 == 1523304743L);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1492491), 382297);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1110194) + "'", int2 == (-1110194));
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 107, (-908L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-97156) + "'", int2 == (-97156));
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(38838800, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 38838810 + "'", int2 == 38838810);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-32));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-5453), (long) 114864751);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-626357487203L) + "'", long2 == (-626357487203L));
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(443037, 60837102, 1439479992, 129300);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-2066944L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2066944) + "'", int1 == (-2066944));
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(635274);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-635274) + "'", int1 == (-635274));
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 47239050, 1664, 1785);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 47239050 for  must be in the range [1664,1785]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-930), (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1860 + "'", int2 == 1860);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, (-4672000), 278141647);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-60837102), (-1492491));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-59344612) + "'", int3 == (-59344612));
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-376448000), (long) (-46722045));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 17588420396160000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-32296), (java.lang.Object) (-626357487203L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(129728466);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-129728466) + "'", int1 == (-129728466));
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 310400L, (java.lang.Object) 52L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(9118000L, (-31040011L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-283022820298000L) + "'", long2 == (-283022820298000L));
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(1174118400L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1174118400 + "'", int1 == 1174118400);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-31040000), 20870);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-647804800000L) + "'", long2 == (-647804800000L));
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-2066944), (int) (byte) 10, 431);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 12 + "'", int3 == 12);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-12390400L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-12390400) + "'", int1 == (-12390400));
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(3361938L, (long) 15886);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 53407747068L + "'", long2 == 53407747068L);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-64), (-6790), 103);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-247112789), 114399, 31109, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1439479992, (-370));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1439479992 * -370");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1452704), 74074L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1526778L) + "'", long2 == (-1526778L));
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-53078820));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 53078820 + "'", int1 == 53078820);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 319980239, (long) (-12390400));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -3964683153305600");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(24091087111212L, (long) 635644);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 24091086475568L + "'", long2 == 24091086475568L);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 634880);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 634880 + "'", int1 == 634880);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 114864751, (-23832863L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2737555874112113L) + "'", long2 == (-2737555874112113L));
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-70331), (-56201));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-126532) + "'", int2 == (-126532));
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-59344612), (long) 56115);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-59288497L) + "'", long2 == (-59288497L));
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(103, 114864683, 285, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-2205), 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-114660L) + "'", long2 == (-114660L));
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1940, (-520), (-12390400));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-56201), 31045, 1785, 1860);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1824 + "'", int4 == 1824);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-10240), 300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9940) + "'", int2 == (-9940));
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-376448000), (java.lang.Object) (-908L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(310450L, (long) (-640));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-198688000L) + "'", long2 == (-198688000L));
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-32) + "'", int1 == (-32));
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 114864751, 285, (-424));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 114864751 for  must be in the range [285,-424]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 60837002, (long) (-3454332));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 64291334L + "'", long2 == 64291334L);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-54));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-54) + "'", int1 == (-54));
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 320, (long) 33940);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 34260L + "'", long2 == 34260L);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(21162, (-35890), 1664, 57074);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 40683 + "'", int4 == 40683);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-6462776320000L), (java.lang.Object) 209292673857880L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 855, (-444600), 12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-4), (long) (-3454332));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3454336L) + "'", long2 == (-3454336L));
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(46722045, 940);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 46722985 + "'", int2 == 46722985);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1418764);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1418764) + "'", int1 == (-1418764));
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(294328428, 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 294328442 + "'", int2 == 294328442);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 1174118400, (int) (short) 100, 86951);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1174118400 for hi! must be in the range [100,86951]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 294328428, 53078820, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-22), (-290033), 635274);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 635644, 1439484314, (-640));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 635644 for  must be in the range [1439484314,-640]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(35, 19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 665 + "'", int2 == 665);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(635644);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-635644) + "'", int1 == (-635644));
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-296836), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-296836) + "'", int2 == (-296836));
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-320L), (java.lang.Object) (-63829679930L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 303241905, (java.lang.Object) 350L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 46722985);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1174117535L, (java.lang.Object) (-5178600));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 111551661, (long) (-867));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-96715290087L) + "'", long2 == (-96715290087L));
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-54), (-63612100), 882057856);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-54) + "'", int3 == (-54));
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(24091087111212L, (-34L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-819096961781208L) + "'", long2 == (-819096961781208L));
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-53078820));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-53078820) + "'", int1 == (-53078820));
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-894096000), 9L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8046864000L) + "'", long2 == (-8046864000L));
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(943L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 943 + "'", int1 == 943);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 0, 588, 16698191);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for  must be in the range [588,16698191]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 114866500, 36835302, (-86500));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-86500), (-286708395), (-10240));
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) (byte) 10, (-481388400), 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-56115), 865, 129728466);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 129671487 + "'", int3 == 129671487);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 594L, (java.lang.Object) (-30158L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-4368), (java.lang.Object) 38693342);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(56222, (-26853925), 1824, (-26853925));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-80449), (-3454393), 86951);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-80449) + "'", int3 == (-80449));
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1439484314, (-247112789), 18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-1940), (long) 300);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1640L) + "'", long2 == (-1640L));
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(471872000, (-68));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 471872000 * -68");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1174117535L, (java.lang.Object) 17687484L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(382297);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-382297) + "'", int1 == (-382297));
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-27936000));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27936000 + "'", int1 == 27936000);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-647804800000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -647804800000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-30158L), 3361938L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3331780L + "'", long2 == 3331780L);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (int) (short) -1, (int) (byte) 1, 61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-3454332), 1439479930, 37);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -3454332 for  must be in the range [1439479930,37]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1), (long) 62);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-63L) + "'", long2 == (-63L));
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 31809, 16698191, (-2880));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 285, 31809, 333);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (short) 1, (java.lang.Object) (-347545514));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-54), (-32296), 1439479992);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-54) + "'", int3 == (-54));
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 5514792, (-96715290087L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-96709775295L) + "'", long2 == (-96709775295L));
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(28601, 1, 635644, 1174118400);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1173511359 + "'", int4 == 1173511359);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(24091103216472L, (-306836));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7392017746529402592L) + "'", long2 == (-7392017746529402592L));
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(26288, (-1144), (-1135350));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 4452343276909248L, (java.lang.Object) (-44303700));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 80449, 78657304);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6327901449496L + "'", long2 == 6327901449496L);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 20870);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20870 + "'", int1 == 20870);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 38838800, 26853925, (-286708395));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-27565200), (long) (-16104496));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 443923653139200L + "'", long2 == 443923653139200L);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(314504320, 764);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 314504320 * 764");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 294328442, (-33950), 21162);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 294328442 for  must be in the range [-33950,21162]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 31940548, obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (byte) 100, (long) 435386);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-435286L) + "'", long2 == (-435286L));
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 887, (long) 338688232);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 300416461784L + "'", long2 == 300416461784L);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 61, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6100L + "'", long2 == 6100L);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-41820960125700L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-41820960125700L) + "'", long2 == (-41820960125700L));
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(129728466, 73);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 129728466 * 73");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 347489423, 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-411852142), 520);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-411851622) + "'", int2 == (-411851622));
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(114864751, (-101));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 114864650 + "'", int2 == 114864650);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(38700L, (-513410046881952800L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 38700 * -513410046881952800");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(129671487, 347489423, (int) (byte) -1, 56222);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 44046 + "'", int4 == 44046);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 30, (long) (-32296));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-32266L) + "'", long2 == (-32266L));
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-70331), 620, (-22464800));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-27565200));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27565200 + "'", int1 == 27565200);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 27936000, 42680, 347545513);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) '4', 8557);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 444964L + "'", long2 == 444964L);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-16612058L), 46722985);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-776164936753130L) + "'", long2 == (-776164936753130L));
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(14, (-296836));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-296822) + "'", int2 == (-296822));
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) 1903616L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1093820), (java.lang.Object) 62);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-1000), (long) 54);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-54000) + "'", int2 == (-54000));
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 972, (-41256L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 42228L + "'", long2 == 42228L);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(347545530, 31059, (-27936000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 855, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 85500L + "'", long2 == 85500L);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-28601), 137620108, 56169);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(7110, 31059, 0, 303241905);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 38169 + "'", int4 == 38169);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1289464), 21162);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1268302) + "'", int2 == (-1268302));
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(31940548, 80449, (-1184));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, (-10240), (-1268302), 1439554100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-10240) + "'", int4 == (-10240));
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1418764), (-60836462L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 59417698L + "'", long2 == 59417698L);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(382297, 1439480000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 382297 * 1439480000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-306072), (-16105260), 1439479798);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-46722045));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 46722045 + "'", int1 == 46722045);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(15886, 21, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-370), (-2066944), (-22464800));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-247112789));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 247112789 + "'", int1 == 247112789);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 2097, (long) 114399);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 116496L + "'", long2 == 116496L);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 36835302, (-361904400L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-325069098L) + "'", long2 == (-325069098L));
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, (-435286L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-435286L) + "'", long2 == (-435286L));
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-36835302), (-306424));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11287220580048L + "'", long2 == 11287220580048L);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1268302), (long) (-325920000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 324651698L + "'", long2 == 324651698L);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 53078820, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(443923653139200L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 443923653139200");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 882057856, 1439479789);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1269704456440672384L + "'", long2 == 1269704456440672384L);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(635644, 34023, 867, (-220620));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1784L), 324966389);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-579740037976L) + "'", long2 == (-579740037976L));
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-27565200), (java.lang.Object) 970L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(87);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-87) + "'", int1 == (-87));
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(52, 1439479798, (-1184), 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-85) + "'", int4 == (-85));
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 6572257, (int) (byte) 1, (-376448000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 314504320, (-2772L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-871805975040L) + "'", long2 == (-871805975040L));
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(282862531276L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 282862531276");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-10239367648L), (-60836462L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 622926900821581376L + "'", long2 == 622926900821581376L);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(90151, (-5250));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-473292750) + "'", int2 == (-473292750));
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-59344612), (-574));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 34063807288L + "'", long2 == 34063807288L);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-129728466), 0, (-16105260), (-48));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-886762) + "'", int4 == (-886762));
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(38838800, (-28601), (-296909), (-56212));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-182877) + "'", int4 == (-182877));
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-198688000L), 54);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-10729152000L) + "'", long2 == (-10729152000L));
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-776769210), (-32), 18, 4352);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2068 + "'", int4 == 2068);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-35), (long) 940);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-32900L) + "'", long2 == (-32900L));
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(20);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-20) + "'", int1 == (-20));
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-290033));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 290033 + "'", int1 == 290033);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-22464800));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22464800 + "'", int1 == 22464800);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-10000L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-10000) + "'", int1 == (-10000));
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(319980239, 3395000, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-2693424), (-296836), 347545500);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-4672000));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-4672000) + "'", int1 == (-4672000));
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-32296), 382297);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 350001 + "'", int2 == 350001);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-54000), 2097, 294328428);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-44303700), 1, 137620108);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 0, (int) (byte) 10, 15886);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((int) 'a', 10, 1144, (-288965));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 531, (-35210L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-34679L) + "'", long2 == (-34679L));
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-3501), (long) 347545530);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 347542029L + "'", long2 == 347542029L);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(773, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (short) 0, (-63L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-38838800), 129300);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -38838800 * 129300");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-10729152000L), (-43324580L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 464836004156160000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-87), (long) 524);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 437L + "'", long2 == 437L);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-2205), (long) (-68));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2273L) + "'", long2 == (-2273L));
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-126532), 54, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(970, (-1110194), 1439479930);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 970 + "'", int3 == 970);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(2068, (-3200));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1132) + "'", int2 == (-1132));
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-206905806), (-444600));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -206905806 * -444600");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-20870), (java.lang.Object) (-285));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-70331), (-35890), 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -70331 for  must be in the range [-35890,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(531, (-56115));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-55584) + "'", int2 == (-55584));
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-78625298580L), 11287220580048L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -78625298580 * 11287220580048");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 930, (-970), (-10240));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-182877), 18897, (-1135350));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(970, (int) (byte) 100, (-53078820), 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-53077751) + "'", int4 == (-53077751));
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(943L, 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-247112789), 62, (-296909));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(9990L, (long) 38838800);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 387999612000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-3282031L), (java.lang.Object) 5514792);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1088), (-481388400), 1940);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(1681L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1681 + "'", int1 == 1681);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1289464, (-5453), 34023);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1144, 1439479930, 1418764, 1253244863);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 187654974 + "'", int4 == 187654974);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-6462774523691L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -6462774523691");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-54000), 347489423);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -54000 * 347489423");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-114399), 16698191, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -114399 for hi! must be in the range [16698191,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-776769210), (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-776769210L) + "'", long2 == (-776769210L));
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1617), (-20880));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 33762960L + "'", long2 == 33762960L);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-220620), 16, 382297);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 161662 + "'", int3 == 161662);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(62310L, (long) (-308852158));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -19244577964980");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-31045), 1860, (-48), (-2132));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 38693342, (-2132), 38838800);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-60837102), (long) 620);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-37719003240L) + "'", long2 == (-37719003240L));
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-336663), 96000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-240663) + "'", int2 == (-240663));
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 320, (-3928050L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1256976000) + "'", int2 == (-1256976000));
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 7418, 114864683, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 7418 for  must be in the range [114864683,10]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1664, 887, (-4240));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1664 for  must be in the range [887,-4240]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(31809, 33940);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1079597460 + "'", int2 == 1079597460);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-31059), 943L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-30116L) + "'", long2 == (-30116L));
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(37, (-31045), (-59344612));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 882057856, 30, (-206804));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1081L), (-109725L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 118612725 + "'", int2 == 118612725);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-411888032), 1439484314, (-306072));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 57958, (-56635L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1323L + "'", long2 == 1323L);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(282862531276L, (long) 959);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 271265167493684");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(16383699, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16383699 + "'", int2 == 16383699);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(114400, (-247112800), 887, 21162);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3832 + "'", int4 == 3832);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 294328442, 1439484314, (-12390400));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 665, 114864650, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-31045), 26510634646272000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -31045 * 26510634646272000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(324966389, 26853925, 26288, 2182);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(26114, 44046, 635274);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 617343 + "'", int3 == 617343);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(12211200);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-12211200) + "'", int1 == (-12211200));
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(347459013L, (long) 320);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 347459333L + "'", long2 == 347459333L);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-320L), (-63236920320000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 20235814502400000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1260), (java.lang.Object) 814L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, (long) (-1617));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1617L) + "'", long2 == (-1617L));
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-60836462L), (long) 247112789);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-307949251L) + "'", long2 == (-307949251L));
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-16105260));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16105260 + "'", int1 == 16105260);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) ' ', (long) 22464800);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 718873600L + "'", long2 == 718873600L);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 31809, (java.lang.Object) (-198688000L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 103, 1439479789, 2205);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(11, 471872000, (-2205));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (byte) 0, (long) (-574));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-574L) + "'", long2 == (-574L));
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-247112800), (-182877), (-38838800), 1664);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-14252887) + "'", int4 == (-14252887));
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-80449), 18897);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-61552) + "'", int2 == (-61552));
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-87), (long) 27936000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-27936087L) + "'", long2 == (-27936087L));
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-114866500L), (-376448000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 43241264192000000L + "'", long2 == 43241264192000000L);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-86500L), (long) 588);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-85912L) + "'", long2 == (-85912L));
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(56222);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-56222) + "'", int1 == (-56222));
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-325920000), 21162, 0, 20870);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1827 + "'", int4 == 1827);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-247112789), (-288965));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -247112789 * -288965");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-27936000), 6774628331L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -189256017054816000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-3282031L), (java.lang.Object) 60837102);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-320L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-320) + "'", int1 == (-320));
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, 1664);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1664 + "'", int2 == 1664);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-27513L), (-347545500));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9562019341500L + "'", long2 == 9562019341500L);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(47164942L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 47164942 + "'", int1 == 47164942);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 31809, (long) 1827);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 58115043 + "'", int2 == 58115043);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-48), (long) (-308852158));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 14824903584L + "'", long2 == 14824903584L);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-80449), 333, (-182877));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -80449 for  must be in the range [333,-182877]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 15886, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 15886L + "'", long2 == 15886L);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-114399), (-285), 26114);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -114399 for  must be in the range [-285,26114]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-574L), (-361904400L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 361903826L + "'", long2 == 361903826L);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(44046, 285, (-347545500), (-296822));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-347204348) + "'", int4 == (-347204348));
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-356663600L), (-296909));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 105896632812400L + "'", long2 == 105896632812400L);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 56212, (long) 103);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5789836 + "'", int2 == 5789836);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(34260L, 41773993546320000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 34260 * 41773993546320000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-182877), 20870);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-162007) + "'", int2 == (-162007));
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(19);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-19) + "'", int1 == (-19));
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 524, (-6760L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6236L) + "'", long2 == (-6236L));
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-1135350), (-68), (-129728466), (-4672000));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-126191885) + "'", int4 == (-126191885));
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 18897);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 18897 + "'", int1 == 18897);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 320, (java.lang.Object) (-78657304000L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-42477011010000L), (-930));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 39503620239300000L + "'", long2 == 39503620239300000L);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1554344743, 114864751);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1554344743 * 114864751");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 471872000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 471872000 + "'", int1 == 471872000);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(635274, (-28601), 80449);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19032) + "'", int3 == (-19032));
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 435386, 114864683, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 435386 for hi! must be in the range [114864683,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (byte) 10, (-70331));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-703310L) + "'", long2 == (-703310L));
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 333, (java.lang.Object) 1824);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-640), (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-641L) + "'", long2 == (-641L));
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-2182), 350001, 10582370);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 531, (-64306528L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-34146766368L) + "'", long2 == (-34146766368L));
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-14), (long) (-20));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-34L) + "'", long2 == (-34L));
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-2132));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2132 + "'", int1 == 2132);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-10008), (-19), (-2132));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 52, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 324966389, 694);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 225526673966L + "'", long2 == 225526673966L);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(16, 26288);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 420608 + "'", int2 == 420608);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-2516), (-126191885), (-3454332), 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1838377) + "'", int4 == (-1838377));
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, (long) (-54));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-54), (long) 22);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-32L) + "'", long2 == (-32L));
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1439484314, (-1452704), (-10));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1439484314 for  must be in the range [-1452704,-10]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(19093186921952L, 9562019341500L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 28655206263452L + "'", long2 == 28655206263452L);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 31940548, (long) (-56115));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1792343851020L) + "'", long2 == (-1792343851020L));
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, 943);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 22, 33950, (-370));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 4352, 31109, 855);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-20870), (-48), 314504320);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -20870 for  must be in the range [-48,314504320]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-64306528), 129671487, 31045, 300);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(46722045, 7207137, (-55584));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-635644), 290033, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 16698191, 114864650, 38838800);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 16698191 for hi! must be in the range [114864650,38838800]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-20880), (-936232672320L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 936232651440L + "'", long2 == 936232651440L);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 16698191, (-31059), 27936000);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-3501), 338688232, (-1418764));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -3501 for hi! must be in the range [338688232,-1418764]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-635644), 635644);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -635644 * 635644");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-635644));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 635644 + "'", int1 == 635644);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(10, 1173511359);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1173511369 + "'", int2 == 1173511369);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(34023, 420608, 16383699, 294328442);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 278399375 + "'", int4 == 278399375);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-288965));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-288965) + "'", int1 == (-288965));
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 27936000, obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(64, 53078820);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53078884 + "'", int2 == 53078884);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-60836462), 114399, (-376448000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 882057856, (-2132L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1880547348992L) + "'", long2 == (-1880547348992L));
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(42228L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 42228 + "'", int1 == 42228);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 38693342, 278141647, (-3361938));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-288965), (-1260), 867);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 443 + "'", int3 == 443);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(2068, 431);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 891308 + "'", int2 == 891308);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(814L, (long) 16105260);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 13109681640L + "'", long2 == 13109681640L);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 31940548, 64, 5514792);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-60837102), 103, 350001);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -60837102 for hi! must be in the range [103,350001]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-59288497L), 47164942L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2796338522272174L) + "'", long2 == (-2796338522272174L));
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-38838800), 1860, 320);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(122220L, (-5178600));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-632928492000L) + "'", long2 == (-632928492000L));
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 350001, (long) (-64306528));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-63956527L) + "'", long2 == (-63956527L));
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(111551661, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 111551661 + "'", int2 == 111551661);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-1184), 1439479992, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1184 for  must be in the range [1439479992,10]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(18897, (int) (byte) 0, (-247112789), 2097);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-247095990) + "'", int4 == (-247095990));
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 26288, (-68), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26288 for  must be in the range [-68,100]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 26853925, 1857L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 49867738725L + "'", long2 == 49867738725L);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1439479930, 31059, (-5250));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 370, 114400, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 370 for hi! must be in the range [114400,10]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1289464), (long) (-3395000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2105536L + "'", long2 == 2105536L);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1253244863, 47255125, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }
}

