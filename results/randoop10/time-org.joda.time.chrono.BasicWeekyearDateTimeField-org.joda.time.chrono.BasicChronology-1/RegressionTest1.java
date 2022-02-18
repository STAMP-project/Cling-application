import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test00501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00501");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        boolean boolean4 = dateTimeZone2.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone5 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        long long8 = dateTimeZone6.previousTransition((long) ' ');
        java.lang.String str9 = dateTimeZone6.getID();
        java.lang.String str10 = dateTimeZone6.getID();
        long long12 = dateTimeZone6.previousTransition(115200000L);
        boolean boolean13 = dateTimeZone1.equals((java.lang.Object) dateTimeZone6);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone1.getOffset(readableInstant14);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str18 = dateTimeZone1.getNameKey(187200001L);
        boolean boolean19 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 115200000L + "'", long12 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test00502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00502");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        java.lang.String str8 = dateTimeZone0.getName((-1L));
        long long11 = dateTimeZone0.convertLocalToUTC(129660000L, true);
        boolean boolean12 = dateTimeZone0.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 129660000L + "'", long11 == 129660000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00503");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(360000000, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00504");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone0.isLocalDateTimeGap(localDateTime2);
        long long5 = dateTimeZone0.convertUTCToLocal(0L);
        java.lang.String str6 = dateTimeZone0.toString();
        long long9 = dateTimeZone0.convertLocalToUTC(100L, true);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long13 = dateTimeZone11.convertUTCToLocal(32L);
        java.lang.String str15 = dateTimeZone11.getName((long) 349200000);
        int int17 = dateTimeZone11.getStandardOffset(152L);
        long long19 = dateTimeZone11.previousTransition(0L);
        boolean boolean20 = dateTimeZone0.equals((java.lang.Object) long19);
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone0.getShortName((-187199965L), locale22);
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone0.getShortName((-417599900L), locale25);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3600032L + "'", long13 == 3600032L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+01:00" + "'", str15, "+01:00");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3600000 + "'", int17 == 3600000);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00" + "'", str26, "+00:00");
    }

    @Test
    public void test00505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00505");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(36060000, (-3600000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00506");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        int int8 = dateTimeZone0.getOffsetFromLocal(0L);
        java.lang.String str10 = dateTimeZone0.getShortName(0L);
        long long14 = dateTimeZone0.convertLocalToUTC((long) (byte) 0, false, 0L);
        int int16 = dateTimeZone0.getOffset((-127920000L));
        int int18 = dateTimeZone0.getOffsetFromLocal(359999998L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00507");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("UTC");
        int int3 = dateTimeZone1.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((long) (byte) 0, locale5);
        long long10 = dateTimeZone1.convertLocalToUTC(154320052L, true, 363659998L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 154320052L + "'", long10 == 154320052L);
    }

    @Test
    public void test00508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00508");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        int int4 = dateTimeZone0.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        boolean boolean6 = dateTimeZone5.isFixed();
        int int8 = dateTimeZone5.getStandardOffset(0L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone5.getShortName((-1L), locale10);
        int int13 = dateTimeZone5.getOffsetFromLocal(0L);
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) 115200000);
        int int17 = dateTimeZone5.getOffset((long) '4');
        int int19 = dateTimeZone5.getOffsetFromLocal(100L);
        long long21 = dateTimeZone5.previousTransition(1L);
        java.lang.String str23 = dateTimeZone5.getShortName(0L);
        java.util.TimeZone timeZone24 = dateTimeZone5.toTimeZone();
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone5.getShortName((long) 3600000, locale26);
        java.lang.String str29 = dateTimeZone5.getNameKey((-7200000L));
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        boolean boolean31 = dateTimeZone30.isFixed();
        int int33 = dateTimeZone30.getStandardOffset(0L);
        java.lang.String str35 = dateTimeZone30.getNameKey(1L);
        int int37 = dateTimeZone30.getOffset((-1L));
        java.lang.String str38 = dateTimeZone30.toString();
        java.lang.String str40 = dateTimeZone30.getName(32L);
        boolean boolean41 = dateTimeZone5.equals((java.lang.Object) 32L);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.UTC;
        boolean boolean43 = dateTimeZone42.isFixed();
        org.joda.time.LocalDateTime localDateTime44 = null;
        boolean boolean45 = dateTimeZone42.isLocalDateTimeGap(localDateTime44);
        long long48 = dateTimeZone42.adjustOffset((long) (short) 10, false);
        long long50 = dateTimeZone5.getMillisKeepLocal(dateTimeZone42, 349200000L);
        java.lang.Class<?> wildcardClass51 = dateTimeZone5.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UTC" + "'", str29, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "UTC" + "'", str35, "UTC");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "UTC" + "'", str38, "UTC");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00" + "'", str40, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 10L + "'", long48 == 10L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 349200000L + "'", long50 == 349200000L);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test00509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00509");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        boolean boolean4 = dateTimeZone0.isFixed();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone6.getShortName((long) 'a', locale8);
        long long12 = dateTimeZone6.adjustOffset((long) (byte) 10, true);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        boolean boolean14 = dateTimeZone13.isFixed();
        boolean boolean15 = dateTimeZone6.equals((java.lang.Object) dateTimeZone13);
        long long17 = dateTimeZone0.getMillisKeepLocal(dateTimeZone6, (long) (short) -1);
        long long20 = dateTimeZone6.convertLocalToUTC(356400000L, true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+100:00" + "'", str9, "+100:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-360000001L) + "'", long17 == (-360000001L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-3600000L) + "'", long20 == (-3600000L));
    }

    @Test
    public void test00510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00510");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        int int8 = dateTimeZone0.getOffsetFromLocal(0L);
        java.lang.String str10 = dateTimeZone0.getShortName(0L);
        long long14 = dateTimeZone0.convertLocalToUTC((long) (byte) 0, false, 0L);
        long long17 = dateTimeZone0.convertLocalToUTC((long) (short) 10, true);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone0.getName(0L, locale19);
        int int22 = dateTimeZone0.getStandardOffset((long) (byte) -1);
        long long24 = dateTimeZone0.previousTransition(360060000L);
        boolean boolean25 = dateTimeZone0.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 360060000L + "'", long24 == 360060000L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test00511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00511");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) 'a', locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getShortName(359999998L, locale6);
        java.lang.String str9 = dateTimeZone1.getNameKey((-3599903L));
        java.lang.String str11 = dateTimeZone1.getShortName((-360000000L));
        long long13 = dateTimeZone1.previousTransition(162000032L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+100:00" + "'", str4, "+100:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+100:00" + "'", str7, "+100:00");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+100:00" + "'", str11, "+100:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 162000032L + "'", long13 == 162000032L);
    }

    @Test
    public void test00512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00512");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (short) 0);
        java.lang.String str4 = dateTimeZone2.getName((long) (byte) 10);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+01:00" + "'", str4, "+01:00");
    }

    @Test
    public void test00513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00513");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        int int8 = dateTimeZone0.getOffsetFromLocal(0L);
        int int10 = dateTimeZone0.getStandardOffset((long) (byte) 10);
        boolean boolean11 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone12 = dateTimeZone0.toTimeZone();
        java.lang.String str14 = dateTimeZone0.getShortName((-181139900L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
    }

    @Test
    public void test00514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00514");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getName(10L, locale5);
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone0.isLocalDateTimeGap(localDateTime7);
        long long11 = dateTimeZone0.adjustOffset(1L, true);
        java.lang.Class<?> wildcardClass12 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00515");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        boolean boolean5 = dateTimeZone0.isStandardOffset(100L);
        java.lang.String str6 = dateTimeZone0.getID();
        java.lang.String str8 = dateTimeZone0.getShortName(1L);
        long long10 = dateTimeZone0.previousTransition(115200000L);
        boolean boolean11 = dateTimeZone0.isFixed();
        java.lang.String str12 = dateTimeZone0.getID();
        long long16 = dateTimeZone0.convertLocalToUTC(75600000L, false, 187199991L);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone0.getShortName((long) 1, locale18);
        long long22 = dateTimeZone0.adjustOffset((long) (-6720000), false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 115200000L + "'", long10 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 75600000L + "'", long16 == 75600000L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-6720000L) + "'", long22 == (-6720000L));
    }

    @Test
    public void test00516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00516");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(10);
        java.lang.String str3 = dateTimeZone1.getNameKey((-115199948L));
        long long6 = dateTimeZone1.adjustOffset(118800000L, true);
        long long9 = dateTimeZone1.adjustOffset(221280010L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 118800000L + "'", long6 == 118800000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 221280010L + "'", long9 == 221280010L);
    }

    @Test
    public void test00517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00517");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.010' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test00518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00518");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(36060000, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00519");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone3.getOffset(readableInstant4);
        int int7 = dateTimeZone3.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        boolean boolean9 = dateTimeZone8.isFixed();
        int int11 = dateTimeZone8.getStandardOffset(0L);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone8.getShortName((-1L), locale13);
        int int16 = dateTimeZone8.getOffsetFromLocal(0L);
        long long18 = dateTimeZone3.getMillisKeepLocal(dateTimeZone8, (long) 115200000);
        boolean boolean20 = dateTimeZone3.isStandardOffset(115200000L);
        int int22 = dateTimeZone3.getOffsetFromLocal((long) (short) 10);
        long long24 = dateTimeZone0.getMillisKeepLocal(dateTimeZone3, 1L);
        java.lang.String str25 = dateTimeZone0.toString();
        long long29 = dateTimeZone0.convertLocalToUTC((long) 600000, true, 0L);
        int int31 = dateTimeZone0.getOffsetFromLocal(356460000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 115200000L + "'", long18 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTC" + "'", str25, "UTC");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 600000L + "'", long29 == 600000L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test00520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00520");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getShortName((long) (byte) 100);
        java.lang.String str7 = dateTimeZone0.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        long long12 = dateTimeZone0.adjustOffset((long) (byte) 1, false);
        int int14 = dateTimeZone0.getOffsetFromLocal(0L);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        boolean boolean16 = dateTimeZone15.isFixed();
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone15.isLocalDateTimeGap(localDateTime17);
        long long21 = dateTimeZone15.convertLocalToUTC((long) 100, false);
        long long23 = dateTimeZone0.getMillisKeepLocal(dateTimeZone15, (long) 360000000);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone0.getOffset(readableInstant24);
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone0.getShortName(115200001L, locale27);
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone0.getShortName(131520097L, locale30);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 360000000L + "'", long23 == 360000000L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00" + "'", str28, "+00:00");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00" + "'", str31, "+00:00");
    }

    @Test
    public void test00521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00521");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00522");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getShortName((long) (byte) 100);
        int int7 = dateTimeZone0.getStandardOffset(359999999L);
        long long9 = dateTimeZone0.previousTransition(3600032L);
        java.lang.String str10 = dateTimeZone0.getID();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone11.getOffset(readableInstant12);
        int int15 = dateTimeZone11.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        boolean boolean17 = dateTimeZone16.isFixed();
        int int19 = dateTimeZone16.getStandardOffset(0L);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone16.getShortName((-1L), locale21);
        int int24 = dateTimeZone16.getOffsetFromLocal(0L);
        long long26 = dateTimeZone11.getMillisKeepLocal(dateTimeZone16, (long) 115200000);
        boolean boolean28 = dateTimeZone11.isStandardOffset(115200000L);
        long long31 = dateTimeZone11.convertLocalToUTC((long) 10, true);
        java.lang.String str32 = dateTimeZone11.toString();
        int int34 = dateTimeZone11.getOffset(52L);
        java.lang.String str36 = dateTimeZone11.getNameKey(0L);
        long long38 = dateTimeZone0.getMillisKeepLocal(dateTimeZone11, (-187799900L));
        java.lang.String str40 = dateTimeZone0.getShortName(0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600032L + "'", long9 == 3600032L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 115200000L + "'", long26 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L + "'", long31 == 10L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "UTC" + "'", str32, "UTC");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UTC" + "'", str36, "UTC");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-187799900L) + "'", long38 == (-187799900L));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00" + "'", str40, "+00:00");
    }

    @Test
    public void test00523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00523");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        int int8 = dateTimeZone0.getOffsetFromLocal(0L);
        int int10 = dateTimeZone0.getStandardOffset((long) (byte) 10);
        boolean boolean11 = dateTimeZone0.isFixed();
        boolean boolean13 = dateTimeZone0.isStandardOffset((long) (byte) 100);
        long long17 = dateTimeZone0.convertLocalToUTC((-118800000L), false, (long) (short) 10);
        java.lang.String str19 = dateTimeZone0.getNameKey(115199999L);
        org.joda.time.ReadableInstant readableInstant20 = null;
        int int21 = dateTimeZone0.getOffset(readableInstant20);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-118800000L) + "'", long17 == (-118800000L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test00524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00524");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getShortName((long) (byte) 100);
        java.lang.String str7 = dateTimeZone0.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        long long11 = dateTimeZone0.convertUTCToLocal(10L);
        boolean boolean13 = dateTimeZone0.isStandardOffset((long) 100);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone0.getName((long) '#', locale15);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone0.getName(110L, locale18);
        int int21 = dateTimeZone0.getOffset((-115200000L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test00525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00525");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(10);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone3.getOffset(readableInstant4);
        int int7 = dateTimeZone3.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        boolean boolean9 = dateTimeZone8.isFixed();
        int int11 = dateTimeZone8.getStandardOffset(0L);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone8.getShortName((-1L), locale13);
        int int16 = dateTimeZone8.getOffsetFromLocal(0L);
        long long18 = dateTimeZone3.getMillisKeepLocal(dateTimeZone8, (long) 115200000);
        boolean boolean20 = dateTimeZone3.isStandardOffset(115200000L);
        long long23 = dateTimeZone3.convertLocalToUTC((long) 10, true);
        java.lang.String str24 = dateTimeZone3.toString();
        int int26 = dateTimeZone3.getOffset(52L);
        java.lang.String str28 = dateTimeZone3.getNameKey(0L);
        java.lang.String str30 = dateTimeZone3.getName((long) 0);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forID("UTC");
        int int34 = dateTimeZone32.getStandardOffset(0L);
        java.util.Locale locale36 = null;
        java.lang.String str37 = dateTimeZone32.getShortName((long) (byte) 0, locale36);
        boolean boolean38 = dateTimeZone3.equals((java.lang.Object) locale36);
        long long40 = dateTimeZone3.nextTransition((long) 'a');
        java.lang.String str42 = dateTimeZone3.getName((-118799903L));
        java.util.Locale locale44 = null;
        java.lang.String str45 = dateTimeZone3.getShortName(464400001L, locale44);
        boolean boolean46 = dateTimeZone1.equals((java.lang.Object) str45);
        long long49 = dateTimeZone1.convertLocalToUTC((-3600000L), false);
        java.lang.Class<?> wildcardClass50 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+10:00" + "'", str2, "+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 115200000L + "'", long18 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTC" + "'", str24, "UTC");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UTC" + "'", str28, "UTC");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00" + "'", str30, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:00" + "'", str37, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 97L + "'", long40 == 97L);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00" + "'", str42, "+00:00");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+00:00" + "'", str45, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-39600000L) + "'", long49 == (-39600000L));
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test00526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00526");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        boolean boolean6 = dateTimeZone5.isFixed();
        long long8 = dateTimeZone5.previousTransition(0L);
        java.lang.String str9 = dateTimeZone5.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
    }

    @Test
    public void test00527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00527");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName(0L, locale5);
        java.lang.String str7 = dateTimeZone0.getID();
        java.lang.String str9 = dateTimeZone0.getNameKey((long) 115200000);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.lang.String str13 = dateTimeZone11.getShortName((long) 'a');
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone11.getShortName((long) (short) -1, locale15);
        int int18 = dateTimeZone11.getOffset((long) 115200000);
        int int20 = dateTimeZone11.getStandardOffset((long) (short) 10);
        java.lang.String str21 = dateTimeZone11.getID();
        long long23 = dateTimeZone0.getMillisKeepLocal(dateTimeZone11, (long) 0);
        org.joda.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = dateTimeZone0.isLocalDateTimeGap(localDateTime24);
        java.lang.String str26 = dateTimeZone0.toString();
        long long29 = dateTimeZone0.adjustOffset((-2L), true);
        org.joda.time.LocalDateTime localDateTime30 = null;
        boolean boolean31 = dateTimeZone0.isLocalDateTimeGap(localDateTime30);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 115200000 + "'", int18 == 115200000);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 115200000 + "'", int20 == 115200000);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+32:00" + "'", str21, "+32:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-115200000L) + "'", long23 == (-115200000L));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTC" + "'", str26, "UTC");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-2L) + "'", long29 == (-2L));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test00528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00528");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'a');
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(359999999L, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName(3599999L, locale6);
        java.lang.String str8 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.097" + "'", str4, "+00:00:00.097");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.097" + "'", str8, "+00:00:00.097");
    }

    @Test
    public void test00529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00529");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 363120000 + "'", int4 == 363120000);
    }

    @Test
    public void test00530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00530");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("UTC");
        int int3 = dateTimeZone1.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((long) (byte) 0, locale5);
        int int8 = dateTimeZone1.getOffset((long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone12.getName((long) ' ', locale14);
        boolean boolean16 = dateTimeZone10.equals((java.lang.Object) dateTimeZone12);
        boolean boolean17 = dateTimeZone1.equals((java.lang.Object) dateTimeZone12);
        long long19 = dateTimeZone1.nextTransition(100L);
        int int21 = dateTimeZone1.getOffset((-178080000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-01:00" + "'", str15, "-01:00");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test00531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00531");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone0.isLocalDateTimeGap(localDateTime2);
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 10);
        int int7 = dateTimeZone0.getOffset((long) (short) 1);
        int int9 = dateTimeZone0.getStandardOffset((long) 115200000);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone0.isLocalDateTimeGap(localDateTime10);
        int int13 = dateTimeZone0.getOffsetFromLocal((long) 115200000);
        boolean boolean15 = dateTimeZone0.isStandardOffset((-115199900L));
        long long17 = dateTimeZone0.convertUTCToLocal((-3600001L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-3600001L) + "'", long17 == (-3600001L));
    }

    @Test
    public void test00532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00532");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(127920000, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00533");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getNameKey(1L);
        long long7 = dateTimeZone0.convertUTCToLocal((long) (-1));
        java.lang.Class<?> wildcardClass8 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00534");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(3600000, 36060000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 36060000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00535");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long2 = dateTimeZone0.convertUTCToLocal((long) (byte) 0);
        java.lang.String str3 = dateTimeZone0.toString();
        long long6 = dateTimeZone0.adjustOffset((long) (short) 0, false);
        java.lang.String str8 = dateTimeZone0.getName(35L);
        long long10 = dateTimeZone0.convertUTCToLocal(0L);
        boolean boolean12 = dateTimeZone0.isStandardOffset(234000010L);
        long long14 = dateTimeZone0.previousTransition(0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test00536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00536");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getNameKey(1L);
        java.lang.String str7 = dateTimeZone0.getShortName((long) 100);
        long long10 = dateTimeZone0.adjustOffset((long) (short) 100, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        int int13 = dateTimeZone0.getOffset(1860097L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00537");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.lang.String str3 = dateTimeZone1.getShortName((long) 'a');
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((long) (short) -1, locale5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str8 = dateTimeZone1.toString();
        long long11 = dateTimeZone1.convertLocalToUTC((-302399900L), false);
        int int13 = dateTimeZone1.getOffset(115200000L);
        boolean boolean15 = dateTimeZone1.isStandardOffset((-306000000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+32:00" + "'", str3, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-417599900L) + "'", long11 == (-417599900L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 115200000 + "'", int13 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00538");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getShortName((long) (byte) 100);
        java.lang.String str7 = dateTimeZone0.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        boolean boolean11 = dateTimeZone0.isStandardOffset((long) (short) 1);
        long long15 = dateTimeZone0.convertLocalToUTC((long) 115200000, false, (long) (-1));
        boolean boolean17 = dateTimeZone0.isStandardOffset((long) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forID("UTC");
        long long21 = dateTimeZone0.getMillisKeepLocal(dateTimeZone19, 10L);
        java.lang.String str23 = dateTimeZone0.getNameKey((long) 600000);
        boolean boolean24 = dateTimeZone0.isFixed();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long28 = dateTimeZone26.previousTransition((long) (byte) -1);
        long long31 = dateTimeZone26.convertLocalToUTC(52L, false);
        java.util.TimeZone timeZone32 = dateTimeZone26.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
        boolean boolean34 = dateTimeZone0.equals((java.lang.Object) timeZone32);
        java.lang.Class<?> wildcardClass35 = timeZone32.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 52L + "'", long31 == 52L);
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00539");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(39120000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00540");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(360060000, 351120000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 351120000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00541");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("UTC");
        int int3 = dateTimeZone1.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((long) (byte) 0, locale5);
        int int8 = dateTimeZone1.getOffset((long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone12.getName((long) ' ', locale14);
        boolean boolean16 = dateTimeZone10.equals((java.lang.Object) dateTimeZone12);
        boolean boolean17 = dateTimeZone1.equals((java.lang.Object) dateTimeZone12);
        boolean boolean18 = dateTimeZone1.isFixed();
        java.lang.String str20 = dateTimeZone1.getNameKey(0L);
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = dateTimeZone1.isLocalDateTimeGap(localDateTime21);
        java.lang.String str24 = dateTimeZone1.getNameKey((-115199990L));
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone1.getName(3600010L, locale26);
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeZone1.getName((-111600001L), locale29);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-01:00" + "'", str15, "-01:00");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTC" + "'", str24, "UTC");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00" + "'", str30, "+00:00");
    }

    @Test
    public void test00542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00542");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.lang.String str6 = dateTimeZone4.getNameKey((long) (short) 10);
        java.lang.String str8 = dateTimeZone4.getName((long) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        boolean boolean10 = dateTimeZone9.isFixed();
        int int12 = dateTimeZone9.getStandardOffset(0L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone9.getShortName((-1L), locale14);
        java.lang.String str17 = dateTimeZone9.getShortName(1L);
        long long19 = dateTimeZone4.getMillisKeepLocal(dateTimeZone9, (long) (-1));
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone4.getName(0L, locale21);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone23.getOffset(readableInstant24);
        int int27 = dateTimeZone23.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        boolean boolean29 = dateTimeZone28.isFixed();
        int int31 = dateTimeZone28.getStandardOffset(0L);
        java.util.Locale locale33 = null;
        java.lang.String str34 = dateTimeZone28.getShortName((-1L), locale33);
        int int36 = dateTimeZone28.getOffsetFromLocal(0L);
        long long38 = dateTimeZone23.getMillisKeepLocal(dateTimeZone28, (long) 115200000);
        java.util.Locale locale40 = null;
        java.lang.String str41 = dateTimeZone23.getShortName((long) (short) 0, locale40);
        long long43 = dateTimeZone4.getMillisKeepLocal(dateTimeZone23, (long) ' ');
        java.lang.String str45 = dateTimeZone4.getNameKey(3600001L);
        java.lang.String str47 = dateTimeZone4.getNameKey((-302999900L));
        boolean boolean49 = dateTimeZone4.isStandardOffset(460800000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00" + "'", str34, "+00:00");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 115200000L + "'", long38 == 115200000L);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00" + "'", str41, "+00:00");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 32L + "'", long43 == 32L);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "UTC" + "'", str45, "UTC");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "UTC" + "'", str47, "UTC");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test00543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00543");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getNameKey(1L);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) "+97:00");
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        boolean boolean10 = dateTimeZone8.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone11 = dateTimeZone8.toTimeZone();
        boolean boolean12 = dateTimeZone8.isFixed();
        long long14 = dateTimeZone0.getMillisKeepLocal(dateTimeZone8, (long) 1);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        boolean boolean16 = dateTimeZone15.isFixed();
        int int18 = dateTimeZone15.getStandardOffset(0L);
        java.lang.String str20 = dateTimeZone15.getShortName((long) (byte) 100);
        java.lang.String str22 = dateTimeZone15.getShortName((long) (short) 0);
        java.lang.String str24 = dateTimeZone15.getShortName(0L);
        boolean boolean26 = dateTimeZone15.equals((java.lang.Object) '4');
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone15.getName(35L, locale28);
        long long31 = dateTimeZone8.getMillisKeepLocal(dateTimeZone15, (-232079900L));
        long long34 = dateTimeZone15.convertLocalToUTC((-3599903L), false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00" + "'", str29, "+00:00");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-232079900L) + "'", long31 == (-232079900L));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-3599903L) + "'", long34 == (-3599903L));
    }

    @Test
    public void test00544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00544");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(351120000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00545");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        int int4 = dateTimeZone0.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        boolean boolean6 = dateTimeZone5.isFixed();
        int int8 = dateTimeZone5.getStandardOffset(0L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone5.getShortName((-1L), locale10);
        int int13 = dateTimeZone5.getOffsetFromLocal(0L);
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) 115200000);
        boolean boolean17 = dateTimeZone0.isStandardOffset(115200000L);
        long long20 = dateTimeZone0.convertLocalToUTC((long) 10, true);
        java.lang.String str21 = dateTimeZone0.toString();
        int int23 = dateTimeZone0.getOffset(52L);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone0.getOffset(readableInstant24);
        boolean boolean27 = dateTimeZone0.isStandardOffset((long) 349200000);
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        int int31 = dateTimeZone29.getStandardOffset(0L);
        long long33 = dateTimeZone0.getMillisKeepLocal(dateTimeZone29, 72000001L);
        long long35 = dateTimeZone29.nextTransition(0L);
        java.util.Locale locale37 = null;
        java.lang.String str38 = dateTimeZone29.getShortName(547199998L, locale37);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.UTC;
        boolean boolean40 = dateTimeZone39.isFixed();
        org.joda.time.LocalDateTime localDateTime41 = null;
        boolean boolean42 = dateTimeZone39.isLocalDateTimeGap(localDateTime41);
        long long44 = dateTimeZone39.convertUTCToLocal(0L);
        int int46 = dateTimeZone39.getOffset(97L);
        int int48 = dateTimeZone39.getOffset(152L);
        long long50 = dateTimeZone29.getMillisKeepLocal(dateTimeZone39, 108480000L);
        java.lang.String str51 = dateTimeZone29.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 115200000 + "'", int31 == 115200000);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-43199999L) + "'", long33 == (-43199999L));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+32:00" + "'", str38, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 223680000L + "'", long50 == 223680000L);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "+32:00" + "'", str51, "+32:00");
    }

    @Test
    public void test00546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00546");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(360060000, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00547");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, 1920000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 1920000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00548");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        java.lang.String str3 = dateTimeZone1.getName(10L);
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        boolean boolean7 = dateTimeZone5.isStandardOffset(600000L);
        boolean boolean9 = dateTimeZone5.isStandardOffset(71999991L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-01:00" + "'", str3, "-01:00");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT-01:00");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00549");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', 187200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 187200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00550");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (byte) 10);
        long long5 = dateTimeZone2.adjustOffset((long) '#', false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone2.getShortName((-360000000L), locale8);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:10" + "'", str9, "+00:10");
    }

    @Test
    public void test00551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00551");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getNameKey(1L);
        int int7 = dateTimeZone0.getOffset((-1L));
        java.lang.String str8 = dateTimeZone0.toString();
        long long10 = dateTimeZone0.convertUTCToLocal((long) (short) 0);
        long long14 = dateTimeZone0.convertLocalToUTC((long) (short) 100, true, (-1L));
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone0.getName((-39600000L), locale16);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone0.getShortName((long) 1, locale19);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
    }

    @Test
    public void test00552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00552");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getNameKey(1L);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) "+97:00");
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        boolean boolean10 = dateTimeZone8.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone11 = dateTimeZone8.toTimeZone();
        boolean boolean12 = dateTimeZone8.isFixed();
        long long14 = dateTimeZone0.getMillisKeepLocal(dateTimeZone8, (long) 1);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        boolean boolean16 = dateTimeZone15.isFixed();
        int int18 = dateTimeZone15.getStandardOffset(0L);
        java.lang.String str20 = dateTimeZone15.getShortName((long) (byte) 100);
        java.lang.String str22 = dateTimeZone15.getShortName((long) (short) 0);
        java.lang.String str24 = dateTimeZone15.getShortName(0L);
        boolean boolean26 = dateTimeZone15.equals((java.lang.Object) '4');
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone15.getName(35L, locale28);
        long long31 = dateTimeZone8.getMillisKeepLocal(dateTimeZone15, (-232079900L));
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        boolean boolean33 = dateTimeZone32.isFixed();
        int int35 = dateTimeZone32.getStandardOffset(0L);
        java.lang.String str37 = dateTimeZone32.getShortName((long) (byte) 100);
        java.util.TimeZone timeZone38 = dateTimeZone32.toTimeZone();
        int int40 = dateTimeZone32.getOffset(115199991L);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone42 = dateTimeZone41.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forTimeZone(timeZone42);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone42);
        long long46 = dateTimeZone32.getMillisKeepLocal(dateTimeZone44, (long) 1);
        long long48 = dateTimeZone8.getMillisKeepLocal(dateTimeZone44, 360000097L);
        int int50 = dateTimeZone44.getOffset(391800032L);
        boolean boolean52 = dateTimeZone44.isStandardOffset(359999999L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00" + "'", str29, "+00:00");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-232079900L) + "'", long31 == (-232079900L));
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:00" + "'", str37, "+00:00");
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(timeZone42);
        org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1L + "'", long46 == 1L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 360000097L + "'", long48 == 360000097L);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test00553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00553");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        int int8 = dateTimeZone0.getOffsetFromLocal(0L);
        long long10 = dateTimeZone0.convertUTCToLocal((long) 0);
        long long12 = dateTimeZone0.previousTransition(0L);
        long long16 = dateTimeZone0.convertLocalToUTC((long) (short) 0, true, 0L);
        int int18 = dateTimeZone0.getStandardOffset((long) (short) 0);
        long long20 = dateTimeZone0.previousTransition(129660000L);
        long long24 = dateTimeZone0.convertLocalToUTC(108480000L, false, (-360000000L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 129660000L + "'", long20 == 129660000L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 108480000L + "'", long24 == 108480000L);
    }

    @Test
    public void test00554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00554");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getShortName((long) (byte) 100);
        java.lang.String str7 = dateTimeZone0.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        boolean boolean11 = dateTimeZone0.isStandardOffset((long) (short) 1);
        long long15 = dateTimeZone0.convertLocalToUTC((long) 115200000, false, (long) (-1));
        int int17 = dateTimeZone0.getOffsetFromLocal((long) (short) 0);
        java.lang.String str19 = dateTimeZone0.getNameKey((long) ' ');
        java.lang.String str20 = dateTimeZone0.toString();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        boolean boolean22 = dateTimeZone21.isFixed();
        int int24 = dateTimeZone21.getStandardOffset(0L);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone21.getShortName((-1L), locale26);
        int int29 = dateTimeZone21.getOffsetFromLocal(0L);
        long long31 = dateTimeZone21.convertUTCToLocal((long) 0);
        long long33 = dateTimeZone21.previousTransition(0L);
        long long35 = dateTimeZone0.getMillisKeepLocal(dateTimeZone21, 3600001L);
        java.util.TimeZone timeZone36 = dateTimeZone21.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        long long39 = dateTimeZone37.convertUTCToLocal((long) (short) -1);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 3600001L + "'", long35 == 3600001L);
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1L) + "'", long39 == (-1L));
    }

    @Test
    public void test00555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00555");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getNameKey(1L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getShortName((long) (short) -1, locale7);
        java.util.TimeZone timeZone9 = dateTimeZone0.toTimeZone();
        long long11 = dateTimeZone0.nextTransition(0L);
        long long13 = dateTimeZone0.convertUTCToLocal(359999991L);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone0.getOffset(readableInstant14);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 359999991L + "'", long13 == 359999991L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test00556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00556");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(351300000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00557");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(36060000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00558");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00559");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale2 = null;
        java.lang.String str3 = dateTimeZone0.getShortName((long) 115200000, locale2);
        boolean boolean4 = dateTimeZone0.isFixed();
        long long6 = dateTimeZone0.previousTransition((long) (short) 10);
        int int8 = dateTimeZone0.getOffset((long) (short) 0);
        long long11 = dateTimeZone0.convertLocalToUTC(359999999L, true);
        int int13 = dateTimeZone0.getOffsetFromLocal(3600052L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 359999999L + "'", long11 == 359999999L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00560");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1920000, 115200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 115200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00561");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        java.lang.String str7 = dateTimeZone0.getID();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        boolean boolean9 = dateTimeZone8.isFixed();
        int int11 = dateTimeZone8.getStandardOffset(0L);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone8.getShortName((-1L), locale13);
        int int16 = dateTimeZone8.getOffsetFromLocal(0L);
        java.lang.String str18 = dateTimeZone8.getShortName(0L);
        java.lang.String str20 = dateTimeZone8.getShortName(1L);
        long long22 = dateTimeZone0.getMillisKeepLocal(dateTimeZone8, (long) ' ');
        long long25 = dateTimeZone0.convertLocalToUTC(0L, true);
        java.lang.String str26 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTC" + "'", str26, "UTC");
    }

    @Test
    public void test00562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00562");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        java.lang.String str8 = dateTimeZone0.getShortName(1L);
        long long10 = dateTimeZone0.nextTransition((long) 0);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone0.getShortName(115200001L, locale12);
        java.lang.String str15 = dateTimeZone0.getShortName(356400000L);
        java.util.TimeZone timeZone16 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        int int19 = dateTimeZone17.getStandardOffset((-2L));
        java.lang.Class<?> wildcardClass20 = dateTimeZone17.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00563");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(360600000, 127920000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 127920000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00564");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (short) 0);
        boolean boolean4 = dateTimeZone2.isStandardOffset(115199999L);
        java.util.TimeZone timeZone5 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        boolean boolean8 = dateTimeZone6.isStandardOffset(3600000L);
        java.util.TimeZone timeZone9 = dateTimeZone6.toTimeZone();
        java.lang.Class<?> wildcardClass10 = dateTimeZone6.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00565");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        java.lang.String str8 = dateTimeZone0.getShortName(1L);
        long long10 = dateTimeZone0.nextTransition((long) 0);
        long long12 = dateTimeZone0.nextTransition((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (int) ' ');
        boolean boolean16 = dateTimeZone0.equals((java.lang.Object) '#');
        long long18 = dateTimeZone0.convertUTCToLocal((-3600000L));
        java.util.TimeZone timeZone19 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        java.lang.String str21 = dateTimeZone20.toString();
        long long24 = dateTimeZone20.convertLocalToUTC(115200001L, true);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        long long30 = dateTimeZone27.adjustOffset(32L, true);
        int int32 = dateTimeZone27.getOffsetFromLocal((long) '#');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone27);
        long long35 = dateTimeZone27.convertUTCToLocal(0L);
        long long37 = dateTimeZone20.getMillisKeepLocal(dateTimeZone27, 244199991L);
        java.lang.String str39 = dateTimeZone27.getNameKey(0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-3600000L) + "'", long18 == (-3600000L));
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 115200001L + "'", long24 == 115200001L);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 32L + "'", long30 == 32L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 349200000 + "'", int32 == 349200000);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 349200000L + "'", long35 == 349200000L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-105000009L) + "'", long37 == (-105000009L));
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test00566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00566");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long2 = dateTimeZone0.convertUTCToLocal((long) (byte) 0);
        java.lang.String str3 = dateTimeZone0.toString();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.lang.String str7 = dateTimeZone5.getShortName((long) 'a');
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone5.getShortName((long) (short) -1, locale9);
        int int12 = dateTimeZone5.getOffset((long) 115200000);
        long long14 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) (short) 0);
        boolean boolean16 = dateTimeZone0.isStandardOffset(359999999L);
        long long19 = dateTimeZone0.adjustOffset((-359999990L), false);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 1);
        long long24 = dateTimeZone22.nextTransition((-232079900L));
        boolean boolean25 = dateTimeZone0.equals((java.lang.Object) dateTimeZone22);
        int int27 = dateTimeZone22.getOffset((long) 10);
        boolean boolean29 = dateTimeZone22.isStandardOffset(0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115200000L) + "'", long14 == (-115200000L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-359999990L) + "'", long19 == (-359999990L));
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-232079900L) + "'", long24 == (-232079900L));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 360060000 + "'", int27 == 360060000);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test00567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00567");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        long long8 = dateTimeZone5.adjustOffset((long) 1, true);
        java.lang.String str10 = dateTimeZone5.getNameKey(151200000L);
        int int12 = dateTimeZone5.getOffsetFromLocal(234000010L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00568");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(351120000, 360060000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 360060000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00569");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        boolean boolean6 = dateTimeZone5.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        long long9 = dateTimeZone5.nextTransition(115200000L);
        long long11 = dateTimeZone5.convertUTCToLocal((long) 'a');
        boolean boolean13 = dateTimeZone5.isStandardOffset((-1L));
        java.util.TimeZone timeZone14 = dateTimeZone5.toTimeZone();
        long long16 = dateTimeZone5.nextTransition((-115199948L));
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone5.getShortName((-351299848L), locale18);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        int int22 = dateTimeZone5.getStandardOffset((-349199903L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 115200000L + "'", long9 == 115200000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-115199948L) + "'", long16 == (-115199948L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test00570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00570");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        boolean boolean2 = dateTimeZone0.isFixed();
        long long6 = dateTimeZone0.convertLocalToUTC(1L, true, (long) (byte) 10);
        java.util.TimeZone timeZone7 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.lang.String str11 = dateTimeZone9.getShortName(349200010L);
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = dateTimeZone9.isLocalDateTimeGap(localDateTime12);
        java.util.TimeZone timeZone14 = dateTimeZone9.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone15.getOffset(readableInstant16);
        long long21 = dateTimeZone15.convertLocalToUTC((long) (short) 1, false, 115200000L);
        org.joda.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = dateTimeZone15.isLocalDateTimeGap(localDateTime22);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00571");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(351300000, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00572");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(115200000);
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str5 = dateTimeZone1.getNameKey((long) (-3600000));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00573");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        int int4 = dateTimeZone0.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        boolean boolean6 = dateTimeZone5.isFixed();
        int int8 = dateTimeZone5.getStandardOffset(0L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone5.getShortName((-1L), locale10);
        int int13 = dateTimeZone5.getOffsetFromLocal(0L);
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) 115200000);
        int int17 = dateTimeZone5.getOffset((long) '4');
        java.lang.String str19 = dateTimeZone5.getShortName((long) (byte) 10);
        long long21 = dateTimeZone5.nextTransition((long) ' ');
        long long25 = dateTimeZone5.convertLocalToUTC(360060000L, false, (-7199999L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 360060000L + "'", long25 == 360060000L);
    }

    @Test
    public void test00574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00574");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        boolean boolean5 = dateTimeZone0.isStandardOffset(100L);
        java.lang.String str6 = dateTimeZone0.getID();
        boolean boolean8 = dateTimeZone0.equals((java.lang.Object) 1);
        int int10 = dateTimeZone0.getOffsetFromLocal(115200052L);
        java.util.TimeZone timeZone11 = dateTimeZone0.toTimeZone();
        int int13 = dateTimeZone0.getOffsetFromLocal(154320052L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00575");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long2 = dateTimeZone0.convertUTCToLocal((long) (byte) 0);
        int int4 = dateTimeZone0.getOffsetFromLocal((long) (-1));
        boolean boolean5 = dateTimeZone0.isFixed();
        java.lang.String str6 = dateTimeZone0.getID();
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone0.isLocalDateTimeGap(localDateTime7);
        int int10 = dateTimeZone0.getStandardOffset(187200000L);
        long long12 = dateTimeZone0.previousTransition((long) 363120000);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 363120000L + "'", long12 == 363120000L);
    }

    @Test
    public void test00576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00576");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        java.lang.String str3 = dateTimeZone0.getNameKey(52L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        int int6 = dateTimeZone0.getOffset(600000L);
        java.lang.Class<?> wildcardClass7 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00577");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone0.isLocalDateTimeGap(localDateTime2);
        long long5 = dateTimeZone0.convertUTCToLocal(0L);
        java.lang.String str6 = dateTimeZone0.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.String str9 = dateTimeZone0.getNameKey((-1L));
        java.lang.Class<?> wildcardClass10 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00578");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone0.isLocalDateTimeGap(localDateTime2);
        long long6 = dateTimeZone0.adjustOffset((long) (short) 10, false);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone0.getOffset(readableInstant7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        boolean boolean10 = dateTimeZone9.isFixed();
        int int12 = dateTimeZone9.getStandardOffset(0L);
        java.lang.String str14 = dateTimeZone9.getNameKey(1L);
        java.lang.String str16 = dateTimeZone9.getShortName((long) 100);
        boolean boolean17 = dateTimeZone0.equals((java.lang.Object) 100);
        java.lang.String str19 = dateTimeZone0.getName(32L);
        long long21 = dateTimeZone0.nextTransition(108480000L);
        java.lang.Class<?> wildcardClass22 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 108480000L + "'", long21 == 108480000L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00579");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        int int8 = dateTimeZone0.getOffsetFromLocal(0L);
        long long10 = dateTimeZone0.convertUTCToLocal((long) 0);
        long long12 = dateTimeZone0.previousTransition(0L);
        long long16 = dateTimeZone0.convertLocalToUTC((long) (short) 0, true, 0L);
        java.lang.Class<?> wildcardClass17 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00580");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone3.getName((long) ' ', locale5);
        boolean boolean7 = dateTimeZone1.equals((java.lang.Object) dateTimeZone3);
        long long9 = dateTimeZone1.convertUTCToLocal(52L);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        boolean boolean11 = dateTimeZone10.isFixed();
        int int13 = dateTimeZone10.getStandardOffset(0L);
        java.lang.String str15 = dateTimeZone10.getShortName((long) (byte) 100);
        java.lang.String str17 = dateTimeZone10.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = dateTimeZone10.getOffset(readableInstant18);
        long long23 = dateTimeZone10.convertLocalToUTC((long) (short) 10, false, (long) (short) 1);
        int int25 = dateTimeZone10.getOffset(115199999L);
        long long27 = dateTimeZone1.getMillisKeepLocal(dateTimeZone10, 10L);
        long long29 = dateTimeZone10.previousTransition((long) 97);
        long long32 = dateTimeZone10.convertLocalToUTC(3600032L, false);
        long long35 = dateTimeZone10.convertLocalToUTC((-7200000L), true);
        long long37 = dateTimeZone10.nextTransition(122460000L);
        long long41 = dateTimeZone10.convertLocalToUTC(223680000L, false, 349200110L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-01:00" + "'", str6, "-01:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 152L + "'", long9 == 152L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 110L + "'", long27 == 110L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 97L + "'", long29 == 97L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 3600032L + "'", long32 == 3600032L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-7200000L) + "'", long35 == (-7200000L));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 122460000L + "'", long37 == 122460000L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 223680000L + "'", long41 == 223680000L);
    }

    @Test
    public void test00581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00581");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', (-6720000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -6720000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00582");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getNameKey(1L);
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        long long9 = dateTimeZone0.adjustOffset((long) 100, false);
        java.lang.String str10 = dateTimeZone0.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
    }

    @Test
    public void test00583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00583");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("UTC");
        int int3 = dateTimeZone1.getStandardOffset(0L);
        java.lang.String str4 = dateTimeZone1.toString();
        long long6 = dateTimeZone1.previousTransition((-115199900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-115199900L) + "'", long6 == (-115199900L));
    }

    @Test
    public void test00584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00584");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1920000, 127920000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 127920000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00585");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        int int4 = dateTimeZone0.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        boolean boolean6 = dateTimeZone5.isFixed();
        int int8 = dateTimeZone5.getStandardOffset(0L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone5.getShortName((-1L), locale10);
        int int13 = dateTimeZone5.getOffsetFromLocal(0L);
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) 115200000);
        int int17 = dateTimeZone5.getOffset((long) '4');
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = dateTimeZone5.getOffset(readableInstant18);
        long long22 = dateTimeZone5.convertLocalToUTC((long) 'a', false);
        org.joda.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = dateTimeZone5.isLocalDateTimeGap(localDateTime23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        long long27 = dateTimeZone5.getMillisKeepLocal(dateTimeZone25, 129660000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 97L + "'", long22 == 97L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 129660000L + "'", long27 == 129660000L);
    }

    @Test
    public void test00586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00586");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, 39120000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 39120000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00587");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(127920000, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00588");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone0.isLocalDateTimeGap(localDateTime2);
        long long5 = dateTimeZone0.convertUTCToLocal(0L);
        java.lang.String str6 = dateTimeZone0.toString();
        boolean boolean7 = dateTimeZone0.isFixed();
        java.lang.Class<?> wildcardClass8 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00589");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00590");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("-01:00");
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone1.isLocalDateTimeGap(localDateTime3);
        java.lang.Class<?> wildcardClass5 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00591");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long2 = dateTimeZone0.convertUTCToLocal((long) (byte) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getName((long) (byte) 0, locale5);
        java.lang.String str7 = dateTimeZone0.toString();
        int int9 = dateTimeZone0.getOffsetFromLocal(79199999L);
        java.lang.Class<?> wildcardClass10 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00592");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("-01:00");
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long4 = dateTimeZone1.previousTransition((-3600001L));
        boolean boolean6 = dateTimeZone1.isStandardOffset((long) 360000000);
        int int8 = dateTimeZone1.getStandardOffset((-127920000L));
        long long10 = dateTimeZone1.nextTransition((long) (byte) 0);
        java.lang.String str12 = dateTimeZone1.getShortName(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3600001L) + "'", long4 == (-3600001L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-3600000) + "'", int8 == (-3600000));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-01:00" + "'", str12, "-01:00");
    }

    @Test
    public void test00593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00593");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.lang.String str6 = dateTimeZone4.getNameKey((long) (short) 10);
        java.lang.String str8 = dateTimeZone4.getName((long) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        boolean boolean10 = dateTimeZone9.isFixed();
        int int12 = dateTimeZone9.getStandardOffset(0L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone9.getShortName((-1L), locale14);
        java.lang.String str17 = dateTimeZone9.getShortName(1L);
        long long19 = dateTimeZone4.getMillisKeepLocal(dateTimeZone9, (long) (-1));
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone4.getName(0L, locale21);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone23.getOffset(readableInstant24);
        int int27 = dateTimeZone23.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        boolean boolean29 = dateTimeZone28.isFixed();
        int int31 = dateTimeZone28.getStandardOffset(0L);
        java.util.Locale locale33 = null;
        java.lang.String str34 = dateTimeZone28.getShortName((-1L), locale33);
        int int36 = dateTimeZone28.getOffsetFromLocal(0L);
        long long38 = dateTimeZone23.getMillisKeepLocal(dateTimeZone28, (long) 115200000);
        java.util.Locale locale40 = null;
        java.lang.String str41 = dateTimeZone23.getShortName((long) (short) 0, locale40);
        long long43 = dateTimeZone4.getMillisKeepLocal(dateTimeZone23, (long) ' ');
        java.lang.String str45 = dateTimeZone4.getNameKey(3600001L);
        long long49 = dateTimeZone4.convertLocalToUTC(707580000L, false, (-464399948L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00" + "'", str34, "+00:00");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 115200000L + "'", long38 == 115200000L);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00" + "'", str41, "+00:00");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 32L + "'", long43 == 32L);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "UTC" + "'", str45, "UTC");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 707580000L + "'", long49 == 707580000L);
    }

    @Test
    public void test00594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00594");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(363120000, (-6720000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -6720000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00595");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getShortName((long) (byte) 100);
        java.lang.String str7 = dateTimeZone0.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        boolean boolean11 = dateTimeZone0.isStandardOffset((long) (short) 1);
        long long15 = dateTimeZone0.convertLocalToUTC((long) 115200000, false, (long) (-1));
        boolean boolean17 = dateTimeZone0.isStandardOffset((long) 0);
        int int19 = dateTimeZone0.getOffsetFromLocal(118799999L);
        long long22 = dateTimeZone0.convertLocalToUTC((-111600000L), true);
        long long24 = dateTimeZone0.convertUTCToLocal((-60001L));
        java.lang.String str25 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-111600000L) + "'", long22 == (-111600000L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-60001L) + "'", long24 == (-60001L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTC" + "'", str25, "UTC");
    }

    @Test
    public void test00596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00596");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("UTC");
        int int3 = dateTimeZone1.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((long) (byte) 0, locale5);
        long long8 = dateTimeZone1.nextTransition((long) (byte) -1);
        long long10 = dateTimeZone1.convertUTCToLocal((long) (byte) 10);
        long long12 = dateTimeZone1.nextTransition((long) 1);
        int int14 = dateTimeZone1.getOffsetFromLocal(0L);
        java.lang.String str16 = dateTimeZone1.getName(115200001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
    }

    @Test
    public void test00597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00597");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, (int) '#');
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test00598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00598");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        int int8 = dateTimeZone0.getOffsetFromLocal(0L);
        int int10 = dateTimeZone0.getStandardOffset((long) (byte) 10);
        java.lang.String str12 = dateTimeZone0.getName((long) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone14 = dateTimeZone13.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        long long17 = dateTimeZone0.getMillisKeepLocal(dateTimeZone15, (long) (short) 100);
        boolean boolean19 = dateTimeZone0.isStandardOffset(97L);
        java.lang.String str21 = dateTimeZone0.getNameKey((long) (byte) 100);
        long long23 = dateTimeZone0.previousTransition(0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test00599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00599");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, (int) '4');
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test00600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00600");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 351120000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 351120000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00601");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(363120000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00602");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("UTC");
        int int3 = dateTimeZone1.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((long) (byte) 0, locale5);
        long long8 = dateTimeZone1.nextTransition((long) (byte) -1);
        long long10 = dateTimeZone1.convertUTCToLocal((long) (byte) 10);
        int int12 = dateTimeZone1.getStandardOffset(0L);
        java.util.TimeZone timeZone13 = dateTimeZone1.toTimeZone();
        java.lang.String str14 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
    }

    @Test
    public void test00603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00603");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        long long4 = dateTimeZone0.nextTransition((long) 115200000);
        boolean boolean5 = dateTimeZone0.isFixed();
        java.lang.Class<?> wildcardClass6 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 115200000L + "'", long4 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00604");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(36000000, 36600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 36600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00605");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale2 = null;
        java.lang.String str3 = dateTimeZone0.getShortName((long) 115200000, locale2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone0.getOffset(readableInstant4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        boolean boolean7 = dateTimeZone6.isFixed();
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone6.isLocalDateTimeGap(localDateTime8);
        long long11 = dateTimeZone6.convertUTCToLocal(0L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        long long14 = dateTimeZone6.convertUTCToLocal(359999999L);
        long long18 = dateTimeZone6.convertLocalToUTC((long) 'a', true, (-115200000L));
        long long20 = dateTimeZone0.getMillisKeepLocal(dateTimeZone6, (long) (byte) -1);
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone6.getOffset(readableInstant21);
        java.lang.String str24 = dateTimeZone6.getShortName(360000097L);
        java.lang.String str26 = dateTimeZone6.getNameKey(3600001L);
        java.lang.String str28 = dateTimeZone6.getName((long) (byte) 10);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 359999999L + "'", long14 == 359999999L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTC" + "'", str26, "UTC");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00" + "'", str28, "+00:00");
    }

    @Test
    public void test00606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00606");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getNameKey(1L);
        long long7 = dateTimeZone0.convertUTCToLocal((long) (-1));
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone0.getShortName((long) 1, locale9);
        long long13 = dateTimeZone0.adjustOffset((-7199999L), true);
        java.lang.Class<?> wildcardClass14 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-7199999L) + "'", long13 == (-7199999L));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00607");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(115200000, (-6720000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -6720000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00608");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        int int8 = dateTimeZone0.getOffsetFromLocal(0L);
        java.lang.String str10 = dateTimeZone0.getShortName(0L);
        long long14 = dateTimeZone0.convertLocalToUTC((long) (byte) 0, false, 0L);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone0.getShortName(0L, locale16);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone0.getShortName((long) (byte) 1, locale19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone0.getOffset(readableInstant21);
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone0.getShortName(127920010L, locale24);
        int int27 = dateTimeZone0.getStandardOffset((-719999900L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00" + "'", str25, "+00:00");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test00609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00609");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("UTC");
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 'a');
        java.lang.String str5 = dateTimeZone1.getShortName(118799999L);
        int int7 = dateTimeZone1.getStandardOffset(10L);
        java.lang.String str9 = dateTimeZone1.getShortName((-118860001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
    }

    @Test
    public void test00610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00610");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(187200000, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00611");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone0.isLocalDateTimeGap(localDateTime2);
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 10);
        int int7 = dateTimeZone0.getOffset((long) (short) 1);
        long long11 = dateTimeZone0.convertLocalToUTC((long) (short) 1, true, 1L);
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = dateTimeZone0.isLocalDateTimeGap(localDateTime12);
        long long15 = dateTimeZone0.convertUTCToLocal(100L);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        boolean boolean17 = dateTimeZone16.isFixed();
        int int19 = dateTimeZone16.getStandardOffset(0L);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone16.getShortName((-1L), locale21);
        java.lang.String str24 = dateTimeZone16.getShortName(1L);
        long long26 = dateTimeZone16.nextTransition((long) 0);
        long long28 = dateTimeZone16.nextTransition((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (int) ' ');
        boolean boolean32 = dateTimeZone16.equals((java.lang.Object) '#');
        long long34 = dateTimeZone16.convertUTCToLocal((-3600000L));
        java.util.TimeZone timeZone35 = dateTimeZone16.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        boolean boolean37 = dateTimeZone0.equals((java.lang.Object) timeZone35);
        java.lang.Class<?> wildcardClass38 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-3600000L) + "'", long34 == (-3600000L));
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test00612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00612");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        boolean boolean5 = dateTimeZone3.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone6 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        java.lang.String str9 = dateTimeZone7.getNameKey((long) (short) 10);
        boolean boolean10 = dateTimeZone7.isFixed();
        boolean boolean12 = dateTimeZone7.isStandardOffset(115200100L);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone7.getOffset(readableInstant13);
        java.util.TimeZone timeZone15 = dateTimeZone7.toTimeZone();
        boolean boolean16 = dateTimeZone2.equals((java.lang.Object) timeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        java.lang.String str19 = dateTimeZone17.getNameKey(71999904L);
        int int21 = dateTimeZone17.getOffset(349199999L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test00613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00613");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long2 = dateTimeZone0.convertUTCToLocal((long) (byte) 0);
        int int4 = dateTimeZone0.getOffsetFromLocal((long) (-1));
        long long7 = dateTimeZone0.adjustOffset((long) ' ', true);
        java.lang.String str8 = dateTimeZone0.getID();
        java.lang.String str9 = dateTimeZone0.getID();
        boolean boolean11 = dateTimeZone0.isStandardOffset((long) 187200000);
        long long13 = dateTimeZone0.nextTransition((long) 115200000);
        java.lang.String str15 = dateTimeZone0.getName(187199991L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 115200000L + "'", long13 == 115200000L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
    }

    @Test
    public void test00614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00614");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long2 = dateTimeZone0.convertUTCToLocal((long) (byte) 0);
        int int4 = dateTimeZone0.getOffsetFromLocal((long) (-1));
        long long7 = dateTimeZone0.adjustOffset((long) ' ', true);
        java.lang.String str8 = dateTimeZone0.getID();
        java.lang.String str9 = dateTimeZone0.getID();
        boolean boolean11 = dateTimeZone0.isStandardOffset((long) 187200000);
        long long13 = dateTimeZone0.convertUTCToLocal((long) (-3600000));
        java.lang.String str14 = dateTimeZone0.toString();
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone0.isLocalDateTimeGap(localDateTime15);
        java.lang.String str18 = dateTimeZone0.getShortName((-232079900L));
        java.lang.Class<?> wildcardClass19 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-3600000L) + "'", long13 == (-3600000L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00615");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(351120000, 115200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 115200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00616");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone0.isLocalDateTimeGap(localDateTime2);
        long long5 = dateTimeZone0.convertUTCToLocal(0L);
        java.lang.String str6 = dateTimeZone0.toString();
        long long9 = dateTimeZone0.convertLocalToUTC(100L, true);
        java.lang.String str11 = dateTimeZone0.getName((long) (short) 1);
        long long15 = dateTimeZone0.convertLocalToUTC(356460000L, false, 42L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 356460000L + "'", long15 == 356460000L);
    }

    @Test
    public void test00617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00617");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        boolean boolean5 = dateTimeZone0.isStandardOffset(100L);
        java.lang.String str6 = dateTimeZone0.getID();
        long long8 = dateTimeZone0.previousTransition((long) (short) 10);
        java.util.TimeZone timeZone9 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.String str11 = dateTimeZone10.toString();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        boolean boolean13 = dateTimeZone12.isFixed();
        int int15 = dateTimeZone12.getStandardOffset(0L);
        java.lang.String str17 = dateTimeZone12.getShortName((long) (byte) 100);
        long long19 = dateTimeZone12.previousTransition((long) (short) 100);
        long long21 = dateTimeZone10.getMillisKeepLocal(dateTimeZone12, 127499999L);
        java.lang.Class<?> wildcardClass22 = dateTimeZone12.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 127499999L + "'", long21 == 127499999L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00618");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        java.lang.String str7 = dateTimeZone0.getID();
        java.util.TimeZone timeZone8 = dateTimeZone0.toTimeZone();
        java.lang.String str9 = dateTimeZone0.toString();
        long long11 = dateTimeZone0.nextTransition(35L);
        java.lang.String str13 = dateTimeZone0.getNameKey((-417599900L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
    }

    @Test
    public void test00619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00619");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone0.isLocalDateTimeGap(localDateTime2);
        long long6 = dateTimeZone0.adjustOffset((long) (short) 10, false);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone0.getOffset(readableInstant7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        boolean boolean10 = dateTimeZone9.isFixed();
        int int12 = dateTimeZone9.getStandardOffset(0L);
        java.lang.String str14 = dateTimeZone9.getNameKey(1L);
        java.lang.String str16 = dateTimeZone9.getShortName((long) 100);
        boolean boolean17 = dateTimeZone0.equals((java.lang.Object) 100);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        long long20 = dateTimeZone18.convertUTCToLocal((long) (byte) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        boolean boolean22 = dateTimeZone0.equals((java.lang.Object) dateTimeZone18);
        java.lang.String str24 = dateTimeZone0.getName(3599999L);
        int int26 = dateTimeZone0.getOffset(190800000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test00620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00620");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        boolean boolean2 = dateTimeZone0.isFixed();
        int int4 = dateTimeZone0.getOffsetFromLocal((long) 1);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = dateTimeZone0.isLocalDateTimeGap(localDateTime5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        boolean boolean8 = dateTimeZone7.isFixed();
        int int10 = dateTimeZone7.getStandardOffset(0L);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone7.getShortName((-1L), locale12);
        int int15 = dateTimeZone7.getOffsetFromLocal(0L);
        boolean boolean16 = dateTimeZone0.equals((java.lang.Object) dateTimeZone7);
        long long20 = dateTimeZone7.convertLocalToUTC(391800032L, false, (long) 127920000);
        boolean boolean21 = dateTimeZone7.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 391800032L + "'", long20 == 391800032L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test00621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00621");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        int int4 = dateTimeZone0.getOffset((long) ' ');
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00622");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.lang.String str3 = dateTimeZone1.getShortName((long) 'a');
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((long) (short) -1, locale5);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName((long) 'a', locale8);
        java.lang.Class<?> wildcardClass10 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+32:00" + "'", str3, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+32:00" + "'", str9, "+32:00");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00623");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        int int4 = dateTimeZone0.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        boolean boolean6 = dateTimeZone5.isFixed();
        int int8 = dateTimeZone5.getStandardOffset(0L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone5.getShortName((-1L), locale10);
        int int13 = dateTimeZone5.getOffsetFromLocal(0L);
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) 115200000);
        boolean boolean17 = dateTimeZone0.isStandardOffset(115200000L);
        long long20 = dateTimeZone0.convertLocalToUTC((long) 10, true);
        java.lang.String str21 = dateTimeZone0.toString();
        int int23 = dateTimeZone0.getOffset(52L);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone0.getOffset(readableInstant24);
        int int27 = dateTimeZone0.getStandardOffset(97L);
        java.lang.String str29 = dateTimeZone0.getName(100L);
        int int31 = dateTimeZone0.getOffset((long) 100);
        boolean boolean32 = dateTimeZone0.isFixed();
        long long35 = dateTimeZone0.convertLocalToUTC(127920000L, false);
        java.lang.String str36 = dateTimeZone0.getID();
        java.lang.Class<?> wildcardClass37 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00" + "'", str29, "+00:00");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 127920000L + "'", long35 == 127920000L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UTC" + "'", str36, "UTC");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test00624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00624");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffset(1L);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        int int7 = dateTimeZone1.getStandardOffset((long) 100);
        boolean boolean8 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone9 = dateTimeZone1.toTimeZone();
        java.lang.Class<?> wildcardClass10 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 115200000 + "'", int7 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00625");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(36600000, 1920000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 1920000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00626");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long2 = dateTimeZone0.convertUTCToLocal((long) (byte) 0);
        java.lang.String str3 = dateTimeZone0.toString();
        long long5 = dateTimeZone0.convertUTCToLocal(0L);
        int int7 = dateTimeZone0.getOffset((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.010" + "'", str3, "+00:00:00.010");
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test00627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00627");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(351300000, 351300000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 351300000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00628");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getNameKey(1L);
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        long long11 = dateTimeZone8.convertLocalToUTC(1L, true);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone8.getName((-7260001L), locale13);
        long long17 = dateTimeZone8.adjustOffset(3600001L, false);
        java.lang.String str18 = dateTimeZone8.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3600001L + "'", long17 == 3600001L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
    }

    @Test
    public void test00629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00629");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale2 = null;
        java.lang.String str3 = dateTimeZone0.getShortName((long) 115200000, locale2);
        boolean boolean5 = dateTimeZone0.isStandardOffset(360000097L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        boolean boolean8 = dateTimeZone7.isFixed();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        boolean boolean10 = dateTimeZone9.isFixed();
        int int12 = dateTimeZone9.getStandardOffset(0L);
        java.lang.String str14 = dateTimeZone9.getNameKey(1L);
        int int16 = dateTimeZone9.getOffset((-1L));
        java.lang.String str17 = dateTimeZone9.toString();
        java.lang.String str19 = dateTimeZone9.getName(32L);
        boolean boolean20 = dateTimeZone7.equals((java.lang.Object) dateTimeZone9);
        boolean boolean21 = dateTimeZone0.equals((java.lang.Object) dateTimeZone7);
        java.lang.String str23 = dateTimeZone7.getNameKey(360000000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
    }

    @Test
    public void test00630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00630");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getShortName((long) (byte) 100);
        java.lang.String str7 = dateTimeZone0.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        boolean boolean11 = dateTimeZone0.isStandardOffset((long) (short) 1);
        long long15 = dateTimeZone0.convertLocalToUTC((long) 115200000, false, (long) (-1));
        boolean boolean17 = dateTimeZone0.isStandardOffset((long) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forID("UTC");
        long long21 = dateTimeZone0.getMillisKeepLocal(dateTimeZone19, 10L);
        java.lang.String str23 = dateTimeZone0.getNameKey((long) 600000);
        boolean boolean24 = dateTimeZone0.isFixed();
        long long26 = dateTimeZone0.convertUTCToLocal((long) (short) 100);
        boolean boolean27 = dateTimeZone0.isFixed();
        int int29 = dateTimeZone0.getOffset((-360000000L));
        int int31 = dateTimeZone0.getStandardOffset((-302399900L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test00631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00631");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone0.isLocalDateTimeGap(localDateTime2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone0.getOffset(readableInstant4);
        boolean boolean6 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone7 = dateTimeZone0.toTimeZone();
        int int9 = dateTimeZone0.getOffset((-187859900L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00632");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        int int4 = dateTimeZone0.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        boolean boolean6 = dateTimeZone5.isFixed();
        int int8 = dateTimeZone5.getStandardOffset(0L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone5.getShortName((-1L), locale10);
        int int13 = dateTimeZone5.getOffsetFromLocal(0L);
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) 115200000);
        boolean boolean17 = dateTimeZone0.isStandardOffset(115200000L);
        java.lang.String str19 = dateTimeZone0.getName(0L);
        java.util.TimeZone timeZone20 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        int int23 = dateTimeZone21.getStandardOffset((-115199999L));
        long long25 = dateTimeZone21.nextTransition(359999999L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 359999999L + "'", long25 == 359999999L);
    }

    @Test
    public void test00633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00633");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, 349200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 349200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00634");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00635");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(5700000, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00636");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) ' ', locale3);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffset((long) 115200000);
        java.lang.Class<?> wildcardClass8 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-01:00" + "'", str4, "-01:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-3600000) + "'", int7 == (-3600000));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00637");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        int int4 = dateTimeZone0.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        boolean boolean6 = dateTimeZone5.isFixed();
        int int8 = dateTimeZone5.getStandardOffset(0L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone5.getShortName((-1L), locale10);
        int int13 = dateTimeZone5.getOffsetFromLocal(0L);
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) 115200000);
        java.lang.String str17 = dateTimeZone0.getShortName((long) '4');
        boolean boolean18 = dateTimeZone0.isFixed();
        long long20 = dateTimeZone0.convertUTCToLocal((long) ' ');
        boolean boolean22 = dateTimeZone0.isStandardOffset(0L);
        java.lang.String str24 = dateTimeZone0.getName((-359999900L));
        long long26 = dateTimeZone0.convertUTCToLocal(356460000L);
        org.joda.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = dateTimeZone0.isLocalDateTimeGap(localDateTime27);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        boolean boolean31 = dateTimeZone29.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone32 = dateTimeZone29.toTimeZone();
        java.util.Locale locale34 = null;
        java.lang.String str35 = dateTimeZone29.getName(10L, locale34);
        int int37 = dateTimeZone29.getOffsetFromLocal(115199999L);
        int int39 = dateTimeZone29.getOffset(3600100L);
        boolean boolean40 = dateTimeZone0.equals((java.lang.Object) 3600100L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 356460000L + "'", long26 == 356460000L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00" + "'", str35, "+00:00");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test00638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00638");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', 126060000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 126060000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00639");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) 'a', locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (short) 0, locale6);
        long long9 = dateTimeZone1.convertUTCToLocal((-1L));
        long long13 = dateTimeZone1.convertLocalToUTC(0L, false, (long) 97);
        long long16 = dateTimeZone1.adjustOffset((-7200000L), true);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) '4');
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant20 = null;
        int int21 = dateTimeZone19.getOffset(readableInstant20);
        int int23 = dateTimeZone19.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        boolean boolean25 = dateTimeZone24.isFixed();
        int int27 = dateTimeZone24.getStandardOffset(0L);
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeZone24.getShortName((-1L), locale29);
        int int32 = dateTimeZone24.getOffsetFromLocal(0L);
        long long34 = dateTimeZone19.getMillisKeepLocal(dateTimeZone24, (long) 115200000);
        boolean boolean36 = dateTimeZone19.isStandardOffset(115200000L);
        long long39 = dateTimeZone19.convertLocalToUTC((long) 10, true);
        java.lang.String str40 = dateTimeZone19.toString();
        int int42 = dateTimeZone19.getOffset(52L);
        java.lang.String str44 = dateTimeZone19.getNameKey(0L);
        java.lang.String str46 = dateTimeZone19.getName((long) 0);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forID("UTC");
        int int50 = dateTimeZone48.getStandardOffset(0L);
        java.util.Locale locale52 = null;
        java.lang.String str53 = dateTimeZone48.getShortName((long) (byte) 0, locale52);
        boolean boolean54 = dateTimeZone19.equals((java.lang.Object) locale52);
        long long56 = dateTimeZone19.nextTransition((long) 'a');
        long long59 = dateTimeZone19.adjustOffset((long) (short) 100, true);
        long long61 = dateTimeZone18.getMillisKeepLocal(dateTimeZone19, 359999998L);
        long long63 = dateTimeZone18.nextTransition(234000010L);
        boolean boolean64 = dateTimeZone1.equals((java.lang.Object) 234000010L);
        java.lang.Class<?> wildcardClass65 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+100:00" + "'", str4, "+100:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+100:00" + "'", str7, "+100:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 359999999L + "'", long9 == 359999999L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-360000000L) + "'", long13 == (-360000000L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-7200000L) + "'", long16 == (-7200000L));
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00" + "'", str30, "+00:00");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 115200000L + "'", long34 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L + "'", long39 == 10L);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "UTC" + "'", str40, "UTC");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "UTC" + "'", str44, "UTC");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00" + "'", str46, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "+00:00" + "'", str53, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 97L + "'", long56 == 97L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 100L + "'", long59 == 100L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 547199998L + "'", long61 == 547199998L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 234000010L + "'", long63 == 234000010L);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test00640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00640");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        int int4 = dateTimeZone0.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        boolean boolean6 = dateTimeZone5.isFixed();
        int int8 = dateTimeZone5.getStandardOffset(0L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone5.getShortName((-1L), locale10);
        int int13 = dateTimeZone5.getOffsetFromLocal(0L);
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) 115200000);
        boolean boolean17 = dateTimeZone0.isStandardOffset(115200000L);
        long long20 = dateTimeZone0.convertLocalToUTC((long) 10, true);
        java.lang.String str22 = dateTimeZone0.getNameKey((long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        boolean boolean24 = dateTimeZone23.isFixed();
        org.joda.time.LocalDateTime localDateTime25 = null;
        boolean boolean26 = dateTimeZone23.isLocalDateTimeGap(localDateTime25);
        long long29 = dateTimeZone23.adjustOffset((long) (short) 10, false);
        boolean boolean30 = dateTimeZone0.equals((java.lang.Object) dateTimeZone23);
        java.lang.String str31 = dateTimeZone0.getID();
        java.lang.Class<?> wildcardClass32 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "UTC" + "'", str31, "UTC");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test00641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00641");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        long long4 = dateTimeZone0.nextTransition((long) 115200000);
        java.lang.String str6 = dateTimeZone0.getNameKey((long) (short) 100);
        long long8 = dateTimeZone0.nextTransition((-360000000L));
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone0.getShortName((-39600000L), locale10);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 115200000L + "'", long4 == 115200000L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-360000000L) + "'", long8 == (-360000000L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
    }

    @Test
    public void test00642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00642");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(127920000, 39120000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 39120000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00643");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone0.isLocalDateTimeGap(localDateTime4);
        long long7 = dateTimeZone0.convertUTCToLocal(115199991L);
        java.lang.String str9 = dateTimeZone0.getShortName(359999989L);
        java.lang.String str11 = dateTimeZone0.getShortName(190800000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 115199991L + "'", long7 == 115199991L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
    }

    @Test
    public void test00644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00644");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (int) ' ');
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getName((long) 10, locale4);
        long long8 = dateTimeZone2.convertLocalToUTC((long) (byte) 0, false);
        boolean boolean9 = dateTimeZone2.isFixed();
        long long13 = dateTimeZone2.convertLocalToUTC((-115200001L), false, 360000000L);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        boolean boolean15 = dateTimeZone14.isFixed();
        int int17 = dateTimeZone14.getStandardOffset(0L);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone14.getShortName((-1L), locale19);
        int int22 = dateTimeZone14.getOffsetFromLocal(0L);
        java.lang.String str24 = dateTimeZone14.getShortName(0L);
        java.lang.String str26 = dateTimeZone14.getShortName(359999999L);
        int int28 = dateTimeZone14.getOffsetFromLocal(52L);
        int int30 = dateTimeZone14.getOffset((long) 'a');
        long long32 = dateTimeZone2.getMillisKeepLocal(dateTimeZone14, 824399997L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+35:32" + "'", str5, "+35:32");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-127920000L) + "'", long8 == (-127920000L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-243120001L) + "'", long13 == (-243120001L));
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00" + "'", str26, "+00:00");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 952319997L + "'", long32 == 952319997L);
    }

    @Test
    public void test00645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00645");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        java.lang.String str8 = dateTimeZone0.getShortName(1L);
        java.lang.String str9 = dateTimeZone0.getID();
        long long12 = dateTimeZone0.convertLocalToUTC(359999999L, true);
        long long16 = dateTimeZone0.convertLocalToUTC(10L, true, (long) 10);
        boolean boolean17 = dateTimeZone0.isFixed();
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone0.getShortName((long) '#', locale19);
        int int22 = dateTimeZone0.getStandardOffset((long) (byte) 10);
        boolean boolean24 = dateTimeZone0.isStandardOffset((-306000000L));
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant26 = null;
        int int27 = dateTimeZone25.getOffset(readableInstant26);
        int int29 = dateTimeZone25.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        boolean boolean31 = dateTimeZone30.isFixed();
        int int33 = dateTimeZone30.getStandardOffset(0L);
        java.util.Locale locale35 = null;
        java.lang.String str36 = dateTimeZone30.getShortName((-1L), locale35);
        int int38 = dateTimeZone30.getOffsetFromLocal(0L);
        long long40 = dateTimeZone25.getMillisKeepLocal(dateTimeZone30, (long) 115200000);
        java.lang.String str42 = dateTimeZone30.getShortName((long) (short) 1);
        java.util.Locale locale44 = null;
        java.lang.String str45 = dateTimeZone30.getShortName((long) 10, locale44);
        long long47 = dateTimeZone0.getMillisKeepLocal(dateTimeZone30, 100L);
        boolean boolean49 = dateTimeZone30.isStandardOffset((-126060001L));
        java.util.TimeZone timeZone50 = dateTimeZone30.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 359999999L + "'", long12 == 359999999L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00" + "'", str36, "+00:00");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 115200000L + "'", long40 == 115200000L);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00" + "'", str42, "+00:00");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+00:00" + "'", str45, "+00:00");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 100L + "'", long47 == 100L);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(timeZone50);
        org.junit.Assert.assertEquals(timeZone50.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test00646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00646");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getNameKey(1L);
        int int7 = dateTimeZone0.getOffsetFromLocal(0L);
        java.lang.String str9 = dateTimeZone0.getShortName((long) (-1));
        java.lang.String str10 = dateTimeZone0.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
    }

    @Test
    public void test00647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00647");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00648");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        int int4 = dateTimeZone0.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        boolean boolean6 = dateTimeZone5.isFixed();
        int int8 = dateTimeZone5.getStandardOffset(0L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone5.getShortName((-1L), locale10);
        int int13 = dateTimeZone5.getOffsetFromLocal(0L);
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) 115200000);
        boolean boolean17 = dateTimeZone0.isStandardOffset(115200000L);
        long long20 = dateTimeZone0.convertLocalToUTC((long) 10, true);
        java.lang.String str22 = dateTimeZone0.getNameKey((long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        boolean boolean24 = dateTimeZone23.isFixed();
        org.joda.time.LocalDateTime localDateTime25 = null;
        boolean boolean26 = dateTimeZone23.isLocalDateTimeGap(localDateTime25);
        long long29 = dateTimeZone23.adjustOffset((long) (short) 10, false);
        boolean boolean30 = dateTimeZone0.equals((java.lang.Object) dateTimeZone23);
        int int32 = dateTimeZone0.getOffset((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime33 = null;
        boolean boolean34 = dateTimeZone0.isLocalDateTimeGap(localDateTime33);
        java.lang.String str35 = dateTimeZone0.toString();
        long long37 = dateTimeZone0.nextTransition((long) '4');
        java.lang.Class<?> wildcardClass38 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "UTC" + "'", str35, "UTC");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 52L + "'", long37 == 52L);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test00649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00649");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(36600000, 351300000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 351300000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00650");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) 'a', locale3);
        long long7 = dateTimeZone1.adjustOffset((long) (byte) 10, true);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        boolean boolean9 = dateTimeZone8.isFixed();
        boolean boolean10 = dateTimeZone1.equals((java.lang.Object) dateTimeZone8);
        java.lang.String str12 = dateTimeZone8.getName(1L);
        java.lang.String str13 = dateTimeZone8.toString();
        java.lang.Class<?> wildcardClass14 = dateTimeZone8.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+100:00" + "'", str4, "+100:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00651");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(36000000, 36000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 36000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00652");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone5.getOffset(readableInstant6);
        int int9 = dateTimeZone5.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        boolean boolean11 = dateTimeZone10.isFixed();
        int int13 = dateTimeZone10.getStandardOffset(0L);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone10.getShortName((-1L), locale15);
        int int18 = dateTimeZone10.getOffsetFromLocal(0L);
        long long20 = dateTimeZone5.getMillisKeepLocal(dateTimeZone10, (long) 115200000);
        java.lang.String str22 = dateTimeZone5.getShortName((long) '4');
        boolean boolean23 = dateTimeZone4.equals((java.lang.Object) dateTimeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        java.lang.String str26 = dateTimeZone5.getName(187200001L);
        int int28 = dateTimeZone5.getOffset((long) (-6720000));
        long long30 = dateTimeZone5.nextTransition((long) 349200000);
        int int32 = dateTimeZone5.getStandardOffset(190800000L);
        long long35 = dateTimeZone5.convertLocalToUTC((-719999910L), true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 115200000L + "'", long20 == 115200000L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00" + "'", str26, "+00:00");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 349200000L + "'", long30 == 349200000L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-719999910L) + "'", long35 == (-719999910L));
    }

    @Test
    public void test00653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00653");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("UTC");
        int int3 = dateTimeZone1.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((long) (byte) 0, locale5);
        int int8 = dateTimeZone1.getOffset((long) (byte) 100);
        java.lang.String str10 = dateTimeZone1.getNameKey((long) (short) 0);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getShortName((long) (short) -1, locale12);
        java.util.TimeZone timeZone14 = dateTimeZone1.toTimeZone();
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone1.isLocalDateTimeGap(localDateTime15);
        boolean boolean18 = dateTimeZone1.isStandardOffset(115200097L);
        java.lang.Class<?> wildcardClass19 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00654");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(363120000, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00655");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        int int4 = dateTimeZone0.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        boolean boolean6 = dateTimeZone5.isFixed();
        int int8 = dateTimeZone5.getStandardOffset(0L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone5.getShortName((-1L), locale10);
        int int13 = dateTimeZone5.getOffsetFromLocal(0L);
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) 115200000);
        int int17 = dateTimeZone5.getOffset((long) '4');
        int int19 = dateTimeZone5.getOffsetFromLocal(100L);
        int int21 = dateTimeZone5.getStandardOffset(127920097L);
        int int23 = dateTimeZone5.getStandardOffset((-187199968L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test00656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00656");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(5700000, 349200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 349200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00657");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), 363120000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 363120000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00658");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        int int8 = dateTimeZone0.getOffsetFromLocal(0L);
        int int10 = dateTimeZone0.getStandardOffset((long) (byte) 10);
        java.lang.String str12 = dateTimeZone0.getName((long) (byte) 10);
        long long14 = dateTimeZone0.previousTransition(52L);
        java.lang.String str16 = dateTimeZone0.getShortName(32L);
        java.lang.String str17 = dateTimeZone0.toString();
        java.lang.String str19 = dateTimeZone0.getNameKey((-6720000L));
        long long21 = dateTimeZone0.previousTransition((-115200000L));
        java.lang.Class<?> wildcardClass22 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-115200000L) + "'", long21 == (-115200000L));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00659");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        int int4 = dateTimeZone0.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        boolean boolean6 = dateTimeZone5.isFixed();
        int int8 = dateTimeZone5.getStandardOffset(0L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone5.getShortName((-1L), locale10);
        int int13 = dateTimeZone5.getOffsetFromLocal(0L);
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) 115200000);
        int int17 = dateTimeZone5.getOffset((long) '4');
        int int19 = dateTimeZone5.getOffsetFromLocal(100L);
        long long21 = dateTimeZone5.previousTransition(1L);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        boolean boolean23 = dateTimeZone22.isFixed();
        int int25 = dateTimeZone22.getStandardOffset(0L);
        java.lang.String str27 = dateTimeZone22.getNameKey(1L);
        java.lang.String str29 = dateTimeZone22.getShortName((long) 100);
        int int31 = dateTimeZone22.getStandardOffset(0L);
        long long33 = dateTimeZone5.getMillisKeepLocal(dateTimeZone22, 360000000L);
        org.joda.time.ReadableInstant readableInstant34 = null;
        int int35 = dateTimeZone5.getOffset(readableInstant34);
        java.util.TimeZone timeZone36 = dateTimeZone5.toTimeZone();
        long long38 = dateTimeZone5.convertUTCToLocal(3599999L);
        long long40 = dateTimeZone5.convertUTCToLocal((-118800000L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "UTC" + "'", str27, "UTC");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00" + "'", str29, "+00:00");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 360000000L + "'", long33 == 360000000L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 3599999L + "'", long38 == 3599999L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-118800000L) + "'", long40 == (-118800000L));
    }

    @Test
    public void test00660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00660");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(351300000, 36000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 36000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00661");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, 10);
        int int7 = dateTimeZone5.getOffsetFromLocal(118800001L);
        long long9 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, 356400032L);
        java.lang.String str11 = dateTimeZone1.getName((-3599893L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+10:00" + "'", str2, "+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 600000 + "'", int7 == 600000);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 391800032L + "'", long9 == 391800032L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+10:00" + "'", str11, "+10:00");
    }

    @Test
    public void test00662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00662");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        boolean boolean2 = dateTimeZone0.isFixed();
        long long6 = dateTimeZone0.convertLocalToUTC(1L, true, (long) (byte) 10);
        java.util.TimeZone timeZone7 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone8.getShortName((long) 10, locale10);
        boolean boolean13 = dateTimeZone8.isStandardOffset((-360000001L));
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone8.isLocalDateTimeGap(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00663");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        int int4 = dateTimeZone0.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        boolean boolean6 = dateTimeZone5.isFixed();
        int int8 = dateTimeZone5.getStandardOffset(0L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone5.getShortName((-1L), locale10);
        int int13 = dateTimeZone5.getOffsetFromLocal(0L);
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) 115200000);
        java.lang.String str17 = dateTimeZone0.getShortName((long) '4');
        java.util.TimeZone timeZone18 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        int int23 = dateTimeZone21.getOffsetFromLocal(0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test00664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00664");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(360600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00665");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long2 = dateTimeZone0.convertUTCToLocal((long) (byte) 0);
        java.lang.String str3 = dateTimeZone0.toString();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.lang.String str7 = dateTimeZone5.getShortName((long) 'a');
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone5.getShortName((long) (short) -1, locale9);
        int int12 = dateTimeZone5.getOffset((long) 115200000);
        long long14 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) (short) 0);
        boolean boolean16 = dateTimeZone5.isStandardOffset((long) 1);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = dateTimeZone17.getOffset(readableInstant18);
        int int21 = dateTimeZone17.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        boolean boolean23 = dateTimeZone22.isFixed();
        int int25 = dateTimeZone22.getStandardOffset(0L);
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone22.getShortName((-1L), locale27);
        int int30 = dateTimeZone22.getOffsetFromLocal(0L);
        long long32 = dateTimeZone17.getMillisKeepLocal(dateTimeZone22, (long) 115200000);
        boolean boolean34 = dateTimeZone17.isStandardOffset(115200000L);
        long long37 = dateTimeZone17.convertLocalToUTC((long) 10, true);
        java.lang.String str38 = dateTimeZone17.toString();
        int int40 = dateTimeZone17.getOffset(52L);
        org.joda.time.ReadableInstant readableInstant41 = null;
        int int42 = dateTimeZone17.getOffset(readableInstant41);
        int int44 = dateTimeZone17.getStandardOffset(97L);
        java.lang.String str46 = dateTimeZone17.getName(100L);
        long long48 = dateTimeZone5.getMillisKeepLocal(dateTimeZone17, 234000010L);
        boolean boolean49 = dateTimeZone5.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 351120000L + "'", long2 == 351120000L);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+97:32" + "'", str3, "+97:32");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 235920000L + "'", long14 == 235920000L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00" + "'", str28, "+00:00");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 115200000L + "'", long32 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 10L + "'", long37 == 10L);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "UTC" + "'", str38, "UTC");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00" + "'", str46, "+00:00");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 349200010L + "'", long48 == 349200010L);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test00666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00666");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        long long6 = dateTimeZone1.convertLocalToUTC(52L, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getName((-1L), locale9);
        boolean boolean11 = dateTimeZone1.isFixed();
        int int13 = dateTimeZone1.getOffset(187200001L);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        boolean boolean15 = dateTimeZone14.isFixed();
        boolean boolean16 = dateTimeZone14.isFixed();
        long long20 = dateTimeZone14.convertLocalToUTC(1L, true, (long) (byte) 10);
        java.util.TimeZone timeZone21 = dateTimeZone14.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        java.lang.String str25 = dateTimeZone23.getShortName(349200010L);
        org.joda.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = dateTimeZone23.isLocalDateTimeGap(localDateTime26);
        java.lang.String str28 = dateTimeZone23.getID();
        int int30 = dateTimeZone23.getOffsetFromLocal((long) (-1));
        org.joda.time.LocalDateTime localDateTime31 = null;
        boolean boolean32 = dateTimeZone23.isLocalDateTimeGap(localDateTime31);
        boolean boolean33 = dateTimeZone1.equals((java.lang.Object) boolean32);
        boolean boolean34 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00" + "'", str25, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UTC" + "'", str28, "UTC");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test00667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00667");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getNameKey(1L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getShortName((long) (short) -1, locale7);
        java.lang.String str10 = dateTimeZone0.getShortName((long) (-1));
        boolean boolean12 = dateTimeZone0.isStandardOffset(125999999L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone0.getName((-11L), locale14);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
    }

    @Test
    public void test00668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00668");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(360600000, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00669");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        int int8 = dateTimeZone0.getOffsetFromLocal(0L);
        java.lang.String str10 = dateTimeZone0.getShortName(0L);
        long long14 = dateTimeZone0.convertLocalToUTC((long) (byte) 0, false, 0L);
        long long17 = dateTimeZone0.convertLocalToUTC((long) (short) 10, true);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone0.getName(0L, locale19);
        int int22 = dateTimeZone0.getStandardOffset((long) (byte) -1);
        org.joda.time.ReadableInstant readableInstant23 = null;
        int int24 = dateTimeZone0.getOffset(readableInstant23);
        long long27 = dateTimeZone0.convertLocalToUTC(110L, true);
        java.util.TimeZone timeZone28 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 110L + "'", long27 == 110L);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone29);
    }

    @Test
    public void test00670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00670");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(3600000, 360600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 360600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00671");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getShortName((long) (byte) 100);
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        long long10 = dateTimeZone7.adjustOffset((-359999900L), true);
        int int12 = dateTimeZone7.getStandardOffset(79199999L);
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone7.isLocalDateTimeGap(localDateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-359999900L) + "'", long10 == (-359999900L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00672");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        int int6 = dateTimeZone2.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        boolean boolean8 = dateTimeZone7.isFixed();
        int int10 = dateTimeZone7.getStandardOffset(0L);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone7.getShortName((-1L), locale12);
        int int15 = dateTimeZone7.getOffsetFromLocal(0L);
        long long17 = dateTimeZone2.getMillisKeepLocal(dateTimeZone7, (long) 115200000);
        boolean boolean19 = dateTimeZone2.isStandardOffset(115200000L);
        long long22 = dateTimeZone2.convertLocalToUTC((long) 10, true);
        java.lang.String str23 = dateTimeZone2.toString();
        int int25 = dateTimeZone2.getOffset(52L);
        java.lang.String str27 = dateTimeZone2.getNameKey(0L);
        java.lang.String str29 = dateTimeZone2.getName((long) 0);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forID("UTC");
        int int33 = dateTimeZone31.getStandardOffset(0L);
        java.util.Locale locale35 = null;
        java.lang.String str36 = dateTimeZone31.getShortName((long) (byte) 0, locale35);
        boolean boolean37 = dateTimeZone2.equals((java.lang.Object) locale35);
        long long39 = dateTimeZone2.nextTransition((long) 'a');
        long long42 = dateTimeZone2.adjustOffset((long) (short) 100, true);
        long long44 = dateTimeZone1.getMillisKeepLocal(dateTimeZone2, 359999998L);
        long long46 = dateTimeZone1.nextTransition(234000010L);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale49 = null;
        java.lang.String str50 = dateTimeZone47.getShortName((long) 115200000, locale49);
        org.joda.time.ReadableInstant readableInstant51 = null;
        int int52 = dateTimeZone47.getOffset(readableInstant51);
        java.lang.String str54 = dateTimeZone47.getShortName(32L);
        boolean boolean56 = dateTimeZone47.isStandardOffset((long) 115200000);
        long long58 = dateTimeZone47.previousTransition(115200100L);
        long long60 = dateTimeZone1.getMillisKeepLocal(dateTimeZone47, (long) (short) -1);
        java.lang.String str62 = dateTimeZone47.getNameKey(466320000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 115200000L + "'", long17 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "UTC" + "'", str27, "UTC");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00" + "'", str29, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00" + "'", str36, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 97L + "'", long39 == 97L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 100L + "'", long42 == 100L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 547199998L + "'", long44 == 547199998L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 234000010L + "'", long46 == 234000010L);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+00:00" + "'", str50, "+00:00");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "+00:00" + "'", str54, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 115200100L + "'", long58 == 115200100L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 187199999L + "'", long60 == 187199999L);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "UTC" + "'", str62, "UTC");
    }

    @Test
    public void test00673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00673");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        long long5 = dateTimeZone0.convertLocalToUTC((long) '#', true);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        long long8 = dateTimeZone0.getMillisKeepLocal(dateTimeZone6, (-115199900L));
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone0.getOffset(readableInstant9);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-115199900L) + "'", long8 == (-115199900L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00674");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        int int8 = dateTimeZone0.getOffsetFromLocal(0L);
        java.lang.String str10 = dateTimeZone0.getShortName(0L);
        java.lang.String str11 = dateTimeZone0.toString();
        java.lang.Object obj12 = null;
        boolean boolean13 = dateTimeZone0.equals(obj12);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00675");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(36600000, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00676");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        int int4 = dateTimeZone0.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        boolean boolean6 = dateTimeZone5.isFixed();
        int int8 = dateTimeZone5.getStandardOffset(0L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone5.getShortName((-1L), locale10);
        int int13 = dateTimeZone5.getOffsetFromLocal(0L);
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) 115200000);
        java.lang.String str17 = dateTimeZone0.getShortName((long) '4');
        boolean boolean18 = dateTimeZone0.isFixed();
        long long20 = dateTimeZone0.convertUTCToLocal((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 0);
        long long26 = dateTimeZone23.adjustOffset(32L, true);
        int int28 = dateTimeZone23.getOffsetFromLocal((long) '#');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long33 = dateTimeZone31.nextTransition((long) (short) 100);
        long long35 = dateTimeZone23.getMillisKeepLocal(dateTimeZone31, 475200097L);
        long long38 = dateTimeZone23.convertLocalToUTC(360000100L, true);
        long long40 = dateTimeZone0.getMillisKeepLocal(dateTimeZone23, (-302399900L));
        int int42 = dateTimeZone0.getOffsetFromLocal(0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32L + "'", long26 == 32L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 349200000 + "'", int28 == 349200000);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 100L + "'", long33 == 100L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 824399997L + "'", long35 == 824399997L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 10800100L + "'", long38 == 10800100L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-651599900L) + "'", long40 == (-651599900L));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test00677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00677");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        int int8 = dateTimeZone0.getOffsetFromLocal(0L);
        java.lang.String str10 = dateTimeZone0.getShortName(0L);
        long long14 = dateTimeZone0.convertLocalToUTC((long) (byte) 0, false, 0L);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone0.getShortName(0L, locale16);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone0.getShortName((long) (byte) 1, locale19);
        int int22 = dateTimeZone0.getStandardOffset((-115199990L));
        int int24 = dateTimeZone0.getOffsetFromLocal(356400000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test00678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00678");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(97, (int) (byte) 10);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test00679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00679");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getNameKey(1L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getShortName((long) (short) -1, locale7);
        java.lang.String str10 = dateTimeZone0.getShortName((long) (-1));
        boolean boolean11 = dateTimeZone0.isFixed();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone12.getOffset(readableInstant13);
        int int16 = dateTimeZone12.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        boolean boolean18 = dateTimeZone17.isFixed();
        int int20 = dateTimeZone17.getStandardOffset(0L);
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone17.getShortName((-1L), locale22);
        int int25 = dateTimeZone17.getOffsetFromLocal(0L);
        long long27 = dateTimeZone12.getMillisKeepLocal(dateTimeZone17, (long) 115200000);
        java.lang.String str29 = dateTimeZone12.getShortName((long) '4');
        java.util.TimeZone timeZone30 = dateTimeZone12.toTimeZone();
        boolean boolean31 = dateTimeZone0.equals((java.lang.Object) timeZone30);
        int int33 = dateTimeZone0.getOffsetFromLocal((-32399999L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 115200000L + "'", long27 == 115200000L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00" + "'", str29, "+00:00");
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test00680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00680");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        java.lang.String str3 = dateTimeZone0.getShortName((long) (byte) 100);
        java.lang.String str5 = dateTimeZone0.getShortName((long) (-1));
        java.lang.String str7 = dateTimeZone0.getName((long) 0);
        int int9 = dateTimeZone0.getOffset((long) 100);
        int int11 = dateTimeZone0.getStandardOffset((long) 1);
        java.lang.String str12 = dateTimeZone0.getID();
        java.lang.String str13 = dateTimeZone0.toString();
        java.lang.String str14 = dateTimeZone0.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
    }

    @Test
    public void test00681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00681");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(351300000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test00682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00682");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getNameKey(1L);
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        int int10 = dateTimeZone8.getStandardOffset((long) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone11.getOffset(readableInstant12);
        int int15 = dateTimeZone11.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        boolean boolean17 = dateTimeZone16.isFixed();
        int int19 = dateTimeZone16.getStandardOffset(0L);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone16.getShortName((-1L), locale21);
        int int24 = dateTimeZone16.getOffsetFromLocal(0L);
        long long26 = dateTimeZone11.getMillisKeepLocal(dateTimeZone16, (long) 115200000);
        boolean boolean28 = dateTimeZone11.isStandardOffset(115200000L);
        long long31 = dateTimeZone11.convertLocalToUTC((long) 10, true);
        java.lang.String str32 = dateTimeZone11.toString();
        int int34 = dateTimeZone11.getOffset(52L);
        org.joda.time.ReadableInstant readableInstant35 = null;
        int int36 = dateTimeZone11.getOffset(readableInstant35);
        boolean boolean37 = dateTimeZone8.equals((java.lang.Object) readableInstant35);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 115200000L + "'", long26 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L + "'", long31 == 10L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "UTC" + "'", str32, "UTC");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test00683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00683");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        long long6 = dateTimeZone1.convertLocalToUTC(52L, false);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        int int9 = dateTimeZone1.getOffsetFromLocal(32L);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        boolean boolean12 = dateTimeZone10.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone13 = dateTimeZone10.toTimeZone();
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone10.getShortName(0L, locale15);
        java.lang.String str17 = dateTimeZone10.getID();
        long long20 = dateTimeZone10.convertLocalToUTC(100L, true);
        long long23 = dateTimeZone10.convertLocalToUTC((-1L), false);
        long long25 = dateTimeZone1.getMillisKeepLocal(dateTimeZone10, 118800001L);
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone1.getShortName((long) (short) -1, locale27);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        long long31 = dateTimeZone29.convertUTCToLocal((long) (byte) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone29);
        java.util.Locale locale34 = null;
        java.lang.String str35 = dateTimeZone29.getName((long) (byte) 0, locale34);
        java.lang.String str37 = dateTimeZone29.getNameKey(115200001L);
        java.util.Locale locale39 = null;
        java.lang.String str40 = dateTimeZone29.getShortName(359999999L, locale39);
        long long42 = dateTimeZone1.getMillisKeepLocal(dateTimeZone29, (-65L));
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.UTC;
        boolean boolean44 = dateTimeZone43.isFixed();
        org.joda.time.LocalDateTime localDateTime45 = null;
        boolean boolean46 = dateTimeZone43.isLocalDateTimeGap(localDateTime45);
        long long49 = dateTimeZone43.adjustOffset((long) (short) 10, false);
        org.joda.time.ReadableInstant readableInstant50 = null;
        int int51 = dateTimeZone43.getOffset(readableInstant50);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.UTC;
        boolean boolean53 = dateTimeZone52.isFixed();
        int int55 = dateTimeZone52.getStandardOffset(0L);
        java.lang.String str57 = dateTimeZone52.getNameKey(1L);
        java.lang.String str59 = dateTimeZone52.getShortName((long) 100);
        boolean boolean60 = dateTimeZone43.equals((java.lang.Object) 100);
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.getDefault();
        long long63 = dateTimeZone61.convertUTCToLocal((long) (byte) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone61);
        boolean boolean65 = dateTimeZone43.equals((java.lang.Object) dateTimeZone61);
        boolean boolean67 = dateTimeZone61.isStandardOffset((-359999990L));
        boolean boolean68 = dateTimeZone1.equals((java.lang.Object) (-359999990L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 118800001L + "'", long25 == 118800001L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00" + "'", str28, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone29);
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00" + "'", str35, "+00:00");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "UTC" + "'", str37, "UTC");
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00" + "'", str40, "+00:00");
// flaky:         org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-65L) + "'", long42 == (-65L));
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 10L + "'", long49 == 10L);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "UTC" + "'", str57, "UTC");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "+00:00" + "'", str59, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(dateTimeZone61);
// flaky:         org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test00684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00684");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone3.getName((long) ' ', locale5);
        boolean boolean7 = dateTimeZone1.equals((java.lang.Object) dateTimeZone3);
        java.util.TimeZone timeZone8 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.100' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-01:00" + "'", str6, "-01:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test00685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00685");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getShortName((long) (byte) 100);
        java.lang.String str7 = dateTimeZone0.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        boolean boolean11 = dateTimeZone0.isStandardOffset((long) (short) 1);
        long long15 = dateTimeZone0.convertLocalToUTC((long) 115200000, false, (long) (-1));
        int int17 = dateTimeZone0.getOffsetFromLocal((long) (short) 0);
        java.lang.String str19 = dateTimeZone0.getNameKey((long) ' ');
        boolean boolean21 = dateTimeZone0.isStandardOffset((long) '#');
        long long23 = dateTimeZone0.previousTransition(97L);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone0.getOffset(readableInstant24);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 97L + "'", long23 == 97L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test00686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00686");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getShortName((long) (byte) 100);
        java.lang.String str7 = dateTimeZone0.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        boolean boolean11 = dateTimeZone0.isStandardOffset((long) (short) 1);
        long long15 = dateTimeZone0.convertLocalToUTC((long) 115200000, false, (long) (-1));
        boolean boolean17 = dateTimeZone0.isStandardOffset((long) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forID("UTC");
        long long21 = dateTimeZone0.getMillisKeepLocal(dateTimeZone19, 10L);
        long long23 = dateTimeZone19.nextTransition((long) (short) 10);
        long long26 = dateTimeZone19.adjustOffset((long) 115200000, false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 115200000L + "'", long26 == 115200000L);
    }

    @Test
    public void test00687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00687");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        int int4 = dateTimeZone0.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        boolean boolean6 = dateTimeZone5.isFixed();
        int int8 = dateTimeZone5.getStandardOffset(0L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone5.getShortName((-1L), locale10);
        int int13 = dateTimeZone5.getOffsetFromLocal(0L);
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) 115200000);
        boolean boolean17 = dateTimeZone0.isStandardOffset(115200000L);
        long long20 = dateTimeZone0.convertLocalToUTC((long) 10, true);
        java.lang.String str21 = dateTimeZone0.toString();
        int int23 = dateTimeZone0.getOffset(52L);
        java.lang.String str25 = dateTimeZone0.getNameKey(0L);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        java.lang.Class<?> wildcardClass28 = dateTimeZone27.getClass();
        boolean boolean29 = dateTimeZone0.equals((java.lang.Object) wildcardClass28);
        java.lang.String str30 = dateTimeZone0.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTC" + "'", str25, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "UTC" + "'", str30, "UTC");
    }

    @Test
    public void test00688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00688");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(36060000, 600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00689");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, 126060000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 126060000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00690");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone0.isLocalDateTimeGap(localDateTime2);
        long long5 = dateTimeZone0.convertUTCToLocal(0L);
        java.lang.String str6 = dateTimeZone0.toString();
        long long8 = dateTimeZone0.previousTransition(0L);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        long long11 = dateTimeZone0.getMillisKeepLocal(dateTimeZone9, 35L);
        java.lang.String str13 = dateTimeZone0.getName((-127920000L));
        long long15 = dateTimeZone0.nextTransition(3600000L);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone0.getName(154320052L, locale17);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3600000L + "'", long15 == 3600000L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
    }

    @Test
    public void test00691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00691");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        int int8 = dateTimeZone0.getOffsetFromLocal(0L);
        int int10 = dateTimeZone0.getStandardOffset((long) (byte) 10);
        java.lang.String str12 = dateTimeZone0.getName((long) (byte) 10);
        java.lang.String str14 = dateTimeZone0.getName((long) '#');
        long long17 = dateTimeZone0.convertLocalToUTC((long) 10, false);
        long long21 = dateTimeZone0.convertLocalToUTC((long) (-1), true, 0L);
        org.joda.time.ReadableInstant readableInstant22 = null;
        int int23 = dateTimeZone0.getOffset(readableInstant22);
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone0.getShortName((-3599903L), locale25);
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone0.getShortName((-39600000L), locale28);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00" + "'", str26, "+00:00");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00" + "'", str29, "+00:00");
    }

    @Test
    public void test00692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00692");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        boolean boolean3 = dateTimeZone2.isFixed();
        int int5 = dateTimeZone2.getStandardOffset(0L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone2.getShortName((-1L), locale7);
        java.lang.String str10 = dateTimeZone2.getName((-1L));
        long long13 = dateTimeZone2.convertLocalToUTC(1L, false);
        boolean boolean14 = dateTimeZone1.equals((java.lang.Object) false);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone1.getName((-3599990L), locale16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = dateTimeZone1.getOffset(readableInstant18);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-01:00" + "'", str17, "-01:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-3600000) + "'", int19 == (-3600000));
    }

    @Test
    public void test00693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00693");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) (short) 100);
        boolean boolean4 = dateTimeZone1.isFixed();
        java.util.TimeZone timeZone5 = dateTimeZone1.toTimeZone();
        boolean boolean6 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+:0:00");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00694");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        int int4 = dateTimeZone0.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        boolean boolean6 = dateTimeZone5.isFixed();
        int int8 = dateTimeZone5.getStandardOffset(0L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone5.getShortName((-1L), locale10);
        int int13 = dateTimeZone5.getOffsetFromLocal(0L);
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) 115200000);
        int int17 = dateTimeZone5.getOffset((long) '4');
        int int19 = dateTimeZone5.getOffsetFromLocal(100L);
        long long22 = dateTimeZone5.convertLocalToUTC(32L, false);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        long long25 = dateTimeZone5.getMillisKeepLocal(dateTimeZone23, (-115199965L));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone.setDefault(dateTimeZone23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-115199965L) + "'", long25 == (-115199965L));
    }

    @Test
    public void test00695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00695");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffset(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long6 = dateTimeZone1.convertUTCToLocal((long) (short) 100);
        long long8 = dateTimeZone1.nextTransition((-187799900L));
        int int10 = dateTimeZone1.getOffset((-3600000L));
        long long12 = dateTimeZone1.nextTransition(72000000L);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int16 = dateTimeZone14.getOffset(129660000L);
        int int18 = dateTimeZone14.getOffset((-1L));
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        boolean boolean20 = dateTimeZone19.isFixed();
        int int22 = dateTimeZone19.getStandardOffset(0L);
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone19.getShortName((-1L), locale24);
        java.lang.String str27 = dateTimeZone19.getName((-1L));
        boolean boolean28 = dateTimeZone14.equals((java.lang.Object) (-1L));
        java.lang.String str29 = dateTimeZone14.getID();
        boolean boolean30 = dateTimeZone1.equals((java.lang.Object) dateTimeZone14);
        long long32 = dateTimeZone1.convertUTCToLocal(363120000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200100L + "'", long6 == 115200100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-187799900L) + "'", long8 == (-187799900L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 72000000L + "'", long12 == 72000000L);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115200000 + "'", int16 == 115200000);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 115200000 + "'", int18 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00" + "'", str25, "+00:00");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+32:00" + "'", str29, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 478320000L + "'", long32 == 478320000L);
    }

    @Test
    public void test00696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00696");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.lang.String str6 = dateTimeZone4.getNameKey((long) (short) 10);
        java.lang.String str8 = dateTimeZone4.getName((long) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        boolean boolean10 = dateTimeZone9.isFixed();
        int int12 = dateTimeZone9.getStandardOffset(0L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone9.getShortName((-1L), locale14);
        java.lang.String str17 = dateTimeZone9.getShortName(1L);
        long long19 = dateTimeZone4.getMillisKeepLocal(dateTimeZone9, (long) (-1));
        boolean boolean20 = dateTimeZone9.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test00697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00697");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(360060000, 351300000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 351300000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00698");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffset(129660000L);
        int int5 = dateTimeZone1.getOffset((-1L));
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        boolean boolean7 = dateTimeZone6.isFixed();
        int int9 = dateTimeZone6.getStandardOffset(0L);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone6.getShortName((-1L), locale11);
        java.lang.String str14 = dateTimeZone6.getName((-1L));
        boolean boolean15 = dateTimeZone1.equals((java.lang.Object) (-1L));
        java.lang.String str17 = dateTimeZone1.getNameKey(115199991L);
        long long19 = dateTimeZone1.previousTransition((-60001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 115200000 + "'", int5 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-60001L) + "'", long19 == (-60001L));
    }

    @Test
    public void test00699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00699");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.lang.String str6 = dateTimeZone4.getNameKey((long) (short) 10);
        boolean boolean7 = dateTimeZone4.isFixed();
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone4.getName(52L, locale9);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone4.isLocalDateTimeGap(localDateTime11);
        java.lang.String str13 = dateTimeZone4.toString();
        int int15 = dateTimeZone4.getStandardOffset((-3600010L));
        long long17 = dateTimeZone4.convertUTCToLocal((long) (short) 1);
        java.lang.Class<?> wildcardClass18 = dateTimeZone4.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00700");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        boolean boolean5 = dateTimeZone0.isStandardOffset(100L);
        java.lang.String str6 = dateTimeZone0.getID();
        java.lang.String str8 = dateTimeZone0.getShortName(1L);
        java.lang.String str10 = dateTimeZone0.getNameKey((long) (short) 100);
        long long14 = dateTimeZone0.convertLocalToUTC(1L, true, (long) (short) 0);
        java.lang.String str16 = dateTimeZone0.getName((long) 360000000);
        long long20 = dateTimeZone0.convertLocalToUTC((-6720000L), true, 707580000L);
        java.lang.String str21 = dateTimeZone0.getID();
        java.lang.String str23 = dateTimeZone0.getShortName(0L);
        java.lang.String str25 = dateTimeZone0.getNameKey((-115199900L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-6720000L) + "'", long20 == (-6720000L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTC" + "'", str25, "UTC");
    }

    @Test
    public void test00701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00701");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getShortName((long) (byte) 100);
        java.lang.String str7 = dateTimeZone0.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        boolean boolean11 = dateTimeZone0.isStandardOffset((long) (short) 1);
        long long15 = dateTimeZone0.convertLocalToUTC((long) 115200000, false, (long) (-1));
        boolean boolean17 = dateTimeZone0.isStandardOffset((long) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forID("UTC");
        long long21 = dateTimeZone0.getMillisKeepLocal(dateTimeZone19, 10L);
        long long23 = dateTimeZone19.nextTransition((long) (short) 10);
        java.lang.Class<?> wildcardClass24 = dateTimeZone19.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00702");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone0.isLocalDateTimeGap(localDateTime2);
        long long5 = dateTimeZone0.convertUTCToLocal(0L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone0.getOffset(readableInstant7);
        java.lang.String str10 = dateTimeZone0.getName(115199999L);
        long long13 = dateTimeZone0.convertLocalToUTC(52L, true);
        boolean boolean15 = dateTimeZone0.isStandardOffset((long) (short) 100);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00703");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        int int8 = dateTimeZone0.getOffsetFromLocal(0L);
        java.lang.String str10 = dateTimeZone0.getShortName(0L);
        long long14 = dateTimeZone0.convertLocalToUTC((long) (byte) 0, false, 0L);
        long long17 = dateTimeZone0.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str18 = dateTimeZone0.getID();
        java.lang.String str19 = dateTimeZone0.toString();
        long long22 = dateTimeZone0.adjustOffset((long) (byte) 1, false);
        java.util.TimeZone timeZone23 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        int int28 = dateTimeZone26.getOffsetFromLocal((-36000000L));
        long long31 = dateTimeZone26.convertLocalToUTC((-228900001L), true);
        boolean boolean32 = dateTimeZone26.isFixed();
        java.lang.String str34 = dateTimeZone26.getName(359999989L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-228900001L) + "'", long31 == (-228900001L));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00" + "'", str34, "+00:00");
    }

    @Test
    public void test00704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00704");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        int int4 = dateTimeZone0.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        boolean boolean6 = dateTimeZone5.isFixed();
        int int8 = dateTimeZone5.getStandardOffset(0L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone5.getShortName((-1L), locale10);
        int int13 = dateTimeZone5.getOffsetFromLocal(0L);
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) 115200000);
        int int17 = dateTimeZone5.getOffset((long) '4');
        int int19 = dateTimeZone5.getOffsetFromLocal(100L);
        long long21 = dateTimeZone5.previousTransition(1L);
        java.lang.String str23 = dateTimeZone5.getShortName(0L);
        java.util.TimeZone timeZone24 = dateTimeZone5.toTimeZone();
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone5.getShortName((long) 3600000, locale26);
        java.lang.String str29 = dateTimeZone5.getNameKey((-7200000L));
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        boolean boolean31 = dateTimeZone30.isFixed();
        int int33 = dateTimeZone30.getStandardOffset(0L);
        java.lang.String str35 = dateTimeZone30.getNameKey(1L);
        int int37 = dateTimeZone30.getOffset((-1L));
        java.lang.String str38 = dateTimeZone30.toString();
        java.lang.String str40 = dateTimeZone30.getName(32L);
        boolean boolean41 = dateTimeZone5.equals((java.lang.Object) 32L);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.UTC;
        boolean boolean43 = dateTimeZone42.isFixed();
        org.joda.time.LocalDateTime localDateTime44 = null;
        boolean boolean45 = dateTimeZone42.isLocalDateTimeGap(localDateTime44);
        long long48 = dateTimeZone42.adjustOffset((long) (short) 10, false);
        long long50 = dateTimeZone5.getMillisKeepLocal(dateTimeZone42, 349200000L);
        java.lang.String str52 = dateTimeZone5.getShortName((-118799903L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UTC" + "'", str29, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "UTC" + "'", str35, "UTC");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "UTC" + "'", str38, "UTC");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00" + "'", str40, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 10L + "'", long48 == 10L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 349200000L + "'", long50 == 349200000L);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "+00:00" + "'", str52, "+00:00");
    }

    @Test
    public void test00705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00705");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(360000000, 39120000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 39120000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00706");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName(0L, locale5);
        java.lang.String str7 = dateTimeZone0.getID();
        java.lang.String str9 = dateTimeZone0.getNameKey((long) 115200000);
        java.lang.String str10 = dateTimeZone0.getID();
        long long12 = dateTimeZone0.nextTransition((long) 0);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone0.getOffset(readableInstant13);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test00707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00707");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        java.lang.String str2 = dateTimeZone1.toString();
        int int4 = dateTimeZone1.getOffsetFromLocal((long) 600000);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        boolean boolean7 = dateTimeZone5.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone8 = dateTimeZone5.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        boolean boolean13 = dateTimeZone11.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone14 = dateTimeZone11.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        java.lang.String str17 = dateTimeZone15.getNameKey((long) (short) 10);
        java.lang.String str19 = dateTimeZone15.getName((long) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        boolean boolean21 = dateTimeZone20.isFixed();
        int int23 = dateTimeZone20.getStandardOffset(0L);
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone20.getShortName((-1L), locale25);
        java.lang.String str28 = dateTimeZone20.getShortName(1L);
        long long30 = dateTimeZone15.getMillisKeepLocal(dateTimeZone20, (long) (-1));
        java.util.Locale locale32 = null;
        java.lang.String str33 = dateTimeZone15.getName(0L, locale32);
        long long35 = dateTimeZone10.getMillisKeepLocal(dateTimeZone15, 1L);
        java.util.Locale locale37 = null;
        java.lang.String str38 = dateTimeZone15.getName((long) '4', locale37);
        boolean boolean39 = dateTimeZone15.isFixed();
        boolean boolean40 = dateTimeZone1.equals((java.lang.Object) boolean39);
        long long42 = dateTimeZone1.previousTransition(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.010" + "'", str2, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00" + "'", str26, "+00:00");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00" + "'", str28, "+00:00");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00" + "'", str33, "+00:00");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00" + "'", str38, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
    }

    @Test
    public void test00708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00708");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        int int8 = dateTimeZone0.getOffsetFromLocal(0L);
        int int10 = dateTimeZone0.getStandardOffset((long) (byte) 10);
        java.lang.String str12 = dateTimeZone0.getName((long) (byte) 10);
        java.lang.String str14 = dateTimeZone0.getName((long) '#');
        long long17 = dateTimeZone0.convertLocalToUTC((long) 10, false);
        long long21 = dateTimeZone0.convertLocalToUTC((long) (-1), true, 0L);
        java.lang.String str23 = dateTimeZone0.getNameKey(187200000L);
        boolean boolean25 = dateTimeZone0.isStandardOffset((-359999990L));
        int int27 = dateTimeZone0.getOffsetFromLocal((long) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test00709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00709");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        boolean boolean2 = dateTimeZone0.isFixed();
        long long6 = dateTimeZone0.convertLocalToUTC(1L, true, (long) (byte) 10);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone0.getName((long) (-1), locale8);
        java.lang.String str10 = dateTimeZone0.getID();
        java.lang.String str12 = dateTimeZone0.getNameKey((long) 115200000);
        int int14 = dateTimeZone0.getOffset((-1L));
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone15.getOffset(readableInstant16);
        int int19 = dateTimeZone15.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        boolean boolean21 = dateTimeZone20.isFixed();
        int int23 = dateTimeZone20.getStandardOffset(0L);
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone20.getShortName((-1L), locale25);
        int int28 = dateTimeZone20.getOffsetFromLocal(0L);
        long long30 = dateTimeZone15.getMillisKeepLocal(dateTimeZone20, (long) 115200000);
        java.lang.String str32 = dateTimeZone15.getShortName((long) '4');
        org.joda.time.LocalDateTime localDateTime33 = null;
        boolean boolean34 = dateTimeZone15.isLocalDateTimeGap(localDateTime33);
        java.lang.String str36 = dateTimeZone15.getNameKey(115199999L);
        java.util.TimeZone timeZone37 = dateTimeZone15.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forTimeZone(timeZone37);
        long long40 = dateTimeZone0.getMillisKeepLocal(dateTimeZone38, 391800032L);
        java.lang.String str42 = dateTimeZone0.getNameKey((-118799913L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00" + "'", str26, "+00:00");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 115200000L + "'", long30 == 115200000L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UTC" + "'", str36, "UTC");
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 391800032L + "'", long40 == 391800032L);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "UTC" + "'", str42, "UTC");
    }

    @Test
    public void test00710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00710");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.lang.String str3 = dateTimeZone1.getShortName((long) 'a');
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((long) (short) -1, locale5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str8 = dateTimeZone1.toString();
        long long11 = dateTimeZone1.convertLocalToUTC((-302399900L), false);
        boolean boolean12 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+32:00" + "'", str3, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+32:00" + "'", str8, "+32:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-417599900L) + "'", long11 == (-417599900L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00711");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, 351300000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 351300000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00712");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(36000000, 187200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 187200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00713");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        boolean boolean5 = dateTimeZone0.isStandardOffset(100L);
        java.lang.String str6 = dateTimeZone0.getID();
        long long8 = dateTimeZone0.previousTransition((long) (short) 10);
        long long10 = dateTimeZone0.convertUTCToLocal((long) (-3600000));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-3600000L) + "'", long10 == (-3600000L));
    }

    @Test
    public void test00714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00714");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getNameKey(1L);
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        java.lang.String str9 = dateTimeZone8.toString();
        long long12 = dateTimeZone8.convertLocalToUTC(35L, false);
        long long15 = dateTimeZone8.convertLocalToUTC(115199991L, true);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        boolean boolean17 = dateTimeZone16.isFixed();
        int int19 = dateTimeZone16.getStandardOffset(0L);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone16.getShortName((-1L), locale21);
        int int24 = dateTimeZone16.getOffsetFromLocal(0L);
        java.lang.String str26 = dateTimeZone16.getShortName(0L);
        long long28 = dateTimeZone16.nextTransition((long) 0);
        java.util.TimeZone timeZone29 = dateTimeZone16.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        org.joda.time.LocalDateTime localDateTime31 = null;
        boolean boolean32 = dateTimeZone30.isLocalDateTimeGap(localDateTime31);
        boolean boolean33 = dateTimeZone8.equals((java.lang.Object) localDateTime31);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115199991L + "'", long15 == 115199991L);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00" + "'", str26, "+00:00");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test00715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00715");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long2 = dateTimeZone0.convertUTCToLocal((long) (byte) 0);
        java.lang.String str3 = dateTimeZone0.toString();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.lang.String str7 = dateTimeZone5.getShortName((long) 'a');
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone5.getShortName((long) (short) -1, locale9);
        int int12 = dateTimeZone5.getOffset((long) 115200000);
        long long14 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) (short) 0);
        boolean boolean15 = dateTimeZone0.isFixed();
        boolean boolean16 = dateTimeZone0.isFixed();
        long long18 = dateTimeZone0.previousTransition((-7260001L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 115200000L + "'", long2 == 115200000L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+32:00" + "'", str3, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-7260001L) + "'", long18 == (-7260001L));
    }

    @Test
    public void test00716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00716");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getNameKey(1L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getShortName((long) (short) -1, locale7);
        java.lang.String str10 = dateTimeZone0.getShortName((long) (-1));
        long long12 = dateTimeZone0.nextTransition(118800001L);
        int int14 = dateTimeZone0.getOffsetFromLocal(356400000L);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone0.getShortName(115200000L, locale16);
        java.lang.String str19 = dateTimeZone0.getShortName(122460000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 118800001L + "'", long12 == 118800001L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
    }

    @Test
    public void test00717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00717");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getShortName((long) (byte) 100);
        java.lang.String str7 = dateTimeZone0.getShortName((long) (short) 0);
        java.lang.String str9 = dateTimeZone0.getShortName(0L);
        long long11 = dateTimeZone0.previousTransition(100L);
        java.lang.String str13 = dateTimeZone0.getShortName((long) (byte) 10);
        int int15 = dateTimeZone0.getOffset(10L);
        java.lang.String str17 = dateTimeZone0.getShortName(110L);
        java.lang.Class<?> wildcardClass18 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00718");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getNameKey(1L);
        java.lang.String str7 = dateTimeZone0.getShortName((long) 100);
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone0.isLocalDateTimeGap(localDateTime8);
        java.lang.String str11 = dateTimeZone0.getNameKey(100L);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        boolean boolean13 = dateTimeZone12.isFixed();
        int int15 = dateTimeZone12.getStandardOffset(0L);
        java.lang.String str17 = dateTimeZone12.getNameKey(1L);
        int int19 = dateTimeZone12.getOffset((-1L));
        long long21 = dateTimeZone0.getMillisKeepLocal(dateTimeZone12, 110L);
        long long24 = dateTimeZone0.adjustOffset(10L, false);
        org.joda.time.LocalDateTime localDateTime25 = null;
        boolean boolean26 = dateTimeZone0.isLocalDateTimeGap(localDateTime25);
        java.lang.Class<?> wildcardClass27 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 110L + "'", long21 == 110L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00719");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        boolean boolean4 = dateTimeZone0.isFixed();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone6.getShortName((long) 'a', locale8);
        long long12 = dateTimeZone6.adjustOffset((long) (byte) 10, true);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        boolean boolean14 = dateTimeZone13.isFixed();
        boolean boolean15 = dateTimeZone6.equals((java.lang.Object) dateTimeZone13);
        long long17 = dateTimeZone0.getMillisKeepLocal(dateTimeZone6, (long) (short) -1);
        long long19 = dateTimeZone6.convertUTCToLocal(0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+100:00" + "'", str9, "+100:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-360000001L) + "'", long17 == (-360000001L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 360000000L + "'", long19 == 360000000L);
    }

    @Test
    public void test00720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00720");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.Class<?> wildcardClass3 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00721");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getNameKey(1L);
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        long long11 = dateTimeZone8.convertLocalToUTC(1L, true);
        boolean boolean13 = dateTimeZone8.isStandardOffset(0L);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.lang.String str17 = dateTimeZone15.getShortName((long) 'a');
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone15.getShortName((long) (short) -1, locale19);
        int int22 = dateTimeZone15.getOffset((long) 115200000);
        int int24 = dateTimeZone15.getStandardOffset((long) (short) 10);
        int int26 = dateTimeZone15.getStandardOffset((-1L));
        java.lang.String str28 = dateTimeZone15.getName((long) (byte) 10);
        java.lang.String str30 = dateTimeZone15.getShortName(0L);
        long long32 = dateTimeZone15.nextTransition(115200097L);
        boolean boolean33 = dateTimeZone8.equals((java.lang.Object) long32);
        long long37 = dateTimeZone8.convertLocalToUTC(350879999L, false, 71999904L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 115200000 + "'", int22 == 115200000);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 115200000 + "'", int24 == 115200000);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 115200000 + "'", int26 == 115200000);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+32:00" + "'", str28, "+32:00");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+32:00" + "'", str30, "+32:00");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 115200097L + "'", long32 == 115200097L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 350879999L + "'", long37 == 350879999L);
    }

    @Test
    public void test00722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00722");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        int int4 = dateTimeZone0.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        boolean boolean6 = dateTimeZone5.isFixed();
        int int8 = dateTimeZone5.getStandardOffset(0L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone5.getShortName((-1L), locale10);
        int int13 = dateTimeZone5.getOffsetFromLocal(0L);
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) 115200000);
        int int17 = dateTimeZone5.getOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        java.lang.String str21 = dateTimeZone19.getName(10L);
        java.util.TimeZone timeZone22 = dateTimeZone19.toTimeZone();
        boolean boolean23 = dateTimeZone5.equals((java.lang.Object) dateTimeZone19);
        java.lang.String str25 = dateTimeZone19.getName(118799999L);
        java.lang.String str27 = dateTimeZone19.getName((-3600001L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-01:00" + "'", str21, "-01:00");
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "GMT-01:00");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-01:00" + "'", str25, "-01:00");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-01:00" + "'", str27, "-01:00");
    }

    @Test
    public void test00723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00723");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        java.lang.String str8 = dateTimeZone0.getShortName(1L);
        long long11 = dateTimeZone0.convertLocalToUTC(0L, false);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone0.getShortName(360000097L, locale13);
        long long16 = dateTimeZone0.previousTransition((-122400000L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-122400000L) + "'", long16 == (-122400000L));
    }

    @Test
    public void test00724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00724");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, 127920000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 127920000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00725");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        int int4 = dateTimeZone0.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        boolean boolean6 = dateTimeZone5.isFixed();
        int int8 = dateTimeZone5.getStandardOffset(0L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone5.getShortName((-1L), locale10);
        int int13 = dateTimeZone5.getOffsetFromLocal(0L);
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) 115200000);
        int int17 = dateTimeZone5.getOffset((long) '4');
        int int19 = dateTimeZone5.getOffsetFromLocal(100L);
        long long21 = dateTimeZone5.previousTransition(1L);
        java.lang.String str23 = dateTimeZone5.getNameKey((-187799900L));
        org.joda.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = dateTimeZone5.isLocalDateTimeGap(localDateTime24);
        java.lang.String str27 = dateTimeZone5.getShortName(464400001L);
        java.lang.Class<?> wildcardClass28 = dateTimeZone5.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00726");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        long long6 = dateTimeZone1.convertLocalToUTC(52L, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long10 = dateTimeZone1.nextTransition((-36000000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-36000000L) + "'", long10 == (-36000000L));
    }

    @Test
    public void test00727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00727");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        java.lang.String str7 = dateTimeZone0.getID();
        java.util.TimeZone timeZone8 = dateTimeZone0.toTimeZone();
        long long10 = dateTimeZone0.convertUTCToLocal((long) (short) 0);
        long long12 = dateTimeZone0.previousTransition((long) 600000);
        java.lang.Class<?> wildcardClass13 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 600000L + "'", long12 == 600000L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00728");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long2 = dateTimeZone0.convertUTCToLocal((long) (byte) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.String str5 = dateTimeZone0.getShortName(52L);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        boolean boolean8 = dateTimeZone6.equals((java.lang.Object) 100);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone9.getOffset(readableInstant10);
        int int13 = dateTimeZone9.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        boolean boolean15 = dateTimeZone14.isFixed();
        int int17 = dateTimeZone14.getStandardOffset(0L);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone14.getShortName((-1L), locale19);
        int int22 = dateTimeZone14.getOffsetFromLocal(0L);
        long long24 = dateTimeZone9.getMillisKeepLocal(dateTimeZone14, (long) 115200000);
        boolean boolean26 = dateTimeZone9.isStandardOffset(115200000L);
        int int28 = dateTimeZone9.getOffsetFromLocal((long) (short) 10);
        long long30 = dateTimeZone6.getMillisKeepLocal(dateTimeZone9, 1L);
        java.lang.String str31 = dateTimeZone9.toString();
        long long35 = dateTimeZone9.convertLocalToUTC((long) (short) -1, true, (-127920000L));
        boolean boolean36 = dateTimeZone0.equals((java.lang.Object) (-127920000L));
        long long38 = dateTimeZone0.nextTransition(187199991L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.001" + "'", str5, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 115200000L + "'", long24 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "UTC" + "'", str31, "UTC");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 187199991L + "'", long38 == 187199991L);
    }

    @Test
    public void test00729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00729");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long3 = dateTimeZone1.previousTransition((long) (short) 10);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName(360000032L, locale5);
        long long8 = dateTimeZone1.previousTransition((-243120001L));
        long long10 = dateTimeZone1.convertUTCToLocal(478320000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+01:00" + "'", str6, "+01:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-243120001L) + "'", long8 == (-243120001L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 481920000L + "'", long10 == 481920000L);
    }

    @Test
    public void test00730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00730");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 1);
        long long4 = dateTimeZone2.convertUTCToLocal((-3600000L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.lang.String str7 = dateTimeZone2.getNameKey(72000000L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 356460000L + "'", long4 == 356460000L);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00731");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-3600000), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00732");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffset(1L);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        long long7 = dateTimeZone1.previousTransition(115200000L);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone1.getOffset(readableInstant8);
        int int11 = dateTimeZone1.getStandardOffset(111600000L);
        long long13 = dateTimeZone1.convertUTCToLocal((-115199965L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 115200000L + "'", long7 == 115200000L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 115200000 + "'", int9 == 115200000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 115200000 + "'", int11 == 115200000);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
    }

    @Test
    public void test00733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00733");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00734");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffset(1L);
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) '4');
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        boolean boolean10 = dateTimeZone8.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone11 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        boolean boolean16 = dateTimeZone14.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone17 = dateTimeZone14.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.lang.String str20 = dateTimeZone18.getNameKey((long) (short) 10);
        java.lang.String str22 = dateTimeZone18.getName((long) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        boolean boolean24 = dateTimeZone23.isFixed();
        int int26 = dateTimeZone23.getStandardOffset(0L);
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone23.getShortName((-1L), locale28);
        java.lang.String str31 = dateTimeZone23.getShortName(1L);
        long long33 = dateTimeZone18.getMillisKeepLocal(dateTimeZone23, (long) (-1));
        java.util.Locale locale35 = null;
        java.lang.String str36 = dateTimeZone18.getName(0L, locale35);
        long long38 = dateTimeZone13.getMillisKeepLocal(dateTimeZone18, 1L);
        java.util.Locale locale40 = null;
        java.lang.String str41 = dateTimeZone18.getName((long) '4', locale40);
        boolean boolean42 = dateTimeZone18.isFixed();
        boolean boolean43 = dateTimeZone1.equals((java.lang.Object) boolean42);
        org.joda.time.LocalDateTime localDateTime44 = null;
        boolean boolean45 = dateTimeZone1.isLocalDateTimeGap(localDateTime44);
        java.util.Locale locale47 = null;
        java.lang.String str48 = dateTimeZone1.getShortName(349200000L, locale47);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.UTC;
        boolean boolean51 = dateTimeZone49.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone52 = dateTimeZone49.toTimeZone();
        java.util.Locale locale54 = null;
        java.lang.String str55 = dateTimeZone49.getShortName(0L, locale54);
        java.lang.String str56 = dateTimeZone49.getID();
        java.lang.String str58 = dateTimeZone49.getNameKey((long) 115200000);
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.lang.String str62 = dateTimeZone60.getShortName((long) 'a');
        java.util.Locale locale64 = null;
        java.lang.String str65 = dateTimeZone60.getShortName((long) (short) -1, locale64);
        int int67 = dateTimeZone60.getOffset((long) 115200000);
        int int69 = dateTimeZone60.getStandardOffset((long) (short) 10);
        java.lang.String str70 = dateTimeZone60.getID();
        long long72 = dateTimeZone49.getMillisKeepLocal(dateTimeZone60, (long) 0);
        int int74 = dateTimeZone49.getOffset(151200000L);
        long long76 = dateTimeZone1.getMillisKeepLocal(dateTimeZone49, (-3599903L));
        int int78 = dateTimeZone1.getStandardOffset((-3L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00" + "'", str29, "+00:00");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00" + "'", str31, "+00:00");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00" + "'", str36, "+00:00");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00" + "'", str41, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+32:00" + "'", str48, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(timeZone52);
        org.junit.Assert.assertEquals(timeZone52.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "+00:00" + "'", str55, "+00:00");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "UTC" + "'", str56, "UTC");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "UTC" + "'", str58, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone60);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "+32:00" + "'", str62, "+32:00");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "+32:00" + "'", str65, "+32:00");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 115200000 + "'", int67 == 115200000);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 115200000 + "'", int69 == 115200000);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "+32:00" + "'", str70, "+32:00");
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + (-115200000L) + "'", long72 == (-115200000L));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 111600097L + "'", long76 == 111600097L);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 115200000 + "'", int78 == 115200000);
    }

    @Test
    public void test00735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00735");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) ' ', locale3);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int7 = dateTimeZone1.getOffset((long) 115200000);
        long long9 = dateTimeZone1.nextTransition((long) (-3600000));
        long long12 = dateTimeZone1.adjustOffset(359999999L, false);
        long long14 = dateTimeZone1.previousTransition((-547859900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-01:00" + "'", str4, "-01:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-3600000) + "'", int7 == (-3600000));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-3600000L) + "'", long9 == (-3600000L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 359999999L + "'", long12 == 359999999L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-547859900L) + "'", long14 == (-547859900L));
    }

    @Test
    public void test00736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00736");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) '4');
        java.lang.Class<?> wildcardClass3 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00737");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        int int4 = dateTimeZone0.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        boolean boolean6 = dateTimeZone5.isFixed();
        int int8 = dateTimeZone5.getStandardOffset(0L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone5.getShortName((-1L), locale10);
        int int13 = dateTimeZone5.getOffsetFromLocal(0L);
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) 115200000);
        boolean boolean17 = dateTimeZone0.isStandardOffset(115200000L);
        long long20 = dateTimeZone0.convertLocalToUTC((long) 10, true);
        java.lang.String str21 = dateTimeZone0.toString();
        int int23 = dateTimeZone0.getOffset(52L);
        long long26 = dateTimeZone0.adjustOffset((long) (short) 100, true);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone28 = dateTimeZone27.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        java.lang.String str32 = dateTimeZone30.getNameKey(32L);
        boolean boolean33 = dateTimeZone0.equals((java.lang.Object) 32L);
        int int35 = dateTimeZone0.getOffset(152L);
        boolean boolean37 = dateTimeZone0.isStandardOffset((-11L));
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.UTC;
        boolean boolean39 = dateTimeZone38.isFixed();
        boolean boolean40 = dateTimeZone38.isFixed();
        long long44 = dateTimeZone38.convertLocalToUTC(1L, true, (long) (byte) 10);
        java.util.Locale locale46 = null;
        java.lang.String str47 = dateTimeZone38.getName((long) (-1), locale46);
        org.joda.time.LocalDateTime localDateTime48 = null;
        boolean boolean49 = dateTimeZone38.isLocalDateTimeGap(localDateTime48);
        long long51 = dateTimeZone0.getMillisKeepLocal(dateTimeZone38, (-12L));
        java.util.Locale locale53 = null;
        java.lang.String str54 = dateTimeZone0.getName(350879999L, locale53);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "UTC" + "'", str32, "UTC");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1L + "'", long44 == 1L);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+00:00" + "'", str47, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-12L) + "'", long51 == (-12L));
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "+00:00" + "'", str54, "+00:00");
    }

    @Test
    public void test00738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00738");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("UTC");
        int int3 = dateTimeZone1.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((long) (byte) 0, locale5);
        int int8 = dateTimeZone1.getOffset((long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone12.getName((long) ' ', locale14);
        boolean boolean16 = dateTimeZone10.equals((java.lang.Object) dateTimeZone12);
        boolean boolean17 = dateTimeZone1.equals((java.lang.Object) dateTimeZone12);
        boolean boolean18 = dateTimeZone1.isFixed();
        java.lang.String str20 = dateTimeZone1.getNameKey(0L);
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = dateTimeZone1.isLocalDateTimeGap(localDateTime21);
        int int24 = dateTimeZone1.getOffsetFromLocal((-115199948L));
        org.joda.time.ReadableInstant readableInstant25 = null;
        int int26 = dateTimeZone1.getOffset(readableInstant25);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-01:00" + "'", str15, "-01:00");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test00739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00739");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        java.lang.String str3 = dateTimeZone1.getName(10L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((long) 'a', locale5);
        java.lang.String str7 = dateTimeZone1.getID();
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        java.lang.String str11 = dateTimeZone1.getName(824399997L);
        int int13 = dateTimeZone1.getOffsetFromLocal((-3599990L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-01:00" + "'", str3, "-01:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-01:00" + "'", str6, "-01:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-01:00" + "'", str7, "-01:00");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-01:00" + "'", str11, "-01:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-3600000) + "'", int13 == (-3600000));
    }

    @Test
    public void test00740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00740");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((-60001L), locale5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone7.getOffset(readableInstant8);
        int int11 = dateTimeZone7.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        boolean boolean13 = dateTimeZone12.isFixed();
        int int15 = dateTimeZone12.getStandardOffset(0L);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone12.getShortName((-1L), locale17);
        int int20 = dateTimeZone12.getOffsetFromLocal(0L);
        long long22 = dateTimeZone7.getMillisKeepLocal(dateTimeZone12, (long) 115200000);
        boolean boolean24 = dateTimeZone7.isStandardOffset(115200000L);
        long long27 = dateTimeZone7.convertLocalToUTC((long) 10, true);
        java.lang.String str28 = dateTimeZone7.toString();
        int int30 = dateTimeZone7.getOffset(52L);
        java.lang.String str32 = dateTimeZone7.getNameKey(0L);
        java.lang.String str34 = dateTimeZone7.getName((long) 0);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forID("UTC");
        int int38 = dateTimeZone36.getStandardOffset(0L);
        java.util.Locale locale40 = null;
        java.lang.String str41 = dateTimeZone36.getShortName((long) (byte) 0, locale40);
        boolean boolean42 = dateTimeZone7.equals((java.lang.Object) locale40);
        long long44 = dateTimeZone7.previousTransition((-232079900L));
        boolean boolean45 = dateTimeZone1.equals((java.lang.Object) (-232079900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.010" + "'", str6, "+00:00:00.010");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 115200000L + "'", long22 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L + "'", long27 == 10L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UTC" + "'", str28, "UTC");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "UTC" + "'", str32, "UTC");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00" + "'", str34, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00" + "'", str41, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-232079900L) + "'", long44 == (-232079900L));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test00741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00741");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getNameKey(1L);
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        long long9 = dateTimeZone0.adjustOffset((long) (short) 1, false);
        java.lang.String str11 = dateTimeZone0.getShortName((long) (byte) 0);
        java.lang.Class<?> wildcardClass12 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00742");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1920000, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00743");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        boolean boolean4 = dateTimeZone0.isFixed();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone6.getShortName((long) 'a', locale8);
        long long12 = dateTimeZone6.adjustOffset((long) (byte) 10, true);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        boolean boolean14 = dateTimeZone13.isFixed();
        boolean boolean15 = dateTimeZone6.equals((java.lang.Object) dateTimeZone13);
        long long17 = dateTimeZone0.getMillisKeepLocal(dateTimeZone6, (long) (short) -1);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone6.getName(111600097L, locale19);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+100:00" + "'", str9, "+100:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-360000001L) + "'", long17 == (-360000001L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+100:00" + "'", str20, "+100:00");
    }

    @Test
    public void test00744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00744");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        java.lang.String str3 = dateTimeZone1.getName(10L);
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        int int6 = dateTimeZone1.getOffsetFromLocal((long) (short) 100);
        long long8 = dateTimeZone1.convertUTCToLocal((-60001L));
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        java.lang.Class<?> wildcardClass11 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-01:00" + "'", str3, "-01:00");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT-01:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3600000) + "'", int6 == (-3600000));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-3660001L) + "'", long8 == (-3660001L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00745");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, (int) '#');
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test00746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00746");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        boolean boolean4 = dateTimeZone0.isFixed();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone6.getShortName((long) 'a', locale8);
        long long12 = dateTimeZone6.adjustOffset((long) (byte) 10, true);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        boolean boolean14 = dateTimeZone13.isFixed();
        boolean boolean15 = dateTimeZone6.equals((java.lang.Object) dateTimeZone13);
        long long17 = dateTimeZone0.getMillisKeepLocal(dateTimeZone6, (long) (short) -1);
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = dateTimeZone6.isLocalDateTimeGap(localDateTime18);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        boolean boolean22 = dateTimeZone20.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone23 = dateTimeZone20.toTimeZone();
        boolean boolean25 = dateTimeZone20.isStandardOffset(100L);
        java.lang.String str27 = dateTimeZone20.getName((long) (byte) 100);
        java.util.TimeZone timeZone28 = dateTimeZone20.toTimeZone();
        java.lang.String str29 = dateTimeZone20.getID();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        boolean boolean31 = dateTimeZone30.isFixed();
        int int33 = dateTimeZone30.getStandardOffset(0L);
        java.util.Locale locale35 = null;
        java.lang.String str36 = dateTimeZone30.getShortName((-1L), locale35);
        int int38 = dateTimeZone30.getOffsetFromLocal(0L);
        int int40 = dateTimeZone30.getStandardOffset((long) (byte) 10);
        java.lang.String str42 = dateTimeZone30.getName((long) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone44 = dateTimeZone43.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forTimeZone(timeZone44);
        long long47 = dateTimeZone30.getMillisKeepLocal(dateTimeZone45, (long) (short) 100);
        long long49 = dateTimeZone20.getMillisKeepLocal(dateTimeZone30, 97L);
        long long51 = dateTimeZone6.getMillisKeepLocal(dateTimeZone20, (-10L));
        java.lang.Class<?> wildcardClass52 = dateTimeZone20.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+100:00" + "'", str9, "+100:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-360000001L) + "'", long17 == (-360000001L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UTC" + "'", str29, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00" + "'", str36, "+00:00");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00" + "'", str42, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(timeZone44);
        org.junit.Assert.assertEquals(timeZone44.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 100L + "'", long47 == 100L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 97L + "'", long49 == 97L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 359999990L + "'", long51 == 359999990L);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test00747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00747");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        int int4 = dateTimeZone0.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        boolean boolean6 = dateTimeZone5.isFixed();
        int int8 = dateTimeZone5.getStandardOffset(0L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone5.getShortName((-1L), locale10);
        int int13 = dateTimeZone5.getOffsetFromLocal(0L);
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) 115200000);
        boolean boolean17 = dateTimeZone0.isStandardOffset(115200000L);
        long long20 = dateTimeZone0.convertLocalToUTC((long) 10, true);
        java.lang.String str21 = dateTimeZone0.toString();
        boolean boolean23 = dateTimeZone0.isStandardOffset((long) 100);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        boolean boolean26 = dateTimeZone24.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone27 = dateTimeZone24.toTimeZone();
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeZone24.getShortName(0L, locale29);
        java.lang.String str31 = dateTimeZone24.getID();
        java.lang.String str33 = dateTimeZone24.getNameKey((long) 115200000);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.lang.String str37 = dateTimeZone35.getShortName((long) 'a');
        java.util.Locale locale39 = null;
        java.lang.String str40 = dateTimeZone35.getShortName((long) (short) -1, locale39);
        int int42 = dateTimeZone35.getOffset((long) 115200000);
        int int44 = dateTimeZone35.getStandardOffset((long) (short) 10);
        java.lang.String str45 = dateTimeZone35.getID();
        long long47 = dateTimeZone24.getMillisKeepLocal(dateTimeZone35, (long) 0);
        long long49 = dateTimeZone0.getMillisKeepLocal(dateTimeZone24, (long) 600000);
        boolean boolean51 = dateTimeZone24.isStandardOffset(9L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone24);
        java.lang.String str53 = dateTimeZone24.toString();
        java.lang.String str55 = dateTimeZone24.getNameKey((-178080000L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00" + "'", str30, "+00:00");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "UTC" + "'", str31, "UTC");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "UTC" + "'", str33, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+32:00" + "'", str37, "+32:00");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+32:00" + "'", str40, "+32:00");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 115200000 + "'", int42 == 115200000);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 115200000 + "'", int44 == 115200000);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+32:00" + "'", str45, "+32:00");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-115200000L) + "'", long47 == (-115200000L));
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 600000L + "'", long49 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "UTC" + "'", str53, "UTC");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "UTC" + "'", str55, "UTC");
    }

    @Test
    public void test00748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00748");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone0.isLocalDateTimeGap(localDateTime2);
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 10);
        int int7 = dateTimeZone0.getOffset((long) (short) 1);
        long long9 = dateTimeZone0.nextTransition((long) (-1));
        boolean boolean11 = dateTimeZone0.isStandardOffset((long) (byte) 10);
        long long14 = dateTimeZone0.adjustOffset((long) (short) 100, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.Object obj16 = null;
        boolean boolean17 = dateTimeZone0.equals(obj16);
        boolean boolean18 = dateTimeZone0.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test00749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00749");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        java.lang.String str3 = dateTimeZone1.getName(10L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((long) 'a', locale5);
        java.lang.String str7 = dateTimeZone1.getID();
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone1.isLocalDateTimeGap(localDateTime8);
        java.lang.String str11 = dateTimeZone1.getName(824399997L);
        long long14 = dateTimeZone1.adjustOffset((-190800010L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-01:00" + "'", str3, "-01:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-01:00" + "'", str6, "-01:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-01:00" + "'", str7, "-01:00");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-01:00" + "'", str11, "-01:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-190800010L) + "'", long14 == (-190800010L));
    }

    @Test
    public void test00750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00750");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        long long6 = dateTimeZone1.convertLocalToUTC(52L, false);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00751");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getName(10L, locale5);
        long long8 = dateTimeZone0.previousTransition(115200097L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone0.getShortName(127920000L, locale10);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 115200097L + "'", long8 == 115200097L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
    }

    @Test
    public void test00752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00752");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(1);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        long long4 = dateTimeZone2.convertUTCToLocal((long) (byte) 0);
        java.lang.Object obj5 = null;
        boolean boolean6 = dateTimeZone2.equals(obj5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        boolean boolean8 = dateTimeZone7.isFixed();
        int int10 = dateTimeZone7.getStandardOffset(0L);
        java.lang.String str12 = dateTimeZone7.getNameKey(1L);
        int int14 = dateTimeZone7.getOffset((-1L));
        long long16 = dateTimeZone2.getMillisKeepLocal(dateTimeZone7, (-115199990L));
        boolean boolean17 = dateTimeZone1.equals((java.lang.Object) long16);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone1.getName((-184199900L), locale19);
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = dateTimeZone1.isLocalDateTimeGap(localDateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-115199990L) + "'", long16 == (-115199990L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+01:00" + "'", str20, "+01:00");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00753");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        int int4 = dateTimeZone0.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        boolean boolean6 = dateTimeZone5.isFixed();
        int int8 = dateTimeZone5.getStandardOffset(0L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone5.getShortName((-1L), locale10);
        int int13 = dateTimeZone5.getOffsetFromLocal(0L);
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) 115200000);
        boolean boolean17 = dateTimeZone0.isStandardOffset(115200000L);
        int int19 = dateTimeZone0.getOffsetFromLocal((long) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        long long23 = dateTimeZone0.getMillisKeepLocal(dateTimeZone21, 118799999L);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        boolean boolean26 = dateTimeZone24.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone27 = dateTimeZone24.toTimeZone();
        boolean boolean29 = dateTimeZone24.isStandardOffset(100L);
        java.lang.String str30 = dateTimeZone24.getID();
        java.lang.String str32 = dateTimeZone24.getShortName(1L);
        java.lang.String str34 = dateTimeZone24.getNameKey((long) (short) 100);
        long long38 = dateTimeZone24.convertLocalToUTC(1L, true, (long) (short) 0);
        java.lang.String str40 = dateTimeZone24.getName((long) 360000000);
        long long44 = dateTimeZone24.convertLocalToUTC((-6720000L), true, 707580000L);
        long long46 = dateTimeZone24.convertUTCToLocal(100L);
        boolean boolean47 = dateTimeZone21.equals((java.lang.Object) long46);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 118799999L + "'", long23 == 118799999L);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "UTC" + "'", str30, "UTC");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "UTC" + "'", str34, "UTC");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00" + "'", str40, "+00:00");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-6720000L) + "'", long44 == (-6720000L));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 100L + "'", long46 == 100L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test00754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00754");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        int int9 = dateTimeZone7.getOffset(3600001L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00755");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        int int8 = dateTimeZone0.getOffsetFromLocal(0L);
        int int10 = dateTimeZone0.getStandardOffset((long) (byte) 10);
        java.lang.String str12 = dateTimeZone0.getName((long) (byte) 10);
        java.lang.String str14 = dateTimeZone0.getName((long) '#');
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone0.getShortName(97L, locale16);
        java.lang.String str19 = dateTimeZone0.getNameKey((long) 115200000);
        long long21 = dateTimeZone0.convertUTCToLocal(359999998L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 359999998L + "'", long21 == 359999998L);
    }

    @Test
    public void test00756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00756");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        java.lang.Class<?> wildcardClass16 = provider0.getClass();
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00757");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        int int8 = dateTimeZone0.getOffsetFromLocal(0L);
        int int10 = dateTimeZone0.getStandardOffset((long) (byte) 10);
        java.lang.String str12 = dateTimeZone0.getName((long) (byte) 10);
        int int14 = dateTimeZone0.getStandardOffset((-1L));
        int int16 = dateTimeZone0.getOffsetFromLocal((long) 10);
        int int18 = dateTimeZone0.getStandardOffset(0L);
        java.lang.Class<?> wildcardClass19 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00758");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName(0L, locale5);
        java.lang.String str7 = dateTimeZone0.getID();
        java.lang.String str9 = dateTimeZone0.getNameKey((long) 115200000);
        java.lang.String str10 = dateTimeZone0.getID();
        java.lang.String str11 = dateTimeZone0.toString();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone0.getShortName((-232079900L), locale13);
        boolean boolean15 = dateTimeZone0.isFixed();
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone0.getName(360060000L, locale17);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
    }

    @Test
    public void test00759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00759");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        int int8 = dateTimeZone0.getOffsetFromLocal(0L);
        int int10 = dateTimeZone0.getStandardOffset((long) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        int int13 = dateTimeZone0.getOffset((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone0.getOffset(readableInstant14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone0.getOffset(readableInstant16);
        java.lang.String str19 = dateTimeZone0.getNameKey(824399997L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
    }

    @Test
    public void test00760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00760");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        java.lang.String str3 = dateTimeZone0.getShortName((long) (byte) 100);
        java.lang.String str5 = dateTimeZone0.getShortName((long) (-1));
        java.lang.String str7 = dateTimeZone0.getName((long) 0);
        int int9 = dateTimeZone0.getOffset((long) 100);
        int int11 = dateTimeZone0.getStandardOffset((long) 1);
        java.lang.String str12 = dateTimeZone0.getID();
        java.lang.String str13 = dateTimeZone0.toString();
        int int15 = dateTimeZone0.getStandardOffset((-127920000L));
        boolean boolean17 = dateTimeZone0.isStandardOffset(127920010L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test00761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00761");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getNameKey(1L);
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) "+97:00");
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        boolean boolean10 = dateTimeZone8.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone11 = dateTimeZone8.toTimeZone();
        boolean boolean12 = dateTimeZone8.isFixed();
        long long14 = dateTimeZone0.getMillisKeepLocal(dateTimeZone8, (long) 1);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        boolean boolean16 = dateTimeZone15.isFixed();
        int int18 = dateTimeZone15.getStandardOffset(0L);
        java.lang.String str20 = dateTimeZone15.getShortName((long) (byte) 100);
        java.lang.String str22 = dateTimeZone15.getShortName((long) (short) 0);
        java.lang.String str24 = dateTimeZone15.getShortName(0L);
        boolean boolean26 = dateTimeZone15.equals((java.lang.Object) '4');
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone15.getName(35L, locale28);
        long long31 = dateTimeZone8.getMillisKeepLocal(dateTimeZone15, (-232079900L));
        int int33 = dateTimeZone8.getStandardOffset(356400000L);
        java.lang.Class<?> wildcardClass34 = dateTimeZone8.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00" + "'", str29, "+00:00");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-232079900L) + "'", long31 == (-232079900L));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test00762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00762");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale2 = null;
        java.lang.String str3 = dateTimeZone0.getShortName((long) 115200000, locale2);
        boolean boolean4 = dateTimeZone0.isFixed();
        long long6 = dateTimeZone0.previousTransition((long) (short) 10);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone0.getShortName(356460000L, locale8);
        java.lang.String str10 = dateTimeZone0.toString();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        boolean boolean12 = dateTimeZone11.isFixed();
        int int14 = dateTimeZone11.getStandardOffset(0L);
        java.lang.String str16 = dateTimeZone11.getShortName((long) (byte) 100);
        java.lang.String str18 = dateTimeZone11.getShortName((long) (short) 0);
        java.lang.String str20 = dateTimeZone11.getShortName(0L);
        long long22 = dateTimeZone11.nextTransition((long) (byte) -1);
        int int24 = dateTimeZone11.getOffsetFromLocal((long) (short) 1);
        java.lang.String str26 = dateTimeZone11.getShortName(35L);
        boolean boolean27 = dateTimeZone0.equals((java.lang.Object) str26);
        java.util.TimeZone timeZone28 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00" + "'", str26, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone29);
    }

    @Test
    public void test00763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00763");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        int int4 = dateTimeZone0.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        boolean boolean6 = dateTimeZone5.isFixed();
        int int8 = dateTimeZone5.getStandardOffset(0L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone5.getShortName((-1L), locale10);
        int int13 = dateTimeZone5.getOffsetFromLocal(0L);
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) 115200000);
        long long17 = dateTimeZone0.previousTransition((long) (byte) -1);
        int int19 = dateTimeZone0.getStandardOffset((long) (byte) -1);
        java.lang.String str21 = dateTimeZone0.getName(359999999L);
        java.util.TimeZone timeZone22 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone23);
    }

    @Test
    public void test00764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00764");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        boolean boolean2 = dateTimeZone0.isFixed();
        int int4 = dateTimeZone0.getOffsetFromLocal((long) 1);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone0.getOffset(readableInstant5);
        java.lang.String str7 = dateTimeZone0.getID();
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00765");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        boolean boolean2 = dateTimeZone0.isFixed();
        long long6 = dateTimeZone0.convertLocalToUTC(1L, true, (long) (byte) 10);
        long long10 = dateTimeZone0.convertLocalToUTC((long) 115200000, false, (long) 10);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone0.isLocalDateTimeGap(localDateTime11);
        long long14 = dateTimeZone0.previousTransition((long) (-1));
        int int16 = dateTimeZone0.getOffsetFromLocal(97L);
        java.lang.String str18 = dateTimeZone0.getName(3600052L);
        int int20 = dateTimeZone0.getOffset((-105000009L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 115200000L + "'", long10 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test00766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00766");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getShortName((long) (byte) 100);
        java.lang.String str7 = dateTimeZone0.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        long long13 = dateTimeZone0.convertLocalToUTC((long) (short) 10, false, (long) (short) 1);
        java.lang.String str15 = dateTimeZone0.getShortName((long) (byte) 10);
        java.util.TimeZone timeZone16 = dateTimeZone0.toTimeZone();
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone0.getShortName((-187799900L), locale18);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
    }

    @Test
    public void test00767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00767");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, 0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test00768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00768");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, 36060000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 36060000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00769");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        boolean boolean5 = dateTimeZone0.isStandardOffset(100L);
        java.lang.String str6 = dateTimeZone0.getID();
        long long8 = dateTimeZone0.previousTransition((long) (short) 10);
        java.util.TimeZone timeZone9 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (int) (short) 1);
        long long14 = dateTimeZone12.convertUTCToLocal((-60001L));
        boolean boolean15 = dateTimeZone0.equals((java.lang.Object) dateTimeZone12);
        java.lang.String str17 = dateTimeZone12.getName((-662399965L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 125999999L + "'", long14 == 125999999L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+35:01" + "'", str17, "+35:01");
    }

    @Test
    public void test00770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00770");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long9 = dateTimeZone7.previousTransition(42L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 42L + "'", long9 == 42L);
    }

    @Test
    public void test00771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00771");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long2 = dateTimeZone0.convertUTCToLocal((long) (byte) 0);
        java.lang.String str3 = dateTimeZone0.toString();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        boolean boolean5 = dateTimeZone4.isFixed();
        int int7 = dateTimeZone4.getStandardOffset(0L);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone4.getShortName((-1L), locale9);
        int int12 = dateTimeZone4.getOffsetFromLocal(0L);
        java.lang.String str14 = dateTimeZone4.getShortName(0L);
        java.lang.String str16 = dateTimeZone4.getShortName(359999999L);
        long long18 = dateTimeZone0.getMillisKeepLocal(dateTimeZone4, (-1L));
        java.lang.Class<?> wildcardClass19 = dateTimeZone4.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00772");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        long long5 = dateTimeZone1.nextTransition(151200000L);
        int int7 = dateTimeZone1.getOffsetFromLocal(345600000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 151200000L + "'", long5 == 151200000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test00773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00773");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        int int4 = dateTimeZone0.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        boolean boolean6 = dateTimeZone5.isFixed();
        int int8 = dateTimeZone5.getStandardOffset(0L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone5.getShortName((-1L), locale10);
        int int13 = dateTimeZone5.getOffsetFromLocal(0L);
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) 115200000);
        boolean boolean17 = dateTimeZone0.isStandardOffset(115200000L);
        long long20 = dateTimeZone0.convertLocalToUTC((long) 10, true);
        java.lang.String str21 = dateTimeZone0.toString();
        int int23 = dateTimeZone0.getOffset(52L);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone0.getOffset(readableInstant24);
        java.lang.String str27 = dateTimeZone0.getName(100L);
        long long30 = dateTimeZone0.convertLocalToUTC((long) 360060000, false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 360060000L + "'", long30 == 360060000L);
    }

    @Test
    public void test00774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00774");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        int int4 = dateTimeZone0.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        boolean boolean6 = dateTimeZone5.isFixed();
        int int8 = dateTimeZone5.getStandardOffset(0L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone5.getShortName((-1L), locale10);
        int int13 = dateTimeZone5.getOffsetFromLocal(0L);
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) 115200000);
        boolean boolean17 = dateTimeZone0.isStandardOffset(115200000L);
        long long20 = dateTimeZone0.convertLocalToUTC((long) 10, true);
        java.lang.String str22 = dateTimeZone0.getNameKey((long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        boolean boolean24 = dateTimeZone23.isFixed();
        org.joda.time.LocalDateTime localDateTime25 = null;
        boolean boolean26 = dateTimeZone23.isLocalDateTimeGap(localDateTime25);
        long long29 = dateTimeZone23.adjustOffset((long) (short) 10, false);
        boolean boolean30 = dateTimeZone0.equals((java.lang.Object) dateTimeZone23);
        int int32 = dateTimeZone0.getOffset((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime33 = null;
        boolean boolean34 = dateTimeZone0.isLocalDateTimeGap(localDateTime33);
        java.lang.String str35 = dateTimeZone0.toString();
        long long37 = dateTimeZone0.nextTransition((long) '4');
        long long40 = dateTimeZone0.convertLocalToUTC(36000000L, false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "UTC" + "'", str35, "UTC");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 52L + "'", long37 == 52L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 36000000L + "'", long40 == 36000000L);
    }

    @Test
    public void test00775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00775");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(363120000, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00776");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale2 = null;
        java.lang.String str3 = dateTimeZone0.getShortName((long) 115200000, locale2);
        boolean boolean4 = dateTimeZone0.isFixed();
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone0.getName(52L, locale6);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone0.getName((long) (byte) -1, locale9);
        int int12 = dateTimeZone0.getOffset((long) (-3600000));
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone0.isLocalDateTimeGap(localDateTime13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone0.getOffset(readableInstant15);
        long long18 = dateTimeZone0.nextTransition(3599999L);
        java.lang.Class<?> wildcardClass19 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3599999L + "'", long18 == 3599999L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00777");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) ' ');
        long long4 = dateTimeZone2.previousTransition(115200100L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.util.TimeZone timeZone6 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        boolean boolean9 = dateTimeZone2.equals((java.lang.Object) ' ');
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 115200100L + "'", long4 == 115200100L);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00778");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffset(129660000L);
        int int5 = dateTimeZone1.getOffset((-1L));
        long long8 = dateTimeZone1.adjustOffset(126060000L, true);
        boolean boolean10 = dateTimeZone1.isStandardOffset((-65L));
        boolean boolean11 = dateTimeZone1.isFixed();
        int int13 = dateTimeZone1.getOffsetFromLocal((-39600000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 115200000 + "'", int5 == 115200000);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 126060000L + "'", long8 == 126060000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 115200000 + "'", int13 == 115200000);
    }

    @Test
    public void test00779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00779");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+100:52");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+100:52\" is malformed at \"0:52\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00780");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        java.lang.String str8 = dateTimeZone0.getShortName(1L);
        long long10 = dateTimeZone0.nextTransition((long) 0);
        long long12 = dateTimeZone0.nextTransition((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (int) ' ');
        boolean boolean16 = dateTimeZone0.equals((java.lang.Object) '#');
        long long18 = dateTimeZone0.convertUTCToLocal((-3600000L));
        int int20 = dateTimeZone0.getOffset((long) (-1));
        int int22 = dateTimeZone0.getOffset((long) '#');
        int int24 = dateTimeZone0.getStandardOffset(350879999L);
        java.lang.String str25 = dateTimeZone0.toString();
        int int27 = dateTimeZone0.getOffset((long) 5700000);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-3600000L) + "'", long18 == (-3600000L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTC" + "'", str25, "UTC");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test00781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00781");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(360060000, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00782");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(36000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00783");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(349800000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00784");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone0.isLocalDateTimeGap(localDateTime2);
        long long5 = dateTimeZone0.convertUTCToLocal(0L);
        java.lang.String str6 = dateTimeZone0.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        boolean boolean8 = dateTimeZone0.isFixed();
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone0.getOffset(readableInstant9);
        java.lang.String str11 = dateTimeZone0.getID();
        long long14 = dateTimeZone0.adjustOffset(0L, false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test00785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00785");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone0.isLocalDateTimeGap(localDateTime2);
        long long5 = dateTimeZone0.convertUTCToLocal(0L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.String str8 = dateTimeZone0.getNameKey((long) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        boolean boolean11 = dateTimeZone9.equals((java.lang.Object) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone12.getOffset(readableInstant13);
        int int16 = dateTimeZone12.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        boolean boolean18 = dateTimeZone17.isFixed();
        int int20 = dateTimeZone17.getStandardOffset(0L);
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone17.getShortName((-1L), locale22);
        int int25 = dateTimeZone17.getOffsetFromLocal(0L);
        long long27 = dateTimeZone12.getMillisKeepLocal(dateTimeZone17, (long) 115200000);
        boolean boolean29 = dateTimeZone12.isStandardOffset(115200000L);
        int int31 = dateTimeZone12.getOffsetFromLocal((long) (short) 10);
        long long33 = dateTimeZone9.getMillisKeepLocal(dateTimeZone12, 1L);
        long long35 = dateTimeZone0.getMillisKeepLocal(dateTimeZone9, (long) ' ');
        java.lang.Class<?> wildcardClass36 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 115200000L + "'", long27 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1L + "'", long33 == 1L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 32L + "'", long35 == 32L);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test00786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00786");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        boolean boolean5 = dateTimeZone0.isStandardOffset(100L);
        java.lang.String str6 = dateTimeZone0.getID();
        long long8 = dateTimeZone0.previousTransition((long) (short) 10);
        long long11 = dateTimeZone0.convertLocalToUTC((long) 126060000, true);
        int int13 = dateTimeZone0.getStandardOffset((long) 349200000);
        java.lang.String str15 = dateTimeZone0.getName((-356400000L));
        java.lang.String str16 = dateTimeZone0.getID();
        int int18 = dateTimeZone0.getStandardOffset((-39600000L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 126060000L + "'", long11 == 126060000L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00787");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(10);
        java.lang.String str3 = dateTimeZone1.getNameKey((-115199948L));
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00788");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        long long6 = dateTimeZone1.convertLocalToUTC(52L, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getName((-1L), locale9);
        boolean boolean11 = dateTimeZone1.isFixed();
        long long14 = dateTimeZone1.convertLocalToUTC((-127920000L), false);
        java.lang.String str15 = dateTimeZone1.toString();
        java.lang.String str16 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-127920000L) + "'", long14 == (-127920000L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
    }

    @Test
    public void test00789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00789");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 349200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 349200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00790");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) 'a', locale3);
        long long7 = dateTimeZone1.adjustOffset((long) (byte) 10, true);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getName((-32399999L), locale9);
        long long13 = dateTimeZone1.adjustOffset(356400000L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+100:00" + "'", str4, "+100:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+100:00" + "'", str10, "+100:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 356400000L + "'", long13 == 356400000L);
    }

    @Test
    public void test00791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00791");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 1920000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 1920000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00792");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) 'a', locale3);
        int int6 = dateTimeZone1.getOffsetFromLocal((-3600001L));
        java.lang.Class<?> wildcardClass7 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+100:00" + "'", str4, "+100:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 360000000 + "'", int6 == 360000000);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00793");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getNameKey(1L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getShortName((long) (short) -1, locale7);
        java.util.TimeZone timeZone9 = dateTimeZone0.toTimeZone();
        long long11 = dateTimeZone0.previousTransition(0L);
        long long13 = dateTimeZone0.convertUTCToLocal((-115200001L));
        java.lang.String str14 = dateTimeZone0.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115200001L) + "'", long13 == (-115200001L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
    }

    @Test
    public void test00794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00794");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getShortName((long) (byte) 100);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) 115200000, locale7);
        java.lang.String str10 = dateTimeZone0.getNameKey((long) 0);
        long long12 = dateTimeZone0.previousTransition((long) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        boolean boolean14 = dateTimeZone13.isFixed();
        int int16 = dateTimeZone13.getStandardOffset(0L);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone13.getShortName((-1L), locale18);
        int int21 = dateTimeZone13.getOffsetFromLocal(0L);
        int int23 = dateTimeZone13.getStandardOffset((long) (byte) 10);
        boolean boolean24 = dateTimeZone13.isFixed();
        boolean boolean26 = dateTimeZone13.isStandardOffset((long) (byte) 100);
        int int28 = dateTimeZone13.getOffsetFromLocal(115200100L);
        java.lang.String str29 = dateTimeZone13.getID();
        boolean boolean31 = dateTimeZone13.isStandardOffset((-2L));
        long long33 = dateTimeZone0.getMillisKeepLocal(dateTimeZone13, (long) 127920000);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant35 = null;
        int int36 = dateTimeZone34.getOffset(readableInstant35);
        int int38 = dateTimeZone34.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.UTC;
        boolean boolean40 = dateTimeZone39.isFixed();
        int int42 = dateTimeZone39.getStandardOffset(0L);
        java.util.Locale locale44 = null;
        java.lang.String str45 = dateTimeZone39.getShortName((-1L), locale44);
        int int47 = dateTimeZone39.getOffsetFromLocal(0L);
        long long49 = dateTimeZone34.getMillisKeepLocal(dateTimeZone39, (long) 115200000);
        boolean boolean51 = dateTimeZone34.isStandardOffset(115200000L);
        long long54 = dateTimeZone34.convertLocalToUTC((long) 10, true);
        java.lang.String str55 = dateTimeZone34.toString();
        int int57 = dateTimeZone34.getOffset(52L);
        long long60 = dateTimeZone34.adjustOffset((long) (short) 100, true);
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone62 = dateTimeZone61.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forTimeZone(timeZone62);
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.forTimeZone(timeZone62);
        java.lang.String str66 = dateTimeZone64.getNameKey(32L);
        boolean boolean67 = dateTimeZone34.equals((java.lang.Object) 32L);
        int int69 = dateTimeZone34.getOffset(152L);
        boolean boolean71 = dateTimeZone34.isStandardOffset((-11L));
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.UTC;
        boolean boolean73 = dateTimeZone72.isFixed();
        boolean boolean74 = dateTimeZone72.isFixed();
        long long78 = dateTimeZone72.convertLocalToUTC(1L, true, (long) (byte) 10);
        java.util.Locale locale80 = null;
        java.lang.String str81 = dateTimeZone72.getName((long) (-1), locale80);
        org.joda.time.LocalDateTime localDateTime82 = null;
        boolean boolean83 = dateTimeZone72.isLocalDateTimeGap(localDateTime82);
        long long85 = dateTimeZone34.getMillisKeepLocal(dateTimeZone72, (-12L));
        boolean boolean86 = dateTimeZone0.equals((java.lang.Object) dateTimeZone72);
        java.lang.String str88 = dateTimeZone72.getNameKey((-430919900L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UTC" + "'", str29, "UTC");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 127920000L + "'", long33 == 127920000L);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+00:00" + "'", str45, "+00:00");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 115200000L + "'", long49 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 10L + "'", long54 == 10L);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "UTC" + "'", str55, "UTC");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 100L + "'", long60 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone61);
        org.junit.Assert.assertNotNull(timeZone62);
        org.junit.Assert.assertEquals(timeZone62.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone63);
        org.junit.Assert.assertNotNull(dateTimeZone64);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "UTC" + "'", str66, "UTC");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(dateTimeZone72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 1L + "'", long78 == 1L);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "+00:00" + "'", str81, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + (-12L) + "'", long85 == (-12L));
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "UTC" + "'", str88, "UTC");
    }

    @Test
    public void test00795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00795");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        int int4 = dateTimeZone0.getStandardOffset((long) ' ');
        long long6 = dateTimeZone0.convertUTCToLocal((long) 'a');
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone0.isLocalDateTimeGap(localDateTime7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00796");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        int int8 = dateTimeZone0.getOffsetFromLocal(0L);
        int int10 = dateTimeZone0.getStandardOffset((long) (byte) 10);
        java.lang.String str12 = dateTimeZone0.getName((long) (byte) 10);
        java.lang.String str14 = dateTimeZone0.getName((long) '#');
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone0.getShortName(97L, locale16);
        long long19 = dateTimeZone0.previousTransition(115200097L);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone0.getName(0L, locale21);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 115200097L + "'", long19 == 115200097L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
    }

    @Test
    public void test00797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00797");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        boolean boolean2 = dateTimeZone0.isFixed();
        long long6 = dateTimeZone0.convertLocalToUTC(1L, true, (long) (byte) 10);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone0.getName((long) (-1), locale8);
        java.lang.String str10 = dateTimeZone0.getID();
        java.lang.String str12 = dateTimeZone0.getNameKey((long) 115200000);
        int int14 = dateTimeZone0.getOffset((-1L));
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone15.getOffset(readableInstant16);
        int int19 = dateTimeZone15.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        boolean boolean21 = dateTimeZone20.isFixed();
        int int23 = dateTimeZone20.getStandardOffset(0L);
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone20.getShortName((-1L), locale25);
        int int28 = dateTimeZone20.getOffsetFromLocal(0L);
        long long30 = dateTimeZone15.getMillisKeepLocal(dateTimeZone20, (long) 115200000);
        java.lang.String str32 = dateTimeZone15.getShortName((long) '4');
        org.joda.time.LocalDateTime localDateTime33 = null;
        boolean boolean34 = dateTimeZone15.isLocalDateTimeGap(localDateTime33);
        java.lang.String str36 = dateTimeZone15.getNameKey(115199999L);
        java.util.TimeZone timeZone37 = dateTimeZone15.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forTimeZone(timeZone37);
        long long40 = dateTimeZone0.getMillisKeepLocal(dateTimeZone38, 391800032L);
        org.joda.time.ReadableInstant readableInstant41 = null;
        int int42 = dateTimeZone38.getOffset(readableInstant41);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00" + "'", str26, "+00:00");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 115200000L + "'", long30 == 115200000L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UTC" + "'", str36, "UTC");
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 391800032L + "'", long40 == 391800032L);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test00798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00798");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        int int8 = dateTimeZone0.getOffsetFromLocal(0L);
        java.lang.String str10 = dateTimeZone0.getShortName(0L);
        long long14 = dateTimeZone0.convertLocalToUTC((long) (byte) 0, false, 0L);
        long long17 = dateTimeZone0.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str18 = dateTimeZone0.getID();
        java.lang.String str19 = dateTimeZone0.toString();
        long long22 = dateTimeZone0.adjustOffset((long) (byte) 1, false);
        int int24 = dateTimeZone0.getOffsetFromLocal((-115199990L));
        java.lang.Class<?> wildcardClass25 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00799");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getNameKey(1L);
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        java.lang.String str9 = dateTimeZone8.toString();
        long long12 = dateTimeZone8.convertLocalToUTC(35L, false);
        long long14 = dateTimeZone8.convertUTCToLocal(234000000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 234000000L + "'", long14 == 234000000L);
    }

    @Test
    public void test00800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00800");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        int int4 = dateTimeZone0.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        boolean boolean6 = dateTimeZone5.isFixed();
        int int8 = dateTimeZone5.getStandardOffset(0L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone5.getShortName((-1L), locale10);
        int int13 = dateTimeZone5.getOffsetFromLocal(0L);
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) 115200000);
        boolean boolean17 = dateTimeZone0.isStandardOffset(115200000L);
        long long20 = dateTimeZone0.convertLocalToUTC((long) 10, true);
        java.lang.String str22 = dateTimeZone0.getNameKey((long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        boolean boolean24 = dateTimeZone23.isFixed();
        org.joda.time.LocalDateTime localDateTime25 = null;
        boolean boolean26 = dateTimeZone23.isLocalDateTimeGap(localDateTime25);
        long long29 = dateTimeZone23.adjustOffset((long) (short) 10, false);
        boolean boolean30 = dateTimeZone0.equals((java.lang.Object) dateTimeZone23);
        java.lang.String str32 = dateTimeZone0.getNameKey(115200100L);
        long long34 = dateTimeZone0.convertUTCToLocal((-111600010L));
        boolean boolean36 = dateTimeZone0.isStandardOffset(0L);
        java.util.Locale locale38 = null;
        java.lang.String str39 = dateTimeZone0.getName((-187199965L), locale38);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "UTC" + "'", str32, "UTC");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-111600010L) + "'", long34 == (-111600010L));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00" + "'", str39, "+00:00");
    }

    @Test
    public void test00801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00801");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        java.lang.String str8 = dateTimeZone0.getShortName(1L);
        long long10 = dateTimeZone0.nextTransition((long) 0);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone0.getShortName(115200001L, locale12);
        java.lang.String str15 = dateTimeZone0.getShortName(356400000L);
        java.lang.String str16 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
    }

    @Test
    public void test00802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00802");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        int int8 = dateTimeZone0.getOffsetFromLocal(0L);
        int int10 = dateTimeZone0.getStandardOffset((long) (byte) 10);
        boolean boolean11 = dateTimeZone0.isFixed();
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = dateTimeZone0.isLocalDateTimeGap(localDateTime12);
        int int15 = dateTimeZone0.getOffsetFromLocal((long) (byte) 100);
        java.lang.String str17 = dateTimeZone0.getShortName(599999L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
    }

    @Test
    public void test00803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00803");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(351120000, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00804");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getShortName((long) (byte) 100);
        java.lang.String str7 = dateTimeZone0.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        boolean boolean11 = dateTimeZone0.isStandardOffset((long) (short) 1);
        long long15 = dateTimeZone0.convertLocalToUTC((long) 115200000, false, (long) (-1));
        boolean boolean17 = dateTimeZone0.isStandardOffset((long) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forID("UTC");
        long long21 = dateTimeZone0.getMillisKeepLocal(dateTimeZone19, 10L);
        long long23 = dateTimeZone19.nextTransition((long) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone24.getShortName((long) 115200000, locale26);
        boolean boolean28 = dateTimeZone24.isFixed();
        int int30 = dateTimeZone24.getOffset((long) '#');
        long long32 = dateTimeZone19.getMillisKeepLocal(dateTimeZone24, 359999999L);
        long long35 = dateTimeZone19.convertLocalToUTC(0L, false);
        java.lang.Class<?> wildcardClass36 = dateTimeZone19.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 359999999L + "'", long32 == 359999999L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test00805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00805");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffset(1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long6 = dateTimeZone1.convertUTCToLocal((long) (short) 100);
        long long8 = dateTimeZone1.nextTransition((-187799900L));
        int int10 = dateTimeZone1.getOffset((-3600000L));
        long long12 = dateTimeZone1.nextTransition(72000000L);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int16 = dateTimeZone14.getOffset(129660000L);
        int int18 = dateTimeZone14.getOffset((-1L));
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        boolean boolean20 = dateTimeZone19.isFixed();
        int int22 = dateTimeZone19.getStandardOffset(0L);
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone19.getShortName((-1L), locale24);
        java.lang.String str27 = dateTimeZone19.getName((-1L));
        boolean boolean28 = dateTimeZone14.equals((java.lang.Object) (-1L));
        java.lang.String str29 = dateTimeZone14.getID();
        boolean boolean30 = dateTimeZone1.equals((java.lang.Object) dateTimeZone14);
        java.util.Locale locale32 = null;
        java.lang.String str33 = dateTimeZone14.getShortName(547199998L, locale32);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 115200100L + "'", long6 == 115200100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-187799900L) + "'", long8 == (-187799900L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 72000000L + "'", long12 == 72000000L);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 115200000 + "'", int16 == 115200000);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 115200000 + "'", int18 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00" + "'", str25, "+00:00");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+32:00" + "'", str29, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+32:00" + "'", str33, "+32:00");
    }

    @Test
    public void test00806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00806");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, 10);
        int int4 = dateTimeZone2.getOffsetFromLocal(118800001L);
        java.lang.String str6 = dateTimeZone2.getShortName(360000097L);
        boolean boolean7 = dateTimeZone2.isFixed();
        int int9 = dateTimeZone2.getOffsetFromLocal(190800000L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 600000 + "'", int4 == 600000);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:10" + "'", str6, "+00:10");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 600000 + "'", int9 == 600000);
    }

    @Test
    public void test00807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00807");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) 'a', locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (short) 0, locale6);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone9.isLocalDateTimeGap(localDateTime10);
        long long13 = dateTimeZone9.nextTransition(151200000L);
        long long16 = dateTimeZone9.convertLocalToUTC(187200001L, true);
        long long18 = dateTimeZone1.getMillisKeepLocal(dateTimeZone9, (long) (byte) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        java.lang.String str21 = dateTimeZone9.getShortName((long) (byte) 100);
        java.lang.String str22 = dateTimeZone9.getID();
        long long24 = dateTimeZone9.nextTransition((-349199903L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+100:00" + "'", str4, "+100:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+100:00" + "'", str7, "+100:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 151200000L + "'", long13 == 151200000L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 187199991L + "'", long16 == 187199991L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 359999991L + "'", long18 == 359999991L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.010" + "'", str21, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.010" + "'", str22, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-349199903L) + "'", long24 == (-349199903L));
    }

    @Test
    public void test00808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00808");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, 363120000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 363120000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00809");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        int int8 = dateTimeZone0.getOffsetFromLocal(0L);
        java.lang.String str10 = dateTimeZone0.getShortName(0L);
        long long14 = dateTimeZone0.convertLocalToUTC((long) (byte) 0, false, 0L);
        long long17 = dateTimeZone0.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str18 = dateTimeZone0.getID();
        java.lang.String str19 = dateTimeZone0.toString();
        long long22 = dateTimeZone0.adjustOffset((long) (byte) 1, false);
        java.util.TimeZone timeZone23 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        java.lang.Object obj27 = null;
        boolean boolean28 = dateTimeZone26.equals(obj27);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test00810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00810");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getShortName((long) (byte) 100);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) 115200000, locale7);
        java.lang.String str10 = dateTimeZone0.getNameKey((long) 0);
        java.lang.String str12 = dateTimeZone0.getNameKey(360000097L);
        long long14 = dateTimeZone0.previousTransition(52L);
        int int16 = dateTimeZone0.getStandardOffset(115199991L);
        java.lang.String str18 = dateTimeZone0.getName(108480000L);
        int int20 = dateTimeZone0.getOffset((long) 600000);
        java.lang.String str22 = dateTimeZone0.getShortName(115200052L);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        boolean boolean24 = dateTimeZone23.isFixed();
        boolean boolean25 = dateTimeZone23.isFixed();
        long long29 = dateTimeZone23.convertLocalToUTC(1L, true, (long) (byte) 10);
        java.util.TimeZone timeZone30 = dateTimeZone23.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        java.lang.String str34 = dateTimeZone32.getShortName(349200010L);
        org.joda.time.LocalDateTime localDateTime35 = null;
        boolean boolean36 = dateTimeZone32.isLocalDateTimeGap(localDateTime35);
        java.util.TimeZone timeZone37 = dateTimeZone32.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forTimeZone(timeZone37);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forTimeZone(timeZone37);
        boolean boolean40 = dateTimeZone0.equals((java.lang.Object) timeZone37);
        boolean boolean42 = dateTimeZone0.isStandardOffset((long) 1920000);
        java.lang.Class<?> wildcardClass43 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00" + "'", str34, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test00811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00811");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone0.isLocalDateTimeGap(localDateTime2);
        long long6 = dateTimeZone0.convertLocalToUTC(90L, false);
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone0.isLocalDateTimeGap(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 90L + "'", long6 == 90L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00812");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+97:10");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+97:10\" is malformed at \"97:10\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00813");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone3.getName((long) ' ', locale5);
        boolean boolean7 = dateTimeZone1.equals((java.lang.Object) dateTimeZone3);
        int int9 = dateTimeZone1.getOffsetFromLocal((long) '4');
        java.util.TimeZone timeZone10 = dateTimeZone1.toTimeZone();
        java.lang.String str12 = dateTimeZone1.getShortName((long) 187200000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-01:00" + "'", str6, "-01:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
    }

    @Test
    public void test00814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00814");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getShortName((long) (byte) 100);
        java.lang.String str7 = dateTimeZone0.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        boolean boolean11 = dateTimeZone0.isStandardOffset((long) (short) 1);
        long long15 = dateTimeZone0.convertLocalToUTC((long) 115200000, false, (long) (-1));
        boolean boolean17 = dateTimeZone0.isStandardOffset((long) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forID("UTC");
        long long21 = dateTimeZone0.getMillisKeepLocal(dateTimeZone19, 10L);
        java.lang.String str23 = dateTimeZone0.getNameKey((long) 600000);
        boolean boolean24 = dateTimeZone0.isFixed();
        long long26 = dateTimeZone0.convertUTCToLocal((long) (short) 100);
        boolean boolean27 = dateTimeZone0.isFixed();
        java.lang.String str29 = dateTimeZone0.getShortName(356400100L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00" + "'", str29, "+00:00");
    }

    @Test
    public void test00815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00815");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        boolean boolean5 = dateTimeZone0.isStandardOffset(100L);
        java.lang.String str7 = dateTimeZone0.getNameKey((long) 10);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
    }

    @Test
    public void test00816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00816");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', 600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00817");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale2 = null;
        java.lang.String str3 = dateTimeZone0.getShortName((long) 115200000, locale2);
        boolean boolean4 = dateTimeZone0.isFixed();
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = dateTimeZone0.isLocalDateTimeGap(localDateTime5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long10 = dateTimeZone8.previousTransition((long) (byte) -1);
        long long13 = dateTimeZone8.convertLocalToUTC(52L, false);
        java.util.TimeZone timeZone14 = dateTimeZone8.toTimeZone();
        int int16 = dateTimeZone8.getOffsetFromLocal(32L);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        boolean boolean19 = dateTimeZone17.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone20 = dateTimeZone17.toTimeZone();
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone17.getShortName(0L, locale22);
        java.lang.String str24 = dateTimeZone17.getID();
        long long27 = dateTimeZone17.convertLocalToUTC(100L, true);
        long long30 = dateTimeZone17.convertLocalToUTC((-1L), false);
        long long32 = dateTimeZone8.getMillisKeepLocal(dateTimeZone17, 118800001L);
        boolean boolean33 = dateTimeZone0.equals((java.lang.Object) dateTimeZone8);
        int int35 = dateTimeZone8.getOffset(115200001L);
        int int37 = dateTimeZone8.getOffsetFromLocal(356400100L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTC" + "'", str24, "UTC");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 118800001L + "'", long32 == 118800001L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test00818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00818");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        boolean boolean5 = dateTimeZone0.isStandardOffset(100L);
        java.lang.String str6 = dateTimeZone0.getID();
        java.lang.String str8 = dateTimeZone0.getShortName(1L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone0.getOffset(readableInstant9);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone0.isLocalDateTimeGap(localDateTime11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.Class<?> wildcardClass14 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00819");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        boolean boolean5 = dateTimeZone0.isStandardOffset(100L);
        java.lang.String str6 = dateTimeZone0.getID();
        java.lang.String str8 = dateTimeZone0.getShortName(1L);
        java.lang.String str10 = dateTimeZone0.getNameKey((long) (short) 100);
        java.lang.Class<?> wildcardClass11 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00820");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone3.getOffset(readableInstant4);
        int int7 = dateTimeZone3.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        boolean boolean9 = dateTimeZone8.isFixed();
        int int11 = dateTimeZone8.getStandardOffset(0L);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone8.getShortName((-1L), locale13);
        int int16 = dateTimeZone8.getOffsetFromLocal(0L);
        long long18 = dateTimeZone3.getMillisKeepLocal(dateTimeZone8, (long) 115200000);
        boolean boolean20 = dateTimeZone3.isStandardOffset(115200000L);
        int int22 = dateTimeZone3.getOffsetFromLocal((long) (short) 10);
        long long24 = dateTimeZone0.getMillisKeepLocal(dateTimeZone3, 1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        java.lang.String str27 = dateTimeZone3.getName((long) (short) -1);
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeZone3.getShortName(360000010L, locale29);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 115200000L + "'", long18 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00" + "'", str30, "+00:00");
    }

    @Test
    public void test00821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00821");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("UTC");
        int int3 = dateTimeZone1.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((long) (byte) 0, locale5);
        long long8 = dateTimeZone1.nextTransition((long) (byte) -1);
        long long10 = dateTimeZone1.convertUTCToLocal((long) (byte) 10);
        long long12 = dateTimeZone1.nextTransition((long) 1);
        long long14 = dateTimeZone1.previousTransition((long) 360060000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 360060000L + "'", long14 == 360060000L);
    }

    @Test
    public void test00822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00822");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone1.isLocalDateTimeGap(localDateTime3);
        java.util.TimeZone timeZone5 = dateTimeZone1.toTimeZone();
        int int7 = dateTimeZone1.getOffset((-3600010L));
        int int9 = dateTimeZone1.getOffset((-53999999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00823");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (short) 0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test00824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00824");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        int int4 = dateTimeZone0.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        boolean boolean6 = dateTimeZone5.isFixed();
        int int8 = dateTimeZone5.getStandardOffset(0L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone5.getShortName((-1L), locale10);
        int int13 = dateTimeZone5.getOffsetFromLocal(0L);
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) 115200000);
        int int17 = dateTimeZone5.getOffset((long) '4');
        java.lang.String str19 = dateTimeZone5.getShortName((long) (byte) 10);
        long long21 = dateTimeZone5.nextTransition((long) ' ');
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone5.getShortName(118800000L, locale23);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone5.getName(108000097L, locale26);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
    }

    @Test
    public void test00825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00825");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName(356460000L, locale3);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str6 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+100:00" + "'", str4, "+100:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+100:00" + "'", str6, "+100:00");
    }

    @Test
    public void test00826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00826");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getNameKey(1L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getShortName((long) (short) -1, locale7);
        java.lang.String str10 = dateTimeZone0.getShortName((long) (-1));
        long long12 = dateTimeZone0.nextTransition(118800001L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        long long15 = dateTimeZone0.nextTransition((-141060009L));
        java.lang.Class<?> wildcardClass16 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 118800001L + "'", long12 == 118800001L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-141060009L) + "'", long15 == (-141060009L));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00827");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 351120000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 351120000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00828");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        long long4 = dateTimeZone0.nextTransition((long) 115200000);
        java.lang.String str6 = dateTimeZone0.getNameKey((long) (short) 100);
        long long9 = dateTimeZone0.convertLocalToUTC(118799999L, true);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone0.getOffset(readableInstant10);
        long long13 = dateTimeZone0.convertUTCToLocal(71999904L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 115200000L + "'", long4 == 115200000L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 118799999L + "'", long9 == 118799999L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 71999904L + "'", long13 == 71999904L);
    }

    @Test
    public void test00829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00829");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        int int8 = dateTimeZone0.getOffsetFromLocal(0L);
        java.lang.String str10 = dateTimeZone0.getShortName(0L);
        java.lang.String str12 = dateTimeZone0.getShortName(1L);
        long long16 = dateTimeZone0.convertLocalToUTC(359999999L, true, 97L);
        long long18 = dateTimeZone0.nextTransition(71999904L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 359999999L + "'", long16 == 359999999L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 71999904L + "'", long18 == 71999904L);
    }

    @Test
    public void test00830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00830");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        int int8 = dateTimeZone0.getOffsetFromLocal(0L);
        int int10 = dateTimeZone0.getStandardOffset((long) (byte) 10);
        java.lang.String str12 = dateTimeZone0.getName((long) (byte) 10);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone0.getShortName(10L, locale14);
        long long17 = dateTimeZone0.convertUTCToLocal((long) '4');
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone0.getShortName((-187199965L), locale19);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 52L + "'", long17 == 52L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
    }

    @Test
    public void test00831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00831");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone0.isLocalDateTimeGap(localDateTime2);
        long long6 = dateTimeZone0.convertLocalToUTC((long) 100, false);
        long long8 = dateTimeZone0.convertUTCToLocal((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        boolean boolean10 = dateTimeZone9.isFixed();
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone9.isLocalDateTimeGap(localDateTime11);
        java.lang.String str14 = dateTimeZone9.getShortName((long) (short) 10);
        int int16 = dateTimeZone9.getOffset((long) (short) 1);
        int int18 = dateTimeZone9.getStandardOffset((long) 115200000);
        boolean boolean19 = dateTimeZone0.equals((java.lang.Object) int18);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00832");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(187200000, 349800000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 349800000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00833");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getNameKey(1L);
        java.lang.String str6 = dateTimeZone0.getID();
        boolean boolean7 = dateTimeZone0.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00834");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone5.getOffset(readableInstant6);
        int int9 = dateTimeZone5.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        boolean boolean11 = dateTimeZone10.isFixed();
        int int13 = dateTimeZone10.getStandardOffset(0L);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone10.getShortName((-1L), locale15);
        int int18 = dateTimeZone10.getOffsetFromLocal(0L);
        long long20 = dateTimeZone5.getMillisKeepLocal(dateTimeZone10, (long) 115200000);
        java.lang.String str22 = dateTimeZone5.getShortName((long) '4');
        boolean boolean23 = dateTimeZone4.equals((java.lang.Object) dateTimeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        java.lang.String str26 = dateTimeZone5.getName(187200001L);
        int int28 = dateTimeZone5.getOffset((long) (-6720000));
        java.lang.String str30 = dateTimeZone5.getShortName(826259997L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 115200000L + "'", long20 == 115200000L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00" + "'", str26, "+00:00");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00" + "'", str30, "+00:00");
    }

    @Test
    public void test00835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00835");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(351120000, 3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00836");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) 'a', locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (short) 0, locale6);
        long long9 = dateTimeZone1.convertUTCToLocal((-1L));
        long long13 = dateTimeZone1.convertLocalToUTC(0L, false, (long) 97);
        int int15 = dateTimeZone1.getStandardOffset((-115199990L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+100:00" + "'", str4, "+100:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+100:00" + "'", str7, "+100:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 359999999L + "'", long9 == 359999999L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-360000000L) + "'", long13 == (-360000000L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 360000000 + "'", int15 == 360000000);
    }

    @Test
    public void test00837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00837");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffset(1L);
        long long5 = dateTimeZone1.previousTransition((long) (short) 1);
        java.lang.String str6 = dateTimeZone1.getID();
        long long10 = dateTimeZone1.convertLocalToUTC(115200010L, true, 0L);
        java.util.TimeZone timeZone11 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test00838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00838");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.lang.String str6 = dateTimeZone4.getNameKey((long) (short) 10);
        boolean boolean7 = dateTimeZone4.isFixed();
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone4.getShortName(363120000L, locale9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone4.getOffset(readableInstant11);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00839");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(360600000, 36060000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 36060000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00840");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long2 = dateTimeZone0.convertUTCToLocal((long) (byte) 0);
        int int4 = dateTimeZone0.getOffsetFromLocal((long) (-1));
        boolean boolean5 = dateTimeZone0.isFixed();
        long long8 = dateTimeZone0.convertLocalToUTC((long) (short) 10, true);
        java.lang.Class<?> wildcardClass9 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00841");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getShortName((long) (byte) 100);
        java.lang.String str7 = dateTimeZone0.getShortName((long) (short) 0);
        java.lang.String str9 = dateTimeZone0.getShortName(0L);
        boolean boolean11 = dateTimeZone0.equals((java.lang.Object) '4');
        long long13 = dateTimeZone0.previousTransition(32L);
        java.util.TimeZone timeZone14 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone15.getShortName((long) 349200000, locale17);
        java.lang.String str20 = dateTimeZone15.getNameKey((-36000000L));
        java.lang.Class<?> wildcardClass21 = dateTimeZone15.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00842");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(115200000);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.lang.String str3 = dateTimeZone1.getID();
        long long5 = dateTimeZone1.nextTransition((long) 'a');
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        boolean boolean7 = dateTimeZone6.isFixed();
        int int9 = dateTimeZone6.getStandardOffset(0L);
        java.lang.String str11 = dateTimeZone6.getShortName((long) (byte) 100);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone6.getName((long) 115200000, locale13);
        long long16 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (-118799903L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        long long20 = dateTimeZone6.convertLocalToUTC((long) (byte) 0, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+32:00" + "'", str3, "+32:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-3599903L) + "'", long16 == (-3599903L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test00843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00843");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 1);
        long long3 = dateTimeZone1.nextTransition((long) (short) 100);
        java.lang.String str5 = dateTimeZone1.getShortName(187200000L);
        boolean boolean7 = dateTimeZone1.isStandardOffset((-3600010L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+01:00" + "'", str5, "+01:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00844");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long6 = dateTimeZone4.nextTransition((long) 10);
        java.lang.String str7 = dateTimeZone4.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
    }

    @Test
    public void test00845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00845");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(360600000, 351120000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 351120000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00846");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        java.lang.String str8 = dateTimeZone0.getShortName(1L);
        long long10 = dateTimeZone0.nextTransition((long) 0);
        long long12 = dateTimeZone0.nextTransition((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (int) ' ');
        boolean boolean16 = dateTimeZone0.equals((java.lang.Object) '#');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone0.getShortName(108480000L, locale20);
        java.lang.String str23 = dateTimeZone0.getName(356400100L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
    }

    @Test
    public void test00847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00847");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("UTC");
        int int3 = dateTimeZone1.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((long) (byte) 0, locale5);
        java.lang.Class<?> wildcardClass7 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00848");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str3 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+35:00" + "'", str3, "+35:00");
    }

    @Test
    public void test00849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00849");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(115200000, 187200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 187200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00850");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone0.isLocalDateTimeGap(localDateTime2);
        long long5 = dateTimeZone0.convertUTCToLocal(0L);
        java.lang.String str6 = dateTimeZone0.toString();
        long long8 = dateTimeZone0.previousTransition(0L);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        long long11 = dateTimeZone0.getMillisKeepLocal(dateTimeZone9, 35L);
        int int13 = dateTimeZone0.getOffset((long) 349200000);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long17 = dateTimeZone15.convertUTCToLocal(32L);
        java.lang.String str19 = dateTimeZone15.getName((long) 349200000);
        long long21 = dateTimeZone0.getMillisKeepLocal(dateTimeZone15, (long) 126060000);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-125999965L) + "'", long11 == (-125999965L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3600032L + "'", long17 == 3600032L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+01:00" + "'", str19, "+01:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 122460000L + "'", long21 == 122460000L);
    }

    @Test
    public void test00851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00851");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        int int4 = dateTimeZone0.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        boolean boolean6 = dateTimeZone5.isFixed();
        int int8 = dateTimeZone5.getStandardOffset(0L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone5.getShortName((-1L), locale10);
        int int13 = dateTimeZone5.getOffsetFromLocal(0L);
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) 115200000);
        java.lang.String str17 = dateTimeZone0.getShortName((long) '4');
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone0.getName((long) '4', locale19);
        long long23 = dateTimeZone0.adjustOffset((long) 10, false);
        java.util.TimeZone timeZone24 = dateTimeZone0.toTimeZone();
        java.lang.String str26 = dateTimeZone0.getShortName((-232500001L));
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.UTC;
        boolean boolean29 = dateTimeZone27.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone30 = dateTimeZone27.toTimeZone();
        boolean boolean32 = dateTimeZone27.isStandardOffset(100L);
        java.lang.String str33 = dateTimeZone27.getID();
        java.lang.String str35 = dateTimeZone27.getShortName(1L);
        org.joda.time.ReadableInstant readableInstant36 = null;
        int int37 = dateTimeZone27.getOffset(readableInstant36);
        org.joda.time.LocalDateTime localDateTime38 = null;
        boolean boolean39 = dateTimeZone27.isLocalDateTimeGap(localDateTime38);
        int int41 = dateTimeZone27.getOffsetFromLocal((-7200000L));
        java.lang.String str43 = dateTimeZone27.getName(35L);
        java.lang.String str44 = dateTimeZone27.getID();
        long long46 = dateTimeZone0.getMillisKeepLocal(dateTimeZone27, 36000000L);
        java.lang.String str48 = dateTimeZone27.getShortName((long) 351300000);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00" + "'", str26, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "UTC" + "'", str33, "UTC");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00" + "'", str35, "+00:00");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+00:00" + "'", str43, "+00:00");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "UTC" + "'", str44, "UTC");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 36000000L + "'", long46 == 36000000L);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+00:00" + "'", str48, "+00:00");
    }

    @Test
    public void test00852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00852");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.lang.String str3 = dateTimeZone1.getShortName((long) 'a');
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone4.getOffset(readableInstant5);
        int int8 = dateTimeZone4.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        boolean boolean10 = dateTimeZone9.isFixed();
        int int12 = dateTimeZone9.getStandardOffset(0L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone9.getShortName((-1L), locale14);
        int int17 = dateTimeZone9.getOffsetFromLocal(0L);
        long long19 = dateTimeZone4.getMillisKeepLocal(dateTimeZone9, (long) 115200000);
        long long21 = dateTimeZone1.getMillisKeepLocal(dateTimeZone4, (long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        boolean boolean23 = dateTimeZone22.isFixed();
        int int25 = dateTimeZone22.getStandardOffset(0L);
        java.lang.String str27 = dateTimeZone22.getShortName((long) (byte) 100);
        java.lang.String str29 = dateTimeZone22.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant30 = null;
        int int31 = dateTimeZone22.getOffset(readableInstant30);
        boolean boolean33 = dateTimeZone22.isStandardOffset((long) (short) 1);
        long long37 = dateTimeZone22.convertLocalToUTC((long) 115200000, false, (long) (-1));
        int int39 = dateTimeZone22.getOffsetFromLocal((long) (short) 0);
        java.lang.String str41 = dateTimeZone22.getNameKey((long) ' ');
        java.lang.String str42 = dateTimeZone22.toString();
        long long44 = dateTimeZone22.nextTransition(100L);
        int int46 = dateTimeZone22.getStandardOffset((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.UTC;
        boolean boolean48 = dateTimeZone47.isFixed();
        int int50 = dateTimeZone47.getStandardOffset(0L);
        java.util.Locale locale52 = null;
        java.lang.String str53 = dateTimeZone47.getShortName((-1L), locale52);
        int int55 = dateTimeZone47.getOffsetFromLocal(0L);
        long long57 = dateTimeZone47.convertUTCToLocal((long) 0);
        long long59 = dateTimeZone47.previousTransition(0L);
        long long63 = dateTimeZone47.convertLocalToUTC((long) (short) 0, true, 0L);
        int int65 = dateTimeZone47.getStandardOffset((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant66 = null;
        int int67 = dateTimeZone47.getOffset(readableInstant66);
        long long70 = dateTimeZone47.convertLocalToUTC((long) 187200000, false);
        java.lang.String str72 = dateTimeZone47.getNameKey((-10320000L));
        long long74 = dateTimeZone22.getMillisKeepLocal(dateTimeZone47, 3600052L);
        boolean boolean75 = dateTimeZone1.equals((java.lang.Object) dateTimeZone47);
        java.lang.String str76 = dateTimeZone1.toString();
        long long79 = dateTimeZone1.convertLocalToUTC(351120010L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+32:00" + "'", str3, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 115200000L + "'", long19 == 115200000L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 115200001L + "'", long21 == 115200001L);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00" + "'", str29, "+00:00");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 115200000L + "'", long37 == 115200000L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "UTC" + "'", str41, "UTC");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "UTC" + "'", str42, "UTC");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 100L + "'", long44 == 100L);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "+00:00" + "'", str53, "+00:00");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 187200000L + "'", long70 == 187200000L);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "UTC" + "'", str72, "UTC");
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 3600052L + "'", long74 == 3600052L);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "+32:00" + "'", str76, "+32:00");
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 235920010L + "'", long79 == 235920010L);
    }

    @Test
    public void test00853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00853");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        boolean boolean5 = dateTimeZone0.isStandardOffset(100L);
        java.lang.String str6 = dateTimeZone0.getID();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone7.getOffset(readableInstant8);
        int int11 = dateTimeZone7.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        boolean boolean13 = dateTimeZone12.isFixed();
        int int15 = dateTimeZone12.getStandardOffset(0L);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone12.getShortName((-1L), locale17);
        int int20 = dateTimeZone12.getOffsetFromLocal(0L);
        long long22 = dateTimeZone7.getMillisKeepLocal(dateTimeZone12, (long) 115200000);
        boolean boolean24 = dateTimeZone7.isStandardOffset(115200000L);
        long long27 = dateTimeZone7.convertLocalToUTC((long) 10, true);
        java.lang.String str28 = dateTimeZone7.toString();
        int int30 = dateTimeZone7.getOffset(52L);
        java.lang.String str32 = dateTimeZone7.getNameKey(0L);
        long long34 = dateTimeZone0.getMillisKeepLocal(dateTimeZone7, 35L);
        java.lang.String str36 = dateTimeZone7.getNameKey(152L);
        java.lang.Class<?> wildcardClass37 = dateTimeZone7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 115200000L + "'", long22 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L + "'", long27 == 10L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UTC" + "'", str28, "UTC");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "UTC" + "'", str32, "UTC");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 35L + "'", long34 == 35L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UTC" + "'", str36, "UTC");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test00854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00854");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        boolean boolean2 = dateTimeZone0.isFixed();
        long long6 = dateTimeZone0.convertLocalToUTC(1L, true, (long) (byte) 10);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone0.getName((long) (-1), locale8);
        java.lang.String str10 = dateTimeZone0.getID();
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone0.getShortName(115200100L, locale12);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
    }

    @Test
    public void test00855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00855");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getShortName((long) (byte) 100);
        java.lang.String str7 = dateTimeZone0.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        long long12 = dateTimeZone0.adjustOffset((long) (byte) 1, false);
        int int14 = dateTimeZone0.getOffsetFromLocal(0L);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        boolean boolean16 = dateTimeZone15.isFixed();
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone15.isLocalDateTimeGap(localDateTime17);
        long long21 = dateTimeZone15.convertLocalToUTC((long) 100, false);
        long long23 = dateTimeZone0.getMillisKeepLocal(dateTimeZone15, (long) 360000000);
        boolean boolean25 = dateTimeZone15.isStandardOffset((-187859900L));
        java.lang.Object obj26 = null;
        boolean boolean27 = dateTimeZone15.equals(obj26);
        java.lang.Class<?> wildcardClass28 = dateTimeZone15.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 360000000L + "'", long23 == 360000000L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00856");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, 363120000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 363120000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00857");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (-6720000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -6720000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00858");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        boolean boolean2 = dateTimeZone0.isFixed();
        long long6 = dateTimeZone0.convertLocalToUTC(1L, true, (long) (byte) 10);
        java.util.TimeZone timeZone7 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone8.getShortName((long) 10, locale10);
        long long14 = dateTimeZone8.convertLocalToUTC((-111600001L), true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        java.lang.Class<?> wildcardClass16 = dateTimeZone8.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-111600001L) + "'", long14 == (-111600001L));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00859");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00860");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getShortName((long) (byte) 100);
        int int7 = dateTimeZone0.getStandardOffset(359999999L);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone0.getName((long) (-1), locale9);
        java.lang.String str12 = dateTimeZone0.getShortName(10800100L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
    }

    @Test
    public void test00861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00861");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        java.lang.String str8 = dateTimeZone0.getShortName(1L);
        long long10 = dateTimeZone0.nextTransition((long) 0);
        long long12 = dateTimeZone0.nextTransition((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (int) ' ');
        boolean boolean16 = dateTimeZone0.equals((java.lang.Object) '#');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        long long19 = dateTimeZone0.nextTransition(10L);
        long long22 = dateTimeZone0.convertLocalToUTC(110L, true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 110L + "'", long22 == 110L);
    }

    @Test
    public void test00862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00862");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) (short) 10);
        boolean boolean4 = dateTimeZone2.isStandardOffset((-486599900L));
        java.lang.String str6 = dateTimeZone2.getName((-111600000L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-01:10" + "'", str6, "-01:10");
    }

    @Test
    public void test00863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00863");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        boolean boolean2 = dateTimeZone0.isFixed();
        int int4 = dateTimeZone0.getOffsetFromLocal((long) 1);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = dateTimeZone0.isLocalDateTimeGap(localDateTime5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        boolean boolean8 = dateTimeZone7.isFixed();
        int int10 = dateTimeZone7.getStandardOffset(0L);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone7.getShortName((-1L), locale12);
        int int15 = dateTimeZone7.getOffsetFromLocal(0L);
        boolean boolean16 = dateTimeZone0.equals((java.lang.Object) dateTimeZone7);
        long long20 = dateTimeZone7.convertLocalToUTC((long) (-6720000), true, (long) 351300000);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-6720000L) + "'", long20 == (-6720000L));
    }

    @Test
    public void test00864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00864");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone0.isLocalDateTimeGap(localDateTime2);
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 10);
        int int7 = dateTimeZone0.getOffset((long) (short) 1);
        int int9 = dateTimeZone0.getStandardOffset((long) 115200000);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone0.isLocalDateTimeGap(localDateTime10);
        int int13 = dateTimeZone0.getOffsetFromLocal((long) 115200000);
        long long15 = dateTimeZone0.nextTransition((-113280000L));
        java.lang.Class<?> wildcardClass16 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-113280000L) + "'", long15 == (-113280000L));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00865");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        int int8 = dateTimeZone0.getOffsetFromLocal(0L);
        java.lang.String str10 = dateTimeZone0.getShortName(0L);
        java.lang.String str12 = dateTimeZone0.getShortName(359999999L);
        java.lang.String str14 = dateTimeZone0.getShortName(0L);
        java.util.TimeZone timeZone15 = dateTimeZone0.toTimeZone();
        java.lang.String str17 = dateTimeZone0.getName(127920010L);
        long long20 = dateTimeZone0.convertLocalToUTC(0L, false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test00866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00866");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) 'a', locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (short) 0, locale6);
        long long9 = dateTimeZone1.convertUTCToLocal((-1L));
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone1.isLocalDateTimeGap(localDateTime10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        boolean boolean13 = dateTimeZone12.isFixed();
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone12.isLocalDateTimeGap(localDateTime14);
        java.lang.String str17 = dateTimeZone12.getShortName((long) (short) 10);
        int int19 = dateTimeZone12.getOffset((long) (short) 1);
        long long23 = dateTimeZone12.convertLocalToUTC((long) (short) 1, true, 1L);
        org.joda.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = dateTimeZone12.isLocalDateTimeGap(localDateTime24);
        long long27 = dateTimeZone12.convertUTCToLocal(100L);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        boolean boolean29 = dateTimeZone28.isFixed();
        int int31 = dateTimeZone28.getStandardOffset(0L);
        java.util.Locale locale33 = null;
        java.lang.String str34 = dateTimeZone28.getShortName((-1L), locale33);
        java.lang.String str36 = dateTimeZone28.getShortName(1L);
        long long38 = dateTimeZone28.nextTransition((long) 0);
        long long40 = dateTimeZone28.nextTransition((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (int) ' ');
        boolean boolean44 = dateTimeZone28.equals((java.lang.Object) '#');
        long long46 = dateTimeZone28.convertUTCToLocal((-3600000L));
        java.util.TimeZone timeZone47 = dateTimeZone28.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forTimeZone(timeZone47);
        boolean boolean49 = dateTimeZone12.equals((java.lang.Object) timeZone47);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetMillis(115200000);
        boolean boolean52 = dateTimeZone51.isFixed();
        java.lang.String str53 = dateTimeZone51.getID();
        long long55 = dateTimeZone51.nextTransition((long) 'a');
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.UTC;
        boolean boolean57 = dateTimeZone56.isFixed();
        int int59 = dateTimeZone56.getStandardOffset(0L);
        java.lang.String str61 = dateTimeZone56.getShortName((long) (byte) 100);
        java.util.Locale locale63 = null;
        java.lang.String str64 = dateTimeZone56.getName((long) 115200000, locale63);
        long long66 = dateTimeZone51.getMillisKeepLocal(dateTimeZone56, (-118799903L));
        java.lang.String str68 = dateTimeZone51.getNameKey(187200001L);
        boolean boolean69 = dateTimeZone12.equals((java.lang.Object) 187200001L);
        long long71 = dateTimeZone1.getMillisKeepLocal(dateTimeZone12, (-232500001L));
        int int73 = dateTimeZone1.getOffset(42L);
        org.joda.time.ReadableInstant readableInstant74 = null;
        int int75 = dateTimeZone1.getOffset(readableInstant74);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+100:00" + "'", str4, "+100:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+100:00" + "'", str7, "+100:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 359999999L + "'", long9 == 359999999L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00" + "'", str34, "+00:00");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00" + "'", str36, "+00:00");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-3600000L) + "'", long46 == (-3600000L));
        org.junit.Assert.assertNotNull(timeZone47);
        org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "+32:00" + "'", str53, "+32:00");
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 97L + "'", long55 == 97L);
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "+00:00" + "'", str61, "+00:00");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "+00:00" + "'", str64, "+00:00");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-3599903L) + "'", long66 == (-3599903L));
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 127499999L + "'", long71 == 127499999L);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 360000000 + "'", int73 == 360000000);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 360000000 + "'", int75 == 360000000);
    }

    @Test
    public void test00867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00867");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        boolean boolean3 = dateTimeZone0.isStandardOffset((long) (-3600000));
        java.lang.Class<?> wildcardClass4 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00868");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        boolean boolean2 = dateTimeZone0.isFixed();
        long long6 = dateTimeZone0.convertLocalToUTC(1L, true, (long) (byte) 10);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone0.getName((long) (-1), locale8);
        java.lang.String str10 = dateTimeZone0.toString();
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone0.getOffset(readableInstant11);
        java.lang.Class<?> wildcardClass13 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00869");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        java.lang.String str2 = dateTimeZone0.toString();
        long long5 = dateTimeZone0.convertLocalToUTC((long) ' ', true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        long long9 = dateTimeZone0.convertLocalToUTC(356400000L, false);
        java.lang.String str11 = dateTimeZone0.getNameKey(0L);
        long long14 = dateTimeZone0.convertLocalToUTC((-345599990L), true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 356400000L + "'", long9 == 356400000L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-345599990L) + "'", long14 == (-345599990L));
    }

    @Test
    public void test00870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00870");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getNameKey(1L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getShortName((long) (short) -1, locale7);
        java.lang.String str10 = dateTimeZone0.getShortName((long) (-1));
        long long12 = dateTimeZone0.nextTransition(118800001L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        int int15 = dateTimeZone0.getOffsetFromLocal(235920000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 118800001L + "'", long12 == 118800001L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test00871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00871");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        boolean boolean4 = dateTimeZone2.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone5 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.lang.String str8 = dateTimeZone6.getNameKey((long) (short) 10);
        java.lang.String str10 = dateTimeZone6.getName((long) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        boolean boolean12 = dateTimeZone11.isFixed();
        int int14 = dateTimeZone11.getStandardOffset(0L);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone11.getShortName((-1L), locale16);
        java.lang.String str19 = dateTimeZone11.getShortName(1L);
        long long21 = dateTimeZone6.getMillisKeepLocal(dateTimeZone11, (long) (-1));
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone6.getName(0L, locale23);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant26 = null;
        int int27 = dateTimeZone25.getOffset(readableInstant26);
        int int29 = dateTimeZone25.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        boolean boolean31 = dateTimeZone30.isFixed();
        int int33 = dateTimeZone30.getStandardOffset(0L);
        java.util.Locale locale35 = null;
        java.lang.String str36 = dateTimeZone30.getShortName((-1L), locale35);
        int int38 = dateTimeZone30.getOffsetFromLocal(0L);
        long long40 = dateTimeZone25.getMillisKeepLocal(dateTimeZone30, (long) 115200000);
        java.util.Locale locale42 = null;
        java.lang.String str43 = dateTimeZone25.getShortName((long) (short) 0, locale42);
        long long45 = dateTimeZone6.getMillisKeepLocal(dateTimeZone25, (long) ' ');
        long long47 = dateTimeZone1.getMillisKeepLocal(dateTimeZone25, (long) 115200000);
        java.lang.Class<?> wildcardClass48 = dateTimeZone25.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00" + "'", str36, "+00:00");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 115200000L + "'", long40 == 115200000L);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+00:00" + "'", str43, "+00:00");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 32L + "'", long45 == 32L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 151200000L + "'", long47 == 151200000L);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test00872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00872");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        java.util.TimeZone timeZone7 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        int int10 = dateTimeZone8.getOffset(8640152L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00873");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        long long6 = dateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = dateTimeZone4.getID();
        java.lang.String str8 = dateTimeZone4.getID();
        long long10 = dateTimeZone4.previousTransition(115200000L);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone4.isLocalDateTimeGap(localDateTime11);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone4.getName(32L, locale14);
        long long17 = dateTimeZone4.convertUTCToLocal(360060000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 115200000L + "'", long10 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 360060000L + "'", long17 == 360060000L);
    }

    @Test
    public void test00874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00874");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str7 = dateTimeZone1.getShortName(127920010L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
    }

    @Test
    public void test00875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00875");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        java.lang.String str7 = dateTimeZone1.getNameKey((long) (byte) 0);
        java.lang.String str9 = dateTimeZone1.getName(115200001L);
        long long12 = dateTimeZone1.adjustOffset((long) 360000000, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.010" + "'", str9, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 360000000L + "'", long12 == 360000000L);
    }

    @Test
    public void test00876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00876");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        int int8 = dateTimeZone0.getOffsetFromLocal(0L);
        long long10 = dateTimeZone0.convertUTCToLocal((long) 0);
        long long12 = dateTimeZone0.previousTransition(0L);
        long long16 = dateTimeZone0.convertLocalToUTC((long) (short) 0, true, 0L);
        int int18 = dateTimeZone0.getStandardOffset((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = dateTimeZone0.getOffset(readableInstant19);
        long long23 = dateTimeZone0.adjustOffset(52L, true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 52L + "'", long23 == 52L);
    }

    @Test
    public void test00877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00877");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getNameKey(1L);
        int int7 = dateTimeZone0.getOffset((-1L));
        java.lang.String str8 = dateTimeZone0.toString();
        int int10 = dateTimeZone0.getOffset(1L);
        long long13 = dateTimeZone0.adjustOffset((long) '4', true);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone0.getShortName((long) 115200000, locale15);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone0.isLocalDateTimeGap(localDateTime17);
        long long20 = dateTimeZone0.nextTransition((-7260001L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-7260001L) + "'", long20 == (-7260001L));
    }

    @Test
    public void test00878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00878");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getShortName((long) (byte) 100);
        java.lang.String str7 = dateTimeZone0.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        boolean boolean11 = dateTimeZone0.isStandardOffset((long) (short) 1);
        long long15 = dateTimeZone0.convertLocalToUTC((long) 115200000, false, (long) (-1));
        int int17 = dateTimeZone0.getOffsetFromLocal((long) (short) 0);
        java.lang.String str19 = dateTimeZone0.getNameKey((long) ' ');
        java.lang.String str21 = dateTimeZone0.getShortName((long) (short) 10);
        boolean boolean22 = dateTimeZone0.isFixed();
        java.lang.Class<?> wildcardClass23 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00879");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long2 = dateTimeZone0.convertUTCToLocal((long) (byte) 0);
        java.lang.String str3 = dateTimeZone0.toString();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        boolean boolean5 = dateTimeZone4.isFixed();
        int int7 = dateTimeZone4.getStandardOffset(0L);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone4.getShortName((-1L), locale9);
        int int12 = dateTimeZone4.getOffsetFromLocal(0L);
        java.lang.String str14 = dateTimeZone4.getShortName(0L);
        java.lang.String str16 = dateTimeZone4.getShortName(359999999L);
        long long18 = dateTimeZone0.getMillisKeepLocal(dateTimeZone4, (-1L));
        java.lang.String str20 = dateTimeZone4.getShortName((long) 115200000);
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = dateTimeZone4.isLocalDateTimeGap(localDateTime21);
        long long25 = dateTimeZone4.convertLocalToUTC((-118799913L), false);
        long long29 = dateTimeZone4.convertLocalToUTC((-115199948L), false, (long) (short) 100);
        int int31 = dateTimeZone4.getOffsetFromLocal((-115200000L));
        java.lang.String str33 = dateTimeZone4.getNameKey((-118800000L));
        org.joda.time.ReadableInstant readableInstant34 = null;
        int int35 = dateTimeZone4.getOffset(readableInstant34);
        int int37 = dateTimeZone4.getOffset(360000000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 115200000L + "'", long2 == 115200000L);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+32:00" + "'", str3, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 115199999L + "'", long18 == 115199999L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-118799913L) + "'", long25 == (-118799913L));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-115199948L) + "'", long29 == (-115199948L));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "UTC" + "'", str33, "UTC");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test00880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00880");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale2 = null;
        java.lang.String str3 = dateTimeZone0.getShortName((long) 115200000, locale2);
        boolean boolean4 = dateTimeZone0.isFixed();
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone0.getName(52L, locale6);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone0.getName((long) (byte) -1, locale9);
        int int12 = dateTimeZone0.getOffset((long) (-3600000));
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone0.isLocalDateTimeGap(localDateTime13);
        long long17 = dateTimeZone0.convertLocalToUTC(187200001L, false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 187200001L + "'", long17 == 187200001L);
    }

    @Test
    public void test00881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00881");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(126060000, 349800000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 349800000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00882");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        java.lang.String str3 = dateTimeZone1.getName(10L);
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone7.getOffset(readableInstant8);
        int int11 = dateTimeZone7.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        boolean boolean13 = dateTimeZone12.isFixed();
        int int15 = dateTimeZone12.getStandardOffset(0L);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone12.getShortName((-1L), locale17);
        int int20 = dateTimeZone12.getOffsetFromLocal(0L);
        long long22 = dateTimeZone7.getMillisKeepLocal(dateTimeZone12, (long) 115200000);
        boolean boolean24 = dateTimeZone7.isStandardOffset(115200000L);
        long long27 = dateTimeZone7.convertLocalToUTC((long) 10, true);
        java.lang.String str28 = dateTimeZone7.toString();
        int int30 = dateTimeZone7.getOffset(52L);
        java.lang.String str32 = dateTimeZone7.getNameKey(0L);
        java.lang.String str34 = dateTimeZone7.getName((long) 0);
        java.util.TimeZone timeZone35 = dateTimeZone7.toTimeZone();
        long long37 = dateTimeZone6.getMillisKeepLocal(dateTimeZone7, (-184199900L));
        java.util.TimeZone timeZone38 = dateTimeZone6.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-01:00" + "'", str3, "-01:00");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT-01:00");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 115200000L + "'", long22 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L + "'", long27 == 10L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UTC" + "'", str28, "UTC");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "UTC" + "'", str32, "UTC");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00" + "'", str34, "+00:00");
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-187799900L) + "'", long37 == (-187799900L));
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "GMT-01:00");
    }

    @Test
    public void test00883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00883");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        boolean boolean8 = dateTimeZone6.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone9 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.String str12 = dateTimeZone10.getNameKey((long) (short) 10);
        java.lang.String str14 = dateTimeZone10.getName((long) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        boolean boolean16 = dateTimeZone15.isFixed();
        int int18 = dateTimeZone15.getStandardOffset(0L);
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone15.getShortName((-1L), locale20);
        java.lang.String str23 = dateTimeZone15.getShortName(1L);
        long long25 = dateTimeZone10.getMillisKeepLocal(dateTimeZone15, (long) (-1));
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone10.getName(0L, locale27);
        long long30 = dateTimeZone5.getMillisKeepLocal(dateTimeZone10, 1L);
        java.util.Locale locale32 = null;
        java.lang.String str33 = dateTimeZone10.getName((long) '4', locale32);
        boolean boolean34 = dateTimeZone10.isFixed();
        org.joda.time.ReadableInstant readableInstant35 = null;
        int int36 = dateTimeZone10.getOffset(readableInstant35);
        long long38 = dateTimeZone10.previousTransition(1L);
        java.util.Locale locale40 = null;
        java.lang.String str41 = dateTimeZone10.getShortName(345000110L, locale40);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00" + "'", str28, "+00:00");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00" + "'", str33, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00" + "'", str41, "+00:00");
    }

    @Test
    public void test00884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00884");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        int int4 = dateTimeZone0.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        boolean boolean6 = dateTimeZone5.isFixed();
        int int8 = dateTimeZone5.getStandardOffset(0L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone5.getShortName((-1L), locale10);
        int int13 = dateTimeZone5.getOffsetFromLocal(0L);
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) 115200000);
        java.lang.String str17 = dateTimeZone0.getShortName((long) '4');
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = dateTimeZone0.isLocalDateTimeGap(localDateTime18);
        long long22 = dateTimeZone0.adjustOffset((-232500001L), true);
        java.lang.Class<?> wildcardClass23 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-232500001L) + "'", long22 == (-232500001L));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00885");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        java.lang.String str8 = dateTimeZone0.getShortName(1L);
        java.lang.String str9 = dateTimeZone0.getID();
        long long12 = dateTimeZone0.convertLocalToUTC(359999999L, true);
        long long16 = dateTimeZone0.convertLocalToUTC(10L, true, (long) 10);
        long long18 = dateTimeZone0.previousTransition(32L);
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = dateTimeZone0.getOffset(readableInstant19);
        java.lang.Class<?> wildcardClass21 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 359999999L + "'", long12 == 359999999L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00886");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getNameKey(1L);
        int int7 = dateTimeZone0.getOffset((-1L));
        java.lang.String str8 = dateTimeZone0.toString();
        java.lang.String str10 = dateTimeZone0.getName(32L);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        boolean boolean12 = dateTimeZone11.isFixed();
        boolean boolean13 = dateTimeZone11.isFixed();
        java.lang.String str14 = dateTimeZone11.getID();
        java.lang.String str15 = dateTimeZone11.getID();
        long long17 = dateTimeZone0.getMillisKeepLocal(dateTimeZone11, (-115199990L));
        java.lang.Class<?> wildcardClass18 = dateTimeZone11.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-115199990L) + "'", long17 == (-115199990L));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00887");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, 3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00888");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getShortName((long) (byte) 100);
        java.lang.String str7 = dateTimeZone0.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        boolean boolean11 = dateTimeZone0.isStandardOffset((long) (short) 1);
        long long15 = dateTimeZone0.convertLocalToUTC((long) 115200000, false, (long) (-1));
        long long18 = dateTimeZone0.adjustOffset((long) (byte) 0, false);
        java.lang.String str20 = dateTimeZone0.getShortName((long) 1);
        java.lang.String str22 = dateTimeZone0.getNameKey(129660000L);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone23.getOffset(readableInstant24);
        int int27 = dateTimeZone23.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        boolean boolean29 = dateTimeZone28.isFixed();
        int int31 = dateTimeZone28.getStandardOffset(0L);
        java.util.Locale locale33 = null;
        java.lang.String str34 = dateTimeZone28.getShortName((-1L), locale33);
        int int36 = dateTimeZone28.getOffsetFromLocal(0L);
        long long38 = dateTimeZone23.getMillisKeepLocal(dateTimeZone28, (long) 115200000);
        boolean boolean40 = dateTimeZone23.isStandardOffset(115200000L);
        long long43 = dateTimeZone23.convertLocalToUTC((long) 10, true);
        java.lang.String str44 = dateTimeZone23.toString();
        int int46 = dateTimeZone23.getOffset(52L);
        java.lang.String str48 = dateTimeZone23.getNameKey(0L);
        java.lang.String str50 = dateTimeZone23.getName((long) 0);
        long long52 = dateTimeZone0.getMillisKeepLocal(dateTimeZone23, (long) 0);
        java.lang.String str54 = dateTimeZone0.getName(349200010L);
        java.lang.String str56 = dateTimeZone0.getNameKey((-1011599900L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00" + "'", str34, "+00:00");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 115200000L + "'", long38 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 10L + "'", long43 == 10L);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "UTC" + "'", str44, "UTC");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "UTC" + "'", str48, "UTC");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+00:00" + "'", str50, "+00:00");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "+00:00" + "'", str54, "+00:00");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "UTC" + "'", str56, "UTC");
    }

    @Test
    public void test00889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00889");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        int int8 = dateTimeZone0.getOffsetFromLocal(0L);
        java.lang.String str10 = dateTimeZone0.getShortName(0L);
        long long14 = dateTimeZone0.convertLocalToUTC((long) (byte) 0, false, 0L);
        long long17 = dateTimeZone0.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str18 = dateTimeZone0.getID();
        org.joda.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = dateTimeZone0.isLocalDateTimeGap(localDateTime19);
        long long22 = dateTimeZone0.previousTransition((-7260001L));
        java.lang.Class<?> wildcardClass23 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-7260001L) + "'", long22 == (-7260001L));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00890");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        java.lang.String str8 = dateTimeZone0.getShortName(1L);
        long long10 = dateTimeZone0.nextTransition((long) 0);
        long long12 = dateTimeZone0.nextTransition((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (int) ' ');
        boolean boolean16 = dateTimeZone0.equals((java.lang.Object) '#');
        long long18 = dateTimeZone0.convertUTCToLocal((-3600000L));
        java.lang.String str20 = dateTimeZone0.getNameKey(10L);
        long long24 = dateTimeZone0.convertLocalToUTC((-1L), true, 52L);
        java.lang.String str25 = dateTimeZone0.toString();
        org.joda.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = dateTimeZone0.isLocalDateTimeGap(localDateTime26);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-3600000L) + "'", long18 == (-3600000L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTC" + "'", str25, "UTC");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test00891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00891");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1920000);
        boolean boolean3 = dateTimeZone1.isStandardOffset(3600032L);
        java.lang.String str4 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:32" + "'", str4, "+00:32");
    }

    @Test
    public void test00892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00892");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getNameKey(1L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getShortName((long) (short) -1, locale7);
        java.lang.String str10 = dateTimeZone0.getShortName((long) (-1));
        long long12 = dateTimeZone0.nextTransition(118800001L);
        long long14 = dateTimeZone0.nextTransition((-187799900L));
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        boolean boolean16 = dateTimeZone15.isFixed();
        int int18 = dateTimeZone15.getStandardOffset(0L);
        java.lang.String str20 = dateTimeZone15.getNameKey(1L);
        java.util.TimeZone timeZone21 = dateTimeZone15.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        long long25 = dateTimeZone22.adjustOffset(110L, true);
        org.joda.time.ReadableInstant readableInstant26 = null;
        int int27 = dateTimeZone22.getOffset(readableInstant26);
        boolean boolean28 = dateTimeZone0.equals((java.lang.Object) readableInstant26);
        java.lang.Class<?> wildcardClass29 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 118800001L + "'", long12 == 118800001L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-187799900L) + "'", long14 == (-187799900L));
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 110L + "'", long25 == 110L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00893");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("UTC");
        int int3 = dateTimeZone1.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((long) (byte) 0, locale5);
        int int8 = dateTimeZone1.getOffset((long) (byte) 100);
        java.lang.String str10 = dateTimeZone1.getNameKey((long) (short) 0);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone1.getShortName((long) (short) -1, locale12);
        java.util.TimeZone timeZone14 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long17 = dateTimeZone1.convertUTCToLocal(36000000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 36000000L + "'", long17 == 36000000L);
    }

    @Test
    public void test00894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00894");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        int int4 = dateTimeZone0.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        boolean boolean6 = dateTimeZone5.isFixed();
        int int8 = dateTimeZone5.getStandardOffset(0L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone5.getShortName((-1L), locale10);
        int int13 = dateTimeZone5.getOffsetFromLocal(0L);
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) 115200000);
        int int17 = dateTimeZone5.getOffset((long) '4');
        int int19 = dateTimeZone5.getOffsetFromLocal(100L);
        long long21 = dateTimeZone5.previousTransition(1L);
        java.lang.String str23 = dateTimeZone5.getNameKey((-187799900L));
        org.joda.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = dateTimeZone5.isLocalDateTimeGap(localDateTime24);
        java.lang.String str27 = dateTimeZone5.getShortName(464400001L);
        long long30 = dateTimeZone5.adjustOffset(356400032L, true);
        int int32 = dateTimeZone5.getOffsetFromLocal((long) 1);
        java.lang.Class<?> wildcardClass33 = dateTimeZone5.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 356400032L + "'", long30 == 356400032L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00895");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1920000, 36600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 36600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00896");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        int int4 = dateTimeZone0.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        boolean boolean6 = dateTimeZone5.isFixed();
        int int8 = dateTimeZone5.getStandardOffset(0L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone5.getShortName((-1L), locale10);
        int int13 = dateTimeZone5.getOffsetFromLocal(0L);
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) 115200000);
        java.lang.String str16 = dateTimeZone0.getID();
        long long18 = dateTimeZone0.nextTransition((-7260001L));
        long long20 = dateTimeZone0.previousTransition((long) '4');
        boolean boolean22 = dateTimeZone0.isStandardOffset(360060000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-7260001L) + "'", long18 == (-7260001L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 52L + "'", long20 == 52L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test00897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00897");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(360600000, 36600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 36600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00898");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getName(10L, locale5);
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone0.isLocalDateTimeGap(localDateTime7);
        long long11 = dateTimeZone0.adjustOffset(1L, true);
        java.lang.String str13 = dateTimeZone0.getName(244199991L);
        java.lang.Class<?> wildcardClass14 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00899");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        boolean boolean4 = dateTimeZone2.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone5 = dateTimeZone2.toTimeZone();
        boolean boolean7 = dateTimeZone2.isStandardOffset(100L);
        java.lang.String str8 = dateTimeZone2.getID();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone9.getOffset(readableInstant10);
        int int13 = dateTimeZone9.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        boolean boolean15 = dateTimeZone14.isFixed();
        int int17 = dateTimeZone14.getStandardOffset(0L);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone14.getShortName((-1L), locale19);
        int int22 = dateTimeZone14.getOffsetFromLocal(0L);
        long long24 = dateTimeZone9.getMillisKeepLocal(dateTimeZone14, (long) 115200000);
        boolean boolean26 = dateTimeZone9.isStandardOffset(115200000L);
        long long29 = dateTimeZone9.convertLocalToUTC((long) 10, true);
        java.lang.String str30 = dateTimeZone9.toString();
        int int32 = dateTimeZone9.getOffset(52L);
        java.lang.String str34 = dateTimeZone9.getNameKey(0L);
        long long36 = dateTimeZone2.getMillisKeepLocal(dateTimeZone9, 35L);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.UTC;
        int int39 = dateTimeZone37.getOffsetFromLocal(115200000L);
        long long41 = dateTimeZone2.getMillisKeepLocal(dateTimeZone37, (long) (short) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        boolean boolean43 = dateTimeZone1.equals((java.lang.Object) dateTimeZone2);
        org.joda.time.ReadableInstant readableInstant44 = null;
        int int45 = dateTimeZone1.getOffset(readableInstant44);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 115200000L + "'", long24 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "UTC" + "'", str30, "UTC");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "UTC" + "'", str34, "UTC");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 35L + "'", long36 == 35L);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 10L + "'", long41 == 10L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
    }

    @Test
    public void test00900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00900");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        int int4 = dateTimeZone0.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        boolean boolean6 = dateTimeZone5.isFixed();
        int int8 = dateTimeZone5.getStandardOffset(0L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone5.getShortName((-1L), locale10);
        int int13 = dateTimeZone5.getOffsetFromLocal(0L);
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) 115200000);
        int int17 = dateTimeZone5.getOffset((long) '4');
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        java.lang.String str21 = dateTimeZone19.getName(10L);
        java.util.TimeZone timeZone22 = dateTimeZone19.toTimeZone();
        boolean boolean23 = dateTimeZone5.equals((java.lang.Object) dateTimeZone19);
        int int25 = dateTimeZone19.getOffset(100L);
        long long27 = dateTimeZone19.nextTransition(3600000L);
        java.lang.Class<?> wildcardClass28 = dateTimeZone19.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-01:00" + "'", str21, "-01:00");
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "GMT-01:00");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-3600000) + "'", int25 == (-3600000));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 3600000L + "'", long27 == 3600000L);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00901");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-3600000), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00902");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getNameKey(1L);
        java.lang.String str7 = dateTimeZone0.getShortName((long) 100);
        long long10 = dateTimeZone0.adjustOffset((long) (short) 100, true);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone0.getOffset(readableInstant11);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, (int) (short) 1);
        long long17 = dateTimeZone0.getMillisKeepLocal(dateTimeZone15, (-184199900L));
        long long21 = dateTimeZone15.convertLocalToUTC((long) 36060000, false, (-6720000L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-187859900L) + "'", long17 == (-187859900L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32400000L + "'", long21 == 32400000L);
    }

    @Test
    public void test00903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00903");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("UTC");
        int int3 = dateTimeZone1.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((long) (byte) 0, locale5);
        long long8 = dateTimeZone1.nextTransition((long) (byte) -1);
        long long10 = dateTimeZone1.convertUTCToLocal((long) (byte) 10);
        long long12 = dateTimeZone1.nextTransition((long) 1);
        int int14 = dateTimeZone1.getOffsetFromLocal((long) '4');
        java.lang.String str15 = dateTimeZone1.getID();
        long long17 = dateTimeZone1.convertUTCToLocal((-111600000L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str20 = dateTimeZone1.getNameKey(10799999L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-111600000L) + "'", long17 == (-111600000L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
    }

    @Test
    public void test00904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00904");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        java.lang.String str8 = dateTimeZone0.getShortName(1L);
        long long10 = dateTimeZone0.nextTransition((long) 0);
        long long12 = dateTimeZone0.nextTransition((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (int) ' ');
        boolean boolean16 = dateTimeZone0.equals((java.lang.Object) '#');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = dateTimeZone0.isLocalDateTimeGap(localDateTime19);
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = dateTimeZone0.isLocalDateTimeGap(localDateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00905");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        java.lang.String str8 = dateTimeZone0.getName((-1L));
        long long11 = dateTimeZone0.convertLocalToUTC(1L, false);
        long long13 = dateTimeZone0.previousTransition((long) (byte) 0);
        boolean boolean14 = dateTimeZone0.isFixed();
        long long16 = dateTimeZone0.nextTransition(115199991L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 115199991L + "'", long16 == 115199991L);
    }

    @Test
    public void test00906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00906");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(600000, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00907");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        int int4 = dateTimeZone0.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        boolean boolean6 = dateTimeZone5.isFixed();
        int int8 = dateTimeZone5.getStandardOffset(0L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone5.getShortName((-1L), locale10);
        int int13 = dateTimeZone5.getOffsetFromLocal(0L);
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) 115200000);
        boolean boolean17 = dateTimeZone0.isStandardOffset(115200000L);
        long long20 = dateTimeZone0.convertLocalToUTC((long) 10, true);
        java.lang.String str21 = dateTimeZone0.toString();
        int int23 = dateTimeZone0.getOffset(52L);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone0.getOffset(readableInstant24);
        int int27 = dateTimeZone0.getStandardOffset(97L);
        java.lang.String str29 = dateTimeZone0.getName(100L);
        long long31 = dateTimeZone0.convertUTCToLocal(127920097L);
        java.util.Locale locale33 = null;
        java.lang.String str34 = dateTimeZone0.getName(0L, locale33);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00" + "'", str29, "+00:00");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 127920097L + "'", long31 == 127920097L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00" + "'", str34, "+00:00");
    }

    @Test
    public void test00908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00908");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        boolean boolean2 = dateTimeZone0.isFixed();
        long long6 = dateTimeZone0.convertLocalToUTC(1L, true, (long) (byte) 10);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone0.getName((long) (-1), locale8);
        java.lang.String str10 = dateTimeZone0.getID();
        java.lang.Class<?> wildcardClass11 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00909");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long2 = dateTimeZone0.convertUTCToLocal((long) (byte) 0);
        java.lang.String str3 = dateTimeZone0.toString();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.lang.String str7 = dateTimeZone5.getShortName((long) 'a');
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone5.getShortName((long) (short) -1, locale9);
        int int12 = dateTimeZone5.getOffset((long) 115200000);
        long long14 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) (short) 0);
        long long18 = dateTimeZone0.convertLocalToUTC((-118799903L), true, 127920000L);
        boolean boolean19 = dateTimeZone0.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115200000L) + "'", long14 == (-115200000L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-118799903L) + "'", long18 == (-118799903L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test00910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00910");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone0.isLocalDateTimeGap(localDateTime2);
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 10);
        int int7 = dateTimeZone0.getOffset((long) (short) 1);
        long long9 = dateTimeZone0.nextTransition((long) (-1));
        boolean boolean11 = dateTimeZone0.isStandardOffset((long) (byte) 10);
        java.lang.String str13 = dateTimeZone0.getName((-299399900L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
    }

    @Test
    public void test00911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00911");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(363120000, 360000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 360000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00912");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        int int8 = dateTimeZone0.getOffsetFromLocal(0L);
        java.lang.String str10 = dateTimeZone0.getShortName(0L);
        long long14 = dateTimeZone0.convertLocalToUTC((long) (byte) 0, false, 0L);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone0.getShortName(0L, locale16);
        long long21 = dateTimeZone0.convertLocalToUTC(3599999L, true, 228540087L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 3599999L + "'", long21 == 3599999L);
    }

    @Test
    public void test00913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00913");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', 351120000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 351120000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00914");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        boolean boolean5 = dateTimeZone0.isStandardOffset(100L);
        java.lang.String str6 = dateTimeZone0.getID();
        long long8 = dateTimeZone0.previousTransition((long) (short) 10);
        long long11 = dateTimeZone0.convertLocalToUTC((long) 126060000, true);
        int int13 = dateTimeZone0.getStandardOffset((long) 349200000);
        java.lang.String str15 = dateTimeZone0.getName((-356400000L));
        java.lang.String str17 = dateTimeZone0.getNameKey(122460100L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 126060000L + "'", long11 == 126060000L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
    }

    @Test
    public void test00915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00915");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        boolean boolean2 = dateTimeZone0.isFixed();
        long long6 = dateTimeZone0.convertLocalToUTC(1L, true, (long) (byte) 10);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone0.getName((long) (-1), locale8);
        java.lang.String str10 = dateTimeZone0.getID();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone11.isLocalDateTimeGap(localDateTime13);
        long long16 = dateTimeZone11.convertUTCToLocal(0L);
        java.lang.String str17 = dateTimeZone11.toString();
        long long20 = dateTimeZone11.convertLocalToUTC(100L, true);
        java.lang.String str22 = dateTimeZone11.getName((long) (short) 1);
        org.joda.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = dateTimeZone11.isLocalDateTimeGap(localDateTime23);
        boolean boolean25 = dateTimeZone11.isFixed();
        long long29 = dateTimeZone11.convertLocalToUTC((-187199965L), false, 90L);
        long long31 = dateTimeZone0.getMillisKeepLocal(dateTimeZone11, (-417599900L));
        int int33 = dateTimeZone0.getOffsetFromLocal((long) (byte) 0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-187199965L) + "'", long29 == (-187199965L));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-417599900L) + "'", long31 == (-417599900L));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test00916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00916");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        boolean boolean8 = dateTimeZone6.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone9 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.String str12 = dateTimeZone10.getNameKey((long) (short) 10);
        java.lang.String str14 = dateTimeZone10.getName((long) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        boolean boolean16 = dateTimeZone15.isFixed();
        int int18 = dateTimeZone15.getStandardOffset(0L);
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone15.getShortName((-1L), locale20);
        java.lang.String str23 = dateTimeZone15.getShortName(1L);
        long long25 = dateTimeZone10.getMillisKeepLocal(dateTimeZone15, (long) (-1));
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone10.getName(0L, locale27);
        long long30 = dateTimeZone5.getMillisKeepLocal(dateTimeZone10, 1L);
        java.util.Locale locale32 = null;
        java.lang.String str33 = dateTimeZone10.getName((long) '4', locale32);
        boolean boolean34 = dateTimeZone10.isFixed();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        long long37 = dateTimeZone35.convertUTCToLocal((long) (byte) 0);
        int int39 = dateTimeZone35.getOffsetFromLocal((long) (-1));
        boolean boolean40 = dateTimeZone35.isFixed();
        java.lang.String str41 = dateTimeZone35.getID();
        org.joda.time.LocalDateTime localDateTime42 = null;
        boolean boolean43 = dateTimeZone35.isLocalDateTimeGap(localDateTime42);
        long long45 = dateTimeZone10.getMillisKeepLocal(dateTimeZone35, (long) ' ');
        boolean boolean47 = dateTimeZone10.isStandardOffset((long) 360000000);
        boolean boolean48 = dateTimeZone10.isFixed();
        java.lang.Class<?> wildcardClass49 = dateTimeZone10.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00" + "'", str28, "+00:00");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00" + "'", str33, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "UTC" + "'", str41, "UTC");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 32L + "'", long45 == 32L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test00917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00917");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        int int8 = dateTimeZone0.getOffsetFromLocal(0L);
        java.lang.String str10 = dateTimeZone0.getShortName(0L);
        long long14 = dateTimeZone0.convertLocalToUTC((long) (byte) 0, false, 0L);
        long long17 = dateTimeZone0.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str18 = dateTimeZone0.getID();
        java.lang.String str19 = dateTimeZone0.toString();
        long long22 = dateTimeZone0.adjustOffset((long) (byte) 1, false);
        java.util.TimeZone timeZone23 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone24.getShortName(151200000L, locale26);
        java.lang.String str28 = dateTimeZone24.getID();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        long long32 = dateTimeZone30.convertUTCToLocal(32L);
        java.lang.String str34 = dateTimeZone30.getName((long) 349200000);
        long long36 = dateTimeZone24.getMillisKeepLocal(dateTimeZone30, (-115199900L));
        long long39 = dateTimeZone24.convertLocalToUTC(187200001L, true);
        long long41 = dateTimeZone24.convertUTCToLocal((-141060009L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UTC" + "'", str28, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 3600032L + "'", long32 == 3600032L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+01:00" + "'", str34, "+01:00");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-118799900L) + "'", long36 == (-118799900L));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 187200001L + "'", long39 == 187200001L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-141060009L) + "'", long41 == (-141060009L));
    }

    @Test
    public void test00918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00918");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getNameKey(1L);
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        long long10 = dateTimeZone7.adjustOffset(110L, true);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone12.getName((long) ' ', locale14);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        int int18 = dateTimeZone12.getOffset((long) 115200000);
        long long20 = dateTimeZone7.getMillisKeepLocal(dateTimeZone12, (long) (short) -1);
        java.lang.String str21 = dateTimeZone7.toString();
        long long23 = dateTimeZone7.convertUTCToLocal(1L);
        java.lang.Class<?> wildcardClass24 = dateTimeZone7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 110L + "'", long10 == 110L);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-01:00" + "'", str15, "-01:00");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3600000) + "'", int18 == (-3600000));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3599999L + "'", long20 == 3599999L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00919");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00920");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.097");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        boolean boolean3 = dateTimeZone2.isFixed();
        int int5 = dateTimeZone2.getStandardOffset(0L);
        java.lang.String str7 = dateTimeZone2.getNameKey(1L);
        java.util.TimeZone timeZone8 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        boolean boolean12 = dateTimeZone1.equals((java.lang.Object) dateTimeZone11);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getName(0L, locale14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.097" + "'", str15, "+00:00:00.097");
    }

    @Test
    public void test00921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00921");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale2 = null;
        java.lang.String str3 = dateTimeZone0.getShortName((long) 115200000, locale2);
        boolean boolean4 = dateTimeZone0.isFixed();
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone0.getName(52L, locale6);
        java.util.TimeZone timeZone8 = dateTimeZone0.toTimeZone();
        int int10 = dateTimeZone0.getOffsetFromLocal(118799999L);
        java.lang.Class<?> wildcardClass11 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00922");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long2 = dateTimeZone0.convertUTCToLocal((long) (byte) 0);
        java.lang.String str4 = dateTimeZone0.getShortName((long) '4');
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone0.getOffset(readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone0.getOffset(readableInstant7);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00923");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        java.lang.Class<?> wildcardClass4 = nameProvider0.getClass();
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00924");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        int int8 = dateTimeZone0.getOffsetFromLocal(0L);
        int int10 = dateTimeZone0.getStandardOffset((long) 126060000);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone0.getOffset(readableInstant12);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00925");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(97, 0);
        long long6 = dateTimeZone2.convertLocalToUTC((long) (byte) 100, false, (-244799999L));
        long long8 = dateTimeZone2.previousTransition((long) (byte) 0);
        java.lang.String str10 = dateTimeZone2.getNameKey((-547799990L));
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone2.getShortName((long) 5700000, locale12);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-349199900L) + "'", long6 == (-349199900L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
    }

    @Test
    public void test00926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00926");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone5.getOffset(readableInstant6);
        int int9 = dateTimeZone5.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        boolean boolean11 = dateTimeZone10.isFixed();
        int int13 = dateTimeZone10.getStandardOffset(0L);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone10.getShortName((-1L), locale15);
        int int18 = dateTimeZone10.getOffsetFromLocal(0L);
        long long20 = dateTimeZone5.getMillisKeepLocal(dateTimeZone10, (long) 115200000);
        java.lang.String str22 = dateTimeZone5.getShortName((long) '4');
        boolean boolean23 = dateTimeZone4.equals((java.lang.Object) dateTimeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        long long28 = dateTimeZone5.convertLocalToUTC(1L, false, (-306000000L));
        long long31 = dateTimeZone5.convertLocalToUTC((-65L), false);
        int int33 = dateTimeZone5.getOffsetFromLocal((-115199999L));
        java.lang.Class<?> wildcardClass34 = dateTimeZone5.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 115200000L + "'", long20 == 115200000L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-65L) + "'", long31 == (-65L));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test00927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00927");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.lang.String str6 = dateTimeZone4.getNameKey((long) (short) 10);
        java.lang.String str8 = dateTimeZone4.getName((long) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        boolean boolean10 = dateTimeZone9.isFixed();
        int int12 = dateTimeZone9.getStandardOffset(0L);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone9.getShortName((-1L), locale14);
        java.lang.String str17 = dateTimeZone9.getShortName(1L);
        long long19 = dateTimeZone4.getMillisKeepLocal(dateTimeZone9, (long) (-1));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        boolean boolean22 = dateTimeZone9.isStandardOffset((long) '4');
        org.joda.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = dateTimeZone9.isLocalDateTimeGap(localDateTime23);
        int int26 = dateTimeZone9.getOffset((long) 115200000);
        java.lang.String str27 = dateTimeZone9.toString();
        int int29 = dateTimeZone9.getOffset(115199999L);
        boolean boolean30 = dateTimeZone9.isFixed();
        int int32 = dateTimeZone9.getStandardOffset(547199998L);
        java.lang.Class<?> wildcardClass33 = dateTimeZone9.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "UTC" + "'", str27, "UTC");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00928");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffset(129660000L);
        int int5 = dateTimeZone1.getOffset((-1L));
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        boolean boolean7 = dateTimeZone6.isFixed();
        int int9 = dateTimeZone6.getStandardOffset(0L);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone6.getShortName((-1L), locale11);
        java.lang.String str14 = dateTimeZone6.getName((-1L));
        boolean boolean15 = dateTimeZone1.equals((java.lang.Object) (-1L));
        long long19 = dateTimeZone1.convertLocalToUTC(349200010L, false, (long) (short) 10);
        java.lang.String str20 = dateTimeZone1.getID();
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone1.getOffset(readableInstant21);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 115200000 + "'", int5 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 234000010L + "'", long19 == 234000010L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+32:00" + "'", str20, "+32:00");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 115200000 + "'", int22 == 115200000);
    }

    @Test
    public void test00929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00929");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getShortName((long) (byte) 100);
        java.lang.String str7 = dateTimeZone0.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        boolean boolean11 = dateTimeZone0.isStandardOffset((long) (short) 1);
        long long15 = dateTimeZone0.convertLocalToUTC((long) 115200000, false, (long) (-1));
        long long18 = dateTimeZone0.adjustOffset((long) (byte) 0, false);
        java.lang.String str20 = dateTimeZone0.getShortName((long) 1);
        long long22 = dateTimeZone0.convertUTCToLocal((-3600000L));
        long long25 = dateTimeZone0.convertLocalToUTC(0L, false);
        int int27 = dateTimeZone0.getOffsetFromLocal((-118799903L));
        java.lang.Class<?> wildcardClass28 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-3600000L) + "'", long22 == (-3600000L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00930");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        int int8 = dateTimeZone0.getOffsetFromLocal(0L);
        int int10 = dateTimeZone0.getStandardOffset((long) (byte) 10);
        java.lang.String str12 = dateTimeZone0.getName((long) (byte) 10);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone0.getOffset(readableInstant13);
        java.lang.String str15 = dateTimeZone0.toString();
        java.lang.String str16 = dateTimeZone0.getID();
        long long19 = dateTimeZone0.convertLocalToUTC((-127920001L), false);
        long long21 = dateTimeZone0.previousTransition(0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-127920001L) + "'", long19 == (-127920001L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test00931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00931");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-3600000), 349800000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 349800000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00932");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getShortName((long) (byte) 100);
        int int7 = dateTimeZone0.getStandardOffset(359999999L);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone0.getName((long) (-1), locale9);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone0.getName(97L, locale12);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.String str15 = dateTimeZone0.getID();
        org.joda.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = dateTimeZone0.isLocalDateTimeGap(localDateTime16);
        long long19 = dateTimeZone0.previousTransition((-115199999L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-115199999L) + "'", long19 == (-115199999L));
    }

    @Test
    public void test00933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00933");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getShortName((long) (byte) 100);
        java.lang.String str7 = dateTimeZone0.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        long long11 = dateTimeZone0.previousTransition((long) 115200000);
        int int13 = dateTimeZone0.getOffsetFromLocal(97L);
        boolean boolean15 = dateTimeZone0.isStandardOffset((-118800000L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115200000L + "'", long11 == 115200000L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00934");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 351300000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 351300000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00935");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        java.lang.String str3 = dateTimeZone0.getShortName((long) (byte) 100);
        java.lang.String str5 = dateTimeZone0.getShortName((long) (-1));
        java.lang.String str7 = dateTimeZone0.getName((long) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        boolean boolean9 = dateTimeZone8.isFixed();
        int int11 = dateTimeZone8.getStandardOffset(0L);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone8.getShortName((-1L), locale13);
        java.lang.String str16 = dateTimeZone8.getShortName(1L);
        long long18 = dateTimeZone8.nextTransition((long) 0);
        long long20 = dateTimeZone8.nextTransition((long) (short) -1);
        long long22 = dateTimeZone0.getMillisKeepLocal(dateTimeZone8, (-7200000L));
        long long25 = dateTimeZone0.adjustOffset(108480000L, false);
        java.lang.String str26 = dateTimeZone0.getID();
        java.lang.String str28 = dateTimeZone0.getNameKey(356400032L);
        org.joda.time.LocalDateTime localDateTime29 = null;
        boolean boolean30 = dateTimeZone0.isLocalDateTimeGap(localDateTime29);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-7200000L) + "'", long22 == (-7200000L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 108480000L + "'", long25 == 108480000L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTC" + "'", str26, "UTC");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UTC" + "'", str28, "UTC");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test00936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00936");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(360060000, 349800000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 349800000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00937");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        int int8 = dateTimeZone0.getOffsetFromLocal(0L);
        java.lang.String str10 = dateTimeZone0.getShortName(0L);
        java.lang.String str12 = dateTimeZone0.getShortName(359999999L);
        java.lang.String str14 = dateTimeZone0.getShortName(0L);
        java.util.TimeZone timeZone15 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forID("UTC");
        int int19 = dateTimeZone17.getStandardOffset(0L);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone17.getShortName((long) (byte) 0, locale21);
        long long24 = dateTimeZone17.nextTransition((long) (byte) -1);
        long long26 = dateTimeZone0.getMillisKeepLocal(dateTimeZone17, (long) (-3600000));
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone0.getShortName(349200010L, locale28);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        boolean boolean31 = dateTimeZone30.isFixed();
        int int33 = dateTimeZone30.getStandardOffset(0L);
        java.lang.String str35 = dateTimeZone30.getNameKey(1L);
        int int37 = dateTimeZone30.getOffset((-1L));
        java.lang.String str38 = dateTimeZone30.toString();
        long long41 = dateTimeZone30.adjustOffset((-7260001L), true);
        boolean boolean42 = dateTimeZone0.equals((java.lang.Object) true);
        java.util.Locale locale44 = null;
        java.lang.String str45 = dateTimeZone0.getName(190800000L, locale44);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-3600000L) + "'", long26 == (-3600000L));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00" + "'", str29, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "UTC" + "'", str35, "UTC");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "UTC" + "'", str38, "UTC");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-7260001L) + "'", long41 == (-7260001L));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+00:00" + "'", str45, "+00:00");
    }

    @Test
    public void test00938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00938");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(351120000, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00939");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (-3600000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00940");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(115200000);
        boolean boolean2 = dateTimeZone1.isFixed();
        java.lang.String str3 = dateTimeZone1.getID();
        long long5 = dateTimeZone1.nextTransition((long) 'a');
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        boolean boolean7 = dateTimeZone6.isFixed();
        int int9 = dateTimeZone6.getStandardOffset(0L);
        java.lang.String str11 = dateTimeZone6.getShortName((long) (byte) 100);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone6.getName((long) 115200000, locale13);
        long long16 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (-118799903L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        boolean boolean18 = dateTimeZone6.isFixed();
        int int20 = dateTimeZone6.getOffset((-187799900L));
        java.lang.String str21 = dateTimeZone6.getID();
        boolean boolean22 = dateTimeZone6.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+32:00" + "'", str3, "+32:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-3599903L) + "'", long16 == (-3599903L));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test00941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00941");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone0.isLocalDateTimeGap(localDateTime2);
        long long6 = dateTimeZone0.adjustOffset((long) (short) 10, false);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone0.getOffset(readableInstant7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        boolean boolean10 = dateTimeZone9.isFixed();
        int int12 = dateTimeZone9.getStandardOffset(0L);
        java.lang.String str14 = dateTimeZone9.getNameKey(1L);
        java.lang.String str16 = dateTimeZone9.getShortName((long) 100);
        boolean boolean17 = dateTimeZone0.equals((java.lang.Object) 100);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        long long20 = dateTimeZone18.convertUTCToLocal((long) (byte) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        boolean boolean22 = dateTimeZone0.equals((java.lang.Object) dateTimeZone18);
        boolean boolean24 = dateTimeZone18.isStandardOffset((long) (byte) 100);
        boolean boolean25 = dateTimeZone18.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        java.util.TimeZone timeZone27 = dateTimeZone18.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone29.getShortName((long) (-6720000), locale31);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
    }

    @Test
    public void test00942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00942");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) 'a', locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (short) 0, locale6);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone9.isLocalDateTimeGap(localDateTime10);
        long long13 = dateTimeZone9.nextTransition(151200000L);
        long long16 = dateTimeZone9.convertLocalToUTC(187200001L, true);
        long long18 = dateTimeZone1.getMillisKeepLocal(dateTimeZone9, (long) (byte) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        java.lang.String str21 = dateTimeZone9.getShortName((long) (byte) 100);
        int int23 = dateTimeZone9.getStandardOffset((-184199900L));
        java.lang.String str24 = dateTimeZone9.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+100:00" + "'", str4, "+100:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+100:00" + "'", str7, "+100:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 151200000L + "'", long13 == 151200000L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 187199991L + "'", long16 == 187199991L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 359999991L + "'", long18 == 359999991L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.010" + "'", str21, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.010" + "'", str24, "+00:00:00.010");
    }

    @Test
    public void test00943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00943");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone5.getOffset(readableInstant6);
        int int9 = dateTimeZone5.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        boolean boolean11 = dateTimeZone10.isFixed();
        int int13 = dateTimeZone10.getStandardOffset(0L);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone10.getShortName((-1L), locale15);
        int int18 = dateTimeZone10.getOffsetFromLocal(0L);
        long long20 = dateTimeZone5.getMillisKeepLocal(dateTimeZone10, (long) 115200000);
        java.lang.String str22 = dateTimeZone5.getShortName((long) '4');
        boolean boolean23 = dateTimeZone4.equals((java.lang.Object) dateTimeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        long long28 = dateTimeZone5.convertLocalToUTC(1L, false, (-306000000L));
        long long31 = dateTimeZone5.convertLocalToUTC((-65L), false);
        boolean boolean33 = dateTimeZone5.isStandardOffset(10L);
        java.lang.Class<?> wildcardClass34 = dateTimeZone5.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 115200000L + "'", long20 == 115200000L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-65L) + "'", long31 == (-65L));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test00944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00944");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long2 = dateTimeZone0.convertUTCToLocal((long) (byte) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.String str5 = dateTimeZone0.getShortName(52L);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone0.isLocalDateTimeGap(localDateTime6);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone0.getShortName(124320000L, locale9);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
    }

    @Test
    public void test00945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00945");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        int int4 = dateTimeZone0.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        boolean boolean6 = dateTimeZone5.isFixed();
        int int8 = dateTimeZone5.getStandardOffset(0L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone5.getShortName((-1L), locale10);
        int int13 = dateTimeZone5.getOffsetFromLocal(0L);
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) 115200000);
        boolean boolean17 = dateTimeZone0.isStandardOffset(115200000L);
        long long20 = dateTimeZone0.convertLocalToUTC((long) 10, true);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant22 = null;
        int int23 = dateTimeZone21.getOffset(readableInstant22);
        int int25 = dateTimeZone21.getStandardOffset(1L);
        long long27 = dateTimeZone0.getMillisKeepLocal(dateTimeZone21, (long) 10);
        int int29 = dateTimeZone0.getOffsetFromLocal((-115200000L));
        long long32 = dateTimeZone0.convertLocalToUTC(35L, true);
        int int34 = dateTimeZone0.getStandardOffset((-302399900L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L + "'", long27 == 10L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 35L + "'", long32 == 35L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test00946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00946");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(360000000, 127920000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 127920000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00947");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        java.lang.String str4 = dateTimeZone0.getShortName((long) 1);
        org.joda.time.tz.Provider provider5 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider5);
        org.joda.time.DateTimeZone.setProvider(provider5);
        boolean boolean8 = dateTimeZone0.equals((java.lang.Object) provider5);
        long long10 = dateTimeZone0.convertUTCToLocal(97L);
        java.lang.String str12 = dateTimeZone0.getNameKey((long) 'a');
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        boolean boolean14 = dateTimeZone13.isFixed();
        int int16 = dateTimeZone13.getStandardOffset(0L);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone13.getShortName((-1L), locale18);
        java.lang.String str21 = dateTimeZone13.getShortName(1L);
        java.lang.String str22 = dateTimeZone13.getID();
        long long25 = dateTimeZone13.convertLocalToUTC(359999999L, true);
        long long27 = dateTimeZone0.getMillisKeepLocal(dateTimeZone13, (-184199900L));
        long long29 = dateTimeZone13.previousTransition(363600000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertNotNull(provider5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 359999999L + "'", long25 == 359999999L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-184199900L) + "'", long27 == (-184199900L));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 363600000L + "'", long29 == 363600000L);
    }

    @Test
    public void test00948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00948");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        int int3 = dateTimeZone1.getOffset(129660000L);
        int int5 = dateTimeZone1.getOffset((-1L));
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        boolean boolean7 = dateTimeZone6.isFixed();
        int int9 = dateTimeZone6.getStandardOffset(0L);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone6.getShortName((-1L), locale11);
        java.lang.String str14 = dateTimeZone6.getName((-1L));
        boolean boolean15 = dateTimeZone1.equals((java.lang.Object) (-1L));
        int int17 = dateTimeZone1.getOffsetFromLocal(600000L);
        int int19 = dateTimeZone1.getOffset(3600100L);
        long long21 = dateTimeZone1.convertUTCToLocal(366720000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115200000 + "'", int3 == 115200000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 115200000 + "'", int5 == 115200000);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 115200000 + "'", int17 == 115200000);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 115200000 + "'", int19 == 115200000);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 481920000L + "'", long21 == 481920000L);
    }

    @Test
    public void test00949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00949");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        int int4 = dateTimeZone0.getStandardOffset((long) ' ');
        java.lang.String str5 = dateTimeZone0.getID();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        long long8 = dateTimeZone0.convertUTCToLocal((-187799900L));
        boolean boolean9 = dateTimeZone0.isFixed();
        boolean boolean10 = dateTimeZone0.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-187799900L) + "'", long8 == (-187799900L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00950");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long2 = dateTimeZone0.convertUTCToLocal((long) (byte) 0);
        java.lang.String str3 = dateTimeZone0.toString();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        boolean boolean5 = dateTimeZone4.isFixed();
        int int7 = dateTimeZone4.getStandardOffset(0L);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone4.getShortName((-1L), locale9);
        int int12 = dateTimeZone4.getOffsetFromLocal(0L);
        java.lang.String str14 = dateTimeZone4.getShortName(0L);
        java.lang.String str16 = dateTimeZone4.getShortName(359999999L);
        long long18 = dateTimeZone0.getMillisKeepLocal(dateTimeZone4, (-1L));
        java.lang.String str20 = dateTimeZone4.getShortName((long) 115200000);
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = dateTimeZone4.isLocalDateTimeGap(localDateTime21);
        long long25 = dateTimeZone4.convertLocalToUTC((-118799913L), false);
        long long29 = dateTimeZone4.convertLocalToUTC((-115199948L), false, (long) (short) 100);
        int int31 = dateTimeZone4.getOffsetFromLocal((-115200000L));
        long long34 = dateTimeZone4.convertLocalToUTC(115200100L, true);
        java.lang.String str36 = dateTimeZone4.getNameKey(172799991L);
        java.util.Locale locale38 = null;
        java.lang.String str39 = dateTimeZone4.getShortName(360060000L, locale38);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 115200000L + "'", long2 == 115200000L);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+32:00" + "'", str3, "+32:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 115199999L + "'", long18 == 115199999L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-118799913L) + "'", long25 == (-118799913L));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-115199948L) + "'", long29 == (-115199948L));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 115200100L + "'", long34 == 115200100L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UTC" + "'", str36, "UTC");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00" + "'", str39, "+00:00");
    }

    @Test
    public void test00951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00951");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone0.isLocalDateTimeGap(localDateTime2);
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        boolean boolean7 = dateTimeZone6.isFixed();
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone6.isLocalDateTimeGap(localDateTime8);
        java.lang.String str11 = dateTimeZone6.getShortName((long) (short) 10);
        int int13 = dateTimeZone6.getOffset((long) (short) 1);
        int int15 = dateTimeZone6.getStandardOffset((long) 100);
        long long17 = dateTimeZone0.getMillisKeepLocal(dateTimeZone6, (long) 97);
        int int19 = dateTimeZone6.getOffsetFromLocal(241200000L);
        java.lang.String str20 = dateTimeZone6.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
    }

    @Test
    public void test00952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00952");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        java.lang.String str4 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone1.getOffset(readableInstant5);
        boolean boolean8 = dateTimeZone1.isStandardOffset((-244799999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00953");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(360000000, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00954");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        java.lang.String str2 = dateTimeZone1.getID();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getShortName(0L, locale4);
        long long7 = dateTimeZone1.previousTransition((-118799903L));
        java.lang.String str8 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+10:00" + "'", str2, "+10:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+10:00" + "'", str5, "+10:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-118799903L) + "'", long7 == (-118799903L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+10:00" + "'", str8, "+10:00");
    }

    @Test
    public void test00955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00955");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getShortName((long) (byte) 100);
        java.lang.String str7 = dateTimeZone0.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        long long11 = dateTimeZone0.convertUTCToLocal(10L);
        long long15 = dateTimeZone0.convertLocalToUTC(96L, true, 115199991L);
        long long17 = dateTimeZone0.convertUTCToLocal(464399991L);
        int int19 = dateTimeZone0.getOffset((-36059958L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 96L + "'", long15 == 96L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 464399991L + "'", long17 == 464399991L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test00956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00956");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        java.lang.String str8 = dateTimeZone0.getShortName(1L);
        long long10 = dateTimeZone0.nextTransition((long) 0);
        long long12 = dateTimeZone0.nextTransition((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (int) ' ');
        boolean boolean16 = dateTimeZone0.equals((java.lang.Object) '#');
        long long18 = dateTimeZone0.convertUTCToLocal((-3600000L));
        int int20 = dateTimeZone0.getOffset((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        long long23 = dateTimeZone0.getMillisKeepLocal(dateTimeZone21, (long) (short) 100);
        java.lang.String str25 = dateTimeZone0.getName(115200001L);
        java.util.TimeZone timeZone26 = dateTimeZone0.toTimeZone();
        org.joda.time.ReadableInstant readableInstant27 = null;
        int int28 = dateTimeZone0.getOffset(readableInstant27);
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone0.getShortName((-299399900L), locale30);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-3600000L) + "'", long18 == (-3600000L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00" + "'", str25, "+00:00");
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00" + "'", str31, "+00:00");
    }

    @Test
    public void test00957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00957");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        boolean boolean5 = dateTimeZone0.isStandardOffset(100L);
        java.lang.String str6 = dateTimeZone0.getID();
        java.lang.String str8 = dateTimeZone0.getShortName(1L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone0.getOffset(readableInstant9);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone0.isLocalDateTimeGap(localDateTime11);
        int int14 = dateTimeZone0.getOffsetFromLocal((-7200000L));
        java.lang.String str16 = dateTimeZone0.getName((-1L));
        boolean boolean18 = dateTimeZone0.isStandardOffset((-36000000L));
        long long21 = dateTimeZone0.convertLocalToUTC(35L, false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 35L + "'", long21 == 35L);
    }

    @Test
    public void test00958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00958");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("UTC");
        int int3 = dateTimeZone1.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((long) (byte) 0, locale5);
        long long8 = dateTimeZone1.nextTransition((long) (byte) -1);
        long long10 = dateTimeZone1.convertUTCToLocal((long) (byte) 10);
        java.lang.String str12 = dateTimeZone1.getName((long) (short) -1);
        java.lang.String str14 = dateTimeZone1.getShortName((-460799948L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
    }

    @Test
    public void test00959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00959");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, 360600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 360600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00960");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        long long4 = dateTimeZone0.nextTransition((long) 115200000);
        java.lang.String str6 = dateTimeZone0.getNameKey((long) (short) 100);
        boolean boolean8 = dateTimeZone0.isStandardOffset((long) 'a');
        boolean boolean9 = dateTimeZone0.isFixed();
        long long13 = dateTimeZone0.convertLocalToUTC((long) (-3600000), false, (-115200000L));
        java.lang.String str14 = dateTimeZone0.getID();
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone0.getOffset(readableInstant15);
        java.lang.String str18 = dateTimeZone0.getNameKey((-115199990L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 115200000L + "'", long4 == 115200000L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-3600000L) + "'", long13 == (-3600000L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
    }

    @Test
    public void test00961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00961");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.lang.String str3 = dateTimeZone1.getShortName((long) 'a');
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((long) (short) -1, locale5);
        int int8 = dateTimeZone1.getOffset((long) 115200000);
        int int10 = dateTimeZone1.getOffsetFromLocal(75600000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+32:00" + "'", str3, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
    }

    @Test
    public void test00962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00962");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName(115199991L, locale3);
        long long6 = dateTimeZone1.convertUTCToLocal((-115200001L));
        boolean boolean8 = dateTimeZone1.isStandardOffset((-1L));
        java.lang.String str10 = dateTimeZone1.getNameKey((long) '4');
        java.lang.Class<?> wildcardClass11 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-115200001L) + "'", long6 == (-115200001L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00963");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long5 = dateTimeZone1.adjustOffset(0L, true);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getShortName(162000000L, locale7);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.010" + "'", str8, "+00:00:00.010");
    }

    @Test
    public void test00964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00964");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long2 = dateTimeZone0.convertUTCToLocal((long) (byte) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.String str5 = dateTimeZone0.getShortName(52L);
        java.lang.String str6 = dateTimeZone0.toString();
        java.lang.String str7 = dateTimeZone0.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 187200000L + "'", long2 == 187200000L);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+52:00" + "'", str5, "+52:00");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+52:00" + "'", str6, "+52:00");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+52:00" + "'", str7, "+52:00");
    }

    @Test
    public void test00965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00965");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', 36060000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 36060000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00966");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) 'a', locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((long) (short) 0, locale6);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone9.isLocalDateTimeGap(localDateTime10);
        long long13 = dateTimeZone9.nextTransition(151200000L);
        long long16 = dateTimeZone9.convertLocalToUTC(187200001L, true);
        long long18 = dateTimeZone1.getMillisKeepLocal(dateTimeZone9, (long) (byte) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forID("UTC");
        int int23 = dateTimeZone21.getStandardOffset(0L);
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone21.getShortName((long) (byte) 0, locale25);
        long long28 = dateTimeZone21.nextTransition((long) (byte) -1);
        long long30 = dateTimeZone21.convertUTCToLocal((long) (byte) 10);
        int int32 = dateTimeZone21.getStandardOffset(0L);
        java.util.TimeZone timeZone33 = dateTimeZone21.toTimeZone();
        long long35 = dateTimeZone9.getMillisKeepLocal(dateTimeZone21, (-3599903L));
        long long39 = dateTimeZone9.convertLocalToUTC(363600000L, false, (long) 36600000);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHours(0);
        java.lang.String str42 = dateTimeZone41.getID();
        java.lang.String str44 = dateTimeZone41.getShortName((long) (short) 10);
        java.lang.String str46 = dateTimeZone41.getName(97L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone41);
        long long49 = dateTimeZone41.previousTransition((-302999900L));
        long long51 = dateTimeZone41.convertUTCToLocal((-7200000L));
        long long53 = dateTimeZone9.getMillisKeepLocal(dateTimeZone41, (-53999999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+100:00" + "'", str4, "+100:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+100:00" + "'", str7, "+100:00");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 151200000L + "'", long13 == 151200000L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 187199991L + "'", long16 == 187199991L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 359999991L + "'", long18 == 359999991L);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00" + "'", str26, "+00:00");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-3599893L) + "'", long35 == (-3599893L));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 363599990L + "'", long39 == 363599990L);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "UTC" + "'", str42, "UTC");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "+00:00" + "'", str44, "+00:00");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00" + "'", str46, "+00:00");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-302999900L) + "'", long49 == (-302999900L));
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-7200000L) + "'", long51 == (-7200000L));
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-53999989L) + "'", long53 == (-53999989L));
    }

    @Test
    public void test00967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00967");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        long long6 = dateTimeZone1.convertLocalToUTC(52L, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getName(111600000L, locale9);
        java.lang.String str12 = dateTimeZone1.getName(187200000L);
        java.lang.String str14 = dateTimeZone1.getNameKey(115199991L);
        long long16 = dateTimeZone1.nextTransition((-359999990L));
        long long18 = dateTimeZone1.nextTransition(0L);
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone1.getName(3599999L, locale20);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-359999990L) + "'", long16 == (-359999990L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
    }

    @Test
    public void test00968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00968");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("-01:00");
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone1.isLocalDateTimeGap(localDateTime3);
        java.lang.String str6 = dateTimeZone1.getNameKey(115200000L);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        int int9 = dateTimeZone1.getOffset(228540087L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT-01:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3600000) + "'", int9 == (-3600000));
    }

    @Test
    public void test00969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00969");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        boolean boolean5 = dateTimeZone0.isStandardOffset(100L);
        java.lang.String str6 = dateTimeZone0.getID();
        long long8 = dateTimeZone0.previousTransition((long) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        boolean boolean11 = dateTimeZone0.equals((java.lang.Object) (short) 100);
        long long13 = dateTimeZone0.convertUTCToLocal((-115199990L));
        int int15 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str16 = dateTimeZone0.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-115199990L) + "'", long13 == (-115199990L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
    }

    @Test
    public void test00970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00970");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getShortName((long) (byte) 100);
        int int7 = dateTimeZone0.getStandardOffset(359999999L);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone0.getName((long) (-1), locale9);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone0.getName(97L, locale12);
        long long15 = dateTimeZone0.convertUTCToLocal(187199991L);
        java.lang.String str17 = dateTimeZone0.getNameKey(363120000L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 187199991L + "'", long15 == 187199991L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
    }

    @Test
    public void test00971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00971");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long2 = dateTimeZone0.convertUTCToLocal((long) (byte) 0);
        java.lang.String str3 = dateTimeZone0.toString();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.lang.String str7 = dateTimeZone5.getShortName((long) 'a');
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone5.getShortName((long) (short) -1, locale9);
        int int12 = dateTimeZone5.getOffset((long) 115200000);
        long long14 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) (short) 0);
        boolean boolean16 = dateTimeZone5.isStandardOffset((long) 1);
        boolean boolean17 = dateTimeZone5.isFixed();
        int int19 = dateTimeZone5.getOffset((long) 10);
        org.joda.time.ReadableInstant readableInstant20 = null;
        int int21 = dateTimeZone5.getOffset(readableInstant20);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+32:00" + "'", str7, "+32:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+32:00" + "'", str10, "+32:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115200000L) + "'", long14 == (-115200000L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 115200000 + "'", int19 == 115200000);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 115200000 + "'", int21 == 115200000);
    }

    @Test
    public void test00972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00972");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        int int8 = dateTimeZone0.getOffsetFromLocal(0L);
        long long10 = dateTimeZone0.convertUTCToLocal((long) 0);
        long long14 = dateTimeZone0.convertLocalToUTC((-115200000L), true, 359999999L);
        int int16 = dateTimeZone0.getOffset(97L);
        int int18 = dateTimeZone0.getOffsetFromLocal(187200000L);
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone0.getName(190800000L, locale20);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        long long24 = dateTimeZone22.convertUTCToLocal((long) (byte) 0);
        java.lang.String str25 = dateTimeZone22.toString();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.lang.String str29 = dateTimeZone27.getShortName((long) 'a');
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone27.getShortName((long) (short) -1, locale31);
        int int34 = dateTimeZone27.getOffset((long) 115200000);
        long long36 = dateTimeZone22.getMillisKeepLocal(dateTimeZone27, (long) (short) 0);
        boolean boolean38 = dateTimeZone22.isStandardOffset(359999999L);
        long long41 = dateTimeZone22.adjustOffset((-359999990L), false);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.UTC;
        boolean boolean43 = dateTimeZone42.isFixed();
        org.joda.time.LocalDateTime localDateTime44 = null;
        boolean boolean45 = dateTimeZone42.isLocalDateTimeGap(localDateTime44);
        org.joda.time.ReadableInstant readableInstant46 = null;
        int int47 = dateTimeZone42.getOffset(readableInstant46);
        boolean boolean48 = dateTimeZone42.isFixed();
        boolean boolean49 = dateTimeZone22.equals((java.lang.Object) dateTimeZone42);
        int int51 = dateTimeZone22.getOffsetFromLocal((long) (byte) 100);
        boolean boolean52 = dateTimeZone0.equals((java.lang.Object) dateTimeZone22);
        java.lang.String str54 = dateTimeZone22.getNameKey(10L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115200000L) + "'", long14 == (-115200000L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTC" + "'", str25, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+32:00" + "'", str29, "+32:00");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+32:00" + "'", str32, "+32:00");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 115200000 + "'", int34 == 115200000);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-115200000L) + "'", long36 == (-115200000L));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-359999990L) + "'", long41 == (-359999990L));
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "UTC" + "'", str54, "UTC");
    }

    @Test
    public void test00973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00973");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        java.lang.String str3 = dateTimeZone0.getShortName((long) (byte) 100);
        java.lang.String str5 = dateTimeZone0.getShortName((long) (-1));
        java.lang.String str7 = dateTimeZone0.getName((long) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        boolean boolean9 = dateTimeZone8.isFixed();
        int int11 = dateTimeZone8.getStandardOffset(0L);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone8.getShortName((-1L), locale13);
        java.lang.String str16 = dateTimeZone8.getShortName(1L);
        long long18 = dateTimeZone8.nextTransition((long) 0);
        long long20 = dateTimeZone8.nextTransition((long) (short) -1);
        long long22 = dateTimeZone0.getMillisKeepLocal(dateTimeZone8, (-7200000L));
        long long25 = dateTimeZone0.adjustOffset(108480000L, false);
        java.lang.String str26 = dateTimeZone0.getID();
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone0.getName((long) (byte) -1, locale28);
        org.joda.time.ReadableInstant readableInstant30 = null;
        int int31 = dateTimeZone0.getOffset(readableInstant30);
        java.util.Locale locale33 = null;
        java.lang.String str34 = dateTimeZone0.getShortName((-604859989L), locale33);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-7200000L) + "'", long22 == (-7200000L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 108480000L + "'", long25 == 108480000L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTC" + "'", str26, "UTC");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00" + "'", str29, "+00:00");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00" + "'", str34, "+00:00");
    }

    @Test
    public void test00974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00974");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        boolean boolean2 = dateTimeZone0.isFixed();
        long long6 = dateTimeZone0.convertLocalToUTC(1L, true, (long) (byte) 10);
        int int8 = dateTimeZone0.getStandardOffset((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone0.isLocalDateTimeGap(localDateTime9);
        java.lang.String str11 = dateTimeZone0.getID();
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone0.getOffset(readableInstant12);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00975");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(5700000, 349800000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 349800000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00976");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(349200000, (-3600000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -3600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00977");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(36600000, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00978");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        boolean boolean8 = dateTimeZone6.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone9 = dateTimeZone6.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.String str12 = dateTimeZone10.getNameKey((long) (short) 10);
        java.lang.String str14 = dateTimeZone10.getName((long) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        boolean boolean16 = dateTimeZone15.isFixed();
        int int18 = dateTimeZone15.getStandardOffset(0L);
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone15.getShortName((-1L), locale20);
        java.lang.String str23 = dateTimeZone15.getShortName(1L);
        long long25 = dateTimeZone10.getMillisKeepLocal(dateTimeZone15, (long) (-1));
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone10.getName(0L, locale27);
        long long30 = dateTimeZone5.getMillisKeepLocal(dateTimeZone10, 1L);
        java.util.Locale locale32 = null;
        java.lang.String str33 = dateTimeZone10.getName((long) '4', locale32);
        boolean boolean34 = dateTimeZone10.isFixed();
        boolean boolean35 = dateTimeZone10.isFixed();
        long long37 = dateTimeZone10.nextTransition((-232500001L));
        org.joda.time.ReadableInstant readableInstant38 = null;
        int int39 = dateTimeZone10.getOffset(readableInstant38);
        long long42 = dateTimeZone10.convertLocalToUTC(464399991L, true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00" + "'", str28, "+00:00");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00" + "'", str33, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-232500001L) + "'", long37 == (-232500001L));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 464399991L + "'", long42 == 464399991L);
    }

    @Test
    public void test00979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00979");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(349800000, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00980");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        int int4 = dateTimeZone0.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        boolean boolean6 = dateTimeZone5.isFixed();
        int int8 = dateTimeZone5.getStandardOffset(0L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone5.getShortName((-1L), locale10);
        int int13 = dateTimeZone5.getOffsetFromLocal(0L);
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) 115200000);
        java.lang.String str17 = dateTimeZone0.getShortName((long) '4');
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = dateTimeZone0.isLocalDateTimeGap(localDateTime18);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone20.getOffset(readableInstant21);
        int int24 = dateTimeZone20.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        boolean boolean26 = dateTimeZone25.isFixed();
        int int28 = dateTimeZone25.getStandardOffset(0L);
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone25.getShortName((-1L), locale30);
        int int33 = dateTimeZone25.getOffsetFromLocal(0L);
        long long35 = dateTimeZone20.getMillisKeepLocal(dateTimeZone25, (long) 115200000);
        org.joda.time.ReadableInstant readableInstant36 = null;
        int int37 = dateTimeZone25.getOffset(readableInstant36);
        boolean boolean38 = dateTimeZone0.equals((java.lang.Object) dateTimeZone25);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00" + "'", str31, "+00:00");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 115200000L + "'", long35 == 115200000L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test00981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00981");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        int int8 = dateTimeZone0.getOffsetFromLocal(0L);
        java.lang.String str10 = dateTimeZone0.getShortName(0L);
        long long14 = dateTimeZone0.convertLocalToUTC((long) (byte) 0, false, 0L);
        long long17 = dateTimeZone0.convertLocalToUTC((long) (short) 10, true);
        java.lang.String str18 = dateTimeZone0.getID();
        java.lang.String str19 = dateTimeZone0.toString();
        long long22 = dateTimeZone0.adjustOffset((long) (byte) 1, false);
        java.util.TimeZone timeZone23 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone24.getShortName(151200000L, locale26);
        java.lang.String str28 = dateTimeZone24.getID();
        java.lang.String str29 = dateTimeZone24.toString();
        java.util.TimeZone timeZone30 = dateTimeZone24.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        boolean boolean33 = dateTimeZone31.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone34 = dateTimeZone31.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.UTC;
        boolean boolean37 = dateTimeZone36.isFixed();
        int int39 = dateTimeZone36.getStandardOffset(0L);
        java.util.Locale locale41 = null;
        java.lang.String str42 = dateTimeZone36.getShortName((-1L), locale41);
        int int44 = dateTimeZone36.getOffsetFromLocal(0L);
        int int46 = dateTimeZone36.getStandardOffset((long) (byte) 10);
        long long48 = dateTimeZone36.nextTransition((long) 115200000);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant50 = null;
        int int51 = dateTimeZone49.getOffset(readableInstant50);
        int int53 = dateTimeZone49.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.UTC;
        boolean boolean55 = dateTimeZone54.isFixed();
        int int57 = dateTimeZone54.getStandardOffset(0L);
        java.util.Locale locale59 = null;
        java.lang.String str60 = dateTimeZone54.getShortName((-1L), locale59);
        int int62 = dateTimeZone54.getOffsetFromLocal(0L);
        long long64 = dateTimeZone49.getMillisKeepLocal(dateTimeZone54, (long) 115200000);
        boolean boolean66 = dateTimeZone49.isStandardOffset(115200000L);
        long long69 = dateTimeZone49.convertLocalToUTC((long) 10, true);
        java.lang.String str70 = dateTimeZone49.toString();
        int int72 = dateTimeZone49.getOffset(52L);
        org.joda.time.ReadableInstant readableInstant73 = null;
        int int74 = dateTimeZone49.getOffset(readableInstant73);
        int int76 = dateTimeZone49.getStandardOffset(97L);
        java.lang.String str78 = dateTimeZone49.getName(100L);
        int int80 = dateTimeZone49.getOffset((long) 100);
        boolean boolean81 = dateTimeZone36.equals((java.lang.Object) int80);
        boolean boolean82 = dateTimeZone35.equals((java.lang.Object) dateTimeZone36);
        org.joda.time.DateTimeZone dateTimeZone83 = org.joda.time.DateTimeZone.UTC;
        boolean boolean85 = dateTimeZone83.equals((java.lang.Object) 100);
        int int87 = dateTimeZone83.getStandardOffset((long) ' ');
        long long89 = dateTimeZone83.convertUTCToLocal((long) 'a');
        long long92 = dateTimeZone83.convertLocalToUTC(127920000L, true);
        long long94 = dateTimeZone36.getMillisKeepLocal(dateTimeZone83, (-7260001L));
        java.lang.String str96 = dateTimeZone83.getShortName(108480000L);
        long long98 = dateTimeZone24.getMillisKeepLocal(dateTimeZone83, 8640152L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UTC" + "'", str28, "UTC");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UTC" + "'", str29, "UTC");
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00" + "'", str42, "+00:00");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 115200000L + "'", long48 == 115200000L);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "+00:00" + "'", str60, "+00:00");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 115200000L + "'", long64 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 10L + "'", long69 == 10L);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "UTC" + "'", str70, "UTC");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "+00:00" + "'", str78, "+00:00");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(dateTimeZone83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + 97L + "'", long89 == 97L);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 127920000L + "'", long92 == 127920000L);
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + (-7260001L) + "'", long94 == (-7260001L));
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "+00:00" + "'", str96, "+00:00");
        org.junit.Assert.assertTrue("'" + long98 + "' != '" + 8640152L + "'", long98 == 8640152L);
    }

    @Test
    public void test00982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00982");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        java.lang.String str3 = dateTimeZone1.getShortName((long) 'a');
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((long) (short) -1, locale5);
        int int8 = dateTimeZone1.getOffset((long) 115200000);
        int int10 = dateTimeZone1.getStandardOffset((long) (short) 10);
        int int12 = dateTimeZone1.getStandardOffset((-1L));
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone1.getName((long) 187200000, locale14);
        java.lang.String str16 = dateTimeZone1.getID();
        java.lang.String str17 = dateTimeZone1.toString();
        java.util.TimeZone timeZone18 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+32:00" + "'", str3, "+32:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:00" + "'", str6, "+32:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 115200000 + "'", int8 == 115200000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 115200000 + "'", int10 == 115200000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 115200000 + "'", int12 == 115200000);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:00" + "'", str15, "+32:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:00" + "'", str16, "+32:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+32:00" + "'", str17, "+32:00");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test00983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00983");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        int int4 = dateTimeZone0.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        boolean boolean6 = dateTimeZone5.isFixed();
        int int8 = dateTimeZone5.getStandardOffset(0L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone5.getShortName((-1L), locale10);
        int int13 = dateTimeZone5.getOffsetFromLocal(0L);
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) 115200000);
        boolean boolean17 = dateTimeZone0.isStandardOffset(115200000L);
        long long20 = dateTimeZone0.convertLocalToUTC((long) 10, true);
        java.lang.String str21 = dateTimeZone0.toString();
        int int23 = dateTimeZone0.getOffset(52L);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone0.getOffset(readableInstant24);
        int int27 = dateTimeZone0.getStandardOffset(97L);
        java.lang.String str29 = dateTimeZone0.getName(100L);
        int int31 = dateTimeZone0.getOffset((long) 100);
        boolean boolean32 = dateTimeZone0.isFixed();
        long long35 = dateTimeZone0.convertLocalToUTC(127920000L, false);
        java.lang.String str36 = dateTimeZone0.getID();
        java.lang.String str37 = dateTimeZone0.toString();
        java.lang.Class<?> wildcardClass38 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00" + "'", str29, "+00:00");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 127920000L + "'", long35 == 127920000L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UTC" + "'", str36, "UTC");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "UTC" + "'", str37, "UTC");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test00984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00984");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale2 = null;
        java.lang.String str3 = dateTimeZone0.getShortName((long) 115200000, locale2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone0.getOffset(readableInstant4);
        int int7 = dateTimeZone0.getOffsetFromLocal((long) 10);
        long long10 = dateTimeZone0.adjustOffset(111600000L, true);
        java.lang.String str11 = dateTimeZone0.getID();
        java.lang.Class<?> wildcardClass12 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 111600000L + "'", long10 == 111600000L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00985");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) ' ', locale3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        boolean boolean6 = dateTimeZone5.isFixed();
        int int8 = dateTimeZone5.getStandardOffset(0L);
        java.lang.String str10 = dateTimeZone5.getNameKey(1L);
        java.lang.String str12 = dateTimeZone5.getShortName((long) 100);
        long long15 = dateTimeZone5.adjustOffset((long) (short) 100, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        long long18 = dateTimeZone5.nextTransition((-115200001L));
        boolean boolean19 = dateTimeZone1.equals((java.lang.Object) (-115200001L));
        org.joda.time.ReadableInstant readableInstant20 = null;
        int int21 = dateTimeZone1.getOffset(readableInstant20);
        java.lang.String str22 = dateTimeZone1.toString();
        long long24 = dateTimeZone1.nextTransition(152L);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone1.getName(1920000L, locale26);
        boolean boolean28 = dateTimeZone1.isFixed();
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone1.getShortName((long) 36000000, locale30);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-01:00" + "'", str4, "-01:00");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-115200001L) + "'", long18 == (-115200001L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3600000) + "'", int21 == (-3600000));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-01:00" + "'", str22, "-01:00");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 152L + "'", long24 == 152L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-01:00" + "'", str27, "-01:00");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-01:00" + "'", str31, "-01:00");
    }

    @Test
    public void test00986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00986");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((-1L), locale5);
        int int8 = dateTimeZone0.getOffsetFromLocal(0L);
        int int10 = dateTimeZone0.getStandardOffset((long) (byte) 10);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone0.isLocalDateTimeGap(localDateTime11);
        long long14 = dateTimeZone0.nextTransition(118800001L);
        int int16 = dateTimeZone0.getStandardOffset(97L);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone0.getName(0L, locale18);
        java.lang.String str21 = dateTimeZone0.getShortName(115200052L);
        java.lang.Class<?> wildcardClass22 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 118800001L + "'", long14 == 118800001L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00987");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getShortName((long) (byte) 100);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) 115200000, locale7);
        java.lang.String str10 = dateTimeZone0.getNameKey((long) 0);
        long long12 = dateTimeZone0.previousTransition((long) (short) 10);
        long long14 = dateTimeZone0.convertUTCToLocal(356460000L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        long long17 = dateTimeZone0.previousTransition((-39600000L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 356460000L + "'", long14 == 356460000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-39600000L) + "'", long17 == (-39600000L));
    }

    @Test
    public void test00988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00988");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        int int3 = dateTimeZone0.getStandardOffset(0L);
        java.lang.String str5 = dateTimeZone0.getShortName((long) (byte) 100);
        java.lang.String str7 = dateTimeZone0.getShortName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone0.getOffset(readableInstant8);
        boolean boolean11 = dateTimeZone0.isStandardOffset((long) (short) 1);
        int int13 = dateTimeZone0.getStandardOffset((-60001L));
        boolean boolean14 = dateTimeZone0.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00989");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        long long5 = dateTimeZone0.nextTransition(1L);
        java.lang.String str7 = dateTimeZone0.getNameKey((long) 115200000);
        long long11 = dateTimeZone0.convertLocalToUTC((-7260001L), false, 115200097L);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone0.getShortName(243120097L, locale13);
        java.lang.String str15 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-7260001L) + "'", long11 == (-7260001L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
    }

    @Test
    public void test00990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00990");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(39120000, 1920000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 1920000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00991");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone0.isLocalDateTimeGap(localDateTime2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone0.getOffset(readableInstant4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((-115199948L), locale7);
        java.lang.Class<?> wildcardClass9 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00992");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        int int4 = dateTimeZone0.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        boolean boolean6 = dateTimeZone5.isFixed();
        int int8 = dateTimeZone5.getStandardOffset(0L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone5.getShortName((-1L), locale10);
        int int13 = dateTimeZone5.getOffsetFromLocal(0L);
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) 115200000);
        boolean boolean17 = dateTimeZone0.isStandardOffset(115200000L);
        long long20 = dateTimeZone0.convertLocalToUTC((long) 10, true);
        java.lang.String str21 = dateTimeZone0.toString();
        int int23 = dateTimeZone0.getOffset(52L);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone0.getOffset(readableInstant24);
        boolean boolean27 = dateTimeZone0.isStandardOffset((long) 349200000);
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeZone0.getName(547199998L, locale29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        int int32 = dateTimeZone0.getOffset(readableInstant31);
        java.util.Locale locale34 = null;
        java.lang.String str35 = dateTimeZone0.getShortName((-115199965L), locale34);
        boolean boolean36 = dateTimeZone0.isFixed();
        boolean boolean38 = dateTimeZone0.isStandardOffset(599999L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00" + "'", str30, "+00:00");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00" + "'", str35, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test00993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00993");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        int int4 = dateTimeZone0.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        boolean boolean6 = dateTimeZone5.isFixed();
        int int8 = dateTimeZone5.getStandardOffset(0L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone5.getShortName((-1L), locale10);
        int int13 = dateTimeZone5.getOffsetFromLocal(0L);
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) 115200000);
        boolean boolean17 = dateTimeZone0.isStandardOffset(115200000L);
        long long20 = dateTimeZone0.convertLocalToUTC((long) 10, true);
        java.lang.String str21 = dateTimeZone0.toString();
        int int23 = dateTimeZone0.getOffset(52L);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone0.getOffset(readableInstant24);
        int int27 = dateTimeZone0.getStandardOffset(97L);
        java.lang.String str29 = dateTimeZone0.getName(100L);
        int int31 = dateTimeZone0.getOffset((long) 100);
        boolean boolean32 = dateTimeZone0.isFixed();
        long long35 = dateTimeZone0.convertLocalToUTC(127920000L, false);
        java.lang.String str36 = dateTimeZone0.getID();
        java.lang.String str37 = dateTimeZone0.toString();
        long long39 = dateTimeZone0.convertUTCToLocal(464399991L);
        java.lang.String str41 = dateTimeZone0.getNameKey((-148199900L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00" + "'", str29, "+00:00");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 127920000L + "'", long35 == 127920000L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UTC" + "'", str36, "UTC");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "UTC" + "'", str37, "UTC");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 464399991L + "'", long39 == 464399991L);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "UTC" + "'", str41, "UTC");
    }

    @Test
    public void test00994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00994");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((-178080000L), locale3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
    }

    @Test
    public void test00995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00995");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        java.lang.String str3 = dateTimeZone0.getShortName((long) (byte) 100);
        java.lang.String str5 = dateTimeZone0.getShortName((long) (-1));
        java.lang.String str7 = dateTimeZone0.getName((long) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        boolean boolean9 = dateTimeZone8.isFixed();
        int int11 = dateTimeZone8.getStandardOffset(0L);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone8.getShortName((-1L), locale13);
        java.lang.String str16 = dateTimeZone8.getShortName(1L);
        long long18 = dateTimeZone8.nextTransition((long) 0);
        long long20 = dateTimeZone8.nextTransition((long) (short) -1);
        long long22 = dateTimeZone0.getMillisKeepLocal(dateTimeZone8, (-7200000L));
        long long25 = dateTimeZone0.adjustOffset(108480000L, false);
        java.lang.String str26 = dateTimeZone0.getID();
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone0.getName((long) (byte) -1, locale28);
        org.joda.time.ReadableInstant readableInstant30 = null;
        int int31 = dateTimeZone0.getOffset(readableInstant30);
        boolean boolean33 = dateTimeZone0.isStandardOffset(952319997L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-7200000L) + "'", long22 == (-7200000L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 108480000L + "'", long25 == 108480000L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTC" + "'", str26, "UTC");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00" + "'", str29, "+00:00");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test00996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00996");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, 126060000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 126060000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00997");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        boolean boolean5 = dateTimeZone0.isStandardOffset(100L);
        java.lang.String str6 = dateTimeZone0.getID();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone7.getOffset(readableInstant8);
        int int11 = dateTimeZone7.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        boolean boolean13 = dateTimeZone12.isFixed();
        int int15 = dateTimeZone12.getStandardOffset(0L);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone12.getShortName((-1L), locale17);
        int int20 = dateTimeZone12.getOffsetFromLocal(0L);
        long long22 = dateTimeZone7.getMillisKeepLocal(dateTimeZone12, (long) 115200000);
        boolean boolean24 = dateTimeZone7.isStandardOffset(115200000L);
        long long27 = dateTimeZone7.convertLocalToUTC((long) 10, true);
        java.lang.String str28 = dateTimeZone7.toString();
        int int30 = dateTimeZone7.getOffset(52L);
        java.lang.String str32 = dateTimeZone7.getNameKey(0L);
        long long34 = dateTimeZone0.getMillisKeepLocal(dateTimeZone7, 35L);
        java.lang.String str35 = dateTimeZone0.getID();
        long long37 = dateTimeZone0.convertUTCToLocal(3600000L);
        long long39 = dateTimeZone0.nextTransition((-349199903L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 115200000L + "'", long22 == 115200000L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L + "'", long27 == 10L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UTC" + "'", str28, "UTC");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "UTC" + "'", str32, "UTC");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 35L + "'", long34 == 35L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "UTC" + "'", str35, "UTC");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 3600000L + "'", long37 == 3600000L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-349199903L) + "'", long39 == (-349199903L));
    }

    @Test
    public void test00998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00998");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone5.getOffset(readableInstant6);
        int int9 = dateTimeZone5.getStandardOffset(1L);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        boolean boolean11 = dateTimeZone10.isFixed();
        int int13 = dateTimeZone10.getStandardOffset(0L);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone10.getShortName((-1L), locale15);
        int int18 = dateTimeZone10.getOffsetFromLocal(0L);
        long long20 = dateTimeZone5.getMillisKeepLocal(dateTimeZone10, (long) 115200000);
        java.lang.String str22 = dateTimeZone5.getShortName((long) '4');
        boolean boolean23 = dateTimeZone4.equals((java.lang.Object) dateTimeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        long long28 = dateTimeZone5.convertLocalToUTC(1L, false, (-306000000L));
        long long31 = dateTimeZone5.convertLocalToUTC((-65L), false);
        boolean boolean33 = dateTimeZone5.isStandardOffset(10L);
        long long37 = dateTimeZone5.convertLocalToUTC(115200010L, false, 172799991L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 115200000L + "'", long20 == 115200000L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-65L) + "'", long31 == (-65L));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 115200010L + "'", long37 == 115200010L);
    }

    @Test
    public void test00999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00999");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean1 = dateTimeZone0.isFixed();
        java.lang.String str3 = dateTimeZone0.getShortName((long) (byte) 100);
        int int5 = dateTimeZone0.getOffset(359999999L);
        int int7 = dateTimeZone0.getStandardOffset(363600000L);
        java.lang.String str9 = dateTimeZone0.getName((-10L));
        java.lang.String str11 = dateTimeZone0.getShortName(115200097L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
    }

    @Test
    public void test01000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test01000");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) -1);
        long long6 = dateTimeZone1.convertLocalToUTC(52L, false);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        int int9 = dateTimeZone1.getOffsetFromLocal(32L);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        boolean boolean12 = dateTimeZone10.equals((java.lang.Object) 100);
        java.util.TimeZone timeZone13 = dateTimeZone10.toTimeZone();
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone10.getShortName(0L, locale15);
        java.lang.String str17 = dateTimeZone10.getID();
        long long20 = dateTimeZone10.convertLocalToUTC(100L, true);
        long long23 = dateTimeZone10.convertLocalToUTC((-1L), false);
        long long25 = dateTimeZone1.getMillisKeepLocal(dateTimeZone10, 118800001L);
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone1.getShortName((long) (short) -1, locale27);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        long long31 = dateTimeZone29.convertUTCToLocal((long) (byte) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone29);
        java.util.Locale locale34 = null;
        java.lang.String str35 = dateTimeZone29.getName((long) (byte) 0, locale34);
        java.lang.String str37 = dateTimeZone29.getNameKey(115200001L);
        java.util.Locale locale39 = null;
        java.lang.String str40 = dateTimeZone29.getShortName(359999999L, locale39);
        long long42 = dateTimeZone1.getMillisKeepLocal(dateTimeZone29, (-65L));
        org.joda.time.ReadableInstant readableInstant43 = null;
        int int44 = dateTimeZone1.getOffset(readableInstant43);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 118800001L + "'", long25 == 118800001L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00" + "'", str28, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00" + "'", str35, "+00:00");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "UTC" + "'", str37, "UTC");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00" + "'", str40, "+00:00");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-65L) + "'", long42 == (-65L));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }
}
