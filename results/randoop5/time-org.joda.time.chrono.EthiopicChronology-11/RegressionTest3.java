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
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.millisOfSecond();
        java.lang.String str6 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.secondOfMinute();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology10 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long14 = ethiopicChronology10.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField15 = ethiopicChronology10.weekyears();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology10.weekOfWeekyear();
        java.lang.String str17 = ethiopicChronology10.toString();
        org.joda.time.DurationField durationField18 = ethiopicChronology10.minutes();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology19 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean21 = ethiopicChronology19.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology19.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField23 = ethiopicChronology19.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone24 = ethiopicChronology19.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology25 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone24);
        org.joda.time.Chronology chronology26 = ethiopicChronology10.withZone(dateTimeZone24);
        org.joda.time.Chronology chronology27 = ethiopicChronology0.withZone(dateTimeZone24);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str6, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(ethiopicChronology10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 98L + "'", long14 == 98L);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str17, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(ethiopicChronology19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(ethiopicChronology25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(chronology27);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.halfdays();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean9 = ethiopicChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology7.monthOfYear();
        boolean boolean12 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology7);
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology7.hourOfHalfday();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology14 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean16 = ethiopicChronology14.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology14.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = ethiopicChronology14.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology19 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone18);
        org.joda.time.Chronology chronology20 = ethiopicChronology7.withZone(dateTimeZone18);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology21 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone18);
        // The following exception was thrown during execution in test generation
        try {
            long long29 = ethiopicChronology21.getDateTimeMillis((int) (short) 100, (int) (short) -1, (int) '#', (int) (byte) 0, (int) (short) -1, (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(ethiopicChronology19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(ethiopicChronology21);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.secondOfDay();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        long long4 = ethiopicChronology0.add(readablePeriod1, 3501L, (int) 'a');
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.seconds();
        org.joda.time.Chronology chronology7 = ethiopicChronology0.withUTC();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean10 = ethiopicChronology8.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology8.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology8.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = ethiopicChronology8.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology14 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology14.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = ethiopicChronology14.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology17 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone16);
        org.joda.time.Chronology chronology18 = ethiopicChronology0.withZone(dateTimeZone16);
        org.joda.time.Chronology chronology19 = ethiopicChronology0.withUTC();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3501L + "'", long4 == 3501L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(ethiopicChronology8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(ethiopicChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(ethiopicChronology17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(chronology19);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.hourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.weeks();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.minutes();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology5 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology5.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.Chronology chronology8 = ethiopicChronology5.withZone(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology5.dayOfWeek();
        java.lang.String str10 = ethiopicChronology5.toString();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology5.secondOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology12 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology12.millisOfDay();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology12.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = ethiopicChronology12.getZone();
        org.joda.time.Chronology chronology16 = ethiopicChronology5.withZone(dateTimeZone15);
        org.joda.time.DurationField durationField17 = ethiopicChronology5.years();
        boolean boolean18 = ethiopicChronology0.equals((java.lang.Object) durationField17);
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology0.year();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(ethiopicChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str10, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(ethiopicChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
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
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.minuteOfDay();
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
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = ethiopicChronology0.add(readablePeriod7, (-47250220L), (int) 'a');
        org.joda.time.chrono.EthiopicChronology ethiopicChronology11 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long15 = ethiopicChronology11.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology11.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology11.weekyearOfCentury();
        org.joda.time.DurationField durationField18 = ethiopicChronology11.centuries();
        org.joda.time.Chronology chronology19 = ethiopicChronology11.withUTC();
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology11.dayOfWeek();
        boolean boolean21 = ethiopicChronology0.equals((java.lang.Object) dateTimeField20);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-47250220L) + "'", long10 == (-47250220L));
        org.junit.Assert.assertNotNull(ethiopicChronology11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 98L + "'", long15 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        long long10 = ethiopicChronology0.getDateTimeMillis((int) (byte) 100, 1, (int) (short) 1, 0);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-58769884800000L) + "'", long10 == (-58769884800000L));
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField12 = ethiopicChronology0.centuries();
        int int13 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = ethiopicChronology0.add(readablePeriod7, (long) (-1), 1);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.minuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ethiopicChronology0.get(readablePeriod12, (-85799990L), (-58840473595999L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.clockhourOfHalfday();
        java.lang.Class<?> wildcardClass9 = ethiopicChronology0.getClass();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.secondOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.hours();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.days();
        org.joda.time.Chronology chronology5 = ethiopicChronology0.withUTC();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology6 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long10 = ethiopicChronology6.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField11 = ethiopicChronology6.years();
        java.lang.String str12 = ethiopicChronology6.toString();
        org.joda.time.DateTimeZone dateTimeZone13 = ethiopicChronology6.getZone();
        org.joda.time.Chronology chronology14 = ethiopicChronology0.withZone(dateTimeZone13);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(ethiopicChronology6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 98L + "'", long10 == 98L);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str12, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(chronology14);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.halfdays();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean9 = ethiopicChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology7.monthOfYear();
        boolean boolean12 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology7);
        org.joda.time.DurationField durationField13 = ethiopicChronology7.centuries();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology7.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology7.dayOfMonth();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.dayOfYear();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.days();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.monthOfYear();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.weeks();
        java.lang.Class<?> wildcardClass8 = durationField7.getClass();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.millisOfSecond();
        java.lang.String str6 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.millis();
        java.lang.String str8 = ethiopicChronology0.toString();
        long long12 = ethiopicChronology0.add(14723467L, (-47279968L), (-1));
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str6, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str8, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 62003435L + "'", long12 == 62003435L);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = ethiopicChronology0.add(readablePeriod7, (long) (-1), 1);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.hourOfHalfday();
        java.lang.String str13 = ethiopicChronology0.toString();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str13, "EthiopicChronology[Etc/UTC]");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology5 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone4);
        org.joda.time.DurationField durationField6 = ethiopicChronology5.centuries();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology5.dayOfMonth();
        org.joda.time.DurationField durationField8 = ethiopicChronology5.hours();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(ethiopicChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.dayOfWeek();
        int int11 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.era();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.secondOfMinute();
        long long7 = ethiopicChronology0.add((long) (-1), (long) (short) 100, 0);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology8.hourOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology11 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long15 = ethiopicChronology11.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField16 = ethiopicChronology11.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology11.weekOfWeekyear();
        org.joda.time.DurationField durationField18 = ethiopicChronology11.days();
        boolean boolean19 = ethiopicChronology8.equals((java.lang.Object) ethiopicChronology11);
        org.joda.time.DateTimeZone dateTimeZone20 = ethiopicChronology11.getZone();
        org.joda.time.Chronology chronology21 = ethiopicChronology0.withZone(dateTimeZone20);
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(ethiopicChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(ethiopicChronology11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 98L + "'", long15 == 98L);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.hourOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology3 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long7 = ethiopicChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = ethiopicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = ethiopicChronology3.days();
        boolean boolean11 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology3);
        org.joda.time.DateTimeZone dateTimeZone12 = ethiopicChronology3.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology14 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone12, 4);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology15 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone12);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology16 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology16.dayOfYear();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology16.hourOfHalfday();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(ethiopicChronology3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 98L + "'", long7 == 98L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(ethiopicChronology14);
        org.junit.Assert.assertNotNull(ethiopicChronology15);
        org.junit.Assert.assertNotNull(ethiopicChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = ethiopicChronology0.getZone();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = ethiopicChronology0.get(readablePeriod8, (long) 10, (-4L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weekyears();
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = ethiopicChronology0.get(readablePartial7, 102L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = ethiopicChronology0.get(readablePeriod3, (-58840471094966L), (-47251200L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekyear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.millisOfSecond();
        java.lang.String str9 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str9, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfWeek();
        java.lang.String str5 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.months();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.centuries();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str5, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = ethiopicChronology0.getDateTimeMillis((int) (byte) 100, (int) (short) 100, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,13]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = ethiopicChronology0.add(readablePeriod7, (long) (-1), 1);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField13 = ethiopicChronology0.halfdays();
        org.joda.time.ReadablePartial readablePartial14 = null;
        int[] intArray16 = new int[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            ethiopicChronology0.validate(readablePartial14, intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10]");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withUTC();
        int int4 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.dayOfYear();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.days();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.yearOfCentury();
        long long16 = ethiopicChronology0.getDateTimeMillis((long) (byte) -1, 0, (int) '4', (int) (short) 1, 10);
        org.joda.time.DurationField durationField17 = ethiopicChronology0.halfdays();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-83278990L) + "'", long16 == (-83278990L));
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        long long4 = ethiopicChronology0.add(readablePeriod1, 3501L, (int) 'a');
        org.joda.time.chrono.EthiopicChronology ethiopicChronology5 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean7 = ethiopicChronology5.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology5.halfdayOfDay();
        org.joda.time.DurationField durationField9 = ethiopicChronology5.millis();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology5.minuteOfHour();
        org.joda.time.DurationField durationField11 = ethiopicChronology5.years();
        org.joda.time.DateTimeZone dateTimeZone12 = ethiopicChronology5.getZone();
        org.joda.time.Chronology chronology13 = ethiopicChronology0.withZone(dateTimeZone12);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology14 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone12);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology15 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone12);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = ethiopicChronology15.getDateTimeMillis((int) '#', (int) (short) 0, (int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,13]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3501L + "'", long4 == 3501L);
        org.junit.Assert.assertNotNull(ethiopicChronology5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(ethiopicChronology14);
        org.junit.Assert.assertNotNull(ethiopicChronology15);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.hourOfHalfday();
        java.lang.String str4 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str4, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.monthOfYear();
        java.lang.Class<?> wildcardClass10 = ethiopicChronology0.getClass();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        long long9 = ethiopicChronology0.add((long) (short) -1, (long) ' ', (int) '4');
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.secondOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.months();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1663L + "'", long9 == 1663L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.hourOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology3 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long7 = ethiopicChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = ethiopicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = ethiopicChronology3.days();
        boolean boolean11 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology3);
        org.joda.time.DateTimeZone dateTimeZone12 = ethiopicChronology3.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology14 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone12, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology14.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology14.monthOfYear();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology14.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(ethiopicChronology3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 98L + "'", long7 == 98L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(ethiopicChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.yearOfEra();
        org.joda.time.ReadablePartial readablePartial5 = null;
        int[] intArray10 = new int[] { 1, 'a', (byte) 0, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            ethiopicChronology0.validate(readablePartial5, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 97, 0, 32]");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.hourOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology3 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long7 = ethiopicChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = ethiopicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = ethiopicChronology3.days();
        boolean boolean11 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology3);
        org.joda.time.DurationField durationField12 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = ethiopicChronology0.getDateTimeMillis((int) (byte) 1, (-1), 0, (int) (short) 100, 0, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
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
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.EthiopicChronology ethiopicChronology26 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone21, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 10");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.months();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.centuries();
        org.joda.time.Chronology chronology8 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.minuteOfHour();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = ethiopicChronology0.add(readablePeriod7, (long) (-1), 1);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField13 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.weekyearOfCentury();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.millis();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.millisOfDay();
        int int9 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withUTC();
        int int4 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.eras();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfWeek();
        java.lang.String str5 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.hourOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str5, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.halfdays();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology8.hourOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology8.weeks();
        boolean boolean12 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology8);
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology8.year();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology8.dayOfWeek();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(ethiopicChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.year();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.year();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology5 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone4);
        org.joda.time.DurationField durationField6 = ethiopicChronology5.years();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology5.weekyearOfCentury();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(ethiopicChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.weekyear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.weeks();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = ethiopicChronology0.set(readablePartial9, 15001097L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.monthOfYear();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean9 = ethiopicChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology7.halfdayOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology7.millis();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology7.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = ethiopicChronology7.add(readablePeriod14, 0L, (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone18 = ethiopicChronology7.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology19 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone18);
        org.joda.time.Chronology chronology20 = ethiopicChronology0.withZone(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField21 = ethiopicChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(ethiopicChronology19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.millis();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology3 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology3.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology3.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology3.getZone();
        boolean boolean7 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology3);
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology3.monthOfYear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(ethiopicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.hourOfHalfday();
        long long13 = ethiopicChronology0.add(102L, (-4727996799L), 100);
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.secondOfDay();
        java.lang.Class<?> wildcardClass15 = ethiopicChronology0.getClass();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-472799679798L) + "'", long13 == (-472799679798L));
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        java.lang.String str7 = ethiopicChronology0.toString();
        java.lang.String str8 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.year();
        long long14 = ethiopicChronology0.add((long) 0, 0L, (int) (short) 10);
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str7, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str8, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (-1), (int) (byte) 100);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean9 = ethiopicChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology7.halfdayOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology7.millis();
        org.joda.time.DurationField durationField12 = ethiopicChronology7.days();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology7.yearOfCentury();
        boolean boolean14 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology7);
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.yearOfCentury();
        org.joda.time.Chronology chronology16 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.millis();
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.minuteOfHour();
        org.joda.time.Chronology chronology5 = ethiopicChronology0.withUTC();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.hourOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.secondOfMinute();
        long long7 = ethiopicChronology0.add((long) (-1), (long) (short) 100, 0);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology8.hourOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology11 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long15 = ethiopicChronology11.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField16 = ethiopicChronology11.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology11.weekOfWeekyear();
        org.joda.time.DurationField durationField18 = ethiopicChronology11.days();
        boolean boolean19 = ethiopicChronology8.equals((java.lang.Object) ethiopicChronology11);
        org.joda.time.DateTimeZone dateTimeZone20 = ethiopicChronology11.getZone();
        org.joda.time.Chronology chronology21 = ethiopicChronology0.withZone(dateTimeZone20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.EthiopicChronology ethiopicChronology23 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone20, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(ethiopicChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(ethiopicChronology11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 98L + "'", long15 == 98L);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(chronology21);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        java.lang.String str1 = ethiopicChronology0.toString();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EthiopicChronology[UTC]" + "'", str1, "EthiopicChronology[UTC]");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.hourOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology3 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long7 = ethiopicChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = ethiopicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = ethiopicChronology3.days();
        boolean boolean11 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology3);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.weekyear();
        java.lang.String str13 = ethiopicChronology0.toString();
        int int14 = ethiopicChronology0.getMinimumDaysInFirstWeek();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str13, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfWeek();
        java.lang.String str5 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.yearOfEra();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.months();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str5, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = ethiopicChronology0.getDateTimeMillis((-45861568940306L), (int) '4', 0, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.halfdays();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean9 = ethiopicChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology7.monthOfYear();
        boolean boolean12 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology7);
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology7.hourOfHalfday();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology14 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean16 = ethiopicChronology14.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology14.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = ethiopicChronology14.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology19 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone18);
        org.joda.time.Chronology chronology20 = ethiopicChronology7.withZone(dateTimeZone18);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology21 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone18);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology23 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone18, (int) (short) 1);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology24 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone18);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(ethiopicChronology19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(ethiopicChronology21);
        org.junit.Assert.assertNotNull(ethiopicChronology23);
        org.junit.Assert.assertNotNull(ethiopicChronology24);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        java.lang.String str7 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str7, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.era();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.days();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.hours();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.minutes();
        org.joda.time.ReadablePartial readablePartial11 = null;
        int[] intArray13 = new int[] { '4' };
        // The following exception was thrown during execution in test generation
        try {
            ethiopicChronology0.validate(readablePartial11, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[52]");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.hourOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology3 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long7 = ethiopicChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = ethiopicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = ethiopicChronology3.days();
        boolean boolean11 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology3);
        org.joda.time.DateTimeZone dateTimeZone12 = ethiopicChronology3.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology14 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone12, 4);
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology14.weekyear();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology14.dayOfMonth();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(ethiopicChronology3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 98L + "'", long7 == 98L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(ethiopicChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = ethiopicChronology0.getDateTimeMillis(1, (int) (byte) 0, (int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,13]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.months();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology9 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean11 = ethiopicChronology9.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology9.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology9.halfdayOfDay();
        boolean boolean14 = ethiopicChronology0.equals((java.lang.Object) dateTimeField13);
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField16 = ethiopicChronology0.centuries();
        org.joda.time.DurationField durationField17 = ethiopicChronology0.seconds();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(ethiopicChronology9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.monthOfYear();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean9 = ethiopicChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology7.halfdayOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology7.millis();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology7.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = ethiopicChronology7.add(readablePeriod14, 0L, (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone18 = ethiopicChronology7.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology19 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone18);
        org.joda.time.Chronology chronology20 = ethiopicChronology0.withZone(dateTimeZone18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.EthiopicChronology ethiopicChronology22 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone18, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(ethiopicChronology19);
        org.junit.Assert.assertNotNull(chronology20);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        java.lang.String str7 = ethiopicChronology0.toString();
        java.lang.String str8 = ethiopicChronology0.toString();
        org.joda.time.DateTimeZone dateTimeZone9 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology11 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone9, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology11.year();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str7, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str8, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(ethiopicChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        java.lang.String str7 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.weeks();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.dayOfYear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str7, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.year();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DurationField durationField3 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.years();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weeks();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = ethiopicChronology0.getDateTimeMillis((int) (byte) 100, 0, 10, (int) (byte) 1, (int) (byte) 1, (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.year();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology8.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = ethiopicChronology8.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology8.yearOfCentury();
        org.joda.time.DurationField durationField13 = ethiopicChronology8.seconds();
        boolean boolean14 = ethiopicChronology0.equals((java.lang.Object) durationField13);
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology0.centuryOfEra();
        long long20 = ethiopicChronology0.add(0L, (-1L), 4);
        org.joda.time.DurationField durationField21 = ethiopicChronology0.days();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(ethiopicChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-4L) + "'", long20 == (-4L));
        org.junit.Assert.assertNotNull(durationField21);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        java.lang.String str4 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.millis();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str4, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.secondOfMinute();
        long long7 = ethiopicChronology0.add((long) (-1), (long) (short) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = ethiopicChronology0.getDateTimeMillis((int) 'a', 1, 0, (int) (short) 0, (int) (short) 10, (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.halfdays();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean9 = ethiopicChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology7.monthOfYear();
        boolean boolean12 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology7);
        org.joda.time.DurationField durationField13 = ethiopicChronology7.centuries();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology7.dayOfMonth();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology15 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology15.weekyear();
        org.joda.time.DurationField durationField17 = ethiopicChronology15.years();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = ethiopicChronology15.add(readablePeriod18, (long) (-1), (int) (byte) 100);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology22 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean24 = ethiopicChronology22.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField25 = ethiopicChronology22.halfdayOfDay();
        org.joda.time.DurationField durationField26 = ethiopicChronology22.millis();
        org.joda.time.DurationField durationField27 = ethiopicChronology22.days();
        org.joda.time.DateTimeField dateTimeField28 = ethiopicChronology22.yearOfCentury();
        boolean boolean29 = ethiopicChronology15.equals((java.lang.Object) ethiopicChronology22);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology30 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField31 = ethiopicChronology30.millisOfDay();
        org.joda.time.DurationField durationField32 = ethiopicChronology30.seconds();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        long long36 = ethiopicChronology30.add(readablePeriod33, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField37 = ethiopicChronology30.secondOfDay();
        org.joda.time.Chronology chronology38 = ethiopicChronology30.withUTC();
        boolean boolean39 = ethiopicChronology15.equals((java.lang.Object) ethiopicChronology30);
        org.joda.time.DurationField durationField40 = ethiopicChronology30.hours();
        org.joda.time.DateTimeField dateTimeField41 = ethiopicChronology30.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone42 = ethiopicChronology30.getZone();
        org.joda.time.Chronology chronology43 = ethiopicChronology7.withZone(dateTimeZone42);
        org.joda.time.DateTimeField dateTimeField44 = ethiopicChronology7.dayOfMonth();
        long long48 = ethiopicChronology7.add((long) (byte) 0, 61001L, (int) (short) -1);
        org.joda.time.ReadablePartial readablePartial49 = null;
        int[] intArray51 = new int[] { 4 };
        // The following exception was thrown during execution in test generation
        try {
            ethiopicChronology7.validate(readablePartial49, intArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(ethiopicChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNotNull(ethiopicChronology22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(ethiopicChronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10L + "'", long36 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-61001L) + "'", long48 == (-61001L));
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[4]");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfWeek();
        java.lang.String str5 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.centuries();
        java.lang.String str10 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField12 = ethiopicChronology0.centuries();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str5, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str10, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.year();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.minuteOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology5 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology5.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology5.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology5.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology5.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology5.minuteOfDay();
        boolean boolean11 = ethiopicChronology1.equals((java.lang.Object) dateTimeField10);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology1.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = ethiopicChronology1.getDateTimeMillis(100, (int) (short) 100, (int) (byte) 0, (int) (short) 0, (int) (byte) 100, 4, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(ethiopicChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.millis();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone7 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone7);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(ethiopicChronology8);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.weekyearOfCentury();
        java.lang.String str10 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.clockhourOfHalfday();
        java.lang.String str12 = ethiopicChronology0.toString();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str10, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str12, "EthiopicChronology[Etc/UTC]");
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        java.lang.String str7 = ethiopicChronology0.toString();
        java.lang.String str8 = ethiopicChronology0.toString();
        org.joda.time.DateTimeZone dateTimeZone9 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology11 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone9, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology11.dayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ethiopicChronology11.get(readablePeriod13, (long) (byte) 1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str7, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str8, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(ethiopicChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.days();
        long long11 = ethiopicChronology0.add((long) (byte) 1, (long) (short) 100, (int) '#');
        org.joda.time.DurationField durationField12 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField14 = ethiopicChronology0.weekyears();
        long long18 = ethiopicChronology0.add(3152100L, 0L, (int) (byte) -1);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology19 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long23 = ethiopicChronology19.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField24 = ethiopicChronology19.halfdayOfDay();
        org.joda.time.DurationField durationField25 = ethiopicChronology19.halfdays();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology26 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean28 = ethiopicChronology26.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField29 = ethiopicChronology26.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField30 = ethiopicChronology26.monthOfYear();
        boolean boolean31 = ethiopicChronology19.equals((java.lang.Object) ethiopicChronology26);
        org.joda.time.DurationField durationField32 = ethiopicChronology26.centuries();
        org.joda.time.DurationField durationField33 = ethiopicChronology26.centuries();
        org.joda.time.DateTimeField dateTimeField34 = ethiopicChronology26.minuteOfDay();
        boolean boolean35 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology26);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3501L + "'", long11 == 3501L);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3152100L + "'", long18 == 3152100L);
        org.junit.Assert.assertNotNull(ethiopicChronology19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 98L + "'", long23 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(ethiopicChronology26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.hourOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology3 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long7 = ethiopicChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = ethiopicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = ethiopicChronology3.days();
        boolean boolean11 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology3);
        org.joda.time.DateTimeZone dateTimeZone12 = ethiopicChronology3.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology14 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone12, 4);
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology14.weekyear();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology14.centuryOfEra();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(ethiopicChronology3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 98L + "'", long7 == 98L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(ethiopicChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone3 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.secondOfMinute();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.seconds();
        java.lang.String str9 = ethiopicChronology0.toString();
        int int10 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str9, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
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
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology0.yearOfCentury();
        long long26 = ethiopicChronology0.add((long) 1, (long) (byte) 0, (int) 'a');
        org.joda.time.DateTimeField dateTimeField27 = ethiopicChronology0.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        long long31 = ethiopicChronology0.add(readablePeriod28, (-60797865600000L), (int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-60797865600000L) + "'", long31 == (-60797865600000L));
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = ethiopicChronology0.get(readablePeriod7, 4235004L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
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
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        long long25 = ethiopicChronology0.add(readablePeriod22, (-58769625600000L), (int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-58769625600000L) + "'", long25 == (-58769625600000L));
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.secondOfMinute();
        long long7 = ethiopicChronology0.add((long) (-1), (long) (short) 100, 0);
        org.joda.time.DurationField durationField8 = ethiopicChronology0.eras();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.weekyears();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        java.lang.String str4 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.halfdays();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str4, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.hourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.dayOfYear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology3 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology3.dayOfYear();
        boolean boolean5 = ethiopicChronology0.equals((java.lang.Object) dateTimeField4);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(ethiopicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone3 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology5 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone3, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology5.yearOfEra();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(ethiopicChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.dayOfYear();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.days();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = ethiopicChronology0.add(readablePeriod11, (-47279968L), (int) 'a');
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-47279968L) + "'", long14 == (-47279968L));
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.months();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.months();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = ethiopicChronology0.getDateTimeMillis((-1L), (int) (short) 10, 4, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = ethiopicChronology0.add(readablePeriod10, (-47280066589999L), (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone14 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology15 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone14);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-47280066589999L) + "'", long13 == (-47280066589999L));
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(ethiopicChronology15);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.era();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0, 1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology2.weekyear();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        long long7 = ethiopicChronology2.add(readablePeriod4, 9700L, (int) '4');
        org.joda.time.DurationField durationField8 = ethiopicChronology2.eras();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology2.halfdayOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9700L + "'", long7 == 9700L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.year();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.secondOfDay();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.minutes();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.hourOfHalfday();
        java.lang.String str4 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = ethiopicChronology0.get(readablePartial6, (-60797865600000L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str4, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.halfdays();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean9 = ethiopicChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology7.monthOfYear();
        boolean boolean12 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology7);
        org.joda.time.DurationField durationField13 = ethiopicChronology7.centuries();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology7.dayOfMonth();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology15 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology15.weekyear();
        org.joda.time.DurationField durationField17 = ethiopicChronology15.years();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = ethiopicChronology15.add(readablePeriod18, (long) (-1), (int) (byte) 100);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology22 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean24 = ethiopicChronology22.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField25 = ethiopicChronology22.halfdayOfDay();
        org.joda.time.DurationField durationField26 = ethiopicChronology22.millis();
        org.joda.time.DurationField durationField27 = ethiopicChronology22.days();
        org.joda.time.DateTimeField dateTimeField28 = ethiopicChronology22.yearOfCentury();
        boolean boolean29 = ethiopicChronology15.equals((java.lang.Object) ethiopicChronology22);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology30 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField31 = ethiopicChronology30.millisOfDay();
        org.joda.time.DurationField durationField32 = ethiopicChronology30.seconds();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        long long36 = ethiopicChronology30.add(readablePeriod33, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField37 = ethiopicChronology30.secondOfDay();
        org.joda.time.Chronology chronology38 = ethiopicChronology30.withUTC();
        boolean boolean39 = ethiopicChronology15.equals((java.lang.Object) ethiopicChronology30);
        org.joda.time.DurationField durationField40 = ethiopicChronology30.hours();
        org.joda.time.DateTimeField dateTimeField41 = ethiopicChronology30.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone42 = ethiopicChronology30.getZone();
        org.joda.time.Chronology chronology43 = ethiopicChronology7.withZone(dateTimeZone42);
        org.joda.time.DateTimeField dateTimeField44 = ethiopicChronology7.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        long long48 = ethiopicChronology7.add(readablePeriod45, (-4L), (int) 'a');
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(ethiopicChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNotNull(ethiopicChronology22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(ethiopicChronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10L + "'", long36 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-4L) + "'", long48 == (-4L));
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = ethiopicChronology0.add(readablePeriod8, (long) '4', 1);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.hourOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology13 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology13.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.Chronology chronology16 = ethiopicChronology13.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology13.dayOfWeek();
        org.joda.time.DurationField durationField18 = ethiopicChronology13.months();
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology13.year();
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology13.era();
        org.joda.time.DateTimeField dateTimeField21 = ethiopicChronology13.weekyear();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology22 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean24 = ethiopicChronology22.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField25 = ethiopicChronology22.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField26 = ethiopicChronology22.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone27 = ethiopicChronology22.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology28 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone27);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology29 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone27);
        org.joda.time.DurationField durationField30 = ethiopicChronology29.millis();
        org.joda.time.DurationField durationField31 = ethiopicChronology29.weekyears();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        long long35 = ethiopicChronology29.add(readablePeriod32, 100L, (int) (short) -1);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology36 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField37 = ethiopicChronology36.weekyear();
        org.joda.time.DateTimeField dateTimeField38 = ethiopicChronology36.hourOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology39 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long43 = ethiopicChronology39.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField44 = ethiopicChronology39.weekyears();
        org.joda.time.DateTimeField dateTimeField45 = ethiopicChronology39.weekOfWeekyear();
        org.joda.time.DurationField durationField46 = ethiopicChronology39.days();
        boolean boolean47 = ethiopicChronology36.equals((java.lang.Object) ethiopicChronology39);
        org.joda.time.DateTimeZone dateTimeZone48 = ethiopicChronology39.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology50 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone48, (int) (byte) 1);
        org.joda.time.Chronology chronology51 = ethiopicChronology29.withZone(dateTimeZone48);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology52 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone48);
        org.joda.time.Chronology chronology53 = ethiopicChronology13.withZone(dateTimeZone48);
        org.joda.time.Chronology chronology54 = ethiopicChronology0.withZone(dateTimeZone48);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(ethiopicChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(ethiopicChronology22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(ethiopicChronology28);
        org.junit.Assert.assertNotNull(ethiopicChronology29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 100L + "'", long35 == 100L);
        org.junit.Assert.assertNotNull(ethiopicChronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(ethiopicChronology39);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 98L + "'", long43 == 98L);
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(ethiopicChronology50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(ethiopicChronology52);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(chronology54);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.millis();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology3 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology3.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology3.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology3.getZone();
        boolean boolean7 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology3);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology8.hourOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology11 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long15 = ethiopicChronology11.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField16 = ethiopicChronology11.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology11.weekOfWeekyear();
        org.joda.time.DurationField durationField18 = ethiopicChronology11.days();
        boolean boolean19 = ethiopicChronology8.equals((java.lang.Object) ethiopicChronology11);
        org.joda.time.DateTimeZone dateTimeZone20 = ethiopicChronology11.getZone();
        org.joda.time.Chronology chronology21 = ethiopicChronology3.withZone(dateTimeZone20);
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology3.millisOfDay();
        org.joda.time.DateTimeField dateTimeField23 = ethiopicChronology3.centuryOfEra();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(ethiopicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(ethiopicChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(ethiopicChronology11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 98L + "'", long15 == 98L);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology0.getZone();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.days();
        long long12 = ethiopicChronology0.getDateTimeMillis(1L, (int) (byte) 0, (int) '4', (int) ' ', (int) (short) 100);
        java.lang.String str13 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField14 = ethiopicChronology0.months();
        org.joda.time.Chronology chronology15 = ethiopicChronology0.withUTC();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3152100L + "'", long12 == 3152100L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str13, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.dayOfWeek();
        int int11 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.centuryOfEra();
        java.lang.String str13 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField14 = ethiopicChronology0.eras();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str13, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = ethiopicChronology0.getDateTimeMillis((-4L), (int) (byte) 10, (int) ' ', (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.era();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.seconds();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.secondOfDay();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.centuries();
        java.lang.String str6 = ethiopicChronology0.toString();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str6, "EthiopicChronology[Etc/UTC]");
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.halfdays();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology2.weekyearOfCentury();
        boolean boolean6 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology2);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology2.hourOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(ethiopicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ethiopicChronology0.get(readablePeriod12, 3571L, 402L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.millis();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.millis();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = ethiopicChronology0.getDateTimeMillis((int) (byte) 10, (int) (byte) 100, 1, 0, 1, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,13]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.halfdays();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean9 = ethiopicChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology7.monthOfYear();
        boolean boolean12 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology7);
        org.joda.time.DurationField durationField13 = ethiopicChronology0.weekyears();
        org.joda.time.DurationField durationField14 = ethiopicChronology0.years();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.halfdays();
        int int8 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.era();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.hourOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology3 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long7 = ethiopicChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = ethiopicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = ethiopicChronology3.days();
        boolean boolean11 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology3);
        org.joda.time.DurationField durationField12 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField15 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone16 = ethiopicChronology0.getZone();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(ethiopicChronology3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 98L + "'", long7 == 98L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.Chronology chronology8 = ethiopicChronology0.withUTC();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = ethiopicChronology0.get(readablePeriod9, (-99L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.era();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        java.lang.String str4 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str4, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
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
        org.joda.time.DurationField durationField13 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ethiopicChronology0.get(readablePeriod15, (long) (byte) -1, 62003435L);
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
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.era();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.era();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.minutes();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        java.lang.String str7 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.weeks();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.weekyears();
        long long17 = ethiopicChronology0.getDateTimeMillis((long) ' ', 4, 10, (int) (byte) 1, (int) 'a');
        org.joda.time.DurationField durationField18 = ethiopicChronology0.centuries();
        org.joda.time.DurationField durationField19 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str7, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 15001097L + "'", long17 == 15001097L);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = ethiopicChronology0.add(readablePeriod8, (long) '4', 1);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField13 = ethiopicChronology0.weeks();
        org.joda.time.DurationField durationField14 = ethiopicChronology0.seconds();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.dayOfMonth();
        long long10 = ethiopicChronology0.add(0L, 10L, (int) (short) 0);
        org.joda.time.Chronology chronology11 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.secondOfDay();
        org.joda.time.Chronology chronology13 = ethiopicChronology0.withUTC();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfWeek();
        java.lang.String str5 = ethiopicChronology0.toString();
        org.joda.time.Chronology chronology6 = ethiopicChronology0.withUTC();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.era();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str5, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (-1), (int) (byte) 100);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean9 = ethiopicChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology7.halfdayOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology7.millis();
        org.joda.time.DurationField durationField12 = ethiopicChronology7.days();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology7.yearOfCentury();
        boolean boolean14 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology7);
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField16 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = ethiopicChronology0.add(readablePeriod7, (long) (-1), 1);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField13 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField15 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        java.lang.String str7 = ethiopicChronology0.toString();
        java.lang.String str8 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.weekyear();
        java.lang.Object obj13 = null;
        boolean boolean14 = ethiopicChronology0.equals(obj13);
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.secondOfDay();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.years();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.hours();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.dayOfYear();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.seconds();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.halfdays();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology2.weekyearOfCentury();
        boolean boolean6 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology2);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology2.dayOfMonth();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(ethiopicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
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
        org.joda.time.DurationField durationField14 = ethiopicChronology0.days();
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
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        java.lang.String str7 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.yearOfCentury();
        java.lang.Class<?> wildcardClass10 = dateTimeField9.getClass();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str7, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.hourOfHalfday();
        java.lang.String str4 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str4, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekyearOfCentury();
        long long13 = ethiopicChronology0.getDateTimeMillis(9L, 10, (int) (short) 0, (int) (byte) 1, (int) '#');
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 36001035L + "'", long13 == 36001035L);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.era();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = ethiopicChronology0.get(readablePeriod7, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.millis();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology3 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology3.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology3.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology3.getZone();
        boolean boolean7 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology3);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology8.hourOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology11 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long15 = ethiopicChronology11.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField16 = ethiopicChronology11.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology11.weekOfWeekyear();
        org.joda.time.DurationField durationField18 = ethiopicChronology11.days();
        boolean boolean19 = ethiopicChronology8.equals((java.lang.Object) ethiopicChronology11);
        org.joda.time.DateTimeZone dateTimeZone20 = ethiopicChronology11.getZone();
        org.joda.time.Chronology chronology21 = ethiopicChronology3.withZone(dateTimeZone20);
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology3.millisOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology23 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean25 = ethiopicChronology23.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField26 = ethiopicChronology23.halfdayOfDay();
        org.joda.time.DurationField durationField27 = ethiopicChronology23.millis();
        org.joda.time.DateTimeField dateTimeField28 = ethiopicChronology23.minuteOfHour();
        long long32 = ethiopicChronology23.add((long) (short) -1, (long) ' ', (int) '4');
        org.joda.time.DurationField durationField33 = ethiopicChronology23.weeks();
        org.joda.time.DateTimeZone dateTimeZone34 = ethiopicChronology23.getZone();
        org.joda.time.Chronology chronology35 = ethiopicChronology3.withZone(dateTimeZone34);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(ethiopicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(ethiopicChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(ethiopicChronology11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 98L + "'", long15 == 98L);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(ethiopicChronology23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1663L + "'", long32 == 1663L);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(chronology35);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = ethiopicChronology0.add(readablePeriod7, (long) (-1), 1);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone14 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.year();
        long long19 = ethiopicChronology0.add((long) 1, (long) (short) -1, 0);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        java.lang.String str7 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.yearOfEra();
        org.joda.time.DurationField durationField13 = ethiopicChronology0.weeks();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str7, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.dayOfMonth();
        int int11 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField12 = ethiopicChronology0.days();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology13 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean15 = ethiopicChronology13.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology13.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology13.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = ethiopicChronology13.getZone();
        org.joda.time.DurationField durationField19 = ethiopicChronology13.days();
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology13.clockhourOfDay();
        org.joda.time.DurationField durationField21 = ethiopicChronology13.centuries();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology22 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField23 = ethiopicChronology22.millisOfDay();
        org.joda.time.DateTimeField dateTimeField24 = ethiopicChronology22.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone25 = ethiopicChronology22.getZone();
        org.joda.time.Chronology chronology26 = ethiopicChronology13.withZone(dateTimeZone25);
        org.joda.time.Chronology chronology27 = ethiopicChronology0.withZone(dateTimeZone25);
        org.joda.time.DurationField durationField28 = ethiopicChronology0.halfdays();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(ethiopicChronology13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(ethiopicChronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(durationField28);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.hourOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology3 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long7 = ethiopicChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = ethiopicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = ethiopicChronology3.days();
        boolean boolean11 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology3);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.Chronology chronology14 = ethiopicChronology0.withUTC();
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
        org.junit.Assert.assertNotNull(chronology14);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.months();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology9 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean11 = ethiopicChronology9.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology9.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology9.halfdayOfDay();
        boolean boolean14 = ethiopicChronology0.equals((java.lang.Object) dateTimeField13);
        org.joda.time.DurationField durationField15 = ethiopicChronology0.halfdays();
        org.joda.time.Chronology chronology16 = ethiopicChronology0.withUTC();
        org.joda.time.DurationField durationField17 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(ethiopicChronology9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology6 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField7 = ethiopicChronology6.halfdays();
        long long11 = ethiopicChronology6.add(500L, 67L, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ethiopicChronology6.get(readablePeriod12, 100L);
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 7200L + "'", long11 == 7200L);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.secondOfDay();
        org.joda.time.Chronology chronology8 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.year();
        java.lang.String str11 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = ethiopicChronology0.set(readablePartial13, (-60797865600000L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str11, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.secondOfDay();
        long long9 = ethiopicChronology0.getDateTimeMillis((int) (byte) 1, (int) (byte) 10, (int) (byte) 10, (int) ' ');
        org.joda.time.DurationField durationField10 = ethiopicChronology0.minutes();
        int int11 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology12 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology12.weekyear();
        org.joda.time.DurationField durationField14 = ethiopicChronology12.years();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = ethiopicChronology12.add(readablePeriod15, (long) (-1), (int) (byte) 100);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology19 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean21 = ethiopicChronology19.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology19.halfdayOfDay();
        org.joda.time.DurationField durationField23 = ethiopicChronology19.millis();
        org.joda.time.DurationField durationField24 = ethiopicChronology19.days();
        org.joda.time.DateTimeField dateTimeField25 = ethiopicChronology19.yearOfCentury();
        boolean boolean26 = ethiopicChronology12.equals((java.lang.Object) ethiopicChronology19);
        org.joda.time.DateTimeField dateTimeField27 = ethiopicChronology12.yearOfCentury();
        org.joda.time.Chronology chronology28 = ethiopicChronology12.withUTC();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology29 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long33 = ethiopicChronology29.add((long) 'a', 1L, (int) (short) 1);
        java.lang.String str34 = ethiopicChronology29.toString();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology35 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField36 = ethiopicChronology35.millisOfDay();
        org.joda.time.DateTimeField dateTimeField37 = ethiopicChronology35.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone38 = ethiopicChronology35.getZone();
        org.joda.time.Chronology chronology39 = ethiopicChronology29.withZone(dateTimeZone38);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology40 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone38);
        org.joda.time.Chronology chronology41 = ethiopicChronology12.withZone(dateTimeZone38);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology42 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone38);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology43 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone38);
        org.joda.time.Chronology chronology44 = ethiopicChronology0.withZone(dateTimeZone38);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-61870003199968L) + "'", long9 == (-61870003199968L));
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(ethiopicChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(ethiopicChronology19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(ethiopicChronology29);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 98L + "'", long33 == 98L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str34, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(ethiopicChronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(ethiopicChronology40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(ethiopicChronology42);
        org.junit.Assert.assertNotNull(ethiopicChronology43);
        org.junit.Assert.assertNotNull(chronology44);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone6);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology8.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = ethiopicChronology8.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology8.weekyear();
        int int15 = ethiopicChronology8.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology8.yearOfEra();
        org.joda.time.DurationField durationField18 = ethiopicChronology8.seconds();
        boolean boolean19 = ethiopicChronology7.equals((java.lang.Object) ethiopicChronology8);
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology8.centuryOfEra();
        org.joda.time.Chronology chronology21 = ethiopicChronology8.withUTC();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertNotNull(ethiopicChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(chronology21);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.halfdays();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean9 = ethiopicChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology7.monthOfYear();
        boolean boolean12 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology7);
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology7.hourOfHalfday();
        java.lang.String str14 = ethiopicChronology7.toString();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology7.centuryOfEra();
        long long21 = ethiopicChronology7.getDateTimeMillis(0L, (int) (byte) 0, (int) (byte) 0, 0, (int) (short) 1);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str14, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.millisOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology7.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.Chronology chronology10 = ethiopicChronology7.withZone(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology7.dayOfWeek();
        java.lang.String str12 = ethiopicChronology7.toString();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology7.secondOfDay();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology7.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology7.millisOfDay();
        org.joda.time.DurationField durationField16 = ethiopicChronology7.weekyears();
        boolean boolean17 = ethiopicChronology0.equals((java.lang.Object) durationField16);
        long long21 = ethiopicChronology0.add(0L, 250100L, (int) ' ');
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField23 = ethiopicChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str12, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 8003200L + "'", long21 == 8003200L);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.year();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology1.minuteOfDay();
        org.joda.time.DurationField durationField5 = ethiopicChronology1.eras();
        org.junit.Assert.assertNotNull(ethiopicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = ethiopicChronology7.years();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = ethiopicChronology7.get(readablePeriod10, 61001L, 899L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekyear();
        int int7 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.year();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = ethiopicChronology0.getDateTimeMillis((int) '#', (int) 'a', 0, (int) 'a', (int) (byte) 100, 0, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.halfdays();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean9 = ethiopicChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology7.monthOfYear();
        boolean boolean12 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology7);
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology7.monthOfYear();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology7.weekyear();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology7.millisOfSecond();
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
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.months();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology6 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology6.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = ethiopicChronology6.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology9 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = ethiopicChronology9.add(readablePeriod10, (-58769884800100L), (int) (byte) 0);
        org.joda.time.DurationField durationField14 = ethiopicChronology9.weekyears();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(ethiopicChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(ethiopicChronology9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-58769884800100L) + "'", long13 == (-58769884800100L));
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0, 1);
        org.joda.time.DurationField durationField3 = ethiopicChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology2.dayOfMonth();
        org.junit.Assert.assertNotNull(ethiopicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology6 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = ethiopicChronology6.getZone();
        org.joda.time.Chronology chronology8 = ethiopicChronology0.withZone(dateTimeZone7);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology9 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology9.halfdayOfDay();
        long long14 = ethiopicChronology9.add(32L, 250100L, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone15 = ethiopicChronology9.getZone();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(ethiopicChronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(ethiopicChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 13005232L + "'", long14 == 13005232L);
        org.junit.Assert.assertNotNull(dateTimeZone15);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.year();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean10 = ethiopicChronology8.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology8.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = ethiopicChronology8.getZone();
        boolean boolean14 = ethiopicChronology0.equals((java.lang.Object) dateTimeZone13);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(ethiopicChronology8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.days();
        org.joda.time.Chronology chronology5 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (-1), (int) (byte) 100);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean9 = ethiopicChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology7.halfdayOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology7.millis();
        org.joda.time.DurationField durationField12 = ethiopicChronology7.days();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology7.yearOfCentury();
        boolean boolean14 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology7);
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField16 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology0.hourOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long11 = ethiopicChronology7.add((long) 'a', 1L, (int) (short) 1);
        java.lang.String str12 = ethiopicChronology7.toString();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology13 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology13.millisOfDay();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology13.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = ethiopicChronology13.getZone();
        org.joda.time.Chronology chronology17 = ethiopicChronology7.withZone(dateTimeZone16);
        org.joda.time.Chronology chronology18 = ethiopicChronology0.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology0.weekyearOfCentury();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 98L + "'", long11 == 98L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str12, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(ethiopicChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.years();
        java.lang.String str6 = ethiopicChronology0.toString();
        org.joda.time.Chronology chronology7 = ethiopicChronology0.withUTC();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str6, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone3 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.dayOfYear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
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
        org.joda.time.DurationField durationField14 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology0.dayOfYear();
        org.joda.time.DurationField durationField17 = ethiopicChronology0.months();
        org.joda.time.ReadablePartial readablePartial18 = null;
        int[] intArray24 = new int[] { (byte) -1, (short) -1, '#', 4, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            ethiopicChronology0.validate(readablePartial18, intArray24);
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
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1, 35, 4, -1]");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.era();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.year();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology8.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = ethiopicChronology8.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology8.yearOfCentury();
        org.joda.time.DurationField durationField13 = ethiopicChronology8.seconds();
        boolean boolean14 = ethiopicChronology0.equals((java.lang.Object) durationField13);
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.year();
        org.joda.time.DurationField durationField16 = ethiopicChronology0.halfdays();
        java.lang.Class<?> wildcardClass17 = ethiopicChronology0.getClass();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(ethiopicChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.weekyears();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology6 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField7 = ethiopicChronology6.halfdays();
        org.joda.time.DurationField durationField8 = ethiopicChronology6.months();
        org.joda.time.DurationField durationField9 = ethiopicChronology6.years();
        long long13 = ethiopicChronology6.add(35014L, (-472799679798L), 0);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(ethiopicChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35014L + "'", long13 == 35014L);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.months();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.millis();
        org.joda.time.DateTimeZone dateTimeZone10 = ethiopicChronology0.getZone();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.seconds();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.minutes();
        org.joda.time.DurationField durationField12 = ethiopicChronology0.hours();
        org.joda.time.DateTimeZone dateTimeZone13 = ethiopicChronology0.getZone();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = ethiopicChronology0.getDateTimeMillis((int) (short) 10, (int) '4', 1, 4, (int) '4', (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for monthOfYear must be in the range [1,13]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = ethiopicChronology0.set(readablePartial9, 31466L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = ethiopicChronology0.add(readablePeriod9, (long) '4', (int) (short) 1);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        java.lang.String str7 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.years();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str7, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.hourOfHalfday();
        long long13 = ethiopicChronology0.add(102L, (-4727996799L), 100);
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-472799679798L) + "'", long13 == (-472799679798L));
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
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
        // The following exception was thrown during execution in test generation
        try {
            long long18 = ethiopicChronology0.getDateTimeMillis((int) ' ', (int) 'a', (int) (short) 10, (int) '#', 10, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.millis();
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology0.getZone();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.secondOfDay();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.secondOfMinute();
        java.lang.String str6 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.months();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str6, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = ethiopicChronology0.getDateTimeMillis(97L, (int) '#', (int) (short) 1, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.secondOfMinute();
        org.joda.time.Chronology chronology5 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.dayOfMonth();
        long long10 = ethiopicChronology0.add(0L, 10L, (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = ethiopicChronology0.add(readablePeriod12, (long) (byte) 0, (int) (short) 0);
        org.joda.time.DurationField durationField16 = ethiopicChronology0.seconds();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.months();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology9 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean11 = ethiopicChronology9.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology9.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology9.halfdayOfDay();
        boolean boolean14 = ethiopicChronology0.equals((java.lang.Object) dateTimeField13);
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = ethiopicChronology0.getZone();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = ethiopicChronology0.get(readablePeriod17, 1663L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(ethiopicChronology9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.months();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology9 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean11 = ethiopicChronology9.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology9.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology9.halfdayOfDay();
        boolean boolean14 = ethiopicChronology0.equals((java.lang.Object) dateTimeField13);
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField16 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology0.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long25 = ethiopicChronology0.getDateTimeMillis(1, (int) 'a', (-1), (int) (short) 1, (int) '4', (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for monthOfYear must be in the range [1,13]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(ethiopicChronology9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.secondOfMinute();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.era();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.year();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology8.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = ethiopicChronology8.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology8.yearOfCentury();
        org.joda.time.DurationField durationField13 = ethiopicChronology8.seconds();
        boolean boolean14 = ethiopicChronology0.equals((java.lang.Object) durationField13);
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.year();
        int int16 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(ethiopicChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.hourOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology3 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long7 = ethiopicChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = ethiopicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = ethiopicChronology3.days();
        boolean boolean11 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology3);
        org.joda.time.DurationField durationField12 = ethiopicChronology3.weekyears();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(ethiopicChronology3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 98L + "'", long7 == 98L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.halfdays();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean9 = ethiopicChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology7.monthOfYear();
        boolean boolean12 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology7);
        org.joda.time.DurationField durationField13 = ethiopicChronology7.centuries();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology7.dayOfMonth();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology15 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology15.weekyear();
        org.joda.time.DurationField durationField17 = ethiopicChronology15.years();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = ethiopicChronology15.add(readablePeriod18, (long) (-1), (int) (byte) 100);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology22 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean24 = ethiopicChronology22.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField25 = ethiopicChronology22.halfdayOfDay();
        org.joda.time.DurationField durationField26 = ethiopicChronology22.millis();
        org.joda.time.DurationField durationField27 = ethiopicChronology22.days();
        org.joda.time.DateTimeField dateTimeField28 = ethiopicChronology22.yearOfCentury();
        boolean boolean29 = ethiopicChronology15.equals((java.lang.Object) ethiopicChronology22);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology30 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField31 = ethiopicChronology30.millisOfDay();
        org.joda.time.DurationField durationField32 = ethiopicChronology30.seconds();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        long long36 = ethiopicChronology30.add(readablePeriod33, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField37 = ethiopicChronology30.secondOfDay();
        org.joda.time.Chronology chronology38 = ethiopicChronology30.withUTC();
        boolean boolean39 = ethiopicChronology15.equals((java.lang.Object) ethiopicChronology30);
        org.joda.time.DurationField durationField40 = ethiopicChronology30.hours();
        org.joda.time.DateTimeField dateTimeField41 = ethiopicChronology30.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone42 = ethiopicChronology30.getZone();
        org.joda.time.Chronology chronology43 = ethiopicChronology7.withZone(dateTimeZone42);
        org.joda.time.DateTimeField dateTimeField44 = ethiopicChronology7.dayOfMonth();
        int int45 = ethiopicChronology7.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(ethiopicChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNotNull(ethiopicChronology22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(ethiopicChronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10L + "'", long36 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 4 + "'", int45 == 4);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.minuteOfHour();
        org.joda.time.Chronology chronology7 = ethiopicChronology0.withUTC();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology6 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField7 = ethiopicChronology6.months();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology6.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology6.dayOfYear();
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
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        long long4 = ethiopicChronology0.add(readablePeriod1, 3501L, (int) 'a');
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3501L + "'", long4 == 3501L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = ethiopicChronology0.add(readablePeriod7, (long) (-1), 1);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField13 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField15 = ethiopicChronology0.months();
        org.joda.time.DurationField durationField16 = ethiopicChronology0.years();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.hourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.hours();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.weekyears();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        java.lang.String str7 = ethiopicChronology0.toString();
        java.lang.String str8 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.weekyear();
        java.lang.Object obj13 = null;
        boolean boolean14 = ethiopicChronology0.equals(obj13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ethiopicChronology0.get(readablePeriod15, 2501032L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long11 = ethiopicChronology7.add((long) 'a', 1L, (int) (short) 1);
        java.lang.String str12 = ethiopicChronology7.toString();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology13 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology13.millisOfDay();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology13.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = ethiopicChronology13.getZone();
        org.joda.time.Chronology chronology17 = ethiopicChronology7.withZone(dateTimeZone16);
        org.joda.time.Chronology chronology18 = ethiopicChronology0.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology0.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long27 = ethiopicChronology0.getDateTimeMillis((int) (byte) 10, (int) (byte) -1, 100, (int) (byte) -1, (int) (byte) 100, (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 98L + "'", long11 == 98L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str12, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(ethiopicChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.era();
        java.lang.Class<?> wildcardClass3 = dateTimeField2.getClass();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        java.lang.String str5 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str5, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.millisOfSecond();
        java.lang.String str6 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.millis();
        long long11 = ethiopicChronology0.add((long) '#', 250100L, 0);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.minuteOfDay();
        long long16 = ethiopicChronology0.add((long) (short) 100, (long) 1, 1);
        org.joda.time.DateTimeZone dateTimeZone17 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str6, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 101L + "'", long16 == 101L);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.halfdays();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology8.hourOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology8.weeks();
        boolean boolean12 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology8);
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(ethiopicChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.months();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.era();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withUTC();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.months();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.hourOfDay();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.days();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        long long4 = ethiopicChronology0.add(readablePeriod1, (long) 0, 4);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.hourOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.millis();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.seconds();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.hours();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.dayOfYear();
        java.lang.String str7 = ethiopicChronology0.toString();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str7, "EthiopicChronology[Etc/UTC]");
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.monthOfYear();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean9 = ethiopicChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology7.halfdayOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology7.millis();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology7.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = ethiopicChronology7.add(readablePeriod14, 0L, (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone18 = ethiopicChronology7.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology19 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone18);
        org.joda.time.Chronology chronology20 = ethiopicChronology0.withZone(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField21 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(ethiopicChronology19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        long long9 = ethiopicChronology0.add((long) (short) -1, (long) ' ', (int) '4');
        org.joda.time.DurationField durationField10 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeZone dateTimeZone11 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology12 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone11);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology13 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone11);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = ethiopicChronology13.getDateTimeMillis(3152100L, (-1), 0, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1663L + "'", long9 == 1663L);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(ethiopicChronology12);
        org.junit.Assert.assertNotNull(ethiopicChronology13);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.era();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.seconds();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        long long10 = ethiopicChronology0.add((long) '4', 0L, (int) (byte) 1);
        org.joda.time.DurationField durationField11 = ethiopicChronology0.hours();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0, 1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology2.weekyear();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        long long7 = ethiopicChronology2.add(readablePeriod4, 9700L, (int) '4');
        long long11 = ethiopicChronology2.add((-58769884800000L), (long) (-1), 100);
        org.joda.time.ReadablePartial readablePartial12 = null;
        int[] intArray18 = new int[] { '4', 1, (short) 0, (short) 1, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            ethiopicChronology2.validate(readablePartial12, intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9700L + "'", long7 == 9700L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-58769884800100L) + "'", long11 == (-58769884800100L));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[52, 1, 0, 1, -1]");
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = ethiopicChronology0.add(readablePeriod8, (long) '4', 1);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField13 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.hours();
        java.lang.Class<?> wildcardClass6 = ethiopicChronology0.getClass();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.era();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.dayOfYear();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.hours();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology6 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone5);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField8 = ethiopicChronology7.millis();
        org.joda.time.Chronology chronology9 = ethiopicChronology7.withUTC();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(ethiopicChronology6);
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone6);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology8.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = ethiopicChronology8.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology8.weekyear();
        int int15 = ethiopicChronology8.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology8.yearOfEra();
        org.joda.time.DurationField durationField18 = ethiopicChronology8.seconds();
        boolean boolean19 = ethiopicChronology7.equals((java.lang.Object) ethiopicChronology8);
        org.joda.time.DurationField durationField20 = ethiopicChronology8.seconds();
        org.joda.time.DateTimeField dateTimeField21 = ethiopicChronology8.minuteOfHour();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertNotNull(ethiopicChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.millis();
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withUTC();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology4 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology4.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology4.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = ethiopicChronology4.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology9 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone7, (int) (short) 1);
        org.joda.time.Chronology chronology10 = ethiopicChronology0.withZone(dateTimeZone7);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(ethiopicChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(ethiopicChronology9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        long long9 = ethiopicChronology0.add((long) (short) -1, (long) ' ', (int) '4');
        org.joda.time.DateTimeZone dateTimeZone10 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology11 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology11.minuteOfDay();
        org.joda.time.DurationField durationField13 = ethiopicChronology11.days();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1663L + "'", long9 == 1663L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(ethiopicChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        java.lang.String str7 = ethiopicChronology0.toString();
        java.lang.String str8 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.year();
        long long14 = ethiopicChronology0.add((long) 0, 0L, (int) (short) 10);
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.dayOfYear();
        org.joda.time.DurationField durationField16 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology0.year();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str7, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str8, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.hours();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.weekyears();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.seconds();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.monthOfYear();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.halfdayOfDay();
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
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = ethiopicChronology0.add(readablePeriod10, (-47280066589999L), (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone14 = ethiopicChronology0.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.EthiopicChronology ethiopicChronology16 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone14, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-47280066589999L) + "'", long13 == (-47280066589999L));
        org.junit.Assert.assertNotNull(dateTimeZone14);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.hours();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.era();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.centuries();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.halfdays();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology8.hourOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology8.weeks();
        boolean boolean12 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology8);
        org.joda.time.DurationField durationField13 = ethiopicChronology8.minutes();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(ethiopicChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = ethiopicChronology0.add(readablePeriod7, 0L, (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone11 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = ethiopicChronology0.add(readablePeriod13, 10L, (int) '#');
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        long long4 = ethiopicChronology0.add(readablePeriod1, 3501L, (int) 'a');
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.days();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3501L + "'", long4 == 3501L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.hourOfHalfday();
        java.lang.String str4 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = ethiopicChronology0.set(readablePartial6, 500L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str4, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekyear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        java.lang.String str7 = ethiopicChronology0.toString();
        java.lang.String str8 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.minutes();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.halfdays();
        org.joda.time.Chronology chronology11 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.secondOfMinute();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str7, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str8, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        long long4 = ethiopicChronology0.add(readablePeriod1, 3501L, (int) 'a');
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.eras();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3501L + "'", long4 == 3501L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.hourOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology3 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long7 = ethiopicChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = ethiopicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = ethiopicChronology3.days();
        boolean boolean11 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology3);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.weekyear();
        java.lang.String str13 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.monthOfYear();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str13, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.hourOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology3 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long7 = ethiopicChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = ethiopicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = ethiopicChronology3.days();
        boolean boolean11 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology3);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology3.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology3.millisOfDay();
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
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology9 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology9.millisOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology9.seconds();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = ethiopicChronology9.add(readablePeriod12, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology9.hourOfHalfday();
        org.joda.time.DurationField durationField17 = ethiopicChronology9.minutes();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology9.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = ethiopicChronology9.getZone();
        org.joda.time.Chronology chronology20 = ethiopicChronology0.withZone(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField21 = ethiopicChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(ethiopicChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology9 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology9.year();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology9.millisOfSecond();
        java.lang.String str12 = ethiopicChronology9.toString();
        org.joda.time.DateTimeZone dateTimeZone13 = ethiopicChronology9.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology14 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone13);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology15 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone13);
        org.joda.time.Chronology chronology16 = ethiopicChronology0.withZone(dateTimeZone13);
        org.joda.time.DurationField durationField17 = ethiopicChronology0.years();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(ethiopicChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str12, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(ethiopicChronology14);
        org.junit.Assert.assertNotNull(ethiopicChronology15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long11 = ethiopicChronology7.add((long) 'a', 1L, (int) (short) 1);
        java.lang.String str12 = ethiopicChronology7.toString();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology13 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology13.millisOfDay();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology13.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = ethiopicChronology13.getZone();
        org.joda.time.Chronology chronology17 = ethiopicChronology7.withZone(dateTimeZone16);
        org.joda.time.Chronology chronology18 = ethiopicChronology0.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 98L + "'", long11 == 98L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str12, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(ethiopicChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfWeek();
        java.lang.String str5 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str5, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology6 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField7 = ethiopicChronology6.halfdays();
        org.joda.time.DurationField durationField8 = ethiopicChronology6.months();
        org.joda.time.DurationField durationField9 = ethiopicChronology6.years();
        org.joda.time.Chronology chronology10 = ethiopicChronology6.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology6.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology6.millisOfDay();
        org.joda.time.DurationField durationField13 = ethiopicChronology6.seconds();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(ethiopicChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekyear();
        int int7 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.centuryOfEra();
        long long12 = ethiopicChronology0.add((long) (short) -1, (-47280066589999L), (int) (short) 10);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-472800665899991L) + "'", long12 == (-472800665899991L));
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.centuries();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = ethiopicChronology0.getDateTimeMillis((int) (byte) 100, (int) (short) -1, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,13]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        long long10 = ethiopicChronology0.getDateTimeMillis((int) (byte) 100, 1, (int) (short) 1, 0);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.year();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-58769884800000L) + "'", long10 == (-58769884800000L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
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
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology0.yearOfCentury();
        org.joda.time.ReadablePartial readablePartial23 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long25 = ethiopicChronology0.set(readablePartial23, 35014L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.centuries();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.centuries();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.hours();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.hours();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.seconds();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (-1), (int) (byte) 100);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean9 = ethiopicChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology7.halfdayOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology7.millis();
        org.joda.time.DurationField durationField12 = ethiopicChronology7.days();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology7.yearOfCentury();
        boolean boolean14 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology7);
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.yearOfCentury();
        org.joda.time.Chronology chronology16 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology0.era();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField20 = ethiopicChronology0.weekyears();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.year();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology8.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = ethiopicChronology8.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology8.yearOfCentury();
        org.joda.time.DurationField durationField13 = ethiopicChronology8.seconds();
        boolean boolean14 = ethiopicChronology0.equals((java.lang.Object) durationField13);
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = ethiopicChronology0.add(readablePeriod16, (long) '4', (int) (short) -1);
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology0.secondOfDay();
        org.joda.time.DurationField durationField21 = ethiopicChronology0.weekyears();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(ethiopicChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 52L + "'", long19 == 52L);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.hourOfHalfday();
        java.lang.String str4 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone6);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str4, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(ethiopicChronology7);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        java.lang.String str7 = ethiopicChronology0.toString();
        java.lang.String str8 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.year();
        long long14 = ethiopicChronology0.add((long) 0, 0L, (int) (short) 10);
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str7, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str8, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.hourOfHalfday();
        java.lang.String str4 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str4, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        long long4 = ethiopicChronology0.add(readablePeriod1, 3501L, (int) 'a');
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        java.lang.String str7 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3501L + "'", long4 == 3501L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str7, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfWeek();
        java.lang.String str5 = ethiopicChronology0.toString();
        org.joda.time.Chronology chronology6 = ethiopicChronology0.withUTC();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str5, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.halfdays();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean9 = ethiopicChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology7.monthOfYear();
        boolean boolean12 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology7);
        org.joda.time.DurationField durationField13 = ethiopicChronology7.centuries();
        org.joda.time.DurationField durationField14 = ethiopicChronology7.halfdays();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology7.minuteOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = ethiopicChronology0.add(readablePeriod7, (long) (-1), 1);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField12 = ethiopicChronology0.weekyears();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.hours();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.millis();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        java.lang.String str7 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.hourOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.months();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str7, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (-1), (int) (byte) 100);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean9 = ethiopicChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology7.halfdayOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology7.millis();
        org.joda.time.DurationField durationField12 = ethiopicChronology7.days();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology7.yearOfCentury();
        boolean boolean14 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology7);
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField16 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField18 = ethiopicChronology0.weekyears();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.weekyears();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.months();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        java.lang.String str4 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.monthOfYear();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.weeks();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology8.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology8.secondOfMinute();
        int int12 = ethiopicChronology8.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology8.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone14 = ethiopicChronology8.getZone();
        org.joda.time.Chronology chronology15 = ethiopicChronology0.withZone(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology0.minuteOfHour();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str4, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(ethiopicChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.millisOfSecond();
        long long11 = ethiopicChronology0.add(1L, (long) (short) 0, 10);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology6 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField7 = ethiopicChronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology6.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology6.year();
        org.joda.time.DurationField durationField10 = ethiopicChronology6.hours();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(ethiopicChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.millisOfDay();
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ethiopicChronology0.get(readablePartial10, 8003200L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.yearOfCentury();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean9 = ethiopicChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology7.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = ethiopicChronology7.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology12 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone11);
        org.joda.time.Chronology chronology13 = ethiopicChronology0.withZone(dateTimeZone11);
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
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(ethiopicChronology12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.months();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology9 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean11 = ethiopicChronology9.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology9.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology9.halfdayOfDay();
        boolean boolean14 = ethiopicChronology0.equals((java.lang.Object) dateTimeField13);
        org.joda.time.DurationField durationField15 = ethiopicChronology0.halfdays();
        org.joda.time.Chronology chronology16 = ethiopicChronology0.withUTC();
        org.joda.time.DurationField durationField17 = ethiopicChronology0.millis();
        org.joda.time.DurationField durationField18 = ethiopicChronology0.millis();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(ethiopicChronology9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.halfdays();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology8.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology8.hourOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology8.weeks();
        boolean boolean12 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology8);
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology8.year();
        java.lang.String str14 = ethiopicChronology8.toString();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(ethiopicChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str14, "EthiopicChronology[Etc/UTC]");
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = ethiopicChronology0.getZone();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = ethiopicChronology0.add(readablePeriod11, (long) (short) 10, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.era();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfWeek();
        java.lang.String str5 = ethiopicChronology0.toString();
        org.joda.time.Chronology chronology6 = ethiopicChronology0.withUTC();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str5, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.halfdays();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean9 = ethiopicChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology7.monthOfYear();
        boolean boolean12 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology7);
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology7.monthOfYear();
        org.joda.time.DurationField durationField14 = ethiopicChronology7.months();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology7.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology7.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology7.millisOfDay();
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
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone3 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.monthOfYear();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.centuries();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.days();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology8.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology8.hourOfHalfday();
        org.joda.time.DurationField durationField12 = ethiopicChronology8.days();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology8.minuteOfDay();
        org.joda.time.DurationField durationField14 = ethiopicChronology8.millis();
        boolean boolean15 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology8);
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology8.secondOfMinute();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(ethiopicChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.era();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology9 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology9.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Chronology chronology12 = ethiopicChronology9.withZone(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology9.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology9.minuteOfHour();
        org.joda.time.DurationField durationField15 = ethiopicChronology9.days();
        boolean boolean16 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology9);
        int int17 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(ethiopicChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekyear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
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
        org.joda.time.DurationField durationField14 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology0.dayOfYear();
        org.joda.time.DurationField durationField17 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology0.hourOfDay();
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
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology0.getZone();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.secondOfDay();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.millis();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.minuteOfHour();
        org.joda.time.Chronology chronology11 = ethiopicChronology0.withUTC();
        org.joda.time.DurationField durationField12 = ethiopicChronology0.centuries();
        org.joda.time.DurationField durationField13 = ethiopicChronology0.halfdays();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.millis();
        java.lang.String str5 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.eras();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str5, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        java.lang.String str7 = ethiopicChronology0.toString();
        java.lang.String str8 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.minutes();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField12 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField13 = ethiopicChronology0.weeks();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str7, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str8, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.hourOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.millisOfSecond();
        java.lang.String str11 = ethiopicChronology0.toString();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str11, "EthiopicChronology[Etc/UTC]");
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.months();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.halfdays();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean9 = ethiopicChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology7.monthOfYear();
        boolean boolean12 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology7);
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology7.dayOfYear();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology14 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean16 = ethiopicChronology14.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology14.halfdayOfDay();
        org.joda.time.DurationField durationField18 = ethiopicChronology14.millis();
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology14.minuteOfHour();
        long long23 = ethiopicChronology14.add((long) (short) -1, (long) ' ', (int) '4');
        org.joda.time.DateTimeZone dateTimeZone24 = ethiopicChronology14.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology25 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone24);
        org.joda.time.Chronology chronology26 = ethiopicChronology7.withZone(dateTimeZone24);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1663L + "'", long23 == 1663L);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(ethiopicChronology25);
        org.junit.Assert.assertNotNull(chronology26);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.monthOfYear();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekyearOfCentury();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        java.lang.String str7 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.minutes();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology9 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean11 = ethiopicChronology9.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology9.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology9.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone14 = ethiopicChronology9.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology15 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone14);
        org.joda.time.Chronology chronology16 = ethiopicChronology0.withZone(dateTimeZone14);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology18 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone14, 1);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str7, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(ethiopicChronology9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(ethiopicChronology15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(ethiopicChronology18);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = ethiopicChronology0.getDateTimeMillis((int) (short) 100, 100, (int) (byte) -1, (int) (byte) 10, (int) '4', (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.months();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology9 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean11 = ethiopicChronology9.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology9.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology9.halfdayOfDay();
        boolean boolean14 = ethiopicChronology0.equals((java.lang.Object) dateTimeField13);
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology0.secondOfMinute();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(ethiopicChronology9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.millis();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeZone dateTimeZone9 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology10 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology10.minuteOfDay();
        org.joda.time.DurationField durationField12 = ethiopicChronology10.months();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(ethiopicChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withUTC();
        int int4 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology10 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology10.year();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology10.millisOfSecond();
        java.lang.String str13 = ethiopicChronology10.toString();
        org.joda.time.DateTimeZone dateTimeZone14 = ethiopicChronology10.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology15 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone14);
        org.joda.time.Chronology chronology16 = ethiopicChronology0.withZone(dateTimeZone14);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(ethiopicChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str13, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(ethiopicChronology15);
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = ethiopicChronology0.getDateTimeMillis((-58840473595999L), (int) 'a', 4, 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        java.lang.String str6 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekyear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str6, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.era();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        java.lang.String str7 = ethiopicChronology0.toString();
        java.lang.String str8 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.minutes();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.halfdays();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = ethiopicChronology0.add(readablePeriod11, (-58769884800100L), (int) (short) 1);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str7, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str8, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-58769884800100L) + "'", long14 == (-58769884800100L));
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.hours();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.year();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology8.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = ethiopicChronology8.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology8.yearOfCentury();
        org.joda.time.DurationField durationField13 = ethiopicChronology8.seconds();
        boolean boolean14 = ethiopicChronology0.equals((java.lang.Object) durationField13);
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.year();
        org.joda.time.DurationField durationField16 = ethiopicChronology0.halfdays();
        int int17 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(ethiopicChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.millisOfSecond();
        java.lang.String str6 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.millis();
        long long11 = ethiopicChronology0.add((long) '#', 250100L, 0);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.minuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = ethiopicChronology0.add(readablePeriod13, (-4727996799L), (int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = ethiopicChronology0.add(readablePeriod17, 36001035L, 0);
        org.joda.time.DateTimeField dateTimeField21 = ethiopicChronology0.dayOfYear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str6, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-4727996799L) + "'", long16 == (-4727996799L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 36001035L + "'", long20 == 36001035L);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfWeek();
        java.lang.String str5 = ethiopicChronology0.toString();
        org.joda.time.Chronology chronology6 = ethiopicChronology0.withUTC();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.clockhourOfHalfday();
        long long14 = ethiopicChronology0.getDateTimeMillis((long) (byte) -1, (int) (short) 10, (int) '4', 0, (int) ' ');
        org.joda.time.DurationField durationField15 = ethiopicChronology0.weeks();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology16 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean18 = ethiopicChronology16.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology16.halfdayOfDay();
        org.joda.time.DurationField durationField20 = ethiopicChronology16.millis();
        org.joda.time.DateTimeField dateTimeField21 = ethiopicChronology16.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology16.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        long long26 = ethiopicChronology16.add(readablePeriod23, 0L, (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone27 = ethiopicChronology16.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology28 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone27);
        org.joda.time.Chronology chronology29 = ethiopicChronology0.withZone(dateTimeZone27);
        org.joda.time.DurationField durationField30 = ethiopicChronology0.millis();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str5, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-47279968L) + "'", long14 == (-47279968L));
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(ethiopicChronology16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(ethiopicChronology28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(durationField30);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.centuryOfEra();
        int int10 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology6 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = ethiopicChronology6.getZone();
        org.joda.time.Chronology chronology8 = ethiopicChronology0.withZone(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.weekyearOfCentury();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(ethiopicChronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.era();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.era();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (-1), (int) (byte) 100);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean9 = ethiopicChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology7.halfdayOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology7.millis();
        org.joda.time.DurationField durationField12 = ethiopicChronology7.days();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology7.yearOfCentury();
        boolean boolean14 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology7);
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology0.millisOfDay();
        org.joda.time.ReadablePartial readablePartial18 = null;
        int[] intArray24 = new int[] { (byte) 10, 100, 100, (byte) 1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            ethiopicChronology0.validate(readablePartial18, intArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[10, 100, 100, 1, 10]");
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone3 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone4 = ethiopicChronology0.getZone();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.months();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.year();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        java.lang.String str7 = ethiopicChronology0.toString();
        java.lang.String str8 = ethiopicChronology0.toString();
        org.joda.time.DateTimeZone dateTimeZone9 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology11 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone9, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology11.dayOfWeek();
        org.joda.time.DurationField durationField13 = ethiopicChronology11.minutes();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = ethiopicChronology11.add(readablePeriod14, 10L, 1);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str7, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str8, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(ethiopicChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.days();
        long long11 = ethiopicChronology0.add((long) (byte) 1, (long) (short) 100, (int) '#');
        org.joda.time.DurationField durationField12 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology0.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ethiopicChronology0.get(readablePeriod17, (long) (short) 10, (-472799678798L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3501L + "'", long11 == 3501L);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.EthiopicChronology ethiopicChronology9 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone5, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(ethiopicChronology7);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.hours();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.clockhourOfDay();
        java.lang.String str7 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.minutes();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.millis();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str7, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.halfdays();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean9 = ethiopicChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology7.monthOfYear();
        boolean boolean12 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology7);
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology7.hourOfHalfday();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology14 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean16 = ethiopicChronology14.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology14.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = ethiopicChronology14.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology19 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone18);
        org.joda.time.Chronology chronology20 = ethiopicChronology7.withZone(dateTimeZone18);
        org.joda.time.ReadablePartial readablePartial21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ethiopicChronology7.get(readablePartial21, (-47279968L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(ethiopicChronology19);
        org.junit.Assert.assertNotNull(chronology20);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.year();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.centuries();
        java.lang.String str11 = ethiopicChronology0.toString();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str11, "EthiopicChronology[Etc/UTC]");
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        java.lang.String str7 = ethiopicChronology0.toString();
        java.lang.String str8 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.weekyearOfCentury();
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
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.days();
        java.lang.String str8 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str8, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.months();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology9 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean11 = ethiopicChronology9.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology9.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology9.halfdayOfDay();
        boolean boolean14 = ethiopicChronology0.equals((java.lang.Object) dateTimeField13);
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField16 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(ethiopicChronology9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.weekyears();
        long long14 = ethiopicChronology0.getDateTimeMillis(52L, 0, 4, (int) (short) 10, (int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = ethiopicChronology0.add(readablePeriod15, (long) 10, 10);
        long long22 = ethiopicChronology0.add((long) ' ', 250100L, (int) (byte) 10);
        org.joda.time.DurationField durationField23 = ethiopicChronology0.weeks();
        java.lang.String str24 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField25 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField26 = ethiopicChronology0.hourOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 250100L + "'", long14 == 250100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2501032L + "'", long22 == 2501032L);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str24, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.hourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.centuries();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.yearOfEra();
        int int7 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        long long9 = ethiopicChronology0.add((long) (short) -1, (long) ' ', (int) '4');
        org.joda.time.DurationField durationField10 = ethiopicChronology0.weeks();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.minuteOfHour();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1663L + "'", long9 == 1663L);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfWeek();
        java.lang.String str5 = ethiopicChronology0.toString();
        org.joda.time.Chronology chronology6 = ethiopicChronology0.withUTC();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str5, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0, 1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology2.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology2.getZone();
        org.junit.Assert.assertNotNull(ethiopicChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.halfdays();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean9 = ethiopicChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology7.monthOfYear();
        boolean boolean12 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology7);
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.secondOfDay();
        java.lang.Class<?> wildcardClass14 = ethiopicChronology0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.eras();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        java.lang.String str5 = ethiopicChronology0.toString();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology6 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology6.millisOfDay();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology6.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = ethiopicChronology6.getZone();
        org.joda.time.Chronology chronology10 = ethiopicChronology0.withZone(dateTimeZone9);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology11 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone9);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology13 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone9, (int) (byte) 1);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = ethiopicChronology13.add(readablePeriod14, 899L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology13.hourOfHalfday();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str5, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(ethiopicChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(ethiopicChronology11);
        org.junit.Assert.assertNotNull(ethiopicChronology13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 899L + "'", long17 == 899L);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) 10, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.months();
        org.joda.time.DurationField durationField12 = ethiopicChronology0.minutes();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        java.lang.String str4 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weekyears();
        long long10 = ethiopicChronology0.add(2501032L, 97L, 0);
        org.joda.time.DurationField durationField11 = ethiopicChronology0.centuries();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str4, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2501032L + "'", long10 == 2501032L);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.millisOfSecond();
        java.lang.String str6 = ethiopicChronology0.toString();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology7.weekyear();
        org.joda.time.DurationField durationField9 = ethiopicChronology7.years();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology7.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology7.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology7.hourOfHalfday();
        org.joda.time.DurationField durationField13 = ethiopicChronology7.halfdays();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology7.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone15 = ethiopicChronology7.getZone();
        org.joda.time.Chronology chronology16 = ethiopicChronology0.withZone(dateTimeZone15);
        org.joda.time.DurationField durationField17 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str6, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.minutes();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.hours();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.weekyears();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        java.lang.String str7 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.hourOfDay();
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = ethiopicChronology0.set(readablePartial11, 3152100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str7, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.year();
        int int7 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.dayOfYear();
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = ethiopicChronology0.get(readablePartial6, 67L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
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
        org.joda.time.DurationField durationField15 = ethiopicChronology0.weekyears();
        org.joda.time.DurationField durationField16 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology0.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ethiopicChronology0.get(readablePeriod18, 25009383L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.yearOfCentury();
        int int10 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.secondOfDay();
        long long9 = ethiopicChronology0.getDateTimeMillis((int) (byte) 1, (int) (byte) 10, (int) (byte) 10, (int) ' ');
        org.joda.time.DurationField durationField10 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-61870003199968L) + "'", long9 == (-61870003199968L));
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.hourOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology6 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long10 = ethiopicChronology6.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField11 = ethiopicChronology6.weekyears();
        org.joda.time.DateTimeZone dateTimeZone12 = ethiopicChronology6.getZone();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology6.era();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology6.minuteOfDay();
        boolean boolean15 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology6);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(ethiopicChronology6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 98L + "'", long10 == 98L);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfWeek();
        java.lang.String str5 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.millisOfSecond();
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ethiopicChronology0.get(readablePartial10, (-99L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str5, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekyearOfCentury();
        long long13 = ethiopicChronology0.getDateTimeMillis(9L, 10, (int) (short) 0, (int) (byte) 1, (int) '#');
        org.joda.time.DurationField durationField14 = ethiopicChronology0.seconds();
        org.joda.time.DateTimeZone dateTimeZone15 = ethiopicChronology0.getZone();
        org.joda.time.DurationField durationField16 = ethiopicChronology0.weekyears();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 36001035L + "'", long13 == 36001035L);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology0.getZone();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.secondOfDay();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField12 = ethiopicChronology0.years();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.era();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.weekyears();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.hourOfHalfday();
        int int11 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.year();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology8.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = ethiopicChronology8.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology8.yearOfCentury();
        org.joda.time.DurationField durationField13 = ethiopicChronology8.seconds();
        boolean boolean14 = ethiopicChronology0.equals((java.lang.Object) durationField13);
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = ethiopicChronology0.add(readablePeriod16, (-1L), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology0.minuteOfDay();
        org.joda.time.ReadablePartial readablePartial21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ethiopicChronology0.get(readablePartial21, (-58769884800100L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(ethiopicChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.hours();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.years();
        org.joda.time.Chronology chronology6 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        java.lang.String str7 = ethiopicChronology0.toString();
        java.lang.String str8 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str7, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str8, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.millisOfSecond();
        java.lang.String str6 = ethiopicChronology0.toString();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology7.weekyear();
        org.joda.time.DurationField durationField9 = ethiopicChronology7.years();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology7.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology7.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology7.hourOfHalfday();
        org.joda.time.DurationField durationField13 = ethiopicChronology7.halfdays();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology7.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone15 = ethiopicChronology7.getZone();
        org.joda.time.Chronology chronology16 = ethiopicChronology0.withZone(dateTimeZone15);
        org.joda.time.DurationField durationField17 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology0.dayOfYear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str6, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology6 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone5);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField8 = ethiopicChronology7.millis();
        org.joda.time.DurationField durationField9 = ethiopicChronology7.weekyears();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = ethiopicChronology7.add(readablePeriod10, 100L, (int) (short) -1);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology14 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology14.weekyear();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology14.hourOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology17 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long21 = ethiopicChronology17.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField22 = ethiopicChronology17.weekyears();
        org.joda.time.DateTimeField dateTimeField23 = ethiopicChronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField24 = ethiopicChronology17.days();
        boolean boolean25 = ethiopicChronology14.equals((java.lang.Object) ethiopicChronology17);
        org.joda.time.DateTimeZone dateTimeZone26 = ethiopicChronology17.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology28 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone26, (int) (byte) 1);
        org.joda.time.Chronology chronology29 = ethiopicChronology7.withZone(dateTimeZone26);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology30 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone26);
        org.joda.time.DurationField durationField31 = ethiopicChronology30.years();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(ethiopicChronology6);
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(ethiopicChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(ethiopicChronology17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 98L + "'", long21 == 98L);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(ethiopicChronology28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(ethiopicChronology30);
        org.junit.Assert.assertNotNull(durationField31);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        java.lang.String str5 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.secondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = ethiopicChronology0.getDateTimeMillis((int) (byte) 100, (int) (short) -1, 1, (int) 'a', 1, 4, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str5, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.era();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology9 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology9.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Chronology chronology12 = ethiopicChronology9.withZone(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology9.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology9.minuteOfHour();
        org.joda.time.DurationField durationField15 = ethiopicChronology9.days();
        boolean boolean16 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology9);
        org.joda.time.DurationField durationField17 = ethiopicChronology0.weeks();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(ethiopicChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.halfdays();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean9 = ethiopicChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology7.monthOfYear();
        boolean boolean12 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology7);
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology7.hourOfHalfday();
        java.lang.String str14 = ethiopicChronology7.toString();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology7.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology7.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology7.year();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology7.year();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str14, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.year();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone4 = ethiopicChronology1.getZone();
        long long8 = ethiopicChronology1.add((long) '#', 899L, (int) (byte) 10);
        org.junit.Assert.assertNotNull(ethiopicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9025L + "'", long8 == 9025L);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.minutes();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.weekyearOfCentury();
        java.lang.String str10 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str10, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        java.lang.String str4 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.minuteOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology8.dayOfYear();
        org.joda.time.DurationField durationField10 = ethiopicChronology8.millis();
        org.joda.time.DateTimeZone dateTimeZone11 = ethiopicChronology8.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology12 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone11);
        org.joda.time.Chronology chronology13 = ethiopicChronology0.withZone(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.weekyear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str4, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(ethiopicChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(ethiopicChronology12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.Chronology chronology8 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology6 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone5);
        org.joda.time.DurationField durationField7 = ethiopicChronology6.halfdays();
        org.joda.time.DurationField durationField8 = ethiopicChronology6.seconds();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology6.secondOfMinute();
        org.joda.time.DurationField durationField10 = ethiopicChronology6.seconds();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology6.weekyear();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology6.dayOfMonth();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(ethiopicChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.dayOfMonth();
        int int11 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField12 = ethiopicChronology0.days();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology13 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean15 = ethiopicChronology13.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology13.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology13.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = ethiopicChronology13.getZone();
        org.joda.time.DurationField durationField19 = ethiopicChronology13.days();
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology13.clockhourOfDay();
        org.joda.time.DurationField durationField21 = ethiopicChronology13.centuries();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology22 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField23 = ethiopicChronology22.millisOfDay();
        org.joda.time.DateTimeField dateTimeField24 = ethiopicChronology22.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone25 = ethiopicChronology22.getZone();
        org.joda.time.Chronology chronology26 = ethiopicChronology13.withZone(dateTimeZone25);
        org.joda.time.Chronology chronology27 = ethiopicChronology0.withZone(dateTimeZone25);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology28 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone25);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(ethiopicChronology13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(ethiopicChronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(ethiopicChronology28);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
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
        org.joda.time.DurationField durationField14 = ethiopicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.weekyear();
        org.joda.time.ReadablePartial readablePartial16 = null;
        int[] intArray23 = new int[] { 'a', 'a', 0, ' ', (short) 10, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            ethiopicChronology0.validate(readablePartial16, intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, 97, 0, 32, 10, 1]");
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.clockhourOfDay();
        java.lang.String str7 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.minutes();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.millis();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.minutes();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str7, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        long long4 = ethiopicChronology0.add(readablePeriod1, 3501L, (int) 'a');
        org.joda.time.chrono.EthiopicChronology ethiopicChronology5 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean7 = ethiopicChronology5.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology5.halfdayOfDay();
        org.joda.time.DurationField durationField9 = ethiopicChronology5.millis();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology5.minuteOfHour();
        org.joda.time.DurationField durationField11 = ethiopicChronology5.years();
        org.joda.time.DateTimeZone dateTimeZone12 = ethiopicChronology5.getZone();
        org.joda.time.Chronology chronology13 = ethiopicChronology0.withZone(dateTimeZone12);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology14 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone12);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology15 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology15.dayOfWeek();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3501L + "'", long4 == 3501L);
        org.junit.Assert.assertNotNull(ethiopicChronology5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(ethiopicChronology14);
        org.junit.Assert.assertNotNull(ethiopicChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.secondOfMinute();
        java.lang.String str4 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.secondOfMinute();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str4, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        long long9 = ethiopicChronology0.add((long) (short) -1, (long) ' ', (int) '4');
        org.joda.time.DurationField durationField10 = ethiopicChronology0.weeks();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = ethiopicChronology0.add(readablePeriod12, 101L, (int) (byte) 10);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1663L + "'", long9 == 1663L);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 101L + "'", long15 == 101L);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        long long9 = ethiopicChronology0.add((long) (short) -1, (long) ' ', (int) '4');
        org.joda.time.DurationField durationField10 = ethiopicChronology0.weeks();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.dayOfYear();
        java.lang.String str13 = ethiopicChronology0.toString();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1663L + "'", long9 == 1663L);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str13, "EthiopicChronology[Etc/UTC]");
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DurationField durationField3 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.year();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.millis();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfWeek();
        java.lang.String str5 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.year();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str5, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.eras();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.millisOfSecond();
        java.lang.String str6 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.millis();
        int int8 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.weekyear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str6, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        java.lang.String str7 = ethiopicChronology0.toString();
        java.lang.String str8 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.Chronology chronology11 = ethiopicChronology0.withUTC();
        org.joda.time.DurationField durationField12 = ethiopicChronology0.months();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str7, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str8, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfWeek();
        java.lang.String str5 = ethiopicChronology0.toString();
        org.joda.time.Chronology chronology6 = ethiopicChronology0.withUTC();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.clockhourOfHalfday();
        long long14 = ethiopicChronology0.getDateTimeMillis((long) (byte) -1, (int) (short) 10, (int) '4', 0, (int) ' ');
        org.joda.time.DurationField durationField15 = ethiopicChronology0.weeks();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology16 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean18 = ethiopicChronology16.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology16.halfdayOfDay();
        org.joda.time.DurationField durationField20 = ethiopicChronology16.millis();
        org.joda.time.DateTimeField dateTimeField21 = ethiopicChronology16.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology16.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        long long26 = ethiopicChronology16.add(readablePeriod23, 0L, (int) 'a');
        org.joda.time.DateTimeZone dateTimeZone27 = ethiopicChronology16.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology28 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone27);
        org.joda.time.Chronology chronology29 = ethiopicChronology0.withZone(dateTimeZone27);
        org.joda.time.DurationField durationField30 = ethiopicChronology0.weeks();
        org.joda.time.DurationField durationField31 = ethiopicChronology0.weekyears();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str5, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-47279968L) + "'", long14 == (-47279968L));
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(ethiopicChronology16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(ethiopicChronology28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(durationField31);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.yearOfEra();
        org.joda.time.Chronology chronology5 = ethiopicChronology0.withUTC();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.days();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.seconds();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekyearOfCentury();
        long long13 = ethiopicChronology0.getDateTimeMillis(9L, 10, (int) (short) 0, (int) (byte) 1, (int) '#');
        org.joda.time.DurationField durationField14 = ethiopicChronology0.seconds();
        org.joda.time.DateTimeZone dateTimeZone15 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 36001035L + "'", long13 == 36001035L);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        java.lang.String str7 = ethiopicChronology0.toString();
        java.lang.String str8 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.minutes();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.halfdays();
        org.joda.time.Chronology chronology11 = ethiopicChronology0.withUTC();
        org.joda.time.DurationField durationField12 = ethiopicChronology0.years();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str7, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str8, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = ethiopicChronology0.add(readablePeriod8, (long) '4', 1);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = ethiopicChronology0.getDateTimeMillis((-58769625600000L), (int) (byte) -1, (int) (short) 0, (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.seconds();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = ethiopicChronology0.getDateTimeMillis(97L, 1, 1, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = ethiopicChronology0.add(readablePeriod8, (long) '4', 1);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = ethiopicChronology0.getDateTimeMillis((int) (byte) 1, 1, (int) (short) 10, 0, (int) '4', (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.days();
        long long11 = ethiopicChronology0.add((long) (byte) 1, (long) (short) 100, (int) '#');
        org.joda.time.DurationField durationField12 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.year();
        org.joda.time.DurationField durationField16 = ethiopicChronology0.centuries();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3501L + "'", long11 == 3501L);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.centuries();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.weekyears();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.hours();
        org.joda.time.ReadablePartial readablePartial10 = null;
        int[] intArray11 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            ethiopicChronology0.validate(readablePartial10, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.months();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology9 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean11 = ethiopicChronology9.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology9.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology9.halfdayOfDay();
        boolean boolean14 = ethiopicChronology0.equals((java.lang.Object) dateTimeField13);
        org.joda.time.DurationField durationField15 = ethiopicChronology0.halfdays();
        org.joda.time.Chronology chronology16 = ethiopicChronology0.withUTC();
        org.joda.time.DurationField durationField17 = ethiopicChronology0.halfdays();
        int int18 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(ethiopicChronology9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DurationField durationField3 = ethiopicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.Chronology chronology6 = ethiopicChronology0.withZone(dateTimeZone5);
        int int7 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekyear();
        int int7 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.weekyears();
        long long12 = ethiopicChronology0.add((long) (byte) 10, 102L, (int) ' ');
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3274L + "'", long12 == 3274L);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.centuries();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.weeks();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.era();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        java.lang.String str5 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.era();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = ethiopicChronology0.add(readablePeriod8, (long) '#', (int) ' ');
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.dayOfYear();
        org.joda.time.DurationField durationField13 = ethiopicChronology0.months();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str5, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        java.lang.String str6 = ethiopicChronology0.toString();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str6, "EthiopicChronology[Etc/UTC]");
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (-1), (int) (byte) 100);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean9 = ethiopicChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology7.halfdayOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology7.millis();
        org.joda.time.DurationField durationField12 = ethiopicChronology7.days();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology7.yearOfCentury();
        boolean boolean14 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology7);
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = ethiopicChronology0.getDateTimeMillis(250100L, (int) (short) 100, 100, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, 0L, (int) '#');
        org.joda.time.DurationField durationField7 = ethiopicChronology0.eras();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.millis();
        int int3 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weeks();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weeks();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.hours();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.years();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = ethiopicChronology0.add(readablePeriod7, (long) (-1), 1);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField13 = ethiopicChronology0.years();
        org.joda.time.DurationField durationField14 = ethiopicChronology0.millis();
        org.joda.time.DurationField durationField15 = ethiopicChronology0.halfdays();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.weekyears();
        long long14 = ethiopicChronology0.getDateTimeMillis(52L, 0, 4, (int) (short) 10, (int) (short) 100);
        org.joda.time.DurationField durationField15 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField17 = ethiopicChronology0.hours();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 250100L + "'", long14 == 250100L);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekyear();
        int int7 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology12 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology12.millisOfDay();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology12.millisOfDay();
        org.joda.time.DurationField durationField15 = ethiopicChronology12.years();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology12.clockhourOfHalfday();
        boolean boolean17 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology12);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(ethiopicChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.eras();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = ethiopicChronology0.getZone();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.years();
        java.lang.String str6 = ethiopicChronology0.toString();
        org.joda.time.DateTimeZone dateTimeZone7 = ethiopicChronology0.getZone();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.millis();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str6, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.EthiopicChronology ethiopicChronology6 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = ethiopicChronology6.getZone();
        org.joda.time.Chronology chronology8 = ethiopicChronology0.withZone(dateTimeZone7);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology9 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology9.millisOfSecond();
        org.joda.time.DurationField durationField11 = ethiopicChronology9.seconds();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology9.dayOfYear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(ethiopicChronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(ethiopicChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.ReadablePartial readablePartial7 = null;
        int[] intArray10 = new int[] { (short) 0, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            ethiopicChronology0.validate(readablePartial7, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, -1]");
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (-1), (int) (byte) 100);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean9 = ethiopicChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology7.halfdayOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology7.millis();
        org.joda.time.DurationField durationField12 = ethiopicChronology7.days();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology7.yearOfCentury();
        boolean boolean14 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology7);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology15 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology15.millisOfDay();
        org.joda.time.DurationField durationField17 = ethiopicChronology15.seconds();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = ethiopicChronology15.add(readablePeriod18, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology15.secondOfDay();
        org.joda.time.Chronology chronology23 = ethiopicChronology15.withUTC();
        boolean boolean24 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology15);
        org.joda.time.DurationField durationField25 = ethiopicChronology15.hours();
        org.joda.time.DateTimeField dateTimeField26 = ethiopicChronology15.year();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(ethiopicChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.millis();
        int int3 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.halfdays();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean9 = ethiopicChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology7.monthOfYear();
        boolean boolean12 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology7);
        org.joda.time.DurationField durationField13 = ethiopicChronology7.centuries();
        org.joda.time.DurationField durationField14 = ethiopicChronology7.halfdays();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology7.weekyear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.hourOfDay();
        java.lang.String str3 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.weekyears();
        org.joda.time.ReadablePartial readablePartial5 = null;
        int[] intArray11 = new int[] { (byte) 0, (byte) 10, (short) -1, (short) 10, 0 };
        // The following exception was thrown during execution in test generation
        try {
            ethiopicChronology0.validate(readablePartial5, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str3, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 10, -1, 10, 0]");
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.era();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (-1), (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.secondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = ethiopicChronology0.getDateTimeMillis(0, (int) (short) 100, (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,13]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.halfdays();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean9 = ethiopicChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology7.monthOfYear();
        boolean boolean12 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology7);
        org.joda.time.DurationField durationField13 = ethiopicChronology0.weekyears();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology14 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology14.millisOfDay();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology14.millisOfSecond();
        java.lang.String str17 = ethiopicChronology14.toString();
        org.joda.time.DurationField durationField18 = ethiopicChronology14.months();
        boolean boolean19 = ethiopicChronology0.equals((java.lang.Object) durationField18);
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(ethiopicChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str17, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.months();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = ethiopicChronology0.add(readablePeriod6, 52L, (int) (byte) 10);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        long long9 = ethiopicChronology0.add((long) (short) -1, (long) ' ', (int) '4');
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1663L + "'", long9 == 1663L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.millisOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology7.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.Chronology chronology10 = ethiopicChronology7.withZone(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology7.dayOfWeek();
        java.lang.String str12 = ethiopicChronology7.toString();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology7.secondOfDay();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology7.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology7.millisOfDay();
        org.joda.time.DurationField durationField16 = ethiopicChronology7.weekyears();
        boolean boolean17 = ethiopicChronology0.equals((java.lang.Object) durationField16);
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology0.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ethiopicChronology0.get(readablePeriod19, 10L, 3152100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str12, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.millis();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
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
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField15 = ethiopicChronology0.centuries();
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
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        java.lang.String str7 = ethiopicChronology0.toString();
        java.lang.String str8 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.era();
        org.joda.time.DurationField durationField12 = ethiopicChronology0.weekyears();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str7, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str8, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
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
        org.joda.time.DurationField durationField14 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone16 = ethiopicChronology0.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.EthiopicChronology ethiopicChronology18 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone16, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 0");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        long long10 = ethiopicChronology0.getDateTimeMillis((int) (byte) 100, 1, (int) (short) 1, 0);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField13 = ethiopicChronology0.eras();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-58769884800000L) + "'", long10 == (-58769884800000L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = ethiopicChronology0.add(readablePeriod7, 0L, (int) 'a');
        org.joda.time.DurationField durationField11 = ethiopicChronology0.halfdays();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        long long4 = ethiopicChronology0.add(readablePeriod1, (long) 0, 4);
        org.joda.time.Chronology chronology5 = ethiopicChronology0.withUTC();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(chronology5);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        long long9 = ethiopicChronology0.add((long) (short) -1, (long) ' ', (int) '4');
        org.joda.time.DateTimeZone dateTimeZone10 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology11 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone10);
        org.joda.time.DurationField durationField12 = ethiopicChronology11.months();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1663L + "'", long9 == 1663L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(ethiopicChronology11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
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
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField15 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology0.yearOfCentury();
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
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
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
        org.joda.time.DurationField durationField14 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone16 = ethiopicChronology0.getZone();
        org.joda.time.DurationField durationField17 = ethiopicChronology0.months();
        org.joda.time.DurationField durationField18 = ethiopicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology0.dayOfWeek();
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
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.hours();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.era();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.hourOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology3 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long7 = ethiopicChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = ethiopicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = ethiopicChronology3.days();
        boolean boolean11 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology3);
        org.joda.time.DurationField durationField12 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(ethiopicChronology3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 98L + "'", long7 == 98L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekyear();
        int int7 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.weeks();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.weeks();
        long long12 = ethiopicChronology0.add((long) (byte) 1, (-938L), (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.weekyear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-937L) + "'", long12 == (-937L));
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology4 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long8 = ethiopicChronology4.add((long) 'a', 1L, (int) (short) 1);
        java.lang.String str9 = ethiopicChronology4.toString();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology10 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology10.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology10.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = ethiopicChronology10.getZone();
        org.joda.time.Chronology chronology14 = ethiopicChronology4.withZone(dateTimeZone13);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology15 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone13);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology17 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone13, (int) (byte) 1);
        org.joda.time.Chronology chronology18 = ethiopicChronology0.withZone(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(ethiopicChronology4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 98L + "'", long8 == 98L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str9, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(ethiopicChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(ethiopicChronology15);
        org.junit.Assert.assertNotNull(ethiopicChronology17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.hourOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology3 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long7 = ethiopicChronology3.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField8 = ethiopicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = ethiopicChronology3.days();
        boolean boolean11 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology3);
        org.joda.time.DateTimeZone dateTimeZone12 = ethiopicChronology3.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology14 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone12, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology14.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology14.hourOfDay();
        org.joda.time.Chronology chronology17 = ethiopicChronology14.withUTC();
        org.joda.time.DurationField durationField18 = ethiopicChronology14.weeks();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(ethiopicChronology3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 98L + "'", long7 == 98L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(ethiopicChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
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
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology0.hourOfHalfday();
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
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology7.hourOfHalfday();
        org.joda.time.DurationField durationField9 = ethiopicChronology7.years();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology7.yearOfEra();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withUTC();
        int int4 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.eras();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.Chronology chronology8 = ethiopicChronology0.withUTC();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.months();
        long long13 = ethiopicChronology0.add(100L, (-472799679798L), (int) 'a');
        org.joda.time.DurationField durationField14 = ethiopicChronology0.millis();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-45861568940306L) + "'", long13 == (-45861568940306L));
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.era();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.hourOfDay();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.years();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 98L + "'", long4 == 98L);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField12 = ethiopicChronology0.hours();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ethiopicChronology0.get(readablePeriod13, (-83278990L), (-472799678798L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
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
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
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
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
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
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
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
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
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
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
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
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
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
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
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
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
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
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
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
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
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
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
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
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
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
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
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
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
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
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
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
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
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
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
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
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
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
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
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
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
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

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.hourOfDay();
        org.joda.time.ReadablePartial readablePartial4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = ethiopicChronology0.get(readablePartial4, 25009383L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.centuries();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology4 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology4.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology4.hourOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long11 = ethiopicChronology7.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField12 = ethiopicChronology7.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology7.weekOfWeekyear();
        org.joda.time.DurationField durationField14 = ethiopicChronology7.days();
        boolean boolean15 = ethiopicChronology4.equals((java.lang.Object) ethiopicChronology7);
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology4.weekyear();
        org.joda.time.DurationField durationField17 = ethiopicChronology4.millis();
        boolean boolean18 = ethiopicChronology0.equals((java.lang.Object) durationField17);
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(ethiopicChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 98L + "'", long11 == 98L);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = ethiopicChronology0.getZone();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.weeks();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.era();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.minuteOfHour();
        long long10 = ethiopicChronology0.add(10L, 1L, (int) (byte) -1);
        org.joda.time.DurationField durationField11 = ethiopicChronology0.seconds();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9L + "'", long10 == 9L);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.days();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean2 = ethiopicChronology0.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.era();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.millis();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology3 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology3.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology3.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology3.getZone();
        boolean boolean7 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology3);
        org.joda.time.DateTimeZone dateTimeZone8 = ethiopicChronology3.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology9 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField10 = ethiopicChronology9.centuries();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(ethiopicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(ethiopicChronology9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.weekyear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        java.lang.String str7 = ethiopicChronology0.toString();
        java.lang.String str8 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.weekyear();
        java.lang.Object obj13 = null;
        boolean boolean14 = ethiopicChronology0.equals(obj13);
        org.joda.time.DurationField durationField15 = ethiopicChronology0.months();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
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
        org.joda.time.DurationField durationField13 = ethiopicChronology3.weekyears();
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
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
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
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology0.era();
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
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
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
        org.joda.time.DurationField durationField22 = ethiopicChronology14.seconds();
        org.joda.time.DateTimeField dateTimeField23 = ethiopicChronology14.minuteOfHour();
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
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        long long4 = ethiopicChronology0.add((long) 'a', 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.halfdays();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean9 = ethiopicChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology7.monthOfYear();
        boolean boolean12 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology7);
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology7.hourOfHalfday();
        java.lang.String str14 = ethiopicChronology7.toString();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology7.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology7.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = ethiopicChronology7.getDateTimeMillis(4235004L, (int) (short) 10, (-1), (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str14, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfWeek();
        java.lang.String str5 = ethiopicChronology0.toString();
        org.joda.time.Chronology chronology6 = ethiopicChronology0.withUTC();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.secondOfMinute();
        int int10 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EthiopicChronology[Etc/UTC]" + "'", str5, "EthiopicChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = ethiopicChronology0.get(readablePeriod11, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) (-1), (int) (byte) 100);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance();
        boolean boolean9 = ethiopicChronology7.equals((java.lang.Object) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology7.halfdayOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology7.millis();
        org.joda.time.DurationField durationField12 = ethiopicChronology7.days();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology7.yearOfCentury();
        boolean boolean14 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology7);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology15 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology15.millisOfDay();
        org.joda.time.DurationField durationField17 = ethiopicChronology15.seconds();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = ethiopicChronology15.add(readablePeriod18, (long) (byte) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology15.secondOfDay();
        org.joda.time.Chronology chronology23 = ethiopicChronology15.withUTC();
        boolean boolean24 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology15);
        org.joda.time.Chronology chronology25 = ethiopicChronology15.withUTC();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(ethiopicChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(chronology25);
    }
}

