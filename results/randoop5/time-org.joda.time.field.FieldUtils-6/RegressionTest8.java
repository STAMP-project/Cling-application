import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-411851622), 3058761464837L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -411851622 * 3058761464837");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-2679693634276L), (java.lang.Object) (-41773993547846778L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-4907097L), (java.lang.Object) 15886L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-43322723L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-43322723) + "'", int1 == (-43322723));
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-268), 78486370, 263711249);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(303241905, 2869330, (-867), (-247056567));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 347545530, 1439850164, 11013);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-215422792), 27565200);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5938172346038400L) + "'", long2 == (-5938172346038400L));
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-70887), 54261, (-46722045));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -70887 for hi! must be in the range [54261,-46722045]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-2516), (long) (-520));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1308320L + "'", long2 == 1308320L);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 2068, (long) (-2256918));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -4667306424");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-35134), (long) 16681080);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 16645946L + "'", long2 == 16645946L);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-251320687), (-1838377));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -251320687 * -1838377");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-61552), 882057856);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 881996304 + "'", int2 == 881996304);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(28627459, 7110, (-411851622));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-67252516), (java.lang.Object) (-873000));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-4594848), (-26958261), 338688232);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-206804), 6723600L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1390467374400L) + "'", long2 == (-1390467374400L));
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(22579200, 34023);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22613223 + "'", int2 == 22613223);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1200131, 43219, 10000, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-206905806));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 206905806 + "'", int1 == 206905806);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-53040120L), (-54147324));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2871980562638880L + "'", long2 == 2871980562638880L);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-16698558L), 3301996192L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3285297634L + "'", long2 == 3285297634L);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 54, 2068);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 111672L + "'", long2 == 111672L);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 89655, 1134640);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 101726149200L + "'", long2 == 101726149200L);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-10240), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 347545600, (int) 'a', (-268));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 347545600 for  must be in the range [97,-268]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-260054954), 31809);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-260023145) + "'", int2 == (-260023145));
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 424, (-3454393), (-18212066));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-5178599L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(22464800);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-22464800) + "'", int1 == (-22464800));
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-206804), (-46722045), 320, 1378643530);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1331714362 + "'", int4 == 1331714362);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(42658003, (-107941), 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-95741) + "'", int3 == (-95741));
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-37719003240L), (java.lang.Object) (-867));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-23257539985550L), (-1682));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 39119182255695100L + "'", long2 == 39119182255695100L);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 37, (-2), 823765333);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(89655L, 20870);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1871099850L + "'", long2 == 1871099850L);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 8726503, 21152985, 1173511369);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-6839220));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6839220 + "'", int1 == 6839220);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(28745600);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-28745600) + "'", int1 == (-28745600));
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 10830327, 337, 307515974);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 6839220, (long) (-63612100));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-56772880L) + "'", long2 == (-56772880L));
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-520), (-532832), (-5084732));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(324651698L, (-962801657564L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-962477005866L) + "'", long2 == (-962477005866L));
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(8047760, 103);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8047863 + "'", int2 == 8047863);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(0L, (-5178599L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5178599L) + "'", long2 == (-5178599L));
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 1439479962, (-30L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -43184398860");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 12278080, (-46493186813600L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 46493199091680L + "'", long2 == 46493199091680L);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 347545530, 118316135L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 41120243846126550");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-129728466), (-1110L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-129729576L) + "'", long2 == (-129729576L));
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-19065727), (-1352913), 930);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-5180732), 4287360);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-893372) + "'", int2 == (-893372));
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(18860544683016L, (-779310L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 18860544683016 * -779310");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1144), 247401754);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -1144 * 247401754");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 70331, (long) 1087826257);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1087896588L + "'", long2 == 1087896588L);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(64296588L, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-6965), (long) 22579200);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-22586165L) + "'", long2 == (-22586165L));
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-278399375), (long) (-171947));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 47869937333125");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(18, (-70887), (-1647552128));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1171849056, (-247056567));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1171849056 * -247056567");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-56115), (-248056338), 589471035, (-1083172));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-70887), 5178600, 333);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(2182, (-19));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2163 + "'", int2 == 2163);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-22462636), (-1135315), (-7971515));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -22462636 for hi! must be in the range [-1135315,-7971515]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-86106696));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 86106696 + "'", int1 == 86106696);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 2205, 1439480000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3174053400000L + "'", long2 == 3174053400000L);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-114399), (-8449560), 0);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-239124363), 0, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -239124363 for hi! must be in the range [0,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(1144L, (long) (-64306528));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -73566668032");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 63, (long) 31059);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1956717L + "'", long2 == 1956717L);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1171681200, 86862642);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1171681200 * 86862642");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-183330000), (long) 19633816);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3599467487280000L) + "'", long2 == (-3599467487280000L));
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(865, (-635644), 38838810);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 865 + "'", int3 == 865);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-35002240), 2737408);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-95815411793920L) + "'", long2 == (-95815411793920L));
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-11), 200236812, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(849206625, 38838810);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 849206625 * 38838810");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-347545500), (-1452704), (-126191885));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-694), 57958, 3482205);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 588, (long) (-33930));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-19950840) + "'", int2 == (-19950840));
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-251320687), (long) 31059);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -7805769217533");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1110194), 1724836, 28745600);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 25910571 + "'", int3 == 25910571);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) (short) 10, (-260023145), 1200131);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(999073006, 325417452, (-171947), 43189);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-108051) + "'", int4 == (-108051));
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-32), 797, (-60837102));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -32 for hi! must be in the range [797,-60837102]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(30169L, (long) (-31109));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-940L) + "'", long2 == (-940L));
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-27936000), 11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-27935989) + "'", int2 == (-27935989));
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-28), (-28601), 7843137);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-28) + "'", int3 == (-28));
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-10008), 390060987, 930516328);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -10008 for  must be in the range [390060987,930516328]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(333, 562009936);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 333 * 562009936");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-26953087158774L), (long) (-93877));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-26953087064897L) + "'", long2 == (-26953087064897L));
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-406374L), (-670090));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 272307153660L + "'", long2 == 272307153660L);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-958568310), (-220620), (-215377636));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-603316646236L), (long) 300);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-603316646536L) + "'", long2 == (-603316646536L));
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 87940049, (long) 80375);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 88020424L + "'", long2 == 88020424L);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 16, 54, (-16759743));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, (long) 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4L) + "'", long2 == (-4L));
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-45636842L), (long) (-215377636));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9829155144465512L + "'", long2 == 9829155144465512L);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 959);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 959 + "'", int1 == 959);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(310711192, (-623823200), (-1104641584));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 7843137, 1171681200, 7207137);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(14812754363372400L, (-3313090));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 14812754363372400 * -3313090");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1065546), 977739, 457400);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 31025L, (java.lang.Object) (-444600));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1072620480));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1072620480 + "'", int1 == 1072620480);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1134640);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1134640) + "'", int1 == (-1134640));
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 115160815, (-5453), 1076143128);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2178072437520000L), 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(28437436L, (-93887530880L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 93915968316L + "'", long2 == 93915968316L);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-194), (java.lang.Object) (-1833041419862130L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 16378246, (-540250), 1439479930);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-38838800), (-71680), (-206905806));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(18615258, (-60837172), (-5453));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-42216462) + "'", int3 == (-42216462));
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 2481, (-513410046881952800L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-513410046881950319L) + "'", long2 == (-513410046881950319L));
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(786814L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 786814 + "'", int1 == 786814);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 3832, (-22464800));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-86085113600L) + "'", long2 == (-86085113600L));
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1038459622L), (long) 62);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1038459560L) + "'", long2 == (-1038459560L));
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-59133041064L), (-3138779563401325736L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -59133041064 * -3138779563401325736");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(269, (-114866399));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 269 * -114866399");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(9700L, (long) 80449);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 90149L + "'", long2 == 90149L);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-56115L), (long) (-10000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 561150000L + "'", long2 == 561150000L);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, (-16288008));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-379120), 44046, (-9940), 1439484314);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1439159181 + "'", int4 == 1439159181);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(524, 35, 36835302);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 524 + "'", int3 == 524);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 101916, (-379242800L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 379344716L + "'", long2 == 379344716L);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-63236920320000L), 129768L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8206128676085760000L) + "'", long2 == (-8206128676085760000L));
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 33658101, 562009936, (-16378246));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-5514792), 129728466);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 124213674 + "'", int2 == 124213674);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 2948318704536545340L, (java.lang.Object) (-473292750));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-93368965), (-1065546), 47159692, 294330944);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 152736742 + "'", int4 == 152736742);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(98, 772, 114864217);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 114863544 + "'", int3 == 114863544);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-13260870000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -13260870000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-4594848), (-686731194L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 3155425453288512");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-11026936320000L), (long) 191808411);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-11026744511589L) + "'", long2 == (-11026744511589L));
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (-4880), (-1146858930), 1171681200);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-105896632722745L), (java.lang.Object) 443027L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-5084732), (-410717198), 93989);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-3313090), 2693424, 81726);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -3313090 for  must be in the range [2693424,81726]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-58551723468580L), (-376448000));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -58551723468580 * -376448000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 53078884, (long) (-1352913));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 54431797L + "'", long2 == 54431797L);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(6346366835096L, (long) 187654974);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6346179180122L + "'", long2 == 6346179180122L);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(64291334, (-29900), 3395000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2643116 + "'", int3 == 2643116);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-31109));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-31109) + "'", int1 == (-31109));
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 1213090550, (-41256L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1213049294L + "'", long2 == 1213049294L);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(0, (-27565200));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 958081528, (-1824), (-1412250));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-814290), (-16378246), 2869319);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-814290) + "'", int3 == (-814290));
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-788035248), (-903968));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-788939216) + "'", int2 == (-788939216));
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 54, 300);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 16200L + "'", long2 == 16200L);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 5924230346L, (java.lang.Object) 347459013L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-849792292), 10993931, 5699468);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(185849, 1824);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 338988576 + "'", int2 == 338988576);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(44303700L, 182694L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 44486394L + "'", long2 == 44486394L);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 881996304, 1289464);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1137302482141056L + "'", long2 == 1137302482141056L);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 204128820, 0, (-1093820));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-31000L), 513655651005905746L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 513655651005874746L + "'", long2 == 513655651005874746L);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 183559, (int) (byte) 1, (-215377636));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(281622043L, (long) 9700);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2731733817100L + "'", long2 == 2731733817100L);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 3285297634L, (java.lang.Object) (-113535));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(52, 1439479992, 772, 37806580);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2859302 + "'", int4 == 2859302);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-654584), (-410717198), 187654974, (-19240));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(443923653139200L, (-686731194L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 443924339870394L + "'", long2 == 443924339870394L);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-175978764), 114882669);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-20216910095641116L) + "'", long2 == (-20216910095641116L));
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 56222, 2067L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 116210874L + "'", long2 == 116210874L);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-1492491));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1492491) + "'", int1 == (-1492491));
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-27565200), 3889136);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-23676064) + "'", int2 == (-23676064));
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(2869319, 562009936);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 564879255 + "'", int2 == 564879255);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 50768, (-2182), 119427015);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-129206581), (long) 1144);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-129207725L) + "'", long2 == (-129207725L));
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-6201672553609L), (long) (-93368965));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -6201672553609 * -93368965");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-18877689765028560L), 46197701213820L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-18831492063814740L) + "'", long2 == (-18831492063814740L));
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-78657304000L), (java.lang.Object) 171);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1134), (-3336418972800L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3783499115155200L + "'", long2 == 3783499115155200L);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 1940, (long) (-19032));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-17092L) + "'", long2 == (-17092L));
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (long) (-4634346));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1010));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1010 + "'", int1 == 1010);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, 114863544, 16104496);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(101726149200L, (long) 15886);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1616021606191200");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1066053141106120L), 38838800);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -1066053141106120 * 38838800");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-39145646), (long) (-124284));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4865177467464L + "'", long2 == 4865177467464L);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1439480000, (java.lang.Object) 411851622);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(350626805, (-1289464), (-100091559), 44046);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-51205083) + "'", int4 == (-51205083));
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-959L), 56201L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53896759L) + "'", long2 == (-53896759L));
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 2889537, (long) 1860);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2891397L + "'", long2 == 2891397L);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(28467799L, (long) (-823765333));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -23450785923012067");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(2252, 337447404, (-56201));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 547, (-286708395));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-156829492065L) + "'", long2 == (-156829492065L));
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 338688232, (-15637477));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5296229438070664L) + "'", long2 == (-5296229438070664L));
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-33950), 285, 8318916, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1072620480, 635274, (-248056338));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 2480, (long) (-68));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2412L + "'", long2 == 2412L);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, 8726503, (-78487340), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-69760848) + "'", int4 == (-69760848));
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 3583775, (-443037), (-35890));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-59344612), (-797));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -59344612 * -797");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1418764), 306072);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-434243935008L) + "'", long2 == (-434243935008L));
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1289464), 90151, (-296822));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 6144000, (-45156), 1134640);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6144000 for  must be in the range [-45156,1134640]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, 2154374299130L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-296822), 137972648L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-40953317324656L) + "'", long2 == (-40953317324656L));
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-623823200), (-38838800), 57074);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -623823200 for  must be in the range [-38838800,57074]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-779310), (-206905806), (-4634346));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-203050771) + "'", int3 == (-203050771));
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-17850666));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 17850666 + "'", int1 == 17850666);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 247056567, (-604093415446L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 604340472013L + "'", long2 == 604340472013L);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-4907097L), (long) 1452704);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7128559440288L) + "'", long2 == (-7128559440288L));
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(9373420, (-370), 129671487);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9373420 + "'", int3 == 9373420);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-320), (-11));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-331) + "'", int2 == (-331));
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) 1439159181);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 773, (-1401815520), 314507200);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(197L, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 162L + "'", long2 == 162L);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(9L, (-325893886L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 325893895L + "'", long2 == 325893895L);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 25242667, 33950, 708897982);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-8046864000L), 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-2880868890240L), (long) (-1000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2880868891240L) + "'", long2 == (-2880868891240L));
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(129206581, 10993931);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 129206581 * 10993931");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(411851368L, (-1085203L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-446942340107704L) + "'", long2 == (-446942340107704L));
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 9940, 1351296, 61);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 9940 for hi! must be in the range [1351296,61]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-126147048), (-31045), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(5452564L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5452564 + "'", int1 == 5452564);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 16417401, (-1176021174));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-19307211198048774L) + "'", long2 == (-19307211198048774L));
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-56115), 36835302, 3482205, 28627459);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11633932 + "'", int4 == 11633932);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-183330000), (-574));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -183330000 * -574");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 1869436, 337, (-814290));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1869436 for hi! must be in the range [337,-814290]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }
}

