import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest40 {

    public static boolean debug = false;

    @Test
    public void test20001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20001");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = ethiopicChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField12 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.minuteOfDay();
        java.lang.String str14 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.weekyear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EthiopicChronology[UTC]" + "'", str14, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test20002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20002");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone7 = ethiopicChronology0.getZone();
        boolean boolean9 = dateTimeZone7.isStandardOffset(35999999899L);
        java.util.TimeZone timeZone10 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        long long15 = dateTimeZone11.convertLocalToUTC(5700020L, true, (-51623446949994335L));
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5700020L + "'", long15 == 5700020L);
    }

    @Test
    public void test20003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20003");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.year();
        java.lang.String str7 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.secondOfDay();
        int int12 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField13 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.minuteOfHour();
        java.lang.String str15 = ethiopicChronology0.toString();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EthiopicChronology[UTC]" + "'", str7, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EthiopicChronology[UTC]" + "'", str15, "EthiopicChronology[UTC]");
    }

    @Test
    public void test20004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20004");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test20005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20005");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.days();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.Chronology chronology10 = ethiopicChronology0.withZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test20006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20006");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        int int8 = dateTimeZone3.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        boolean boolean11 = dateTimeZone3.isStandardOffset((long) (short) 10);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology12 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology12.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone14 = ethiopicChronology12.getZone();
        boolean boolean15 = dateTimeZone3.equals((java.lang.Object) ethiopicChronology12);
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology12.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology12.dayOfWeek();
        org.joda.time.DurationField durationField18 = ethiopicChronology12.years();
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology12.clockhourOfHalfday();
        org.joda.time.Chronology chronology20 = ethiopicChronology12.withUTC();
        org.joda.time.DurationField durationField21 = ethiopicChronology12.halfdays();
        org.joda.time.DurationField durationField22 = ethiopicChronology12.centuries();
        org.joda.time.DateTimeField dateTimeField23 = ethiopicChronology12.hourOfHalfday();
        org.joda.time.DurationField durationField24 = ethiopicChronology12.hours();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(ethiopicChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
    }

    @Test
    public void test20007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20007");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = ethiopicChronology0.getZone();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.yearOfEra();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology10 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology10.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology10.secondOfMinute();
        org.joda.time.DurationField durationField13 = ethiopicChronology10.halfdays();
        org.joda.time.DurationField durationField14 = ethiopicChronology10.months();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology10.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology10.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology10.era();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology10.secondOfMinute();
        boolean boolean19 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology10);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(ethiopicChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test20008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20008");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        int int8 = dateTimeZone3.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        boolean boolean11 = dateTimeZone3.isStandardOffset((long) (short) 10);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology12 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology12.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone14 = ethiopicChronology12.getZone();
        boolean boolean15 = dateTimeZone3.equals((java.lang.Object) ethiopicChronology12);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology17 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone3, 4);
        java.lang.String str18 = ethiopicChronology17.toString();
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology17.hourOfDay();
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology17.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField21 = ethiopicChronology17.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(ethiopicChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(ethiopicChronology17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EthiopicChronology[UTC]" + "'", str18, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test20009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20009");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.years();
        org.joda.time.Chronology chronology7 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.months();
        org.joda.time.Chronology chronology10 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.weekyearOfCentury();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test20010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20010");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test20011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20011");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        int int8 = dateTimeZone3.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        boolean boolean11 = dateTimeZone3.isStandardOffset((long) (short) 10);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology12 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology12.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone14 = ethiopicChronology12.getZone();
        boolean boolean15 = dateTimeZone3.equals((java.lang.Object) ethiopicChronology12);
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology12.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology12.hourOfHalfday();
        org.joda.time.DurationField durationField18 = ethiopicChronology12.years();
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology12.secondOfMinute();
        long long23 = ethiopicChronology12.add(3600035L, 3600039L, (int) 'a');
        org.joda.time.DurationField durationField24 = ethiopicChronology12.centuries();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(ethiopicChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 352803818L + "'", long23 == 352803818L);
        org.junit.Assert.assertNotNull(durationField24);
    }

    @Test
    public void test20012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20012");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.era();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.secondOfDay();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.days();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test20013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20013");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = ethiopicChronology0.getZone();
        java.util.TimeZone timeZone11 = dateTimeZone10.toTimeZone();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test20014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20014");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology7.millisOfSecond();
        org.joda.time.DurationField durationField9 = ethiopicChronology7.centuries();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = ethiopicChronology7.add(readablePeriod10, (long) (short) -1, (int) 'a');
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology7.year();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology7.yearOfEra();
        org.joda.time.Chronology chronology16 = ethiopicChronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology7.centuryOfEra();
        org.joda.time.Chronology chronology18 = ethiopicChronology7.withUTC();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology19 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.Chronology chronology20 = ethiopicChronology19.withUTC();
        org.joda.time.DurationField durationField21 = ethiopicChronology19.years();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        long long25 = ethiopicChronology19.add(readablePeriod22, (long) 1, (int) (short) 10);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology26 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField27 = ethiopicChronology26.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField28 = ethiopicChronology26.year();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology29 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField30 = ethiopicChronology29.seconds();
        org.joda.time.DurationField durationField31 = ethiopicChronology29.years();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology33 = ethiopicChronology29.withZone(dateTimeZone32);
        java.lang.String str35 = dateTimeZone32.getNameKey((long) 1);
        org.joda.time.Chronology chronology36 = ethiopicChronology26.withZone(dateTimeZone32);
        long long39 = dateTimeZone32.convertLocalToUTC((long) 0, true);
        long long41 = dateTimeZone32.convertUTCToLocal((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        long long45 = dateTimeZone32.getMillisKeepLocal(dateTimeZone43, (long) 100);
        org.joda.time.Chronology chronology46 = ethiopicChronology19.withZone(dateTimeZone32);
        java.lang.String str48 = dateTimeZone32.getName(3600001L);
        org.joda.time.Chronology chronology49 = chronology18.withZone(dateTimeZone32);
        org.joda.time.DurationField durationField50 = chronology18.weeks();
        org.joda.time.DateTimeZone dateTimeZone51 = chronology18.getZone();
        long long54 = dateTimeZone51.convertLocalToUTC(1179576364194001689L, false);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(ethiopicChronology19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertNotNull(ethiopicChronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(ethiopicChronology29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "UTC" + "'", str35, "UTC");
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-1L) + "'", long41 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 99L + "'", long45 == 99L);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+00:00" + "'", str48, "+00:00");
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(durationField50);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1179576364194001689L + "'", long54 == 1179576364194001689L);
    }

    @Test
    public void test20015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20015");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        int int4 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone7 = ethiopicChronology0.getZone();
        org.joda.time.Chronology chronology8 = ethiopicChronology0.withUTC();
        org.joda.time.DurationField durationField9 = chronology8.seconds();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test20016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20016");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        int int8 = dateTimeZone3.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        int int11 = dateTimeZone3.getOffset((long) (byte) 1);
        int int13 = dateTimeZone3.getOffsetFromLocal((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone14.getShortName((long) ' ', locale16);
        long long19 = dateTimeZone14.previousTransition((long) (byte) 100);
        long long23 = dateTimeZone14.convertLocalToUTC((long) (short) 100, false, (long) 360000000);
        java.util.TimeZone timeZone24 = dateTimeZone14.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        boolean boolean26 = dateTimeZone3.equals((java.lang.Object) timeZone24);
        org.joda.time.ReadableInstant readableInstant27 = null;
        int int28 = dateTimeZone3.getOffset(readableInstant27);
        org.joda.time.LocalDateTime localDateTime29 = null;
        boolean boolean30 = dateTimeZone3.isLocalDateTimeGap(localDateTime29);
        java.util.Locale locale32 = null;
        java.lang.String str33 = dateTimeZone3.getShortName((-86398966L), locale32);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00" + "'", str33, "+00:00");
    }

    @Test
    public void test20017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20017");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(4);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = ethiopicChronology2.months();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology2.secondOfMinute();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(ethiopicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test20018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20018");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = ethiopicChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = ethiopicChronology0.add(readablePeriod12, (long) ' ', (int) ' ');
        org.joda.time.DurationField durationField16 = ethiopicChronology0.weekyears();
        org.joda.time.DurationField durationField17 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField18 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ethiopicChronology0.get(readablePeriod21, 7506201535L, 13014371538567L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test20019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20019");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        long long3 = dateTimeZone1.convertUTCToLocal(103L);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 102L + "'", long3 == 102L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test20020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20020");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        int int4 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = ethiopicChronology0.getDateTimeMillis(60000, (int) (byte) 0, (-3600000), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test20021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20021");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.dayOfYear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test20022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20022");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = ethiopicChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone14 = ethiopicChronology0.getZone();
        java.lang.String str16 = dateTimeZone14.getShortName((-1L));
        boolean boolean17 = dateTimeZone14.isFixed();
        java.lang.String str18 = dateTimeZone14.toString();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology19 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone14);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology20 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone14);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertNotNull(ethiopicChronology19);
        org.junit.Assert.assertNotNull(ethiopicChronology20);
    }

    @Test
    public void test20023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20023");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.year();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology3 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField4 = ethiopicChronology3.seconds();
        org.joda.time.DurationField durationField5 = ethiopicChronology3.years();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology7 = ethiopicChronology3.withZone(dateTimeZone6);
        java.lang.String str9 = dateTimeZone6.getNameKey((long) 1);
        org.joda.time.Chronology chronology10 = ethiopicChronology0.withZone(dateTimeZone6);
        long long13 = dateTimeZone6.convertLocalToUTC((long) 0, true);
        long long15 = dateTimeZone6.convertUTCToLocal((long) (short) -1);
        java.lang.String str16 = dateTimeZone6.getID();
        long long18 = dateTimeZone6.previousTransition((long) (short) -1);
        boolean boolean19 = dateTimeZone6.isFixed();
        int int21 = dateTimeZone6.getOffsetFromLocal((long) (byte) -1);
        java.lang.String str23 = dateTimeZone6.getNameKey((-100L));
        int int25 = dateTimeZone6.getStandardOffset(8280000022L);
        long long27 = dateTimeZone6.previousTransition(86L);
        java.lang.String str28 = dateTimeZone6.getID();
        java.lang.String str29 = dateTimeZone6.toString();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(ethiopicChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 86L + "'", long27 == 86L);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UTC" + "'", str28, "UTC");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UTC" + "'", str29, "UTC");
    }

    @Test
    public void test20024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20024");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        int int4 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone6);
        long long11 = dateTimeZone6.convertLocalToUTC((-8279999925L), true, 100L);
        long long14 = dateTimeZone6.convertLocalToUTC(2605679999997L, true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.EthiopicChronology ethiopicChronology16 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone6, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-8279999925L) + "'", long11 == (-8279999925L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2605679999997L + "'", long14 == 2605679999997L);
    }

    @Test
    public void test20025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20025");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.year();
        java.lang.String str7 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.days();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.hourOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EthiopicChronology[UTC]" + "'", str7, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test20026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20026");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = ethiopicChronology0.add(readablePeriod10, (long) (byte) 10, (int) (short) 10);
        org.joda.time.Chronology chronology14 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test20027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20027");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = ethiopicChronology0.add(readablePeriod7, 18909300000L, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 18909300000L + "'", long10 == 18909300000L);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test20028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20028");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.dayOfYear();
        org.joda.time.Chronology chronology8 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.weekyear();
        org.joda.time.Chronology chronology12 = ethiopicChronology0.withUTC();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test20029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20029");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.era();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone12 = ethiopicChronology0.getZone();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
    }

    @Test
    public void test20030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20030");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology7.monthOfYear();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology7.minuteOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology7.centuries();
        java.lang.String str12 = ethiopicChronology7.toString();
        org.joda.time.DurationField durationField13 = ethiopicChronology7.centuries();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EthiopicChronology[UTC]" + "'", str12, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test20031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20031");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.era();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.era();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test20032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20032");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = ethiopicChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.monthOfYear();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.months();
        org.joda.time.DurationField durationField12 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.halfdayOfDay();
        java.lang.String str14 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.yearOfEra();
        java.lang.String str16 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology0.dayOfYear();
        org.joda.time.DurationField durationField18 = ethiopicChronology0.halfdays();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EthiopicChronology[UTC]" + "'", str14, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EthiopicChronology[UTC]" + "'", str16, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test20033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20033");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        int int8 = dateTimeZone3.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        int int11 = dateTimeZone3.getOffset((long) (byte) 1);
        boolean boolean13 = dateTimeZone3.isStandardOffset(1L);
        long long15 = dateTimeZone3.convertUTCToLocal(97L);
        long long18 = dateTimeZone3.convertLocalToUTC(58L, false);
        org.joda.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = dateTimeZone3.isLocalDateTimeGap(localDateTime19);
        java.lang.String str21 = dateTimeZone3.toString();
        boolean boolean22 = dateTimeZone3.isFixed();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 58L + "'", long18 == 58L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test20034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20034");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DurationField durationField6 = ethiopicChronology0.millis();
        org.joda.time.DateTimeZone dateTimeZone7 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone7);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology9 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology9.millisOfSecond();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(ethiopicChronology8);
        org.junit.Assert.assertNotNull(ethiopicChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test20035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20035");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withUTC();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.centuryOfEra();
        java.lang.Class<?> wildcardClass7 = chronology4.getClass();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test20036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20036");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = ethiopicChronology0.add(readablePeriod11, 275010L, (int) ' ');
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.weekyear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 275010L + "'", long14 == 275010L);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test20037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20037");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology8.year();
        org.joda.time.DurationField durationField11 = ethiopicChronology8.halfdays();
        org.joda.time.DateTimeZone dateTimeZone12 = ethiopicChronology8.getZone();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology8.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone14 = ethiopicChronology8.getZone();
        long long18 = ethiopicChronology8.add(0L, (-122459989L), 360600000);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(ethiopicChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-44159072033400000L) + "'", long18 == (-44159072033400000L));
    }

    @Test
    public void test20038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20038");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = ethiopicChronology0.add(readablePeriod10, (long) (byte) 10, (int) (short) 10);
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField15 = ethiopicChronology0.halfdays();
        long long19 = ethiopicChronology0.add((-33346091916719873L), (-11400598999L), 189300000);
        org.joda.time.DurationField durationField20 = ethiopicChronology0.seconds();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-2191479482427419873L) + "'", long19 == (-2191479482427419873L));
        org.junit.Assert.assertNotNull(durationField20);
    }

    @Test
    public void test20039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20039");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        int int4 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekyearOfCentury();
        long long9 = ethiopicChronology0.add((long) 100, (long) (-1), 10);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = ethiopicChronology0.add(readablePeriod11, 90L, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = ethiopicChronology0.add(readablePeriod15, 3210L, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField21 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology0.year();
        org.joda.time.Chronology chronology23 = ethiopicChronology0.withUTC();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 90L + "'", long9 == 90L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 90L + "'", long14 == 90L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3210L + "'", long18 == 3210L);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(chronology23);
    }

    @Test
    public void test20040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20040");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.year();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology3 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField4 = ethiopicChronology3.seconds();
        org.joda.time.DurationField durationField5 = ethiopicChronology3.years();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology7 = ethiopicChronology3.withZone(dateTimeZone6);
        java.lang.String str9 = dateTimeZone6.getNameKey((long) 1);
        org.joda.time.Chronology chronology10 = ethiopicChronology0.withZone(dateTimeZone6);
        long long13 = dateTimeZone6.convertLocalToUTC((long) 0, true);
        long long15 = dateTimeZone6.convertUTCToLocal((long) (short) -1);
        java.lang.String str16 = dateTimeZone6.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone6.getShortName(10L, locale19);
        int int22 = dateTimeZone6.getOffset((-60797087999000L));
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone6.getShortName(18666250035L, locale24);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(ethiopicChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00" + "'", str25, "+00:00");
    }

    @Test
    public void test20041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20041");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.dayOfWeek();
        long long16 = ethiopicChronology0.add((-359999967L), 104422828L, (int) 'a');
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 9769014349L + "'", long16 == 9769014349L);
    }

    @Test
    public void test20042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20042");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        long long10 = dateTimeZone6.convertLocalToUTC(100L, false, 1L);
        java.lang.String str11 = dateTimeZone6.getID();
        int int13 = dateTimeZone6.getOffsetFromLocal((long) (short) 10);
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone6.getName((long) (short) 1, locale15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = dateTimeZone6.getOffset(readableInstant17);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology19 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.EthiopicChronology ethiopicChronology21 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone6, 60000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 60000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(ethiopicChronology19);
    }

    @Test
    public void test20043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20043");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology7.millisOfSecond();
        long long12 = ethiopicChronology7.add(35L, 0L, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = ethiopicChronology7.add(readablePeriod13, (long) (short) 0, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone17 = ethiopicChronology7.getZone();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology7.minuteOfDay();
        org.joda.time.DurationField durationField19 = ethiopicChronology7.minutes();
        java.lang.String str20 = ethiopicChronology7.toString();
        org.joda.time.DurationField durationField21 = ethiopicChronology7.halfdays();
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology7.minuteOfHour();
        org.joda.time.Chronology chronology23 = ethiopicChronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.hourOfHalfday();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "EthiopicChronology[UTC]" + "'", str20, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test20044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20044");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.dayOfYear();
        int int4 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.secondOfDay();
        org.joda.time.Chronology chronology8 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = ethiopicChronology0.add(readablePeriod11, (long) (short) 10, 4);
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField17 = ethiopicChronology0.eras();
        org.joda.time.ReadablePartial readablePartial18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ethiopicChronology0.get(readablePartial18, 359999947L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test20045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20045");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.era();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test20046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20046");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.centuryOfEra();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology9 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology9.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology9.year();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology12 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField13 = ethiopicChronology12.seconds();
        org.joda.time.DurationField durationField14 = ethiopicChronology12.years();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology16 = ethiopicChronology12.withZone(dateTimeZone15);
        java.lang.String str18 = dateTimeZone15.getNameKey((long) 1);
        org.joda.time.Chronology chronology19 = ethiopicChronology9.withZone(dateTimeZone15);
        long long22 = dateTimeZone15.convertLocalToUTC((long) 0, true);
        long long24 = dateTimeZone15.convertUTCToLocal((long) (byte) 100);
        long long26 = dateTimeZone15.convertUTCToLocal((long) ' ');
        long long28 = dateTimeZone15.nextTransition((-359999989L));
        org.joda.time.Chronology chronology29 = ethiopicChronology0.withZone(dateTimeZone15);
        java.lang.String str31 = dateTimeZone15.getShortName(0L);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(ethiopicChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(ethiopicChronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32L + "'", long26 == 32L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-359999989L) + "'", long28 == (-359999989L));
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+00:00" + "'", str31, "+00:00");
    }

    @Test
    public void test20047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20047");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = ethiopicChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = ethiopicChronology0.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.era();
        org.joda.time.DurationField durationField15 = ethiopicChronology0.months();
        org.joda.time.DurationField durationField16 = ethiopicChronology0.hours();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology17 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology17.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology17.year();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology20 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField21 = ethiopicChronology20.seconds();
        org.joda.time.DurationField durationField22 = ethiopicChronology20.years();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology24 = ethiopicChronology20.withZone(dateTimeZone23);
        java.lang.String str26 = dateTimeZone23.getNameKey((long) 1);
        org.joda.time.Chronology chronology27 = ethiopicChronology17.withZone(dateTimeZone23);
        long long30 = dateTimeZone23.convertLocalToUTC((long) 0, true);
        long long32 = dateTimeZone23.convertUTCToLocal((long) (byte) 100);
        long long34 = dateTimeZone23.convertUTCToLocal((long) ' ');
        long long36 = dateTimeZone23.nextTransition((-359999989L));
        org.joda.time.Chronology chronology37 = ethiopicChronology0.withZone(dateTimeZone23);
        org.joda.time.ReadablePartial readablePartial38 = null;
        int[] intArray39 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            ethiopicChronology0.validate(readablePartial38, intArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(ethiopicChronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(ethiopicChronology20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTC" + "'", str26, "UTC");
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 100L + "'", long32 == 100L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 32L + "'", long34 == 32L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-359999989L) + "'", long36 == (-359999989L));
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[]");
    }

    @Test
    public void test20048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20048");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-5520000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20049");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test20050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20050");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.yearOfEra();
        org.joda.time.DurationField durationField13 = ethiopicChronology0.months();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test20051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20051");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.Chronology chronology6 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField13 = ethiopicChronology0.seconds();
        java.lang.String str14 = ethiopicChronology0.toString();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EthiopicChronology[UTC]" + "'", str14, "EthiopicChronology[UTC]");
    }

    @Test
    public void test20052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20052");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = ethiopicChronology0.getZone();
        java.lang.String str4 = dateTimeZone2.getNameKey((long) ' ');
        org.joda.time.chrono.EthiopicChronology ethiopicChronology5 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField6 = ethiopicChronology5.seconds();
        org.joda.time.DurationField durationField7 = ethiopicChronology5.years();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology9 = ethiopicChronology5.withZone(dateTimeZone8);
        int int11 = dateTimeZone8.getOffset((long) 0);
        int int13 = dateTimeZone8.getOffset((long) (byte) 1);
        boolean boolean14 = dateTimeZone2.equals((java.lang.Object) dateTimeZone8);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone8.getOffset(readableInstant15);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone8.getShortName(1L, locale18);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        boolean boolean22 = dateTimeZone8.isStandardOffset(97L);
        java.util.TimeZone timeZone23 = dateTimeZone8.toTimeZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology24 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField25 = ethiopicChronology24.seconds();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        long long29 = ethiopicChronology24.add(readablePeriod26, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        long long33 = ethiopicChronology24.add(readablePeriod30, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.Chronology chronology35 = ethiopicChronology24.withZone(dateTimeZone34);
        org.joda.time.DateTimeField dateTimeField36 = ethiopicChronology24.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField37 = ethiopicChronology24.dayOfYear();
        org.joda.time.DateTimeField dateTimeField38 = ethiopicChronology24.monthOfYear();
        org.joda.time.DurationField durationField39 = ethiopicChronology24.millis();
        org.joda.time.DateTimeField dateTimeField40 = ethiopicChronology24.monthOfYear();
        org.joda.time.DurationField durationField41 = ethiopicChronology24.weeks();
        org.joda.time.DateTimeField dateTimeField42 = ethiopicChronology24.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone43 = ethiopicChronology24.getZone();
        boolean boolean44 = dateTimeZone8.equals((java.lang.Object) ethiopicChronology24);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertNotNull(ethiopicChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(ethiopicChronology24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1L + "'", long33 == 1L);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test20053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20053");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.millisOfSecond();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology8.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone10 = ethiopicChronology8.getZone();
        long long14 = ethiopicChronology8.add(10L, 359999999L, (-1));
        org.joda.time.DurationField durationField15 = ethiopicChronology8.centuries();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology8.minuteOfHour();
        boolean boolean17 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology8);
        org.joda.time.ReadablePartial readablePartial18 = null;
        int[] intArray21 = new int[] { 37920000, 100 };
        // The following exception was thrown during execution in test generation
        try {
            ethiopicChronology0.validate(readablePartial18, intArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(ethiopicChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-359999989L) + "'", long14 == (-359999989L));
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[37920000, 100]");
    }

    @Test
    public void test20054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20054");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology8.hourOfHalfday();
        long long13 = ethiopicChronology8.add((long) ' ', 359999999L, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology8.clockhourOfDay();
        org.joda.time.DurationField durationField15 = ethiopicChronology8.months();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology8.clockhourOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology17 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology17.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology17.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.Chronology chronology21 = ethiopicChronology17.withZone(dateTimeZone20);
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology17.year();
        org.joda.time.DateTimeZone dateTimeZone23 = ethiopicChronology17.getZone();
        long long27 = dateTimeZone23.convertLocalToUTC(100L, false, 1L);
        long long29 = dateTimeZone23.nextTransition((long) 0);
        long long31 = dateTimeZone23.convertUTCToLocal(0L);
        long long33 = dateTimeZone23.convertUTCToLocal(100L);
        long long35 = dateTimeZone23.nextTransition((-100L));
        java.util.TimeZone timeZone36 = dateTimeZone23.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        org.joda.time.Chronology chronology38 = ethiopicChronology8.withZone(dateTimeZone37);
        org.joda.time.DateTimeZone dateTimeZone39 = ethiopicChronology8.getZone();
        long long42 = dateTimeZone39.convertLocalToUTC((long) (-5520000), false);
        long long44 = dateTimeZone39.convertUTCToLocal(187200032L);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(ethiopicChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(ethiopicChronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 100L + "'", long33 == 100L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-100L) + "'", long35 == (-100L));
        org.junit.Assert.assertNotNull(timeZone36);
        org.junit.Assert.assertEquals(timeZone36.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-5520000L) + "'", long42 == (-5520000L));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 187200032L + "'", long44 == 187200032L);
    }

    @Test
    public void test20055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20055");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean1 = dateTimeZone0.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        long long4 = dateTimeZone0.convertUTCToLocal((-100L));
        org.joda.time.chrono.EthiopicChronology ethiopicChronology5 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        boolean boolean6 = dateTimeZone0.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-100L) + "'", long4 == (-100L));
        org.junit.Assert.assertNotNull(ethiopicChronology5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test20056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20056");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test20057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20057");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.yearOfEra();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology5 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField6 = ethiopicChronology5.seconds();
        org.joda.time.DurationField durationField7 = ethiopicChronology5.years();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology9 = ethiopicChronology5.withZone(dateTimeZone8);
        java.lang.String str11 = dateTimeZone8.getNameKey((long) 1);
        int int13 = dateTimeZone8.getStandardOffset((long) (short) 0);
        org.joda.time.Chronology chronology14 = ethiopicChronology0.withZone(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField16 = ethiopicChronology0.weeks();
        long long20 = ethiopicChronology0.add(3L, 236L, 0);
        org.joda.time.DateTimeField dateTimeField21 = ethiopicChronology0.hourOfDay();
        org.joda.time.DurationField durationField22 = ethiopicChronology0.seconds();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(ethiopicChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
    }

    @Test
    public void test20058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20058");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.hours();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField12 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test20059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20059");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(32);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test20060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20060");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        int int4 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.dayOfWeek();
        org.joda.time.Chronology chronology10 = ethiopicChronology0.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = ethiopicChronology0.getDateTimeMillis(4, 0, 37920000, (-3600000), (int) (short) 1, 52, 189300000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -3600000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test20061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20061");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = ethiopicChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = ethiopicChronology0.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField16 = ethiopicChronology0.weeks();
        org.joda.time.DurationField durationField17 = ethiopicChronology0.weeks();
        org.joda.time.DurationField durationField18 = ethiopicChronology0.minutes();
        // The following exception was thrown during execution in test generation
        try {
            long long23 = ethiopicChronology0.getDateTimeMillis(52, (int) (short) 100, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,13]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test20062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20062");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        java.lang.String str4 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.secondOfDay();
        org.joda.time.ReadablePartial readablePartial9 = null;
        int[] intArray10 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            ethiopicChronology0.validate(readablePartial9, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EthiopicChronology[UTC]" + "'", str4, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
    }

    @Test
    public void test20063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20063");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = ethiopicChronology0.add(readablePeriod9, 0L, (int) (short) -1);
        org.joda.time.DurationField durationField13 = ethiopicChronology0.weekyears();
        org.joda.time.DurationField durationField14 = ethiopicChronology0.weekyears();
        org.joda.time.DurationField durationField15 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology0.weekyearOfCentury();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test20064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20064");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.weeks();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.millis();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test20065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20065");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.era();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test20066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20066");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.adjustOffset((-359999968L), false);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology4 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology4.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology4.secondOfMinute();
        org.joda.time.DurationField durationField7 = ethiopicChronology4.halfdays();
        int int8 = ethiopicChronology4.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology4.weekyearOfCentury();
        org.joda.time.DurationField durationField10 = ethiopicChronology4.seconds();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology4.weekyear();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology4.era();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(100);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology15 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField16 = ethiopicChronology15.seconds();
        org.joda.time.DurationField durationField17 = ethiopicChronology15.years();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology15.yearOfCentury();
        org.joda.time.DurationField durationField19 = ethiopicChronology15.seconds();
        org.joda.time.DurationField durationField20 = ethiopicChronology15.centuries();
        boolean boolean21 = dateTimeZone14.equals((java.lang.Object) ethiopicChronology15);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology22 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField23 = ethiopicChronology22.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField24 = ethiopicChronology22.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.Chronology chronology26 = ethiopicChronology22.withZone(dateTimeZone25);
        org.joda.time.DateTimeField dateTimeField27 = ethiopicChronology22.year();
        org.joda.time.DateTimeZone dateTimeZone28 = ethiopicChronology22.getZone();
        long long32 = dateTimeZone28.convertLocalToUTC(100L, false, 1L);
        java.lang.String str33 = dateTimeZone28.getID();
        org.joda.time.Chronology chronology34 = ethiopicChronology15.withZone(dateTimeZone28);
        java.lang.String str36 = dateTimeZone28.getName((long) (byte) 0);
        org.joda.time.Chronology chronology37 = ethiopicChronology4.withZone(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField38 = ethiopicChronology4.hourOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology39 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField40 = ethiopicChronology39.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField41 = ethiopicChronology39.year();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology42 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField43 = ethiopicChronology42.seconds();
        org.joda.time.DurationField durationField44 = ethiopicChronology42.years();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology46 = ethiopicChronology42.withZone(dateTimeZone45);
        java.lang.String str48 = dateTimeZone45.getNameKey((long) 1);
        org.joda.time.Chronology chronology49 = ethiopicChronology39.withZone(dateTimeZone45);
        long long52 = dateTimeZone45.convertLocalToUTC((long) 0, true);
        boolean boolean54 = dateTimeZone45.isStandardOffset((long) (short) 1);
        org.joda.time.ReadableInstant readableInstant55 = null;
        int int56 = dateTimeZone45.getOffset(readableInstant55);
        java.util.Locale locale58 = null;
        java.lang.String str59 = dateTimeZone45.getShortName(3600004L, locale58);
        org.joda.time.ReadableInstant readableInstant60 = null;
        int int61 = dateTimeZone45.getOffset(readableInstant60);
        long long63 = dateTimeZone45.convertUTCToLocal((-356399989L));
        org.joda.time.LocalDateTime localDateTime64 = null;
        boolean boolean65 = dateTimeZone45.isLocalDateTimeGap(localDateTime64);
        long long67 = dateTimeZone45.nextTransition(1295999996004000033L);
        org.joda.time.ReadableInstant readableInstant68 = null;
        int int69 = dateTimeZone45.getOffset(readableInstant68);
        org.joda.time.Chronology chronology70 = ethiopicChronology4.withZone(dateTimeZone45);
        long long72 = dateTimeZone0.getMillisKeepLocal(dateTimeZone45, (-35999999L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-359999968L) + "'", long3 == (-359999968L));
        org.junit.Assert.assertNotNull(ethiopicChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(ethiopicChronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(ethiopicChronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 100L + "'", long32 == 100L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "UTC" + "'", str33, "UTC");
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00" + "'", str36, "+00:00");
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(ethiopicChronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(ethiopicChronology42);
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "UTC" + "'", str48, "UTC");
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "+00:00" + "'", str59, "+00:00");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + (-356399989L) + "'", long63 == (-356399989L));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 1295999996004000033L + "'", long67 == 1295999996004000033L);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(chronology70);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + (-35999999L) + "'", long72 == (-35999999L));
    }

    @Test
    public void test20067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20067");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology7.monthOfYear();
        org.joda.time.DurationField durationField10 = ethiopicChronology7.centuries();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology7.dayOfYear();
        org.joda.time.DurationField durationField12 = ethiopicChronology7.days();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test20068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20068");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology8.millisOfDay();
        org.joda.time.Chronology chronology10 = ethiopicChronology8.withUTC();
        org.joda.time.DurationField durationField11 = ethiopicChronology8.weeks();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology8.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology8.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology8.hourOfHalfday();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(ethiopicChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test20069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20069");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone3.nextTransition(999L);
        long long8 = dateTimeZone3.convertLocalToUTC(52L, true);
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone11.getOffset(readableInstant12);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology14 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology14.yearOfEra();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 999L + "'", long5 == 999L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ethiopicChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test20070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20070");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        long long10 = dateTimeZone6.convertLocalToUTC(100L, false, 1L);
        java.lang.String str11 = dateTimeZone6.getID();
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone6.getOffset(readableInstant12);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        java.lang.String str16 = dateTimeZone6.getName(35L);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology17 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology17.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology17.secondOfMinute();
        org.joda.time.DurationField durationField20 = ethiopicChronology17.halfdays();
        int int21 = ethiopicChronology17.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology17.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone23 = ethiopicChronology17.getZone();
        long long25 = dateTimeZone6.getMillisKeepLocal(dateTimeZone23, (long) 4);
        org.joda.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = dateTimeZone23.isLocalDateTimeGap(localDateTime26);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology28 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField29 = ethiopicChronology28.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField30 = ethiopicChronology28.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.Chronology chronology32 = ethiopicChronology28.withZone(dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField33 = ethiopicChronology28.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField34 = ethiopicChronology28.minuteOfDay();
        org.joda.time.DurationField durationField35 = ethiopicChronology28.centuries();
        boolean boolean36 = dateTimeZone23.equals((java.lang.Object) ethiopicChronology28);
        org.joda.time.DurationField durationField37 = ethiopicChronology28.halfdays();
        org.joda.time.DurationField durationField38 = ethiopicChronology28.days();
        java.lang.String str39 = ethiopicChronology28.toString();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertNotNull(ethiopicChronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 4L + "'", long25 == 4L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(ethiopicChronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "EthiopicChronology[UTC]" + "'", str39, "EthiopicChronology[UTC]");
    }

    @Test
    public void test20071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20071");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology8.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone10 = ethiopicChronology8.getZone();
        org.joda.time.DurationField durationField11 = ethiopicChronology8.months();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = ethiopicChronology8.add(readablePeriod12, (long) (short) -1, (int) '#');
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology8.yearOfCentury();
        org.joda.time.DurationField durationField17 = ethiopicChronology8.days();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours(100);
        boolean boolean20 = dateTimeZone19.isFixed();
        java.util.TimeZone timeZone21 = dateTimeZone19.toTimeZone();
        org.joda.time.Chronology chronology22 = ethiopicChronology8.withZone(dateTimeZone19);
        java.lang.String str24 = dateTimeZone19.getShortName((long) 'a');
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(ethiopicChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "GMT+:0:00");
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+100:00" + "'", str24, "+100:00");
    }

    @Test
    public void test20072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20072");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = ethiopicChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = ethiopicChronology0.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField16 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology0.clockhourOfHalfday();
        java.lang.String str19 = ethiopicChronology0.toString();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EthiopicChronology[UTC]" + "'", str19, "EthiopicChronology[UTC]");
    }

    @Test
    public void test20073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20073");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, 35);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology3 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(ethiopicChronology3);
    }

    @Test
    public void test20074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20074");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone3.getShortName((long) ' ', locale5);
        org.joda.time.Chronology chronology7 = ethiopicChronology0.withZone(dateTimeZone3);
        java.lang.String str9 = dateTimeZone3.getNameKey((-494399989L));
        org.joda.time.chrono.EthiopicChronology ethiopicChronology10 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField11 = ethiopicChronology10.seconds();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = ethiopicChronology10.add(readablePeriod12, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology10.clockhourOfHalfday();
        org.joda.time.DurationField durationField17 = ethiopicChronology10.minutes();
        org.joda.time.DateTimeZone dateTimeZone18 = ethiopicChronology10.getZone();
        int int20 = dateTimeZone18.getStandardOffset(97L);
        long long22 = dateTimeZone18.previousTransition(999L);
        long long26 = dateTimeZone18.convertLocalToUTC(971L, false, (long) 4);
        boolean boolean27 = dateTimeZone3.equals((java.lang.Object) long26);
        int int29 = dateTimeZone3.getStandardOffset((-189299968L));
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(ethiopicChronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 999L + "'", long22 == 999L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 971L + "'", long26 == 971L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test20075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20075");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = ethiopicChronology0.getZone();
        long long6 = ethiopicChronology0.add(10L, 359999999L, (-1));
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone9 = ethiopicChronology0.getZone();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-359999989L) + "'", long6 == (-359999989L));
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test20076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20076");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.Chronology chronology1 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.minuteOfDay();
        java.lang.String str3 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.era();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.dayOfYear();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology7.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology7.year();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology10 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField11 = ethiopicChronology10.seconds();
        org.joda.time.DurationField durationField12 = ethiopicChronology10.years();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology14 = ethiopicChronology10.withZone(dateTimeZone13);
        java.lang.String str16 = dateTimeZone13.getNameKey((long) 1);
        org.joda.time.Chronology chronology17 = ethiopicChronology7.withZone(dateTimeZone13);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology18 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField19 = ethiopicChronology18.seconds();
        org.joda.time.DurationField durationField20 = ethiopicChronology18.years();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology22 = ethiopicChronology18.withZone(dateTimeZone21);
        java.lang.String str24 = dateTimeZone21.getNameKey((long) 1);
        int int26 = dateTimeZone21.getStandardOffset((long) (short) 0);
        long long28 = dateTimeZone13.getMillisKeepLocal(dateTimeZone21, (long) (short) 10);
        long long31 = dateTimeZone21.adjustOffset((-82799999L), true);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology32 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField33 = ethiopicChronology32.seconds();
        org.joda.time.DurationField durationField34 = ethiopicChronology32.years();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology36 = ethiopicChronology32.withZone(dateTimeZone35);
        boolean boolean37 = dateTimeZone35.isFixed();
        java.lang.String str38 = dateTimeZone35.getID();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology40 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone35, 4);
        org.joda.time.DateTimeField dateTimeField41 = ethiopicChronology40.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone42 = ethiopicChronology40.getZone();
        long long44 = dateTimeZone21.getMillisKeepLocal(dateTimeZone42, 3600001L);
        long long46 = dateTimeZone21.convertUTCToLocal(288L);
        org.joda.time.Chronology chronology47 = ethiopicChronology0.withZone(dateTimeZone21);
        java.util.Locale locale49 = null;
        java.lang.String str50 = dateTimeZone21.getName(189300099L, locale49);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EthiopicChronology[UTC]" + "'", str3, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(ethiopicChronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(ethiopicChronology18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTC" + "'", str24, "UTC");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 10L + "'", long28 == 10L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-82799999L) + "'", long31 == (-82799999L));
        org.junit.Assert.assertNotNull(ethiopicChronology32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "UTC" + "'", str38, "UTC");
        org.junit.Assert.assertNotNull(ethiopicChronology40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 3600001L + "'", long44 == 3600001L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 288L + "'", long46 == 288L);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+00:00" + "'", str50, "+00:00");
    }

    @Test
    public void test20077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20077");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.era();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.secondOfMinute();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test20078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20078");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00");
        java.lang.String str2 = dateTimeZone1.getID();
        boolean boolean3 = dateTimeZone1.isFixed();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone1.getShortName((long) (-1), locale5);
        java.lang.String str8 = dateTimeZone1.getNameKey(0L);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone1.getShortName((-618855551999900L), locale10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
    }

    @Test
    public void test20079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20079");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.year();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology3 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField4 = ethiopicChronology3.seconds();
        org.joda.time.DurationField durationField5 = ethiopicChronology3.years();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology7 = ethiopicChronology3.withZone(dateTimeZone6);
        java.lang.String str9 = dateTimeZone6.getNameKey((long) 1);
        org.joda.time.Chronology chronology10 = ethiopicChronology0.withZone(dateTimeZone6);
        long long13 = dateTimeZone6.convertLocalToUTC((long) 0, true);
        long long15 = dateTimeZone6.convertUTCToLocal((long) (short) -1);
        java.lang.String str16 = dateTimeZone6.getID();
        long long18 = dateTimeZone6.previousTransition((long) (short) -1);
        long long21 = dateTimeZone6.convertLocalToUTC((long) (-1), true);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone6.getShortName((-3599966L), locale23);
        int int26 = dateTimeZone6.getOffsetFromLocal((long) (short) 0);
        java.lang.String str28 = dateTimeZone6.getName(21807393006900032L);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(ethiopicChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00" + "'", str28, "+00:00");
    }

    @Test
    public void test20080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20080");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = ethiopicChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.era();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField15 = ethiopicChronology0.years();
        org.joda.time.DurationField durationField16 = ethiopicChronology0.millis();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test20081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20081");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, 0);
        int int4 = dateTimeZone2.getOffset(90L);
        java.lang.String str5 = dateTimeZone2.toString();
        java.lang.String str6 = dateTimeZone2.getID();
        long long10 = dateTimeZone2.convertLocalToUTC((-82800053L), true, 102L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3600000 + "'", int4 == 3600000);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+01:00" + "'", str5, "+01:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+01:00" + "'", str6, "+01:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-86400053L) + "'", long10 == (-86400053L));
    }

    @Test
    public void test20082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20082");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology7.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology7.monthOfYear();
        org.joda.time.DurationField durationField10 = ethiopicChronology7.centuries();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology7.dayOfMonth();
        org.joda.time.DurationField durationField12 = ethiopicChronology7.millis();
        org.joda.time.DurationField durationField13 = ethiopicChronology7.weeks();
        long long17 = ethiopicChronology7.add(135L, (-359999900L), 189300000);
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology7.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone19 = ethiopicChronology7.getZone();
        long long23 = dateTimeZone19.convertLocalToUTC(35999900L, true, (-221064903L));
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-68147981069999865L) + "'", long17 == (-68147981069999865L));
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 35999900L + "'", long23 == 35999900L);
    }

    @Test
    public void test20083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20083");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.monthOfYear();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.years();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology8.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology8.weekyear();
        org.joda.time.DurationField durationField11 = ethiopicChronology8.hours();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology8.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone13 = ethiopicChronology8.getZone();
        java.lang.String str14 = dateTimeZone13.getID();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology15 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone13);
        org.joda.time.Chronology chronology16 = ethiopicChronology0.withZone(dateTimeZone13);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(ethiopicChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertNotNull(ethiopicChronology15);
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test20084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20084");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = ethiopicChronology0.getZone();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone2.getShortName(10L, locale4);
        java.lang.String str7 = dateTimeZone2.getName((long) (-3600000));
        long long11 = dateTimeZone2.convertLocalToUTC(210L, true, 971L);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology12 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone2);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology13 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology13.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology13.year();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology16 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField17 = ethiopicChronology16.seconds();
        org.joda.time.DurationField durationField18 = ethiopicChronology16.years();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology20 = ethiopicChronology16.withZone(dateTimeZone19);
        java.lang.String str22 = dateTimeZone19.getNameKey((long) 1);
        org.joda.time.Chronology chronology23 = ethiopicChronology13.withZone(dateTimeZone19);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology24 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField25 = ethiopicChronology24.seconds();
        org.joda.time.DurationField durationField26 = ethiopicChronology24.years();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology28 = ethiopicChronology24.withZone(dateTimeZone27);
        java.lang.String str30 = dateTimeZone27.getNameKey((long) 1);
        int int32 = dateTimeZone27.getStandardOffset((long) (short) 0);
        long long34 = dateTimeZone19.getMillisKeepLocal(dateTimeZone27, (long) (short) 10);
        java.util.Locale locale36 = null;
        java.lang.String str37 = dateTimeZone27.getName((long) 4, locale36);
        org.joda.time.Chronology chronology38 = ethiopicChronology12.withZone(dateTimeZone27);
        int int40 = dateTimeZone27.getOffsetFromLocal((-189299900L));
        org.joda.time.ReadableInstant readableInstant41 = null;
        int int42 = dateTimeZone27.getOffset(readableInstant41);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology43 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField44 = ethiopicChronology43.seconds();
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        long long48 = ethiopicChronology43.add(readablePeriod45, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        long long52 = ethiopicChronology43.add(readablePeriod49, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.Chronology chronology54 = ethiopicChronology43.withZone(dateTimeZone53);
        org.joda.time.DurationField durationField55 = ethiopicChronology43.minutes();
        org.joda.time.DateTimeField dateTimeField56 = ethiopicChronology43.minuteOfHour();
        boolean boolean57 = dateTimeZone27.equals((java.lang.Object) ethiopicChronology43);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 210L + "'", long11 == 210L);
        org.junit.Assert.assertNotNull(ethiopicChronology12);
        org.junit.Assert.assertNotNull(ethiopicChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(ethiopicChronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(ethiopicChronology24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "UTC" + "'", str30, "UTC");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10L + "'", long34 == 10L);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:00" + "'", str37, "+00:00");
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(ethiopicChronology43);
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1L + "'", long48 == 1L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1L + "'", long52 == 1L);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(durationField55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test20085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20085");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology7.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology7.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = ethiopicChronology7.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology7.year();
        org.joda.time.DateTimeZone dateTimeZone13 = ethiopicChronology7.getZone();
        long long17 = dateTimeZone13.convertLocalToUTC(100L, false, 1L);
        java.lang.String str18 = dateTimeZone13.getID();
        long long21 = dateTimeZone13.adjustOffset(359999999L, true);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology22 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField23 = ethiopicChronology22.seconds();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology24 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField25 = ethiopicChronology24.seconds();
        org.joda.time.DurationField durationField26 = ethiopicChronology24.years();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology28 = ethiopicChronology24.withZone(dateTimeZone27);
        java.lang.String str30 = dateTimeZone27.getNameKey((long) 1);
        boolean boolean32 = dateTimeZone27.equals((java.lang.Object) (-1.0f));
        int int34 = dateTimeZone27.getOffset((long) 100);
        org.joda.time.Chronology chronology35 = ethiopicChronology22.withZone(dateTimeZone27);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology36 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField37 = ethiopicChronology36.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField38 = ethiopicChronology36.year();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology39 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField40 = ethiopicChronology39.seconds();
        org.joda.time.DurationField durationField41 = ethiopicChronology39.years();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology43 = ethiopicChronology39.withZone(dateTimeZone42);
        java.lang.String str45 = dateTimeZone42.getNameKey((long) 1);
        org.joda.time.Chronology chronology46 = ethiopicChronology36.withZone(dateTimeZone42);
        long long49 = dateTimeZone42.convertLocalToUTC((long) 0, true);
        long long51 = dateTimeZone42.convertUTCToLocal((long) (byte) 100);
        org.joda.time.Chronology chronology52 = ethiopicChronology22.withZone(dateTimeZone42);
        long long54 = dateTimeZone13.getMillisKeepLocal(dateTimeZone42, 0L);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology55 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField56 = ethiopicChronology55.seconds();
        org.joda.time.DurationField durationField57 = ethiopicChronology55.years();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology59 = ethiopicChronology55.withZone(dateTimeZone58);
        boolean boolean60 = dateTimeZone58.isFixed();
        long long62 = dateTimeZone58.convertUTCToLocal(10L);
        long long64 = dateTimeZone13.getMillisKeepLocal(dateTimeZone58, (long) (byte) 10);
        org.joda.time.Chronology chronology65 = ethiopicChronology0.withZone(dateTimeZone58);
        org.joda.time.DateTimeField dateTimeField66 = ethiopicChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 359999999L + "'", long21 == 359999999L);
        org.junit.Assert.assertNotNull(ethiopicChronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(ethiopicChronology24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "UTC" + "'", str30, "UTC");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(ethiopicChronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(ethiopicChronology39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "UTC" + "'", str45, "UTC");
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 100L + "'", long51 == 100L);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertNotNull(ethiopicChronology55);
        org.junit.Assert.assertNotNull(durationField56);
        org.junit.Assert.assertNotNull(durationField57);
        org.junit.Assert.assertNotNull(dateTimeZone58);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 10L + "'", long62 == 10L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 10L + "'", long64 == 10L);
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertNotNull(dateTimeField66);
    }

    @Test
    public void test20086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20086");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.weekyear();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = ethiopicChronology0.add(readablePeriod9, 102L, 10);
        org.joda.time.DateTimeZone dateTimeZone13 = ethiopicChronology0.getZone();
        org.joda.time.DurationField durationField14 = ethiopicChronology0.weeks();
        org.joda.time.DurationField durationField15 = ethiopicChronology0.days();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 102L + "'", long12 == 102L);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test20087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20087");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone3 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.millisOfDay();
        java.lang.String str5 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = ethiopicChronology0.getDateTimeMillis(0, (int) (byte) 100, (int) (byte) -1, (int) (short) 10, (int) (byte) -1, 349200000, 363120000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EthiopicChronology[UTC]" + "'", str5, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test20088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20088");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.secondOfDay();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forID("+00:00");
        java.lang.String str10 = dateTimeZone9.getID();
        boolean boolean11 = dateTimeZone9.isFixed();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone9.getShortName((long) (-1), locale13);
        org.joda.time.Chronology chronology15 = ethiopicChronology0.withZone(dateTimeZone9);
        java.lang.String str16 = chronology15.toString();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.dayOfYear();
        org.joda.time.DateTimeField dateTimeField19 = chronology15.dayOfYear();
        org.joda.time.DateTimeField dateTimeField20 = chronology15.dayOfYear();
        org.joda.time.DurationField durationField21 = chronology15.hours();
        org.joda.time.DurationField durationField22 = chronology15.weeks();
        org.joda.time.DateTimeField dateTimeField23 = chronology15.yearOfEra();
        org.joda.time.DateTimeField dateTimeField24 = chronology15.millisOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EthiopicChronology[UTC]" + "'", str16, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test20089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20089");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.seconds();
        int int5 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = ethiopicChronology0.getDateTimeMillis(259200189300000L, 100, 60000, 360000000, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test20090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20090");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DurationField durationField6 = ethiopicChronology0.millis();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.secondOfMinute();
        org.joda.time.Chronology chronology10 = ethiopicChronology0.withUTC();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ethiopicChronology0.get(readablePeriod11, 138213983999998L, 9843603210L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test20091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20091");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        java.lang.String str3 = dateTimeZone0.getNameKey(1L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(ethiopicChronology1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
    }

    @Test
    public void test20092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20092");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.year();
        java.lang.String str7 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.days();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.centuryOfEra();
        org.joda.time.Chronology chronology12 = ethiopicChronology0.withUTC();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EthiopicChronology[UTC]" + "'", str7, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test20093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20093");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weekyears();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.centuries();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.dayOfYear();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.monthOfYear();
        org.joda.time.DurationField durationField12 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.secondOfDay();
        long long18 = ethiopicChronology0.add(3L, 684000000L, 37920000);
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology0.weekyear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 25937280000000003L + "'", long18 == 25937280000000003L);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test20094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20094");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = ethiopicChronology0.getZone();
        long long6 = ethiopicChronology0.add(10L, 359999999L, (-1));
        org.joda.time.DurationField durationField7 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeZone dateTimeZone8 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology9 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone8);
        java.lang.String str10 = dateTimeZone8.getID();
        boolean boolean11 = dateTimeZone8.isFixed();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-359999989L) + "'", long6 == (-359999989L));
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(ethiopicChronology9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test20095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20095");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = ethiopicChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.monthOfYear();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.months();
        long long15 = ethiopicChronology0.add(3600000L, (long) (short) 1, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField18 = ethiopicChronology0.millis();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3600001L + "'", long15 == 3600001L);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test20096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20096");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.hours();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone4 = ethiopicChronology0.getZone();
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        long long8 = dateTimeZone4.adjustOffset((-82799999L), false);
        java.lang.String str9 = dateTimeZone4.getID();
        java.lang.String str11 = dateTimeZone4.getNameKey(0L);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-82799999L) + "'", long8 == (-82799999L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
    }

    @Test
    public void test20097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20097");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone5 = ethiopicChronology0.getZone();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.months();
        org.joda.time.DateTimeZone dateTimeZone7 = ethiopicChronology0.getZone();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = ethiopicChronology0.add(readablePeriod8, (-60797606399990L), 60000);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-60797606399990L) + "'", long11 == (-60797606399990L));
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test20098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20098");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone7 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField9 = ethiopicChronology8.seconds();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = ethiopicChronology8.add(readablePeriod10, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology8.secondOfDay();
        org.joda.time.DurationField durationField15 = ethiopicChronology8.weekyears();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forID("+00:00");
        java.lang.String str18 = dateTimeZone17.getID();
        boolean boolean19 = dateTimeZone17.isFixed();
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone17.getShortName((long) (-1), locale21);
        org.joda.time.Chronology chronology23 = ethiopicChronology8.withZone(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField24 = ethiopicChronology8.weekyearOfCentury();
        boolean boolean25 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology8);
        org.joda.time.DurationField durationField26 = ethiopicChronology8.halfdays();
        org.joda.time.DateTimeField dateTimeField27 = ethiopicChronology8.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField28 = ethiopicChronology8.weekyearOfCentury();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(ethiopicChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
    }

    @Test
    public void test20099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20099");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.era();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.era();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeZone dateTimeZone9 = ethiopicChronology0.getZone();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.centuries();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test20100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20100");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        int int4 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekyear();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = ethiopicChronology0.add(readablePeriod6, 5L, 4);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.years();
        int int12 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField13 = ethiopicChronology0.millis();
        long long17 = ethiopicChronology0.add((-82800000L), (-61885555199925L), (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology0.year();
        long long22 = ethiopicChronology0.add(189294540L, 3599999L, (int) (short) 0);
        java.lang.String str23 = ethiopicChronology0.toString();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5L + "'", long9 == 5L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-6188555602792500L) + "'", long17 == (-6188555602792500L));
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 189294540L + "'", long22 == 189294540L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "EthiopicChronology[UTC]" + "'", str23, "EthiopicChronology[UTC]");
    }

    @Test
    public void test20101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20101");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.hours();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.halfdays();
        long long12 = ethiopicChronology0.add((long) 10, (long) '4', (-3600000));
        org.joda.time.Chronology chronology13 = ethiopicChronology0.withUTC();
        org.joda.time.Chronology chronology14 = ethiopicChronology0.withUTC();
        org.joda.time.DurationField durationField15 = ethiopicChronology0.weeks();
        org.joda.time.DurationField durationField16 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology0.monthOfYear();
        org.joda.time.DurationField durationField18 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField21 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, 4);
        boolean boolean26 = dateTimeZone25.isFixed();
        int int28 = dateTimeZone25.getOffset((-82800000L));
        java.lang.String str29 = dateTimeZone25.toString();
        long long31 = dateTimeZone25.convertUTCToLocal(289443600803L);
        int int33 = dateTimeZone25.getOffset(111600000L);
        java.lang.String str35 = dateTimeZone25.getName((long) 4);
        org.joda.time.Chronology chronology36 = ethiopicChronology0.withZone(dateTimeZone25);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187199990L) + "'", long12 == (-187199990L));
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-3840000) + "'", int28 == (-3840000));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-01:04" + "'", str29, "-01:04");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 289439760803L + "'", long31 == 289439760803L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-3840000) + "'", int33 == (-3840000));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "-01:04" + "'", str35, "-01:04");
        org.junit.Assert.assertNotNull(chronology36);
    }

    @Test
    public void test20102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20102");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.weekyears();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test20103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20103");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        int int4 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.halfdays();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology7.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology7.year();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology10 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField11 = ethiopicChronology10.seconds();
        org.joda.time.DurationField durationField12 = ethiopicChronology10.years();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology14 = ethiopicChronology10.withZone(dateTimeZone13);
        java.lang.String str16 = dateTimeZone13.getNameKey((long) 1);
        org.joda.time.Chronology chronology17 = ethiopicChronology7.withZone(dateTimeZone13);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology18 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField19 = ethiopicChronology18.seconds();
        org.joda.time.DurationField durationField20 = ethiopicChronology18.years();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology22 = ethiopicChronology18.withZone(dateTimeZone21);
        java.lang.String str24 = dateTimeZone21.getNameKey((long) 1);
        int int26 = dateTimeZone21.getStandardOffset((long) (short) 0);
        long long28 = dateTimeZone13.getMillisKeepLocal(dateTimeZone21, (long) (short) 10);
        int int30 = dateTimeZone13.getStandardOffset((long) (byte) 100);
        long long33 = dateTimeZone13.convertLocalToUTC((long) (byte) 0, true);
        java.util.Locale locale35 = null;
        java.lang.String str36 = dateTimeZone13.getShortName(999L, locale35);
        long long40 = dateTimeZone13.convertLocalToUTC(0L, false, (long) (byte) 0);
        org.joda.time.Chronology chronology41 = ethiopicChronology0.withZone(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField42 = ethiopicChronology0.halfdayOfDay();
        long long46 = ethiopicChronology0.add(0L, (-360000024L), (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long51 = ethiopicChronology0.getDateTimeMillis((-1), 6720000, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6720000 for monthOfYear must be in the range [1,13]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(ethiopicChronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(ethiopicChronology18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTC" + "'", str24, "UTC");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 10L + "'", long28 == 10L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00" + "'", str36, "+00:00");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
    }

    @Test
    public void test20104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20104");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.hours();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.dayOfMonth();
        int int10 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        java.lang.String str11 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EthiopicChronology[UTC]" + "'", str11, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test20105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20105");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.year();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology3 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField4 = ethiopicChronology3.seconds();
        org.joda.time.DurationField durationField5 = ethiopicChronology3.years();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology7 = ethiopicChronology3.withZone(dateTimeZone6);
        java.lang.String str9 = dateTimeZone6.getNameKey((long) 1);
        org.joda.time.Chronology chronology10 = ethiopicChronology0.withZone(dateTimeZone6);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology11 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField12 = ethiopicChronology11.seconds();
        org.joda.time.DurationField durationField13 = ethiopicChronology11.years();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology15 = ethiopicChronology11.withZone(dateTimeZone14);
        java.lang.String str17 = dateTimeZone14.getNameKey((long) 1);
        int int19 = dateTimeZone14.getStandardOffset((long) (short) 0);
        long long21 = dateTimeZone6.getMillisKeepLocal(dateTimeZone14, (long) (short) 10);
        long long25 = dateTimeZone14.convertLocalToUTC(32L, true, (long) (-1));
        java.lang.String str27 = dateTimeZone14.getShortName(36000097L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(ethiopicChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(ethiopicChronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
    }

    @Test
    public void test20106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20106");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology9 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology9.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology9.year();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology12 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField13 = ethiopicChronology12.seconds();
        org.joda.time.DurationField durationField14 = ethiopicChronology12.years();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology16 = ethiopicChronology12.withZone(dateTimeZone15);
        java.lang.String str18 = dateTimeZone15.getNameKey((long) 1);
        org.joda.time.Chronology chronology19 = ethiopicChronology9.withZone(dateTimeZone15);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology20 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField21 = ethiopicChronology20.seconds();
        org.joda.time.DurationField durationField22 = ethiopicChronology20.years();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology24 = ethiopicChronology20.withZone(dateTimeZone23);
        java.lang.String str26 = dateTimeZone23.getNameKey((long) 1);
        int int28 = dateTimeZone23.getStandardOffset((long) (short) 0);
        long long30 = dateTimeZone15.getMillisKeepLocal(dateTimeZone23, (long) (short) 10);
        java.lang.String str32 = dateTimeZone15.getName(359999999L);
        long long34 = dateTimeZone15.convertUTCToLocal((long) (byte) 0);
        java.util.Locale locale36 = null;
        java.lang.String str37 = dateTimeZone15.getName(5L, locale36);
        java.util.TimeZone timeZone38 = dateTimeZone15.toTimeZone();
        org.joda.time.Chronology chronology39 = ethiopicChronology8.withZone(dateTimeZone15);
        java.lang.String str40 = dateTimeZone15.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology42 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField43 = ethiopicChronology42.seconds();
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        long long47 = ethiopicChronology42.add(readablePeriod44, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DurationField durationField48 = ethiopicChronology42.millis();
        java.lang.String str49 = ethiopicChronology42.toString();
        org.joda.time.DateTimeField dateTimeField50 = ethiopicChronology42.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField51 = ethiopicChronology42.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField52 = ethiopicChronology42.hourOfHalfday();
        boolean boolean53 = dateTimeZone15.equals((java.lang.Object) ethiopicChronology42);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(ethiopicChronology8);
        org.junit.Assert.assertNotNull(ethiopicChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(ethiopicChronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(ethiopicChronology20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UTC" + "'", str26, "UTC");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:00" + "'", str37, "+00:00");
        org.junit.Assert.assertNotNull(timeZone38);
        org.junit.Assert.assertEquals(timeZone38.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "UTC" + "'", str40, "UTC");
        org.junit.Assert.assertNotNull(ethiopicChronology42);
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1L + "'", long47 == 1L);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "EthiopicChronology[UTC]" + "'", str49, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test20107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20107");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 10);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField3 = ethiopicChronology2.seconds();
        org.joda.time.DurationField durationField4 = ethiopicChronology2.weekyears();
        org.joda.time.DurationField durationField5 = ethiopicChronology2.minutes();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(ethiopicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test20108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20108");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.hourOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test20109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20109");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = ethiopicChronology0.getZone();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeZone dateTimeZone5 = chronology4.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology6 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology6.millisOfSecond();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(ethiopicChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test20110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20110");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.months();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.minutes();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.months();
        org.joda.time.Chronology chronology8 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test20111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20111");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        int int4 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        boolean boolean10 = dateTimeZone9.isFixed();
        java.lang.String str11 = dateTimeZone9.toString();
        boolean boolean13 = dateTimeZone9.isStandardOffset(0L);
        boolean boolean15 = dateTimeZone9.isStandardOffset((-187199990L));
        org.joda.time.Chronology chronology16 = ethiopicChronology7.withZone(dateTimeZone9);
        long long18 = dateTimeZone9.convertUTCToLocal((-187199890L));
        boolean boolean20 = dateTimeZone9.isStandardOffset(60652799996400015L);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+10:00" + "'", str11, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-151199890L) + "'", long18 == (-151199890L));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test20112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20112");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.days();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology9 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology9.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology9.secondOfMinute();
        org.joda.time.DurationField durationField12 = ethiopicChronology9.halfdays();
        org.joda.time.DurationField durationField13 = ethiopicChronology9.months();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology9.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology9.year();
        java.lang.String str16 = ethiopicChronology9.toString();
        org.joda.time.DurationField durationField17 = ethiopicChronology9.days();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology9.minuteOfHour();
        boolean boolean19 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology9);
        // The following exception was thrown during execution in test generation
        try {
            long long27 = ethiopicChronology9.getDateTimeMillis(60000, 126060000, (int) (byte) 10, 189300000, (int) (byte) 0, 0, (-3840000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 189300000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(ethiopicChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EthiopicChronology[UTC]" + "'", str16, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test20113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20113");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        long long10 = ethiopicChronology0.add((-359999989L), 1L, 3600000);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone13 = ethiopicChronology0.getZone();
        org.joda.time.DurationField durationField14 = ethiopicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.year();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-356399989L) + "'", long10 == (-356399989L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test20114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20114");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = ethiopicChronology0.getZone();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.days();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.hourOfHalfday();
        java.lang.Class<?> wildcardClass6 = ethiopicChronology0.getClass();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test20115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20115");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.Chronology chronology1 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology3 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField4 = ethiopicChronology3.seconds();
        org.joda.time.DurationField durationField5 = ethiopicChronology3.years();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology7 = ethiopicChronology3.withZone(dateTimeZone6);
        java.lang.String str9 = dateTimeZone6.getNameKey((long) 1);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology10 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone6);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone6.getName(0L, locale12);
        org.joda.time.Chronology chronology14 = ethiopicChronology0.withZone(dateTimeZone6);
        java.lang.String str15 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField16 = ethiopicChronology0.weekyears();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(ethiopicChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(ethiopicChronology10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EthiopicChronology[UTC]" + "'", str15, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test20116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20116");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.clockhourOfHalfday();
        java.lang.String str6 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.yearOfCentury();
        org.joda.time.Chronology chronology8 = ethiopicChronology0.withUTC();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EthiopicChronology[UTC]" + "'", str6, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test20117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20117");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.minutes();
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withUTC();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.centuryOfEra();
        org.joda.time.Chronology chronology6 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.era();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test20118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20118");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.yearOfEra();
        java.lang.String str6 = ethiopicChronology0.toString();
        java.lang.String str7 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.era();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EthiopicChronology[UTC]" + "'", str6, "EthiopicChronology[UTC]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EthiopicChronology[UTC]" + "'", str7, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test20119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20119");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.millis();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.hours();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.hourOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.seconds();
        long long10 = ethiopicChronology0.add(189299904L, (-58746196800000L), (int) (short) -1);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 58746386099904L + "'", long10 == 58746386099904L);
    }

    @Test
    public void test20120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20120");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        int int4 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.weeks();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField9 = ethiopicChronology8.seconds();
        org.joda.time.DurationField durationField10 = ethiopicChronology8.years();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology12 = ethiopicChronology8.withZone(dateTimeZone11);
        java.lang.String str14 = dateTimeZone11.getNameKey((long) 1);
        int int16 = dateTimeZone11.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        boolean boolean19 = dateTimeZone11.isStandardOffset((long) (short) 10);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology20 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField21 = ethiopicChronology20.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone22 = ethiopicChronology20.getZone();
        boolean boolean23 = dateTimeZone11.equals((java.lang.Object) ethiopicChronology20);
        boolean boolean24 = dateTimeZone11.isFixed();
        org.joda.time.Chronology chronology25 = ethiopicChronology0.withZone(dateTimeZone11);
        org.joda.time.DurationField durationField26 = ethiopicChronology0.millis();
        org.joda.time.DurationField durationField27 = ethiopicChronology0.halfdays();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology28 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField29 = ethiopicChronology28.seconds();
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        long long33 = ethiopicChronology28.add(readablePeriod30, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        long long37 = ethiopicChronology28.add(readablePeriod34, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.Chronology chronology39 = ethiopicChronology28.withZone(dateTimeZone38);
        org.joda.time.DateTimeField dateTimeField40 = ethiopicChronology28.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField41 = ethiopicChronology28.hourOfDay();
        org.joda.time.DateTimeField dateTimeField42 = ethiopicChronology28.era();
        org.joda.time.DurationField durationField43 = ethiopicChronology28.months();
        org.joda.time.DurationField durationField44 = ethiopicChronology28.hours();
        org.joda.time.DateTimeField dateTimeField45 = ethiopicChronology28.secondOfDay();
        org.joda.time.DateTimeField dateTimeField46 = ethiopicChronology28.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField47 = ethiopicChronology28.minuteOfHour();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology48 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField49 = ethiopicChronology48.seconds();
        org.joda.time.DurationField durationField50 = ethiopicChronology48.years();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology52 = ethiopicChronology48.withZone(dateTimeZone51);
        java.lang.String str54 = dateTimeZone51.getNameKey((long) 1);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology55 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone51);
        org.joda.time.DateTimeField dateTimeField56 = ethiopicChronology55.millisOfSecond();
        long long60 = ethiopicChronology55.add(35L, 0L, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        long long64 = ethiopicChronology55.add(readablePeriod61, (long) (short) 0, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone65 = ethiopicChronology55.getZone();
        org.joda.time.LocalDateTime localDateTime66 = null;
        boolean boolean67 = dateTimeZone65.isLocalDateTimeGap(localDateTime66);
        org.joda.time.Chronology chronology68 = ethiopicChronology28.withZone(dateTimeZone65);
        org.joda.time.Chronology chronology69 = ethiopicChronology0.withZone(dateTimeZone65);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology70 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField71 = ethiopicChronology70.seconds();
        org.joda.time.DurationField durationField72 = ethiopicChronology70.years();
        org.joda.time.DateTimeField dateTimeField73 = ethiopicChronology70.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField74 = ethiopicChronology70.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField75 = ethiopicChronology70.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone77 = org.joda.time.DateTimeZone.forOffsetHours(100);
        boolean boolean78 = dateTimeZone77.isFixed();
        int int80 = dateTimeZone77.getOffsetFromLocal((long) 0);
        java.util.Locale locale82 = null;
        java.lang.String str83 = dateTimeZone77.getShortName((-359999989L), locale82);
        java.lang.String str84 = dateTimeZone77.toString();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology85 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField86 = ethiopicChronology85.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone87 = ethiopicChronology85.getZone();
        boolean boolean88 = dateTimeZone87.isFixed();
        long long90 = dateTimeZone77.getMillisKeepLocal(dateTimeZone87, (long) (-1));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone77);
        java.util.TimeZone timeZone92 = dateTimeZone77.toTimeZone();
        org.joda.time.Chronology chronology93 = ethiopicChronology70.withZone(dateTimeZone77);
        org.joda.time.DateTimeField dateTimeField94 = ethiopicChronology70.weekyearOfCentury();
        org.joda.time.DurationField durationField95 = ethiopicChronology70.days();
        boolean boolean96 = ethiopicChronology0.equals((java.lang.Object) durationField95);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(ethiopicChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(ethiopicChronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(ethiopicChronology28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1L + "'", long33 == 1L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1L + "'", long37 == 1L);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(ethiopicChronology48);
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertNotNull(durationField50);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "UTC" + "'", str54, "UTC");
        org.junit.Assert.assertNotNull(ethiopicChronology55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 35L + "'", long60 == 35L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(chronology68);
        org.junit.Assert.assertNotNull(chronology69);
        org.junit.Assert.assertNotNull(ethiopicChronology70);
        org.junit.Assert.assertNotNull(durationField71);
        org.junit.Assert.assertNotNull(durationField72);
        org.junit.Assert.assertNotNull(dateTimeField73);
        org.junit.Assert.assertNotNull(dateTimeField74);
        org.junit.Assert.assertNotNull(dateTimeField75);
        org.junit.Assert.assertNotNull(dateTimeZone77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 360000000 + "'", int80 == 360000000);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "+100:00" + "'", str83, "+100:00");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "+100:00" + "'", str84, "+100:00");
        org.junit.Assert.assertNotNull(ethiopicChronology85);
        org.junit.Assert.assertNotNull(dateTimeField86);
        org.junit.Assert.assertNotNull(dateTimeZone87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 359999999L + "'", long90 == 359999999L);
        org.junit.Assert.assertNotNull(timeZone92);
        org.junit.Assert.assertEquals(timeZone92.getDisplayName(), "GMT+:0:00");
        org.junit.Assert.assertNotNull(chronology93);
        org.junit.Assert.assertNotNull(dateTimeField94);
        org.junit.Assert.assertNotNull(durationField95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test20121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20121");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.millisOfDay();
        int int6 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test20122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20122");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        int int8 = dateTimeZone3.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        boolean boolean11 = dateTimeZone3.isStandardOffset((long) (short) 10);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology12 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology12.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone14 = ethiopicChronology12.getZone();
        boolean boolean15 = dateTimeZone3.equals((java.lang.Object) ethiopicChronology12);
        boolean boolean16 = dateTimeZone3.isFixed();
        org.joda.time.ReadableInstant readableInstant17 = null;
        int int18 = dateTimeZone3.getOffset(readableInstant17);
        org.joda.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = dateTimeZone3.isLocalDateTimeGap(localDateTime19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone3.getOffset(readableInstant21);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology23 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField24 = ethiopicChronology23.seconds();
        org.joda.time.DurationField durationField25 = ethiopicChronology23.hours();
        org.joda.time.DurationField durationField26 = ethiopicChronology23.seconds();
        org.joda.time.DurationField durationField27 = ethiopicChronology23.halfdays();
        org.joda.time.DateTimeField dateTimeField28 = ethiopicChronology23.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField29 = ethiopicChronology23.halfdayOfDay();
        org.joda.time.DurationField durationField30 = ethiopicChronology23.hours();
        org.joda.time.DateTimeField dateTimeField31 = ethiopicChronology23.dayOfYear();
        org.joda.time.DurationField durationField32 = ethiopicChronology23.seconds();
        org.joda.time.DateTimeField dateTimeField33 = ethiopicChronology23.hourOfHalfday();
        org.joda.time.DurationField durationField34 = ethiopicChronology23.halfdays();
        org.joda.time.DateTimeField dateTimeField35 = ethiopicChronology23.centuryOfEra();
        boolean boolean36 = dateTimeZone3.equals((java.lang.Object) ethiopicChronology23);
        org.joda.time.DurationField durationField37 = ethiopicChronology23.seconds();
        long long41 = ethiopicChronology23.add(74100052L, (-352799910L), (-3840000));
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 360000000 + "'", int8 == 360000000);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(ethiopicChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 360000000 + "'", int18 == 360000000);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 360000000 + "'", int22 == 360000000);
        org.junit.Assert.assertNotNull(ethiopicChronology23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1354751728500052L + "'", long41 == 1354751728500052L);
    }

    @Test
    public void test20123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20123");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weekyears();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.centuries();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField13 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test20124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20124");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale2 = null;
        java.lang.String str3 = dateTimeZone0.getShortName((long) ' ', locale2);
        long long5 = dateTimeZone0.previousTransition((long) (byte) 100);
        long long9 = dateTimeZone0.convertLocalToUTC((long) (short) 100, false, (long) 360000000);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(100);
        long long13 = dateTimeZone11.convertUTCToLocal((-1L));
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone11, (long) ' ');
        boolean boolean17 = dateTimeZone0.isStandardOffset(359999999L);
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = dateTimeZone0.isLocalDateTimeGap(localDateTime18);
        long long22 = dateTimeZone0.adjustOffset(64001L, true);
        long long25 = dateTimeZone0.convertLocalToUTC(189299904L, true);
        long long28 = dateTimeZone0.adjustOffset((-360000031L), false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+100:00" + "'", str3, "+100:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-359999900L) + "'", long9 == (-359999900L));
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 359999999L + "'", long13 == 359999999L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 64001L + "'", long22 == 64001L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-170700096L) + "'", long25 == (-170700096L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-360000031L) + "'", long28 == (-360000031L));
    }

    @Test
    public void test20125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20125");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = ethiopicChronology0.getZone();
        java.lang.String str4 = dateTimeZone2.getNameKey((long) ' ');
        org.joda.time.chrono.EthiopicChronology ethiopicChronology5 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField6 = ethiopicChronology5.seconds();
        org.joda.time.DurationField durationField7 = ethiopicChronology5.years();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology9 = ethiopicChronology5.withZone(dateTimeZone8);
        int int11 = dateTimeZone8.getOffset((long) 0);
        int int13 = dateTimeZone8.getOffset((long) (byte) 1);
        boolean boolean14 = dateTimeZone2.equals((java.lang.Object) dateTimeZone8);
        long long16 = dateTimeZone8.convertUTCToLocal((long) (short) -1);
        java.lang.String str17 = dateTimeZone8.toString();
        java.util.TimeZone timeZone18 = dateTimeZone8.toTimeZone();
        int int20 = dateTimeZone8.getStandardOffset(225300000L);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology21 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone8);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertNotNull(ethiopicChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 360000000 + "'", int11 == 360000000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 360000000 + "'", int13 == 360000000);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 359999999L + "'", long16 == 359999999L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+100:00" + "'", str17, "+100:00");
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+:0:00");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 360000000 + "'", int20 == 360000000);
        org.junit.Assert.assertNotNull(ethiopicChronology21);
    }

    @Test
    public void test20126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20126");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.Chronology chronology1 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology3 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField4 = ethiopicChronology3.seconds();
        org.joda.time.DurationField durationField5 = ethiopicChronology3.years();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology7 = ethiopicChronology3.withZone(dateTimeZone6);
        java.lang.String str9 = dateTimeZone6.getNameKey((long) 1);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology10 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone6);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone6.getName(0L, locale12);
        org.joda.time.Chronology chronology14 = ethiopicChronology0.withZone(dateTimeZone6);
        java.lang.String str15 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField17 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(ethiopicChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(ethiopicChronology10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+100:00" + "'", str13, "+100:00");
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EthiopicChronology[UTC]" + "'", str15, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test20127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20127");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weekyears();
        java.lang.Object obj7 = null;
        boolean boolean8 = ethiopicChronology0.equals(obj7);
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.era();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField13 = ethiopicChronology0.years();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test20128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20128");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.centuries();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        long long7 = ethiopicChronology0.add(readablePeriod4, (long) (short) 100, 100);
        org.joda.time.DurationField durationField8 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours(100);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology11 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField12 = ethiopicChronology11.seconds();
        org.joda.time.DurationField durationField13 = ethiopicChronology11.years();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology11.yearOfCentury();
        org.joda.time.DurationField durationField15 = ethiopicChronology11.seconds();
        org.joda.time.DurationField durationField16 = ethiopicChronology11.centuries();
        boolean boolean17 = dateTimeZone10.equals((java.lang.Object) ethiopicChronology11);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology18 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology18.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology18.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.Chronology chronology22 = ethiopicChronology18.withZone(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField23 = ethiopicChronology18.year();
        org.joda.time.DateTimeZone dateTimeZone24 = ethiopicChronology18.getZone();
        long long28 = dateTimeZone24.convertLocalToUTC(100L, false, 1L);
        java.lang.String str29 = dateTimeZone24.getID();
        org.joda.time.Chronology chronology30 = ethiopicChronology11.withZone(dateTimeZone24);
        long long33 = dateTimeZone24.adjustOffset(189300004L, false);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology34 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField35 = ethiopicChronology34.seconds();
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        long long39 = ethiopicChronology34.add(readablePeriod36, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        long long43 = ethiopicChronology34.add(readablePeriod40, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField44 = ethiopicChronology34.minuteOfDay();
        org.joda.time.DurationField durationField45 = ethiopicChronology34.centuries();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology46 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField47 = ethiopicChronology46.seconds();
        org.joda.time.DurationField durationField48 = ethiopicChronology46.years();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology50 = ethiopicChronology46.withZone(dateTimeZone49);
        boolean boolean51 = dateTimeZone49.isFixed();
        java.lang.String str52 = dateTimeZone49.getID();
        org.joda.time.Chronology chronology53 = ethiopicChronology34.withZone(dateTimeZone49);
        long long56 = dateTimeZone49.convertLocalToUTC((-359999989L), false);
        long long58 = dateTimeZone49.convertUTCToLocal(1L);
        long long60 = dateTimeZone24.getMillisKeepLocal(dateTimeZone49, 236L);
        java.lang.String str61 = dateTimeZone49.getID();
        java.lang.String str63 = dateTimeZone49.getName(189299904L);
        org.joda.time.Chronology chronology64 = ethiopicChronology0.withZone(dateTimeZone49);
        org.joda.time.DateTimeField dateTimeField65 = chronology64.dayOfYear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(ethiopicChronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(ethiopicChronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 100L + "'", long28 == 100L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UTC" + "'", str29, "UTC");
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 189300004L + "'", long33 == 189300004L);
        org.junit.Assert.assertNotNull(ethiopicChronology34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertNotNull(ethiopicChronology46);
        org.junit.Assert.assertNotNull(durationField47);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "+100:00" + "'", str52, "+100:00");
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + (-719999989L) + "'", long56 == (-719999989L));
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 360000001L + "'", long58 == 360000001L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-359999764L) + "'", long60 == (-359999764L));
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "+100:00" + "'", str61, "+100:00");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "+100:00" + "'", str63, "+100:00");
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertNotNull(dateTimeField65);
    }

    @Test
    public void test20129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20129");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.year();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.days();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology7.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology7.year();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology10 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField11 = ethiopicChronology10.seconds();
        org.joda.time.DurationField durationField12 = ethiopicChronology10.years();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology14 = ethiopicChronology10.withZone(dateTimeZone13);
        java.lang.String str16 = dateTimeZone13.getNameKey((long) 1);
        org.joda.time.Chronology chronology17 = ethiopicChronology7.withZone(dateTimeZone13);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology18 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField19 = ethiopicChronology18.seconds();
        org.joda.time.DurationField durationField20 = ethiopicChronology18.years();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology22 = ethiopicChronology18.withZone(dateTimeZone21);
        java.lang.String str24 = dateTimeZone21.getNameKey((long) 1);
        int int26 = dateTimeZone21.getStandardOffset((long) (short) 0);
        long long28 = dateTimeZone13.getMillisKeepLocal(dateTimeZone21, (long) (short) 10);
        int int30 = dateTimeZone13.getStandardOffset((long) (byte) 100);
        org.joda.time.Chronology chronology31 = ethiopicChronology0.withZone(dateTimeZone13);
        java.lang.String str32 = ethiopicChronology0.toString();
        org.joda.time.ReadablePartial readablePartial33 = null;
        int[] intArray39 = new int[] { 37920000, (-3600000), (-1), 3600000, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            ethiopicChronology0.validate(readablePartial33, intArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(ethiopicChronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(ethiopicChronology18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 360000000 + "'", int26 == 360000000);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 10L + "'", long28 == 10L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 360000000 + "'", int30 == 360000000);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "EthiopicChronology[UTC]" + "'", str32, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[37920000, -3600000, -1, 3600000, 10]");
    }

    @Test
    public void test20130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20130");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology7.millisOfSecond();
        org.joda.time.DurationField durationField9 = ethiopicChronology7.centuries();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = ethiopicChronology7.add(readablePeriod10, (long) (short) -1, (int) 'a');
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology7.year();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology7.yearOfEra();
        org.joda.time.Chronology chronology16 = ethiopicChronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology7.centuryOfEra();
        org.joda.time.Chronology chronology18 = ethiopicChronology7.withUTC();
        org.joda.time.DateTimeZone dateTimeZone19 = ethiopicChronology7.getZone();
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology7.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField21 = ethiopicChronology7.monthOfYear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test20131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20131");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.hours();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.dayOfYear();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.era();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test20132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20132");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.millis();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean10 = dateTimeZone9.isFixed();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology11 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology11.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology11.year();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology14 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField15 = ethiopicChronology14.seconds();
        org.joda.time.DurationField durationField16 = ethiopicChronology14.years();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology18 = ethiopicChronology14.withZone(dateTimeZone17);
        java.lang.String str20 = dateTimeZone17.getNameKey((long) 1);
        org.joda.time.Chronology chronology21 = ethiopicChronology11.withZone(dateTimeZone17);
        long long24 = dateTimeZone17.convertLocalToUTC((long) 0, true);
        boolean boolean26 = dateTimeZone17.isStandardOffset((long) (short) 1);
        long long28 = dateTimeZone9.getMillisKeepLocal(dateTimeZone17, 35L);
        org.joda.time.Chronology chronology29 = ethiopicChronology0.withZone(dateTimeZone9);
        org.joda.time.DurationField durationField30 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField31 = ethiopicChronology0.clockhourOfHalfday();
        java.lang.String str32 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField33 = ethiopicChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(ethiopicChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(ethiopicChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-360000000L) + "'", long24 == (-360000000L));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 35L + "'", long28 == 35L);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "EthiopicChronology[UTC]" + "'", str32, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField33);
    }

    @Test
    public void test20133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20133");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.year();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone10 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology11 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone10);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(ethiopicChronology11);
    }

    @Test
    public void test20134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20134");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.millis();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.seconds();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology10 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField11 = ethiopicChronology10.seconds();
        org.joda.time.DurationField durationField12 = ethiopicChronology10.years();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology14 = ethiopicChronology10.withZone(dateTimeZone13);
        java.lang.String str16 = dateTimeZone13.getName((long) (byte) 1);
        java.lang.String str17 = dateTimeZone13.getID();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology18 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = dateTimeZone13.isLocalDateTimeGap(localDateTime19);
        int int22 = dateTimeZone13.getStandardOffset(1179576364320001689L);
        org.joda.time.Chronology chronology23 = ethiopicChronology0.withZone(dateTimeZone13);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(ethiopicChronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+100:00" + "'", str16, "+100:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+100:00" + "'", str17, "+100:00");
        org.junit.Assert.assertNotNull(ethiopicChronology18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 360000000 + "'", int22 == 360000000);
        org.junit.Assert.assertNotNull(chronology23);
    }

    @Test
    public void test20135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20135");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.year();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.era();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.minuteOfHour();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test20136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20136");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.yearOfCentury();
        java.lang.String str12 = ethiopicChronology0.toString();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology13 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField14 = ethiopicChronology13.seconds();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = ethiopicChronology13.add(readablePeriod15, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DurationField durationField19 = ethiopicChronology13.millis();
        org.joda.time.DateTimeZone dateTimeZone20 = ethiopicChronology13.getZone();
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone20.getName((long) (byte) 100, locale22);
        int int25 = dateTimeZone20.getStandardOffset((-101L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        org.joda.time.Chronology chronology27 = ethiopicChronology0.withZone(dateTimeZone20);
        int int29 = dateTimeZone20.getOffsetFromLocal((-36000000L));
        long long31 = dateTimeZone20.convertUTCToLocal(345540004L);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EthiopicChronology[UTC]" + "'", str12, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(ethiopicChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 345540004L + "'", long31 == 345540004L);
    }

    @Test
    public void test20137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20137");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = ethiopicChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField16 = ethiopicChronology0.eras();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test20138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20138");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.eras();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test20139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20139");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        int int4 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = ethiopicChronology7.add(readablePeriod8, 20L, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.Chronology chronology13 = ethiopicChronology7.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField14 = ethiopicChronology7.millis();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 20L + "'", long11 == 20L);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test20140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20140");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.months();
        org.joda.time.Chronology chronology5 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology8.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology8.secondOfMinute();
        org.joda.time.DurationField durationField11 = ethiopicChronology8.halfdays();
        org.joda.time.DurationField durationField12 = ethiopicChronology8.months();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology8.halfdayOfDay();
        org.joda.time.DurationField durationField14 = ethiopicChronology8.weekyears();
        org.joda.time.DurationField durationField15 = ethiopicChronology8.centuries();
        org.joda.time.DurationField durationField16 = ethiopicChronology8.millis();
        org.joda.time.DateTimeZone dateTimeZone17 = ethiopicChronology8.getZone();
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = dateTimeZone17.getOffset(readableInstant18);
        org.joda.time.Chronology chronology20 = ethiopicChronology0.withZone(dateTimeZone17);
        org.joda.time.DurationField durationField21 = ethiopicChronology0.halfdays();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        long long25 = ethiopicChronology0.add(readablePeriod22, (-352799969L), (int) 'a');
        org.joda.time.DateTimeField dateTimeField26 = ethiopicChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(ethiopicChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-352799969L) + "'", long25 == (-352799969L));
        org.junit.Assert.assertNotNull(dateTimeField26);
    }

    @Test
    public void test20141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20141");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.era();
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = ethiopicChronology0.set(readablePartial6, (-51623446949994335L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test20142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20142");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone3.getShortName((long) ' ', locale5);
        org.joda.time.Chronology chronology7 = ethiopicChronology0.withZone(dateTimeZone3);
        java.lang.String str8 = ethiopicChronology0.toString();
        org.joda.time.DateTimeZone dateTimeZone9 = ethiopicChronology0.getZone();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.millis();
        org.joda.time.DateTimeZone dateTimeZone11 = ethiopicChronology0.getZone();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = ethiopicChronology0.add(readablePeriod12, 0L, 35);
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EthiopicChronology[UTC]" + "'", str8, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test20143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20143");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.hourOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology5 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology5.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone7 = ethiopicChronology5.getZone();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology5.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology5.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology5.secondOfMinute();
        org.joda.time.DurationField durationField12 = ethiopicChronology5.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology5.year();
        org.joda.time.DateTimeZone dateTimeZone14 = ethiopicChronology5.getZone();
        org.joda.time.Chronology chronology15 = ethiopicChronology0.withZone(dateTimeZone14);
        long long17 = dateTimeZone14.convertUTCToLocal(382235032L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.EthiopicChronology ethiopicChronology19 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone14, 360600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 360600000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(ethiopicChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 382235032L + "'", long17 == 382235032L);
    }

    @Test
    public void test20144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20144");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weekyears();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.centuries();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.weeks();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test20145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20145");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.hours();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.weeks();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weeks();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.centuries();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.minutes();
        java.lang.String str11 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.weekyearOfCentury();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EthiopicChronology[UTC]" + "'", str11, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test20146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20146");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        int int8 = dateTimeZone3.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        boolean boolean11 = dateTimeZone3.isStandardOffset((long) (short) 10);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology12 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology12.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone14 = ethiopicChronology12.getZone();
        boolean boolean15 = dateTimeZone3.equals((java.lang.Object) ethiopicChronology12);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology17 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone3, 4);
        long long19 = dateTimeZone3.convertUTCToLocal((-61885555199990L));
        long long21 = dateTimeZone3.nextTransition(0L);
        int int23 = dateTimeZone3.getStandardOffset(149700000L);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone3.getOffset(readableInstant24);
        boolean boolean26 = dateTimeZone3.isFixed();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology27 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone3);
        java.util.Locale locale29 = null;
        java.lang.String str30 = dateTimeZone3.getName(2609132399997L, locale29);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(ethiopicChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(ethiopicChronology17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-61885555199990L) + "'", long19 == (-61885555199990L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(ethiopicChronology27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00" + "'", str30, "+00:00");
    }

    @Test
    public void test20147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20147");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.hours();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.hourOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology10 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField11 = ethiopicChronology10.seconds();
        org.joda.time.DurationField durationField12 = ethiopicChronology10.millis();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology10.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology10.minuteOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology15 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology15.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone17 = ethiopicChronology15.getZone();
        java.lang.String str19 = dateTimeZone17.getNameKey((long) ' ');
        org.joda.time.chrono.EthiopicChronology ethiopicChronology20 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField21 = ethiopicChronology20.seconds();
        org.joda.time.DurationField durationField22 = ethiopicChronology20.years();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology24 = ethiopicChronology20.withZone(dateTimeZone23);
        int int26 = dateTimeZone23.getOffset((long) 0);
        int int28 = dateTimeZone23.getOffset((long) (byte) 1);
        boolean boolean29 = dateTimeZone17.equals((java.lang.Object) dateTimeZone23);
        org.joda.time.ReadableInstant readableInstant30 = null;
        int int31 = dateTimeZone23.getOffset(readableInstant30);
        java.util.Locale locale33 = null;
        java.lang.String str34 = dateTimeZone23.getShortName(1L, locale33);
        org.joda.time.Chronology chronology35 = ethiopicChronology10.withZone(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField36 = ethiopicChronology10.hourOfDay();
        boolean boolean37 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology10);
        org.joda.time.Chronology chronology38 = ethiopicChronology0.withUTC();
        org.joda.time.DurationField durationField39 = chronology38.months();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(ethiopicChronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(ethiopicChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UTC" + "'", str19, "UTC");
        org.junit.Assert.assertNotNull(ethiopicChronology20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00" + "'", str34, "+00:00");
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(durationField39);
    }

    @Test
    public void test20148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20148");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = ethiopicChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.hourOfDay();
        org.joda.time.DurationField durationField13 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField15 = ethiopicChronology0.days();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test20149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20149");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.days();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours(100);
        boolean boolean11 = dateTimeZone10.isFixed();
        int int13 = dateTimeZone10.getOffsetFromLocal((long) 0);
        java.lang.String str15 = dateTimeZone10.getShortName((long) 4);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology17 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone10, 4);
        org.joda.time.Chronology chronology18 = ethiopicChronology0.withZone(dateTimeZone10);
        org.joda.time.ReadablePartial readablePartial19 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long21 = ethiopicChronology0.set(readablePartial19, (-115084784900L));
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
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 360000000 + "'", int13 == 360000000);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+100:00" + "'", str15, "+100:00");
        org.junit.Assert.assertNotNull(ethiopicChronology17);
        org.junit.Assert.assertNotNull(chronology18);
    }

    @Test
    public void test20150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20150");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone7 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField9 = ethiopicChronology8.seconds();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = ethiopicChronology8.add(readablePeriod10, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology8.secondOfDay();
        org.joda.time.DurationField durationField15 = ethiopicChronology8.weekyears();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forID("+00:00");
        java.lang.String str18 = dateTimeZone17.getID();
        boolean boolean19 = dateTimeZone17.isFixed();
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone17.getShortName((long) (-1), locale21);
        org.joda.time.Chronology chronology23 = ethiopicChronology8.withZone(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField24 = ethiopicChronology8.weekyearOfCentury();
        boolean boolean25 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology8);
        org.joda.time.DurationField durationField26 = ethiopicChronology8.halfdays();
        org.joda.time.DateTimeField dateTimeField27 = ethiopicChronology8.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField28 = ethiopicChronology8.weekyear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(ethiopicChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
    }

    @Test
    public void test20151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20151");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weekyears();
        java.lang.Object obj7 = null;
        boolean boolean8 = ethiopicChronology0.equals(obj7);
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.secondOfDay();
        org.joda.time.DurationField durationField14 = ethiopicChronology0.months();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = ethiopicChronology0.add(readablePeriod15, 0L, 187200000);
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology0.secondOfMinute();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test20152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20152");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', 35);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test20153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20153");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology7.millisOfSecond();
        org.joda.time.DurationField durationField9 = ethiopicChronology7.centuries();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = ethiopicChronology7.add(readablePeriod10, (long) (short) -1, (int) 'a');
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology7.year();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology7.yearOfEra();
        org.joda.time.Chronology chronology16 = ethiopicChronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology7.centuryOfEra();
        org.joda.time.Chronology chronology18 = ethiopicChronology7.withUTC();
        org.joda.time.DateTimeZone dateTimeZone19 = ethiopicChronology7.getZone();
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology7.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField21 = ethiopicChronology7.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology7.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ethiopicChronology7.get(readablePeriod23, (-115010694600L), 170700152L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test20154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20154");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.year();
        java.lang.String str7 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.monthOfYear();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology12 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology12.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology12.secondOfMinute();
        org.joda.time.DurationField durationField15 = ethiopicChronology12.halfdays();
        int int16 = ethiopicChronology12.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField17 = ethiopicChronology12.months();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology12.year();
        org.joda.time.DateTimeZone dateTimeZone19 = ethiopicChronology12.getZone();
        java.lang.String str20 = dateTimeZone19.toString();
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = dateTimeZone19.isLocalDateTimeGap(localDateTime21);
        org.joda.time.Chronology chronology23 = ethiopicChronology0.withZone(dateTimeZone19);
        int int25 = dateTimeZone19.getStandardOffset((-8279999890L));
        int int27 = dateTimeZone19.getStandardOffset((-482879910L));
        java.lang.String str28 = dateTimeZone19.toString();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EthiopicChronology[UTC]" + "'", str7, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(ethiopicChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UTC" + "'", str28, "UTC");
    }

    @Test
    public void test20155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20155");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.dayOfYear();
        int int4 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.secondOfDay();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.hours();
        org.joda.time.DateTimeZone dateTimeZone12 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology13 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology13.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone15 = ethiopicChronology13.getZone();
        long long18 = dateTimeZone15.convertLocalToUTC(0L, true);
        boolean boolean19 = dateTimeZone15.isFixed();
        org.joda.time.Chronology chronology20 = ethiopicChronology0.withZone(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone21 = chronology20.getZone();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(ethiopicChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
    }

    @Test
    public void test20156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20156");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weekyears();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.centuries();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.millis();
        org.joda.time.DateTimeZone dateTimeZone9 = ethiopicChronology0.getZone();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test20157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20157");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone9 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology10 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology10.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology10.secondOfMinute();
        org.joda.time.DurationField durationField13 = ethiopicChronology10.halfdays();
        org.joda.time.DurationField durationField14 = ethiopicChronology10.months();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology10.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology10.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology10.clockhourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = ethiopicChronology10.add(readablePeriod18, 100L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology10.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, 0);
        java.lang.String str26 = dateTimeZone25.toString();
        int int28 = dateTimeZone25.getOffset((-356399989L));
        org.joda.time.Chronology chronology29 = ethiopicChronology10.withZone(dateTimeZone25);
        org.joda.time.Chronology chronology30 = ethiopicChronology0.withZone(dateTimeZone25);
        int int32 = dateTimeZone25.getStandardOffset(0L);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(ethiopicChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+01:00" + "'", str26, "+01:00");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3600000 + "'", int28 == 3600000);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3600000 + "'", int32 == 3600000);
    }

    @Test
    public void test20158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20158");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology7.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forID("+00:00:00.010");
        org.joda.time.Chronology chronology11 = ethiopicChronology7.withZone(dateTimeZone10);
        int int13 = dateTimeZone10.getOffsetFromLocal(871L);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test20159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20159");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.dayOfYear();
        org.joda.time.Chronology chronology8 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test20160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20160");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.years();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test20161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20161");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        java.lang.String str8 = dateTimeZone3.getNameKey((-1L));
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone3.isLocalDateTimeGap(localDateTime9);
        java.lang.String str11 = dateTimeZone3.toString();
        java.lang.String str12 = dateTimeZone3.getID();
        java.util.TimeZone timeZone13 = dateTimeZone3.toTimeZone();
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone3.isLocalDateTimeGap(localDateTime14);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test20162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20162");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.millisOfDay();
        java.lang.String str11 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.hourOfDay();
        org.joda.time.DurationField durationField13 = ethiopicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.era();
        org.joda.time.DurationField durationField15 = ethiopicChronology0.days();
        int int16 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EthiopicChronology[UTC]" + "'", str11, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test20163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20163");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        boolean boolean8 = dateTimeZone3.equals((java.lang.Object) (-1.0f));
        int int10 = dateTimeZone3.getOffset((long) 100);
        boolean boolean11 = dateTimeZone3.isFixed();
        java.lang.String str13 = dateTimeZone3.getName((-359999968L));
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone3.isLocalDateTimeGap(localDateTime14);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology16 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField17 = ethiopicChronology16.seconds();
        org.joda.time.DurationField durationField18 = ethiopicChronology16.years();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology20 = ethiopicChronology16.withZone(dateTimeZone19);
        java.lang.String str22 = dateTimeZone19.getNameKey((long) 1);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology23 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField24 = ethiopicChronology23.millisOfSecond();
        long long28 = ethiopicChronology23.add(35L, 0L, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        long long32 = ethiopicChronology23.add(readablePeriod29, (long) (short) 0, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone33 = ethiopicChronology23.getZone();
        boolean boolean35 = dateTimeZone33.isStandardOffset((long) (short) 1);
        boolean boolean37 = dateTimeZone33.isStandardOffset((long) ' ');
        long long40 = dateTimeZone33.adjustOffset((long) (short) 10, false);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology41 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone33);
        long long43 = dateTimeZone3.getMillisKeepLocal(dateTimeZone33, 69120063700L);
        int int45 = dateTimeZone33.getOffset((-359999900L));
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(ethiopicChronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
        org.junit.Assert.assertNotNull(ethiopicChronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 35L + "'", long28 == 35L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 10L + "'", long40 == 10L);
        org.junit.Assert.assertNotNull(ethiopicChronology41);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 69120063700L + "'", long43 == 69120063700L);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test20164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20164");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone9 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField12 = ethiopicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test20165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20165");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = ethiopicChronology0.getZone();
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str4 = dateTimeZone2.toString();
        java.lang.String str6 = dateTimeZone2.getName(35999999899L);
        java.util.TimeZone timeZone7 = dateTimeZone2.toTimeZone();
        boolean boolean8 = dateTimeZone2.isFixed();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test20166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20166");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean1 = dateTimeZone0.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        long long4 = dateTimeZone0.convertUTCToLocal((-100L));
        org.joda.time.chrono.EthiopicChronology ethiopicChronology5 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology5.millisOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-100L) + "'", long4 == (-100L));
        org.junit.Assert.assertNotNull(ethiopicChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test20167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20167");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.dayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = ethiopicChronology0.add(readablePeriod7, (-363600200L), (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = ethiopicChronology0.getDateTimeMillis((int) (byte) 100, 349200000, 360600000, 36000000, (int) (short) 0, 189300000, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 36000000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-363600200L) + "'", long10 == (-363600200L));
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test20168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20168");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone4 = ethiopicChronology0.getZone();
        java.lang.String str5 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeZone dateTimeZone7 = ethiopicChronology0.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.EthiopicChronology ethiopicChronology9 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone7, 126060000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 126060000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EthiopicChronology[UTC]" + "'", str5, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
    }

    @Test
    public void test20169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20169");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology7.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology7.era();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology7.era();
        org.joda.time.Chronology chronology11 = ethiopicChronology7.withUTC();
        long long15 = ethiopicChronology7.add(156240004L, 87426222240526000L, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = ethiopicChronology7.getDateTimeMillis(0L, 360000000, (int) (byte) 1, 37920000, 97);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 360000000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 156240004L + "'", long15 == 156240004L);
    }

    @Test
    public void test20170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20170");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weekyears();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.centuries();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.minutes();
        org.joda.time.DurationField durationField12 = ethiopicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test20171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20171");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        int int4 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone10 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.year();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test20172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20172");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.days();
        org.joda.time.DateTimeZone dateTimeZone4 = ethiopicChronology0.getZone();
        boolean boolean5 = dateTimeZone4.isFixed();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology6 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology6.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology6.secondOfMinute();
        org.joda.time.DurationField durationField9 = ethiopicChronology6.halfdays();
        org.joda.time.DurationField durationField10 = ethiopicChronology6.months();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology6.halfdayOfDay();
        org.joda.time.DurationField durationField12 = ethiopicChronology6.weekyears();
        java.lang.Object obj13 = null;
        boolean boolean14 = ethiopicChronology6.equals(obj13);
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology6.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology6.year();
        boolean boolean17 = dateTimeZone4.equals((java.lang.Object) dateTimeField16);
        long long19 = dateTimeZone4.nextTransition(360000971L);
        long long23 = dateTimeZone4.convertLocalToUTC(36000032L, true, 149L);
        java.lang.String str25 = dateTimeZone4.getNameKey(3600052L);
        java.lang.String str27 = dateTimeZone4.getName(828000104701L);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(ethiopicChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 360000971L + "'", long19 == 360000971L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 36000032L + "'", long23 == 36000032L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTC" + "'", str25, "UTC");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00" + "'", str27, "+00:00");
    }

    @Test
    public void test20173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20173");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DurationField durationField6 = ethiopicChronology0.millis();
        java.lang.String str7 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.centuries();
        java.lang.String str11 = ethiopicChronology0.toString();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EthiopicChronology[UTC]" + "'", str7, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EthiopicChronology[UTC]" + "'", str11, "EthiopicChronology[UTC]");
    }

    @Test
    public void test20174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20174");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = ethiopicChronology0.getZone();
        java.lang.String str4 = dateTimeZone2.getNameKey((long) ' ');
        org.joda.time.chrono.EthiopicChronology ethiopicChronology5 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField6 = ethiopicChronology5.seconds();
        org.joda.time.DurationField durationField7 = ethiopicChronology5.years();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology9 = ethiopicChronology5.withZone(dateTimeZone8);
        int int11 = dateTimeZone8.getOffset((long) 0);
        int int13 = dateTimeZone8.getOffset((long) (byte) 1);
        boolean boolean14 = dateTimeZone2.equals((java.lang.Object) dateTimeZone8);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone8.getOffset(readableInstant15);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone8.getShortName(1L, locale18);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        boolean boolean22 = dateTimeZone8.isStandardOffset(97L);
        java.util.TimeZone timeZone23 = dateTimeZone8.toTimeZone();
        int int25 = dateTimeZone8.getOffset(2605679999997L);
        long long29 = dateTimeZone8.convertLocalToUTC(999L, false, (long) 189300000);
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone8.getShortName((-25L), locale31);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertNotNull(ethiopicChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 999L + "'", long29 == 999L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
    }

    @Test
    public void test20175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20175");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.year();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology3 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField4 = ethiopicChronology3.seconds();
        org.joda.time.DurationField durationField5 = ethiopicChronology3.years();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology7 = ethiopicChronology3.withZone(dateTimeZone6);
        java.lang.String str9 = dateTimeZone6.getNameKey((long) 1);
        org.joda.time.Chronology chronology10 = ethiopicChronology0.withZone(dateTimeZone6);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology11 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField12 = ethiopicChronology11.seconds();
        org.joda.time.DurationField durationField13 = ethiopicChronology11.years();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology15 = ethiopicChronology11.withZone(dateTimeZone14);
        java.lang.String str17 = dateTimeZone14.getNameKey((long) 1);
        int int19 = dateTimeZone14.getStandardOffset((long) (short) 0);
        long long21 = dateTimeZone6.getMillisKeepLocal(dateTimeZone14, (long) (short) 10);
        long long25 = dateTimeZone14.convertLocalToUTC(32L, true, (long) (-1));
        org.joda.time.chrono.EthiopicChronology ethiopicChronology26 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField27 = ethiopicChronology26.seconds();
        org.joda.time.DurationField durationField28 = ethiopicChronology26.years();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology30 = ethiopicChronology26.withZone(dateTimeZone29);
        boolean boolean31 = dateTimeZone29.isFixed();
        java.lang.String str32 = dateTimeZone29.getID();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology34 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone29, 4);
        org.joda.time.DateTimeField dateTimeField35 = ethiopicChronology34.secondOfDay();
        boolean boolean36 = dateTimeZone14.equals((java.lang.Object) ethiopicChronology34);
        org.joda.time.DateTimeZone dateTimeZone37 = ethiopicChronology34.getZone();
        org.joda.time.DateTimeField dateTimeField38 = ethiopicChronology34.secondOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology39 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField40 = ethiopicChronology39.seconds();
        org.joda.time.DurationField durationField41 = ethiopicChronology39.years();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology43 = ethiopicChronology39.withZone(dateTimeZone42);
        boolean boolean44 = dateTimeZone42.isFixed();
        java.lang.String str45 = dateTimeZone42.getID();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology47 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone42, 4);
        org.joda.time.DateTimeField dateTimeField48 = ethiopicChronology47.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone49 = ethiopicChronology47.getZone();
        int int51 = dateTimeZone49.getOffset(360000971L);
        boolean boolean52 = dateTimeZone49.isFixed();
        org.joda.time.Chronology chronology53 = ethiopicChronology34.withZone(dateTimeZone49);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(ethiopicChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(ethiopicChronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
        org.junit.Assert.assertNotNull(ethiopicChronology26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "UTC" + "'", str32, "UTC");
        org.junit.Assert.assertNotNull(ethiopicChronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(ethiopicChronology39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "UTC" + "'", str45, "UTC");
        org.junit.Assert.assertNotNull(ethiopicChronology47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(chronology53);
    }

    @Test
    public void test20176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20176");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.months();
        org.joda.time.Chronology chronology6 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.era();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = ethiopicChronology0.getDateTimeMillis((int) (short) -1, 97, (-3660000), 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for monthOfYear must be in the range [1,13]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test20177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20177");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.days();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.minutes();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test20178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20178");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone6.isLocalDateTimeGap(localDateTime7);
        java.lang.String str10 = dateTimeZone6.getNameKey((long) (byte) 10);
        java.lang.String str11 = dateTimeZone6.toString();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology12 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology12.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology12.secondOfMinute();
        org.joda.time.DurationField durationField15 = ethiopicChronology12.centuries();
        boolean boolean16 = dateTimeZone6.equals((java.lang.Object) ethiopicChronology12);
        java.lang.String str18 = dateTimeZone6.getNameKey(322080001L);
        org.joda.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = dateTimeZone6.isLocalDateTimeGap(localDateTime19);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertNotNull(ethiopicChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test20179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20179");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.year();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test20180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20180");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology8.hourOfHalfday();
        long long13 = ethiopicChronology8.add((long) ' ', 359999999L, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology8.yearOfEra();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology8.dayOfWeek();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology17 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology17.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology17.centuryOfEra();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology20 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField21 = ethiopicChronology20.seconds();
        org.joda.time.DurationField durationField22 = ethiopicChronology20.millis();
        org.joda.time.DateTimeField dateTimeField23 = ethiopicChronology20.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField24 = ethiopicChronology20.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField25 = ethiopicChronology20.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone26 = ethiopicChronology20.getZone();
        org.joda.time.Chronology chronology27 = ethiopicChronology17.withZone(dateTimeZone26);
        org.joda.time.Chronology chronology28 = ethiopicChronology8.withZone(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField29 = ethiopicChronology8.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long37 = ethiopicChronology8.getDateTimeMillis(189300000, (int) '4', (int) (byte) 0, 60000, (int) (byte) -1, 1, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 60000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(ethiopicChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(ethiopicChronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(ethiopicChronology20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
    }

    @Test
    public void test20181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20181");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DurationField durationField6 = ethiopicChronology0.millis();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.year();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.hours();
        org.joda.time.DurationField durationField12 = ethiopicChronology0.weekyears();
        org.joda.time.DurationField durationField13 = ethiopicChronology0.minutes();
        org.joda.time.DurationField durationField14 = ethiopicChronology0.weeks();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test20182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20182");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.centuries();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test20183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20183");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.year();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.yearOfEra();
        int int9 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeZone dateTimeZone10 = ethiopicChronology0.getZone();
        java.lang.String str12 = dateTimeZone10.getName(0L);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
    }

    @Test
    public void test20184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20184");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.era();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.dayOfMonth();
        long long19 = ethiopicChronology0.getDateTimeMillis((-58746556800000L), 0, 35, 32, (int) (short) 1);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-58746554667999L) + "'", long19 == (-58746554667999L));
    }

    @Test
    public void test20185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20185");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.year();
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = ethiopicChronology0.set(readablePartial11, (-323999968L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test20186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20186");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        boolean boolean5 = dateTimeZone1.isStandardOffset((long) '4');
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        java.lang.String str10 = dateTimeZone7.getShortName((-105L));
        org.joda.time.LocalDateTime localDateTime11 = null;
        boolean boolean12 = dateTimeZone7.isLocalDateTimeGap(localDateTime11);
        long long14 = dateTimeZone7.previousTransition(345670010L);
        java.lang.String str16 = dateTimeZone7.getNameKey((-359999969L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 345670010L + "'", long14 == 345670010L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
    }

    @Test
    public void test20187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20187");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.hours();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = ethiopicChronology0.getZone();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.centuries();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = ethiopicChronology0.add(readablePeriod13, 152L, 3600000);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 152L + "'", long16 == 152L);
    }

    @Test
    public void test20188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20188");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        int int4 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField12 = ethiopicChronology0.days();
        org.joda.time.DurationField durationField13 = ethiopicChronology0.years();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test20189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20189");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = ethiopicChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = ethiopicChronology0.withZone(dateTimeZone10);
        org.joda.time.DurationField durationField12 = ethiopicChronology0.minutes();
        int int13 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.dayOfYear();
        org.joda.time.DurationField durationField15 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test20190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20190");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.hours();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test20191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20191");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.yearOfEra();
        long long12 = ethiopicChronology0.add(58L, 10L, 3600000);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean14 = dateTimeZone13.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        long long17 = dateTimeZone13.convertUTCToLocal((-100L));
        org.joda.time.chrono.EthiopicChronology ethiopicChronology18 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone13);
        long long22 = dateTimeZone13.convertLocalToUTC((long) (short) 1, false, 36000035L);
        int int24 = dateTimeZone13.getStandardOffset((-8092799890L));
        long long26 = dateTimeZone13.nextTransition(322080001L);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology27 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField28 = ethiopicChronology27.seconds();
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        long long32 = ethiopicChronology27.add(readablePeriod29, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        long long36 = ethiopicChronology27.add(readablePeriod33, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField37 = ethiopicChronology27.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone38 = ethiopicChronology27.getZone();
        long long40 = dateTimeZone38.nextTransition((long) (-1));
        java.util.TimeZone timeZone41 = dateTimeZone38.toTimeZone();
        boolean boolean42 = dateTimeZone13.equals((java.lang.Object) dateTimeZone38);
        org.joda.time.Chronology chronology43 = ethiopicChronology0.withZone(dateTimeZone38);
        java.lang.String str45 = dateTimeZone38.getShortName(33001035L);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 36000058L + "'", long12 == 36000058L);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-100L) + "'", long17 == (-100L));
        org.junit.Assert.assertNotNull(ethiopicChronology18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 322080001L + "'", long26 == 322080001L);
        org.junit.Assert.assertNotNull(ethiopicChronology27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1L + "'", long36 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertNotNull(timeZone41);
        org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+00:00" + "'", str45, "+00:00");
    }

    @Test
    public void test20192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20192");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.millis();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean10 = dateTimeZone9.isFixed();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology11 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology11.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology11.year();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology14 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField15 = ethiopicChronology14.seconds();
        org.joda.time.DurationField durationField16 = ethiopicChronology14.years();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology18 = ethiopicChronology14.withZone(dateTimeZone17);
        java.lang.String str20 = dateTimeZone17.getNameKey((long) 1);
        org.joda.time.Chronology chronology21 = ethiopicChronology11.withZone(dateTimeZone17);
        long long24 = dateTimeZone17.convertLocalToUTC((long) 0, true);
        boolean boolean26 = dateTimeZone17.isStandardOffset((long) (short) 1);
        long long28 = dateTimeZone9.getMillisKeepLocal(dateTimeZone17, 35L);
        org.joda.time.Chronology chronology29 = ethiopicChronology0.withZone(dateTimeZone9);
        org.joda.time.DurationField durationField30 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField31 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField32 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField33 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField34 = ethiopicChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(ethiopicChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(ethiopicChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 35L + "'", long28 == 35L);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
    }

    @Test
    public void test20193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20193");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.secondOfMinute();
        java.lang.Object obj8 = null;
        boolean boolean9 = ethiopicChronology0.equals(obj8);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test20194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20194");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.year();
        java.lang.String str7 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.days();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField14 = ethiopicChronology0.weeks();
        org.joda.time.DurationField durationField15 = ethiopicChronology0.seconds();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EthiopicChronology[UTC]" + "'", str7, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test20195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20195");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weekyears();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.centuries();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone12 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.year();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test20196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20196");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.year();
        org.joda.time.DateTimeZone dateTimeZone7 = ethiopicChronology1.getZone();
        long long11 = dateTimeZone7.convertLocalToUTC(100L, false, 1L);
        java.lang.String str12 = dateTimeZone7.getID();
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone7.getOffset(readableInstant13);
        org.joda.time.Chronology chronology15 = ethiopicChronology0.withZone(dateTimeZone7);
        java.lang.String str16 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.Chronology chronology19 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(ethiopicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EthiopicChronology[UTC]" + "'", str16, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test20197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20197");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology8.millisOfDay();
        org.joda.time.DurationField durationField10 = ethiopicChronology8.months();
        org.joda.time.DateTimeZone dateTimeZone11 = ethiopicChronology8.getZone();
        org.joda.time.DurationField durationField12 = ethiopicChronology8.millis();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology8.monthOfYear();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology8.era();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology8.halfdayOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(ethiopicChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test20198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20198");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.Chronology chronology1 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.dayOfWeek();
        org.joda.time.Chronology chronology5 = ethiopicChronology0.withUTC();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.halfdays();
        java.lang.String str7 = ethiopicChronology0.toString();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EthiopicChronology[UTC]" + "'", str7, "EthiopicChronology[UTC]");
    }

    @Test
    public void test20199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20199");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.minutes();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = ethiopicChronology0.add(readablePeriod8, 5L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.yearOfCentury();
        long long17 = ethiopicChronology0.add(0L, 209469948L, 126000000);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5L + "'", long11 == 5L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 26393213448000000L + "'", long17 == 26393213448000000L);
    }

    @Test
    public void test20200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20200");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        int int8 = dateTimeZone3.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        boolean boolean11 = dateTimeZone3.isStandardOffset((long) (short) 10);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology12 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology12.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone14 = ethiopicChronology12.getZone();
        boolean boolean15 = dateTimeZone3.equals((java.lang.Object) ethiopicChronology12);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology17 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology18 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology18.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology18.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        java.util.TimeZone timeZone23 = dateTimeZone22.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        java.lang.String str26 = dateTimeZone24.getName(1938003320L);
        org.joda.time.Chronology chronology27 = ethiopicChronology18.withZone(dateTimeZone24);
        java.lang.String str29 = dateTimeZone24.getNameKey((long) (byte) 100);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone24);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(ethiopicChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(ethiopicChronology17);
        org.junit.Assert.assertNotNull(ethiopicChronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "GMT-01:00");
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-01:00" + "'", str26, "-01:00");
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test20201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20201");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone3, 4);
        long long11 = dateTimeZone3.adjustOffset((long) (short) 10, false);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone3.getShortName((-11519999459996L), locale13);
        int int16 = dateTimeZone3.getOffset((long) (short) -1);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone3.isLocalDateTimeGap(localDateTime17);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology19 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField20 = ethiopicChronology19.seconds();
        org.joda.time.DurationField durationField21 = ethiopicChronology19.years();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology23 = ethiopicChronology19.withZone(dateTimeZone22);
        java.lang.String str25 = dateTimeZone22.getNameKey((long) 1);
        int int27 = dateTimeZone22.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone22);
        boolean boolean30 = dateTimeZone22.isStandardOffset((long) (short) 10);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology31 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField32 = ethiopicChronology31.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone33 = ethiopicChronology31.getZone();
        boolean boolean34 = dateTimeZone22.equals((java.lang.Object) ethiopicChronology31);
        boolean boolean35 = dateTimeZone22.isFixed();
        org.joda.time.ReadableInstant readableInstant36 = null;
        int int37 = dateTimeZone22.getOffset(readableInstant36);
        long long39 = dateTimeZone22.nextTransition((long) 0);
        long long41 = dateTimeZone3.getMillisKeepLocal(dateTimeZone22, 33001035L);
        long long43 = dateTimeZone22.convertUTCToLocal(6L);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-01:00" + "'", str6, "-01:00");
        org.junit.Assert.assertNotNull(ethiopicChronology8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-01:00" + "'", str14, "-01:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-3600000) + "'", int16 == (-3600000));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(ethiopicChronology19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-3600000) + "'", int27 == (-3600000));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(ethiopicChronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-3600000) + "'", int37 == (-3600000));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 33001035L + "'", long41 == 33001035L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-3599994L) + "'", long43 == (-3599994L));
    }

    @Test
    public void test20202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20202");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.weekyearOfCentury();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test20203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20203");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.millis();
        java.lang.String str5 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone7 = ethiopicChronology0.getZone();
        boolean boolean9 = dateTimeZone7.isStandardOffset(144000137L);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EthiopicChronology[UTC]" + "'", str5, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test20204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20204");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weekyears();
        java.lang.Object obj7 = null;
        boolean boolean8 = ethiopicChronology0.equals(obj7);
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.secondOfDay();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.centuryOfEra();
        long long17 = ethiopicChronology0.getDateTimeMillis((-359999968L), (int) (short) 1, 10, (int) (byte) 0, (int) (short) 1);
        org.joda.time.DurationField durationField18 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField19 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-427799999L) + "'", long17 == (-427799999L));
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test20205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20205");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = ethiopicChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = ethiopicChronology0.withZone(dateTimeZone10);
        org.joda.time.DurationField durationField12 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.Chronology chronology15 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology0.era();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology0.weekyear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test20206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20206");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weekyears();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.Chronology chronology9 = ethiopicChronology0.withZone(dateTimeZone8);
        org.joda.time.Chronology chronology10 = ethiopicChronology0.withUTC();
        long long14 = chronology10.add((long) 'a', 110L, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField15 = chronology10.dayOfMonth();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 207L + "'", long14 == 207L);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test20207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20207");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = ethiopicChronology0.get(readablePeriod10, (long) 189300000, 7200031L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test20208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20208");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = ethiopicChronology2.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology4 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology4.hourOfHalfday();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(ethiopicChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(ethiopicChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test20209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20209");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.Chronology chronology1 = ethiopicChronology0.withUTC();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.minuteOfHour();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test20210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20210");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.minuteOfHour();
        long long11 = ethiopicChronology0.add((-61885555199990L), (-65L), (int) (short) -1);
        org.joda.time.DurationField durationField12 = ethiopicChronology0.hours();
        org.joda.time.DateTimeZone dateTimeZone13 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-61885555199925L) + "'", long11 == (-61885555199925L));
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test20211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20211");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        int int4 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.secondOfDay();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.weekyearOfCentury();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test20212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20212");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.year();
        org.joda.time.DateTimeZone dateTimeZone7 = ethiopicChronology1.getZone();
        long long11 = dateTimeZone7.convertLocalToUTC(100L, false, 1L);
        java.lang.String str12 = dateTimeZone7.getID();
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone7.getOffset(readableInstant13);
        org.joda.time.Chronology chronology15 = ethiopicChronology0.withZone(dateTimeZone7);
        org.joda.time.DurationField durationField16 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology0.dayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = ethiopicChronology0.add(readablePeriod19, (-3600000L), (int) 'a');
        java.lang.String str23 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField24 = ethiopicChronology0.centuries();
        // The following exception was thrown during execution in test generation
        try {
            long long29 = ethiopicChronology0.getDateTimeMillis(37920000, (int) (short) 1, (int) (byte) -1, 60000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(ethiopicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-3600000L) + "'", long22 == (-3600000L));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "EthiopicChronology[UTC]" + "'", str23, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField24);
    }

    @Test
    public void test20213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20213");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.months();
        long long14 = ethiopicChronology0.add(828000104701L, 21807393006900032L, 0);
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 828000104701L + "'", long14 == 828000104701L);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test20214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20214");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.millis();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.millis();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.weeks();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test20215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20215");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.era();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.Chronology chronology10 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test20216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20216");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weekyears();
        java.lang.Object obj7 = null;
        boolean boolean8 = ethiopicChronology0.equals(obj7);
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.era();
        org.joda.time.DurationField durationField14 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.era();
        // The following exception was thrown during execution in test generation
        try {
            long long23 = ethiopicChronology0.getDateTimeMillis((int) '4', 0, 37920000, (int) (byte) -1, 3600000, 52, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test20217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20217");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology8.millisOfDay();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology8.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = ethiopicChronology8.getDateTimeMillis((-2082299848L), (int) ' ', (int) (short) -1, 60000, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-01:00" + "'", str6, "-01:00");
        org.junit.Assert.assertNotNull(ethiopicChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test20218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20218");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.weeks();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.weekyearOfCentury();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test20219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20219");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.millis();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology7.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology7.secondOfMinute();
        org.joda.time.DurationField durationField10 = ethiopicChronology7.halfdays();
        org.joda.time.DurationField durationField11 = ethiopicChronology7.months();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology7.halfdayOfDay();
        org.joda.time.DurationField durationField13 = ethiopicChronology7.weekyears();
        org.joda.time.DurationField durationField14 = ethiopicChronology7.centuries();
        org.joda.time.DurationField durationField15 = ethiopicChronology7.millis();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology7.dayOfYear();
        org.joda.time.DurationField durationField17 = ethiopicChronology7.millis();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology7.monthOfYear();
        org.joda.time.DurationField durationField19 = ethiopicChronology7.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology7.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField21 = ethiopicChronology7.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone22 = ethiopicChronology7.getZone();
        boolean boolean23 = ethiopicChronology0.equals((java.lang.Object) dateTimeZone22);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology24 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField25 = ethiopicChronology24.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField26 = ethiopicChronology24.secondOfMinute();
        org.joda.time.DurationField durationField27 = ethiopicChronology24.weeks();
        org.joda.time.DateTimeField dateTimeField28 = ethiopicChronology24.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField29 = ethiopicChronology24.millisOfSecond();
        org.joda.time.DurationField durationField30 = ethiopicChronology24.weeks();
        org.joda.time.DateTimeField dateTimeField31 = ethiopicChronology24.era();
        org.joda.time.DurationField durationField32 = ethiopicChronology24.millis();
        org.joda.time.Chronology chronology33 = ethiopicChronology24.withUTC();
        java.lang.String str34 = ethiopicChronology24.toString();
        org.joda.time.DateTimeField dateTimeField35 = ethiopicChronology24.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField36 = ethiopicChronology24.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone37 = ethiopicChronology24.getZone();
        long long39 = dateTimeZone37.nextTransition(35997259961L);
        org.joda.time.Chronology chronology40 = ethiopicChronology0.withZone(dateTimeZone37);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(ethiopicChronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "EthiopicChronology[UTC]" + "'", str34, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 35997259961L + "'", long39 == 35997259961L);
        org.junit.Assert.assertNotNull(chronology40);
    }

    @Test
    public void test20220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20220");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.millis();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField8 = ethiopicChronology7.seconds();
        org.joda.time.DurationField durationField9 = ethiopicChronology7.years();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology11 = ethiopicChronology7.withZone(dateTimeZone10);
        boolean boolean12 = dateTimeZone10.isFixed();
        java.lang.String str13 = dateTimeZone10.getID();
        org.joda.time.Chronology chronology14 = ethiopicChronology0.withZone(dateTimeZone10);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology15 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField16 = ethiopicChronology15.seconds();
        org.joda.time.DurationField durationField17 = ethiopicChronology15.years();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology19 = ethiopicChronology15.withZone(dateTimeZone18);
        java.lang.String str21 = dateTimeZone18.getNameKey((long) 1);
        int int23 = dateTimeZone18.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        int int26 = dateTimeZone18.getOffset((long) (byte) 1);
        boolean boolean28 = dateTimeZone18.isStandardOffset(1L);
        long long32 = dateTimeZone18.convertLocalToUTC(1L, false, (long) (short) 1);
        long long34 = dateTimeZone18.convertUTCToLocal((long) 4);
        org.joda.time.Chronology chronology35 = ethiopicChronology0.withZone(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField36 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField37 = ethiopicChronology0.era();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-01:00" + "'", str13, "-01:00");
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(ethiopicChronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-3600000) + "'", int23 == (-3600000));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-3600000) + "'", int26 == (-3600000));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 3600001L + "'", long32 == 3600001L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-3599996L) + "'", long34 == (-3599996L));
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
    }

    @Test
    public void test20221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20221");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.hours();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.dayOfYear();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField12 = ethiopicChronology0.years();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology13 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField14 = ethiopicChronology13.seconds();
        org.joda.time.DurationField durationField15 = ethiopicChronology13.years();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology17 = ethiopicChronology13.withZone(dateTimeZone16);
        java.lang.String str19 = dateTimeZone16.getNameKey((long) 1);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology20 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField21 = ethiopicChronology20.millisOfSecond();
        long long25 = ethiopicChronology20.add(35L, 0L, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        long long29 = ethiopicChronology20.add(readablePeriod26, (long) (short) 0, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone30 = ethiopicChronology20.getZone();
        org.joda.time.LocalDateTime localDateTime31 = null;
        boolean boolean32 = dateTimeZone30.isLocalDateTimeGap(localDateTime31);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology33 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField34 = ethiopicChronology33.seconds();
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        long long38 = ethiopicChronology33.add(readablePeriod35, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DurationField durationField39 = ethiopicChronology33.millis();
        org.joda.time.DateTimeZone dateTimeZone40 = ethiopicChronology33.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology41 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone40);
        boolean boolean42 = dateTimeZone30.equals((java.lang.Object) dateTimeZone40);
        int int44 = dateTimeZone30.getStandardOffset((-115199995L));
        org.joda.time.Chronology chronology45 = ethiopicChronology0.withZone(dateTimeZone30);
        org.joda.time.ReadablePartial readablePartial46 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long48 = ethiopicChronology0.set(readablePartial46, (-2890080141760800000L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(ethiopicChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(ethiopicChronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 35L + "'", long25 == 35L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(ethiopicChronology33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(ethiopicChronology41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-3600000) + "'", int44 == (-3600000));
        org.junit.Assert.assertNotNull(chronology45);
    }

    @Test
    public void test20222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20222");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weekyears();
        java.lang.Object obj7 = null;
        boolean boolean8 = ethiopicChronology0.equals(obj7);
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.era();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField15 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField16 = ethiopicChronology0.centuries();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test20223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20223");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean1 = dateTimeZone0.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        long long4 = dateTimeZone0.convertUTCToLocal((-100L));
        org.joda.time.chrono.EthiopicChronology ethiopicChronology5 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology5.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone7 = ethiopicChronology5.getZone();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology5.monthOfYear();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology5.era();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-3600100L) + "'", long4 == (-3600100L));
        org.junit.Assert.assertNotNull(ethiopicChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test20224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20224");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        int int4 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekyearOfCentury();
        long long9 = ethiopicChronology0.add((long) 100, (long) (-1), 10);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = ethiopicChronology0.add(readablePeriod11, 90L, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = ethiopicChronology0.add(readablePeriod15, 3210L, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField20 = ethiopicChronology0.hours();
        org.joda.time.DurationField durationField21 = ethiopicChronology0.halfdays();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology22 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField23 = ethiopicChronology22.seconds();
        org.joda.time.DurationField durationField24 = ethiopicChronology22.hours();
        org.joda.time.DurationField durationField25 = ethiopicChronology22.minutes();
        org.joda.time.DateTimeField dateTimeField26 = ethiopicChronology22.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField27 = ethiopicChronology22.yearOfEra();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology28 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField29 = ethiopicChronology28.seconds();
        org.joda.time.DurationField durationField30 = ethiopicChronology28.years();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology32 = ethiopicChronology28.withZone(dateTimeZone31);
        boolean boolean33 = dateTimeZone31.isFixed();
        java.lang.String str34 = dateTimeZone31.getID();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology36 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone31, 4);
        org.joda.time.Chronology chronology37 = ethiopicChronology22.withZone(dateTimeZone31);
        org.joda.time.Chronology chronology38 = ethiopicChronology0.withZone(dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField39 = ethiopicChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 90L + "'", long9 == 90L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 90L + "'", long14 == 90L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3210L + "'", long18 == 3210L);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(ethiopicChronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(ethiopicChronology28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "-01:00" + "'", str34, "-01:00");
        org.junit.Assert.assertNotNull(ethiopicChronology36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTimeField39);
    }

    @Test
    public void test20225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20225");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.millis();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean10 = dateTimeZone9.isFixed();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology11 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology11.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology11.year();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology14 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField15 = ethiopicChronology14.seconds();
        org.joda.time.DurationField durationField16 = ethiopicChronology14.years();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology18 = ethiopicChronology14.withZone(dateTimeZone17);
        java.lang.String str20 = dateTimeZone17.getNameKey((long) 1);
        org.joda.time.Chronology chronology21 = ethiopicChronology11.withZone(dateTimeZone17);
        long long24 = dateTimeZone17.convertLocalToUTC((long) 0, true);
        boolean boolean26 = dateTimeZone17.isStandardOffset((long) (short) 1);
        long long28 = dateTimeZone9.getMillisKeepLocal(dateTimeZone17, 35L);
        org.joda.time.Chronology chronology29 = ethiopicChronology0.withZone(dateTimeZone9);
        int int31 = dateTimeZone9.getOffset((long) 360000000);
        long long33 = dateTimeZone9.nextTransition((long) (short) -1);
        java.util.Locale locale35 = null;
        java.lang.String str36 = dateTimeZone9.getName((-14459996L), locale35);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(ethiopicChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(ethiopicChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3600000L + "'", long24 == 3600000L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 35L + "'", long28 == 35L);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-3600000) + "'", int31 == (-3600000));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "-01:00" + "'", str36, "-01:00");
    }

    @Test
    public void test20226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20226");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DurationField durationField6 = ethiopicChronology0.millis();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone9 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology10 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField11 = ethiopicChronology10.seconds();
        org.joda.time.DurationField durationField12 = ethiopicChronology10.years();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology10.yearOfCentury();
        org.joda.time.DurationField durationField14 = ethiopicChronology10.seconds();
        org.joda.time.DurationField durationField15 = ethiopicChronology10.hours();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology10.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology10.weekyear();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology10.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology10.millisOfDay();
        org.joda.time.DurationField durationField20 = ethiopicChronology10.seconds();
        boolean boolean21 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology10);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(ethiopicChronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test20227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20227");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = ethiopicChronology0.getZone();
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean5 = dateTimeZone4.isFixed();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology6 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology6.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology6.year();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology9 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField10 = ethiopicChronology9.seconds();
        org.joda.time.DurationField durationField11 = ethiopicChronology9.years();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology13 = ethiopicChronology9.withZone(dateTimeZone12);
        java.lang.String str15 = dateTimeZone12.getNameKey((long) 1);
        org.joda.time.Chronology chronology16 = ethiopicChronology6.withZone(dateTimeZone12);
        long long19 = dateTimeZone12.convertLocalToUTC((long) 0, true);
        boolean boolean21 = dateTimeZone12.isStandardOffset((long) (short) 1);
        long long23 = dateTimeZone4.getMillisKeepLocal(dateTimeZone12, 35L);
        long long25 = dateTimeZone2.getMillisKeepLocal(dateTimeZone12, 90L);
        long long28 = dateTimeZone12.convertLocalToUTC(3600004L, false);
        long long31 = dateTimeZone12.adjustOffset((long) ' ', true);
        java.util.Locale locale33 = null;
        java.lang.String str34 = dateTimeZone12.getShortName(360000000L, locale33);
        int int36 = dateTimeZone12.getOffsetFromLocal(134L);
        long long39 = dateTimeZone12.convertLocalToUTC((-241L), false);
        long long43 = dateTimeZone12.convertLocalToUTC((-60797084399900L), true, (-359999900L));
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(ethiopicChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(ethiopicChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 3600000L + "'", long19 == 3600000L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 35L + "'", long23 == 35L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 3600090L + "'", long25 == 3600090L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 7200004L + "'", long28 == 7200004L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 32L + "'", long31 == 32L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "-01:00" + "'", str34, "-01:00");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-3600000) + "'", int36 == (-3600000));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 3599759L + "'", long39 == 3599759L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-60797080799900L) + "'", long43 == (-60797080799900L));
    }

    @Test
    public void test20228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20228");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.hours();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.minutes();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.centuries();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.years();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology6 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology6.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology6.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.Chronology chronology10 = ethiopicChronology6.withZone(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology6.year();
        org.joda.time.DateTimeZone dateTimeZone12 = ethiopicChronology6.getZone();
        long long16 = dateTimeZone12.convertLocalToUTC(100L, false, 1L);
        java.lang.String str17 = dateTimeZone12.getID();
        long long21 = dateTimeZone12.convertLocalToUTC((long) (short) 0, false, 10L);
        org.joda.time.Chronology chronology22 = ethiopicChronology0.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField23 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField24 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        long long28 = ethiopicChronology0.add(readablePeriod25, (long) (byte) -1, (-1));
        org.joda.time.DurationField durationField29 = ethiopicChronology0.halfdays();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology30 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField31 = ethiopicChronology30.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField32 = ethiopicChronology30.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField33 = ethiopicChronology30.weekyear();
        org.joda.time.DateTimeField dateTimeField34 = ethiopicChronology30.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField35 = ethiopicChronology30.minuteOfHour();
        org.joda.time.DurationField durationField36 = ethiopicChronology30.millis();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology37 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField38 = ethiopicChronology37.seconds();
        org.joda.time.DurationField durationField39 = ethiopicChronology37.years();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology41 = ethiopicChronology37.withZone(dateTimeZone40);
        boolean boolean42 = dateTimeZone40.isFixed();
        java.lang.String str43 = dateTimeZone40.getID();
        org.joda.time.Chronology chronology44 = ethiopicChronology30.withZone(dateTimeZone40);
        org.joda.time.ReadableInstant readableInstant45 = null;
        int int46 = dateTimeZone40.getOffset(readableInstant45);
        org.joda.time.Chronology chronology47 = ethiopicChronology0.withZone(dateTimeZone40);
        org.joda.time.DurationField durationField48 = ethiopicChronology0.days();
        org.joda.time.Chronology chronology49 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeZone dateTimeZone50 = chronology49.getZone();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(ethiopicChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(ethiopicChronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(ethiopicChronology37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "-01:00" + "'", str43, "-01:00");
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-3600000) + "'", int46 == (-3600000));
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(dateTimeZone50);
    }

    @Test
    public void test20229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20229");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test20230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20230");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        long long10 = dateTimeZone6.convertLocalToUTC(100L, false, 1L);
        long long12 = dateTimeZone6.nextTransition((long) 0);
        java.util.TimeZone timeZone13 = dateTimeZone6.toTimeZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology14 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField15 = ethiopicChronology14.seconds();
        org.joda.time.DurationField durationField16 = ethiopicChronology14.hours();
        org.joda.time.DurationField durationField17 = ethiopicChronology14.minutes();
        org.joda.time.DurationField durationField18 = ethiopicChronology14.centuries();
        org.joda.time.DurationField durationField19 = ethiopicChronology14.years();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology20 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField21 = ethiopicChronology20.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology20.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.Chronology chronology24 = ethiopicChronology20.withZone(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField25 = ethiopicChronology20.year();
        org.joda.time.DateTimeZone dateTimeZone26 = ethiopicChronology20.getZone();
        long long30 = dateTimeZone26.convertLocalToUTC(100L, false, 1L);
        java.lang.String str31 = dateTimeZone26.getID();
        long long35 = dateTimeZone26.convertLocalToUTC((long) (short) 0, false, 10L);
        org.joda.time.Chronology chronology36 = ethiopicChronology14.withZone(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField37 = ethiopicChronology14.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField38 = ethiopicChronology14.hourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        long long42 = ethiopicChronology14.add(readablePeriod39, (long) (byte) -1, (-1));
        org.joda.time.DurationField durationField43 = ethiopicChronology14.halfdays();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology44 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField45 = ethiopicChronology44.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField46 = ethiopicChronology44.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField47 = ethiopicChronology44.weekyear();
        org.joda.time.DateTimeField dateTimeField48 = ethiopicChronology44.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField49 = ethiopicChronology44.minuteOfHour();
        org.joda.time.DurationField durationField50 = ethiopicChronology44.millis();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology51 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField52 = ethiopicChronology51.seconds();
        org.joda.time.DurationField durationField53 = ethiopicChronology51.years();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology55 = ethiopicChronology51.withZone(dateTimeZone54);
        boolean boolean56 = dateTimeZone54.isFixed();
        java.lang.String str57 = dateTimeZone54.getID();
        org.joda.time.Chronology chronology58 = ethiopicChronology44.withZone(dateTimeZone54);
        org.joda.time.ReadableInstant readableInstant59 = null;
        int int60 = dateTimeZone54.getOffset(readableInstant59);
        org.joda.time.Chronology chronology61 = ethiopicChronology14.withZone(dateTimeZone54);
        org.joda.time.DurationField durationField62 = ethiopicChronology14.days();
        org.joda.time.Chronology chronology63 = ethiopicChronology14.withUTC();
        org.joda.time.DateTimeField dateTimeField64 = ethiopicChronology14.yearOfEra();
        org.joda.time.Chronology chronology65 = ethiopicChronology14.withUTC();
        boolean boolean66 = dateTimeZone6.equals((java.lang.Object) ethiopicChronology14);
        org.joda.time.ReadablePartial readablePartial67 = null;
        int[] intArray73 = new int[] { (-3660000), (-3600000), (-1), ' ', 349200000 };
        // The following exception was thrown during execution in test generation
        try {
            ethiopicChronology14.validate(readablePartial67, intArray73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(ethiopicChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(ethiopicChronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 100L + "'", long30 == 100L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "UTC" + "'", str31, "UTC");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertNotNull(ethiopicChronology44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(durationField50);
        org.junit.Assert.assertNotNull(ethiopicChronology51);
        org.junit.Assert.assertNotNull(durationField52);
        org.junit.Assert.assertNotNull(durationField53);
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "-01:00" + "'", str57, "-01:00");
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-3600000) + "'", int60 == (-3600000));
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(durationField62);
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[-3660000, -3600000, -1, 32, 349200000]");
    }

    @Test
    public void test20231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20231");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone7 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField9 = ethiopicChronology8.seconds();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = ethiopicChronology8.add(readablePeriod10, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology8.secondOfDay();
        org.joda.time.DurationField durationField15 = ethiopicChronology8.weekyears();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forID("+00:00");
        java.lang.String str18 = dateTimeZone17.getID();
        boolean boolean19 = dateTimeZone17.isFixed();
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone17.getShortName((long) (-1), locale21);
        org.joda.time.Chronology chronology23 = ethiopicChronology8.withZone(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField24 = ethiopicChronology8.weekyearOfCentury();
        boolean boolean25 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology8);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology26 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField27 = ethiopicChronology26.seconds();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        long long31 = ethiopicChronology26.add(readablePeriod28, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        long long35 = ethiopicChronology26.add(readablePeriod32, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone36 = ethiopicChronology26.getZone();
        long long39 = dateTimeZone36.adjustOffset(10L, true);
        int int41 = dateTimeZone36.getOffsetFromLocal((long) 'a');
        long long43 = dateTimeZone36.previousTransition(5L);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology44 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField45 = ethiopicChronology44.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField46 = ethiopicChronology44.secondOfMinute();
        org.joda.time.DurationField durationField47 = ethiopicChronology44.halfdays();
        int int48 = ethiopicChronology44.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField49 = ethiopicChronology44.months();
        org.joda.time.DateTimeField dateTimeField50 = ethiopicChronology44.year();
        org.joda.time.DateTimeZone dateTimeZone51 = ethiopicChronology44.getZone();
        java.lang.String str52 = dateTimeZone51.toString();
        java.lang.String str54 = dateTimeZone51.getShortName((long) 189300000);
        long long57 = dateTimeZone51.convertLocalToUTC((-359999989L), false);
        java.lang.String str59 = dateTimeZone51.getShortName(0L);
        long long61 = dateTimeZone36.getMillisKeepLocal(dateTimeZone51, (-3599868L));
        org.joda.time.Chronology chronology62 = ethiopicChronology0.withZone(dateTimeZone36);
        org.joda.time.DateTimeField dateTimeField63 = ethiopicChronology0.hourOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(ethiopicChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(ethiopicChronology26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L + "'", long39 == 10L);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 5L + "'", long43 == 5L);
        org.junit.Assert.assertNotNull(ethiopicChronology44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(durationField47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 4 + "'", int48 == 4);
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "UTC" + "'", str52, "UTC");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "+00:00" + "'", str54, "+00:00");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-359999989L) + "'", long57 == (-359999989L));
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "+00:00" + "'", str59, "+00:00");
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-3599868L) + "'", long61 == (-3599868L));
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertNotNull(dateTimeField63);
    }

    @Test
    public void test20232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20232");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        int int8 = dateTimeZone3.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        boolean boolean11 = dateTimeZone3.isStandardOffset((long) (short) 10);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology12 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology12.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone14 = ethiopicChronology12.getZone();
        boolean boolean15 = dateTimeZone3.equals((java.lang.Object) ethiopicChronology12);
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology12.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology12.dayOfWeek();
        org.joda.time.DurationField durationField18 = ethiopicChronology12.years();
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology12.clockhourOfHalfday();
        org.joda.time.Chronology chronology20 = ethiopicChronology12.withUTC();
        org.joda.time.DurationField durationField21 = chronology20.days();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-3600000) + "'", int8 == (-3600000));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(ethiopicChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(durationField21);
    }

    @Test
    public void test20233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20233");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.yearOfEra();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology5 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField6 = ethiopicChronology5.seconds();
        org.joda.time.DurationField durationField7 = ethiopicChronology5.years();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology9 = ethiopicChronology5.withZone(dateTimeZone8);
        java.lang.String str11 = dateTimeZone8.getNameKey((long) 1);
        int int13 = dateTimeZone8.getStandardOffset((long) (short) 0);
        org.joda.time.Chronology chronology14 = ethiopicChronology0.withZone(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField16 = ethiopicChronology0.weeks();
        org.joda.time.Chronology chronology17 = ethiopicChronology0.withUTC();
        org.joda.time.DurationField durationField18 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField21 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.Chronology chronology22 = ethiopicChronology0.withUTC();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(ethiopicChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-3600000) + "'", int13 == (-3600000));
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(chronology22);
    }

    @Test
    public void test20234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20234");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test20235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20235");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.era();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.year();
        java.lang.String str7 = ethiopicChronology0.toString();
        org.joda.time.Chronology chronology8 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.weekyear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EthiopicChronology[UTC]" + "'", str7, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test20236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20236");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = ethiopicChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = ethiopicChronology0.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField13 = ethiopicChronology0.halfdays();
        java.lang.String str14 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EthiopicChronology[UTC]" + "'", str14, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test20237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20237");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weekyears();
        java.lang.Object obj7 = null;
        boolean boolean8 = ethiopicChronology0.equals(obj7);
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.secondOfDay();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.centuryOfEra();
        long long17 = ethiopicChronology0.getDateTimeMillis((-359999968L), (int) (short) 1, 10, (int) (byte) 0, (int) (short) 1);
        org.joda.time.DurationField durationField18 = ethiopicChronology0.seconds();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology19 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology19.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField21 = ethiopicChronology19.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology19.weekyear();
        org.joda.time.DateTimeField dateTimeField23 = ethiopicChronology19.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField24 = ethiopicChronology19.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField25 = ethiopicChronology19.weekyear();
        org.joda.time.DateTimeField dateTimeField26 = ethiopicChronology19.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField27 = ethiopicChronology19.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField28 = ethiopicChronology19.millisOfSecond();
        org.joda.time.DurationField durationField29 = ethiopicChronology19.weeks();
        org.joda.time.DurationField durationField30 = ethiopicChronology19.days();
        org.joda.time.DateTimeField dateTimeField31 = ethiopicChronology19.millisOfDay();
        org.joda.time.DurationField durationField32 = ethiopicChronology19.centuries();
        org.joda.time.DateTimeZone dateTimeZone33 = ethiopicChronology19.getZone();
        org.joda.time.Chronology chronology34 = ethiopicChronology0.withZone(dateTimeZone33);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-427799999L) + "'", long17 == (-427799999L));
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(ethiopicChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(chronology34);
    }

    @Test
    public void test20238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20238");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.era();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField12 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test20239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20239");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weekyears();
        java.lang.Object obj7 = null;
        boolean boolean8 = ethiopicChronology0.equals(obj7);
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.era();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.centuries();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test20240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20240");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.secondOfDay();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forID("+00:00");
        java.lang.String str10 = dateTimeZone9.getID();
        boolean boolean11 = dateTimeZone9.isFixed();
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone9.getShortName((long) (-1), locale13);
        org.joda.time.Chronology chronology15 = ethiopicChronology0.withZone(dateTimeZone9);
        org.joda.time.DurationField durationField16 = chronology15.months();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.minuteOfDay();
        org.joda.time.DurationField durationField18 = chronology15.hours();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test20241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20241");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone3 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.millisOfDay();
        java.lang.String str5 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.weeks();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EthiopicChronology[UTC]" + "'", str5, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test20242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20242");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(100);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology2 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = ethiopicChronology2.seconds();
        org.joda.time.DurationField durationField4 = ethiopicChronology2.years();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology2.yearOfCentury();
        org.joda.time.DurationField durationField6 = ethiopicChronology2.seconds();
        org.joda.time.DurationField durationField7 = ethiopicChronology2.centuries();
        boolean boolean8 = dateTimeZone1.equals((java.lang.Object) ethiopicChronology2);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology9 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology9.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology9.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.Chronology chronology13 = ethiopicChronology9.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology9.year();
        org.joda.time.DateTimeZone dateTimeZone15 = ethiopicChronology9.getZone();
        long long19 = dateTimeZone15.convertLocalToUTC(100L, false, 1L);
        java.lang.String str20 = dateTimeZone15.getID();
        org.joda.time.Chronology chronology21 = ethiopicChronology2.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology2.yearOfEra();
        org.joda.time.DurationField durationField23 = ethiopicChronology2.years();
        org.joda.time.DateTimeField dateTimeField24 = ethiopicChronology2.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField25 = ethiopicChronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField26 = ethiopicChronology2.millisOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(ethiopicChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(ethiopicChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
    }

    @Test
    public void test20243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20243");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = ethiopicChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = ethiopicChronology0.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.dayOfYear();
        org.joda.time.DurationField durationField14 = ethiopicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.monthOfYear();
        org.joda.time.DurationField durationField16 = ethiopicChronology0.weeks();
        org.joda.time.ReadablePartial readablePartial17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = ethiopicChronology0.get(readablePartial17, (-189299029L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test20244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20244");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.era();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test20245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20245");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.dayOfYear();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.centuryOfEra();
        org.joda.time.Chronology chronology11 = ethiopicChronology0.withUTC();
        org.joda.time.ReadablePartial readablePartial12 = null;
        int[] intArray17 = new int[] { 349200000, 35, (byte) 10, 6720000 };
        // The following exception was thrown during execution in test generation
        try {
            chronology11.validate(readablePartial12, intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[349200000, 35, 10, 6720000]");
    }

    @Test
    public void test20246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20246");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.Chronology chronology2 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weeks();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test20247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20247");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.year();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology3 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField4 = ethiopicChronology3.seconds();
        org.joda.time.DurationField durationField5 = ethiopicChronology3.years();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology7 = ethiopicChronology3.withZone(dateTimeZone6);
        java.lang.String str9 = dateTimeZone6.getNameKey((long) 1);
        org.joda.time.Chronology chronology10 = ethiopicChronology0.withZone(dateTimeZone6);
        long long13 = dateTimeZone6.convertLocalToUTC((long) 0, true);
        long long15 = dateTimeZone6.convertUTCToLocal((long) (short) -1);
        java.lang.String str16 = dateTimeZone6.getID();
        long long18 = dateTimeZone6.previousTransition((long) (short) -1);
        java.lang.String str20 = dateTimeZone6.getShortName((long) (-1));
        java.lang.String str21 = dateTimeZone6.getID();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology22 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField23 = ethiopicChronology22.clockhourOfHalfday();
        org.joda.time.DurationField durationField24 = ethiopicChronology22.weekyears();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(ethiopicChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3600000L + "'", long13 == 3600000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-3600001L) + "'", long15 == (-3600001L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-01:00" + "'", str16, "-01:00");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-01:00" + "'", str20, "-01:00");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-01:00" + "'", str21, "-01:00");
        org.junit.Assert.assertNotNull(ethiopicChronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
    }

    @Test
    public void test20248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20248");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getName((long) (byte) 1);
        java.lang.String str7 = dateTimeZone3.getID();
        java.lang.String str8 = dateTimeZone3.toString();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forID("+00:00:00.001");
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) '#');
        long long14 = dateTimeZone10.getMillisKeepLocal(dateTimeZone12, (-359999968L));
        java.lang.String str15 = dateTimeZone12.toString();
        long long17 = dateTimeZone12.nextTransition((-65L));
        org.joda.time.ReadableInstant readableInstant18 = null;
        int int19 = dateTimeZone12.getOffset(readableInstant18);
        java.util.Locale locale21 = null;
        java.lang.String str22 = dateTimeZone12.getShortName(189300004L, locale21);
        boolean boolean23 = dateTimeZone3.equals((java.lang.Object) dateTimeZone12);
        boolean boolean24 = dateTimeZone3.isFixed();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-01:00" + "'", str6, "-01:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-01:00" + "'", str7, "-01:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-01:00" + "'", str8, "-01:00");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-360000002L) + "'", long14 == (-360000002L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.035" + "'", str15, "+00:00:00.035");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-65L) + "'", long17 == (-65L));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.035" + "'", str22, "+00:00:00.035");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test20249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20249");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = ethiopicChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = ethiopicChronology0.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DurationField durationField15 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone18 = ethiopicChronology0.getZone();
        java.lang.String str19 = ethiopicChronology0.toString();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EthiopicChronology[UTC]" + "'", str19, "EthiopicChronology[UTC]");
    }

    @Test
    public void test20250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20250");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.months();
        org.joda.time.Chronology chronology5 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test20251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20251");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.millis();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean10 = dateTimeZone9.isFixed();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology11 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology11.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology11.year();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology14 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField15 = ethiopicChronology14.seconds();
        org.joda.time.DurationField durationField16 = ethiopicChronology14.years();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology18 = ethiopicChronology14.withZone(dateTimeZone17);
        java.lang.String str20 = dateTimeZone17.getNameKey((long) 1);
        org.joda.time.Chronology chronology21 = ethiopicChronology11.withZone(dateTimeZone17);
        long long24 = dateTimeZone17.convertLocalToUTC((long) 0, true);
        boolean boolean26 = dateTimeZone17.isStandardOffset((long) (short) 1);
        long long28 = dateTimeZone9.getMillisKeepLocal(dateTimeZone17, 35L);
        org.joda.time.Chronology chronology29 = ethiopicChronology0.withZone(dateTimeZone9);
        org.joda.time.DurationField durationField30 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField31 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField32 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField33 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField34 = ethiopicChronology0.year();
        java.util.TimeZone timeZone35 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        java.util.TimeZone timeZone37 = dateTimeZone36.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forTimeZone(timeZone37);
        java.lang.String str40 = dateTimeZone38.getNameKey((long) (byte) 100);
        long long42 = dateTimeZone38.convertUTCToLocal((long) 35);
        org.joda.time.Chronology chronology43 = ethiopicChronology0.withZone(dateTimeZone38);
        long long45 = dateTimeZone38.previousTransition((long) (short) 1);
        java.lang.String str47 = dateTimeZone38.getShortName((-8452799890L));
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(ethiopicChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(ethiopicChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3600000L + "'", long24 == 3600000L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 35L + "'", long28 == 35L);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "GMT-01:00");
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-3599965L) + "'", long42 == (-3599965L));
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1L + "'", long45 == 1L);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "-01:00" + "'", str47, "-01:00");
    }

    @Test
    public void test20252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20252");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weekyears();
        java.lang.Object obj7 = null;
        boolean boolean8 = ethiopicChronology0.equals(obj7);
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.era();
        org.joda.time.Chronology chronology10 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField13 = ethiopicChronology0.millis();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test20253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20253");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.era();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.hours();
        org.joda.time.DateTimeZone dateTimeZone8 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test20254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20254");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.millis();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.hours();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.hourOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology6 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology6.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone8 = ethiopicChronology6.getZone();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology6.dayOfYear();
        int int10 = ethiopicChronology6.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology6.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology6.clockhourOfDay();
        org.joda.time.DurationField durationField13 = ethiopicChronology6.minutes();
        boolean boolean14 = ethiopicChronology0.equals((java.lang.Object) ethiopicChronology6);
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(ethiopicChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test20255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20255");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.hours();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.halfdays();
        long long12 = ethiopicChronology0.add((long) 10, (long) '4', (-3600000));
        org.joda.time.Chronology chronology13 = ethiopicChronology0.withUTC();
        org.joda.time.Chronology chronology14 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField17 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology0.minuteOfHour();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-187199990L) + "'", long12 == (-187199990L));
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test20256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20256");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        org.joda.time.DurationField durationField5 = ethiopicChronology0.seconds();
        org.joda.time.Chronology chronology6 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.centuryOfEra();
        java.lang.String str9 = ethiopicChronology0.toString();
        long long13 = ethiopicChronology0.add(359999936L, (-99L), (int) (short) -1);
        java.lang.String str14 = ethiopicChronology0.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = ethiopicChronology0.getDateTimeMillis((int) (short) -1, (-1), (int) (byte) 100, (-3660000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -3660000 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EthiopicChronology[UTC]" + "'", str9, "EthiopicChronology[UTC]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 360000035L + "'", long13 == 360000035L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EthiopicChronology[UTC]" + "'", str14, "EthiopicChronology[UTC]");
    }

    @Test
    public void test20257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20257");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = ethiopicChronology0.getZone();
        java.lang.String str4 = dateTimeZone2.getNameKey((long) ' ');
        org.joda.time.chrono.EthiopicChronology ethiopicChronology5 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField6 = ethiopicChronology5.seconds();
        org.joda.time.DurationField durationField7 = ethiopicChronology5.years();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology9 = ethiopicChronology5.withZone(dateTimeZone8);
        int int11 = dateTimeZone8.getOffset((long) 0);
        int int13 = dateTimeZone8.getOffset((long) (byte) 1);
        boolean boolean14 = dateTimeZone2.equals((java.lang.Object) dateTimeZone8);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone8.getOffset(readableInstant15);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone8.getShortName(1L, locale18);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        boolean boolean22 = dateTimeZone8.isStandardOffset(97L);
        java.lang.String str24 = dateTimeZone8.getShortName((long) 3600000);
        long long26 = dateTimeZone8.previousTransition((-3840000L));
        long long28 = dateTimeZone8.previousTransition(288L);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertNotNull(ethiopicChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-3600000) + "'", int11 == (-3600000));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-3600000) + "'", int13 == (-3600000));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-3600000) + "'", int16 == (-3600000));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-01:00" + "'", str19, "-01:00");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-01:00" + "'", str24, "-01:00");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-3840000L) + "'", long26 == (-3840000L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 288L + "'", long28 == 288L);
    }

    @Test
    public void test20258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20258");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.minuteOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology5 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology5.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone7 = ethiopicChronology5.getZone();
        java.lang.String str9 = dateTimeZone7.getNameKey((long) ' ');
        org.joda.time.chrono.EthiopicChronology ethiopicChronology10 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField11 = ethiopicChronology10.seconds();
        org.joda.time.DurationField durationField12 = ethiopicChronology10.years();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology14 = ethiopicChronology10.withZone(dateTimeZone13);
        int int16 = dateTimeZone13.getOffset((long) 0);
        int int18 = dateTimeZone13.getOffset((long) (byte) 1);
        boolean boolean19 = dateTimeZone7.equals((java.lang.Object) dateTimeZone13);
        org.joda.time.ReadableInstant readableInstant20 = null;
        int int21 = dateTimeZone13.getOffset(readableInstant20);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone13.getShortName(1L, locale23);
        org.joda.time.Chronology chronology25 = ethiopicChronology0.withZone(dateTimeZone13);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology26 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField27 = ethiopicChronology26.seconds();
        org.joda.time.DurationField durationField28 = ethiopicChronology26.years();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology30 = ethiopicChronology26.withZone(dateTimeZone29);
        org.joda.time.LocalDateTime localDateTime31 = null;
        boolean boolean32 = dateTimeZone29.isLocalDateTimeGap(localDateTime31);
        java.util.Locale locale34 = null;
        java.lang.String str35 = dateTimeZone29.getName((long) (byte) -1, locale34);
        java.lang.String str37 = dateTimeZone29.getNameKey((-360000002L));
        java.util.Locale locale39 = null;
        java.lang.String str40 = dateTimeZone29.getShortName((long) 189300000, locale39);
        org.joda.time.Chronology chronology41 = ethiopicChronology0.withZone(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone42 = chronology41.getZone();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(ethiopicChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(ethiopicChronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-3600000) + "'", int16 == (-3600000));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3600000) + "'", int18 == (-3600000));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3600000) + "'", int21 == (-3600000));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-01:00" + "'", str24, "-01:00");
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(ethiopicChronology26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "-01:00" + "'", str35, "-01:00");
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "-01:00" + "'", str40, "-01:00");
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTimeZone42);
    }

    @Test
    public void test20259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20259");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale2 = null;
        java.lang.String str3 = dateTimeZone0.getShortName((long) ' ', locale2);
        long long5 = dateTimeZone0.previousTransition((long) (byte) 100);
        long long9 = dateTimeZone0.convertLocalToUTC((long) (short) 100, false, (long) 360000000);
        java.util.TimeZone timeZone10 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology13 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone11, 4);
        int int15 = dateTimeZone11.getOffsetFromLocal(7203L);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology16 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone11);
        long long18 = dateTimeZone11.previousTransition((-37919999L));
        int int20 = dateTimeZone11.getOffset(669184934598L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-01:00" + "'", str3, "-01:00");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600100L + "'", long9 == 3600100L);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT-01:00");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(ethiopicChronology13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3600000) + "'", int15 == (-3600000));
        org.junit.Assert.assertNotNull(ethiopicChronology16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-37919999L) + "'", long18 == (-37919999L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-3600000) + "'", int20 == (-3600000));
    }

    @Test
    public void test20260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20260");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = ethiopicChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.centuries();
        org.joda.time.DurationField durationField12 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.millisOfDay();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology14 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField15 = ethiopicChronology14.seconds();
        org.joda.time.DurationField durationField16 = ethiopicChronology14.years();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology18 = ethiopicChronology14.withZone(dateTimeZone17);
        boolean boolean19 = dateTimeZone17.isFixed();
        java.lang.String str20 = dateTimeZone17.getID();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology22 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone17, 4);
        org.joda.time.DateTimeField dateTimeField23 = ethiopicChronology22.hourOfHalfday();
        long long27 = ethiopicChronology22.add((long) ' ', 359999999L, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField28 = ethiopicChronology22.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField29 = ethiopicChronology22.yearOfEra();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology30 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField31 = ethiopicChronology30.seconds();
        org.joda.time.DurationField durationField32 = ethiopicChronology30.years();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology34 = ethiopicChronology30.withZone(dateTimeZone33);
        boolean boolean35 = dateTimeZone33.isFixed();
        java.lang.String str36 = dateTimeZone33.getID();
        org.joda.time.Chronology chronology37 = ethiopicChronology22.withZone(dateTimeZone33);
        org.joda.time.Chronology chronology38 = ethiopicChronology0.withZone(dateTimeZone33);
        java.lang.String str39 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField40 = ethiopicChronology0.days();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(ethiopicChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-01:00" + "'", str20, "-01:00");
        org.junit.Assert.assertNotNull(ethiopicChronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32L + "'", long27 == 32L);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(ethiopicChronology30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "-01:00" + "'", str36, "-01:00");
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "EthiopicChronology[UTC]" + "'", str39, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField40);
    }

    @Test
    public void test20261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20261");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.millisOfDay();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.dayOfWeek();
        org.joda.time.Chronology chronology7 = ethiopicChronology0.withUTC();
        java.lang.Class<?> wildcardClass8 = chronology7.getClass();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test20262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20262");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        int int8 = dateTimeZone3.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        boolean boolean11 = dateTimeZone3.isStandardOffset((long) (short) 10);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology12 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology12.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone14 = ethiopicChronology12.getZone();
        boolean boolean15 = dateTimeZone3.equals((java.lang.Object) ethiopicChronology12);
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology12.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology12.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone18.getShortName((long) ' ', locale20);
        long long23 = dateTimeZone18.previousTransition((long) (byte) 100);
        long long27 = dateTimeZone18.convertLocalToUTC((long) (short) 100, false, (long) 360000000);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours(100);
        long long31 = dateTimeZone29.convertUTCToLocal((-1L));
        long long33 = dateTimeZone18.getMillisKeepLocal(dateTimeZone29, (long) ' ');
        boolean boolean35 = dateTimeZone18.isStandardOffset(359999999L);
        org.joda.time.LocalDateTime localDateTime36 = null;
        boolean boolean37 = dateTimeZone18.isLocalDateTimeGap(localDateTime36);
        org.joda.time.Chronology chronology38 = ethiopicChronology12.withZone(dateTimeZone18);
        org.joda.time.DurationField durationField39 = ethiopicChronology12.millis();
        org.joda.time.DurationField durationField40 = ethiopicChronology12.minutes();
        java.lang.String str41 = ethiopicChronology12.toString();
        org.joda.time.DurationField durationField42 = ethiopicChronology12.millis();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-3600000) + "'", int8 == (-3600000));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(ethiopicChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-01:00" + "'", str21, "-01:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 3600100L + "'", long27 == 3600100L);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 359999999L + "'", long31 == 359999999L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-363599968L) + "'", long33 == (-363599968L));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "EthiopicChronology[UTC]" + "'", str41, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField42);
    }

    @Test
    public void test20263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20263");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = ethiopicChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = ethiopicChronology0.withZone(dateTimeZone10);
        org.joda.time.DurationField durationField12 = ethiopicChronology0.minutes();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology13 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology13.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology13.secondOfMinute();
        org.joda.time.DurationField durationField16 = ethiopicChronology13.halfdays();
        org.joda.time.DurationField durationField17 = ethiopicChronology13.months();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology13.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology13.year();
        java.lang.String str20 = ethiopicChronology13.toString();
        org.joda.time.DurationField durationField21 = ethiopicChronology13.days();
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology13.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField23 = ethiopicChronology13.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField24 = ethiopicChronology13.monthOfYear();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology25 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField26 = ethiopicChronology25.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField27 = ethiopicChronology25.secondOfMinute();
        org.joda.time.DurationField durationField28 = ethiopicChronology25.halfdays();
        int int29 = ethiopicChronology25.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField30 = ethiopicChronology25.months();
        org.joda.time.DateTimeField dateTimeField31 = ethiopicChronology25.year();
        org.joda.time.DateTimeZone dateTimeZone32 = ethiopicChronology25.getZone();
        java.lang.String str33 = dateTimeZone32.toString();
        org.joda.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = dateTimeZone32.isLocalDateTimeGap(localDateTime34);
        org.joda.time.Chronology chronology36 = ethiopicChronology13.withZone(dateTimeZone32);
        org.joda.time.Chronology chronology37 = ethiopicChronology0.withZone(dateTimeZone32);
        org.joda.time.DurationField durationField38 = ethiopicChronology0.weekyears();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology39 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField40 = ethiopicChronology39.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField41 = ethiopicChronology39.secondOfMinute();
        org.joda.time.DurationField durationField42 = ethiopicChronology39.halfdays();
        org.joda.time.DurationField durationField43 = ethiopicChronology39.months();
        org.joda.time.DateTimeField dateTimeField44 = ethiopicChronology39.halfdayOfDay();
        org.joda.time.DurationField durationField45 = ethiopicChronology39.weekyears();
        org.joda.time.DurationField durationField46 = ethiopicChronology39.centuries();
        org.joda.time.DurationField durationField47 = ethiopicChronology39.millis();
        org.joda.time.DateTimeZone dateTimeZone48 = ethiopicChronology39.getZone();
        org.joda.time.ReadableInstant readableInstant49 = null;
        int int50 = dateTimeZone48.getOffset(readableInstant49);
        org.joda.time.Chronology chronology51 = ethiopicChronology0.withZone(dateTimeZone48);
        java.lang.String str52 = dateTimeZone48.toString();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(ethiopicChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "EthiopicChronology[UTC]" + "'", str20, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(ethiopicChronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "UTC" + "'", str33, "UTC");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(ethiopicChronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertNotNull(durationField47);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "UTC" + "'", str52, "UTC");
    }

    @Test
    public void test20264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20264");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.minuteOfHour();
        java.lang.String str4 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = ethiopicChronology0.add(readablePeriod8, 359999999L, 10);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = ethiopicChronology0.getDateTimeMillis(363120000, (int) '4', 126000000, (int) (byte) 1, (int) '4', (int) (byte) 0, 115200000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 115200000 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EthiopicChronology[-01:00]" + "'", str4, "EthiopicChronology[-01:00]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 359999999L + "'", long11 == 359999999L);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test20265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20265");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology9 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology9.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone11 = ethiopicChronology9.getZone();
        org.joda.time.DateTimeZone dateTimeZone12 = ethiopicChronology9.getZone();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology9.millisOfDay();
        java.lang.String str14 = ethiopicChronology9.toString();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology9.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology9.dayOfYear();
        int int17 = ethiopicChronology9.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeZone dateTimeZone18 = ethiopicChronology9.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology19 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField20 = ethiopicChronology19.seconds();
        org.joda.time.DurationField durationField21 = ethiopicChronology19.years();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology23 = ethiopicChronology19.withZone(dateTimeZone22);
        java.lang.String str25 = dateTimeZone22.getNameKey((long) 1);
        int int27 = dateTimeZone22.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone22);
        boolean boolean30 = dateTimeZone22.isStandardOffset((long) (short) 10);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology31 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField32 = ethiopicChronology31.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone33 = ethiopicChronology31.getZone();
        boolean boolean34 = dateTimeZone22.equals((java.lang.Object) ethiopicChronology31);
        org.joda.time.DateTimeField dateTimeField35 = ethiopicChronology31.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField36 = ethiopicChronology31.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField37 = ethiopicChronology31.hourOfHalfday();
        boolean boolean38 = dateTimeZone18.equals((java.lang.Object) dateTimeField37);
        java.lang.String str39 = dateTimeZone18.toString();
        long long41 = dateTimeZone8.getMillisKeepLocal(dateTimeZone18, 99L);
        java.util.TimeZone timeZone42 = dateTimeZone18.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forTimeZone(timeZone42);
        int int45 = dateTimeZone43.getOffsetFromLocal((-65L));
        org.joda.time.LocalDateTime localDateTime46 = null;
        boolean boolean47 = dateTimeZone43.isLocalDateTimeGap(localDateTime46);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology48 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone43);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(ethiopicChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EthiopicChronology[UTC]" + "'", str14, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(ethiopicChronology19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-3600000) + "'", int27 == (-3600000));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(ethiopicChronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "UTC" + "'", str39, "UTC");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 99L + "'", long41 == 99L);
        org.junit.Assert.assertNotNull(timeZone42);
        org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(ethiopicChronology48);
    }

    @Test
    public void test20266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20266");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology8.hourOfHalfday();
        long long13 = ethiopicChronology8.add((long) ' ', 359999999L, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology8.yearOfEra();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology8.era();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology8.era();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology8.halfdayOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-01:00" + "'", str6, "-01:00");
        org.junit.Assert.assertNotNull(ethiopicChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test20267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20267");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) (byte) 10);
        boolean boolean3 = dateTimeZone2.isFixed();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone2.getShortName((long) 115200000, locale5);
        java.util.TimeZone timeZone7 = dateTimeZone2.toTimeZone();
        int int9 = dateTimeZone2.getOffsetFromLocal((-384000101L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+100:10" + "'", str6, "+100:10");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+:0:10");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 360600000 + "'", int9 == 360600000);
    }

    @Test
    public void test20268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20268");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.millis();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean10 = dateTimeZone9.isFixed();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology11 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology11.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology11.year();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology14 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField15 = ethiopicChronology14.seconds();
        org.joda.time.DurationField durationField16 = ethiopicChronology14.years();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology18 = ethiopicChronology14.withZone(dateTimeZone17);
        java.lang.String str20 = dateTimeZone17.getNameKey((long) 1);
        org.joda.time.Chronology chronology21 = ethiopicChronology11.withZone(dateTimeZone17);
        long long24 = dateTimeZone17.convertLocalToUTC((long) 0, true);
        boolean boolean26 = dateTimeZone17.isStandardOffset((long) (short) 1);
        long long28 = dateTimeZone9.getMillisKeepLocal(dateTimeZone17, 35L);
        org.joda.time.Chronology chronology29 = ethiopicChronology0.withZone(dateTimeZone9);
        int int31 = dateTimeZone9.getOffset(385L);
        java.lang.String str33 = dateTimeZone9.getShortName(359999936L);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(ethiopicChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(ethiopicChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3600000L + "'", long24 == 3600000L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 35L + "'", long28 == 35L);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-3600000) + "'", int31 == (-3600000));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "-01:00" + "'", str33, "-01:00");
    }

    @Test
    public void test20269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20269");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.years();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.Chronology chronology3 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.dayOfMonth();
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = ethiopicChronology0.set(readablePartial7, (-1463871847334756790L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test20270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20270");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.minutes();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.hours();
        java.lang.String str9 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.year();
        org.joda.time.DurationField durationField14 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.secondOfMinute();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EthiopicChronology[UTC]" + "'", str9, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test20271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20271");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        int int4 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.months();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.years();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.weeks();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeZone dateTimeZone10 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test20272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20272");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.monthOfYear();
        org.joda.time.Chronology chronology11 = ethiopicChronology0.withUTC();
        java.lang.String str12 = ethiopicChronology0.toString();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EthiopicChronology[UTC]" + "'", str12, "EthiopicChronology[UTC]");
    }

    @Test
    public void test20273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20273");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        int int4 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone6);
        long long11 = dateTimeZone6.convertLocalToUTC((-8279999925L), true, 100L);
        long long14 = dateTimeZone6.convertLocalToUTC(2605679999997L, true);
        java.util.TimeZone timeZone15 = dateTimeZone6.toTimeZone();
        long long19 = dateTimeZone6.convertLocalToUTC((-86398965L), false, (long) 'a');
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-8279999925L) + "'", long11 == (-8279999925L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2605679999997L + "'", long14 == 2605679999997L);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-86398965L) + "'", long19 == (-86398965L));
    }

    @Test
    public void test20274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20274");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        int int8 = dateTimeZone3.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        int int11 = dateTimeZone3.getOffset((long) (byte) 1);
        boolean boolean13 = dateTimeZone3.isStandardOffset(1L);
        long long17 = dateTimeZone3.convertLocalToUTC(1L, false, (long) (short) 1);
        java.util.Locale locale19 = null;
        java.lang.String str20 = dateTimeZone3.getShortName((-60907247999990L), locale19);
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone3.getName(1283039996256000000L, locale22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone3.getOffset(readableInstant24);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology26 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone3);
        int int28 = dateTimeZone3.getStandardOffset(132L);
        int int30 = dateTimeZone3.getOffsetFromLocal(13428601097L);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-3600000) + "'", int8 == (-3600000));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-3600000) + "'", int11 == (-3600000));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3600001L + "'", long17 == 3600001L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-01:00" + "'", str20, "-01:00");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-01:00" + "'", str23, "-01:00");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-3600000) + "'", int25 == (-3600000));
        org.junit.Assert.assertNotNull(ethiopicChronology26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-3600000) + "'", int28 == (-3600000));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-3600000) + "'", int30 == (-3600000));
    }

    @Test
    public void test20275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20275");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = ethiopicChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField13 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField17 = ethiopicChronology0.millis();
        org.joda.time.DurationField durationField18 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField21 = ethiopicChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test20276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20276");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        int int4 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.monthOfYear();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.halfdays();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test20277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20277");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.weekyear();
        java.lang.String str3 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.millisOfDay();
        long long8 = ethiopicChronology0.add((-8279999890L), 52L, 3600000);
        org.joda.time.DurationField durationField9 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.era();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EthiopicChronology[UTC]" + "'", str3, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-8092799890L) + "'", long8 == (-8092799890L));
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test20278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20278");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.era();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.years();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test20279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20279");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.era();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.millis();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.monthOfYear();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology12 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField13 = ethiopicChronology12.seconds();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = ethiopicChronology12.add(readablePeriod14, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = ethiopicChronology12.add(readablePeriod18, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology12.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone23 = ethiopicChronology12.getZone();
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone23.getShortName(3600000L, locale25);
        java.lang.String str28 = dateTimeZone23.getName(3600000L);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology29 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField30 = ethiopicChronology29.seconds();
        org.joda.time.DurationField durationField31 = ethiopicChronology29.years();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology33 = ethiopicChronology29.withZone(dateTimeZone32);
        int int35 = dateTimeZone32.getOffset((long) 0);
        int int37 = dateTimeZone32.getOffset((long) (byte) 1);
        boolean boolean38 = dateTimeZone23.equals((java.lang.Object) dateTimeZone32);
        boolean boolean39 = dateTimeZone23.isFixed();
        long long41 = dateTimeZone23.convertUTCToLocal((long) 'a');
        java.util.Locale locale43 = null;
        java.lang.String str44 = dateTimeZone23.getName(135L, locale43);
        org.joda.time.ReadableInstant readableInstant45 = null;
        int int46 = dateTimeZone23.getOffset(readableInstant45);
        java.lang.String str48 = dateTimeZone23.getNameKey(36359999999L);
        java.lang.String str49 = dateTimeZone23.toString();
        org.joda.time.Chronology chronology50 = ethiopicChronology0.withZone(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField51 = ethiopicChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(ethiopicChronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00" + "'", str26, "+00:00");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00" + "'", str28, "+00:00");
        org.junit.Assert.assertNotNull(ethiopicChronology29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-3600000) + "'", int35 == (-3600000));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-3600000) + "'", int37 == (-3600000));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 97L + "'", long41 == 97L);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "+00:00" + "'", str44, "+00:00");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "UTC" + "'", str48, "UTC");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "UTC" + "'", str49, "UTC");
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTimeField51);
    }

    @Test
    public void test20280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20280");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.era();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test20281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20281");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = ethiopicChronology0.getDateTimeMillis(360600000, 3600000, 115200000, (-3600000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -3600000 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test20282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20282");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        long long5 = dateTimeZone3.nextTransition(999L);
        long long8 = dateTimeZone3.convertLocalToUTC(52L, true);
        java.util.TimeZone timeZone9 = dateTimeZone3.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.String str13 = dateTimeZone12.toString();
        java.util.TimeZone timeZone14 = dateTimeZone12.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT-01:00");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 999L + "'", long5 == 999L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3600052L + "'", long8 == 3600052L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT-01:00");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-01:00" + "'", str13, "-01:00");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT-01:00");
    }

    @Test
    public void test20283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20283");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.era();
        org.joda.time.DateTimeZone dateTimeZone9 = ethiopicChronology0.getZone();
        long long11 = dateTimeZone9.nextTransition((-61885555199990L));
        int int13 = dateTimeZone9.getStandardOffset(972987907769L);
        int int15 = dateTimeZone9.getOffset(1283039996256000000L);
        long long19 = dateTimeZone9.convertLocalToUTC(110L, false, 189299936L);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-61885555199990L) + "'", long11 == (-61885555199990L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 110L + "'", long19 == 110L);
    }

    @Test
    public void test20284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20284");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.centuries();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = ethiopicChronology0.getDateTimeMillis((-3840000), (-1), 32, 4, 3600000, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3600000 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test20285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20285");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.year();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.yearOfEra();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField12 = ethiopicChronology0.hours();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test20286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20286");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.year();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test20287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20287");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.Chronology chronology5 = ethiopicChronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology1.year();
        org.joda.time.DateTimeZone dateTimeZone7 = ethiopicChronology1.getZone();
        long long11 = dateTimeZone7.convertLocalToUTC(100L, false, 1L);
        java.lang.String str12 = dateTimeZone7.getID();
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone7.getOffset(readableInstant13);
        org.joda.time.Chronology chronology15 = ethiopicChronology0.withZone(dateTimeZone7);
        org.joda.time.DurationField durationField16 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology0.dayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = ethiopicChronology0.add(readablePeriod19, (-3600000L), (int) 'a');
        org.joda.time.ReadablePartial readablePartial23 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long25 = ethiopicChronology0.set(readablePartial23, (-9850803210L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(ethiopicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-3600000L) + "'", long22 == (-3600000L));
    }

    @Test
    public void test20288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20288");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology7.millisOfSecond();
        long long12 = ethiopicChronology7.add(35L, 0L, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = ethiopicChronology7.add(readablePeriod13, (long) (short) 0, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone17 = ethiopicChronology7.getZone();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology7.minuteOfDay();
        org.joda.time.DurationField durationField19 = ethiopicChronology7.minutes();
        java.lang.String str20 = ethiopicChronology7.toString();
        org.joda.time.DurationField durationField21 = ethiopicChronology7.halfdays();
        org.joda.time.DateTimeField dateTimeField22 = ethiopicChronology7.millisOfDay();
        org.joda.time.DurationField durationField23 = ethiopicChronology7.halfdays();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "EthiopicChronology[-01:00]" + "'", str20, "EthiopicChronology[-01:00]");
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
    }

    @Test
    public void test20289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20289");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.dayOfYear();
        int int4 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test20290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20290");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.weekyear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test20291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20291");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.hours();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = ethiopicChronology0.getZone();
        java.lang.String str12 = dateTimeZone10.getShortName(1972100L);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
    }

    @Test
    public void test20292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20292");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = ethiopicChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = ethiopicChronology0.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DurationField durationField15 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone18 = ethiopicChronology0.getZone();
        org.joda.time.DurationField durationField19 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField21 = ethiopicChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test20293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20293");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, 0);
        int int4 = dateTimeZone2.getOffset(360014843L);
        long long6 = dateTimeZone2.previousTransition((-189299968L));
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone2.isLocalDateTimeGap(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 360000000 + "'", int4 == 360000000);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-189299968L) + "'", long6 == (-189299968L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test20294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20294");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = ethiopicChronology0.getDateTimeMillis(32, (-5520000), 97, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -5520000 for monthOfYear must be in the range [1,13]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
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
    public void test20295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20295");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(349200000, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20296");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        int int4 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.months();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.years();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField12 = ethiopicChronology0.millis();
        java.lang.String str13 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DurationField durationField15 = ethiopicChronology0.hours();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EthiopicChronology[UTC]" + "'", str13, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test20297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20297");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone2 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekyear();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.years();
        long long10 = ethiopicChronology0.add((long) 0, (-3L), (int) ' ');
        long long14 = ethiopicChronology0.add(385L, 8280000022L, (int) (byte) 1);
        long long18 = ethiopicChronology0.add((long) 1, 360000032L, (-1));
        org.joda.time.Chronology chronology19 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-96L) + "'", long10 == (-96L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 8280000407L + "'", long14 == 8280000407L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-360000031L) + "'", long18 == (-360000031L));
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test20298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20298");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 10);
        java.lang.String str3 = dateTimeZone1.getNameKey((long) 'a');
        org.joda.time.chrono.EthiopicChronology ethiopicChronology4 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology4.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology4.getZone();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone6.getShortName(10L, locale8);
        java.lang.String str11 = dateTimeZone6.getName((long) (-3600000));
        long long13 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, 35L);
        java.util.TimeZone timeZone14 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(ethiopicChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 36000035L + "'", long13 == 36000035L);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone15);
    }

    @Test
    public void test20299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20299");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.halfdays();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test20300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20300");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weekyears();
        java.lang.Object obj7 = null;
        boolean boolean8 = ethiopicChronology0.equals(obj7);
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.weeks();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.centuries();
        org.joda.time.DurationField durationField12 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.weekyear();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = ethiopicChronology0.add(readablePeriod14, (-353280000L), (int) '4');
        org.joda.time.Chronology chronology18 = ethiopicChronology0.withUTC();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-353280000L) + "'", long17 == (-353280000L));
        org.junit.Assert.assertNotNull(chronology18);
    }

    @Test
    public void test20301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20301");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = ethiopicChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.monthOfYear();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.months();
        org.joda.time.DurationField durationField12 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.halfdayOfDay();
        java.lang.String str14 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField16 = ethiopicChronology0.centuries();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EthiopicChronology[UTC]" + "'", str14, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test20302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20302");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = ethiopicChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = ethiopicChronology0.add(readablePeriod15, (long) '#', (int) (short) 10);
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35L + "'", long18 == 35L);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test20303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20303");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.hours();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.dayOfMonth();
        int int10 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        java.lang.String str11 = ethiopicChronology0.toString();
        long long15 = ethiopicChronology0.add((-86399999L), (long) 37920000, 52);
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology0.hourOfDay();
        int int17 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeZone dateTimeZone18 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology19 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField20 = ethiopicChronology19.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone21 = ethiopicChronology19.getZone();
        org.joda.time.LocalDateTime localDateTime22 = null;
        boolean boolean23 = dateTimeZone21.isLocalDateTimeGap(localDateTime22);
        long long25 = dateTimeZone18.getMillisKeepLocal(dateTimeZone21, (long) (byte) 1);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EthiopicChronology[UTC]" + "'", str11, "EthiopicChronology[UTC]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1885440001L + "'", long15 == 1885440001L);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(ethiopicChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
    }

    @Test
    public void test20304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20304");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.millis();
        org.joda.time.DateTimeZone dateTimeZone7 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone7);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone7.getName((long) (short) -1, locale10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone7.getName(147456038739123997L, locale13);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(ethiopicChronology8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
    }

    @Test
    public void test20305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20305");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = ethiopicChronology0.add(readablePeriod9, 0L, (int) (short) -1);
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField14 = ethiopicChronology0.weeks();
        org.joda.time.Chronology chronology15 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology0.weekyear();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology17 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology17.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField19 = ethiopicChronology17.secondOfMinute();
        org.joda.time.DurationField durationField20 = ethiopicChronology17.halfdays();
        int int21 = ethiopicChronology17.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField22 = ethiopicChronology17.months();
        org.joda.time.DateTimeField dateTimeField23 = ethiopicChronology17.year();
        org.joda.time.DateTimeZone dateTimeZone24 = ethiopicChronology17.getZone();
        java.lang.String str25 = dateTimeZone24.toString();
        org.joda.time.LocalDateTime localDateTime26 = null;
        boolean boolean27 = dateTimeZone24.isLocalDateTimeGap(localDateTime26);
        long long31 = dateTimeZone24.convertLocalToUTC((-37920000L), true, (-14396759L));
        org.joda.time.Chronology chronology32 = ethiopicChronology0.withZone(dateTimeZone24);
        // The following exception was thrown during execution in test generation
        try {
            long long37 = chronology32.getDateTimeMillis((-5520000), 363120000, 126000000, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 363120000 for monthOfYear must be in the range [1,13]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(ethiopicChronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTC" + "'", str25, "UTC");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-37920000L) + "'", long31 == (-37920000L));
        org.junit.Assert.assertNotNull(chronology32);
    }

    @Test
    public void test20306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20306");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.yearOfEra();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.seconds();
        org.joda.time.Chronology chronology6 = ethiopicChronology0.withUTC();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test20307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20307");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.hours();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.minutes();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.centuries();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.years();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology6 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology6.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology6.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.Chronology chronology10 = ethiopicChronology6.withZone(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology6.year();
        org.joda.time.DateTimeZone dateTimeZone12 = ethiopicChronology6.getZone();
        long long16 = dateTimeZone12.convertLocalToUTC(100L, false, 1L);
        java.lang.String str17 = dateTimeZone12.getID();
        long long21 = dateTimeZone12.convertLocalToUTC((long) (short) 0, false, 10L);
        org.joda.time.Chronology chronology22 = ethiopicChronology0.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField23 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField24 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField25 = ethiopicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField26 = ethiopicChronology0.secondOfMinute();
        org.joda.time.Chronology chronology27 = ethiopicChronology0.withUTC();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(ethiopicChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(chronology27);
    }

    @Test
    public void test20308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20308");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        java.lang.String str6 = dateTimeZone3.getID();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology8 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone3, 4);
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology8.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone10 = ethiopicChronology8.getZone();
        org.joda.time.DurationField durationField11 = ethiopicChronology8.months();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = ethiopicChronology8.add(readablePeriod12, (long) (short) -1, (int) '#');
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology8.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology8.weekyear();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-01:00" + "'", str6, "-01:00");
        org.junit.Assert.assertNotNull(ethiopicChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test20309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20309");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weekyears();
        org.joda.time.DurationField durationField7 = ethiopicChronology0.centuries();
        long long11 = ethiopicChronology0.add(0L, (long) (short) 0, (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DurationField durationField13 = ethiopicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField15 = ethiopicChronology0.days();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology0.hourOfDay();
        org.joda.time.Chronology chronology17 = ethiopicChronology0.withUTC();
        long long21 = ethiopicChronology0.add((-68147981069999865L), 3599969L, 36000000);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-68018382185999865L) + "'", long21 == (-68018382185999865L));
    }

    @Test
    public void test20310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20310");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.Chronology chronology1 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.months();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test20311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20311");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.year();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField8 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.weekOfWeekyear();
        long long14 = ethiopicChronology0.add((-359999910L), (-3840000L), (int) ' ');
        org.joda.time.DateTimeZone dateTimeZone15 = ethiopicChronology0.getZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology16 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField17 = ethiopicChronology16.seconds();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = ethiopicChronology16.add(readablePeriod18, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        long long25 = ethiopicChronology16.add(readablePeriod22, 1L, (int) (short) 1);
        org.joda.time.DateTimeField dateTimeField26 = ethiopicChronology16.minuteOfDay();
        org.joda.time.DurationField durationField27 = ethiopicChronology16.centuries();
        org.joda.time.DurationField durationField28 = ethiopicChronology16.hours();
        org.joda.time.DateTimeField dateTimeField29 = ethiopicChronology16.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        long long33 = ethiopicChronology16.add(readablePeriod30, (long) 0, (int) ' ');
        org.joda.time.DurationField durationField34 = ethiopicChronology16.weeks();
        boolean boolean35 = dateTimeZone15.equals((java.lang.Object) ethiopicChronology16);
        int int37 = dateTimeZone15.getStandardOffset((-6188555602792500L));
        org.joda.time.chrono.EthiopicChronology ethiopicChronology38 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField39 = ethiopicChronology38.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField40 = ethiopicChronology38.secondOfMinute();
        org.joda.time.DurationField durationField41 = ethiopicChronology38.halfdays();
        org.joda.time.DurationField durationField42 = ethiopicChronology38.months();
        org.joda.time.DateTimeField dateTimeField43 = ethiopicChronology38.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField44 = ethiopicChronology38.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField45 = ethiopicChronology38.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField46 = ethiopicChronology38.minuteOfHour();
        org.joda.time.DurationField durationField47 = ethiopicChronology38.hours();
        java.util.TimeZone timeZone48 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        java.util.TimeZone timeZone50 = dateTimeZone49.toTimeZone();
        java.lang.String str52 = dateTimeZone49.getName((long) (short) 0);
        java.lang.String str53 = dateTimeZone49.getID();
        long long55 = dateTimeZone49.nextTransition(1283039960400058L);
        org.joda.time.Chronology chronology56 = ethiopicChronology38.withZone(dateTimeZone49);
        org.joda.time.DateTimeZone dateTimeZone57 = ethiopicChronology38.getZone();
        boolean boolean58 = dateTimeZone15.equals((java.lang.Object) ethiopicChronology38);
        org.joda.time.DurationField durationField59 = ethiopicChronology38.weeks();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-482879910L) + "'", long14 == (-482879910L));
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(ethiopicChronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(ethiopicChronology38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(durationField47);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(timeZone50);
        org.junit.Assert.assertEquals(timeZone50.getDisplayName(), "GMT-01:00");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "-01:00" + "'", str52, "-01:00");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "-01:00" + "'", str53, "-01:00");
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 1283039960400058L + "'", long55 == 1283039960400058L);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(dateTimeZone57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(durationField59);
    }

    @Test
    public void test20312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20312");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.Chronology chronology1 = ethiopicChronology0.withUTC();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = ethiopicChronology0.add(readablePeriod3, (long) 1, (int) (short) 10);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology7 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology7.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology7.year();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology10 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField11 = ethiopicChronology10.seconds();
        org.joda.time.DurationField durationField12 = ethiopicChronology10.years();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology14 = ethiopicChronology10.withZone(dateTimeZone13);
        java.lang.String str16 = dateTimeZone13.getNameKey((long) 1);
        org.joda.time.Chronology chronology17 = ethiopicChronology7.withZone(dateTimeZone13);
        long long20 = dateTimeZone13.convertLocalToUTC((long) 0, true);
        long long22 = dateTimeZone13.convertUTCToLocal((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        long long26 = dateTimeZone13.getMillisKeepLocal(dateTimeZone24, (long) 100);
        org.joda.time.Chronology chronology27 = ethiopicChronology0.withZone(dateTimeZone13);
        java.lang.String str29 = dateTimeZone13.getName(3600001L);
        java.lang.String str31 = dateTimeZone13.getName((-359999989L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(ethiopicChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(ethiopicChronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3600000L + "'", long20 == 3600000L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-3600001L) + "'", long22 == (-3600001L));
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-3599901L) + "'", long26 == (-3599901L));
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-01:00" + "'", str29, "-01:00");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-01:00" + "'", str31, "-01:00");
    }

    @Test
    public void test20313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20313");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (byte) 0);
        long long5 = dateTimeZone0.getMillisKeepLocal(dateTimeZone3, 189300000L);
        int int7 = dateTimeZone3.getOffset((-384000101L));
        org.joda.time.ReadableInstant readableInstant8 = null;
        int int9 = dateTimeZone3.getOffset(readableInstant8);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 153300000L + "'", long5 == 153300000L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36000000 + "'", int9 == 36000000);
    }

    @Test
    public void test20314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20314");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone6 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = ethiopicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.monthOfYear();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.weeks();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology12 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology12.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology12.year();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology15 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField16 = ethiopicChronology15.seconds();
        org.joda.time.DurationField durationField17 = ethiopicChronology15.years();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology19 = ethiopicChronology15.withZone(dateTimeZone18);
        java.lang.String str21 = dateTimeZone18.getNameKey((long) 1);
        org.joda.time.Chronology chronology22 = ethiopicChronology12.withZone(dateTimeZone18);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology23 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField24 = ethiopicChronology23.seconds();
        org.joda.time.DurationField durationField25 = ethiopicChronology23.years();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology27 = ethiopicChronology23.withZone(dateTimeZone26);
        java.lang.String str29 = dateTimeZone26.getNameKey((long) 1);
        int int31 = dateTimeZone26.getStandardOffset((long) (short) 0);
        long long33 = dateTimeZone18.getMillisKeepLocal(dateTimeZone26, (long) (short) 10);
        long long37 = dateTimeZone26.convertLocalToUTC(32L, true, (long) (-1));
        org.joda.time.chrono.EthiopicChronology ethiopicChronology38 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField39 = ethiopicChronology38.seconds();
        org.joda.time.DurationField durationField40 = ethiopicChronology38.years();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology42 = ethiopicChronology38.withZone(dateTimeZone41);
        boolean boolean43 = dateTimeZone41.isFixed();
        java.lang.String str44 = dateTimeZone41.getID();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology46 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone41, 4);
        org.joda.time.DateTimeField dateTimeField47 = ethiopicChronology46.secondOfDay();
        boolean boolean48 = dateTimeZone26.equals((java.lang.Object) ethiopicChronology46);
        org.joda.time.DateTimeZone dateTimeZone49 = ethiopicChronology46.getZone();
        org.joda.time.Chronology chronology50 = ethiopicChronology0.withZone(dateTimeZone49);
        java.util.TimeZone timeZone51 = dateTimeZone49.toTimeZone();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology52 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone49);
        org.joda.time.DurationField durationField53 = ethiopicChronology52.halfdays();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(ethiopicChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(ethiopicChronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(ethiopicChronology23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-3600000) + "'", int31 == (-3600000));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L + "'", long33 == 10L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 3600032L + "'", long37 == 3600032L);
        org.junit.Assert.assertNotNull(ethiopicChronology38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "-01:00" + "'", str44, "-01:00");
        org.junit.Assert.assertNotNull(ethiopicChronology46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(timeZone51);
        org.junit.Assert.assertEquals(timeZone51.getDisplayName(), "GMT-01:00");
        org.junit.Assert.assertNotNull(ethiopicChronology52);
        org.junit.Assert.assertNotNull(durationField53);
    }

    @Test
    public void test20315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20315");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        int int4 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.dayOfMonth();
        long long10 = ethiopicChronology0.add((long) '#', 20L, (int) (short) 10);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone13 = ethiopicChronology0.getZone();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 235L + "'", long10 == 235L);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test20316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20316");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.months();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = ethiopicChronology0.weekyears();
        java.lang.Object obj7 = null;
        boolean boolean8 = ethiopicChronology0.equals(obj7);
        org.joda.time.DateTimeField dateTimeField9 = ethiopicChronology0.era();
        org.joda.time.DurationField durationField10 = ethiopicChronology0.centuries();
        org.joda.time.DurationField durationField11 = ethiopicChronology0.millis();
        org.joda.time.Chronology chronology12 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.dayOfMonth();
        org.joda.time.ReadablePartial readablePartial15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ethiopicChronology0.get(readablePartial15, 2L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test20317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20317");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = ethiopicChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = ethiopicChronology0.withZone(dateTimeZone10);
        org.joda.time.DurationField durationField12 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField14 = ethiopicChronology0.days();
        org.joda.time.DurationField durationField15 = ethiopicChronology0.days();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test20318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20318");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        long long5 = ethiopicChronology0.add(readablePeriod2, (long) (byte) 1, (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = ethiopicChronology0.add(readablePeriod6, 1L, (int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Chronology chronology11 = ethiopicChronology0.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology0.yearOfEra();
        java.lang.String str17 = ethiopicChronology0.toString();
        org.joda.time.DurationField durationField18 = ethiopicChronology0.centuries();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "EthiopicChronology[UTC]" + "'", str17, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test20319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20319");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.year();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.hours();
        java.lang.String str4 = ethiopicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.year();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone7 = ethiopicChronology0.getZone();
        int int9 = dateTimeZone7.getOffsetFromLocal(3600000L);
        java.lang.Class<?> wildcardClass10 = dateTimeZone7.getClass();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EthiopicChronology[UTC]" + "'", str4, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test20320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20320");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology4 = ethiopicChronology0.withZone(dateTimeZone3);
        java.lang.String str6 = dateTimeZone3.getNameKey((long) 1);
        int int8 = dateTimeZone3.getOffset((long) 4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        boolean boolean11 = dateTimeZone3.isStandardOffset((long) (short) 10);
        org.joda.time.chrono.EthiopicChronology ethiopicChronology12 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology12.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone14 = ethiopicChronology12.getZone();
        boolean boolean15 = dateTimeZone3.equals((java.lang.Object) ethiopicChronology12);
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology12.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology12.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone18.getShortName((long) ' ', locale20);
        long long23 = dateTimeZone18.previousTransition((long) (byte) 100);
        long long27 = dateTimeZone18.convertLocalToUTC((long) (short) 100, false, (long) 360000000);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours(100);
        long long31 = dateTimeZone29.convertUTCToLocal((-1L));
        long long33 = dateTimeZone18.getMillisKeepLocal(dateTimeZone29, (long) ' ');
        boolean boolean35 = dateTimeZone18.isStandardOffset(359999999L);
        org.joda.time.LocalDateTime localDateTime36 = null;
        boolean boolean37 = dateTimeZone18.isLocalDateTimeGap(localDateTime36);
        org.joda.time.Chronology chronology38 = ethiopicChronology12.withZone(dateTimeZone18);
        org.joda.time.DurationField durationField39 = ethiopicChronology12.years();
        org.joda.time.DurationField durationField40 = ethiopicChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField41 = ethiopicChronology12.millisOfSecond();
        org.joda.time.DurationField durationField42 = ethiopicChronology12.seconds();
        org.joda.time.DateTimeField dateTimeField43 = ethiopicChronology12.yearOfEra();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-3600000) + "'", int8 == (-3600000));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(ethiopicChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-01:00" + "'", str21, "-01:00");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 3600100L + "'", long27 == 3600100L);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 359999999L + "'", long31 == 359999999L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-363599968L) + "'", long33 == (-363599968L));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(durationField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
    }

    @Test
    public void test20321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20321");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        int int4 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.dayOfMonth();
        long long10 = ethiopicChronology0.add((long) '#', 20L, (int) (short) 10);
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.centuryOfEra();
        org.joda.time.Chronology chronology12 = ethiopicChronology0.withUTC();
        org.joda.time.chrono.EthiopicChronology ethiopicChronology13 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = ethiopicChronology13.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone15 = ethiopicChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology13.dayOfYear();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology13.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology13.weekyear();
        org.joda.time.DurationField durationField19 = ethiopicChronology13.years();
        long long23 = ethiopicChronology13.add((long) 0, (-3L), (int) ' ');
        org.joda.time.DateTimeZone dateTimeZone24 = ethiopicChronology13.getZone();
        org.joda.time.Chronology chronology25 = chronology12.withZone(dateTimeZone24);
        org.joda.time.DurationField durationField26 = chronology25.hours();
        org.joda.time.DurationField durationField27 = chronology25.weeks();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 235L + "'", long10 == 235L);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(ethiopicChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-96L) + "'", long23 == (-96L));
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(durationField27);
    }

    @Test
    public void test20322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20322");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField2 = ethiopicChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField4 = ethiopicChronology0.seconds();
        org.joda.time.DurationField durationField5 = ethiopicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField7 = ethiopicChronology0.weekyear();
        int int8 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField9 = ethiopicChronology0.hours();
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test20323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20323");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = ethiopicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = ethiopicChronology0.weekyear();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = ethiopicChronology0.add(readablePeriod7, 35L, (int) ' ');
        org.joda.time.DurationField durationField11 = ethiopicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField12 = ethiopicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.minuteOfHour();
        long long17 = ethiopicChronology0.add(19L, 28L, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField18 = ethiopicChronology0.millisOfSecond();
        java.lang.String str19 = ethiopicChronology0.toString();
        org.joda.time.ReadablePartial readablePartial20 = null;
        int[] intArray22 = new int[] { 37920000 };
        // The following exception was thrown during execution in test generation
        try {
            ethiopicChronology0.validate(readablePartial20, intArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 19L + "'", long17 == 19L);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EthiopicChronology[UTC]" + "'", str19, "EthiopicChronology[UTC]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[37920000]");
    }

    @Test
    public void test20324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20324");
        org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = ethiopicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField3 = ethiopicChronology0.halfdays();
        int int4 = ethiopicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField5 = ethiopicChronology0.weekyearOfCentury();
        long long9 = ethiopicChronology0.add((long) 100, (long) (-1), 10);
        org.joda.time.DateTimeField dateTimeField10 = ethiopicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = ethiopicChronology0.era();
        org.joda.time.Chronology chronology12 = ethiopicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField13 = ethiopicChronology0.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone14 = ethiopicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField15 = ethiopicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = ethiopicChronology0.era();
        org.joda.time.DateTimeField dateTimeField17 = ethiopicChronology0.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = ethiopicChronology0.add(readablePeriod18, 34319999L, (int) (short) 100);
        org.junit.Assert.assertNotNull(ethiopicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 90L + "'", long9 == 90L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 34319999L + "'", long21 == 34319999L);
    }
}
