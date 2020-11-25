import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(114866399);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-114866399) + "'", int1 == (-114866399));
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-9940), (-162007));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-171947) + "'", int2 == (-171947));
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-61552), 9756, (-444600));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -61552 for hi! must be in the range [9756,-444600]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(19093186921952L, (long) 33940);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 19093186888012L + "'", long2 == 19093186888012L);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 4352, (-22464800), 972);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 4352 for hi! must be in the range [-22464800,972]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-32358875));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-32358875) + "'", int1 == (-32358875));
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply(39503620239300000L, 31059);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 39503620239300000 * 31059");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 0, (-1000), 0);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-63L), 210490000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-13260870000L) + "'", long2 == (-13260870000L));
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-107941L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(114866510, 10240);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 114866510 * 10240");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(324966389);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-324966389) + "'", int1 == (-324966389));
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1439480362, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1439480362 * 35");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-411852512), (-382297), 16105260);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -411852512 for hi! must be in the range [-382297,16105260]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-5178599L), (-223400488L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 218221889L + "'", long2 == 218221889L);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-32900L), (long) (-347545600));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 347512700L + "'", long2 == 347512700L);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-980712));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 980712 + "'", int1 == 980712);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(122220L, (long) (-60836462));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7435432385640L) + "'", long2 == (-7435432385640L));
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1439480362, 12053737, 473292750);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 55763320 + "'", int3 == 55763320);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(129728466, (-53078820), 347545513, 161662);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1378643530, (-1144));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1378642386 + "'", int2 == 1378642386);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(10L, (-182877));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1828770L) + "'", long2 == (-1828770L));
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-16759743), 114400, 57958);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(959, (-779310), 174652);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 959 + "'", int3 == 959);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-5250), 370);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4880) + "'", int2 == (-4880));
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (byte) -1, (java.lang.Object) (-389277612L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(74108, 1824, (-107));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-2L), (long) 46722985);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-93445970L) + "'", long2 == (-93445970L));
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-324966389), (long) (-324966389));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-38838800), (long) (-10240));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 397709312000L + "'", long2 == 397709312000L);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 114864650, (-107));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-12290517550L) + "'", long2 == (-12290517550L));
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1135415L, 55078L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1190493L + "'", long2 == 1190493L);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-323217421020L), (java.lang.Object) (-36835302));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-411852142));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 411852142 + "'", int1 == 411852142);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(31809, 665);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21152985 + "'", int2 == 21152985);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-959L), (long) (-64306528));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 61669960352L + "'", long2 == 61669960352L);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-71680), (-2205));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 158054400L + "'", long2 == 158054400L);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-3200), 114866399, 1827);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(100L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(356663600L, (long) 269);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 356663869L + "'", long2 == 356663869L);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(347459333L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 347459333L + "'", long2 == 347459333L);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(38838810);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-38838810) + "'", int1 == (-38838810));
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-867), (-19240));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16681080 + "'", int2 == 16681080);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-60836462), 86951, (-31059), (-20));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-4231) + "'", int4 == (-4231));
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 0, 80375, 22579200);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for  must be in the range [80375,22579200]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(111551661, (-240663));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 111551661 * -240663");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, (long) 336651);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 2457, (-286708395), 1079597460);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-376448000), 333, 1253244863);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -376448000 for hi! must be in the range [333,1253244863]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(31109, (-2132));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-66324388) + "'", int2 == (-66324388));
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-4907389L), 6077576140000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -4907389 * 6077576140000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (short) 10, (-307949251L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 307949261L + "'", long2 == 307949261L);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 85500L, (java.lang.Object) (-59344612));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(44046, (-19240));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24806 + "'", int2 == 24806);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-296909), 58115043, (-87));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-382297), (long) 21);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-382276L) + "'", long2 == (-382276L));
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1681, 891308);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1498288748L + "'", long2 == 1498288748L);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-56201), 114866500, (-635274), (-32296));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-358690) + "'", int4 == (-358690));
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 52, (long) 129300);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6723600L + "'", long2 == 6723600L);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1439479992, (-9535), (-16387741), 5789836);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2072113) + "'", int4 == (-2072113));
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(1378642386, 588);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 1378642386 * 588");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-18027450), (-1940), 764, (-53078820));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, 33940, 588, 36140);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 33940 + "'", int4 == 33940);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-32296), 0, 1827);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 608 + "'", int3 == 608);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-14252887), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (int) (short) -1, (-1452704), 1439480362);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-38838810), 2067, 7207137);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-336663), (-481446432), 337);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 60837002, (long) (-520));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60837522L + "'", long2 == 60837522L);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(9600L, 24091103216472L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 231274590878131200");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1460, 18897, 9700);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 336651, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 336748L + "'", long2 == 336748L);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 347545600, (-473292750), 294328428);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 34063807288L, (java.lang.Object) (-64306528L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, 1439736100L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 18, 11, 20);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-126191885), 588, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 38838810, 814290, 54261);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 38838810 for hi! must be in the range [814290,54261]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-336663), 5514792);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -336663 * 5514792");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(10814L, (long) 12);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 129768L + "'", long2 == 129768L);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(443923653139200L, (-16612058L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 443923636527142L + "'", long2 == 443923636527142L);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(773, (-1838377));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1421065421) + "'", int2 == (-1421065421));
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-10239367648L), (long) 1439480000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-11678847648L) + "'", long2 == (-11678847648L));
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-5250), 47164942);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 47159692 + "'", int2 == 47159692);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(1176022016L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1176022016 + "'", int1 == 1176022016);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(970, (-1724836), 27936000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 970 + "'", int3 == 970);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-481388400), (-114399));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 55070351571600L + "'", long2 == 55070351571600L);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(52, (-285), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-347545600), (-3200), 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -347545600 for hi! must be in the range [-3200,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 943, (-635644), (-12390400));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 943 for hi! must be in the range [-635644,-12390400]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-411852142), 1439479789, 114399, 28627459);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1157451 + "'", int4 == 1157451);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 88012474, (-20), 114866510);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1523304743L, (long) (-4231));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6445102367633L) + "'", long2 == (-6445102367633L));
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-12211200), (long) (-35890));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 438259968000L + "'", long2 == 438259968000L);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(46722985, 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 46723048 + "'", int2 == 46723048);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 1439554110, (long) (-44303700));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1395250410L + "'", long2 == 1395250410L);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1378643530, (-31045), 1681);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-27936000), (-53078820));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1482809915520000L + "'", long2 == 1482809915520000L);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(594L, 1554344743);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 923280777342L + "'", long2 == 923280777342L);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 310450, (java.lang.Object) 524);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 33940, (long) (-26853925));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 26887865L + "'", long2 == 26887865L);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (byte) -1, 350L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-351L) + "'", long2 == (-351L));
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-2880), (-443037), 16105260);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2880) + "'", int3 == (-2880));
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(96000, 361400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 457400 + "'", int2 == 457400);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 44046, (-182877), 320);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-10000), 56212, (-4672000), 8557);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-4634346) + "'", int4 == (-4634346));
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-59344612), (-101), (-1174118400));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-16759743), (-9535), (-2));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -16759743 for hi! must be in the range [-9535,-2]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-56201), (-4880), (-87));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -56201 for  must be in the range [-4880,-87]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 86951, (-1940));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-168684940L) + "'", long2 == (-168684940L));
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(174652L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 174652L + "'", long2 == 174652L);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 333, (-38838800), (-2132));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(122220L, (long) (-376448000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-376325780L) + "'", long2 == (-376325780L));
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 411852142, (int) '4', 114400);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 411852142 for  must be in the range [52,114400]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((int) 'a', 118612725, 28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-41820960125700L), (java.lang.Object) (-323217421020L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-2516), (-4880));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12278080 + "'", int2 == 12278080);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(54269L, (long) 114864683);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6233591481727L + "'", long2 == 6233591481727L);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(1190493L, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1190493L) + "'", long2 == (-1190493L));
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 12211200, (-98154769885L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1198587526019712000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 2457, (-4634346), 310450);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1439479798, 814290, 1176022016);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 264272071 + "'", int3 == 264272071);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 347545530, 2154374320000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 347545530 * 2154374320000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(6462775184685L, (-69839361280L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6532614545965L + "'", long2 == 6532614545965L);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1460, 64291334);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 93865347640L + "'", long2 == 93865347640L);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-240663), (-60837102), (-48));
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 337463000, 320, 187654974);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 337463000 for  must be in the range [320,187654974]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 2480, (java.lang.Object) 264272071);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 6144000, 80375, (-884));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6144000 for  must be in the range [80375,-884]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-16387741), 1460, (-6790));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(16383699, (-1132));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 16383699 * -1132");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(797);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-797) + "'", int1 == (-797));
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-61552), (-114399), 6084168);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-3361938), 33950);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -3361938 * 33950");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (short) 1, (-1011L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1010L) + "'", long2 == (-1010L));
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-32814600L), (long) 1439484314);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1406669714L + "'", long2 == 1406669714L);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-54000), 435386, 47164974, (-74108));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 1351296);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1351296 + "'", int1 == 1351296);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 46722045, (java.lang.Object) 60837522L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 294328428, (long) 3395000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 297723428L + "'", long2 == 297723428L);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 970, (long) 294328442);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 285498588740");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-3313090), (-109725L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 363528800250L + "'", long2 == 363528800250L);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-19742466996L), (long) 1144);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-19742465852L) + "'", long2 == (-19742465852L));
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-35), 24091086475568L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -843188026644880");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-1104586000L), (java.lang.Object) 3832);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-884), (-1421065421), 608);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-884) + "'", int3 == (-884));
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(294328428, (-324966389));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 294328428 * -324966389");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-640), 347545546, 8318916);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -640 for hi! must be in the range [347545546,8318916]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-995249332709055L), (long) (-18027450));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-995249314681605L) + "'", long2 == (-995249314681605L));
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 1439554100, 324966389, 38838800);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-32), (-74108), 435386);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-32) + "'", int3 == (-32));
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-32), 90151, (-60836462));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-54L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-54) + "'", int1 == (-54));
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 55763320, 1903616L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 106151948165120");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 588, (long) (-1184));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-596L) + "'", long2 == (-596L));
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(10, (-247095990), (-7971618));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-239124363) + "'", int3 == (-239124363));
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 53078884);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 53078884 + "'", int1 == 53078884);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, 325417452, 15886);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(887L, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 888L + "'", long2 == 888L);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(96194L, (-16759743));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1612186718142L) + "'", long2 == (-1612186718142L));
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(26510634646272000L, (long) (-520));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 26510634646272520L + "'", long2 == 26510634646272520L);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 4352, (-1289464), 6084168);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 62, (java.lang.Object) 2457);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(21, 773);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16233 + "'", int2 == 16233);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 325417452, 57958);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 18860544683016L + "'", long2 == 18860544683016L);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(473292750, (-53077751), 20870);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-4594848) + "'", int3 == (-4594848));
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-61552), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-61551) + "'", int2 == (-61551));
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(19093186888012L, (-93368965L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 19093093519047L + "'", long2 == 19093093519047L);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 665, (-7971618), 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 665 for hi! must be in the range [-7971618,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-1093820), (-635274), (-1940));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(53078820);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-53078820) + "'", int1 == (-53078820));
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-2182), (-1401815520));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3058761464640L + "'", long2 == 3058761464640L);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 21152985, (long) 21162);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 447639468570");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-4672000), (long) (-70));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 327040000L + "'", long2 == 327040000L);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-223497L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-223497) + "'", int1 == (-223497));
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-46722045), 1253244863);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -46722045 * 1253244863");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-22), (java.lang.Object) (-8046864000L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(2132, (int) 'a', (-22464800), 64);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-22462636) + "'", int4 == (-22462636));
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(3832, 86951);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 90783 + "'", int2 == 90783);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-60837102), 8318916, 0, (-2132));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 337, (-5250), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 47164974);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 47164974 + "'", int1 == 47164974);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 61, 12, 62);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 10, 285, 471872000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 33658101, 13109681640L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 441246988716965640");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-2516), 337463000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -2516 * 337463000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-266796), 290033, 325417452);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(28, (-7971618), 1439479789, (-884));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1378643530, (java.lang.Object) (-61551));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1144, (-2));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2288L) + "'", long2 == (-2288L));
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(764, 0, (-320), (-4672000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(594L, (long) (-28601));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-28007L) + "'", long2 == (-28007L));
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 324966389, (-1421065421), 930);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 14, (long) 1778168224);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 24894355136");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 970, (-85), 54261);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(85);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-85) + "'", int1 == (-85));
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 90151, (-1838377), 891308);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-980712), (-247095990), 454);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(865, (-36835302), (-14), 347545614);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 310711192 + "'", int4 == 310711192);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-370), 431, (-1421065421));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -370 for  must be in the range [431,-1421065421]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 129728466, (-10240));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1328419491840L) + "'", long2 == (-1328419491840L));
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, 57958);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57958 + "'", int2 == 57958);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-5514792));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5514792 + "'", int1 == 5514792);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-10008), (-60836462), 10);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(972, 1439479992, (-5178600));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 20870, (int) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 730450L + "'", long2 == 730450L);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 107, (-411852142L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-44068179194L) + "'", long2 == (-44068179194L));
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1439479930, (-7971618), (-4672000));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        java.lang.Object obj1 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1144, obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(635744L, (-61308900L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-38976765321600L) + "'", long2 == (-38976765321600L));
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-411852512), 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-223497), (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-223462L) + "'", long2 == (-223462L));
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-776769210));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 776769210 + "'", int1 == 776769210);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 12, 325417452);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3905009424L + "'", long2 == 3905009424L);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-96000), 16698191, 6084168);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 411852142, 385L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 411851757L + "'", long2 == 411851757L);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-3454332), (long) 26288);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3428044L) + "'", long2 == (-3428044L));
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1778168224, 0, (-776769210));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(96194, (-2205), (-54), 129728466);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 93989 + "'", int4 == 93989);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(520, 1778168224);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 520 * 1778168224");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 337, (long) 1157451);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 390060987 + "'", int2 == 390060987);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(269, (-5250));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1412250) + "'", int2 == (-1412250));
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(588, 12053737);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 588 * 12053737");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(2205, 443, (-71680));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-247056567), 1452704, 361400, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-126532), 100L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12653200) + "'", int2 == (-12653200));
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 314504320, 347545530, (-31109));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 959, 20, 1940);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(58115043, 300, 54261);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 51931 + "'", int3 == 51931);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(491, 347545500);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 491 * 347545500");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-22468000), 8557);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -22468000 * 8557");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(54269L, (-6236L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60505L + "'", long2 == 60505L);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 58115043, 47255125, (-1412250));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 58115043 for hi! must be in the range [47255125,-1412250]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(319980239, 1439480362, 103, (-27936000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(3361938L, 888L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3361050L + "'", long2 == 3361050L);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(4352);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-4352) + "'", int1 == (-4352));
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(53078820, (-1104586000), 635274, (-66324388));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(1857L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1857 + "'", int1 == 1857);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(54000L, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-54000L) + "'", long2 == (-54000L));
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 2067, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2067L + "'", long2 == 2067L);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-239124363), 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(314504320, (-2693424), 855, (-31040000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-194));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 194 + "'", int1 == 194);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 137620108, (-16105260), 424);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-411852512), 47159692, (-1260));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-308852158), 310450);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-308541708) + "'", int2 == (-308541708));
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (-38838810), (long) 1452704);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -56421294642240");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1093820), (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-35002240) + "'", int2 == (-35002240));
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-80449), (-61551), 337463000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(180395249984000L, (long) 64291334);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 180395249984000 * 64291334");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 38693342, (-296822), 194);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-1492491), (-11));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16417401 + "'", int2 == 16417401);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 63, 0, 454);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-8557), 314507200);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2691238110400L) + "'", long2 == (-2691238110400L));
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-640));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-640) + "'", int1 == (-640));
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-3164L), (long) (-5453));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8617L) + "'", long2 == (-8617L));
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-1940), (long) (-411852142));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 798993155480L + "'", long2 == 798993155480L);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 1439479789, 2205, 1378642386);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1439479789 for  must be in the range [2205,1378642386]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1378642386);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1378642386) + "'", int1 == (-1378642386));
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(524, 1439479962);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1439480486 + "'", int2 == 1439480486);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (-7971618));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 337, 1134640, (-5180732));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1681, (java.lang.Object) (-22462636));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1132));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1132 + "'", int1 == 1132);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(56222, 473292750);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 56222 * 473292750");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-6914L), (java.lang.Object) 47164942);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(588, 294328442, (-370), (-288965));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-266796), 10, 7418, (-101));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(98, (-4594848), 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(547, 411851622, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-16759743), (long) (-48));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-16759695L) + "'", long2 == (-16759695L));
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, 247112789, (-56201));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(324651698L, (long) (-1260));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-409061139480L) + "'", long2 == (-409061139480L));
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 980712, 959, (-1088));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-4368), (-635644), (-14252887));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-8617L), (-37719003240L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-37719011857L) + "'", long2 == (-37719011857L));
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-10000), (-1289464), (-239124363));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -10000 for hi! must be in the range [-1289464,-239124363]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 56201, (long) (-1184));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 57385L + "'", long2 == 57385L);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-6462774523691L), (-1000));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6462774523691000L + "'", long2 == 6462774523691000L);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-118319015L), (java.lang.Object) (-6236L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-85), (-574), 0);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-64), (long) (-35890));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-35954L) + "'", long2 == (-35954L));
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-778176), (-12390400), (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-778176) + "'", int3 == (-778176));
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 665, 103, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 100, 319980239, 882057856);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-1465L), (-47256213L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 69230352045");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, 411852142, 887, 31045);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30997 + "'", int4 == 30997);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-38838800), 28601, (-285));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 34023, (-1144), 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 34023 for hi! must be in the range [-1144,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-38838800), (-16759743), 411852142);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-8449560), 1439554100, 970);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-16104496));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16104496 + "'", int1 == 16104496);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(62310L, 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-10000), 0, (-46722045));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -10000 for hi! must be in the range [0,-46722045]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-56201), (java.lang.Object) (-481388400));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-36836617L), 210490000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7753739512330000L) + "'", long2 == (-7753739512330000L));
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-16104496), (-1418764));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-17523260) + "'", int2 == (-17523260));
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-411851622), (-336663));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -411851622 * -336663");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-96000), (long) 114863920);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-11026936320000L) + "'", long2 == (-11026936320000L));
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(125241157980L, 531);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 66503054887380L + "'", long2 == 66503054887380L);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-1526800L), (-819096961782523L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-819096963309323L) + "'", long2 == (-819096963309323L));
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 60837102, (-635644), 431);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 60837102 for hi! must be in the range [-635644,431]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-2182), (-30L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2152L) + "'", long2 == (-2152L));
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 1378642386, 51931, 44046);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(89655L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 89655 + "'", int1 == 89655);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-14070193L), 347545600);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4890033668300800L) + "'", long2 == (-4890033668300800L));
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-2182), (int) (byte) 1, 114866399);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 114864217 + "'", int3 == 114864217);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-10239367648L), (long) 14);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-10239367662L) + "'", long2 == (-10239367662L));
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 58115043, (long) 1439554110);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1381439067L) + "'", long2 == (-1381439067L));
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.joda.time.field.FieldUtils.safeMultiply((-6445102367633L), (-308541708));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -6445102367633 * -308541708");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-16759695L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-16759695) + "'", int1 == (-16759695));
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 10865750, (-93445970L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1015360548527500");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(54269L, 435386);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 23627962834L + "'", long2 == 23627962834L);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1173511359, (int) 'a', (-347204348), (-38838800));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-59950740) + "'", int4 == (-59950740));
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-4));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-32266L), (long) 5454);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-175978764) + "'", int2 == (-175978764));
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (byte) 100, 121438757L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 12143875700");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(2132);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2132) + "'", int1 == (-2132));
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-171947), (-77), (-22462636));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -171947 for hi! must be in the range [-77,-22462636]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-18027450), 4287360);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -18027450 * 4287360");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-63829679930L), (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -6382967993000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-849792292), 54000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-45888783768000L) + "'", long2 == (-45888783768000L));
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(0, 36140, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-16759743), 33950);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16725793) + "'", int2 == (-16725793));
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-44303700), 634880, 347545530);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -44303700 for  must be in the range [634880,347545530]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 32, (-87577344233175480L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-87577344233175448L) + "'", long2 == (-87577344233175448L));
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-31109), (-18027450));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-18058559) + "'", int2 == (-18058559));
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 269, (int) (byte) 1, (-18027450));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        org.joda.time.field.FieldUtils.verifyValueBounds("", 773, 103, 1439479789);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1439480486);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1439480486) + "'", int1 == (-1439480486));
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt((-96709775295L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -96709775295");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-4594848), 0, (-87));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((-306285732L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-306285732) + "'", int1 == (-306285732));
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(61, 16378246);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 999073006 + "'", int2 == 999073006);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(337463000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-337463000) + "'", int1 == (-337463000));
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-776771726), 1452704, (-126532));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-14), 114866436, 1439480000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(89655L, (long) 57958);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 147613L + "'", long2 == 147613L);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(269, 38169, 12211200, 16681080);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 13448081 + "'", int4 == 13448081);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 114863920, (long) (-640));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 114864560L + "'", long2 == 114864560L);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-34L), (long) 42228);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 42194L + "'", long2 == 42194L);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-10000), (java.lang.Object) 12278080);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-9940), (-31109), (int) (short) 10);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(54261, (-64306528), (-19), (-805319));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 324651698L, (java.lang.Object) (-200236812));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 38169, 155208L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5924134152L + "'", long2 == 5924134152L);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1093820), (-8617L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1085203L) + "'", long2 == (-1085203L));
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 10864277, (-87577344233175448L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 10864277 * -87577344233175448");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-35890), 617343);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -35890 * 617343");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-308541708), (-306285732), (-943));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2256918) + "'", int3 == (-2256918));
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(336663);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-336663) + "'", int1 == (-336663));
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-198688000L), (-3361938));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 667976737344000L + "'", long2 == 667976737344000L);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(28);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-28) + "'", int1 == (-28));
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 2480, (-7392017746529402592L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7392017746529405072L + "'", long2 == 7392017746529405072L);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(1439479930, 1157451, (-247112800), 347545546);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 251320687 + "'", int4 == 251320687);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-5178600), 1132, 56201);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53050 + "'", int3 == 53050);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(294328442, 411852142);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 294328442 * 411852142");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(336748L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 336748 + "'", int1 == 336748);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-3187481673375077L), 930);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2964357956238821610L) + "'", long2 == (-2964357956238821610L));
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-59344612), (-126532), 1439479962);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -59344612 for hi! must be in the range [-126532,1439479962]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(411851622, (-77));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 411851622 * -77");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-18027450), 129671487, (-206905806));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        org.joda.time.field.FieldUtils.verifyValueBounds("", (-16759743), (-38838800), 1439554110);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-10), (-35890));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-35900) + "'", int2 == (-35900));
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(129L, (-45888783768000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5919653106072000L) + "'", long2 == (-5919653106072000L));
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.field.FieldUtils.safeToInt(4452343276909248L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 4452343276909248");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 361400, (-306836));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-110890530400L) + "'", long2 == (-110890530400L));
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        int int1 = org.joda.time.field.FieldUtils.safeToInt(294330944L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 294330944 + "'", int1 == 294330944);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-56222), (java.lang.Object) (-77));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-59288497L), (java.lang.Object) 471872000);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-1330L), 930);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1236900L) + "'", long2 == (-1236900L));
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1268302), (-10240), (-776771726));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(64291334, 300);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 64291334 * 300");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-27936000), 21152985);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-6783015) + "'", int2 == (-6783015));
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(3058761464640L, (long) (-306072));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-936201239005294080L) + "'", long2 == (-936201239005294080L));
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 64291334);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64291334 + "'", int1 == 64291334);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(25532688);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-25532688) + "'", int1 == (-25532688));
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, 31378L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-31378L) + "'", long2 == (-31378L));
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 90783, 5454);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 495130482L + "'", long2 == 495130482L);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-56212), (-4368), 85, 1439554110);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1439493446 + "'", int4 == 1439493446);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1174118400), (-336663), 11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-520), 1439479992);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-748529595840L) + "'", long2 == (-748529595840L));
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-4352), 635274);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2764712448L) + "'", long2 == (-2764712448L));
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(443923636527142L, (long) 16233);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 443923636510909L + "'", long2 == 443923636510909L);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-126191885), (-73540), 443037);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 369725 + "'", int3 == 369725);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-11), (-25532688), (-290033));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-25242667) + "'", int3 == (-25242667));
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-23833747L), (-908L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 21641042276L + "'", long2 == 21641042276L);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-929983636736L), 923L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-858374896707328L) + "'", long2 == (-858374896707328L));
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-2693424));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2693424 + "'", int1 == 2693424);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(665, (-16759743), 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-16759091) + "'", int3 == (-16759091));
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-239124363), 16378246, 73, (-175978764));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 347489423, 16105260, (-10008));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 347489423 for  must be in the range [16105260,-10008]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        java.lang.Object obj0 = null;
        boolean boolean2 = org.joda.time.field.FieldUtils.equals(obj0, (java.lang.Object) 361903826L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 855, 38838800, (-1093820));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 88012474, 310711192, 31809);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(49920L, (long) 58115043);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-58065123L) + "'", long2 == (-58065123L));
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-16383699), 56212);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16327487) + "'", int2 == (-16327487));
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-220620), (-26853925));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -220620 * -26853925");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 1864L, (java.lang.Object) 74074L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract(0L, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-10L) + "'", long2 == (-10L));
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) 337, (-34L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-11458) + "'", int2 == (-11458));
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-2273L), (long) 31059);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-70597107) + "'", int2 == (-70597107));
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-12290517550L), (java.lang.Object) (-3187481673375077L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) (-46722045), (-12211200));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 570532235904000L + "'", long2 == 570532235904000L);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 90151, 0, (-473292750));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 90151 for  must be in the range [0,-473292750]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-348526226), 53078884);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-295447342) + "'", int2 == (-295447342));
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-11), (-27936000), (-286708395));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -11 for hi! must be in the range [-27936000,-286708395]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, 435386, (-129728466), (-86500));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-129206581) + "'", int4 == (-129206581));
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 10864277, (-355653908));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3863922572644516L) + "'", long2 == (-3863922572644516L));
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 42228, (-347545602L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 347587830L + "'", long2 == 347587830L);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-641L), (-347545600));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 222776729600L + "'", long2 == 222776729600L);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-1617L), (long) 1351296);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1352913L) + "'", long2 == (-1352913L));
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(2132, (int) (byte) 0, (-2066944), 33940);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2132 + "'", int4 == 2132);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-32), 891308, (-66324388));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-2516), (-411852512), 314507200);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-1134), 114863920, (-970));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-306285732), (java.lang.Object) (-1289464));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) 314504320, 64291334L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 378795654L + "'", long2 == 378795654L);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 78657304, (java.lang.Object) 22L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-27564308L), (long) (-53077751));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1463051476511308");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-56115));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-56115) + "'", int1 == (-56115));
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((long) (short) 1, (long) (-16105260));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16105260) + "'", int2 == (-16105260));
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1869436));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1869436 + "'", int1 == 1869436);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-10000));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10000 + "'", int1 == 10000);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(1857L, (-43324580L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-43322723L) + "'", long2 == (-43322723L));
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1477, 5514792);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8145347784L + "'", long2 == 8145347784L);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-323217421020L), 66503054887380L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-66826272308400L) + "'", long2 == (-66826272308400L));
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 347545546, (-27936000), 51931);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 635274, (-36836617L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 37471891L + "'", long2 == 37471891L);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(118612725, 814290);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 119427015 + "'", int2 == 119427015);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", (-38838810), 32296, (-56201));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -38838810 for hi! must be in the range [32296,-56201]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-336663), 338688232, 10865750);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -336663 for  must be in the range [338688232,10865750]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-247401754), (-12653200));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-260054954) + "'", int2 == (-260054954));
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-12290517550L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-12290517550L) + "'", long2 == (-12290517550L));
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        int int2 = org.joda.time.field.FieldUtils.safeAdd((-1134), 56201);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 55067 + "'", int2 == 55067);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(347545513, (-1838377), 524);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-6965) + "'", int3 == (-6965));
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-10008), 0, 247112789, 1439480000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1192357204 + "'", int4 == 1192357204);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 1192357204, 435386);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 519135633620744L + "'", long2 == 519135633620744L);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 22464800, 294330944, 55763320);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 22464800 for  must be in the range [294330944,55763320]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-16874142), 87);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1468050354) + "'", int2 == (-1468050354));
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-126532), 114399, (-81726));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 28, 2007360L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 56206080L + "'", long2 == 56206080L);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 2693424, (int) (byte) 1, 617343);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2693424 for hi! must be in the range [1,617343]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-35) + "'", int1 == (-35));
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-70597107), (-5454));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -70597107 * -5454");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) (-10000L), (java.lang.Object) (-424));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((long) (-93877), (long) (-2693424));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2787301L) + "'", long2 == (-2787301L));
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(1439484314, 24806);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1439509120 + "'", int2 == 1439509120);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 972, (-60836462));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-59133041064L) + "'", long2 == (-59133041064L));
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", (-6965), 1132, 12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -6965 for  must be in the range [1132,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 3395000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3395000 + "'", int1 == 3395000);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        long long2 = org.joda.time.field.FieldUtils.safeAdd((-182000L), (-776769210L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-776951210L) + "'", long2 == (-776951210L));
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-1144), (long) (-411852512));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 411851368L + "'", long2 == 411851368L);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, 16105260, 0, 64291334);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((-162007), (-1260));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 204128820 + "'", int2 == 204128820);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-1838377));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1838377 + "'", int1 == 1838377);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-849792292), (-980712), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(0L, 30169L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1869436);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1869436) + "'", int1 == (-1869436));
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-1184), 617343, 524);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply((-5250), 4287360);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -5250 * 4287360");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-347544570L), (-1468050354));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 510212929019277780L + "'", long2 == 510212929019277780L);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1452704, 285, (-107));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.field.FieldUtils.getWrappedValue((-320), 6153415, (-44303700));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply(1132, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 113200 + "'", int2 == 113200);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(3058761464640L, 197L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3058761464837L + "'", long2 == 3058761464837L);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) (-778176));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-778176) + "'", int1 == (-778176));
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-240663), (-175978764), 2097, 22464800);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3482205 + "'", int4 == 3482205);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("", 35, 16698191, 1173511369);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for  must be in the range [16698191,1173511369]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.joda.time.field.FieldUtils.getWrappedValue(113200, (-194), 1289464, (-20880));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MIN > MAX");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        int int1 = org.joda.time.field.FieldUtils.safeToInt((long) 1079597460);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1079597460 + "'", int1 == 1079597460);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        long long2 = org.joda.time.field.FieldUtils.safeAdd(18465385600L, 6327901449496L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6346366835096L + "'", long2 == 6346366835096L);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 4, 16698191, 187654974);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        int int1 = org.joda.time.field.FieldUtils.safeNegate((-5178600));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5178600 + "'", int1 == 5178600);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-114866500L), (-473292750));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 54365481667875000L + "'", long2 == 54365481667875000L);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((-123352824L), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1233528240L) + "'", long2 == (-1233528240L));
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-2L), 1565L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1567L) + "'", long2 == (-1567L));
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 814290, (java.lang.Object) 38838800);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 620, (long) (-2256918));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1399289160L) + "'", long2 == (-1399289160L));
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue((-58032), 118612725, (-2256918), 73);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1065883) + "'", int4 == (-1065883));
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        org.joda.time.DateTimeField dateTimeField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-5250), 999073006, 78446016);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(797, (-85), 96000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 797 + "'", int3 == 797);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds("hi!", 111551661, 47159692, 620);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 111551661 for hi! must be in the range [47159692,620]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        boolean boolean2 = org.joda.time.field.FieldUtils.equals((java.lang.Object) 382297, (java.lang.Object) (-9972L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiply(78446016, (-31040000));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: 78446016 * -31040000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(0, 89655, (-3200), (-70));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1144) + "'", int4 == (-1144));
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeField0, (-4240), (-336663), 64291334);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(89655, 96194);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 185849 + "'", int2 == 185849);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(1439480000, (-28601), 25532688);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8047760 + "'", int3 == 8047760);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-3200), (-347204348), 0);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((-146892482168359200L), (-703310L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -146892482168359200 * -703310");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) (-46722045), (-1085203L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-45636842L) + "'", long2 == (-45636842L));
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 18, (long) 891308);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-891290L) + "'", long2 == (-891290L));
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((-318748167337600000L), (long) (-129728466));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-318748167207871534L) + "'", long2 == (-318748167207871534L));
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        int int1 = org.joda.time.field.FieldUtils.safeNegate(1176022016);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1176022016) + "'", int1 == (-1176022016));
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 31809, (-44303700), 16233);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, 5514792, 269, (-11458));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        int int4 = org.joda.time.field.FieldUtils.getWrappedValue(47164942, (int) '4', 34023, 27565200);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 19633816 + "'", int4 == 19633816);
    }
}

