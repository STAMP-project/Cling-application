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
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfWeek();
        java.lang.String str5 = ethiopicChronology0.toString();
        org.joda.time.Chronology chronology6 = ethiopicChronology0.withUTC();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.minutes();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology10 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology10.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.Chronology chronology13 = ethiopicChronology10.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField14 = ethiopicChronology10.seconds();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology10.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology10.hourOfHalfday();
        org.joda.time.DurationField durationField17 = ethiopicChronology10.centuries();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = ethiopicChronology10.add(readablePeriod18, (-61001L), 4);
        boolean boolean22 = ethiopicChronology0.equals((java.lang.Object) 4);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str5, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(ethiopicChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-61001L) + "'", long21 == (-61001L));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.months();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = ethiopicChronology0.getDateTimeMillis(0, 0, (int) ' ', 1, 10, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        java.lang.String str7 = ethiopicChronology0.toString();
        java.lang.String str8 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.hourOfDay();
        org.joda.time.DurationField durationField16 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str7, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str8, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.minuteOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology4 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean6 = ethiopicChronology4.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology4.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology4.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology4.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology4.era();
        boolean boolean11 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology4);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(ethiopicChronology4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.hourOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology3 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long7 = ethiopicChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = ethiopicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = ethiopicChronology3.days();
        boolean boolean11 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology3);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DurationField durationField13 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(ethiopicChronology3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 98L + "'", long7 == 98L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.hourOfHalfday();
        java.lang.String str4 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.millisOfDay();
        int int6 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str4, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.weeks();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        java.lang.String str7 = ethiopicChronology0.toString();
        java.lang.String str8 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.year();
        org.joda.time.DurationField durationField13 = ethiopicChronology0.millis();
        org.joda.time.DurationField durationField14 = ethiopicChronology0.halfdays();
        int int15 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str7, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str8, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.dayOfWeek();
        int int9 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.dayOfYear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = ethiopicChronology0.add(readablePeriod7, (long) (-1), 1);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.hourOfDay();
        org.joda.time.DurationField durationField15 = ethiopicChronology0.hours();
        long long19 = ethiopicChronology0.add((-47280066589999L), 619L, (int) (byte) 10);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-47280066583809L) + "'", long19 == (-47280066583809L));
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.halfdayOfDay();
        java.lang.String str10 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.seconds();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str10, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone10 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology12 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone10, 1);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology13 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone10);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(ethiopicChronology12);
        org.junit.Assert.assertNotNull(ethiopicChronology13);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.secondOfDay();
        org.joda.time.Chronology chronology8 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.clockhourOfHalfday();
        int int10 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone6);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone6);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertNotNull(ethiopicChronology8);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean9 = ethiopicChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology7.yearOfCentury();
        org.joda.time.DurationField durationField12 = ethiopicChronology7.years();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology7.dayOfYear();
        boolean boolean14 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology7);
        java.lang.String str15 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology0.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = ethiopicChronology0.add(readablePeriod17, (-937L), 0);
        org.joda.time.DateTimeField dateTimeField21 = ethiopicChronology0.dayOfYear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str15, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-937L) + "'", long20 == (-937L));
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology3 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long7 = ethiopicChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology3.halfdayOfDay();
        org.joda.time.DurationField durationField9 = ethiopicChronology3.halfdays();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology10 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean12 = ethiopicChronology10.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology10.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology10.monthOfYear();
        boolean boolean15 = ethiopicChronology3.equals((java.lang.Object) ethiopicChronology10);
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology10.hourOfHalfday();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology17 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean19 = ethiopicChronology17.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology17.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone21 = ethiopicChronology17.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology22 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone21);
        org.joda.time.Chronology chronology23 = ethiopicChronology10.withZone(dateTimeZone21);
        org.joda.time.Chronology chronology24 = ethiopicChronology0.withZone(dateTimeZone21);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray28 = ethiopicChronology0.get(readablePeriod25, (-85799990L), 530L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(ethiopicChronology3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 98L + "'", long7 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(ethiopicChronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(ethiopicChronology17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(ethiopicChronology22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(chronology24);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.halfdays();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean9 = ethiopicChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology7.monthOfYear();
        boolean boolean12 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology7);
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.weekyear();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology14 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology14.millisOfDay();
        org.joda.time.DurationField durationField16 = ethiopicChronology14.seconds();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = ethiopicChronology14.add(readablePeriod17, (long) (byte) 10, (int) (byte) 100);
        boolean boolean21 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology14);
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField23 = ethiopicChronology0.weeks();
        org.joda.time.DurationField durationField24 = ethiopicChronology0.days();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(ethiopicChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(durationField24);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.hourOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology3 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long7 = ethiopicChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = ethiopicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = ethiopicChronology3.days();
        boolean boolean11 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology3);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology3.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology3.millisOfDay();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology3.era();
        org.joda.time.ReadablePartial readablePartial15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ethiopicChronology3.get(readablePartial15, (-85799990L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(ethiopicChronology3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 98L + "'", long7 == 98L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology6 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField7 = ethiopicChronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology6.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology6.year();
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = ethiopicChronology6.set(readablePartial10, (-61870003199968L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(ethiopicChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DurationField durationField3 = ethiopicChronology0.seconds();
        int int4 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.years();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.era();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.year();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }
}

