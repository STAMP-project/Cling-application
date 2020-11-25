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
        java.util.TimeZone timeZone12 = fixedDateTimeZone4.toTimeZone();
        long long16 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) 100, false, 32L);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = fixedDateTimeZone4.getOffset(readableInstant19);
        java.util.Locale locale22 = null;
        java.lang.String str23 = fixedDateTimeZone4.getName((-349200066L), locale22);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone28 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str30 = fixedDateTimeZone28.getNameKey((long) 1);
        long long32 = fixedDateTimeZone28.nextTransition((long) (short) 100);
        java.lang.String str34 = fixedDateTimeZone28.getNameKey(97L);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone28);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone28);
        boolean boolean37 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone28);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+97:00" + "'", str30, "+97:00");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 100L + "'", long32 == 100L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+97:00" + "'", str34, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long4 = dateTimeZone0.convertLocalToUTC((-349200001L), false, (long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str7 = dateTimeZone5.getShortName((long) (byte) 0);
        long long9 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, 0L);
        long long12 = dateTimeZone0.adjustOffset((long) (byte) 100, false);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone0.getShortName((long) (short) 100, locale14);
        java.lang.String str16 = dateTimeZone0.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-349200101L) + "'", long4 == (-349200101L));
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.100" + "'", str7, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+10:00", "+32:00", (int) '#', 0);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(97, (int) (byte) 0);
        long long10 = dateTimeZone7.adjustOffset((-698399747L), true);
        boolean boolean11 = fixedDateTimeZone4.equals((java.lang.Object) (-698399747L));
        int int13 = fixedDateTimeZone4.getOffsetFromLocal((-352260101L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-698399747L) + "'", long10 == (-698399747L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition((long) (short) 0);
        java.lang.String str11 = fixedDateTimeZone4.getID();
        long long15 = fixedDateTimeZone4.convertLocalToUTC((long) 97, false, (-349199871L));
        java.lang.String str17 = fixedDateTimeZone4.getName((long) 1);
        java.lang.String str18 = fixedDateTimeZone4.toString();
        java.util.Locale locale20 = null;
        java.lang.String str21 = fixedDateTimeZone4.getName((-349199901L), locale20);
        long long24 = fixedDateTimeZone4.convertLocalToUTC((-3600162L), true);
        java.util.TimeZone timeZone25 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone30 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long32 = fixedDateTimeZone30.previousTransition((long) ' ');
        java.util.TimeZone timeZone33 = fixedDateTimeZone30.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forTimeZone(timeZone33);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone33);
        long long37 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone35, 149L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+97:00" + "'", str11, "+97:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-3L) + "'", long15 == (-3L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+97:00" + "'", str18, "+97:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.100" + "'", str21, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-3600262L) + "'", long24 == (-3600262L));
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 32L + "'", long32 == 32L);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 249L + "'", long37 == 249L);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
        long long37 = fixedDateTimeZone14.convertLocalToUTC((-698400068L), false, (-349200010L));
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
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-698400168L) + "'", long37 == (-698400168L));
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
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
        org.joda.time.ReadableInstant readableInstant28 = null;
        int int29 = fixedDateTimeZone13.getOffset(readableInstant28);
        long long31 = fixedDateTimeZone13.previousTransition((long) (byte) 0);
        java.util.TimeZone timeZone32 = fixedDateTimeZone13.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 349200000L + "'", long19 == 349200000L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 35L + "'", long21 == 35L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-349200001L) + "'", long23 == (-349200001L));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.100" + "'", str27, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone33);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long17 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, (long) ' ');
        long long21 = fixedDateTimeZone15.convertLocalToUTC(97L, true, 349200032L);
        int int23 = fixedDateTimeZone15.getOffset((-475199903L));
        long long25 = fixedDateTimeZone15.previousTransition((-349200164L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-349200164L) + "'", long25 == (-349200164L));
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        int int12 = fixedDateTimeZone4.getStandardOffset(1L);
        long long14 = fixedDateTimeZone4.previousTransition((long) 10);
        java.lang.String str15 = fixedDateTimeZone4.toString();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone20 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long22 = fixedDateTimeZone20.previousTransition((long) ' ');
        long long24 = fixedDateTimeZone20.previousTransition((long) 'a');
        java.lang.String str26 = fixedDateTimeZone20.getNameKey((long) 349200000);
        int int28 = fixedDateTimeZone20.getOffsetFromLocal(0L);
        boolean boolean30 = fixedDateTimeZone20.equals((java.lang.Object) (-99L));
        long long34 = fixedDateTimeZone20.convertLocalToUTC((-143L), true, (-106L));
        long long36 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone20, (-90L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 97L + "'", long24 == 97L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+97:00" + "'", str26, "+97:00");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-243L) + "'", long34 == (-243L));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-90L) + "'", long36 == (-90L));
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(97L);
        java.lang.String str12 = fixedDateTimeZone4.getNameKey(349200010L);
        boolean boolean13 = fixedDateTimeZone4.isFixed();
        java.lang.String str15 = fixedDateTimeZone4.getNameKey((long) 0);
        boolean boolean17 = fixedDateTimeZone4.isStandardOffset((-349199968L));
        java.lang.String str19 = fixedDateTimeZone4.getShortName((long) 1);
        long long21 = fixedDateTimeZone4.previousTransition((-349140000L));
        java.lang.String str22 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-349140000L) + "'", long21 == (-349140000L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+97:00" + "'", str22, "+97:00");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        int int10 = fixedDateTimeZone4.getOffset((-698399833L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-68L));
        long long11 = fixedDateTimeZone4.convertLocalToUTC((-349200000L), false, (-90L));
        java.lang.String str13 = fixedDateTimeZone4.getNameKey((-694799747L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349200097L) + "'", long11 == (-349200097L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        long long9 = fixedDateTimeZone4.previousTransition((long) '4');
        long long13 = fixedDateTimeZone4.convertLocalToUTC((-349199968L), false, (long) '#');
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.lang.String str15 = fixedDateTimeZone4.toString();
        java.lang.String str17 = fixedDateTimeZone4.getShortName(115200000L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-349200068L) + "'", long13 == (-349200068L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:10", "+01:01", 349200000, 32);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        int int8 = fixedDateTimeZone4.getStandardOffset((long) (-1));
        int int10 = fixedDateTimeZone4.getStandardOffset((long) 97);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long13 = fixedDateTimeZone4.nextTransition(349200132L);
        java.lang.String str15 = fixedDateTimeZone4.getShortName(0L);
        java.lang.String str16 = fixedDateTimeZone4.getID();
        int int18 = fixedDateTimeZone4.getOffset(349199997L);
        long long21 = fixedDateTimeZone4.adjustOffset((-349200067L), false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 349200132L + "'", long13 == 349200132L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-349200067L) + "'", long21 == (-349200067L));
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "hi!", 349200000, 10);
        java.lang.String str6 = fixedDateTimeZone4.getShortName((-349199990L));
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(97L);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long13 = fixedDateTimeZone4.nextTransition((long) (byte) 0);
        java.util.TimeZone timeZone14 = fixedDateTimeZone4.toTimeZone();
        int int16 = fixedDateTimeZone4.getOffset(698400032L);
        java.lang.String str17 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00", "hi!", 0, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = fixedDateTimeZone4.getOffset(readableInstant5);
        int int8 = fixedDateTimeZone4.getStandardOffset((-109L));
        java.util.TimeZone timeZone9 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        long long9 = fixedDateTimeZone4.convertLocalToUTC((long) ' ', true, (long) (byte) 1);
        java.util.Locale locale11 = null;
        java.lang.String str12 = fixedDateTimeZone4.getShortName((long) (byte) 10, locale11);
        int int14 = fixedDateTimeZone4.getOffsetFromLocal(4199899L);
        long long16 = fixedDateTimeZone4.nextTransition((-268L));
        int int18 = fixedDateTimeZone4.getStandardOffset(42L);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-68L) + "'", long9 == (-68L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-268L) + "'", long16 == (-268L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        java.lang.String str12 = fixedDateTimeZone4.getNameKey((-349199968L));
        long long15 = fixedDateTimeZone4.adjustOffset((long) (-1), true);
        long long17 = fixedDateTimeZone4.nextTransition((-233399968L));
        java.lang.String str18 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-233399968L) + "'", long17 == (-233399968L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+97:00" + "'", str18, "+97:00");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
        long long20 = fixedDateTimeZone4.previousTransition(0L);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+01:35", "+01:00", 115800000, 35);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
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
        long long24 = fixedDateTimeZone4.adjustOffset((-699000084L), true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 349199910L + "'", long15 == 349199910L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.100" + "'", str21, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-699000084L) + "'", long24 == (-699000084L));
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        boolean boolean6 = fixedDateTimeZone4.isFixed();
        java.lang.String str8 = fixedDateTimeZone4.getNameKey((-698400001L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+10:00", "+32:00", (int) '#', 0);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(97, (int) (byte) 0);
        long long10 = dateTimeZone7.adjustOffset((-698399747L), true);
        boolean boolean11 = fixedDateTimeZone4.equals((java.lang.Object) (-698399747L));
        java.lang.String str13 = fixedDateTimeZone4.getName((-349200000L));
        java.util.TimeZone timeZone14 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-698399747L) + "'", long10 == (-698399747L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.035" + "'", str13, "+00:00:00.035");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+10:00");
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
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
        long long47 = fixedDateTimeZone15.nextTransition(349200200L);
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
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 349200200L + "'", long47 == 349200200L);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getShortName(0L, locale13);
        java.lang.String str16 = fixedDateTimeZone4.getNameKey((-101L));
        long long18 = fixedDateTimeZone4.nextTransition((-68L));
        java.lang.String str20 = fixedDateTimeZone4.getNameKey(0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-68L) + "'", long18 == (-68L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+97:00" + "'", str20, "+97:00");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
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
        java.util.TimeZone timeZone21 = fixedDateTimeZone4.toTimeZone();
        long long25 = fixedDateTimeZone4.convertLocalToUTC(59932L, false, (-355319833L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 59832L + "'", long25 == 59832L);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition((long) (short) 0);
        int int12 = fixedDateTimeZone4.getOffsetFromLocal((long) (byte) 0);
        boolean boolean14 = fixedDateTimeZone4.isStandardOffset((-349199936L));
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        long long19 = dateTimeZone15.convertLocalToUTC((-349200001L), false, (long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str22 = dateTimeZone20.getShortName((long) (byte) 0);
        long long24 = dateTimeZone15.getMillisKeepLocal(dateTimeZone20, 0L);
        long long27 = dateTimeZone20.convertLocalToUTC((-100L), true);
        boolean boolean28 = fixedDateTimeZone4.equals((java.lang.Object) long27);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone33 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long35 = fixedDateTimeZone33.previousTransition((long) ' ');
        java.lang.String str37 = fixedDateTimeZone33.getNameKey(10L);
        long long40 = fixedDateTimeZone33.convertLocalToUTC((-349200001L), true);
        long long42 = fixedDateTimeZone33.convertUTCToLocal((-68L));
        boolean boolean43 = fixedDateTimeZone4.equals((java.lang.Object) (-68L));
        java.lang.String str45 = fixedDateTimeZone4.getName(35L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-349200101L) + "'", long19 == (-349200101L));
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.100" + "'", str22, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-200L) + "'", long27 == (-200L));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 32L + "'", long35 == 32L);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+97:00" + "'", str37, "+97:00");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-349200101L) + "'", long40 == (-349200101L));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 32L + "'", long42 == 32L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+00:00:00.100" + "'", str45, "+00:00:00.100");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
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
        java.lang.String str28 = fixedDateTimeZone14.getName(31L);
        int int30 = fixedDateTimeZone14.getOffset((-349200001L));
        long long32 = fixedDateTimeZone14.previousTransition(349200133L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-201L) + "'", long9 == (-201L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+97:00" + "'", str20, "+97:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+97:00" + "'", str22, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.100" + "'", str25, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.100" + "'", str28, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 349200133L + "'", long32 == 349200133L);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        java.lang.String str12 = fixedDateTimeZone4.getNameKey((-349199968L));
        java.lang.String str13 = fixedDateTimeZone4.getID();
        int int15 = fixedDateTimeZone4.getOffsetFromLocal((-349200101L));
        org.joda.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime16);
        boolean boolean18 = fixedDateTimeZone4.isFixed();
        long long20 = fixedDateTimeZone4.nextTransition((-349200197L));
        long long23 = fixedDateTimeZone4.adjustOffset((long) (short) 0, true);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone28 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.097", "+00:00:00.100", (int) (short) 100, 10);
        boolean boolean29 = fixedDateTimeZone28.isFixed();
        long long32 = fixedDateTimeZone28.adjustOffset(59901L, false);
        long long35 = fixedDateTimeZone28.adjustOffset((-349200187L), false);
        boolean boolean36 = fixedDateTimeZone28.isFixed();
        long long38 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone28, 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-349200197L) + "'", long20 == (-349200197L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 59901L + "'", long32 == 59901L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-349200187L) + "'", long35 == (-349200187L));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
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
        long long46 = fixedDateTimeZone28.adjustOffset((-349200000L), true);
        int int48 = fixedDateTimeZone28.getOffset((-133L));
        java.lang.String str49 = fixedDateTimeZone28.getID();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone28);
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
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-349200000L) + "'", long46 == (-349200000L));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "+97:00" + "'", str49, "+97:00");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00", "+00:00", 1, 100);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
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
        int int32 = fixedDateTimeZone4.getOffset(232L);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.util.TimeZone timeZone9 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str10 = fixedDateTimeZone4.toString();
        java.util.Locale locale12 = null;
        java.lang.String str13 = fixedDateTimeZone4.getShortName(349199702L, locale12);
        long long15 = fixedDateTimeZone4.convertUTCToLocal(6719900L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 6720000L + "'", long15 == 6720000L);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
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
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
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
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
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
        long long33 = fixedDateTimeZone15.previousTransition((-698400168L));
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
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-698400168L) + "'", long33 == (-698400168L));
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
        int int23 = fixedDateTimeZone14.getStandardOffset((-48L));
        long long25 = fixedDateTimeZone14.previousTransition((long) (byte) -1);
        java.lang.String str27 = fixedDateTimeZone14.getNameKey(59700L);
        java.util.Locale locale29 = null;
        java.lang.String str30 = fixedDateTimeZone14.getShortName((-348599968L), locale29);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+97:00" + "'", str27, "+97:00");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.100" + "'", str30, "+00:00:00.100");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
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
        int int38 = fixedDateTimeZone27.getOffsetFromLocal((-349199871L));
        java.util.Locale locale40 = null;
        java.lang.String str41 = fixedDateTimeZone27.getName((-345599803L), locale40);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-349200101L) + "'", long4 == (-349200101L));
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.100" + "'", str7, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-349200036L) + "'", long19 == (-349200036L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.100" + "'", str22, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 32L + "'", long29 == 32L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 97L + "'", long31 == 97L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+97:00" + "'", str34, "+97:00");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 349200035L + "'", long36 == 349200035L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00:00.100" + "'", str41, "+00:00:00.100");
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+01:01");
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
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
        long long46 = fixedDateTimeZone28.adjustOffset((-349200000L), true);
        int int48 = fixedDateTimeZone28.getStandardOffset((long) (byte) 0);
        java.util.Locale locale50 = null;
        java.lang.String str51 = fixedDateTimeZone28.getShortName((-698399936L), locale50);
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
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-349200000L) + "'", long46 == (-349200000L));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "+00:00:00.100" + "'", str51, "+00:00:00.100");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
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
        int int25 = fixedDateTimeZone4.getStandardOffset(349200132L);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str28 = dateTimeZone26.getShortName((long) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long33 = dateTimeZone30.convertLocalToUTC((long) (byte) 1, false);
        java.lang.String str35 = dateTimeZone30.getShortName((long) ' ');
        long long37 = dateTimeZone26.getMillisKeepLocal(dateTimeZone30, 0L);
        long long39 = dateTimeZone26.convertUTCToLocal(32L);
        org.joda.time.ReadableInstant readableInstant40 = null;
        int int41 = dateTimeZone26.getOffset(readableInstant40);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone26);
        java.lang.String str43 = dateTimeZone26.toString();
        boolean boolean44 = fixedDateTimeZone4.equals((java.lang.Object) str43);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+97:00" + "'", str28, "+97:00");
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-349199999L) + "'", long33 == (-349199999L));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+97:00" + "'", str35, "+97:00");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 349200032L + "'", long39 == 349200032L);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 349200000 + "'", int41 == 349200000);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+97:00" + "'", str43, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "+00:10", (int) (short) 1, 0);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long7 = fixedDateTimeZone4.previousTransition(698399932L);
        long long9 = fixedDateTimeZone4.nextTransition(3660200L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 698399932L + "'", long7 == 698399932L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3660200L + "'", long9 == 3660200L);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
        long long46 = fixedDateTimeZone28.adjustOffset((-349200000L), true);
        int int48 = fixedDateTimeZone28.getOffset((-133L));
        java.lang.String str49 = fixedDateTimeZone28.getID();
        int int51 = fixedDateTimeZone28.getOffset(349200200L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-349199967L) + "'", long4 == (-349199967L));
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
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-349200000L) + "'", long46 == (-349200000L));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "+97:00" + "'", str49, "+97:00");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        int int10 = fixedDateTimeZone4.getStandardOffset((long) (short) 0);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) 0, true);
        int int15 = fixedDateTimeZone4.getOffset((-349199999L));
        java.lang.String str17 = fixedDateTimeZone4.getShortName(3660100L);
        java.util.Locale locale19 = null;
        java.lang.String str20 = fixedDateTimeZone4.getShortName((-349200010L), locale19);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-100L) + "'", long13 == (-100L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone0.getMillisKeepLocal(dateTimeZone2, (long) ' ');
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName((-349200099L), locale6);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone2.getName(49L, locale9);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-349199868L) + "'", long4 == (-349199868L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+97:00" + "'", str7, "+97:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        java.lang.String str12 = fixedDateTimeZone4.getNameKey((-349199968L));
        java.lang.String str13 = fixedDateTimeZone4.getID();
        long long16 = fixedDateTimeZone4.adjustOffset(349199910L, true);
        java.lang.String str18 = fixedDateTimeZone4.getNameKey((-200L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 349199910L + "'", long16 == 349199910L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+97:00" + "'", str18, "+97:00");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 100, (int) (byte) 10);
        int int6 = fixedDateTimeZone4.getOffsetFromLocal((long) (byte) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) 0);
        java.util.TimeZone timeZone9 = fixedDateTimeZone4.toTimeZone();
        boolean boolean11 = fixedDateTimeZone4.isStandardOffset(349199934L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone16 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str18 = fixedDateTimeZone16.getNameKey((long) 1);
        long long20 = fixedDateTimeZone16.nextTransition((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long27 = dateTimeZone23.getMillisKeepLocal(dateTimeZone25, (long) ' ');
        long long30 = dateTimeZone25.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone25);
        long long34 = dateTimeZone25.convertLocalToUTC((long) (byte) 0, false);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long38 = dateTimeZone25.getMillisKeepLocal(dateTimeZone36, (long) 1);
        long long40 = dateTimeZone22.getMillisKeepLocal(dateTimeZone25, (long) 0);
        boolean boolean41 = fixedDateTimeZone16.equals((java.lang.Object) dateTimeZone22);
        java.util.Locale locale43 = null;
        java.lang.String str44 = dateTimeZone22.getName(97L, locale43);
        long long47 = dateTimeZone22.adjustOffset((long) (short) 10, true);
        long long50 = dateTimeZone22.adjustOffset((long) (short) 10, false);
        boolean boolean51 = fixedDateTimeZone4.equals((java.lang.Object) false);
        org.joda.time.ReadableInstant readableInstant52 = null;
        int int53 = fixedDateTimeZone4.getOffset(readableInstant52);
        int int55 = fixedDateTimeZone4.getOffset(698399999L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+97:00" + "'", str18, "+97:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-349199868L) + "'", long27 == (-349199868L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-349200001L) + "'", long30 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-349200000L) + "'", long34 == (-349200000L));
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "+97:00" + "'", str44, "+97:00");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 10L + "'", long47 == 10L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 10L + "'", long50 == 10L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 100 + "'", int55 == 100);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "+00:00", 0, 32);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone9 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str11 = fixedDateTimeZone9.getNameKey((long) 1);
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone9.getName((-349200001L), locale13);
        java.util.TimeZone timeZone15 = fixedDateTimeZone9.toTimeZone();
        long long17 = fixedDateTimeZone9.nextTransition(1L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone22 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long24 = fixedDateTimeZone22.previousTransition((long) ' ');
        long long26 = fixedDateTimeZone22.previousTransition((long) 'a');
        java.lang.String str28 = fixedDateTimeZone22.getNameKey((long) 349200000);
        long long30 = fixedDateTimeZone9.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone22, (-1L));
        boolean boolean31 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone22);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+97:00" + "'", str11, "+97:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 32L + "'", long24 == 32L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 97L + "'", long26 == 97L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+97:00" + "'", str28, "+97:00");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
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
        java.util.TimeZone timeZone31 = fixedDateTimeZone14.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
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
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone32);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
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
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
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
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00", "+00:00:00.032", (int) (short) -1, (int) (short) 10);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.lang.String str6 = fixedDateTimeZone4.getID();
        java.lang.String str8 = fixedDateTimeZone4.getNameKey((-349200101L));
        long long10 = fixedDateTimeZone4.convertUTCToLocal(0L);
        java.lang.String str12 = fixedDateTimeZone4.getShortName((-698399803L));
        int int14 = fixedDateTimeZone4.getOffset((-349199969L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.032" + "'", str8, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-00:00:00.001" + "'", str12, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        int int9 = fixedDateTimeZone4.getOffset((long) '#');
        java.lang.String str11 = fixedDateTimeZone4.getNameKey((-349200136L));
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = fixedDateTimeZone4.getOffset(readableInstant12);
        java.lang.String str15 = fixedDateTimeZone4.getShortName((-349199933L));
        int int17 = fixedDateTimeZone4.getOffset(59801L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone22 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long24 = fixedDateTimeZone22.previousTransition((long) ' ');
        java.lang.String str25 = fixedDateTimeZone22.getID();
        long long27 = fixedDateTimeZone22.convertUTCToLocal((-349199968L));
        boolean boolean28 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone22);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+97:00" + "'", str11, "+97:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 32L + "'", long24 == 32L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+97:00" + "'", str25, "+97:00");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-349199868L) + "'", long27 == (-349199868L));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("UTC", "UTC", 0, (-1));
        int int6 = fixedDateTimeZone4.getOffsetFromLocal((-349200000L));
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str10 = dateTimeZone8.getName((long) 0);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone8.getOffset(readableInstant11);
        long long14 = dateTimeZone8.convertUTCToLocal((-349200001L));
        long long16 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone8, (-349200003L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone21 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str23 = fixedDateTimeZone21.getNameKey((long) 1);
        long long25 = fixedDateTimeZone21.nextTransition((long) (short) 100);
        java.lang.String str27 = fixedDateTimeZone21.getNameKey(97L);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone21);
        long long30 = fixedDateTimeZone21.nextTransition((long) (byte) 0);
        java.util.TimeZone timeZone31 = fixedDateTimeZone21.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        long long34 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone32, (-298L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-00:00:00.001" + "'", str10, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-349200002L) + "'", long14 == (-349200002L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-349200002L) + "'", long16 == (-349200002L));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+97:00" + "'", str23, "+97:00");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+97:00" + "'", str27, "+97:00");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-298L) + "'", long34 == (-298L));
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+10:00", "+32:00", (int) '#', 0);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(97, (int) (byte) 0);
        long long10 = dateTimeZone7.adjustOffset((-698399747L), true);
        boolean boolean11 = fixedDateTimeZone4.equals((java.lang.Object) (-698399747L));
        java.lang.String str13 = fixedDateTimeZone4.getNameKey((-698399848L));
        boolean boolean14 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-698399747L) + "'", long10 == (-698399747L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+32:00" + "'", str13, "+32:00");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        int int8 = fixedDateTimeZone4.getStandardOffset((long) (-1));
        int int10 = fixedDateTimeZone4.getOffset((-33L));
        boolean boolean12 = fixedDateTimeZone4.isStandardOffset((-349200001L));
        java.lang.String str14 = fixedDateTimeZone4.getNameKey((long) (short) 0);
        long long17 = fixedDateTimeZone4.adjustOffset(349199999L, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+97:00" + "'", str14, "+97:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 349199999L + "'", long17 == 349199999L);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
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
        java.lang.String str32 = fixedDateTimeZone4.getShortName(7L);
        java.util.TimeZone timeZone33 = fixedDateTimeZone4.toTimeZone();
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.100" + "'", str32, "+00:00:00.100");
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
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
        boolean boolean25 = fixedDateTimeZone4.isFixed();
        long long28 = fixedDateTimeZone4.adjustOffset((-349200090L), false);
        long long32 = fixedDateTimeZone4.convertLocalToUTC((-348599865L), true, (-349200164L));
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-349200090L) + "'", long28 == (-349200090L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-348599965L) + "'", long32 == (-348599965L));
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
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
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone14);
        long long33 = fixedDateTimeZone14.nextTransition((-698400201L));
        java.lang.String str35 = fixedDateTimeZone14.getShortName(698399838L);
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
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-698400201L) + "'", long33 == (-698400201L));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00:00.100" + "'", str35, "+00:00:00.100");
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 100, (int) (byte) 10);
        int int6 = fixedDateTimeZone4.getOffsetFromLocal((long) (byte) 1);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = fixedDateTimeZone4.getOffset(readableInstant7);
        long long11 = fixedDateTimeZone4.adjustOffset(0L, false);
        boolean boolean12 = fixedDateTimeZone4.isFixed();
        int int14 = fixedDateTimeZone4.getOffset((-698399999L));
        java.util.Locale locale16 = null;
        java.lang.String str17 = fixedDateTimeZone4.getName((-348600068L), locale16);
        java.lang.String str18 = fixedDateTimeZone4.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.nextTransition((-101L));
        int int8 = fixedDateTimeZone4.getStandardOffset((long) (byte) -1);
        int int10 = fixedDateTimeZone4.getOffsetFromLocal(10L);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((-349199868L), false);
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime14);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone20 = new org.joda.time.tz.FixedDateTimeZone("UTC", "UTC", 0, (-1));
        int int22 = fixedDateTimeZone20.getOffsetFromLocal((-349200000L));
        boolean boolean23 = fixedDateTimeZone20.isFixed();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str26 = dateTimeZone24.getName((long) 0);
        org.joda.time.ReadableInstant readableInstant27 = null;
        int int28 = dateTimeZone24.getOffset(readableInstant27);
        long long30 = dateTimeZone24.convertUTCToLocal((-349200001L));
        long long32 = fixedDateTimeZone20.getMillisKeepLocal(dateTimeZone24, (-349200003L));
        boolean boolean33 = fixedDateTimeZone4.equals((java.lang.Object) (-349200003L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-101L) + "'", long6 == (-101L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-349199968L) + "'", long13 == (-349199968L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.100" + "'", str26, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-349199901L) + "'", long30 == (-349199901L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-349200103L) + "'", long32 == (-349200103L));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long17 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, (long) ' ');
        long long19 = fixedDateTimeZone4.nextTransition(0L);
        int int21 = fixedDateTimeZone4.getOffsetFromLocal((long) 100);
        boolean boolean23 = fixedDateTimeZone4.isStandardOffset(349199903L);
        java.lang.String str24 = fixedDateTimeZone4.toString();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+97:00" + "'", str24, "+97:00");
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:01", "+35:01", (int) '4', (int) 'a');
        long long6 = fixedDateTimeZone4.nextTransition((-349199966L));
        int int8 = fixedDateTimeZone4.getStandardOffset(38L);
        long long11 = fixedDateTimeZone4.convertLocalToUTC((-349200001L), false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-349199966L) + "'", long6 == (-349199966L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349200053L) + "'", long11 == (-349200053L));
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
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
        long long24 = fixedDateTimeZone4.convertLocalToUTC((-60001L), true, (-204L));
        boolean boolean25 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+97:00" + "'", str7, "+97:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349199868L) + "'", long11 == (-349199868L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-349200069L) + "'", long18 == (-349200069L));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-60101L) + "'", long24 == (-60101L));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        java.lang.String str12 = fixedDateTimeZone4.getNameKey((-349199968L));
        java.lang.String str13 = fixedDateTimeZone4.getID();
        int int15 = fixedDateTimeZone4.getOffsetFromLocal((-349200101L));
        int int17 = fixedDateTimeZone4.getOffsetFromLocal(200L);
        java.util.Locale locale19 = null;
        java.lang.String str20 = fixedDateTimeZone4.getShortName((-349200190L), locale19);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00", "", (int) (short) -1, 0);
        long long7 = fixedDateTimeZone4.adjustOffset((long) '#', false);
        java.lang.String str8 = fixedDateTimeZone4.getID();
        java.util.Locale locale10 = null;
        java.lang.String str11 = fixedDateTimeZone4.getShortName(3660100L, locale10);
        java.lang.String str13 = fixedDateTimeZone4.getShortName((-90L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        int int9 = fixedDateTimeZone4.getOffset((long) '#');
        java.lang.String str11 = fixedDateTimeZone4.getNameKey((-349200136L));
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = fixedDateTimeZone4.getOffset(readableInstant12);
        java.lang.String str15 = fixedDateTimeZone4.getShortName((-349199933L));
        java.lang.Object obj16 = null;
        boolean boolean17 = fixedDateTimeZone4.equals(obj16);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+97:00" + "'", str11, "+97:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        int int12 = fixedDateTimeZone4.getStandardOffset(1L);
        long long16 = fixedDateTimeZone4.convertLocalToUTC((long) '4', false, (long) (short) 1);
        long long18 = fixedDateTimeZone4.previousTransition((-3L));
        long long21 = fixedDateTimeZone4.convertLocalToUTC(1L, false);
        long long23 = fixedDateTimeZone4.nextTransition((-9L));
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long28 = dateTimeZone24.getMillisKeepLocal(dateTimeZone26, (long) ' ');
        long long31 = dateTimeZone26.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone26);
        long long35 = dateTimeZone26.convertLocalToUTC((long) (byte) 0, false);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long39 = dateTimeZone26.getMillisKeepLocal(dateTimeZone37, (long) 1);
        boolean boolean41 = dateTimeZone37.isStandardOffset((long) (short) 10);
        java.lang.String str43 = dateTimeZone37.getName(97L);
        long long47 = dateTimeZone37.convertLocalToUTC(35L, true, (-349200036L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone52 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long54 = fixedDateTimeZone52.previousTransition((long) ' ');
        long long56 = fixedDateTimeZone52.previousTransition((long) 'a');
        long long58 = fixedDateTimeZone52.previousTransition((long) (short) 0);
        int int60 = fixedDateTimeZone52.getOffsetFromLocal((long) (byte) 0);
        boolean boolean62 = fixedDateTimeZone52.isStandardOffset((-1L));
        long long64 = dateTimeZone37.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone52, 349200032L);
        java.util.Locale locale66 = null;
        java.lang.String str67 = fixedDateTimeZone52.getShortName((-133L), locale66);
        long long70 = fixedDateTimeZone52.adjustOffset((-349200000L), true);
        int int72 = fixedDateTimeZone52.getOffsetFromLocal((-698400201L));
        boolean boolean73 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone52);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-48L) + "'", long16 == (-48L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-3L) + "'", long18 == (-3L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-99L) + "'", long21 == (-99L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-9L) + "'", long23 == (-9L));
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-349199868L) + "'", long28 == (-349199868L));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-349200001L) + "'", long31 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-349200000L) + "'", long35 == (-349200000L));
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+97:00" + "'", str43, "+97:00");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-349199965L) + "'", long47 == (-349199965L));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 32L + "'", long54 == 32L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 97L + "'", long56 == 97L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 100 + "'", int60 == 100);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 698399932L + "'", long64 == 698399932L);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "+00:00:00.100" + "'", str67, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + (-349200000L) + "'", long70 == (-349200000L));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 100 + "'", int72 == 100);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "+00:00:00.100", 10, (int) (byte) 10);
        boolean boolean6 = fixedDateTimeZone4.isStandardOffset((-201L));
        long long9 = fixedDateTimeZone4.convertLocalToUTC((long) 97, true);
        java.lang.String str11 = fixedDateTimeZone4.getShortName(49L);
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getShortName((-349199990L), locale13);
        boolean boolean16 = fixedDateTimeZone4.equals((java.lang.Object) (-349200294L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 87L + "'", long9 == 87L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.010" + "'", str11, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.010" + "'", str14, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getShortName((long) (byte) 10);
        long long9 = fixedDateTimeZone4.convertLocalToUTC(200L, false);
        long long11 = fixedDateTimeZone4.convertUTCToLocal(0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-68L));
        long long10 = fixedDateTimeZone4.adjustOffset((-65L), true);
        int int12 = fixedDateTimeZone4.getOffsetFromLocal(10L);
        long long14 = fixedDateTimeZone4.convertUTCToLocal((-59L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-65L) + "'", long10 == (-65L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 38L + "'", long14 == 38L);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
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
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone14);
        long long33 = fixedDateTimeZone14.nextTransition((-698400201L));
        java.util.Locale locale35 = null;
        java.lang.String str36 = fixedDateTimeZone14.getShortName((-140L), locale35);
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
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-698400201L) + "'", long33 == (-698400201L));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00:00.100" + "'", str36, "+00:00:00.100");
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.nextTransition((-101L));
        int int8 = fixedDateTimeZone4.getStandardOffset((long) (byte) -1);
        int int10 = fixedDateTimeZone4.getOffsetFromLocal(10L);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((-349199868L), false);
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime14);
        long long18 = fixedDateTimeZone4.adjustOffset((-698399865L), true);
        java.util.TimeZone timeZone19 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-101L) + "'", long6 == (-101L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-349199968L) + "'", long13 == (-349199968L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-698399865L) + "'", long18 == (-698399865L));
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+01:35", "+00:00:00.032", (int) (byte) 0, (int) (byte) 100);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("UTC", "+00:00:00.035", (int) (byte) 10, (int) ' ');
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.nextTransition((-101L));
        int int8 = fixedDateTimeZone4.getOffsetFromLocal((-698399936L));
        java.util.TimeZone timeZone9 = fixedDateTimeZone4.toTimeZone();
        java.util.Locale locale11 = null;
        java.lang.String str12 = fixedDateTimeZone4.getName((long) (byte) 10, locale11);
        int int14 = fixedDateTimeZone4.getStandardOffset(349199802L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-101L) + "'", long6 == (-101L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:01", "+00:10", (int) (short) 0, 349200000);
        java.lang.String str5 = fixedDateTimeZone4.toString();
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = fixedDateTimeZone4.getOffset(readableInstant6);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }
}

