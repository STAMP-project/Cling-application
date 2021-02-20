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
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
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
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+01:01");
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
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
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "+00:10", (int) (short) 1, 0);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long7 = fixedDateTimeZone4.previousTransition(698399932L);
        long long9 = fixedDateTimeZone4.nextTransition(3660200L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 698399932L + "'", long7 == 698399932L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3660200L + "'", long9 == 3660200L);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
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
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
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
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
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
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
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
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
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
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
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
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
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
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
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
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
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
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
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
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
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
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
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
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
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
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:01", "+35:01", (int) '4', (int) 'a');
        long long6 = fixedDateTimeZone4.nextTransition((-349199966L));
        int int8 = fixedDateTimeZone4.getStandardOffset(38L);
        long long11 = fixedDateTimeZone4.convertLocalToUTC((-349200001L), false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-349199966L) + "'", long6 == (-349199966L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349200053L) + "'", long11 == (-349200053L));
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
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
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
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
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
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
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
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
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
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
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getShortName((long) (byte) 10);
        long long9 = fixedDateTimeZone4.convertLocalToUTC(200L, false);
        long long11 = fixedDateTimeZone4.convertUTCToLocal(0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
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
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
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
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
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
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("UTC", "+00:00:00.035", (int) (byte) 10, (int) ' ');
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
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
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:01", "+00:10", (int) (short) 0, 349200000);
        java.lang.String str5 = fixedDateTimeZone4.toString();
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = fixedDateTimeZone4.getOffset(readableInstant6);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:01" + "'", str5, "+00:01");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
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
        java.util.Locale locale26 = null;
        java.lang.String str27 = fixedDateTimeZone4.getName((-349260001L), locale26);
        org.joda.time.LocalDateTime localDateTime28 = null;
        boolean boolean29 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime28);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.100" + "'", str27, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
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
        java.lang.String str12 = dateTimeZone2.toString();
        java.lang.String str13 = dateTimeZone2.getID();
        long long16 = dateTimeZone2.convertLocalToUTC((long) 100, true);
        long long20 = dateTimeZone2.convertLocalToUTC((-59803L), false, (-349200190L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-349199868L) + "'", long4 == (-349199868L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349200001L) + "'", long7 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349200000L) + "'", long11 == (-349200000L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-349199900L) + "'", long16 == (-349199900L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-349259803L) + "'", long20 == (-349259803L));
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
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
        long long34 = fixedDateTimeZone4.convertLocalToUTC((-10L), false, (-349200333L));
        java.lang.String str35 = fixedDateTimeZone4.getID();
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
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-110L) + "'", long34 == (-110L));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+97:00" + "'", str35, "+97:00");
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
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
        int int28 = fixedDateTimeZone14.getOffsetFromLocal((-349199969L));
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
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        boolean boolean6 = fixedDateTimeZone4.isStandardOffset((long) '#');
        java.util.Locale locale8 = null;
        java.lang.String str9 = fixedDateTimeZone4.getName(31L, locale8);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime10);
        long long15 = fixedDateTimeZone4.convertLocalToUTC(59899L, false, 32L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.097" + "'", str9, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 59802L + "'", long15 == 59802L);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        boolean boolean14 = fixedDateTimeZone4.isStandardOffset(100L);
        long long17 = fixedDateTimeZone4.convertLocalToUTC(100L, false);
        java.util.Locale locale19 = null;
        java.lang.String str20 = fixedDateTimeZone4.getName((-698399844L), locale19);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
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
        java.util.Locale locale33 = null;
        java.lang.String str34 = fixedDateTimeZone14.getShortName(0L, locale33);
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00:00.100" + "'", str34, "+00:00:00.100");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00", "", (int) (short) -1, 0);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getName((-349200066L), locale6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
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
        org.joda.time.LocalDateTime localDateTime31 = null;
        boolean boolean32 = fixedDateTimeZone13.isLocalDateTimeGap(localDateTime31);
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition((long) (short) 0);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str12 = fixedDateTimeZone4.getID();
        int int14 = fixedDateTimeZone4.getOffset((long) (byte) -1);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone19 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str21 = fixedDateTimeZone19.getNameKey(100L);
        long long25 = fixedDateTimeZone19.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone26 = fixedDateTimeZone19.toTimeZone();
        java.util.TimeZone timeZone27 = fixedDateTimeZone19.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        boolean boolean29 = fixedDateTimeZone4.equals((java.lang.Object) timeZone27);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        long long33 = dateTimeZone30.adjustOffset((-349200036L), false);
        boolean boolean35 = dateTimeZone30.isStandardOffset(0L);
        long long39 = dateTimeZone30.convertLocalToUTC(698399999L, false, (-349259990L));
        java.util.Locale locale41 = null;
        java.lang.String str42 = dateTimeZone30.getName((-299L), locale41);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+97:00" + "'", str21, "+97:00");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-100L) + "'", long25 == (-100L));
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-349200036L) + "'", long33 == (-349200036L));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 698399999L + "'", long39 == 698399999L);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00" + "'", str42, "+00:00");
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long17 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, (long) ' ');
        boolean boolean18 = fixedDateTimeZone15.isFixed();
        java.lang.String str20 = fixedDateTimeZone15.getShortName((long) (short) 1);
        long long22 = fixedDateTimeZone15.previousTransition((-349200001L));
        java.lang.String str23 = fixedDateTimeZone15.toString();
        boolean boolean24 = fixedDateTimeZone15.isFixed();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.097" + "'", str20, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-349200001L) + "'", long22 == (-349200001L));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.100" + "'", str23, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+35:01", "+01:35", 10, 32);
        java.lang.String str6 = fixedDateTimeZone4.getName((-349260001L));
        int int8 = fixedDateTimeZone4.getOffset((-348599865L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.010" + "'", str6, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
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
        long long57 = fixedDateTimeZone30.previousTransition((-348599865L));
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
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-348599865L) + "'", long57 == (-348599865L));
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
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
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone14);
        java.lang.String str31 = fixedDateTimeZone14.getName((-352800064L));
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00:00.100" + "'", str31, "+00:00:00.100");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long17 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, (long) ' ');
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = fixedDateTimeZone15.getOffset(readableInstant18);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        java.lang.String str8 = fixedDateTimeZone4.getNameKey((-3600262L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+97:00" + "'", str8, "+97:00");
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("UTC", "hi!", 0, (int) (short) 100);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        java.util.TimeZone timeZone6 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "+00:01", 35, (int) 'a');
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
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
        org.joda.time.ReadableInstant readableInstant74 = null;
        int int75 = fixedDateTimeZone52.getOffset(readableInstant74);
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
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 100 + "'", int75 == 100);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone0.getMillisKeepLocal(dateTimeZone2, (long) ' ');
        long long7 = dateTimeZone2.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long11 = dateTimeZone2.convertLocalToUTC((long) (byte) 0, false);
        long long14 = dateTimeZone2.convertLocalToUTC(0L, true);
        long long17 = dateTimeZone2.adjustOffset((-59900L), true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349200001L) + "'", long7 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349200000L) + "'", long11 == (-349200000L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-349200000L) + "'", long14 == (-349200000L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-59900L) + "'", long17 == (-59900L));
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
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
        java.lang.String str30 = fixedDateTimeZone13.getShortName((-109L));
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.100" + "'", str30, "+00:00:00.100");
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        java.util.TimeZone timeZone7 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        boolean boolean10 = dateTimeZone8.isStandardOffset((-90L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(32, (int) (byte) 10);
        java.lang.String str4 = dateTimeZone2.getShortName((-162L));
        boolean boolean6 = dateTimeZone2.isStandardOffset((-349199901L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+32:10" + "'", str4, "+32:10");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        int int6 = fixedDateTimeZone4.getOffset(349200010L);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        long long9 = fixedDateTimeZone4.previousTransition((-3L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-3L) + "'", long9 == (-3L));
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone6 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long8 = fixedDateTimeZone6.previousTransition((long) ' ');
        long long10 = fixedDateTimeZone6.previousTransition((long) 'a');
        java.lang.String str12 = fixedDateTimeZone6.getNameKey((long) 349200000);
        java.util.TimeZone timeZone13 = fixedDateTimeZone6.toTimeZone();
        long long15 = dateTimeZone1.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone6, (-68L));
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone6);
        long long19 = fixedDateTimeZone6.adjustOffset((-99L), false);
        java.util.Locale locale21 = null;
        java.lang.String str22 = fixedDateTimeZone6.getShortName(3660100L, locale21);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-168L) + "'", long15 == (-168L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-99L) + "'", long19 == (-99L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.100" + "'", str22, "+00:00:00.100");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
        org.joda.time.LocalDateTime localDateTime36 = null;
        boolean boolean37 = fixedDateTimeZone13.isLocalDateTimeGap(localDateTime36);
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:01", "+00:00:00.100", 0, 100);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((-100L));
        int int8 = fixedDateTimeZone4.getOffsetFromLocal((-349199990L));
        boolean boolean10 = fixedDateTimeZone4.equals((java.lang.Object) (-349200001L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.010");
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(235L, locale3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.010" + "'", str4, "+00:00:00.010");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 100, (int) (byte) 10);
        int int6 = fixedDateTimeZone4.getOffsetFromLocal((long) (byte) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) 0);
        java.util.TimeZone timeZone9 = fixedDateTimeZone4.toTimeZone();
        boolean boolean11 = fixedDateTimeZone4.isStandardOffset(349199934L);
        java.util.TimeZone timeZone12 = fixedDateTimeZone4.toTimeZone();
        long long14 = fixedDateTimeZone4.convertUTCToLocal((-349200000L));
        long long17 = fixedDateTimeZone4.convertLocalToUTC((-43L), true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-349199900L) + "'", long14 == (-349199900L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-143L) + "'", long17 == (-143L));
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
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
        long long27 = fixedDateTimeZone14.nextTransition((-698399968L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-698399968L) + "'", long27 == (-698399968L));
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.util.TimeZone timeZone8 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone9.getName((long) (-1), locale11);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long15 = fixedDateTimeZone4.convertLocalToUTC(349200010L, true);
        long long17 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime18);
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime20);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 349199910L + "'", long15 == 349199910L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getName((-349199868L));
        java.util.TimeZone timeZone7 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str8 = fixedDateTimeZone4.getID();
        boolean boolean10 = fixedDateTimeZone4.isStandardOffset((-110L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+97:00" + "'", str8, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
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
        long long26 = fixedDateTimeZone15.previousTransition((-59803L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+97:00" + "'", str21, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-59803L) + "'", long26 == (-59803L));
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone1.getOffset(readableInstant3);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.052" + "'", str2, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone6 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long8 = fixedDateTimeZone6.nextTransition((-101L));
        int int10 = fixedDateTimeZone6.getStandardOffset((long) (byte) -1);
        long long12 = dateTimeZone1.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone6, (-349200001L));
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone1.isLocalDateTimeGap(localDateTime13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone1.getOffset(readableInstant15);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-101L) + "'", long8 == (-101L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349200101L) + "'", long12 == (-349200101L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        java.lang.String str3 = dateTimeZone1.getShortName((long) (byte) 1);
        long long6 = dateTimeZone1.adjustOffset((-349200099L), false);
        long long10 = dateTimeZone1.convertLocalToUTC(349199938L, true, 0L);
        boolean boolean12 = dateTimeZone1.isStandardOffset((-827999703L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+97:00" + "'", str3, "+97:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-349200099L) + "'", long6 == (-349200099L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-62L) + "'", long10 == (-62L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:10", "", (int) (byte) -1, (int) (byte) -1);
        long long6 = fixedDateTimeZone4.convertUTCToLocal((-349200035L));
        int int8 = fixedDateTimeZone4.getStandardOffset((-3L));
        java.lang.String str9 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-349200036L) + "'", long6 == (-349200036L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:10" + "'", str9, "+00:10");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.junit.Assert.assertNotNull(nameProvider0);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 100, (int) (byte) 10);
        int int6 = fixedDateTimeZone4.getOffsetFromLocal((long) (byte) 1);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = fixedDateTimeZone4.getOffset(readableInstant7);
        long long11 = fixedDateTimeZone4.adjustOffset(0L, false);
        boolean boolean12 = fixedDateTimeZone4.isFixed();
        java.lang.String str14 = fixedDateTimeZone4.getShortName((-349200096L));
        boolean boolean16 = fixedDateTimeZone4.isStandardOffset((-168L));
        java.lang.String str18 = fixedDateTimeZone4.getShortName((long) (short) 0);
        boolean boolean20 = fixedDateTimeZone4.isStandardOffset((-475199903L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.100" + "'", str18, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        long long9 = fixedDateTimeZone4.previousTransition((long) '4');
        long long12 = fixedDateTimeZone4.convertLocalToUTC((-349199936L), false);
        java.lang.String str13 = fixedDateTimeZone4.getID();
        int int15 = fixedDateTimeZone4.getOffset(0L);
        java.lang.String str17 = fixedDateTimeZone4.getNameKey((-349200065L));
        int int19 = fixedDateTimeZone4.getOffset(235L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone24 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str26 = fixedDateTimeZone24.getNameKey((long) 1);
        int int28 = fixedDateTimeZone24.getOffset(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone33 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long35 = fixedDateTimeZone33.previousTransition((long) ' ');
        long long37 = fixedDateTimeZone33.previousTransition((long) 'a');
        long long39 = fixedDateTimeZone33.previousTransition(349200000L);
        long long41 = fixedDateTimeZone24.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone33, 35L);
        long long43 = fixedDateTimeZone33.previousTransition((-349200001L));
        int int45 = fixedDateTimeZone33.getOffset(100L);
        java.lang.String str47 = fixedDateTimeZone33.getName((long) 349200000);
        long long49 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone33, (-168L));
        java.lang.String str51 = fixedDateTimeZone33.getName(698400032L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349200036L) + "'", long12 == (-349200036L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+97:00" + "'", str26, "+97:00");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 32L + "'", long35 == 32L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 97L + "'", long37 == 97L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 349200000L + "'", long39 == 349200000L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 35L + "'", long41 == 35L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-349200001L) + "'", long43 == (-349200001L));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+00:00:00.100" + "'", str47, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-168L) + "'", long49 == (-168L));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "+00:00:00.100" + "'", str51, "+00:00:00.100");
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        int int14 = fixedDateTimeZone4.getOffset((long) (short) 100);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone19 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str21 = fixedDateTimeZone19.getNameKey(100L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone26 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long28 = fixedDateTimeZone26.previousTransition((long) ' ');
        long long30 = fixedDateTimeZone26.previousTransition((long) 'a');
        int int32 = fixedDateTimeZone26.getStandardOffset((long) (short) 0);
        long long35 = fixedDateTimeZone26.convertLocalToUTC((long) 0, true);
        int int37 = fixedDateTimeZone26.getOffset((-349199999L));
        boolean boolean38 = fixedDateTimeZone19.equals((java.lang.Object) fixedDateTimeZone26);
        java.lang.String str40 = fixedDateTimeZone26.getNameKey((-349199871L));
        boolean boolean41 = fixedDateTimeZone4.equals((java.lang.Object) (-349199871L));
        java.lang.String str43 = fixedDateTimeZone4.getNameKey((-349200294L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+97:00" + "'", str21, "+97:00");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 32L + "'", long28 == 32L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 97L + "'", long30 == 97L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-100L) + "'", long35 == (-100L));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+97:00" + "'", str40, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+97:00" + "'", str43, "+97:00");
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) (byte) 10);
        long long5 = dateTimeZone2.convertLocalToUTC(115800100L, true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 120000100L + "'", long5 == 120000100L);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition((long) (short) 0);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str12 = fixedDateTimeZone4.toString();
        java.util.TimeZone timeZone13 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        java.lang.Class<?> wildcardClass15 = dateTimeZone14.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone8.getName((-349200398L), locale10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone8.getName(235L, locale13);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition((long) (short) 0);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        long long14 = fixedDateTimeZone4.convertLocalToUTC(0L, false);
        boolean boolean16 = fixedDateTimeZone4.isStandardOffset(349200010L);
        int int18 = fixedDateTimeZone4.getStandardOffset(0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-100L) + "'", long14 == (-100L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
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
        org.joda.time.ReadableInstant readableInstant25 = null;
        int int26 = fixedDateTimeZone4.getOffset(readableInstant25);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long31 = dateTimeZone28.convertLocalToUTC((long) (byte) 1, false);
        java.lang.String str33 = dateTimeZone28.getShortName((long) ' ');
        org.joda.time.ReadableInstant readableInstant34 = null;
        int int35 = dateTimeZone28.getOffset(readableInstant34);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone40 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.util.TimeZone timeZone41 = fixedDateTimeZone40.toTimeZone();
        long long45 = fixedDateTimeZone40.convertLocalToUTC((long) ' ', true, (long) (byte) 1);
        java.lang.String str46 = fixedDateTimeZone40.toString();
        long long49 = fixedDateTimeZone40.adjustOffset(132L, false);
        boolean boolean51 = fixedDateTimeZone40.isStandardOffset((-349199871L));
        long long53 = dateTimeZone28.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone40, (long) (short) 10);
        long long57 = dateTimeZone28.convertLocalToUTC(42L, false, 349200032L);
        boolean boolean58 = fixedDateTimeZone4.equals((java.lang.Object) 349200032L);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-349199999L) + "'", long31 == (-349199999L));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+97:00" + "'", str33, "+97:00");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 349200000 + "'", int35 == 349200000);
        org.junit.Assert.assertNotNull(timeZone41);
        org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-68L) + "'", long45 == (-68L));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+97:00" + "'", str46, "+97:00");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 132L + "'", long49 == 132L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 349199910L + "'", long53 == 349199910L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-349199958L) + "'", long57 == (-349199958L));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-68L));
        long long11 = fixedDateTimeZone4.convertLocalToUTC((-349200000L), false, (-90L));
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getShortName((-3L), locale13);
        java.lang.String str16 = fixedDateTimeZone4.getNameKey(349200034L);
        boolean boolean17 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349200097L) + "'", long11 == (-349200097L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.097" + "'", str14, "+00:00:00.097");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
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
        java.lang.String str37 = fixedDateTimeZone4.getNameKey((-698400101L));
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+97:00" + "'", str37, "+97:00");
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 100, (int) (byte) 10);
        int int6 = fixedDateTimeZone4.getOffsetFromLocal((long) (byte) 1);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = fixedDateTimeZone4.getOffset(readableInstant7);
        long long11 = fixedDateTimeZone4.adjustOffset(0L, false);
        boolean boolean12 = fixedDateTimeZone4.isFixed();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone17 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long19 = fixedDateTimeZone17.previousTransition((long) ' ');
        long long21 = fixedDateTimeZone17.previousTransition((long) 'a');
        long long23 = fixedDateTimeZone17.previousTransition((long) (short) 0);
        java.util.TimeZone timeZone24 = fixedDateTimeZone17.toTimeZone();
        java.lang.String str26 = fixedDateTimeZone17.getNameKey((-349200100L));
        int int28 = fixedDateTimeZone17.getOffset(349199997L);
        boolean boolean29 = fixedDateTimeZone4.equals((java.lang.Object) 349199997L);
        boolean boolean31 = fixedDateTimeZone4.isStandardOffset(149L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone36 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.util.TimeZone timeZone37 = fixedDateTimeZone36.toTimeZone();
        long long41 = fixedDateTimeZone36.convertLocalToUTC((long) ' ', true, (long) (byte) 1);
        java.util.Locale locale43 = null;
        java.lang.String str44 = fixedDateTimeZone36.getShortName((long) (byte) 10, locale43);
        long long46 = fixedDateTimeZone36.previousTransition(698399932L);
        boolean boolean47 = fixedDateTimeZone4.equals((java.lang.Object) 698399932L);
        org.joda.time.LocalDateTime localDateTime48 = null;
        boolean boolean49 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime48);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+97:00" + "'", str26, "+97:00");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-68L) + "'", long41 == (-68L));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "+00:00:00.100" + "'", str44, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 698399932L + "'", long46 == 698399932L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        long long9 = fixedDateTimeZone4.convertLocalToUTC((long) ' ', true, (long) (byte) 1);
        java.util.Locale locale11 = null;
        java.lang.String str12 = fixedDateTimeZone4.getShortName((long) (byte) 10, locale11);
        long long14 = fixedDateTimeZone4.previousTransition(698399932L);
        int int16 = fixedDateTimeZone4.getOffsetFromLocal((long) (-1));
        java.util.TimeZone timeZone17 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-68L) + "'", long9 == (-68L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 698399932L + "'", long14 == 698399932L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone18);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
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
        long long27 = fixedDateTimeZone4.nextTransition(349199767L);
        long long29 = fixedDateTimeZone4.previousTransition((-233999968L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+97:00" + "'", str21, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 349199767L + "'", long27 == 349199767L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-233999968L) + "'", long29 == (-233999968L));
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+01:35", "+00:00:00.032", (int) (byte) 0, (int) (byte) 100);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((-827999703L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.032" + "'", str6, "+00:00:00.032");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
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
        java.lang.String str26 = fixedDateTimeZone4.getName((-349199968L));
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-349200197L) + "'", long24 == (-349200197L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.100" + "'", str26, "+00:00:00.100");
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(97L);
        java.lang.String str12 = fixedDateTimeZone4.getNameKey(349200010L);
        boolean boolean13 = fixedDateTimeZone4.isFixed();
        java.lang.String str15 = fixedDateTimeZone4.getNameKey((long) 0);
        boolean boolean17 = fixedDateTimeZone4.isStandardOffset((-349199968L));
        long long20 = fixedDateTimeZone4.convertLocalToUTC((-206L), false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-306L) + "'", long20 == (-306L));
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(35, 32);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 100, (int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = fixedDateTimeZone4.getOffset(readableInstant5);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone11 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str13 = fixedDateTimeZone11.getNameKey(100L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone18 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long20 = fixedDateTimeZone18.previousTransition((long) ' ');
        long long22 = fixedDateTimeZone18.previousTransition((long) 'a');
        int int24 = fixedDateTimeZone18.getStandardOffset((long) (short) 0);
        long long27 = fixedDateTimeZone18.convertLocalToUTC((long) 0, true);
        int int29 = fixedDateTimeZone18.getOffset((-349199999L));
        boolean boolean30 = fixedDateTimeZone11.equals((java.lang.Object) fixedDateTimeZone18);
        int int32 = fixedDateTimeZone18.getOffset(3660000L);
        int int34 = fixedDateTimeZone18.getOffset((-99L));
        java.lang.String str36 = fixedDateTimeZone18.getName(31L);
        boolean boolean37 = fixedDateTimeZone4.equals((java.lang.Object) 31L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 97L + "'", long22 == 97L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-100L) + "'", long27 == (-100L));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00:00.100" + "'", str36, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, 1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getName((long) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone0.getOffset(readableInstant3);
        java.lang.String str6 = dateTimeZone0.getName((-130L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        java.lang.String str12 = fixedDateTimeZone4.getNameKey((-349199968L));
        java.lang.String str13 = fixedDateTimeZone4.getID();
        int int15 = fixedDateTimeZone4.getOffsetFromLocal((-349200101L));
        int int17 = fixedDateTimeZone4.getOffsetFromLocal(200L);
        long long20 = fixedDateTimeZone4.adjustOffset((-349199948L), false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-349199948L) + "'", long20 == (-349199948L));
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00", "", (int) (short) -1, 0);
        int int6 = fixedDateTimeZone4.getOffset((-109L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone11 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str13 = fixedDateTimeZone11.getNameKey((long) 1);
        java.util.Locale locale15 = null;
        java.lang.String str16 = fixedDateTimeZone11.getName((-349200001L), locale15);
        java.util.Locale locale18 = null;
        java.lang.String str19 = fixedDateTimeZone11.getName((-349200000L), locale18);
        boolean boolean20 = fixedDateTimeZone4.equals((java.lang.Object) str19);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
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
        java.util.TimeZone timeZone22 = fixedDateTimeZone4.toTimeZone();
        long long24 = fixedDateTimeZone4.previousTransition(3660200L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+97:00" + "'", str20, "+97:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+97:00" + "'", str21, "+97:00");
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3660200L + "'", long24 == 3660200L);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 349200000);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) 10, true);
        java.util.Locale locale15 = null;
        java.lang.String str16 = fixedDateTimeZone4.getShortName((long) 'a', locale15);
        boolean boolean18 = fixedDateTimeZone4.isStandardOffset(349200032L);
        java.util.Locale locale20 = null;
        java.lang.String str21 = fixedDateTimeZone4.getShortName(232L, locale20);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-90L) + "'", long13 == (-90L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.100" + "'", str21, "+00:00:00.100");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = fixedDateTimeZone4.getID();
        java.lang.String str9 = fixedDateTimeZone4.getNameKey((long) (short) 10);
        long long11 = fixedDateTimeZone4.convertUTCToLocal((-349199968L));
        int int13 = fixedDateTimeZone4.getStandardOffset(349200000L);
        long long16 = fixedDateTimeZone4.convertLocalToUTC((long) 10, false);
        java.util.Locale locale18 = null;
        java.lang.String str19 = fixedDateTimeZone4.getShortName((-349140297L), locale18);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+97:00" + "'", str7, "+97:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349199868L) + "'", long11 == (-349199868L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-90L) + "'", long16 == (-90L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
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
        java.lang.String str52 = fixedDateTimeZone40.toString();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone57 = new org.joda.time.tz.FixedDateTimeZone("UTC", "hi!", (int) (short) -1, (int) (byte) 10);
        boolean boolean58 = fixedDateTimeZone40.equals((java.lang.Object) (short) -1);
        java.lang.String str60 = fixedDateTimeZone40.getShortName(4199999L);
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
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "+97:00" + "'", str52, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "+00:00:00.100" + "'", str60, "+00:00:00.100");
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = fixedDateTimeZone4.getID();
        long long9 = fixedDateTimeZone4.previousTransition(349200010L);
        long long11 = fixedDateTimeZone4.nextTransition((long) (-1));
        long long13 = fixedDateTimeZone4.convertUTCToLocal((-349200090L));
        long long17 = fixedDateTimeZone4.convertLocalToUTC((-698400101L), true, 3L);
        java.lang.String str19 = fixedDateTimeZone4.getName((-59803L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone24 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str26 = fixedDateTimeZone24.getNameKey(100L);
        long long30 = fixedDateTimeZone24.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone31 = fixedDateTimeZone24.toTimeZone();
        java.util.Locale locale33 = null;
        java.lang.String str34 = fixedDateTimeZone24.getShortName(0L, locale33);
        java.lang.String str36 = fixedDateTimeZone24.getNameKey((-101L));
        boolean boolean38 = fixedDateTimeZone24.equals((java.lang.Object) 100L);
        java.util.TimeZone timeZone39 = fixedDateTimeZone24.toTimeZone();
        java.lang.String str41 = fixedDateTimeZone24.getName((-349200101L));
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone24);
        long long44 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone24, 126059813L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+97:00" + "'", str7, "+97:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 349200010L + "'", long9 == 349200010L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-349199990L) + "'", long13 == (-349199990L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-698400201L) + "'", long17 == (-698400201L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+97:00" + "'", str26, "+97:00");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-100L) + "'", long30 == (-100L));
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00:00.100" + "'", str34, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+97:00" + "'", str36, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00:00.100" + "'", str41, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 126059813L + "'", long44 == 126059813L);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 349200000);
        int int12 = fixedDateTimeZone4.getOffsetFromLocal(0L);
        boolean boolean14 = fixedDateTimeZone4.equals((java.lang.Object) (-99L));
        java.util.Locale locale16 = null;
        java.lang.String str17 = fixedDateTimeZone4.getShortName((-349800139L), locale16);
        long long20 = fixedDateTimeZone4.adjustOffset((-349199936L), true);
        java.util.TimeZone timeZone21 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        java.lang.String str24 = dateTimeZone22.getShortName((-349200197L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-349199936L) + "'", long20 == (-349199936L));
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) (byte) 1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getName((-349200099L), locale4);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-01:01" + "'", str5, "-01:01");
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(0L);
        java.lang.String str8 = fixedDateTimeZone4.getName((-64L));
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((-698999900L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(32, (int) (byte) 10);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone2.getOffset(readableInstant3);
        java.lang.String str6 = dateTimeZone2.getName((-348599978L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 115800000 + "'", int4 == 115800000);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+32:10" + "'", str6, "+32:10");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 100, (int) (byte) 10);
        long long15 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone13, (-698399865L));
        long long17 = fixedDateTimeZone4.nextTransition(349199910L);
        java.util.TimeZone timeZone18 = fixedDateTimeZone4.toTimeZone();
        long long21 = fixedDateTimeZone4.adjustOffset((-349199935L), true);
        int int23 = fixedDateTimeZone4.getOffsetFromLocal((-349199901L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone28 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str30 = fixedDateTimeZone28.getNameKey((long) 1);
        long long33 = fixedDateTimeZone28.adjustOffset((long) (short) 100, false);
        long long37 = fixedDateTimeZone28.convertLocalToUTC((-349200036L), false, (-48L));
        long long39 = fixedDateTimeZone28.nextTransition(97L);
        java.lang.String str41 = fixedDateTimeZone28.getNameKey(0L);
        boolean boolean42 = fixedDateTimeZone28.isFixed();
        java.lang.String str44 = fixedDateTimeZone28.getNameKey((long) 115800000);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale47 = null;
        java.lang.String str48 = dateTimeZone45.getName((long) (short) 100, locale47);
        org.joda.time.ReadableInstant readableInstant49 = null;
        int int50 = dateTimeZone45.getOffset(readableInstant49);
        java.lang.String str52 = dateTimeZone45.getShortName(35L);
        long long55 = dateTimeZone45.convertLocalToUTC((-68L), true);
        long long58 = dateTimeZone45.adjustOffset(97L, false);
        long long60 = fixedDateTimeZone28.getMillisKeepLocal(dateTimeZone45, (-41L));
        boolean boolean61 = fixedDateTimeZone4.equals((java.lang.Object) long60);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-698399865L) + "'", long15 == (-698399865L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 349199910L + "'", long17 == 349199910L);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-349199935L) + "'", long21 == (-349199935L));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+97:00" + "'", str30, "+97:00");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 100L + "'", long33 == 100L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-349200136L) + "'", long37 == (-349200136L));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 97L + "'", long39 == 97L);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+97:00" + "'", str41, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "+97:00" + "'", str44, "+97:00");
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+00:00" + "'", str48, "+00:00");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "+00:00" + "'", str52, "+00:00");
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-68L) + "'", long55 == (-68L));
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 97L + "'", long58 == 97L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 59L + "'", long60 == 59L);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
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
        org.joda.time.DateTimeZone.setProvider(provider25);
        org.joda.time.DateTimeZone.setProvider(provider25);
        org.joda.time.DateTimeZone.setProvider(provider25);
        org.joda.time.DateTimeZone.setProvider(provider25);
        org.joda.time.DateTimeZone.setProvider(provider25);
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
    }
}

