import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest41 {

    public static boolean debug = false;

    @Test
    public void test20501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20501");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) 10);
        java.lang.String str4 = dateTimeZone0.getName((long) (short) 1);
        long long6 = dateTimeZone0.convertUTCToLocal((long) ' ');
        long long8 = dateTimeZone0.nextTransition(1L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone0.getOffset(readableInstant9);
        java.lang.String str11 = dateTimeZone0.toString();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone0.getName((-1L), locale13);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forID("+00:00");
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = dateTimeZone16.getOffset(readableInstant17);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        boolean boolean21 = dateTimeZone19.isStandardOffset((long) 10);
        long long23 = dateTimeZone19.previousTransition(0L);
        boolean boolean24 = dateTimeZone16.equals((java.lang.Object) long23);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone16.getName((long) (-1), locale26);
        boolean boolean28 = dateTimeZone0.equals((java.lang.Object) locale26);
        long long30 = dateTimeZone0.convertUTCToLocal((long) (byte) 100);
        int int32 = dateTimeZone0.getOffsetFromLocal(36000052L);
        org.joda.time.ReadableInstant readableInstant33 = null;
        int int34 = dateTimeZone0.getOffset(readableInstant33);
        java.util.Locale locale36 = null;
        java.lang.String str37 = dateTimeZone0.getName(81120025L, locale36);
        java.lang.String str38 = dateTimeZone0.toString();
        long long40 = dateTimeZone0.previousTransition((-233400009L));
        java.util.TimeZone timeZone41 = dateTimeZone0.toTimeZone();
        long long43 = dateTimeZone0.convertUTCToLocal((-129659899L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 100L + "'", long30 == 100L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:00" + "'", str37, "+00:00");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "UTC" + "'", str38, "UTC");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-233400009L) + "'", long40 == (-233400009L));
        org.junit.Assert.assertNotNull(timeZone41);
        org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-129659899L) + "'", long43 == (-129659899L));
    }

    @Test
    public void test20502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20502");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj1 = null;
        boolean boolean2 = dateTimeZone0.equals(obj1);
        java.lang.String str4 = dateTimeZone0.getName(100L);
        boolean boolean5 = dateTimeZone0.isFixed();
        long long7 = dateTimeZone0.nextTransition((long) (-1));
        long long10 = dateTimeZone0.convertLocalToUTC(0L, true);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone0.getName(233520024L, locale12);
        java.lang.String str15 = dateTimeZone0.getNameKey(81120000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
    }

    @Test
    public void test20503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20503");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int4 = dateTimeZone1.getStandardOffset((-1L));
        int int6 = dateTimeZone1.getOffset((long) (short) 1);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone1.getOffset(readableInstant7);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getName((long) (byte) 1, locale10);
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = dateTimeZone1.isLocalDateTimeGap(localDateTime12);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        boolean boolean16 = dateTimeZone14.isStandardOffset((long) 10);
        java.lang.String str18 = dateTimeZone14.getName((long) 'a');
        long long20 = dateTimeZone14.nextTransition((long) '4');
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone14.getShortName(100L, locale22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone14.getOffset(readableInstant24);
        boolean boolean27 = dateTimeZone14.isStandardOffset(10L);
        int int29 = dateTimeZone14.getStandardOffset((long) 0);
        org.joda.time.ReadableInstant readableInstant30 = null;
        int int31 = dateTimeZone14.getOffset(readableInstant30);
        long long35 = dateTimeZone14.convertLocalToUTC((-35999999L), false, 3599990L);
        long long37 = dateTimeZone1.getMillisKeepLocal(dateTimeZone14, 324060010L);
        boolean boolean39 = dateTimeZone1.equals((java.lang.Object) "+01:32");
        boolean boolean40 = dateTimeZone1.isFixed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology41 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 52L + "'", long20 == 52L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-35999999L) + "'", long35 == (-35999999L));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 324060010L + "'", long37 == 324060010L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test20504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20504");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20505");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(35, 115800000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 115800000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20506");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(351300000);
        boolean boolean3 = dateTimeZone1.isStandardOffset((-187200052L));
        long long5 = dateTimeZone1.nextTransition((-233400010L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-233400010L) + "'", long5 == (-233400010L));
    }

    @Test
    public void test20507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20507");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        int int3 = dateTimeZone0.getStandardOffset((-1L));
        int int5 = dateTimeZone0.getOffset((long) (short) 1);
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        java.util.TimeZone timeZone7 = dateTimeZone0.toTimeZone();
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone0.getName(32L, locale9);
        long long12 = dateTimeZone0.nextTransition((long) '#');
        long long16 = dateTimeZone0.convertLocalToUTC(0L, false, 32L);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forID("UTC");
        boolean boolean19 = dateTimeZone18.isFixed();
        java.lang.String str21 = dateTimeZone18.getShortName((long) '4');
        long long23 = dateTimeZone18.convertUTCToLocal((long) (short) 10);
        java.lang.String str25 = dateTimeZone18.getNameKey(42L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        int int28 = dateTimeZone18.getOffsetFromLocal(396600000L);
        long long30 = dateTimeZone18.previousTransition((long) (short) 10);
        boolean boolean31 = dateTimeZone0.equals((java.lang.Object) (short) 10);
        org.joda.time.ReadableInstant readableInstant32 = null;
        int int33 = dateTimeZone0.getOffset(readableInstant32);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTC" + "'", str25, "UTC");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test20508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20508");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) 10);
        java.lang.String str4 = dateTimeZone0.getName((long) 'a');
        java.lang.String str5 = dateTimeZone0.getID();
        java.lang.String str6 = dateTimeZone0.toString();
        boolean boolean7 = dateTimeZone0.isFixed();
        java.util.TimeZone timeZone8 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        long long14 = dateTimeZone12.nextTransition(125999990L);
        java.lang.String str15 = dateTimeZone12.toString();
        int int17 = dateTimeZone12.getOffset((-32880001L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 125999990L + "'", long14 == 125999990L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test20509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20509");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(126000000);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        long long6 = dateTimeZone1.convertLocalToUTC((-280799980L), true, 119340100L);
        long long8 = dateTimeZone1.convertUTCToLocal(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-406799980L) + "'", long6 == (-406799980L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 126000000L + "'", long8 == 126000000L);
    }

    @Test
    public void test20510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20510");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) (short) 0);
        java.lang.String str3 = dateTimeZone2.getID();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-01:00" + "'", str3, "-01:00");
    }

    @Test
    public void test20511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20511");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long5 = dateTimeZone1.convertLocalToUTC((long) (-1), false, 36000052L);
        java.lang.String str6 = dateTimeZone1.getID();
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone1.isLocalDateTimeGap(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-349200001L) + "'", long5 == (-349200001L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+97:00" + "'", str6, "+97:00");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test20512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20512");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) 10);
        int int4 = dateTimeZone0.getOffset((long) (short) 10);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone0.getName((long) 0, locale6);
        java.lang.String str8 = dateTimeZone0.toString();
        java.lang.String str9 = dateTimeZone0.getID();
        int int11 = dateTimeZone0.getOffsetFromLocal((long) (byte) 10);
        long long14 = dateTimeZone0.convertLocalToUTC((long) (byte) 1, false);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj16 = null;
        boolean boolean17 = dateTimeZone15.equals(obj16);
        java.lang.String str19 = dateTimeZone15.getName(100L);
        java.lang.String str20 = dateTimeZone15.getID();
        java.util.TimeZone timeZone21 = dateTimeZone15.toTimeZone();
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone15.getName(100L, locale23);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forID("+00:00");
        long long28 = dateTimeZone15.getMillisKeepLocal(dateTimeZone26, (long) (byte) 1);
        int int30 = dateTimeZone15.getOffset((long) (-1));
        java.lang.String str31 = dateTimeZone15.getID();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone32);
        int int35 = dateTimeZone32.getStandardOffset((-1L));
        int int37 = dateTimeZone32.getOffset((long) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.UTC;
        long long42 = dateTimeZone38.convertLocalToUTC((long) (byte) 0, true, (long) ' ');
        boolean boolean43 = dateTimeZone32.equals((java.lang.Object) (byte) 0);
        long long45 = dateTimeZone15.getMillisKeepLocal(dateTimeZone32, (long) (short) 10);
        long long47 = dateTimeZone32.previousTransition((long) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.UTC;
        boolean boolean50 = dateTimeZone48.isStandardOffset((long) 10);
        java.lang.String str52 = dateTimeZone48.getName((long) (short) 1);
        java.lang.String str53 = dateTimeZone48.toString();
        int int55 = dateTimeZone48.getOffset(0L);
        java.util.Locale locale57 = null;
        java.lang.String str58 = dateTimeZone48.getName((long) (byte) 10, locale57);
        long long60 = dateTimeZone32.getMillisKeepLocal(dateTimeZone48, (-35999999L));
        long long62 = dateTimeZone0.getMillisKeepLocal(dateTimeZone32, (-10L));
        long long65 = dateTimeZone32.convertLocalToUTC(3599990L, false);
        long long68 = dateTimeZone32.convertLocalToUTC(123000000L, false);
        org.joda.time.LocalDateTime localDateTime69 = null;
        boolean boolean70 = dateTimeZone32.isLocalDateTimeGap(localDateTime69);
        java.lang.String str71 = dateTimeZone32.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "UTC" + "'", str31, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 10L + "'", long45 == 10L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1L) + "'", long47 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "+00:00" + "'", str52, "+00:00");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "UTC" + "'", str53, "UTC");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "+00:00" + "'", str58, "+00:00");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-35999999L) + "'", long60 == (-35999999L));
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-10L) + "'", long62 == (-10L));
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 3599990L + "'", long65 == 3599990L);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 123000000L + "'", long68 == 123000000L);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "UTC" + "'", str71, "UTC");
    }

    @Test
    public void test20513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20513");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) 10);
        int int4 = dateTimeZone0.getOffset((long) (short) 10);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone0.getName((long) 0, locale6);
        java.lang.String str9 = dateTimeZone0.getNameKey((long) (byte) 1);
        int int11 = dateTimeZone0.getOffsetFromLocal(99L);
        long long14 = dateTimeZone0.adjustOffset(161999999L, true);
        int int16 = dateTimeZone0.getOffset((-147599971L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 161999999L + "'", long14 == 161999999L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test20514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20514");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) 10);
        java.lang.String str4 = dateTimeZone0.getName((long) 'a');
        long long7 = dateTimeZone0.convertLocalToUTC((long) (short) 100, false);
        boolean boolean9 = dateTimeZone0.equals((java.lang.Object) 100);
        java.lang.String str10 = dateTimeZone0.getID();
        boolean boolean11 = dateTimeZone0.isFixed();
        java.lang.String str12 = dateTimeZone0.getID();
        boolean boolean14 = dateTimeZone0.isStandardOffset(126600000L);
        java.lang.String str16 = dateTimeZone0.getName((long) 97);
        java.lang.String str18 = dateTimeZone0.getNameKey(486060032L);
        boolean boolean19 = dateTimeZone0.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test20515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20515");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) 10);
        java.lang.String str4 = dateTimeZone0.getName((long) (short) 1);
        long long6 = dateTimeZone0.convertUTCToLocal((long) ' ');
        long long8 = dateTimeZone0.nextTransition(1L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone0.getOffset(readableInstant9);
        java.lang.String str11 = dateTimeZone0.toString();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone0.getName((-1L), locale13);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forID("+00:00");
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = dateTimeZone16.getOffset(readableInstant17);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        boolean boolean21 = dateTimeZone19.isStandardOffset((long) 10);
        long long23 = dateTimeZone19.previousTransition(0L);
        boolean boolean24 = dateTimeZone16.equals((java.lang.Object) long23);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone16.getName((long) (-1), locale26);
        boolean boolean28 = dateTimeZone0.equals((java.lang.Object) locale26);
        boolean boolean29 = dateTimeZone0.isFixed();
        int int31 = dateTimeZone0.getStandardOffset((-475199990L));
        java.util.Locale locale33 = null;
        java.lang.String str34 = dateTimeZone0.getName(0L, locale33);
        int int36 = dateTimeZone0.getOffsetFromLocal(35999989L);
        org.joda.time.LocalDateTime localDateTime37 = null;
        boolean boolean38 = dateTimeZone0.isLocalDateTimeGap(localDateTime37);
        java.lang.String str40 = dateTimeZone0.getName((-3599999L));
        long long43 = dateTimeZone0.convertLocalToUTC((-32400000L), false);
        java.util.TimeZone timeZone44 = dateTimeZone0.toTimeZone();
        java.lang.Class<?> wildcardClass45 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00" + "'", str34, "+00:00");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00" + "'", str40, "+00:00");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-32400000L) + "'", long43 == (-32400000L));
        org.junit.Assert.assertNotNull(timeZone44);
        org.junit.Assert.assertEquals(timeZone44.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test20516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20516");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        long long3 = dateTimeZone1.convertUTCToLocal(32L);
        long long5 = dateTimeZone1.previousTransition((-35999990L));
        long long7 = dateTimeZone1.convertUTCToLocal((-108000014L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 33L + "'", long3 == 33L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-35999990L) + "'", long5 == (-35999990L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-108000013L) + "'", long7 == (-108000013L));
    }

    @Test
    public void test20517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20517");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) 10);
        java.lang.String str4 = dateTimeZone0.getName((long) (short) 1);
        long long6 = dateTimeZone0.convertUTCToLocal((long) ' ');
        long long8 = dateTimeZone0.nextTransition(1L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone0.getOffset(readableInstant9);
        java.lang.String str11 = dateTimeZone0.toString();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone0.getName((-1L), locale13);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forID("+00:00");
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = dateTimeZone16.getOffset(readableInstant17);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        boolean boolean21 = dateTimeZone19.isStandardOffset((long) 10);
        long long23 = dateTimeZone19.previousTransition(0L);
        boolean boolean24 = dateTimeZone16.equals((java.lang.Object) long23);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone16.getName((long) (-1), locale26);
        boolean boolean28 = dateTimeZone0.equals((java.lang.Object) locale26);
        boolean boolean29 = dateTimeZone0.isFixed();
        int int31 = dateTimeZone0.getStandardOffset((-475199990L));
        java.util.Locale locale33 = null;
        java.lang.String str34 = dateTimeZone0.getName(0L, locale33);
        int int36 = dateTimeZone0.getOffsetFromLocal(35999989L);
        java.lang.String str38 = dateTimeZone0.getShortName(34L);
        long long41 = dateTimeZone0.convertLocalToUTC(37919989L, true);
        int int43 = dateTimeZone0.getStandardOffset((-29280000L));
        java.util.Locale locale45 = null;
        java.lang.String str46 = dateTimeZone0.getName((-324599990L), locale45);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.getDefault();
        int int49 = dateTimeZone47.getStandardOffset((long) 'a');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone47);
        java.lang.String str51 = dateTimeZone47.getID();
        java.util.TimeZone timeZone52 = dateTimeZone47.toTimeZone();
        org.joda.time.LocalDateTime localDateTime53 = null;
        boolean boolean54 = dateTimeZone47.isLocalDateTimeGap(localDateTime53);
        long long56 = dateTimeZone47.previousTransition(101L);
        java.lang.String str57 = dateTimeZone47.getID();
        boolean boolean58 = dateTimeZone0.equals((java.lang.Object) dateTimeZone47);
        long long61 = dateTimeZone0.adjustOffset(324000010L, false);
        org.joda.time.LocalDateTime localDateTime62 = null;
        boolean boolean63 = dateTimeZone0.isLocalDateTimeGap(localDateTime62);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00" + "'", str34, "+00:00");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00" + "'", str38, "+00:00");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 37919989L + "'", long41 == 37919989L);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00" + "'", str46, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "UTC" + "'", str51, "UTC");
        org.junit.Assert.assertNotNull(timeZone52);
        org.junit.Assert.assertEquals(timeZone52.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 101L + "'", long56 == 101L);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "UTC" + "'", str57, "UTC");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 324000010L + "'", long61 == 324000010L);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test20518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20518");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) 10);
        java.lang.String str4 = dateTimeZone0.getName((long) 'a');
        long long7 = dateTimeZone0.convertLocalToUTC((long) (short) 100, false);
        boolean boolean9 = dateTimeZone0.equals((java.lang.Object) 100);
        java.lang.String str10 = dateTimeZone0.getID();
        java.lang.String str11 = dateTimeZone0.getID();
        java.lang.String str13 = dateTimeZone0.getName((long) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forID("+00:00:00.032");
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forID("+00:00");
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = dateTimeZone17.isLocalDateTimeGap(localDateTime18);
        long long21 = dateTimeZone15.getMillisKeepLocal(dateTimeZone17, (long) 360600000);
        boolean boolean22 = dateTimeZone0.equals((java.lang.Object) long21);
        long long25 = dateTimeZone0.adjustOffset(0L, false);
        org.joda.time.ReadableInstant readableInstant26 = null;
        int int27 = dateTimeZone0.getOffset(readableInstant26);
        long long29 = dateTimeZone0.nextTransition(343440000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 360600032L + "'", long21 == 360600032L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 343440000L + "'", long29 == 343440000L);
    }

    @Test
    public void test20519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20519");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        int int3 = dateTimeZone0.getStandardOffset((-1L));
        int int5 = dateTimeZone0.getOffset((long) (short) 1);
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        java.util.TimeZone timeZone7 = dateTimeZone0.toTimeZone();
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone0.getName(32L, locale9);
        int int12 = dateTimeZone0.getOffset((long) (byte) 1);
        java.lang.String str13 = dateTimeZone0.toString();
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = dateTimeZone0.getOffset(readableInstant14);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        long long18 = dateTimeZone16.nextTransition((long) '#');
        java.lang.String str19 = dateTimeZone16.toString();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forID("+00:00");
        org.joda.time.ReadableInstant readableInstant22 = null;
        int int23 = dateTimeZone21.getOffset(readableInstant22);
        long long26 = dateTimeZone21.convertLocalToUTC((long) (-1), false);
        java.lang.String str28 = dateTimeZone21.getNameKey(0L);
        long long30 = dateTimeZone16.getMillisKeepLocal(dateTimeZone21, 3600010L);
        int int32 = dateTimeZone21.getStandardOffset((long) 'a');
        int int34 = dateTimeZone21.getStandardOffset((long) (short) 0);
        boolean boolean35 = dateTimeZone0.equals((java.lang.Object) dateTimeZone21);
        int int37 = dateTimeZone0.getOffset((-288000001L));
        long long39 = dateTimeZone0.convertUTCToLocal(0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35L + "'", long18 == 35L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UTC" + "'", str28, "UTC");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 3600010L + "'", long30 == 3600010L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
    }

    @Test
    public void test20520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20520");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        boolean boolean4 = dateTimeZone2.isStandardOffset((long) 10);
        java.lang.String str6 = dateTimeZone2.getName((long) 'a');
        long long8 = dateTimeZone2.nextTransition((long) '4');
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone2.getShortName(100L, locale10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone2, 3600010L);
        java.lang.String str15 = dateTimeZone1.getID();
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = dateTimeZone1.getOffset(readableInstant16);
        int int19 = dateTimeZone1.getStandardOffset((long) 'a');
        long long22 = dateTimeZone1.adjustOffset((-835199990L), false);
        long long24 = dateTimeZone1.nextTransition(72000009L);
        long long26 = dateTimeZone1.previousTransition(3600010L);
        int int28 = dateTimeZone1.getOffsetFromLocal((-35999981L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3600010L + "'", long14 == 3600010L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-835199990L) + "'", long22 == (-835199990L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 72000009L + "'", long24 == 72000009L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 3600010L + "'", long26 == 3600010L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test20521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20521");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 'a');
        java.lang.String str4 = dateTimeZone0.getNameKey((long) 'a');
        int int6 = dateTimeZone0.getOffset(0L);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone0.getShortName((long) (byte) -1, locale8);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone0.getShortName(3600099L, locale11);
        long long14 = dateTimeZone0.nextTransition(90000025L);
        long long16 = dateTimeZone0.convertUTCToLocal(132L);
        boolean boolean17 = dateTimeZone0.isFixed();
        long long19 = dateTimeZone0.convertUTCToLocal((long) '#');
        boolean boolean20 = dateTimeZone0.isFixed();
        java.lang.String str22 = dateTimeZone0.getShortName(90000025L);
        int int24 = dateTimeZone0.getOffset((-3599980L));
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone0.getShortName((-258600010L), locale26);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 90000025L + "'", long14 == 90000025L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 132L + "'", long16 == 132L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 35L + "'", long19 == 35L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
    }

    @Test
    public void test20522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20522");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) 10);
        java.lang.String str4 = dateTimeZone0.getName((long) (short) 1);
        long long6 = dateTimeZone0.convertUTCToLocal((long) ' ');
        long long8 = dateTimeZone0.nextTransition(1L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone0.getOffset(readableInstant9);
        java.lang.String str11 = dateTimeZone0.toString();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone0.getName((-1L), locale13);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forID("+00:00");
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = dateTimeZone16.getOffset(readableInstant17);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        boolean boolean21 = dateTimeZone19.isStandardOffset((long) 10);
        long long23 = dateTimeZone19.previousTransition(0L);
        boolean boolean24 = dateTimeZone16.equals((java.lang.Object) long23);
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeZone16.getName((long) (-1), locale26);
        boolean boolean28 = dateTimeZone0.equals((java.lang.Object) locale26);
        long long30 = dateTimeZone0.previousTransition(100L);
        long long33 = dateTimeZone0.convertLocalToUTC((long) '4', true);
        long long36 = dateTimeZone0.convertLocalToUTC((long) (byte) 0, false);
        long long38 = dateTimeZone0.previousTransition(10L);
        java.lang.String str40 = dateTimeZone0.getShortName((-115200090L));
        java.util.TimeZone timeZone41 = dateTimeZone0.toTimeZone();
        boolean boolean42 = dateTimeZone0.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 100L + "'", long30 == 100L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 52L + "'", long33 == 52L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 10L + "'", long38 == 10L);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00" + "'", str40, "+00:00");
        org.junit.Assert.assertNotNull(timeZone41);
        org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test20523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20523");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) 10);
        java.lang.String str4 = dateTimeZone0.getName((long) 'a');
        long long6 = dateTimeZone0.nextTransition((long) '4');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.String str9 = dateTimeZone0.getShortName((long) (short) 100);
        boolean boolean10 = dateTimeZone0.isFixed();
        long long13 = dateTimeZone0.adjustOffset((long) 10, false);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj15 = null;
        boolean boolean16 = dateTimeZone14.equals(obj15);
        java.lang.String str18 = dateTimeZone14.getName(100L);
        java.lang.String str19 = dateTimeZone14.getID();
        boolean boolean20 = dateTimeZone14.isFixed();
        int int22 = dateTimeZone14.getOffsetFromLocal((long) 0);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone23);
        int int26 = dateTimeZone23.getStandardOffset((-1L));
        int int28 = dateTimeZone23.getOffset((long) (short) 1);
        java.util.TimeZone timeZone29 = dateTimeZone23.toTimeZone();
        java.util.TimeZone timeZone30 = dateTimeZone23.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        boolean boolean33 = dateTimeZone14.equals((java.lang.Object) timeZone30);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.UTC;
        boolean boolean36 = dateTimeZone34.isStandardOffset((long) 10);
        int int38 = dateTimeZone34.getOffset((long) (short) 10);
        boolean boolean40 = dateTimeZone34.isStandardOffset((long) (short) 1);
        long long44 = dateTimeZone34.convertLocalToUTC(97L, false, 10L);
        boolean boolean45 = dateTimeZone14.equals((java.lang.Object) 97L);
        long long47 = dateTimeZone0.getMillisKeepLocal(dateTimeZone14, 360600032L);
        int int49 = dateTimeZone0.getOffsetFromLocal(129660000L);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        java.util.TimeZone timeZone52 = dateTimeZone51.toTimeZone();
        java.lang.String str54 = dateTimeZone51.getNameKey((long) 360600000);
        long long56 = dateTimeZone51.nextTransition((-360000001L));
        long long60 = dateTimeZone51.convertLocalToUTC(187199989L, true, (long) '4');
        long long62 = dateTimeZone0.getMillisKeepLocal(dateTimeZone51, 343440000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 97L + "'", long44 == 97L);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 360600032L + "'", long47 == 360600032L);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertNotNull(timeZone52);
        org.junit.Assert.assertEquals(timeZone52.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + (-360000001L) + "'", long56 == (-360000001L));
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 187199979L + "'", long60 == 187199979L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 343439990L + "'", long62 == 343439990L);
    }

    @Test
    public void test20524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20524");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj1 = null;
        boolean boolean2 = dateTimeZone0.equals(obj1);
        java.lang.String str4 = dateTimeZone0.getName(100L);
        java.lang.String str5 = dateTimeZone0.getID();
        boolean boolean6 = dateTimeZone0.isFixed();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) 0);
        java.lang.String str10 = dateTimeZone0.getName(101L);
        java.lang.String str11 = dateTimeZone0.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
    }

    @Test
    public void test20525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20525");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 'a');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.String str4 = dateTimeZone0.getID();
        int int6 = dateTimeZone0.getStandardOffset(10L);
        java.util.TimeZone timeZone7 = dateTimeZone0.toTimeZone();
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone0.getShortName(246720031L, locale9);
        boolean boolean12 = dateTimeZone0.isStandardOffset(324000142L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test20526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20526");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) 10);
        int int4 = dateTimeZone0.getOffset((long) (short) 10);
        long long7 = dateTimeZone0.adjustOffset((long) 'a', true);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forID("UTC");
        boolean boolean10 = dateTimeZone9.isFixed();
        long long14 = dateTimeZone9.convertLocalToUTC(10L, false, (long) 0);
        long long16 = dateTimeZone0.getMillisKeepLocal(dateTimeZone9, (long) 'a');
        java.lang.String str18 = dateTimeZone0.getNameKey(97L);
        long long20 = dateTimeZone0.previousTransition((long) '4');
        int int22 = dateTimeZone0.getOffsetFromLocal(79200025L);
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone0.getName((-115200090L), locale24);
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone0.getName(396600110L, locale27);
        int int30 = dateTimeZone0.getStandardOffset((-660001L));
        long long34 = dateTimeZone0.convertLocalToUTC(3600001L, true, 111600001L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 52L + "'", long20 == 52L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00" + "'", str25, "+00:00");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00" + "'", str28, "+00:00");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 3600001L + "'", long34 == 3600001L);
    }

    @Test
    public void test20527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20527");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) 10);
        java.lang.String str4 = dateTimeZone0.getName((long) (short) 1);
        long long6 = dateTimeZone0.convertUTCToLocal((long) ' ');
        long long8 = dateTimeZone0.convertUTCToLocal((long) (short) 100);
        java.lang.String str9 = dateTimeZone0.getID();
        int int11 = dateTimeZone0.getStandardOffset(360600032L);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forID("UTC");
        boolean boolean16 = dateTimeZone15.isFixed();
        java.lang.String str18 = dateTimeZone15.getShortName((long) '4');
        long long20 = dateTimeZone15.convertUTCToLocal((long) (short) 10);
        long long22 = dateTimeZone13.getMillisKeepLocal(dateTimeZone15, (long) '4');
        org.joda.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = dateTimeZone13.isLocalDateTimeGap(localDateTime23);
        long long26 = dateTimeZone13.convertUTCToLocal((long) (short) -1);
        java.lang.String str27 = dateTimeZone13.toString();
        int int29 = dateTimeZone13.getStandardOffset(35999999L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        long long32 = dateTimeZone0.getMillisKeepLocal(dateTimeZone13, (long) 360060000);
        java.util.TimeZone timeZone33 = dateTimeZone0.toTimeZone();
        long long35 = dateTimeZone0.nextTransition(0L);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone36);
        int int39 = dateTimeZone36.getStandardOffset((-1L));
        int int41 = dateTimeZone36.getOffset((long) (short) 1);
        org.joda.time.ReadableInstant readableInstant42 = null;
        int int43 = dateTimeZone36.getOffset(readableInstant42);
        java.lang.String str45 = dateTimeZone36.getNameKey(0L);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        long long49 = dateTimeZone36.getMillisKeepLocal(dateTimeZone47, (-35999965L));
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        long long52 = dateTimeZone47.getMillisKeepLocal(dateTimeZone50, (long) ' ');
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 10);
        java.util.Locale locale56 = null;
        java.lang.String str57 = dateTimeZone54.getName(0L, locale56);
        java.lang.String str59 = dateTimeZone54.getShortName((long) (-1));
        boolean boolean61 = dateTimeZone54.isStandardOffset(0L);
        long long63 = dateTimeZone54.convertUTCToLocal(10L);
        int int65 = dateTimeZone54.getOffset(35L);
        long long67 = dateTimeZone47.getMillisKeepLocal(dateTimeZone54, 97L);
        java.util.Locale locale69 = null;
        java.lang.String str70 = dateTimeZone47.getName(32L, locale69);
        long long72 = dateTimeZone0.getMillisKeepLocal(dateTimeZone47, 0L);
        long long75 = dateTimeZone0.convertLocalToUTC((long) 3600000, true);
        long long78 = dateTimeZone0.adjustOffset((-60600000L), false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 36000052L + "'", long22 == 36000052L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 35999999L + "'", long26 == 35999999L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+10:00" + "'", str27, "+10:00");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 36000000 + "'", int29 == 36000000);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 324060000L + "'", long32 == 324060000L);
        org.junit.Assert.assertNotNull(timeZone33);
        org.junit.Assert.assertEquals(timeZone33.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 36000000 + "'", int39 == 36000000);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 36000000 + "'", int41 == 36000000);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 36000000 + "'", int43 == 36000000);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 25L + "'", long49 == 25L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-35999958L) + "'", long52 == (-35999958L));
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "+00:00:00.010" + "'", str57, "+00:00:00.010");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "+00:00:00.010" + "'", str59, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 20L + "'", long63 == 20L);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 10 + "'", int65 == 10);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 97L + "'", long67 == 97L);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "+00:00:00.010" + "'", str70, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + (-10L) + "'", long72 == (-10L));
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 3600000L + "'", long75 == 3600000L);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + (-60600000L) + "'", long78 == (-60600000L));
    }

    @Test
    public void test20528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20528");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        boolean boolean3 = dateTimeZone1.isFixed();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        boolean boolean6 = dateTimeZone4.isStandardOffset((long) 10);
        int int8 = dateTimeZone4.getOffset((long) (short) 10);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone4.getName((long) 0, locale10);
        java.lang.String str13 = dateTimeZone4.getNameKey((long) (byte) 1);
        boolean boolean14 = dateTimeZone4.isFixed();
        long long16 = dateTimeZone4.previousTransition((long) 0);
        boolean boolean17 = dateTimeZone1.equals((java.lang.Object) 0);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        boolean boolean20 = dateTimeZone18.isStandardOffset((long) 10);
        java.lang.String str22 = dateTimeZone18.getName((long) (short) 1);
        long long24 = dateTimeZone18.convertUTCToLocal((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        boolean boolean27 = dateTimeZone25.isStandardOffset((long) 10);
        int int29 = dateTimeZone25.getOffset((long) (short) 10);
        long long32 = dateTimeZone25.adjustOffset((long) 'a', true);
        boolean boolean33 = dateTimeZone25.isFixed();
        long long35 = dateTimeZone18.getMillisKeepLocal(dateTimeZone25, (long) (-1));
        java.lang.String str37 = dateTimeZone18.getName(81120025L);
        long long39 = dateTimeZone1.getMillisKeepLocal(dateTimeZone18, (long) 360000000);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone40);
        int int43 = dateTimeZone40.getStandardOffset((-1L));
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.UTC;
        boolean boolean46 = dateTimeZone44.isStandardOffset((long) 10);
        java.lang.String str48 = dateTimeZone44.getName((long) 'a');
        long long51 = dateTimeZone44.convertLocalToUTC((long) (short) 100, false);
        long long53 = dateTimeZone40.getMillisKeepLocal(dateTimeZone44, 10L);
        java.util.Locale locale55 = null;
        java.lang.String str56 = dateTimeZone44.getShortName(97L, locale55);
        int int58 = dateTimeZone44.getOffsetFromLocal((long) 360060000);
        org.joda.time.LocalDateTime localDateTime59 = null;
        boolean boolean60 = dateTimeZone44.isLocalDateTimeGap(localDateTime59);
        boolean boolean61 = dateTimeZone1.equals((java.lang.Object) localDateTime59);
        java.lang.String str63 = dateTimeZone1.getShortName(3600011L);
        int int65 = dateTimeZone1.getOffset((-35999858L));
        int int67 = dateTimeZone1.getOffsetFromLocal(3599999L);
        java.util.Locale locale69 = null;
        java.lang.String str70 = dateTimeZone1.getName((-148199975L), locale69);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int73 = dateTimeZone1.getOffsetFromLocal((-298800034L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 32L + "'", long24 == 32L);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 97L + "'", long32 == 97L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:00" + "'", str37, "+00:00");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 360000052L + "'", long39 == 360000052L);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 36000000 + "'", int43 == 36000000);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+00:00" + "'", str48, "+00:00");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 100L + "'", long51 == 100L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 36000010L + "'", long53 == 36000010L);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "+00:00" + "'", str56, "+00:00");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "+00:00:00.052" + "'", str63, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 52 + "'", int65 == 52);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 52 + "'", int67 == 52);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "+00:00:00.052" + "'", str70, "+00:00:00.052");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 52 + "'", int73 == 52);
    }

    @Test
    public void test20529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20529");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) 10);
        java.lang.String str4 = dateTimeZone0.getName((long) 'a');
        long long6 = dateTimeZone0.nextTransition((long) '4');
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone0.getShortName(100L, locale8);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        int int14 = dateTimeZone11.getStandardOffset((-1L));
        int int16 = dateTimeZone11.getOffset((long) (short) 1);
        long long18 = dateTimeZone0.getMillisKeepLocal(dateTimeZone11, 0L);
        long long20 = dateTimeZone0.previousTransition((-35999975L));
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone0.getOffset(readableInstant21);
        long long24 = dateTimeZone0.nextTransition((-280799975L));
        java.lang.String str26 = dateTimeZone0.getShortName((long) 100);
        boolean boolean28 = dateTimeZone0.isStandardOffset((long) 35);
        java.lang.String str30 = dateTimeZone0.getShortName(3660031L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-35999975L) + "'", long20 == (-35999975L));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-280799975L) + "'", long24 == (-280799975L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00" + "'", str26, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00" + "'", str30, "+00:00");
    }

    @Test
    public void test20530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20530");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) 10);
        java.lang.String str4 = dateTimeZone0.getName((long) 'a');
        long long7 = dateTimeZone0.convertLocalToUTC((long) (short) 100, false);
        boolean boolean9 = dateTimeZone0.equals((java.lang.Object) 100);
        java.lang.String str10 = dateTimeZone0.getID();
        java.lang.String str11 = dateTimeZone0.getID();
        java.lang.String str13 = dateTimeZone0.getName((long) (short) 0);
        java.lang.String str15 = dateTimeZone0.getShortName((long) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forID("+00:35");
        java.lang.String str19 = dateTimeZone18.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        long long22 = dateTimeZone0.getMillisKeepLocal(dateTimeZone18, 36599990L);
        org.joda.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = dateTimeZone18.isLocalDateTimeGap(localDateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:35" + "'", str19, "+00:35");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 34499990L + "'", long22 == 34499990L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test20531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20531");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) 10);
        int int4 = dateTimeZone0.getOffset((long) (short) 10);
        java.util.TimeZone timeZone5 = dateTimeZone0.toTimeZone();
        java.lang.String str7 = dateTimeZone0.getNameKey((-115200090L));
        long long9 = dateTimeZone0.previousTransition((long) 'a');
        java.util.TimeZone timeZone10 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj12 = null;
        boolean boolean13 = dateTimeZone11.equals(obj12);
        java.lang.String str15 = dateTimeZone11.getName(100L);
        java.lang.String str16 = dateTimeZone11.getID();
        java.util.TimeZone timeZone17 = dateTimeZone11.toTimeZone();
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone11.getName(100L, locale19);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forID("+00:00");
        long long24 = dateTimeZone11.getMillisKeepLocal(dateTimeZone22, (long) (byte) 1);
        int int26 = dateTimeZone11.getOffset((-35999975L));
        long long30 = dateTimeZone11.convertLocalToUTC((long) '4', true, (long) 360000000);
        java.lang.String str31 = dateTimeZone11.getID();
        java.util.TimeZone timeZone32 = dateTimeZone11.toTimeZone();
        boolean boolean33 = dateTimeZone0.equals((java.lang.Object) timeZone32);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 52L + "'", long30 == 52L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "UTC" + "'", str31, "UTC");
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test20532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20532");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) 10);
        java.lang.String str4 = dateTimeZone0.getName((long) (short) 1);
        long long6 = dateTimeZone0.convertUTCToLocal((long) ' ');
        long long8 = dateTimeZone0.nextTransition(1L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone0.getOffset(readableInstant9);
        java.lang.String str11 = dateTimeZone0.toString();
        java.lang.Object obj12 = null;
        boolean boolean13 = dateTimeZone0.equals(obj12);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        boolean boolean16 = dateTimeZone14.isStandardOffset((long) 10);
        int int18 = dateTimeZone14.getOffset((long) (short) 10);
        boolean boolean20 = dateTimeZone14.equals((java.lang.Object) 0);
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone14.getShortName((long) (short) 0, locale22);
        java.lang.String str25 = dateTimeZone14.getName((long) 10);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        boolean boolean28 = dateTimeZone26.isStandardOffset((long) 10);
        java.lang.String str30 = dateTimeZone26.getName((long) (short) 1);
        long long32 = dateTimeZone26.convertUTCToLocal((long) ' ');
        long long34 = dateTimeZone26.convertUTCToLocal((long) (short) 100);
        int int36 = dateTimeZone26.getOffset((long) (short) 10);
        boolean boolean37 = dateTimeZone14.equals((java.lang.Object) dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forID("UTC");
        long long41 = dateTimeZone26.getMillisKeepLocal(dateTimeZone39, 107L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone39);
        long long44 = dateTimeZone39.previousTransition(79200024L);
        int int46 = dateTimeZone39.getOffset((-360059948L));
        java.lang.String str48 = dateTimeZone39.getName(396600110L);
        java.lang.String str49 = dateTimeZone39.getID();
        java.lang.String str50 = dateTimeZone39.getID();
        boolean boolean51 = dateTimeZone0.equals((java.lang.Object) str50);
        long long54 = dateTimeZone0.adjustOffset(3600010L, false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00" + "'", str25, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00" + "'", str30, "+00:00");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 32L + "'", long32 == 32L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 100L + "'", long34 == 100L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 107L + "'", long41 == 107L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 79200024L + "'", long44 == 79200024L);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+00:00" + "'", str48, "+00:00");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "UTC" + "'", str49, "UTC");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "UTC" + "'", str50, "UTC");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 3600010L + "'", long54 == 3600010L);
    }

    @Test
    public void test20533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20533");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("UTC");
        boolean boolean2 = dateTimeZone1.isFixed();
        java.lang.String str4 = dateTimeZone1.getShortName((long) '4');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long7 = dateTimeZone1.nextTransition((long) 100);
        java.lang.String str8 = dateTimeZone1.getID();
        long long12 = dateTimeZone1.convertLocalToUTC(10L, false, (-1L));
        long long15 = dateTimeZone1.convertLocalToUTC(0L, true);
        java.lang.String str17 = dateTimeZone1.getShortName((-115199900L));
        java.lang.String str18 = dateTimeZone1.getID();
        boolean boolean20 = dateTimeZone1.equals((java.lang.Object) 52L);
        java.util.TimeZone timeZone21 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
    }

    @Test
    public void test20534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20534");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        int int3 = dateTimeZone0.getStandardOffset((-1L));
        int int5 = dateTimeZone0.getOffset((long) (short) 1);
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        long long11 = dateTimeZone8.convertLocalToUTC((long) (byte) -1, false);
        java.lang.String str13 = dateTimeZone8.getName(7200010L);
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone8.isLocalDateTimeGap(localDateTime14);
        long long17 = dateTimeZone8.convertUTCToLocal(467520014L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 467520014L + "'", long17 == 467520014L);
    }

    @Test
    public void test20535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20535");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00");
        java.lang.String str3 = dateTimeZone1.getName((long) (short) 0);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getShortName((long) (short) 100, locale7);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone1.isLocalDateTimeGap(localDateTime9);
        java.lang.String str11 = dateTimeZone1.getID();
        long long14 = dateTimeZone1.convertLocalToUTC(0L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test20536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20536");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj1 = null;
        boolean boolean2 = dateTimeZone0.equals(obj1);
        java.lang.String str4 = dateTimeZone0.getName(100L);
        boolean boolean5 = dateTimeZone0.isFixed();
        long long7 = dateTimeZone0.nextTransition((long) (-1));
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone0.getName((long) ' ', locale9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone0.getOffset(readableInstant11);
        java.lang.String str13 = dateTimeZone0.toString();
        int int15 = dateTimeZone0.getStandardOffset(36000052L);
        java.lang.String str16 = dateTimeZone0.getID();
        long long19 = dateTimeZone0.convertLocalToUTC((-115200032L), false);
        boolean boolean20 = dateTimeZone0.isFixed();
        java.lang.String str22 = dateTimeZone0.getName((long) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        boolean boolean25 = dateTimeZone23.isStandardOffset((long) 10);
        int int27 = dateTimeZone23.getOffset((long) (short) 10);
        long long30 = dateTimeZone23.adjustOffset((long) 'a', true);
        org.joda.time.ReadableInstant readableInstant31 = null;
        int int32 = dateTimeZone23.getOffset(readableInstant31);
        long long36 = dateTimeZone23.convertLocalToUTC((-1L), true, (long) (short) 10);
        int int38 = dateTimeZone23.getOffset((-1L));
        java.lang.String str39 = dateTimeZone23.toString();
        long long42 = dateTimeZone23.convertLocalToUTC(3600010L, true);
        java.util.Locale locale44 = null;
        java.lang.String str45 = dateTimeZone23.getName(281400000L, locale44);
        long long47 = dateTimeZone0.getMillisKeepLocal(dateTimeZone23, (-115200190L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-115200032L) + "'", long19 == (-115200032L));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 97L + "'", long30 == 97L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "UTC" + "'", str39, "UTC");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 3600010L + "'", long42 == 3600010L);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+00:00" + "'", str45, "+00:00");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-115200190L) + "'", long47 == (-115200190L));
    }

    @Test
    public void test20537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20537");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 'a');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        int int5 = dateTimeZone0.getOffset(515400022L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test20538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20538");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        int int3 = dateTimeZone0.getStandardOffset((-1L));
        int int5 = dateTimeZone0.getOffset((long) (short) 1);
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        boolean boolean10 = dateTimeZone8.isStandardOffset((long) 10);
        java.lang.String str12 = dateTimeZone8.getName((long) 'a');
        long long15 = dateTimeZone8.convertLocalToUTC((long) (short) 100, false);
        boolean boolean17 = dateTimeZone8.equals((java.lang.Object) 100);
        int int19 = dateTimeZone8.getOffset((long) 0);
        boolean boolean20 = dateTimeZone7.equals((java.lang.Object) dateTimeZone8);
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone8.getName((long) 1, locale22);
        java.lang.String str25 = dateTimeZone8.getName((long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant26 = null;
        int int27 = dateTimeZone8.getOffset(readableInstant26);
        java.lang.String str29 = dateTimeZone8.getName((long) (short) -1);
        org.joda.time.LocalDateTime localDateTime30 = null;
        boolean boolean31 = dateTimeZone8.isLocalDateTimeGap(localDateTime30);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        boolean boolean34 = dateTimeZone32.isStandardOffset((long) 10);
        java.lang.String str36 = dateTimeZone32.getName((long) 'a');
        long long38 = dateTimeZone32.nextTransition((long) '4');
        java.util.Locale locale40 = null;
        java.lang.String str41 = dateTimeZone32.getShortName(100L, locale40);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.UTC;
        boolean boolean45 = dateTimeZone43.isStandardOffset((long) 10);
        java.lang.String str47 = dateTimeZone43.getName((long) (short) 1);
        long long49 = dateTimeZone43.convertUTCToLocal((long) ' ');
        long long51 = dateTimeZone43.nextTransition(1L);
        java.lang.String str53 = dateTimeZone43.getNameKey(10L);
        java.util.Locale locale55 = null;
        java.lang.String str56 = dateTimeZone43.getShortName((long) (byte) 100, locale55);
        long long58 = dateTimeZone43.previousTransition((long) 'a');
        long long60 = dateTimeZone32.getMillisKeepLocal(dateTimeZone43, (long) (byte) 0);
        org.joda.time.ReadableInstant readableInstant61 = null;
        int int62 = dateTimeZone32.getOffset(readableInstant61);
        int int64 = dateTimeZone32.getOffset(35999999L);
        long long66 = dateTimeZone32.previousTransition((-359999967L));
        java.lang.String str68 = dateTimeZone32.getNameKey(3599990L);
        int int70 = dateTimeZone32.getOffsetFromLocal((long) 3120000);
        long long72 = dateTimeZone8.getMillisKeepLocal(dateTimeZone32, 324600051L);
        long long74 = dateTimeZone8.previousTransition((long) 97);
        long long77 = dateTimeZone8.adjustOffset(324060000L, false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00" + "'", str25, "+00:00");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00" + "'", str29, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00" + "'", str36, "+00:00");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 52L + "'", long38 == 52L);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00" + "'", str41, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+00:00" + "'", str47, "+00:00");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 32L + "'", long49 == 32L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 1L + "'", long51 == 1L);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "UTC" + "'", str53, "UTC");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "+00:00" + "'", str56, "+00:00");
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 97L + "'", long58 == 97L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-359999967L) + "'", long66 == (-359999967L));
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "UTC" + "'", str68, "UTC");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 324600051L + "'", long72 == 324600051L);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 97L + "'", long74 == 97L);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 324060000L + "'", long77 == 324060000L);
    }

    @Test
    public void test20539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20539");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj1 = null;
        boolean boolean2 = dateTimeZone0.equals(obj1);
        java.lang.String str4 = dateTimeZone0.getName(100L);
        java.lang.String str5 = dateTimeZone0.getID();
        boolean boolean6 = dateTimeZone0.isFixed();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) 0);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone0.getName(97L, locale10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone0.getName(36000052L, locale13);
        boolean boolean16 = dateTimeZone0.isStandardOffset((-118799991L));
        int int18 = dateTimeZone0.getStandardOffset(97L);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        boolean boolean21 = dateTimeZone19.isStandardOffset((long) 10);
        int int23 = dateTimeZone19.getOffset((long) (short) 10);
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone19.getName((long) 0, locale25);
        java.lang.String str27 = dateTimeZone19.toString();
        java.lang.String str28 = dateTimeZone19.getID();
        long long31 = dateTimeZone19.adjustOffset((long) (byte) 0, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone33);
        int int36 = dateTimeZone33.getStandardOffset((-1L));
        int int38 = dateTimeZone33.getOffset((long) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.UTC;
        long long43 = dateTimeZone39.convertLocalToUTC((long) (byte) 0, true, (long) ' ');
        boolean boolean44 = dateTimeZone33.equals((java.lang.Object) (byte) 0);
        long long46 = dateTimeZone33.convertUTCToLocal(0L);
        boolean boolean48 = dateTimeZone33.isStandardOffset((long) '#');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone33);
        long long51 = dateTimeZone19.getMillisKeepLocal(dateTimeZone33, 31L);
        long long53 = dateTimeZone0.getMillisKeepLocal(dateTimeZone19, (-320459899L));
        java.util.TimeZone timeZone54 = dateTimeZone19.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00" + "'", str26, "+00:00");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "UTC" + "'", str27, "UTC");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UTC" + "'", str28, "UTC");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 31L + "'", long51 == 31L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-320459899L) + "'", long53 == (-320459899L));
        org.junit.Assert.assertNotNull(timeZone54);
        org.junit.Assert.assertEquals(timeZone54.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test20540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20540");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) 10);
        int int4 = dateTimeZone0.getOffset((long) (short) 10);
        boolean boolean6 = dateTimeZone0.equals((java.lang.Object) 0);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone0.getShortName((long) (short) 0, locale8);
        java.lang.String str11 = dateTimeZone0.getName((long) 10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        boolean boolean14 = dateTimeZone12.isStandardOffset((long) 10);
        java.lang.String str16 = dateTimeZone12.getName((long) (short) 1);
        long long18 = dateTimeZone12.convertUTCToLocal((long) ' ');
        long long20 = dateTimeZone12.convertUTCToLocal((long) (short) 100);
        int int22 = dateTimeZone12.getOffset((long) (short) 10);
        boolean boolean23 = dateTimeZone0.equals((java.lang.Object) dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forID("UTC");
        long long27 = dateTimeZone12.getMillisKeepLocal(dateTimeZone25, 107L);
        long long31 = dateTimeZone25.convertLocalToUTC(107L, true, 360000000L);
        org.joda.time.ReadableInstant readableInstant32 = null;
        int int33 = dateTimeZone25.getOffset(readableInstant32);
        boolean boolean34 = dateTimeZone25.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone25);
        java.util.Locale locale37 = null;
        java.lang.String str38 = dateTimeZone25.getShortName(324059990L, locale37);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 107L + "'", long27 == 107L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 107L + "'", long31 == 107L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00" + "'", str38, "+00:00");
    }

    @Test
    public void test20541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20541");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00");
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        long long6 = dateTimeZone1.convertLocalToUTC((long) (-1), false);
        java.lang.String str8 = dateTimeZone1.getNameKey(0L);
        java.lang.String str10 = dateTimeZone1.getNameKey((-115199990L));
        long long12 = dateTimeZone1.previousTransition(200L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.lang.String str14 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 200L + "'", long12 == 200L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
    }

    @Test
    public void test20542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20542");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) 10);
        java.lang.String str4 = dateTimeZone0.getName((long) 'a');
        long long7 = dateTimeZone0.convertLocalToUTC((long) (short) 100, false);
        boolean boolean9 = dateTimeZone0.equals((java.lang.Object) 100);
        java.lang.String str10 = dateTimeZone0.getID();
        java.lang.String str11 = dateTimeZone0.getID();
        java.lang.String str13 = dateTimeZone0.getName((long) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forID("+00:00:00.032");
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forID("+00:00");
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = dateTimeZone17.isLocalDateTimeGap(localDateTime18);
        long long21 = dateTimeZone15.getMillisKeepLocal(dateTimeZone17, (long) 360600000);
        boolean boolean22 = dateTimeZone0.equals((java.lang.Object) long21);
        long long24 = dateTimeZone0.nextTransition(360060000L);
        long long26 = dateTimeZone0.convertUTCToLocal(54599990L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 360600032L + "'", long21 == 360600032L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 360060000L + "'", long24 == 360060000L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 54599990L + "'", long26 == 54599990L);
    }

    @Test
    public void test20543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20543");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(349260000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20544");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (byte) 0);
        int int4 = dateTimeZone2.getOffset(31L);
        boolean boolean6 = dateTimeZone2.isStandardOffset(128519990L);
        java.lang.String str7 = dateTimeZone2.toString();
        java.lang.String str9 = dateTimeZone2.getNameKey(540001L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3600000 + "'", int4 == 3600000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+01:00" + "'", str7, "+01:00");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test20545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20545");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) 10);
        java.lang.String str4 = dateTimeZone0.getName((long) 'a');
        long long6 = dateTimeZone0.nextTransition((long) '4');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.String str8 = dateTimeZone0.getID();
        int int10 = dateTimeZone0.getOffset(396600110L);
        long long13 = dateTimeZone0.convertLocalToUTC(3600020L, false);
        java.lang.String str14 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3600020L + "'", long13 == 3600020L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
    }

    @Test
    public void test20546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20546");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) 10);
        int int4 = dateTimeZone0.getOffset((long) (short) 10);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone0.getName((long) 0, locale6);
        java.lang.String str8 = dateTimeZone0.toString();
        java.lang.String str9 = dateTimeZone0.getID();
        long long13 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, false, 97L);
        long long16 = dateTimeZone0.convertLocalToUTC((long) (short) 10, false);
        java.util.TimeZone timeZone17 = dateTimeZone0.toTimeZone();
        long long20 = dateTimeZone0.adjustOffset(360000052L, true);
        long long22 = dateTimeZone0.convertUTCToLocal((-360059948L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        java.lang.String str26 = dateTimeZone25.getID();
        boolean boolean27 = dateTimeZone25.isFixed();
        java.lang.String str29 = dateTimeZone25.getShortName(52L);
        org.joda.time.ReadableInstant readableInstant30 = null;
        int int31 = dateTimeZone25.getOffset(readableInstant30);
        java.lang.String str33 = dateTimeZone25.getName((-187199975L));
        long long35 = dateTimeZone0.getMillisKeepLocal(dateTimeZone25, (-280799975L));
        boolean boolean37 = dateTimeZone25.isStandardOffset(3119990L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 360000052L + "'", long20 == 360000052L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-360059948L) + "'", long22 == (-360059948L));
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.001" + "'", str26, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00:00.001" + "'", str29, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00:00.001" + "'", str33, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-280799976L) + "'", long35 == (-280799976L));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test20547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20547");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) 10);
        java.lang.String str4 = dateTimeZone0.getName((long) (short) 1);
        long long7 = dateTimeZone0.convertLocalToUTC((long) '#', true);
        long long10 = dateTimeZone0.adjustOffset((long) (short) 10, true);
        java.util.TimeZone timeZone11 = dateTimeZone0.toTimeZone();
        java.lang.String str13 = dateTimeZone0.getNameKey((long) (short) 100);
        java.lang.String str15 = dateTimeZone0.getShortName((long) (byte) 1);
        long long17 = dateTimeZone0.convertUTCToLocal(0L);
        java.lang.String str19 = dateTimeZone0.getNameKey((-395999975L));
        java.lang.String str20 = dateTimeZone0.getID();
        java.lang.String str22 = dateTimeZone0.getShortName(36599999L);
        org.joda.time.LocalDateTime localDateTime23 = null;
        boolean boolean24 = dateTimeZone0.isLocalDateTimeGap(localDateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test20548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20548");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 0);
        long long5 = dateTimeZone1.convertLocalToUTC(360600032L, true, 324060000L);
        java.lang.Class<?> wildcardClass6 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 360600032L + "'", long5 == 360600032L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test20549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20549");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) 10);
        java.lang.String str4 = dateTimeZone0.getName((long) (short) 1);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone0.getOffset(readableInstant5);
        int int8 = dateTimeZone0.getStandardOffset((long) '4');
        long long10 = dateTimeZone0.nextTransition((long) 115200000);
        int int12 = dateTimeZone0.getStandardOffset((-835199990L));
        java.lang.String str13 = dateTimeZone0.getID();
        long long15 = dateTimeZone0.nextTransition(37919989L);
        java.util.TimeZone timeZone16 = dateTimeZone0.toTimeZone();
        long long20 = dateTimeZone0.convertLocalToUTC(511799990L, true, (-396599958L));
        long long22 = dateTimeZone0.previousTransition((-42119910L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 115200000L + "'", long10 == 115200000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 37919989L + "'", long15 == 37919989L);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 511799990L + "'", long20 == 511799990L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-42119910L) + "'", long22 == (-42119910L));
    }

    @Test
    public void test20550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20550");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) 10);
        int int4 = dateTimeZone0.getOffset((long) (short) 10);
        boolean boolean6 = dateTimeZone0.equals((java.lang.Object) 0);
        long long8 = dateTimeZone0.nextTransition((-475199990L));
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        int int12 = dateTimeZone9.getStandardOffset((-1L));
        int int14 = dateTimeZone9.getOffset((long) (short) 1);
        java.util.TimeZone timeZone15 = dateTimeZone9.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        java.lang.String str20 = dateTimeZone18.getNameKey((long) 0);
        long long23 = dateTimeZone18.convertLocalToUTC(32L, true);
        org.joda.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = dateTimeZone18.isLocalDateTimeGap(localDateTime24);
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeZone18.getName(20L, locale27);
        boolean boolean30 = dateTimeZone18.isStandardOffset(111L);
        long long32 = dateTimeZone0.getMillisKeepLocal(dateTimeZone18, 0L);
        java.lang.String str33 = dateTimeZone18.getID();
        java.lang.String str35 = dateTimeZone18.getNameKey((-313200000L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-475199990L) + "'", long8 == (-475199990L));
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00" + "'", str28, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "UTC" + "'", str33, "UTC");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "UTC" + "'", str35, "UTC");
    }

    @Test
    public void test20551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20551");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) 10);
        java.lang.String str4 = dateTimeZone0.getName((long) (short) 1);
        long long6 = dateTimeZone0.convertUTCToLocal((long) ' ');
        long long8 = dateTimeZone0.nextTransition(1L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone0.getOffset(readableInstant9);
        java.lang.String str11 = dateTimeZone0.toString();
        int int13 = dateTimeZone0.getOffset(684060010L);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        boolean boolean16 = dateTimeZone14.isStandardOffset((long) 10);
        java.lang.String str18 = dateTimeZone14.getName((long) (short) 1);
        long long20 = dateTimeZone14.convertUTCToLocal((long) ' ');
        long long22 = dateTimeZone14.nextTransition(1L);
        long long26 = dateTimeZone14.convertLocalToUTC((long) ' ', true, (long) (byte) -1);
        java.lang.String str28 = dateTimeZone14.getName((long) 10);
        org.joda.time.LocalDateTime localDateTime29 = null;
        boolean boolean30 = dateTimeZone14.isLocalDateTimeGap(localDateTime29);
        long long32 = dateTimeZone0.getMillisKeepLocal(dateTimeZone14, 0L);
        java.lang.String str34 = dateTimeZone0.getShortName((-3599900L));
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.UTC;
        boolean boolean37 = dateTimeZone35.isStandardOffset((long) 10);
        int int39 = dateTimeZone35.getOffset((long) (short) 10);
        java.util.Locale locale41 = null;
        java.lang.String str42 = dateTimeZone35.getName((long) 0, locale41);
        java.lang.String str44 = dateTimeZone35.getNameKey((long) (byte) 1);
        int int46 = dateTimeZone35.getOffsetFromLocal(99L);
        int int48 = dateTimeZone35.getStandardOffset((-71999979L));
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.UTC;
        long long53 = dateTimeZone49.convertLocalToUTC((long) (byte) 0, true, (long) ' ');
        int int55 = dateTimeZone49.getStandardOffset((long) (short) 10);
        long long57 = dateTimeZone49.nextTransition((long) (short) 1);
        long long59 = dateTimeZone35.getMillisKeepLocal(dateTimeZone49, (-39599965L));
        boolean boolean60 = dateTimeZone0.equals((java.lang.Object) (-39599965L));
        int int62 = dateTimeZone0.getOffsetFromLocal((-3599953L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32L + "'", long26 == 32L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00" + "'", str28, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00" + "'", str34, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00" + "'", str42, "+00:00");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "UTC" + "'", str44, "UTC");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 1L + "'", long57 == 1L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-39599965L) + "'", long59 == (-39599965L));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test20552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20552");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) 10);
        java.lang.String str4 = dateTimeZone0.getName((long) 'a');
        long long6 = dateTimeZone0.nextTransition((long) '4');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.lang.String str9 = dateTimeZone0.getShortName((long) (short) 100);
        int int11 = dateTimeZone0.getStandardOffset((-395999975L));
        int int13 = dateTimeZone0.getOffset(3600000L);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj15 = null;
        boolean boolean16 = dateTimeZone14.equals(obj15);
        java.lang.String str18 = dateTimeZone14.getName(100L);
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = dateTimeZone14.getOffset(readableInstant19);
        long long22 = dateTimeZone14.nextTransition((-115199990L));
        org.joda.time.ReadableInstant readableInstant23 = null;
        int int24 = dateTimeZone14.getOffset(readableInstant23);
        boolean boolean25 = dateTimeZone0.equals((java.lang.Object) dateTimeZone14);
        int int27 = dateTimeZone14.getOffset(4200032L);
        boolean boolean29 = dateTimeZone14.isStandardOffset(360000122L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-115199990L) + "'", long22 == (-115199990L));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test20553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20553");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) 10);
        java.lang.String str4 = dateTimeZone0.getName((long) 'a');
        long long6 = dateTimeZone0.nextTransition((long) '4');
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone0.getShortName(100L, locale8);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        int int14 = dateTimeZone11.getStandardOffset((-1L));
        int int16 = dateTimeZone11.getOffset((long) (short) 1);
        long long18 = dateTimeZone0.getMillisKeepLocal(dateTimeZone11, 0L);
        int int20 = dateTimeZone0.getOffset(33L);
        long long22 = dateTimeZone0.previousTransition(3600030L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3600030L + "'", long22 == 3600030L);
    }

    @Test
    public void test20554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20554");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) 10);
        java.lang.String str4 = dateTimeZone0.getName((long) 'a');
        long long6 = dateTimeZone0.nextTransition((long) '4');
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone0.getOffset(readableInstant7);
        long long10 = dateTimeZone0.nextTransition((long) (byte) 0);
        int int12 = dateTimeZone0.getOffsetFromLocal(0L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        int int15 = dateTimeZone0.getStandardOffset(71999999L);
        long long19 = dateTimeZone0.convertLocalToUTC(0L, true, 0L);
        int int21 = dateTimeZone0.getStandardOffset((long) 39120000);
        java.lang.String str22 = dateTimeZone0.getID();
        java.lang.String str23 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
    }

    @Test
    public void test20555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20555");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forID("+00:00");
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone3.getOffset(readableInstant4);
        long long8 = dateTimeZone3.convertLocalToUTC((long) (-1), false);
        java.lang.String str10 = dateTimeZone3.getNameKey(0L);
        long long12 = dateTimeZone3.convertUTCToLocal((long) 0);
        boolean boolean13 = dateTimeZone1.equals((java.lang.Object) dateTimeZone3);
        long long16 = dateTimeZone1.adjustOffset((-831599990L), true);
        boolean boolean17 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-831599990L) + "'", long16 == (-831599990L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test20556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20556");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) 10);
        int int4 = dateTimeZone0.getOffset((long) (short) 10);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone0.getName((long) 0, locale6);
        java.lang.String str8 = dateTimeZone0.toString();
        long long12 = dateTimeZone0.convertLocalToUTC(100L, true, (long) ' ');
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone0.getOffset(readableInstant13);
        java.lang.String str16 = dateTimeZone0.getShortName(79200025L);
        int int18 = dateTimeZone0.getOffsetFromLocal((-35999903L));
        long long20 = dateTimeZone0.nextTransition(0L);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        int int23 = dateTimeZone21.getStandardOffset((long) 'a');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone21);
        org.joda.time.ReadableInstant readableInstant25 = null;
        int int26 = dateTimeZone21.getOffset(readableInstant25);
        java.util.TimeZone timeZone27 = dateTimeZone21.toTimeZone();
        long long29 = dateTimeZone21.nextTransition(107L);
        long long31 = dateTimeZone21.nextTransition(361920000L);
        long long33 = dateTimeZone0.getMillisKeepLocal(dateTimeZone21, (-709800001L));
        int int35 = dateTimeZone21.getStandardOffset(79200034L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 107L + "'", long29 == 107L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 361920000L + "'", long31 == 361920000L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-709800001L) + "'", long33 == (-709800001L));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test20557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20557");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) 10);
        int int4 = dateTimeZone0.getOffset((long) (short) 10);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone0.getName((long) 0, locale6);
        java.lang.String str9 = dateTimeZone0.getNameKey((long) (byte) 1);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone0.getOffset(readableInstant10);
        long long14 = dateTimeZone0.adjustOffset(36000000L, false);
        java.lang.String str16 = dateTimeZone0.getName(71999999L);
        boolean boolean17 = dateTimeZone0.isFixed();
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone0.getName(3600122L, locale19);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 36000000L + "'", long14 == 36000000L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
    }

    @Test
    public void test20558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20558");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj1 = null;
        boolean boolean2 = dateTimeZone0.equals(obj1);
        java.lang.String str4 = dateTimeZone0.getName(100L);
        java.lang.String str5 = dateTimeZone0.getID();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone0.getName(100L, locale8);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forID("+00:00");
        long long13 = dateTimeZone0.getMillisKeepLocal(dateTimeZone11, (long) (byte) 1);
        java.lang.String str15 = dateTimeZone0.getNameKey((-35999999L));
        java.util.TimeZone timeZone16 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        int int20 = dateTimeZone18.getStandardOffset((-187199975L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test20559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20559");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        int int3 = dateTimeZone0.getStandardOffset((-1L));
        int int5 = dateTimeZone0.getOffset((long) (short) 1);
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        java.util.TimeZone timeZone7 = dateTimeZone0.toTimeZone();
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone0.getName(32L, locale9);
        boolean boolean11 = dateTimeZone0.isFixed();
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = dateTimeZone0.isLocalDateTimeGap(localDateTime12);
        boolean boolean14 = dateTimeZone0.isFixed();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) 10);
        int int19 = dateTimeZone15.getOffset((long) (short) 10);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone15.getName((long) 0, locale21);
        java.lang.String str23 = dateTimeZone15.toString();
        java.lang.String str24 = dateTimeZone15.getID();
        int int26 = dateTimeZone15.getOffsetFromLocal((long) (byte) 10);
        int int28 = dateTimeZone15.getOffset((long) (byte) 0);
        long long30 = dateTimeZone0.getMillisKeepLocal(dateTimeZone15, 132L);
        int int32 = dateTimeZone0.getOffset(79200133L);
        java.lang.String str34 = dateTimeZone0.getNameKey((-3660000L));
        java.lang.String str35 = dateTimeZone0.toString();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj37 = null;
        boolean boolean38 = dateTimeZone36.equals(obj37);
        java.lang.String str40 = dateTimeZone36.getName(100L);
        boolean boolean41 = dateTimeZone36.isFixed();
        long long43 = dateTimeZone36.nextTransition((long) (-1));
        boolean boolean44 = dateTimeZone36.isFixed();
        java.lang.String str46 = dateTimeZone36.getName((long) (short) 100);
        long long48 = dateTimeZone36.convertUTCToLocal((-25199975L));
        int int50 = dateTimeZone36.getOffset(3600010L);
        java.lang.String str51 = dateTimeZone36.getID();
        int int53 = dateTimeZone36.getOffsetFromLocal((-115199959L));
        long long55 = dateTimeZone0.getMillisKeepLocal(dateTimeZone36, 357000000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTC" + "'", str24, "UTC");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 132L + "'", long30 == 132L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "UTC" + "'", str34, "UTC");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "UTC" + "'", str35, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00" + "'", str40, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1L) + "'", long43 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00" + "'", str46, "+00:00");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-25199975L) + "'", long48 == (-25199975L));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "UTC" + "'", str51, "UTC");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 357000000L + "'", long55 == 357000000L);
    }

    @Test
    public void test20560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20560");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj1 = null;
        boolean boolean2 = dateTimeZone0.equals(obj1);
        java.lang.String str4 = dateTimeZone0.getName(100L);
        java.lang.String str5 = dateTimeZone0.getID();
        boolean boolean6 = dateTimeZone0.isFixed();
        int int8 = dateTimeZone0.getOffsetFromLocal((long) 0);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        int int12 = dateTimeZone9.getStandardOffset((-1L));
        int int14 = dateTimeZone9.getOffset((long) (short) 1);
        java.util.TimeZone timeZone15 = dateTimeZone9.toTimeZone();
        java.util.TimeZone timeZone16 = dateTimeZone9.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        boolean boolean19 = dateTimeZone0.equals((java.lang.Object) timeZone16);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        boolean boolean22 = dateTimeZone20.isStandardOffset((long) 10);
        int int24 = dateTimeZone20.getOffset((long) (short) 10);
        boolean boolean26 = dateTimeZone20.isStandardOffset((long) (short) 1);
        long long30 = dateTimeZone20.convertLocalToUTC(97L, false, 10L);
        boolean boolean31 = dateTimeZone0.equals((java.lang.Object) 97L);
        java.util.Locale locale33 = null;
        java.lang.String str34 = dateTimeZone0.getName((long) 0, locale33);
        java.util.Locale locale36 = null;
        java.lang.String str37 = dateTimeZone0.getName(79200133L, locale36);
        org.joda.time.LocalDateTime localDateTime38 = null;
        boolean boolean39 = dateTimeZone0.isLocalDateTimeGap(localDateTime38);
        java.util.TimeZone timeZone40 = dateTimeZone0.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 97L + "'", long30 == 97L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00" + "'", str34, "+00:00");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:00" + "'", str37, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(timeZone40);
        org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test20561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20561");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) 10);
        java.lang.String str4 = dateTimeZone0.getName((long) (short) 1);
        long long6 = dateTimeZone0.convertUTCToLocal((long) ' ');
        long long8 = dateTimeZone0.nextTransition(1L);
        java.lang.String str10 = dateTimeZone0.getNameKey(10L);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        int int14 = dateTimeZone11.getStandardOffset((-1L));
        int int16 = dateTimeZone11.getOffset((long) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        long long21 = dateTimeZone17.convertLocalToUTC((long) (byte) 0, true, (long) ' ');
        boolean boolean22 = dateTimeZone11.equals((java.lang.Object) (byte) 0);
        long long24 = dateTimeZone0.getMillisKeepLocal(dateTimeZone11, (long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        boolean boolean27 = dateTimeZone25.isStandardOffset((long) 10);
        java.lang.String str29 = dateTimeZone25.getName((long) 'a');
        long long31 = dateTimeZone25.nextTransition((long) '4');
        java.util.Locale locale33 = null;
        java.lang.String str34 = dateTimeZone25.getShortName(100L, locale33);
        long long38 = dateTimeZone25.convertLocalToUTC(10L, false, (long) (short) 10);
        boolean boolean39 = dateTimeZone11.equals((java.lang.Object) 10L);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone40);
        int int43 = dateTimeZone40.getStandardOffset((-1L));
        int int45 = dateTimeZone40.getOffset((long) (short) 1);
        java.util.TimeZone timeZone46 = dateTimeZone40.toTimeZone();
        java.util.TimeZone timeZone47 = dateTimeZone40.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forTimeZone(timeZone47);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forTimeZone(timeZone47);
        long long52 = dateTimeZone49.adjustOffset((long) (byte) 100, false);
        int int54 = dateTimeZone49.getOffset(3600010L);
        boolean boolean55 = dateTimeZone11.equals((java.lang.Object) 3600010L);
        long long57 = dateTimeZone11.nextTransition((-396599958L));
        long long59 = dateTimeZone11.previousTransition((long) (-3600000));
        java.lang.Class<?> wildcardClass60 = dateTimeZone11.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00" + "'", str29, "+00:00");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 52L + "'", long31 == 52L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00" + "'", str34, "+00:00");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 10L + "'", long38 == 10L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(timeZone46);
        org.junit.Assert.assertEquals(timeZone46.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone47);
        org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 100L + "'", long52 == 100L);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-396599958L) + "'", long57 == (-396599958L));
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-3600000L) + "'", long59 == (-3600000L));
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test20562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20562");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forID("Etc/UTC");
        java.lang.String str5 = dateTimeZone4.toString();
        long long8 = dateTimeZone4.convertLocalToUTC((long) ' ', false);
        long long10 = dateTimeZone0.getMillisKeepLocal(dateTimeZone4, (long) 360000000);
        java.lang.String str12 = dateTimeZone0.getNameKey((long) 0);
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone0.isLocalDateTimeGap(localDateTime13);
        long long17 = dateTimeZone0.adjustOffset((-35999903L), false);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 10);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone19.getName(10L, locale21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        int int24 = dateTimeZone19.getOffset(readableInstant23);
        long long27 = dateTimeZone19.adjustOffset(3600000L, false);
        boolean boolean29 = dateTimeZone19.equals((java.lang.Object) 20L);
        long long31 = dateTimeZone19.convertUTCToLocal(115200031L);
        boolean boolean32 = dateTimeZone0.equals((java.lang.Object) dateTimeZone19);
        long long35 = dateTimeZone19.adjustOffset(360000132L, false);
        java.lang.String str37 = dateTimeZone19.getName(4200032L);
        int int39 = dateTimeZone19.getStandardOffset((-125999910L));
        java.util.TimeZone timeZone40 = dateTimeZone19.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Etc/UTC" + "'", str5, "Etc/UTC");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 360000000L + "'", long10 == 360000000L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-35999903L) + "'", long17 == (-35999903L));
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.010" + "'", str22, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 3600000L + "'", long27 == 3600000L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 115200041L + "'", long31 == 115200041L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 360000132L + "'", long35 == 360000132L);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:00:00.010" + "'", str37, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertNotNull(timeZone40);
        org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test20563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20563");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj1 = null;
        boolean boolean2 = dateTimeZone0.equals(obj1);
        java.lang.String str4 = dateTimeZone0.getName(100L);
        java.lang.String str5 = dateTimeZone0.getID();
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone0.isLocalDateTimeGap(localDateTime7);
        java.util.TimeZone timeZone9 = dateTimeZone0.toTimeZone();
        java.lang.String str10 = dateTimeZone0.getID();
        java.util.TimeZone timeZone11 = dateTimeZone0.toTimeZone();
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone0.getOffset(readableInstant12);
        java.util.TimeZone timeZone14 = dateTimeZone0.toTimeZone();
        long long18 = dateTimeZone0.convertLocalToUTC((-181679865L), false, 0L);
        java.lang.Class<?> wildcardClass19 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-181679865L) + "'", long18 == (-181679865L));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test20564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20564");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) 10);
        java.lang.String str4 = dateTimeZone0.getName((long) (short) 1);
        long long7 = dateTimeZone0.convertLocalToUTC((long) '#', true);
        long long10 = dateTimeZone0.adjustOffset((long) (short) 10, true);
        java.util.TimeZone timeZone11 = dateTimeZone0.toTimeZone();
        java.lang.String str13 = dateTimeZone0.getNameKey((long) (short) 100);
        java.lang.String str15 = dateTimeZone0.getNameKey((long) 0);
        java.lang.String str17 = dateTimeZone0.getName((-395999975L));
        boolean boolean19 = dateTimeZone0.isStandardOffset(114720024L);
        org.joda.time.LocalDateTime localDateTime20 = null;
        boolean boolean21 = dateTimeZone0.isLocalDateTimeGap(localDateTime20);
        java.lang.String str23 = dateTimeZone0.getNameKey((long) 97);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
    }

    @Test
    public void test20565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20565");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) 10);
        int int4 = dateTimeZone0.getOffset((long) (short) 10);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone0.getName((long) 0, locale6);
        long long10 = dateTimeZone0.adjustOffset((long) (byte) 1, false);
        java.lang.String str12 = dateTimeZone0.getNameKey((long) (short) 10);
        long long14 = dateTimeZone0.previousTransition((-115199990L));
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone0.isLocalDateTimeGap(localDateTime15);
        java.lang.String str17 = dateTimeZone0.toString();
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = dateTimeZone0.isLocalDateTimeGap(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-115199990L) + "'", long14 == (-115199990L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test20566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20566");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) 10);
        java.lang.String str4 = dateTimeZone0.getName((long) (short) 1);
        long long6 = dateTimeZone0.convertUTCToLocal((long) ' ');
        long long8 = dateTimeZone0.nextTransition(1L);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone0.getOffset(readableInstant9);
        java.lang.String str11 = dateTimeZone0.toString();
        boolean boolean13 = dateTimeZone0.isStandardOffset(0L);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone0.getName(100L, locale15);
        java.lang.String str18 = dateTimeZone0.getName(360000142L);
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone0.getName((-111599989L), locale20);
        long long23 = dateTimeZone0.convertUTCToLocal((-324000011L));
        long long25 = dateTimeZone0.convertUTCToLocal(356340008L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-324000011L) + "'", long23 == (-324000011L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 356340008L + "'", long25 == 356340008L);
    }

    @Test
    public void test20567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20567");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        boolean boolean5 = dateTimeZone3.isStandardOffset((long) 10);
        int int7 = dateTimeZone3.getOffset((long) (short) 10);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone3.getName((long) 0, locale9);
        java.lang.String str11 = dateTimeZone3.toString();
        java.lang.String str12 = dateTimeZone3.getID();
        long long16 = dateTimeZone3.convertLocalToUTC((long) (byte) -1, false, 97L);
        long long19 = dateTimeZone3.convertLocalToUTC((long) (short) 10, false);
        java.lang.String str21 = dateTimeZone3.getShortName((long) ' ');
        long long23 = dateTimeZone1.getMillisKeepLocal(dateTimeZone3, (-35999975L));
        long long25 = dateTimeZone3.nextTransition(100L);
        java.lang.String str27 = dateTimeZone3.getName((-511199991L));
        int int29 = dateTimeZone3.getOffset((long) 3120000);
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone3.getShortName(360599990L, locale31);
        org.joda.time.ReadableInstant readableInstant33 = null;
        int int34 = dateTimeZone3.getOffset(readableInstant33);
        java.lang.String str35 = dateTimeZone3.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+35:00" + "'", str2, "+35:00");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 90000025L + "'", long23 == 90000025L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "UTC" + "'", str35, "UTC");
    }

    @Test
    public void test20568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20568");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) 10);
        java.lang.String str4 = dateTimeZone0.getName((long) 'a');
        long long7 = dateTimeZone0.convertLocalToUTC((long) (short) 100, false);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone0.getName(67L, locale9);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
    }

    @Test
    public void test20569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20569");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) 10);
        java.lang.String str4 = dateTimeZone0.getName((long) 'a');
        long long7 = dateTimeZone0.convertLocalToUTC((long) (short) 100, false);
        boolean boolean9 = dateTimeZone0.equals((java.lang.Object) 100);
        java.lang.String str10 = dateTimeZone0.getID();
        java.lang.String str11 = dateTimeZone0.getID();
        java.lang.String str13 = dateTimeZone0.getName((long) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forID("+00:00:00.032");
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forID("+00:00");
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = dateTimeZone17.isLocalDateTimeGap(localDateTime18);
        long long21 = dateTimeZone15.getMillisKeepLocal(dateTimeZone17, (long) 360600000);
        boolean boolean22 = dateTimeZone0.equals((java.lang.Object) long21);
        long long24 = dateTimeZone0.nextTransition(360060000L);
        java.lang.String str25 = dateTimeZone0.getID();
        long long28 = dateTimeZone0.adjustOffset(3600010L, false);
        long long31 = dateTimeZone0.adjustOffset(7200111L, false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 360600032L + "'", long21 == 360600032L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 360060000L + "'", long24 == 360060000L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTC" + "'", str25, "UTC");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 3600010L + "'", long28 == 3600010L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 7200111L + "'", long31 == 7200111L);
    }

    @Test
    public void test20570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20570");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("UTC");
        boolean boolean2 = dateTimeZone1.isFixed();
        java.lang.String str4 = dateTimeZone1.getShortName((long) '4');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long7 = dateTimeZone1.nextTransition((long) 100);
        long long10 = dateTimeZone1.adjustOffset(1L, true);
        java.lang.String str12 = dateTimeZone1.getNameKey((long) 1);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        boolean boolean15 = dateTimeZone13.isStandardOffset((long) 10);
        int int17 = dateTimeZone13.getOffset((long) (short) 10);
        boolean boolean19 = dateTimeZone13.equals((java.lang.Object) 0);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone13.getShortName((long) (short) 0, locale21);
        java.lang.String str24 = dateTimeZone13.getName((long) 10);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        boolean boolean27 = dateTimeZone25.isStandardOffset((long) 10);
        java.lang.String str29 = dateTimeZone25.getName((long) (short) 1);
        long long31 = dateTimeZone25.convertUTCToLocal((long) ' ');
        long long33 = dateTimeZone25.convertUTCToLocal((long) (short) 100);
        int int35 = dateTimeZone25.getOffset((long) (short) 10);
        boolean boolean36 = dateTimeZone13.equals((java.lang.Object) dateTimeZone25);
        boolean boolean37 = dateTimeZone25.isFixed();
        org.joda.time.ReadableInstant readableInstant38 = null;
        int int39 = dateTimeZone25.getOffset(readableInstant38);
        boolean boolean40 = dateTimeZone1.equals((java.lang.Object) readableInstant38);
        long long43 = dateTimeZone1.convertLocalToUTC(3600099L, true);
        long long45 = dateTimeZone1.previousTransition(71999989L);
        java.lang.String str47 = dateTimeZone1.getNameKey(14400025L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00" + "'", str29, "+00:00");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 32L + "'", long31 == 32L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 100L + "'", long33 == 100L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 3600099L + "'", long43 == 3600099L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 71999989L + "'", long45 == 71999989L);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "UTC" + "'", str47, "UTC");
    }

    @Test
    public void test20571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20571");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) 10);
        int int4 = dateTimeZone0.getOffset((long) (short) 10);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone0.getName((long) 0, locale6);
        java.lang.String str8 = dateTimeZone0.toString();
        java.lang.String str9 = dateTimeZone0.getID();
        long long13 = dateTimeZone0.convertLocalToUTC((long) (byte) -1, false, 97L);
        long long16 = dateTimeZone0.convertLocalToUTC((long) (short) 10, false);
        java.lang.String str17 = dateTimeZone0.toString();
        java.util.TimeZone timeZone18 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone19);
    }

    @Test
    public void test20572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20572");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 'a');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone0.getOffset(readableInstant4);
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        boolean boolean9 = dateTimeZone7.isStandardOffset((-360000001L));
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        boolean boolean12 = dateTimeZone10.isStandardOffset((long) 10);
        int int14 = dateTimeZone10.getOffset((long) (short) 10);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone10.getName((long) 0, locale16);
        java.lang.String str18 = dateTimeZone10.toString();
        java.lang.String str19 = dateTimeZone10.getID();
        long long22 = dateTimeZone10.adjustOffset((long) (byte) 0, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone24);
        int int27 = dateTimeZone24.getStandardOffset((-1L));
        int int29 = dateTimeZone24.getOffset((long) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        long long34 = dateTimeZone30.convertLocalToUTC((long) (byte) 0, true, (long) ' ');
        boolean boolean35 = dateTimeZone24.equals((java.lang.Object) (byte) 0);
        long long37 = dateTimeZone24.convertUTCToLocal(0L);
        boolean boolean39 = dateTimeZone24.isStandardOffset((long) '#');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone24);
        long long42 = dateTimeZone10.getMillisKeepLocal(dateTimeZone24, 31L);
        long long44 = dateTimeZone7.getMillisKeepLocal(dateTimeZone10, 39600010L);
        long long47 = dateTimeZone10.convertLocalToUTC((-169319964L), true);
        int int49 = dateTimeZone10.getStandardOffset(0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 31L + "'", long42 == 31L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 39600010L + "'", long44 == 39600010L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-169319964L) + "'", long47 == (-169319964L));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test20573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20573");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(360000000);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName(42L, locale3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName(90000025L, locale6);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getName((-395999975L), locale9);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forID("UTC");
        boolean boolean15 = dateTimeZone14.isFixed();
        java.lang.String str17 = dateTimeZone14.getShortName((long) '4');
        long long19 = dateTimeZone14.convertUTCToLocal((long) (short) 10);
        long long21 = dateTimeZone12.getMillisKeepLocal(dateTimeZone14, (long) '4');
        org.joda.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = dateTimeZone12.isLocalDateTimeGap(localDateTime22);
        long long25 = dateTimeZone12.convertUTCToLocal((long) (short) -1);
        java.lang.String str26 = dateTimeZone12.toString();
        int int28 = dateTimeZone12.getStandardOffset(35999999L);
        java.lang.String str30 = dateTimeZone12.getShortName(0L);
        long long32 = dateTimeZone1.getMillisKeepLocal(dateTimeZone12, (-349200000L));
        org.joda.time.ReadableInstant readableInstant33 = null;
        int int34 = dateTimeZone12.getOffset(readableInstant33);
        java.util.Locale locale36 = null;
        java.lang.String str37 = dateTimeZone12.getName(126059990L, locale36);
        java.lang.String str39 = dateTimeZone12.getName(3600101L);
        boolean boolean41 = dateTimeZone12.isStandardOffset((-115200001L));
        java.lang.Class<?> wildcardClass42 = dateTimeZone12.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+100:00" + "'", str4, "+100:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+100:00" + "'", str7, "+100:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+100:00" + "'", str10, "+100:00");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 36000052L + "'", long21 == 36000052L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 35999999L + "'", long25 == 35999999L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+10:00" + "'", str26, "+10:00");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 36000000 + "'", int28 == 36000000);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+10:00" + "'", str30, "+10:00");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-25200000L) + "'", long32 == (-25200000L));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 36000000 + "'", int34 == 36000000);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+10:00" + "'", str37, "+10:00");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+10:00" + "'", str39, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test20574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20574");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        int int3 = dateTimeZone0.getStandardOffset((-1L));
        int int5 = dateTimeZone0.getOffset((long) (short) 1);
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        long long11 = dateTimeZone8.convertLocalToUTC((long) (byte) -1, false);
        java.lang.String str13 = dateTimeZone8.getName(7200010L);
        java.lang.String str15 = dateTimeZone8.getNameKey(36600000L);
        java.lang.String str16 = dateTimeZone8.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
    }

    @Test
    public void test20575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20575");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (byte) 1);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        long long5 = dateTimeZone2.convertUTCToLocal((long) (byte) -1);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone2.getShortName(324060010L, locale7);
        long long12 = dateTimeZone2.convertLocalToUTC(0L, false, 122L);
        java.lang.String str14 = dateTimeZone2.getName(187200035L);
        long long16 = dateTimeZone2.previousTransition(115200041L);
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = dateTimeZone2.getOffset(readableInstant17);
        long long20 = dateTimeZone2.nextTransition((-264899900L));
        long long22 = dateTimeZone2.convertUTCToLocal(81120025L);
        long long24 = dateTimeZone2.convertUTCToLocal(396539990L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "GMT+:0:01");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 360059999L + "'", long5 == 360059999L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+100:01" + "'", str8, "+100:01");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-360060000L) + "'", long12 == (-360060000L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+100:01" + "'", str14, "+100:01");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 115200041L + "'", long16 == 115200041L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 360060000 + "'", int18 == 360060000);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-264899900L) + "'", long20 == (-264899900L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 441180025L + "'", long22 == 441180025L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 756599990L + "'", long24 == 756599990L);
    }

    @Test
    public void test20576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20576");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) 10);
        int int4 = dateTimeZone0.getOffset((long) (short) 10);
        long long7 = dateTimeZone0.adjustOffset((long) 'a', true);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forID("UTC");
        boolean boolean10 = dateTimeZone9.isFixed();
        long long14 = dateTimeZone9.convertLocalToUTC(10L, false, (long) 0);
        long long16 = dateTimeZone0.getMillisKeepLocal(dateTimeZone9, (long) 'a');
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone9.getShortName((long) 0, locale18);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        boolean boolean22 = dateTimeZone20.isStandardOffset((long) 10);
        java.lang.String str24 = dateTimeZone20.getName((long) 'a');
        long long27 = dateTimeZone20.convertLocalToUTC((long) (short) 100, false);
        boolean boolean29 = dateTimeZone20.equals((java.lang.Object) 100);
        int int31 = dateTimeZone20.getOffset((long) 0);
        long long33 = dateTimeZone20.previousTransition((long) (-3600000));
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.UTC;
        boolean boolean36 = dateTimeZone34.isStandardOffset((long) 10);
        java.lang.String str38 = dateTimeZone34.getName((long) (short) 1);
        long long40 = dateTimeZone34.convertUTCToLocal((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.UTC;
        boolean boolean43 = dateTimeZone41.isStandardOffset((long) 10);
        int int45 = dateTimeZone41.getOffset((long) (short) 10);
        long long48 = dateTimeZone41.adjustOffset((long) 'a', true);
        boolean boolean49 = dateTimeZone41.isFixed();
        long long51 = dateTimeZone34.getMillisKeepLocal(dateTimeZone41, (long) (-1));
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj53 = null;
        boolean boolean54 = dateTimeZone52.equals(obj53);
        java.lang.String str56 = dateTimeZone52.getName(100L);
        long long58 = dateTimeZone52.convertUTCToLocal((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj60 = null;
        boolean boolean61 = dateTimeZone59.equals(obj60);
        long long63 = dateTimeZone52.getMillisKeepLocal(dateTimeZone59, (long) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone59);
        boolean boolean65 = dateTimeZone34.equals((java.lang.Object) dateTimeZone59);
        boolean boolean66 = dateTimeZone20.equals((java.lang.Object) dateTimeZone59);
        java.lang.String str67 = dateTimeZone20.toString();
        long long69 = dateTimeZone9.getMillisKeepLocal(dateTimeZone20, (-35999903L));
        org.joda.time.ReadableInstant readableInstant70 = null;
        int int71 = dateTimeZone20.getOffset(readableInstant70);
        java.util.TimeZone timeZone72 = dateTimeZone20.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.UTC;
        boolean boolean75 = dateTimeZone73.isStandardOffset((long) 10);
        int int77 = dateTimeZone73.getOffset((long) (short) 10);
        java.util.Locale locale79 = null;
        java.lang.String str80 = dateTimeZone73.getName((long) 0, locale79);
        java.lang.String str81 = dateTimeZone73.toString();
        java.lang.String str82 = dateTimeZone73.getID();
        int int84 = dateTimeZone73.getOffsetFromLocal((long) (byte) 10);
        java.lang.String str86 = dateTimeZone73.getShortName(32L);
        long long89 = dateTimeZone73.adjustOffset((long) (short) 100, true);
        boolean boolean90 = dateTimeZone20.equals((java.lang.Object) long89);
        java.util.TimeZone timeZone91 = dateTimeZone20.toTimeZone();
        long long93 = dateTimeZone20.nextTransition(3600009L);
        java.lang.String str95 = dateTimeZone20.getShortName(32820089L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-3600000L) + "'", long33 == (-3600000L));
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00" + "'", str38, "+00:00");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 32L + "'", long40 == 32L);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 97L + "'", long48 == 97L);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-1L) + "'", long51 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "+00:00" + "'", str56, "+00:00");
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-1L) + "'", long58 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "UTC" + "'", str67, "UTC");
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + (-35999903L) + "'", long69 == (-35999903L));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(timeZone72);
        org.junit.Assert.assertEquals(timeZone72.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "+00:00" + "'", str80, "+00:00");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "UTC" + "'", str81, "UTC");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "UTC" + "'", str82, "UTC");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "+00:00" + "'", str86, "+00:00");
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + 100L + "'", long89 == 100L);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(timeZone91);
        org.junit.Assert.assertEquals(timeZone91.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 3600009L + "'", long93 == 3600009L);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "+00:00" + "'", str95, "+00:00");
    }

    @Test
    public void test20577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20577");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        int int3 = dateTimeZone0.getStandardOffset((-1L));
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        boolean boolean6 = dateTimeZone4.isStandardOffset((long) 10);
        java.lang.String str8 = dateTimeZone4.getName((long) 'a');
        long long11 = dateTimeZone4.convertLocalToUTC((long) (short) 100, false);
        long long13 = dateTimeZone0.getMillisKeepLocal(dateTimeZone4, 10L);
        int int15 = dateTimeZone0.getOffsetFromLocal(360600032L);
        java.util.Locale locale17 = null;
        java.lang.String str18 = dateTimeZone0.getShortName(396600001L, locale17);
        java.lang.String str20 = dateTimeZone0.getName(201660025L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
    }

    @Test
    public void test20578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20578");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (short) 0);
        long long4 = dateTimeZone2.previousTransition(360000000L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj6 = null;
        boolean boolean7 = dateTimeZone5.equals(obj6);
        java.lang.String str9 = dateTimeZone5.getName(100L);
        long long11 = dateTimeZone5.convertUTCToLocal((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj13 = null;
        boolean boolean14 = dateTimeZone12.equals(obj13);
        long long16 = dateTimeZone5.getMillisKeepLocal(dateTimeZone12, (long) 0);
        java.lang.String str17 = dateTimeZone5.toString();
        boolean boolean19 = dateTimeZone5.isStandardOffset(0L);
        long long21 = dateTimeZone5.previousTransition(115200022L);
        long long23 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 360000000);
        boolean boolean25 = dateTimeZone5.isStandardOffset(3660000L);
        java.lang.String str26 = dateTimeZone5.toString();
        long long28 = dateTimeZone5.convertUTCToLocal(356940000L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 360000000L + "'", long4 == 360000000L);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 115200022L + "'", long21 == 115200022L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 360000000L + "'", long23 == 360000000L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTC" + "'", str26, "UTC");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 356940000L + "'", long28 == 356940000L);
    }

    @Test
    public void test20579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20579");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        int int3 = dateTimeZone0.getStandardOffset((-1L));
        int int5 = dateTimeZone0.getOffset((long) (short) 1);
        java.lang.String str6 = dateTimeZone0.getID();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone0.getShortName((long) (short) 0, locale8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        int int11 = dateTimeZone0.getOffset(readableInstant10);
        java.lang.String str13 = dateTimeZone0.getShortName(352800032L);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.lang.String str16 = dateTimeZone15.toString();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        boolean boolean19 = dateTimeZone17.isStandardOffset((long) 10);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        boolean boolean22 = dateTimeZone20.isStandardOffset((long) 10);
        java.lang.String str24 = dateTimeZone20.getName((long) 'a');
        long long26 = dateTimeZone20.nextTransition((long) '4');
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeZone20.getShortName(100L, locale28);
        org.joda.time.ReadableInstant readableInstant30 = null;
        int int31 = dateTimeZone20.getOffset(readableInstant30);
        boolean boolean33 = dateTimeZone20.isStandardOffset(10L);
        boolean boolean34 = dateTimeZone17.equals((java.lang.Object) dateTimeZone20);
        boolean boolean35 = dateTimeZone15.equals((java.lang.Object) dateTimeZone17);
        java.util.Locale locale37 = null;
        java.lang.String str38 = dateTimeZone15.getShortName(1L, locale37);
        long long40 = dateTimeZone0.getMillisKeepLocal(dateTimeZone15, (-32880000L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        int int43 = dateTimeZone0.getOffset((-223200109L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.001" + "'", str16, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 52L + "'", long26 == 52L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00" + "'", str29, "+00:00");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00:00.001" + "'", str38, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-32880001L) + "'", long40 == (-32880001L));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test20580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20580");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) 10);
        int int4 = dateTimeZone0.getOffset((long) (short) 10);
        boolean boolean6 = dateTimeZone0.isStandardOffset((long) (short) 1);
        long long9 = dateTimeZone0.adjustOffset((long) (short) 0, true);
        java.lang.Object obj10 = null;
        boolean boolean11 = dateTimeZone0.equals(obj10);
        org.joda.time.LocalDateTime localDateTime12 = null;
        boolean boolean13 = dateTimeZone0.isLocalDateTimeGap(localDateTime12);
        java.lang.String str14 = dateTimeZone0.toString();
        long long16 = dateTimeZone0.previousTransition((-169319964L));
        boolean boolean18 = dateTimeZone0.isStandardOffset((long) 189120000);
        long long20 = dateTimeZone0.nextTransition(328200000L);
        java.lang.String str21 = dateTimeZone0.getID();
        boolean boolean23 = dateTimeZone0.isStandardOffset(45L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-169319964L) + "'", long16 == (-169319964L));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 328200000L + "'", long20 == 328200000L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test20581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20581");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) 10);
        java.lang.String str4 = dateTimeZone0.getName((long) (short) 1);
        long long7 = dateTimeZone0.convertLocalToUTC((long) '#', true);
        long long10 = dateTimeZone0.adjustOffset((long) (short) 10, true);
        java.util.TimeZone timeZone11 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        long long14 = dateTimeZone12.nextTransition((long) (byte) 100);
        java.lang.String str16 = dateTimeZone12.getShortName(3600000L);
        java.lang.String str18 = dateTimeZone12.getNameKey((-111600000L));
        int int20 = dateTimeZone12.getOffset(285000000L);
        long long22 = dateTimeZone12.nextTransition(354359900L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 354359900L + "'", long22 == 354359900L);
    }

    @Test
    public void test20582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20582");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        int int3 = dateTimeZone0.getStandardOffset((-1L));
        int int5 = dateTimeZone0.getOffset((long) (short) 1);
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        java.util.TimeZone timeZone7 = dateTimeZone0.toTimeZone();
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone0.getName(32L, locale9);
        java.lang.String str11 = dateTimeZone0.getID();
        int int13 = dateTimeZone0.getOffset(101L);
        java.lang.String str15 = dateTimeZone0.getName((long) 1);
        long long17 = dateTimeZone0.nextTransition(71999979L);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone0.getName((-129659989L), locale19);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = dateTimeZone0.isLocalDateTimeGap(localDateTime22);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 71999979L + "'", long17 == 71999979L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test20583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20583");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) 10);
        int int4 = dateTimeZone0.getOffset((long) (short) 10);
        long long7 = dateTimeZone0.adjustOffset((long) 'a', true);
        boolean boolean8 = dateTimeZone0.isFixed();
        long long10 = dateTimeZone0.convertUTCToLocal((long) '4');
        boolean boolean11 = dateTimeZone0.isFixed();
        long long15 = dateTimeZone0.convertLocalToUTC(480089L, true, (-3600000L));
        java.lang.String str17 = dateTimeZone0.getNameKey((-60001L));
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone0.getShortName((-320459899L), locale19);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 480089L + "'", long15 == 480089L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
    }

    @Test
    public void test20584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20584");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) 10);
        java.lang.String str4 = dateTimeZone0.getName((long) 'a');
        long long7 = dateTimeZone0.convertLocalToUTC((long) (short) 100, false);
        boolean boolean9 = dateTimeZone0.equals((java.lang.Object) 100);
        java.lang.String str10 = dateTimeZone0.getID();
        java.lang.String str11 = dateTimeZone0.getID();
        java.lang.String str13 = dateTimeZone0.getName((long) (short) 0);
        long long15 = dateTimeZone0.previousTransition(35999999L);
        java.lang.String str17 = dateTimeZone0.getName(0L);
        int int19 = dateTimeZone0.getOffset((-115800032L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35999999L + "'", long15 == 35999999L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test20585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20585");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forID("Etc/UTC");
        java.lang.String str5 = dateTimeZone4.toString();
        long long8 = dateTimeZone4.convertLocalToUTC((long) ' ', false);
        long long10 = dateTimeZone0.getMillisKeepLocal(dateTimeZone4, (long) 360000000);
        java.lang.String str12 = dateTimeZone0.getNameKey((long) 0);
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone0.isLocalDateTimeGap(localDateTime13);
        java.lang.String str15 = dateTimeZone0.getID();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        boolean boolean18 = dateTimeZone16.isStandardOffset((long) 10);
        java.lang.String str20 = dateTimeZone16.getName((long) 'a');
        long long23 = dateTimeZone16.convertLocalToUTC((long) (short) 100, false);
        boolean boolean25 = dateTimeZone16.equals((java.lang.Object) 100);
        java.lang.String str26 = dateTimeZone16.getID();
        java.lang.String str27 = dateTimeZone16.getID();
        int int29 = dateTimeZone16.getOffset((long) 100);
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone16.getShortName(35999999L, locale31);
        long long35 = dateTimeZone16.convertLocalToUTC(71999989L, false);
        java.util.TimeZone timeZone36 = dateTimeZone16.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        long long41 = dateTimeZone37.convertLocalToUTC((-36000001L), true, (-43259976L));
        long long43 = dateTimeZone0.getMillisKeepLocal(dateTimeZone37, 173399999L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Etc/UTC" + "'", str5, "Etc/UTC");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 360000000L + "'", long10 == 360000000L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTC" + "'", str26, "UTC");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "UTC" + "'", str27, "UTC");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 71999989L + "'", long35 == 71999989L);
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-36000001L) + "'", long41 == (-36000001L));
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 173399999L + "'", long43 == 173399999L);
    }
}

