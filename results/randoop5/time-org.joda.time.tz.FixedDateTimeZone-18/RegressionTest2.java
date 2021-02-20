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
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.nextTransition((-101L));
        int int8 = fixedDateTimeZone4.getStandardOffset((long) (byte) -1);
        int int10 = fixedDateTimeZone4.getOffsetFromLocal(10L);
        java.util.Locale locale12 = null;
        java.lang.String str13 = fixedDateTimeZone4.getShortName(0L, locale12);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-101L) + "'", long6 == (-101L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = fixedDateTimeZone4.getID();
        java.lang.String str9 = fixedDateTimeZone4.getNameKey((long) (short) 10);
        long long11 = fixedDateTimeZone4.convertUTCToLocal((-349199968L));
        int int13 = fixedDateTimeZone4.getStandardOffset(349200000L);
        int int15 = fixedDateTimeZone4.getOffsetFromLocal(349199867L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+97:00" + "'", str7, "+97:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349199868L) + "'", long11 == (-349199868L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long17 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, (long) ' ');
        long long21 = fixedDateTimeZone15.convertLocalToUTC(97L, true, 349200032L);
        java.util.TimeZone timeZone22 = fixedDateTimeZone15.toTimeZone();
        long long24 = fixedDateTimeZone15.nextTransition((-140L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-140L) + "'", long24 == (-140L));
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        java.lang.String str9 = fixedDateTimeZone4.getNameKey((-349199901L));
        boolean boolean10 = fixedDateTimeZone4.isFixed();
        java.lang.String str11 = fixedDateTimeZone4.toString();
        java.util.TimeZone timeZone12 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+97:00" + "'", str11, "+97:00");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getName((-349199868L));
        java.util.TimeZone timeZone7 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale2 = null;
        java.lang.String str3 = dateTimeZone0.getName((long) (short) 100, locale2);
        long long7 = dateTimeZone0.convertLocalToUTC((long) (short) 1, false, (long) (byte) 10);
        boolean boolean9 = dateTimeZone0.isStandardOffset((long) ' ');
        long long13 = dateTimeZone0.convertLocalToUTC((-233999968L), true, 59700L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-233999968L) + "'", long13 == (-233999968L));
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getShortName((long) (byte) 10);
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, false, (-349800139L));
        java.lang.String str11 = fixedDateTimeZone4.getID();
        int int13 = fixedDateTimeZone4.getStandardOffset((-100L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+97:00" + "'", str11, "+97:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.nextTransition((-101L));
        int int8 = fixedDateTimeZone4.getOffsetFromLocal((-698399936L));
        boolean boolean9 = fixedDateTimeZone4.isFixed();
        boolean boolean11 = fixedDateTimeZone4.isStandardOffset((-349199968L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-101L) + "'", long6 == (-101L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition((long) (short) 0);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str13 = fixedDateTimeZone4.getNameKey((-349200100L));
        int int15 = fixedDateTimeZone4.getOffset(349199997L);
        boolean boolean16 = fixedDateTimeZone4.isFixed();
        long long18 = fixedDateTimeZone4.previousTransition((-133L));
        java.lang.String str20 = fixedDateTimeZone4.getNameKey((long) (byte) 10);
        java.util.TimeZone timeZone21 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-133L) + "'", long18 == (-133L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+97:00" + "'", str20, "+97:00");
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
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
        org.joda.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime22);
        int int25 = fixedDateTimeZone4.getStandardOffset((-33L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-125999903L) + "'", long21 == (-125999903L));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        boolean boolean14 = fixedDateTimeZone4.isStandardOffset(100L);
        long long16 = fixedDateTimeZone4.nextTransition(698399932L);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime17);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 698399932L + "'", long16 == 698399932L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        java.lang.String str12 = fixedDateTimeZone4.getNameKey((-349199968L));
        java.lang.String str13 = fixedDateTimeZone4.getID();
        int int15 = fixedDateTimeZone4.getOffsetFromLocal((-349200101L));
        org.joda.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime16);
        boolean boolean19 = fixedDateTimeZone4.equals((java.lang.Object) (-349200301L));
        long long22 = fixedDateTimeZone4.convertLocalToUTC((long) 1, true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-99L) + "'", long22 == (-99L));
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.097", "+32:00", (int) (byte) 1, (int) (byte) -1);
        int int6 = fixedDateTimeZone4.getOffsetFromLocal(0L);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = fixedDateTimeZone4.getOffset(readableInstant7);
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((-698399900L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        int int10 = fixedDateTimeZone4.getStandardOffset((long) (short) 0);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) 0, true);
        java.lang.String str14 = fixedDateTimeZone4.toString();
        boolean boolean16 = fixedDateTimeZone4.isStandardOffset(349200010L);
        java.lang.String str18 = fixedDateTimeZone4.getNameKey((-698399999L));
        java.util.Locale locale20 = null;
        java.lang.String str21 = fixedDateTimeZone4.getShortName((-345600501L), locale20);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-100L) + "'", long13 == (-100L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+97:00" + "'", str14, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+97:00" + "'", str18, "+97:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.100" + "'", str21, "+00:00:00.100");
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.001");
        long long5 = dateTimeZone1.convertLocalToUTC(87L, true, (-349199969L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 86L + "'", long5 == 86L);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long7 = dateTimeZone4.convertLocalToUTC((long) (byte) 1, false);
        java.lang.String str9 = dateTimeZone4.getShortName((long) ' ');
        long long11 = dateTimeZone0.getMillisKeepLocal(dateTimeZone4, 0L);
        long long13 = dateTimeZone0.convertUTCToLocal(32L);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone0.getShortName((-1L), locale15);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone22 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str24 = fixedDateTimeZone22.getNameKey((long) 1);
        boolean boolean25 = fixedDateTimeZone22.isFixed();
        long long27 = fixedDateTimeZone22.previousTransition((long) '4');
        long long30 = fixedDateTimeZone22.convertLocalToUTC((-349199936L), false);
        long long32 = dateTimeZone0.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone22, (-101L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone37 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 100, (int) (byte) 10);
        java.lang.String str39 = fixedDateTimeZone37.getShortName((-349199999L));
        long long42 = fixedDateTimeZone37.adjustOffset(0L, true);
        long long45 = fixedDateTimeZone37.adjustOffset((-349200136L), true);
        long long47 = dateTimeZone0.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone37, (-349199900L));
        java.lang.String str49 = fixedDateTimeZone37.getShortName((-349800001L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199999L) + "'", long7 == (-349199999L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349199900L) + "'", long11 == (-349199900L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 132L + "'", long13 == 132L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+97:00" + "'", str24, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 52L + "'", long27 == 52L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-349200036L) + "'", long30 == (-349200036L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-101L) + "'", long32 == (-101L));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00:00.100" + "'", str39, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-349200136L) + "'", long45 == (-349200136L));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-349199900L) + "'", long47 == (-349199900L));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "+00:00:00.100" + "'", str49, "+00:00:00.100");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(97L);
        java.lang.String str12 = fixedDateTimeZone4.getNameKey(349200010L);
        boolean boolean13 = fixedDateTimeZone4.isFixed();
        java.lang.String str15 = fixedDateTimeZone4.getNameKey((long) 0);
        boolean boolean17 = fixedDateTimeZone4.isStandardOffset((-349199968L));
        java.lang.String str19 = fixedDateTimeZone4.getShortName((long) 1);
        long long22 = fixedDateTimeZone4.adjustOffset((-349200096L), false);
        java.lang.String str24 = fixedDateTimeZone4.getName((-349200301L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-349200096L) + "'", long22 == (-349200096L));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-68L));
        long long11 = fixedDateTimeZone4.convertLocalToUTC((-349200000L), false, (-90L));
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getShortName((-3L), locale13);
        java.lang.String str16 = fixedDateTimeZone4.getNameKey(349200034L);
        long long18 = fixedDateTimeZone4.previousTransition((-133L));
        java.lang.String str20 = fixedDateTimeZone4.getName((-101L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349200097L) + "'", long11 == (-349200097L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.097" + "'", str14, "+00:00:00.097");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-133L) + "'", long18 == (-133L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.097" + "'", str20, "+00:00:00.097");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.032", "+00:00:00.097", (int) (short) 0, 6720000);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long17 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, (long) ' ');
        long long21 = fixedDateTimeZone15.convertLocalToUTC(97L, true, 349200032L);
        long long23 = fixedDateTimeZone15.previousTransition(349199867L);
        java.lang.String str24 = fixedDateTimeZone15.toString();
        java.lang.String str25 = fixedDateTimeZone15.toString();
        long long29 = fixedDateTimeZone15.convertLocalToUTC((long) 349200000, false, (-349200333L));
        java.lang.String str31 = fixedDateTimeZone15.getName((-827999606L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 349199867L + "'", long23 == 349199867L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.100" + "'", str25, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 349199903L + "'", long29 == 349199903L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00:00.097" + "'", str31, "+00:00:00.097");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(97L);
        java.lang.String str12 = fixedDateTimeZone4.getNameKey(349200010L);
        boolean boolean13 = fixedDateTimeZone4.isFixed();
        java.lang.String str15 = fixedDateTimeZone4.getShortName((long) '4');
        int int17 = fixedDateTimeZone4.getOffsetFromLocal((-349199999L));
        java.lang.String str19 = fixedDateTimeZone4.getShortName(0L);
        boolean boolean21 = fixedDateTimeZone4.isStandardOffset((-349200100L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(60000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long15 = dateTimeZone11.getMillisKeepLocal(dateTimeZone13, (long) ' ');
        long long18 = dateTimeZone13.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        long long22 = dateTimeZone13.convertLocalToUTC((long) (byte) 0, false);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long26 = dateTimeZone13.getMillisKeepLocal(dateTimeZone24, (long) 1);
        long long28 = dateTimeZone10.getMillisKeepLocal(dateTimeZone13, (long) 0);
        boolean boolean29 = fixedDateTimeZone4.equals((java.lang.Object) dateTimeZone10);
        java.lang.String str31 = fixedDateTimeZone4.getShortName((long) (byte) 1);
        java.util.TimeZone timeZone32 = null;
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
        java.lang.String str34 = dateTimeZone33.getID();
        long long36 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone33, (-90L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone41 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str43 = fixedDateTimeZone41.getNameKey((long) 1);
        boolean boolean44 = fixedDateTimeZone41.isFixed();
        long long46 = fixedDateTimeZone41.previousTransition((long) '4');
        long long49 = fixedDateTimeZone41.convertLocalToUTC((-349199936L), false);
        java.lang.String str50 = fixedDateTimeZone41.getID();
        int int52 = fixedDateTimeZone41.getOffset(0L);
        boolean boolean53 = fixedDateTimeZone4.equals((java.lang.Object) int52);
        java.util.Locale locale55 = null;
        java.lang.String str56 = fixedDateTimeZone4.getName(0L, locale55);
        java.lang.Class<?> wildcardClass57 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-349199868L) + "'", long15 == (-349199868L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-349200001L) + "'", long18 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-349200000L) + "'", long22 == (-349200000L));
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00:00.100" + "'", str31, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+97:00" + "'", str34, "+97:00");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-349199990L) + "'", long36 == (-349199990L));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+97:00" + "'", str43, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 52L + "'", long46 == 52L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-349200036L) + "'", long49 == (-349200036L));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+97:00" + "'", str50, "+97:00");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "+00:00:00.100" + "'", str56, "+00:00:00.100");
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        java.lang.String str9 = fixedDateTimeZone4.getNameKey((-349199901L));
        long long11 = fixedDateTimeZone4.nextTransition((-68L));
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = fixedDateTimeZone4.getOffset(readableInstant12);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone18 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long20 = fixedDateTimeZone18.previousTransition((long) ' ');
        long long22 = fixedDateTimeZone18.previousTransition((long) 'a');
        long long24 = fixedDateTimeZone18.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone29 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long31 = fixedDateTimeZone18.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone29, (long) ' ');
        boolean boolean32 = fixedDateTimeZone29.isFixed();
        long long35 = fixedDateTimeZone29.convertLocalToUTC((-349199999L), false);
        boolean boolean36 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone29);
        java.lang.String str38 = fixedDateTimeZone29.getShortName((long) (short) 100);
        java.util.Locale locale40 = null;
        java.lang.String str41 = fixedDateTimeZone29.getName(107L, locale40);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-68L) + "'", long11 == (-68L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 97L + "'", long22 == 97L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 349200000L + "'", long24 == 349200000L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 35L + "'", long31 == 35L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-349200096L) + "'", long35 == (-349200096L));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00:00.097" + "'", str38, "+00:00:00.097");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00:00.097" + "'", str41, "+00:00:00.097");
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        int int12 = fixedDateTimeZone4.getStandardOffset(1L);
        long long16 = fixedDateTimeZone4.convertLocalToUTC((long) '4', false, (long) (short) 1);
        java.util.Locale locale18 = null;
        java.lang.String str19 = fixedDateTimeZone4.getName((long) 97, locale18);
        boolean boolean21 = fixedDateTimeZone4.isStandardOffset((-698399848L));
        boolean boolean22 = fixedDateTimeZone4.isFixed();
        java.lang.Class<?> wildcardClass23 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-48L) + "'", long16 == (-48L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.097", "+32:00", (int) (byte) 1, (int) (byte) -1);
        int int6 = fixedDateTimeZone4.getOffsetFromLocal(0L);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = fixedDateTimeZone4.getOffset(readableInstant7);
        int int10 = fixedDateTimeZone4.getStandardOffset((-349200036L));
        long long13 = fixedDateTimeZone4.adjustOffset((-698399968L), false);
        int int15 = fixedDateTimeZone4.getOffset((long) '#');
        long long19 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) 0, true, (-349199871L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-698399968L) + "'", long13 == (-698399968L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.util.TimeZone timeZone8 = fixedDateTimeZone4.toTimeZone();
        long long10 = fixedDateTimeZone4.previousTransition((long) 'a');
        java.lang.String str11 = fixedDateTimeZone4.toString();
        java.util.TimeZone timeZone12 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = fixedDateTimeZone4.getOffset(readableInstant13);
        long long16 = fixedDateTimeZone4.previousTransition((-198L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+97:00" + "'", str11, "+97:00");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-198L) + "'", long16 == (-198L));
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(97L);
        java.lang.String str12 = fixedDateTimeZone4.getNameKey(349200010L);
        boolean boolean13 = fixedDateTimeZone4.isFixed();
        java.lang.String str15 = fixedDateTimeZone4.getNameKey((long) 0);
        boolean boolean17 = fixedDateTimeZone4.isStandardOffset((-349199968L));
        java.lang.String str19 = fixedDateTimeZone4.getShortName(0L);
        java.util.TimeZone timeZone20 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone21);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(97L);
        java.lang.String str12 = fixedDateTimeZone4.getNameKey(349200010L);
        boolean boolean13 = fixedDateTimeZone4.isFixed();
        java.lang.String str15 = fixedDateTimeZone4.getName((long) 'a');
        int int17 = fixedDateTimeZone4.getOffsetFromLocal((-349199935L));
        boolean boolean19 = fixedDateTimeZone4.isStandardOffset(349199902L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone24 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long26 = fixedDateTimeZone24.previousTransition((long) ' ');
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone24);
        java.util.TimeZone timeZone28 = fixedDateTimeZone24.toTimeZone();
        int int30 = fixedDateTimeZone24.getOffsetFromLocal((-349199868L));
        boolean boolean31 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone24);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32L + "'", long26 == 32L);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition((long) (short) 0);
        int int12 = fixedDateTimeZone4.getOffsetFromLocal((long) (byte) 0);
        boolean boolean14 = fixedDateTimeZone4.isStandardOffset((-349199936L));
        java.util.Locale locale16 = null;
        java.lang.String str17 = fixedDateTimeZone4.getShortName((-349200000L), locale16);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("UTC", "UTC", 0, (-1));
        long long6 = fixedDateTimeZone4.convertUTCToLocal((long) 10);
        long long8 = fixedDateTimeZone4.previousTransition(0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition((long) (short) 0);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str13 = fixedDateTimeZone4.getNameKey((-349200100L));
        int int15 = fixedDateTimeZone4.getOffset(1L);
        java.util.TimeZone timeZone16 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long17 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, (long) ' ');
        boolean boolean18 = fixedDateTimeZone15.isFixed();
        long long21 = fixedDateTimeZone15.convertLocalToUTC((-349199999L), false);
        long long25 = fixedDateTimeZone15.convertLocalToUTC((long) ' ', false, (long) (short) 10);
        long long28 = fixedDateTimeZone15.convertLocalToUTC(35L, true);
        boolean boolean29 = fixedDateTimeZone15.isFixed();
        boolean boolean30 = fixedDateTimeZone15.isFixed();
        java.lang.String str32 = fixedDateTimeZone15.getShortName(0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-349200096L) + "'", long21 == (-349200096L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-65L) + "'", long25 == (-65L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-62L) + "'", long28 == (-62L));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.097" + "'", str32, "+00:00:00.097");
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("UTC", "+00:01", 0, (int) (byte) 0);
        int int6 = fixedDateTimeZone4.getOffset((-349200290L));
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        boolean boolean8 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone5 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long7 = fixedDateTimeZone5.previousTransition((long) ' ');
        long long9 = fixedDateTimeZone5.previousTransition((long) 'a');
        long long11 = fixedDateTimeZone5.previousTransition((long) (short) 0);
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone5.getName((long) (-1), locale13);
        long long16 = dateTimeZone0.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone5, (long) 97);
        java.lang.String str18 = fixedDateTimeZone5.getName(349199902L);
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = fixedDateTimeZone5.getOffset(readableInstant19);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.100" + "'", str18, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition((long) (short) 0);
        java.lang.String str11 = fixedDateTimeZone4.getID();
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getShortName(0L, locale13);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+97:00" + "'", str11, "+97:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.util.TimeZone timeZone8 = fixedDateTimeZone4.toTimeZone();
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((-349199868L));
        long long13 = fixedDateTimeZone4.convertLocalToUTC(100L, false);
        java.lang.String str15 = fixedDateTimeZone4.getNameKey(349200100L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone20 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long22 = fixedDateTimeZone20.previousTransition((long) ' ');
        long long24 = fixedDateTimeZone20.previousTransition((long) 'a');
        int int26 = fixedDateTimeZone20.getStandardOffset((long) (short) 0);
        int int28 = fixedDateTimeZone20.getStandardOffset((long) (byte) 10);
        java.lang.String str29 = fixedDateTimeZone20.getID();
        java.util.TimeZone timeZone30 = fixedDateTimeZone20.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        boolean boolean32 = fixedDateTimeZone4.equals((java.lang.Object) dateTimeZone31);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 97L + "'", long24 == 97L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+97:00" + "'", str29, "+97:00");
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.nextTransition((-101L));
        int int8 = fixedDateTimeZone4.getOffsetFromLocal((-698399936L));
        boolean boolean9 = fixedDateTimeZone4.isFixed();
        int int11 = fixedDateTimeZone4.getOffsetFromLocal((-3L));
        int int13 = fixedDateTimeZone4.getOffset((-475199903L));
        java.lang.String str15 = fixedDateTimeZone4.getNameKey((-702060001L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-101L) + "'", long6 == (-101L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(97L);
        int int12 = fixedDateTimeZone4.getOffset((long) 349200000);
        long long16 = fixedDateTimeZone4.convertLocalToUTC((-106L), true, 349200132L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-206L) + "'", long16 == (-206L));
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
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
        java.lang.String str30 = fixedDateTimeZone14.getName((-48L));
        java.util.Locale locale32 = null;
        java.lang.String str33 = fixedDateTimeZone14.getName((-349200003L), locale32);
        long long35 = fixedDateTimeZone14.convertUTCToLocal(349199670L);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.100" + "'", str30, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00:00.100" + "'", str33, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 349199770L + "'", long35 == 349199770L);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "+10:35", (int) 'a', (int) 'a');
        int int6 = fixedDateTimeZone4.getStandardOffset((-698399936L));
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = fixedDateTimeZone4.getOffset(readableInstant7);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 100, (int) (byte) 10);
        long long15 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone13, (-698399865L));
        boolean boolean17 = fixedDateTimeZone13.isStandardOffset(349199910L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-698399865L) + "'", long15 == (-698399865L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 349200000);
        int int12 = fixedDateTimeZone4.getOffsetFromLocal(0L);
        boolean boolean14 = fixedDateTimeZone4.equals((java.lang.Object) (-99L));
        java.util.Locale locale16 = null;
        java.lang.String str17 = fixedDateTimeZone4.getShortName((-349800139L), locale16);
        java.util.Locale locale19 = null;
        java.lang.String str20 = fixedDateTimeZone4.getName((-698399865L), locale19);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        java.util.TimeZone timeZone9 = fixedDateTimeZone4.toTimeZone();
        boolean boolean10 = fixedDateTimeZone4.isFixed();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(32, (int) (byte) 10);
        java.lang.String str15 = dateTimeZone13.getShortName((-162L));
        java.lang.String str16 = dateTimeZone13.toString();
        boolean boolean17 = fixedDateTimeZone4.equals((java.lang.Object) str16);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+32:10" + "'", str15, "+32:10");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+32:10" + "'", str16, "+32:10");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone0.getMillisKeepLocal(dateTimeZone2, (long) ' ');
        long long7 = dateTimeZone2.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long10 = dateTimeZone2.convertUTCToLocal(0L);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone2.getOffset(readableInstant11);
        long long14 = dateTimeZone2.convertUTCToLocal((long) (short) 10);
        java.lang.String str15 = dateTimeZone2.toString();
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone2.getOffset(readableInstant16);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = dateTimeZone2.getOffset(readableInstant19);
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = dateTimeZone2.isLocalDateTimeGap(localDateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-349199868L) + "'", long4 == (-349199868L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349200001L) + "'", long7 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 349200000 + "'", int12 == 349200000);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 349200010L + "'", long14 == 349200010L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 349200000 + "'", int17 == 349200000);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 349200000 + "'", int20 == 349200000);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(115200000);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone11 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long13 = fixedDateTimeZone11.previousTransition((long) ' ');
        long long15 = fixedDateTimeZone11.previousTransition((long) 'a');
        int int17 = fixedDateTimeZone11.getStandardOffset((long) (short) 0);
        long long20 = fixedDateTimeZone11.convertLocalToUTC((long) 0, true);
        int int22 = fixedDateTimeZone11.getOffset((-349199999L));
        boolean boolean23 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone11);
        java.lang.String str25 = fixedDateTimeZone11.getNameKey((-349199871L));
        java.util.Locale locale27 = null;
        java.lang.String str28 = fixedDateTimeZone11.getName((long) (byte) -1, locale27);
        int int30 = fixedDateTimeZone11.getOffsetFromLocal(349200101L);
        long long34 = fixedDateTimeZone11.convertLocalToUTC((long) ' ', true, (-475199903L));
        boolean boolean35 = fixedDateTimeZone11.isFixed();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-100L) + "'", long20 == (-100L));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+97:00" + "'", str25, "+97:00");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.100" + "'", str28, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-68L) + "'", long34 == (-68L));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        java.lang.String str9 = fixedDateTimeZone4.getNameKey((-349199901L));
        long long11 = fixedDateTimeZone4.nextTransition((-68L));
        long long14 = fixedDateTimeZone4.adjustOffset(31L, false);
        long long16 = fixedDateTimeZone4.nextTransition((-698399747L));
        java.lang.String str18 = fixedDateTimeZone4.getName((-109L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-68L) + "'", long11 == (-68L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 31L + "'", long14 == 31L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-698399747L) + "'", long16 == (-698399747L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.100" + "'", str18, "+00:00:00.100");
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.052", "+00:10", (int) (byte) 0, 32);
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        int int10 = fixedDateTimeZone4.getStandardOffset((long) (short) 0);
        int int12 = fixedDateTimeZone4.getStandardOffset((long) (byte) 10);
        long long15 = fixedDateTimeZone4.convertLocalToUTC((long) 1, true);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = fixedDateTimeZone4.getOffset(readableInstant16);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone22 = new org.joda.time.tz.FixedDateTimeZone("+00:00", "+00:00:00.032", (int) (short) -1, (int) (short) 10);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone22);
        java.lang.String str24 = fixedDateTimeZone22.getID();
        java.lang.String str26 = fixedDateTimeZone22.getNameKey((-349200101L));
        int int28 = fixedDateTimeZone22.getStandardOffset(32L);
        long long30 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone22, (-698399848L));
        java.util.Locale locale32 = null;
        java.lang.String str33 = fixedDateTimeZone4.getName(38L, locale32);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-99L) + "'", long15 == (-99L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.032" + "'", str26, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-698399747L) + "'", long30 == (-698399747L));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00:00.100" + "'", str33, "+00:00:00.100");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone0.getMillisKeepLocal(dateTimeZone2, (long) ' ');
        long long7 = dateTimeZone2.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long11 = dateTimeZone2.convertLocalToUTC((long) (byte) 0, false);
        java.lang.String str12 = dateTimeZone2.toString();
        long long15 = dateTimeZone2.convertLocalToUTC(349200000L, false);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone2.getName((-349199935L), locale17);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-349199969L) + "'", long4 == (-349199969L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349200001L) + "'", long7 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349200000L) + "'", long11 == (-349200000L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+97:00" + "'", str18, "+97:00");
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        java.lang.String str9 = fixedDateTimeZone4.getNameKey((-349199901L));
        long long11 = fixedDateTimeZone4.nextTransition((-68L));
        int int13 = fixedDateTimeZone4.getOffset((-349200090L));
        long long15 = fixedDateTimeZone4.previousTransition((-349199967L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-68L) + "'", long11 == (-68L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-349199967L) + "'", long15 == (-349199967L));
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 100, (int) (byte) 10);
        int int6 = fixedDateTimeZone4.getOffsetFromLocal((long) (byte) 1);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = fixedDateTimeZone4.getOffset(readableInstant7);
        long long11 = fixedDateTimeZone4.adjustOffset(0L, false);
        boolean boolean12 = fixedDateTimeZone4.isFixed();
        int int14 = fixedDateTimeZone4.getOffset((-698399999L));
        int int16 = fixedDateTimeZone4.getOffset(300L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 10);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone6 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long8 = fixedDateTimeZone6.previousTransition((long) ' ');
        long long10 = fixedDateTimeZone6.previousTransition((long) 'a');
        int int12 = fixedDateTimeZone6.getStandardOffset((long) (short) 0);
        int int14 = fixedDateTimeZone6.getStandardOffset((long) (byte) 10);
        long long17 = fixedDateTimeZone6.convertLocalToUTC((long) 1, true);
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = fixedDateTimeZone6.getOffset(readableInstant18);
        long long21 = dateTimeZone1.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone6, 49L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-99L) + "'", long17 == (-99L));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-41L) + "'", long21 == (-41L));
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 349200000);
        int int12 = fixedDateTimeZone4.getOffsetFromLocal(0L);
        boolean boolean14 = fixedDateTimeZone4.equals((java.lang.Object) (-99L));
        java.lang.String str15 = fixedDateTimeZone4.getID();
        java.lang.String str17 = fixedDateTimeZone4.getShortName(698399935L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
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
        java.lang.String str24 = fixedDateTimeZone4.getID();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.lang.String str26 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+97:00" + "'", str24, "+97:00");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+97:00" + "'", str26, "+97:00");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, 0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "+10:35", (int) 'a', (int) 'a');
        java.lang.String str5 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.100" + "'", str5, "+00:00:00.100");
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 349200000);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) 10, true);
        java.util.Locale locale15 = null;
        java.lang.String str16 = fixedDateTimeZone4.getShortName((long) 'a', locale15);
        boolean boolean18 = fixedDateTimeZone4.isStandardOffset(349200032L);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        long long21 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone19, 35L);
        org.joda.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime22);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone28 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long30 = fixedDateTimeZone28.previousTransition((long) ' ');
        long long32 = fixedDateTimeZone28.previousTransition((long) 'a');
        java.lang.String str34 = fixedDateTimeZone28.getNameKey((long) 349200000);
        int int36 = fixedDateTimeZone28.getOffsetFromLocal(0L);
        boolean boolean38 = fixedDateTimeZone28.equals((java.lang.Object) (-99L));
        java.lang.String str39 = fixedDateTimeZone28.getID();
        boolean boolean40 = fixedDateTimeZone4.equals((java.lang.Object) str39);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) '#');
        long long45 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone43, (long) 97);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-90L) + "'", long13 == (-90L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 35L + "'", long21 == 35L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 32L + "'", long30 == 32L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 97L + "'", long32 == 97L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+97:00" + "'", str34, "+97:00");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+97:00" + "'", str39, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-38099803L) + "'", long45 == (-38099803L));
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', 32);
        long long5 = dateTimeZone2.adjustOffset(200L, true);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone2.getName(349200133L, locale7);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 200L + "'", long5 == 200L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+97:32" + "'", str8, "+97:32");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        java.util.Locale locale7 = null;
        java.lang.String str8 = fixedDateTimeZone4.getShortName((-99L), locale7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        long long13 = dateTimeZone9.convertLocalToUTC((-349200001L), false, (long) (byte) 100);
        boolean boolean15 = dateTimeZone9.isStandardOffset((-100L));
        java.lang.String str16 = dateTimeZone9.toString();
        boolean boolean17 = fixedDateTimeZone4.equals((java.lang.Object) dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-349200101L) + "'", long13 == (-349200101L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long9 = fixedDateTimeZone4.adjustOffset((long) (short) 100, false);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((-349200036L), false, (-48L));
        long long15 = fixedDateTimeZone4.nextTransition(97L);
        java.lang.String str17 = fixedDateTimeZone4.getNameKey(0L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone22 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        java.lang.String str24 = fixedDateTimeZone22.getName((-60001L));
        long long26 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone22, (-349199969L));
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours(1);
        java.util.Locale locale30 = null;
        java.lang.String str31 = dateTimeZone28.getName((long) (short) -1, locale30);
        long long33 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone28, (-349200164L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-349200136L) + "'", long13 == (-349200136L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.097" + "'", str24, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-349199966L) + "'", long26 == (-349199966L));
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+01:00" + "'", str31, "+01:00");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-352800064L) + "'", long33 == (-352800064L));
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long17 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, (long) ' ');
        long long19 = fixedDateTimeZone4.nextTransition(0L);
        long long22 = fixedDateTimeZone4.adjustOffset((-349199901L), true);
        java.lang.String str24 = fixedDateTimeZone4.getShortName((-349199900L));
        long long28 = fixedDateTimeZone4.convertLocalToUTC(0L, false, (-698399848L));
        long long31 = fixedDateTimeZone4.convertLocalToUTC(698400032L, true);
        java.util.Locale locale33 = null;
        java.lang.String str34 = fixedDateTimeZone4.getShortName(0L, locale33);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-349199901L) + "'", long22 == (-349199901L));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-100L) + "'", long28 == (-100L));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 698399932L + "'", long31 == 698399932L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00:00.100" + "'", str34, "+00:00:00.100");
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        long long9 = fixedDateTimeZone4.previousTransition((long) '4');
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone14 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long16 = fixedDateTimeZone14.previousTransition((long) ' ');
        long long18 = fixedDateTimeZone14.previousTransition((long) 'a');
        long long20 = fixedDateTimeZone14.previousTransition(349200000L);
        java.lang.String str22 = fixedDateTimeZone14.getNameKey((-349199968L));
        java.lang.String str23 = fixedDateTimeZone14.getID();
        int int25 = fixedDateTimeZone14.getOffsetFromLocal((-349200101L));
        int int27 = fixedDateTimeZone14.getOffsetFromLocal((-68L));
        java.lang.String str29 = fixedDateTimeZone14.getName((-349200099L));
        long long31 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone14, 0L);
        boolean boolean32 = fixedDateTimeZone14.isFixed();
        int int34 = fixedDateTimeZone14.getOffset((-303L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 349200000L + "'", long20 == 349200000L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+97:00" + "'", str22, "+97:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+97:00" + "'", str23, "+97:00");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00:00.100" + "'", str29, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long15 = fixedDateTimeZone4.convertLocalToUTC(349200010L, true);
        long long17 = fixedDateTimeZone4.nextTransition((-349199901L));
        boolean boolean19 = fixedDateTimeZone4.isStandardOffset((-349800001L));
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long24 = dateTimeZone20.getMillisKeepLocal(dateTimeZone22, (long) ' ');
        long long27 = dateTimeZone22.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone22);
        long long30 = dateTimeZone22.convertUTCToLocal(0L);
        org.joda.time.ReadableInstant readableInstant31 = null;
        int int32 = dateTimeZone22.getOffset(readableInstant31);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone22);
        long long35 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone22, 60032L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 349199910L + "'", long15 == 349199910L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-349199901L) + "'", long17 == (-349199901L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-349199868L) + "'", long24 == (-349199868L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-349200001L) + "'", long27 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 349200000L + "'", long30 == 349200000L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 349200000 + "'", int32 == 349200000);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-349139868L) + "'", long35 == (-349139868L));
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long9 = fixedDateTimeZone4.adjustOffset((long) (short) 100, false);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((-349200036L), false, (-48L));
        long long15 = fixedDateTimeZone4.nextTransition(97L);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = fixedDateTimeZone4.getOffset(readableInstant16);
        int int19 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        boolean boolean21 = fixedDateTimeZone4.isStandardOffset((-3L));
        long long23 = fixedDateTimeZone4.previousTransition((-349200103L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-349200136L) + "'", long13 == (-349200136L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-349200103L) + "'", long23 == (-349200103L));
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.nextTransition((long) 10);
        int int8 = fixedDateTimeZone4.getStandardOffset((-349200001L));
        long long10 = fixedDateTimeZone4.previousTransition((-349199890L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long17 = fixedDateTimeZone15.previousTransition((long) ' ');
        long long19 = fixedDateTimeZone15.previousTransition((long) 'a');
        long long21 = fixedDateTimeZone15.previousTransition(349200000L);
        int int23 = fixedDateTimeZone15.getStandardOffset(1L);
        boolean boolean24 = fixedDateTimeZone15.isFixed();
        java.util.TimeZone timeZone25 = fixedDateTimeZone15.toTimeZone();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone30 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str32 = fixedDateTimeZone30.getNameKey((long) 1);
        boolean boolean33 = fixedDateTimeZone30.isFixed();
        java.lang.String str35 = fixedDateTimeZone30.getNameKey((-349199901L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone40 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str42 = fixedDateTimeZone40.getNameKey(0L);
        java.util.Locale locale44 = null;
        java.lang.String str45 = fixedDateTimeZone40.getShortName(31L, locale44);
        long long47 = fixedDateTimeZone30.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone40, (long) 0);
        boolean boolean48 = fixedDateTimeZone40.isFixed();
        long long50 = fixedDateTimeZone15.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone40, (long) 'a');
        boolean boolean51 = fixedDateTimeZone4.equals((java.lang.Object) long50);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-349199890L) + "'", long10 == (-349199890L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 349200000L + "'", long21 == 349200000L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+97:00" + "'", str32, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+97:00" + "'", str35, "+97:00");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+97:00" + "'", str42, "+97:00");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+00:00:00.100" + "'", str45, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 97L + "'", long50 == 97L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        java.lang.String str12 = fixedDateTimeZone4.getNameKey((-349199968L));
        long long15 = fixedDateTimeZone4.adjustOffset((long) (-1), true);
        java.lang.String str17 = fixedDateTimeZone4.getNameKey((-65L));
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        int int21 = fixedDateTimeZone4.getOffset(readableInstant20);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone0.getMillisKeepLocal(dateTimeZone2, (long) ' ');
        long long7 = dateTimeZone2.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long11 = dateTimeZone2.convertLocalToUTC((long) (byte) 0, false);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long15 = dateTimeZone2.getMillisKeepLocal(dateTimeZone13, (long) 1);
        boolean boolean17 = dateTimeZone13.isStandardOffset((long) (short) 10);
        java.lang.String str19 = dateTimeZone13.getName(97L);
        boolean boolean21 = dateTimeZone13.isStandardOffset((-349199968L));
        java.lang.String str22 = dateTimeZone13.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-349199871L) + "'", long4 == (-349199871L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349200001L) + "'", long7 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349200000L) + "'", long11 == (-349200000L));
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+97:00" + "'", str19, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+97:00" + "'", str22, "+97:00");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.nextTransition((-101L));
        java.util.Locale locale8 = null;
        java.lang.String str9 = fixedDateTimeZone4.getName((-90L), locale8);
        int int11 = fixedDateTimeZone4.getOffset((long) (byte) 10);
        boolean boolean12 = fixedDateTimeZone4.isFixed();
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = fixedDateTimeZone4.getOffset(readableInstant13);
        long long16 = fixedDateTimeZone4.previousTransition((-349200036L));
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 10);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone23 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long25 = fixedDateTimeZone23.previousTransition((long) ' ');
        long long27 = fixedDateTimeZone23.previousTransition((long) 'a');
        int int29 = fixedDateTimeZone23.getStandardOffset((long) (short) 0);
        int int31 = fixedDateTimeZone23.getStandardOffset((long) (byte) 10);
        long long34 = fixedDateTimeZone23.convertLocalToUTC((long) 1, true);
        org.joda.time.ReadableInstant readableInstant35 = null;
        int int36 = fixedDateTimeZone23.getOffset(readableInstant35);
        long long38 = dateTimeZone18.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone23, 49L);
        boolean boolean39 = fixedDateTimeZone4.equals((java.lang.Object) dateTimeZone18);
        java.lang.String str41 = fixedDateTimeZone4.getShortName((-97L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-101L) + "'", long6 == (-101L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-349200036L) + "'", long16 == (-349200036L));
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 97L + "'", long27 == 97L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-99L) + "'", long34 == (-99L));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-41L) + "'", long38 == (-41L));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00:00.100" + "'", str41, "+00:00:00.100");
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        java.lang.String str12 = fixedDateTimeZone4.getNameKey((-349199968L));
        long long15 = fixedDateTimeZone4.adjustOffset((long) (-1), true);
        boolean boolean17 = fixedDateTimeZone4.isStandardOffset((-3600062L));
        long long19 = fixedDateTimeZone4.previousTransition(32L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, 1);
        java.lang.String str3 = dateTimeZone2.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone9 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str11 = fixedDateTimeZone9.getNameKey((long) 1);
        boolean boolean12 = fixedDateTimeZone9.isFixed();
        long long14 = fixedDateTimeZone9.previousTransition((long) '4');
        long long17 = fixedDateTimeZone9.convertLocalToUTC((-349199936L), false);
        long long19 = dateTimeZone2.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone9, (-200L));
        org.joda.time.ReadableInstant readableInstant20 = null;
        int int21 = dateTimeZone2.getOffset(readableInstant20);
        boolean boolean23 = dateTimeZone2.isStandardOffset(60032L);
        boolean boolean25 = dateTimeZone2.isStandardOffset((-348600068L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+97:00" + "'", str11, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-349200036L) + "'", long17 == (-349200036L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 59700L + "'", long19 == 59700L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60000 + "'", int21 == 60000);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.001", "+32:10", 115200000, 60000);
        long long7 = fixedDateTimeZone4.convertLocalToUTC(0L, true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-115200000L) + "'", long7 == (-115200000L));
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00", "+00:00:00.097", (int) (short) 0, (int) (byte) -1);
        long long6 = fixedDateTimeZone4.convertUTCToLocal(349200133L);
        long long8 = fixedDateTimeZone4.nextTransition((long) '#');
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 349200133L + "'", long6 == 349200133L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = fixedDateTimeZone4.getID();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone12 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long14 = fixedDateTimeZone12.previousTransition((long) ' ');
        java.lang.String str15 = fixedDateTimeZone12.getID();
        java.lang.String str17 = fixedDateTimeZone12.getNameKey((long) (short) 10);
        int int19 = fixedDateTimeZone12.getOffsetFromLocal((-101L));
        long long21 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone12, 32L);
        java.lang.String str23 = fixedDateTimeZone12.getName((long) (short) 0);
        boolean boolean24 = fixedDateTimeZone12.isFixed();
        java.util.TimeZone timeZone25 = fixedDateTimeZone12.toTimeZone();
        java.util.TimeZone timeZone26 = fixedDateTimeZone12.toTimeZone();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+97:00" + "'", str7, "+97:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.100" + "'", str23, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:01", "+00:10", (int) (short) 0, 349200000);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getName(60000L, locale6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        int int6 = fixedDateTimeZone4.getOffset(349200010L);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        java.lang.String str8 = fixedDateTimeZone4.getID();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long15 = fixedDateTimeZone13.nextTransition((-101L));
        int int17 = fixedDateTimeZone13.getStandardOffset((long) (byte) -1);
        int int19 = fixedDateTimeZone13.getOffsetFromLocal(10L);
        long long22 = fixedDateTimeZone13.convertLocalToUTC((-349199868L), false);
        long long24 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone13, 0L);
        java.lang.String str26 = fixedDateTimeZone13.getShortName(349199910L);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone13);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+97:00" + "'", str8, "+97:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-101L) + "'", long15 == (-101L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-349199968L) + "'", long22 == (-349199968L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-3L) + "'", long24 == (-3L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.100" + "'", str26, "+00:00:00.100");
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, 349200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 349200000");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone1.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = dateTimeZone1.isLocalDateTimeGap(localDateTime5);
        boolean boolean8 = dateTimeZone1.isStandardOffset(3660000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-349199999L) + "'", long4 == (-349199999L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        int int6 = fixedDateTimeZone4.getOffset(349200010L);
        long long8 = fixedDateTimeZone4.nextTransition(100L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = fixedDateTimeZone4.getOffset(readableInstant9);
        int int12 = fixedDateTimeZone4.getOffset((-349200099L));
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = fixedDateTimeZone4.getOffset(readableInstant13);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.052");
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(97);
        long long5 = dateTimeZone1.convertLocalToUTC((-349199999L), true, 349200101L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-349200096L) + "'", long5 == (-349200096L));
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone0.getMillisKeepLocal(dateTimeZone2, (long) ' ');
        long long7 = dateTimeZone2.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long11 = dateTimeZone2.convertLocalToUTC((long) (byte) 0, false);
        long long14 = dateTimeZone2.convertLocalToUTC(0L, true);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone2.getShortName((-349200165L), locale16);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-349199868L) + "'", long4 == (-349199868L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349200001L) + "'", long7 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349200000L) + "'", long11 == (-349200000L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-349200000L) + "'", long14 == (-349200000L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(97L);
        java.lang.String str12 = fixedDateTimeZone4.getNameKey(349200010L);
        boolean boolean13 = fixedDateTimeZone4.isFixed();
        java.lang.String str15 = fixedDateTimeZone4.getNameKey((long) 0);
        boolean boolean17 = fixedDateTimeZone4.isStandardOffset((-3599900L));
        java.lang.String str19 = fixedDateTimeZone4.getShortName((-349200290L));
        long long23 = fixedDateTimeZone4.convertLocalToUTC((-699000036L), true, 3660000L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-699000136L) + "'", long23 == (-699000136L));
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        java.util.TimeZone timeZone9 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str11 = fixedDateTimeZone4.getNameKey(100L);
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getName(698399932L, locale13);
        long long17 = fixedDateTimeZone4.convertLocalToUTC((-698399748L), true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+97:00" + "'", str11, "+97:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-698399848L) + "'", long17 == (-698399848L));
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        java.util.Locale locale8 = null;
        java.lang.String str9 = fixedDateTimeZone4.getName((-349200001L), locale8);
        java.util.TimeZone timeZone10 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime5);
        boolean boolean8 = fixedDateTimeZone4.isStandardOffset((long) '4');
        java.lang.String str10 = fixedDateTimeZone4.getShortName((-100L));
        int int12 = fixedDateTimeZone4.getStandardOffset((-162L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.100" + "'", str10, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.util.TimeZone timeZone12 = fixedDateTimeZone4.toTimeZone();
        long long16 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) 100, false, 32L);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = fixedDateTimeZone4.getOffset(readableInstant19);
        int int22 = fixedDateTimeZone4.getStandardOffset((-698399936L));
        java.lang.String str24 = fixedDateTimeZone4.getNameKey((-349200236L));
        int int26 = fixedDateTimeZone4.getOffset((-349200001L));
        int int28 = fixedDateTimeZone4.getOffsetFromLocal((-349139868L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+97:00" + "'", str24, "+97:00");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone0.getMillisKeepLocal(dateTimeZone2, (long) ' ');
        long long7 = dateTimeZone2.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long10 = dateTimeZone2.convertUTCToLocal(0L);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone2.getOffset(readableInstant11);
        long long14 = dateTimeZone2.convertUTCToLocal((long) (short) 10);
        java.lang.String str15 = dateTimeZone2.toString();
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone2.getOffset(readableInstant16);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.lang.String str19 = dateTimeZone2.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349200001L) + "'", long7 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 349200000 + "'", int12 == 349200000);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 349200010L + "'", long14 == 349200010L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 349200000 + "'", int17 == 349200000);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+97:00" + "'", str19, "+97:00");
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        int int12 = fixedDateTimeZone4.getStandardOffset(1L);
        long long16 = fixedDateTimeZone4.convertLocalToUTC((long) '4', false, (long) (short) 1);
        long long18 = fixedDateTimeZone4.nextTransition(0L);
        long long21 = fixedDateTimeZone4.adjustOffset((-99L), true);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long26 = dateTimeZone22.getMillisKeepLocal(dateTimeZone24, (long) ' ');
        long long29 = dateTimeZone24.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone24);
        long long33 = dateTimeZone24.convertLocalToUTC((long) (byte) 0, false);
        java.lang.String str34 = dateTimeZone24.toString();
        java.lang.String str35 = dateTimeZone24.toString();
        long long37 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone24, (-349199965L));
        int int39 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 100);
        long long41 = fixedDateTimeZone4.nextTransition(59700L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-48L) + "'", long16 == (-48L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-99L) + "'", long21 == (-99L));
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32L + "'", long26 == 32L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-349200001L) + "'", long29 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-349200000L) + "'", long33 == (-349200000L));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+97:00" + "'", str34, "+97:00");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+97:00" + "'", str35, "+97:00");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-698399865L) + "'", long37 == (-698399865L));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 59700L + "'", long41 == 59700L);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.100");
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((-349200048L), locale3);
        boolean boolean6 = dateTimeZone1.isStandardOffset((-99L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.100" + "'", str4, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition((long) (short) 0);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str12 = fixedDateTimeZone4.toString();
        java.util.TimeZone timeZone13 = fixedDateTimeZone4.toTimeZone();
        long long16 = fixedDateTimeZone4.adjustOffset((-698399999L), true);
        boolean boolean18 = fixedDateTimeZone4.isStandardOffset(0L);
        boolean boolean19 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-698399999L) + "'", long16 == (-698399999L));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("-01:00");
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        int int9 = fixedDateTimeZone4.getOffset((long) '#');
        java.lang.String str11 = fixedDateTimeZone4.getNameKey((-349200136L));
        java.lang.Class<?> wildcardClass12 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+97:00" + "'", str11, "+97:00");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-68L));
        java.lang.String str8 = fixedDateTimeZone4.getID();
        long long12 = fixedDateTimeZone4.convertLocalToUTC(135L, false, (-698400101L));
        java.lang.String str13 = fixedDateTimeZone4.getID();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone18 = new org.joda.time.tz.FixedDateTimeZone("hi!", "-00:00:00.001", 60000, 97);
        java.util.Locale locale20 = null;
        java.lang.String str21 = fixedDateTimeZone18.getName((-164L), locale20);
        long long23 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone18, 300L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+97:00" + "'", str8, "+97:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 38L + "'", long12 == 38L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:01" + "'", str21, "+00:01");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-59603L) + "'", long23 == (-59603L));
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
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
        java.util.TimeZone timeZone25 = fixedDateTimeZone4.toTimeZone();
        long long28 = fixedDateTimeZone4.adjustOffset((long) (byte) -1, false);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long31 = fixedDateTimeZone4.previousTransition((-352860001L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone36 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 100, (int) (byte) 10);
        java.lang.String str38 = fixedDateTimeZone36.getShortName((-349199999L));
        long long41 = fixedDateTimeZone36.adjustOffset(0L, true);
        long long43 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone36, 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+97:00" + "'", str21, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-352860001L) + "'", long31 == (-352860001L));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00:00.100" + "'", str38, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 10);
        long long6 = dateTimeZone2.convertLocalToUTC((-349200036L), false, (-349200036L));
        java.lang.String str8 = dateTimeZone2.getShortName((-3600062L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-349800036L) + "'", long6 == (-349800036L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:10" + "'", str8, "+00:10");
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
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
        int int30 = fixedDateTimeZone14.getOffsetFromLocal((-68L));
        java.lang.String str32 = fixedDateTimeZone14.getNameKey((-349200201L));
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+97:00" + "'", str32, "+97:00");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "+00:00", (int) '#', (int) (short) 10);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:10", "+32:00", (int) (byte) -1, 6720000);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        java.lang.String str12 = fixedDateTimeZone4.getNameKey((-349199968L));
        java.lang.String str13 = fixedDateTimeZone4.getID();
        int int15 = fixedDateTimeZone4.getOffsetFromLocal((-349200101L));
        int int17 = fixedDateTimeZone4.getOffsetFromLocal((-68L));
        java.lang.String str19 = fixedDateTimeZone4.getName((-349200099L));
        long long22 = fixedDateTimeZone4.adjustOffset((-349200100L), true);
        java.lang.String str24 = fixedDateTimeZone4.getShortName(200L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-349200100L) + "'", long22 == (-349200100L));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:01", "+01:00", 100, 32);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.util.TimeZone timeZone8 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone14 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str16 = fixedDateTimeZone14.getNameKey(100L);
        long long20 = fixedDateTimeZone14.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone21 = fixedDateTimeZone14.toTimeZone();
        java.util.TimeZone timeZone22 = fixedDateTimeZone14.toTimeZone();
        long long26 = fixedDateTimeZone14.convertLocalToUTC((long) (byte) 100, false, 32L);
        long long28 = dateTimeZone9.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone14, 132L);
        long long31 = dateTimeZone9.convertLocalToUTC((-46L), false);
        long long34 = dateTimeZone9.convertLocalToUTC((-106L), false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-100L) + "'", long20 == (-100L));
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 32L + "'", long28 == 32L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-46L) + "'", long31 == (-46L));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-106L) + "'", long34 == (-106L));
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition((long) (short) 0);
        int int12 = fixedDateTimeZone4.getOffsetFromLocal((long) 'a');
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        long long9 = fixedDateTimeZone4.previousTransition((long) '4');
        long long13 = fixedDateTimeZone4.convertLocalToUTC((-349199968L), false, (long) '#');
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.lang.String str15 = fixedDateTimeZone4.toString();
        boolean boolean16 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-349200068L) + "'", long13 == (-349200068L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "+00:00:00.100", 115800000, 0);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        java.lang.String str9 = fixedDateTimeZone4.getNameKey((-349199901L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone14 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str16 = fixedDateTimeZone14.getNameKey(0L);
        java.util.Locale locale18 = null;
        java.lang.String str19 = fixedDateTimeZone14.getShortName(31L, locale18);
        long long21 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone14, (long) 0);
        int int23 = fixedDateTimeZone14.getStandardOffset((-48L));
        long long25 = fixedDateTimeZone14.previousTransition((long) (byte) -1);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone30 = new org.joda.time.tz.FixedDateTimeZone("", "hi!", 349200000, 10);
        java.lang.String str32 = fixedDateTimeZone30.getShortName((-349199990L));
        java.util.Locale locale34 = null;
        java.lang.String str35 = fixedDateTimeZone30.getShortName((long) (short) -1, locale34);
        boolean boolean36 = fixedDateTimeZone14.equals((java.lang.Object) locale34);
        long long38 = fixedDateTimeZone14.previousTransition((-698400100L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+97:00" + "'", str32, "+97:00");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+97:00" + "'", str35, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-698400100L) + "'", long38 == (-698400100L));
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone1.convertLocalToUTC((long) (byte) 1, false);
        java.lang.String str6 = dateTimeZone1.getShortName((long) ' ');
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getName((long) (byte) 0, locale8);
        long long12 = dateTimeZone1.adjustOffset((long) (-1), true);
        java.lang.String str14 = dateTimeZone1.getShortName((-349200099L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-349199999L) + "'", long4 == (-349199999L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+97:00" + "'", str14, "+97:00");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long7 = dateTimeZone4.convertLocalToUTC((long) (byte) 1, false);
        java.lang.String str9 = dateTimeZone4.getShortName((long) ' ');
        long long11 = dateTimeZone0.getMillisKeepLocal(dateTimeZone4, 0L);
        long long13 = dateTimeZone0.convertUTCToLocal(32L);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone0.getShortName((-1L), locale15);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone22 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str24 = fixedDateTimeZone22.getNameKey((long) 1);
        boolean boolean25 = fixedDateTimeZone22.isFixed();
        long long27 = fixedDateTimeZone22.previousTransition((long) '4');
        long long30 = fixedDateTimeZone22.convertLocalToUTC((-349199936L), false);
        long long32 = dateTimeZone0.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone22, (-101L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone37 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 100, (int) (byte) 10);
        java.lang.String str39 = fixedDateTimeZone37.getShortName((-349199999L));
        long long42 = fixedDateTimeZone37.adjustOffset(0L, true);
        long long45 = fixedDateTimeZone37.adjustOffset((-349200136L), true);
        long long47 = dateTimeZone0.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone37, (-349199900L));
        long long50 = dateTimeZone0.convertLocalToUTC((-349199968L), false);
        org.joda.time.ReadableInstant readableInstant51 = null;
        int int52 = dateTimeZone0.getOffset(readableInstant51);
        java.util.Locale locale54 = null;
        java.lang.String str55 = dateTimeZone0.getName(3660100L, locale54);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199999L) + "'", long7 == (-349199999L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349200001L) + "'", long11 == (-349200001L));
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 31L + "'", long13 == 31L);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+97:00" + "'", str24, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 52L + "'", long27 == 52L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-349200036L) + "'", long30 == (-349200036L));
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-202L) + "'", long32 == (-202L));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00:00.100" + "'", str39, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-349200136L) + "'", long45 == (-349200136L));
// flaky:         org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-349200001L) + "'", long47 == (-349200001L));
// flaky:         org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-349199967L) + "'", long50 == (-349199967L));
// flaky:         org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "-00:00:00.001" + "'", str55, "-00:00:00.001");
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(6720000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(97L);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.util.TimeZone timeZone14 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone15);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
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
        int int30 = fixedDateTimeZone14.getOffsetFromLocal((-68L));
        long long32 = fixedDateTimeZone14.nextTransition((-349199966L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone37 = new org.joda.time.tz.FixedDateTimeZone("+00:01", "+00:00:00.100", 0, 100);
        long long39 = fixedDateTimeZone37.previousTransition((-349200036L));
        long long43 = fixedDateTimeZone37.convertLocalToUTC((-125999903L), true, (-349199999L));
        org.joda.time.ReadableInstant readableInstant44 = null;
        int int45 = fixedDateTimeZone37.getOffset(readableInstant44);
        long long47 = fixedDateTimeZone14.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone37, 349199900L);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-349199966L) + "'", long32 == (-349199966L));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-349200036L) + "'", long39 == (-349200036L));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-125999903L) + "'", long43 == (-125999903L));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 349200000L + "'", long47 == 349200000L);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone5 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long7 = fixedDateTimeZone5.previousTransition((long) ' ');
        long long9 = fixedDateTimeZone5.previousTransition((long) 'a');
        long long11 = fixedDateTimeZone5.previousTransition((long) (short) 0);
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone5.getName((long) (-1), locale13);
        long long16 = dateTimeZone0.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone5, (long) 97);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = fixedDateTimeZone5.isLocalDateTimeGap(localDateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+97:32");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+97:32\" is malformed at \"97:32\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        java.lang.String str12 = fixedDateTimeZone4.getNameKey((-349199968L));
        java.lang.String str13 = fixedDateTimeZone4.getID();
        int int15 = fixedDateTimeZone4.getOffsetFromLocal((-349200101L));
        int int17 = fixedDateTimeZone4.getOffsetFromLocal((-68L));
        java.lang.String str19 = fixedDateTimeZone4.getName((-349200099L));
        boolean boolean21 = fixedDateTimeZone4.isStandardOffset((-349200201L));
        long long24 = fixedDateTimeZone4.adjustOffset((-349200101L), true);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone29 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str31 = fixedDateTimeZone29.getNameKey((long) 1);
        long long33 = fixedDateTimeZone29.nextTransition((long) (short) 100);
        java.lang.String str35 = fixedDateTimeZone29.getNameKey(97L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone40 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str42 = fixedDateTimeZone40.getNameKey((long) 1);
        long long44 = fixedDateTimeZone40.nextTransition((long) (short) 100);
        java.lang.String str46 = fixedDateTimeZone40.getNameKey(97L);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone40);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone40);
        boolean boolean49 = fixedDateTimeZone29.equals((java.lang.Object) fixedDateTimeZone40);
        java.util.TimeZone timeZone50 = fixedDateTimeZone29.toTimeZone();
        long long53 = fixedDateTimeZone29.adjustOffset((long) (byte) -1, false);
        long long55 = fixedDateTimeZone29.previousTransition(132L);
        java.util.Locale locale57 = null;
        java.lang.String str58 = fixedDateTimeZone29.getShortName((-349199935L), locale57);
        int int60 = fixedDateTimeZone29.getOffsetFromLocal((-1L));
        long long62 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone29, (-349199965L));
        java.lang.String str63 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-349200101L) + "'", long24 == (-349200101L));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+97:00" + "'", str31, "+97:00");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 100L + "'", long33 == 100L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+97:00" + "'", str35, "+97:00");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+97:00" + "'", str42, "+97:00");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 100L + "'", long44 == 100L);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+97:00" + "'", str46, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(timeZone50);
        org.junit.Assert.assertEquals(timeZone50.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-1L) + "'", long53 == (-1L));
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 132L + "'", long55 == 132L);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "+00:00:00.100" + "'", str58, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 100 + "'", int60 == 100);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-349199965L) + "'", long62 == (-349199965L));
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "+97:00" + "'", str63, "+97:00");
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        java.lang.String str8 = fixedDateTimeZone4.getNameKey(10L);
        boolean boolean10 = fixedDateTimeZone4.isStandardOffset((-3600162L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+97:00" + "'", str8, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
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
        long long38 = fixedDateTimeZone4.convertLocalToUTC(349199770L, false);
        java.lang.String str40 = fixedDateTimeZone4.getShortName((long) (byte) -1);
        int int42 = fixedDateTimeZone4.getOffset((-352860101L));
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
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 349199670L + "'", long38 == 349199670L);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00:00.100" + "'", str40, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime11);
        boolean boolean13 = fixedDateTimeZone4.isFixed();
        int int15 = fixedDateTimeZone4.getOffset((-349200099L));
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.util.TimeZone timeZone17 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone18);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.052", "hi!", 115800000, 115200000);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("-00:00:00.001", "+00:00:00.032", 10, (-1));
        java.lang.String str5 = fixedDateTimeZone4.toString();
        long long8 = fixedDateTimeZone4.convertLocalToUTC((-349199999L), true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-349200009L) + "'", long8 == (-349200009L));
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 349200000);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) 10, true);
        java.util.Locale locale15 = null;
        java.lang.String str16 = fixedDateTimeZone4.getShortName((long) 'a', locale15);
        java.lang.String str18 = fixedDateTimeZone4.getName((-349199999L));
        java.lang.String str20 = fixedDateTimeZone4.getNameKey((-349200096L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-90L) + "'", long13 == (-90L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.100" + "'", str18, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+97:00" + "'", str20, "+97:00");
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getShortName(0L, locale13);
        long long17 = fixedDateTimeZone4.convertLocalToUTC((-349200298L), true);
        int int19 = fixedDateTimeZone4.getOffset((-59603L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-349200398L) + "'", long17 == (-349200398L));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        long long12 = fixedDateTimeZone4.previousTransition((-349199990L));
        java.lang.String str13 = fixedDateTimeZone4.getID();
        long long17 = fixedDateTimeZone4.convertLocalToUTC((-62L), false, (long) 100);
        int int19 = fixedDateTimeZone4.getOffsetFromLocal((-348599968L));
        long long22 = fixedDateTimeZone4.adjustOffset(300L, false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349199990L) + "'", long12 == (-349199990L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-162L) + "'", long17 == (-162L));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 300L + "'", long22 == 300L);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("-01:00", "+97:01", (int) (short) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass5 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
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
        int int26 = fixedDateTimeZone15.getStandardOffset((long) ' ');
        java.lang.String str28 = fixedDateTimeZone15.getNameKey((long) (short) -1);
        long long32 = fixedDateTimeZone15.convertLocalToUTC((-349199901L), false, (-90L));
        java.util.Locale locale34 = null;
        java.lang.String str35 = fixedDateTimeZone15.getName((-62L), locale34);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+97:00" + "'", str21, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+97:00" + "'", str28, "+97:00");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-349200001L) + "'", long32 == (-349200001L));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00:00.100" + "'", str35, "+00:00:00.100");
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("UTC", "UTC", 0, (-1));
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        java.lang.Class<?> wildcardClass6 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 100, (int) (byte) 10);
        long long7 = fixedDateTimeZone4.adjustOffset((-349199936L), true);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone12 = new org.joda.time.tz.FixedDateTimeZone("", "hi!", 349200000, 10);
        long long16 = fixedDateTimeZone12.convertLocalToUTC((-349800036L), false, 0L);
        long long18 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone12, 3L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199936L) + "'", long7 == (-349199936L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-699000036L) + "'", long16 == (-699000036L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-349199897L) + "'", long18 == (-349199897L));
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        java.lang.String str9 = fixedDateTimeZone4.getNameKey((-349199901L));
        long long11 = fixedDateTimeZone4.nextTransition((-68L));
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = fixedDateTimeZone4.getOffset(readableInstant12);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone18 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long20 = fixedDateTimeZone18.previousTransition((long) ' ');
        long long22 = fixedDateTimeZone18.previousTransition((long) 'a');
        long long24 = fixedDateTimeZone18.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone29 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long31 = fixedDateTimeZone18.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone29, (long) ' ');
        boolean boolean32 = fixedDateTimeZone29.isFixed();
        long long35 = fixedDateTimeZone29.convertLocalToUTC((-349199999L), false);
        boolean boolean36 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone29);
        java.util.Locale locale38 = null;
        java.lang.String str39 = fixedDateTimeZone29.getName((-349200036L), locale38);
        java.lang.String str41 = fixedDateTimeZone29.getShortName(698399935L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone46 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str48 = fixedDateTimeZone46.getNameKey((long) 1);
        long long50 = fixedDateTimeZone46.nextTransition((long) (short) 100);
        java.lang.String str52 = fixedDateTimeZone46.getNameKey(97L);
        java.lang.String str54 = fixedDateTimeZone46.getNameKey(349200010L);
        boolean boolean55 = fixedDateTimeZone46.isFixed();
        java.lang.String str57 = fixedDateTimeZone46.getNameKey((long) 0);
        boolean boolean59 = fixedDateTimeZone46.isStandardOffset((-349199968L));
        java.lang.String str61 = fixedDateTimeZone46.getShortName(0L);
        boolean boolean62 = fixedDateTimeZone29.equals((java.lang.Object) str61);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-68L) + "'", long11 == (-68L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 97L + "'", long22 == 97L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 349200000L + "'", long24 == 349200000L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 35L + "'", long31 == 35L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-349200096L) + "'", long35 == (-349200096L));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00:00.097" + "'", str39, "+00:00:00.097");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00:00.097" + "'", str41, "+00:00:00.097");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+97:00" + "'", str48, "+97:00");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 100L + "'", long50 == 100L);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "+97:00" + "'", str52, "+97:00");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "+97:00" + "'", str54, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "+97:00" + "'", str57, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "+00:00:00.100" + "'", str61, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long15 = dateTimeZone11.getMillisKeepLocal(dateTimeZone13, (long) ' ');
        long long18 = dateTimeZone13.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        long long22 = dateTimeZone13.convertLocalToUTC((long) (byte) 0, false);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long26 = dateTimeZone13.getMillisKeepLocal(dateTimeZone24, (long) 1);
        long long28 = dateTimeZone10.getMillisKeepLocal(dateTimeZone13, (long) 0);
        boolean boolean29 = fixedDateTimeZone4.equals((java.lang.Object) dateTimeZone10);
        java.lang.String str31 = fixedDateTimeZone4.getShortName((long) (byte) 1);
        java.util.TimeZone timeZone32 = null;
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
        java.lang.String str34 = dateTimeZone33.getID();
        long long36 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone33, (-90L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone41 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str43 = fixedDateTimeZone41.getNameKey((long) 1);
        boolean boolean44 = fixedDateTimeZone41.isFixed();
        long long46 = fixedDateTimeZone41.previousTransition((long) '4');
        long long49 = fixedDateTimeZone41.convertLocalToUTC((-349199936L), false);
        java.lang.String str50 = fixedDateTimeZone41.getID();
        int int52 = fixedDateTimeZone41.getOffset(0L);
        boolean boolean53 = fixedDateTimeZone4.equals((java.lang.Object) int52);
        java.util.Locale locale55 = null;
        java.lang.String str56 = fixedDateTimeZone4.getName(0L, locale55);
        java.lang.String str58 = fixedDateTimeZone4.getNameKey(349200133L);
        long long61 = fixedDateTimeZone4.convertLocalToUTC(59901L, false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-349199868L) + "'", long15 == (-349199868L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-349200001L) + "'", long18 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-349200000L) + "'", long22 == (-349200000L));
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00:00.100" + "'", str31, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+97:00" + "'", str34, "+97:00");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-349199990L) + "'", long36 == (-349199990L));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+97:00" + "'", str43, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 52L + "'", long46 == 52L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-349200036L) + "'", long49 == (-349200036L));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+97:00" + "'", str50, "+97:00");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "+00:00:00.100" + "'", str56, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "+97:00" + "'", str58, "+97:00");
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 59801L + "'", long61 == 59801L);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long9 = fixedDateTimeZone4.adjustOffset((long) (short) 100, false);
        java.util.Locale locale11 = null;
        java.lang.String str12 = fixedDateTimeZone4.getShortName((long) (byte) 1, locale11);
        long long14 = fixedDateTimeZone4.convertUTCToLocal((-349199935L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-349199835L) + "'", long14 == (-349199835L));
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long17 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, (long) ' ');
        long long19 = fixedDateTimeZone4.nextTransition(0L);
        long long22 = fixedDateTimeZone4.adjustOffset((-349199901L), true);
        java.lang.String str24 = fixedDateTimeZone4.getShortName((-349199900L));
        long long28 = fixedDateTimeZone4.convertLocalToUTC(0L, false, (-698399848L));
        long long30 = fixedDateTimeZone4.previousTransition((long) '4');
        long long32 = fixedDateTimeZone4.convertUTCToLocal((-698400099L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-349199901L) + "'", long22 == (-349199901L));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-100L) + "'", long28 == (-100L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 52L + "'", long30 == 52L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-698399999L) + "'", long32 == (-698399999L));
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00", "+10:00", (int) '#', 35);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.util.TimeZone timeZone12 = fixedDateTimeZone4.toTimeZone();
        long long16 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) 100, false, 32L);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = fixedDateTimeZone4.getOffset(readableInstant19);
        int int22 = fixedDateTimeZone4.getStandardOffset((-698399936L));
        java.lang.String str24 = fixedDateTimeZone4.getNameKey((-349200236L));
        long long26 = fixedDateTimeZone4.nextTransition(349200032L);
        java.lang.String str28 = fixedDateTimeZone4.getNameKey((-3600062L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+97:00" + "'", str24, "+97:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 349200032L + "'", long26 == 349200032L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+97:00" + "'", str28, "+97:00");
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.util.TimeZone timeZone12 = fixedDateTimeZone4.toTimeZone();
        long long16 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) 100, false, 32L);
        int int18 = fixedDateTimeZone4.getOffsetFromLocal((-133L));
        java.lang.String str20 = fixedDateTimeZone4.getShortName((-48L));
        long long23 = fixedDateTimeZone4.convertLocalToUTC(300L, true);
        boolean boolean24 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 200L + "'", long23 == 200L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "+10:35", 0, (int) '#');
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        long long8 = fixedDateTimeZone4.convertLocalToUTC(349200000L, true);
        long long11 = fixedDateTimeZone4.convertLocalToUTC(0L, false);
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getName((-349200009L), locale13);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 349200000L + "'", long8 == 349200000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00", "+00:00:00.032", (int) (short) -1, (int) (short) 10);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.lang.String str6 = fixedDateTimeZone4.getID();
        java.lang.String str8 = fixedDateTimeZone4.getNameKey((-349200101L));
        long long10 = fixedDateTimeZone4.convertUTCToLocal(0L);
        java.util.Locale locale12 = null;
        java.lang.String str13 = fixedDateTimeZone4.getShortName(349200034L, locale12);
        long long15 = fixedDateTimeZone4.previousTransition((-43L));
        java.lang.String str16 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.032" + "'", str8, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-43L) + "'", long15 == (-43L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.097", "+00:10", 115200000, 349200000);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        java.util.TimeZone timeZone6 = fixedDateTimeZone4.toTimeZone();
        int int8 = fixedDateTimeZone4.getOffset((-349199990L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.util.TimeZone timeZone12 = fixedDateTimeZone4.toTimeZone();
        long long16 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) 100, false, 32L);
        int int18 = fixedDateTimeZone4.getOffsetFromLocal((-133L));
        java.lang.String str20 = fixedDateTimeZone4.getShortName((-48L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone25 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long27 = fixedDateTimeZone25.nextTransition((long) 10);
        boolean boolean28 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone25);
        boolean boolean29 = fixedDateTimeZone4.isFixed();
        long long31 = fixedDateTimeZone4.nextTransition((-3600162L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L + "'", long27 == 10L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-3600162L) + "'", long31 == (-3600162L));
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(97L);
        java.lang.String str12 = fixedDateTimeZone4.getNameKey(349200010L);
        long long14 = fixedDateTimeZone4.previousTransition((-115200000L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115200000L) + "'", long14 == (-115200000L));
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, 60000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 60000");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        java.lang.String str12 = fixedDateTimeZone4.getNameKey((-349199968L));
        java.lang.String str13 = fixedDateTimeZone4.getID();
        int int15 = fixedDateTimeZone4.getOffsetFromLocal((-349200101L));
        int int17 = fixedDateTimeZone4.getOffsetFromLocal((-68L));
        java.lang.String str19 = fixedDateTimeZone4.getName((-349200099L));
        boolean boolean21 = fixedDateTimeZone4.isStandardOffset((-349200201L));
        long long24 = fixedDateTimeZone4.adjustOffset((-349200101L), true);
        org.joda.time.ReadableInstant readableInstant25 = null;
        int int26 = fixedDateTimeZone4.getOffset(readableInstant25);
        java.lang.Class<?> wildcardClass27 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-349200101L) + "'", long24 == (-349200101L));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long17 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, (long) ' ');
        boolean boolean18 = fixedDateTimeZone15.isFixed();
        long long21 = fixedDateTimeZone15.convertLocalToUTC((-349199999L), false);
        long long23 = fixedDateTimeZone15.previousTransition((-68L));
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = fixedDateTimeZone15.getOffset(readableInstant24);
        long long27 = fixedDateTimeZone15.nextTransition((-59965L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-349200096L) + "'", long21 == (-349200096L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-68L) + "'", long23 == (-68L));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-59965L) + "'", long27 == (-59965L));
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long4 = dateTimeZone0.convertLocalToUTC((-349200001L), false, (long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str7 = dateTimeZone5.getShortName((long) (byte) 0);
        long long9 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, 0L);
        long long12 = dateTimeZone0.adjustOffset((long) (byte) 100, false);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone0.getShortName((long) (short) 100, locale14);
        org.joda.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = dateTimeZone0.isLocalDateTimeGap(localDateTime16);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone0.getName((-99L), locale19);
        java.lang.String str21 = dateTimeZone0.toString();
        long long24 = dateTimeZone0.adjustOffset((-349199871L), false);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone0.getName(1L, locale26);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-349200101L) + "'", long4 == (-349200101L));
        org.junit.Assert.assertNotNull(dateTimeZone5);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.100" + "'", str7, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+97:00" + "'", str21, "+97:00");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-349199871L) + "'", long24 == (-349199871L));
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.100" + "'", str27, "+00:00:00.100");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
        java.lang.String str21 = fixedDateTimeZone4.getID();
        long long25 = fixedDateTimeZone4.convertLocalToUTC(349199902L, true, 90L);
        java.lang.String str27 = fixedDateTimeZone4.getShortName(35L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+97:00" + "'", str20, "+97:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+97:00" + "'", str21, "+97:00");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 349199802L + "'", long25 == 349199802L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.100" + "'", str27, "+00:00:00.100");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-68L));
        java.lang.String str8 = fixedDateTimeZone4.getID();
        long long12 = fixedDateTimeZone4.convertLocalToUTC(135L, false, (-698400101L));
        java.lang.String str13 = fixedDateTimeZone4.getID();
        java.lang.String str14 = fixedDateTimeZone4.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+97:00" + "'", str8, "+97:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 38L + "'", long12 == 38L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+97:00" + "'", str14, "+97:00");
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("UTC", "UTC", 0, (-1));
        int int6 = fixedDateTimeZone4.getOffsetFromLocal((-349200000L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone11 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long13 = fixedDateTimeZone11.previousTransition((long) ' ');
        long long15 = fixedDateTimeZone11.previousTransition((long) 'a');
        long long17 = fixedDateTimeZone11.previousTransition((long) (short) 0);
        java.util.TimeZone timeZone18 = fixedDateTimeZone11.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone19.getShortName((-349200036L), locale21);
        long long24 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone19, 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
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
        int int30 = fixedDateTimeZone14.getOffsetFromLocal((-68L));
        int int32 = fixedDateTimeZone14.getOffsetFromLocal((long) '4');
        int int34 = fixedDateTimeZone14.getStandardOffset((long) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getShortName(0L, locale13);
        java.lang.String str16 = fixedDateTimeZone4.getNameKey((-101L));
        boolean boolean18 = fixedDateTimeZone4.equals((java.lang.Object) 100L);
        java.util.TimeZone timeZone19 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str21 = fixedDateTimeZone4.getName((-349200101L));
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int24 = fixedDateTimeZone4.getOffset((long) (byte) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.100" + "'", str21, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        long long9 = fixedDateTimeZone4.convertLocalToUTC((long) ' ', true, (long) (byte) 1);
        java.lang.String str10 = fixedDateTimeZone4.toString();
        long long13 = fixedDateTimeZone4.adjustOffset(132L, false);
        boolean boolean15 = fixedDateTimeZone4.isStandardOffset((-349199871L));
        java.util.Locale locale17 = null;
        java.lang.String str18 = fixedDateTimeZone4.getShortName(10L, locale17);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone23 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.util.TimeZone timeZone24 = fixedDateTimeZone23.toTimeZone();
        long long28 = fixedDateTimeZone23.convertLocalToUTC((long) ' ', true, (long) (byte) 1);
        long long30 = fixedDateTimeZone23.previousTransition(0L);
        long long32 = fixedDateTimeZone23.previousTransition((-349200001L));
        org.joda.time.ReadableInstant readableInstant33 = null;
        int int34 = fixedDateTimeZone23.getOffset(readableInstant33);
        boolean boolean35 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long40 = dateTimeZone36.getMillisKeepLocal(dateTimeZone38, (long) ' ');
        long long43 = dateTimeZone38.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone38);
        long long47 = dateTimeZone38.convertLocalToUTC((long) (byte) 0, false);
        java.util.Locale locale49 = null;
        java.lang.String str50 = dateTimeZone38.getShortName((-59900L), locale49);
        long long52 = fixedDateTimeZone23.getMillisKeepLocal(dateTimeZone38, (-349199933L));
        java.lang.Class<?> wildcardClass53 = dateTimeZone38.getClass();
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-68L) + "'", long9 == (-68L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 132L + "'", long13 == 132L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.100" + "'", str18, "+00:00:00.100");
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-68L) + "'", long28 == (-68L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-349200001L) + "'", long32 == (-349200001L));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-349199868L) + "'", long40 == (-349199868L));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-349200001L) + "'", long43 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-349200000L) + "'", long47 == (-349200000L));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+97:00" + "'", str50, "+97:00");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-698399833L) + "'", long52 == (-698399833L));
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime11);
        boolean boolean13 = fixedDateTimeZone4.isFixed();
        int int15 = fixedDateTimeZone4.getOffset((-349200099L));
        long long17 = fixedDateTimeZone4.nextTransition((-698400201L));
        int int19 = fixedDateTimeZone4.getOffsetFromLocal(135L);
        java.lang.Class<?> wildcardClass20 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-698400201L) + "'", long17 == (-698400201L));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        int int6 = fixedDateTimeZone4.getOffset(349200010L);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        java.lang.String str8 = fixedDateTimeZone4.getID();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long15 = fixedDateTimeZone13.nextTransition((-101L));
        int int17 = fixedDateTimeZone13.getStandardOffset((long) (byte) -1);
        int int19 = fixedDateTimeZone13.getOffsetFromLocal(10L);
        long long22 = fixedDateTimeZone13.convertLocalToUTC((-349199868L), false);
        long long24 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone13, 0L);
        int int26 = fixedDateTimeZone4.getOffset((long) 1);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone31 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        org.joda.time.LocalDateTime localDateTime32 = null;
        boolean boolean33 = fixedDateTimeZone31.isLocalDateTimeGap(localDateTime32);
        java.lang.String str35 = fixedDateTimeZone31.getNameKey(135L);
        boolean boolean36 = fixedDateTimeZone4.equals((java.lang.Object) 135L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+97:00" + "'", str8, "+97:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-101L) + "'", long15 == (-101L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-349199968L) + "'", long22 == (-349199968L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-3L) + "'", long24 == (-3L));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+97:00" + "'", str35, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
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
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime27);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone33 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        boolean boolean34 = fixedDateTimeZone33.isFixed();
        java.util.TimeZone timeZone35 = fixedDateTimeZone33.toTimeZone();
        boolean boolean36 = fixedDateTimeZone33.isFixed();
        boolean boolean37 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone33);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, 115800000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 115800000");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        long long12 = fixedDateTimeZone4.previousTransition((-349199990L));
        java.lang.String str13 = fixedDateTimeZone4.getID();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone18 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str20 = fixedDateTimeZone18.getNameKey((long) 1);
        long long22 = fixedDateTimeZone18.nextTransition((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long29 = dateTimeZone25.getMillisKeepLocal(dateTimeZone27, (long) ' ');
        long long32 = dateTimeZone27.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone27);
        long long36 = dateTimeZone27.convertLocalToUTC((long) (byte) 0, false);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long40 = dateTimeZone27.getMillisKeepLocal(dateTimeZone38, (long) 1);
        long long42 = dateTimeZone24.getMillisKeepLocal(dateTimeZone27, (long) 0);
        boolean boolean43 = fixedDateTimeZone18.equals((java.lang.Object) dateTimeZone24);
        java.util.Locale locale45 = null;
        java.lang.String str46 = dateTimeZone24.getName(97L, locale45);
        long long49 = dateTimeZone24.adjustOffset((long) (short) 10, true);
        long long52 = dateTimeZone24.adjustOffset((long) (short) 10, false);
        boolean boolean53 = fixedDateTimeZone4.equals((java.lang.Object) false);
        org.joda.time.LocalDateTime localDateTime54 = null;
        boolean boolean55 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime54);
        java.lang.String str56 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349199990L) + "'", long12 == (-349199990L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+97:00" + "'", str20, "+97:00");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-349199868L) + "'", long29 == (-349199868L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-349200001L) + "'", long32 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-349200000L) + "'", long36 == (-349200000L));
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1L + "'", long40 == 1L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+97:00" + "'", str46, "+97:00");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 10L + "'", long49 == 10L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 10L + "'", long52 == 10L);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "+97:00" + "'", str56, "+97:00");
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        java.lang.String str8 = fixedDateTimeZone4.getNameKey(10L);
        long long11 = fixedDateTimeZone4.convertLocalToUTC((-349200001L), true);
        long long13 = fixedDateTimeZone4.convertUTCToLocal((-68L));
        long long16 = fixedDateTimeZone4.convertLocalToUTC((-349200190L), true);
        java.lang.String str18 = fixedDateTimeZone4.getShortName((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+97:00" + "'", str8, "+97:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349200101L) + "'", long11 == (-349200101L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-349200290L) + "'", long16 == (-349200290L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.100" + "'", str18, "+00:00:00.100");
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        boolean boolean6 = fixedDateTimeZone4.isStandardOffset((long) '#');
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        long long9 = fixedDateTimeZone4.convertUTCToLocal((-48L));
        long long12 = fixedDateTimeZone4.convertLocalToUTC(349200035L, false);
        java.util.TimeZone timeZone13 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime14);
        java.util.Locale locale17 = null;
        java.lang.String str18 = fixedDateTimeZone4.getName((-698399833L), locale17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 49L + "'", long9 == 49L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 349199938L + "'", long12 == 349199938L);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.097" + "'", str18, "+00:00:00.097");
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00", "+00:00:00.032", (int) (short) -1, (int) (short) 10);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.lang.String str6 = fixedDateTimeZone4.getID();
        java.lang.String str8 = fixedDateTimeZone4.getNameKey((-349200101L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str15 = fixedDateTimeZone13.getNameKey((long) 1);
        long long17 = fixedDateTimeZone13.nextTransition((long) (short) 100);
        java.lang.String str19 = fixedDateTimeZone13.getNameKey(97L);
        java.lang.String str21 = fixedDateTimeZone13.getNameKey(349200010L);
        boolean boolean22 = fixedDateTimeZone13.isFixed();
        java.lang.String str24 = fixedDateTimeZone13.getNameKey((long) 0);
        boolean boolean26 = fixedDateTimeZone13.isStandardOffset((-349199968L));
        java.lang.String str28 = fixedDateTimeZone13.getShortName((long) 1);
        long long31 = fixedDateTimeZone13.adjustOffset((-349200097L), false);
        boolean boolean32 = fixedDateTimeZone13.isFixed();
        long long34 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone13, (-349200064L));
        int int36 = fixedDateTimeZone4.getOffsetFromLocal((-348600068L));
        long long38 = fixedDateTimeZone4.convertUTCToLocal((-33L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.032" + "'", str8, "+00:00:00.032");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+97:00" + "'", str19, "+97:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+97:00" + "'", str21, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+97:00" + "'", str24, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.100" + "'", str28, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-349200097L) + "'", long31 == (-349200097L));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-349200165L) + "'", long34 == (-349200165L));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-34L) + "'", long38 == (-34L));
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long7 = dateTimeZone4.convertLocalToUTC((long) (byte) 1, false);
        java.lang.String str9 = dateTimeZone4.getShortName((long) ' ');
        long long11 = dateTimeZone0.getMillisKeepLocal(dateTimeZone4, 0L);
        long long13 = dateTimeZone0.convertUTCToLocal(32L);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone0.getShortName((-1L), locale15);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone22 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str24 = fixedDateTimeZone22.getNameKey((long) 1);
        boolean boolean25 = fixedDateTimeZone22.isFixed();
        long long27 = fixedDateTimeZone22.previousTransition((long) '4');
        long long30 = fixedDateTimeZone22.convertLocalToUTC((-349199936L), false);
        long long32 = dateTimeZone0.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone22, (-101L));
        long long35 = fixedDateTimeZone22.convertLocalToUTC((-349200064L), false);
        java.util.Locale locale37 = null;
        java.lang.String str38 = fixedDateTimeZone22.getShortName((-349200165L), locale37);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-00:00:00.001" + "'", str2, "-00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199999L) + "'", long7 == (-349199999L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349200001L) + "'", long11 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 31L + "'", long13 == 31L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-00:00:00.001" + "'", str16, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+97:00" + "'", str24, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 52L + "'", long27 == 52L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-349200036L) + "'", long30 == (-349200036L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-202L) + "'", long32 == (-202L));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-349200164L) + "'", long35 == (-349200164L));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00:00.100" + "'", str38, "+00:00:00.100");
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(97L);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long13 = fixedDateTimeZone4.nextTransition((long) (byte) 0);
        java.util.TimeZone timeZone14 = fixedDateTimeZone4.toTimeZone();
        long long17 = fixedDateTimeZone4.adjustOffset((-349200096L), true);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int20 = fixedDateTimeZone4.getOffset(59901L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-349200096L) + "'", long17 == (-349200096L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "+01:00", 349200000, (int) (short) 0);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str1 = dateTimeZone0.getID();
        java.lang.Class<?> wildcardClass2 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "+97:00" + "'", str1, "+97:00");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("UTC", "UTC", 0, (-1));
        int int6 = fixedDateTimeZone4.getStandardOffset((-345600501L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        int int12 = fixedDateTimeZone4.getStandardOffset(1L);
        long long16 = fixedDateTimeZone4.convertLocalToUTC((long) '4', false, (long) (short) 1);
        long long18 = fixedDateTimeZone4.previousTransition((-3L));
        long long21 = fixedDateTimeZone4.convertLocalToUTC(1L, false);
        java.util.Locale locale23 = null;
        java.lang.String str24 = fixedDateTimeZone4.getShortName(100L, locale23);
        java.lang.String str25 = fixedDateTimeZone4.getID();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone30 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str32 = fixedDateTimeZone30.getNameKey(100L);
        long long36 = fixedDateTimeZone30.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone37 = fixedDateTimeZone30.toTimeZone();
        java.util.Locale locale39 = null;
        java.lang.String str40 = fixedDateTimeZone30.getShortName(0L, locale39);
        java.lang.String str42 = fixedDateTimeZone30.getNameKey((-101L));
        long long44 = fixedDateTimeZone30.nextTransition((-68L));
        long long46 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone30, 32L);
        long long48 = fixedDateTimeZone30.nextTransition((-349140297L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-48L) + "'", long16 == (-48L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-3L) + "'", long18 == (-3L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-99L) + "'", long21 == (-99L));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+97:00" + "'", str25, "+97:00");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+97:00" + "'", str32, "+97:00");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-100L) + "'", long36 == (-100L));
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00:00.100" + "'", str40, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+97:00" + "'", str42, "+97:00");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-68L) + "'", long44 == (-68L));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 32L + "'", long46 == 32L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-349140297L) + "'", long48 == (-349140297L));
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long17 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, (long) ' ');
        long long19 = fixedDateTimeZone4.nextTransition(0L);
        long long22 = fixedDateTimeZone4.adjustOffset((-349199901L), true);
        org.joda.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime23);
        long long27 = fixedDateTimeZone4.convertLocalToUTC((-349199865L), true);
        java.lang.String str28 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-349199901L) + "'", long22 == (-349199901L));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-349199965L) + "'", long27 == (-349199965L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+97:00" + "'", str28, "+97:00");
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long17 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, (long) ' ');
        boolean boolean18 = fixedDateTimeZone15.isFixed();
        long long21 = fixedDateTimeZone15.convertLocalToUTC((-349199999L), false);
        long long25 = fixedDateTimeZone15.convertLocalToUTC((long) ' ', false, (long) (short) 10);
        long long28 = fixedDateTimeZone15.convertLocalToUTC(35L, true);
        boolean boolean29 = fixedDateTimeZone15.isFixed();
        int int31 = fixedDateTimeZone15.getOffset((long) 97);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-349200096L) + "'", long21 == (-349200096L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-65L) + "'", long25 == (-65L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-62L) + "'", long28 == (-62L));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long17 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, (long) ' ');
        boolean boolean18 = fixedDateTimeZone15.isFixed();
        long long21 = fixedDateTimeZone15.convertLocalToUTC((-349199999L), false);
        long long23 = fixedDateTimeZone15.previousTransition((-68L));
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = fixedDateTimeZone15.getOffset(readableInstant24);
        java.lang.String str27 = fixedDateTimeZone15.getNameKey((-349199868L));
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        java.lang.String str31 = dateTimeZone29.getShortName((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        long long36 = dateTimeZone32.convertLocalToUTC((-349200001L), false, (long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str39 = dateTimeZone37.getShortName((long) (byte) 0);
        long long41 = dateTimeZone32.getMillisKeepLocal(dateTimeZone37, 0L);
        long long43 = dateTimeZone29.getMillisKeepLocal(dateTimeZone37, 100L);
        long long45 = fixedDateTimeZone15.getMillisKeepLocal(dateTimeZone37, 10L);
        int int47 = fixedDateTimeZone15.getStandardOffset(0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-349200096L) + "'", long21 == (-349200096L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-68L) + "'", long23 == (-68L));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+97:00" + "'", str31, "+97:00");
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-349200101L) + "'", long36 == (-349200101L));
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00:00.100" + "'", str39, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 349200000L + "'", long43 == 349200000L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 7L + "'", long45 == 7L);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:01", "+00:00:00.100", 0, 100);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((-100L));
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = fixedDateTimeZone4.getOffset(readableInstant7);
        int int10 = fixedDateTimeZone4.getStandardOffset((-1047599936L));
        long long12 = fixedDateTimeZone4.convertUTCToLocal((-349199833L));
        long long15 = fixedDateTimeZone4.convertLocalToUTC((long) 1, false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349199833L) + "'", long12 == (-349199833L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
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
        java.util.TimeZone timeZone25 = fixedDateTimeZone4.toTimeZone();
        long long27 = fixedDateTimeZone4.previousTransition(149L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+97:00" + "'", str21, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 149L + "'", long27 == 149L);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
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
        int int26 = fixedDateTimeZone15.getStandardOffset((long) ' ');
        java.lang.String str28 = fixedDateTimeZone15.getNameKey((long) (short) -1);
        long long30 = fixedDateTimeZone15.convertUTCToLocal((long) 32);
        long long33 = fixedDateTimeZone15.adjustOffset((-203L), false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+97:00" + "'", str21, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+97:00" + "'", str28, "+97:00");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 132L + "'", long30 == 132L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-203L) + "'", long33 == (-203L));
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "+10:35", 0, (int) '#');
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        long long8 = fixedDateTimeZone4.convertLocalToUTC(349200000L, true);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("+00:00", "+00:00:00.032", (int) (short) -1, (int) (short) 10);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone13);
        java.lang.String str15 = fixedDateTimeZone13.getID();
        boolean boolean16 = fixedDateTimeZone4.equals((java.lang.Object) str15);
        java.util.Locale locale18 = null;
        java.lang.String str19 = fixedDateTimeZone4.getShortName((-349199868L), locale18);
        int int21 = fixedDateTimeZone4.getStandardOffset((-60001L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 349200000L + "'", long8 == 349200000L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        java.lang.String str8 = fixedDateTimeZone4.getNameKey(10L);
        long long12 = fixedDateTimeZone4.convertLocalToUTC(349199799L, false, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+97:00" + "'", str8, "+97:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 349199699L + "'", long12 == 349199699L);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
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
        java.util.TimeZone timeZone25 = fixedDateTimeZone4.toTimeZone();
        long long28 = fixedDateTimeZone4.adjustOffset((long) (byte) -1, false);
        long long30 = fixedDateTimeZone4.previousTransition(132L);
        java.util.Locale locale32 = null;
        java.lang.String str33 = fixedDateTimeZone4.getShortName((-349199935L), locale32);
        org.joda.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime34);
        java.lang.Class<?> wildcardClass36 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+97:00" + "'", str21, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 132L + "'", long30 == 132L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00:00.100" + "'", str33, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "+32:00", (int) ' ', (int) (byte) 10);
        long long6 = fixedDateTimeZone4.nextTransition(97L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long9 = fixedDateTimeZone4.adjustOffset((long) (short) 100, false);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((-349200036L), false, (-48L));
        long long15 = fixedDateTimeZone4.nextTransition(97L);
        java.lang.String str17 = fixedDateTimeZone4.getNameKey(0L);
        boolean boolean18 = fixedDateTimeZone4.isFixed();
        java.util.Locale locale20 = null;
        java.lang.String str21 = fixedDateTimeZone4.getShortName((-64L), locale20);
        long long23 = fixedDateTimeZone4.previousTransition(126059910L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-349200136L) + "'", long13 == (-349200136L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.100" + "'", str21, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 126059910L + "'", long23 == 126059910L);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:10", "-01:00", (int) (byte) 10, 0);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long15 = dateTimeZone11.getMillisKeepLocal(dateTimeZone13, (long) ' ');
        long long18 = dateTimeZone13.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        long long22 = dateTimeZone13.convertLocalToUTC((long) (byte) 0, false);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long26 = dateTimeZone13.getMillisKeepLocal(dateTimeZone24, (long) 1);
        long long28 = dateTimeZone10.getMillisKeepLocal(dateTimeZone13, (long) 0);
        boolean boolean29 = fixedDateTimeZone4.equals((java.lang.Object) dateTimeZone10);
        java.lang.String str31 = fixedDateTimeZone4.getShortName((-349200190L));
        java.lang.String str33 = fixedDateTimeZone4.getNameKey((-68L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-349199868L) + "'", long15 == (-349199868L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-349200001L) + "'", long18 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-349200000L) + "'", long22 == (-349200000L));
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00:00.100" + "'", str31, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+97:00" + "'", str33, "+97:00");
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        java.util.TimeZone timeZone6 = fixedDateTimeZone4.toTimeZone();
        long long8 = fixedDateTimeZone4.nextTransition((-348600068L));
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-348600068L) + "'", long8 == (-348600068L));
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition((long) (short) 0);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        long long14 = fixedDateTimeZone4.convertLocalToUTC(0L, false);
        boolean boolean16 = fixedDateTimeZone4.isStandardOffset(349200010L);
        java.lang.String str17 = fixedDateTimeZone4.toString();
        int int19 = fixedDateTimeZone4.getStandardOffset((-60001L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-100L) + "'", long14 == (-100L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long17 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, (long) ' ');
        int int19 = fixedDateTimeZone4.getOffsetFromLocal((long) (byte) 10);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone24 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str26 = fixedDateTimeZone24.getNameKey(100L);
        long long30 = fixedDateTimeZone24.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone31 = fixedDateTimeZone24.toTimeZone();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone24);
        long long35 = fixedDateTimeZone24.convertLocalToUTC(349200010L, true);
        long long37 = fixedDateTimeZone24.nextTransition((long) (short) 100);
        boolean boolean38 = fixedDateTimeZone4.equals((java.lang.Object) long37);
        long long40 = fixedDateTimeZone4.nextTransition(235L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+97:00" + "'", str26, "+97:00");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-100L) + "'", long30 == (-100L));
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 349199910L + "'", long35 == 349199910L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 100L + "'", long37 == 100L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 235L + "'", long40 == 235L);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.util.TimeZone timeZone12 = fixedDateTimeZone4.toTimeZone();
        long long16 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) 100, false, 32L);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = fixedDateTimeZone4.getOffset(readableInstant19);
        int int22 = fixedDateTimeZone4.getStandardOffset((-698399936L));
        java.lang.String str24 = fixedDateTimeZone4.getShortName(349200035L);
        int int26 = fixedDateTimeZone4.getOffset((-48L));
        org.joda.time.ReadableInstant readableInstant27 = null;
        int int28 = fixedDateTimeZone4.getOffset(readableInstant27);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        java.util.Locale locale7 = null;
        java.lang.String str8 = fixedDateTimeZone4.getShortName((long) (short) 100, locale7);
        java.lang.Class<?> wildcardClass9 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.001", "-01:01", 115200000, (int) ' ');
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone9 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str11 = fixedDateTimeZone9.getNameKey((long) 1);
        long long14 = fixedDateTimeZone9.convertLocalToUTC((-101L), true);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone19 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str21 = fixedDateTimeZone19.getNameKey((long) 1);
        long long23 = fixedDateTimeZone19.nextTransition((long) (short) 100);
        java.lang.String str25 = fixedDateTimeZone19.getNameKey(97L);
        java.lang.String str27 = fixedDateTimeZone19.getNameKey(349200010L);
        boolean boolean28 = fixedDateTimeZone19.isFixed();
        java.lang.String str30 = fixedDateTimeZone19.getName((long) 'a');
        boolean boolean31 = fixedDateTimeZone9.equals((java.lang.Object) fixedDateTimeZone19);
        java.lang.String str33 = fixedDateTimeZone19.getName(31L);
        int int35 = fixedDateTimeZone19.getOffset((-349200001L));
        boolean boolean36 = fixedDateTimeZone4.equals((java.lang.Object) (-349200001L));
        long long39 = fixedDateTimeZone4.convertLocalToUTC((-3599900L), true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+97:00" + "'", str11, "+97:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-201L) + "'", long14 == (-201L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+97:00" + "'", str21, "+97:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+97:00" + "'", str25, "+97:00");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+97:00" + "'", str27, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.100" + "'", str30, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00:00.100" + "'", str33, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-118799900L) + "'", long39 == (-118799900L));
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long17 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, (long) ' ');
        boolean boolean18 = fixedDateTimeZone15.isFixed();
        long long21 = fixedDateTimeZone15.convertLocalToUTC((-349199999L), false);
        boolean boolean23 = fixedDateTimeZone15.isStandardOffset(52L);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 10);
        java.lang.String str28 = dateTimeZone26.getShortName((-698400001L));
        long long30 = fixedDateTimeZone15.getMillisKeepLocal(dateTimeZone26, (-349200236L));
        long long32 = fixedDateTimeZone15.nextTransition((-349200001L));
        org.joda.time.ReadableInstant readableInstant33 = null;
        int int34 = fixedDateTimeZone15.getOffset(readableInstant33);
        java.lang.String str36 = fixedDateTimeZone15.getNameKey((long) (short) -1);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone41 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long43 = fixedDateTimeZone41.previousTransition((long) ' ');
        long long45 = fixedDateTimeZone41.previousTransition((long) 'a');
        long long47 = fixedDateTimeZone41.previousTransition((long) (short) 0);
        java.util.TimeZone timeZone48 = fixedDateTimeZone41.toTimeZone();
        java.lang.String str50 = fixedDateTimeZone41.getNameKey((-349200100L));
        int int52 = fixedDateTimeZone41.getOffset((-101L));
        long long54 = fixedDateTimeZone15.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone41, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-349200096L) + "'", long21 == (-349200096L));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:10" + "'", str28, "+00:10");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-349800139L) + "'", long30 == (-349800139L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-349200001L) + "'", long32 == (-349200001L));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 32L + "'", long43 == 32L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 97L + "'", long45 == 97L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(timeZone48);
        org.junit.Assert.assertEquals(timeZone48.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+97:00" + "'", str50, "+97:00");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-3L) + "'", long54 == (-3L));
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        int int10 = fixedDateTimeZone4.getStandardOffset((long) (short) 0);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) 0, true);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone18 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        boolean boolean20 = fixedDateTimeZone18.isStandardOffset((long) '#');
        boolean boolean21 = fixedDateTimeZone4.equals((java.lang.Object) boolean20);
        java.lang.String str22 = fixedDateTimeZone4.toString();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone27 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str29 = fixedDateTimeZone27.getNameKey((long) 1);
        int int31 = fixedDateTimeZone27.getOffset(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone36 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long38 = fixedDateTimeZone36.previousTransition((long) ' ');
        long long40 = fixedDateTimeZone36.previousTransition((long) 'a');
        long long42 = fixedDateTimeZone36.previousTransition(349200000L);
        long long44 = fixedDateTimeZone27.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone36, 35L);
        java.util.Locale locale46 = null;
        java.lang.String str47 = fixedDateTimeZone36.getShortName((long) (short) -1, locale46);
        boolean boolean48 = fixedDateTimeZone4.equals((java.lang.Object) str47);
        long long50 = fixedDateTimeZone4.convertUTCToLocal(349199934L);
        org.joda.time.LocalDateTime localDateTime51 = null;
        boolean boolean52 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime51);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-100L) + "'", long13 == (-100L));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+97:00" + "'", str22, "+97:00");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+97:00" + "'", str29, "+97:00");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 32L + "'", long38 == 32L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 97L + "'", long40 == 97L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 349200000L + "'", long42 == 349200000L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 35L + "'", long44 == 35L);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+00:00:00.100" + "'", str47, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 349200034L + "'", long50 == 349200034L);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 100, (int) (byte) 10);
        java.lang.String str6 = fixedDateTimeZone4.getShortName((-349199999L));
        long long9 = fixedDateTimeZone4.adjustOffset(0L, true);
        long long12 = fixedDateTimeZone4.adjustOffset((-349200136L), true);
        long long14 = fixedDateTimeZone4.nextTransition(349199999L);
        long long16 = fixedDateTimeZone4.convertUTCToLocal(349199867L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349200136L) + "'", long12 == (-349200136L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 349199999L + "'", long14 == 349199999L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 349199967L + "'", long16 == 349199967L);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:01", "hi!", (int) (short) 1, 60000);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition((long) (short) 0);
        java.lang.String str11 = fixedDateTimeZone4.getID();
        java.lang.String str12 = fixedDateTimeZone4.toString();
        java.lang.String str14 = fixedDateTimeZone4.getNameKey(349199938L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+97:00" + "'", str11, "+97:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+97:00" + "'", str14, "+97:00");
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        java.lang.String str9 = fixedDateTimeZone4.getNameKey((-349199901L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone14 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str16 = fixedDateTimeZone14.getNameKey(0L);
        java.util.Locale locale18 = null;
        java.lang.String str19 = fixedDateTimeZone14.getShortName(31L, locale18);
        long long21 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone14, (long) 0);
        int int23 = fixedDateTimeZone14.getStandardOffset((-48L));
        java.lang.String str25 = fixedDateTimeZone14.getNameKey((-349799900L));
        long long28 = fixedDateTimeZone14.adjustOffset((-348599978L), true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+97:00" + "'", str25, "+97:00");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-348599978L) + "'", long28 == (-348599978L));
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = fixedDateTimeZone4.getID();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone12 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long14 = fixedDateTimeZone12.previousTransition((long) ' ');
        java.lang.String str15 = fixedDateTimeZone12.getID();
        java.lang.String str17 = fixedDateTimeZone12.getNameKey((long) (short) 10);
        int int19 = fixedDateTimeZone12.getOffsetFromLocal((-101L));
        long long21 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone12, 32L);
        int int23 = fixedDateTimeZone4.getOffsetFromLocal((long) ' ');
        java.lang.String str24 = fixedDateTimeZone4.toString();
        org.joda.time.LocalDateTime localDateTime25 = null;
        boolean boolean26 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime25);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+97:00" + "'", str7, "+97:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+97:00" + "'", str24, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, (int) '#');
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone7 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str9 = fixedDateTimeZone7.getNameKey(100L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone14 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long16 = fixedDateTimeZone14.previousTransition((long) ' ');
        long long18 = fixedDateTimeZone14.previousTransition((long) 'a');
        int int20 = fixedDateTimeZone14.getStandardOffset((long) (short) 0);
        long long23 = fixedDateTimeZone14.convertLocalToUTC((long) 0, true);
        int int25 = fixedDateTimeZone14.getOffset((-349199999L));
        boolean boolean26 = fixedDateTimeZone7.equals((java.lang.Object) fixedDateTimeZone14);
        java.lang.String str28 = fixedDateTimeZone14.getNameKey((-349199871L));
        java.util.Locale locale30 = null;
        java.lang.String str31 = fixedDateTimeZone14.getName((long) (byte) -1, locale30);
        int int33 = fixedDateTimeZone14.getOffsetFromLocal((-349200100L));
        boolean boolean35 = fixedDateTimeZone14.isStandardOffset((-349200001L));
        long long37 = dateTimeZone2.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone14, 59799L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-100L) + "'", long23 == (-100L));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+97:00" + "'", str28, "+97:00");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00:00.100" + "'", str31, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 5759699L + "'", long37 == 5759699L);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.nextTransition((-101L));
        int int8 = fixedDateTimeZone4.getStandardOffset((long) (byte) -1);
        int int10 = fixedDateTimeZone4.getOffsetFromLocal(10L);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((-349199868L), false);
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime14);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone21 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str23 = fixedDateTimeZone21.getNameKey((long) 1);
        long long26 = fixedDateTimeZone21.convertLocalToUTC((-101L), true);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone31 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str33 = fixedDateTimeZone31.getNameKey((long) 1);
        long long35 = fixedDateTimeZone31.nextTransition((long) (short) 100);
        java.lang.String str37 = fixedDateTimeZone31.getNameKey(97L);
        java.lang.String str39 = fixedDateTimeZone31.getNameKey(349200010L);
        boolean boolean40 = fixedDateTimeZone31.isFixed();
        java.lang.String str42 = fixedDateTimeZone31.getName((long) 'a');
        boolean boolean43 = fixedDateTimeZone21.equals((java.lang.Object) fixedDateTimeZone31);
        int int45 = fixedDateTimeZone31.getOffset(100L);
        java.lang.String str47 = fixedDateTimeZone31.getName((-48L));
        java.util.Locale locale49 = null;
        java.lang.String str50 = fixedDateTimeZone31.getName((-349200003L), locale49);
        boolean boolean51 = fixedDateTimeZone4.equals((java.lang.Object) locale49);
        java.util.TimeZone timeZone52 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-101L) + "'", long6 == (-101L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-349199968L) + "'", long13 == (-349199968L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+97:00" + "'", str23, "+97:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-201L) + "'", long26 == (-201L));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+97:00" + "'", str33, "+97:00");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 100L + "'", long35 == 100L);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+97:00" + "'", str37, "+97:00");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+97:00" + "'", str39, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00:00.100" + "'", str42, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+00:00:00.100" + "'", str47, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+00:00:00.100" + "'", str50, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(timeZone52);
        org.junit.Assert.assertEquals(timeZone52.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        int int12 = fixedDateTimeZone4.getStandardOffset(1L);
        boolean boolean13 = fixedDateTimeZone4.isFixed();
        java.util.TimeZone timeZone14 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone19 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str21 = fixedDateTimeZone19.getNameKey((long) 1);
        boolean boolean22 = fixedDateTimeZone19.isFixed();
        java.lang.String str24 = fixedDateTimeZone19.getNameKey((-349199901L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone29 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str31 = fixedDateTimeZone29.getNameKey(0L);
        java.util.Locale locale33 = null;
        java.lang.String str34 = fixedDateTimeZone29.getShortName(31L, locale33);
        long long36 = fixedDateTimeZone19.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone29, (long) 0);
        boolean boolean37 = fixedDateTimeZone29.isFixed();
        long long39 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone29, (long) 'a');
        java.util.Locale locale41 = null;
        java.lang.String str42 = fixedDateTimeZone4.getShortName((-349200003L), locale41);
        long long44 = fixedDateTimeZone4.previousTransition((long) 0);
        java.util.Locale locale46 = null;
        java.lang.String str47 = fixedDateTimeZone4.getName((-43L), locale46);
        int int49 = fixedDateTimeZone4.getStandardOffset((-349199904L));
        java.lang.String str50 = fixedDateTimeZone4.toString();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+97:00" + "'", str21, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+97:00" + "'", str24, "+97:00");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+97:00" + "'", str31, "+97:00");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00:00.100" + "'", str34, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 97L + "'", long39 == 97L);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00:00.100" + "'", str42, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+00:00:00.100" + "'", str47, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+97:00" + "'", str50, "+97:00");
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition((long) (short) 0);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone0.getMillisKeepLocal(dateTimeZone2, (long) ' ');
        long long7 = dateTimeZone2.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long11 = dateTimeZone2.convertLocalToUTC((long) (byte) 0, false);
        long long14 = dateTimeZone2.convertLocalToUTC(0L, true);
        long long17 = dateTimeZone2.convertLocalToUTC(0L, false);
        long long21 = dateTimeZone2.convertLocalToUTC((-9L), true, 59700L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-349199868L) + "'", long4 == (-349199868L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349200001L) + "'", long7 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349200000L) + "'", long11 == (-349200000L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-349200000L) + "'", long14 == (-349200000L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-349200000L) + "'", long17 == (-349200000L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-349200009L) + "'", long21 == (-349200009L));
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(97L);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long15 = fixedDateTimeZone4.convertLocalToUTC((long) (-1), false, (long) 100);
        boolean boolean17 = fixedDateTimeZone4.isStandardOffset(0L);
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = fixedDateTimeZone4.getOffset(readableInstant18);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-101L) + "'", long15 == (-101L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        long long9 = fixedDateTimeZone4.previousTransition((long) '4');
        java.lang.String str10 = fixedDateTimeZone4.toString();
        long long13 = fixedDateTimeZone4.adjustOffset(349199767L, false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 349199767L + "'", long13 == 349199767L);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long17 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, (long) ' ');
        long long19 = fixedDateTimeZone4.nextTransition(0L);
        long long22 = fixedDateTimeZone4.adjustOffset((-349199901L), true);
        java.lang.String str24 = fixedDateTimeZone4.getShortName((-349199900L));
        long long28 = fixedDateTimeZone4.convertLocalToUTC(0L, false, (-698399848L));
        long long30 = fixedDateTimeZone4.previousTransition((long) '4');
        long long33 = fixedDateTimeZone4.convertLocalToUTC((-349200290L), true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-349199901L) + "'", long22 == (-349199901L));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-100L) + "'", long28 == (-100L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 52L + "'", long30 == 52L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-349200390L) + "'", long33 == (-349200390L));
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition((long) (short) 0);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str13 = fixedDateTimeZone4.getNameKey((-349200100L));
        int int15 = fixedDateTimeZone4.getOffset(1L);
        java.util.TimeZone timeZone16 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone17.getShortName((long) (short) 100, locale19);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
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
        java.lang.String str30 = fixedDateTimeZone14.getName((-48L));
        java.util.Locale locale32 = null;
        java.lang.String str33 = fixedDateTimeZone14.getName((-349200003L), locale32);
        boolean boolean35 = fixedDateTimeZone14.isStandardOffset((-349200065L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone40 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str42 = fixedDateTimeZone40.getNameKey((long) 1);
        boolean boolean43 = fixedDateTimeZone40.isFixed();
        java.lang.String str45 = fixedDateTimeZone40.getNameKey((-349199901L));
        long long47 = fixedDateTimeZone40.nextTransition((-68L));
        int int49 = fixedDateTimeZone40.getOffset((-349200090L));
        long long51 = fixedDateTimeZone14.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone40, 59901L);
        java.util.Locale locale53 = null;
        java.lang.String str54 = fixedDateTimeZone14.getName((-349200036L), locale53);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.100" + "'", str30, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00:00.100" + "'", str33, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+97:00" + "'", str42, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+97:00" + "'", str45, "+97:00");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-68L) + "'", long47 == (-68L));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 59901L + "'", long51 == 59901L);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "+00:00:00.100" + "'", str54, "+00:00:00.100");
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long17 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, (long) ' ');
        boolean boolean18 = fixedDateTimeZone15.isFixed();
        long long21 = fixedDateTimeZone15.convertLocalToUTC((-349199999L), false);
        boolean boolean23 = fixedDateTimeZone15.isStandardOffset(52L);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 10);
        java.lang.String str28 = dateTimeZone26.getShortName((-698400001L));
        long long30 = fixedDateTimeZone15.getMillisKeepLocal(dateTimeZone26, (-349200236L));
        org.joda.time.tz.Provider provider31 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider31);
        org.joda.time.DateTimeZone.setProvider(provider31);
        org.joda.time.DateTimeZone.setProvider(provider31);
        org.joda.time.DateTimeZone.setProvider(provider31);
        org.joda.time.DateTimeZone.setProvider(provider31);
        org.joda.time.DateTimeZone.setProvider(provider31);
        boolean boolean38 = fixedDateTimeZone15.equals((java.lang.Object) provider31);
        org.joda.time.DateTimeZone.setProvider(provider31);
        org.joda.time.DateTimeZone.setProvider(provider31);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-349200096L) + "'", long21 == (-349200096L));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:10" + "'", str28, "+00:10");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-349800139L) + "'", long30 == (-349800139L));
        org.junit.Assert.assertNotNull(provider31);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        int int10 = fixedDateTimeZone4.getStandardOffset((long) (short) 0);
        int int12 = fixedDateTimeZone4.getStandardOffset((long) (byte) 10);
        java.lang.String str13 = fixedDateTimeZone4.getID();
        boolean boolean15 = fixedDateTimeZone4.isStandardOffset((-349199948L));
        org.joda.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime16);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 1);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone7 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str9 = fixedDateTimeZone7.getNameKey((long) 1);
        boolean boolean10 = fixedDateTimeZone7.isFixed();
        long long12 = fixedDateTimeZone7.previousTransition((long) '4');
        long long15 = fixedDateTimeZone7.convertLocalToUTC((-349199936L), false);
        java.lang.String str16 = fixedDateTimeZone7.getID();
        int int18 = fixedDateTimeZone7.getOffset((-99L));
        long long20 = dateTimeZone2.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone7, (long) (short) 10);
        int int22 = fixedDateTimeZone7.getStandardOffset((-59900L));
        org.joda.time.ReadableInstant readableInstant23 = null;
        int int24 = fixedDateTimeZone7.getOffset(readableInstant23);
        org.joda.time.LocalDateTime localDateTime25 = null;
        boolean boolean26 = fixedDateTimeZone7.isLocalDateTimeGap(localDateTime25);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-349200036L) + "'", long15 == (-349200036L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 360059910L + "'", long20 == 360059910L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("-00:00:00.001", "-00:00:00.001", (int) 'a', 349200000);
        int int6 = fixedDateTimeZone4.getOffsetFromLocal(0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getShortName(0L, locale13);
        java.lang.String str16 = fixedDateTimeZone4.getNameKey((-101L));
        java.lang.String str18 = fixedDateTimeZone4.getNameKey((long) (short) 100);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone23 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long25 = fixedDateTimeZone23.previousTransition((long) ' ');
        long long27 = fixedDateTimeZone23.previousTransition((long) 'a');
        long long29 = fixedDateTimeZone23.previousTransition(349200000L);
        org.joda.time.LocalDateTime localDateTime30 = null;
        boolean boolean31 = fixedDateTimeZone23.isLocalDateTimeGap(localDateTime30);
        boolean boolean32 = fixedDateTimeZone23.isFixed();
        long long34 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone23, (long) (-1));
        int int36 = fixedDateTimeZone4.getOffset((-100L));
        org.joda.time.ReadableInstant readableInstant37 = null;
        int int38 = fixedDateTimeZone4.getOffset(readableInstant37);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+97:00" + "'", str18, "+97:00");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 97L + "'", long27 == 97L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 349200000L + "'", long29 == 349200000L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone0.getMillisKeepLocal(dateTimeZone2, (long) ' ');
        long long7 = dateTimeZone2.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long11 = dateTimeZone2.convertLocalToUTC((long) (byte) 0, false);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long15 = dateTimeZone2.getMillisKeepLocal(dateTimeZone13, (long) 1);
        boolean boolean17 = dateTimeZone13.isStandardOffset((long) (short) 10);
        java.lang.String str19 = dateTimeZone13.getName(97L);
        long long23 = dateTimeZone13.convertLocalToUTC(35L, true, (-349200036L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone28 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long30 = fixedDateTimeZone28.previousTransition((long) ' ');
        long long32 = fixedDateTimeZone28.previousTransition((long) 'a');
        long long34 = fixedDateTimeZone28.previousTransition((long) (short) 0);
        int int36 = fixedDateTimeZone28.getOffsetFromLocal((long) (byte) 0);
        boolean boolean38 = fixedDateTimeZone28.isStandardOffset((-1L));
        long long40 = dateTimeZone13.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone28, 349200032L);
        java.util.Locale locale42 = null;
        java.lang.String str43 = fixedDateTimeZone28.getShortName((-133L), locale42);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone28);
        boolean boolean46 = fixedDateTimeZone28.isStandardOffset((-349200096L));
        java.lang.Class<?> wildcardClass47 = fixedDateTimeZone28.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-349199868L) + "'", long4 == (-349199868L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349200001L) + "'", long7 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349200000L) + "'", long11 == (-349200000L));
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+97:00" + "'", str19, "+97:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-349199965L) + "'", long23 == (-349199965L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 32L + "'", long30 == 32L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 97L + "'", long32 == 97L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 698399932L + "'", long40 == 698399932L);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+00:00:00.100" + "'", str43, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        java.lang.String str9 = fixedDateTimeZone4.getNameKey((-349199901L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone14 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str16 = fixedDateTimeZone14.getNameKey(0L);
        java.util.Locale locale18 = null;
        java.lang.String str19 = fixedDateTimeZone14.getShortName(31L, locale18);
        long long21 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone14, (long) 0);
        long long24 = fixedDateTimeZone4.convertLocalToUTC((-349200097L), false);
        long long26 = fixedDateTimeZone4.previousTransition((long) (byte) -1);
        org.joda.time.ReadableInstant readableInstant27 = null;
        int int28 = fixedDateTimeZone4.getOffset(readableInstant27);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-349200197L) + "'", long24 == (-349200197L));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long4 = dateTimeZone0.convertLocalToUTC((-349200001L), false, (long) (byte) 100);
        boolean boolean6 = dateTimeZone0.isStandardOffset((-100L));
        java.lang.String str7 = dateTimeZone0.getID();
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone0.isLocalDateTimeGap(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-349200101L) + "'", long4 == (-349200101L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+97:00" + "'", str7, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition((long) (short) 0);
        int int12 = fixedDateTimeZone4.getOffsetFromLocal((long) (byte) 0);
        java.lang.String str14 = fixedDateTimeZone4.getNameKey((-148L));
        java.lang.String str16 = fixedDateTimeZone4.getNameKey((-33L));
        java.util.Locale locale18 = null;
        java.lang.String str19 = fixedDateTimeZone4.getName((-38099803L), locale18);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+97:00" + "'", str14, "+97:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long4 = dateTimeZone0.convertLocalToUTC((-349200001L), false, (long) (byte) 100);
        boolean boolean6 = dateTimeZone0.isStandardOffset((-100L));
        java.lang.String str7 = dateTimeZone0.toString();
        long long11 = dateTimeZone0.convertLocalToUTC(349199802L, true, 0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-349200101L) + "'", long4 == (-349200101L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+97:00" + "'", str7, "+97:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 349199702L + "'", long11 == 349199702L);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        boolean boolean6 = fixedDateTimeZone4.isStandardOffset((long) '#');
        java.lang.String str7 = fixedDateTimeZone4.toString();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone12 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 100, (int) (byte) 10);
        int int14 = fixedDateTimeZone12.getOffsetFromLocal((long) (byte) 1);
        long long16 = fixedDateTimeZone12.nextTransition((long) 0);
        java.util.TimeZone timeZone17 = fixedDateTimeZone12.toTimeZone();
        long long19 = fixedDateTimeZone12.convertUTCToLocal((-349199933L));
        boolean boolean20 = fixedDateTimeZone4.equals((java.lang.Object) long19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.100" + "'", str7, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-349199833L) + "'", long19 == (-349199833L));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        int int12 = fixedDateTimeZone4.getStandardOffset(1L);
        long long16 = fixedDateTimeZone4.convertLocalToUTC((long) '4', false, (long) (short) 1);
        long long18 = fixedDateTimeZone4.nextTransition(0L);
        long long21 = fixedDateTimeZone4.adjustOffset((-99L), true);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long26 = dateTimeZone22.getMillisKeepLocal(dateTimeZone24, (long) ' ');
        long long29 = dateTimeZone24.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone24);
        long long33 = dateTimeZone24.convertLocalToUTC((long) (byte) 0, false);
        java.lang.String str34 = dateTimeZone24.toString();
        java.lang.String str35 = dateTimeZone24.toString();
        long long37 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone24, (-349199965L));
        long long40 = fixedDateTimeZone4.adjustOffset(4199999L, false);
        java.lang.Class<?> wildcardClass41 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-48L) + "'", long16 == (-48L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-99L) + "'", long21 == (-99L));
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-349199868L) + "'", long26 == (-349199868L));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-349200001L) + "'", long29 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-349200000L) + "'", long33 == (-349200000L));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+97:00" + "'", str34, "+97:00");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+97:00" + "'", str35, "+97:00");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-698399865L) + "'", long37 == (-698399865L));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 4199999L + "'", long40 == 4199999L);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone0.getMillisKeepLocal(dateTimeZone2, (long) ' ');
        long long7 = dateTimeZone2.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long11 = dateTimeZone2.convertLocalToUTC((long) (byte) 0, false);
        long long14 = dateTimeZone2.convertLocalToUTC(0L, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349200001L) + "'", long7 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349200000L) + "'", long11 == (-349200000L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-349200000L) + "'", long14 == (-349200000L));
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
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
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone14);
        java.lang.String str28 = fixedDateTimeZone14.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-201L) + "'", long9 == (-201L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+97:00" + "'", str20, "+97:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+97:00" + "'", str22, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.100" + "'", str25, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+97:00" + "'", str28, "+97:00");
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00", "+00:00:00.032", (int) (short) -1, (int) (short) 10);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.lang.String str6 = fixedDateTimeZone4.getID();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone11 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long13 = fixedDateTimeZone11.nextTransition((long) 10);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone11);
        boolean boolean15 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone11);
        boolean boolean16 = fixedDateTimeZone11.isFixed();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        java.lang.String str9 = fixedDateTimeZone4.getNameKey((-349199901L));
        long long11 = fixedDateTimeZone4.previousTransition((-349200101L));
        java.lang.String str12 = fixedDateTimeZone4.toString();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (short) 0);
        long long19 = dateTimeZone15.convertLocalToUTC((-103L), false, 349199770L);
        long long21 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone15, (-349200290L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349200101L) + "'", long11 == (-349200101L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-349200103L) + "'", long19 == (-349200103L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-698400190L) + "'", long21 == (-698400190L));
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long15 = fixedDateTimeZone4.convertLocalToUTC(349200010L, true);
        long long17 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        java.util.TimeZone timeZone18 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 349199910L + "'", long15 == 349199910L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone19);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getName((-349199868L));
        java.util.TimeZone timeZone7 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str8 = fixedDateTimeZone4.getID();
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = fixedDateTimeZone4.getOffset(readableInstant9);
        java.lang.String str12 = fixedDateTimeZone4.getName((-827999606L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+97:00" + "'", str8, "+97:00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        java.util.TimeZone timeZone13 = fixedDateTimeZone4.toTimeZone();
        int int15 = fixedDateTimeZone4.getOffsetFromLocal(32L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone20 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long22 = fixedDateTimeZone20.previousTransition((long) ' ');
        long long24 = fixedDateTimeZone20.previousTransition((long) 'a');
        long long26 = fixedDateTimeZone20.previousTransition(349200000L);
        int int28 = fixedDateTimeZone20.getStandardOffset(1L);
        boolean boolean29 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone20);
        org.joda.time.LocalDateTime localDateTime30 = null;
        boolean boolean31 = fixedDateTimeZone20.isLocalDateTimeGap(localDateTime30);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 97L + "'", long24 == 97L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 349200000L + "'", long26 == 349200000L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        int int10 = fixedDateTimeZone4.getStandardOffset((long) (short) 0);
        int int12 = fixedDateTimeZone4.getStandardOffset((long) (byte) 10);
        long long15 = fixedDateTimeZone4.convertLocalToUTC((long) 1, true);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = fixedDateTimeZone4.getOffset(readableInstant16);
        int int19 = fixedDateTimeZone4.getOffset(0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-99L) + "'", long15 == (-99L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) (byte) 10);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName((-698399968L), locale4);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-01:10" + "'", str5, "-01:10");
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = fixedDateTimeZone4.getID();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone12 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long14 = fixedDateTimeZone12.previousTransition((long) ' ');
        java.lang.String str15 = fixedDateTimeZone12.getID();
        java.lang.String str17 = fixedDateTimeZone12.getNameKey((long) (short) 10);
        int int19 = fixedDateTimeZone12.getOffsetFromLocal((-101L));
        long long21 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone12, 32L);
        long long23 = fixedDateTimeZone4.previousTransition((-133L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone28 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long30 = fixedDateTimeZone28.previousTransition((long) ' ');
        java.lang.String str31 = fixedDateTimeZone28.getID();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone36 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long38 = fixedDateTimeZone36.previousTransition((long) ' ');
        java.lang.String str39 = fixedDateTimeZone36.getID();
        java.lang.String str41 = fixedDateTimeZone36.getNameKey((long) (short) 10);
        int int43 = fixedDateTimeZone36.getOffsetFromLocal((-101L));
        long long45 = fixedDateTimeZone28.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone36, 32L);
        boolean boolean46 = fixedDateTimeZone4.equals((java.lang.Object) 32L);
        java.lang.String str47 = fixedDateTimeZone4.toString();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+97:00" + "'", str7, "+97:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-133L) + "'", long23 == (-133L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 32L + "'", long30 == 32L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+97:00" + "'", str31, "+97:00");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 32L + "'", long38 == 32L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+97:00" + "'", str39, "+97:00");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+97:00" + "'", str41, "+97:00");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 32L + "'", long45 == 32L);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+97:00" + "'", str47, "+97:00");
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone0.getMillisKeepLocal(dateTimeZone2, (long) ' ');
        long long8 = dateTimeZone0.convertLocalToUTC((long) (short) -1, true, (long) (byte) -1);
        java.lang.String str9 = dateTimeZone0.getID();
        java.lang.String str11 = dateTimeZone0.getName((-349200201L));
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone0.getName((-41L), locale13);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-349199868L) + "'", long4 == (-349199868L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-101L) + "'", long8 == (-101L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone0.getMillisKeepLocal(dateTimeZone2, (long) ' ');
        long long7 = dateTimeZone2.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long10 = dateTimeZone2.convertUTCToLocal(0L);
        long long12 = dateTimeZone2.convertUTCToLocal((-133L));
        long long15 = dateTimeZone2.adjustOffset((-349199969L), true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-349199868L) + "'", long4 == (-349199868L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349200001L) + "'", long7 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 349199867L + "'", long12 == 349199867L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-349199969L) + "'", long15 == (-349199969L));
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long7 = dateTimeZone4.convertLocalToUTC((long) (byte) 1, false);
        java.lang.String str9 = dateTimeZone4.getShortName((long) ' ');
        long long11 = dateTimeZone0.getMillisKeepLocal(dateTimeZone4, 0L);
        long long13 = dateTimeZone0.convertUTCToLocal(32L);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone0.getShortName((-1L), locale15);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone22 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str24 = fixedDateTimeZone22.getNameKey((long) 1);
        boolean boolean25 = fixedDateTimeZone22.isFixed();
        long long27 = fixedDateTimeZone22.previousTransition((long) '4');
        long long30 = fixedDateTimeZone22.convertLocalToUTC((-349199936L), false);
        long long32 = dateTimeZone0.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone22, (-101L));
        long long35 = fixedDateTimeZone22.convertLocalToUTC((-349200064L), false);
        int int37 = fixedDateTimeZone22.getOffsetFromLocal((-62L));
        int int39 = fixedDateTimeZone22.getStandardOffset((-698399747L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199999L) + "'", long7 == (-349199999L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 349200032L + "'", long13 == 349200032L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+97:00" + "'", str24, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 52L + "'", long27 == 52L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-349200036L) + "'", long30 == (-349200036L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 349199799L + "'", long32 == 349199799L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-349200164L) + "'", long35 == (-349200164L));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long9 = fixedDateTimeZone4.adjustOffset((-68L), false);
        int int11 = fixedDateTimeZone4.getOffsetFromLocal(135L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-68L) + "'", long9 == (-68L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition((long) (short) 0);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str13 = fixedDateTimeZone4.getNameKey((-349200100L));
        int int15 = fixedDateTimeZone4.getOffset((-101L));
        java.util.Locale locale17 = null;
        java.lang.String str18 = fixedDateTimeZone4.getName((-349199935L), locale17);
        java.util.Locale locale20 = null;
        java.lang.String str21 = fixedDateTimeZone4.getName((-698399968L), locale20);
        java.util.Locale locale23 = null;
        java.lang.String str24 = fixedDateTimeZone4.getShortName(31L, locale23);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.100" + "'", str18, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.100" + "'", str21, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(35, 6720000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 6720000");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
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
        java.util.Locale locale57 = null;
        java.lang.String str58 = fixedDateTimeZone4.getShortName((long) ' ', locale57);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone63 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str65 = fixedDateTimeZone63.getNameKey((long) 1);
        java.util.Locale locale67 = null;
        java.lang.String str68 = fixedDateTimeZone63.getName((-349200001L), locale67);
        java.util.TimeZone timeZone69 = fixedDateTimeZone63.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.forTimeZone(timeZone69);
        org.joda.time.LocalDateTime localDateTime71 = null;
        boolean boolean72 = dateTimeZone70.isLocalDateTimeGap(localDateTime71);
        long long74 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone70, (-41L));
        java.lang.String str76 = fixedDateTimeZone4.getName((-349200333L));
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
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "+00:00:00.100" + "'", str58, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "+97:00" + "'", str65, "+97:00");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "+00:00:00.100" + "'", str68, "+00:00:00.100");
        org.junit.Assert.assertNotNull(timeZone69);
        org.junit.Assert.assertEquals(timeZone69.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 59L + "'", long74 == 59L);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "+00:00:00.100" + "'", str76, "+00:00:00.100");
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        int int6 = fixedDateTimeZone4.getOffset(349200010L);
        long long8 = fixedDateTimeZone4.nextTransition(100L);
        boolean boolean10 = fixedDateTimeZone4.isStandardOffset((-349800036L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str13 = fixedDateTimeZone4.getShortName(197L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.097" + "'", str13, "+00:00:00.097");
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        java.util.Locale locale8 = null;
        java.lang.String str9 = fixedDateTimeZone4.getName((-349200001L), locale8);
        java.util.TimeZone timeZone10 = fixedDateTimeZone4.toTimeZone();
        long long12 = fixedDateTimeZone4.nextTransition(1L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone17 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long19 = fixedDateTimeZone17.previousTransition((long) ' ');
        long long21 = fixedDateTimeZone17.previousTransition((long) 'a');
        java.lang.String str23 = fixedDateTimeZone17.getNameKey((long) 349200000);
        long long25 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone17, (-1L));
        int int27 = fixedDateTimeZone4.getStandardOffset(698399935L);
        java.lang.String str29 = fixedDateTimeZone4.getShortName((long) '4');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+97:00" + "'", str23, "+97:00");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00:00.100" + "'", str29, "+00:00:00.100");
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long7 = dateTimeZone4.convertLocalToUTC((long) (byte) 1, false);
        java.lang.String str9 = dateTimeZone4.getShortName((long) ' ');
        long long11 = dateTimeZone0.getMillisKeepLocal(dateTimeZone4, 0L);
        long long13 = dateTimeZone0.convertUTCToLocal(32L);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone0.getShortName((-1L), locale15);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        long long20 = dateTimeZone0.convertLocalToUTC((-349199865L), false);
        java.lang.String str22 = dateTimeZone0.getShortName((long) '#');
        long long26 = dateTimeZone0.convertLocalToUTC((-97L), true, 349199770L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199999L) + "'", long7 == (-349199999L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 349200032L + "'", long13 == 349200032L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-698399865L) + "'", long20 == (-698399865L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+97:00" + "'", str22, "+97:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-349200097L) + "'", long26 == (-349200097L));
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime5);
        java.lang.String str8 = fixedDateTimeZone4.getNameKey(135L);
        long long11 = fixedDateTimeZone4.adjustOffset((-349200009L), false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone16 = new org.joda.time.tz.FixedDateTimeZone("+00:00", "+00:00:00.032", (int) (short) -1, (int) (short) 10);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone16);
        java.lang.String str18 = fixedDateTimeZone16.getID();
        java.lang.String str20 = fixedDateTimeZone16.getNameKey((-349200101L));
        long long22 = fixedDateTimeZone16.convertUTCToLocal(0L);
        java.util.Locale locale24 = null;
        java.lang.String str25 = fixedDateTimeZone16.getShortName(349200034L, locale24);
        long long27 = fixedDateTimeZone16.previousTransition((-43L));
        boolean boolean28 = fixedDateTimeZone4.equals((java.lang.Object) (-43L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+97:00" + "'", str8, "+97:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349200009L) + "'", long11 == (-349200009L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.032" + "'", str20, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-00:00:00.001" + "'", str25, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-43L) + "'", long27 == (-43L));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 349200000);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) 10, true);
        java.util.Locale locale15 = null;
        java.lang.String str16 = fixedDateTimeZone4.getShortName((long) 'a', locale15);
        boolean boolean18 = fixedDateTimeZone4.isStandardOffset(349200032L);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        long long21 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone19, 35L);
        long long24 = fixedDateTimeZone4.adjustOffset((-349199933L), false);
        java.util.TimeZone timeZone25 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-90L) + "'", long13 == (-90L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 136L + "'", long21 == 136L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-349199933L) + "'", long24 == (-349199933L));
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.nextTransition((-101L));
        int int8 = fixedDateTimeZone4.getStandardOffset((long) (byte) -1);
        int int10 = fixedDateTimeZone4.getOffsetFromLocal(10L);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((-349199868L), false);
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime14);
        long long18 = fixedDateTimeZone4.adjustOffset((-698399865L), true);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long22 = fixedDateTimeZone4.adjustOffset(349199834L, false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-101L) + "'", long6 == (-101L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-349199968L) + "'", long13 == (-349199968L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-698399865L) + "'", long18 == (-698399865L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 349199834L + "'", long22 == 349199834L);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.util.TimeZone timeZone12 = fixedDateTimeZone4.toTimeZone();
        long long16 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) 100, false, 32L);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = fixedDateTimeZone4.getOffset(readableInstant19);
        int int22 = fixedDateTimeZone4.getStandardOffset((-698399936L));
        java.lang.String str24 = fixedDateTimeZone4.getNameKey((-349200236L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone29 = new org.joda.time.tz.FixedDateTimeZone("", "+00:00:00.100", 10, (int) (byte) 10);
        boolean boolean31 = fixedDateTimeZone29.isStandardOffset((-201L));
        long long34 = fixedDateTimeZone29.convertLocalToUTC((long) 97, true);
        java.lang.String str36 = fixedDateTimeZone29.getShortName(49L);
        org.joda.time.ReadableInstant readableInstant37 = null;
        int int38 = fixedDateTimeZone29.getOffset(readableInstant37);
        boolean boolean39 = fixedDateTimeZone4.equals((java.lang.Object) int38);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+97:00" + "'", str24, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 87L + "'", long34 == 87L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00:00.010" + "'", str36, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        int int8 = fixedDateTimeZone4.getStandardOffset((long) (-1));
        int int10 = fixedDateTimeZone4.getStandardOffset((long) 97);
        boolean boolean12 = fixedDateTimeZone4.isStandardOffset((long) (byte) 1);
        int int14 = fixedDateTimeZone4.getOffset((long) 115800000);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone11 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long13 = fixedDateTimeZone11.previousTransition((long) ' ');
        long long15 = fixedDateTimeZone11.previousTransition((long) 'a');
        int int17 = fixedDateTimeZone11.getStandardOffset((long) (short) 0);
        long long20 = fixedDateTimeZone11.convertLocalToUTC((long) 0, true);
        int int22 = fixedDateTimeZone11.getOffset((-349199999L));
        boolean boolean23 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone11);
        int int25 = fixedDateTimeZone11.getOffset(3660000L);
        java.util.Locale locale27 = null;
        java.lang.String str28 = fixedDateTimeZone11.getShortName((-349800001L), locale27);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-100L) + "'", long20 == (-100L));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.100" + "'", str28, "+00:00:00.100");
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime5);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, 1);
        boolean boolean10 = fixedDateTimeZone4.equals((java.lang.Object) 1);
        int int12 = fixedDateTimeZone4.getOffsetFromLocal((-349200048L));
        java.lang.String str13 = fixedDateTimeZone4.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        int int6 = fixedDateTimeZone4.getOffset(349200010L);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        java.util.Locale locale9 = null;
        java.lang.String str10 = fixedDateTimeZone4.getShortName((long) (byte) -1, locale9);
        boolean boolean12 = fixedDateTimeZone4.isStandardOffset((-349200199L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.097" + "'", str10, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
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
        org.joda.time.ReadableInstant readableInstant26 = null;
        int int27 = fixedDateTimeZone4.getOffset(readableInstant26);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale2 = null;
        java.lang.String str3 = dateTimeZone0.getName((long) (short) 100, locale2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone0.getOffset(readableInstant4);
        java.lang.String str7 = dateTimeZone0.getShortName(35L);
        long long10 = dateTimeZone0.convertLocalToUTC((-68L), true);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone0.getOffset(readableInstant11);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone0.getName((-702060001L), locale14);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-68L) + "'", long10 == (-68L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        int int6 = fixedDateTimeZone4.getOffset(349200010L);
        java.lang.String str7 = fixedDateTimeZone4.toString();
        java.lang.String str9 = fixedDateTimeZone4.getNameKey(349200010L);
        long long12 = fixedDateTimeZone4.convertLocalToUTC(0L, true);
        java.util.TimeZone timeZone13 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+97:00" + "'", str7, "+97:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-97L) + "'", long12 == (-97L));
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        int int10 = fixedDateTimeZone4.getStandardOffset((long) (short) 0);
        int int12 = fixedDateTimeZone4.getStandardOffset((long) (byte) 10);
        java.lang.String str13 = fixedDateTimeZone4.getID();
        boolean boolean15 = fixedDateTimeZone4.isStandardOffset((-349199948L));
        java.lang.String str17 = fixedDateTimeZone4.getName((long) 32);
        int int19 = fixedDateTimeZone4.getOffsetFromLocal((-352860001L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone0.getMillisKeepLocal(dateTimeZone2, (long) ' ');
        long long7 = dateTimeZone2.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long11 = dateTimeZone2.convertLocalToUTC((long) (byte) 0, false);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long15 = dateTimeZone2.getMillisKeepLocal(dateTimeZone13, (long) 1);
        java.lang.String str17 = dateTimeZone2.getShortName((long) ' ');
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-349199868L) + "'", long4 == (-349199868L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349200001L) + "'", long7 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349200000L) + "'", long11 == (-349200000L));
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        java.util.Locale locale8 = null;
        java.lang.String str9 = fixedDateTimeZone4.getName((-349200001L), locale8);
        java.util.TimeZone timeZone10 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone11.getOffset(readableInstant12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.nextTransition((-101L));
        int int8 = fixedDateTimeZone4.getStandardOffset((long) (byte) -1);
        int int10 = fixedDateTimeZone4.getOffsetFromLocal(10L);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((-349199868L), false);
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime14);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone21 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str23 = fixedDateTimeZone21.getNameKey((long) 1);
        long long26 = fixedDateTimeZone21.convertLocalToUTC((-101L), true);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone31 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str33 = fixedDateTimeZone31.getNameKey((long) 1);
        long long35 = fixedDateTimeZone31.nextTransition((long) (short) 100);
        java.lang.String str37 = fixedDateTimeZone31.getNameKey(97L);
        java.lang.String str39 = fixedDateTimeZone31.getNameKey(349200010L);
        boolean boolean40 = fixedDateTimeZone31.isFixed();
        java.lang.String str42 = fixedDateTimeZone31.getName((long) 'a');
        boolean boolean43 = fixedDateTimeZone21.equals((java.lang.Object) fixedDateTimeZone31);
        int int45 = fixedDateTimeZone31.getOffset(100L);
        java.lang.String str47 = fixedDateTimeZone31.getName((-48L));
        java.util.Locale locale49 = null;
        java.lang.String str50 = fixedDateTimeZone31.getName((-349200003L), locale49);
        boolean boolean51 = fixedDateTimeZone4.equals((java.lang.Object) locale49);
        long long54 = fixedDateTimeZone4.convertLocalToUTC((-349199999L), true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-101L) + "'", long6 == (-101L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-349199968L) + "'", long13 == (-349199968L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+97:00" + "'", str23, "+97:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-201L) + "'", long26 == (-201L));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+97:00" + "'", str33, "+97:00");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 100L + "'", long35 == 100L);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+97:00" + "'", str37, "+97:00");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+97:00" + "'", str39, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00:00.100" + "'", str42, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+00:00:00.100" + "'", str47, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+00:00:00.100" + "'", str50, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-349200099L) + "'", long54 == (-349200099L));
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(60000, 115200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 115200000");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        int int8 = fixedDateTimeZone4.getStandardOffset((long) (-1));
        int int10 = fixedDateTimeZone4.getStandardOffset((long) 97);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        int int13 = fixedDateTimeZone4.getOffset(0L);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = fixedDateTimeZone4.getOffset(readableInstant14);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("UTC", "hi!", 100, (int) '4');
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone10 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str12 = fixedDateTimeZone10.getNameKey((long) 1);
        long long14 = fixedDateTimeZone10.nextTransition((long) (short) 100);
        java.lang.String str16 = fixedDateTimeZone10.getNameKey(97L);
        java.lang.String str18 = fixedDateTimeZone10.getNameKey(349200010L);
        boolean boolean19 = fixedDateTimeZone10.isFixed();
        java.lang.String str21 = fixedDateTimeZone10.getNameKey((long) 0);
        int int23 = fixedDateTimeZone10.getStandardOffset((long) (short) 10);
        java.util.Locale locale25 = null;
        java.lang.String str26 = fixedDateTimeZone10.getShortName((long) 0, locale25);
        org.joda.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = fixedDateTimeZone10.isLocalDateTimeGap(localDateTime27);
        boolean boolean29 = fixedDateTimeZone4.equals((java.lang.Object) localDateTime27);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+97:00" + "'", str18, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+97:00" + "'", str21, "+97:00");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.100" + "'", str26, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        java.lang.String str9 = fixedDateTimeZone4.getNameKey((-349199901L));
        long long11 = fixedDateTimeZone4.nextTransition((-68L));
        java.lang.String str13 = fixedDateTimeZone4.getShortName((-202L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-68L) + "'", long11 == (-68L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        int int8 = fixedDateTimeZone4.getOffset(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long15 = fixedDateTimeZone13.previousTransition((long) ' ');
        long long17 = fixedDateTimeZone13.previousTransition((long) 'a');
        long long19 = fixedDateTimeZone13.previousTransition(349200000L);
        long long21 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone13, 35L);
        long long23 = fixedDateTimeZone13.previousTransition((-349200001L));
        int int25 = fixedDateTimeZone13.getOffset(100L);
        java.lang.String str27 = fixedDateTimeZone13.getName((long) 349200000);
        boolean boolean28 = fixedDateTimeZone13.isFixed();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 349200000L + "'", long19 == 349200000L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 35L + "'", long21 == 35L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-349200001L) + "'", long23 == (-349200001L));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.100" + "'", str27, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        int int14 = fixedDateTimeZone4.getOffset((long) (short) 100);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime15);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime17);
        java.util.Locale locale20 = null;
        java.lang.String str21 = fixedDateTimeZone4.getName((-133L), locale20);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.100" + "'", str21, "+00:00:00.100");
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        int int12 = fixedDateTimeZone4.getStandardOffset(1L);
        long long16 = fixedDateTimeZone4.convertLocalToUTC((long) '4', false, (long) (short) 1);
        long long20 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (-100L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-48L) + "'", long16 == (-48L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-100L) + "'", long20 == (-100L));
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long17 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, (long) ' ');
        long long21 = fixedDateTimeZone15.convertLocalToUTC(97L, true, 349200032L);
        long long23 = fixedDateTimeZone15.previousTransition(349199867L);
        java.lang.String str24 = fixedDateTimeZone15.toString();
        java.util.TimeZone timeZone25 = fixedDateTimeZone15.toTimeZone();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone15);
        java.util.TimeZone timeZone27 = fixedDateTimeZone15.toTimeZone();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 349199867L + "'", long23 == 349199867L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        int int12 = fixedDateTimeZone4.getStandardOffset(1L);
        long long16 = fixedDateTimeZone4.convertLocalToUTC((long) '4', false, (long) (short) 1);
        long long18 = fixedDateTimeZone4.previousTransition((-3L));
        long long21 = fixedDateTimeZone4.convertLocalToUTC(1L, false);
        java.util.Locale locale23 = null;
        java.lang.String str24 = fixedDateTimeZone4.getShortName(100L, locale23);
        java.lang.String str26 = fixedDateTimeZone4.getShortName((-698399900L));
        java.util.TimeZone timeZone27 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str28 = fixedDateTimeZone4.getID();
        java.lang.String str30 = fixedDateTimeZone4.getName((-204L));
        int int32 = fixedDateTimeZone4.getStandardOffset((-349800139L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-48L) + "'", long16 == (-48L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-3L) + "'", long18 == (-3L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-99L) + "'", long21 == (-99L));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.100" + "'", str26, "+00:00:00.100");
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+97:00" + "'", str28, "+97:00");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.100" + "'", str30, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long17 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, (long) ' ');
        int int19 = fixedDateTimeZone4.getOffsetFromLocal((long) (byte) 10);
        java.lang.String str21 = fixedDateTimeZone4.getShortName((long) 'a');
        long long23 = fixedDateTimeZone4.previousTransition((-97L));
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.100" + "'", str21, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-97L) + "'", long23 == (-97L));
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        int int6 = fixedDateTimeZone4.getOffset(349200010L);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        java.lang.String str9 = fixedDateTimeZone4.getShortName((long) (short) 0);
        int int11 = fixedDateTimeZone4.getOffsetFromLocal(1L);
        long long13 = fixedDateTimeZone4.nextTransition(349199900L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.097" + "'", str9, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 349199900L + "'", long13 == 349199900L);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        java.lang.String str9 = fixedDateTimeZone4.getNameKey((-349199901L));
        long long11 = fixedDateTimeZone4.previousTransition((-349200101L));
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getName((-203L), locale13);
        boolean boolean15 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349200101L) + "'", long11 == (-349200101L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.util.Locale locale14 = null;
        java.lang.String str15 = fixedDateTimeZone4.getShortName((-349800036L), locale14);
        boolean boolean17 = fixedDateTimeZone4.isStandardOffset((-198L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (int) (byte) 1);
        long long4 = dateTimeZone2.convertUTCToLocal(349199910L);
        long long7 = dateTimeZone2.convertLocalToUTC((-48L), false);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 475259910L + "'", long4 == 475259910L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-126060048L) + "'", long7 == (-126060048L));
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((-349199966L), locale3);
        java.lang.String str6 = dateTimeZone1.getName(349200034L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, (int) ' ');
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 100, (int) (byte) 10);
        int int6 = fixedDateTimeZone4.getOffsetFromLocal((long) (byte) 1);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = fixedDateTimeZone4.getOffset(readableInstant7);
        long long11 = fixedDateTimeZone4.adjustOffset(0L, false);
        boolean boolean12 = fixedDateTimeZone4.isFixed();
        java.lang.String str14 = fixedDateTimeZone4.getShortName((-349200096L));
        int int16 = fixedDateTimeZone4.getOffsetFromLocal((-68L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        long long9 = fixedDateTimeZone4.convertLocalToUTC((long) ' ', true, (long) (byte) 1);
        java.util.Locale locale11 = null;
        java.lang.String str12 = fixedDateTimeZone4.getShortName((long) (byte) 10, locale11);
        int int14 = fixedDateTimeZone4.getOffsetFromLocal(4199899L);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime15);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-68L) + "'", long9 == (-68L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        int int6 = fixedDateTimeZone4.getOffset(349200010L);
        long long8 = fixedDateTimeZone4.nextTransition(100L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = fixedDateTimeZone4.getName(0L, locale10);
        long long14 = fixedDateTimeZone4.convertLocalToUTC(126059910L, true);
        java.lang.String str16 = fixedDateTimeZone4.getName((-10L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.097" + "'", str11, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 126059813L + "'", long14 == 126059813L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.097" + "'", str16, "+00:00:00.097");
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-68L));
        long long10 = fixedDateTimeZone4.adjustOffset((-65L), true);
        long long14 = fixedDateTimeZone4.convertLocalToUTC(38L, false, 0L);
        long long16 = fixedDateTimeZone4.nextTransition((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-65L) + "'", long10 == (-65L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-59L) + "'", long14 == (-59L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        long long3 = dateTimeZone0.getMillisKeepLocal(dateTimeZone1, (-349200001L));
        java.lang.String str5 = dateTimeZone0.getName(1L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-349200101L) + "'", long3 == (-349200101L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
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
        java.util.Locale locale28 = null;
        java.lang.String str29 = fixedDateTimeZone4.getShortName((-43L), locale28);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-201L) + "'", long9 == (-201L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+97:00" + "'", str20, "+97:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+97:00" + "'", str22, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.100" + "'", str25, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00:00.100" + "'", str29, "+00:00:00.100");
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long17 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, (long) ' ');
        long long21 = fixedDateTimeZone15.convertLocalToUTC(97L, true, 349200032L);
        long long23 = fixedDateTimeZone15.previousTransition(349199867L);
        long long27 = fixedDateTimeZone15.convertLocalToUTC(0L, false, (-698399748L));
        long long31 = fixedDateTimeZone15.convertLocalToUTC((-349200197L), false, 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 349199867L + "'", long23 == 349199867L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-97L) + "'", long27 == (-97L));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-349200294L) + "'", long31 == (-349200294L));
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        int int8 = fixedDateTimeZone4.getStandardOffset((long) (-1));
        int int10 = fixedDateTimeZone4.getStandardOffset((long) 97);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int13 = fixedDateTimeZone4.getOffsetFromLocal((-59803L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        int int10 = fixedDateTimeZone4.getStandardOffset((long) (short) 0);
        int int12 = fixedDateTimeZone4.getStandardOffset((long) (byte) 10);
        java.lang.String str13 = fixedDateTimeZone4.getID();
        java.util.TimeZone timeZone14 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        long long18 = dateTimeZone15.adjustOffset(349199702L, false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 349199702L + "'", long18 == 349199702L);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        java.lang.String str10 = fixedDateTimeZone4.getShortName(49L);
        int int12 = fixedDateTimeZone4.getOffset((-349200068L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.100" + "'", str10, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        int int12 = fixedDateTimeZone4.getStandardOffset(1L);
        long long16 = fixedDateTimeZone4.convertLocalToUTC((long) '4', false, (long) (short) 1);
        boolean boolean17 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-48L) + "'", long16 == (-48L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition((long) (short) 0);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        long long14 = fixedDateTimeZone4.convertLocalToUTC(0L, false);
        boolean boolean16 = fixedDateTimeZone4.isStandardOffset(349200010L);
        java.lang.String str17 = fixedDateTimeZone4.toString();
        java.lang.String str19 = fixedDateTimeZone4.getNameKey((-349199901L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-100L) + "'", long14 == (-100L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+97:00" + "'", str19, "+97:00");
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(97L);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long13 = fixedDateTimeZone4.nextTransition((long) (byte) 0);
        java.util.Locale locale15 = null;
        java.lang.String str16 = fixedDateTimeZone4.getName((-827999606L), locale15);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+32:10", "+00:00:00.001", 0, (int) (byte) 0);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.util.TimeZone timeZone12 = fixedDateTimeZone4.toTimeZone();
        long long16 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) 100, false, 32L);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = fixedDateTimeZone4.getOffset(readableInstant19);
        int int22 = fixedDateTimeZone4.getStandardOffset((-698399936L));
        java.lang.String str24 = fixedDateTimeZone4.getNameKey((-349200236L));
        int int26 = fixedDateTimeZone4.getOffset((-349200001L));
        org.joda.time.ReadableInstant readableInstant27 = null;
        int int28 = fixedDateTimeZone4.getOffset(readableInstant27);
        int int30 = fixedDateTimeZone4.getStandardOffset((-349200090L));
        boolean boolean31 = fixedDateTimeZone4.isFixed();
        long long33 = fixedDateTimeZone4.nextTransition((-349200101L));
        long long37 = fixedDateTimeZone4.convertLocalToUTC(126059813L, false, (-349200067L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+97:00" + "'", str24, "+97:00");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-349200101L) + "'", long33 == (-349200101L));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 126059713L + "'", long37 == 126059713L);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        int int6 = fixedDateTimeZone4.getOffset(349200010L);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        java.util.TimeZone timeZone8 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str9 = fixedDateTimeZone4.toString();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone14 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 100, (int) (byte) 10);
        int int16 = fixedDateTimeZone14.getOffsetFromLocal((long) (byte) 1);
        java.util.TimeZone timeZone17 = fixedDateTimeZone14.toTimeZone();
        java.lang.String str19 = fixedDateTimeZone14.getNameKey((-349199901L));
        org.joda.time.ReadableInstant readableInstant20 = null;
        int int21 = fixedDateTimeZone14.getOffset(readableInstant20);
        boolean boolean22 = fixedDateTimeZone4.equals((java.lang.Object) readableInstant20);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long15 = dateTimeZone11.getMillisKeepLocal(dateTimeZone13, (long) ' ');
        long long18 = dateTimeZone13.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        long long22 = dateTimeZone13.convertLocalToUTC((long) (byte) 0, false);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long26 = dateTimeZone13.getMillisKeepLocal(dateTimeZone24, (long) 1);
        long long28 = dateTimeZone10.getMillisKeepLocal(dateTimeZone13, (long) 0);
        boolean boolean29 = fixedDateTimeZone4.equals((java.lang.Object) dateTimeZone10);
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone10.getName(97L, locale31);
        long long35 = dateTimeZone10.convertLocalToUTC(0L, true);
        long long38 = dateTimeZone10.adjustOffset((-349200068L), false);
        long long42 = dateTimeZone10.convertLocalToUTC((-349799900L), true, (-118799900L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-349199868L) + "'", long15 == (-349199868L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-349200001L) + "'", long18 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-349200000L) + "'", long22 == (-349200000L));
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+97:00" + "'", str32, "+97:00");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-349200000L) + "'", long35 == (-349200000L));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-349200068L) + "'", long38 == (-349200068L));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-698999900L) + "'", long42 == (-698999900L));
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("-00:00:00.001", "hi!", (int) (short) 10, 97);
        int int6 = fixedDateTimeZone4.getOffsetFromLocal((-10L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.097", "+10:00", 0, (int) (short) 0);
        int int6 = fixedDateTimeZone4.getOffsetFromLocal((-349200301L));
        int int8 = fixedDateTimeZone4.getStandardOffset((long) 10);
        int int10 = fixedDateTimeZone4.getStandardOffset((long) 349200000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long17 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, (long) ' ');
        long long19 = fixedDateTimeZone4.nextTransition(0L);
        long long22 = fixedDateTimeZone4.adjustOffset((-349199901L), true);
        boolean boolean23 = fixedDateTimeZone4.isFixed();
        org.joda.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime24);
        java.lang.String str27 = fixedDateTimeZone4.getName((long) 6720000);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-349199901L) + "'", long22 == (-349199901L));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.100" + "'", str27, "+00:00:00.100");
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 10);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone6 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long8 = fixedDateTimeZone6.previousTransition((long) ' ');
        long long10 = fixedDateTimeZone6.previousTransition((long) 'a');
        int int12 = fixedDateTimeZone6.getStandardOffset((long) (short) 0);
        int int14 = fixedDateTimeZone6.getStandardOffset((long) (byte) 10);
        long long17 = fixedDateTimeZone6.convertLocalToUTC((long) 1, true);
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = fixedDateTimeZone6.getOffset(readableInstant18);
        long long21 = dateTimeZone1.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone6, 49L);
        int int23 = fixedDateTimeZone6.getStandardOffset((long) (byte) 0);
        int int25 = fixedDateTimeZone6.getStandardOffset((-349199936L));
        java.util.Locale locale27 = null;
        java.lang.String str28 = fixedDateTimeZone6.getShortName(232L, locale27);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-99L) + "'", long17 == (-99L));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-41L) + "'", long21 == (-41L));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.100" + "'", str28, "+00:00:00.100");
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long17 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, (long) ' ');
        int int19 = fixedDateTimeZone4.getOffsetFromLocal((long) (byte) 10);
        java.lang.String str21 = fixedDateTimeZone4.getShortName((long) 'a');
        int int23 = fixedDateTimeZone4.getOffset((-65L));
        long long25 = fixedDateTimeZone4.nextTransition((-349199968L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.100" + "'", str21, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-349199968L) + "'", long25 == (-349199968L));
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 100, (int) (byte) 10);
        int int6 = fixedDateTimeZone4.getOffsetFromLocal((long) (byte) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) 0);
        java.util.TimeZone timeZone9 = fixedDateTimeZone4.toTimeZone();
        long long11 = fixedDateTimeZone4.convertUTCToLocal((long) 97);
        int int13 = fixedDateTimeZone4.getStandardOffset((-599900L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 197L + "'", long11 == 197L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long4 = dateTimeZone0.convertLocalToUTC((-349200001L), false, (long) (byte) 100);
        boolean boolean6 = dateTimeZone0.isStandardOffset((-100L));
        java.lang.String str8 = dateTimeZone0.getName((-125999903L));
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone0.isLocalDateTimeGap(localDateTime9);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long17 = fixedDateTimeZone15.previousTransition((long) ' ');
        long long19 = fixedDateTimeZone15.previousTransition((long) 'a');
        long long21 = fixedDateTimeZone15.previousTransition(349200000L);
        int int23 = fixedDateTimeZone15.getStandardOffset(1L);
        long long27 = fixedDateTimeZone15.convertLocalToUTC((long) '4', false, (long) (short) 1);
        long long29 = fixedDateTimeZone15.previousTransition((-3L));
        long long32 = fixedDateTimeZone15.convertLocalToUTC(1L, false);
        java.util.Locale locale34 = null;
        java.lang.String str35 = fixedDateTimeZone15.getShortName(100L, locale34);
        java.lang.String str36 = fixedDateTimeZone15.getID();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone41 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str43 = fixedDateTimeZone41.getNameKey(100L);
        long long47 = fixedDateTimeZone41.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone48 = fixedDateTimeZone41.toTimeZone();
        java.util.Locale locale50 = null;
        java.lang.String str51 = fixedDateTimeZone41.getShortName(0L, locale50);
        java.lang.String str53 = fixedDateTimeZone41.getNameKey((-101L));
        long long55 = fixedDateTimeZone41.nextTransition((-68L));
        long long57 = fixedDateTimeZone15.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone41, 32L);
        java.util.Locale locale59 = null;
        java.lang.String str60 = fixedDateTimeZone41.getName((-349199966L), locale59);
        long long62 = fixedDateTimeZone41.nextTransition(7L);
        long long64 = dateTimeZone0.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone41, (-248L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-698400001L) + "'", long4 == (-698400001L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+97:00" + "'", str8, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 349200000L + "'", long21 == 349200000L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-48L) + "'", long27 == (-48L));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-3L) + "'", long29 == (-3L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-99L) + "'", long32 == (-99L));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00:00.100" + "'", str35, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+97:00" + "'", str36, "+97:00");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+97:00" + "'", str43, "+97:00");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-100L) + "'", long47 == (-100L));
        org.junit.Assert.assertNotNull(timeZone48);
        org.junit.Assert.assertEquals(timeZone48.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "+00:00:00.100" + "'", str51, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "+97:00" + "'", str53, "+97:00");
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-68L) + "'", long55 == (-68L));
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 32L + "'", long57 == 32L);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "+00:00:00.100" + "'", str60, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 7L + "'", long62 == 7L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 349199652L + "'", long64 == 349199652L);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("-00:00:00.001", "+00:00:00.032", 10, (-1));
        java.lang.String str5 = fixedDateTimeZone4.toString();
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-698400190L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.010" + "'", str7, "+00:00:00.010");
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        int int8 = fixedDateTimeZone4.getStandardOffset((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        java.lang.String str12 = dateTimeZone10.getShortName((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        long long17 = dateTimeZone13.convertLocalToUTC((-349200001L), false, (long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str20 = dateTimeZone18.getShortName((long) (byte) 0);
        long long22 = dateTimeZone13.getMillisKeepLocal(dateTimeZone18, 0L);
        long long24 = dateTimeZone10.getMillisKeepLocal(dateTimeZone18, 100L);
        long long26 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone10, (-349199948L));
        org.joda.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = dateTimeZone10.isLocalDateTimeGap(localDateTime27);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-698400001L) + "'", long17 == (-698400001L));
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+97:00" + "'", str20, "+97:00");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-698399848L) + "'", long26 == (-698399848L));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 349200000);
        int int12 = fixedDateTimeZone4.getOffsetFromLocal(0L);
        java.lang.String str14 = fixedDateTimeZone4.getNameKey((-349200298L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone19 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.util.TimeZone timeZone20 = fixedDateTimeZone19.toTimeZone();
        java.util.Locale locale22 = null;
        java.lang.String str23 = fixedDateTimeZone19.getShortName((long) (short) 100, locale22);
        java.lang.String str25 = fixedDateTimeZone19.getNameKey((-59965L));
        long long27 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone19, (-97L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+97:00" + "'", str14, "+97:00");
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.100" + "'", str23, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+97:00" + "'", str25, "+97:00");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-97L) + "'", long27 == (-97L));
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        long long9 = fixedDateTimeZone4.convertLocalToUTC((long) ' ', true, (long) (byte) 1);
        long long11 = fixedDateTimeZone4.previousTransition(0L);
        int int13 = fixedDateTimeZone4.getOffsetFromLocal((long) (byte) 10);
        long long16 = fixedDateTimeZone4.convertLocalToUTC((-68L), false);
        int int18 = fixedDateTimeZone4.getStandardOffset((-698400001L));
        java.util.TimeZone timeZone19 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-68L) + "'", long9 == (-68L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-168L) + "'", long16 == (-168L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone20);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.nextTransition((-101L));
        java.lang.String str8 = fixedDateTimeZone4.getNameKey((long) (short) 0);
        long long10 = fixedDateTimeZone4.convertUTCToLocal(32L);
        int int12 = fixedDateTimeZone4.getOffset((-698399748L));
        long long14 = fixedDateTimeZone4.nextTransition(4199999L);
        java.lang.String str15 = fixedDateTimeZone4.getID();
        int int17 = fixedDateTimeZone4.getOffsetFromLocal(136L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-101L) + "'", long6 == (-101L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+97:00" + "'", str8, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 132L + "'", long10 == 132L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 4199999L + "'", long14 == 4199999L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(97L);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long13 = fixedDateTimeZone4.nextTransition((long) (byte) 0);
        java.lang.String str14 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+97:00" + "'", str14, "+97:00");
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
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
        java.lang.String str30 = fixedDateTimeZone14.getName((-48L));
        long long32 = fixedDateTimeZone14.previousTransition((-349200001L));
        java.lang.String str33 = fixedDateTimeZone14.toString();
        java.lang.String str34 = fixedDateTimeZone14.toString();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.100" + "'", str30, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-349200001L) + "'", long32 == (-349200001L));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+97:00" + "'", str33, "+97:00");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+97:00" + "'", str34, "+97:00");
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition((long) (short) 0);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str12 = fixedDateTimeZone4.getID();
        java.lang.String str14 = fixedDateTimeZone4.getName(10L);
        boolean boolean15 = fixedDateTimeZone4.isFixed();
        boolean boolean16 = fixedDateTimeZone4.isFixed();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone21 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long23 = fixedDateTimeZone21.previousTransition((long) ' ');
        java.lang.String str24 = fixedDateTimeZone21.getID();
        java.lang.String str26 = fixedDateTimeZone21.getNameKey((long) (short) 10);
        boolean boolean27 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone21);
        org.joda.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = fixedDateTimeZone21.isLocalDateTimeGap(localDateTime28);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+97:00" + "'", str24, "+97:00");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+97:00" + "'", str26, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime5);
        java.util.TimeZone timeZone7 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str8 = fixedDateTimeZone4.toString();
        long long11 = fixedDateTimeZone4.convertLocalToUTC(349199699L, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+97:00" + "'", str8, "+97:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 349199599L + "'", long11 == 349199599L);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, 6720000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 6720000");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition((long) (short) 0);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str12 = fixedDateTimeZone4.toString();
        java.util.TimeZone timeZone13 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        long long16 = dateTimeZone14.convertUTCToLocal(349200100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 349200100L + "'", long16 == 349200100L);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        int int12 = fixedDateTimeZone4.getStandardOffset(1L);
        long long14 = fixedDateTimeZone4.previousTransition((long) 10);
        java.lang.String str15 = fixedDateTimeZone4.toString();
        long long17 = fixedDateTimeZone4.convertUTCToLocal(4199899L);
        java.util.Locale locale19 = null;
        java.lang.String str20 = fixedDateTimeZone4.getShortName((-345600501L), locale19);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 4199999L + "'", long17 == 4199999L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone0.getMillisKeepLocal(dateTimeZone2, (long) ' ');
        long long7 = dateTimeZone2.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long10 = dateTimeZone2.convertUTCToLocal(0L);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone2.getShortName((-698399900L), locale12);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-349199868L) + "'", long4 == (-349199868L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349200001L) + "'", long7 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        int int12 = fixedDateTimeZone4.getStandardOffset(1L);
        long long16 = fixedDateTimeZone4.convertLocalToUTC((long) '4', false, (long) (short) 1);
        java.util.Locale locale18 = null;
        java.lang.String str19 = fixedDateTimeZone4.getName((long) 97, locale18);
        boolean boolean21 = fixedDateTimeZone4.isStandardOffset((-698399848L));
        long long23 = fixedDateTimeZone4.previousTransition(349199900L);
        java.util.Locale locale25 = null;
        java.lang.String str26 = fixedDateTimeZone4.getShortName((-1L), locale25);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-48L) + "'", long16 == (-48L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 349199900L + "'", long23 == 349199900L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.100" + "'", str26, "+00:00:00.100");
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        int int8 = fixedDateTimeZone4.getStandardOffset((long) (-1));
        int int10 = fixedDateTimeZone4.getStandardOffset((long) 97);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        int int13 = fixedDateTimeZone4.getStandardOffset((-349799900L));
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime14);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        boolean boolean6 = fixedDateTimeZone4.isStandardOffset((long) '#');
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        java.lang.String str9 = fixedDateTimeZone4.getName(349199910L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.097" + "'", str9, "+00:00:00.097");
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone11 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long13 = fixedDateTimeZone11.previousTransition((long) ' ');
        long long15 = fixedDateTimeZone11.previousTransition((long) 'a');
        int int17 = fixedDateTimeZone11.getStandardOffset((long) (short) 0);
        long long20 = fixedDateTimeZone11.convertLocalToUTC((long) 0, true);
        int int22 = fixedDateTimeZone11.getOffset((-349199999L));
        boolean boolean23 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone11);
        int int25 = fixedDateTimeZone11.getOffset(3660000L);
        int int27 = fixedDateTimeZone11.getOffset((-99L));
        java.lang.String str29 = fixedDateTimeZone11.getName(31L);
        long long32 = fixedDateTimeZone11.adjustOffset((-43L), true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-100L) + "'", long20 == (-100L));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00:00.100" + "'", str29, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-43L) + "'", long32 == (-43L));
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone9 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str11 = fixedDateTimeZone9.getNameKey((long) 1);
        long long13 = fixedDateTimeZone9.nextTransition((long) (short) 100);
        java.lang.String str15 = fixedDateTimeZone9.getNameKey(97L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone20 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str22 = fixedDateTimeZone20.getNameKey((long) 1);
        long long24 = fixedDateTimeZone20.nextTransition((long) (short) 100);
        java.lang.String str26 = fixedDateTimeZone20.getNameKey(97L);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone20);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone20);
        boolean boolean29 = fixedDateTimeZone9.equals((java.lang.Object) fixedDateTimeZone20);
        java.util.TimeZone timeZone30 = fixedDateTimeZone9.toTimeZone();
        long long33 = fixedDateTimeZone9.adjustOffset((long) (byte) -1, false);
        long long35 = fixedDateTimeZone9.previousTransition(132L);
        long long37 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone9, (long) (short) -1);
        java.lang.Class<?> wildcardClass38 = fixedDateTimeZone9.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+97:00" + "'", str11, "+97:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+97:00" + "'", str22, "+97:00");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+97:00" + "'", str26, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 132L + "'", long35 == 132L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "+00:00:00.100", 10, (int) (byte) 10);
        boolean boolean6 = fixedDateTimeZone4.isStandardOffset((-201L));
        int int8 = fixedDateTimeZone4.getOffset(349199999L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) (byte) 10);
        boolean boolean4 = dateTimeZone2.isStandardOffset((-349200290L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
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
        java.lang.String str30 = fixedDateTimeZone14.getName((-48L));
        long long32 = fixedDateTimeZone14.previousTransition((-349200001L));
        java.lang.String str33 = fixedDateTimeZone14.toString();
        java.lang.String str35 = fixedDateTimeZone14.getShortName((-60001L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone40 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long42 = fixedDateTimeZone40.previousTransition((long) ' ');
        long long44 = fixedDateTimeZone40.previousTransition((long) 'a');
        long long46 = fixedDateTimeZone40.previousTransition((long) (short) 0);
        int int48 = fixedDateTimeZone40.getOffsetFromLocal((long) (byte) 0);
        boolean boolean50 = fixedDateTimeZone40.isStandardOffset((-349199936L));
        java.util.Locale locale52 = null;
        java.lang.String str53 = fixedDateTimeZone40.getName((-200L), locale52);
        boolean boolean54 = fixedDateTimeZone14.equals((java.lang.Object) str53);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.100" + "'", str30, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-349200001L) + "'", long32 == (-349200001L));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+97:00" + "'", str33, "+97:00");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00:00.100" + "'", str35, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 32L + "'", long42 == 32L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 97L + "'", long44 == 97L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "+00:00:00.100" + "'", str53, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.nextTransition((-101L));
        java.lang.String str8 = fixedDateTimeZone4.getNameKey((long) (short) 0);
        long long10 = fixedDateTimeZone4.convertUTCToLocal(32L);
        int int12 = fixedDateTimeZone4.getOffset((-698399748L));
        long long14 = fixedDateTimeZone4.nextTransition(4199999L);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime15);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-101L) + "'", long6 == (-101L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+97:00" + "'", str8, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 132L + "'", long10 == 132L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 4199999L + "'", long14 == 4199999L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(0L);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(97L);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long13 = fixedDateTimeZone4.nextTransition((long) (byte) 0);
        java.util.TimeZone timeZone14 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone15.getOffset(readableInstant16);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        int int6 = fixedDateTimeZone4.getOffset(349200010L);
        long long8 = fixedDateTimeZone4.nextTransition(100L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = fixedDateTimeZone4.getOffset(readableInstant9);
        java.util.Locale locale12 = null;
        java.lang.String str13 = fixedDateTimeZone4.getShortName((-140L), locale12);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.097" + "'", str13, "+00:00:00.097");
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+32:00", "-00:00:00.001", (int) (byte) 10, 97);
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "+35:10", 6720000, 10);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = fixedDateTimeZone4.getID();
        java.lang.String str9 = fixedDateTimeZone4.getNameKey((long) (short) 10);
        int int11 = fixedDateTimeZone4.getOffsetFromLocal((-101L));
        long long13 = fixedDateTimeZone4.nextTransition(38L);
        long long15 = fixedDateTimeZone4.convertUTCToLocal((long) 115800000);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+97:00" + "'", str7, "+97:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 38L + "'", long13 == 38L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115800100L + "'", long15 == 115800100L);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long7 = dateTimeZone4.convertLocalToUTC((long) (byte) 1, false);
        java.lang.String str9 = dateTimeZone4.getShortName((long) ' ');
        long long11 = dateTimeZone0.getMillisKeepLocal(dateTimeZone4, 0L);
        long long13 = dateTimeZone0.convertUTCToLocal(32L);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone0.getShortName((-1L), locale15);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.Class<?> wildcardClass18 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199999L) + "'", long7 == (-349199999L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349199900L) + "'", long11 == (-349199900L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 132L + "'", long13 == 132L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-68L));
        long long10 = fixedDateTimeZone4.adjustOffset((-65L), true);
        java.lang.String str11 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-65L) + "'", long10 == (-65L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+97:00" + "'", str11, "+97:00");
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("-00:00:00.001", "+00:00:00.032", (int) (byte) 10, 97);
        boolean boolean6 = fixedDateTimeZone4.equals((java.lang.Object) (-349200136L));
        java.lang.String str7 = fixedDateTimeZone4.toString();
        java.lang.String str9 = fixedDateTimeZone4.getName(59700L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.010" + "'", str9, "+00:00:00.010");
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) ' ');
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        java.lang.String str9 = fixedDateTimeZone4.getNameKey((-349199901L));
        long long11 = fixedDateTimeZone4.nextTransition((-68L));
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = fixedDateTimeZone4.getOffset(readableInstant12);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone18 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long20 = fixedDateTimeZone18.previousTransition((long) ' ');
        long long22 = fixedDateTimeZone18.previousTransition((long) 'a');
        long long24 = fixedDateTimeZone18.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone29 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long31 = fixedDateTimeZone18.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone29, (long) ' ');
        boolean boolean32 = fixedDateTimeZone29.isFixed();
        long long35 = fixedDateTimeZone29.convertLocalToUTC((-349199999L), false);
        boolean boolean36 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone29);
        org.joda.time.ReadableInstant readableInstant37 = null;
        int int38 = fixedDateTimeZone29.getOffset(readableInstant37);
        org.joda.time.LocalDateTime localDateTime39 = null;
        boolean boolean40 = fixedDateTimeZone29.isLocalDateTimeGap(localDateTime39);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-68L) + "'", long11 == (-68L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 97L + "'", long22 == 97L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 349200000L + "'", long24 == 349200000L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 35L + "'", long31 == 35L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-349200096L) + "'", long35 == (-349200096L));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 97 + "'", int38 == 97);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str1 = dateTimeZone0.toString();
        long long5 = dateTimeZone0.convertLocalToUTC((-64L), false, 349199910L);
        java.lang.String str7 = dateTimeZone0.getShortName(349200133L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "+97:00" + "'", str1, "+97:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-164L) + "'", long5 == (-164L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.100" + "'", str7, "+00:00:00.100");
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.util.TimeZone timeZone8 = fixedDateTimeZone4.toTimeZone();
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((-349199868L));
        int int12 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        int int14 = fixedDateTimeZone4.getOffsetFromLocal((-64L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone19 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str21 = fixedDateTimeZone19.getNameKey(100L);
        long long25 = fixedDateTimeZone19.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone26 = fixedDateTimeZone19.toTimeZone();
        java.util.TimeZone timeZone27 = fixedDateTimeZone19.toTimeZone();
        long long31 = fixedDateTimeZone19.convertLocalToUTC((long) (byte) 100, false, 32L);
        org.joda.time.LocalDateTime localDateTime32 = null;
        boolean boolean33 = fixedDateTimeZone19.isLocalDateTimeGap(localDateTime32);
        java.util.Locale locale35 = null;
        java.lang.String str36 = fixedDateTimeZone19.getName(132L, locale35);
        boolean boolean37 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone19);
        int int39 = fixedDateTimeZone19.getOffset(7L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+97:00" + "'", str21, "+97:00");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-100L) + "'", long25 == (-100L));
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00:00.100" + "'", str36, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(97L);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long13 = fixedDateTimeZone4.nextTransition((long) (byte) 0);
        java.util.TimeZone timeZone14 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale2 = null;
        java.lang.String str3 = dateTimeZone0.getName((long) (short) 100, locale2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone0.getOffset(readableInstant4);
        java.lang.String str7 = dateTimeZone0.getShortName(35L);
        long long10 = dateTimeZone0.convertLocalToUTC((-68L), true);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone0.getName(200L, locale12);
        java.lang.String str14 = dateTimeZone0.toString();
        java.lang.String str16 = dateTimeZone0.getName((-9L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-68L) + "'", long10 == (-68L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long15 = dateTimeZone11.getMillisKeepLocal(dateTimeZone13, (long) ' ');
        long long18 = dateTimeZone13.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        long long22 = dateTimeZone13.convertLocalToUTC((long) (byte) 0, false);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long26 = dateTimeZone13.getMillisKeepLocal(dateTimeZone24, (long) 1);
        long long28 = dateTimeZone10.getMillisKeepLocal(dateTimeZone13, (long) 0);
        boolean boolean29 = fixedDateTimeZone4.equals((java.lang.Object) dateTimeZone10);
        java.util.Locale locale31 = null;
        java.lang.String str32 = fixedDateTimeZone4.getShortName(349200010L, locale31);
        long long35 = fixedDateTimeZone4.adjustOffset((long) 1, false);
        java.lang.String str36 = fixedDateTimeZone4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-349199868L) + "'", long15 == (-349199868L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-349200001L) + "'", long18 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-349200000L) + "'", long22 == (-349200000L));
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.100" + "'", str32, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+97:00" + "'", str36, "+97:00");
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        java.lang.String str3 = dateTimeZone1.getShortName((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        long long8 = dateTimeZone4.convertLocalToUTC((-349200001L), false, (long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str11 = dateTimeZone9.getShortName((long) (byte) 0);
        long long13 = dateTimeZone4.getMillisKeepLocal(dateTimeZone9, 0L);
        long long15 = dateTimeZone1.getMillisKeepLocal(dateTimeZone9, 100L);
        java.lang.String str17 = dateTimeZone9.getName((long) (short) 0);
        java.lang.String str19 = dateTimeZone9.getName((-698399803L));
        long long21 = dateTimeZone9.convertUTCToLocal(349200099L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+97:00" + "'", str3, "+97:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-698400001L) + "'", long8 == (-698400001L));
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+97:00" + "'", str11, "+97:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+97:00" + "'", str19, "+97:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 698400099L + "'", long21 == 698400099L);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(97L);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long13 = fixedDateTimeZone4.nextTransition((long) (byte) 0);
        java.util.TimeZone timeZone14 = fixedDateTimeZone4.toTimeZone();
        long long17 = fixedDateTimeZone4.adjustOffset((-349200096L), true);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.lang.Class<?> wildcardClass19 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-349200096L) + "'", long17 == (-349200096L));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(0L);
        java.lang.String str7 = fixedDateTimeZone4.getID();
        long long9 = fixedDateTimeZone4.nextTransition((-125999903L));
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long13 = fixedDateTimeZone4.adjustOffset((-3600062L), false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+97:00" + "'", str7, "+97:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-125999903L) + "'", long9 == (-125999903L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-3600062L) + "'", long13 == (-3600062L));
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.util.TimeZone timeZone12 = fixedDateTimeZone4.toTimeZone();
        long long16 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) 100, false, 32L);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = fixedDateTimeZone4.getOffset(readableInstant19);
        int int22 = fixedDateTimeZone4.getStandardOffset((-698399936L));
        java.lang.String str24 = fixedDateTimeZone4.getNameKey((-349200236L));
        org.joda.time.tz.Provider provider25 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider25);
        org.joda.time.DateTimeZone.setProvider(provider25);
        org.joda.time.DateTimeZone.setProvider(provider25);
        org.joda.time.DateTimeZone.setProvider(provider25);
        org.joda.time.DateTimeZone.setProvider(provider25);
        org.joda.time.DateTimeZone.setProvider(provider25);
        boolean boolean32 = fixedDateTimeZone4.equals((java.lang.Object) provider25);
        java.lang.String str33 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+97:00" + "'", str24, "+97:00");
        org.junit.Assert.assertNotNull(provider25);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+97:00" + "'", str33, "+97:00");
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition((long) (short) 0);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str12 = fixedDateTimeZone4.toString();
        long long14 = fixedDateTimeZone4.convertUTCToLocal(3660100L);
        boolean boolean16 = fixedDateTimeZone4.isStandardOffset((-698399968L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3660200L + "'", long14 == 3660200L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        long long14 = fixedDateTimeZone4.convertLocalToUTC(3660100L, false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone19 = new org.joda.time.tz.FixedDateTimeZone("UTC", "+00:01", 0, (int) (byte) 0);
        int int21 = fixedDateTimeZone19.getOffset((-349200290L));
        boolean boolean22 = fixedDateTimeZone19.isFixed();
        long long24 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone19, 349199652L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3660000L + "'", long14 == 3660000L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 349199752L + "'", long24 == 349199752L);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime11);
        boolean boolean13 = fixedDateTimeZone4.isFixed();
        long long16 = fixedDateTimeZone4.adjustOffset((-10L), true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-10L) + "'", long16 == (-10L));
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition((long) (short) 0);
        java.lang.String str11 = fixedDateTimeZone4.getID();
        long long15 = fixedDateTimeZone4.convertLocalToUTC((long) 97, false, (-349199871L));
        java.lang.String str17 = fixedDateTimeZone4.getName((long) 1);
        java.lang.String str19 = fixedDateTimeZone4.getShortName((-62L));
        long long23 = fixedDateTimeZone4.convertLocalToUTC((-349200099L), false, (-349200096L));
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = fixedDateTimeZone4.getOffset(readableInstant24);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+97:00" + "'", str11, "+97:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-3L) + "'", long15 == (-3L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-349200199L) + "'", long23 == (-349200199L));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(97L);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long14 = fixedDateTimeZone4.previousTransition((-698400100L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-698400100L) + "'", long14 == (-698400100L));
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getShortName((long) (byte) 10);
        long long8 = fixedDateTimeZone4.convertUTCToLocal((-349199968L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-349199868L) + "'", long8 == (-349199868L));
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition((long) (short) 0);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str12 = fixedDateTimeZone4.getID();
        java.lang.String str14 = fixedDateTimeZone4.getName(10L);
        boolean boolean15 = fixedDateTimeZone4.isFixed();
        long long17 = fixedDateTimeZone4.nextTransition((-349200190L));
        java.util.TimeZone timeZone18 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        java.lang.String str20 = dateTimeZone19.getID();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-349200190L) + "'", long17 == (-349200190L));
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
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
        java.lang.Class<?> wildcardClass24 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long17 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, (long) ' ');
        boolean boolean18 = fixedDateTimeZone15.isFixed();
        long long21 = fixedDateTimeZone15.convertLocalToUTC((-349199999L), false);
        long long23 = fixedDateTimeZone15.previousTransition((-68L));
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = fixedDateTimeZone15.getOffset(readableInstant24);
        java.lang.String str27 = fixedDateTimeZone15.getNameKey((-349199868L));
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        java.lang.String str31 = dateTimeZone29.getShortName((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        long long36 = dateTimeZone32.convertLocalToUTC((-349200001L), false, (long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str39 = dateTimeZone37.getShortName((long) (byte) 0);
        long long41 = dateTimeZone32.getMillisKeepLocal(dateTimeZone37, 0L);
        long long43 = dateTimeZone29.getMillisKeepLocal(dateTimeZone37, 100L);
        long long45 = fixedDateTimeZone15.getMillisKeepLocal(dateTimeZone37, 10L);
        java.util.Locale locale47 = null;
        java.lang.String str48 = dateTimeZone37.getShortName(97L, locale47);
        long long52 = dateTimeZone37.convertLocalToUTC((-349200001L), true, (-349199968L));
        long long55 = dateTimeZone37.convertLocalToUTC((-9L), true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone37);
        java.lang.String str58 = dateTimeZone37.getName((-349200201L));
        java.util.Locale locale60 = null;
        java.lang.String str61 = dateTimeZone37.getShortName((-349199936L), locale60);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-349200096L) + "'", long21 == (-349200096L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-68L) + "'", long23 == (-68L));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+97:00" + "'", str31, "+97:00");
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-349200101L) + "'", long36 == (-349200101L));
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00:00.100" + "'", str39, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 349200000L + "'", long43 == 349200000L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 7L + "'", long45 == 7L);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+00:00:00.100" + "'", str48, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-349200101L) + "'", long52 == (-349200101L));
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-109L) + "'", long55 == (-109L));
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "+00:00:00.100" + "'", str58, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "+00:00:00.100" + "'", str61, "+00:00:00.100");
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "+00:00:00.100", 10, (int) (byte) 10);
        int int6 = fixedDateTimeZone4.getOffset((long) (byte) -1);
        int int8 = fixedDateTimeZone4.getOffsetFromLocal(0L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = fixedDateTimeZone4.getOffset(readableInstant9);
        int int12 = fixedDateTimeZone4.getOffset(35L);
        java.lang.String str14 = fixedDateTimeZone4.getShortName(0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(97L);
        java.lang.String str12 = fixedDateTimeZone4.getNameKey(349200010L);
        boolean boolean13 = fixedDateTimeZone4.isFixed();
        java.lang.String str15 = fixedDateTimeZone4.getShortName((long) '4');
        int int17 = fixedDateTimeZone4.getOffsetFromLocal((-349199999L));
        int int19 = fixedDateTimeZone4.getStandardOffset((-349200068L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 115200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 115200000");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00", "+00:01", 0, (int) (short) -1);
        long long6 = fixedDateTimeZone4.convertUTCToLocal(132L);
        java.lang.Class<?> wildcardClass7 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 132L + "'", long6 == 132L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone5 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long7 = fixedDateTimeZone5.previousTransition((long) ' ');
        long long9 = fixedDateTimeZone5.previousTransition((long) 'a');
        long long11 = fixedDateTimeZone5.previousTransition((long) (short) 0);
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone5.getName((long) (-1), locale13);
        long long16 = dateTimeZone0.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone5, (long) 97);
        long long18 = fixedDateTimeZone5.nextTransition((-349200036L));
        boolean boolean19 = fixedDateTimeZone5.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-349200036L) + "'", long18 == (-349200036L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
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
        java.lang.String str48 = fixedDateTimeZone4.getID();
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
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+97:00" + "'", str48, "+97:00");
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        int int10 = fixedDateTimeZone4.getStandardOffset((long) (short) 0);
        int int12 = fixedDateTimeZone4.getStandardOffset((long) (byte) 10);
        java.util.Locale locale14 = null;
        java.lang.String str15 = fixedDateTimeZone4.getShortName((-41L), locale14);
        int int17 = fixedDateTimeZone4.getStandardOffset(349199699L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.010", "+10:35", (int) (byte) 1, (int) (short) 0);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        long long7 = fixedDateTimeZone4.previousTransition((-59L));
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-59L) + "'", long7 == (-59L));
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.001", "+00:00:00.100", (int) (byte) 10, (int) (byte) 0);
        boolean boolean6 = fixedDateTimeZone4.isStandardOffset((-349200066L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
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
        java.lang.String str21 = fixedDateTimeZone4.getID();
        boolean boolean23 = fixedDateTimeZone4.equals((java.lang.Object) (-349199935L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+97:00" + "'", str20, "+97:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+97:00" + "'", str21, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.util.TimeZone timeZone8 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        java.lang.String str12 = fixedDateTimeZone4.getNameKey((-349199968L));
        java.lang.String str13 = fixedDateTimeZone4.getID();
        int int15 = fixedDateTimeZone4.getOffsetFromLocal((-349200101L));
        int int17 = fixedDateTimeZone4.getOffsetFromLocal((-68L));
        java.lang.String str19 = fixedDateTimeZone4.getName((-349200099L));
        boolean boolean21 = fixedDateTimeZone4.isStandardOffset((-349200201L));
        org.joda.time.ReadableInstant readableInstant22 = null;
        int int23 = fixedDateTimeZone4.getOffset(readableInstant22);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        int int9 = fixedDateTimeZone4.getOffset((long) '#');
        java.lang.String str11 = fixedDateTimeZone4.getNameKey((-349200136L));
        java.lang.String str13 = fixedDateTimeZone4.getName((-349200290L));
        java.lang.String str15 = fixedDateTimeZone4.getNameKey((-59L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+97:00" + "'", str11, "+97:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.lang.String str9 = dateTimeZone8.toString();
        long long12 = dateTimeZone8.convertLocalToUTC(59901L, true);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone8.getShortName((long) (byte) 0, locale14);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 59901L + "'", long12 == 59901L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone0.getMillisKeepLocal(dateTimeZone2, (long) ' ');
        long long7 = dateTimeZone2.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long11 = dateTimeZone2.convertLocalToUTC((long) (byte) 0, false);
        boolean boolean13 = dateTimeZone2.isStandardOffset(349199903L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-349199868L) + "'", long4 == (-349199868L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349200001L) + "'", long7 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349200000L) + "'", long11 == (-349200000L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = fixedDateTimeZone4.getID();
        java.lang.String str8 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+97:00" + "'", str7, "+97:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+97:00" + "'", str8, "+97:00");
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(35);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(97L);
        java.lang.String str12 = fixedDateTimeZone4.getNameKey(349200010L);
        boolean boolean13 = fixedDateTimeZone4.isFixed();
        java.lang.String str15 = fixedDateTimeZone4.getNameKey((long) 0);
        boolean boolean17 = fixedDateTimeZone4.isStandardOffset((-349199968L));
        java.lang.String str19 = fixedDateTimeZone4.getShortName((long) 1);
        int int21 = fixedDateTimeZone4.getOffsetFromLocal(0L);
        long long24 = fixedDateTimeZone4.adjustOffset(38L, false);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 38L + "'", long24 == 38L);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        boolean boolean10 = fixedDateTimeZone4.isStandardOffset(349200101L);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) 100, true);
        java.lang.Class<?> wildcardClass14 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        long long9 = fixedDateTimeZone4.previousTransition((long) '4');
        int int11 = fixedDateTimeZone4.getOffsetFromLocal((-349199965L));
        long long14 = fixedDateTimeZone4.adjustOffset((-349200003L), true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-349200003L) + "'", long14 == (-349200003L));
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        java.lang.String str3 = dateTimeZone1.getName((-349199999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.010" + "'", str3, "+00:00:00.010");
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        java.lang.String str12 = fixedDateTimeZone4.getNameKey((-349199968L));
        long long15 = fixedDateTimeZone4.adjustOffset((long) (-1), true);
        boolean boolean16 = fixedDateTimeZone4.isFixed();
        java.util.TimeZone timeZone17 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str19 = fixedDateTimeZone4.getNameKey(349199934L);
        java.lang.String str20 = fixedDateTimeZone4.getID();
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime21);
        java.lang.String str24 = fixedDateTimeZone4.getName((-698400201L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+97:00" + "'", str19, "+97:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+97:00" + "'", str20, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, (int) '#');
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getName((-702060001L), locale4);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:35" + "'", str5, "+00:35");
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(97L);
        java.lang.String str12 = fixedDateTimeZone4.getNameKey(349200010L);
        boolean boolean13 = fixedDateTimeZone4.isFixed();
        java.lang.String str15 = fixedDateTimeZone4.getNameKey((long) 0);
        boolean boolean17 = fixedDateTimeZone4.isStandardOffset((-349199968L));
        java.lang.String str19 = fixedDateTimeZone4.getShortName((long) 1);
        long long22 = fixedDateTimeZone4.adjustOffset((-349200097L), false);
        boolean boolean23 = fixedDateTimeZone4.isFixed();
        java.lang.String str25 = fixedDateTimeZone4.getNameKey((-349200035L));
        long long28 = fixedDateTimeZone4.convertLocalToUTC((-349200065L), false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-349200097L) + "'", long22 == (-349200097L));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+97:00" + "'", str25, "+97:00");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-349200165L) + "'", long28 == (-349200165L));
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        long long6 = dateTimeZone0.convertLocalToUTC((-349200100L), true, 100L);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone0.getShortName((long) 'a', locale8);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone0.getName(0L, locale11);
        long long15 = dateTimeZone0.adjustOffset((long) 1, false);
        boolean boolean17 = dateTimeZone0.isStandardOffset((-349199890L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-349200100L) + "'", long6 == (-349200100L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone5 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long7 = fixedDateTimeZone5.previousTransition((long) ' ');
        long long9 = fixedDateTimeZone5.previousTransition((long) 'a');
        long long11 = fixedDateTimeZone5.previousTransition((long) (short) 0);
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone5.getName((long) (-1), locale13);
        long long16 = dateTimeZone0.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone5, (long) 97);
        int int18 = fixedDateTimeZone5.getStandardOffset(0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "+00:00:00.032", 349200000, 349200000);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((-349200199L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.032" + "'", str6, "+00:00:00.032");
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone0.getMillisKeepLocal(dateTimeZone2, (long) ' ');
        long long7 = dateTimeZone2.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long11 = dateTimeZone2.convertLocalToUTC((long) (byte) 0, false);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long15 = dateTimeZone2.getMillisKeepLocal(dateTimeZone13, (long) 1);
        boolean boolean17 = dateTimeZone13.isStandardOffset((long) (short) 10);
        java.lang.String str19 = dateTimeZone13.getName(97L);
        long long23 = dateTimeZone13.convertLocalToUTC(35L, true, (-349200036L));
        long long27 = dateTimeZone13.convertLocalToUTC((-702059901L), true, (-349199890L));
        long long31 = dateTimeZone13.convertLocalToUTC(360059910L, false, 235L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-349199868L) + "'", long4 == (-349199868L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349200001L) + "'", long7 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349200000L) + "'", long11 == (-349200000L));
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+97:00" + "'", str19, "+97:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-349199965L) + "'", long23 == (-349199965L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1051259901L) + "'", long27 == (-1051259901L));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10859910L + "'", long31 == 10859910L);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        int int10 = fixedDateTimeZone4.getStandardOffset((long) (short) 0);
        int int12 = fixedDateTimeZone4.getStandardOffset((long) (byte) 10);
        java.lang.String str13 = fixedDateTimeZone4.getID();
        java.util.TimeZone timeZone14 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        java.lang.String str17 = dateTimeZone16.toString();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        long long7 = fixedDateTimeZone4.previousTransition(136L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 136L + "'", long7 == 136L);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+01:00", "+32:10", 97, 0);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        int int10 = fixedDateTimeZone4.getStandardOffset((long) (short) 0);
        int int12 = fixedDateTimeZone4.getStandardOffset((long) (byte) 10);
        long long15 = fixedDateTimeZone4.convertLocalToUTC((long) 1, true);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = fixedDateTimeZone4.getOffset(readableInstant16);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone22 = new org.joda.time.tz.FixedDateTimeZone("+00:00", "+00:00:00.032", (int) (short) -1, (int) (short) 10);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone22);
        java.lang.String str24 = fixedDateTimeZone22.getID();
        java.lang.String str26 = fixedDateTimeZone22.getNameKey((-349200101L));
        int int28 = fixedDateTimeZone22.getStandardOffset(32L);
        long long30 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone22, (-698399848L));
        long long33 = fixedDateTimeZone22.adjustOffset((-204L), true);
        int int35 = fixedDateTimeZone22.getStandardOffset((-349199904L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-99L) + "'", long15 == (-99L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.032" + "'", str26, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-698399747L) + "'", long30 == (-698399747L));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-204L) + "'", long33 == (-204L));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(97L);
        java.lang.String str12 = fixedDateTimeZone4.getNameKey(349200010L);
        boolean boolean13 = fixedDateTimeZone4.isFixed();
        java.lang.String str15 = fixedDateTimeZone4.getNameKey((long) 0);
        long long17 = fixedDateTimeZone4.previousTransition((-349200101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-349200101L) + "'", long17 == (-349200101L));
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.util.TimeZone timeZone12 = fixedDateTimeZone4.toTimeZone();
        long long16 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) 100, false, 32L);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = fixedDateTimeZone4.getOffset(readableInstant19);
        java.util.Locale locale22 = null;
        java.lang.String str23 = fixedDateTimeZone4.getName((-349200066L), locale22);
        boolean boolean24 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.100" + "'", str23, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long9 = fixedDateTimeZone4.convertLocalToUTC(349199934L, false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone14 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 100, (int) (byte) 10);
        long long16 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone14, (-303L));
        long long18 = fixedDateTimeZone4.previousTransition(38L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 349199834L + "'", long9 == 349199834L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-303L) + "'", long16 == (-303L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 38L + "'", long18 == 38L);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, 1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        int int12 = fixedDateTimeZone4.getStandardOffset(1L);
        boolean boolean13 = fixedDateTimeZone4.isFixed();
        java.util.TimeZone timeZone14 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone19 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str21 = fixedDateTimeZone19.getNameKey((long) 1);
        boolean boolean22 = fixedDateTimeZone19.isFixed();
        java.lang.String str24 = fixedDateTimeZone19.getNameKey((-349199901L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone29 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str31 = fixedDateTimeZone29.getNameKey(0L);
        java.util.Locale locale33 = null;
        java.lang.String str34 = fixedDateTimeZone29.getShortName(31L, locale33);
        long long36 = fixedDateTimeZone19.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone29, (long) 0);
        boolean boolean37 = fixedDateTimeZone29.isFixed();
        long long39 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone29, (long) 'a');
        java.util.Locale locale41 = null;
        java.lang.String str42 = fixedDateTimeZone4.getShortName((-349200003L), locale41);
        long long44 = fixedDateTimeZone4.previousTransition((long) 0);
        java.util.Locale locale46 = null;
        java.lang.String str47 = fixedDateTimeZone4.getName((-43L), locale46);
        java.lang.String str49 = fixedDateTimeZone4.getNameKey(3660100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+97:00" + "'", str21, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+97:00" + "'", str24, "+97:00");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+97:00" + "'", str31, "+97:00");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00:00.100" + "'", str34, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 97L + "'", long39 == 97L);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00:00.100" + "'", str42, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+00:00:00.100" + "'", str47, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "+97:00" + "'", str49, "+97:00");
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
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
        boolean boolean27 = fixedDateTimeZone14.isFixed();
        java.util.Locale locale29 = null;
        java.lang.String str30 = fixedDateTimeZone14.getName((-349199936L), locale29);
        java.util.Locale locale32 = null;
        java.lang.String str33 = fixedDateTimeZone14.getShortName((-248L), locale32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-201L) + "'", long9 == (-201L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+97:00" + "'", str20, "+97:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+97:00" + "'", str22, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.100" + "'", str25, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.100" + "'", str30, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00:00.100" + "'", str33, "+00:00:00.100");
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        int int8 = fixedDateTimeZone4.getOffset(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long15 = fixedDateTimeZone13.previousTransition((long) ' ');
        long long17 = fixedDateTimeZone13.previousTransition((long) 'a');
        long long19 = fixedDateTimeZone13.previousTransition(349200000L);
        long long21 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone13, 35L);
        java.lang.String str22 = fixedDateTimeZone4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 349200000L + "'", long19 == 349200000L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 35L + "'", long21 == 35L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+97:00" + "'", str22, "+97:00");
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long17 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, (long) ' ');
        int int19 = fixedDateTimeZone4.getOffsetFromLocal((long) (byte) 10);
        boolean boolean20 = fixedDateTimeZone4.isFixed();
        java.lang.String str22 = fixedDateTimeZone4.getName((-99L));
        boolean boolean23 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.100" + "'", str22, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), 10);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long9 = fixedDateTimeZone4.convertLocalToUTC(349199934L, false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone14 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 100, (int) (byte) 10);
        long long16 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone14, (-303L));
        int int18 = fixedDateTimeZone4.getOffset((-698399747L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 349199834L + "'", long9 == 349199834L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-303L) + "'", long16 == (-303L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        int int12 = fixedDateTimeZone4.getStandardOffset(1L);
        long long16 = fixedDateTimeZone4.convertLocalToUTC((long) '4', false, (long) (short) 1);
        long long18 = fixedDateTimeZone4.previousTransition((-3L));
        long long21 = fixedDateTimeZone4.convertLocalToUTC(1L, false);
        java.util.Locale locale23 = null;
        java.lang.String str24 = fixedDateTimeZone4.getShortName(100L, locale23);
        java.lang.String str25 = fixedDateTimeZone4.getID();
        long long27 = fixedDateTimeZone4.nextTransition((-349200001L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-48L) + "'", long16 == (-48L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-3L) + "'", long18 == (-3L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-99L) + "'", long21 == (-99L));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+97:00" + "'", str25, "+97:00");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-349200001L) + "'", long27 == (-349200001L));
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:10", "", (int) (byte) -1, (int) (byte) -1);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((-698399865L));
        java.util.Locale locale8 = null;
        java.lang.String str9 = fixedDateTimeZone4.getShortName((-349200003L), locale8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = fixedDateTimeZone4.getOffset(readableInstant10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 349200000);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        long long16 = dateTimeZone13.convertLocalToUTC((long) (byte) 0, true);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone13.isLocalDateTimeGap(localDateTime17);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str3 = dateTimeZone1.getName((-349200197L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        int int12 = fixedDateTimeZone4.getStandardOffset(1L);
        long long16 = fixedDateTimeZone4.convertLocalToUTC((long) '4', false, (long) (short) 1);
        long long18 = fixedDateTimeZone4.nextTransition(0L);
        long long21 = fixedDateTimeZone4.adjustOffset((-99L), true);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long26 = dateTimeZone22.getMillisKeepLocal(dateTimeZone24, (long) ' ');
        long long29 = dateTimeZone24.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone24);
        long long33 = dateTimeZone24.convertLocalToUTC((long) (byte) 0, false);
        java.lang.String str34 = dateTimeZone24.toString();
        java.lang.String str35 = dateTimeZone24.toString();
        long long37 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone24, (-349199965L));
        java.util.Locale locale39 = null;
        java.lang.String str40 = fixedDateTimeZone4.getName(349199967L, locale39);
        int int42 = fixedDateTimeZone4.getOffset(349199867L);
        boolean boolean43 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-48L) + "'", long16 == (-48L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-99L) + "'", long21 == (-99L));
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-349199969L) + "'", long26 == (-349199969L));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-349200001L) + "'", long29 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-349200000L) + "'", long33 == (-349200000L));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+97:00" + "'", str34, "+97:00");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+97:00" + "'", str35, "+97:00");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-698399865L) + "'", long37 == (-698399865L));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00:00.100" + "'", str40, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long17 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, (long) ' ');
        boolean boolean18 = fixedDateTimeZone15.isFixed();
        long long21 = fixedDateTimeZone15.convertLocalToUTC((-349199999L), false);
        long long23 = fixedDateTimeZone15.previousTransition((-68L));
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = fixedDateTimeZone15.getOffset(readableInstant24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        int int27 = fixedDateTimeZone15.getOffset(readableInstant26);
        java.util.Locale locale29 = null;
        java.lang.String str30 = fixedDateTimeZone15.getName((-349199868L), locale29);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-349200096L) + "'", long21 == (-349200096L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-68L) + "'", long23 == (-68L));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.097" + "'", str30, "+00:00:00.097");
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long17 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, (long) ' ');
        boolean boolean18 = fixedDateTimeZone15.isFixed();
        long long21 = fixedDateTimeZone15.convertLocalToUTC((-349199999L), false);
        boolean boolean23 = fixedDateTimeZone15.isStandardOffset(52L);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 10);
        java.lang.String str28 = dateTimeZone26.getShortName((-698400001L));
        long long30 = fixedDateTimeZone15.getMillisKeepLocal(dateTimeZone26, (-349200236L));
        long long32 = fixedDateTimeZone15.nextTransition((-349200001L));
        org.joda.time.ReadableInstant readableInstant33 = null;
        int int34 = fixedDateTimeZone15.getOffset(readableInstant33);
        long long36 = fixedDateTimeZone15.convertUTCToLocal(0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-349200096L) + "'", long21 == (-349200096L));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:10" + "'", str28, "+00:10");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-349800139L) + "'", long30 == (-349800139L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-349200001L) + "'", long32 == (-349200001L));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 97L + "'", long36 == 97L);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:01", "+00:00:00.100", 0, 100);
        long long7 = fixedDateTimeZone4.adjustOffset(349200032L, false);
        java.lang.String str9 = fixedDateTimeZone4.getNameKey((-349800001L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 349200032L + "'", long7 == 349200032L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        int int10 = fixedDateTimeZone4.getStandardOffset((long) (short) 0);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) 0, true);
        int int15 = fixedDateTimeZone4.getOffset((-349199999L));
        java.lang.String str17 = fixedDateTimeZone4.getShortName(3660100L);
        java.util.Locale locale19 = null;
        java.lang.String str20 = fixedDateTimeZone4.getShortName((-65L), locale19);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-100L) + "'", long13 == (-100L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long17 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, (long) ' ');
        boolean boolean18 = fixedDateTimeZone15.isFixed();
        long long21 = fixedDateTimeZone15.convertLocalToUTC((-349199999L), false);
        long long23 = fixedDateTimeZone15.previousTransition((-68L));
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = fixedDateTimeZone15.getOffset(readableInstant24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        int int27 = fixedDateTimeZone15.getOffset(readableInstant26);
        java.lang.String str29 = fixedDateTimeZone15.getName((-349200290L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-349200096L) + "'", long21 == (-349200096L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-68L) + "'", long23 == (-68L));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00:00.097" + "'", str29, "+00:00:00.097");
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        int int8 = fixedDateTimeZone4.getOffset(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long15 = fixedDateTimeZone13.previousTransition((long) ' ');
        long long17 = fixedDateTimeZone13.previousTransition((long) 'a');
        long long19 = fixedDateTimeZone13.previousTransition(349200000L);
        long long21 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone13, 35L);
        long long23 = fixedDateTimeZone13.previousTransition((-349200001L));
        int int25 = fixedDateTimeZone13.getOffset(100L);
        java.lang.String str27 = fixedDateTimeZone13.getName((long) 349200000);
        java.lang.String str28 = fixedDateTimeZone13.getID();
        int int30 = fixedDateTimeZone13.getOffset((-349199871L));
        int int32 = fixedDateTimeZone13.getOffsetFromLocal((-349199990L));
        boolean boolean33 = fixedDateTimeZone13.isFixed();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 349200000L + "'", long19 == 349200000L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 35L + "'", long21 == 35L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-349200001L) + "'", long23 == (-349200001L));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.100" + "'", str27, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+97:00" + "'", str28, "+97:00");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getShortName(0L, locale13);
        boolean boolean15 = fixedDateTimeZone4.isFixed();
        boolean boolean17 = fixedDateTimeZone4.isStandardOffset(107L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long15 = dateTimeZone11.getMillisKeepLocal(dateTimeZone13, (long) ' ');
        long long18 = dateTimeZone13.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        long long22 = dateTimeZone13.convertLocalToUTC((long) (byte) 0, false);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long26 = dateTimeZone13.getMillisKeepLocal(dateTimeZone24, (long) 1);
        long long28 = dateTimeZone10.getMillisKeepLocal(dateTimeZone13, (long) 0);
        boolean boolean29 = fixedDateTimeZone4.equals((java.lang.Object) dateTimeZone10);
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone10.getName(97L, locale31);
        long long35 = dateTimeZone10.adjustOffset((long) (short) 10, true);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone40 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str42 = fixedDateTimeZone40.getNameKey((long) 1);
        long long45 = fixedDateTimeZone40.convertLocalToUTC((-101L), true);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone50 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str52 = fixedDateTimeZone50.getNameKey((long) 1);
        long long54 = fixedDateTimeZone50.nextTransition((long) (short) 100);
        java.lang.String str56 = fixedDateTimeZone50.getNameKey(97L);
        java.lang.String str58 = fixedDateTimeZone50.getNameKey(349200010L);
        boolean boolean59 = fixedDateTimeZone50.isFixed();
        java.lang.String str61 = fixedDateTimeZone50.getName((long) 'a');
        boolean boolean62 = fixedDateTimeZone40.equals((java.lang.Object) fixedDateTimeZone50);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone50);
        int int65 = fixedDateTimeZone50.getOffsetFromLocal((-699000036L));
        long long67 = dateTimeZone10.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone50, (-349200068L));
        java.lang.String str69 = dateTimeZone10.getShortName((-200L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-349199868L) + "'", long15 == (-349199868L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-349200001L) + "'", long18 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-349200000L) + "'", long22 == (-349200000L));
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+97:00" + "'", str32, "+97:00");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 10L + "'", long35 == 10L);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+97:00" + "'", str42, "+97:00");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-201L) + "'", long45 == (-201L));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "+97:00" + "'", str52, "+97:00");
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 100L + "'", long54 == 100L);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "+97:00" + "'", str56, "+97:00");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "+97:00" + "'", str58, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "+00:00:00.100" + "'", str61, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 100 + "'", int65 == 100);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + (-168L) + "'", long67 == (-168L));
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "+97:00" + "'", str69, "+97:00");
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
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
        java.lang.String str30 = fixedDateTimeZone14.getName((-48L));
        long long32 = fixedDateTimeZone14.previousTransition((-349200001L));
        java.lang.String str33 = fixedDateTimeZone14.toString();
        java.lang.String str35 = fixedDateTimeZone14.getShortName((-60001L));
        long long37 = fixedDateTimeZone14.previousTransition((long) (byte) -1);
        org.joda.time.ReadableInstant readableInstant38 = null;
        int int39 = fixedDateTimeZone14.getOffset(readableInstant38);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.100" + "'", str30, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-349200001L) + "'", long32 == (-349200001L));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+97:00" + "'", str33, "+97:00");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00:00.100" + "'", str35, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        int int12 = fixedDateTimeZone4.getStandardOffset(1L);
        boolean boolean13 = fixedDateTimeZone4.isFixed();
        java.util.TimeZone timeZone14 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone19 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str21 = fixedDateTimeZone19.getNameKey((long) 1);
        boolean boolean22 = fixedDateTimeZone19.isFixed();
        java.lang.String str24 = fixedDateTimeZone19.getNameKey((-349199901L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone29 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str31 = fixedDateTimeZone29.getNameKey(0L);
        java.util.Locale locale33 = null;
        java.lang.String str34 = fixedDateTimeZone29.getShortName(31L, locale33);
        long long36 = fixedDateTimeZone19.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone29, (long) 0);
        boolean boolean37 = fixedDateTimeZone29.isFixed();
        long long39 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone29, (long) 'a');
        int int41 = fixedDateTimeZone29.getOffset((-349200009L));
        long long45 = fixedDateTimeZone29.convertLocalToUTC((-110L), false, (-349200294L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+97:00" + "'", str21, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+97:00" + "'", str24, "+97:00");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+97:00" + "'", str31, "+97:00");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00:00.100" + "'", str34, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 97L + "'", long39 == 97L);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-210L) + "'", long45 == (-210L));
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
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
        java.lang.String str25 = fixedDateTimeZone20.getShortName(349199900L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00" + "'", str25, "+00:00");
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
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
        long long44 = dateTimeZone21.convertLocalToUTC(35L, true, (-352800064L));
        java.lang.String str45 = dateTimeZone21.getID();
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
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-349199965L) + "'", long44 == (-349199965L));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+97:00" + "'", str45, "+97:00");
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition((long) (short) 0);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str12 = fixedDateTimeZone4.getID();
        java.lang.String str14 = fixedDateTimeZone4.getName(10L);
        java.util.Locale locale16 = null;
        java.lang.String str17 = fixedDateTimeZone4.getShortName(349199652L, locale16);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = fixedDateTimeZone4.getID();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone12 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long14 = fixedDateTimeZone12.previousTransition((long) ' ');
        java.lang.String str15 = fixedDateTimeZone12.getID();
        java.lang.String str17 = fixedDateTimeZone12.getNameKey((long) (short) 10);
        int int19 = fixedDateTimeZone12.getOffsetFromLocal((-101L));
        long long21 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone12, 32L);
        java.lang.String str23 = fixedDateTimeZone12.getName((long) (short) 0);
        boolean boolean24 = fixedDateTimeZone12.isFixed();
        java.util.TimeZone timeZone25 = fixedDateTimeZone12.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+97:00" + "'", str7, "+97:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.100" + "'", str23, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone26);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(0L);
        java.lang.String str7 = fixedDateTimeZone4.getID();
        long long9 = fixedDateTimeZone4.nextTransition((-125999903L));
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.lang.String str11 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+97:00" + "'", str7, "+97:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-125999903L) + "'", long9 == (-125999903L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+97:00" + "'", str11, "+97:00");
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        int int12 = fixedDateTimeZone4.getStandardOffset(1L);
        boolean boolean13 = fixedDateTimeZone4.isFixed();
        java.util.TimeZone timeZone14 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str16 = fixedDateTimeZone4.getShortName((-349200101L));
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.util.TimeZone timeZone18 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone19);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone0.getMillisKeepLocal(dateTimeZone2, (long) ' ');
        long long7 = dateTimeZone2.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long11 = dateTimeZone2.convertLocalToUTC((long) (byte) 0, false);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long15 = dateTimeZone2.getMillisKeepLocal(dateTimeZone13, (long) 1);
        boolean boolean17 = dateTimeZone13.isStandardOffset((long) (short) 10);
        java.lang.String str19 = dateTimeZone13.getName(97L);
        long long23 = dateTimeZone13.convertLocalToUTC(35L, true, (-349200036L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone28 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long30 = fixedDateTimeZone28.previousTransition((long) ' ');
        long long32 = fixedDateTimeZone28.previousTransition((long) 'a');
        long long34 = fixedDateTimeZone28.previousTransition((long) (short) 0);
        int int36 = fixedDateTimeZone28.getOffsetFromLocal((long) (byte) 0);
        boolean boolean38 = fixedDateTimeZone28.isStandardOffset((-1L));
        long long40 = dateTimeZone13.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone28, 349200032L);
        java.util.Locale locale42 = null;
        java.lang.String str43 = fixedDateTimeZone28.getShortName((-133L), locale42);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone28);
        java.lang.String str45 = fixedDateTimeZone28.getID();
        long long47 = fixedDateTimeZone28.nextTransition((-349200201L));
        java.lang.String str48 = fixedDateTimeZone28.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-349199968L) + "'", long4 == (-349199968L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349200001L) + "'", long7 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349200000L) + "'", long11 == (-349200000L));
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+97:00" + "'", str19, "+97:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-349199965L) + "'", long23 == (-349199965L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 32L + "'", long30 == 32L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 97L + "'", long32 == 97L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 698399932L + "'", long40 == 698399932L);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+00:00:00.100" + "'", str43, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+97:00" + "'", str45, "+97:00");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-349200201L) + "'", long47 == (-349200201L));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+97:00" + "'", str48, "+97:00");
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        long long9 = fixedDateTimeZone4.previousTransition((long) '4');
        long long12 = fixedDateTimeZone4.convertLocalToUTC((-349199936L), false);
        java.lang.String str13 = fixedDateTimeZone4.getID();
        int int15 = fixedDateTimeZone4.getOffset(0L);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = fixedDateTimeZone4.getOffset(readableInstant16);
        java.lang.Class<?> wildcardClass18 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349200036L) + "'", long12 == (-349200036L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        int int9 = fixedDateTimeZone4.getOffset((-698399968L));
        boolean boolean11 = fixedDateTimeZone4.isStandardOffset(349199934L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean4 = dateTimeZone1.isStandardOffset(94L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (int) (short) 10);
        long long5 = dateTimeZone2.adjustOffset((-349200097L), true);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone2.getShortName(0L, locale7);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-349200097L) + "'", long5 == (-349200097L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+35:10" + "'", str8, "+35:10");
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (byte) 10);
        boolean boolean4 = dateTimeZone2.isStandardOffset(0L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        java.lang.String str9 = fixedDateTimeZone4.getNameKey((-349199901L));
        long long11 = fixedDateTimeZone4.nextTransition((-68L));
        long long14 = fixedDateTimeZone4.adjustOffset(31L, false);
        long long16 = fixedDateTimeZone4.previousTransition(349200032L);
        java.util.TimeZone timeZone17 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.lang.String str19 = fixedDateTimeZone4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-68L) + "'", long11 == (-68L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 31L + "'", long14 == 31L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 349200032L + "'", long16 == 349200032L);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+97:00" + "'", str19, "+97:00");
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        int int6 = fixedDateTimeZone4.getOffset(349200010L);
        long long8 = fixedDateTimeZone4.nextTransition(100L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = fixedDateTimeZone4.getOffset(readableInstant9);
        long long12 = fixedDateTimeZone4.nextTransition((-349200065L));
        long long15 = fixedDateTimeZone4.adjustOffset((-349199890L), true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349200065L) + "'", long12 == (-349200065L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-349199890L) + "'", long15 == (-349199890L));
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+32:10", "+00:00:00.010", 0, 115200000);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "+00:00:00.032", 10, (int) '4');
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        java.lang.String str9 = fixedDateTimeZone4.getNameKey((-349199901L));
        long long11 = fixedDateTimeZone4.nextTransition((-68L));
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = fixedDateTimeZone4.getOffset(readableInstant12);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone18 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long20 = fixedDateTimeZone18.previousTransition((long) ' ');
        long long22 = fixedDateTimeZone18.previousTransition((long) 'a');
        long long24 = fixedDateTimeZone18.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone29 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long31 = fixedDateTimeZone18.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone29, (long) ' ');
        boolean boolean32 = fixedDateTimeZone29.isFixed();
        long long35 = fixedDateTimeZone29.convertLocalToUTC((-349199999L), false);
        boolean boolean36 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone29);
        java.util.Locale locale38 = null;
        java.lang.String str39 = fixedDateTimeZone29.getName((-349200036L), locale38);
        boolean boolean41 = fixedDateTimeZone29.isStandardOffset((-698400201L));
        long long45 = fixedDateTimeZone29.convertLocalToUTC((-349200090L), false, (-349200197L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-68L) + "'", long11 == (-68L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 97L + "'", long22 == 97L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 349200000L + "'", long24 == 349200000L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 35L + "'", long31 == 35L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-349200096L) + "'", long35 == (-349200096L));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00:00.097" + "'", str39, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-349200187L) + "'", long45 == (-349200187L));
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(97L);
        int int12 = fixedDateTimeZone4.getOffset((long) 349200000);
        long long14 = fixedDateTimeZone4.previousTransition((-349200003L));
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime15);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-349200003L) + "'", long14 == (-349200003L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long17 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, (long) ' ');
        java.lang.String str19 = fixedDateTimeZone4.getNameKey(4199899L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+97:00" + "'", str19, "+97:00");
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long9 = fixedDateTimeZone4.adjustOffset((long) (short) 100, false);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((-349200036L), false, (-48L));
        long long15 = fixedDateTimeZone4.nextTransition(97L);
        java.lang.String str17 = fixedDateTimeZone4.getNameKey(0L);
        int int19 = fixedDateTimeZone4.getOffsetFromLocal((-349200236L));
        java.lang.String str20 = fixedDateTimeZone4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-349200136L) + "'", long13 == (-349200136L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+97:00" + "'", str20, "+97:00");
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long15 = fixedDateTimeZone4.convertLocalToUTC(349200010L, true);
        long long17 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime18);
        java.lang.String str21 = fixedDateTimeZone4.getShortName((long) 100);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.ReadableInstant readableInstant23 = null;
        int int24 = fixedDateTimeZone4.getOffset(readableInstant23);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 349199910L + "'", long15 == 349199910L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.100" + "'", str21, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.nextTransition((-101L));
        int int8 = fixedDateTimeZone4.getStandardOffset((long) (byte) -1);
        int int10 = fixedDateTimeZone4.getOffsetFromLocal(10L);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((-349199868L), false);
        java.lang.String str15 = fixedDateTimeZone4.getNameKey((-349199999L));
        java.util.Locale locale17 = null;
        java.lang.String str18 = fixedDateTimeZone4.getName((long) 35, locale17);
        java.util.TimeZone timeZone19 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-101L) + "'", long6 == (-101L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-349199968L) + "'", long13 == (-349199968L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.100" + "'", str18, "+00:00:00.100");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((-1047599936L), locale3);
        long long6 = dateTimeZone1.convertUTCToLocal((long) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.010" + "'", str4, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 11L + "'", long6 == 11L);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getShortName(0L, locale13);
        java.lang.String str16 = fixedDateTimeZone4.getNameKey((-101L));
        java.lang.String str18 = fixedDateTimeZone4.getNameKey((long) (short) 100);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone23 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long25 = fixedDateTimeZone23.previousTransition((long) ' ');
        long long27 = fixedDateTimeZone23.previousTransition((long) 'a');
        long long29 = fixedDateTimeZone23.previousTransition(349200000L);
        org.joda.time.LocalDateTime localDateTime30 = null;
        boolean boolean31 = fixedDateTimeZone23.isLocalDateTimeGap(localDateTime30);
        boolean boolean32 = fixedDateTimeZone23.isFixed();
        long long34 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone23, (long) (-1));
        java.lang.String str35 = fixedDateTimeZone23.toString();
        java.lang.String str37 = fixedDateTimeZone23.getShortName(349199770L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+97:00" + "'", str18, "+97:00");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 97L + "'", long27 == 97L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 349200000L + "'", long29 == 349200000L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+97:00" + "'", str35, "+97:00");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:00:00.100" + "'", str37, "+00:00:00.100");
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        int int10 = fixedDateTimeZone4.getStandardOffset((long) (short) 0);
        int int12 = fixedDateTimeZone4.getStandardOffset((long) (byte) 10);
        java.lang.String str13 = fixedDateTimeZone4.getID();
        java.util.TimeZone timeZone14 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        long long19 = dateTimeZone16.convertLocalToUTC(1L, false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.util.TimeZone timeZone12 = fixedDateTimeZone4.toTimeZone();
        long long16 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) 100, false, 32L);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = fixedDateTimeZone4.getOffset(readableInstant19);
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime21);
        long long26 = fixedDateTimeZone4.convertLocalToUTC((-349200201L), false, (-349199900L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-349200301L) + "'", long26 == (-349200301L));
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        java.lang.String str9 = fixedDateTimeZone4.getNameKey((-349199901L));
        long long11 = fixedDateTimeZone4.nextTransition((-68L));
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = fixedDateTimeZone4.getOffset(readableInstant12);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone18 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long20 = fixedDateTimeZone18.previousTransition((long) ' ');
        long long22 = fixedDateTimeZone18.previousTransition((long) 'a');
        long long24 = fixedDateTimeZone18.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone29 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long31 = fixedDateTimeZone18.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone29, (long) ' ');
        boolean boolean32 = fixedDateTimeZone29.isFixed();
        long long35 = fixedDateTimeZone29.convertLocalToUTC((-349199999L), false);
        boolean boolean36 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone29);
        java.lang.String str38 = fixedDateTimeZone29.getShortName((long) (short) 100);
        int int40 = fixedDateTimeZone29.getStandardOffset((-698399848L));
        int int42 = fixedDateTimeZone29.getOffset(60001L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-68L) + "'", long11 == (-68L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 97L + "'", long22 == 97L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 349200000L + "'", long24 == 349200000L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 35L + "'", long31 == 35L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-349200096L) + "'", long35 == (-349200096L));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00:00.097" + "'", str38, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 97 + "'", int42 == 97);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        java.lang.String str12 = fixedDateTimeZone4.getNameKey((-349199968L));
        java.lang.String str13 = fixedDateTimeZone4.getID();
        int int15 = fixedDateTimeZone4.getOffsetFromLocal((-349200101L));
        int int17 = fixedDateTimeZone4.getOffsetFromLocal((-68L));
        java.lang.String str19 = fixedDateTimeZone4.getName((-349200099L));
        long long22 = fixedDateTimeZone4.adjustOffset((-349200100L), true);
        java.util.Locale locale24 = null;
        java.lang.String str25 = fixedDateTimeZone4.getName((-140L), locale24);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-349200100L) + "'", long22 == (-349200100L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.100" + "'", str25, "+00:00:00.100");
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:01", "+00:00:00.100", 0, 100);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((-100L));
        long long8 = fixedDateTimeZone4.nextTransition((long) (byte) 10);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime11);
        java.util.TimeZone timeZone13 = fixedDateTimeZone4.toTimeZone();
        int int15 = fixedDateTimeZone4.getStandardOffset(349200132L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone20 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long22 = fixedDateTimeZone20.previousTransition((long) ' ');
        long long24 = fixedDateTimeZone20.previousTransition((long) 'a');
        int int26 = fixedDateTimeZone20.getStandardOffset((long) (short) 0);
        long long29 = fixedDateTimeZone20.convertLocalToUTC((long) 0, true);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone34 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        boolean boolean36 = fixedDateTimeZone34.isStandardOffset((long) '#');
        boolean boolean37 = fixedDateTimeZone20.equals((java.lang.Object) boolean36);
        java.lang.String str39 = fixedDateTimeZone20.getNameKey((-90L));
        long long41 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone20, 349199834L);
        boolean boolean42 = fixedDateTimeZone20.isFixed();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 97L + "'", long24 == 97L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-100L) + "'", long29 == (-100L));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+97:00" + "'", str39, "+97:00");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 349199834L + "'", long41 == 349199834L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        java.lang.String str9 = fixedDateTimeZone4.getNameKey((-349199901L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone14 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str16 = fixedDateTimeZone14.getNameKey(0L);
        java.util.Locale locale18 = null;
        java.lang.String str19 = fixedDateTimeZone14.getShortName(31L, locale18);
        long long21 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone14, (long) 0);
        int int23 = fixedDateTimeZone14.getStandardOffset((-48L));
        long long25 = fixedDateTimeZone14.previousTransition((long) (byte) -1);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone30 = new org.joda.time.tz.FixedDateTimeZone("", "hi!", 349200000, 10);
        java.lang.String str32 = fixedDateTimeZone30.getShortName((-349199990L));
        java.util.Locale locale34 = null;
        java.lang.String str35 = fixedDateTimeZone30.getShortName((long) (short) -1, locale34);
        boolean boolean36 = fixedDateTimeZone14.equals((java.lang.Object) locale34);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone41 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str43 = fixedDateTimeZone41.getNameKey((long) 1);
        java.util.Locale locale45 = null;
        java.lang.String str46 = fixedDateTimeZone41.getName((-349200001L), locale45);
        java.util.Locale locale48 = null;
        java.lang.String str49 = fixedDateTimeZone41.getName((-349200000L), locale48);
        boolean boolean50 = fixedDateTimeZone14.equals((java.lang.Object) fixedDateTimeZone41);
        java.lang.String str51 = fixedDateTimeZone41.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+97:00" + "'", str32, "+97:00");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+97:00" + "'", str35, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+97:00" + "'", str43, "+97:00");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00:00.100" + "'", str46, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "+00:00:00.100" + "'", str49, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "+97:00" + "'", str51, "+97:00");
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (int) '4');
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName((-206L), locale4);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+35:52" + "'", str5, "+35:52");
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 349200000);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) 10, true);
        java.util.Locale locale15 = null;
        java.lang.String str16 = fixedDateTimeZone4.getShortName((long) 'a', locale15);
        boolean boolean18 = fixedDateTimeZone4.isStandardOffset(349200032L);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        long long21 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone19, 35L);
        org.joda.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime22);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone28 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long30 = fixedDateTimeZone28.previousTransition((long) ' ');
        long long32 = fixedDateTimeZone28.previousTransition((long) 'a');
        java.lang.String str34 = fixedDateTimeZone28.getNameKey((long) 349200000);
        int int36 = fixedDateTimeZone28.getOffsetFromLocal(0L);
        boolean boolean38 = fixedDateTimeZone28.equals((java.lang.Object) (-99L));
        java.lang.String str39 = fixedDateTimeZone28.getID();
        boolean boolean40 = fixedDateTimeZone4.equals((java.lang.Object) str39);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long43 = fixedDateTimeZone4.previousTransition((-68L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone48 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        int int50 = fixedDateTimeZone48.getOffset(349200010L);
        boolean boolean51 = fixedDateTimeZone48.isFixed();
        java.lang.String str52 = fixedDateTimeZone48.getID();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone57 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long59 = fixedDateTimeZone57.nextTransition((-101L));
        int int61 = fixedDateTimeZone57.getStandardOffset((long) (byte) -1);
        int int63 = fixedDateTimeZone57.getOffsetFromLocal(10L);
        long long66 = fixedDateTimeZone57.convertLocalToUTC((-349199868L), false);
        long long68 = fixedDateTimeZone48.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone57, 0L);
        java.lang.String str70 = fixedDateTimeZone57.getName((-133L));
        boolean boolean71 = fixedDateTimeZone4.equals((java.lang.Object) str70);
        long long74 = fixedDateTimeZone4.convertLocalToUTC(349200101L, true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-90L) + "'", long13 == (-90L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 135L + "'", long21 == 135L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 32L + "'", long30 == 32L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 97L + "'", long32 == 97L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+97:00" + "'", str34, "+97:00");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+97:00" + "'", str39, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-68L) + "'", long43 == (-68L));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 97 + "'", int50 == 97);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "+97:00" + "'", str52, "+97:00");
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-101L) + "'", long59 == (-101L));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 10 + "'", int61 == 10);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 100 + "'", int63 == 100);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-349199968L) + "'", long66 == (-349199968L));
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + (-3L) + "'", long68 == (-3L));
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "+00:00:00.100" + "'", str70, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 349200001L + "'", long74 == 349200001L);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', 32);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        int int8 = fixedDateTimeZone4.getStandardOffset((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        java.lang.String str12 = dateTimeZone10.getShortName((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        long long17 = dateTimeZone13.convertLocalToUTC((-349200001L), false, (long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str20 = dateTimeZone18.getShortName((long) (byte) 0);
        long long22 = dateTimeZone13.getMillisKeepLocal(dateTimeZone18, 0L);
        long long24 = dateTimeZone10.getMillisKeepLocal(dateTimeZone18, 100L);
        long long26 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone10, (-349199948L));
        java.util.Locale locale28 = null;
        java.lang.String str29 = fixedDateTimeZone4.getShortName((-41L), locale28);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-349200101L) + "'", long17 == (-349200101L));
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 349200000L + "'", long24 == 349200000L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-698399848L) + "'", long26 == (-698399848L));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00:00.100" + "'", str29, "+00:00:00.100");
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.097", "+10:00", 0, (int) (short) 0);
        int int6 = fixedDateTimeZone4.getOffsetFromLocal((-349200301L));
        int int8 = fixedDateTimeZone4.getStandardOffset((long) 10);
        long long10 = fixedDateTimeZone4.nextTransition((-698399848L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-698399848L) + "'", long10 == (-698399848L));
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
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
        boolean boolean27 = fixedDateTimeZone15.isStandardOffset((-349200236L));
        java.lang.Class<?> wildcardClass28 = fixedDateTimeZone15.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-349200096L) + "'", long21 == (-349200096L));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone6 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long8 = fixedDateTimeZone6.previousTransition((long) ' ');
        long long10 = fixedDateTimeZone6.previousTransition((long) 'a');
        java.lang.String str12 = fixedDateTimeZone6.getNameKey((long) 349200000);
        java.util.TimeZone timeZone13 = fixedDateTimeZone6.toTimeZone();
        long long15 = dateTimeZone1.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone6, (-68L));
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = fixedDateTimeZone6.getOffset(readableInstant16);
        boolean boolean18 = fixedDateTimeZone6.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-168L) + "'", long15 == (-168L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        int int10 = fixedDateTimeZone4.getStandardOffset((long) (short) 0);
        int int12 = fixedDateTimeZone4.getStandardOffset((long) (byte) 10);
        java.lang.String str13 = fixedDateTimeZone4.getID();
        boolean boolean15 = fixedDateTimeZone4.isStandardOffset((-349199948L));
        java.lang.String str17 = fixedDateTimeZone4.getName((long) 32);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone22 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 100, (int) (byte) 10);
        int int24 = fixedDateTimeZone22.getOffsetFromLocal((long) (byte) 1);
        java.util.TimeZone timeZone25 = fixedDateTimeZone22.toTimeZone();
        java.lang.String str27 = fixedDateTimeZone22.getNameKey((-349199901L));
        boolean boolean28 = fixedDateTimeZone4.equals((java.lang.Object) str27);
        long long31 = fixedDateTimeZone4.adjustOffset((-349199965L), true);
        java.lang.String str33 = fixedDateTimeZone4.getShortName(349199834L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-349199965L) + "'", long31 == (-349199965L));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00:00.100" + "'", str33, "+00:00:00.100");
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+01:00");
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((-349200001L), locale3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+01:00" + "'", str4, "+01:00");
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
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
        java.util.TimeZone timeZone25 = fixedDateTimeZone4.toTimeZone();
        long long28 = fixedDateTimeZone4.adjustOffset((long) (byte) -1, false);
        long long30 = fixedDateTimeZone4.previousTransition(132L);
        java.util.Locale locale32 = null;
        java.lang.String str33 = fixedDateTimeZone4.getShortName((-349199935L), locale32);
        int int35 = fixedDateTimeZone4.getOffsetFromLocal((-1L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone40 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str42 = fixedDateTimeZone40.getNameKey((long) 1);
        boolean boolean43 = fixedDateTimeZone40.isFixed();
        long long45 = fixedDateTimeZone40.previousTransition((long) '4');
        long long48 = fixedDateTimeZone40.convertLocalToUTC((-349199936L), false);
        java.lang.String str49 = fixedDateTimeZone40.getID();
        int int51 = fixedDateTimeZone40.getOffset(0L);
        org.joda.time.ReadableInstant readableInstant52 = null;
        int int53 = fixedDateTimeZone40.getOffset(readableInstant52);
        long long55 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone40, (-59965L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+97:00" + "'", str21, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 132L + "'", long30 == 132L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00:00.100" + "'", str33, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+97:00" + "'", str42, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 52L + "'", long45 == 52L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-349200036L) + "'", long48 == (-349200036L));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "+97:00" + "'", str49, "+97:00");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-59965L) + "'", long55 == (-59965L));
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = fixedDateTimeZone4.getID();
        java.lang.String str9 = fixedDateTimeZone4.getNameKey((long) (short) 10);
        long long11 = fixedDateTimeZone4.convertUTCToLocal((-349199968L));
        int int13 = fixedDateTimeZone4.getOffset((long) 100);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = fixedDateTimeZone4.getOffset(readableInstant14);
        long long18 = fixedDateTimeZone4.convertLocalToUTC((-349199969L), false);
        org.joda.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime19);
        java.util.TimeZone timeZone21 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+97:00" + "'", str7, "+97:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349199868L) + "'", long11 == (-349199868L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-349200069L) + "'", long18 == (-349200069L));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "+10:35", 0, (int) '#');
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        long long8 = fixedDateTimeZone4.convertLocalToUTC(349200000L, true);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("+00:00", "+00:00:00.032", (int) (short) -1, (int) (short) 10);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone13);
        java.lang.String str15 = fixedDateTimeZone13.getID();
        boolean boolean16 = fixedDateTimeZone4.equals((java.lang.Object) str15);
        java.util.Locale locale18 = null;
        java.lang.String str19 = fixedDateTimeZone4.getShortName((-349199868L), locale18);
        long long22 = fixedDateTimeZone4.adjustOffset((long) '#', true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 349200000L + "'", long8 == 349200000L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 35L + "'", long22 == 35L);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long15 = dateTimeZone11.getMillisKeepLocal(dateTimeZone13, (long) ' ');
        long long18 = dateTimeZone13.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        long long22 = dateTimeZone13.convertLocalToUTC((long) (byte) 0, false);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long26 = dateTimeZone13.getMillisKeepLocal(dateTimeZone24, (long) 1);
        long long28 = dateTimeZone10.getMillisKeepLocal(dateTimeZone13, (long) 0);
        boolean boolean29 = fixedDateTimeZone4.equals((java.lang.Object) dateTimeZone10);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long32 = fixedDateTimeZone4.convertUTCToLocal(135L);
        boolean boolean34 = fixedDateTimeZone4.equals((java.lang.Object) (-349200097L));
        java.util.Locale locale36 = null;
        java.lang.String str37 = fixedDateTimeZone4.getName(300L, locale36);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-349199969L) + "'", long15 == (-349199969L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-349200001L) + "'", long18 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-349200000L) + "'", long22 == (-349200000L));
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 235L + "'", long32 == 235L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:00:00.100" + "'", str37, "+00:00:00.100");
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        java.util.Locale locale8 = null;
        java.lang.String str9 = fixedDateTimeZone4.getName((-349200001L), locale8);
        java.util.Locale locale11 = null;
        java.lang.String str12 = fixedDateTimeZone4.getName((-349200000L), locale11);
        int int14 = fixedDateTimeZone4.getOffset(349200000L);
        long long16 = fixedDateTimeZone4.previousTransition(349200001L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 349200001L + "'", long16 == 349200001L);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition((long) (short) 0);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str12 = fixedDateTimeZone4.getID();
        java.lang.String str14 = fixedDateTimeZone4.getName(10L);
        boolean boolean15 = fixedDateTimeZone4.isFixed();
        long long17 = fixedDateTimeZone4.nextTransition((-349200190L));
        java.util.TimeZone timeZone18 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-349200190L) + "'", long17 == (-349200190L));
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long15 = dateTimeZone11.getMillisKeepLocal(dateTimeZone13, (long) ' ');
        long long18 = dateTimeZone13.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        long long22 = dateTimeZone13.convertLocalToUTC((long) (byte) 0, false);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long26 = dateTimeZone13.getMillisKeepLocal(dateTimeZone24, (long) 1);
        long long28 = dateTimeZone10.getMillisKeepLocal(dateTimeZone13, (long) 0);
        boolean boolean29 = fixedDateTimeZone4.equals((java.lang.Object) dateTimeZone10);
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone10.getName(97L, locale31);
        long long35 = dateTimeZone10.adjustOffset((long) (short) 10, true);
        org.joda.time.ReadableInstant readableInstant36 = null;
        int int37 = dateTimeZone10.getOffset(readableInstant36);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone43 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long45 = fixedDateTimeZone43.previousTransition((long) ' ');
        long long47 = fixedDateTimeZone43.previousTransition((long) 'a');
        long long49 = fixedDateTimeZone43.previousTransition((long) (short) 0);
        java.util.Locale locale51 = null;
        java.lang.String str52 = fixedDateTimeZone43.getName((long) (-1), locale51);
        long long54 = dateTimeZone38.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone43, (long) 97);
        long long56 = dateTimeZone10.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone43, (-349199865L));
        java.util.TimeZone timeZone57 = fixedDateTimeZone43.toTimeZone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-349199868L) + "'", long15 == (-349199868L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-349200001L) + "'", long18 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-349200000L) + "'", long22 == (-349200000L));
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+97:00" + "'", str32, "+97:00");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 10L + "'", long35 == 10L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 349200000 + "'", int37 == 349200000);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 32L + "'", long45 == 32L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 97L + "'", long47 == 97L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "+00:00:00.100" + "'", str52, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 349199997L + "'", long54 == 349199997L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 35L + "'", long56 == 35L);
        org.junit.Assert.assertNotNull(timeZone57);
        org.junit.Assert.assertEquals(timeZone57.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone0.getMillisKeepLocal(dateTimeZone2, (long) ' ');
        long long7 = dateTimeZone2.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long11 = dateTimeZone2.convertLocalToUTC((long) (byte) 0, false);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long15 = dateTimeZone2.getMillisKeepLocal(dateTimeZone13, (long) 1);
        boolean boolean17 = dateTimeZone13.isStandardOffset((long) (short) 10);
        java.lang.String str19 = dateTimeZone13.getName(97L);
        long long23 = dateTimeZone13.convertLocalToUTC(35L, true, (-349200036L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone28 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long30 = fixedDateTimeZone28.previousTransition((long) ' ');
        long long32 = fixedDateTimeZone28.previousTransition((long) 'a');
        long long34 = fixedDateTimeZone28.previousTransition((long) (short) 0);
        int int36 = fixedDateTimeZone28.getOffsetFromLocal((long) (byte) 0);
        boolean boolean38 = fixedDateTimeZone28.isStandardOffset((-1L));
        long long40 = dateTimeZone13.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone28, 349200032L);
        boolean boolean42 = dateTimeZone13.isStandardOffset(698399932L);
        long long44 = dateTimeZone13.convertUTCToLocal((-698399968L));
        long long46 = dateTimeZone13.convertUTCToLocal(349199599L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349200001L) + "'", long7 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349200000L) + "'", long11 == (-349200000L));
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+97:00" + "'", str19, "+97:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-349199965L) + "'", long23 == (-349199965L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 32L + "'", long30 == 32L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 97L + "'", long32 == 97L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 698399932L + "'", long40 == 698399932L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-349199968L) + "'", long44 == (-349199968L));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 698399599L + "'", long46 == 698399599L);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.util.TimeZone timeZone12 = fixedDateTimeZone4.toTimeZone();
        long long16 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) 100, false, 32L);
        int int18 = fixedDateTimeZone4.getOffsetFromLocal((-133L));
        java.lang.String str20 = fixedDateTimeZone4.getShortName((-48L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone25 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long27 = fixedDateTimeZone25.nextTransition((long) 10);
        boolean boolean28 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone25);
        long long32 = fixedDateTimeZone4.convertLocalToUTC((-702059901L), true, (-349200136L));
        java.lang.String str33 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L + "'", long27 == 10L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-702060001L) + "'", long32 == (-702060001L));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+97:00" + "'", str33, "+97:00");
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.nextTransition((-101L));
        int int8 = fixedDateTimeZone4.getStandardOffset((long) (byte) -1);
        int int10 = fixedDateTimeZone4.getOffsetFromLocal(10L);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((-349199868L), false);
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime14);
        boolean boolean17 = fixedDateTimeZone4.isStandardOffset(132L);
        long long19 = fixedDateTimeZone4.previousTransition((-3599900L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-101L) + "'", long6 == (-101L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-349199968L) + "'", long13 == (-349199968L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-3599900L) + "'", long19 == (-3599900L));
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        int int12 = fixedDateTimeZone4.getStandardOffset(1L);
        long long16 = fixedDateTimeZone4.convertLocalToUTC((long) '4', false, (long) (short) 1);
        long long18 = fixedDateTimeZone4.previousTransition((-3L));
        long long21 = fixedDateTimeZone4.convertLocalToUTC(1L, false);
        java.util.Locale locale23 = null;
        java.lang.String str24 = fixedDateTimeZone4.getShortName(100L, locale23);
        java.lang.String str25 = fixedDateTimeZone4.getID();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone30 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str32 = fixedDateTimeZone30.getNameKey(100L);
        long long36 = fixedDateTimeZone30.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone37 = fixedDateTimeZone30.toTimeZone();
        java.util.Locale locale39 = null;
        java.lang.String str40 = fixedDateTimeZone30.getShortName(0L, locale39);
        java.lang.String str42 = fixedDateTimeZone30.getNameKey((-101L));
        long long44 = fixedDateTimeZone30.nextTransition((-68L));
        long long46 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone30, 32L);
        java.util.Locale locale48 = null;
        java.lang.String str49 = fixedDateTimeZone30.getName((-349199966L), locale48);
        long long51 = fixedDateTimeZone30.nextTransition(7L);
        java.lang.String str52 = fixedDateTimeZone30.getID();
        boolean boolean54 = fixedDateTimeZone30.isStandardOffset(349199910L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-48L) + "'", long16 == (-48L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-3L) + "'", long18 == (-3L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-99L) + "'", long21 == (-99L));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+97:00" + "'", str25, "+97:00");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+97:00" + "'", str32, "+97:00");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-100L) + "'", long36 == (-100L));
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00:00.100" + "'", str40, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+97:00" + "'", str42, "+97:00");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-68L) + "'", long44 == (-68L));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 32L + "'", long46 == 32L);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "+00:00:00.100" + "'", str49, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 7L + "'", long51 == 7L);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "+97:00" + "'", str52, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        int int8 = fixedDateTimeZone4.getOffset(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long15 = fixedDateTimeZone13.previousTransition((long) ' ');
        long long17 = fixedDateTimeZone13.previousTransition((long) 'a');
        long long19 = fixedDateTimeZone13.previousTransition(349200000L);
        long long21 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone13, 35L);
        long long23 = fixedDateTimeZone13.previousTransition((-349200001L));
        int int25 = fixedDateTimeZone13.getOffset(100L);
        java.lang.String str27 = fixedDateTimeZone13.getName((long) 349200000);
        java.lang.String str28 = fixedDateTimeZone13.getID();
        java.util.Locale locale30 = null;
        java.lang.String str31 = fixedDateTimeZone13.getName((-698399803L), locale30);
        java.lang.String str33 = fixedDateTimeZone13.getShortName(300L);
        int int35 = fixedDateTimeZone13.getStandardOffset(59799L);
        int int37 = fixedDateTimeZone13.getOffsetFromLocal((-698399748L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 349200000L + "'", long19 == 349200000L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 35L + "'", long21 == 35L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-349200001L) + "'", long23 == (-349200001L));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.100" + "'", str27, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+97:00" + "'", str28, "+97:00");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00:00.100" + "'", str31, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00:00.100" + "'", str33, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.util.TimeZone timeZone12 = fixedDateTimeZone4.toTimeZone();
        long long16 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) 100, false, 32L);
        int int18 = fixedDateTimeZone4.getOffsetFromLocal((-133L));
        java.lang.String str20 = fixedDateTimeZone4.getShortName((-48L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone25 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long27 = fixedDateTimeZone25.nextTransition((long) 10);
        boolean boolean28 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone25);
        org.joda.time.ReadableInstant readableInstant29 = null;
        int int30 = fixedDateTimeZone25.getOffset(readableInstant29);
        org.joda.time.ReadableInstant readableInstant31 = null;
        int int32 = fixedDateTimeZone25.getOffset(readableInstant31);
        java.util.TimeZone timeZone33 = fixedDateTimeZone25.toTimeZone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L + "'", long27 == 10L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.util.TimeZone timeZone8 = fixedDateTimeZone4.toTimeZone();
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((-349199868L));
        int int12 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        java.util.Locale locale14 = null;
        java.lang.String str15 = fixedDateTimeZone4.getName(349200010L, locale14);
        long long17 = fixedDateTimeZone4.convertUTCToLocal((-59L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 41L + "'", long17 == 41L);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 10);
        long long6 = dateTimeZone2.convertLocalToUTC((-349200036L), false, (-349200036L));
        long long8 = dateTimeZone2.convertUTCToLocal((-352860101L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-349800036L) + "'", long6 == (-349800036L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-352260101L) + "'", long8 == (-352260101L));
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        int int8 = fixedDateTimeZone4.getOffset(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long15 = fixedDateTimeZone13.previousTransition((long) ' ');
        long long17 = fixedDateTimeZone13.previousTransition((long) 'a');
        long long19 = fixedDateTimeZone13.previousTransition(349200000L);
        long long21 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone13, 35L);
        long long23 = fixedDateTimeZone13.previousTransition((-349200001L));
        int int25 = fixedDateTimeZone13.getOffset(100L);
        java.lang.String str27 = fixedDateTimeZone13.getName((long) 349200000);
        java.lang.String str28 = fixedDateTimeZone13.getID();
        java.util.Locale locale30 = null;
        java.lang.String str31 = fixedDateTimeZone13.getName((-698399803L), locale30);
        java.lang.String str33 = fixedDateTimeZone13.getShortName(300L);
        java.lang.String str35 = fixedDateTimeZone13.getNameKey((-699000036L));
        int int37 = fixedDateTimeZone13.getOffset((-48L));
        long long39 = fixedDateTimeZone13.nextTransition((-233999968L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 349200000L + "'", long19 == 349200000L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 35L + "'", long21 == 35L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-349200001L) + "'", long23 == (-349200001L));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.100" + "'", str27, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+97:00" + "'", str28, "+97:00");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00:00.100" + "'", str31, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00:00.100" + "'", str33, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+97:00" + "'", str35, "+97:00");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-233999968L) + "'", long39 == (-233999968L));
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getShortName((long) (byte) 10);
        long long9 = fixedDateTimeZone4.convertLocalToUTC(200L, false);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forID("+00:01");
        java.lang.String str13 = dateTimeZone11.getName(698399935L);
        boolean boolean14 = fixedDateTimeZone4.equals((java.lang.Object) 698399935L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:01" + "'", str13, "+00:01");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long4 = dateTimeZone0.convertLocalToUTC((-349200001L), false, (long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str7 = dateTimeZone5.getShortName((long) (byte) 0);
        long long9 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, 0L);
        long long12 = dateTimeZone0.adjustOffset((long) (byte) 100, false);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone0.getShortName((long) (short) 100, locale14);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone0.getName((-348599865L), locale17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = dateTimeZone0.getOffset(readableInstant19);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-349200101L) + "'", long4 == (-349200101L));
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.100" + "'", str7, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.100" + "'", str18, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 349200000);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) 10, true);
        java.util.Locale locale15 = null;
        java.lang.String str16 = fixedDateTimeZone4.getShortName((long) 'a', locale15);
        boolean boolean18 = fixedDateTimeZone4.isStandardOffset(349200032L);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        long long21 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone19, 35L);
        long long24 = fixedDateTimeZone4.adjustOffset((-62L), false);
        java.lang.String str25 = fixedDateTimeZone4.toString();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-90L) + "'", long13 == (-90L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 35L + "'", long21 == 35L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-62L) + "'", long24 == (-62L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+97:00" + "'", str25, "+97:00");
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(97L);
        java.lang.String str12 = fixedDateTimeZone4.getNameKey(349200010L);
        boolean boolean13 = fixedDateTimeZone4.isFixed();
        java.lang.String str15 = fixedDateTimeZone4.getShortName((long) '4');
        int int17 = fixedDateTimeZone4.getOffsetFromLocal((-349199999L));
        long long20 = fixedDateTimeZone4.convertLocalToUTC((-101L), false);
        int int22 = fixedDateTimeZone4.getStandardOffset(126059713L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-201L) + "'", long20 == (-201L));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(97L);
        int int12 = fixedDateTimeZone4.getOffset((long) 349200000);
        java.util.Locale locale14 = null;
        java.lang.String str15 = fixedDateTimeZone4.getName((long) (byte) 0, locale14);
        java.lang.String str16 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00", "+00:00:00.032", (int) (short) -1, (int) (short) 10);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.lang.String str6 = fixedDateTimeZone4.getID();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone11 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long13 = fixedDateTimeZone11.nextTransition((long) 10);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone11);
        boolean boolean15 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone11);
        java.lang.String str16 = fixedDateTimeZone4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long7 = dateTimeZone4.convertLocalToUTC((long) (byte) 1, false);
        java.lang.String str9 = dateTimeZone4.getShortName((long) ' ');
        long long11 = dateTimeZone0.getMillisKeepLocal(dateTimeZone4, 0L);
        long long13 = dateTimeZone0.convertUTCToLocal(32L);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone0.getOffset(readableInstant14);
        long long19 = dateTimeZone0.convertLocalToUTC((long) (short) 10, false, (-352860001L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199999L) + "'", long7 == (-349199999L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349199900L) + "'", long11 == (-349199900L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 132L + "'", long13 == 132L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-90L) + "'", long19 == (-90L));
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00", "hi!", 0, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = fixedDateTimeZone4.getOffset(readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = fixedDateTimeZone4.getOffset(readableInstant7);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00", "+00:00:00.097", (int) (short) 0, (int) (byte) -1);
        int int6 = fixedDateTimeZone4.getOffset((-698999900L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+35:10");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+35:10\" is malformed at \"35:10\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getShortName(0L, locale13);
        java.lang.String str16 = fixedDateTimeZone4.getNameKey((-101L));
        java.lang.String str18 = fixedDateTimeZone4.getNameKey((long) (short) 100);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone23 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long25 = fixedDateTimeZone23.previousTransition((long) ' ');
        long long27 = fixedDateTimeZone23.previousTransition((long) 'a');
        long long29 = fixedDateTimeZone23.previousTransition(349200000L);
        org.joda.time.LocalDateTime localDateTime30 = null;
        boolean boolean31 = fixedDateTimeZone23.isLocalDateTimeGap(localDateTime30);
        boolean boolean32 = fixedDateTimeZone23.isFixed();
        long long34 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone23, (long) (-1));
        int int36 = fixedDateTimeZone23.getOffsetFromLocal(349199799L);
        java.util.TimeZone timeZone37 = fixedDateTimeZone23.toTimeZone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+97:00" + "'", str18, "+97:00");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 97L + "'", long27 == 97L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 349200000L + "'", long29 == 349200000L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long15 = dateTimeZone11.getMillisKeepLocal(dateTimeZone13, (long) ' ');
        long long18 = dateTimeZone13.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        long long22 = dateTimeZone13.convertLocalToUTC((long) (byte) 0, false);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long26 = dateTimeZone13.getMillisKeepLocal(dateTimeZone24, (long) 1);
        long long28 = dateTimeZone10.getMillisKeepLocal(dateTimeZone13, (long) 0);
        boolean boolean29 = fixedDateTimeZone4.equals((java.lang.Object) dateTimeZone10);
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone10.getName(97L, locale31);
        long long35 = dateTimeZone10.convertLocalToUTC(0L, true);
        org.joda.time.LocalDateTime localDateTime36 = null;
        boolean boolean37 = dateTimeZone10.isLocalDateTimeGap(localDateTime36);
        long long41 = dateTimeZone10.convertLocalToUTC((-349200048L), true, (long) (short) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-349199868L) + "'", long15 == (-349199868L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-349200001L) + "'", long18 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-349200000L) + "'", long22 == (-349200000L));
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+97:00" + "'", str32, "+97:00");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-349200000L) + "'", long35 == (-349200000L));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-698400048L) + "'", long41 == (-698400048L));
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:32", "+97:00", 100, (-1));
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:01", "+35:01", (int) '4', (int) 'a');
        java.lang.String str6 = fixedDateTimeZone4.getName((long) 6720000);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.052" + "'", str6, "+00:00:00.052");
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', 60000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 60000");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        int int8 = fixedDateTimeZone4.getOffset(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long15 = fixedDateTimeZone13.previousTransition((long) ' ');
        long long17 = fixedDateTimeZone13.previousTransition((long) 'a');
        long long19 = fixedDateTimeZone13.previousTransition(349200000L);
        long long21 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone13, 35L);
        long long23 = fixedDateTimeZone13.previousTransition((-349200001L));
        int int25 = fixedDateTimeZone13.getOffset(100L);
        java.lang.String str27 = fixedDateTimeZone13.getName((long) 349200000);
        java.lang.String str28 = fixedDateTimeZone13.getID();
        java.util.Locale locale30 = null;
        java.lang.String str31 = fixedDateTimeZone13.getName((-698399803L), locale30);
        java.lang.String str33 = fixedDateTimeZone13.getShortName(300L);
        java.lang.String str35 = fixedDateTimeZone13.getNameKey((-699000036L));
        boolean boolean36 = fixedDateTimeZone13.isFixed();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 349200000L + "'", long19 == 349200000L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 35L + "'", long21 == 35L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-349200001L) + "'", long23 == (-349200001L));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.100" + "'", str27, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+97:00" + "'", str28, "+97:00");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00:00.100" + "'", str31, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00:00.100" + "'", str33, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+97:00" + "'", str35, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        int int12 = fixedDateTimeZone4.getStandardOffset(1L);
        boolean boolean13 = fixedDateTimeZone4.isFixed();
        java.util.TimeZone timeZone14 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str16 = fixedDateTimeZone4.getShortName((-349200101L));
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.util.Locale locale19 = null;
        java.lang.String str20 = fixedDateTimeZone4.getShortName(0L, locale19);
        long long22 = fixedDateTimeZone4.previousTransition((-349199871L));
        long long24 = fixedDateTimeZone4.previousTransition((-349200101L));
        java.lang.String str26 = fixedDateTimeZone4.getNameKey((-201L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-349199871L) + "'", long22 == (-349199871L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-349200101L) + "'", long24 == (-349200101L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+97:00" + "'", str26, "+97:00");
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.nextTransition((long) 10);
        long long8 = fixedDateTimeZone4.nextTransition(349200035L);
        boolean boolean9 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 349200035L + "'", long8 == 349200035L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 100, (int) (byte) 10);
        long long7 = fixedDateTimeZone4.adjustOffset((-349199936L), true);
        int int9 = fixedDateTimeZone4.getOffsetFromLocal((-198L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199936L) + "'", long7 == (-349199936L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:01", "+00:00:00.100", 0, 100);
        long long6 = fixedDateTimeZone4.previousTransition((-349200036L));
        long long10 = fixedDateTimeZone4.convertLocalToUTC((-125999903L), true, (-349199999L));
        long long13 = fixedDateTimeZone4.convertLocalToUTC((-349200398L), true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-349200036L) + "'", long6 == (-349200036L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-125999903L) + "'", long10 == (-125999903L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-349200398L) + "'", long13 == (-349200398L));
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', 115200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 115200000");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.nextTransition((-101L));
        int int8 = fixedDateTimeZone4.getStandardOffset((long) (byte) -1);
        int int10 = fixedDateTimeZone4.getOffsetFromLocal(10L);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((-349199868L), false);
        java.lang.String str15 = fixedDateTimeZone4.getNameKey((-349199999L));
        java.util.Locale locale17 = null;
        java.lang.String str18 = fixedDateTimeZone4.getName((long) 35, locale17);
        long long20 = fixedDateTimeZone4.previousTransition((-349200236L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-101L) + "'", long6 == (-101L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-349199968L) + "'", long13 == (-349199968L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.100" + "'", str18, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-349200236L) + "'", long20 == (-349200236L));
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
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
        java.lang.String str24 = fixedDateTimeZone4.getID();
        java.lang.String str25 = fixedDateTimeZone4.getID();
        long long28 = fixedDateTimeZone4.convertLocalToUTC((long) 10, true);
        long long31 = fixedDateTimeZone4.adjustOffset((-140L), true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+97:00" + "'", str24, "+97:00");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+97:00" + "'", str25, "+97:00");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-90L) + "'", long28 == (-90L));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-140L) + "'", long31 == (-140L));
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int9 = fixedDateTimeZone4.getStandardOffset((-349200009L));
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        java.lang.String str8 = fixedDateTimeZone4.getNameKey(10L);
        long long11 = fixedDateTimeZone4.convertLocalToUTC((-349200001L), true);
        long long15 = fixedDateTimeZone4.convertLocalToUTC((long) 100, true, (-100L));
        java.util.Locale locale17 = null;
        java.lang.String str18 = fixedDateTimeZone4.getShortName((long) 35, locale17);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+97:00" + "'", str8, "+97:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349200101L) + "'", long11 == (-349200101L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.100" + "'", str18, "+00:00:00.100");
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:01", "+00:00:00.100", 0, 100);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((-100L));
        int int8 = fixedDateTimeZone4.getOffsetFromLocal((-99L));
        java.lang.String str10 = fixedDateTimeZone4.getName(200L);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((-349200197L), true);
        long long16 = fixedDateTimeZone4.adjustOffset(59901L, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-349200197L) + "'", long13 == (-349200197L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 59901L + "'", long16 == 59901L);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str1 = dateTimeZone0.getID();
        long long4 = dateTimeZone0.convertLocalToUTC((-349200199L), true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "+97:00" + "'", str1, "+97:00");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-349200299L) + "'", long4 == (-349200299L));
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        java.util.Locale locale8 = null;
        java.lang.String str9 = fixedDateTimeZone4.getName((-349200001L), locale8);
        java.lang.String str11 = fixedDateTimeZone4.getNameKey((-349200001L));
        java.lang.String str12 = fixedDateTimeZone4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+97:00" + "'", str11, "+97:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
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
        long long29 = fixedDateTimeZone13.adjustOffset((-349199933L), false);
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
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-349199933L) + "'", long29 == (-349199933L));
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(97L);
        java.lang.String str12 = fixedDateTimeZone4.getNameKey(349200010L);
        boolean boolean13 = fixedDateTimeZone4.isFixed();
        java.util.Locale locale15 = null;
        java.lang.String str16 = fixedDateTimeZone4.getShortName((-349199999L), locale15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = fixedDateTimeZone4.getOffset(readableInstant17);
        long long20 = fixedDateTimeZone4.nextTransition((-34L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-34L) + "'", long20 == (-34L));
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone10 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        boolean boolean11 = fixedDateTimeZone10.isFixed();
        boolean boolean12 = fixedDateTimeZone10.isFixed();
        java.lang.String str13 = fixedDateTimeZone10.getID();
        long long15 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone10, (-3L));
        long long17 = fixedDateTimeZone4.nextTransition((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long22 = dateTimeZone18.getMillisKeepLocal(dateTimeZone20, (long) ' ');
        long long25 = dateTimeZone20.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        long long28 = dateTimeZone20.convertUTCToLocal(0L);
        org.joda.time.ReadableInstant readableInstant29 = null;
        int int30 = dateTimeZone20.getOffset(readableInstant29);
        long long32 = dateTimeZone20.convertUTCToLocal((long) (short) 10);
        java.lang.String str33 = dateTimeZone20.toString();
        boolean boolean34 = fixedDateTimeZone4.equals((java.lang.Object) dateTimeZone20);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-349199868L) + "'", long22 == (-349199868L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-349200001L) + "'", long25 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 349200000L + "'", long28 == 349200000L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 349200000 + "'", int30 == 349200000);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 349200010L + "'", long32 == 349200010L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+97:00" + "'", str33, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "+10:35", 0, (int) '#');
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        long long8 = fixedDateTimeZone4.convertLocalToUTC(349200000L, true);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("+00:00", "+00:00:00.032", (int) (short) -1, (int) (short) 10);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone13);
        java.lang.String str15 = fixedDateTimeZone13.getID();
        boolean boolean16 = fixedDateTimeZone4.equals((java.lang.Object) str15);
        int int18 = fixedDateTimeZone4.getStandardOffset((long) 'a');
        int int20 = fixedDateTimeZone4.getOffset(0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 349200000L + "'", long8 == 349200000L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long4 = dateTimeZone0.convertLocalToUTC((-349200001L), false, (long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str7 = dateTimeZone5.getShortName((long) (byte) 0);
        long long9 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, 0L);
        long long12 = dateTimeZone0.adjustOffset((long) (byte) 100, false);
        java.lang.String str14 = dateTimeZone0.getName(349200000L);
        java.lang.String str15 = dateTimeZone0.getID();
        long long19 = dateTimeZone0.convertLocalToUTC((-349199936L), false, (-349200100L));
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone0.getName((-349199900L), locale21);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone27 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long29 = fixedDateTimeZone27.previousTransition((long) ' ');
        long long31 = fixedDateTimeZone27.previousTransition((long) 'a');
        long long33 = fixedDateTimeZone27.previousTransition((long) (short) 0);
        java.lang.String str34 = fixedDateTimeZone27.getID();
        long long36 = dateTimeZone0.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone27, 349200035L);
        int int38 = fixedDateTimeZone27.getOffsetFromLocal((-99L));
        int int40 = fixedDateTimeZone27.getStandardOffset(0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-349200000L) + "'", long4 == (-349200000L));
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-349199935L) + "'", long19 == (-349199935L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-00:00:00.001" + "'", str22, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 32L + "'", long29 == 32L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 97L + "'", long31 == 97L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+97:00" + "'", str34, "+97:00");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 349199934L + "'", long36 == 349199934L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 349200000);
        int int12 = fixedDateTimeZone4.getOffsetFromLocal(0L);
        boolean boolean14 = fixedDateTimeZone4.equals((java.lang.Object) (-99L));
        long long18 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (long) 349200000);
        boolean boolean19 = fixedDateTimeZone4.isFixed();
        long long22 = fixedDateTimeZone4.adjustOffset(97L, false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-100L) + "'", long18 == (-100L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 97L + "'", long22 == 97L);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("UTC", "+00:01", 0, (int) (byte) 0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone9 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long11 = fixedDateTimeZone9.previousTransition((long) ' ');
        long long13 = fixedDateTimeZone9.previousTransition((long) 'a');
        long long15 = fixedDateTimeZone9.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone20 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long22 = fixedDateTimeZone9.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone20, (long) ' ');
        long long24 = fixedDateTimeZone9.nextTransition(0L);
        long long27 = fixedDateTimeZone9.adjustOffset((-349199901L), true);
        boolean boolean28 = fixedDateTimeZone9.isFixed();
        java.util.Locale locale30 = null;
        java.lang.String str31 = fixedDateTimeZone9.getName((-349199936L), locale30);
        boolean boolean32 = fixedDateTimeZone4.equals((java.lang.Object) (-349199936L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 349200000L + "'", long15 == 349200000L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 35L + "'", long22 == 35L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-349199901L) + "'", long27 == (-349199901L));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00:00.100" + "'", str31, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        long long12 = fixedDateTimeZone4.previousTransition((-349199990L));
        java.lang.String str13 = fixedDateTimeZone4.getID();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone18 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str20 = fixedDateTimeZone18.getNameKey((long) 1);
        long long22 = fixedDateTimeZone18.nextTransition((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long29 = dateTimeZone25.getMillisKeepLocal(dateTimeZone27, (long) ' ');
        long long32 = dateTimeZone27.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone27);
        long long36 = dateTimeZone27.convertLocalToUTC((long) (byte) 0, false);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long40 = dateTimeZone27.getMillisKeepLocal(dateTimeZone38, (long) 1);
        long long42 = dateTimeZone24.getMillisKeepLocal(dateTimeZone27, (long) 0);
        boolean boolean43 = fixedDateTimeZone18.equals((java.lang.Object) dateTimeZone24);
        java.util.Locale locale45 = null;
        java.lang.String str46 = dateTimeZone24.getName(97L, locale45);
        long long49 = dateTimeZone24.adjustOffset((long) (short) 10, true);
        long long52 = dateTimeZone24.adjustOffset((long) (short) 10, false);
        boolean boolean53 = fixedDateTimeZone4.equals((java.lang.Object) false);
        org.joda.time.LocalDateTime localDateTime54 = null;
        boolean boolean55 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime54);
        long long58 = fixedDateTimeZone4.convertLocalToUTC((-352860001L), false);
        long long61 = fixedDateTimeZone4.convertLocalToUTC(115800100L, true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349199990L) + "'", long12 == (-349199990L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+97:00" + "'", str20, "+97:00");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-349199969L) + "'", long29 == (-349199969L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-349200001L) + "'", long32 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-349200000L) + "'", long36 == (-349200000L));
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1L + "'", long40 == 1L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+97:00" + "'", str46, "+97:00");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 10L + "'", long49 == 10L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 10L + "'", long52 == 10L);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-352860101L) + "'", long58 == (-352860101L));
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 115800000L + "'", long61 == 115800000L);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("UTC", "+00:01", 0, (int) (byte) 0);
        int int6 = fixedDateTimeZone4.getOffset((-349200290L));
        long long9 = fixedDateTimeZone4.convertLocalToUTC((-699000136L), true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-699000136L) + "'", long9 == (-699000136L));
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        java.lang.String str12 = fixedDateTimeZone4.getNameKey((-349199968L));
        java.lang.String str13 = fixedDateTimeZone4.getID();
        int int15 = fixedDateTimeZone4.getOffsetFromLocal((-349200101L));
        org.joda.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime16);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forID("+10:35");
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone19.getName((-349199936L), locale21);
        java.lang.String str23 = dateTimeZone19.getID();
        boolean boolean24 = fixedDateTimeZone4.equals((java.lang.Object) str23);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone29 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str31 = fixedDateTimeZone29.getNameKey((long) 1);
        java.util.Locale locale33 = null;
        java.lang.String str34 = fixedDateTimeZone29.getName((-349200001L), locale33);
        java.util.TimeZone timeZone35 = fixedDateTimeZone29.toTimeZone();
        long long37 = fixedDateTimeZone29.nextTransition(1L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone42 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long44 = fixedDateTimeZone42.previousTransition((long) ' ');
        long long46 = fixedDateTimeZone42.previousTransition((long) 'a');
        java.lang.String str48 = fixedDateTimeZone42.getNameKey((long) 349200000);
        long long50 = fixedDateTimeZone29.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone42, (-1L));
        int int52 = fixedDateTimeZone29.getStandardOffset(698399935L);
        java.util.Locale locale54 = null;
        java.lang.String str55 = fixedDateTimeZone29.getName((long) (-1), locale54);
        long long57 = fixedDateTimeZone29.nextTransition((-599900L));
        long long59 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone29, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+10:35" + "'", str22, "+10:35");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+10:35" + "'", str23, "+10:35");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+97:00" + "'", str31, "+97:00");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00:00.100" + "'", str34, "+00:00:00.100");
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1L + "'", long37 == 1L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 32L + "'", long44 == 32L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 97L + "'", long46 == 97L);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+97:00" + "'", str48, "+97:00");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1L) + "'", long50 == (-1L));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10 + "'", int52 == 10);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "+00:00:00.100" + "'", str55, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-599900L) + "'", long57 == (-599900L));
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 1L + "'", long59 == 1L);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        java.lang.String str2 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+01:00" + "'", str2, "+01:00");
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long17 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, (long) ' ');
        long long21 = fixedDateTimeZone15.convertLocalToUTC(97L, true, 349200032L);
        long long23 = fixedDateTimeZone15.previousTransition(349199867L);
        java.lang.String str24 = fixedDateTimeZone15.toString();
        java.lang.String str25 = fixedDateTimeZone15.toString();
        long long29 = fixedDateTimeZone15.convertLocalToUTC((long) 349200000, false, (-349200333L));
        int int31 = fixedDateTimeZone15.getStandardOffset((long) 35);
        java.lang.String str33 = fixedDateTimeZone15.getName((-348599865L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 349199867L + "'", long23 == 349199867L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.100" + "'", str25, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 349199903L + "'", long29 == 349199903L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00:00.097" + "'", str33, "+00:00:00.097");
    }
}
