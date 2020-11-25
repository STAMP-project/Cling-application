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
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long15 = fixedDateTimeZone4.convertLocalToUTC(349200010L, true);
        java.util.TimeZone timeZone16 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str18 = fixedDateTimeZone4.getNameKey((-702060001L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 349199910L + "'", long15 == 349199910L);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+97:00" + "'", str18, "+97:00");
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long9 = fixedDateTimeZone4.convertLocalToUTC(349199934L, false);
        java.lang.String str11 = fixedDateTimeZone4.getShortName((long) (byte) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 349199834L + "'", long9 == 349199834L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long17 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, (long) ' ');
        boolean boolean18 = fixedDateTimeZone15.isFixed();
        long long21 = fixedDateTimeZone15.convertLocalToUTC((-349199999L), false);
        boolean boolean23 = fixedDateTimeZone15.isStandardOffset(52L);
        java.lang.String str24 = fixedDateTimeZone15.getID();
        java.lang.String str26 = fixedDateTimeZone15.getShortName((-349200096L));
        java.lang.String str28 = fixedDateTimeZone15.getName((-349200301L));
        java.lang.String str29 = fixedDateTimeZone15.toString();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone15);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-349200096L) + "'", long21 == (-349200096L));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.097" + "'", str26, "+00:00:00.097");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.097" + "'", str28, "+00:00:00.097");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00:00.100" + "'", str29, "+00:00:00.100");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        int int12 = fixedDateTimeZone4.getStandardOffset(1L);
        long long14 = fixedDateTimeZone4.previousTransition((long) 10);
        java.lang.String str15 = fixedDateTimeZone4.toString();
        long long17 = fixedDateTimeZone4.convertUTCToLocal(4199899L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone22 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str24 = fixedDateTimeZone22.getNameKey((long) 1);
        boolean boolean25 = fixedDateTimeZone22.isFixed();
        java.lang.String str27 = fixedDateTimeZone22.getNameKey((-349199901L));
        long long29 = fixedDateTimeZone22.nextTransition((-68L));
        org.joda.time.ReadableInstant readableInstant30 = null;
        int int31 = fixedDateTimeZone22.getOffset(readableInstant30);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone36 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long38 = fixedDateTimeZone36.previousTransition((long) ' ');
        long long40 = fixedDateTimeZone36.previousTransition((long) 'a');
        long long42 = fixedDateTimeZone36.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone47 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long49 = fixedDateTimeZone36.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone47, (long) ' ');
        boolean boolean50 = fixedDateTimeZone47.isFixed();
        long long53 = fixedDateTimeZone47.convertLocalToUTC((-349199999L), false);
        boolean boolean54 = fixedDateTimeZone22.equals((java.lang.Object) fixedDateTimeZone47);
        java.util.Locale locale56 = null;
        java.lang.String str57 = fixedDateTimeZone47.getName((-349200036L), locale56);
        boolean boolean59 = fixedDateTimeZone47.isStandardOffset((-698400201L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone64 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str66 = fixedDateTimeZone64.getNameKey((long) 1);
        long long69 = fixedDateTimeZone64.convertLocalToUTC((-101L), true);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone74 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str76 = fixedDateTimeZone74.getNameKey((long) 1);
        long long78 = fixedDateTimeZone74.nextTransition((long) (short) 100);
        java.lang.String str80 = fixedDateTimeZone74.getNameKey(97L);
        java.lang.String str82 = fixedDateTimeZone74.getNameKey(349200010L);
        boolean boolean83 = fixedDateTimeZone74.isFixed();
        java.lang.String str85 = fixedDateTimeZone74.getName((long) 'a');
        boolean boolean86 = fixedDateTimeZone64.equals((java.lang.Object) fixedDateTimeZone74);
        int int88 = fixedDateTimeZone64.getOffset((-62L));
        long long90 = fixedDateTimeZone47.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone64, 35L);
        int int92 = fixedDateTimeZone47.getOffsetFromLocal(49L);
        long long94 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone47, 136L);
        java.util.TimeZone timeZone95 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 4199999L + "'", long17 == 4199999L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+97:00" + "'", str24, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+97:00" + "'", str27, "+97:00");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-68L) + "'", long29 == (-68L));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 32L + "'", long38 == 32L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 97L + "'", long40 == 97L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 349200000L + "'", long42 == 349200000L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 35L + "'", long49 == 35L);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-349200096L) + "'", long53 == (-349200096L));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "+00:00:00.097" + "'", str57, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "+97:00" + "'", str66, "+97:00");
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + (-201L) + "'", long69 == (-201L));
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "+97:00" + "'", str76, "+97:00");
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 100L + "'", long78 == 100L);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "+97:00" + "'", str80, "+97:00");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "+97:00" + "'", str82, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "+00:00:00.100" + "'", str85, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 100 + "'", int88 == 100);
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 32L + "'", long90 == 32L);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 97 + "'", int92 == 97);
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 139L + "'", long94 == 139L);
        org.junit.Assert.assertNotNull(timeZone95);
        org.junit.Assert.assertEquals(timeZone95.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        long long9 = fixedDateTimeZone4.previousTransition((long) '4');
        long long12 = fixedDateTimeZone4.convertLocalToUTC((-349199936L), false);
        java.lang.String str13 = fixedDateTimeZone4.getID();
        int int15 = fixedDateTimeZone4.getOffset(0L);
        java.lang.String str17 = fixedDateTimeZone4.getNameKey((-349200065L));
        int int19 = fixedDateTimeZone4.getOffset(235L);
        java.lang.String str21 = fixedDateTimeZone4.getShortName(349200100L);
        java.lang.String str23 = fixedDateTimeZone4.getShortName((long) '#');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349200036L) + "'", long12 == (-349200036L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.100" + "'", str21, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.100" + "'", str23, "+00:00:00.100");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(115200000, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.097", "+00:00:00.100", (int) (short) 100, 10);
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        long long8 = fixedDateTimeZone4.adjustOffset(59901L, false);
        long long11 = fixedDateTimeZone4.adjustOffset((-349200187L), false);
        boolean boolean12 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 59901L + "'", long8 == 59901L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349200187L) + "'", long11 == (-349200187L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        java.lang.String str9 = fixedDateTimeZone4.getNameKey((-349199901L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone14 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str16 = fixedDateTimeZone14.getNameKey(0L);
        java.util.Locale locale18 = null;
        java.lang.String str19 = fixedDateTimeZone14.getShortName(31L, locale18);
        long long21 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone14, (long) 0);
        boolean boolean22 = fixedDateTimeZone4.isFixed();
        boolean boolean23 = fixedDateTimeZone4.isFixed();
        org.joda.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime24);
        boolean boolean27 = fixedDateTimeZone4.equals((java.lang.Object) (-349199901L));
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        long long12 = fixedDateTimeZone4.previousTransition((-349199990L));
        java.lang.String str13 = fixedDateTimeZone4.getID();
        java.lang.String str15 = fixedDateTimeZone4.getShortName((-349199890L));
        long long18 = fixedDateTimeZone4.convertLocalToUTC(349199903L, true);
        boolean boolean19 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349199990L) + "'", long12 == (-349199990L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 349199803L + "'", long18 == 349199803L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(97L);
        java.lang.String str12 = fixedDateTimeZone4.getNameKey(349200010L);
        boolean boolean13 = fixedDateTimeZone4.isFixed();
        java.lang.String str15 = fixedDateTimeZone4.getNameKey((long) 0);
        boolean boolean17 = fixedDateTimeZone4.isStandardOffset((-349199968L));
        java.lang.String str19 = fixedDateTimeZone4.getShortName((long) 1);
        long long21 = fixedDateTimeZone4.previousTransition((-125999903L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone26 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str28 = fixedDateTimeZone26.getNameKey((long) 1);
        boolean boolean29 = fixedDateTimeZone26.isFixed();
        java.lang.String str31 = fixedDateTimeZone26.getNameKey((-349199901L));
        long long33 = fixedDateTimeZone26.nextTransition((-68L));
        long long36 = fixedDateTimeZone26.adjustOffset(31L, false);
        boolean boolean37 = fixedDateTimeZone4.equals((java.lang.Object) false);
        java.lang.Class<?> wildcardClass38 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-125999903L) + "'", long21 == (-125999903L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+97:00" + "'", str28, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+97:00" + "'", str31, "+97:00");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-68L) + "'", long33 == (-68L));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 31L + "'", long36 == 31L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        java.lang.String str9 = fixedDateTimeZone4.getNameKey((-349199901L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone14 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str16 = fixedDateTimeZone14.getNameKey(0L);
        java.util.Locale locale18 = null;
        java.lang.String str19 = fixedDateTimeZone14.getShortName(31L, locale18);
        long long21 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone14, (long) 0);
        java.lang.Object obj22 = null;
        boolean boolean23 = fixedDateTimeZone14.equals(obj22);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long15 = fixedDateTimeZone4.convertLocalToUTC(349200010L, true);
        java.util.TimeZone timeZone16 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str18 = fixedDateTimeZone4.getNameKey((-348599865L));
        long long21 = fixedDateTimeZone4.adjustOffset((-199L), false);
        long long23 = fixedDateTimeZone4.convertUTCToLocal((long) 32);
        java.lang.String str25 = fixedDateTimeZone4.getNameKey((-115200000L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 349199910L + "'", long15 == 349199910L);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+97:00" + "'", str18, "+97:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-199L) + "'", long21 == (-199L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 132L + "'", long23 == 132L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+97:00" + "'", str25, "+97:00");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long17 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, (long) ' ');
        boolean boolean18 = fixedDateTimeZone15.isFixed();
        long long21 = fixedDateTimeZone15.convertLocalToUTC((-349199999L), false);
        java.lang.Object obj22 = null;
        boolean boolean23 = fixedDateTimeZone15.equals(obj22);
        int int25 = fixedDateTimeZone15.getOffset((long) ' ');
        java.lang.Class<?> wildcardClass26 = fixedDateTimeZone15.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-349200096L) + "'", long21 == (-349200096L));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.util.TimeZone timeZone12 = fixedDateTimeZone4.toTimeZone();
        long long16 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) 100, false, 32L);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime17);
        java.util.Locale locale20 = null;
        java.lang.String str21 = fixedDateTimeZone4.getName(132L, locale20);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone26 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str28 = fixedDateTimeZone26.getNameKey((long) 1);
        boolean boolean29 = fixedDateTimeZone26.isFixed();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone26);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone35 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str37 = fixedDateTimeZone35.getNameKey((long) 1);
        long long39 = fixedDateTimeZone35.nextTransition((long) (short) 100);
        java.lang.String str41 = fixedDateTimeZone35.getNameKey(97L);
        java.lang.String str43 = fixedDateTimeZone35.getNameKey(349200010L);
        boolean boolean44 = fixedDateTimeZone35.isFixed();
        java.lang.String str46 = fixedDateTimeZone35.getShortName((long) '4');
        int int48 = fixedDateTimeZone35.getOffsetFromLocal((-349199999L));
        long long50 = fixedDateTimeZone26.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone35, (-349199990L));
        long long52 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone35, (long) 349200000);
        int int54 = fixedDateTimeZone4.getOffset(698399932L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone59 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str61 = fixedDateTimeZone59.getNameKey(0L);
        long long65 = fixedDateTimeZone59.convertLocalToUTC((-349199865L), false, (-349199900L));
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone59);
        long long68 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone59, 349199834L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.100" + "'", str21, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+97:00" + "'", str28, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+97:00" + "'", str37, "+97:00");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 100L + "'", long39 == 100L);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+97:00" + "'", str41, "+97:00");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+97:00" + "'", str43, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00:00.100" + "'", str46, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-349199990L) + "'", long50 == (-349199990L));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 349200000L + "'", long52 == 349200000L);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 100 + "'", int54 == 100);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "+97:00" + "'", str61, "+97:00");
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + (-349199965L) + "'", long65 == (-349199965L));
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 349199834L + "'", long68 == 349199834L);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(97L);
        java.lang.String str12 = fixedDateTimeZone4.getNameKey(349200010L);
        boolean boolean13 = fixedDateTimeZone4.isFixed();
        java.lang.String str15 = fixedDateTimeZone4.getNameKey((long) 0);
        int int17 = fixedDateTimeZone4.getStandardOffset((long) (short) 10);
        java.util.Locale locale19 = null;
        java.lang.String str20 = fixedDateTimeZone4.getShortName((long) 0, locale19);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone25 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long27 = fixedDateTimeZone25.previousTransition((long) ' ');
        long long29 = fixedDateTimeZone25.previousTransition((long) 'a');
        long long31 = fixedDateTimeZone25.previousTransition(349200000L);
        int int33 = fixedDateTimeZone25.getOffset((long) '4');
        int int35 = fixedDateTimeZone25.getOffset((long) (short) 100);
        org.joda.time.LocalDateTime localDateTime36 = null;
        boolean boolean37 = fixedDateTimeZone25.isLocalDateTimeGap(localDateTime36);
        java.lang.String str39 = fixedDateTimeZone25.getName((-698399900L));
        org.joda.time.ReadableInstant readableInstant40 = null;
        int int41 = fixedDateTimeZone25.getOffset(readableInstant40);
        int int43 = fixedDateTimeZone25.getStandardOffset((long) 115200000);
        long long45 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone25, (-699000036L));
        long long48 = fixedDateTimeZone4.convertLocalToUTC((-43L), true);
        java.lang.String str50 = fixedDateTimeZone4.getShortName((-349259990L));
        int int52 = fixedDateTimeZone4.getOffsetFromLocal((-349200164L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32L + "'", long27 == 32L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 97L + "'", long29 == 97L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 349200000L + "'", long31 == 349200000L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00:00.100" + "'", str39, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-699000036L) + "'", long45 == (-699000036L));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-143L) + "'", long48 == (-143L));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+00:00:00.100" + "'", str50, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+32:00", "-00:00:00.001", (int) (byte) 0, 32);
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long4 = dateTimeZone0.convertLocalToUTC((-349200001L), false, (long) (byte) 100);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone9 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.util.TimeZone timeZone10 = fixedDateTimeZone9.toTimeZone();
        long long14 = fixedDateTimeZone9.convertLocalToUTC((long) ' ', true, (long) (byte) 1);
        java.util.Locale locale16 = null;
        java.lang.String str17 = fixedDateTimeZone9.getShortName((long) (byte) 10, locale16);
        long long19 = fixedDateTimeZone9.previousTransition(698399932L);
        int int21 = fixedDateTimeZone9.getOffsetFromLocal((long) (-1));
        long long23 = fixedDateTimeZone9.nextTransition((-348599865L));
        long long25 = dateTimeZone0.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone9, (-349200064L));
        java.lang.String str26 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-349200101L) + "'", long4 == (-349200101L));
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-68L) + "'", long14 == (-68L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 698399932L + "'", long19 == 698399932L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-348599865L) + "'", long23 == (-348599865L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-349200064L) + "'", long25 == (-349200064L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+97:00" + "'", str26, "+97:00");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.nextTransition((-101L));
        int int8 = fixedDateTimeZone4.getStandardOffset((long) (byte) -1);
        int int10 = fixedDateTimeZone4.getOffsetFromLocal(10L);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((-349199868L), false);
        java.lang.String str15 = fixedDateTimeZone4.getNameKey((-349199999L));
        java.util.Locale locale17 = null;
        java.lang.String str18 = fixedDateTimeZone4.getName((long) 35, locale17);
        long long20 = fixedDateTimeZone4.previousTransition(0L);
        long long24 = fixedDateTimeZone4.convertLocalToUTC((-348599968L), false, 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-101L) + "'", long6 == (-101L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-349199968L) + "'", long13 == (-349199968L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.100" + "'", str18, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-348600068L) + "'", long24 == (-348600068L));
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        long long6 = dateTimeZone0.convertLocalToUTC((-349200100L), true, 100L);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone0.getShortName((long) 'a', locale8);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str17 = fixedDateTimeZone15.getNameKey(100L);
        int int19 = fixedDateTimeZone15.getStandardOffset((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        java.lang.String str23 = dateTimeZone21.getShortName((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        long long28 = dateTimeZone24.convertLocalToUTC((-349200001L), false, (long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str31 = dateTimeZone29.getShortName((long) (byte) 0);
        long long33 = dateTimeZone24.getMillisKeepLocal(dateTimeZone29, 0L);
        long long35 = dateTimeZone21.getMillisKeepLocal(dateTimeZone29, 100L);
        long long37 = fixedDateTimeZone15.getMillisKeepLocal(dateTimeZone21, (-349199948L));
        long long39 = dateTimeZone0.getMillisKeepLocal(dateTimeZone21, (-201L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone21);
        long long42 = dateTimeZone21.convertUTCToLocal((-349199935L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-349200100L) + "'", long6 == (-349200100L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+97:00" + "'", str23, "+97:00");
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-349200001L) + "'", long28 == (-349200001L));
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00" + "'", str31, "+00:00");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 349200100L + "'", long35 == 349200100L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-698399848L) + "'", long37 == (-698399848L));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-349200201L) + "'", long39 == (-349200201L));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 65L + "'", long42 == 65L);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(97L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str17 = fixedDateTimeZone15.getNameKey((long) 1);
        long long19 = fixedDateTimeZone15.nextTransition((long) (short) 100);
        java.lang.String str21 = fixedDateTimeZone15.getNameKey(97L);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone15);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone15);
        boolean boolean24 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone15);
        long long26 = fixedDateTimeZone15.nextTransition(698399935L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+97:00" + "'", str21, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 698399935L + "'", long26 == 698399935L);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        long long9 = fixedDateTimeZone4.convertLocalToUTC((long) ' ', true, (long) (byte) 1);
        java.util.Locale locale11 = null;
        java.lang.String str12 = fixedDateTimeZone4.getShortName((long) (byte) 10, locale11);
        boolean boolean14 = fixedDateTimeZone4.isStandardOffset((-349200003L));
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-68L) + "'", long9 == (-68L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.util.TimeZone timeZone8 = fixedDateTimeZone4.toTimeZone();
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((-349199868L));
        long long13 = fixedDateTimeZone4.convertLocalToUTC(100L, false);
        java.lang.String str15 = fixedDateTimeZone4.getNameKey(349200100L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone20 = new org.joda.time.tz.FixedDateTimeZone("+00:01", "+00:00:00.100", 0, 100);
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = fixedDateTimeZone20.isLocalDateTimeGap(localDateTime21);
        boolean boolean23 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone20);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "+10:35", 0, (int) '#');
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        long long8 = fixedDateTimeZone4.convertLocalToUTC(349200000L, true);
        long long11 = fixedDateTimeZone4.convertLocalToUTC(0L, false);
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getName(10L, locale13);
        java.lang.String str16 = fixedDateTimeZone4.getShortName(3L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 349200000L + "'", long8 == 349200000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone0.getMillisKeepLocal(dateTimeZone2, (long) ' ');
        long long7 = dateTimeZone2.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long10 = dateTimeZone2.convertUTCToLocal(0L);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone2.getOffset(readableInstant11);
        long long15 = dateTimeZone2.convertLocalToUTC((long) 0, false);
        java.lang.String str17 = dateTimeZone2.getName(0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-349199868L) + "'", long4 == (-349199868L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349200001L) + "'", long7 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 349200000 + "'", int12 == 349200000);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-349200000L) + "'", long15 == (-349200000L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone6 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long8 = fixedDateTimeZone6.nextTransition((-101L));
        int int10 = fixedDateTimeZone6.getStandardOffset((long) (byte) -1);
        long long12 = dateTimeZone1.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone6, (-349200001L));
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'a');
        boolean boolean15 = fixedDateTimeZone6.equals((java.lang.Object) 'a');
        int int17 = fixedDateTimeZone6.getStandardOffset(38L);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-101L) + "'", long8 == (-101L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349200101L) + "'", long12 == (-349200101L));
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone1.convertLocalToUTC((long) (byte) 1, false);
        java.lang.String str6 = dateTimeZone1.getShortName((long) ' ');
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.util.TimeZone timeZone14 = fixedDateTimeZone13.toTimeZone();
        long long18 = fixedDateTimeZone13.convertLocalToUTC((long) ' ', true, (long) (byte) 1);
        java.lang.String str19 = fixedDateTimeZone13.toString();
        long long22 = fixedDateTimeZone13.adjustOffset(132L, false);
        boolean boolean24 = fixedDateTimeZone13.isStandardOffset((-349199871L));
        long long26 = dateTimeZone1.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone13, (long) (short) 10);
        java.lang.String str27 = fixedDateTimeZone13.toString();
        org.joda.time.ReadableInstant readableInstant28 = null;
        int int29 = fixedDateTimeZone13.getOffset(readableInstant28);
        java.lang.String str31 = fixedDateTimeZone13.getName(115800000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-349199999L) + "'", long4 == (-349199999L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 349200000 + "'", int8 == 349200000);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-68L) + "'", long18 == (-68L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+97:00" + "'", str19, "+97:00");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 132L + "'", long22 == 132L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 349199910L + "'", long26 == 349199910L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+97:00" + "'", str27, "+97:00");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00:00.100" + "'", str31, "+00:00:00.100");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.nextTransition((long) 10);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long9 = fixedDateTimeZone4.convertUTCToLocal((-349199990L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone14 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        int int16 = fixedDateTimeZone14.getOffset(349200010L);
        boolean boolean17 = fixedDateTimeZone14.isFixed();
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = fixedDateTimeZone14.isLocalDateTimeGap(localDateTime18);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone24 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 100, (int) (byte) 10);
        int int26 = fixedDateTimeZone24.getOffsetFromLocal((long) (byte) 1);
        org.joda.time.ReadableInstant readableInstant27 = null;
        int int28 = fixedDateTimeZone24.getOffset(readableInstant27);
        long long31 = fixedDateTimeZone24.adjustOffset(0L, false);
        boolean boolean32 = fixedDateTimeZone14.equals((java.lang.Object) 0L);
        java.util.TimeZone timeZone33 = fixedDateTimeZone14.toTimeZone();
        long long35 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone14, (-106L));
        long long37 = fixedDateTimeZone4.nextTransition(3L);
        java.lang.String str39 = fixedDateTimeZone4.getName((-702060101L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-349199890L) + "'", long9 == (-349199890L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-103L) + "'", long35 == (-103L));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 3L + "'", long37 == 3L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00:00.100" + "'", str39, "+00:00:00.100");
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 100, (int) (byte) 10);
        int int6 = fixedDateTimeZone4.getOffsetFromLocal((long) (byte) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) 0);
        java.util.TimeZone timeZone9 = fixedDateTimeZone4.toTimeZone();
        boolean boolean11 = fixedDateTimeZone4.isStandardOffset(349199934L);
        boolean boolean12 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        boolean boolean6 = fixedDateTimeZone4.isStandardOffset((long) '#');
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        boolean boolean9 = fixedDateTimeZone4.isStandardOffset((-699000084L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "+00:00:00.010", 6720000, 0);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition((long) (short) 0);
        java.lang.String str11 = fixedDateTimeZone4.getID();
        long long15 = fixedDateTimeZone4.convertLocalToUTC((long) 97, false, (-349199871L));
        java.lang.String str17 = fixedDateTimeZone4.getName((long) 1);
        java.lang.String str19 = fixedDateTimeZone4.getShortName((-62L));
        java.util.Locale locale21 = null;
        java.lang.String str22 = fixedDateTimeZone4.getShortName((-349200048L), locale21);
        java.lang.String str23 = fixedDateTimeZone4.getID();
        java.util.TimeZone timeZone24 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+97:00" + "'", str11, "+97:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-3L) + "'", long15 == (-3L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.100" + "'", str22, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+97:00" + "'", str23, "+97:00");
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long9 = fixedDateTimeZone4.adjustOffset((long) (short) 100, false);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((-349200036L), false, (-48L));
        long long15 = fixedDateTimeZone4.nextTransition(97L);
        java.lang.String str17 = fixedDateTimeZone4.getNameKey(0L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone22 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        java.lang.String str24 = fixedDateTimeZone22.getName((-60001L));
        long long26 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone22, (-349199969L));
        boolean boolean28 = fixedDateTimeZone22.isStandardOffset((-698400201L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-349200136L) + "'", long13 == (-349200136L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.097" + "'", str24, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-349199966L) + "'", long26 == (-349199966L));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 349200000);
        int int12 = fixedDateTimeZone4.getOffsetFromLocal(0L);
        boolean boolean14 = fixedDateTimeZone4.equals((java.lang.Object) (-99L));
        boolean boolean16 = fixedDateTimeZone4.isStandardOffset((-349200065L));
        java.util.Locale locale18 = null;
        java.lang.String str19 = fixedDateTimeZone4.getShortName(1L, locale18);
        java.lang.String str20 = fixedDateTimeZone4.getID();
        long long23 = fixedDateTimeZone4.convertLocalToUTC((-698400001L), false);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = fixedDateTimeZone4.getOffset(readableInstant24);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone30 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long32 = fixedDateTimeZone30.previousTransition((long) ' ');
        long long34 = fixedDateTimeZone30.previousTransition((long) 'a');
        long long36 = fixedDateTimeZone30.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone41 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long43 = fixedDateTimeZone30.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone41, (long) ' ');
        long long45 = fixedDateTimeZone30.nextTransition(0L);
        long long48 = fixedDateTimeZone30.adjustOffset((-349199901L), true);
        java.lang.String str50 = fixedDateTimeZone30.getShortName((-349199900L));
        long long54 = fixedDateTimeZone30.convertLocalToUTC(0L, false, (-698399848L));
        boolean boolean55 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone30);
        boolean boolean57 = fixedDateTimeZone30.isStandardOffset((-694799747L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+97:00" + "'", str20, "+97:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-698400101L) + "'", long23 == (-698400101L));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 32L + "'", long32 == 32L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 97L + "'", long34 == 97L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 349200000L + "'", long36 == 349200000L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 35L + "'", long43 == 35L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-349199901L) + "'", long48 == (-349199901L));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+00:00:00.100" + "'", str50, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-100L) + "'", long54 == (-100L));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:10", "", (int) (byte) -1, (int) (byte) -1);
        long long6 = fixedDateTimeZone4.convertUTCToLocal((-349200035L));
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = fixedDateTimeZone4.getOffset(readableInstant7);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-349200036L) + "'", long6 == (-349200036L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long9 = fixedDateTimeZone4.convertLocalToUTC((-101L), true);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone14 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str16 = fixedDateTimeZone14.getNameKey((long) 1);
        long long18 = fixedDateTimeZone14.nextTransition((long) (short) 100);
        java.lang.String str20 = fixedDateTimeZone14.getNameKey(97L);
        java.lang.String str22 = fixedDateTimeZone14.getNameKey(349200010L);
        boolean boolean23 = fixedDateTimeZone14.isFixed();
        java.lang.String str25 = fixedDateTimeZone14.getName((long) 'a');
        boolean boolean26 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone14);
        int int28 = fixedDateTimeZone14.getOffset(100L);
        org.joda.time.LocalDateTime localDateTime29 = null;
        boolean boolean30 = fixedDateTimeZone14.isLocalDateTimeGap(localDateTime29);
        int int32 = fixedDateTimeZone14.getStandardOffset(0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-201L) + "'", long9 == (-201L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+97:00" + "'", str20, "+97:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+97:00" + "'", str22, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.100" + "'", str25, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+10:35", "+00:00:00.032", 115800000, (int) (byte) 100);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 100, (int) (byte) 10);
        long long15 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone13, (-698399865L));
        long long17 = fixedDateTimeZone4.nextTransition(349199910L);
        java.util.TimeZone timeZone18 = fixedDateTimeZone4.toTimeZone();
        long long21 = fixedDateTimeZone4.adjustOffset((-349199935L), true);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone26 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long28 = fixedDateTimeZone26.previousTransition((long) ' ');
        long long30 = fixedDateTimeZone26.previousTransition((long) 'a');
        long long32 = fixedDateTimeZone26.previousTransition(349200000L);
        java.lang.String str34 = fixedDateTimeZone26.getNameKey((-349199968L));
        java.lang.String str35 = fixedDateTimeZone26.getID();
        int int37 = fixedDateTimeZone26.getOffsetFromLocal((-349200101L));
        int int39 = fixedDateTimeZone26.getOffsetFromLocal((-68L));
        java.lang.String str41 = fixedDateTimeZone26.getName((-349200099L));
        boolean boolean43 = fixedDateTimeZone26.isStandardOffset((-349200201L));
        int int45 = fixedDateTimeZone26.getOffsetFromLocal((-699000036L));
        java.lang.String str46 = fixedDateTimeZone26.toString();
        boolean boolean47 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone26);
        java.util.Locale locale49 = null;
        java.lang.String str50 = fixedDateTimeZone26.getName((-349139900L), locale49);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-698399865L) + "'", long15 == (-698399865L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 349199910L + "'", long17 == 349199910L);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-349199935L) + "'", long21 == (-349199935L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 32L + "'", long28 == 32L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 97L + "'", long30 == 97L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 349200000L + "'", long32 == 349200000L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+97:00" + "'", str34, "+97:00");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+97:00" + "'", str35, "+97:00");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00:00.100" + "'", str41, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+97:00" + "'", str46, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+00:00:00.100" + "'", str50, "+00:00:00.100");
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.util.TimeZone timeZone8 = fixedDateTimeZone4.toTimeZone();
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((-349199868L));
        long long13 = fixedDateTimeZone4.convertLocalToUTC(100L, false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone18 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str20 = fixedDateTimeZone18.getNameKey(100L);
        long long24 = fixedDateTimeZone18.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone25 = fixedDateTimeZone18.toTimeZone();
        java.util.Locale locale27 = null;
        java.lang.String str28 = fixedDateTimeZone18.getShortName(0L, locale27);
        long long30 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone18, 107L);
        int int32 = fixedDateTimeZone4.getOffset(349200101L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+97:00" + "'", str20, "+97:00");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-100L) + "'", long24 == (-100L));
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.100" + "'", str28, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 107L + "'", long30 == 107L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        java.lang.String str9 = fixedDateTimeZone4.getNameKey((-349199901L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone14 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str16 = fixedDateTimeZone14.getNameKey(0L);
        java.util.Locale locale18 = null;
        java.lang.String str19 = fixedDateTimeZone14.getShortName(31L, locale18);
        long long21 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone14, (long) 0);
        boolean boolean22 = fixedDateTimeZone4.isFixed();
        boolean boolean23 = fixedDateTimeZone4.isFixed();
        int int25 = fixedDateTimeZone4.getStandardOffset((long) 10);
        boolean boolean26 = fixedDateTimeZone4.isFixed();
        java.util.TimeZone timeZone27 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone32 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long34 = fixedDateTimeZone32.previousTransition((long) ' ');
        long long36 = fixedDateTimeZone32.previousTransition((long) 'a');
        long long38 = fixedDateTimeZone32.previousTransition(349200000L);
        java.lang.String str40 = fixedDateTimeZone32.getNameKey((-349199968L));
        long long43 = fixedDateTimeZone32.adjustOffset((long) (-1), true);
        java.lang.String str45 = fixedDateTimeZone32.getNameKey((-65L));
        boolean boolean46 = fixedDateTimeZone4.equals((java.lang.Object) (-65L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone51 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str53 = fixedDateTimeZone51.getNameKey((long) 1);
        boolean boolean54 = fixedDateTimeZone51.isFixed();
        java.lang.String str56 = fixedDateTimeZone51.getNameKey((-349199901L));
        long long58 = fixedDateTimeZone51.nextTransition((-68L));
        long long61 = fixedDateTimeZone51.adjustOffset(31L, false);
        boolean boolean62 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone51);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 32L + "'", long34 == 32L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 97L + "'", long36 == 97L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 349200000L + "'", long38 == 349200000L);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+97:00" + "'", str40, "+97:00");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1L) + "'", long43 == (-1L));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+97:00" + "'", str45, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "+97:00" + "'", str53, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "+97:00" + "'", str56, "+97:00");
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-68L) + "'", long58 == (-68L));
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 31L + "'", long61 == 31L);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }
}

