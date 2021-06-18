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
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-349199969L) + "'", long15 == (-349199969L));
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
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
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
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long17 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, (long) ' ');
        long long21 = fixedDateTimeZone15.convertLocalToUTC(97L, true, 349200032L);
        int int23 = fixedDateTimeZone15.getOffset((-475199903L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
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
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
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
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
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
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
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
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
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
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
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
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
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
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
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
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
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
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
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
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 10);
        long long6 = dateTimeZone2.convertLocalToUTC((-349200036L), false, (-349200036L));
        long long8 = dateTimeZone2.convertUTCToLocal((-352860101L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-349800036L) + "'", long6 == (-349800036L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-352260101L) + "'", long8 == (-352260101L));
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
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
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
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
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
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
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
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
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
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
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
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
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        int int10 = fixedDateTimeZone4.getStandardOffset((long) (short) 0);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) 0, true);
        int int15 = fixedDateTimeZone4.getOffset((-349199999L));
        java.lang.String str17 = fixedDateTimeZone4.getShortName(3660100L);
        java.util.Locale locale19 = null;
        java.lang.String str20 = fixedDateTimeZone4.getShortName((-349200010L), locale19);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-100L) + "'", long13 == (-100L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
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
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
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
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00", "hi!", 0, (int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = fixedDateTimeZone4.getOffset(readableInstant5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = fixedDateTimeZone4.getOffset(readableInstant7);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00", "+00:00:00.097", (int) (short) 0, (int) (byte) -1);
        int int6 = fixedDateTimeZone4.getOffset((-698999900L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+35:10");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+35:10\" is malformed at \"35:10\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
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
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
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
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:32", "+97:00", 100, (-1));
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:01", "+35:01", (int) '4', (int) 'a');
        java.lang.String str6 = fixedDateTimeZone4.getName((long) 6720000);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.052" + "'", str6, "+00:00:00.052");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', 60000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 60000");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
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
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
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
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.nextTransition((long) 10);
        long long8 = fixedDateTimeZone4.nextTransition(349200035L);
        boolean boolean9 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 349200035L + "'", long8 == 349200035L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 100, (int) (byte) 10);
        long long7 = fixedDateTimeZone4.adjustOffset((-349199936L), true);
        int int9 = fixedDateTimeZone4.getOffsetFromLocal((-198L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199936L) + "'", long7 == (-349199936L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:01", "+00:00:00.100", 0, 100);
        long long6 = fixedDateTimeZone4.previousTransition((-349200036L));
        long long10 = fixedDateTimeZone4.convertLocalToUTC((-125999903L), true, (-349199999L));
        long long13 = fixedDateTimeZone4.convertLocalToUTC((-349200398L), true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-349200036L) + "'", long6 == (-349200036L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-125999903L) + "'", long10 == (-125999903L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-349200398L) + "'", long13 == (-349200398L));
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', 115200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 115200000");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
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
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
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
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int9 = fixedDateTimeZone4.getStandardOffset((-349200009L));
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
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
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
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
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str1 = dateTimeZone0.getID();
        long long4 = dateTimeZone0.convertLocalToUTC((-349200199L), true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "+97:00" + "'", str1, "+97:00");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-349200299L) + "'", long4 == (-349200299L));
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
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
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
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
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
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
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
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
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 349200000);
        int int12 = fixedDateTimeZone4.getOffsetFromLocal(0L);
        boolean boolean14 = fixedDateTimeZone4.equals((java.lang.Object) (-99L));
        java.lang.String str15 = fixedDateTimeZone4.getID();
        org.joda.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime16);
        int int19 = fixedDateTimeZone4.getOffsetFromLocal((-1051259901L));
        java.util.TimeZone timeZone20 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
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
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
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
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
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
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
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
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
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
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("UTC", "+00:01", 0, (int) (byte) 0);
        int int6 = fixedDateTimeZone4.getOffset((-349200290L));
        long long9 = fixedDateTimeZone4.convertLocalToUTC((-699000136L), true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-699000136L) + "'", long9 == (-699000136L));
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
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
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 1);
        java.lang.String str2 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+01:00" + "'", str2, "+01:00");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
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
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
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
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
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

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone6 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long8 = fixedDateTimeZone6.nextTransition((-101L));
        int int10 = fixedDateTimeZone6.getStandardOffset((long) (byte) -1);
        long long12 = dateTimeZone1.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone6, (-349200001L));
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'a');
        boolean boolean15 = fixedDateTimeZone6.equals((java.lang.Object) 'a');
        long long17 = fixedDateTimeZone6.previousTransition((-352800064L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-101L) + "'", long8 == (-101L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349200101L) + "'", long12 == (-349200101L));
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-352800064L) + "'", long17 == (-352800064L));
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        long long9 = fixedDateTimeZone4.convertLocalToUTC((long) ' ', true, (long) (byte) 1);
        java.lang.String str10 = fixedDateTimeZone4.toString();
        long long13 = fixedDateTimeZone4.adjustOffset(132L, false);
        boolean boolean15 = fixedDateTimeZone4.isStandardOffset((-349199871L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone20 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str22 = fixedDateTimeZone20.getNameKey(100L);
        long long26 = fixedDateTimeZone20.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone27 = fixedDateTimeZone20.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        long long32 = dateTimeZone28.convertLocalToUTC((long) (short) 0, false, (long) 'a');
        long long34 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone28, 100L);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-68L) + "'", long9 == (-68L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 132L + "'", long13 == 132L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+97:00" + "'", str22, "+97:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-100L) + "'", long26 == (-100L));
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 200L + "'", long34 == 200L);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
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
        long long25 = fixedDateTimeZone4.nextTransition(349200010L);
        long long27 = fixedDateTimeZone4.previousTransition((long) (short) 10);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
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
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 349200010L + "'", long25 == 349200010L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L + "'", long27 == 10L);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "+01:00", (int) 'a', 1);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal((-203L));
        java.lang.String str4 = dateTimeZone1.toString();
        long long8 = dateTimeZone1.convertLocalToUTC(59L, true, (long) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long13 = dateTimeZone9.getMillisKeepLocal(dateTimeZone11, (long) ' ');
        long long16 = dateTimeZone11.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        long long20 = dateTimeZone11.convertLocalToUTC((long) (byte) 0, false);
        java.lang.String str21 = dateTimeZone11.toString();
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone11.getName((long) (short) 0, locale23);
        boolean boolean26 = dateTimeZone11.isStandardOffset((long) 349200000);
        long long28 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, (-698399833L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-204L) + "'", long3 == (-204L));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 60L + "'", long8 == 60L);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-349199868L) + "'", long13 == (-349199868L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-349200001L) + "'", long16 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-349200000L) + "'", long20 == (-349200000L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+97:00" + "'", str21, "+97:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+97:00" + "'", str24, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1047599834L) + "'", long28 == (-1047599834L));
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(97);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00", "+00:01", 0, (int) (short) -1);
        boolean boolean6 = fixedDateTimeZone4.isStandardOffset((-349260001L));
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone12 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long14 = fixedDateTimeZone12.previousTransition((long) ' ');
        long long16 = fixedDateTimeZone12.previousTransition((long) 'a');
        int int18 = fixedDateTimeZone12.getStandardOffset((long) (short) 0);
        int int20 = fixedDateTimeZone12.getStandardOffset((long) (byte) 10);
        long long23 = fixedDateTimeZone12.convertLocalToUTC((long) 1, true);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = fixedDateTimeZone12.getOffset(readableInstant24);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone30 = new org.joda.time.tz.FixedDateTimeZone("+00:00", "+00:00:00.032", (int) (short) -1, (int) (short) 10);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone30);
        java.lang.String str32 = fixedDateTimeZone30.getID();
        java.lang.String str34 = fixedDateTimeZone30.getNameKey((-349200101L));
        int int36 = fixedDateTimeZone30.getStandardOffset(32L);
        long long38 = fixedDateTimeZone12.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone30, (-698399848L));
        long long40 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone30, (-349200068L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-99L) + "'", long23 == (-99L));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00:00.032" + "'", str34, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-698399747L) + "'", long38 == (-698399747L));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-349200067L) + "'", long40 == (-349200067L));
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long9 = fixedDateTimeZone4.adjustOffset((long) (short) 100, false);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((-349200036L), false, (-48L));
        long long15 = fixedDateTimeZone4.nextTransition(97L);
        java.lang.String str16 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-349200136L) + "'", long13 == (-349200136L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime5);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, 1);
        boolean boolean10 = fixedDateTimeZone4.equals((java.lang.Object) 1);
        int int12 = fixedDateTimeZone4.getOffsetFromLocal((-349200048L));
        long long14 = fixedDateTimeZone4.previousTransition((-115200000L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115200000L) + "'", long14 == (-115200000L));
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+01:00", "hi!", (-1), (int) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        long long8 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone6, (long) (short) 10);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long15 = fixedDateTimeZone13.previousTransition((long) ' ');
        long long17 = fixedDateTimeZone13.previousTransition((long) 'a');
        long long19 = fixedDateTimeZone13.previousTransition((long) (short) 0);
        java.util.TimeZone timeZone20 = fixedDateTimeZone13.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        java.lang.String str24 = dateTimeZone23.getID();
        long long26 = dateTimeZone21.getMillisKeepLocal(dateTimeZone23, 0L);
        long long28 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone21, (-698400101L));
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-43L) + "'", long8 == (-43L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-698400102L) + "'", long28 == (-698400102L));
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition((long) (short) 0);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str12 = fixedDateTimeZone4.toString();
        long long14 = fixedDateTimeZone4.previousTransition(38L);
        java.util.Locale locale16 = null;
        java.lang.String str17 = fixedDateTimeZone4.getName((-698399803L), locale16);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 38L + "'", long14 == 38L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
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
        org.joda.time.LocalDateTime localDateTime29 = null;
        boolean boolean30 = fixedDateTimeZone15.isLocalDateTimeGap(localDateTime29);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-349200096L) + "'", long21 == (-349200096L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-65L) + "'", long25 == (-65L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-62L) + "'", long28 == (-62L));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone0.getMillisKeepLocal(dateTimeZone2, (long) ' ');
        long long7 = dateTimeZone2.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long10 = dateTimeZone2.convertUTCToLocal(0L);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone2.getOffset(readableInstant11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        boolean boolean15 = dateTimeZone2.isStandardOffset((-110L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-349199969L) + "'", long4 == (-349199969L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349200001L) + "'", long7 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 349200000 + "'", int12 == 349200000);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = fixedDateTimeZone4.getID();
        java.lang.String str9 = fixedDateTimeZone4.getNameKey((long) (short) 10);
        long long11 = fixedDateTimeZone4.convertUTCToLocal((-349199968L));
        int int13 = fixedDateTimeZone4.getStandardOffset(132L);
        long long15 = fixedDateTimeZone4.previousTransition((-65L));
        long long17 = fixedDateTimeZone4.previousTransition((-349800001L));
        int int19 = fixedDateTimeZone4.getStandardOffset(349199834L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+97:00" + "'", str7, "+97:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349199868L) + "'", long11 == (-349199868L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-65L) + "'", long15 == (-65L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-349800001L) + "'", long17 == (-349800001L));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        boolean boolean6 = fixedDateTimeZone4.isStandardOffset((long) '#');
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        long long9 = fixedDateTimeZone4.previousTransition((long) '#');
        long long11 = fixedDateTimeZone4.convertUTCToLocal((-827999703L));
        long long14 = fixedDateTimeZone4.adjustOffset(200L, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-827999606L) + "'", long11 == (-827999606L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 200L + "'", long14 == 200L);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+01:00", "+01:00", 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass5 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
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
        int int26 = fixedDateTimeZone4.getStandardOffset((-43L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+97:00" + "'", str11, "+97:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-3L) + "'", long15 == (-3L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+97:00" + "'", str18, "+97:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.100" + "'", str21, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-3600262L) + "'", long24 == (-3600262L));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        int int10 = fixedDateTimeZone4.getStandardOffset((long) (short) 0);
        int int12 = fixedDateTimeZone4.getStandardOffset((long) (byte) 10);
        java.lang.String str13 = fixedDateTimeZone4.getID();
        long long15 = fixedDateTimeZone4.nextTransition(135L);
        java.lang.String str16 = fixedDateTimeZone4.toString();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 135L + "'", long15 == 135L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = fixedDateTimeZone4.getID();
        long long9 = fixedDateTimeZone4.previousTransition(349200010L);
        long long11 = fixedDateTimeZone4.nextTransition((long) (-1));
        long long13 = fixedDateTimeZone4.convertUTCToLocal((-349200090L));
        long long17 = fixedDateTimeZone4.convertLocalToUTC((-698400101L), true, 3L);
        java.lang.String str19 = fixedDateTimeZone4.getName((-59803L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+97:00" + "'", str7, "+97:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 349200010L + "'", long9 == 349200010L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-349199990L) + "'", long13 == (-349199990L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-698400201L) + "'", long17 == (-698400201L));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(0L);
        long long8 = fixedDateTimeZone4.convertUTCToLocal(100L);
        long long11 = fixedDateTimeZone4.convertLocalToUTC((-349200090L), false);
        boolean boolean13 = fixedDateTimeZone4.isStandardOffset((-349199901L));
        int int15 = fixedDateTimeZone4.getStandardOffset((-698400048L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 200L + "'", long8 == 200L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349200190L) + "'", long11 == (-349200190L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
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
        boolean boolean26 = fixedDateTimeZone4.isStandardOffset((-349199968L));
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        boolean boolean6 = fixedDateTimeZone4.isFixed();
        java.lang.String str7 = fixedDateTimeZone4.getID();
        java.lang.String str8 = fixedDateTimeZone4.getID();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        long long11 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone9, 10859910L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+97:00" + "'", str7, "+97:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+97:00" + "'", str8, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10859907L + "'", long11 == 10859907L);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
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
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long51 = dateTimeZone48.convertLocalToUTC((long) (byte) 1, false);
        java.lang.String str53 = dateTimeZone48.getShortName((long) ' ');
        java.util.Locale locale55 = null;
        java.lang.String str56 = dateTimeZone48.getName((long) (byte) 0, locale55);
        boolean boolean57 = fixedDateTimeZone28.equals((java.lang.Object) str56);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-349199868L) + "'", long4 == (-349199868L));
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
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-349199999L) + "'", long51 == (-349199999L));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "+97:00" + "'", str53, "+97:00");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "+97:00" + "'", str56, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00", "hi!", 0, (int) (byte) -1);
        long long7 = fixedDateTimeZone4.convertLocalToUTC((-349800036L), false);
        int int9 = fixedDateTimeZone4.getStandardOffset((-349200390L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349800036L) + "'", long7 == (-349800036L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition((long) (short) 0);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str13 = fixedDateTimeZone4.getNameKey((-349200100L));
        int int15 = fixedDateTimeZone4.getOffset(349199997L);
        long long18 = fixedDateTimeZone4.adjustOffset((-827999703L), true);
        int int20 = fixedDateTimeZone4.getStandardOffset(4199999L);
        long long22 = fixedDateTimeZone4.previousTransition((-349199948L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-827999703L) + "'", long18 == (-827999703L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-349199948L) + "'", long22 == (-349199948L));
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 100, (int) (byte) 10);
        int int6 = fixedDateTimeZone4.getOffsetFromLocal((long) (byte) 1);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = fixedDateTimeZone4.getOffset(readableInstant7);
        long long11 = fixedDateTimeZone4.adjustOffset(0L, false);
        boolean boolean12 = fixedDateTimeZone4.isFixed();
        int int14 = fixedDateTimeZone4.getOffset((-48L));
        boolean boolean15 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
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
        org.joda.time.ReadableInstant readableInstant25 = null;
        int int26 = fixedDateTimeZone4.getOffset(readableInstant25);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-349199901L) + "'", long22 == (-349199901L));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "+00:00:00.100", 10, (int) (byte) 10);
        int int6 = fixedDateTimeZone4.getOffset((long) (byte) -1);
        int int8 = fixedDateTimeZone4.getOffsetFromLocal(0L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = fixedDateTimeZone4.getOffset(readableInstant9);
        int int12 = fixedDateTimeZone4.getOffset(35L);
        int int14 = fixedDateTimeZone4.getStandardOffset(200L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long9 = fixedDateTimeZone4.adjustOffset((long) (short) 100, false);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((-349200036L), false, (-48L));
        long long15 = fixedDateTimeZone4.nextTransition(97L);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = fixedDateTimeZone4.getOffset(readableInstant16);
        int int19 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        long long23 = fixedDateTimeZone4.convertLocalToUTC((long) 10, false, (-90L));
        java.lang.String str25 = fixedDateTimeZone4.getNameKey(0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-349200136L) + "'", long13 == (-349200136L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-90L) + "'", long23 == (-90L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+97:00" + "'", str25, "+97:00");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long17 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, (long) ' ');
        boolean boolean18 = fixedDateTimeZone15.isFixed();
        java.lang.String str20 = fixedDateTimeZone15.getShortName((long) (short) 1);
        long long22 = fixedDateTimeZone15.previousTransition((-349200001L));
        boolean boolean24 = fixedDateTimeZone15.isStandardOffset(360059910L);
        org.joda.time.ReadableInstant readableInstant25 = null;
        int int26 = fixedDateTimeZone15.getOffset(readableInstant25);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        long long31 = dateTimeZone27.convertLocalToUTC((-349200001L), false, (long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str34 = dateTimeZone32.getShortName((long) (byte) 0);
        long long36 = dateTimeZone27.getMillisKeepLocal(dateTimeZone32, 0L);
        long long39 = dateTimeZone27.adjustOffset((long) (byte) 100, false);
        java.util.Locale locale41 = null;
        java.lang.String str42 = dateTimeZone27.getShortName((long) (short) 100, locale41);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone27);
        long long45 = fixedDateTimeZone15.getMillisKeepLocal(dateTimeZone27, 349199967L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.097" + "'", str20, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-349200001L) + "'", long22 == (-349200001L));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-349200101L) + "'", long31 == (-349200101L));
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00:00.100" + "'", str34, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 100L + "'", long39 == 100L);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00:00.100" + "'", str42, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 349199964L + "'", long45 == 349199964L);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        int int12 = fixedDateTimeZone4.getStandardOffset(1L);
        boolean boolean13 = fixedDateTimeZone4.isFixed();
        java.util.TimeZone timeZone14 = fixedDateTimeZone4.toTimeZone();
        boolean boolean16 = fixedDateTimeZone4.isStandardOffset(0L);
        long long19 = fixedDateTimeZone4.adjustOffset((-349199603L), true);
        java.lang.String str20 = fixedDateTimeZone4.toString();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-349199603L) + "'", long19 == (-349199603L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+97:00" + "'", str20, "+97:00");
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
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
        org.joda.time.ReadableInstant readableInstant39 = null;
        int int40 = fixedDateTimeZone15.getOffset(readableInstant39);
        java.lang.String str41 = fixedDateTimeZone15.getID();
        int int43 = fixedDateTimeZone15.getOffsetFromLocal((-698400048L));
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00:00.100" + "'", str41, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 97 + "'", int43 == 97);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
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
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        long long37 = dateTimeZone33.convertLocalToUTC((-349200003L), false, (-352860101L));
        java.lang.String str38 = dateTimeZone33.getID();
        boolean boolean39 = fixedDateTimeZone4.equals((java.lang.Object) str38);
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
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-349200103L) + "'", long37 == (-349200103L));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+97:00" + "'", str38, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.util.TimeZone timeZone8 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.lang.String str11 = dateTimeZone9.getName((-110L));
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone9.getShortName((-3600262L), locale13);
        java.lang.String str16 = dateTimeZone9.getName((-60101L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00", "+00:00:00.032", (int) (short) -1, (int) (short) 10);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.lang.String str6 = fixedDateTimeZone4.getID();
        java.lang.String str8 = fixedDateTimeZone4.getNameKey((-349200101L));
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        long long13 = dateTimeZone9.convertLocalToUTC((-349200001L), false, (long) (byte) 100);
        boolean boolean15 = dateTimeZone9.isStandardOffset((-100L));
        org.joda.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = dateTimeZone9.isLocalDateTimeGap(localDateTime16);
        java.lang.String str18 = dateTimeZone9.toString();
        boolean boolean20 = dateTimeZone9.isStandardOffset((-33L));
        boolean boolean21 = fixedDateTimeZone4.equals((java.lang.Object) (-33L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.032" + "'", str8, "+00:00:00.032");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-349200000L) + "'", long13 == (-349200000L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, 0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        long long12 = fixedDateTimeZone4.previousTransition((-349199990L));
        java.lang.String str13 = fixedDateTimeZone4.getID();
        long long17 = fixedDateTimeZone4.convertLocalToUTC((-62L), false, (long) 100);
        long long19 = fixedDateTimeZone4.convertUTCToLocal(349199867L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349199990L) + "'", long12 == (-349199990L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-162L) + "'", long17 == (-162L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 349199967L + "'", long19 == 349199967L);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
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
        boolean boolean22 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
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
        java.lang.String str42 = fixedDateTimeZone28.getName((-349199936L));
        int int44 = fixedDateTimeZone28.getStandardOffset((-3599900L));
        java.lang.String str46 = fixedDateTimeZone28.getShortName((-349200090L));
        org.joda.time.LocalDateTime localDateTime47 = null;
        boolean boolean48 = fixedDateTimeZone28.isLocalDateTimeGap(localDateTime47);
        long long52 = fixedDateTimeZone28.convertLocalToUTC((-698399968L), true, 42L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-349199969L) + "'", long4 == (-349199969L));
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
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00:00.100" + "'", str42, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00:00.100" + "'", str46, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-698400068L) + "'", long52 == (-698400068L));
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) (short) -1, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getShortName(349200000L, locale6);
        long long9 = dateTimeZone1.convertUTCToLocal((-698399747L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+01:00" + "'", str4, "+01:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+01:00" + "'", str7, "+01:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-694799747L) + "'", long9 == (-694799747L));
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
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
        java.lang.String str30 = fixedDateTimeZone4.getShortName(349199999L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-698400001L) + "'", long19 == (-698400001L));
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+97:00" + "'", str22, "+97:00");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-349200100L) + "'", long27 == (-349200100L));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.100" + "'", str30, "+00:00:00.100");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+35:52", "+01:35", 97, 0);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        long long9 = fixedDateTimeZone4.convertLocalToUTC((long) ' ', true, (long) (byte) 1);
        java.lang.String str10 = fixedDateTimeZone4.toString();
        long long13 = fixedDateTimeZone4.adjustOffset(132L, false);
        int int15 = fixedDateTimeZone4.getStandardOffset((-62L));
        java.lang.Object obj16 = null;
        boolean boolean17 = fixedDateTimeZone4.equals(obj16);
        java.lang.String str19 = fixedDateTimeZone4.getShortName(349199934L);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-68L) + "'", long9 == (-68L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 132L + "'", long13 == 132L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+35:10", "+35:10", (int) '#', 0);
        int int6 = fixedDateTimeZone4.getOffset(0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        java.util.Locale locale8 = null;
        java.lang.String str9 = fixedDateTimeZone4.getName((-349200001L), locale8);
        boolean boolean11 = fixedDateTimeZone4.isStandardOffset((long) 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-68L));
        long long11 = fixedDateTimeZone4.convertLocalToUTC((-349200000L), false, (-90L));
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getShortName((-3L), locale13);
        java.lang.String str16 = fixedDateTimeZone4.getNameKey(349200034L);
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = fixedDateTimeZone4.getOffset(readableInstant17);
        boolean boolean20 = fixedDateTimeZone4.isStandardOffset((-349200299L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349200097L) + "'", long11 == (-349200097L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.097" + "'", str14, "+00:00:00.097");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long17 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, (long) ' ');
        long long19 = fixedDateTimeZone4.nextTransition(0L);
        long long22 = fixedDateTimeZone4.adjustOffset((-349199901L), true);
        boolean boolean23 = fixedDateTimeZone4.isFixed();
        long long25 = fixedDateTimeZone4.nextTransition((-59803L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-349199901L) + "'", long22 == (-349199901L));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-59803L) + "'", long25 == (-59803L));
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        int int8 = fixedDateTimeZone4.getStandardOffset((long) (-1));
        int int10 = fixedDateTimeZone4.getStandardOffset((long) 97);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long13 = fixedDateTimeZone4.nextTransition(349200132L);
        java.lang.String str15 = fixedDateTimeZone4.getShortName(0L);
        java.lang.String str16 = fixedDateTimeZone4.getID();
        int int18 = fixedDateTimeZone4.getOffset(349199997L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 349200132L + "'", long13 == 349200132L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.nextTransition((long) 10);
        int int8 = fixedDateTimeZone4.getStandardOffset((-349200001L));
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime9);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) ' ');
        long long14 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone12, (long) ' ');
        long long18 = fixedDateTimeZone4.convertLocalToUTC(107L, true, 349200132L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115199868L) + "'", long14 == (-115199868L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 7L + "'", long18 == 7L);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "+00:00", 0, 32);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
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
        long long27 = fixedDateTimeZone12.convertUTCToLocal(3660000L);
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 3660100L + "'", long27 == 3660100L);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
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
        long long26 = fixedDateTimeZone15.nextTransition((long) 0);
        long long28 = fixedDateTimeZone15.previousTransition(475259910L);
        java.util.Locale locale30 = null;
        java.lang.String str31 = fixedDateTimeZone15.getName((long) (-1), locale30);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+97:00" + "'", str21, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 475259910L + "'", long28 == 475259910L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00:00.100" + "'", str31, "+00:00:00.100");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) -1);
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (-349199900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-345599803L) + "'", long5 == (-345599803L));
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
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
        boolean boolean42 = fixedDateTimeZone4.isStandardOffset((-698399900L));
        boolean boolean44 = fixedDateTimeZone4.isStandardOffset((-243L));
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.convertUTCToLocal((long) (short) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long9 = fixedDateTimeZone4.convertLocalToUTC(349199934L, false);
        java.util.TimeZone timeZone10 = fixedDateTimeZone4.toTimeZone();
        java.lang.Class<?> wildcardClass11 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 349199834L + "'", long9 == 349199834L);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "+10:35", 0, (int) '#');
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime6);
        java.lang.String str9 = fixedDateTimeZone4.getNameKey((-698399936L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+10:35" + "'", str9, "+10:35");
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        long long5 = dateTimeZone1.convertLocalToUTC(349200132L, false, 0L);
        boolean boolean7 = dateTimeZone1.isStandardOffset((long) 115800000);
        java.lang.String str8 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 349200133L + "'", long5 == 349200133L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long9 = fixedDateTimeZone4.adjustOffset((long) (short) 100, false);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((-349200036L), false, (-48L));
        long long15 = fixedDateTimeZone4.nextTransition(97L);
        java.lang.String str17 = fixedDateTimeZone4.getNameKey(0L);
        boolean boolean18 = fixedDateTimeZone4.isFixed();
        org.joda.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime19);
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime21);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-349200136L) + "'", long13 == (-349200136L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getName((long) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone0.getOffset(readableInstant3);
        long long6 = dateTimeZone0.convertUTCToLocal((-349200001L));
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone0.getName((-1L), locale8);
        boolean boolean11 = dateTimeZone0.isStandardOffset((long) ' ');
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-349199901L) + "'", long6 == (-349199901L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:10", "+01:00", (int) (byte) 1, (int) (short) 100);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        int int14 = fixedDateTimeZone4.getOffset((long) (short) 100);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime15);
        java.lang.String str18 = fixedDateTimeZone4.getName((-349139968L));
        long long21 = fixedDateTimeZone4.adjustOffset((-1047599834L), false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.100" + "'", str18, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1047599834L) + "'", long21 == (-1047599834L));
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
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
        java.lang.String str40 = dateTimeZone10.getShortName((-109L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-349200001L) + "'", long18 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-349200000L) + "'", long22 == (-349200000L));
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+97:00" + "'", str32, "+97:00");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-349200000L) + "'", long35 == (-349200000L));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-349200068L) + "'", long38 == (-349200068L));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+97:00" + "'", str40, "+97:00");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-68L));
        java.lang.String str8 = fixedDateTimeZone4.getID();
        long long12 = fixedDateTimeZone4.convertLocalToUTC(135L, false, (-698400101L));
        java.lang.String str13 = fixedDateTimeZone4.getID();
        java.lang.String str15 = fixedDateTimeZone4.getShortName((-126060133L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+97:00" + "'", str8, "+97:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 38L + "'", long12 == 38L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.097" + "'", str15, "+00:00:00.097");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.util.TimeZone timeZone12 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone13.getOffset(readableInstant14);
        long long18 = dateTimeZone13.adjustOffset((-99L), false);
        org.joda.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = dateTimeZone13.isLocalDateTimeGap(localDateTime19);
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = dateTimeZone13.isLocalDateTimeGap(localDateTime21);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-99L) + "'", long18 == (-99L));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime11);
        java.util.TimeZone timeZone13 = fixedDateTimeZone4.toTimeZone();
        int int15 = fixedDateTimeZone4.getStandardOffset(349200132L);
        int int17 = fixedDateTimeZone4.getStandardOffset((-352260101L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        long long9 = fixedDateTimeZone4.convertLocalToUTC((long) ' ', true, (long) (byte) 1);
        long long11 = fixedDateTimeZone4.previousTransition(0L);
        int int13 = fixedDateTimeZone4.getOffsetFromLocal((long) (byte) 10);
        boolean boolean15 = fixedDateTimeZone4.isStandardOffset(4199999L);
        org.joda.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime16);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-68L) + "'", long9 == (-68L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition((long) (short) 0);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str13 = fixedDateTimeZone4.getNameKey((-349200100L));
        int int15 = fixedDateTimeZone4.getOffset(1L);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int18 = fixedDateTimeZone4.getOffset((-349199969L));
        java.lang.String str20 = fixedDateTimeZone4.getNameKey((-168L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+97:00" + "'", str20, "+97:00");
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
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
        java.util.Locale locale25 = null;
        java.lang.String str26 = fixedDateTimeZone4.getShortName((-349800036L), locale25);
        long long28 = fixedDateTimeZone4.nextTransition((-201L));
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.100" + "'", str26, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-201L) + "'", long28 == (-201L));
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone0.getMillisKeepLocal(dateTimeZone2, (long) ' ');
        long long7 = dateTimeZone2.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long11 = dateTimeZone2.convertLocalToUTC((long) (byte) 0, false);
        java.lang.String str12 = dateTimeZone2.toString();
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone2.getName((long) (short) 0, locale14);
        boolean boolean17 = dateTimeZone2.isStandardOffset((long) 349200000);
        long long20 = dateTimeZone2.convertLocalToUTC((-698399936L), false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-349199868L) + "'", long4 == (-349199868L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349200001L) + "'", long7 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349200000L) + "'", long11 == (-349200000L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1047599936L) + "'", long20 == (-1047599936L));
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        long long9 = fixedDateTimeZone4.convertLocalToUTC((long) ' ', true, (long) (byte) 1);
        long long11 = fixedDateTimeZone4.previousTransition(0L);
        long long13 = fixedDateTimeZone4.previousTransition((-349200001L));
        java.lang.String str15 = fixedDateTimeZone4.getName(698399835L);
        boolean boolean16 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-68L) + "'", long9 == (-68L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-349200001L) + "'", long13 == (-349200001L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime11);
        java.util.TimeZone timeZone13 = fixedDateTimeZone4.toTimeZone();
        boolean boolean15 = fixedDateTimeZone4.equals((java.lang.Object) "");
        boolean boolean16 = fixedDateTimeZone4.isFixed();
        java.lang.String str17 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 60000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 60000");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
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
        long long28 = fixedDateTimeZone4.adjustOffset((-349199890L), false);
        java.lang.String str30 = fixedDateTimeZone4.getName((-303L));
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
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-349199890L) + "'", long28 == (-349199890L));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.100" + "'", str30, "+00:00:00.100");
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, 32);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "+00:00:00.100", 10, (int) (byte) 10);
        boolean boolean6 = fixedDateTimeZone4.isStandardOffset((-201L));
        long long9 = fixedDateTimeZone4.convertLocalToUTC((long) 97, true);
        java.lang.String str11 = fixedDateTimeZone4.getShortName(49L);
        java.lang.String str13 = fixedDateTimeZone4.getNameKey((-698399848L));
        boolean boolean15 = fixedDateTimeZone4.isStandardOffset(300L);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long20 = fixedDateTimeZone4.convertLocalToUTC((long) 115200000, false, (-34L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 87L + "'", long9 == 87L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.010" + "'", str11, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 115199990L + "'", long20 == 115199990L);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(97L);
        long long14 = fixedDateTimeZone4.convertLocalToUTC((long) (short) 0, true, 0L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone19 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 100, (int) (byte) 10);
        int int21 = fixedDateTimeZone19.getOffsetFromLocal((long) (byte) 1);
        org.joda.time.ReadableInstant readableInstant22 = null;
        int int23 = fixedDateTimeZone19.getOffset(readableInstant22);
        long long26 = fixedDateTimeZone19.adjustOffset(0L, false);
        java.lang.String str28 = fixedDateTimeZone19.getNameKey((long) '#');
        java.util.Locale locale30 = null;
        java.lang.String str31 = fixedDateTimeZone19.getShortName((-118799900L), locale30);
        boolean boolean32 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone19);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-100L) + "'", long14 == (-100L));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00:00.100" + "'", str31, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-68L));
        long long10 = fixedDateTimeZone4.adjustOffset((-65L), true);
        int int12 = fixedDateTimeZone4.getOffsetFromLocal(10L);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = fixedDateTimeZone4.getOffset(readableInstant13);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-65L) + "'", long10 == (-65L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition((long) (short) 0);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str13 = fixedDateTimeZone4.getNameKey((-349200100L));
        int int15 = fixedDateTimeZone4.getOffset((-101L));
        boolean boolean16 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("UTC", "+00:01", 0, (int) (byte) 0);
        int int6 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 0);
        java.util.Locale locale8 = null;
        java.lang.String str9 = fixedDateTimeZone4.getName((long) 1, locale8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
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
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:01", "+00:00:00.100", 0, 100);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((-100L));
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = fixedDateTimeZone4.getOffset(readableInstant7);
        int int10 = fixedDateTimeZone4.getStandardOffset((-1047599936L));
        boolean boolean12 = fixedDateTimeZone4.isStandardOffset(7L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        int int6 = fixedDateTimeZone4.getOffset(349200010L);
        long long8 = fixedDateTimeZone4.nextTransition(100L);
        boolean boolean10 = fixedDateTimeZone4.isStandardOffset((-349800036L));
        java.lang.String str12 = fixedDateTimeZone4.getNameKey((-100L));
        long long15 = fixedDateTimeZone4.adjustOffset((-349199893L), false);
        long long18 = fixedDateTimeZone4.convertLocalToUTC(10L, false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-349199893L) + "'", long15 == (-349199893L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-87L) + "'", long18 == (-87L));
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
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
        java.util.TimeZone timeZone47 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str48 = fixedDateTimeZone4.toString();
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
        org.junit.Assert.assertNotNull(timeZone47);
        org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+97:00" + "'", str48, "+97:00");
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getShortName(0L, locale13);
        java.lang.String str16 = fixedDateTimeZone4.getNameKey((-101L));
        long long18 = fixedDateTimeZone4.nextTransition((-68L));
        boolean boolean19 = fixedDateTimeZone4.isFixed();
        org.joda.time.ReadableInstant readableInstant20 = null;
        int int21 = fixedDateTimeZone4.getOffset(readableInstant20);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-68L) + "'", long18 == (-68L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(1);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((long) (short) -1, locale3);
        boolean boolean6 = dateTimeZone1.isStandardOffset(349199799L);
        java.lang.String str8 = dateTimeZone1.getName((-349200101L));
        java.lang.String str10 = dateTimeZone1.getName((-46L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+01:00" + "'", str4, "+01:00");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:00" + "'", str8, "+01:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+01:00" + "'", str10, "+01:00");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        int int10 = fixedDateTimeZone4.getStandardOffset((long) (short) 0);
        int int12 = fixedDateTimeZone4.getStandardOffset((long) (byte) 10);
        java.lang.String str13 = fixedDateTimeZone4.getID();
        long long15 = fixedDateTimeZone4.nextTransition(135L);
        long long19 = fixedDateTimeZone4.convertLocalToUTC((-349200201L), true, 4199799L);
        org.joda.time.ReadableInstant readableInstant20 = null;
        int int21 = fixedDateTimeZone4.getOffset(readableInstant20);
        org.joda.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime22);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 135L + "'", long15 == 135L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-349200301L) + "'", long19 == (-349200301L));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
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
        long long27 = fixedDateTimeZone4.convertUTCToLocal(59799L);
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 59899L + "'", long27 == 59899L);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        int int12 = fixedDateTimeZone4.getStandardOffset(1L);
        long long16 = fixedDateTimeZone4.convertLocalToUTC((long) '4', false, (long) (short) 1);
        java.lang.String str17 = fixedDateTimeZone4.toString();
        java.lang.String str19 = fixedDateTimeZone4.getNameKey((-33L));
        java.lang.String str21 = fixedDateTimeZone4.getName((-698400099L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-48L) + "'", long16 == (-48L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+97:00" + "'", str19, "+97:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.100" + "'", str21, "+00:00:00.100");
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:10", "", (int) (byte) -1, (int) (byte) -1);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((-698399865L));
        java.util.Locale locale8 = null;
        java.lang.String str9 = fixedDateTimeZone4.getShortName((-349200003L), locale8);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:01", "+01:35", (int) '4', 115800000);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.097", "+10:00", 0, (int) (short) 0);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-349200290L), locale6);
        long long9 = fixedDateTimeZone4.convertUTCToLocal(0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long17 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, (long) ' ');
        long long19 = fixedDateTimeZone4.nextTransition(0L);
        int int21 = fixedDateTimeZone4.getOffsetFromLocal((long) 100);
        boolean boolean23 = fixedDateTimeZone4.isStandardOffset(349199903L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
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
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        long long22 = dateTimeZone9.getMillisKeepLocal(dateTimeZone20, (long) (byte) 1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+97:00" + "'", str3, "+97:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-349200000L) + "'", long8 == (-349200000L));
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 349200101L + "'", long15 == 349200101L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-00:00:00.001" + "'", str17, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-00:00:00.001" + "'", str19, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-68L));
        long long11 = fixedDateTimeZone4.convertLocalToUTC((-349200000L), false, (-90L));
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getShortName((-3L), locale13);
        java.lang.String str16 = fixedDateTimeZone4.getNameKey(349200034L);
        long long18 = fixedDateTimeZone4.previousTransition((-133L));
        long long22 = fixedDateTimeZone4.convertLocalToUTC((long) 97, true, (-698999900L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349200097L) + "'", long11 == (-349200097L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.097" + "'", str14, "+00:00:00.097");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-133L) + "'", long18 == (-133L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        int int9 = fixedDateTimeZone4.getOffset((long) '#');
        java.lang.String str11 = fixedDateTimeZone4.getNameKey((-349200136L));
        java.lang.String str13 = fixedDateTimeZone4.getShortName(0L);
        java.util.Locale locale15 = null;
        java.lang.String str16 = fixedDateTimeZone4.getName(0L, locale15);
        long long20 = fixedDateTimeZone4.convertLocalToUTC(235L, true, 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+97:00" + "'", str11, "+97:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 135L + "'", long20 == 135L);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(97L);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long13 = fixedDateTimeZone4.nextTransition((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = fixedDateTimeZone4.getOffset(readableInstant14);
        long long17 = fixedDateTimeZone4.previousTransition(59700L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 59700L + "'", long17 == 59700L);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
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
        long long30 = dateTimeZone13.convertLocalToUTC((-148L), true);
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
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-349200148L) + "'", long30 == (-349200148L));
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
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
        long long45 = fixedDateTimeZone4.nextTransition((-201L));
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-698400001L) + "'", long19 == (-698400001L));
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+97:00" + "'", str22, "+97:00");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-349200100L) + "'", long27 == (-349200100L));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 32L + "'", long35 == 32L);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+97:00" + "'", str37, "+97:00");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-349200101L) + "'", long40 == (-349200101L));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 32L + "'", long42 == 32L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-201L) + "'", long45 == (-201L));
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone6 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long8 = fixedDateTimeZone6.previousTransition((long) ' ');
        long long10 = fixedDateTimeZone6.previousTransition((long) 'a');
        java.lang.String str12 = fixedDateTimeZone6.getNameKey((long) 349200000);
        java.util.TimeZone timeZone13 = fixedDateTimeZone6.toTimeZone();
        long long15 = dateTimeZone1.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone6, (-68L));
        long long18 = dateTimeZone1.adjustOffset(115199990L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-168L) + "'", long15 == (-168L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 115199990L + "'", long18 == 115199990L);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale2 = null;
        java.lang.String str3 = dateTimeZone0.getName((long) (short) 100, locale2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone0.getOffset(readableInstant4);
        java.lang.String str7 = dateTimeZone0.getShortName(35L);
        long long10 = dateTimeZone0.convertLocalToUTC((-68L), true);
        long long13 = dateTimeZone0.adjustOffset(97L, false);
        java.lang.String str14 = dateTimeZone0.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-68L) + "'", long10 == (-68L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        long long9 = fixedDateTimeZone4.convertLocalToUTC((long) ' ', true, (long) (byte) 1);
        long long11 = fixedDateTimeZone4.previousTransition(0L);
        int int13 = fixedDateTimeZone4.getOffsetFromLocal((long) (byte) 10);
        java.util.Locale locale15 = null;
        java.lang.String str16 = fixedDateTimeZone4.getName((-349199948L), locale15);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-68L) + "'", long9 == (-68L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        java.lang.String str12 = fixedDateTimeZone4.getNameKey((-349199968L));
        java.lang.String str13 = fixedDateTimeZone4.getID();
        long long16 = fixedDateTimeZone4.adjustOffset(349199910L, true);
        boolean boolean18 = fixedDateTimeZone4.isStandardOffset((long) (byte) -1);
        java.util.Locale locale20 = null;
        java.lang.String str21 = fixedDateTimeZone4.getShortName((long) 35, locale20);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 349199910L + "'", long16 == 349199910L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.100" + "'", str21, "+00:00:00.100");
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        boolean boolean6 = fixedDateTimeZone4.isFixed();
        java.lang.String str7 = fixedDateTimeZone4.getID();
        int int9 = fixedDateTimeZone4.getOffsetFromLocal((-1L));
        long long13 = fixedDateTimeZone4.convertLocalToUTC((-349200236L), false, (-133L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone18 = new org.joda.time.tz.FixedDateTimeZone("", "hi!", 349200000, 10);
        boolean boolean19 = fixedDateTimeZone18.isFixed();
        long long21 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone18, 300L);
        java.lang.String str23 = fixedDateTimeZone4.getNameKey((-243L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+97:00" + "'", str7, "+97:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-349200333L) + "'", long13 == (-349200333L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-349199603L) + "'", long21 == (-349199603L));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition((long) (short) 0);
        java.lang.String str11 = fixedDateTimeZone4.getID();
        long long15 = fixedDateTimeZone4.convertLocalToUTC((long) 97, false, (-349199871L));
        java.lang.String str17 = fixedDateTimeZone4.getName((long) 1);
        java.lang.String str18 = fixedDateTimeZone4.toString();
        java.lang.Class<?> wildcardClass19 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+97:00" + "'", str11, "+97:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-3L) + "'", long15 == (-3L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+97:00" + "'", str18, "+97:00");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
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
        java.lang.String str26 = fixedDateTimeZone11.toString();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone11);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-100L) + "'", long20 == (-100L));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+97:00" + "'", str26, "+97:00");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "+10:35", 0, (int) '#');
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        long long8 = fixedDateTimeZone4.convertLocalToUTC(349200000L, true);
        long long11 = fixedDateTimeZone4.convertLocalToUTC(0L, false);
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getName(10L, locale13);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone19 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long21 = fixedDateTimeZone19.previousTransition((long) ' ');
        long long23 = fixedDateTimeZone19.previousTransition((long) 'a');
        long long25 = fixedDateTimeZone19.previousTransition(349200000L);
        int int27 = fixedDateTimeZone19.getStandardOffset(1L);
        long long31 = fixedDateTimeZone19.convertLocalToUTC((long) '4', false, (long) (short) 1);
        long long33 = fixedDateTimeZone19.previousTransition((-3L));
        long long36 = fixedDateTimeZone19.convertLocalToUTC(1L, false);
        java.util.Locale locale38 = null;
        java.lang.String str39 = fixedDateTimeZone19.getShortName(100L, locale38);
        java.lang.String str40 = fixedDateTimeZone19.getID();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone45 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str47 = fixedDateTimeZone45.getNameKey(100L);
        long long51 = fixedDateTimeZone45.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone52 = fixedDateTimeZone45.toTimeZone();
        java.util.Locale locale54 = null;
        java.lang.String str55 = fixedDateTimeZone45.getShortName(0L, locale54);
        java.lang.String str57 = fixedDateTimeZone45.getNameKey((-101L));
        long long59 = fixedDateTimeZone45.nextTransition((-68L));
        long long61 = fixedDateTimeZone19.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone45, 32L);
        int int63 = fixedDateTimeZone19.getOffsetFromLocal((-349200100L));
        long long65 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone19, 60032L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 349200000L + "'", long8 == 349200000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 97L + "'", long23 == 97L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 349200000L + "'", long25 == 349200000L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-48L) + "'", long31 == (-48L));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-3L) + "'", long33 == (-3L));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-99L) + "'", long36 == (-99L));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00:00.100" + "'", str39, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+97:00" + "'", str40, "+97:00");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+97:00" + "'", str47, "+97:00");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-100L) + "'", long51 == (-100L));
        org.junit.Assert.assertNotNull(timeZone52);
        org.junit.Assert.assertEquals(timeZone52.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "+00:00:00.100" + "'", str55, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "+97:00" + "'", str57, "+97:00");
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-68L) + "'", long59 == (-68L));
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 32L + "'", long61 == 32L);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 100 + "'", int63 == 100);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 59932L + "'", long65 == 59932L);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
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
        long long24 = dateTimeZone0.convertLocalToUTC((long) 6720000, true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-349200101L) + "'", long4 == (-349200101L));
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.100" + "'", str7, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+97:00" + "'", str21, "+97:00");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 6719900L + "'", long24 == 6719900L);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "-00:00:00.001", 60000, 97);
        int int6 = fixedDateTimeZone4.getOffset((-349199936L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60000 + "'", int6 == 60000);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        java.util.Locale locale8 = null;
        java.lang.String str9 = fixedDateTimeZone4.getName((-349200001L), locale8);
        java.util.Locale locale11 = null;
        java.lang.String str12 = fixedDateTimeZone4.getName((-349200000L), locale11);
        long long15 = fixedDateTimeZone4.adjustOffset((-349200096L), false);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-349200096L) + "'", long15 == (-349200096L));
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        java.util.Locale locale7 = null;
        java.lang.String str8 = fixedDateTimeZone4.getShortName((long) (short) 100, locale7);
        long long10 = fixedDateTimeZone4.convertUTCToLocal((-699000036L));
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.100" + "'", str8, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-698999936L) + "'", long10 == (-698999936L));
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.010", "+10:35", (int) (byte) 1, (int) (short) 0);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.010' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 349200000);
        int int12 = fixedDateTimeZone4.getOffsetFromLocal(0L);
        boolean boolean14 = fixedDateTimeZone4.equals((java.lang.Object) (-99L));
        java.util.Locale locale16 = null;
        java.lang.String str17 = fixedDateTimeZone4.getShortName((-349800139L), locale16);
        boolean boolean19 = fixedDateTimeZone4.isStandardOffset((-33L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
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
        boolean boolean19 = fixedDateTimeZone4.isFixed();
        long long21 = fixedDateTimeZone4.nextTransition((-110L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-110L) + "'", long21 == (-110L));
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
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
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        int int10 = fixedDateTimeZone4.getStandardOffset((long) (short) 0);
        int int12 = fixedDateTimeZone4.getStandardOffset((long) (byte) 10);
        java.lang.String str13 = fixedDateTimeZone4.getID();
        long long15 = fixedDateTimeZone4.nextTransition(135L);
        long long19 = fixedDateTimeZone4.convertLocalToUTC((-349200201L), true, 4199799L);
        java.lang.String str21 = fixedDateTimeZone4.getName(135L);
        java.lang.String str23 = fixedDateTimeZone4.getName(0L);
        java.lang.String str24 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 135L + "'", long15 == 135L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-349200301L) + "'", long19 == (-349200301L));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.100" + "'", str21, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.100" + "'", str23, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+97:00" + "'", str24, "+97:00");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (int) (byte) 1);
        long long4 = dateTimeZone2.convertUTCToLocal(349199910L);
        long long7 = dateTimeZone2.convertLocalToUTC((-133L), true);
        boolean boolean9 = dateTimeZone2.isStandardOffset((-349139868L));
        long long11 = dateTimeZone2.convertUTCToLocal(349199699L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 475259910L + "'", long4 == 475259910L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-126060133L) + "'", long7 == (-126060133L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 475259699L + "'", long11 == 475259699L);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long7 = dateTimeZone4.convertLocalToUTC((long) (byte) 1, false);
        java.lang.String str9 = dateTimeZone4.getShortName((long) ' ');
        long long11 = dateTimeZone0.getMillisKeepLocal(dateTimeZone4, 0L);
        long long13 = dateTimeZone0.convertUTCToLocal(32L);
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone0.getOffset(readableInstant14);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.String str18 = dateTimeZone0.getName(3660100L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199999L) + "'", long7 == (-349199999L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349199900L) + "'", long11 == (-349199900L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 132L + "'", long13 == 132L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.100" + "'", str18, "+00:00:00.100");
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long17 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, (long) ' ');
        java.lang.String str18 = fixedDateTimeZone15.getID();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.100" + "'", str18, "+00:00:00.100");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        boolean boolean6 = fixedDateTimeZone4.isStandardOffset((long) '#');
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        long long9 = fixedDateTimeZone4.previousTransition((-68L));
        long long11 = fixedDateTimeZone4.previousTransition(0L);
        long long14 = fixedDateTimeZone4.convertLocalToUTC((-103L), false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-68L) + "'", long9 == (-68L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-200L) + "'", long14 == (-200L));
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
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
        java.util.Locale locale39 = null;
        java.lang.String str40 = fixedDateTimeZone14.getName(3L, locale39);
        org.joda.time.ReadableInstant readableInstant41 = null;
        int int42 = fixedDateTimeZone14.getOffset(readableInstant41);
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
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00:00.100" + "'", str40, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long4 = dateTimeZone0.convertLocalToUTC((-349200001L), false, (long) (byte) 100);
        boolean boolean6 = dateTimeZone0.isStandardOffset((-100L));
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone0.isLocalDateTimeGap(localDateTime7);
        long long11 = dateTimeZone0.adjustOffset((-352860101L), false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-349200101L) + "'", long4 == (-349200101L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-352860101L) + "'", long11 == (-352860101L));
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
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
        long long34 = dateTimeZone26.convertLocalToUTC((long) (short) 100, true, (long) (short) 10);
        java.util.Locale locale36 = null;
        java.lang.String str37 = dateTimeZone26.getName((-349200064L), locale36);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone26);
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
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-599900L) + "'", long34 == (-599900L));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:10" + "'", str37, "+00:10");
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        long long9 = fixedDateTimeZone4.convertLocalToUTC((long) ' ', true, (long) (byte) 1);
        java.lang.String str10 = fixedDateTimeZone4.toString();
        long long13 = fixedDateTimeZone4.adjustOffset(132L, false);
        int int15 = fixedDateTimeZone4.getStandardOffset((-62L));
        long long18 = fixedDateTimeZone4.convertLocalToUTC((-349199999L), true);
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = fixedDateTimeZone4.getOffset(readableInstant19);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-68L) + "'", long9 == (-68L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 132L + "'", long13 == 132L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-349200099L) + "'", long18 == (-349200099L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition((long) (short) 0);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str12 = fixedDateTimeZone4.getID();
        long long14 = fixedDateTimeZone4.convertUTCToLocal((-103L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone19 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long21 = fixedDateTimeZone19.previousTransition((long) ' ');
        long long23 = fixedDateTimeZone19.previousTransition((long) 'a');
        long long25 = fixedDateTimeZone19.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone30 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long32 = fixedDateTimeZone19.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone30, (long) ' ');
        boolean boolean33 = fixedDateTimeZone30.isFixed();
        long long36 = fixedDateTimeZone30.convertLocalToUTC((-349199999L), false);
        java.lang.Object obj37 = null;
        boolean boolean38 = fixedDateTimeZone30.equals(obj37);
        int int40 = fixedDateTimeZone30.getOffset((long) ' ');
        int int42 = fixedDateTimeZone30.getOffset(232L);
        boolean boolean43 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone30);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-3L) + "'", long14 == (-3L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 97L + "'", long23 == 97L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 349200000L + "'", long25 == 349200000L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 35L + "'", long32 == 35L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-349200096L) + "'", long36 == (-349200096L));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 97 + "'", int42 == 97);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:10", "", (int) (byte) -1, (int) (byte) -1);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((-698399865L));
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = fixedDateTimeZone4.getOffset(readableInstant7);
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((-698400190L));
        java.util.Locale locale12 = null;
        java.lang.String str13 = fixedDateTimeZone4.getShortName((-348600068L), locale12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
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
        boolean boolean33 = fixedDateTimeZone4.isFixed();
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        int int6 = fixedDateTimeZone4.getOffset(349200010L);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime8);
        java.lang.String str11 = fixedDateTimeZone4.getNameKey((-349200099L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
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
        long long27 = fixedDateTimeZone14.nextTransition((-1047599834L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+97:00" + "'", str25, "+97:00");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1047599834L) + "'", long27 == (-1047599834L));
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.util.TimeZone timeZone12 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone18 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long20 = fixedDateTimeZone18.previousTransition((long) ' ');
        long long22 = fixedDateTimeZone18.previousTransition((long) 'a');
        long long24 = fixedDateTimeZone18.previousTransition(349200000L);
        long long26 = fixedDateTimeZone18.previousTransition((-349199990L));
        java.lang.String str27 = fixedDateTimeZone18.getID();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone32 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str34 = fixedDateTimeZone32.getNameKey((long) 1);
        long long36 = fixedDateTimeZone32.nextTransition((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long43 = dateTimeZone39.getMillisKeepLocal(dateTimeZone41, (long) ' ');
        long long46 = dateTimeZone41.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone41);
        long long50 = dateTimeZone41.convertLocalToUTC((long) (byte) 0, false);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long54 = dateTimeZone41.getMillisKeepLocal(dateTimeZone52, (long) 1);
        long long56 = dateTimeZone38.getMillisKeepLocal(dateTimeZone41, (long) 0);
        boolean boolean57 = fixedDateTimeZone32.equals((java.lang.Object) dateTimeZone38);
        java.util.Locale locale59 = null;
        java.lang.String str60 = dateTimeZone38.getName(97L, locale59);
        long long63 = dateTimeZone38.adjustOffset((long) (short) 10, true);
        long long66 = dateTimeZone38.adjustOffset((long) (short) 10, false);
        boolean boolean67 = fixedDateTimeZone18.equals((java.lang.Object) false);
        org.joda.time.LocalDateTime localDateTime68 = null;
        boolean boolean69 = fixedDateTimeZone18.isLocalDateTimeGap(localDateTime68);
        long long71 = dateTimeZone13.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone18, (-349140197L));
        long long74 = dateTimeZone13.adjustOffset((long) '#', false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 97L + "'", long22 == 97L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 349200000L + "'", long24 == 349200000L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-349199990L) + "'", long26 == (-349199990L));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+97:00" + "'", str27, "+97:00");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+97:00" + "'", str34, "+97:00");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 100L + "'", long36 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-348599968L) + "'", long43 == (-348599968L));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-349200001L) + "'", long46 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-349200000L) + "'", long50 == (-349200000L));
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1L + "'", long54 == 1L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "+97:00" + "'", str60, "+97:00");
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 10L + "'", long63 == 10L);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 10L + "'", long66 == 10L);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + (-349140297L) + "'", long71 == (-349140297L));
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 35L + "'", long74 == 35L);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition((long) (short) 0);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str12 = fixedDateTimeZone4.getID();
        java.lang.String str14 = fixedDateTimeZone4.getName(10L);
        boolean boolean15 = fixedDateTimeZone4.isFixed();
        int int17 = fixedDateTimeZone4.getStandardOffset((-349199966L));
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = fixedDateTimeZone4.getOffset(readableInstant18);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        java.lang.String str12 = fixedDateTimeZone4.getNameKey((-349199968L));
        long long15 = fixedDateTimeZone4.adjustOffset((long) (-1), true);
        int int17 = fixedDateTimeZone4.getStandardOffset(0L);
        java.util.TimeZone timeZone18 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(115200000, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:01", "+00:00:00.100", 0, 100);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((-100L));
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = fixedDateTimeZone4.getOffset(readableInstant7);
        int int10 = fixedDateTimeZone4.getStandardOffset((-1047599936L));
        long long12 = fixedDateTimeZone4.convertUTCToLocal((-349199833L));
        long long14 = fixedDateTimeZone4.previousTransition(349199752L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349199833L) + "'", long12 == (-349199833L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 349199752L + "'", long14 == 349199752L);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition((long) (short) 0);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        long long14 = fixedDateTimeZone4.convertLocalToUTC(0L, false);
        boolean boolean16 = fixedDateTimeZone4.isStandardOffset(349200010L);
        java.lang.String str17 = fixedDateTimeZone4.toString();
        java.util.Locale locale19 = null;
        java.lang.String str20 = fixedDateTimeZone4.getShortName((long) (-1), locale19);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-100L) + "'", long14 == (-100L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-68L));
        java.lang.String str8 = fixedDateTimeZone4.getID();
        long long12 = fixedDateTimeZone4.convertLocalToUTC(135L, false, (-698400101L));
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime13);
        long long18 = fixedDateTimeZone4.convertLocalToUTC((-698399747L), false, 3660000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+97:00" + "'", str8, "+97:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 38L + "'", long12 == 38L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-698399844L) + "'", long18 == (-698399844L));
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "+00:00", (int) (byte) 0, (int) (byte) -1);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
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
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone14);
        long long29 = fixedDateTimeZone14.adjustOffset(3660200L, false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+97:00" + "'", str25, "+97:00");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 3660200L + "'", long29 == 3660200L);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
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
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(97L);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long15 = fixedDateTimeZone4.convertLocalToUTC((long) (-1), false, (long) 100);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone20 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long22 = fixedDateTimeZone20.previousTransition((long) ' ');
        long long24 = fixedDateTimeZone20.previousTransition((long) 'a');
        java.lang.String str26 = fixedDateTimeZone20.getNameKey((long) 349200000);
        long long29 = fixedDateTimeZone20.convertLocalToUTC((long) 10, true);
        java.util.Locale locale31 = null;
        java.lang.String str32 = fixedDateTimeZone20.getShortName((long) 'a', locale31);
        boolean boolean34 = fixedDateTimeZone20.isStandardOffset(349200032L);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        long long37 = fixedDateTimeZone20.getMillisKeepLocal(dateTimeZone35, 35L);
        org.joda.time.LocalDateTime localDateTime38 = null;
        boolean boolean39 = fixedDateTimeZone20.isLocalDateTimeGap(localDateTime38);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone44 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long46 = fixedDateTimeZone44.previousTransition((long) ' ');
        long long48 = fixedDateTimeZone44.previousTransition((long) 'a');
        java.lang.String str50 = fixedDateTimeZone44.getNameKey((long) 349200000);
        int int52 = fixedDateTimeZone44.getOffsetFromLocal(0L);
        boolean boolean54 = fixedDateTimeZone44.equals((java.lang.Object) (-99L));
        java.lang.String str55 = fixedDateTimeZone44.getID();
        boolean boolean56 = fixedDateTimeZone20.equals((java.lang.Object) str55);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone20);
        int int59 = fixedDateTimeZone20.getOffset((-349200201L));
        long long61 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone20, (-349200333L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-101L) + "'", long15 == (-101L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 97L + "'", long24 == 97L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+97:00" + "'", str26, "+97:00");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-90L) + "'", long29 == (-90L));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.100" + "'", str32, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 35L + "'", long37 == 35L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 32L + "'", long46 == 32L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 97L + "'", long48 == 97L);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+97:00" + "'", str50, "+97:00");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "+97:00" + "'", str55, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-349200333L) + "'", long61 == (-349200333L));
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        boolean boolean3 = dateTimeZone1.isStandardOffset(698399838L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str2 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
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
        org.joda.time.LocalDateTime localDateTime53 = null;
        boolean boolean54 = fixedDateTimeZone30.isLocalDateTimeGap(localDateTime53);
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
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        java.lang.String str9 = fixedDateTimeZone4.getNameKey((-349199901L));
        long long11 = fixedDateTimeZone4.nextTransition((-68L));
        long long14 = fixedDateTimeZone4.adjustOffset(31L, false);
        long long16 = fixedDateTimeZone4.nextTransition((-698399747L));
        int int18 = fixedDateTimeZone4.getOffset((-43L));
        long long20 = fixedDateTimeZone4.previousTransition(126059713L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-68L) + "'", long11 == (-68L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 31L + "'", long14 == 31L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-698399747L) + "'", long16 == (-698399747L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 126059713L + "'", long20 == 126059713L);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        long long9 = fixedDateTimeZone4.previousTransition((long) '4');
        java.lang.String str10 = fixedDateTimeZone4.toString();
        long long13 = fixedDateTimeZone4.convertLocalToUTC(100L, false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long17 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, (long) ' ');
        long long19 = fixedDateTimeZone4.nextTransition(0L);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.util.Locale locale23 = null;
        java.lang.String str24 = fixedDateTimeZone4.getName((-133L), locale23);
        java.lang.Class<?> wildcardClass25 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("UTC", "+00:10", (int) (byte) 0, 1);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((-349139868L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:10" + "'", str6, "+00:10");
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        java.util.Locale locale8 = null;
        java.lang.String str9 = fixedDateTimeZone4.getName((-349200001L), locale8);
        java.util.Locale locale11 = null;
        java.lang.String str12 = fixedDateTimeZone4.getName((-349200000L), locale11);
        int int14 = fixedDateTimeZone4.getOffset(349200000L);
        int int16 = fixedDateTimeZone4.getStandardOffset((long) 349200000);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
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
        int int26 = fixedDateTimeZone4.getOffset((-698999936L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+97:00" + "'", str21, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+32:10", "+00:35", (int) '#', 0);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long4 = dateTimeZone0.convertLocalToUTC((-349200001L), false, (long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str7 = dateTimeZone5.getShortName((long) (byte) 0);
        long long9 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, 0L);
        long long12 = dateTimeZone0.adjustOffset((long) (byte) 100, false);
        java.lang.String str14 = dateTimeZone0.getName(349200000L);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone0.getOffset(readableInstant15);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-349200101L) + "'", long4 == (-349200101L));
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.100" + "'", str7, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        java.util.TimeZone timeZone6 = fixedDateTimeZone4.toTimeZone();
        long long9 = fixedDateTimeZone4.adjustOffset((long) (short) 0, false);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone14 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str16 = fixedDateTimeZone14.getNameKey((long) 1);
        long long19 = fixedDateTimeZone14.adjustOffset((long) (short) 100, false);
        long long23 = fixedDateTimeZone14.convertLocalToUTC((-349200036L), false, (-48L));
        java.util.TimeZone timeZone24 = fixedDateTimeZone14.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        boolean boolean26 = fixedDateTimeZone4.equals((java.lang.Object) dateTimeZone25);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-349200136L) + "'", long23 == (-349200136L));
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        long long12 = fixedDateTimeZone4.previousTransition(3660001L);
        long long14 = fixedDateTimeZone4.previousTransition(349200099L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3660001L + "'", long12 == 3660001L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 349200099L + "'", long14 == 349200099L);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.convertUTCToLocal((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone10 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str12 = fixedDateTimeZone10.getNameKey((long) 1);
        long long15 = fixedDateTimeZone10.adjustOffset((long) (short) 100, false);
        long long17 = dateTimeZone1.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone10, (long) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition((long) (short) 0);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str13 = fixedDateTimeZone4.getNameKey((-349200100L));
        int int15 = fixedDateTimeZone4.getOffset(349199997L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone20 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long22 = fixedDateTimeZone20.previousTransition((long) ' ');
        long long24 = fixedDateTimeZone20.previousTransition((long) 'a');
        long long26 = fixedDateTimeZone20.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone31 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long33 = fixedDateTimeZone20.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone31, (long) ' ');
        boolean boolean34 = fixedDateTimeZone31.isFixed();
        long long36 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone31, 698399935L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 97L + "'", long24 == 97L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 349200000L + "'", long26 == 349200000L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 35L + "'", long33 == 35L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 698399938L + "'", long36 == 698399938L);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        boolean boolean14 = fixedDateTimeZone4.isStandardOffset(100L);
        long long17 = fixedDateTimeZone4.convertLocalToUTC(100L, false);
        long long20 = fixedDateTimeZone4.adjustOffset(0L, false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        boolean boolean6 = fixedDateTimeZone4.isFixed();
        java.lang.String str7 = fixedDateTimeZone4.getID();
        int int9 = fixedDateTimeZone4.getOffsetFromLocal((-1L));
        long long11 = fixedDateTimeZone4.convertUTCToLocal(0L);
        java.util.TimeZone timeZone12 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+97:00" + "'", str7, "+97:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 100, (int) (byte) 10);
        java.lang.String str6 = fixedDateTimeZone4.getShortName((-349199999L));
        long long9 = fixedDateTimeZone4.adjustOffset(0L, true);
        java.lang.String str11 = fixedDateTimeZone4.getShortName(349199938L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:35", "+35:01", 115800000, 6720000);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
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
        long long46 = fixedDateTimeZone28.convertLocalToUTC((long) 97, true);
        long long49 = fixedDateTimeZone28.adjustOffset((-3L), false);
        java.lang.Class<?> wildcardClass50 = fixedDateTimeZone28.getClass();
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
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-3L) + "'", long46 == (-3L));
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-3L) + "'", long49 == (-3L));
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
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
        java.util.Locale locale33 = null;
        java.lang.String str34 = fixedDateTimeZone4.getName((-59603L), locale33);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-349200001L) + "'", long18 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-349200000L) + "'", long22 == (-349200000L));
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00:00.100" + "'", str31, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00:00.100" + "'", str34, "+00:00:00.100");
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(97L);
        java.lang.String str12 = fixedDateTimeZone4.getNameKey(349200010L);
        boolean boolean13 = fixedDateTimeZone4.isFixed();
        java.lang.String str15 = fixedDateTimeZone4.getShortName((long) '4');
        int int17 = fixedDateTimeZone4.getOffsetFromLocal((-349199999L));
        long long20 = fixedDateTimeZone4.convertLocalToUTC((-101L), false);
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime21);
        boolean boolean23 = fixedDateTimeZone4.isFixed();
        org.joda.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime24);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-201L) + "'", long20 == (-201L));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = fixedDateTimeZone4.getID();
        java.lang.String str9 = fixedDateTimeZone4.getNameKey((long) (short) 10);
        int int11 = fixedDateTimeZone4.getOffsetFromLocal((-101L));
        long long13 = fixedDateTimeZone4.nextTransition(38L);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+97:00" + "'", str7, "+97:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 38L + "'", long13 == 38L);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long15 = fixedDateTimeZone4.convertLocalToUTC(349200010L, true);
        java.util.TimeZone timeZone16 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str18 = fixedDateTimeZone4.getNameKey((-348599865L));
        java.util.TimeZone timeZone19 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone20.getShortName(0L, locale22);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone28 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long30 = fixedDateTimeZone28.previousTransition((long) ' ');
        long long32 = fixedDateTimeZone28.previousTransition((long) 'a');
        long long34 = fixedDateTimeZone28.previousTransition(349200000L);
        org.joda.time.LocalDateTime localDateTime35 = null;
        boolean boolean36 = fixedDateTimeZone28.isLocalDateTimeGap(localDateTime35);
        java.util.TimeZone timeZone37 = fixedDateTimeZone28.toTimeZone();
        int int39 = fixedDateTimeZone28.getStandardOffset(349200132L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone44 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long46 = fixedDateTimeZone44.previousTransition((long) ' ');
        long long48 = fixedDateTimeZone44.previousTransition((long) 'a');
        int int50 = fixedDateTimeZone44.getStandardOffset((long) (short) 0);
        long long53 = fixedDateTimeZone44.convertLocalToUTC((long) 0, true);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone58 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        boolean boolean60 = fixedDateTimeZone58.isStandardOffset((long) '#');
        boolean boolean61 = fixedDateTimeZone44.equals((java.lang.Object) boolean60);
        java.lang.String str63 = fixedDateTimeZone44.getNameKey((-90L));
        long long65 = fixedDateTimeZone28.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone44, 349199834L);
        long long67 = dateTimeZone20.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone28, (-248L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 349199910L + "'", long15 == 349199910L);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+97:00" + "'", str18, "+97:00");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 32L + "'", long30 == 32L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 97L + "'", long32 == 97L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 349200000L + "'", long34 == 349200000L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 32L + "'", long46 == 32L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 97L + "'", long48 == 97L);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-100L) + "'", long53 == (-100L));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "+97:00" + "'", str63, "+97:00");
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 349199834L + "'", long65 == 349199834L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + (-348L) + "'", long67 == (-348L));
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        long long9 = fixedDateTimeZone4.convertLocalToUTC((long) ' ', true, (long) (byte) 1);
        java.lang.String str10 = fixedDateTimeZone4.toString();
        long long13 = fixedDateTimeZone4.adjustOffset(132L, false);
        boolean boolean15 = fixedDateTimeZone4.isStandardOffset((-349199871L));
        org.joda.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime16);
        java.lang.String str19 = fixedDateTimeZone4.getShortName((-59900L));
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-68L) + "'", long9 == (-68L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 132L + "'", long13 == 132L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 349200000);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) 10, true);
        long long15 = fixedDateTimeZone4.previousTransition((long) 115200000);
        long long17 = fixedDateTimeZone4.previousTransition((-9L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-90L) + "'", long13 == (-90L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 115200000L + "'", long15 == 115200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-9L) + "'", long17 == (-9L));
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
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
        long long38 = fixedDateTimeZone27.nextTransition((-349199865L));
        int int40 = fixedDateTimeZone27.getStandardOffset((-349200036L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-349200000L) + "'", long4 == (-349200000L));
        org.junit.Assert.assertNotNull(dateTimeZone5);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-00:00:00.001" + "'", str7, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-00:00:00.001" + "'", str14, "-00:00:00.001");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-349199935L) + "'", long19 == (-349199935L));
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-00:00:00.001" + "'", str22, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 32L + "'", long29 == 32L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 97L + "'", long31 == 97L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+97:00" + "'", str34, "+97:00");
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + 349199934L + "'", long36 == 349199934L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-349199865L) + "'", long38 == (-349199865L));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
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
        java.util.TimeZone timeZone27 = fixedDateTimeZone13.toTimeZone();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+97:00" + "'", str8, "+97:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-101L) + "'", long15 == (-101L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-349199968L) + "'", long22 == (-349199968L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-3L) + "'", long24 == (-3L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.100" + "'", str26, "+00:00:00.100");
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        java.lang.String str9 = fixedDateTimeZone4.getNameKey((-349199901L));
        long long11 = fixedDateTimeZone4.nextTransition((-68L));
        long long14 = fixedDateTimeZone4.adjustOffset(31L, false);
        int int16 = fixedDateTimeZone4.getStandardOffset((-349199969L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-68L) + "'", long11 == (-68L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 31L + "'", long14 == 31L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        boolean boolean14 = fixedDateTimeZone4.isStandardOffset(100L);
        org.joda.time.tz.Provider provider15 = org.joda.time.DateTimeZone.getProvider();
        boolean boolean16 = fixedDateTimeZone4.equals((java.lang.Object) provider15);
        java.lang.String str18 = fixedDateTimeZone4.getName((-349199965L));
        boolean boolean19 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(provider15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.100" + "'", str18, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "+00:00:00.010", 97, (int) 'a');
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
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

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        java.lang.String str9 = fixedDateTimeZone4.getNameKey((-349199901L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone14 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str16 = fixedDateTimeZone14.getNameKey(0L);
        java.util.Locale locale18 = null;
        java.lang.String str19 = fixedDateTimeZone14.getShortName(31L, locale18);
        long long21 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone14, (long) 0);
        boolean boolean22 = fixedDateTimeZone14.isFixed();
        java.util.TimeZone timeZone23 = fixedDateTimeZone14.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone24);
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone24.getName(115800000L, locale27);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00" + "'", str28, "+00:00");
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        java.lang.String str9 = fixedDateTimeZone4.getNameKey((-349199901L));
        long long11 = fixedDateTimeZone4.nextTransition((-68L));
        long long14 = fixedDateTimeZone4.adjustOffset(31L, false);
        long long16 = fixedDateTimeZone4.previousTransition(349200032L);
        java.util.TimeZone timeZone17 = fixedDateTimeZone4.toTimeZone();
        boolean boolean18 = fixedDateTimeZone4.isFixed();
        java.lang.String str20 = fixedDateTimeZone4.getName(0L);
        java.util.Locale locale22 = null;
        java.lang.String str23 = fixedDateTimeZone4.getShortName(698399599L, locale22);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-68L) + "'", long11 == (-68L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 31L + "'", long14 == 31L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 349200032L + "'", long16 == 349200032L);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.100" + "'", str23, "+00:00:00.100");
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
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
        long long31 = fixedDateTimeZone4.convertLocalToUTC((-702059901L), true, 0L);
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
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-702060001L) + "'", long31 == (-702060001L));
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone0.getMillisKeepLocal(dateTimeZone2, (long) ' ');
        long long8 = dateTimeZone0.convertLocalToUTC((long) (short) -1, true, (long) (byte) -1);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone0.getName((long) (byte) -1, locale10);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-349199968L) + "'", long4 == (-349199968L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
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
        long long38 = fixedDateTimeZone14.convertLocalToUTC(300L, false);
        java.lang.String str40 = fixedDateTimeZone14.getName((-100L));
        long long43 = fixedDateTimeZone14.adjustOffset(60L, true);
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
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 200L + "'", long38 == 200L);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00:00.100" + "'", str40, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 60L + "'", long43 == 60L);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.util.TimeZone timeZone9 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
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
        boolean boolean25 = fixedDateTimeZone4.equals((java.lang.Object) (-3600162L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.001");
        long long3 = dateTimeZone1.convertUTCToLocal(3660000L);
        java.lang.Class<?> wildcardClass4 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3660001L + "'", long3 == 3660001L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
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
        long long32 = fixedDateTimeZone15.convertLocalToUTC(698399935L, false, (-352260101L));
        java.lang.String str33 = fixedDateTimeZone15.toString();
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
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 698399838L + "'", long32 == 698399838L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00:00.100" + "'", str33, "+00:00:00.100");
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(349200000, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        int int10 = fixedDateTimeZone4.getStandardOffset((long) (short) 0);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) 0, true);
        java.util.TimeZone timeZone14 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone19 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long21 = fixedDateTimeZone19.previousTransition((long) ' ');
        long long23 = fixedDateTimeZone19.previousTransition((long) 'a');
        long long25 = fixedDateTimeZone19.previousTransition(349200000L);
        int int27 = fixedDateTimeZone19.getOffset((long) '4');
        int int29 = fixedDateTimeZone19.getOffset((long) (short) 100);
        org.joda.time.LocalDateTime localDateTime30 = null;
        boolean boolean31 = fixedDateTimeZone19.isLocalDateTimeGap(localDateTime30);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone19);
        boolean boolean34 = fixedDateTimeZone19.isStandardOffset((-349200290L));
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone19);
        boolean boolean36 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone19);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-100L) + "'", long13 == (-100L));
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 97L + "'", long23 == 97L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 349200000L + "'", long25 == 349200000L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.052", "+00:10", (int) (byte) 0, 32);
        long long8 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) -1, true, (-702059901L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
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
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        java.lang.String str8 = fixedDateTimeZone4.getNameKey(10L);
        long long11 = fixedDateTimeZone4.convertLocalToUTC((-349200001L), true);
        long long13 = fixedDateTimeZone4.previousTransition((-698399848L));
        java.lang.String str15 = fixedDateTimeZone4.getNameKey((-349199966L));
        java.lang.String str16 = fixedDateTimeZone4.toString();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+97:00" + "'", str8, "+97:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349200101L) + "'", long11 == (-349200101L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-698399848L) + "'", long13 == (-698399848L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = fixedDateTimeZone4.getID();
        long long9 = fixedDateTimeZone4.convertUTCToLocal((-349199968L));
        java.lang.String str11 = fixedDateTimeZone4.getName((-694799747L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+97:00" + "'", str7, "+97:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-349199868L) + "'", long9 == (-349199868L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1, (int) '#');
        java.lang.String str4 = dateTimeZone2.getShortName(349200101L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((-349139968L), locale6);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+01:35" + "'", str4, "+01:35");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+01:35" + "'", str7, "+01:35");
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long9 = fixedDateTimeZone4.adjustOffset((long) (short) 100, false);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((-349200036L), false, (-48L));
        long long15 = fixedDateTimeZone4.nextTransition(97L);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = fixedDateTimeZone4.getOffset(readableInstant16);
        int int19 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        long long23 = fixedDateTimeZone4.convertLocalToUTC((long) 10, false, (-90L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone28 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long30 = fixedDateTimeZone28.previousTransition((long) ' ');
        long long32 = fixedDateTimeZone28.previousTransition((long) 'a');
        int int34 = fixedDateTimeZone28.getStandardOffset((long) (short) 0);
        long long37 = fixedDateTimeZone28.convertLocalToUTC((long) 0, true);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone42 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        boolean boolean44 = fixedDateTimeZone42.isStandardOffset((long) '#');
        boolean boolean45 = fixedDateTimeZone28.equals((java.lang.Object) boolean44);
        java.lang.String str47 = fixedDateTimeZone28.getNameKey((-90L));
        boolean boolean48 = fixedDateTimeZone4.equals((java.lang.Object) str47);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-349200136L) + "'", long13 == (-349200136L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-90L) + "'", long23 == (-90L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 32L + "'", long30 == 32L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 97L + "'", long32 == 97L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-100L) + "'", long37 == (-100L));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+97:00" + "'", str47, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 349200000);
        int int12 = fixedDateTimeZone4.getOffsetFromLocal(0L);
        boolean boolean14 = fixedDateTimeZone4.equals((java.lang.Object) (-99L));
        boolean boolean16 = fixedDateTimeZone4.isStandardOffset((-349200065L));
        java.util.Locale locale18 = null;
        java.lang.String str19 = fixedDateTimeZone4.getShortName(1L, locale18);
        int int21 = fixedDateTimeZone4.getStandardOffset(10L);
        long long23 = fixedDateTimeZone4.convertUTCToLocal(0L);
        long long26 = fixedDateTimeZone4.adjustOffset((-200L), true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-200L) + "'", long26 == (-200L));
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
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
        long long29 = dateTimeZone10.convertLocalToUTC((-125999903L), false);
        long long32 = dateTimeZone10.adjustOffset((-827999606L), false);
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
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-475199903L) + "'", long29 == (-475199903L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-827999606L) + "'", long32 == (-827999606L));
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
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
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        java.util.TimeZone timeZone9 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str11 = fixedDateTimeZone4.getNameKey(100L);
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getName(698399932L, locale13);
        int int16 = fixedDateTimeZone4.getOffsetFromLocal((-352860001L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+97:00" + "'", str11, "+97:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        java.lang.String str8 = fixedDateTimeZone4.getNameKey(10L);
        long long11 = fixedDateTimeZone4.convertLocalToUTC((-349200001L), true);
        long long13 = fixedDateTimeZone4.previousTransition((-698399848L));
        java.util.Locale locale15 = null;
        java.lang.String str16 = fixedDateTimeZone4.getShortName((-698999936L), locale15);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+97:00" + "'", str8, "+97:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349200101L) + "'", long11 == (-349200101L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-698399848L) + "'", long13 == (-698399848L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long17 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, (long) ' ');
        boolean boolean18 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
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
        org.joda.time.LocalDateTime localDateTime42 = null;
        boolean boolean43 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime42);
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
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
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
        java.lang.String str24 = fixedDateTimeZone4.getName((-143L));
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
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
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
        org.junit.Assert.assertNotNull(nameProvider0);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        int int12 = fixedDateTimeZone4.getStandardOffset(1L);
        long long16 = fixedDateTimeZone4.convertLocalToUTC((long) '4', false, (long) (short) 1);
        long long18 = fixedDateTimeZone4.nextTransition(0L);
        long long21 = fixedDateTimeZone4.adjustOffset((-99L), true);
        long long23 = fixedDateTimeZone4.nextTransition((-698399748L));
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = fixedDateTimeZone4.getOffset(readableInstant24);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-48L) + "'", long16 == (-48L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-99L) + "'", long21 == (-99L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-698399748L) + "'", long23 == (-698399748L));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        java.lang.String str12 = fixedDateTimeZone4.getNameKey((-349199968L));
        java.lang.String str13 = fixedDateTimeZone4.getID();
        long long16 = fixedDateTimeZone4.adjustOffset(349199910L, true);
        boolean boolean18 = fixedDateTimeZone4.isStandardOffset((long) (byte) -1);
        int int20 = fixedDateTimeZone4.getOffset((long) (byte) 100);
        long long24 = fixedDateTimeZone4.convertLocalToUTC(349199599L, false, (-349200065L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 349199910L + "'", long16 == 349199910L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 349199499L + "'", long24 == 349199499L);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
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
        org.joda.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime26);
        java.util.TimeZone timeZone28 = fixedDateTimeZone4.toTimeZone();
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        int int8 = fixedDateTimeZone4.getOffset(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long15 = fixedDateTimeZone13.previousTransition((long) ' ');
        long long17 = fixedDateTimeZone13.previousTransition((long) 'a');
        long long19 = fixedDateTimeZone13.previousTransition(349200000L);
        long long21 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone13, 35L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone26 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long28 = fixedDateTimeZone26.previousTransition((long) ' ');
        long long30 = fixedDateTimeZone26.previousTransition((long) 'a');
        long long32 = fixedDateTimeZone26.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone37 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long39 = fixedDateTimeZone26.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone37, (long) ' ');
        java.util.Locale locale41 = null;
        java.lang.String str42 = fixedDateTimeZone37.getName((long) 1, locale41);
        boolean boolean43 = fixedDateTimeZone4.equals((java.lang.Object) str42);
        java.lang.String str45 = fixedDateTimeZone4.getName(135L);
        long long48 = fixedDateTimeZone4.adjustOffset((-349199871L), true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 349200000L + "'", long19 == 349200000L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 35L + "'", long21 == 35L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 32L + "'", long28 == 32L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 97L + "'", long30 == 97L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 349200000L + "'", long32 == 349200000L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 35L + "'", long39 == 35L);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00:00.097" + "'", str42, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+00:00:00.100" + "'", str45, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-349199871L) + "'", long48 == (-349199871L));
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "-01:00", 32, 1);
        java.lang.String str6 = fixedDateTimeZone4.getShortName((-106L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.032" + "'", str6, "+00:00:00.032");
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long17 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, (long) ' ');
        boolean boolean18 = fixedDateTimeZone15.isFixed();
        java.lang.String str20 = fixedDateTimeZone15.getShortName((long) (short) 1);
        long long22 = fixedDateTimeZone15.previousTransition((-349200001L));
        long long24 = fixedDateTimeZone15.nextTransition((-349200035L));
        long long28 = fixedDateTimeZone15.convertLocalToUTC((-9L), true, (-698400101L));
        java.lang.String str30 = fixedDateTimeZone15.getNameKey((-698400048L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.097" + "'", str20, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-349200001L) + "'", long22 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-349200035L) + "'", long24 == (-349200035L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-106L) + "'", long28 == (-106L));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        int int8 = fixedDateTimeZone4.getStandardOffset((long) (-1));
        int int10 = fixedDateTimeZone4.getStandardOffset((long) 97);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.lang.String str12 = fixedDateTimeZone4.getID();
        java.lang.String str13 = fixedDateTimeZone4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
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
        java.util.TimeZone timeZone24 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+97:00" + "'", str7, "+97:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-133L) + "'", long23 == (-133L));
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        java.lang.String str9 = fixedDateTimeZone4.getNameKey((-349199901L));
        boolean boolean10 = fixedDateTimeZone4.isFixed();
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
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
        long long23 = fixedDateTimeZone6.convertUTCToLocal(32L);
        long long25 = fixedDateTimeZone6.previousTransition((-698399844L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-99L) + "'", long17 == (-99L));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-41L) + "'", long21 == (-41L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 132L + "'", long23 == 132L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-698399844L) + "'", long25 == (-698399844L));
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.util.TimeZone timeZone12 = fixedDateTimeZone4.toTimeZone();
        long long16 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) 100, false, 32L);
        int int18 = fixedDateTimeZone4.getOffset(349200099L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "hi!", 349200000, 10);
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        java.util.Locale locale7 = null;
        java.lang.String str8 = fixedDateTimeZone4.getName((long) 60000, locale7);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+97:00" + "'", str8, "+97:00");
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (int) (byte) 1);
        long long4 = dateTimeZone2.convertUTCToLocal(349199910L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getName((long) 60000, locale6);
        java.lang.String str8 = dateTimeZone2.getID();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone2.getShortName((-68L), locale10);
        java.lang.Class<?> wildcardClass12 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 475259910L + "'", long4 == 475259910L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+35:01" + "'", str7, "+35:01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+35:01" + "'", str8, "+35:01");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+35:01" + "'", str11, "+35:01");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
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
        java.lang.String str32 = fixedDateTimeZone14.getID();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone14);
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+97:00" + "'", str32, "+97:00");
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long9 = fixedDateTimeZone4.adjustOffset((long) (short) 100, false);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((-349200036L), false, (-48L));
        long long15 = fixedDateTimeZone4.nextTransition(97L);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = fixedDateTimeZone4.getOffset(readableInstant16);
        int int19 = fixedDateTimeZone4.getOffsetFromLocal((long) (short) 10);
        long long22 = fixedDateTimeZone4.convertLocalToUTC((-1047599936L), true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-349200136L) + "'", long13 == (-349200136L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1047600036L) + "'", long22 == (-1047600036L));
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
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
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone0.getName((-59900L), locale24);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 10);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone32 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long34 = fixedDateTimeZone32.previousTransition((long) ' ');
        long long36 = fixedDateTimeZone32.previousTransition((long) 'a');
        int int38 = fixedDateTimeZone32.getStandardOffset((long) (short) 0);
        int int40 = fixedDateTimeZone32.getStandardOffset((long) (byte) 10);
        long long43 = fixedDateTimeZone32.convertLocalToUTC((long) 1, true);
        org.joda.time.ReadableInstant readableInstant44 = null;
        int int45 = fixedDateTimeZone32.getOffset(readableInstant44);
        long long47 = dateTimeZone27.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone32, 49L);
        long long49 = dateTimeZone0.getMillisKeepLocal(dateTimeZone27, (-99L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone55 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long57 = fixedDateTimeZone55.nextTransition((-101L));
        long long60 = fixedDateTimeZone55.adjustOffset(349200010L, false);
        boolean boolean61 = fixedDateTimeZone55.isFixed();
        long long63 = dateTimeZone0.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone55, 235L);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.100" + "'", str25, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 32L + "'", long34 == 32L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 97L + "'", long36 == 97L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-99L) + "'", long43 == (-99L));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-41L) + "'", long47 == (-41L));
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-9L) + "'", long49 == (-9L));
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-101L) + "'", long57 == (-101L));
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 349200010L + "'", long60 == 349200010L);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 235L + "'", long63 == 235L);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(97L);
        int int12 = fixedDateTimeZone4.getOffset((long) 349200000);
        java.util.Locale locale14 = null;
        java.lang.String str15 = fixedDateTimeZone4.getName((long) (byte) 0, locale14);
        java.lang.String str17 = fixedDateTimeZone4.getName((long) 349200000);
        int int19 = fixedDateTimeZone4.getOffsetFromLocal((-200L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
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
        boolean boolean31 = fixedDateTimeZone4.isFixed();
        boolean boolean32 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-349199901L) + "'", long22 == (-349199901L));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-100L) + "'", long28 == (-100L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 52L + "'", long30 == 52L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
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
        boolean boolean29 = fixedDateTimeZone4.isFixed();
        java.util.Locale locale31 = null;
        java.lang.String str32 = fixedDateTimeZone4.getShortName((-349140197L), locale31);
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.100" + "'", str32, "+00:00:00.100");
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 100, (int) (byte) 10);
        java.lang.String str6 = fixedDateTimeZone4.getShortName((-349199999L));
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        java.lang.String str9 = fixedDateTimeZone4.getNameKey((-698400101L));
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.convertUTCToLocal((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        long long10 = dateTimeZone1.adjustOffset((-349200100L), true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-349200100L) + "'", long10 == (-349200100L));
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "+97:00", 0, 6720000);
        java.lang.Class<?> wildcardClass5 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
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
        java.lang.String str27 = fixedDateTimeZone4.getName(100L);
        int int29 = fixedDateTimeZone4.getStandardOffset(0L);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.100" + "'", str27, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (short) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
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
        java.lang.String str38 = fixedDateTimeZone4.getNameKey((-698399936L));
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+97:00" + "'", str38, "+97:00");
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition((long) (short) 0);
        int int12 = fixedDateTimeZone4.getOffsetFromLocal((long) (byte) 0);
        boolean boolean14 = fixedDateTimeZone4.isStandardOffset((-349199936L));
        java.util.TimeZone timeZone15 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "+00:00:00.100", 10, (int) (byte) 10);
        int int6 = fixedDateTimeZone4.getOffset((long) (byte) -1);
        int int8 = fixedDateTimeZone4.getOffsetFromLocal(0L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = fixedDateTimeZone4.getOffset(readableInstant9);
        java.lang.String str12 = fixedDateTimeZone4.getName(349200101L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.010" + "'", str12, "+00:00:00.010");
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = fixedDateTimeZone4.getID();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone12 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long14 = fixedDateTimeZone12.previousTransition((long) ' ');
        java.lang.String str15 = fixedDateTimeZone12.getID();
        java.lang.String str17 = fixedDateTimeZone12.getNameKey((long) (short) 10);
        int int19 = fixedDateTimeZone12.getOffsetFromLocal((-101L));
        long long21 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone12, 32L);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long26 = dateTimeZone22.getMillisKeepLocal(dateTimeZone24, (long) ' ');
        java.lang.String str27 = dateTimeZone24.toString();
        boolean boolean28 = fixedDateTimeZone12.equals((java.lang.Object) str27);
        java.lang.String str30 = fixedDateTimeZone12.getNameKey(349199910L);
        java.lang.String str31 = fixedDateTimeZone12.toString();
        boolean boolean33 = fixedDateTimeZone12.isStandardOffset((-698400200L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+97:00" + "'", str7, "+97:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-349199868L) + "'", long26 == (-349199868L));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+97:00" + "'", str27, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+97:00" + "'", str30, "+97:00");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+97:00" + "'", str31, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.nextTransition((long) 10);
        int int8 = fixedDateTimeZone4.getStandardOffset((-90L));
        int int10 = fixedDateTimeZone4.getStandardOffset(0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((long) 349200000);
        long long14 = fixedDateTimeZone4.convertLocalToUTC((-349199965L), false, 200L);
        java.lang.Class<?> wildcardClass15 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-349200065L) + "'", long14 == (-349200065L));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "+10:35", 0, (int) '#');
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        long long8 = fixedDateTimeZone4.convertLocalToUTC(349200000L, true);
        java.util.Locale locale10 = null;
        java.lang.String str11 = fixedDateTimeZone4.getShortName((-349199948L), locale10);
        java.lang.String str13 = fixedDateTimeZone4.getNameKey((long) 115200000);
        int int15 = fixedDateTimeZone4.getOffsetFromLocal((-349200165L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 349200000L + "'", long8 == 349200000L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+10:35" + "'", str13, "+10:35");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
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
        org.joda.time.LocalDateTime localDateTime30 = null;
        boolean boolean31 = dateTimeZone10.isLocalDateTimeGap(localDateTime30);
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
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
        int int40 = fixedDateTimeZone15.getOffset(94L);
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
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
        long long55 = fixedDateTimeZone4.nextTransition((-349199865L));
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32L + "'", long27 == 32L);
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
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-349199865L) + "'", long55 == (-349199865L));
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        int int10 = fixedDateTimeZone4.getStandardOffset((long) (short) 0);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) 0, true);
        int int15 = fixedDateTimeZone4.getOffset((-349199999L));
        boolean boolean16 = fixedDateTimeZone4.isFixed();
        java.lang.String str17 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-100L) + "'", long13 == (-100L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.util.TimeZone timeZone12 = fixedDateTimeZone4.toTimeZone();
        long long16 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) 100, false, 32L);
        int int18 = fixedDateTimeZone4.getOffsetFromLocal((-133L));
        int int20 = fixedDateTimeZone4.getStandardOffset((-162L));
        java.lang.String str21 = fixedDateTimeZone4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+97:00" + "'", str21, "+97:00");
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        java.util.Locale locale8 = null;
        java.lang.String str9 = fixedDateTimeZone4.getName((-349200001L), locale8);
        java.util.TimeZone timeZone10 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.lang.String str16 = dateTimeZone14.getName((-349199948L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        boolean boolean14 = fixedDateTimeZone4.isStandardOffset(100L);
        int int16 = fixedDateTimeZone4.getOffsetFromLocal((long) 100);
        long long18 = fixedDateTimeZone4.nextTransition((-349200090L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-349200090L) + "'", long18 == (-349200090L));
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
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
        long long33 = fixedDateTimeZone11.convertLocalToUTC((-349200036L), false);
        boolean boolean35 = fixedDateTimeZone11.isStandardOffset((-349199967L));
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
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-349200136L) + "'", long33 == (-349200136L));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:35");
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '#', (int) (byte) 1);
        java.lang.String str3 = dateTimeZone2.getID();
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone2.isLocalDateTimeGap(localDateTime4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone2.getShortName((-268L), locale7);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+35:01" + "'", str3, "+35:01");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+35:01" + "'", str8, "+35:01");
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime11);
        java.util.TimeZone timeZone13 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        long long17 = dateTimeZone15.convertUTCToLocal((long) (short) -1);
        java.lang.String str18 = dateTimeZone15.toString();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 35);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 100, (int) (byte) 10);
        java.lang.String str5 = fixedDateTimeZone4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
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
        java.util.TimeZone timeZone47 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forTimeZone(timeZone47);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forTimeZone(timeZone47);
        java.util.Locale locale51 = null;
        java.lang.String str52 = dateTimeZone49.getShortName(41L, locale51);
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
        org.junit.Assert.assertNotNull(timeZone47);
        org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "+00:00" + "'", str52, "+00:00");
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str1 = dateTimeZone0.getID();
        java.lang.String str3 = dateTimeZone0.getShortName((-349199868L));
        boolean boolean5 = dateTimeZone0.isStandardOffset((-698399844L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "+97:00" + "'", str1, "+97:00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.100" + "'", str3, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
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
        int int32 = fixedDateTimeZone15.getOffsetFromLocal((-698399748L));
        long long34 = fixedDateTimeZone15.nextTransition((-694799747L));
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-694799747L) + "'", long34 == (-694799747L));
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.nextTransition((long) 10);
        int int8 = fixedDateTimeZone4.getStandardOffset((-90L));
        long long11 = fixedDateTimeZone4.convertLocalToUTC((long) '#', false);
        boolean boolean13 = fixedDateTimeZone4.isStandardOffset((-349200090L));
        int int15 = fixedDateTimeZone4.getOffsetFromLocal(60000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-65L) + "'", long11 == (-65L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getName((long) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone0.getOffset(readableInstant3);
        long long6 = dateTimeZone0.convertUTCToLocal((-349200001L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone11 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long13 = fixedDateTimeZone11.previousTransition((long) ' ');
        long long15 = fixedDateTimeZone11.previousTransition((long) 'a');
        long long17 = fixedDateTimeZone11.previousTransition(349200000L);
        java.lang.String str19 = fixedDateTimeZone11.getNameKey((-349199968L));
        java.lang.String str20 = fixedDateTimeZone11.getID();
        int int22 = fixedDateTimeZone11.getOffsetFromLocal((-349200101L));
        int int24 = fixedDateTimeZone11.getOffsetFromLocal((-68L));
        java.lang.String str26 = fixedDateTimeZone11.getName((-349200099L));
        boolean boolean28 = fixedDateTimeZone11.isStandardOffset((-349200201L));
        long long31 = fixedDateTimeZone11.adjustOffset((-349200101L), true);
        org.joda.time.ReadableInstant readableInstant32 = null;
        int int33 = fixedDateTimeZone11.getOffset(readableInstant32);
        long long35 = dateTimeZone0.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone11, (-352260101L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-349199901L) + "'", long6 == (-349199901L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 349200000L + "'", long17 == 349200000L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+97:00" + "'", str19, "+97:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+97:00" + "'", str20, "+97:00");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.100" + "'", str26, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-349200101L) + "'", long31 == (-349200101L));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-352260101L) + "'", long35 == (-352260101L));
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        boolean boolean6 = fixedDateTimeZone4.isFixed();
        java.lang.String str7 = fixedDateTimeZone4.getID();
        int int9 = fixedDateTimeZone4.getOffsetFromLocal((-1L));
        long long13 = fixedDateTimeZone4.convertLocalToUTC((-349200236L), false, (-133L));
        int int15 = fixedDateTimeZone4.getStandardOffset((-349200001L));
        org.joda.time.LocalDateTime localDateTime16 = null;
        boolean boolean17 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime16);
        int int19 = fixedDateTimeZone4.getOffsetFromLocal(126059910L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+97:00" + "'", str7, "+97:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-349200333L) + "'", long13 == (-349200333L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 349200000 + "'", int15 == 349200000);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.nextTransition((-101L));
        int int8 = fixedDateTimeZone4.getStandardOffset((long) (byte) -1);
        java.util.Locale locale10 = null;
        java.lang.String str11 = fixedDateTimeZone4.getShortName((-698400001L), locale10);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone16 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long18 = fixedDateTimeZone16.previousTransition((long) ' ');
        long long20 = fixedDateTimeZone16.previousTransition((long) 'a');
        long long22 = fixedDateTimeZone16.previousTransition(349200000L);
        java.lang.String str24 = fixedDateTimeZone16.getNameKey((-349199968L));
        java.lang.String str25 = fixedDateTimeZone16.getID();
        boolean boolean26 = fixedDateTimeZone16.isFixed();
        long long28 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone16, 31L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-101L) + "'", long6 == (-101L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 349200000L + "'", long22 == 349200000L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+97:00" + "'", str24, "+97:00");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+97:00" + "'", str25, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 31L + "'", long28 == 31L);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00", "+00:00:00.032", (int) (short) -1, (int) (short) 10);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.lang.String str6 = fixedDateTimeZone4.getID();
        java.lang.String str8 = fixedDateTimeZone4.getNameKey((-349200101L));
        long long10 = fixedDateTimeZone4.convertUTCToLocal(0L);
        java.util.Locale locale12 = null;
        java.lang.String str13 = fixedDateTimeZone4.getShortName(349200034L, locale12);
        long long15 = fixedDateTimeZone4.previousTransition((-43L));
        java.lang.String str17 = fixedDateTimeZone4.getNameKey(0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.032" + "'", str8, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-00:00:00.001" + "'", str13, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-43L) + "'", long15 == (-43L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.032" + "'", str17, "+00:00:00.032");
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        boolean boolean6 = fixedDateTimeZone4.isFixed();
        java.lang.String str7 = fixedDateTimeZone4.getID();
        int int9 = fixedDateTimeZone4.getOffsetFromLocal((-1L));
        long long13 = fixedDateTimeZone4.convertLocalToUTC((-349200236L), false, (-133L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone18 = new org.joda.time.tz.FixedDateTimeZone("", "hi!", 349200000, 10);
        boolean boolean19 = fixedDateTimeZone18.isFixed();
        long long21 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone18, 300L);
        org.joda.time.ReadableInstant readableInstant22 = null;
        int int23 = fixedDateTimeZone18.getOffset(readableInstant22);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+97:00" + "'", str7, "+97:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-349200333L) + "'", long13 == (-349200333L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-349199603L) + "'", long21 == (-349199603L));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 349200000 + "'", int23 == 349200000);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 100, (int) (byte) 10);
        java.lang.String str6 = fixedDateTimeZone4.getShortName((-349199999L));
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        long long11 = fixedDateTimeZone4.convertLocalToUTC((-349199948L), false, 115800100L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349200048L) + "'", long11 == (-349200048L));
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone0.getMillisKeepLocal(dateTimeZone2, (long) ' ');
        long long7 = dateTimeZone2.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long11 = dateTimeZone2.convertLocalToUTC((long) (byte) 0, false);
        java.lang.String str12 = dateTimeZone2.toString();
        java.lang.String str14 = dateTimeZone2.getName((-698400001L));
        boolean boolean16 = dateTimeZone2.isStandardOffset(10L);
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = dateTimeZone2.getOffset(readableInstant17);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-349199969L) + "'", long4 == (-349199969L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349200001L) + "'", long7 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349200000L) + "'", long11 == (-349200000L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+97:00" + "'", str14, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 349200000 + "'", int18 == 349200000);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(97L);
        java.lang.String str12 = fixedDateTimeZone4.getNameKey(349200010L);
        boolean boolean13 = fixedDateTimeZone4.isFixed();
        java.lang.String str15 = fixedDateTimeZone4.getName((long) 'a');
        int int17 = fixedDateTimeZone4.getOffsetFromLocal((-349199935L));
        long long19 = fixedDateTimeZone4.previousTransition(475259910L);
        java.util.TimeZone timeZone20 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 475259910L + "'", long19 == 475259910L);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        int int14 = fixedDateTimeZone4.getOffset((long) (short) 100);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime15);
        java.lang.String str18 = fixedDateTimeZone4.getName((-698399900L));
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = fixedDateTimeZone4.getOffset(readableInstant19);
        long long23 = fixedDateTimeZone4.adjustOffset(132L, false);
        long long25 = fixedDateTimeZone4.previousTransition((-349200036L));
        org.joda.time.ReadableInstant readableInstant26 = null;
        int int27 = fixedDateTimeZone4.getOffset(readableInstant26);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.100" + "'", str18, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 132L + "'", long23 == 132L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-349200036L) + "'", long25 == (-349200036L));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+32:00", "-00:00:00.001", (int) (byte) 10, 97);
        int int6 = fixedDateTimeZone4.getOffset((-349200067L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
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
        long long28 = fixedDateTimeZone15.previousTransition((-349200390L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+97:00" + "'", str21, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-349200390L) + "'", long28 == (-349200390L));
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
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
        long long41 = fixedDateTimeZone4.convertLocalToUTC(698400099L, true, (long) 0);
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
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 698399999L + "'", long41 == 698399999L);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
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
        java.lang.String str42 = fixedDateTimeZone28.getName((-349199936L));
        int int44 = fixedDateTimeZone28.getStandardOffset((-3599900L));
        java.lang.String str46 = fixedDateTimeZone28.getShortName((-349200090L));
        long long49 = fixedDateTimeZone28.convertLocalToUTC(349199767L, false);
        java.lang.String str51 = fixedDateTimeZone28.getName(0L);
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
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00:00.100" + "'", str42, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00:00.100" + "'", str46, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 349199667L + "'", long49 == 349199667L);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "+00:00:00.100" + "'", str51, "+00:00:00.100");
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
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
        int int30 = fixedDateTimeZone4.getOffset((-698400099L));
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
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
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
        long long50 = fixedDateTimeZone28.nextTransition(698400099L);
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+00:00:00.100" + "'", str43, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-349200000L) + "'", long46 == (-349200000L));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 698400099L + "'", long50 == 698400099L);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.nextTransition((-101L));
        java.lang.String str8 = fixedDateTimeZone4.getNameKey((long) (short) 0);
        long long10 = fixedDateTimeZone4.convertUTCToLocal(32L);
        int int12 = fixedDateTimeZone4.getOffset((-698399748L));
        long long14 = fixedDateTimeZone4.nextTransition(4199999L);
        java.lang.String str15 = fixedDateTimeZone4.getID();
        boolean boolean16 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-101L) + "'", long6 == (-101L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+97:00" + "'", str8, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 132L + "'", long10 == 132L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 4199999L + "'", long14 == 4199999L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long9 = fixedDateTimeZone4.adjustOffset((long) (short) 100, false);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((-349200036L), false, (-48L));
        long long15 = fixedDateTimeZone4.nextTransition(97L);
        java.lang.String str17 = fixedDateTimeZone4.getNameKey(0L);
        boolean boolean18 = fixedDateTimeZone4.isFixed();
        java.lang.String str20 = fixedDateTimeZone4.getNameKey((long) 115800000);
        int int22 = fixedDateTimeZone4.getStandardOffset(10859910L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-349200136L) + "'", long13 == (-349200136L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+97:00" + "'", str20, "+97:00");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
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
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, 1);
        java.lang.String str3 = dateTimeZone2.getID();
        long long6 = dateTimeZone2.convertLocalToUTC((-349199990L), false);
        long long9 = dateTimeZone2.convertLocalToUTC((long) '#', true);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone2.isLocalDateTimeGap(localDateTime10);
        java.lang.String str12 = dateTimeZone2.getID();
        java.lang.String str14 = dateTimeZone2.getShortName(4199799L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:01" + "'", str3, "+00:01");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-349259990L) + "'", long6 == (-349259990L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-59965L) + "'", long9 == (-59965L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:01" + "'", str12, "+00:01");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:01" + "'", str14, "+00:01");
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
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
        java.util.TimeZone timeZone24 = fixedDateTimeZone15.toTimeZone();
        org.joda.time.LocalDateTime localDateTime25 = null;
        boolean boolean26 = fixedDateTimeZone15.isLocalDateTimeGap(localDateTime25);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone31 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str33 = fixedDateTimeZone31.getNameKey((long) 1);
        int int35 = fixedDateTimeZone31.getOffset(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone40 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long42 = fixedDateTimeZone40.previousTransition((long) ' ');
        long long44 = fixedDateTimeZone40.previousTransition((long) 'a');
        long long46 = fixedDateTimeZone40.previousTransition(349200000L);
        long long48 = fixedDateTimeZone31.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone40, 35L);
        long long50 = fixedDateTimeZone15.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone31, 0L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone55 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str57 = fixedDateTimeZone55.getNameKey((long) 1);
        java.util.Locale locale59 = null;
        java.lang.String str60 = fixedDateTimeZone55.getName((-349200001L), locale59);
        java.util.TimeZone timeZone61 = fixedDateTimeZone55.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forTimeZone(timeZone61);
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forTimeZone(timeZone61);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone63);
        long long67 = dateTimeZone63.convertLocalToUTC((-349200401L), true);
        boolean boolean68 = fixedDateTimeZone15.equals((java.lang.Object) (-349200401L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-349200096L) + "'", long21 == (-349200096L));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+97:00" + "'", str33, "+97:00");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 32L + "'", long42 == 32L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 97L + "'", long44 == 97L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 349200000L + "'", long46 == 349200000L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 35L + "'", long48 == 35L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-3L) + "'", long50 == (-3L));
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "+97:00" + "'", str57, "+97:00");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "+00:00:00.100" + "'", str60, "+00:00:00.100");
        org.junit.Assert.assertNotNull(timeZone61);
        org.junit.Assert.assertEquals(timeZone61.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone62);
        org.junit.Assert.assertNotNull(dateTimeZone63);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + (-349200401L) + "'", long67 == (-349200401L));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+10:00", "UTC", 97, 0);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
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
        long long54 = fixedDateTimeZone4.convertLocalToUTC((-698400100L), true);
        long long56 = fixedDateTimeZone4.previousTransition(135L);
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
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-698400200L) + "'", long54 == (-698400200L));
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 135L + "'", long56 == 135L);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+01:00", (int) (short) -1, 0);
        long long6 = fixedDateTimeZone4.previousTransition((-64L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-64L) + "'", long6 == (-64L));
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone6 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long8 = fixedDateTimeZone6.nextTransition((-101L));
        int int10 = fixedDateTimeZone6.getStandardOffset((long) (byte) -1);
        long long12 = dateTimeZone1.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone6, (-349200001L));
        java.lang.String str14 = dateTimeZone1.getShortName((-349139900L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-101L) + "'", long8 == (-101L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349200101L) + "'", long12 == (-349200101L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, 1);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        long long6 = dateTimeZone2.convertUTCToLocal((-164L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 59836L + "'", long6 == 59836L);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(0L);
        java.lang.String str7 = fixedDateTimeZone4.getID();
        java.lang.String str9 = fixedDateTimeZone4.getShortName(4199799L);
        java.lang.String str11 = fixedDateTimeZone4.getName((-125999903L));
        boolean boolean13 = fixedDateTimeZone4.isStandardOffset((-126599900L));
        java.lang.Class<?> wildcardClass14 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+97:00" + "'", str7, "+97:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
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
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone31 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str33 = fixedDateTimeZone31.getNameKey((long) 1);
        int int35 = fixedDateTimeZone31.getOffset(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone40 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long42 = fixedDateTimeZone40.previousTransition((long) ' ');
        long long44 = fixedDateTimeZone40.previousTransition((long) 'a');
        long long46 = fixedDateTimeZone40.previousTransition(349200000L);
        long long48 = fixedDateTimeZone31.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone40, 35L);
        long long50 = fixedDateTimeZone40.previousTransition((-349200001L));
        int int52 = fixedDateTimeZone40.getOffset(100L);
        java.lang.String str54 = fixedDateTimeZone40.getName((long) 349200000);
        java.lang.String str55 = fixedDateTimeZone40.getID();
        int int57 = fixedDateTimeZone40.getOffset((-349199871L));
        boolean boolean58 = fixedDateTimeZone13.equals((java.lang.Object) (-349199871L));
        java.util.TimeZone timeZone59 = fixedDateTimeZone13.toTimeZone();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+97:00" + "'", str8, "+97:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-101L) + "'", long15 == (-101L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-349199968L) + "'", long22 == (-349199968L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-3L) + "'", long24 == (-3L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.100" + "'", str26, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+97:00" + "'", str33, "+97:00");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 32L + "'", long42 == 32L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 97L + "'", long44 == 97L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 349200000L + "'", long46 == 349200000L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 35L + "'", long48 == 35L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-349200001L) + "'", long50 == (-349200001L));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "+00:00:00.100" + "'", str54, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "+97:00" + "'", str55, "+97:00");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 100 + "'", int57 == 100);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(timeZone59);
        org.junit.Assert.assertEquals(timeZone59.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long9 = fixedDateTimeZone4.adjustOffset((long) (short) 100, false);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((-349200036L), false, (-48L));
        long long15 = fixedDateTimeZone4.nextTransition(97L);
        java.lang.String str17 = fixedDateTimeZone4.getNameKey(0L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone22 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        java.lang.String str24 = fixedDateTimeZone22.getName((-60001L));
        long long26 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone22, (-349199969L));
        java.lang.String str28 = fixedDateTimeZone4.getShortName(349199997L);
        java.lang.String str30 = fixedDateTimeZone4.getNameKey((-33L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-349200136L) + "'", long13 == (-349200136L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.097" + "'", str24, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-349199966L) + "'", long26 == (-349199966L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.100" + "'", str28, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+97:00" + "'", str30, "+97:00");
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "+00:35", (int) (byte) 10, (-1));
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(115800000, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        long long5 = dateTimeZone1.convertLocalToUTC(349200133L, true, (-349199603L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 313200133L + "'", long5 == 313200133L);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "hi!", 349200000, 10);
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        java.lang.Class<?> wildcardClass6 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 100, (int) (byte) 10);
        int int6 = fixedDateTimeZone4.getOffsetFromLocal((long) (byte) 1);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = fixedDateTimeZone4.getOffset(readableInstant7);
        long long11 = fixedDateTimeZone4.adjustOffset(0L, false);
        boolean boolean12 = fixedDateTimeZone4.isFixed();
        java.lang.String str14 = fixedDateTimeZone4.getShortName((-349200096L));
        boolean boolean16 = fixedDateTimeZone4.isStandardOffset((-168L));
        java.util.TimeZone timeZone17 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime18);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getShortName(0L, locale13);
        java.lang.String str16 = fixedDateTimeZone4.getNameKey((-101L));
        java.lang.String str18 = fixedDateTimeZone4.getNameKey((long) (short) 100);
        long long21 = fixedDateTimeZone4.adjustOffset(349199670L, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+97:00" + "'", str18, "+97:00");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 349199670L + "'", long21 == 349199670L);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 100, (int) (byte) 10);
        int int6 = fixedDateTimeZone4.getOffsetFromLocal((long) (byte) 1);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = fixedDateTimeZone4.getOffset(readableInstant7);
        long long11 = fixedDateTimeZone4.adjustOffset(0L, false);
        boolean boolean12 = fixedDateTimeZone4.isFixed();
        int int14 = fixedDateTimeZone4.getOffset((-698399999L));
        java.util.Locale locale16 = null;
        java.lang.String str17 = fixedDateTimeZone4.getName((-348600068L), locale16);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone22 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long24 = fixedDateTimeZone22.previousTransition((long) ' ');
        long long26 = fixedDateTimeZone22.previousTransition((long) 'a');
        java.lang.String str28 = fixedDateTimeZone22.getNameKey((long) 349200000);
        int int30 = fixedDateTimeZone22.getOffsetFromLocal(0L);
        boolean boolean32 = fixedDateTimeZone22.equals((java.lang.Object) (-99L));
        long long36 = fixedDateTimeZone22.convertLocalToUTC(0L, true, (long) 349200000);
        boolean boolean37 = fixedDateTimeZone22.isFixed();
        boolean boolean38 = fixedDateTimeZone4.equals((java.lang.Object) boolean37);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 32L + "'", long24 == 32L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 97L + "'", long26 == 97L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+97:00" + "'", str28, "+97:00");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-100L) + "'", long36 == (-100L));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:32", "+35:52", (int) 'a', 6720000);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone0.getMillisKeepLocal(dateTimeZone2, (long) ' ');
        long long7 = dateTimeZone2.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long11 = dateTimeZone2.convertLocalToUTC((long) (byte) 0, false);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long15 = dateTimeZone2.getMillisKeepLocal(dateTimeZone13, (long) 1);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone13.getOffset(readableInstant16);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-349199868L) + "'", long4 == (-349199868L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349200001L) + "'", long7 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349200000L) + "'", long11 == (-349200000L));
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 349200000 + "'", int17 == 349200000);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale2 = null;
        java.lang.String str3 = dateTimeZone0.getName((long) (short) 100, locale2);
        java.lang.String str5 = dateTimeZone0.getShortName(0L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone0.getShortName((-349200236L), locale8);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone14 = new org.joda.time.tz.FixedDateTimeZone("+00:01", "+00:00:00.100", 0, 100);
        java.lang.String str16 = fixedDateTimeZone14.getNameKey((-100L));
        int int18 = fixedDateTimeZone14.getOffsetFromLocal((-99L));
        boolean boolean20 = fixedDateTimeZone14.isStandardOffset((-59803L));
        long long22 = dateTimeZone0.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone14, (-698399948L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-698399948L) + "'", long22 == (-698399948L));
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
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
        int int33 = fixedDateTimeZone4.getOffset((-41L));
        long long35 = fixedDateTimeZone4.nextTransition((-349200000L));
        long long38 = fixedDateTimeZone4.adjustOffset((-349200068L), false);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-349200000L) + "'", long35 == (-349200000L));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-349200068L) + "'", long38 == (-349200068L));
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        long long9 = fixedDateTimeZone4.convertLocalToUTC((long) ' ', true, (long) (byte) 1);
        java.util.Locale locale11 = null;
        java.lang.String str12 = fixedDateTimeZone4.getShortName((long) (byte) 10, locale11);
        long long14 = fixedDateTimeZone4.previousTransition(698399932L);
        int int16 = fixedDateTimeZone4.getOffsetFromLocal((long) (-1));
        java.util.TimeZone timeZone17 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-68L) + "'", long9 == (-68L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 698399932L + "'", long14 == 698399932L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
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
        int int27 = fixedDateTimeZone17.getStandardOffset(349199910L);
        long long30 = fixedDateTimeZone17.convertLocalToUTC((-349199948L), true);
        boolean boolean32 = fixedDateTimeZone17.isStandardOffset((long) (byte) -1);
        long long36 = fixedDateTimeZone17.convertLocalToUTC((long) 97, false, 4199999L);
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
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-349200048L) + "'", long30 == (-349200048L));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-3L) + "'", long36 == (-3L));
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getShortName((long) (byte) 10);
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, false, (-349800139L));
        long long12 = fixedDateTimeZone4.nextTransition(313200133L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 313200133L + "'", long12 == 313200133L);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.nextTransition((-101L));
        int int8 = fixedDateTimeZone4.getStandardOffset((long) (byte) -1);
        java.util.Locale locale10 = null;
        java.lang.String str11 = fixedDateTimeZone4.getShortName((-698400001L), locale10);
        int int13 = fixedDateTimeZone4.getStandardOffset((-702060001L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-101L) + "'", long6 == (-101L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        int int8 = fixedDateTimeZone4.getOffset(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long15 = fixedDateTimeZone13.previousTransition((long) ' ');
        long long17 = fixedDateTimeZone13.previousTransition((long) 'a');
        long long19 = fixedDateTimeZone13.previousTransition(349200000L);
        long long21 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone13, 35L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone26 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long28 = fixedDateTimeZone26.previousTransition((long) ' ');
        long long30 = fixedDateTimeZone26.previousTransition((long) 'a');
        long long32 = fixedDateTimeZone26.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone37 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long39 = fixedDateTimeZone26.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone37, (long) ' ');
        java.util.Locale locale41 = null;
        java.lang.String str42 = fixedDateTimeZone37.getName((long) 1, locale41);
        boolean boolean43 = fixedDateTimeZone4.equals((java.lang.Object) str42);
        java.lang.String str45 = fixedDateTimeZone4.getName(135L);
        int int47 = fixedDateTimeZone4.getOffset((-115199868L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 349200000L + "'", long19 == 349200000L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 35L + "'", long21 == 35L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 32L + "'", long28 == 32L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 97L + "'", long30 == 97L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 349200000L + "'", long32 == 349200000L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 35L + "'", long39 == 35L);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00:00.097" + "'", str42, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+00:00:00.100" + "'", str45, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone0.getOffset(readableInstant3);
        long long6 = dateTimeZone0.convertUTCToLocal(52L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition((long) (short) 0);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        java.lang.String str15 = dateTimeZone14.getID();
        long long17 = dateTimeZone12.getMillisKeepLocal(dateTimeZone14, 0L);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone12.getName((-349200100L), locale19);
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = dateTimeZone12.isLocalDateTimeGap(localDateTime21);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
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
        java.util.Locale locale26 = null;
        java.lang.String str27 = fixedDateTimeZone4.getShortName((-698400101L), locale26);
        java.util.Locale locale29 = null;
        java.lang.String str30 = fixedDateTimeZone4.getName(3660001L, locale29);
        java.util.Locale locale32 = null;
        java.lang.String str33 = fixedDateTimeZone4.getName((-1051259998L), locale32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+97:00" + "'", str8, "+97:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-101L) + "'", long15 == (-101L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-349199968L) + "'", long22 == (-349199968L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-3L) + "'", long24 == (-3L));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.097" + "'", str27, "+00:00:00.097");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.097" + "'", str30, "+00:00:00.097");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00:00.097" + "'", str33, "+00:00:00.097");
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime5);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, 1);
        boolean boolean10 = fixedDateTimeZone4.equals((java.lang.Object) 1);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime11);
        int int14 = fixedDateTimeZone4.getOffsetFromLocal(10859907L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.Locale locale2 = null;
        java.lang.String str3 = dateTimeZone0.getName((long) (short) 100, locale2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone0.getOffset(readableInstant4);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone10 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long12 = fixedDateTimeZone10.previousTransition((long) ' ');
        long long14 = fixedDateTimeZone10.previousTransition((long) 'a');
        long long16 = fixedDateTimeZone10.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone21 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long23 = fixedDateTimeZone10.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone21, (long) ' ');
        boolean boolean24 = fixedDateTimeZone21.isFixed();
        long long27 = fixedDateTimeZone21.convertLocalToUTC((-349199999L), false);
        long long29 = fixedDateTimeZone21.previousTransition((-68L));
        org.joda.time.ReadableInstant readableInstant30 = null;
        int int31 = fixedDateTimeZone21.getOffset(readableInstant30);
        long long33 = dateTimeZone0.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone21, 349199999L);
        int int35 = fixedDateTimeZone21.getOffset((-349199948L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 349200000L + "'", long16 == 349200000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 35L + "'", long23 == 35L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-349200096L) + "'", long27 == (-349200096L));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-68L) + "'", long29 == (-68L));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 349199902L + "'", long33 == 349199902L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        java.util.TimeZone timeZone6 = fixedDateTimeZone4.toTimeZone();
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        int int9 = fixedDateTimeZone4.getOffsetFromLocal((long) 100);
        java.lang.String str11 = fixedDateTimeZone4.getNameKey((long) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(0L);
        long long8 = fixedDateTimeZone4.convertUTCToLocal(100L);
        long long11 = fixedDateTimeZone4.convertLocalToUTC((-349200090L), false);
        java.lang.String str12 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 200L + "'", long8 == 200L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349200190L) + "'", long11 == (-349200190L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        long long9 = fixedDateTimeZone4.convertLocalToUTC((long) ' ', true, (long) (byte) 1);
        java.util.Locale locale11 = null;
        java.lang.String str12 = fixedDateTimeZone4.getShortName((long) (byte) 10, locale11);
        long long14 = fixedDateTimeZone4.previousTransition(698399932L);
        int int16 = fixedDateTimeZone4.getOffsetFromLocal((long) (-1));
        long long18 = fixedDateTimeZone4.nextTransition((-348599865L));
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = fixedDateTimeZone4.getOffset(readableInstant19);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-68L) + "'", long9 == (-68L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 698399932L + "'", long14 == 698399932L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-348599865L) + "'", long18 == (-348599865L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
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
        java.util.Locale locale39 = null;
        java.lang.String str40 = fixedDateTimeZone14.getName(3L, locale39);
        java.lang.String str41 = fixedDateTimeZone14.toString();
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
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00:00.100" + "'", str40, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+97:00" + "'", str41, "+97:00");
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone1.isLocalDateTimeGap(localDateTime3);
        boolean boolean6 = dateTimeZone1.isStandardOffset(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-01:00" + "'", str2, "-01:00");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        long long9 = fixedDateTimeZone4.previousTransition((long) '4');
        long long12 = fixedDateTimeZone4.convertLocalToUTC((-349199936L), false);
        java.lang.String str13 = fixedDateTimeZone4.getID();
        int int15 = fixedDateTimeZone4.getOffset(0L);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long18 = fixedDateTimeZone4.previousTransition(60000L);
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = fixedDateTimeZone4.getOffset(readableInstant19);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349200036L) + "'", long12 == (-349200036L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 60000L + "'", long18 == 60000L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getName((long) 0);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone0.getOffset(readableInstant3);
        long long6 = dateTimeZone0.convertUTCToLocal((-349200001L));
        boolean boolean8 = dateTimeZone0.isStandardOffset(232L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-349199901L) + "'", long6 == (-349199901L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.util.TimeZone timeZone9 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str10 = fixedDateTimeZone4.toString();
        java.util.Locale locale12 = null;
        java.lang.String str13 = fixedDateTimeZone4.getShortName(349199702L, locale12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.100" + "'", str13, "+00:00:00.100");
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        java.lang.String str3 = dateTimeZone1.getShortName((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        long long8 = dateTimeZone4.convertLocalToUTC((-349200001L), false, (long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str11 = dateTimeZone9.getShortName((long) (byte) 0);
        long long13 = dateTimeZone4.getMillisKeepLocal(dateTimeZone9, 0L);
        long long15 = dateTimeZone1.getMillisKeepLocal(dateTimeZone9, 100L);
        java.lang.Class<?> wildcardClass16 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+97:00" + "'", str3, "+97:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-349200101L) + "'", long8 == (-349200101L));
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 349200000L + "'", long15 == 349200000L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long17 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, (long) ' ');
        boolean boolean18 = fixedDateTimeZone15.isFixed();
        java.lang.String str20 = fixedDateTimeZone15.getShortName((long) (short) 1);
        long long22 = fixedDateTimeZone15.previousTransition((-349200001L));
        long long24 = fixedDateTimeZone15.nextTransition((-349200035L));
        int int26 = fixedDateTimeZone15.getStandardOffset((long) 35);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.097" + "'", str20, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-349200001L) + "'", long22 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-349200035L) + "'", long24 == (-349200035L));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        java.lang.String str12 = fixedDateTimeZone4.getNameKey((-349199968L));
        long long15 = fixedDateTimeZone4.adjustOffset((long) (-1), true);
        int int17 = fixedDateTimeZone4.getStandardOffset((-125999903L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+01:00", "hi!", (-1), (int) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        long long8 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone6, (long) (short) 10);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone6.getShortName((-90L), locale10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone6.getName((-349140197L), locale13);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-43L) + "'", long8 == (-43L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.052" + "'", str11, "+00:00:00.052");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.052" + "'", str14, "+00:00:00.052");
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
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
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone33 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long35 = fixedDateTimeZone33.previousTransition((long) ' ');
        long long37 = fixedDateTimeZone33.previousTransition((long) 'a');
        java.lang.String str39 = fixedDateTimeZone33.getNameKey((long) 349200000);
        int int41 = fixedDateTimeZone33.getOffsetFromLocal(0L);
        boolean boolean43 = fixedDateTimeZone33.equals((java.lang.Object) (-99L));
        boolean boolean45 = fixedDateTimeZone33.isStandardOffset((-349200065L));
        java.util.Locale locale47 = null;
        java.lang.String str48 = fixedDateTimeZone33.getShortName(1L, locale47);
        java.lang.String str49 = fixedDateTimeZone33.getID();
        long long52 = fixedDateTimeZone33.convertLocalToUTC((-698400001L), false);
        org.joda.time.ReadableInstant readableInstant53 = null;
        int int54 = fixedDateTimeZone33.getOffset(readableInstant53);
        boolean boolean55 = fixedDateTimeZone11.equals((java.lang.Object) fixedDateTimeZone33);
        java.util.Locale locale57 = null;
        java.lang.String str58 = fixedDateTimeZone33.getShortName((-698399865L), locale57);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone63 = new org.joda.time.tz.FixedDateTimeZone("+00:00", "+00:00:00.032", (int) (short) -1, (int) (short) 10);
        boolean boolean64 = fixedDateTimeZone33.equals((java.lang.Object) fixedDateTimeZone63);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-100L) + "'", long20 == (-100L));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+97:00" + "'", str25, "+97:00");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.100" + "'", str28, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 32L + "'", long35 == 32L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 97L + "'", long37 == 97L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+97:00" + "'", str39, "+97:00");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+00:00:00.100" + "'", str48, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "+97:00" + "'", str49, "+97:00");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-698400101L) + "'", long52 == (-698400101L));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 100 + "'", int54 == 100);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "+00:00:00.100" + "'", str58, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
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
        long long32 = fixedDateTimeZone15.previousTransition((-59L));
        int int34 = fixedDateTimeZone15.getOffsetFromLocal((long) 35);
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
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-59L) + "'", long32 == (-59L));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+10:00", "+32:00", (int) '#', 0);
        java.lang.String str5 = fixedDateTimeZone4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+10:00" + "'", str5, "+10:00");
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        int int8 = fixedDateTimeZone4.getOffset(349200000L);
        int int10 = fixedDateTimeZone4.getOffsetFromLocal((-349200036L));
        long long12 = fixedDateTimeZone4.nextTransition(32L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long17 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, (long) ' ');
        int int19 = fixedDateTimeZone4.getOffsetFromLocal((long) (byte) 10);
        java.lang.String str21 = fixedDateTimeZone4.getShortName((long) 'a');
        int int23 = fixedDateTimeZone4.getStandardOffset(3660100L);
        java.util.Locale locale25 = null;
        java.lang.String str26 = fixedDateTimeZone4.getShortName(349200100L, locale25);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.100" + "'", str21, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.100" + "'", str26, "+00:00:00.100");
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        java.util.TimeZone timeZone6 = fixedDateTimeZone4.toTimeZone();
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        int int9 = fixedDateTimeZone4.getOffsetFromLocal((long) 100);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((-33L), false, 349199803L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-130L) + "'", long13 == (-130L));
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
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
        long long23 = fixedDateTimeZone6.convertUTCToLocal(32L);
        int int25 = fixedDateTimeZone6.getOffsetFromLocal((-698399936L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-99L) + "'", long17 == (-99L));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-41L) + "'", long21 == (-41L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 132L + "'", long23 == 132L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
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
        java.lang.String str42 = fixedDateTimeZone28.getName((-349199936L));
        int int44 = fixedDateTimeZone28.getStandardOffset((-3599900L));
        java.lang.String str46 = fixedDateTimeZone28.getShortName((-349200090L));
        org.joda.time.LocalDateTime localDateTime47 = null;
        boolean boolean48 = fixedDateTimeZone28.isLocalDateTimeGap(localDateTime47);
        long long50 = fixedDateTimeZone28.nextTransition((-3599900L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone55 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long57 = fixedDateTimeZone55.previousTransition((long) ' ');
        long long59 = fixedDateTimeZone55.previousTransition((long) 'a');
        long long61 = fixedDateTimeZone55.previousTransition((long) (short) 0);
        java.util.TimeZone timeZone62 = fixedDateTimeZone55.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forTimeZone(timeZone62);
        java.util.TimeZone timeZone64 = null;
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forTimeZone(timeZone64);
        java.lang.String str66 = dateTimeZone65.getID();
        long long68 = dateTimeZone63.getMillisKeepLocal(dateTimeZone65, 0L);
        long long70 = dateTimeZone63.convertUTCToLocal((-349200090L));
        long long72 = fixedDateTimeZone28.getMillisKeepLocal(dateTimeZone63, (-148L));
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
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00:00.100" + "'", str42, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00:00.100" + "'", str46, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-3599900L) + "'", long50 == (-3599900L));
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 32L + "'", long57 == 32L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 97L + "'", long59 == 97L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertNotNull(timeZone62);
        org.junit.Assert.assertEquals(timeZone62.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone63);
        org.junit.Assert.assertNotNull(dateTimeZone65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "+97:00" + "'", str66, "+97:00");
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + (-349200000L) + "'", long68 == (-349200000L));
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + (-349200090L) + "'", long70 == (-349200090L));
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + (-48L) + "'", long72 == (-48L));
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        java.lang.String str7 = fixedDateTimeZone4.getShortName((-68L));
        long long10 = fixedDateTimeZone4.adjustOffset((-65L), true);
        long long14 = fixedDateTimeZone4.convertLocalToUTC(38L, false, 0L);
        java.lang.String str16 = fixedDateTimeZone4.getShortName((-204L));
        boolean boolean17 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-65L) + "'", long10 == (-65L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-59L) + "'", long14 == (-59L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.097" + "'", str16, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00", "+00:00:00.097", 10, (int) (short) 1);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        long long9 = fixedDateTimeZone4.previousTransition((long) '4');
        long long12 = fixedDateTimeZone4.convertLocalToUTC((-349199936L), false);
        java.lang.String str13 = fixedDateTimeZone4.getID();
        int int15 = fixedDateTimeZone4.getOffset(0L);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.util.TimeZone timeZone17 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349200036L) + "'", long12 == (-349200036L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
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
        java.lang.String str24 = fixedDateTimeZone4.getID();
        java.lang.Class<?> wildcardClass25 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+97:00" + "'", str7, "+97:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+97:00" + "'", str24, "+97:00");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
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
        long long32 = fixedDateTimeZone28.previousTransition((long) 'a');
        long long34 = fixedDateTimeZone28.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone39 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long41 = fixedDateTimeZone28.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone39, (long) ' ');
        long long43 = fixedDateTimeZone28.nextTransition(0L);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone28);
        long long46 = fixedDateTimeZone28.nextTransition(49L);
        java.lang.String str48 = fixedDateTimeZone28.getNameKey(349199834L);
        boolean boolean49 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone28);
        boolean boolean50 = fixedDateTimeZone28.isFixed();
        long long53 = fixedDateTimeZone28.convertLocalToUTC((-48L), true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+97:00" + "'", str7, "+97:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-133L) + "'", long23 == (-133L));
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 32L + "'", long30 == 32L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 97L + "'", long32 == 97L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 349200000L + "'", long34 == 349200000L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 35L + "'", long41 == 35L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 49L + "'", long46 == 49L);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+97:00" + "'", str48, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-148L) + "'", long53 == (-148L));
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition((long) (short) 0);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str12 = fixedDateTimeZone4.getID();
        long long14 = fixedDateTimeZone4.convertUTCToLocal((-103L));
        long long16 = fixedDateTimeZone4.previousTransition(3660000L);
        long long18 = fixedDateTimeZone4.previousTransition((-100L));
        long long21 = fixedDateTimeZone4.adjustOffset((-349200096L), false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-3L) + "'", long14 == (-3L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3660000L + "'", long16 == 3660000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-100L) + "'", long18 == (-100L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-349200096L) + "'", long21 == (-349200096L));
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        int int12 = fixedDateTimeZone4.getOffset((long) '4');
        java.util.TimeZone timeZone13 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone14.getName(698400032L, locale16);
        long long20 = dateTimeZone14.adjustOffset(0L, false);
        long long24 = dateTimeZone14.convertLocalToUTC((long) '#', true, (-349200090L));
        java.lang.String str25 = dateTimeZone14.getID();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 35L + "'", long24 == 35L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTC" + "'", str25, "UTC");
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        java.lang.String str12 = fixedDateTimeZone4.getNameKey((-349199968L));
        long long15 = fixedDateTimeZone4.adjustOffset((long) (-1), true);
        long long17 = fixedDateTimeZone4.nextTransition((-233399968L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-233399968L) + "'", long17 == (-233399968L));
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime11);
        long long14 = fixedDateTimeZone4.nextTransition(60L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+35:01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+35:01\" is malformed at \"35:01\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+35:01", "+01:35", 10, 32);
        java.lang.String str6 = fixedDateTimeZone4.getName((-349260001L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.010" + "'", str6, "+00:00:00.010");
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        int int6 = fixedDateTimeZone4.getOffset(349200010L);
        java.lang.String str7 = fixedDateTimeZone4.toString();
        java.lang.String str9 = fixedDateTimeZone4.getNameKey(349200010L);
        long long12 = fixedDateTimeZone4.convertLocalToUTC(0L, true);
        int int14 = fixedDateTimeZone4.getStandardOffset((long) 10);
        java.util.Locale locale16 = null;
        java.lang.String str17 = fixedDateTimeZone4.getShortName(349200099L, locale16);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+97:00" + "'", str7, "+97:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-97L) + "'", long12 == (-97L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 349200000 + "'", int14 == 349200000);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.097" + "'", str17, "+00:00:00.097");
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
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
        long long24 = fixedDateTimeZone4.convertLocalToUTC((-348599865L), false, 0L);
        java.util.Locale locale26 = null;
        java.lang.String str27 = fixedDateTimeZone4.getName((-9L), locale26);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.100" + "'", str20, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-348599965L) + "'", long24 == (-348599965L));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.100" + "'", str27, "+00:00:00.100");
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = fixedDateTimeZone4.getID();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone12 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long14 = fixedDateTimeZone12.previousTransition((long) ' ');
        java.lang.String str15 = fixedDateTimeZone12.getID();
        java.lang.String str17 = fixedDateTimeZone12.getNameKey((long) (short) 10);
        int int19 = fixedDateTimeZone12.getOffsetFromLocal((-101L));
        long long21 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone12, 32L);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long26 = dateTimeZone22.getMillisKeepLocal(dateTimeZone24, (long) ' ');
        java.lang.String str27 = dateTimeZone24.toString();
        boolean boolean28 = fixedDateTimeZone12.equals((java.lang.Object) str27);
        int int30 = fixedDateTimeZone12.getOffset(126059910L);
        java.util.Locale locale32 = null;
        java.lang.String str33 = fixedDateTimeZone12.getShortName((-349800139L), locale32);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+97:00" + "'", str7, "+97:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-349199868L) + "'", long26 == (-349199868L));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+97:00" + "'", str27, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00:00.100" + "'", str33, "+00:00:00.100");
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "", 6720000, (int) (short) 0);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone0.getMillisKeepLocal(dateTimeZone2, (long) ' ');
        long long7 = dateTimeZone2.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long10 = dateTimeZone2.convertUTCToLocal(0L);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone2.getOffset(readableInstant11);
        long long14 = dateTimeZone2.convertUTCToLocal((long) (short) 10);
        long long17 = dateTimeZone2.convertLocalToUTC(0L, false);
        java.lang.String str18 = dateTimeZone2.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-349199868L) + "'", long4 == (-349199868L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349200001L) + "'", long7 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 349200000 + "'", int12 == 349200000);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 349200010L + "'", long14 == 349200010L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-349200000L) + "'", long17 == (-349200000L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+97:00" + "'", str18, "+97:00");
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.lang.String str9 = dateTimeZone8.toString();
        long long13 = dateTimeZone8.convertLocalToUTC(38L, false, 349199903L);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 38L + "'", long13 == 38L);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(97L);
        java.lang.String str12 = fixedDateTimeZone4.getNameKey(349200010L);
        boolean boolean13 = fixedDateTimeZone4.isFixed();
        java.lang.String str15 = fixedDateTimeZone4.getNameKey((long) 0);
        boolean boolean17 = fixedDateTimeZone4.isStandardOffset((-3599900L));
        java.lang.Class<?> wildcardClass18 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.Class<?> wildcardClass3 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+97:00" + "'", str2, "+97:00");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        int int8 = fixedDateTimeZone4.getOffset(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long15 = fixedDateTimeZone13.previousTransition((long) ' ');
        long long17 = fixedDateTimeZone13.previousTransition((long) 'a');
        long long19 = fixedDateTimeZone13.previousTransition(349200000L);
        long long21 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone13, 35L);
        java.util.Locale locale23 = null;
        java.lang.String str24 = fixedDateTimeZone13.getShortName((long) (short) -1, locale23);
        long long26 = fixedDateTimeZone13.nextTransition((-349200165L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 349200000L + "'", long19 == 349200000L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 35L + "'", long21 == 35L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.100" + "'", str24, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-349200165L) + "'", long26 == (-349200165L));
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition((long) (short) 0);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        long long14 = fixedDateTimeZone4.convertLocalToUTC(0L, false);
        boolean boolean16 = fixedDateTimeZone4.isStandardOffset(349200010L);
        java.lang.String str17 = fixedDateTimeZone4.toString();
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime18);
        int int21 = fixedDateTimeZone4.getOffsetFromLocal(349200034L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-100L) + "'", long14 == (-100L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
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
        java.util.Locale locale29 = null;
        java.lang.String str30 = fixedDateTimeZone21.getShortName((-352260101L), locale29);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.100" + "'", str30, "+00:00:00.100");
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.convertUTCToLocal((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.lang.String str6 = dateTimeZone1.getID();
        java.lang.String str7 = dateTimeZone1.toString();
        java.lang.String str9 = dateTimeZone1.getName(3660200L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 349200000L + "'", long3 == 349200000L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 349200000 + "'", int5 == 349200000);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+97:00" + "'", str7, "+97:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        long long3 = dateTimeZone1.convertUTCToLocal((long) 100);
        java.lang.String str4 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 349200100L + "'", long3 == 349200100L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+97:00" + "'", str4, "+97:00");
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00", "hi!", 0, (int) (byte) -1);
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getShortName(0L, locale6);
        java.util.TimeZone timeZone8 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.nextTransition((long) 10);
        int int8 = fixedDateTimeZone4.getStandardOffset((-349200001L));
        int int10 = fixedDateTimeZone4.getOffsetFromLocal(200L);
        int int12 = fixedDateTimeZone4.getOffset((-349200064L));
        long long16 = fixedDateTimeZone4.convertLocalToUTC((-698400101L), true, (-349200010L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-698400201L) + "'", long16 == (-698400201L));
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime11);
        boolean boolean13 = fixedDateTimeZone4.isFixed();
        java.util.Locale locale15 = null;
        java.lang.String str16 = fixedDateTimeZone4.getShortName((long) '#', locale15);
        java.util.Locale locale18 = null;
        java.lang.String str19 = fixedDateTimeZone4.getShortName((-349199893L), locale18);
        java.util.TimeZone timeZone20 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.100" + "'", str16, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime11);
        boolean boolean13 = fixedDateTimeZone4.isFixed();
        int int15 = fixedDateTimeZone4.getOffset((-349200099L));
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long18 = fixedDateTimeZone4.nextTransition((-349200333L));
        int int20 = fixedDateTimeZone4.getStandardOffset(349200001L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-349200333L) + "'", long18 == (-349200333L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        long long6 = dateTimeZone2.convertLocalToUTC((-349200001L), false, (long) (byte) 100);
        boolean boolean8 = dateTimeZone2.isStandardOffset((-100L));
        java.lang.String str9 = dateTimeZone2.toString();
        long long11 = dateTimeZone1.getMillisKeepLocal(dateTimeZone2, (-699000036L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-349200101L) + "'", long6 == (-349200101L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-699000084L) + "'", long11 == (-699000084L));
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
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
        java.util.TimeZone timeZone59 = fixedDateTimeZone4.toTimeZone();
        java.util.Locale locale61 = null;
        java.lang.String str62 = fixedDateTimeZone4.getShortName((long) (byte) 10, locale61);
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
        org.junit.Assert.assertNotNull(timeZone59);
        org.junit.Assert.assertEquals(timeZone59.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "+00:00:00.100" + "'", str62, "+00:00:00.100");
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
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
        java.lang.Object obj36 = null;
        boolean boolean37 = fixedDateTimeZone23.equals(obj36);
        long long40 = fixedDateTimeZone23.convertLocalToUTC((-248L), false);
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-348L) + "'", long40 == (-348L));
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.lang.String str9 = fixedDateTimeZone4.getNameKey(100L);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+97:00" + "'", str9, "+97:00");
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long17 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, (long) ' ');
        boolean boolean18 = fixedDateTimeZone15.isFixed();
        long long21 = fixedDateTimeZone15.convertLocalToUTC((-349199999L), false);
        java.util.TimeZone timeZone22 = fixedDateTimeZone15.toTimeZone();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-349200096L) + "'", long21 == (-349200096L));
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition((long) (short) 0);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str12 = fixedDateTimeZone4.getID();
        int int14 = fixedDateTimeZone4.getOffset((long) (byte) -1);
        int int16 = fixedDateTimeZone4.getOffsetFromLocal(349200101L);
        java.lang.String str18 = fixedDateTimeZone4.getNameKey((-349200068L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone23 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long25 = fixedDateTimeZone23.previousTransition((long) ' ');
        long long27 = fixedDateTimeZone23.previousTransition((long) 'a');
        long long29 = fixedDateTimeZone23.previousTransition((long) (short) 0);
        java.util.TimeZone timeZone30 = fixedDateTimeZone23.toTimeZone();
        java.lang.String str32 = fixedDateTimeZone23.getNameKey((-349200100L));
        int int34 = fixedDateTimeZone23.getOffset(1L);
        java.util.TimeZone timeZone35 = fixedDateTimeZone23.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        long long39 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone37, 349199999L);
        java.lang.String str40 = dateTimeZone37.toString();
        java.lang.String str42 = dateTimeZone37.getName((-702059901L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+97:00" + "'", str18, "+97:00");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 97L + "'", long27 == 97L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+97:00" + "'", str32, "+97:00");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 349200099L + "'", long39 == 349200099L);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "UTC" + "'", str40, "UTC");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00" + "'", str42, "+00:00");
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
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
        org.joda.time.LocalDateTime localDateTime38 = null;
        boolean boolean39 = fixedDateTimeZone9.isLocalDateTimeGap(localDateTime38);
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 100, (int) (byte) 10);
        int int6 = fixedDateTimeZone4.getOffsetFromLocal((long) (byte) 1);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = fixedDateTimeZone4.getOffset(readableInstant7);
        long long11 = fixedDateTimeZone4.adjustOffset(0L, false);
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getName(0L, locale13);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("UTC", "UTC", 0, (-1));
        int int6 = fixedDateTimeZone4.getOffsetFromLocal((-349200000L));
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str10 = dateTimeZone8.getName((long) 0);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone8.getOffset(readableInstant11);
        long long14 = dateTimeZone8.convertUTCToLocal((-349200001L));
        long long16 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone8, (-349200003L));
        java.lang.String str18 = fixedDateTimeZone4.getName(0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.100" + "'", str10, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-349199901L) + "'", long14 == (-349199901L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-349200103L) + "'", long16 == (-349200103L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:10", "+00:00", (int) ' ', (int) (short) 100);
        java.lang.String str5 = fixedDateTimeZone4.getID();
        int int7 = fixedDateTimeZone4.getOffset((-349199965L));
        java.util.TimeZone timeZone8 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:10" + "'", str5, "+00:10");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:10");
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 100, (int) (byte) 10);
        int int6 = fixedDateTimeZone4.getOffsetFromLocal((long) (byte) 1);
        java.util.TimeZone timeZone7 = fixedDateTimeZone4.toTimeZone();
        long long9 = fixedDateTimeZone4.previousTransition((-65L));
        long long12 = fixedDateTimeZone4.adjustOffset((-59965L), true);
        long long15 = fixedDateTimeZone4.convertLocalToUTC(0L, false);
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = fixedDateTimeZone4.getOffset(readableInstant16);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-65L) + "'", long9 == (-65L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-59965L) + "'", long12 == (-59965L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-100L) + "'", long15 == (-100L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+10:00", "-01:00", (int) (byte) 0, 115800000);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 100, (int) (byte) 10);
        int int6 = fixedDateTimeZone4.getOffsetFromLocal((long) (byte) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) 0);
        java.util.Locale locale10 = null;
        java.lang.String str11 = fixedDateTimeZone4.getShortName((-349200099L), locale10);
        long long13 = fixedDateTimeZone4.previousTransition((long) (-1));
        java.lang.String str15 = fixedDateTimeZone4.getShortName((-349199835L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
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
        boolean boolean55 = fixedDateTimeZone4.isFixed();
        java.lang.String str57 = fixedDateTimeZone4.getShortName((-698400001L));
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
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "+00:00:00.100" + "'", str57, "+00:00:00.100");
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        int int6 = fixedDateTimeZone4.getOffset(349200010L);
        java.lang.String str8 = fixedDateTimeZone4.getShortName((-349200065L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long15 = fixedDateTimeZone13.nextTransition((-101L));
        java.util.Locale locale17 = null;
        java.lang.String str18 = fixedDateTimeZone13.getName((-90L), locale17);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone23 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str25 = fixedDateTimeZone23.getNameKey(100L);
        long long29 = fixedDateTimeZone23.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone30 = fixedDateTimeZone23.toTimeZone();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone23);
        boolean boolean33 = fixedDateTimeZone23.isStandardOffset(100L);
        boolean boolean34 = fixedDateTimeZone23.isFixed();
        long long36 = fixedDateTimeZone13.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone23, (-349200090L));
        long long38 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone13, (-349199901L));
        java.util.TimeZone timeZone39 = fixedDateTimeZone13.toTimeZone();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.097" + "'", str8, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-101L) + "'", long15 == (-101L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.100" + "'", str18, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+97:00" + "'", str25, "+97:00");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-100L) + "'", long29 == (-100L));
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-349200090L) + "'", long36 == (-349200090L));
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-349199904L) + "'", long38 == (-349199904L));
        org.junit.Assert.assertNotNull(timeZone39);
        org.junit.Assert.assertEquals(timeZone39.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition((long) (short) 0);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        java.lang.String str14 = dateTimeZone13.toString();
        long long18 = dateTimeZone13.convertLocalToUTC((-349200096L), true, 86L);
        long long20 = dateTimeZone13.convertUTCToLocal(349200001L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-349200096L) + "'", long18 == (-349200096L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 349200001L + "'", long20 == 349200001L);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
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
        long long33 = fixedDateTimeZone14.nextTransition((-110L));
        long long37 = fixedDateTimeZone14.convertLocalToUTC((-349199935L), false, (-349200401L));
        boolean boolean39 = fixedDateTimeZone14.isStandardOffset((-349200199L));
        java.lang.String str40 = fixedDateTimeZone14.getID();
        long long42 = fixedDateTimeZone14.nextTransition((-698400190L));
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
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-110L) + "'", long33 == (-110L));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-349200035L) + "'", long37 == (-349200035L));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+97:00" + "'", str40, "+97:00");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-698400190L) + "'", long42 == (-698400190L));
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
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
        long long28 = fixedDateTimeZone4.adjustOffset((-349199990L), false);
        java.lang.String str29 = fixedDateTimeZone4.toString();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-349199901L) + "'", long22 == (-349199901L));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-349199990L) + "'", long28 == (-349199990L));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+97:00" + "'", str29, "+97:00");
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+32:00", "+32:10", (int) (byte) 100, 0);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone4.getShortName(0L, locale13);
        java.lang.String str16 = fixedDateTimeZone4.getNameKey((-101L));
        boolean boolean18 = fixedDateTimeZone4.equals((java.lang.Object) 100L);
        boolean boolean20 = fixedDateTimeZone4.isStandardOffset((-133L));
        boolean boolean22 = fixedDateTimeZone4.isStandardOffset((-349140197L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:10", "", (int) (byte) -1, (int) (byte) -1);
        long long6 = fixedDateTimeZone4.convertUTCToLocal((-349200035L));
        int int8 = fixedDateTimeZone4.getStandardOffset((-3L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-349200036L) + "'", long6 == (-349200036L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        int int12 = fixedDateTimeZone4.getStandardOffset(1L);
        long long14 = fixedDateTimeZone4.previousTransition((long) 10);
        int int16 = fixedDateTimeZone4.getOffsetFromLocal((-349200048L));
        java.lang.String str17 = fixedDateTimeZone4.toString();
        java.lang.String str19 = fixedDateTimeZone4.getName((-106L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, (int) '#');
        long long5 = dateTimeZone2.convertLocalToUTC(135L, true);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-362099865L) + "'", long5 == (-362099865L));
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        java.lang.String str10 = fixedDateTimeZone4.getNameKey(97L);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone16 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str18 = fixedDateTimeZone16.getNameKey(100L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone23 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long25 = fixedDateTimeZone23.previousTransition((long) ' ');
        long long27 = fixedDateTimeZone23.previousTransition((long) 'a');
        int int29 = fixedDateTimeZone23.getStandardOffset((long) (short) 0);
        long long32 = fixedDateTimeZone23.convertLocalToUTC((long) 0, true);
        int int34 = fixedDateTimeZone23.getOffset((-349199999L));
        boolean boolean35 = fixedDateTimeZone16.equals((java.lang.Object) fixedDateTimeZone23);
        java.lang.String str37 = fixedDateTimeZone23.getNameKey((-349199871L));
        java.util.Locale locale39 = null;
        java.lang.String str40 = fixedDateTimeZone23.getName((long) (byte) -1, locale39);
        int int42 = fixedDateTimeZone23.getOffsetFromLocal(349200101L);
        long long45 = fixedDateTimeZone23.convertLocalToUTC((-349200036L), false);
        long long47 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone23, (long) 32);
        java.lang.String str49 = fixedDateTimeZone4.getShortName((-140L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+97:00" + "'", str18, "+97:00");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 97L + "'", long27 == 97L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-100L) + "'", long32 == (-100L));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+97:00" + "'", str37, "+97:00");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00:00.100" + "'", str40, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-349200136L) + "'", long45 == (-349200136L));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 32L + "'", long47 == 32L);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "+00:00:00.100" + "'", str49, "+00:00:00.100");
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
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
        java.lang.String str37 = fixedDateTimeZone22.getShortName(86L);
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
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-349200164L) + "'", long35 == (-349200164L));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:00:00.100" + "'", str37, "+00:00:00.100");
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00", "", (int) (short) -1, 0);
        long long7 = fixedDateTimeZone4.adjustOffset((long) '#', false);
        java.lang.String str8 = fixedDateTimeZone4.getID();
        java.util.Locale locale10 = null;
        java.lang.String str11 = fixedDateTimeZone4.getShortName(3660100L, locale10);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-00:00:00.001" + "'", str11, "-00:00:00.001");
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
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
        long long38 = fixedDateTimeZone4.convertLocalToUTC((-348599968L), false, (-698400101L));
        long long40 = fixedDateTimeZone4.previousTransition(94L);
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
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-348600068L) + "'", long38 == (-348600068L));
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 94L + "'", long40 == 94L);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        java.lang.String str12 = fixedDateTimeZone4.getNameKey((-349139968L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone17 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long19 = fixedDateTimeZone17.nextTransition((-101L));
        int int21 = fixedDateTimeZone17.getStandardOffset((long) (byte) -1);
        int int23 = fixedDateTimeZone17.getOffsetFromLocal(10L);
        long long26 = fixedDateTimeZone17.convertLocalToUTC((-349199868L), false);
        org.joda.time.LocalDateTime localDateTime27 = null;
        boolean boolean28 = fixedDateTimeZone17.isLocalDateTimeGap(localDateTime27);
        long long31 = fixedDateTimeZone17.adjustOffset((-698399865L), true);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone17);
        boolean boolean33 = fixedDateTimeZone4.equals((java.lang.Object) fixedDateTimeZone17);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-101L) + "'", long19 == (-101L));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-349199968L) + "'", long26 == (-349199968L));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-698399865L) + "'", long31 == (-698399865L));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        long long12 = fixedDateTimeZone4.previousTransition((-349199990L));
        java.lang.String str13 = fixedDateTimeZone4.getID();
        java.lang.String str15 = fixedDateTimeZone4.getShortName((-349199890L));
        int int17 = fixedDateTimeZone4.getOffsetFromLocal(59801L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349199990L) + "'", long12 == (-349199990L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.100" + "'", str15, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
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
        long long22 = fixedDateTimeZone4.nextTransition((long) 1);
        java.lang.String str24 = fixedDateTimeZone4.getNameKey(115800000L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+97:00" + "'", str24, "+97:00");
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.nextTransition((long) 10);
        long long8 = fixedDateTimeZone4.nextTransition(349200035L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = fixedDateTimeZone4.getOffset(readableInstant9);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 349200035L + "'", long8 == 349200035L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition((long) (short) 0);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str12 = fixedDateTimeZone4.getID();
        int int14 = fixedDateTimeZone4.getOffset((long) (byte) -1);
        int int16 = fixedDateTimeZone4.getOffsetFromLocal(349200101L);
        java.lang.String str18 = fixedDateTimeZone4.getNameKey((-349200068L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone23 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long25 = fixedDateTimeZone23.previousTransition((long) ' ');
        long long27 = fixedDateTimeZone23.previousTransition((long) 'a');
        long long29 = fixedDateTimeZone23.previousTransition((long) (short) 0);
        java.util.TimeZone timeZone30 = fixedDateTimeZone23.toTimeZone();
        java.lang.String str32 = fixedDateTimeZone23.getNameKey((-349200100L));
        int int34 = fixedDateTimeZone23.getOffset(1L);
        java.util.TimeZone timeZone35 = fixedDateTimeZone23.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        long long39 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone37, 349199999L);
        java.lang.String str40 = dateTimeZone37.toString();
        org.joda.time.ReadableInstant readableInstant41 = null;
        int int42 = dateTimeZone37.getOffset(readableInstant41);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+97:00" + "'", str18, "+97:00");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 97L + "'", long27 == 97L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+97:00" + "'", str32, "+97:00");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 349200099L + "'", long39 == 349200099L);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "UTC" + "'", str40, "UTC");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str9 = dateTimeZone7.getShortName((long) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long14 = dateTimeZone11.convertLocalToUTC((long) (byte) 1, false);
        java.lang.String str16 = dateTimeZone11.getShortName((long) ' ');
        long long18 = dateTimeZone7.getMillisKeepLocal(dateTimeZone11, 0L);
        long long20 = dateTimeZone7.convertUTCToLocal(32L);
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone7.getShortName((-1L), locale22);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone29 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str31 = fixedDateTimeZone29.getNameKey((long) 1);
        boolean boolean32 = fixedDateTimeZone29.isFixed();
        long long34 = fixedDateTimeZone29.previousTransition((long) '4');
        long long37 = fixedDateTimeZone29.convertLocalToUTC((-349199936L), false);
        long long39 = dateTimeZone7.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone29, (-101L));
        java.util.Locale locale41 = null;
        java.lang.String str42 = dateTimeZone7.getShortName(59901L, locale41);
        long long44 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone7, (-349200148L));
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-349199999L) + "'", long14 == (-349199999L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-349199900L) + "'", long18 == (-349199900L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 132L + "'", long20 == 132L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.100" + "'", str23, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+97:00" + "'", str31, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 52L + "'", long34 == 52L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-349200036L) + "'", long37 == (-349200036L));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-101L) + "'", long39 == (-101L));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00:00.100" + "'", str42, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-349200148L) + "'", long44 == (-349200148L));
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
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
        java.lang.String str57 = dateTimeZone37.toString();
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
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "+97:00" + "'", str57, "+97:00");
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "+10:35", 0, (int) '#');
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        long long8 = fixedDateTimeZone4.convertLocalToUTC(349200000L, true);
        java.util.Locale locale10 = null;
        java.lang.String str11 = fixedDateTimeZone4.getShortName((-349199948L), locale10);
        int int13 = fixedDateTimeZone4.getOffsetFromLocal((-702059901L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 349200000L + "'", long8 == 349200000L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long15 = fixedDateTimeZone4.convertLocalToUTC(349200010L, true);
        long long17 = fixedDateTimeZone4.nextTransition((-349199901L));
        long long20 = fixedDateTimeZone4.adjustOffset(698399935L, true);
        boolean boolean22 = fixedDateTimeZone4.isStandardOffset((-349199865L));
        java.util.Locale locale24 = null;
        java.lang.String str25 = fixedDateTimeZone4.getName((long) 6720000, locale24);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 349199910L + "'", long15 == 349199910L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-349199901L) + "'", long17 == (-349199901L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 698399935L + "'", long20 == 698399935L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.100" + "'", str25, "+00:00:00.100");
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "+35:52", 6720000, (-1));
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
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
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone37 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str39 = fixedDateTimeZone37.getNameKey((long) 1);
        long long41 = fixedDateTimeZone37.nextTransition((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long48 = dateTimeZone44.getMillisKeepLocal(dateTimeZone46, (long) ' ');
        long long51 = dateTimeZone46.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone46);
        long long55 = dateTimeZone46.convertLocalToUTC((long) (byte) 0, false);
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long59 = dateTimeZone46.getMillisKeepLocal(dateTimeZone57, (long) 1);
        long long61 = dateTimeZone43.getMillisKeepLocal(dateTimeZone46, (long) 0);
        boolean boolean62 = fixedDateTimeZone37.equals((java.lang.Object) dateTimeZone43);
        java.lang.String str64 = fixedDateTimeZone37.getShortName((long) (byte) 1);
        java.util.TimeZone timeZone65 = null;
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forTimeZone(timeZone65);
        java.lang.String str67 = dateTimeZone66.getID();
        long long69 = fixedDateTimeZone37.getMillisKeepLocal(dateTimeZone66, (-90L));
        long long71 = dateTimeZone66.convertUTCToLocal((long) (short) 0);
        long long73 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone66, (-475199903L));
        java.lang.String str75 = dateTimeZone66.getShortName(38L);
        java.lang.Class<?> wildcardClass76 = dateTimeZone66.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-349199969L) + "'", long15 == (-349199969L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-349200001L) + "'", long18 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-349200000L) + "'", long22 == (-349200000L));
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 235L + "'", long32 == 235L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+97:00" + "'", str39, "+97:00");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 100L + "'", long41 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-349199868L) + "'", long48 == (-349199868L));
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-349200001L) + "'", long51 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-349200000L) + "'", long55 == (-349200000L));
        org.junit.Assert.assertNotNull(dateTimeZone57);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 1L + "'", long59 == 1L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "+00:00:00.100" + "'", str64, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "+97:00" + "'", str67, "+97:00");
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + (-349199990L) + "'", long69 == (-349199990L));
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 349200000L + "'", long71 == 349200000L);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + (-824399803L) + "'", long73 == (-824399803L));
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "+97:00" + "'", str75, "+97:00");
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("-00:00:00.001", "hi!", (int) (short) 10, 97);
        long long7 = fixedDateTimeZone4.convertLocalToUTC((-349200000L), true);
        boolean boolean9 = fixedDateTimeZone4.isStandardOffset(42L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349200010L) + "'", long7 == (-349200010L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 100, (int) (byte) 10);
        int int6 = fixedDateTimeZone4.getOffsetFromLocal((long) (byte) 1);
        boolean boolean8 = fixedDateTimeZone4.isStandardOffset((-1047599834L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        int int10 = fixedDateTimeZone4.getStandardOffset((long) (short) 0);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((long) 0, true);
        java.lang.String str14 = fixedDateTimeZone4.toString();
        boolean boolean16 = fixedDateTimeZone4.isStandardOffset(349200010L);
        long long19 = fixedDateTimeZone4.convertLocalToUTC(0L, false);
        long long23 = fixedDateTimeZone4.convertLocalToUTC((-702060001L), false, 11L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-100L) + "'", long13 == (-100L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+97:00" + "'", str14, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-100L) + "'", long19 == (-100L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-702060101L) + "'", long23 == (-702060101L));
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        java.util.Locale locale8 = null;
        java.lang.String str9 = fixedDateTimeZone4.getName((-349200001L), locale8);
        java.util.TimeZone timeZone10 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone11.getName(100L, locale13);
        long long17 = dateTimeZone11.convertLocalToUTC((-349200064L), true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.100" + "'", str9, "+00:00:00.100");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-349200064L) + "'", long17 == (-349200064L));
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00", "+00:00:00.032", (int) (short) -1, (int) (short) 10);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.lang.Class<?> wildcardClass6 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
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
        long long42 = fixedDateTimeZone29.convertLocalToUTC(349199767L, false, (-698399936L));
        boolean boolean43 = fixedDateTimeZone29.isFixed();
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
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 349199670L + "'", long42 == 349199670L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
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
        int int34 = fixedDateTimeZone22.getOffsetFromLocal(349199967L);
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00", "+00:00:00.097", (int) (short) 0, (int) (byte) -1);
        long long6 = fixedDateTimeZone4.convertUTCToLocal(349200133L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone11 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str13 = fixedDateTimeZone11.getNameKey((long) 1);
        boolean boolean14 = fixedDateTimeZone11.isFixed();
        java.lang.String str16 = fixedDateTimeZone11.getNameKey((-349199901L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone21 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str23 = fixedDateTimeZone21.getNameKey(0L);
        java.util.Locale locale25 = null;
        java.lang.String str26 = fixedDateTimeZone21.getShortName(31L, locale25);
        long long28 = fixedDateTimeZone11.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone21, (long) 0);
        boolean boolean29 = fixedDateTimeZone11.isFixed();
        boolean boolean30 = fixedDateTimeZone11.isFixed();
        int int32 = fixedDateTimeZone11.getStandardOffset((long) 10);
        boolean boolean33 = fixedDateTimeZone11.isFixed();
        java.util.TimeZone timeZone34 = fixedDateTimeZone11.toTimeZone();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone39 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long41 = fixedDateTimeZone39.previousTransition((long) ' ');
        long long43 = fixedDateTimeZone39.previousTransition((long) 'a');
        long long45 = fixedDateTimeZone39.previousTransition(349200000L);
        java.lang.String str47 = fixedDateTimeZone39.getNameKey((-349199968L));
        long long50 = fixedDateTimeZone39.adjustOffset((long) (-1), true);
        java.lang.String str52 = fixedDateTimeZone39.getNameKey((-65L));
        boolean boolean53 = fixedDateTimeZone11.equals((java.lang.Object) (-65L));
        boolean boolean54 = fixedDateTimeZone11.isFixed();
        long long56 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone11, (-348599865L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 349200133L + "'", long6 == 349200133L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+97:00" + "'", str23, "+97:00");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.100" + "'", str26, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 32L + "'", long41 == 32L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 97L + "'", long43 == 97L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 349200000L + "'", long45 == 349200000L);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+97:00" + "'", str47, "+97:00");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1L) + "'", long50 == (-1L));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "+97:00" + "'", str52, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + (-348599965L) + "'", long56 == (-348599965L));
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        java.lang.String str8 = fixedDateTimeZone4.getNameKey(10L);
        long long11 = fixedDateTimeZone4.convertLocalToUTC((-349200001L), true);
        long long13 = fixedDateTimeZone4.convertUTCToLocal((-68L));
        java.util.TimeZone timeZone14 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+97:00" + "'", str8, "+97:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349200101L) + "'", long11 == (-349200101L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone15);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
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
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone38 = new org.joda.time.tz.FixedDateTimeZone("UTC", "UTC", 0, (-1));
        int int40 = fixedDateTimeZone38.getOffsetFromLocal((-349200000L));
        boolean boolean41 = fixedDateTimeZone38.isFixed();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str44 = dateTimeZone42.getName((long) 0);
        org.joda.time.ReadableInstant readableInstant45 = null;
        int int46 = dateTimeZone42.getOffset(readableInstant45);
        long long48 = dateTimeZone42.convertUTCToLocal((-349200001L));
        long long50 = fixedDateTimeZone38.getMillisKeepLocal(dateTimeZone42, (-349200003L));
        boolean boolean51 = fixedDateTimeZone22.equals((java.lang.Object) (-349200003L));
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "-00:00:00.001" + "'", str44, "-00:00:00.001");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-349200002L) + "'", long48 == (-349200002L));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-349200002L) + "'", long50 == (-349200002L));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
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
        long long32 = fixedDateTimeZone18.previousTransition((-349200401L));
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
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-349200401L) + "'", long32 == (-349200401L));
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        int int10 = fixedDateTimeZone4.getStandardOffset((long) (short) 0);
        int int12 = fixedDateTimeZone4.getStandardOffset((long) (byte) 10);
        java.lang.String str13 = fixedDateTimeZone4.getID();
        boolean boolean15 = fixedDateTimeZone4.isStandardOffset((-349199948L));
        java.util.Locale locale17 = null;
        java.lang.String str18 = fixedDateTimeZone4.getName((-62L), locale17);
        java.lang.String str20 = fixedDateTimeZone4.getNameKey((long) (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.100" + "'", str18, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+97:00" + "'", str20, "+97:00");
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long9 = fixedDateTimeZone4.adjustOffset((long) (short) 100, false);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((-349200036L), false, (-48L));
        long long15 = fixedDateTimeZone4.nextTransition(97L);
        java.lang.String str17 = fixedDateTimeZone4.getNameKey(0L);
        boolean boolean18 = fixedDateTimeZone4.isFixed();
        long long21 = fixedDateTimeZone4.convertLocalToUTC((long) '#', false);
        java.lang.String str23 = fixedDateTimeZone4.getName((-233399968L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-349200136L) + "'", long13 == (-349200136L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-65L) + "'", long21 == (-65L));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.100" + "'", str23, "+00:00:00.100");
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        java.lang.String str12 = fixedDateTimeZone4.getNameKey((-349199968L));
        java.lang.String str13 = fixedDateTimeZone4.getID();
        long long16 = fixedDateTimeZone4.adjustOffset(349199910L, true);
        boolean boolean18 = fixedDateTimeZone4.isStandardOffset((long) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str21 = dateTimeZone19.getShortName((long) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long26 = dateTimeZone23.convertLocalToUTC((long) (byte) 1, false);
        java.lang.String str28 = dateTimeZone23.getShortName((long) ' ');
        long long30 = dateTimeZone19.getMillisKeepLocal(dateTimeZone23, 0L);
        long long32 = dateTimeZone19.convertUTCToLocal(32L);
        org.joda.time.ReadableInstant readableInstant33 = null;
        int int34 = dateTimeZone19.getOffset(readableInstant33);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone19);
        boolean boolean36 = fixedDateTimeZone4.equals((java.lang.Object) dateTimeZone19);
        boolean boolean37 = fixedDateTimeZone4.isFixed();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.lang.String str40 = fixedDateTimeZone4.getName((-349199890L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 349199910L + "'", long16 == 349199910L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.100" + "'", str21, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-349199999L) + "'", long26 == (-349199999L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+97:00" + "'", str28, "+97:00");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-349199900L) + "'", long30 == (-349199900L));
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 132L + "'", long32 == 132L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00:00.100" + "'", str40, "+00:00:00.100");
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
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
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone55 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long57 = fixedDateTimeZone55.previousTransition((long) ' ');
        long long59 = fixedDateTimeZone55.previousTransition((long) 'a');
        long long61 = fixedDateTimeZone55.previousTransition((long) (short) 0);
        java.util.Locale locale63 = null;
        java.lang.String str64 = fixedDateTimeZone55.getName((long) (-1), locale63);
        long long66 = dateTimeZone50.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone55, (long) 97);
        long long68 = fixedDateTimeZone28.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone55, (-349140000L));
        long long72 = fixedDateTimeZone55.convertLocalToUTC((-198L), true, 35L);
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
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 32L + "'", long57 == 32L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 97L + "'", long59 == 97L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "+00:00:00.100" + "'", str64, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 349199997L + "'", long66 == 349199997L);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + (-349140000L) + "'", long68 == (-349140000L));
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + (-298L) + "'", long72 == (-298L));
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+01:35", "-00:00:00.001", 1, 115800000);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long6 = dateTimeZone2.getMillisKeepLocal(dateTimeZone4, (long) ' ');
        long long9 = dateTimeZone4.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        long long13 = dateTimeZone4.convertLocalToUTC((long) (byte) 0, false);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long17 = dateTimeZone4.getMillisKeepLocal(dateTimeZone15, (long) 1);
        long long19 = dateTimeZone1.getMillisKeepLocal(dateTimeZone4, (long) 0);
        long long22 = dateTimeZone1.adjustOffset(349199670L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-349200001L) + "'", long9 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-349200000L) + "'", long13 == (-349200000L));
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 349199670L + "'", long22 == 349199670L);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition((long) (short) 0);
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str13 = fixedDateTimeZone4.getNameKey((-349200100L));
        int int15 = fixedDateTimeZone4.getOffset(1L);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int18 = fixedDateTimeZone4.getOffsetFromLocal((-698399936L));
        java.lang.String str19 = fixedDateTimeZone4.toString();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+97:00" + "'", str19, "+97:00");
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:01", "+00:00:00.100", 0, 100);
        long long7 = fixedDateTimeZone4.adjustOffset(349200032L, false);
        long long11 = fixedDateTimeZone4.convertLocalToUTC((long) (byte) 1, true, (-349139868L));
        boolean boolean12 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 349200032L + "'", long7 == 349200032L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        java.util.TimeZone timeZone9 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
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
        java.lang.String str39 = fixedDateTimeZone4.getShortName((-115199868L));
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00:00.100" + "'", str39, "+00:00:00.100");
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.100", "", (int) 'a', (int) (byte) 100);
        long long17 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone15, (long) ' ');
        long long19 = fixedDateTimeZone4.nextTransition(0L);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long22 = fixedDateTimeZone4.nextTransition(49L);
        java.lang.String str23 = fixedDateTimeZone4.toString();
        long long25 = fixedDateTimeZone4.convertUTCToLocal((-110L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 49L + "'", long22 == 49L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+97:00" + "'", str23, "+97:00");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-10L) + "'", long25 == (-10L));
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone5 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long7 = fixedDateTimeZone5.previousTransition((long) ' ');
        long long9 = fixedDateTimeZone5.previousTransition((long) 'a');
        long long11 = fixedDateTimeZone5.previousTransition((long) (short) 0);
        java.util.Locale locale13 = null;
        java.lang.String str14 = fixedDateTimeZone5.getName((long) (-1), locale13);
        long long16 = dateTimeZone0.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone5, (long) 97);
        long long18 = fixedDateTimeZone5.convertUTCToLocal(35L);
        java.lang.String str19 = fixedDateTimeZone5.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.100" + "'", str14, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 135L + "'", long18 == 135L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+97:00" + "'", str19, "+97:00");
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        long long3 = dateTimeZone1.convertUTCToLocal(100L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone8 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long10 = fixedDateTimeZone8.previousTransition((long) ' ');
        long long12 = fixedDateTimeZone8.previousTransition((long) 'a');
        long long14 = fixedDateTimeZone8.previousTransition(349200000L);
        int int16 = fixedDateTimeZone8.getStandardOffset(1L);
        long long20 = fixedDateTimeZone8.convertLocalToUTC((long) '4', false, (long) (short) 1);
        long long22 = fixedDateTimeZone8.previousTransition((-3L));
        long long25 = fixedDateTimeZone8.convertLocalToUTC(1L, false);
        java.util.Locale locale27 = null;
        java.lang.String str28 = fixedDateTimeZone8.getShortName(100L, locale27);
        java.lang.String str30 = fixedDateTimeZone8.getShortName((-698399900L));
        java.util.TimeZone timeZone31 = fixedDateTimeZone8.toTimeZone();
        java.lang.String str32 = fixedDateTimeZone8.getID();
        java.util.Locale locale34 = null;
        java.lang.String str35 = fixedDateTimeZone8.getName(97L, locale34);
        long long37 = dateTimeZone1.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone8, 38L);
        java.util.TimeZone timeZone38 = fixedDateTimeZone8.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-3599900L) + "'", long3 == (-3599900L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 349200000L + "'", long14 == 349200000L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-48L) + "'", long20 == (-48L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-3L) + "'", long22 == (-3L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-99L) + "'", long25 == (-99L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.100" + "'", str28, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.100" + "'", str30, "+00:00:00.100");
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+97:00" + "'", str32, "+97:00");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00:00.100" + "'", str35, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-3600062L) + "'", long37 == (-3600062L));
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 100, (int) (byte) 10);
        int int6 = fixedDateTimeZone4.getOffsetFromLocal((long) (byte) 1);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = fixedDateTimeZone4.getOffset(readableInstant7);
        long long11 = fixedDateTimeZone4.adjustOffset(0L, false);
        boolean boolean12 = fixedDateTimeZone4.isFixed();
        int int14 = fixedDateTimeZone4.getOffsetFromLocal((-68L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+10:00", "+32:00", (int) '#', 0);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(97, (int) (byte) 0);
        long long10 = dateTimeZone7.adjustOffset((-698399747L), true);
        boolean boolean11 = fixedDateTimeZone4.equals((java.lang.Object) (-698399747L));
        java.lang.String str13 = fixedDateTimeZone4.getName((-349200000L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-698399747L) + "'", long10 == (-698399747L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.035" + "'", str13, "+00:00:00.035");
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        int int12 = fixedDateTimeZone4.getStandardOffset(1L);
        long long16 = fixedDateTimeZone4.convertLocalToUTC((long) '4', false, (long) (short) 1);
        long long18 = fixedDateTimeZone4.previousTransition((-3L));
        long long21 = fixedDateTimeZone4.convertLocalToUTC(1L, false);
        java.lang.String str22 = fixedDateTimeZone4.getID();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone27 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long29 = fixedDateTimeZone27.previousTransition((long) ' ');
        long long31 = fixedDateTimeZone27.previousTransition((long) 'a');
        int int33 = fixedDateTimeZone27.getStandardOffset((long) (short) 0);
        int int35 = fixedDateTimeZone27.getStandardOffset((long) (byte) 10);
        long long38 = fixedDateTimeZone27.convertLocalToUTC((long) 1, true);
        org.joda.time.ReadableInstant readableInstant39 = null;
        int int40 = fixedDateTimeZone27.getOffset(readableInstant39);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone45 = new org.joda.time.tz.FixedDateTimeZone("+00:00", "+00:00:00.032", (int) (short) -1, (int) (short) 10);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone45);
        java.lang.String str47 = fixedDateTimeZone45.getID();
        java.lang.String str49 = fixedDateTimeZone45.getNameKey((-349200101L));
        int int51 = fixedDateTimeZone45.getStandardOffset(32L);
        long long53 = fixedDateTimeZone27.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone45, (-698399848L));
        boolean boolean54 = fixedDateTimeZone4.equals((java.lang.Object) long53);
        java.lang.String str55 = fixedDateTimeZone4.toString();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-48L) + "'", long16 == (-48L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-3L) + "'", long18 == (-3L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-99L) + "'", long21 == (-99L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+97:00" + "'", str22, "+97:00");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 32L + "'", long29 == 32L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 97L + "'", long31 == 97L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-99L) + "'", long38 == (-99L));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+00:00" + "'", str47, "+00:00");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "+00:00:00.032" + "'", str49, "+00:00:00.032");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-698399747L) + "'", long53 == (-698399747L));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "+97:00" + "'", str55, "+97:00");
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        java.util.TimeZone timeZone6 = fixedDateTimeZone4.toTimeZone();
        long long9 = fixedDateTimeZone4.adjustOffset((long) (short) 0, false);
        java.lang.String str10 = fixedDateTimeZone4.toString();
        long long12 = fixedDateTimeZone4.nextTransition((-68L));
        java.lang.String str13 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-68L) + "'", long12 == (-68L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00", "+00:01", 0, (int) (short) -1);
        long long6 = fixedDateTimeZone4.previousTransition(349199903L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 349199903L + "'", long6 == 349199903L);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("-01:10");
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        java.lang.String str7 = fixedDateTimeZone4.getID();
        long long9 = fixedDateTimeZone4.convertUTCToLocal((-349199968L));
        java.util.Locale locale11 = null;
        java.lang.String str12 = fixedDateTimeZone4.getShortName((long) 10, locale11);
        boolean boolean14 = fixedDateTimeZone4.isStandardOffset((-349200101L));
        java.util.Locale locale16 = null;
        java.lang.String str17 = fixedDateTimeZone4.getShortName((-109L), locale16);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+97:00" + "'", str7, "+97:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-349199868L) + "'", long9 == (-349199868L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.100" + "'", str12, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.100" + "'", str17, "+00:00:00.100");
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
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
        java.lang.String str55 = dateTimeZone0.getName(0L, locale54);
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
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-349200068L) + "'", long50 == (-349200068L));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "+00:00:00.100" + "'", str55, "+00:00:00.100");
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.032");
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((-349200003L), locale3);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) '4');
        long long9 = dateTimeZone1.getMillisKeepLocal(dateTimeZone7, (-348599865L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.032" + "'", str4, "+00:00:00.032");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-355319833L) + "'", long9 == (-355319833L));
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("", "+10:35", 97, (int) ' ');
        java.util.Locale locale6 = null;
        java.lang.String str7 = fixedDateTimeZone4.getName((-201L), locale6);
        boolean boolean8 = fixedDateTimeZone4.isFixed();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.097" + "'", str7, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:32", "+00:00:00.052", (int) (byte) 100, (int) (byte) 1);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        int int9 = fixedDateTimeZone4.getOffset((long) '#');
        java.lang.String str11 = fixedDateTimeZone4.getShortName((-10L));
        java.lang.Class<?> wildcardClass12 = fixedDateTimeZone4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00:00.100" + "'", str11, "+00:00:00.100");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone0.getMillisKeepLocal(dateTimeZone2, (long) ' ');
        long long7 = dateTimeZone2.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long10 = dateTimeZone2.convertUTCToLocal(0L);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone2.getOffset(readableInstant11);
        long long14 = dateTimeZone2.convertUTCToLocal((long) (short) 10);
        long long17 = dateTimeZone2.convertLocalToUTC(0L, false);
        long long19 = dateTimeZone2.convertUTCToLocal(35L);
        long long23 = dateTimeZone2.convertLocalToUTC((-349199868L), false, (-349140297L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-349199868L) + "'", long4 == (-349199868L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349200001L) + "'", long7 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 349200000 + "'", int12 == 349200000);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 349200010L + "'", long14 == 349200010L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-349200000L) + "'", long17 == (-349200000L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 349200035L + "'", long19 == 349200035L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-698399868L) + "'", long23 == (-698399868L));
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey((long) 1);
        long long9 = fixedDateTimeZone4.adjustOffset((long) (short) 100, false);
        long long13 = fixedDateTimeZone4.convertLocalToUTC((-349200036L), false, (-48L));
        long long15 = fixedDateTimeZone4.nextTransition(97L);
        java.lang.String str17 = fixedDateTimeZone4.getNameKey(0L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone22 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+00:00", (int) 'a', 349200000);
        java.lang.String str24 = fixedDateTimeZone22.getName((-60001L));
        long long26 = fixedDateTimeZone4.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone22, (-349199969L));
        java.lang.String str28 = fixedDateTimeZone4.getShortName(349199997L);
        int int30 = fixedDateTimeZone4.getOffsetFromLocal((-349139900L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-349200136L) + "'", long13 == (-349200136L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+97:00" + "'", str17, "+97:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.097" + "'", str24, "+00:00:00.097");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-349199966L) + "'", long26 == (-349199966L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00:00.100" + "'", str28, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
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
        java.lang.Class<?> wildcardClass27 = fixedDateTimeZone14.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-201L) + "'", long9 == (-201L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+97:00" + "'", str16, "+97:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+97:00" + "'", str20, "+97:00");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+97:00" + "'", str22, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.100" + "'", str25, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
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
        long long30 = dateTimeZone1.convertLocalToUTC(42L, false, 349200032L);
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
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-349199958L) + "'", long30 == (-349199958L));
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
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
        java.util.Locale locale43 = null;
        java.lang.String str44 = fixedDateTimeZone4.getName((-349200099L), locale43);
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "+00:00:00.100" + "'", str44, "+00:00:00.100");
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.097", "+00:00:00.010", (-1), (int) (byte) 10);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        long long8 = fixedDateTimeZone4.previousTransition((long) 'a');
        long long10 = fixedDateTimeZone4.previousTransition(349200000L);
        int int12 = fixedDateTimeZone4.getStandardOffset(1L);
        boolean boolean13 = fixedDateTimeZone4.isFixed();
        java.util.TimeZone timeZone14 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime15);
        long long19 = fixedDateTimeZone4.adjustOffset((-198L), true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349200000L + "'", long10 == 349200000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-198L) + "'", long19 == (-198L));
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00", "", (int) (short) -1, 0);
        int int6 = fixedDateTimeZone4.getOffset((-109L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 100, (int) (byte) 10);
        int int6 = fixedDateTimeZone4.getOffsetFromLocal((long) (byte) 1);
        long long8 = fixedDateTimeZone4.nextTransition((long) 0);
        java.util.TimeZone timeZone9 = fixedDateTimeZone4.toTimeZone();
        boolean boolean11 = fixedDateTimeZone4.isStandardOffset(349199934L);
        java.util.TimeZone timeZone12 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str14 = fixedDateTimeZone4.getNameKey((-349199900L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone19 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long21 = fixedDateTimeZone19.previousTransition((long) ' ');
        long long23 = fixedDateTimeZone19.previousTransition((long) 'a');
        long long25 = fixedDateTimeZone19.previousTransition((long) (short) 0);
        java.lang.String str26 = fixedDateTimeZone19.getID();
        long long30 = fixedDateTimeZone19.convertLocalToUTC((long) 97, false, (-349199871L));
        boolean boolean31 = fixedDateTimeZone4.equals((java.lang.Object) long30);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 97L + "'", long23 == 97L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+97:00" + "'", str26, "+97:00");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-3L) + "'", long30 == (-3L));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:01", "", 10, (int) (short) 10);
        long long8 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (-48L));
        long long10 = fixedDateTimeZone4.previousTransition(349199903L);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-10L) + "'", long8 == (-10L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 349199903L + "'", long10 == 349199903L);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone0.getMillisKeepLocal(dateTimeZone2, (long) ' ');
        long long7 = dateTimeZone2.convertLocalToUTC((long) (short) -1, false);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long11 = dateTimeZone2.convertLocalToUTC((long) (byte) 0, false);
        java.lang.String str12 = dateTimeZone2.toString();
        java.lang.String str14 = dateTimeZone2.getName((-698400001L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone19 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str21 = fixedDateTimeZone19.getNameKey((long) 1);
        long long23 = fixedDateTimeZone19.nextTransition((long) (short) 100);
        java.lang.String str25 = fixedDateTimeZone19.getNameKey(97L);
        int int27 = fixedDateTimeZone19.getOffset((long) 349200000);
        java.util.Locale locale29 = null;
        java.lang.String str30 = fixedDateTimeZone19.getName((long) (byte) 0, locale29);
        java.lang.String str32 = fixedDateTimeZone19.getName(59700L);
        long long34 = dateTimeZone2.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone19, (long) (byte) 10);
        java.lang.String str35 = fixedDateTimeZone19.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-349199958L) + "'", long4 == (-349199958L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349200001L) + "'", long7 == (-349200001L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-349200000L) + "'", long11 == (-349200000L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+97:00" + "'", str12, "+97:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+97:00" + "'", str14, "+97:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+97:00" + "'", str21, "+97:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+97:00" + "'", str25, "+97:00");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.100" + "'", str30, "+00:00:00.100");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.100" + "'", str32, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 349199910L + "'", long34 == 349199910L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+97:00" + "'", str35, "+97:00");
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00", "+00:00:00.032", (int) (short) -1, (int) (short) 10);
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.lang.String str6 = fixedDateTimeZone4.toString();
        java.lang.String str7 = fixedDateTimeZone4.getID();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        java.util.TimeZone timeZone6 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str8 = fixedDateTimeZone4.getNameKey((long) '#');
        java.lang.String str10 = fixedDateTimeZone4.getNameKey((-126060048L));
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+97:00" + "'", str8, "+97:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        java.lang.String str6 = fixedDateTimeZone4.getNameKey(100L);
        long long10 = fixedDateTimeZone4.convertLocalToUTC(0L, true, (-349200000L));
        java.util.TimeZone timeZone11 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long15 = fixedDateTimeZone4.convertLocalToUTC(349200010L, true);
        long long17 = fixedDateTimeZone4.nextTransition((long) (short) 100);
        int int19 = fixedDateTimeZone4.getOffset((-362099865L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-100L) + "'", long10 == (-100L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 349199910L + "'", long15 == 349199910L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "hi!", (int) (short) 100, (int) (byte) 10);
        java.lang.String str6 = fixedDateTimeZone4.getShortName((-349199999L));
        boolean boolean7 = fixedDateTimeZone4.isFixed();
        java.lang.String str9 = fixedDateTimeZone4.getNameKey((-698400101L));
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone14 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long16 = fixedDateTimeZone14.previousTransition((long) ' ');
        long long18 = fixedDateTimeZone14.previousTransition((long) 'a');
        java.lang.String str20 = fixedDateTimeZone14.getNameKey((long) 349200000);
        java.util.TimeZone timeZone21 = fixedDateTimeZone14.toTimeZone();
        long long25 = fixedDateTimeZone14.convertLocalToUTC((-698400101L), true, (long) (byte) -1);
        boolean boolean26 = fixedDateTimeZone4.equals((java.lang.Object) (-698400101L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.100" + "'", str6, "+00:00:00.100");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+97:00" + "'", str20, "+97:00");
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-698400201L) + "'", long25 == (-698400201L));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+97:00", "+97:00", (int) (short) 100, 10);
        long long6 = fixedDateTimeZone4.previousTransition((long) ' ');
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.util.TimeZone timeZone8 = fixedDateTimeZone4.toTimeZone();
        long long10 = fixedDateTimeZone4.previousTransition((long) 'a');
        java.lang.String str11 = fixedDateTimeZone4.toString();
        java.util.TimeZone timeZone12 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str13 = fixedDateTimeZone4.getID();
        java.lang.String str15 = fixedDateTimeZone4.getNameKey((-349200068L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+97:00" + "'", str11, "+97:00");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) '#');
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
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
        long long34 = fixedDateTimeZone4.nextTransition((-349200100L));
        java.lang.String str36 = fixedDateTimeZone4.getName(59L);
        java.util.TimeZone timeZone37 = fixedDateTimeZone4.toTimeZone();
        java.lang.String str39 = fixedDateTimeZone4.getName((-60001L));
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
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-349200100L) + "'", long34 == (-349200100L));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00:00.100" + "'", str36, "+00:00:00.100");
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00:00.100" + "'", str39, "+00:00:00.100");
    }
}
